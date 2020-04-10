from X3Dpackage import *
X3D0 = X3D(profile="Immersive", version="3.3",    head1 = head(    meta2 = meta(content="ObliqueStrategies.x3d", name="title"), 
    meta3 = meta(content="Text scripting and animation example using Oblique Strategies card set by Brian Eno.", name="description"), 
    meta4 = meta(content="Don Brutzman, John Kelly, Ben Cheng", name="creator"), 
    meta5 = meta(content="3 November 2013", name="created"), 
    meta6 = meta(content="18 October 2015", name="modified"), 
    meta7 = meta(content="oblique.html", name="reference"), 
    meta8 = meta(content="ObliqueStrategies.txt", name="reference"), 
    meta9 = meta(content="ObliqueStrategiesScript.js", name="reference"), 
    meta10 = meta(content="http://music.hyperreal.org/artists/brian_eno/oblique/oblique.html", name="reference"), 
    meta11 = meta(content="http://www.eno-web.co.uk/obliques.html", name="reference"), 
    meta12 = meta(content="http://gothpunk.com/haiku-intro.html", name="reference"), 
    meta13 = meta(content="http://www.rtqe.net/ObliqueStrategies/OSintro.html", name="reference"), 
    meta14 = meta(content="https://en.wikipedia.org/wiki/Oblique_Strategies", name="reference"), 
    meta15 = meta(content="Brian Eno, Oblique Strategies", name="subject"), 
    meta16 = meta(content="images/ObliqueStrategiesEntryScreen.png", name="Image"), 
    meta17 = meta(content="http://translate.google.com/translate_tts?tl=en&q=hello%20X3D", name="audio"), 
    meta18 = meta(content="translate_tts_HelloX3D.mp3", name="audio"), 
    meta19 = meta(content="translate_tts_HelloX3D.wav", name="audio"), 
    meta20 = meta(content="multiliingual translation parameter", name="TODO"), 
    meta21 = meta(content="http://stackoverflow.com/questions/9163988/download-mp3-from-google-translate-text-to-speech", name="reference"), 
    meta22 = meta(content="http://www.greenbot.com/article/2105862/how-to-get-started-with-google-text-to-speech.html", name="reference"), 
    meta23 = meta(content="under development, scene Sound/AudioClip triggering (or retrieved file format) not working", name="warning"), 
    meta24 = meta(content="BSContact error: Script node TextScript: parse error: line 15 \" var strategy = [];", name="warning"), 
    meta25 = meta(content="http://X3dGraphics.com/examples/X3dForAdvancedModeling/Inspiration/ObliqueStrategies.x3d", name="identifier"), 
    meta26 = meta(content="X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit", name="generator"), 
    meta27 = meta(content="../license.html", name="license")), 
   Scene28 = Scene(    NavigationInfo29 = NavigationInfo(type=["EXAMINE","ANY"]), 
    Background30 = Background(skyColor=[0.419608,0.427451,1]), 
    Transform31 = Transform(scale=[0.4,0.4,0.4], translation=[0,1,0],      TouchSensor32 = TouchSensor(DEF="RandomTextClickedSensor", description="Select to see a new strategy"), 
     Shape33 = Shape(      Text34 = Text(string=["Oblique Strategies","","(Over One Hundred Worthwhile Dilemmas)","","by Brian Eno and Peter Schmidt"],        FontStyle35 = FontStyle(DEF="MessageFont", family=["SANS"], justify=["MIDDLE","MIDDLE"], style="BOLD")), 
      Appearance36 = Appearance(       Material37 = Material(diffuseColor=[1,1,1]))), 
     Transform38 = Transform(scale=[10,3,1],       Shape39 = Shape(DEF="HeadlineClickSurface",        IndexedFaceSet40 = IndexedFaceSet(coordIndex=[0,1,2,3,-1], solid=False,         Coordinate41 = Coordinate(point=[1,1,0,1,-1,0,-1,-1,0,-1,1,0])), 
       Appearance42 = Appearance(        Material43 = Material(ambientIntensity=0.245763, diffuseColor=[0.34773,0.090909,0.005289], shininess=0.07, specularColor=[0.336735,0.051091,0.051091], transparency=0.8))))), 
    Script44 = Script(DEF="TextScript", url=["./ObliqueStrategiesScript.js"],      # initialize() method includes unit test to printAllStrategies() to console 
     # TODO insert field definitions here (index string_changed previous next random) and then animate! 

     field45 = field(accessType="initializeOnly", appinfo="index for active strategy card, -1 means no selection", name="index", type="SFInt32", value="0"), 
     field46 = field(accessType="outputOnly", appinfo="latest strategy card value", name="string_changed", type="MFString"), 
     field47 = field(accessType="outputOnly", appinfo="url to invoke Google Translate", name="textToSpeechUrl", type="MFString"), 
     field48 = field(accessType="outputOnly", appinfo="activate Sound node", name="newCardTime", type="SFTime"), 
     field49 = field(accessType="inputOnly", name="selectPreviousCard", type="SFBool"), 
     field50 = field(accessType="inputOnly", name="selectNextCard", type="SFBool"), 
     field51 = field(accessType="inputOnly", name="selectRandomCard", type="SFBool"), 
     field52 = field(accessType="initializeOnly", appinfo="controls console tracing", name="traceEnabled", type="SFBool", value="true")), 
    Transform53 = Transform(DEF="CardTransform", scale=[0.4,0.4,0.4], translation=[0,-1.5,0],      Shape54 = Shape(      Text55 = Text(DEF="CardText",        FontStyle56 = FontStyle(family=["SANS"], justify=["MIDDLE","MIDDLE"], style="BOLD")), 
      Appearance57 = Appearance(       Material58 = Material(diffuseColor=[1,1,1]))), 
     ROUTE59 = ROUTE(fromField="string_changed", fromNode="TextScript", toField="string", toNode="CardText"), 
     Sound60 = Sound(DEF="CardSoundSpatialization", maxBack=100, maxFront=100, minBack=20, minFront=20,       # Make sure the sound source AudioClip is audible at the user location 
      # Not all X3D players seem to use the .mp3 
      # &#38; is ampersand character, avoids escaping problems and inconsistencies in browsers and X3D players 
      # %20 is space character used in uri/url encoding 

      AudioClip61 = AudioClip(DEF="TextToSpeechAudioClip", description="sends strategy text google translate", url=["http://translate.google.com/translate_tts?tl=en&q=Feed%20the%20recording%20back%20out%20of%20the%20medium","translate_tts_mp3FileFormatNotSupported.wav"])), 
     ROUTE62 = ROUTE(fromField="textToSpeechUrl", fromNode="TextScript", toField="url", toNode="TextToSpeechAudioClip"), 
     ROUTE63 = ROUTE(fromField="newCardTime", fromNode="TextScript", toField="startTime", toNode="TextToSpeechAudioClip")), 
    Transform64 = Transform(scale=[0.4,0.4,0.4], translation=[-3.2,2.5,0],      TouchSensor65 = TouchSensor(DEF="PreviousTextClickedSensor", description="Select to see previous strategy"), 
     ROUTE66 = ROUTE(fromField="isActive", fromNode="PreviousTextClickedSensor", toField="selectPreviousCard", toNode="TextScript"), 
     Shape67 = Shape(      Text68 = Text(string=["previous"],        FontStyle69 = FontStyle(USE="MessageFont")), 
      Appearance70 = Appearance(DEF="InterfaceAppearance",        Material71 = Material(diffuseColor=[1,0,0.6]))), 
     Transform72 = Transform(scale=[2,0.6,1],       Shape73 = Shape(DEF="TransparentClickSurface",        # support Selectable Text with a scalable IFS 

       IndexedFaceSet74 = IndexedFaceSet(coordIndex=[0,1,2,3,-1], solid=False,         Coordinate75 = Coordinate(point=[1,1,0,1,-1,0,-1,-1,0,-1,1,0])), 
       Appearance76 = Appearance(        Material77 = Material(transparency=1))))), 
    Transform78 = Transform(scale=[0.4,0.4,0.4], translation=[3.5,2.5,0],      TouchSensor79 = TouchSensor(DEF="NextTextClickedSensor", description="Select to see next strategy"), 
     ROUTE80 = ROUTE(fromField="isActive", fromNode="NextTextClickedSensor", toField="selectNextCard", toNode="TextScript"), 
     Shape81 = Shape(      Text82 = Text(string=["next"],        FontStyle83 = FontStyle(USE="MessageFont")), 
      Appearance84 = Appearance(USE="InterfaceAppearance")), 
     Transform85 = Transform(scale=[1.2,0.6,1],       Shape86 = Shape(USE="TransparentClickSurface"))), 
    Transform87 = Transform(scale=[0.4,0.4,0.4], translation=[-3.3,-0.5,0],      TouchSensor88 = TouchSensor(USE="RandomTextClickedSensor"), 
     ROUTE89 = ROUTE(fromField="isActive", fromNode="RandomTextClickedSensor", toField="selectRandomCard", toNode="TextScript"), 
     Shape90 = Shape(      Text91 = Text(string=["random"],        FontStyle92 = FontStyle(USE="MessageFont")), 
      Appearance93 = Appearance(USE="InterfaceAppearance")), 
     Transform94 = Transform(scale=[1.8,0.6,1],       Shape95 = Shape(USE="TransparentClickSurface"))), 
    Transform96 = Transform(scale=[0.4,0.4,0.4], translation=[3.3,-0.5,0],      Anchor97 = Anchor(DEF="TextToSpeechAnchor", description="text to speech in browser", parameter=["target=_blank"], url=["http://translate.google.com/translate_tts?tl=en&q=Overtly%20resist%20change"],       ROUTE98 = ROUTE(fromField="textToSpeechUrl", fromNode="TextScript", toField="url", toNode="TextToSpeechAnchor"), 
      Shape99 = Shape(       Text100 = Text(string=["speech"],         FontStyle101 = FontStyle(USE="MessageFont")), 
       Appearance102 = Appearance(USE="InterfaceAppearance")), 
      Transform103 = Transform(scale=[1.8,0.6,1],        Shape104 = Shape(USE="TransparentClickSurface"))))))