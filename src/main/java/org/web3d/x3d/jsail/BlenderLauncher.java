/*
Copyright (c) 1995-2017 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (http://www.web3D.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

package org.web3d.x3d.jsail;

import java.awt.Desktop;
import java.io.*;
import java.net.*;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.InvalidFieldValueException;
import org.web3d.x3d.sai.X3DException;

/**
 * Utility class for invoking and launching Blender via local operating system to perform a variety of conversion tasks. Note use of static methods.
 * 
 * <br><br>

 *  @see <a href="https://Blender.org" target="_blank">Blender</a>	
 @see <a href="https://docs.blender.org/api/blender_python_api_current/info_quickstart.html" target="_blank">Blender Quickstart Introduction</a>	
 @see <a href="https://docs.blender.org/manual/en/dev/advanced/scripting/introduction.html" target="_blank">Blender API Introduction</a>	
 @see <a href="https://docs.blender.org/api/blender_python_api_current" target="_blank">Blender Python API Documentation</a>	
 @see <a href="https://docs.blender.org/manual/en/dev/advanced/scripting" target="_blank">Scripting &amp; Extending Blender</a>	
 @see <a href="https://en.wikibooks.org/wiki/Blender_3D:_Noob_to_Pro" target="_blank">Blender 3D: Noob to Pro</a>
 @see <a href="https://en.wikibooks.org/wiki/Blender_3D:_Noob_to_Pro/Advanced_Tutorials/Python_Scripting/Introduction" target="_blank">Blender 3D: Noob to Pro/Advanced Tutorials/Python Scripting/Introduction</a>	
 @see <a href="https://www.youtube.com/watch?v=K0yb4sZ7B4g" target="_blank">Video: Blender Tutorial Introduction to Python Scripting: Writing a Script That Makes a Simple 3D Model</a>
 @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html">Java Tutorials: Understanding (Static) Class Members</a>
 * 
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class BlenderLauncher
{
	
    /** Blender website URL
     * @see #launchBlenderWebPage()
     */     
    public static final String BLENDER_URL = "http://www.blender.org";

    /** Default name of <code>blender</code> executable on local system for command-line blender invocation: <code>blender.exe</code> on Windows, <code>blender</code> otherwise.
     * @see <a href="http://www.blender.org" target="_blank">Blender</a>
     * @see <a href="https://en.wikipedia.org/wiki/Blender_(software)" target="_blank">Wikipedia: Blender (software)</a>
     * @see #checkBlenderPath()
	 * @see #setBlenderPath(String)
     */
	private static final String blenderExecutableName_DEFAULT = "blender";
	 
	/** Actual name of <code>blender</code> executable on local system for command-line Blender invocation: <code>blender.exe</code> on Windows, <code>blender</code> otherwise.
     * @see <a href="http://www.blender.org" target="_blank">Blender</a>
     * @see <a href="https://en.wikipedia.org/wiki/Blender_(software)" target="_blank">Wikipedia: Blender (software)</a>
     * @see #checkBlenderPath()
	 * @see #setBlenderPath(String)
     */
	private static String blenderExecutableName = blenderExecutableName_DEFAULT;
			
	/** Get directory path for location of <code>blender</code> program:  <code>blender.exe</code> on Windows, <code>blender</code> otherwise.
	 * @return name of blender program
     * @see #checkBlenderPath()
	 * @see #setBlenderPath(String)
     */
	public static final String getBlenderExecutableName()
	{
        final String OPERATING_SYSTEM_NAME = System.getProperty("os.name");
                
        if (OPERATING_SYSTEM_NAME.toLowerCase(Locale.ENGLISH).contains("windows"))
        {
            if (blenderExecutableName.equals(blenderExecutableName_DEFAULT))
            {
                blenderExecutableName += ".exe";
            }
        }
		return blenderExecutableName;
	}
	 
	/** Blender path on local system for command-line Blender invocation.
	 * @see <a href="http://www.blender.org" target="_blank">Blender</a>
     * @see <a href="https://en.wikipedia.org/wiki/Blender_(software)" target="_blank">Wikipedia: Blender (software)</a>
	 * @see <a href="https://docs.blender.org/manual/en/latest/advanced/command_line/index.html">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
	 * @see <a href="https://docs.blender.org/manual/en/latest/advanced/scripting/index.html">Blender Manual: Scripting &amp; Extending Blender</a>
	 */
	private static String blenderPath = "";
		
	/** Default Blender path default for Windows 7 or 10 operating system, possibly unneeded if <code>blender</code> is in path already.
	 * <i>Warning:</i> local settings vary, configure path if necessary.
	 * @see #checkBlenderPath()
	 * @see #setBlenderPath(String)
     * @see <a href="../../../../../X3DJSAIL.html#properties" target="_blank">X3DJSAIL documentation: properties</a>
	 * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html#platforms">Blender command line: platforms</a>
	 */		
	public static final String BLENDER_PATH_DEFAULT_WINDOWS = "C:\\Program Files\\Blender Foundation\\Blender 2.82"; // escape \
	
	/** Default Blender path default for macOS operating system, possibly unneeded if <code>blender</code> is in path already.
	 * <i>Warning:</i> local settings vary, configure path if necessary.
	 * @see #checkBlenderPath()
	 * @see #setBlenderPath(String)
     * @see <a href="../../../../../X3DJSAIL.html#properties" target="_blank">X3DJSAIL documentation: properties</a>
	 * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html#platforms">Blender command line: platforms</a>
	 */		
	public static final String BLENDER_PATH_DEFAULT_MACOS = "/Application/blender.app/Contents/MacOS/blender"; // thanks Mike Bailey and Terry Norbraten

	/** Default Blender path default for Linux operating system, possibly unneeded if <code>blender</code> is in path already.
	 * <i>Warning:</i> local settings vary, configure path if necessary.
	 * @see #checkBlenderPath()
	 * @see #setBlenderPath(String)
     * @see <a href="../../../../../X3DJSAIL.html#properties" target="_blank">X3DJSAIL documentation: properties</a>
	 * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html#platforms">Blender command line: platforms</a>
	 */		
	public static final String BLENDER_PATH_DEFAULT_LINUX = "/usr/bin/blender"; // used on modelexchange.nps.edu
				
	/** Get preference for XSLT transformation engine to use: {@link ConfigurationProperties#XSLT_ENGINE_SAXON} or {@link ConfigurationProperties#XSLT_ENGINE_NATIVE_JAVA}.
	 * @return String constant regarding current configuration: XSLT_ENGINE_SAXON (default) or XSLT_ENGINE_NATIVE_JAVA
	 */
	public static final String getBlenderPath()
	{
		return blenderPath;
	}
	/** Set preference for XSLT transformation engine to use: {@link ConfigurationProperties#XSLT_ENGINE_SAXON} or {@link ConfigurationProperties#XSLT_ENGINE_NATIVE_JAVA}.
	 * @param newValue is new value to assign */
	public static final void setBlenderPath(String newValue)
	{
		blenderPath = newValue;
		
		// verify Blender found, throw exception otherwise
		blenderPath = newValue;
        
        if  (blenderPath.endsWith(getBlenderExecutableName())) // strip executable if needed, save path only
        {
             blenderPath = blenderPath.substring(0,blenderPath.lastIndexOf(getBlenderExecutableName()));
        }
        if (!blenderPath.endsWith("\\") && !blenderPath.endsWith(File.separator))
        {
             blenderPath += File.separator;
        }
		// verify meshlabserver found, throw exception otherwise
        File blenderServerFile = new File(blenderPath, getBlenderExecutableName());
		if (!blenderServerFile.exists())
		{
			String errorNotice = "Invalid setBlenderPath(String newValue) invocation, newValue='" + newValue + 
								 "', " + getBlenderExecutableName() + " not found at this location";
//			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
	}
    
	/**
     * Blender python script for converting X3D model into PNG image.
	 */		
	public static final String BLENDER_PYTHON_SCRIPT_X3D_TO_PNG = "BlenderX3dToPng.py";
    
	/**
     * Blender python script for converting STL model into X3D model.
	 */		
	public static final String BLENDER_PYTHON_SCRIPT_STL_TO_X3D = "BlenderStlToX3d.py";

    //  TODO command-line invocation [-BLENDER_PATH | -convert | -import | -toImage]

    private static File BlenderX3dToPngPythonFile;
  	
    /** Initialize this BlenderLauncher instance to default values. */
    public static final void initialize()
    {
        checkBlenderPath();
        initializeConfigurationSwitches();
    }
    /**
     *                               Usage: <code>java [-classpath X3DJSAIL.*.jar] org.web3d.x3d.jsail.BlenderLauncher sourceFile [-convert [resultFile]] [-toImage [snapshotName.*]] [-home | -help | -version | -properties fileName.properties | -BLENDER_PATH directoryPath]</code>
     */
    public  static final String USAGE   = "Usage: java [-classpath X3DJSAIL.*.jar] org.web3d.x3d.jsail.BlenderLauncher sourceFile [-convert [resultFile]] [-toImage [snapshotName.*]] [-home | -help | -version | -properties fileName.properties | -BLENDER_PATH directoryPath]";
    private static final String WARNING = "[Warning] ";
    private static final String ERROR   = "[Error] ";
    
    private static boolean modelConvert     = false;
    private static boolean modelExport      = false; // not used via main invocation
    private static boolean modelImport      = false; // not used via main invocation
				
	private static String  conversionExtension = new String();

	/** Reset configuration switch values */
	private static void initializeConfigurationSwitches()
	{
		modelConvert         = true;  // default choice, switch is optional
		modelExport          = false;
		modelImport          = false;

		conversionExtension  = new String();
	}

    /** 
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
     */
    private static BufferedWriter bufferedWriter;

    /** Default main() method provided for test and debugging purposes, invoking run() method.
     * @param args the command line arguments
     * @see #run(String[])
     * @see X3DObject#handleArguments(String[])
     */
    public static void main(String[] args)
    {
		run(args);
	}

    /** Utility run() method provided for test and debugging purposes, allowing invocation with a single String (rather than a String[] array).
	 * When invoked without parameters then reports results of validate() self-checks to system output.
     * @param singleStringArguments the command line arguments
     * @see #run(String[])
     */    
    public static void run(String singleStringArguments)
    {
		run(singleStringArguments.split("(\\s)")); // split single string into string array
	}

    /** Default run() method provided for test and debugging purposes, first initializing ConfigurationProperties then reading properties file (if any) and processing arguments.
	 * When invoked without parameters then reports results of validate() self-checks to system output.
     * @param args the command line arguments
     * @see #main(String[])
     * @see ConfigurationProperties
     * @see X3DObject#handleArguments(String[])
     */
    public static void run(String[] args)
    {
        File    sourceFile;
        long    sourceFileLength     = 0;
        String  sourceFileName       = "";
        String  sourceFileNameRoot   = "";
		File    resultFile;
        boolean convertToFile        = false;
        boolean createImageSnapshot  = false;
        boolean loadProperties       = false;
        boolean resetPath            = false;
        String  resultFileName       = "";
        String  resultFileNameRoot   = "";
        String propertiesFileName    = "";
        String propertiesFileNameRoot= "";
        DecimalFormat formatPrecision2 = new DecimalFormat ("#0.00");
		String  compressionRatio;
				 
		initializeConfigurationSwitches ();

		if ((args== null) || (args.length < 1))
		{
			System.out.println (USAGE);
			return;
		}
		else
		{
			for (int i=0; i<=args.length-1; i++)
			{
                args[i] = args[i].trim(); // eliminate excess whitespace, if called programmatically
				if  (!args[i].startsWith("-"))
				{
					if (modelConvert && !sourceFileName.isEmpty() && !resultFileName.isEmpty())
					{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.BlenderLauncher] too many file names found, source=\"" + sourceFileName + "\" and result \"" + resultFileName + "\" prior to argument \"" + args[i] + "\". Check usage:");
						System.out.println(USAGE);
						return;
					}
//					else if ((modelExport || modelImport) && !sourceFileName.isEmpty())
//					{
//						System.out.println(ERROR+" [org.web3d.x3d.jsail.BlenderLauncher] too many source file names found, source=\"" + sourceFileName + "\" prior to argument \"" + args[i] + "\". Check usage:");
//						System.out.println(USAGE);
//						return;
//					}
					else if (modelConvert && !sourceFileName.isEmpty()) // now have encountered resultFile value, overwrite default
					{
						resultFileName     = args[i];
						resultFileNameRoot = resultFileName;
						if (resultFileNameRoot.contains("."))
							resultFileNameRoot = resultFileName.substring(0,resultFileNameRoot.lastIndexOf("."));
						resultFile = new File(resultFileName);
                        conversionExtension = resultFileName.substring(resultFileName.lastIndexOf("."));
                        if (conversionExtension.isEmpty())
						{
							System.out.println(ERROR+" [org.web3d.x3d.jsail.BlenderLauncher] result file extension is needed for conversion but not found: " + resultFileName);
							System.out.println(USAGE);
							return;
						}
					}
					else 
					{
						sourceFileName     = args[i];
						sourceFileNameRoot = sourceFileName;
						if (sourceFileNameRoot.contains("."))
							sourceFileNameRoot = sourceFileName.substring(0,sourceFileName.lastIndexOf("."));
						sourceFile = new File(sourceFileName);
                        
						if (!sourceFile.exists())
						{
							System.out.println(ERROR+" [org.web3d.x3d.jsail.BlenderLauncher] file not found: " + sourceFileName);
							return;
						}
						else
						{
							sourceFileLength = sourceFile.length();
							System.out.println ("BlenderLauncher parameter: source file " + sourceFile.getName() + " filesize " + sourceFileLength + " bytes");
						}
					}
				}
				else if (args[i].equalsIgnoreCase("-properties") || args[i].equalsIgnoreCase("-propertiesFile")) // optionally followed by propertiesFileName
				{
					if ((args.length > i + 1) && !(args[i+1] == null) && !args[i+1].isEmpty() && !args[i+1].startsWith("-"))
					{
						 propertiesFileName     = args[i+1];
						 propertiesFileNameRoot = propertiesFileName.substring(0,propertiesFileName.lastIndexOf("."));
						 System.out.println ("BlenderLauncher parameter: \"" + args[i] + "\" \"" + args[i+1] + "\" for properties file name root " + propertiesFileNameRoot);
						 i++; // increment index, carefully!
					}
					else System.out.println ("BlenderLauncher parameter: \"" + args[i] + "\" for properties file name root "+ propertiesFileNameRoot);
					loadProperties = true; // set flag
				}
				else if (args[i].equalsIgnoreCase("-BLENDER_PATH") || args[i].equalsIgnoreCase("-BLENDERPATH"))
				{
					if ((args.length > i + 1) && !(args[i+1] == null) && !args[i+1].isEmpty() && !args[i+1].startsWith("-"))
					{
                        String newPath = args[i + 1];
                        System.out.println ("parameters: \"" + args[i] + "\" \"" + newPath + "\" for setting Blender path");
                        setBlenderPath(newPath);
                        checkBlenderPath();
                    	i++; // increment index, carefully!
					}
					else System.out.println ("Error: parameter: \"" + args[i] + "\" missing new Blender path value");
                    resetPath = true; // set flag
				}
				else if (args[i].equalsIgnoreCase("-toImage") || args[i].equalsIgnoreCase("-screenshot"))
				{
                    initializeConfigurationSwitches();
					createImageSnapshot = true;
					System.out.println ("BlenderLauncher parameter: \"" + args[i] + "\" for creating screenshot image of default viewpoint");
				}
				else if (args[i].equalsIgnoreCase("-convert"))
				{
                    initializeConfigurationSwitches();
					modelConvert = true;
					System.out.println ("BlenderLauncher parameter: \"" + args[i] + "\" for conversion between formats");
				}
//				else if (args[i].equalsIgnoreCase("-export"))
//				{
//                    initializeConfigurationSwitches();
//					modelExport = true;
//					System.out.println ("BlenderLauncher parameter: \"" + args[i] + "\" for model export");
//				}
//				else if (args[i].equalsIgnoreCase("-import"))
//				{
//                    initializeConfigurationSwitches();
//					modelImport = true;
//                    conversionExtension = X3DObject.FILE_EXTENSION_X3D; // default
//					System.out.println ("BlenderLauncher parameter: \"" + args[i] + "\" for model export");
//				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-home") || args[i].equalsIgnoreCase("-page") || args[i].equalsIgnoreCase("-homepage") || args[i].equalsIgnoreCase("-website"))
				{
					launchBlenderWebPage();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-help"))
				{
					System.out.println(USAGE);
					System.out.println(BLENDER_URL);
					System.out.println("Blender help:");
					System.out.println(getBlenderHelp());
//                  launchBlenderWebPage();
					return;
				}
				// ==========================================
				else // not found
				{
					System.out.println(ERROR+" [org.web3d.x3d.jsail.BlenderLauncher] unrecognized BlenderLauncher option \"" + args[i] + "\"");
					System.out.println(USAGE);
					return;
				}
			}
		}
		// ===================================================================================
		if (loadProperties)
		{
			if (!propertiesFileName.isEmpty())
				ConfigurationProperties.setPropertiesFileName (propertiesFileName);
			ConfigurationProperties.loadProperties();
		}

		// compute/confirm resultFileName after all command-line switches are read
		if (!sourceFileName.isEmpty() && resultFileName.isEmpty())
		{
            if  (createImageSnapshot)
                 conversionExtension = X3DObject.FILE_EXTENSION_PNG;
            else conversionExtension = X3DObject.FILE_EXTENSION_X3D;

            resultFileName      = sourceFileNameRoot + conversionExtension;
            resultFileNameRoot  = sourceFileNameRoot;
            resultFile = new File(resultFileName);
		}
        // TODO confirm additional image, model formats
		if ((modelImport         && !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_X3D)) ||
		    (createImageSnapshot && !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_PNG)))
		{
			System.out.println(WARNING+" [org.web3d.x3d.jsail.BlenderLauncher] resultFile " + resultFileName + " has mismatched file extension \"" + conversionExtension + "\" for conversion");
		}
				
		// ===================================================================================
        if (!sourceFileName.isEmpty()) // fully prepared, now get source file and proceed
        {
            if (createImageSnapshot)
            {
                // create temp file for BlenderX3dToPng.py so that it is invocable
                if (BlenderX3dToPngPythonFile == null)
                    BlenderX3dToPngPythonFile = X3DObject.getTempFileFromX3dJsailJar("python/blenderScripts", "BlenderX3dToPng.py");
                
                // blender --background --factory-startup --python -- ${example.model.x3d} ${products.subdir}
                StringBuilder toImageCommand = new StringBuilder()
                    .append("blender")
                    .append(" ").append("--background")
                    .append(" ").append("--factory-startup")
                    .append(" ").append("--python")
                    .append(" ").append(BlenderX3dToPngPythonFile.getAbsolutePath()) // conversion script
                    .append(" ").append("--")            // arguments to python script follow
                    .append(" ").append(sourceFileName)  // input X3D model
//                  .append(" ").append(resultFileName)  // optional output path
                    ;
            	System.out.println("executeCommand(\"" + toImageCommand.toString() + "\")");
                String result     = executeCommand(      toImageCommand.toString());
				System.out.println(result);
            }
			else if (modelConvert)
			{
				executeCommandSuccessful = convertModel (sourceFileName, resultFileName);
				System.out.println("load success: " + executeCommandSuccessful);
				return;
			}
		}
		else if (!loadProperties && !resetPath) // allows testing of properties without file operations
        {
            String message = ERROR+"Source model file name is empty, therefore file loading not possible.";
            System.out.println(message);
            throw new org.web3d.x3d.sai.InvalidExecutionContextException(message);
        }
    }

    /** Open Blender page
     * @see <a href="http://www.blender.org" target="_blank">Blender</a>
     * @see <a href="https://en.wikipedia.org/wiki/Blender_(software)" target="_blank">Wikipedia: Blender (software)</a>
     * @see BLENDER_URL
     */
    public static void launchBlenderWebPage()
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        try {
            if (Desktop.isDesktopSupported())
            {
                Desktop.getDesktop().browse(new URI(BLENDER_URL));
            }
        }
        catch (IOException | URISyntaxException e2)
        {
            System.out.println ("launchBlenderWebPage failure: " + e2.getMessage());
        }
    }

    /**
     * Check Blender local path and reset to operating system default, if necessary.
	 * @see #setBlenderPath(String)
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/data_system/files/import_export.html" target="_blank">Blender Manual: Importing and Exporting Files</a>
     */
    public static void checkBlenderPath()
    {
        final String OPERATING_SYSTEM_NAME = System.getProperty("os.name");
         
        if ((getBlenderPath() == null) || (getBlenderPath().isEmpty()))
        {
            // https://stackoverflow.com/questions/228477/how-do-i-programmatically-determine-operating-system-in-java
            if (OPERATING_SYSTEM_NAME.toLowerCase(Locale.ENGLISH).contains("windows"))
            {
                setBlenderPath(BLENDER_PATH_DEFAULT_WINDOWS);
            }
            else if (OPERATING_SYSTEM_NAME.toLowerCase(Locale.ENGLISH).contains("mac"))
            {
                setBlenderPath(BLENDER_PATH_DEFAULT_MACOS);
            }
            else if (OPERATING_SYSTEM_NAME.toLowerCase(Locale.ENGLISH).contains("linux"))
            {
                setBlenderPath(BLENDER_PATH_DEFAULT_LINUX);
            }
        }
        // ensure trailing \ or / is present in path
        String blenderPath =  getBlenderPath();
        if (!blenderPath.isEmpty() && !blenderPath.endsWith("\\") && !blenderPath.endsWith("/"))
        {
            blenderPath = blenderPath + File.separator;
            setBlenderPath(blenderPath);
        }
    }
    /**
     * Keep track of whether prior command execution was successful.
     */
    private static boolean executeCommandSuccessful = false;
    /**
     * Report  whether prior command execution was successful.
     * @return whether prior command execution was successful.
     * @see <a href="https://stackoverflow.com/questions/3630281/is-it-possible-to-capture-a-windows-pop-up-message-box-from-inside-a-java-program">StackOverflow: possible to capture pop-up message box?</a>
     */
    public static boolean wasPriorCommandSuccessful()
    {
        return executeCommandSuccessful;
    }
    /**
     * Launch blender in operating system and run command.
     * @param command Blender invocation
     * @return console results
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/data_system/files/import_export.html" target="_blank">Blender Manual: Importing and Exporting Files</a>
     * @see <a href="https://stackoverflow.com/questions/31776546/why-does-runtime-execstring-work-for-some-but-not-all-commands/" target="_blank">Why does Runtime.exec(String) work for some but not all commands?</a>
     * @see <a href="https://stackoverflow.com/questions/13008526/runtime-getruntime-execcmd-hanging" target="_blank">StackOverflow: Runtime.getRuntime().exec(cmd) hanging</a>
     * @see <a href="https://stackoverflow.com/questions/3468987/executing-another-application-from-java" target="_blank">StackOverflow: Executing another application from Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html" target="_blank">java.lang.Runtime</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/ProcessBuilder.html" target="_blank">java.lang.ProcessBuilder</a>
     */
    protected static String executeCommand (String command)
    {
        StringBuilder outputBuilder = new StringBuilder();
        Process process;
        ProcessBuilder processBuilder;
        
        try
        {
//          File directory = new File(getBlenderPath()); // debug
//          * @see <a href="https://stackoverflow.com/questions/7347856/how-to-convert-a-string-into-an-arraylist" target="_blank">StackOverflow: How to convert a String into an ArrayList?</a>

            ArrayList<String> commandArgs = new ArrayList<>(Arrays.asList(command.split("\\s")));
            processBuilder = new ProcessBuilder(commandArgs);
            process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String  line;           
            while ((line = reader.readLine())!= null)
            {
                outputBuilder.append(line).append("\n");
            }
        }
        catch (IOException e)
        {
            outputBuilder.append(e.getMessage()).append("\n").append(e.getCause()).append("\n");
            e.printStackTrace();
            throw new org.web3d.x3d.sai.InvalidExecutionContextException(command);
        }
        return outputBuilder.toString();
    }
    /**
     * TODO: Use Blender to convert model from one file to another.
     * @param  inputFileName for  input file
     * @param outputFileName for output file
     * @return whether successful
     * @see <a href="https://www.MeshLab.net" target="_blank">MeshLab</a>
     * @see <a href="https://en.wikipedia.org/wiki/MeshLab" target="_blank">Wikipedia: MeshLab</a>
     */
    public static boolean convertModel (String inputFileName, String outputFileName)
    {
        return convertModel ("", inputFileName, outputFileName);
    }
    /**
     * TODO: Use Blender to convert model from one file to another based on filename extensions.
     * @param path directory path to file of interest
     * @param  inputFileName for  input file
     * @param outputFileName for output file
     * @return whether successful
     * @see <a href="https://www.MeshLab.net" target="_blank">MeshLab</a>
     * @see <a href="https://en.wikipedia.org/wiki/MeshLab" target="_blank">Wikipedia: MeshLab</a>
     */
    public static boolean convertModel (String path, String inputFileName, String outputFileName)
    {
         return false; // TODO
    }
    /**
     * TODO: Use blender to import model to X3D
     * @param path directory path to file of interest
     * @param fileName for input file
     * @return result, null if unsuccessful
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/data_system/files/import_export.html" target="_blank">Blender Manual: Importing and Exporting Files</a>
     */
    public static X3DObject importModel (String path, String fileName)
    {
            // use 
            // determine and metadata
            return null;
    }
    /**
     * TODO finish: Use blender to import STL geometry as X3D model
     * @param path directory path to file of interest
     * @param fileName for input file
     * @return result, null if unsuccessful
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/data_system/files/import_export.html" target="_blank">Blender Manual: Importing and Exporting Files</a>
     */
    public static X3DObject importSTL (String path, String fileName)
    {
        // https://blender.stackexchange.com/questions/1365/how-can-i-run-blender-from-command-line-or-a-python-script-without-opening-a-gui

        // https://blender.stackexchange.com/questions/16563/how-can-i-run-blender-from-the-command-line-to-export-and-import-models
 
        // .class or getClass().getResourceAsStream looks within each classpath .jar for stylesheetPath
        InputStream pythonScriptInputStream = BlenderLauncher.class.getResourceAsStream("/" + BLENDER_PYTHON_SCRIPT_STL_TO_X3D);
        if (pythonScriptInputStream == null)
        {
            String errorNotice = "File not found: " + BLENDER_PYTHON_SCRIPT_STL_TO_X3D;
        }
        // test file extension, determine if binary stl, add any metadata
        return null;
    }

    /**
     * TODO: Use blender to export geometry to STL
     * @param modelToExport X3D model of interest
     * @return plain-text STL file
     * @see <a href="https://en.wikipedia.org/wiki/STL_(file_format)" target="_blank">STL (file format)</a>
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/data_system/files/import_export.html" target="_blank">Blender Manual: Importing and Exporting Files</a>
     */
    public static String exportSTL (X3DObject modelToExport)
    {
            // determine and metadata
            return "";
    }

    /**
     * TODO: Use blender to export geometry to file
     * @param modelToExport X3D model of interest
     * @param path directory path to file of interest
     * @param fileName for output file
     * @return whether successful
     * @see <a href="https://en.wikipedia.org/wiki/STL_(file_format)" target="_blank">STL (file format)</a>
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/data_system/files/import_export.html" target="_blank">Blender Manual: Importing and Exporting Files</a>
     */
    public static boolean exportSTLtoFile (X3DObject modelToExport, String path, String fileName)
    {
            String result = exportSTL (modelToExport);
            try
            {
                    // TODO save to file
            }
            catch (Exception e)
            {
                    // Diagnostic
                    return false;
            }
            return true;
    }
    /**
     * TODO: Get Blender metrics for X3D model of interest.
     * @param modelOfInterest X3D model to analyze
     * @return Blender output
     * @see <a href="https://blender.org" target="_blank">Blender</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     */
    public static String getBlenderAnalytics (X3DObject modelOfInterest)
    {
            // add optional method to create X3DMetadataSet
            return "";
    }
    /**
     * TODO: Get Blender metrics as MetadataSet object.
     * @param modelOfInterest X3D model to analyze
     * @return Blender output
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     */
    public static MetadataSetObject getBlenderAnalyticsX3dMetadataSet (X3DObject modelOfInterest)
    {
            return null;
    }
    /**
     * Get Blender version.
     * <i>Warning:</i> ensure local path is set correctly, especially if more than one version is installed.
	 * @return Blender version.
     * @see <a href="https://www.blender.org" target="_blank">www.blender.org</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     */
    public static String getBlenderVersion()
    {
        String result = executeCommand("blender --version");
        return result.substring(0,result.indexOf("\n")).trim();
    }
    /**
     * Get Blender help.
     * <i>Warning:</i> ensure local path is set correctly, especially if more than one version is installed.
	 * @return Blender version.
     * @see <a href="https://www.blender.org" target="_blank">www.blender.org</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     */
    public static String getBlenderHelp()
    {
        String result = executeCommand("blender --help");
        return result.replaceAll("\r\n", "\n").replaceAll("\n\n", "\n").trim(); // avoid double newlines in output
    }
    /**
     * Determine if Blender is locally available.
     * <i>Warning:</i> ensure local path is set correctly, especially if more than one version is installed.
	 * @return whether Blender is found.
     * @see <a href="https://www.blender.org" target="_blank">www.blender.org</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/render/workflows/command_line.html" target="_blank">Blender Manual: Command Line</a>
     * @see <a href="https://docs.blender.org/manual/en/dev/advanced/command_line/arguments.html" target="_blank">Blender Manual: Command Line Arguments</a>
     */
    public static boolean hasBlender()
    {
        return (getBlenderVersion().startsWith("Blender"));
    }
}
