import os, sys, getopt, math

scriptName  = "BlenderX3dToPng.py"

description = scriptName + " is a Blender Python script to load model.x3d and output image snapshot model.png"

# Open-Source Software License for Web3D Consortium
# https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/java/license.html

# identifier 
# https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/java/src/python/blenderScripts/BlenderX3dToPng.py

# meta reference: work by Mike Bailey NPS, adapted from original NIH 3D Print Exchange scripts
# https://github.com/niaid/3Dmodel_scripts
# https://github.com/niaid/3Dmodel_scripts/blob/master/Blender_PNG_from_X3D.py

DIGITS      = 6 # roundoff precision

def usage():
    print ("")
    print (description)
    print ("")
    print ("""Usage:   blender --background --factory-startup --python""", scriptName, """-- <model>.x3d [<outputpath>]""")
    print ("""Output:  <outputpath>/<model>.png""")
    print ("""Manual:  https://docs.blender.org/manual/en/latest/render/workflows/command_line.html""")
    print ("""         https://docs.blender.org/manual/en/latest/advanced/command_line/arguments.html#python-options""")
    print ("""Warning: cygwin unix on windows fails command-line invocation, use native operating system shell instead""")
    print ("")

# Example: blender --background --factory-startup --python BlenderX3dToPng.py -- LPD17.meshlab.x3d

# Debug function, must precede usage
def dump(obj):
  print ("---------")
  for attr in dir(obj):
    if hasattr( obj, attr ):
      print( "obj.%s = %s" % (attr, getattr(obj, attr)))
  print ("---------")

# default: --enable-autoexec

# Parse the command line arguments
print("Command line:", len(sys.argv), "args", sys.argv ) # debug

try:
    import bpy
except ImportError:
    print ("problem with import bpy for blender python")
    sys.exit(2)
    
try:
    opts, args = getopt.getopt(sys.argv[6:], "h", [ "help" ] )
except getopt.GetoptError as err:
    print (str(err))
    usage()
    sys.exit(2)

''' # multiline comment block
for o, a in opts:
    if o in ("-h", "--help"):
        usage()
        sys.exit()
    else:
        assert False, "unhandled options"
'''

# open the file
if len(args) == 0:
    usage()
    sys.exit()
elif len(args) == 1:
    sourceFile = args[0]
    outputPath = os.getcwd() # current directory
elif len(args) == 2:
    sourceFile = args[0]
    outputPath = args[1]
else:
    print("\nError: You must specify a single .x3d input file with an optional output path") #  (with trailing slash)
    usage()
    sys.exit(2)

input_name, ext  = os.path.splitext(sourceFile)
PLY_file   = os.path.join(outputPath, input_name + ".blender.ply")
STL_file   = os.path.join(outputPath, input_name + ".blender.stl")
X3D_file   = os.path.join(outputPath, input_name + ".blender.x3d")
BLEND_file = os.path.join(outputPath, input_name + ".blend")
PNG_file   = os.path.join(outputPath, input_name + ".viewpoint.blender.png")

print("outputPath=", outputPath) # debug

os.chdir(".")
 
# CLEAN UP INITIAL VIEW (PRIOR TO LOADING)
bpy.ops.object.select_by_type(extend=False, type='MESH')
bpy.ops.object.delete(use_global=False)
bpy.ops.object.select_by_type(extend=False, type='LAMP')
bpy.ops.object.delete(use_global=False)
bpy.ops.object.select_by_type(extend=False, type='CAMERA') # blender-python references X3D viewpoints as CAMERAS
bpy.ops.object.delete(use_global=False)

# IMPORT THE SCENE AND MESH
print("Importing", sourceFile, "...")
bpy.ops.import_scene.x3d(filepath = sourceFile)

# DELETE THE OTHER IMPORTED OBJECTS
print("Deleting imported lamps, curves, cameras...")
bpy.ops.object.select_by_type(extend=False, type='LAMP')
bpy.ops.object.delete(use_global=False)
bpy.ops.object.select_by_type(extend=False, type='CURVE')
bpy.ops.object.delete(use_global=False)
# retain viewpoints, don't delete
# bpy.ops.object.select_by_type(extend=False, type='CAMERA') # blender-python references X3D viewpoints as CAMERAS
# bpy.ops.object.delete(use_global=False)

# Check to see if each mesh has "Col" (color) vertex group;
# if so, then turn on vertex color
bpy.ops.object.select_by_type(extend=False, type='MESH')
for mesh_object in bpy.context.selected_objects:
    bpy.context.scene.objects.active = mesh_object
    # Print bounding box dimensions
    # https://blender.stackexchange.com/questions/8459/get-blender-x-y-z-and-bounding-box-with-script
    print("Bounding box for", mesh_object.name, "(to be copied into ModelMetadata.md file, TODO automate)")
    # dump(mesh_object) # debug
    # https://stackoverflow.com/questions/255147/how-do-i-keep-python-print-from-adding-newlines-or-spaces
    print("* `bboxCenter`  = `" + str(round(mesh_object.location.x,DIGITS)),   round(mesh_object.location.y,DIGITS),   str(round(mesh_object.location.z,DIGITS))   + "` (X-Y-Z offset in meters, copied from Blender PNG export output)")
    print("* `bboxSize`    = `" + str(round(mesh_object.dimensions.x,DIGITS)), round(mesh_object.dimensions.y,DIGITS), str(round(mesh_object.dimensions.z,DIGITS)) + "` (X-Y-Z size in meters, copied from Blender PNG export output)" )
    print("Determining if per-vertex coloring is needed...")
    if len(mesh_object.data.vertex_colors.values()) > 0:
        print(str(mesh_object) + " has vertex colors")
        if len(mesh_object.data.materials.values()) == 0:
            print(str(mesh_object) + " has no material; adding material and turning on vertex coloring")
            mesh_object.data.materials.append(bpy.data.materials.new(mesh_object.name))
            bpy.data.materials[mesh_object.name].use_vertex_color_paint = True
#        else:
#            print(str(mesh_object) + " has material(s); turning off vertex coloring")
#            for mesh_object_material in mesh_object.data.materials.values():
#                bpy.data.materials[mesh_object_material.name].use_vertex_color_paint = False
#                print(str(mesh_object) + " has material " + str(mesh_object_material) + " ; turning off vertex coloring")
    else:
        for mesh_object_material in mesh_object.data.materials.values():
            bpy.data.materials[mesh_object_material.name].use_vertex_color_paint = False
#            print(str(mesh_object) + " has material " + str(mesh_object_material) + " ; turning off vertex coloring")

# https://blender.stackexchange.com/questions/51563/how-to-automatically-fit-the-camera-to-objects-in-the-view
# https://docs.blender.org/api/blender_python_api_current/bpy.types.Object.html#bpy.types.Object.camera_fit_coords

print("mesh_object:")
dump(mesh_object) # debug

# CAMERA
print("Creating new camera...")
cam = bpy.data.cameras.new("TheCamera")
cam.clip_end = 1000000
bpycam = bpy.data.objects.new("TheCamera", cam)
bpy.context.scene.camera = bpycam
bpy.ops.object.select_by_type(extend=False, type='MESH') # dup
# https://docs.blender.org/api/blender_python_api_2_76_1/bpy.ops.view3d.html#bpy.ops.view3d.camera_to_view_selected
bpy.ops.view3d.camera_to_view_selected() # Move the camera so selected objects are framed
# bpy.ops.view3d.zoom(delta=-1) # border whitespace

# SET SCENE
print("Setting the background color...")
bpy.data.worlds['World'].horizon_color[0]=1
bpy.data.worlds['World'].horizon_color[1]=1
bpy.data.worlds['World'].horizon_color[2]=1
bpy.data.worlds['World'].light_settings.use_ambient_occlusion = True
bpy.data.worlds['World'].light_settings.gather_method = 'APPROXIMATE'

# SAVE PNG
print("Rendering image... " + PNG_file)
bpy.data.scenes['Scene'].render.resolution_x = 500
bpy.data.scenes['Scene'].render.resolution_y = 500
bpy.data.scenes['Scene'].render.resolution_percentage = 100
bpy.data.scenes['Scene'].render.filepath = PNG_file
bpy.ops.render.render(write_still=True) # first snapshot file is created here

# TODO delete first created camera
# bpy.ops.object.select_by_type(extend=False, type='CAMERA')  # blender-python references X3D viewpoints as CAMERAS
# bpy.ops.object.delete(use_global=False)

# modified mike.py code start =====================================
bpy.ops.object.select_by_type(extend=False, type='CAMERA')  # blender-python references X3D viewpoints as CAMERAS
viewpoints = bpy.context.selected_objects
# https://stackoverflow.com/questions/53513/how-do-i-check-if-a-list-is-empty
hasViewpoint = (len(viewpoints) > 0)
print ("hasViewpoint =", hasViewpoint)

i = 1
for viewpoint in viewpoints:
  print("Viewpoint", i, "parameters:")
  dump(viewpoint)
  
  # DEF and description attributes are not put into the the camera object by Blender's import_x3d.py
  # print(viewpoint.DEF)
  # print(viewpoint.description)
  # TODO blender limitations

  bpy.data.worlds['World'].horizon_color[0]=.76
  bpy.data.worlds['World'].horizon_color[1]=.89
  bpy.data.worlds['World'].horizon_color[2]=.93
  bpy.data.worlds['World'].light_settings.use_ambient_occlusion = True
  bpy.data.worlds['World'].light_settings.gather_method = 'APPROXIMATE'
  bpy.data.scenes['Scene'].render.resolution_x = 500
  bpy.data.scenes['Scene'].render.resolution_y = 500
  bpy.data.scenes['Scene'].render.resolution_percentage = 100
  bpy.data.scenes['Scene'].render.filepath = os.path.join(outputPath, input_name + ".viewpoint" + str(i) + ".blender.png")

  print("Resetting camera...")
  bpy.context.scene.camera = viewpoint
  bpy.ops.object.select_by_type(extend=False, type='MESH')
  # https://docs.blender.org/api/blender_python_api_2_76_1/bpy.ops.view3d.html#bpy.ops.view3d.camera_to_view_selected
  bpy.ops.view3d.camera_to_view_selected()
  # https://docs.blender.org/api/blender_python_api_2_76_1/bpy.ops.view3d.html#bpy.ops.view3d.view_all
  # https://blender.stackexchange.com/questions/6101/poll-failed-context-incorrect-example-bpy-ops-view3d-background-image-add
  # bpy.ops.view3d.view_all() # use_all_regions=True, center=True
  # bpy.ops.view3d.view_lock_to_active()
  # bpy.ops.view3d.view_selected()
  # bpy.ops.view3d.zoom(delta=-1) # border whitespace
  # bpy.ops.view3d.zoom_camera_1_to_1()
  bpy.ops.render.render(write_still=True) # next snapshot file is created here
  i += 1

bpy.ops.object.select_by_type(extend=False, type='CAMERA')  #blender-python references X3D viewpoints as CAMERAS
# modified mike.py code end   =====================================

# QUIT
print("Quitting Blender") # debug
bpy.ops.wm.quit_blender()
sys.exit(0)
