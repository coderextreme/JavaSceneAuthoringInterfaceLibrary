Install JSweet.

Download and install Eclipse.
Go to the Eclipse Repository Perspective (Upper right corner, icon with +).  Select Git.  You may have to install Git in your Eclipse. IDK.

Clone a Git Repository.

URI: https://github.com/coderextreme/JavaSceneAuthoringInterfaceLibrary

Type in GitHub user and password and press next.

Make sure the master branch is checked, then hit next.  Change the Directory: to C:\git\X3DJSAIL, unless you have long file paths set in your OS.  Check "Import all existing Eclipse projects after clone finishes", then press Finish.

Go to Java Perspective (upper right corner, icon with J).

You're all set.  If you want to rebuild, try this:

Right-click on project and do Run As .. Maven clean
Right-click on project and do Run As .. Maven install

Right click on project in project explorer and select Refresh.

Select the folder src/main/java and press CTRL-SHIFT-O for Organize Imports. (For JSweet).

Right-click on project and do Run As .. Maven install

[ More later once we run a successful JSweet build ]
