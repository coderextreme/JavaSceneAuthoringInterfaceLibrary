load('classpath:nashorn/jvm-npm.js');
load('classpath:nashorn/repeatPolyfill.js');
var xmldom = require('nashorn/node_modules/xmldom');
var DOMParser = xmldom.DOMParser;
var XMLSerializer = new xmldom.XMLSerializer();
var DOMImplementation = new xmldom.DOMImplementation();
var json = { "X3D": {
    "encoding":"UTF-8",
    "@profile":"Immersive",
    "@version":"3.3",
    "@xsd:noNamespaceSchemaLocation":"http://www.web3d.org/specifications/x3d-3.3.xsd",
    "JSON schema":"http://www.web3d.org/specifications/x3d-3.3-JSONSchema.json",
    "head": {
        "-children":[
          {
            "#comment":"comment #1"
          },
          {
            "#comment":"comment #2"
          },
          {
            "#comment":"comment #3"
          },
          {
            "#comment":"comment #4"
          }
        ],
        "component": [
          {
            "@name":"Navigation",
            "@level":3
          },
          {
            "@name":"Layering",
            "@level":1
          }
        ],
        "unit": [
          {
            "@name":"AngleUnitConversion",
            "@category":"angle",
            "@conversionFactor":1.0
          },
          {
            "@name":"LengthUnitConversion",
            "@category":"length",
            "@conversionFactor":1.0
          }
        ],
        "meta": [
          {
            "@name":"title",
            "@content":"HelloWorldProgramOutput.x3d"
          },
          {
            "@name":"description",
            "@content":"Example HelloWorldProgram creates an X3D model using the X3D Java Scene Access Interface (SAI) Library"
          },
          {
            "@name":"reference",
            "@content":"http://www.web3d.org/specifications/java/X3DJSAIL.html"
          },
          {
            "@name":"generator",
            "@content":"HelloWorldProgramOutput.java"
          },
          {
            "@name":"created",
            "@content":"6 September 2016"
          },
          {
            "@name":"modified",
            "@content":"20 July 2018"
          },
          {
            "@name":"generator",
            "@content":"X3D Java Scene Access Interface Library (X3DJSAIL)"
          },
          {
            "@name":"generator",
            "@content":"http://www.web3d.org/specifications/java/examples/HelloWorldProgram.java"
          },
          {
            "@name":"generator",
            "@content":"Netbeans http://www.netbeans.org"
          },
          {
            "@name":"creator",
            "@content":"Don Brutzman"
          },
          {
            "@name":"reference",
            "@content":"https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/java/examples/HelloWorldProgramOutput.x3d"
          },
          {
            "@name":"reference",
            "@content":"Console output, ClassicVRML encoding, VRML97 encoding and pretty-print documentation:"
          },
          {
            "@name":"reference",
            "@content":"HelloWorldProgramOutput.txt"
          },
          {
            "@name":"reference",
            "@content":"HelloWorldProgramOutput.x3dv"
          },
          {
            "@name":"reference",
            "@content":"HelloWorldProgramOutput.wrl"
          },
          {
            "@name":"reference",
            "@content":"HelloWorldProgramOutput.html"
          },
          {
            "@name":"X3dValidator",
            "@content":"https://savage.nps.edu/X3dValidator?url=http://www.web3d.org/specifications/java/examples/HelloWorldProgramOutput.x3d"
          },
          {
            "@name":"identifier",
            "@content":"http://www.web3d.org/specifications/java/examples/HelloWorldProgramOutput.x3d"
          },
          {
            "@name":"license",
            "@content":"../license.html"
          },
          {
            "@name":"SpecialTest",
            "@content":"tested sat: name value cannot contain embedded space character"
          },
          {
            "@name":"translated",
            "@content":"20 July 2018"
          },
          {
            "@name":"generator",
            "@content":"X3dToJson.xslt, http://www.web3d.org/x3d/stylesheets/X3dToJson.html"
          },
          {
            "@name":"reference",
            "@content":"X3D JSON encoding: http://www.web3d.org/wiki/index.php/X3D_JSON_Encoding"
          }
        ]
    },
    "Scene": {
        "-children":[
          { "ViewpointGroup":
            {
              "@description":"Available viewpoints",
              "-children":[
                { "Viewpoint":
                  {
                    "@DEF":"DefaultView",
                    "@description":"Hello X3DJSAIL"
                  }
                },
                { "Viewpoint":
                  {
                    "@DEF":"TopDownView",
                    "@description":"top-down view from above",
                    "@orientation":[1,0,0,-1.570796],
                    "@position":[0,100,0]
                  }
                }
              ]
            }
          },
          { "WorldInfo":
            {
              "@DEF":"WorldInfoDEF",
              "@title":"HelloWorldProgram produced by X3D Java SAI Library (X3DJSAIL)"
            }
          },
          { "WorldInfo":
            {
              "@USE":"WorldInfoDEF"
            }
          },
          { "WorldInfo":
            {
              "@USE":"WorldInfoDEF"
            }
          },
          { "MetadataString":
            {
              "@name":"test",
              "@DEF":"scene.addChildMetadata",
              "@value":["Top-level root Metadata node beneath Scene needs to be one of '-children' in JSON encoding"]
            }
          },
          { "LayerSet":
            {
              "@DEF":"scene.addChildLayerSetTest"
            }
          },
          { "Transform":
            {
              "@DEF":"LogoGeometryTransform",
              "@translation":[0,1.5,0],
              "-children":[
                { "Anchor":
                  {
                    "@description":"select for X3D Java SAI Library (X3DJSAIL) description",
                    "@url":["../X3DJSAIL.html","http://www.web3d.org/specifications/java/X3DJSAIL.html"],
                    "-children":[
                      { "Shape":
                        {
                          "@DEF":"BoxShape",
                          "-appearance":
                            { "Appearance":
                              {
                                "-material":
                                  { "Material":
                                    {
                                      "@DEF":"GreenMaterial",
                                      "@diffuseColor":[0,1,1],
                                      "@emissiveColor":[0.8,0,0],
                                      "@transparency":0.1
                                    }
                                  },
                                "-texture":
                                  { "ImageTexture":
                                    {
                                      "@url":["images/X3dJavaSceneAccessInterfaceSaiLibrary.png","http://www.web3d.org/specifications/java/examples/images/X3dJavaSceneAccessInterfaceSaiLibrary.png"]
                                    }
                                  }
                              }
                            },
                          "-geometry":
                            { "Box":
                              {
                                "@DEF":"test-NMTOKEN_regex.0123456789",
                                "@class":"untextured"
                              }
                            }
                        }
                      }
                    ]
                  }
                }
              ]
            }
          },
          { "Shape":
            {
              "@DEF":"LineShape",
              "-appearance":
                { "Appearance":
                  {
                    "-material":
                      { "Material":
                        {
                          "@emissiveColor":[0.6,0.19607843,0.8]
                        }
                      }
                  }
                },
              "-geometry":
                { "IndexedLineSet":
                  {
                    "@coordIndex":[0,1,2,3,4,0],
                    "-children":[
                      {
                        "#comment":"Coordinate 3-tuple point count: 6"
                      }
                    ],
                    "-coord":
                      { "Coordinate":
                        {
                          "@point":[0,1.5,0,2,1.5,0,2,1.5,-2,-2,1.5,-2,-2,1.5,0,0,1.5,0]
                        }
                      }
                  }
                }
            }
          },
          { "PositionInterpolator":
            {
              "@DEF":"BoxPathAnimator",
              "@key":[0,0.125,0.375,0.625,0.875,1],
              "@keyValue":[0,1.5,0,2,1.5,0,2,1.5,-2,-2,1.5,-2,-2,1.5,0,0,1.5,0]
            }
          },
          { "TimeSensor":
            {
              "@DEF":"OrbitClock",
              "@cycleInterval":8.0,
              "@loop":true
            }
          },
          { "ROUTE":
            {
              "@fromField":"fraction_changed",
              "@fromNode":"OrbitClock",
              "@toField":"set_fraction",
              "@toNode":"BoxPathAnimator"
            }
          },
          { "ROUTE":
            {
              "@fromField":"value_changed",
              "@fromNode":"BoxPathAnimator",
              "@toField":"set_translation",
              "@toNode":"LogoGeometryTransform"
            }
          },
          { "Transform":
            {
              "@DEF":"TextTransform",
              "@translation":[0,-1.5,0],
              "-children":[
                { "Shape":
                  {
                    "-appearance":
                      { "Appearance":
                        {
                          "-material":
                            { "Material":
                              {
                                "@USE":"GreenMaterial"
                              }
                            }
                        }
                      },
                    "-geometry":
                      { "Text":
                        {
                          "@string":["X3D Java","SAI Library","X3DJSAIL"],
                          "-children":[
                            {
                              "#comment":"Comment example A, plain quotation marks: He said, \"Immel did it!\""
                            },
                            {
                              "#comment":"Comment example B, XML character entities: He said, &quot;Immel did it!&quot;"
                            }
                          ],
                          "-metadata":
                            { "MetadataSet":
                              {
                                "@name":"EscapedQuotationMarksMetadataSet",
                                "-value":[
                                  { "MetadataString":
                                    {
                                      "@name":"quotesTestC",
                                      "@value":["MFString example C, backslash-escaped quotes: He said, \"Immel did it!\""]
                                    }
                                  },
                                  { "MetadataString":
                                    {
                                      "@name":"extraChildTest",
                                      "@value":["checks MetadataSetObject addValue() method"]
                                    }
                                  }
                                ]
                              }
                            },
                          "-fontStyle":
                            { "FontStyle":
                              {
                                "@justify":["MIDDLE","MIDDLE"]
                              }
                            }
                        }
                      }
                  }
                },
                { "Collision":
                  {
                    "-children":[
                      {
                        "#comment":"test containerField='proxy'"
                      }
                    ],
                    "-proxy":
                      { "Shape":
                        {
                          "@DEF":"ProxyShape",
                          "-children":[
                            {
                              "#comment":"alternative XML encoding: Text string='\"One, Two, Comment\" \"\" \"He said, \\&quot;Immel did it!\\&quot;\"'"
                            },
                            {
                              "#comment":"alternative XML encoding: Text string='\"One, Two, Comment\" \"\" \"He said, \\&quot;Immel did it!\\&quot;\" \"\"'"
                            },
                            {
                              "#comment":"alternative Java source: .setString(new String [] {\"One, Two, Comment\", \"\", \"He said, \\\"\"Immel did it!\\\"\"\"})"
                            },
                            {
                              "#comment":"reference: http://www.web3d.org/x3d/content/examples/Basic/X3dSpecifications/StringArrayEncodingExamplesIndex.html"
                            }
                          ],
                          "-geometry":
                            { "Text":
                              {
                                "@string":["One, Two, Text","","He said, \"Immel did it!\" \"\""]
                              }
                            }
                        }
                      }
                  }
                },
                {
                  "#comment":"It's a beautiful world"
                },
                {
                  "#comment":"... for you!"
                },
                {
                  "#comment":"https://en.wikipedia.org/wiki/Beautiful_World_(Devo_song)"
                }
              ]
            }
          },
          {
            "#comment":"repeatedly spin 180 degrees as a readable special effect"
          },
          { "OrientationInterpolator":
            {
              "@DEF":"SpinInterpolator",
              "@key":[0,0.5,1],
              "@keyValue":[0,1,0,4.712389,0,1,0,0,0,1,0,1.5707964]
            }
          },
          { "TimeSensor":
            {
              "@DEF":"SpinClock",
              "@cycleInterval":5.0,
              "@loop":true
            }
          },
          { "ROUTE":
            {
              "@fromField":"fraction_changed",
              "@fromNode":"SpinClock",
              "@toField":"set_fraction",
              "@toNode":"SpinInterpolator"
            }
          },
          { "ROUTE":
            {
              "@fromField":"value_changed",
              "@fromNode":"SpinInterpolator",
              "@toField":"rotation",
              "@toNode":"TextTransform"
            }
          },
          { "Group":
            {
              "@DEF":"BackgroundGroup",
              "-children":[
                { "Background":
                  {
                    "@DEF":"GradualBackground"
                  }
                },
                { "Script":
                  {
                    "@DEF":"colorTypeConversionScript",
                    "field": [
                      {
                        "@name":"colorInput",
                        "@accessType":"inputOnly",
                        "@type":"SFColor"
                      },
                      {
                        "@name":"colorsOutput",
                        "@accessType":"outputOnly",
                        "@type":"MFColor"
                      }
                    ],
                    "#sourceText":[
"",
"",
"ecmascript:",
"",
"function colorInput (eventValue) // Example source code",
"{",
"   colorsOutput = new MFColor(eventValue); // assigning value sends output event",
"// Browser.print('colorInput=' + eventValue + ', colorsOutput=' + colorsOutput + '\n');",
"}",
"",
""
]
                  }
                },
                { "ColorInterpolator":
                  {
                    "@DEF":"ColorAnimator",
                    "@key":[0,0.5,1],
                    "@keyValue":[0.9411765,1,1,0.29411766,0,0.50980395,0.9411765,1,1],
                    "-children":[
                      {
                        "#comment":"AZURE to INDIGO and back again"
                      }
                    ]
                  }
                },
                { "TimeSensor":
                  {
                    "@DEF":"ColorClock",
                    "@cycleInterval":60.0,
                    "@loop":true
                  }
                },
                { "ROUTE":
                  {
                    "@fromField":"colorsOutput",
                    "@fromNode":"colorTypeConversionScript",
                    "@toField":"skyColor",
                    "@toNode":"GradualBackground"
                  }
                },
                { "ROUTE":
                  {
                    "@fromField":"value_changed",
                    "@fromNode":"ColorAnimator",
                    "@toField":"colorInput",
                    "@toNode":"colorTypeConversionScript"
                  }
                },
                { "ROUTE":
                  {
                    "@fromField":"fraction_changed",
                    "@fromNode":"ColorClock",
                    "@toField":"set_fraction",
                    "@toNode":"ColorAnimator"
                  }
                }
              ]
            }
          },
          { "ProtoDeclare":
            {
              "@name":"ArtDeco01Material",
              "@appinfo":"tooltip: ArtDeco01Material prototype is a Material node",
              "ProtoInterface": {
                  "field": [
                    {
                      "@name":"description",
                      "@accessType":"inputOutput",
                      "@appinfo":"tooltip for descriptionField",
                      "@type":"SFString",
                      "@value":"ArtDeco01Material prototype is a Material node"
                    },
                    {
                      "@name":"enabled",
                      "@accessType":"inputOutput",
                      "@type":"SFBool",
                      "@value":true
                    }
                  ]
              },
              "ProtoBody": {
                  "-children":[
                    {
                      "#comment":"Initial node of ProtoBody determines prototype node type"
                    },
                    { "Material":
                      {
                        "@ambientIntensity":0.25,
                        "@diffuseColor":[0.282435,0.085159,0.134462],
                        "@shininess":0.127273,
                        "@specularColor":[0.276305,0.11431,0.139857]
                      }
                    },
                    {
                      "#comment":"[HelloWorldProgram diagnostic] should be connected to scene graph: ArtDeco01ProtoDeclare.getNodeType()=\"Material\""
                    },
                    {
                      "#comment":"presence of follow-on TouchSensor shows that additional nodes are allowed in ProtoBody after initial node, regardless of node types"
                    },
                    { "TouchSensor":
                      {
                        "@description":"within ProtoBody",
                        "IS": {
                            "connect": [
                              {
                                "@nodeField":"description",
                                "@protoField":"description"
                              },
                              {
                                "@nodeField":"enabled",
                                "@protoField":"enabled"
                              }
                            ]
                        }
                      }
                    }
                  ]
              }
            }
          },
          { "ExternProtoDeclare":
            {
              "@name":"ArtDeco02Material",
              "@appinfo":"this is a different Material node",
              "@url":["http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco02Material","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3dv#ArtDeco02Material"],
              "-children":[
                {
                  "#comment":"[HelloWorldProgram diagnostic] ArtDeco02ExternProtoDeclare.getNodeType()=\"ERROR_UNKNOWN_EXTERNPROTODECLARE_NODE_TYPE: ExternProtoDeclare name='ArtDeco02Material' type cannot be remotely accessed at run time, TODO X3DJSAIL needs to add further capability.\""
                }
              ],
              "field": [
                {
                  "@name":"description",
                  "@accessType":"inputOutput",
                  "@appinfo":"tooltip for descriptionField",
                  "@type":"SFString"
                }
              ]
            }
          },
          {
            "#comment":"Tested ArtDeco01ProtoInstance, ArtDeco02ProtoInstance for improper node type when ProtoInstance is added in wrong place"
          },
          { "Shape":
            {
              "@DEF":"TestShape1",
              "-appearance":
                { "Appearance":
                  {
                    "@DEF":"TestAppearance1",
                    "-children":[
                      {
                        "#comment":"ArtDeco01Material prototype goes here... TODO ensure setContainerField is handled in exported Java"
                      }
                    ],
                    "-material":
                      { "ProtoInstance":
                        {
                          "@name":"ArtDeco01Material",
                          "-children":[
                            {
                              "#comment":"[HelloWorldProgram diagnostic] ArtDeco01ProtoInstance.getNodeType()=\"Material\""
                            }
                          ],
                          "fieldValue": [
                            {
                              "@name":"description",
                              "@value":"ArtDeco01Material can substitute for a Material node"
                            }
                          ]
                        }
                      }
                  }
                },
              "-geometry":
                { "Sphere":
                  {
                    "@radius":0.001
                  }
                }
            }
          },
          { "Shape":
            {
              "@DEF":"TestShape2",
              "-appearance":
                { "Appearance":
                  {
                    "@DEF":"TestAppearance2",
                    "-children":[
                      {
                        "#comment":"ArtDeco02Material prototype goes here... TODO ensure setContainerField is handled in exported Java"
                      }
                    ],
                    "-material":
                      { "ProtoInstance":
                        {
                          "@name":"ArtDeco02Material",
                          "@DEF":"ArtDeco02MaterialDEF",
                          "-children":[
                            {
                              "#comment":"[HelloWorldProgram diagnostic] ArtDeco02ProtoInstance.getNodeType()=\"ERROR_UNKNOWN_EXTERNPROTODECLARE_NODE_TYPE: ExternProtoDeclare name='ArtDeco02Material' type cannot be remotely accessed at run time, TODO X3DJSAIL needs to add further capability.\""
                            }
                          ],
                          "fieldValue": [
                            {
                              "@name":"description",
                              "@value":"ArtDeco02Material can substitute for another Material node"
                            }
                          ]
                        }
                      }
                  }
                },
              "-geometry":
                { "Cone":
                  {
                    "@bottomRadius":0.001,
                    "@height":0.001
                  }
                }
            }
          },
          { "Shape":
            {
              "@DEF":"TestShape3",
              "-appearance":
                { "Appearance":
                  {
                    "@DEF":"TestAppearance3",
                    "-children":[
                      {
                        "#comment":"ArtDeco02Material ProtoInstance USE goes here..."
                      }
                    ],
                    "-material":
                      { "ProtoInstance":
                        {
                          "@USE":"ArtDeco02MaterialDEF"
                        }
                      }
                  }
                },
              "-geometry":
                { "Cylinder":
                  {
                    "@height":0.001,
                    "@radius":0.001
                  }
                }
            }
          },
          { "Inline":
            {
              "@DEF":"inlineSceneDef",
              "@url":["someOtherScene.x3d"]
            }
          },
          { "IMPORT":
            {
              "@AS":"WorldInfoDEF2",
              "@importedDEF":"WorldInfoDEF",
              "@inlineDEF":"inlineSceneDef"
            }
          },
          { "EXPORT":
            {
              "@AS":"WorldInfoDEF3",
              "@localDEF":"WorldInfoDEF"
            }
          },
          { "ProtoDeclare":
            {
              "@name":"MaterialModulator",
              "@appinfo":"mimic a Material node and modulate fields as an animation effect",
              "@documentation":"http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorIndex.html",
              "ProtoInterface": {
                  "field": [
                    {
                      "@name":"enabled",
                      "@accessType":"inputOutput",
                      "@type":"SFBool",
                      "@value":true
                    },
                    {
                      "@name":"diffuseColor",
                      "@accessType":"inputOutput",
                      "@type":"SFColor",
                      "@value":[0,0,0]
                    },
                    {
                      "@name":"emissiveColor",
                      "@accessType":"inputOutput",
                      "@type":"SFColor",
                      "@value":[0.05,0.05,0.5]
                    },
                    {
                      "@name":"specularColor",
                      "@accessType":"inputOutput",
                      "@type":"SFColor",
                      "@value":[0,0,0]
                    },
                    {
                      "@name":"transparency",
                      "@accessType":"inputOutput",
                      "@type":"SFFloat",
                      "@value":0.0
                    },
                    {
                      "@name":"shininess",
                      "@accessType":"inputOutput",
                      "@type":"SFFloat",
                      "@value":0.0
                    },
                    {
                      "@name":"ambientIntensity",
                      "@accessType":"inputOutput",
                      "@type":"SFFloat",
                      "@value":0.0
                    }
                  ]
              },
              "ProtoBody": {
                  "-children":[
                    { "Material":
                      {
                        "@DEF":"MaterialNode",
                        "IS": {
                            "connect": [
                              {
                                "@nodeField":"diffuseColor",
                                "@protoField":"diffuseColor"
                              },
                              {
                                "@nodeField":"emissiveColor",
                                "@protoField":"emissiveColor"
                              },
                              {
                                "@nodeField":"specularColor",
                                "@protoField":"specularColor"
                              },
                              {
                                "@nodeField":"transparency",
                                "@protoField":"transparency"
                              },
                              {
                                "@nodeField":"shininess",
                                "@protoField":"shininess"
                              },
                              {
                                "@nodeField":"ambientIntensity",
                                "@protoField":"ambientIntensity"
                              }
                            ]
                        }
                      }
                    },
                    {
                      "#comment":"Only first node (the node type) is renderable, others are along for the ride"
                    },
                    { "Script":
                      {
                        "@DEF":"MaterialModulatorScript",
                        "field": [
                          {
                            "@name":"enabled",
                            "@accessType":"inputOutput",
                            "@type":"SFBool"
                          },
                          {
                            "@name":"diffuseColor",
                            "@accessType":"inputOutput",
                            "@type":"SFColor"
                          },
                          {
                            "@name":"newColor",
                            "@accessType":"outputOnly",
                            "@type":"SFColor"
                          },
                          {
                            "@name":"clockTrigger",
                            "@accessType":"inputOnly",
                            "@type":"SFTime"
                          }
                        ],
                        "IS": {
                            "connect": [
                              {
                                "@nodeField":"enabled",
                                "@protoField":"enabled"
                              },
                              {
                                "@nodeField":"diffuseColor",
                                "@protoField":"diffuseColor"
                              }
                            ]
                        },
                        "#sourceText":[
"",
"",
"ecmascript:",
"function initialize ()",
"{",
"    newColor = diffuseColor; // start with correct color",
"}",
"function set_enabled (newValue)",
"{",
"\tenabled = newValue;",
"}",
"function clockTrigger (timeValue)",
"{",
"    if (!enabled) return;",
"    red   = newColor.r;",
"    green = newColor.g;",
"    blue  = newColor.b;",
"",
"    // note different modulation rates for each color component, % is modulus operator",
"    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);",
"\tif (enabled)",
"\t{",
"\t\tBrowser.print ('diffuseColor=(' + red + ',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\n');",
"\t}",
"}",
"",
""
]
                      }
                    }
                  ]
              }
            }
          },
          {
            "#comment":"Test success: declarative statement createDeclarativeShapeTests()"
          },
          { "Group":
            {
              "@DEF":"DeclarativeGroupExample",
              "-children":[
                { "Shape":
                  {
                    "-metadata":
                      { "MetadataString":
                        {
                          "@name":"findThisNameValue",
                          "@DEF":"FindableMetadataStringTest",
                          "@value":["test case"]
                        }
                      },
                    "-appearance":
                      { "Appearance":
                        {
                          "@DEF":"DeclarativeAppearanceExample",
                          "-children":[
                            {
                              "#comment":"DeclarativeMaterialExample gets overridden by subsequently added MaterialModulator ProtoInstance"
                            }
                          ],
                          "-material":
                            { "ProtoInstance":
                              {
                                "@name":"MaterialModulator",
                                "@DEF":"MyMaterialModulator"
                              }
                            }
                        }
                      },
                    "-geometry":
                      { "Cone":
                        {
                          "@bottom":false,
                          "@bottomRadius":0.05,
                          "@height":0.1
                        }
                      }
                  }
                },
                {
                  "#comment":"Test success: declarativeGroup.addChild() singleton pipeline method"
                }
              ]
            }
          },
          {
            "#comment":"Test success: declarative statement addChild()"
          },
          {
            "#comment":"Test success: x3dModel.findNodeByDEF(DeclarativeAppearanceExample) = <Appearance DEF='DeclarativeAppearanceExample'/> i.e. <Appearance DEF='DeclarativeAppearanceExample'> <!- - DeclarativeMaterialExample gets overridden by subsequently added MaterialModulator ProtoInstance - -> <ProtoInstance DEF='MyMaterialModulator' name='MaterialModulator' containerField='material'/> </Appearance>"
          },
          {
            "#comment":"Test success: x3dModel.findElementByNameValue(findThisNameValue) = <MetadataString DEF='FindableMetadataStringTest' name='findThisNameValue' value='\"test case\"'/>"
          },
          {
            "#comment":"Test success: x3dModel.findElementByNameValue(\"ArtDeco01Material\", \"ProtoDeclare\") found"
          },
          {
            "#comment":"Test success: x3dModel.findElementByNameValue(\"MaterialModulator\", \"ProtoDeclare\") found"
          },
          {
            "#comment":"Test success: x3dModel.findElementByNameValue(\"MaterialModulator\", \"ProtoInstance\") found"
          },
          { "Group":
            {
              "@DEF":"TestFieldObjectsGroup",
              "-children":[
                {
                  "#comment":"testFieldObjects() results"
                },
                {
                  "#comment":"SFBool default=true, true=true, false=false, negate()=true"
                },
                {
                  "#comment":"MFBool default=, initial=true false true, negate()=false true false"
                },
                {
                  "#comment":"SFFloat default=0.0, initial=1.0, setValue(2)=2.0, setValue(3.0f)=3.0, setValue(4.0)=4.0"
                },
                {
                  "#comment":"MFFloat default=, initial=1 2 3, append(5)=1 2 3 5, inserts(3,4)(0,0)=0 1 2 3 4 5, append(6)=0 1 2 3 4 5 6, size()=7"
                },
                {
                  "#comment":"... get1Value[3]=3.0, remove[1]=0 2 3 4 5 6, set1Value(0,10)=10 2 3 4 5 6, multiply(2)=20 4 6 8 10 12, clear="
                },
                {
                  "#comment":"SFVec3f default=0 0 0, initial=1 2 3, setValue=4 5 6, multiply(2)=8 10 12, normalize()=0.45584232 0.5698029 0.68376344, regex matches()=true"
                },
                {
                  "#comment":"regex test SFVec3f().matches(\"1 2 3\")=true, regex test SFVec3f().matches(\"1 2 3 4\")=false, regex test (SFRotationObject.matches(\"0 0 0 0\")=true, failure detecting illegal (zero axis) rotation value"
                }
              ]
            }
          },
          { "Sound":
            {
              "@location":[0,1.6,0],
              "-children":[
                {
                  "#comment":"set sound-ellipsoid location height at 1.6m to match typical avatar height"
                }
              ],
              "-source":
                { "AudioClip":
                  {
                    "@description":"chimes",
                    "@url":["chimes.wav","http://www.web3d.org/x3d/content/examples/ConformanceNist/Sounds/AudioClip/chimes.wav"],
                    "-children":[
                      {
                        "#comment":"Scene example fragment from http://www.web3d.org/x3d/content/examples/ConformanceNist/Sounds/AudioClip/default.x3d"
                      }
                    ]
                  }
                }
            }
          },
          { "Sound":
            {
              "@location":[0,1.6,0],
              "-children":[
                {
                  "#comment":"set sound-ellipsoid location height at 1.6m to match typical avatar height"
                }
              ],
              "-source":
                { "MovieTexture":
                  {
                    "@description":"mpgsys.mpg from ConformanceNist suite",
                    "@url":["mpgsys.mpg","http://www.web3d.org/x3d/content/examples/ConformanceNist/Appearance/MovieTexture/mpgsys.mpg"],
                    "-children":[
                      {
                        "#comment":"Scene example fragment from http://www.web3d.org/x3d/content/examples/ConformanceNist/Appearance/MovieTexture/mpeg1-systems.x3d"
                      },
                      {
                        "#comment":"Expected containerField='source', allowed containerField values=\"texture\" \"source\" \"back\" \"bottom\" \"front\" \"left\" \"right\" \"top\" \"backTexture\" \"bottomTexture\" \"frontTexture\" \"leftTexture\" \"rightTexture\" \"topTexture\" \"watchList\""
                      }
                    ]
                  }
                }
            }
          },
          {
            "#comment":"Test success: AnchorObject.isNode()=true, siteAnchor.isNode()=true"
          },
          {
            "#comment":"Test success: AnchorObject.isStatement()=false, siteAnchor.isStatement()=false"
          },
          {
            "#comment":"Test success: ROUTEObject.isNode()=false, orbitPositionROUTE.isNode()=false"
          },
          {
            "#comment":"Test success: ROUTEObject.isStatement()=true, orbitPositionROUTE.isStatement()=true"
          },
          {
            "#comment":"Test success: CommentsBlock.isNode()=false, testComments.isNode()=false"
          },
          {
            "#comment":"Test failure: CommentsBlock.isStatement()=true, testComments.isStatement()=true"
          },
          { "Shape":
            {
              "@DEF":"ExtrusionShape",
              "-children":[
                {
                  "#comment":"ExampleExtrusion isCrossSectionClosed()=true, crossSection='[1.0, 1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0, 1.0]'"
                },
                {
                  "#comment":"ExampleExtrusion isSpineClosed()=false, spine='[0.0, 0.0, 0.0, 0.0, 1.0, 0.0]'"
                }
              ],
              "-appearance":
                { "Appearance":
                  {
                    "@DEF":"TransparentAppearance",
                    "-material":
                      { "Material":
                        {
                          "@transparency":1.0
                        }
                      }
                  }
                },
              "-geometry":
                { "Extrusion":
                  {
                    "@DEF":"ExampleExtrusion"
                  }
                }
            }
          }
        ]
    }
  }
}
;
var version = json['X3D']['@version'];
var docType = DOMImplementation.createDocumentType('X3D', 'ISO//Web3D//DTD X3D '+version+'//EN', 'http://www.web3d.org/specifications/x3d-'+version+'.dtd', null);
var document = DOMImplementation.createDocument(null, 'X3D', docType);
var mapToMethod = require('nashorn/node/mapToMethod.js');
var mapToMethod2 = require('nashorn/node/mapToMethod2.js');
var fieldTypes = require('nashorn/node/fieldTypes.js');
load('classpath:nashorn/node/X3DJSONLD.js');
load('classpath:nashorn/node/JavaScriptSerializer.js');
var child = CreateElement('X3D');
ConvertToX3DOM(json, '', child, 'flipper.json');
print('Returning with', child);
var output = new JavaScriptSerializer().serializeToString(json, child, 'nashorn/examples/HelloWorldProgramOutput.Nashorn.js', mapToMethod, fieldTypes);
var FileWriter = Java.type('java.io.FileWriter');
var fw = new FileWriter('nashorn/examples/HelloWorldProgramOutput.Nashorn.js');
fw.write(output);
fw.close();
