import X3Dpackage


X3D0 = (X3Dpackage.X3D().setProfile("Immersive").setVersion("3.0")
      .setHead(X3Dpackage.head()
        .addMeta(X3Dpackage.meta().setContent("TextExamples.x3d").setName("title"))
        .addMeta(X3Dpackage.meta().setContent("Show different escape-character text examples for embedded quotation marks.").setName("description"))
        .addMeta(X3Dpackage.meta().setContent("Don Brutzman").setName("creator"))
        .addMeta(X3Dpackage.meta().setContent("7 April 2001").setName("created"))
        .addMeta(X3Dpackage.meta().setContent("26 April 2016").setName("modified"))
        .addMeta(X3Dpackage.meta().setContent("Note that X3D Canonicalization (C14N) will scrub alternate XML character representations, be careful to check original encoding into version control.").setName("warning"))
        .addMeta(X3Dpackage.meta().setContent("Usually this source document needs to be inspected and edited using a plain-text editor in order to see the differences in these XML-equivalent text representations.").setName("warning"))
        .addMeta(X3Dpackage.meta().setContent("http://www.web3d.org/x3d/content/examples/Basic/development/TextExamples.x3d").setName("identifier"))
        .addMeta(X3Dpackage.meta().setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit").setName("generator"))
        .addMeta(X3Dpackage.meta().setContent("../license.html").setName("license")))
      .setScene(X3Dpackage.Scene()
        .addChildren(X3Dpackage.Transform().setTranslation([0,2,0])
          .addChildren(X3Dpackage.Shape()
            .setGeometry(X3Dpackage.Text().setString(["Compare special character escaping"])
              .setFontStyle(X3Dpackage.FontStyle(setJustify = ["MIDDLE","MIDDLE"], setSize = 0.8).setDEF("testFontStyle")))
            .setAppearance(X3Dpackage.Appearance().setDEF("LightBlueAppearance")
              .setMaterial(X3Dpackage.Material().setDiffuseColor([0.1,0.7,0.7])))))
        .addChildren(X3Dpackage.Transform().setTranslation([-3,0,0])
          .addChildren(X3Dpackage.Shape()
            .setGeometry(X3Dpackage.Text().setString(["I don't think so","","he said \"Hi\""])
              .setFontStyle(X3Dpackage.FontStyle().setUSE("testFontStyle")))
            .setAppearance(X3Dpackage.Appearance().setUSE("LightBlueAppearance"))))
        .addChildren(X3Dpackage.Transform().setTranslation([3,0,0])
          .addChildren(X3Dpackage.Shape()
            .setGeometry(X3Dpackage.Text().setString(["I don't think so","","he said \"Hi\""])
              .setFontStyle(X3Dpackage.FontStyle().setUSE("testFontStyle")))
            .setAppearance(X3Dpackage.Appearance().setUSE("LightBlueAppearance"))))))
