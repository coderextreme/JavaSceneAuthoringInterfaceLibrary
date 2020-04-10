X3D0 = Browser.createNode("X3D");
X3D0.profile = "Immersive";
X3D0.version = "3.3";
// x3dVersionComparisonTest for this model: supportsX3dVersion(X3DObject.VERSION_3_0)=true 
head1 = Browser.createNode("head");
// comment #1 
// comment #2 
// comment #3 
// comment #4 
component2 = Browser.createNode("component");
component2.name = "Navigation";
component2.level = 3;
head1.addComponent(component2);

component3 = Browser.createNode("component");
component3.name = "Shaders";
component3.level = 1;
head1.addComponent(component3);

component4 = Browser.createNode("component");
component4.name = "CADGeometry";
component4.level = 2;
head1.addComponent(component4);

component5 = Browser.createNode("component");
component5.name = "DIS";
component5.level = 2;
head1.addComponent(component5);

component6 = Browser.createNode("component");
component6.name = "H-Anim";
component6.level = 1;
head1.addComponent(component6);

component7 = Browser.createNode("component");
component7.name = "Grouping";
component7.level = 1;
head1.addComponent(component7);

component8 = Browser.createNode("component");
component8.name = "Layering";
component8.level = 1;
head1.addComponent(component8);

unit9 = Browser.createNode("unit");
unit9.name = "AngleUnitConversion";
unit9.category = "angle";
unit9.conversionFactor = 1.0;
head1.addUnit(unit9);

unit10 = Browser.createNode("unit");
unit10.name = "LengthUnitConversion";
unit10.category = "length";
unit10.conversionFactor = 1.0;
head1.addUnit(unit10);

unit11 = Browser.createNode("unit");
unit11.name = "ForceFromPoundsToNewtons";
unit11.category = "force";
unit11.conversionFactor = 4.4482;
head1.addUnit(unit11);

meta12 = Browser.createNode("meta");
meta12.content = "HelloWorldProgramOutput.x3d";
meta12.name = "title";
head1.addMeta(meta12);

meta13 = Browser.createNode("meta");
meta13.content = "continued development and testing in progress";
meta13.name = "info";
head1.addMeta(meta13);

meta14 = Browser.createNode("meta");
meta14.content = "Example HelloWorldProgram creates an X3D model using the X3D Java Scene Access Interface Library (X3DJSAIL)";
meta14.name = "description";
head1.addMeta(meta14);

meta15 = Browser.createNode("meta");
meta15.content = "https://www.web3d.org/specifications/java/X3DJSAIL.html";
meta15.name = "reference";
head1.addMeta(meta15);

meta16 = Browser.createNode("meta");
meta16.content = "HelloWorldProgramOutput.java";
meta16.name = "generator";
head1.addMeta(meta16);

meta17 = Browser.createNode("meta");
meta17.content = "6 September 2016";
meta17.name = "created";
head1.addMeta(meta17);

meta18 = Browser.createNode("meta");
meta18.content = "12 January 2020";
meta18.name = "modified";
head1.addMeta(meta18);

meta19 = Browser.createNode("meta");
meta19.content = "X3D Java Scene Access Interface Library (X3DJSAIL)";
meta19.name = "generator";
head1.addMeta(meta19);

meta20 = Browser.createNode("meta");
meta20.content = "https://www.web3d.org/specifications/java/examples/HelloWorldProgram.java";
meta20.name = "generator";
head1.addMeta(meta20);

meta21 = Browser.createNode("meta");
meta21.content = "Netbeans http://www.netbeans.org";
meta21.name = "generator";
head1.addMeta(meta21);

meta22 = Browser.createNode("meta");
meta22.content = "Don Brutzman";
meta22.name = "creator";
head1.addMeta(meta22);

meta23 = Browser.createNode("meta");
meta23.content = "https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/java/examples/HelloWorldProgramOutput.x3d";
meta23.name = "reference";
head1.addMeta(meta23);

meta24 = Browser.createNode("meta");
meta24.content = "Console output, ClassicVRML encoding, VRML97 encoding and pretty-print documentation:";
meta24.name = "reference";
head1.addMeta(meta24);

meta25 = Browser.createNode("meta");
meta25.content = "HelloWorldProgramOutput.txt";
meta25.name = "reference";
head1.addMeta(meta25);

meta26 = Browser.createNode("meta");
meta26.content = "HelloWorldProgramOutput.x3dv";
meta26.name = "reference";
head1.addMeta(meta26);

meta27 = Browser.createNode("meta");
meta27.content = "HelloWorldProgramOutput.wrl";
meta27.name = "reference";
head1.addMeta(meta27);

meta28 = Browser.createNode("meta");
meta28.content = "HelloWorldProgramOutput.html";
meta28.name = "reference";
head1.addMeta(meta28);

meta29 = Browser.createNode("meta");
meta29.content = "https://savage.nps.edu/X3dValidator?url=https://www.web3d.org/specifications/java/examples/HelloWorldProgramOutput.x3d";
meta29.name = "reference";
head1.addMeta(meta29);

meta30 = Browser.createNode("meta");
meta30.content = "https://www.web3d.org/specifications/java/examples/HelloWorldProgramOutput.x3d";
meta30.name = "identifier";
head1.addMeta(meta30);

meta31 = Browser.createNode("meta");
meta31.content = "../license.html";
meta31.name = "license";
head1.addMeta(meta31);

X3D0.head = head1;

Scene32 = Browser.createNode("Scene");
ViewpointGroup33 = Browser.createNode("ViewpointGroup");
ViewpointGroup33.description = "Available viewpoints";
Viewpoint34 = Browser.createNode("Viewpoint");
Viewpoint34.DEF = "DefaultView";
Viewpoint34.description = "Hello X3DJSAIL";
ViewpointGroup33.addChildren(Viewpoint34);

Viewpoint35 = Browser.createNode("Viewpoint");
Viewpoint35.DEF = "TopDownView";
Viewpoint35.description = "top-down view from above";
Viewpoint35.orientation = [1,0,0,-1.570796];
Viewpoint35.position = [0,100,0];
ViewpointGroup33.addChildren(Viewpoint35);

Scene32.addChildren(ViewpointGroup33);

NavigationInfo36 = Browser.createNode("NavigationInfo");
NavigationInfo36.avatarSize = [0.25,1.6,0.75];
NavigationInfo36.transitionType = ["LINEAR"];
NavigationInfo36.type = ["EXAMINE","FLY","ANY"];
Scene32.addChildren(NavigationInfo36);

WorldInfo37 = Browser.createNode("WorldInfo");
WorldInfo37.DEF = "WorldInfoDEF";
WorldInfo37.title = "HelloWorldProgram produced by X3D Java SAI Library (X3DJSAIL)";
Scene32.addChildren(WorldInfo37);

WorldInfo38 = Browser.createNode("WorldInfo");
WorldInfo38.USE = "WorldInfoDEF";
Scene32.addChildren(WorldInfo38);

WorldInfo39 = Browser.createNode("WorldInfo");
WorldInfo39.USE = "WorldInfoDEF";
Scene32.addChildren(WorldInfo39);

MetadataString40 = Browser.createNode("MetadataString");
MetadataString40.DEF = "scene.addChildMetadata";
MetadataString40.name = "test";
MetadataString40.value = ["Top-level root Metadata node beneath Scene needs to be one of '-children' in JSON encoding"];
Scene32.addMetadata(MetadataString40);

LayerSet41 = Browser.createNode("LayerSet");
LayerSet41.DEF = "scene.addChildLayerSetTest";
LayerSet41.order = [0];
Scene32.addLayerSet(LayerSet41);

Transform42 = Browser.createNode("Transform");
Transform42.DEF = "LogoGeometryTransform";
Transform42.translation = [0,1.5,0];
Anchor43 = Browser.createNode("Anchor");
Anchor43.description = "select for X3D Java SAI Library (X3DJSAIL) description";
Anchor43.url = ["../X3DJSAIL.html","https://www.web3d.org/specifications/java/X3DJSAIL.html"];
Shape44 = Browser.createNode("Shape");
Shape44.DEF = "BoxShape";
Appearance45 = Browser.createNode("Appearance");
Material46 = Browser.createNode("Material");
Material46.DEF = "GreenMaterial";
Material46.diffuseColor = [0,1,1];
Material46.emissiveColor = [0.8,0,0];
Material46.transparency = 0.1;
Appearance45.material = Material46;

ImageTexture47 = Browser.createNode("ImageTexture");
ImageTexture47.url = ["images/X3dJavaSceneAccessInterfaceSaiLibrary.png","https://www.web3d.org/specifications/java/examples/images/X3dJavaSceneAccessInterfaceSaiLibrary.png"];
Appearance45.texture = ImageTexture47;

Shape44.appearance = Appearance45;

Box48 = Browser.createNode("Box");
Box48.DEF = "test-NMTOKEN_regex.0123456789";
Box48.CssClass = "untextured";
Shape44.geometry = Box48;

Anchor43.addChildren(Shape44);

Transform42.addChildren(Anchor43);

Scene32.addChildren(Transform42);

Shape49 = Browser.createNode("Shape");
Shape49.DEF = "LineShape";
Appearance50 = Browser.createNode("Appearance");
Material51 = Browser.createNode("Material");
Material51.emissiveColor = [0.6,0.19607843,0.8];
Appearance50.material = Material51;

Shape49.appearance = Appearance50;

IndexedLineSet52 = Browser.createNode("IndexedLineSet");
IndexedLineSet52.coordIndex = [0,1,2,3,4,0];
// Coordinate 3-tuple point count: 6 
Coordinate53 = Browser.createNode("Coordinate");
Coordinate53.point = [0,1.5,0,2,1.5,0,2,1.5,-2,-2,1.5,-2,-2,1.5,0,0,1.5,0];
IndexedLineSet52.coord = Coordinate53;

Shape49.geometry = IndexedLineSet52;

Scene32.addChildren(Shape49);

PositionInterpolator54 = Browser.createNode("PositionInterpolator");
PositionInterpolator54.DEF = "BoxPathAnimator";
PositionInterpolator54.key = [0,0.125,0.375,0.625,0.875,1];
PositionInterpolator54.keyValue = [0,1.5,0,2,1.5,0,2,1.5,-2,-2,1.5,-2,-2,1.5,0,0,1.5,0];
Scene32.addChildren(PositionInterpolator54);

TimeSensor55 = Browser.createNode("TimeSensor");
TimeSensor55.DEF = "OrbitClock";
TimeSensor55.cycleInterval = 8.0;
TimeSensor55.loop = True;
Scene32.addChildren(TimeSensor55);

ROUTE56 = Browser.createNode("ROUTE");
ROUTE56.fromField = "fraction_changed";
ROUTE56.fromNode = "OrbitClock";
ROUTE56.toField = "set_fraction";
ROUTE56.toNode = "BoxPathAnimator";
Scene32.addChildren(ROUTE56);

ROUTE57 = Browser.createNode("ROUTE");
ROUTE57.fromField = "value_changed";
ROUTE57.fromNode = "BoxPathAnimator";
ROUTE57.toField = "set_translation";
ROUTE57.toNode = "LogoGeometryTransform";
Scene32.addChildren(ROUTE57);

Transform58 = Browser.createNode("Transform");
Transform58.DEF = "TextTransform";
Transform58.translation = [0,-1.5,0];
Shape59 = Browser.createNode("Shape");
Appearance60 = Browser.createNode("Appearance");
Material61 = Browser.createNode("Material");
Material61.USE = "GreenMaterial";
Appearance60.material = Material61;

Shape59.appearance = Appearance60;

Text62 = Browser.createNode("Text");
Text62.string = ["X3D Java","SAI Library","X3DJSAIL"];
// Comment example A, plain quotation marks: He said, \"Immel did it!\" 
// Comment example B, XML character entities: He said, &quot;Immel did it!&quot; 
MetadataSet63 = Browser.createNode("MetadataSet");
MetadataSet63.name = "EscapedQuotationMarksMetadataSet";
MetadataString64 = Browser.createNode("MetadataString");
MetadataString64.name = "quotesTestC";
MetadataString64.value = ["MFString example C, backslash-escaped quotes: He said, \"Immel did it!\""];
MetadataSet63.addValue(MetadataString64);

MetadataString65 = Browser.createNode("MetadataString");
MetadataString65.name = "extraChildTest";
MetadataString65.value = ["checks MetadataSetObject addValue() method"];
MetadataSet63.addValue(MetadataString65);

Text62.metadata = MetadataSet63;

FontStyle66 = Browser.createNode("FontStyle");
FontStyle66.family = ["SERIF"];
FontStyle66.justify = ["MIDDLE","MIDDLE"];
Text62.fontStyle = FontStyle66;

Shape59.geometry = Text62;

Transform58.addChildren(Shape59);

Collision67 = Browser.createNode("Collision");
// test containerField='proxy' 
Shape68 = Browser.createNode("Shape");
Shape68.DEF = "ProxyShape";
// alternative XML encoding: Text string='\"One, Two, Comment\" \"\" \"He said, \\&quot;Immel did it!\\&quot;\"' 
// alternative XML encoding: Text string='\"One, Two, Comment\" \"\" \"He said, \\&quot;Immel did it!\\&quot;\" \"\"' 
// alternative Java source: .setString(new String [] {\"One, Two, Comment\", \"\", \"He said, \\\"Immel did it!\\\"\"}) 
// reference: https://www.web3d.org/x3d/content/examples/Basic/X3dSpecifications/StringArrayEncodingExamplesIndex.html 
Text69 = Browser.createNode("Text");
Text69.string = ["One, Two, Text","","He said, \"Immel did it!\" \"\""];
Shape68.geometry = Text69;

Collision67.setProxy = Shape68;

Transform58.addChildren(Collision67);

// It's a beautiful world 
// ... for you! 
// https://en.wikipedia.org/wiki/Beautiful_World_(Devo_song) 
Scene32.addChildren(Transform58);

// repeatedly spin 180 degrees as a readable special effect 
OrientationInterpolator70 = Browser.createNode("OrientationInterpolator");
OrientationInterpolator70.DEF = "SpinInterpolator";
OrientationInterpolator70.key = [0,0.5,1];
OrientationInterpolator70.keyValue = [0,1,0,4.712389,0,1,0,0,0,1,0,1.5707964];
Scene32.addChildren(OrientationInterpolator70);

TimeSensor71 = Browser.createNode("TimeSensor");
TimeSensor71.DEF = "SpinClock";
TimeSensor71.cycleInterval = 5.0;
TimeSensor71.loop = True;
Scene32.addChildren(TimeSensor71);

ROUTE72 = Browser.createNode("ROUTE");
ROUTE72.fromField = "fraction_changed";
ROUTE72.fromNode = "SpinClock";
ROUTE72.toField = "set_fraction";
ROUTE72.toNode = "SpinInterpolator";
Scene32.addChildren(ROUTE72);

ROUTE73 = Browser.createNode("ROUTE");
ROUTE73.fromField = "value_changed";
ROUTE73.fromNode = "SpinInterpolator";
ROUTE73.toField = "rotation";
ROUTE73.toNode = "TextTransform";
Scene32.addChildren(ROUTE73);

Group74 = Browser.createNode("Group");
Group74.DEF = "BackgroundGroup";
Background75 = Browser.createNode("Background");
Background75.DEF = "GradualBackground";
Group74.addChildren(Background75);

Script76 = Browser.createNode("Script");
Script76.DEF = "colorTypeConversionScript";
field77 = Browser.createNode("field");
field77.name = "colorInput";
field77.accessType = "inputOnly";
field77.type = "SFColor";
Script76.addField(field77);

field78 = Browser.createNode("field");
field78.name = "colorsOutput";
field78.accessType = "outputOnly";
field78.type = "MFColor";
Script76.addField(field78);


Script76.setSourceCode(`\n"+
"ecmascript:\n"+
"\n"+
"function colorInput (eventValue) // Example source code\n"+
"{\n"+
"   colorsOutput = new MFColor(eventValue); // assigning value sends output event\n"+
"// Browser.print('colorInput=' + eventValue + ', colorsOutput=' + colorsOutput + '\\n');\n"+
"}\n"+
"`)
Group74.addChildren(Script76);

ColorInterpolator79 = Browser.createNode("ColorInterpolator");
ColorInterpolator79.DEF = "ColorAnimator";
ColorInterpolator79.key = [0,0.5,1];
ColorInterpolator79.keyValue = [0.9411765,1,1,0.29411766,0,0.50980395,0.9411765,1,1];
// AZURE to INDIGO and back again 
Group74.addChildren(ColorInterpolator79);

TimeSensor80 = Browser.createNode("TimeSensor");
TimeSensor80.DEF = "ColorClock";
TimeSensor80.cycleInterval = 60.0;
TimeSensor80.loop = True;
Group74.addChildren(TimeSensor80);

ROUTE81 = Browser.createNode("ROUTE");
ROUTE81.fromField = "colorsOutput";
ROUTE81.fromNode = "colorTypeConversionScript";
ROUTE81.toField = "skyColor";
ROUTE81.toNode = "GradualBackground";
Group74.addChildren(ROUTE81);

ROUTE82 = Browser.createNode("ROUTE");
ROUTE82.fromField = "value_changed";
ROUTE82.fromNode = "ColorAnimator";
ROUTE82.toField = "colorInput";
ROUTE82.toNode = "colorTypeConversionScript";
Group74.addChildren(ROUTE82);

ROUTE83 = Browser.createNode("ROUTE");
ROUTE83.fromField = "fraction_changed";
ROUTE83.fromNode = "ColorClock";
ROUTE83.toField = "set_fraction";
ROUTE83.toNode = "ColorAnimator";
Group74.addChildren(ROUTE83);

Scene32.addChildren(Group74);

ProtoDeclare84 = Browser.createNode("ProtoDeclare");
ProtoDeclare84.name = "ArtDeco01Material";
ProtoDeclare84.appinfo = "tooltip: ArtDeco01Material prototype is a Material node";
ProtoInterface85 = Browser.createNode("ProtoInterface");
field86 = Browser.createNode("field");
field86.name = "description";
field86.accessType = "inputOutput";
field86.appinfo = "tooltip for descriptionField";
field86.type = "SFString";
field86.value = "ArtDeco01Material prototype is a Material node";
ProtoInterface85.addField(field86);

field87 = Browser.createNode("field");
field87.name = "enabled";
field87.accessType = "inputOutput";
field87.type = "SFBool";
field87.value = "true";
ProtoInterface85.addField(field87);

ProtoDeclare84.protoInterface = ProtoInterface85;

ProtoBody88 = Browser.createNode("ProtoBody");
// Initial node of ProtoBody determines prototype node type 
Material89 = Browser.createNode("Material");
Material89.ambientIntensity = 0.25;
Material89.diffuseColor = [0.282435,0.085159,0.134462];
Material89.shininess = 0.127273;
Material89.specularColor = [0.276305,0.11431,0.139857];
ProtoBody88.addChildren(Material89);

// [HelloWorldProgram diagnostic] should be connected to scene graph: artDeco01ProtoDeclare.getNodeType()=\"Material\" 
// presence of follow-on TouchSensor shows that additional nodes are allowed in ProtoBody after initial node, regardless of node types 
TouchSensor90 = Browser.createNode("TouchSensor");
TouchSensor90.description = "within ProtoBody";
IS91 = Browser.createNode("IS");
connect92 = Browser.createNode("connect");
connect92.nodeField = "description";
connect92.protoField = "description";
IS91.addConnect(connect92);

connect93 = Browser.createNode("connect");
connect93.nodeField = "enabled";
connect93.protoField = "enabled";
IS91.addConnect(connect93);

TouchSensor90.iS = IS91;

ProtoBody88.addChildren(TouchSensor90);

ProtoDeclare84.protoBody = ProtoBody88;

Scene32.addChildren(ProtoDeclare84);

ExternProtoDeclare94 = Browser.createNode("ExternProtoDeclare");
ExternProtoDeclare94.name = "ArtDeco02Material";
ExternProtoDeclare94.appinfo = "this is a different Material node";
ExternProtoDeclare94.url = ["http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco02Material","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3dv#ArtDeco02Material"];
// [HelloWorldProgram diagnostic] artDeco02ExternProtoDeclare.getNodeType()=\"ERROR_UNKNOWN_EXTERNPROTODECLARE_NODE_TYPE: ExternProtoDeclare name='ArtDeco02Material' type cannot be remotely accessed at run time. TODO X3DJSAIL needs to add further capability that retrieves the ExternProtoDeclare file.\" 
field95 = Browser.createNode("field");
field95.name = "description";
field95.accessType = "inputOutput";
field95.appinfo = "tooltip for descriptionField";
field95.type = "SFString";
ExternProtoDeclare94.addField(field95);

Scene32.addChildren(ExternProtoDeclare94);

// Tested ArtDeco01ProtoInstance, ArtDeco02ProtoInstance for improper node type when ProtoInstance is added in wrong place 
Shape96 = Browser.createNode("Shape");
Shape96.DEF = "TestShape1";
Appearance97 = Browser.createNode("Appearance");
Appearance97.DEF = "TestAppearance1";
// ArtDeco01Material prototype goes here... TODO ensure setContainerField is handled in exported Java 
ProtoInstance98 = Browser.createNode("ProtoInstance");
ProtoInstance98.name = "ArtDeco01Material";
// [HelloWorldProgram diagnostic] ArtDeco01ProtoInstance.getNodeType()=\"Material\" 
fieldValue99 = Browser.createNode("fieldValue");
fieldValue99.name = "description";
fieldValue99.value = "ArtDeco01Material can substitute for a Material node";
ProtoInstance98.addFieldValue(fieldValue99);

Appearance97.setMaterial = ProtoInstance98;

Shape96.appearance = Appearance97;

Sphere100 = Browser.createNode("Sphere");
Sphere100.radius = 0.001;
Shape96.geometry = Sphere100;

Scene32.addChildren(Shape96);

Shape101 = Browser.createNode("Shape");
Shape101.DEF = "TestShape2";
Appearance102 = Browser.createNode("Appearance");
Appearance102.DEF = "TestAppearance2";
// ArtDeco02Material prototype goes here... TODO ensure setContainerField is handled in exported Java 
ProtoInstance103 = Browser.createNode("ProtoInstance");
ProtoInstance103.DEF = "ArtDeco02MaterialDEF";
ProtoInstance103.name = "ArtDeco02Material";
// [HelloWorldProgram diagnostic] ArtDeco02ProtoInstance.getNodeType()=\"ERROR_UNKNOWN_EXTERNPROTODECLARE_NODE_TYPE: ExternProtoDeclare name='ArtDeco02Material' type cannot be remotely accessed at run time. TODO X3DJSAIL needs to add further capability that retrieves the ExternProtoDeclare file.\" 
fieldValue104 = Browser.createNode("fieldValue");
fieldValue104.name = "description";
fieldValue104.value = "ArtDeco02Material can substitute for another Material node";
ProtoInstance103.addFieldValue(fieldValue104);

Appearance102.setMaterial = ProtoInstance103;

Shape101.appearance = Appearance102;

Cone105 = Browser.createNode("Cone");
Cone105.bottomRadius = 0.001;
Cone105.height = 0.001;
Shape101.geometry = Cone105;

Scene32.addChildren(Shape101);

Shape106 = Browser.createNode("Shape");
Shape106.DEF = "TestShape3";
Appearance107 = Browser.createNode("Appearance");
Appearance107.DEF = "TestAppearance3";
// ArtDeco02Material ProtoInstance USE goes here. Note that name field is NOT defined as part of ProtoInstance USE. 
ProtoInstance108 = Browser.createNode("ProtoInstance");
ProtoInstance108.USE = "ArtDeco02MaterialDEF";
Appearance107.setMaterial = ProtoInstance108;

Shape106.appearance = Appearance107;

Cylinder109 = Browser.createNode("Cylinder");
Cylinder109.height = 0.001;
Cylinder109.radius = 0.001;
Shape106.geometry = Cylinder109;

Scene32.addChildren(Shape106);

Inline110 = Browser.createNode("Inline");
Inline110.DEF = "inlineSceneDef";
Inline110.url = ["someOtherScene.x3d","https://www.web3d.org/specifications/java/examples/someOtherScene.x3d"];
Scene32.addChildren(Inline110);

IMPORT111 = Browser.createNode("IMPORT");
IMPORT111.AS = "WorldInfoDEF2";
IMPORT111.importedDEF = "WorldInfoDEF";
IMPORT111.inlineDEF = "inlineSceneDef";
Scene32.addChildren(IMPORT111);

EXPORT112 = Browser.createNode("EXPORT");
EXPORT112.AS = "WorldInfoDEF3";
EXPORT112.localDEF = "WorldInfoDEF";
Scene32.addChildren(EXPORT112);

ProtoDeclare113 = Browser.createNode("ProtoDeclare");
ProtoDeclare113.name = "MaterialModulator";
ProtoDeclare113.appinfo = "mimic a Material node and modulate fields as an animation effect";
ProtoDeclare113.documentation = "http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorIndex.html";
ProtoInterface114 = Browser.createNode("ProtoInterface");
field115 = Browser.createNode("field");
field115.name = "enabled";
field115.accessType = "inputOutput";
field115.type = "SFBool";
field115.value = "true";
ProtoInterface114.addField(field115);

field116 = Browser.createNode("field");
field116.name = "diffuseColor";
field116.accessType = "inputOutput";
field116.type = "SFColor";
field116.value = "0 0 0";
ProtoInterface114.addField(field116);

field117 = Browser.createNode("field");
field117.name = "emissiveColor";
field117.accessType = "inputOutput";
field117.type = "SFColor";
field117.value = "0.05 0.05 0.5";
ProtoInterface114.addField(field117);

field118 = Browser.createNode("field");
field118.name = "specularColor";
field118.accessType = "inputOutput";
field118.type = "SFColor";
field118.value = "0 0 0";
ProtoInterface114.addField(field118);

field119 = Browser.createNode("field");
field119.name = "transparency";
field119.accessType = "inputOutput";
field119.type = "SFFloat";
field119.value = "0.0";
ProtoInterface114.addField(field119);

field120 = Browser.createNode("field");
field120.name = "shininess";
field120.accessType = "inputOutput";
field120.type = "SFFloat";
field120.value = "0.0";
ProtoInterface114.addField(field120);

field121 = Browser.createNode("field");
field121.name = "ambientIntensity";
field121.accessType = "inputOutput";
field121.type = "SFFloat";
field121.value = "0.0";
ProtoInterface114.addField(field121);

ProtoDeclare113.protoInterface = ProtoInterface114;

ProtoBody122 = Browser.createNode("ProtoBody");
Material123 = Browser.createNode("Material");
Material123.DEF = "MaterialNode";
IS124 = Browser.createNode("IS");
connect125 = Browser.createNode("connect");
connect125.nodeField = "diffuseColor";
connect125.protoField = "diffuseColor";
IS124.addConnect(connect125);

connect126 = Browser.createNode("connect");
connect126.nodeField = "emissiveColor";
connect126.protoField = "emissiveColor";
IS124.addConnect(connect126);

connect127 = Browser.createNode("connect");
connect127.nodeField = "specularColor";
connect127.protoField = "specularColor";
IS124.addConnect(connect127);

connect128 = Browser.createNode("connect");
connect128.nodeField = "transparency";
connect128.protoField = "transparency";
IS124.addConnect(connect128);

connect129 = Browser.createNode("connect");
connect129.nodeField = "shininess";
connect129.protoField = "shininess";
IS124.addConnect(connect129);

connect130 = Browser.createNode("connect");
connect130.nodeField = "ambientIntensity";
connect130.protoField = "ambientIntensity";
IS124.addConnect(connect130);

Material123.iS = IS124;

ProtoBody122.addChildren(Material123);

// Only first node (the node type) is renderable, others are along for the ride 
Script131 = Browser.createNode("Script");
Script131.DEF = "MaterialModulatorScript";
field132 = Browser.createNode("field");
field132.name = "enabled";
field132.accessType = "inputOutput";
field132.type = "SFBool";
Script131.addField(field132);

field133 = Browser.createNode("field");
field133.name = "diffuseColor";
field133.accessType = "inputOutput";
field133.type = "SFColor";
Script131.addField(field133);

field134 = Browser.createNode("field");
field134.name = "newColor";
field134.accessType = "outputOnly";
field134.type = "SFColor";
Script131.addField(field134);

field135 = Browser.createNode("field");
field135.name = "clockTrigger";
field135.accessType = "inputOnly";
field135.type = "SFTime";
Script131.addField(field135);

IS136 = Browser.createNode("IS");
connect137 = Browser.createNode("connect");
connect137.nodeField = "enabled";
connect137.protoField = "enabled";
IS136.addConnect(connect137);

connect138 = Browser.createNode("connect");
connect138.nodeField = "diffuseColor";
connect138.protoField = "diffuseColor";
IS136.addConnect(connect138);

Script131.iS = IS136;


Script131.setSourceCode(`\n"+
"ecmascript:\n"+
"function initialize ()\n"+
"{\n"+
"    newColor = diffuseColor; // start with correct color\n"+
"}\n"+
"function set_enabled (newValue)\n"+
"{\n"+
"	enabled = newValue;\n"+
"}\n"+
"function clockTrigger (timeValue)\n"+
"{\n"+
"    if (!enabled) return;\n"+
"    red   = newColor.r;\n"+
"    green = newColor.g;\n"+
"    blue  = newColor.b;\n"+
"    \n"+
"    // note different modulation rates for each color component, % is modulus operator\n"+
"    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);\n"+
"	if (enabled)\n"+
"	{\n"+
"		Browser.print ('diffuseColor=(' + red + ',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\\n');\n"+
"	}\n"+
"}\n"+
"`)
ProtoBody122.addChildren(Script131);

ProtoDeclare113.protoBody = ProtoBody122;

Scene32.addChildren(ProtoDeclare113);

// Test success: declarative statement createDeclarativeShapeTests() 
Group139 = Browser.createNode("Group");
Group139.DEF = "DeclarativeGroupExample";
Shape140 = Browser.createNode("Shape");
MetadataString141 = Browser.createNode("MetadataString");
MetadataString141.DEF = "FindableMetadataStringTest";
MetadataString141.name = "findThisNameValue";
MetadataString141.value = ["test case"];
Shape140.metadata = MetadataString141;

Appearance142 = Browser.createNode("Appearance");
Appearance142.DEF = "DeclarativeAppearanceExample";
// DeclarativeMaterialExample gets overridden by subsequently added MaterialModulator ProtoInstance 
ProtoInstance143 = Browser.createNode("ProtoInstance");
ProtoInstance143.DEF = "MyMaterialModulator";
ProtoInstance143.name = "MaterialModulator";
Appearance142.setMaterial = ProtoInstance143;

Shape140.appearance = Appearance142;

Cone144 = Browser.createNode("Cone");
Cone144.bottom = False;
Cone144.bottomRadius = 0.05;
Cone144.height = 0.1;
Shape140.geometry = Cone144;

Group139.addChildren(Shape140);

// Test success: declarativeGroup.addChild() singleton pipeline method 
Scene32.addChildren(Group139);

// Test success: declarative statement addChild() 
// Test success: x3dModel.findNodeByDEF(DeclarativeAppearanceExample) = <Appearance DEF='DeclarativeAppearanceExample'/> i.e. <Appearance DEF='DeclarativeAppearanceExample'> <!- - DeclarativeMaterialExample gets overridden by subsequently added MaterialModulator ProtoInstance - -> <ProtoInstance DEF='MyMaterialModulator' name='MaterialModulator' containerField='material'/> </Appearance> 
// Test success: x3dModel.findElementByNameValue(findThisNameValue) = <MetadataString DEF='FindableMetadataStringTest' name='findThisNameValue' value='\"test case\"'/> 
// Test success: x3dModel.findElementByNameValue(\"ArtDeco01Material\", \"ProtoDeclare\") found 
// Test success: x3dModel.findElementByNameValue(\"MaterialModulator\", \"ProtoDeclare\") found 
// Test success: x3dModel.findElementByNameValue(\"MaterialModulator\", \"ProtoInstance\") found 
Group145 = Browser.createNode("Group");
Group145.DEF = "TestFieldObjectsGroup";
// testFieldObjects() results 
// SFBool default=true, true=true, false=false, negate()=true 
// MFBool default=, initial=true false true, negate()=false true false 
// SFFloat default=0.0, initial=1.0, setValue(2)=2.0, setValue(3.0f)=3.0, setValue(4.0)=4.0 
// MFFloat default=, initial=1 2 3, append(5)=1 2 3 5, inserts(3,4)(0,0)=0 1 2 3 4 5, append(6)=0 1 2 3 4 5 6, size()=7 
// ... get1Value[3]=3.0, remove[1]=0 2 3 4 5 6, set1Value(0,10)=10 2 3 4 5 6, multiply(2)=20 4 6 8 10 12, clear= 
// SFVec3f default=0 0 0, initial=1 2 3, setValue=4 5 6, multiply(2)=8 10 12, normalize()=0.45584232 0.5698029 0.68376344, regex matches()=true 
// regex test SFVec3f().matches(\"1 2 3\")=true, regex test SFVec3f().matches(\"1 2 3 4\")=false, regex test (SFRotationObject.matches(\"0 0 0 0\")=true, failure detecting illegal (zero axis) rotation value 
Scene32.addChildren(Group145);

Sound146 = Browser.createNode("Sound");
Sound146.location = [0,1.6,0];
// set sound-ellipsoid location height at 1.6m to match typical avatar height 
AudioClip147 = Browser.createNode("AudioClip");
AudioClip147.description = "chimes";
AudioClip147.url = ["chimes.wav","https://www.web3d.org/x3d/content/examples/ConformanceNist/Sounds/AudioClip/chimes.wav"];
// Scene example fragment from https://www.web3d.org/x3d/content/examples/ConformanceNist/Sounds/AudioClip/default.x3d 
Sound146.source = AudioClip147;

Scene32.addChildren(Sound146);

Sound148 = Browser.createNode("Sound");
Sound148.location = [0,1.6,0];
// set sound-ellipsoid location height at 1.6m to match typical avatar height 
MovieTexture149 = Browser.createNode("MovieTexture");
MovieTexture149.description = "mpgsys.mpg from ConformanceNist suite";
MovieTexture149.url = ["mpgsys.mpg","https://www.web3d.org/x3d/content/examples/ConformanceNist/Appearance/MovieTexture/mpgsys.mpg"];
// Scene example fragment from https://www.web3d.org/x3d/content/examples/ConformanceNist/Appearance/MovieTexture/mpeg1-systems.x3d 
// Expected containerField='source', allowed containerField values=\"texture\" \"source\" \"back\" \"bottom\" \"front\" \"left\" \"right\" \"top\" \"backTexture\" \"bottomTexture\" \"frontTexture\" \"leftTexture\" \"rightTexture\" \"topTexture\" \"watchList\" 
Sound148.setSource = MovieTexture149;

Scene32.addChildren(Sound148);

// Test success: AnchorObject.isNode()=true, siteAnchor.isNode()=true 
// Test success: AnchorObject.isStatement()=false, siteAnchor.isStatement()=false 
// Test success: ROUTEObject.isNode()=false, orbitPositionROUTE.isNode()=false 
// Test success: ROUTEObject.isStatement()=true, orbitPositionROUTE.isStatement()=true 
// Test success: CommentsBlock.isNode()=false, testComments.isNode()=false 
// Test failure: CommentsBlock.isStatement()=true, testComments.isStatement()=true 
Shape150 = Browser.createNode("Shape");
Shape150.DEF = "ExtrusionShape";
// ExampleExtrusion isCrossSectionClosed()=true, crossSection='[1.0, 1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0, 1.0]' 
// ExampleExtrusion isSpineClosed()=false, spine='[0.0, 0.0, 0.0, 0.0, 1.0, 0.0]' 
Appearance151 = Browser.createNode("Appearance");
Appearance151.DEF = "TransparentAppearance";
Material152 = Browser.createNode("Material");
Material152.transparency = 1.0;
Appearance151.material = Material152;

Shape150.appearance = Appearance151;

Extrusion153 = Browser.createNode("Extrusion");
Extrusion153.DEF = "ExampleExtrusion";
Shape150.geometry = Extrusion153;

Scene32.addChildren(Shape150);

Group154 = Browser.createNode("Group");
// Test MFNode children array as an ordered list consisting of comments, statements, ProtoInstance and nodes 
ProtoDeclare155 = Browser.createNode("ProtoDeclare");
ProtoDeclare155.name = "NewWorldInfo";
ProtoInterface156 = Browser.createNode("ProtoInterface");
field157 = Browser.createNode("field");
field157.name = "description";
field157.accessType = "initializeOnly";
field157.type = "SFString";
ProtoInterface156.addField(field157);

ProtoDeclare155.protoInterface = ProtoInterface156;

ProtoBody158 = Browser.createNode("ProtoBody");
WorldInfo159 = Browser.createNode("WorldInfo");
ProtoBody158.addChildren(WorldInfo159);

ProtoDeclare155.protoBody = ProtoBody158;

Group154.addChildren(ProtoDeclare155);

ProtoInstance160 = Browser.createNode("ProtoInstance");
ProtoInstance160.DEF = "Proto1";
ProtoInstance160.name = "NewWorldInfo";
fieldValue161 = Browser.createNode("fieldValue");
fieldValue161.name = "description";
fieldValue161.value = "testing 1 2 3";
ProtoInstance160.addFieldValue(fieldValue161);

Group154.addChildren(ProtoInstance160);

Group162 = Browser.createNode("Group");
Group162.DEF = "Node2";
// intentionally empty 
Group154.addChildren(Group162);

ProtoInstance163 = Browser.createNode("ProtoInstance");
ProtoInstance163.DEF = "Proto3";
ProtoInstance163.name = "NewWorldInfo";
Group154.addChildren(ProtoInstance163);

Transform164 = Browser.createNode("Transform");
Transform164.DEF = "Node4";
// intentionally empty 
Group154.addChildren(Transform164);

// Test satisfactorily creates MFNode children array as an ordered list with mixed content 
Scene32.addChildren(Group154);

ProtoDeclare165 = Browser.createNode("ProtoDeclare");
ProtoDeclare165.name = "ShaderProto";
ProtoBody166 = Browser.createNode("ProtoBody");
ProgramShader167 = Browser.createNode("ProgramShader");
ProtoBody166.addChild(ProgramShader167);

ProtoDeclare165.protoBody = ProtoBody166;

Scene32.addChildren(ProtoDeclare165);

Shape168 = Browser.createNode("Shape");
Appearance169 = Browser.createNode("Appearance");
// Test MFNode shaders array as an ordered list consisting of comments, ProtoInstance and nodes 
// Test satisfactorily creates MFNode shaders array as an ordered list with mixed content 
ProgramShader170 = Browser.createNode("ProgramShader");
ProgramShader170.DEF = "TestShader1";
ShaderProgram171 = Browser.createNode("ShaderProgram");
ShaderProgram171.DEF = "TestShader2";
ProgramShader170.addPrograms(ShaderProgram171);

Appearance169.addShaders(ProgramShader170);

ProtoInstance172 = Browser.createNode("ProtoInstance");
ProtoInstance172.DEF = "TestShader3";
ProtoInstance172.name = "ShaderProto";
Appearance169.setMaterial = ProtoInstance172;

ComposedShader173 = Browser.createNode("ComposedShader");
ComposedShader173.DEF = "TestShader4";
ShaderPart174 = Browser.createNode("ShaderPart");
ShaderPart174.DEF = "TestShader5";
ComposedShader173.addParts(ShaderPart174);

Appearance169.addShaders(ComposedShader173);

Shape168.appearance = Appearance169;

Scene32.addChildren(Shape168);

Transform175 = Browser.createNode("Transform");
Transform175.DEF = "SpecialtyNodes";
CADLayer176 = Browser.createNode("CADLayer");
CADAssembly177 = Browser.createNode("CADAssembly");
CADPart178 = Browser.createNode("CADPart");
CADFace179 = Browser.createNode("CADFace");
CADPart178.addChildren(CADFace179);

CADAssembly177.addChildren(CADPart178);

CADLayer176.addChildren(CADAssembly177);

Transform175.addChildren(CADLayer176);

EspduTransform180 = Browser.createNode("EspduTransform");
EspduTransform180.geoSystem = ["GD","WE"];
Transform175.addChildren(EspduTransform180);

ReceiverPdu181 = Browser.createNode("ReceiverPdu");
ReceiverPdu181.geoSystem = ["GD","WE"];
Transform175.addChildren(ReceiverPdu181);

SignalPdu182 = Browser.createNode("SignalPdu");
SignalPdu182.geoSystem = ["GD","WE"];
Transform175.addChildren(SignalPdu182);

TransmitterPdu183 = Browser.createNode("TransmitterPdu");
TransmitterPdu183.geoSystem = ["GD","WE"];
Transform175.addChildren(TransmitterPdu183);

DISEntityManager184 = Browser.createNode("DISEntityManager");
DISEntityTypeMapping185 = Browser.createNode("DISEntityTypeMapping");
DISEntityManager184.addMapping(DISEntityTypeMapping185);

Transform175.addChildren(DISEntityManager184);

Scene32.addChildren(Transform175);

X3D0.scene = Scene32;

X3D0.toFileX3D("examples/HelloWorldProgramOutput_RoundTrip.x3d")
