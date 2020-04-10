import x3dpsail


X3D0 = (x3dpsail.X3D().setProfile(x3dpsail.SFString("Immersive")).setVersion(x3dpsail.SFString("3.3"))
      .setHead(x3dpsail.head()
        .addComponent(x3dpsail.component().setName(x3dpsail.SFString("Shaders")).setLevel(x3dpsail.SFInt32(1)))
        .addComponent(x3dpsail.component().setName(x3dpsail.SFString("CubeMapTexturing")).setLevel(x3dpsail.SFInt32(1)))
        .addMeta(x3dpsail.meta().setName(x3dpsail.SFString("title")).setContent(x3dpsail.SFString("flowers4.x3d")))
        .addMeta(x3dpsail.meta().setName(x3dpsail.SFString("creator")).setContent(x3dpsail.SFString("John Carlson")))
        .addMeta(x3dpsail.meta().setName(x3dpsail.SFString("generator")).setContent(x3dpsail.SFString("manual")))
        .addMeta(x3dpsail.meta().setName(x3dpsail.SFString("identifier")).setContent(x3dpsail.SFString("https://coderextreme.net/X3DJSONLD/flowers4.x3d")))
        .addMeta(x3dpsail.meta().setName(x3dpsail.SFString("description")).setContent(x3dpsail.SFString("an animated flower"))))
      .setScene(x3dpsail.Scene()
        .addChild(x3dpsail.NavigationInfo().setType(x3dpsail.MFString(["EXAMINE","ANY"])))
        .addChild(x3dpsail.Background().setBackUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_back.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_back.png"])).setBottomUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_bottom.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_bottom.png"])).setFrontUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_front.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_front.png"])).setLeftUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_left.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_left.png"])).setRightUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_right.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_right.png"])).setTopUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_top.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_top.png"])))
        .addChild(x3dpsail.Transform().setDEF(x3dpsail.SFString("transform"))
          .addChild(x3dpsail.Shape()
            .setAppearance(x3dpsail.Appearance()
              .setMaterial(x3dpsail.Material().setDiffuseColor(x3dpsail.SFColor(.7,.7,.7)).setSpecularColor(x3dpsail.SFColor(.5,.5,.5)))
              .setTexture(x3dpsail.ComposedCubeMapTexture()
                .setBack(x3dpsail.ImageTexture().setUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_back.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_back.png"])))
                .setBottom(x3dpsail.ImageTexture().setUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_bottom.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_bottom.png"])))
                .setFront(x3dpsail.ImageTexture().setUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_front.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_front.png"])))
                .setLeft(x3dpsail.ImageTexture().setUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_left.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_left.png"])))
                .setRight(x3dpsail.ImageTexture().setUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_right.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_right.png"])))
                .setTop(x3dpsail.ImageTexture().setUrl(x3dpsail.MFString(["../resources/images/all_probes/stpeters_cross/stpeters_top.png","https://coderextreme.net/X3DJSONLD/images/all_probes/stpeters_cross/stpeters_top.png"]))))
              .addShaders(x3dpsail.ComposedShader().setDEF(x3dpsail.SFString("shader")).setLanguage(x3dpsail.SFString("GLSL"))
                .addField(x3dpsail.field().setName(x3dpsail.SFString("cube")).setType(x3dpsail.SFString("SFInt32")).setAccessType(x3dpsail.SFString("inputOutput")).setValue(x3dpsail.SFString("0")))
                .addField(x3dpsail.field().setName(x3dpsail.SFString("chromaticDispertion")).setAccessType(x3dpsail.SFString("inputOutput")).setType(x3dpsail.SFString("SFVec3f")).setValue(x3dpsail.SFString("0.98 1.0 1.033")))
                .addField(x3dpsail.field().setName(x3dpsail.SFString("bias")).setType(x3dpsail.SFString("SFFloat")).setAccessType(x3dpsail.SFString("inputOutput")).setValue(x3dpsail.SFString("0.5")))
                .addField(x3dpsail.field().setName(x3dpsail.SFString("scale")).setType(x3dpsail.SFString("SFFloat")).setAccessType(x3dpsail.SFString("inputOutput")).setValue(x3dpsail.SFString("0.5")))
                .addField(x3dpsail.field().setName(x3dpsail.SFString("power")).setType(x3dpsail.SFString("SFFloat")).setAccessType(x3dpsail.SFString("inputOutput")).setValue(x3dpsail.SFString("2")))
                .addParts(x3dpsail.ShaderPart().setUrl(x3dpsail.MFString(["../shaders/x3dom.vs","https://coderextreme.net/X3DJSONLD/shaders/x3dom.vs"])).setType(x3dpsail.SFString("VERTEX")))
                .addParts(x3dpsail.ShaderPart().setUrl(x3dpsail.MFString(["../shaders/pc_bubbles.fs","https://coderextreme.net/X3DJSONLD/shaders/pc_bubbles.fs"])).setType(x3dpsail.SFString("FRAGMENT")))))
            #
#                <Sphere>
#		

            .setGeometry(x3dpsail.IndexedFaceSet().setConvex(x3dpsail.SFBool(False)).setDEF(x3dpsail.SFString("Orbit")).setCreaseAngle(x3dpsail.SFFloat(0))
              .setCoord(x3dpsail.Coordinate().setDEF(x3dpsail.SFString("OrbitCoordinates"))))))
        .addChild(x3dpsail.Script().setDEF(x3dpsail.SFString("OrbitScript"))
          .addField(x3dpsail.field().setAccessType(x3dpsail.SFString("inputOnly")).setName(x3dpsail.SFString("set_fraction")).setType(x3dpsail.SFString("SFFloat")))
          .addField(x3dpsail.field().setAccessType(x3dpsail.SFString("inputOutput")).setName(x3dpsail.SFString("coordinates")).setType(x3dpsail.SFString("MFVec3f")))
          .addField(x3dpsail.field().setAccessType(x3dpsail.SFString("outputOnly")).setName(x3dpsail.SFString("coordIndexes")).setType(x3dpsail.SFString("MFInt32"))).setSourceCode('''\n"+
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
)
        .addChild(x3dpsail.TimeSensor().setDEF(x3dpsail.SFString("Clock")).setCycleInterval(x3dpsail.SFTime(16)).setLoop(x3dpsail.SFBool(True)))
        .addChild(x3dpsail.ROUTE().setFromField(x3dpsail.SFString("coordIndexes")).setFromNode(x3dpsail.SFString("OrbitScript")).setToField(x3dpsail.SFString("set_coordIndex")).setToNode(x3dpsail.SFString("Orbit")))
        .addChild(x3dpsail.ROUTE().setFromField(x3dpsail.SFString("coordinates")).setFromNode(x3dpsail.SFString("OrbitScript")).setToField(x3dpsail.SFString("set_point")).setToNode(x3dpsail.SFString("OrbitCoordinates")))
        .addChild(x3dpsail.ROUTE().setFromField(x3dpsail.SFString("fraction_changed")).setFromNode(x3dpsail.SFString("Clock")).setToField(x3dpsail.SFString("set_fraction")).setToNode(x3dpsail.SFString("OrbitScript")))))

X3D0.toFileX3D("flowers4_RoundTrip.x3d")
