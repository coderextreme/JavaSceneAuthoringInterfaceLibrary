import classpath
from org.web3d.x3d.jsail.Core.X3DObject import X3DObject as X3D
from org.web3d.x3d.jsail.Core.headObject import headObject as head
from org.web3d.x3d.jsail.Core.metaObject import metaObject as meta
from org.web3d.x3d.jsail.Core.SceneObject import SceneObject as Scene
from org.web3d.x3d.jsail.Grouping.GroupObject import GroupObject as Group
from org.web3d.x3d.jsail.Navigation.ViewpointObject import ViewpointObject as Viewpoint
from org.web3d.x3d.jsail.Grouping.TransformObject import TransformObject as Transform
from org.web3d.x3d.jsail.Shape.ShapeObject import ShapeObject as Shape
from org.web3d.x3d.jsail.Geometry3D.SphereObject import SphereObject as Sphere
from org.web3d.x3d.jsail.Shape.AppearanceObject import AppearanceObject as Appearance
from org.web3d.x3d.jsail.Shape.MaterialObject import MaterialObject as Material
from org.web3d.x3d.jsail.Texturing.ImageTextureObject import ImageTextureObject as ImageTexture
from org.web3d.x3d.jsail.Text.TextObject import TextObject as Text
from org.web3d.x3d.jsail.Text.FontStyleObject import FontStyleObject as FontStyle
X3D0 = X3D()
X3D0.setProfile("Immersive")
X3D0.setVersion("3.3")
head1 = head()
meta2 = meta()
meta2.setContent("HelloWorld.x3d")
meta2.setName("title")

head1.addMeta(meta2)
meta3 = meta()
meta3.setContent("Simple X3D scene example: Hello World!")
meta3.setName("description")

head1.addMeta(meta3)
meta4 = meta()
meta4.setContent("30 October 2000")
meta4.setName("created")

head1.addMeta(meta4)
meta5 = meta()
meta5.setContent("28 July 2015")
meta5.setName("modified")

head1.addMeta(meta5)
meta6 = meta()
meta6.setContent("Don Brutzman")
meta6.setName("creator")

head1.addMeta(meta6)
meta7 = meta()
meta7.setContent("HelloWorld.tall.png")
meta7.setName("Image")

head1.addMeta(meta7)
meta8 = meta()
meta8.setContent("http://en.wikipedia.org/wiki/Hello_world")
meta8.setName("reference")

head1.addMeta(meta8)
meta9 = meta()
meta9.setContent("https://en.wikipedia.org/wiki/Hello#.22Hello.2C_World.22_computer_program")
meta9.setName("reference")

head1.addMeta(meta9)
meta10 = meta()
meta10.setContent("https://en.wikipedia.org/wiki/\"Hello,_World!\"_program")
meta10.setName("reference")

head1.addMeta(meta10)
meta11 = meta()
meta11.setContent("http://en.wikibooks.org/w/index.php?title=Computer_Programming/Hello_world")
meta11.setName("reference")

head1.addMeta(meta11)
meta12 = meta()
meta12.setContent("http://www.HelloWorldExample.net")
meta12.setName("reference")

head1.addMeta(meta12)
meta13 = meta()
meta13.setContent("http://www.web3D.org")
meta13.setName("reference")

head1.addMeta(meta13)
meta14 = meta()
meta14.setContent("http://www.web3d.org/realtime-3d/news/internationalization-x3d")
meta14.setName("reference")

head1.addMeta(meta14)
meta15 = meta()
meta15.setContent("http://www.web3d.org/x3d/content/examples/HelloWorld.x3d")
meta15.setName("reference")

head1.addMeta(meta15)
meta16 = meta()
meta16.setContent("http://X3dGraphics.com/examples/X3dForAdvancedModeling/HelloWorldScenes")
meta16.setName("reference")

head1.addMeta(meta16)
meta17 = meta()
meta17.setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloWorld.x3d")
meta17.setName("identifier")

head1.addMeta(meta17)
meta18 = meta()
meta18.setContent("http://www.web3d.org/x3d/content/examples/license.html")
meta18.setName("license")

head1.addMeta(meta18)
meta19 = meta()
meta19.setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit")
meta19.setName("generator")

head1.addMeta(meta19)
# Alternate encodings: VRML97, X3D ClassicVRML Encoding, X3D Compressed Binary Encoding (CBE), X3DOM, JSON 
meta20 = meta()
meta20.setContent("HelloWorld.wrl")
meta20.setName("reference")

head1.addMeta(meta20)
meta21 = meta()
meta21.setContent("HelloWorld.x3dv")
meta21.setName("reference")

head1.addMeta(meta21)
meta22 = meta()
meta22.setContent("HelloWorld.x3db")
meta22.setName("reference")

head1.addMeta(meta22)
meta23 = meta()
meta23.setContent("HelloWorld.xhtml")
meta23.setName("reference")

head1.addMeta(meta23)
meta24 = meta()
meta24.setContent("HelloWorld.json")
meta24.setName("reference")

head1.addMeta(meta24)

X3D0.setHead(head1)
Scene25 = Scene()
# Example scene to illustrate X3D nodes and fields (XML elements and attributes) 
Group26 = Group()
Viewpoint27 = Viewpoint()
Viewpoint27.setDEF("ViewUpClose")
Viewpoint27.setCenterOfRotation([0,-1,0])
Viewpoint27.setDescription("Hello world!")
Viewpoint27.setPosition([0,-1,7])

Group26.addChildren(Viewpoint27)
Transform28 = Transform()
Transform28.setRotation([0,1,0,3])
Shape29 = Shape()
Sphere30 = Sphere()

Shape29.setGeometry(Sphere30)
Appearance31 = Appearance()
Material32 = Material()
Material32.setDEF("MaterialLightBlue")
Material32.setDiffuseColor([0.1,0.5,1])

Appearance31.setMaterial(Material32)
ImageTexture33 = ImageTexture()
ImageTexture33.setDEF("ImageCloudlessEarth")
ImageTexture33.setUrl(["earth-topo.png","earth-topo.jpg","earth-topo-small.gif","http://www.web3d.org/x3d/content/examples/Basic/earth-topo.png","http://www.web3d.org/x3d/content/examples/Basic/earth-topo.jpg","http://www.web3d.org/x3d/content/examples/Basic/earth-topo-small.gif"])

Appearance31.setTexture(ImageTexture33)

Shape29.setAppearance(Appearance31)

Transform28.addChildren(Shape29)

Group26.addChildren(Transform28)
Transform34 = Transform()
Transform34.setTranslation([0,-2,0])
Shape35 = Shape()
Text36 = Text()
Text36.setDEF("TextMessage")
Text36.setString(["Hello","world!"])
FontStyle37 = FontStyle()
FontStyle37.setJustify(["MIDDLE","MIDDLE"])

Text36.setFontStyle(FontStyle37)

Shape35.setGeometry(Text36)
Appearance38 = Appearance()
Material39 = Material()
Material39.setUSE("MaterialLightBlue")

Appearance38.setMaterial(Material39)

Shape35.setAppearance(Appearance38)

Transform34.addChildren(Shape35)

Group26.addChildren(Transform34)

Scene25.addChildren(Group26)

X3D0.setScene(Scene25)
X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloWorld_RoundTrip.x3d")
