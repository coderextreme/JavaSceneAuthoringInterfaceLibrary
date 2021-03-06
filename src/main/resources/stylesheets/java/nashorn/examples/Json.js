load('classpath:nashorn/node/X3Dautoclass.js');
var ConfigurationProperties = Packages.org.web3d.x3d.jsail.ConfigurationProperties;
ConfigurationProperties.showDefaultAttributes = false;
ConfigurationProperties.xsltEngine = ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA;
ConfigurationProperties.deleteIntermediateFiles = false;
ConfigurationProperties.setStripTrailingZeroes(true);

    var X3DJSONLD = Java.type("net.coderextreme.X3DJSONLD")
    var loader = new X3DJSONLD();
    var File = Java.type("java.io.File")
    var jsobj = loader.readJsonFile(new File("./examples/HelloWorldProgramOutput.json"));
    var document = loader.loadJsonIntoDocument(jsobj);
    print(loader.serializeDOM(loader.getX3DVersion(jsobj), document));
    var X3DLoaderDOM = Java.type("org.web3d.x3d.jsail.X3DLoaderDOM")
    var xmlLoader = new X3DLoaderDOM();
    var X3D0 = xmlLoader.toX3dObjectTree(document);
    X3D0.toFileX3D("./examples/Json.x3d");
    X3D0.toFileJSON("./examples/Json.json");
