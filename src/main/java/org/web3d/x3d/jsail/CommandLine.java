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

// Desktop and Web browser
import java.awt.Desktop;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.text.DecimalFormat;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.InvalidFieldValueException;
import org.web3d.x3d.sai.X3DException;
import org.web3d.x3d.tools.x3db.X3dCanonicalizer;

// XSLT operations: Saxon HE9
import net.sf.saxon.s9api.*;
// XSLT operations: Native Java
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.Result;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
// XSLT operations
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
// Script operations
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

/**
 * Concrete class with a <code>main</code> method that provides command-line JAR access to various X3DJSAIL capabilities.
 * 
 * <br><br>


 * Usage: <code>% java -jar X3DJSAIL.3.3.classes.jar -help</code>
 * @see <a href="../../../../../X3DJSAIL.html#CommandLine" target="_blank">X3DJSAIL documentation: Command Line</a>
 * @see <a href="http://docs.oracle.com/javase/8/docs/technotes/guides/jar/jar.html">JAR File Specification</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/deployment/jar/manifestindex.html">Java Tutorials, Lesson: Packaging Programs in JAR Files</a>
 * 
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class CommandLine
{

    // TODO JAR configuration

    // ==========================================================================================

	/** Loaded X3D model of interest, useful for initialization and use of CommandLine by other X3D Java programs. */
	private static X3DObject loadedX3dModel;

	/** Set already-loaded X3D model of interest, useful for initialization and use of CommandLine by other X3D Java programs. 
	 * @param newX3dModel already-loaded X3D model of interest
	*/
	public static void setLoadedX3dModel (X3DObject newX3dModel)
	{
		loadedX3dModel = newX3dModel;
	}
				
	/** Reset already-loaded X3D model of interest to empty model */
	public static void clearLoadedX3dModel ()
	{
		loadedX3dModel = new X3DObject();
	}

    // ==========================================================================================
	
    /** Initialize this CommandLine instance to default values. */
    public static final void initialize()
    {
        clearLoadedX3dModel ();
    }
                            
    /**
     *                                  Usage: <code>java [-classpath X3DJSAIL.*.jar] org.web3d.x3d.jsail.CommandLine [-help | -version | -home | -javadoc | -resources | -hints | -regexes | -tooltips | -X3DUOM] [-properties [propertiesFile]] [sourceModel.x3d | sourceModel.exi [-fromEXI] | sourceModel.gz [-fromGZIP] | sourceModel.zip [-fromZIP]] [-canonical] [-validate] [-EXIFICIENT | -OpenEXI] | [-Tidy | -toX3D | -toXML | -toClassicVrml | -toJava | -toJSON | -toPython | -toVRML97 | -toHTML | -toX3DOM | -toX_ITE | -toMarkdown | -toEXI | -toGZIP | -toZIP] [-tofile [resultFile.*]] [-toImage [snapshotName.*]]</code>
     */
    public  static final String USAGE      = "Usage: java [-classpath X3DJSAIL.*.jar] org.web3d.x3d.jsail.CommandLine\n       [-help | -version | -home | -javadoc | -resources | -hints | -regexes | -tooltips | -X3DUOM]\n       [-properties [propertiesFile]]\n       [sourceModel.x3d | sourceModel.exi [-fromEXI] | sourceModel.gz [-fromGZIP] | sourceModel.zip [-fromZIP]]\n       [-canonical] [-validate] [-EXIFICIENT | -OpenEXI]\n       [-Tidy | -toX3D | -toXML | -toClassicVrml | -toJava | -toJSON | -toPython | -toVRML97]\n       [-toHTML | -toX3DOM | -toX_ITE | -toMarkdown | -toEXI | -toGZIP | -toZIP]\n       [-tofile [resultFile.*]] [-toImage [snapshotName.*]]";
    public  static final String USAGE_LONG = 
        "-classpath X3DJSAIL.*.jar         # optional classpath, can be set as environment variable" + "\n" +
        "org.web3d.x3d.jsail.CommandLine   # invoke CommandLine application" + "\n" +
        "==================================#====== informational ======================" + "\n" +
        "-help                             # provide this help message" + "\n" +
        "-version                          # version date when this X3DJSAIL build was autogenerated" + "\n" +
        "-home                             # launch X3DJSAIL home page" + "\n" +
        "-javadoc                          # launch X3DJSAIL javadoc page" + "\n" +
        "-resources                        # launch X3D Resources page" + "\n" +
        "-hints                            # launch X3D Scene Authoring Hints page" + "\n" +
        "-regex                            # launch X3D Regular Expressions page" + "\n" +
        "-tooltips                         # launch X3D Tooltips page" + "\n" +
        "-X3DUOM                           # launch X3D Unified Object Model (X3DUOM) page" + "\n" +
        " =================================#====== properties, inputs =================" + "\n" +
        "-properties [propertiesFile]      # override X3DJSAIL properties (default file: X3DJSAIL.properties)" + "\n" +
        "-EXIFICIENT                       # use Exificient (default) as EXI_ENGINE" + "\n" +
        "-OpenEXI                          # use OpenEXI (Nagasena)   as EXI_ENGINE (testing in progress)" + "\n" +
        "sourceModel.x3d                   # source model file name, X3D  format" + "\n" +
        "sourceModel.exi [-fromEXI]        # source model file name, EXI  format" + "\n" +
        "sourceModel.gz  [-fromGZIP]       # source model file name, GZIP format" + "\n" +
        "sourceModel.zip [-fromZIP]        # source model file name, ZIP  format" + "\n" +
        "==================================#====== operations =========================" + "\n" +
        "-canonical                        # canonical XML output using X3D Canonicalization (c14n)" + "\n" +
        "-validate                         # validate correctness of loaded model" + "\n" +
        "-Tidy                             # X3D-Tidy cleanup in .x3d (XML) format" + "\n" +
        "-toX3D                            # output in .x3d (XML) format" + "\n" +
        "-toXML                            # output in .xml (X3D) format" + "\n" +
        "-toClassicVrml                    # output in .x3dv (ClassicVrml) X3D format" + "\n" +
        "-toJava                           # output in .java source code using X3DJSAIL" + "\n" +
        "-toJSON                           # output in .json (JavaScript Object Notation) format" + "\n" +
        "-toPython                         # output in .py Python source code" + "\n" +
        "-toVRML97                         # output in .wrl  (VRML97) format" + "\n" +
        "-toHTML                           # output in .html  pretty-print documentation" + "\n" +
        "-toX3DOM                          # output in .xhtml page with X3DOM display of X3D model" + "\n" +
        "-toX_ITE                          # output in .html  page with X_ITE display of X3D model" + "\n" +
        "-toMarkdown                       # output document metadata (meta tags) in .md (Markdown) format" + "\n" +
        "-toEXI                            # output in .exi (Efficient XML Interchange) compressed-XML format" + "\n" +
        "-toGZIP                           # output in .gz  (X3D XML) format, with gzip compression" + "\n" +
        "-toZIP                            # output in .zip (X3D XML) format, with zip  compression" + "\n" +
        "==================================#====== outputs ============================" + "\n" +
        "-tofile  [resultFile.*]           # specify output filename (otherwise original name with extension)" + "\n" +
        "-toImage [snapshotName.*]         # create output images for each Viewpoint using Blender" + "\n";
                
    private static final String WARNING = "[Warning] ";
    private static final String ERROR   = "[Error] ";
    
    private static boolean canonicalize             = false;
    private static boolean convertToVRML97          = false;
    private static boolean convertToClassicVRML     = false;
    private static boolean convertToX3D             = false;
    private static boolean convertToXML             = false;
    private static boolean convertToHTML            = false; // pretty-print documentation
    private static boolean convertToMarkdown        = false; // model meta information
    private static boolean includeSubdirectoryPaths = true;  // model meta information, special switch for ModelExchange
    private static boolean convertToTidy            = false;
    private static boolean convertToJava            = false;
    private static boolean convertToJS              = false;
    private static boolean convertToJSON            = false;
    private static boolean convertToPython          = false;
    private static boolean convertToX3DOM           = false;
    private static boolean convertToX_ITE           = false;
    private static boolean convertToEXI             = false;
    private static boolean convertFromEXI           = false;
    private static boolean convertToGZIP            = false;
    private static boolean convertFromGZIP          = false;
    private static boolean convertToZIP             = false;
    private static boolean convertFromZIP           = false;
    private static boolean validateSwitch           = false;
				
	private static String  conversionExtension = new String();

	/** Reset switch values */
	private static void initializeConfigurationSwitches()
	{
        canonicalize             = false;
		convertToVRML97          = false;
		convertToClassicVRML     = false;
		convertToX3D             = false;
		convertToXML             = false;
		convertToHTML            = false;
		convertToMarkdown        = false;
		includeSubdirectoryPaths = true; // special markdown switch
		convertToTidy            = false;
		convertToJava            = false;
		convertToJS              = false;
		convertToJSON            = false;
		convertToPython          = false;
		convertToX3DOM           = false;
		convertToX_ITE           = false;
		convertToEXI             = false;
		convertFromEXI           = false;
		convertToGZIP            = false;
		convertFromGZIP          = false;
		convertToZIP             = false;
		convertFromZIP           = false;
		validateSwitch           = false;

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
        File    sourceFile           = null; // curiously, must be initialized as null
        long    sourceFileLength     = 0;
        String  sourceFileName       = "";
        String  sourceFileNameRoot   = "";
        String  resultFileName       = "";
        String  resultFileNameRoot   = "";
        final String tempFileName    = "temp9876543210.txt";
	File    resultFile           = new File(tempFileName); // overwritten or deleted
        boolean convertToFile        = false;
        boolean loadProperties       = false;
        String propertiesFileName    = "";
        String propertiesFileNameRoot= "";
        DecimalFormat formatPrecision2 = new DecimalFormat ("#0.00");
	String  compressionRatio;
            
        // http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
        // http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
        Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"
				 
	        initializeConfigurationSwitches ();
                if (loadedX3dModel == null)
                    initialize();

		if ((args== null) || (args.length < 1))
		{
			System.out.println (USAGE);
			System.out.println ();
			System.out.println (USAGE_LONG);
			return;
		}
		else
		{
			for (int i=0; i<=args.length-1; i++)
			{
				if  (args[i].trim().isEmpty())
				{
                    continue; // skip empty argument
                }
                args[i] = args[i].trim(); // eliminate excess whitespace, if called programmatically
				if  (!args[i].startsWith("-"))
				{
					if (!sourceFileName.isEmpty()) // slready found on previous pass
					{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] multiple source file names found, \"" + sourceFileName + "\" and \"" + args[i] + "\"");
						System.out.println(USAGE);
						return;
					}
					else 
					{
						sourceFileName     = args[i];
						sourceFileNameRoot = sourceFileName;
						if (sourceFileNameRoot.contains("."))
							sourceFileNameRoot = sourceFileName.substring(0,sourceFileName.lastIndexOf("."));
						sourceFile = new File(sourceFileName);
						String messageSuffix = new String();
						if (!sourceFile.exists())
						{
							System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] file not found: " + sourceFileName);
							return;
						}
						else
						{
							sourceFileLength = sourceFile.length();
							System.out.println ("parameter: source file " + sourceFile.getName() + " filesize " + sourceFileLength + " bytes" + messageSuffix);
						}
                        if      (sourceFileName.endsWith(X3DObject.FILE_EXTENSION_EXI))
                        {
                            convertFromEXI = true;
                        }
                        else if (sourceFileName.endsWith(X3DObject.FILE_EXTENSION_GZIP))
                        {
                            convertFromGZIP = true;
                        }
                        else if (sourceFileName.endsWith(X3DObject.FILE_EXTENSION_ZIP))
                        {
                            convertFromZIP = true;
                        }
					}
				}
				else if (args[i].equalsIgnoreCase("-tofile")) // followed by resultFileName
				{
					if ((args.length > i + 1) && !(args[i+1] == null) && !args[i+1].isEmpty() && !args[i+1].startsWith("-"))
					{
						 resultFileName     = args[i+1];
						 resultFileNameRoot = resultFileName.substring(0,resultFileName.lastIndexOf("."));
                         if (!resultFileName.contains("."))
                         {
                             resultFileNameRoot = resultFileName;
                             System.out.println ("Warning:  \"" + resultFileName + "\" contains no period or filename extension");
                         }
						 System.out.println ("CommandLine parameter: \"" + args[i] + "\" \"" + args[i+1] + "\" for result file name root " + resultFileNameRoot);
						 i++; // increment index, carefully!
					}
					else System.out.println ("parameter: \"" + args[i] + "\" for result file name root "+ resultFileNameRoot);
					convertToFile = true;
				}
				else if (args[i].equalsIgnoreCase("-properties") || args[i].equalsIgnoreCase("-propertiesFile")) // optionally followed by propertiesFileName
				{
					if ((args.length > i + 1) && !(args[i+1] == null) && !args[i+1].isEmpty() && !args[i+1].startsWith("-"))
					{
						 propertiesFileName     = args[i+1];
						 propertiesFileNameRoot = propertiesFileName.substring(0,propertiesFileName.lastIndexOf("."));
						 System.out.println ("CommandLine parameter: \"" + args[i] + "\" \"" + args[i+1] + "\" for properties file name root " + propertiesFileNameRoot);
						 i++; // increment index, carefully!
					}
					else System.out.println ("CommandLine parameter: \"" + args[i] + "\" for properties file name root "+ propertiesFileNameRoot);
					loadProperties = true; // set flag
				}
				else if (args[i].equalsIgnoreCase("-x3d") || args[i].equalsIgnoreCase("-tox3d"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToX3D = true;
					conversionExtension = X3DObject.FILE_EXTENSION_X3D;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to X3D encoding");
				}
				else if (args[i].equalsIgnoreCase("-xml") || args[i].equalsIgnoreCase("-toxml"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToXML = true;
					conversionExtension = X3DObject.FILE_EXTENSION_XML;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to XML encoding");
				}
				else  if (args[i].equalsIgnoreCase("-canonical")    || args[i].equalsIgnoreCase( "-c14n") || 
						  args[i].equalsIgnoreCase("-canonicalize") || args[i].equalsIgnoreCase("-canonicalization"))
				{
					clearPriorConversionSwitches(args[i]);
					canonicalize   = true;
                    convertToFile  = true;               // use same name unless otherwise specified,
                    if (resultFileName.isEmpty())        // may be overridden if followed by toFile
                        resultFileName = sourceFileNameRoot + "Canonical.xml";
					if      (resultFileName.endsWith(".x3d"))
					         conversionExtension = X3DObject.FILE_EXTENSION_X3D;
					else if (resultFileName.endsWith(".xml"))
					         conversionExtension = X3DObject.FILE_EXTENSION_XML;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for X3D and XML canonicalization (C14N)");
				}
				else if (args[i].equalsIgnoreCase("-html")  || args[i].equalsIgnoreCase("-tohtml")  || args[i].equalsIgnoreCase("-html5") || args[i].equalsIgnoreCase("-tohtml5") ||
						 args[i].equalsIgnoreCase("-xhtml") || args[i].equalsIgnoreCase("-toxhtml") || args[i].equalsIgnoreCase("-prettyprint"))
				{
				    /* pretty-print documentation */
					clearPriorConversionSwitches(args[i]);
					convertToHTML = true;
					if  (args[i].equalsIgnoreCase("-xhtml") || args[i].equalsIgnoreCase("-toxhtml"))
					     conversionExtension = X3DObject.FILE_EXTENSION_XHTML;
					else conversionExtension = X3DObject.FILE_EXTENSION_HTML;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for producing " + conversionExtension + " pretty-print documentation");
				}
				else if (args[i].equalsIgnoreCase("-md")  || args[i].equalsIgnoreCase("-tomd")  || args[i].equalsIgnoreCase("-markdown") || args[i].equalsIgnoreCase("-tomarkdown"))
				{
					/* model meta information to markdown, used in ModelExchange.nps.edu */
					clearPriorConversionSwitches(args[i]);
					includeSubdirectoryPaths = true;
					convertToMarkdown   = true;
					conversionExtension = X3DObject.FILE_EXTENSION_MARKDOWN;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for producing " + conversionExtension + " model meta information markdown");
				}
				else if (args[i].equalsIgnoreCase("-tidy") || args[i].equalsIgnoreCase("-totidy") || args[i].equalsIgnoreCase("-x3dtidy") || args[i].equalsIgnoreCase("-tox3dtidy"))
				{
				    /* X3D-Tidy cleanup */
					clearPriorConversionSwitches(args[i]);
					convertToTidy = true;
					conversionExtension = X3DObject.FILE_EXTENSION_X3D;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for producing X3D-Tidy cleanup of .x3d");
				}
				else if (args[i].equalsIgnoreCase("-x3dv") || args[i].equalsIgnoreCase("-tox3dv") || 
						 args[i].equalsIgnoreCase("-toClassicVRML") || args[i].equalsIgnoreCase("-ClassicVRML"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToClassicVRML = true;
					conversionExtension = X3DObject.FILE_EXTENSION_CLASSICVRML;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to ClassicVRML encoding");
				}
				else  if (args[i].equalsIgnoreCase("-java") || args[i].equalsIgnoreCase("-tojava"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToJava = true;
					conversionExtension = X3DObject.FILE_EXTENSION_JAVA;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to Java source code");
				}
				else  if (args[i].equalsIgnoreCase("-json") || args[i].equalsIgnoreCase("-tojson"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToJSON = true;
					conversionExtension = X3DObject.FILE_EXTENSION_JSON;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to JSON encoding");
				}
				else  if (args[i].equalsIgnoreCase("-Python") || args[i].equalsIgnoreCase("-toPython"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToPython = true;
					conversionExtension = X3DObject.FILE_EXTENSION_PYTHON;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to Python source code");
				}
 				else  if (args[i].equalsIgnoreCase("-js") || args[i].equalsIgnoreCase("-tojs"))
 				{
 					clearPriorConversionSwitches(args[i]);
 					convertToJS = true;
 					conversionExtension = X3DObject.FILE_EXTENSION_JAVASCRIPT;
 					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to X3DJSONLD JavaScript source");
 				}
				else  if (args[i].equalsIgnoreCase(  "-vrml") || args[i].equalsIgnoreCase(  "-vrml97") ||args[i].equalsIgnoreCase( "-wrl") || 
						  args[i].equalsIgnoreCase("-tovrml") || args[i].equalsIgnoreCase("-tovrml97"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToVRML97 = true;
					conversionExtension = X3DObject.FILE_EXTENSION_VRML97;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to VRML97 encoding");
				}
				else  if (args[i].equalsIgnoreCase("-x3dom") || args[i].equalsIgnoreCase("-tox3dom"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToX3DOM = true;
					conversionExtension = X3DObject.FILE_EXTENSION_HTML;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to X3DOM HTML page containing model");
				}
				else  if (args[i].equalsIgnoreCase("-X_ITE") || args[i].equalsIgnoreCase("-toX_ITE"))
				{
					clearPriorConversionSwitches(args[i]);
					convertToX_ITE = true;
					conversionExtension = X3DObject.FILE_EXTENSION_HTML;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to X_ITE HTML page containing model");
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-EXIFICIENT"))
				{
					ConfigurationProperties.setExiEngine(ConfigurationProperties.EXI_ENGINE_EXIFICIENT);
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" invoked ConfigurationProperties.setExiEngine(" + ConfigurationProperties.EXI_ENGINE_EXIFICIENT + ");");
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-OPENEXI") || args[i].equalsIgnoreCase("-OPEN-EXI") || args[i].equalsIgnoreCase("-NAGASENA"))
				{
					ConfigurationProperties.setExiEngine(ConfigurationProperties.EXI_ENGINE_OPENEXI);
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" invoked ConfigurationProperties.setExiEngine(" + ConfigurationProperties.EXI_ENGINE_OPENEXI + ");");
					// TODO update when ready:
					System.out.println ("  Warning: \"" + ConfigurationProperties.EXI_ENGINE_OPENEXI + "\" testing in progress, can also use " + ConfigurationProperties.EXI_ENGINE_EXIFICIENT + " instead.");
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-EXI") || args[i].equalsIgnoreCase("-toEXI"))
				{
					if (sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_EXI))
					{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot convert an .exi file -toEXI");
						System.out.println(USAGE);
						return;
					}
					clearPriorConversionSwitches(args[i]);
					convertToEXI  = true;
					convertToFile = true;
					conversionExtension = X3DObject.FILE_EXTENSION_EXI;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to compressed EXI containing model");
				}
				else  if ((args[i].equalsIgnoreCase("-EXI") &&  sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_EXI)) || 
						   args[i].equalsIgnoreCase("-fromEXI"))
				{
					if (!sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_EXI))
					{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot convert a non-exi file -toEXI");
						System.out.println(USAGE);
						return;
					}
					clearPriorConversionSwitches(args[i]);
					convertFromEXI = true;
					conversionExtension = X3DObject.FILE_EXTENSION_X3D;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion from compressed EXI containing model");
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-toGZ") || args[i].equalsIgnoreCase("-toGZIP"))
				{
					if (sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_GZIP))
					{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot convert -toGZIP an already gzip .gz file " + sourceFileName);
						System.out.println(USAGE);
						return;
					}
					clearPriorConversionSwitches(args[i]);
					convertToGZIP = true;
					convertToFile = true;
					conversionExtension = X3DObject.FILE_EXTENSION_GZIP;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to compressed GZIP containing model");
				}
				else  if (args[i].equalsIgnoreCase("-fromGZ") || args[i].equalsIgnoreCase("-fromGZIP"))
				{
					if (!sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_GZIP))
					{
							System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot convert -fromGZIP an non-gzip file " + sourceFileName);
							System.out.println(USAGE);
							return;
					}
					clearPriorConversionSwitches(args[i]);
					convertFromGZIP = true;
					conversionExtension = X3DObject.FILE_EXTENSION_X3D;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion from compressed GZIP containing model");
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-toZIP"))
				{
					if (sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_ZIP))
					{
							System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot convert -toZIP a non-zip file " + sourceFileName);
							System.out.println(USAGE);
							return;
					}
					clearPriorConversionSwitches(args[i]);
					convertToZIP = true;
					conversionExtension = X3DObject.FILE_EXTENSION_ZIP;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion to compressed ZIP containing model");
				}
				else  if (args[i].equalsIgnoreCase("-fromZIP"))
				{
					if (!sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_ZIP))
					{
							System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot convert -fromZIP a non-zip file " + sourceFileName);
							System.out.println(USAGE);
							return;
					}
					// TODO also handle specification of filename of interest
					clearPriorConversionSwitches(args[i]);
					convertFromZIP = true;
					convertToFile  = true;
					conversionExtension = X3DObject.FILE_EXTENSION_X3D;
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for conversion from compressed ZIP containing model");
				}
				// ==========================================
				else if (args[i].equalsIgnoreCase("-toImage") || args[i].equalsIgnoreCase("-screenshot"))
				{
                    initializeConfigurationSwitches();
					System.out.println ("CommandLine parameter: \"" + args[i] + "\" for creating screenshot image of default viewpoint");
					System.out.println ("Pass through to BlenderLauncher...");
                    org.web3d.x3d.jsail.BlenderLauncher.run(args);
                    return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-v") || args[i].equalsIgnoreCase("-validate"))
				{
					// usually invoked in isolation, but can coexist (superfluous) with conversions
					validateSwitch = true;
					if (resultFileName.isEmpty())
					{
						 resultFileName = "Validation" + X3DObject.FILE_EXTENSION_TEXT; // be prepared with default name
						 System.out.println ("CommandLine parameter: \"" + args[i] + "\" for model validation");
					}
					else System.out.println ("CommandLine parameter: \"" + args[i] + "\" for model validation to result file");
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-home") || args[i].equalsIgnoreCase("-page") || args[i].equalsIgnoreCase("-homepage") || args[i].equalsIgnoreCase("-website") || args[i].equalsIgnoreCase("-X3DJSAIL"))
				{
					clearPriorConversionSwitches(args[i]);
                    System.out.println("Opening " + ConfigurationProperties.URL_X3DJSAIL);
					openHomePageX3DJSAIL();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-javadoc"))
				{
					clearPriorConversionSwitches(args[i]);
                    System.out.println("Opening Javadoc at " + ConfigurationProperties.URL_X3DJSAIL);
					openJavadocX3DJSAIL();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-resources") || args[i].equalsIgnoreCase("-X3dResources"))
				{
                    System.out.println("Opening " + ConfigurationProperties.URL_X3DRESOURCES);
					if  (i < args.length - 1)
                         openX3dResourcesPage(args[i+1]);
                    else openX3dResourcesPage();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-hints") || args[i].equalsIgnoreCase("-SceneAuthoringHints") || args[i].equalsIgnoreCase("-X3dSceneAuthoringHints"))
				{
                    System.out.println("Opening " + ConfigurationProperties.URL_X3DSCENEAUTHORINGHINTS);
					 if  (i < args.length - 1)
                         openX3dSceneAuthoringHintsPage(args[i+1]);
                    else openX3dSceneAuthoringHintsPage();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-tooltips") || args[i].equalsIgnoreCase("-X3dTooltips"))
				{
                    System.out.println("Opening " + ConfigurationProperties.URL_X3DTOOLTIPS);
                    if  (i < args.length - 1)
                         openX3dTooltipsPage(args[i+1]);
                    else openX3dTooltipsPage();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-regex") || args[i].equalsIgnoreCase("-regexes") || args[i].equalsIgnoreCase("-RegularExpressions"))
				{
                    System.out.println("Opening " + ConfigurationProperties.URL_X3DREGEXES);
                    if  (i < args.length - 1)
                         openX3dRegexesPage(args[i+1]);
                    else openX3dRegexesPage();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-X3DUOM"))
				{
                    System.out.println("Opening " + ConfigurationProperties.URL_X3DUOM);
                    openX3DUOMpage();
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-help"))
				{
					clearPriorConversionSwitches(args[i]);
					System.out.println(USAGE);
                    System.out.println ();
                    System.out.println (USAGE_LONG);
					return;
				}
				// ==========================================
				else  if (args[i].equalsIgnoreCase("-version"))
				{
					clearPriorConversionSwitches(args[i]);
					System.out.println("X3DJSAIL version date: " + ConfigurationProperties.VERSION_DATE);
                    if ((i == args.length-1) || (args.length > 2))
                        return;
					// otherwise do not return so that this output can be included with other commands
				}
				// ==========================================
				else // not found
				{
					System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] unrecognized CommandLine option \"" + args[i] + "\"");
					System.out.println(USAGE);
                    System.out.println ();
                    System.out.println (USAGE_LONG);
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
			resultFileNameRoot = sourceFileNameRoot;
			resultFileName     = resultFileNameRoot + conversionExtension;
		}
		if ((convertToX3D         &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_X3D))    ||
			(convertToXML         &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_XML))    ||
			(canonicalize         && (!conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_X3D) &&
                                      !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_XML))) ||
			(convertToHTML        && (!conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_HTML) &&
                                      !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_XHTML)))   ||
			(convertToMarkdown    &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_MARKDOWN)) ||
			(convertToTidy        &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_X3D))      ||
			(convertToClassicVRML &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_CLASSICVRML)) ||
			(convertToVRML97      &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_VRML97)) ||
			(convertToX3DOM       && (!conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_HTML) &&
                                      !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_XHTML))) ||
			(convertToX_ITE       && (!conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_HTML) &&
                                      !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_XHTML))) ||
			(convertToEXI         &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_EXI))    ||
			(convertToGZIP        &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_GZIP))   ||
			(convertToZIP         &&  !conversionExtension.equalsIgnoreCase(X3DObject.FILE_EXTENSION_ZIP))    )
		{
			System.out.println(WARNING+" [org.web3d.x3d.jsail.CommandLine] mismatched file extension \"" + conversionExtension + "\" for conversion");
		}
				
		// ===================================================================================
        if (!sourceFileName.isEmpty()) // fully prepared, now get source file and proceed
        {
			if (convertFromGZIP)
			{
				if (!sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_GZIP))
				{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot -gunzip a non-gzip file " + sourceFileName);
						System.out.println(USAGE);
						return;
				}
				boolean result = loadedX3dModel.fromFileGZIP(sourceFileName);
				System.out.println("load success: " + result);
				return;
			}
			else if (convertFromZIP)
			{
				if (!sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_ZIP))
				{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot -gunzip a non-zip file " + sourceFileName);
						System.out.println(USAGE);
						return;
				}
				// if output resultFileName not specified, pick first available .x3d file
				boolean result = loadedX3dModel.fromFileZIP(sourceFileName,resultFileName); 
				System.out.println("load success: " + result);
				return;
			}
			else if (convertFromEXI)
			{
				if (!sourceFileName.toLowerCase().endsWith(X3DObject.FILE_EXTENSION_EXI))
				{
						System.out.println(ERROR+" [org.web3d.x3d.jsail.CommandLine] cannot -fromEXI a non-EXI file " + sourceFileName);
						System.out.println(USAGE);
						return;
				}
				// if output resultFileName not specified, pick first available .x3d file
				boolean result = loadedX3dModel.fromFileEXI(sourceFileName); 
				System.out.println("load success: " + result);
				return;
			}
            else if (canonicalize) // TODO confirm whether this block is in correct place
            {
                //  open file, get scene string
                String sourceString = getFileContents(sourceFileName); // debug use

                // must pass full path to sourceFile
                if (sourceFile == null) // making sure, silence warning
                    sourceFile = new File(sourceFileName);
                // Do not use "-validate" because it employs DOM loader which fails on large models
                if (resultFileName.endsWith(".x3d")) // X3dC14n requirement, cannot end with .x3d for disambiguation
                {
                    resultFileName     = resultFileNameRoot + "Canonical.xml";
                    System.out.println("CommandLine invocation: changed resultFileName=" + resultFileName + " to meet X3dC14n requirement");
                }
                String[] invocationArguments = { sourceFile.getAbsolutePath(), resultFileName };
                System.out.println("CommandLine invocation: new X3dCanonicalizer(" + String.join(",", invocationArguments) + ")");
                X3dCanonicalizer x3dCanonicalizer = new X3dCanonicalizer(invocationArguments);
                // TODO process outputs.  Unable to process large scenes due to DOM loading?
                System.out.println("...x3dCanonicalizer.isCanonical()=" + x3dCanonicalizer.isCanonical());       // debug
                
                resultFile = new File(resultFileName); // unsaved
                if (resultFile == null)
                {
                       throw new X3DException("ERROR: Failure to create resultFile " + resultFileName);
                }
                else if (resultFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
                {
                    System.out.println("Warning: x3dCanonicalizer is overwriting prior file " + resultFileName);
                }
                else if  (resultFile.exists())
				{
					System.out.println ("Warning: x3dCanonicalizer is not allowed to overwrite prior file: " + resultFileName);
					System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
					return;
				}
                Path outputFilePath = Paths.get(resultFileName);
                if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
                {
                    String errorNotice = "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
                    System.out.println (errorNotice);
                }
                String outputSceneText = x3dCanonicalizer.getFinalC14nScene();
                try
                {
                    Path directoryPath = outputFilePath.getParent();
                    if ((directoryPath != null))
                         Files.createDirectories(directoryPath); // if needed
                    bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
                    bufferedWriter.write(outputSceneText, 0, outputSceneText.length());
                    bufferedWriter.close(); // ensure file writing is complete
                    outputFilePath.toFile(); // success
                }
                catch (IOException exception)
                {
                    exception.printStackTrace();
                    throw new X3DException("IOException for fileName " + resultFileName + ", unable to save file: " + exception);
                }
                return;
            }
            else if (convertToHTML)
            {
                System.out.println("convert to HTML using files:");
                if (sourceFile == null)
                    sourceFile = new File(sourceFileName);
                if (!convertToFile) System.out.println();
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_HTML_DOCUMENTATION, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_HTML_DOCUMENTATION));
                return;
            }
            else if (convertToVRML97)
            {
                System.out.println("convert to VRML97:");
                if (!convertToFile) System.out.println();
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_VRML97, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_VRML97));
                return;
            }
            else if (convertToClassicVRML)
            {
                System.out.println("convert to ClassicVRML:");
                if (!convertToFile) System.out.println();
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_X3DV_CLASSICVRML, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_X3DV_CLASSICVRML));
                return;
            }
            else if (convertToJava)
            {
                String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                System.out.println("convert to Java:");
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_JAVA, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_JAVA));
                ConfigurationProperties.setXsltEngine(presetXsltEngine);
                return;
            }
            else if (convertToJSON)
            {
                String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                System.out.println("convert to JSON:");
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_JSON, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_JSON));
                ConfigurationProperties.setXsltEngine(presetXsltEngine);
                return;
            }
            else if (convertToPython)
            {
                String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                System.out.println("convert to Python:");
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_PYTHON, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_PYTHON));
                ConfigurationProperties.setXsltEngine(presetXsltEngine);
                return;
            }
            else if (convertToTidy)
            {
                System.out.println("convert to X3D Tidy cleaned-up version");
                if (!convertToFile) System.out.println();
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_X3DTIDY, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_X3DTIDY));
                return;
            }
            else if (convertToMarkdown) // model meta information
            {
                System.out.println("convert to " + conversionExtension + " model meta information markdown, include subdirectories in meta links: " + includeSubdirectoryPaths);
// TODO         loadedX3dModel.setIncludeSubdirectoryPaths(includeSubdirectoryPaths);
                if (!convertToFile) System.out.println();
                if  (convertToFile)
                       fileStylesheetConversion        (sourceFile, ConfigurationProperties.STYLESHEET_MODEL_META_TO_MARKDOWN, resultFileName);
                else System.out.println(
                       fileStylesheetConversionToString(sourceFile, ConfigurationProperties.STYLESHEET_MODEL_META_TO_MARKDOWN));
                return;
            }
			// otherwise
            System.out.println("Parsing using Document Object Model (DOM) based X3DLoaderDOM...");
            X3DLoaderDOM x3dLoader = new X3DLoaderDOM();
            boolean successfulLoad = x3dLoader.loadModelFromFileX3D(         sourceFileName);
//          boolean successfulLoad = x3dLoader.loadModelFromFileX3D(new File(sourceFileName)); // alternate form, tested OK

            if (successfulLoad && x3dLoader.isLoadSuccessful()) // two equivalent ways to check
            {
				ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version
                resultFile = new File(tempFileName); // unsaved
                try
				{
                    //debug
//                  System.out.println("loadedX3dModel initialization:");
//                  System.out.println(loadedX3dModel.toStringX3D());
                    
                    X3DConcreteElement x3dConcreteElement = x3dLoader.getX3dObjectTree();

                    if (x3dConcreteElement instanceof X3DObject)
                    {
                        loadedX3dModel = (X3DObject)x3dConcreteElement;
                    }
                    else if (x3dConcreteElement == null)
                    {
                        System.out.println(ERROR+"TODO problem with X3dLoader, x3dConcreteElement is null.");
                        return;
                    }
                    else
                    {
                        System.out.println(ERROR+"TODO problem with X3dLoader, result has type " + x3dConcreteElement.getClass().getCanonicalName());
                        return;
                    }
/* moved to direct file conversion:
                    if (convertToHTML) // pretty-print documentation
                    {
                        System.out.println("convert to " + conversionExtension + " pretty-print documentation");
                // TODO refactor if input file provided
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                             resultFile =       loadedX3dModel.toFileHtmlDocumentation (resultFileName);
                        else System.out.println(loadedX3dModel.toStringHtmlDocumentation());
                    }
                    else if (convertToVRML97)
                    {
                        System.out.println("convert to VRML97:");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileVRML97 (resultFileName);
                        else System.out.println(loadedX3dModel.toStringVRML97());
                    }
                    else if (convertToClassicVRML)
                    {
                        System.out.println("convert to ClassicVRML:");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileClassicVRML (resultFileName);
                        else System.out.println(loadedX3dModel.toStringClassicVRML());
                    }
                    else if (convertToJava)
                    {
                        String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                	ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                        System.out.println("convert to Java:");
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileJava (resultFileName);
                        else System.out.println(loadedX3dModel.toStringJava());
                	ConfigurationProperties.setXsltEngine(presetXsltEngine);
                    }
                    else if (convertToJSON)
                    {
                        String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                	ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                        System.out.println("convert to JSON:");
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileJSON (resultFileName);
                        else System.out.println(loadedX3dModel.toStringJSON());
                	ConfigurationProperties.setXsltEngine(presetXsltEngine);
                    }
                    else if (convertToPython)
                    {
                        String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                	ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                        System.out.println("convert to Python:");
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFilePython (resultFileName);
                        else System.out.println(loadedX3dModel.toStringPython());
                	ConfigurationProperties.setXsltEngine(presetXsltEngine);
                    }
                    else if (convertToMarkdown) // model meta information
                    {
                        System.out.println("convert to " + conversionExtension + " model meta information markdown, include subdirectories in meta links: " + includeSubdirectoryPaths);
                        loadedX3dModel.setIncludeSubdirectoryPaths(includeSubdirectoryPaths);
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                             resultFile =       loadedX3dModel.toFileModelMetaMarkdown (resultFileName);
                        else System.out.println(loadedX3dModel.toStringModelMetaMarkdown());
                    }
                    else if (convertToTidy)
                    {
                        System.out.println("convert to version cleaned up by X3D Tidy");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                             resultFile =       loadedX3dModel.toFileX3dTidy (resultFileName);
                        else System.out.println(loadedX3dModel.toStringX3dTidy());
                    }
                    else
*/
                    if (convertToJS)
                    {
                        String presetXsltEngine = ConfigurationProperties.getXsltEngine();
                	ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                        System.out.println("convert to JS JavaScript:");
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileJavaScript (resultFileName);
                        else System.out.println(loadedX3dModel.toStringJavaScript());
                	ConfigurationProperties.setXsltEngine(presetXsltEngine);
                    }
                    else if (convertToX3D)
                    {
                        System.out.println("convert to X3D:");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileX3D (resultFileName);
                        else System.out.println(loadedX3dModel.toStringX3D());
                    }
                    else if (convertToXML)
                    {
                        System.out.println("convert to XML:");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                             resultFile =       loadedX3dModel.toFileXML (resultFileName);
                        else System.out.println(loadedX3dModel.toStringXML());
                    }
                    else if (convertToX3DOM)
                    {
                        System.out.println("convert to X3DOM:");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileX3DOM (resultFileName);
                        else System.out.println(loadedX3dModel.toStringX3DOM());
                    }
                    else if (convertToX_ITE)
                    {
                        System.out.println("convert to X_ITE:");
                        if (!convertToFile) System.out.println();
                        if  (convertToFile)
                              resultFile =      loadedX3dModel.toFileX_ITE  (sourceFileName, resultFileName);
                        else System.out.println(loadedX3dModel.toStringX_ITE(sourceFileName));
                    }
                    else if (convertToEXI)
                    {
                        System.out.println("convert to EXI using " + ConfigurationProperties.getExiEngine() + ":");
                        System.out.println("source: " + sourceFileName + " filesize " + sourceFileLength + " bytes");
//						System.out.println("[trace] sourceFileName=" + sourceFileName + ", resultFileName=" + resultFileName);
                        resultFile = loadedX3dModel.toFileEXI (resultFileName);
						compressionRatio = formatPrecision2.format((double)resultFile.length()/(double)sourceFileLength * 100.0);
						System.out.println("result: " + resultFile.getName() + " filesize " + resultFile.length() + " bytes, compression " + compressionRatio + "% of original");
                    }
                    else if (convertToGZIP)
                    {
                        System.out.println("convert to GZIP:");
                        System.out.println("source: " + sourceFileName + " filesize " + sourceFileLength + " bytes");
//						System.out.println("[trace] sourceFileName=" + sourceFileName + ", resultFileName=" + resultFileName);
                        resultFile = loadedX3dModel.toFileGZIP (resultFileName);
						compressionRatio = formatPrecision2.format((double)resultFile.length()/(double)sourceFileLength * 100.0);
						System.out.println("result: " + resultFile.getName() + "  filesize " + resultFile.length() + " bytes, compression " + compressionRatio + "% of original");
                    }
                    else if (convertToZIP)
                    {
                        System.out.println("convert to ZIP:");
                        System.out.println("source: " + sourceFileName + " filesize " + sourceFileLength + " bytes");
//						System.out.println("[trace] sourceFileName=" + sourceFileName + ", resultFileName=" + resultFileName);
                        resultFile = loadedX3dModel.toFileZIP (resultFileName, sourceFileName);
						compressionRatio = formatPrecision2.format((double)resultFile.length()/(double)sourceFileLength * 100.0);
						System.out.println("result: " + resultFile.getName() + " filesize " + resultFile.length() + " bytes, compression " + compressionRatio + "% of original");
                    }
                    if (validateSwitch)
                    {
						// note that validation already performed as part of prior conversions
                        String outputValidationText = loadedX3dModel.validate();
                            
                        if (!convertToFile)
                        {
                            if (outputValidationText.isEmpty())
							{
                                outputValidationText = "validate results: success, no problems noted";
								System.out.println(outputValidationText);
							}
                            else
							{
								System.out.println(    "validate results:");
								System.out.println(outputValidationText);
							}
                            return;
                        }
                        else if (convertToFile && outputValidationText.isEmpty())
                        {
                            outputValidationText = "success, no problems noted, no output file written";
                            System.out.println(outputValidationText);
                            return;
                        }
                        else if (convertToFile)
                        {
                            if (!resultFileName.endsWith(X3DObject.FILE_EXTENSION_TEXT))
                            {
                                resultFileName += X3DObject.FILE_EXTENSION_TEXT;
                            }
                            Path outputFilePath = Paths.get(resultFileName);
                            String  errorNotice = new String();
                            if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
                            {
                                errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
                            }
                            System.out.println (errorNotice);

                            try // successful validation results in empty file
                            {
                                Path directoryPath = outputFilePath.getParent();
                                if ((directoryPath != null))
                                     Files.createDirectories(directoryPath); // if needed
                                bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
                                bufferedWriter.write(outputValidationText, 0, outputValidationText.length());
                                bufferedWriter.close(); // ensure file writing is complete
                                outputFilePath.toFile(); // success
                            }
                            catch (IOException exception)
                            {
                                exception.printStackTrace();
                                throw new X3DException(ERROR+"IOException for resultFileName " + resultFileName + ", unable to save file: " + exception);
                            }
                        }
                    }
                    if      (convertToEXI || convertToGZIP || convertToZIP)
                    {
							// done
					}
                    else if (convertToFile && resultFile.exists() && !resultFile.getName().equals(tempFileName))
                             System.out.println("file conversion successful: " + resultFile.getName() + " (" + resultFile.length() + " bytes)");
                    else if (convertToFile)
                             System.out.println(ERROR+"file conversion unsuccessful!");
                    else if (validateSwitch)
                             System.out.println("model validation complete.");
                }
                catch (X3DException e)
                {
                    e.printStackTrace();
                    System.out.println(ERROR+"TODO must fix model - problem handling local exception within CommandLine, exiting.");
                //  return;
                }
            }
            else
            {
                System.out.println(ERROR+"Source model file load unsuccessful");
            //  return;
            }
		}
        // sourceFileName.isEmpty()
		else if (!loadProperties) // allow testing of properties without file operations
        {
            System.out.println(ERROR+"Source model file name is empty, therefore file loading not possible.");
        //  return;
        }
		if (resultFile.getName().equals(tempFileName))
			resultFile.delete();
    }

    /** Open X3DJSAIL Javadoc
     * @see <a href="javadoc/index.html">X3DJSAIL Javadoc (relative)</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/index.html">X3DJSAIL Javadoc (online)</a>
     * @see <a href="https://www.web3d.org/specifications/java/X3DJSAIL.html">https://www.web3d.org/specifications/java/X3DJSAIL.html</a>
     */
    public static void openJavadocX3DJSAIL ()
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        String onlineURL = ConfigurationProperties.URL_X3DJSAIL.substring(0,ConfigurationProperties.URL_X3DJSAIL.lastIndexOf("/")+1)
                                + "javadoc/index.html";
        try {
            if (Desktop.isDesktopSupported())
            {
                Desktop.getDesktop().browse(new URI("javadoc/index.html"));
            }
            else
            {
                System.out.println ("Java Desktop not supported, cannot open");
                System.out.println ("  " + onlineURL);
            }
        }
        catch (IOException | URISyntaxException e1)
        {
//         System.out.println ("Local url failure: " + e1.getMessage()); // debug
           try {
                Desktop.getDesktop().browse(new URI(onlineURL));
           }
           catch (IOException | URISyntaxException e2)
           {
                System.out.println ("URL_X3DJSAIL Javadoc: " + onlineURL);
                System.out.println ("URL_X3DJSAIL failure: " + e2.getMessage());
           }
        }
    }

    /** Open X3DJSAIL page
     * @see <a href="https://www.web3d.org/specifications/java/X3DJSAIL.html">https://www.web3d.org/specifications/java/X3DJSAIL.html</a>
     */
    public static void openHomePageX3DJSAIL ()
    {
         openHomePageX3DJSAIL (""); // relay invocation, no bookmark
    }

    /** Open X3DJSAIL page at a given bookmark
	 * @param bookmark anchor bookmark of interest for this page
     * @see <a href="https://www.web3d.org/specifications/java/X3DJSAIL.html">https://www.web3d.org/specifications/java/X3DJSAIL.html</a>
     */
    public static void openHomePageX3DJSAIL (String bookmark)
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        try {
            if (Desktop.isDesktopSupported())
            {
                 if ((bookmark != null) && !bookmark.isEmpty())
                      Desktop.getDesktop().browse(new URI("X3DJSAIL.html" + "#" + bookmark));
                 else Desktop.getDesktop().browse(new URI("X3DJSAIL.html"));
            }
            else
            {
                System.out.println ("Java Desktop not supported, cannot open X3DJSAIL.html");
            }
        }
        catch (IOException | URISyntaxException e1)
        {
//         System.out.println ("Local url failure: " + e1.getMessage()); // debug
           try {
               if ((bookmark != null) && !bookmark.isEmpty())
                    Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DJSAIL + "#" + bookmark));
               else Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DJSAIL));
           }
           catch (IOException | URISyntaxException e2)
           {
               if ((bookmark != null) && !bookmark.isEmpty())
                    System.out.println ("URL_X3DJSAIL: " + ConfigurationProperties.URL_X3DJSAIL + "#" + bookmark);
               else System.out.println ("URL_X3DJSAIL: " + ConfigurationProperties.URL_X3DJSAIL);
               System.out.println ("URL_X3DJSAIL failure: " + e2.getMessage());
           }
        }
    }

    /** Open X3D Resources page
     * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html">https://www.web3d.org/x3d/content/examples/X3dResources.html</a>
     */
    public static void openX3dResourcesPage ()
    {
         openX3dResourcesPage (""); // no bookmark
    }

    /** Open X3D Resources page at a given bookmark
	 * @param bookmark anchor bookmark of interest for this page
     * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html">https://www.web3d.org/x3d/content/examples/X3dResources.html</a>
     */
    public static void openX3dResourcesPage (String bookmark)
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        try {
            if (Desktop.isDesktopSupported())
            {
                if ((bookmark != null) && !bookmark.isEmpty())
                     Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DRESOURCES + "#" + bookmark));
                else Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DRESOURCES));
            }
        }
        catch (IOException | URISyntaxException e2)
        {
            if ((bookmark != null) && !bookmark.isEmpty())
                 System.out.println ("URL_X3DJSAIL: " + ConfigurationProperties.URL_X3DRESOURCES + "#" + bookmark);
            else System.out.println ("URL_X3DJSAIL: " + ConfigurationProperties.URL_X3DRESOURCES);

            System.out.println ("URL_X3DJSAIL failure: " + e2.getMessage());
        }
    }

    /** Open X3D Tooltips page
     * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html">X3D Tooltips</a>
     */
    public static void openX3dTooltipsPage ()
    {
         openX3dTooltipsPage (""); // no bookmark
    }

    /** Open X3D Tooltips page at a given bookmark
	 * @param bookmark anchor bookmark of interest for this page
     * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html">X3D Tooltips</a>
     */
    public static void openX3dTooltipsPage (String bookmark)
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        
        try {
            if (Desktop.isDesktopSupported())
            {
                if ((bookmark != null) && !bookmark.isEmpty())
                     Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DTOOLTIPS + "#" + bookmark));
                else Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DTOOLTIPS));
            }
        }
        catch (IOException | URISyntaxException e2)
        {
            if ((bookmark != null) && !bookmark.isEmpty())
                 System.out.println ("URL_X3DTOOLTIPS: " + ConfigurationProperties.URL_X3DTOOLTIPS + "#" + bookmark);
            else System.out.println ("URL_X3DTOOLTIPS: " + ConfigurationProperties.URL_X3DTOOLTIPS );

            System.out.println ("URL_X3DTOOLTIPS failure: " + e2.getMessage());
        }
    }

    /** Open X3D Regexes page
     * @see <a href="https://www.web3d.org/specifications/X3dRegularExpressions.html">X3D Regular Expressions (regexes)</a>
     */
    public static void openX3dRegexesPage ()
    {
         openX3dRegexesPage (""); // no bookmark
    }

    /** Open X3D Regex page at a given bookmark
	 * @param bookmark anchor bookmark of interest for this page
     * @see <a href="https://www.web3d.org/specifications/X3dRegularExpressions.html">X3D Regular Expressions (regexes)</a>
     * @see ConfigurationProperties#URL_X3DREGEXES
     */
    public static void openX3dRegexesPage (String bookmark)
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        
        try {
            if (Desktop.isDesktopSupported())
            {
                if ((bookmark != null) && !bookmark.isEmpty())
                     Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DREGEXES + "#" + bookmark));
                else Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DREGEXES));
            }
        }
        catch (IOException | URISyntaxException e2)
        {
            if ((bookmark != null) && !bookmark.isEmpty())
                 System.out.println ("URL_X3DREGEXES: " + ConfigurationProperties.URL_X3DREGEXES + "#" + bookmark);
            else System.out.println ("URL_X3DREGEXES: " + ConfigurationProperties.URL_X3DREGEXES );

            System.out.println ("URL_X3DREGEXES failure: " + e2.getMessage());
        }
    }

    /** Open X3D Unified Object Model (X3DUOM) page
     * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html">X3D Tooltips</a>
     */
    public static void openX3DUOMpage ()
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        
        try {
            if (Desktop.isDesktopSupported())
            {
                Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DUOM));
            }
        }
        catch (IOException | URISyntaxException e2)
        {
            System.out.println ("URL_X3DUOM: " + ConfigurationProperties.URL_X3DUOM );

            System.out.println ("URL_X3DUOM failure: " + e2.getMessage());
        }
    }

    /** Open X3D Scene Authoring Hints page
     * @see <a href="https://www.web3d.org/x3d/tooltips/X3dSceneAuthoringHints.html">X3D Scene Authoring Hints</a>
     */
    public static void openX3dSceneAuthoringHintsPage ()
    {
         openX3dSceneAuthoringHintsPage (""); // no bookmark
    }

    /** Open X3D Scene Authoring Hints page at a given bookmark
	 * @param bookmark anchor bookmark of interest for this page
     * @see <a href="https://www.web3d.org/x3d/tooltips/X3dSceneAuthoringHints.html">X3D Scene Authoring Hints</a>
     */
    public static void openX3dSceneAuthoringHintsPage (String bookmark)
    {
        // https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
        
        try {
            if (Desktop.isDesktopSupported())
            {
                if ((bookmark != null) && !bookmark.isEmpty())
                     Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DSCENEAUTHORINGHINTS + "#" + bookmark));
                else Desktop.getDesktop().browse(new URI(ConfigurationProperties.URL_X3DSCENEAUTHORINGHINTS));
            }
        }
        catch (IOException | URISyntaxException e2)
        {
            if ((bookmark != null) && !bookmark.isEmpty())
                 System.out.println ("URL_X3DSCENEAUTHORINGHINTS: " + ConfigurationProperties.URL_X3DSCENEAUTHORINGHINTS + "#" + bookmark);
            else System.out.println ("URL_X3DSCENEAUTHORINGHINTS: " + ConfigurationProperties.URL_X3DSCENEAUTHORINGHINTS );

            System.out.println ("URL_X3DSCENEAUTHORINGHINTS failure: " + e2.getMessage());
        }
    }

    /** 
     * Reset all conversions switches to default (false)
     * @param newCommand provides diagnostic message when prior command gets overridden 
     */
    private static void clearPriorConversionSwitches(String newCommand)
    {
        if (convertToVRML97 || convertToClassicVRML || convertToX3D    || convertToXML || convertToHTML  || convertToMarkdown ||
            convertToTidy   || convertToJava        || convertToPython || convertToJSON || convertToJS  || convertToX3DOM || convertToX_ITE)
            System.out.println(WARNING+"Prior conversion flag overridden by " + newCommand);
            
        convertToVRML97          = false;
        convertToClassicVRML     = false;
        convertToX3D             = false;
        convertToXML             = false;
        convertToHTML            = false;
        convertToMarkdown        = false;
        includeSubdirectoryPaths = true;  // model meta information, special switch for ModelExchange
        convertToTidy            = false;
        convertToJava            = false;
        convertToJS              = false;
        convertToJSON            = false;
        convertToPython            = false;
        convertToX3DOM           = false;
        convertToX_ITE           = false;
    }
    
    /** 
     * Load file and apply stylesheet conversion to indicated path, return result as file.
     * @param  inputFilePath path and name of XML inputFile
     * @param stylesheetName XSLT stylesheet to apply
     * @param outputFileName path and name of resulting outputFile
     * @return output file (if any)
     */
    public static File fileStylesheetConversion(String inputFilePath, String stylesheetName, String outputFileName)
    {
        File  inputFile = new File (inputFilePath);
        return fileStylesheetConversion(inputFile, stylesheetName, outputFileName);
    }
    
    /** 
     * Convert file using stylesheet, return result.
     * @param  inputFile XML inputFile
     * @param stylesheetName XSLT stylesheet to apply
     * @return output result (if any)
     */
    public static String fileStylesheetConversionToString(File inputFile, String stylesheetName)
    {
		String errorNotice = new String();
        String fileNameRoot  = "tempFile";
        String fileExtension = ConfigurationProperties.getExpectedOutputFileExtension(stylesheetName);
        String fileName = fileNameRoot + fileExtension;
        
        File outputFile;
        String resultText = new String();
        try
        {
            outputFile = File.createTempFile(fileNameRoot, fileExtension);
            if (outputFile == null)
            {
            	errorNotice += "outputFile not created: " + fileName + ", ";
            }
            else
            {
//              if (!outputFile.canWrite())
//                  errorNotice += "outputFile not writable: " + outputFile.getAbsolutePath() + ", ";
                outputFile.deleteOnExit();
            }
            fileStylesheetConversion(inputFile, stylesheetName, outputFile.getAbsolutePath());
            
            // http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
            // http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
//            Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"

//            byte[] encoded = Files.readAllBytes(Paths.get(outputFile.getAbsolutePath()));
//            resultText = new String(encoded, charset);
            resultText = getFileContents(outputFile);
        }
        catch (IOException ex)
        {
            errorNotice += "IOException: " + ex.getMessage();
            ex.printStackTrace();
        }
        if (!errorNotice.isEmpty())
            System.out.println (errorNotice);
        return resultText;
    }

    // see toFileStylesheetConversion() for related code
    /** 
     * Convert file using stylesheet, return result.
     * @param  inputFile XML inputFile
     * @param stylesheetName XSLT stylesheet to apply
     * @param outputFileName path and name of resulting outputFile
     * @return output file (if any)
     */
    public static File fileStylesheetConversion(File inputFile, String stylesheetName, String outputFileName)
    {
    // , String parameterName1, String parameterValue1, String parameterName2, String parameterValue2
        String parameterName1  = new String();
        String parameterValue1 = new String();
        String parameterName2  = new String();
        String parameterValue2 = new String();
		String errorNotice = new String();
        
		if ((inputFile == null || !inputFile.isFile() || !inputFile.canRead()))
		{
			throw new X3DException("fileStylesheetConversion(inputFile, stylesheetName, outputFileName) inputFile not provided");
		}
        
		if ((stylesheetName == null || stylesheetName.isEmpty()))
		{
			throw new X3DException("fileStylesheetConversion(stylesheetName, fileName) stylesheetName not provided;" +
				" (see ConfigurationProperties for allowed choices)");
		}
        else if (!ConfigurationProperties.isStylesheetSupported(stylesheetName))
		{
			throw new X3DException("fileStylesheetConversion(stylesheetName, fileName) stylesheetName not recognized;" +
				" (see ConfigurationProperties for allowed choices)");
		}
        String expectedFileNameExtension = ConfigurationProperties.getExpectedOutputFileExtension(stylesheetName);

		if ((outputFileName == null || outputFileName.isEmpty()))
		{
			throw new X3DException("toFileStylesheetConversionToFile(" + inputFile.getName() + "', " + stylesheetName + "', " +
                                    outputFileName + ") outputFileName not provided");
		}
		if (!((outputFileName.endsWith(expectedFileNameExtension)) || // some variations allowed
              (outputFileName.endsWith(X3DObject.FILE_EXTENSION_XHTML)      && expectedFileNameExtension.equals(X3DObject.FILE_EXTENSION_HTML)) ||
              (outputFileName.endsWith(X3DObject.FILE_EXTENSION_JAVASCRIPT) && expectedFileNameExtension.equals(X3DObject.FILE_EXTENSION_JSON))))
		{
			throw new X3DException("outputFileName " + outputFileName + " does not end with expected extension \"" + expectedFileNameExtension + "\"");
		}
		
		Path outputFilePath = Paths.get(outputFileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		// http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
		// http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
		Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"
        
        File outputFile = outputFilePath.toFile();
        if (outputFile == null)
        {
                errorNotice += "outputFile not created: " + outputFilePath.getFileName() + ", ";
        }
//      else if (!outputFile.canWrite())
//              errorNotice += "outputFile not writable: " + outputFile.getAbsolutePath() + ", ";
        
		else if (outputFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
		{
			errorNotice += "Warning: fileStylesheetConversion() is overwriting prior file " + outputFilePath;
		}
		else if  (outputFile.exists())
		{
			System.out.println ("Warning: fileStylesheetConversion() is not allowed to overwrite prior file: " + outputFilePath);
			System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
			return null;
		}
		
        // convert file using stylesheet, collect result
		try // https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html
		{
            File stylesheetFile = X3DObject.getTempFileFromX3dJsailJar("/stylesheets", stylesheetName);
            if      (stylesheetFile == null)
				errorNotice += "Temporary stylesheet not created: " + stylesheetName + ", ";
            else if (!stylesheetFile.exists())
				errorNotice += "Temporary stylesheet not found: " + stylesheetFile.getAbsolutePath() + ", ";
            
            if (stylesheetName.equalsIgnoreCase(ConfigurationProperties.STYLESHEET_X3DV_CLASSICVRML))
            {
                // special handling required in temp directory since STYLESHEET_X3DV_CLASSICVRML imports STYLESHEET_VRML97
                File stylesheetFile2 = X3DObject.getTempFileFromX3dJsailJar("/stylesheets", ConfigurationProperties.STYLESHEET_VRML97);
                if      (stylesheetFile2 == null)
                    errorNotice += "Temporary stylesheet not created: " + ConfigurationProperties.STYLESHEET_VRML97 + ", ";
                else if (!stylesheetFile2.exists())
                    errorNotice += "Temporary stylesheet not found: " + stylesheetFile2.getAbsolutePath() + ", ";
                
                // file copy in order to de-mung the temporary filename
                File   stylesheetFile3 = new File (stylesheetFile.getParent(), ConfigurationProperties.STYLESHEET_VRML97);
                String targetPath = stylesheetFile3.getAbsolutePath();
                if (stylesheetFile3.exists())
                    stylesheetFile3.delete(); // allow overwriting temporary-director stylesheet as needed
                Files.copy (Paths.get(stylesheetFile2.getAbsolutePath()), Paths.get(targetPath));
            }
            
            if (ConfigurationProperties.getXsltEngine().equals(ConfigurationProperties.XSLT_ENGINE_SAXON))
			{
				// reference: Saxon-HE 9.7 documentation and samples
				// S9APIExamples.jsail: private static class TransformA implements S9APIExamples.Test

				Processor           processor = new Processor(false);
				XsltCompiler     xsltCompiler = processor.newXsltCompiler();
				XsltExecutable xsltExecutable = xsltCompiler.compile (new StreamSource(stylesheetFile));// this call might  fail

				XdmNode source = processor.newDocumentBuilder().build(new StreamSource(inputFile));
				Serializer out = processor.newSerializer(outputFile);
				out.setOutputProperty(Serializer.Property.METHOD, "html");
				out.setOutputProperty(Serializer.Property.INDENT, "yes");
				XsltTransformer xsltTransformer = xsltExecutable.load();
				xsltTransformer.setInitialContextNode(source);
				xsltTransformer.setDestination(out);
				if (parameterName1.length() > 0)
					xsltTransformer.setParameter(new QName(parameterName1), new XdmAtomicValue(parameterValue1));
				if (parameterName2.length() > 0)
					xsltTransformer.setParameter(new QName(parameterName2), new XdmAtomicValue(parameterValue2));
                
                xsltTransformer.setParameter(new QName("produceSVGfigures"), new XdmAtomicValue("false"));
                xsltTransformer.transform();
			}
			else if (ConfigurationProperties.getXsltEngine().equals(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA))
			{
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    //          factory.setNamespaceAware(true);
    //          factory.setValidating    (true);

				DocumentBuilder builder = factory.newDocumentBuilder();
				Document x3dDocument = builder.parse(inputFile);
				TransformerFactory tFactory = TransformerFactory.newInstance();
                StreamSource styleStreamSource;
                styleStreamSource = new StreamSource(stylesheetFile);// this call might  fail
				Transformer transformer = tFactory.newTransformer(styleStreamSource);
				if (parameterName1.length() > 0)
					transformer.setParameter(parameterName1, parameterValue1);
				if (parameterName2.length() > 0)
					transformer.setParameter(parameterName2, parameterValue2);
                transformer.setParameter("produceSVGfigures", "false");

				DOMSource       domSource = new DOMSource(x3dDocument);
                // https://stackoverflow.com/questions/23219728/convert-streamresult-to-string-or-xml
//                StringWriter writer = new StringWriter();
                // https://stackoverflow.com/questions/1937684/java-saving-streamresult-to-a-file
				StreamResult streamResult = new StreamResult(outputFile);
				transformer.transform(domSource, streamResult);
			}
			else // no joy
			{
				errorNotice = "Invalid ConfigurationProperties.getXsltEngine() value='" + ConfigurationProperties.getXsltEngine() + 
									 "', legal values are ConfigurationProperties.XSLT_ENGINE_SAXON or ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA";
//				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldValueException(errorNotice);
			}
            if (!errorNotice.isEmpty())
                System.out.println (errorNotice);
            return outputFile;
		}
		catch (IOException | ParserConfigurationException | TransformerException | SAXException exception)
		{
			throw new X3DException(errorNotice + exception.toString() + " exception when transforming and creating string, unable to save result: " + exception);
		}
		catch (SaxonApiException saxonApiException)
		{
//			Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, saxonApiException);
										
			throw new X3DException(errorNotice + "SaxonApiException when transforming and creating string, unable to save result: " + saxonApiException);
		}
//        String resultText = fileStylesheetConversionToString(inputFile, stylesheetName);
//
//		try // put result in outputFile
//		{
//			Path directoryPath = outputFilePath.getParent();
//			if ((directoryPath != null))
//				 Files.createDirectories(directoryPath); // if needed
//			bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
//			bufferedWriter.write(resultText, 0, resultText.length());
//			bufferedWriter.close(); // ensure file writing is complete
//			return outputFilePath.toFile(); // success
//		}
//		catch (IOException exception)
//		{
//			exception.printStackTrace();
//			throw new X3DException("IOException for fileName " + outputFilePath + ", unable to save file: " + exception);
//		}
    }
    /**
     * Retrieve file contents as a string.
     * @param inputFileName name of file of interest
     * @return file contents as string
     */
    protected static String getFileContents (String inputFileName)
    {
        File inputFile = new File(inputFileName);
        return getFileContents (inputFile);
    }
    /**
     * Retrieve file contents as a string.
     * @param inputFile file of interest
     * @return file contents as string
     */
    protected static String getFileContents (File inputFile)
    {
        // http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
        // http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
        Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"

        try
        {
            //  open file, get scene string
            byte[] encoded = Files.readAllBytes(Paths.get(inputFile.getAbsolutePath()));
            String sourceString = new String(encoded, charset);
            return sourceString;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            String inputFileName = "[null]";
            if    (inputFile    != null)
                   inputFileName = inputFile.getPath();
            throw new X3DException(ERROR+"CommandLine.getFileContents(" + inputFileName + ") IOException for inputFile " + inputFile + ", unable to read file: " + ex);
        }
    }
}
