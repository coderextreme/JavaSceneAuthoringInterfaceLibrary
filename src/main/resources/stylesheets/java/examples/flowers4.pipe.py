import jnius_config
jnius_config.set_classpath('.', '../../../jars/X3DJSAIL.3.3.full.jar')
from jnius import autoclass
from X3Dpackage import *
X3D0 = (X3D() 
   .setProfile("Immersive") 
   .setVersion("3.3") 
   .setHead(head()    .addComponent(component()     .setName("Shaders") 
     .setLevel(1) 
    ) 
    .addComponent(component()     .setName("CubeMapTexturing") 
     .setLevel(1) 
    ) 
    .addMeta(meta()     .setName("title") 
     .setContent("flowers4.x3d") 
    ) 
    .addMeta(meta()     .setName("creator") 
     .setContent("John Carlson") 
    ) 
    .addMeta(meta()     .setName("generator") 
     .setContent("manual") 
    ) 
    .addMeta(meta()     .setName("identifier") 
     .setContent("https://coderextreme.net/X3DJSONLD/flowers4.x3d") 
    ) 
    .addMeta(meta()     .setName("description") 
     .setContent("an animated flower") 
    ) 
   ) 
   .setScene(Scene()    .addChildren([NavigationInfo()     .setType(["EXAMINE","ANY"]) 
]    ) 
    .addChildren([Background()     .setBackUrl(["../resources/images/all_probes/stpeters_cross/stpeters_back.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_back.png"]) 
     .setBottomUrl(["../resources/images/all_probes/stpeters_cross/stpeters_bottom.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_bottom.png"]) 
     .setFrontUrl(["../resources/images/all_probes/stpeters_cross/stpeters_front.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_front.png"]) 
     .setLeftUrl(["../resources/images/all_probes/stpeters_cross/stpeters_left.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_left.png"]) 
     .setRightUrl(["../resources/images/all_probes/stpeters_cross/stpeters_right.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_right.png"]) 
     .setTopUrl(["../resources/images/all_probes/stpeters_cross/stpeters_top.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_top.png"]) 
]    ) 
    .addChildren([Transform()     .setDEF("transform") 
     .addChildren([Shape()      .setAppearance(Appearance()       .setMaterial(Material()        .setDiffuseColor([.7,.7,.7]) 
        .setSpecularColor([.5,.5,.5]) 
       ) 
       .setTexture(ComposedCubeMapTexture()        .setBack(ImageTexture()         .setUrl(["../resources/images/all_probes/stpeters_cross/stpeters_back.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_back.png"]) 
        ) 
        .setBottom(ImageTexture()         .setUrl(["../resources/images/all_probes/stpeters_cross/stpeters_bottom.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_bottom.png"]) 
        ) 
        .setFront(ImageTexture()         .setUrl(["../resources/images/all_probes/stpeters_cross/stpeters_front.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_front.png"]) 
        ) 
        .setLeft(ImageTexture()         .setUrl(["../resources/images/all_probes/stpeters_cross/stpeters_left.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_left.png"]) 
        ) 
        .setRight(ImageTexture()         .setUrl(["../resources/images/all_probes/stpeters_cross/stpeters_right.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_right.png"]) 
        ) 
        .setTop(ImageTexture()         .setUrl(["../resources/images/all_probes/stpeters_cross/stpeters_top.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_top.png"]) 
        ) 
       ) 
       .addShaders(ComposedShader()        .setDEF("shader") 
        .addField(field(language = "GLSL")         .setName("cube") 
         .setType("SFInt32") 
         .setAccessType("inputOutput") 
         .setValue("0") 
        ) 
        .addField(field(language = "GLSL")         .setName("chromaticDispertion") 
         .setAccessType("inputOutput") 
         .setType("SFVec3f") 
         .setValue("0.98 1.0 1.033") 
        ) 
        .addField(field(language = "GLSL")         .setName("bias") 
         .setType("SFFloat") 
         .setAccessType("inputOutput") 
         .setValue("0.5") 
        ) 
        .addField(field(language = "GLSL")         .setName("scale") 
         .setType("SFFloat") 
         .setAccessType("inputOutput") 
         .setValue("0.5") 
        ) 
        .addField(field(language = "GLSL")         .setName("power") 
         .setType("SFFloat") 
         .setAccessType("inputOutput") 
         .setValue("2") 
        ) 
        .addParts(ShaderPart(language = "GLSL")         .setUrl(["../shaders/x3dom.vs","https://coderextreme.net/X3DJSONLD/shaders/x3dom.vs"]) 
         .setType("VERTEX") 
        ) 
        .addParts(ShaderPart(language = "GLSL")         .setUrl(["../shaders/pc_bubbles.fs","https://coderextreme.net/X3DJSONLD/shaders/pc_bubbles.fs"]) 
         .setType("FRAGMENT") 
        ) 
       ) 
      ) 
#
#                <Sphere>
#		
      .setGeometry(IndexedFaceSet()       .setDEF("Orbit") 
       .setCoord(Coordinate(convex = False, creaseAngle = 0)        .setDEF("OrbitCoordinates") 
       ) 
      ) 
]     ) 
]    ) 
    .addChildren([Script()     .setDEF("OrbitScript") 
     .addField(field()      .setAccessType("inputOnly") 
      .setName("set_fraction") 
      .setType("SFFloat") 
     ) 
     .addField(field()      .setAccessType("inputOutput") 
      .setName("coordinates") 
      .setType("MFVec3f") 
     ) 
     .addField(field()      .setAccessType("outputOnly") 
      .setName("coordIndexes") 
      .setType("MFInt32") 
     ) 
.setSourceCode('''\n"+
"\n"+
"ecmascript:\n"+
"\n"+
"var e = 5;\n"+
"var f = 5;\n"+
"var g = 5;\n"+
"var h = 5;\n"+
"\n"+
"function initialize() {\n"+
"     resolution = 100;\n"+
"     updateCoordinates(resolution);\n"+
"     var cis = [];\n"+
"     for ( i = 0; i < resolution-1; i++) {\n"+
"     	for ( j = 0; j < resolution-1; j++) {\n"+
"	     cis.push(i*resolution+j);\n"+
"	     cis.push(i*resolution+j+1);\n"+
"	     cis.push((i+1)*resolution+j+1);\n"+
"	     cis.push((i+1)*resolution+j);\n"+
"	     cis.push(-1);\n"+
"	}\n"+
"    }\n"+
"    coordIndexes = new MFInt32(cis);\n"+
"}\n"+
"\n"+
"function updateCoordinates(resolution) {\n"+
"     theta = 0.0;\n"+
"     phi = 0.0;\n"+
"     delta = (2 * 3.141592653) / (resolution-1);\n"+
"     var crds = [];\n"+
"     for ( i = 0; i < resolution; i++) {\n"+
"     	for ( j = 0; j < resolution; j++) {\n"+
"		rho = e + f * Math.cos(g * theta) * Math.cos(h * phi);\n"+
"		crds.push(new SFVec3f(\n"+
"			rho * Math.cos(phi) * Math.cos(theta),\n"+
"			rho * Math.cos(phi) * Math.sin(theta),\n"+
"			rho * Math.sin(phi)\n"+
"		));\n"+
"		theta += delta;\n"+
"	}\n"+
"	phi += delta;\n"+
"     }\n"+
"     coordinates = new MFVec3f(crds);\n"+
"}\n"+
"\n"+
"function set_fraction(fraction, eventTime) {\n"+
"	choice = Math.floor(Math.random() * 4);\n"+
"	switch (choice) {\n"+
"	case 0:\n"+
"		e += Math.floor(Math.random() * 2) * 2 - 1;\n"+
"		break;\n"+
"	case 1:\n"+
"		f += Math.floor(Math.random() * 2) * 2 - 1;\n"+
"		break;\n"+
"	case 2:\n"+
"		g += Math.floor(Math.random() * 2) * 2 - 1;\n"+
"		break;\n"+
"	case 3:\n"+
"		h += Math.floor(Math.random() * 2) * 2 - 1;\n"+
"		break;\n"+
"	}\n"+
"	if (f < 1) {\n"+
"		f = 10;\n"+
"	}\n"+
"	if (g < 1) {\n"+
"		g = 4;\n"+
"	}\n"+
"	if (h < 1) {\n"+
"		h = 4;\n"+
"	}\n"+
"	resolution = 100;\n"+
"	updateCoordinates(resolution);\n"+
"}\n"+
"      ''')
]    ) 
    .addChildren([TimeSensor()     .setDEF("Clock") 
     .setCycleInterval(16) 
     .setLoop(True) 
]    ) 
    .addChildren([ROUTE()     .setFromField("coordIndexes") 
     .setFromNode("OrbitScript") 
     .setToField("set_coordIndex") 
     .setToNode("Orbit") 
]    ) 
    .addChildren([ROUTE()     .setFromField("coordinates") 
     .setFromNode("OrbitScript") 
     .setToField("set_point") 
     .setToNode("OrbitCoordinates") 
]    ) 
    .addChildren([ROUTE()     .setFromField("fraction_changed") 
     .setFromNode("Clock") 
     .setToField("set_fraction") 
     .setToNode("OrbitScript") 
]    ) 
   ) 
)