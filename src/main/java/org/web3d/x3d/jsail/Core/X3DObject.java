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

package org.web3d.x3d.jsail.Core;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.*; // again making sure #2

// X3DObject imports ========================
// Base classes and SAX reader for EXIFICIENT
import com.siemens.ct.exi.CodingMode;
import com.siemens.ct.exi.EXIFactory;
import com.siemens.ct.exi.GrammarFactory;
import com.siemens.ct.exi.api.sax.EXIResult;
import com.siemens.ct.exi.api.sax.EXISource;
import com.siemens.ct.exi.exceptions.EXIException;
import com.siemens.ct.exi.grammars.Grammars;
import com.siemens.ct.exi.helpers.DefaultEXIFactory;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/* Base classes and SAX reader for OPENEXI */
import org.openexi.proc.common.AlignmentType;
import org.openexi.proc.common.EXIOptionsException;
import org.openexi.proc.common.GrammarOptions;
import org.openexi.proc.grammars.GrammarCache;
import org.openexi.sax.Transmogrifier;
import org.openexi.sax.TransmogrifierException;
import org.openexi.schema.EXISchema;
import org.openexi.scomp.EXISchemaFactoryException;
import org.openexi.scomp.EXISchemaReader;
import org.xml.sax.InputSource;
import javax.xml.parsers.SAXParser;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import org.openexi.sax.EXIReader;

// File operations
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.*;
import java.util.zip.*;

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

/*
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
*/
import org.web3d.x3d.util.exi.SerializeEXISchema;

import java.util.Arrays;
import org.web3d.x3d.sai.Core.*;  // making sure #3
import org.web3d.x3d.jsail.*;
import org.web3d.x3d.jsail.Core.*;

import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * X3D is the root node for an Extensible 3D (X3D) Graphics model. This concrete class represents an X3D statement.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] X3D is the top-most XML element for an Extensible 3D (X3D) Graphics model. The X3D element contains a single head element for metadata, and a single Scene element which is root node of the 3D scene graph.
 * <ul>
 *  <li> <i>Hint:</i> for more on XML declaration and DOCTYPE (DTD) statements, see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation</a> </li> 
 *  <li> <i>Hint:</i> additional attributes are under consideration for use when embedding X3D version 4 scenes within HTML version 5 web pages. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 7.2.5.2 Header statement <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#HeaderStatement" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#HeaderStatement</a> </li> 
 * </ul>
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Header" target="blank">X3D Abstract Specification: X3D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#X3D" target="_blank">X3D Tooltips: X3D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class X3DObject extends org.web3d.x3d.jsail.X3DConcreteStatement
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=head, @type=SFNode, $javaType=headObject, $javaReferenceType=headObject, $javaPrimitiveType=headObject, $normalizedMemberObjectName=head, $isX3dStatement=true, @acceptableNodeTypes=head */ 
	private headObject head; // SFNode acceptable node types: head or ProtoInstanceObject

 /* @name=profile, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=profile, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String profile; // SFString

 /* @name=Scene, @type=SFNode, $javaType=SceneObject, $javaReferenceType=SceneObject, $javaPrimitiveType=SceneObject, $normalizedMemberObjectName=Scene, $isX3dStatement=true, @acceptableNodeTypes=Scene */ 
	private SceneObject Scene; // SFNode acceptable node types: Scene or ProtoInstanceObject

 /* @name=version, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=version, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String version; // SFString

	/** XML declaration appears on first line of an XML document.
	 * <br> <i>&lt;?xml version="1.0" encoding="UTF-8"?&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
					
	/** XML document type declaration. DOCTYPE supports element/attribute structural validation and follows the initial XML declaration, before the first element in an XML document.
	 * <br> <i>&lt;?DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 4.1//EN" "http://www.web3d.org/specifications/x3d-4.1.dtd"&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_DOCTYPE_X3D_4_1 = "<!DOCTYPE X3D PUBLIC \"ISO//Web3D//DTD X3D 4.1//EN\" \"http://www.web3d.org/specifications/x3d-4.1.dtd\">";
	
	/** XML document type declaration. DOCTYPE supports element/attribute structural validation and follows the initial XML declaration, before the first element in an XML document.
	 * <i>&lt;?DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 4.0//EN" "http://www.web3d.org/specifications/x3d-4.0.dtd"&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_DOCTYPE_X3D_4_0 = "<!DOCTYPE X3D PUBLIC \"ISO//Web3D//DTD X3D 4.0//EN\" \"http://www.web3d.org/specifications/x3d-4.0.dtd\">";
	
	/** XML document type declaration. DOCTYPE supports element/attribute structural validation and follows the initial XML declaration, before the first element in an XML document.
	 * <br> <i>&lt;?DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.3//EN" "http://www.web3d.org/specifications/x3d-3.3.dtd"&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_DOCTYPE_X3D_3_3 = "<!DOCTYPE X3D PUBLIC \"ISO//Web3D//DTD X3D 3.3//EN\" \"http://www.web3d.org/specifications/x3d-3.3.dtd\">";
	
	/** XML document type declaration. DOCTYPE supports element/attribute structural validation and follows the initial XML declaration, before the first element in an XML document.
	 * <br> <i>&lt;?DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.2//EN" "http://www.web3d.org/specifications/x3d-3.2.dtd"&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_DOCTYPE_X3D_3_2 = "<!DOCTYPE X3D PUBLIC \"ISO//Web3D//DTD X3D 3.2//EN\" \"http://www.web3d.org/specifications/x3d-3.2.dtd\">";
	
	/** XML document type declaration. DOCTYPE supports element/attribute structural validation and follows the initial XML declaration, before the first element in an XML document.
	 * <br> <i>&lt;?DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.1//EN" "http://www.web3d.org/specifications/x3d-3.1.dtd"&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_DOCTYPE_X3D_3_1 = "<!DOCTYPE X3D PUBLIC \"ISO//Web3D//DTD X3D 3.1//EN\" \"http://www.web3d.org/specifications/x3d-3.1.dtd\">";
	
	/** XML document type declaration. DOCTYPE supports element/attribute structural validation and follows the initial XML declaration, before the first element in an XML document.
	 * <br> <i>&lt;?DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.0//EN" "http://www.web3d.org/specifications/x3d-3.0.dtd"&gt;</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">W3C Recommendation, Extensible Markup Language (XML) 1.0 (Fifth Edition) section 2.8, Prolog and Document Type Declaration</a> */
	public static final String XML_DOCTYPE_X3D_3_0 = "<!DOCTYPE X3D PUBLIC \"ISO//Web3D//DTD X3D 3.0//EN\" \"http://www.web3d.org/specifications/x3d-3.0.dtd\">";

	/**
	 * XML Schema attributes for X3D element.
	 * <br> <i>xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.0.xsd'</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-1/#xsi_schemaLocation">W3C Recommendation, XML Schema Part 1, Structures Second Edition, Section 2.6.3 xsi:schemaLocation, xsi:noNamespaceSchemaLocation</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-0">W3C Recommendation, XML Schema Part 0: Primer Second Edition</a> */
	public static final String X3D_XML_SCHEMA_3_0_ATTRIBUTES = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.0.xsd'";
	/**
	 * XML Schema attributes for X3D element.
	 * <br> <i>xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.1.xsd'</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-1/#xsi_schemaLocation">W3C Recommendation, XML Schema Part 1, Structures Second Edition, Section 2.6.3 xsi:schemaLocation, xsi:noNamespaceSchemaLocation</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-0">W3C Recommendation, XML Schema Part 0: Primer Second Edition</a> */
	public static final String X3D_XML_SCHEMA_3_1_ATTRIBUTES = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.1.xsd'";
	/**
	 * XML Schema attributes for X3D element.
	 * <br> <i>xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.2.xsd'</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-1/#xsi_schemaLocation">W3C Recommendation, XML Schema Part 1, Structures Second Edition, Section 2.6.3 xsi:schemaLocation, xsi:noNamespaceSchemaLocation</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-0">W3C Recommendation, XML Schema Part 0: Primer Second Edition</a> */
	public static final String X3D_XML_SCHEMA_3_2_ATTRIBUTES = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.2.xsd'";
	/**
	 * XML Schema attributes for X3D element.
	 * <br> <i>xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.3.xsd'</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-1/#xsi_schemaLocation">W3C Recommendation, XML Schema Part 1, Structures Second Edition, Section 2.6.3 xsi:schemaLocation, xsi:noNamespaceSchemaLocation</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-0">W3C Recommendation, XML Schema Part 0: Primer Second Edition</a> */
	public static final String X3D_XML_SCHEMA_3_3_ATTRIBUTES = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.3.xsd'";
	/**
	 * XML Schema attributes for X3D element.
	 * <br> <i>xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-4.0.xsd'</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-1/#xsi_schemaLocation">W3C Recommendation, XML Schema Part 1, Structures Second Edition, Section 2.6.3 xsi:schemaLocation, xsi:noNamespaceSchemaLocation</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-0">W3C Recommendation, XML Schema Part 0: Primer Second Edition</a> */
	public static final String X3D_XML_SCHEMA_4_0_ATTRIBUTES = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-4.0.xsd'";
	/**  
	 * XML Schema attributes for X3D element.
	 * <br> <i>xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-4.1.xsd'</i>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Validation" target="_blank">X3D Scene Authoring Hints: Validation of X3D Scenes using DTD and XML Schema</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-1/#xsi_schemaLocation">W3C Recommendation, XML Schema Part 1, Structures Second Edition, Section 2.6.3 xsi:schemaLocation, xsi:noNamespaceSchemaLocation</a>
	 * @see <a href="https://www.w3.org/TR/xmlschema-0">W3C Recommendation, XML Schema Part 0: Primer Second Edition</a> */
	public static final String X3D_XML_SCHEMA_4_1_ATTRIBUTES = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-4.1.xsd'";


	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "Core", "Interchange", "CADInterchange", "Interactive", "Immersive", "MedicalInterchange", "MPEG4Interactive", "Full".
<br ><br >
	 * profileNameChoices enumeration constants are used to identify the profile for each scene-graph node, and also utilized by X3D element to identify the profile of a contained Scene. Profiles correspond primarily to subsets of allowed X3D nodes. Some nodes in Interchange profile include fields that are ignored unless Immersive or Full profile is active.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Profiles" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Profiles</a> 
	*/
	public static final ArrayList<String> profileNameChoices = new ArrayList<>(Arrays.<String>asList("Core", "Interchange", "CADInterchange", "Interactive", "Immersive", "MedicalInterchange", "MPEG4Interactive", "Full"));

	/** 
	 * <i>Tooltip:</i> Core Profile includes no nodes and is provided as the basis for custom componentization. Allowed X3D statements for all profiles are: connect ExternProtoDeclare EXPORT field fieldValue IMPORT IS ProtoBody ProtoDeclare ProtoInterface ProtoInstance ROUTE X3D. Allowed X3D nodes for this profile are: MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"Core"</i> (Java syntax) or <i>Core</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/coreprofile.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/coreprofile.html</a>  */
	public static final String PROFILE_CORE = "Core";

	/** 
	 * <i>Tooltip:</i> Interchange Profile equals the minimum subset of nodes needed to display lightweight compelling content. Allowed X3D nodes for this profile are: Appearance Background Box Color ColorInterpolator ColorRGBA Cone Coordinate CoordinateInterpolator Cylinder DirectionalLight Group ImageTexture IndexedFaceSet IndexedLineSet IndexedTriangleFanSet IndexedTriangleSet IndexedTriangleStripSet LineSet Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString MultiTexture MultiTextureCoordinate MultiTextureTransform NavigationInfo Normal NormalInterpolator OrientationInterpolator PixelTexture PointSet PositionInterpolator ScalarInterpolator Shape Sphere TextureCoordinate TextureCoordinateGenerator TextureTransform TimeSensor Transform TriangleFanSet TriangleSet TriangleStripSet Viewpoint WorldInfo.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"Interchange"</i> (Java syntax) or <i>Interchange</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interchange.html</a>  */
	public static final String PROFILE_INTERCHANGE = "Interchange";

	/** 
	 * <i>Tooltip:</i> CADInterchange Profile adds support for CADGeometry component nodes to Interchange Profile. Allowed X3D nodes for this profile are: Anchor Appearance CADAssembly CADFace CADLayer CADPart Billboard Collision Color ColorRGBA Coordinate DirectionalLight FragmentShader Group ImageTexture IndexedLineSet IndexedQuadSet IndexedTriangleFanSet IndexedTriangleSet IndexedTriangleStripSet Inline LineProperties LineSet LOD Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString MultiShader MultiTexture MultiTextureCoordinate MultiTextureTransform NavigationInfo Normal PixelTexture PointSet QuadSet Shader ShaderAppearance Shape TextureCoordinate TextureCoordinateGenerator TextureTransform Transform TriangleFanSet TriangleSet TriangleStripSet Viewpoint VertexShader WorldInfo.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"CADInterchange"</i> (Java syntax) or <i>CADInterchange</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/CADInterchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/CADInterchange.html</a>  */
	public static final String PROFILE_CADINTERCHANGE = "CADInterchange";

	/** 
	 * <i>Tooltip:</i> Interactive Profile adds interaction nodes (Anchor, KeySensor) to the minimum subset of nodes needed to display lightweight compelling content. Allowed X3D nodes for this profile are: Anchor Appearance Background BooleanFilter BooleanSequencer BooleanToggle BooleanTrigger Box Color ColorInterpolator ColorRGBA Cone Coordinate CoordinateInterpolator Cylinder CylinderSensor DirectionalLight ElevationGrid Group ImageTexture IndexedFaceSet IndexedLineSet IndexedTriangleFanSet IndexedTriangleSet IndexedTriangleStripSet Inline IntegerSequencer IntegerTrigger KeySensor LineSet Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString MultiTexture MultiTextureCoordinate MultiTextureTransform NavigationInfo Normal NormalInterpolator OrientationInterpolator IndexedTriangleStripSet Inline IntegerSequencer IntegerTrigger KeySensor LineSet Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString MultiTexture MultiTextureCoordinate MultiTextureTransform NavigationInfo Normal NormalInterpolator OrientationInterpolator PixelTexture PlaneSensor PointLight PointSet PositionInterpolator ProximitySensor ScalarInterpolator Shape Sphere SphereSensor SpotLight StringSensor Switch TextureCoordinate TextureCoordinateGenerator TextureTransform TimeSensor TimeTrigger TouchSensor Transform TriangleFanSet TriangleSet TriangleStripSet Viewpoint VisibilitySensor WorldInfo.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"Interactive"</i> (Java syntax) or <i>Interactive</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interactive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interactive.html</a>  */
	public static final String PROFILE_INTERACTIVE = "Interactive";

	/** 
	 * <i>Tooltip:</i> Immersive Profile equals all of the nodes in the VRML97 Specification, plus various X3D node additions including KeySensor, StringSensor and Scene. Allowed X3D nodes for this profile are: Anchor Appearance AudioClip Background Billboard BooleanFilter BooleanSequencer BooleanToggle BooleanTrigger Box Collision Color ColorInterpolator ColorRGBA Cone Coordinate CoordinateInterpolator Cylinder CylinderSensor DirectionalLight ElevationGrid Extrusion Fog FontStyle Group ImageTexture IndexedFaceSet IndexedLineSet IndexedTriangleFan IndexedTriangleSet IndexedTriangleStripSet Inline IntegerSequencer IntegerTrigger KeySensor LineProperties LineSet LoadSensor LOD Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString MovieTexture MultiTexture MultiTextureCoordinate MultiTextureTransform NavigationInfo Normal NormalInterpolator OrientationInterpolator PixelTexture PlaneSensor PointLight PointSet Polyline2D Polypoint2D PositionInterpolator ProximitySensor Rectangle2D ScalarInterpolator Script Shape Sound Sphere SphereSensor SpotLight StringSensor Switch Text TextureCoordinate TextureCoordinateGenerator TextureTransform TimeSensor TimeTrigger TouchSensor TriangleFanSet TriangleSet TriangleSet2D TriangleStripSet Transform Viewpoint VisibilitySensor WorldInfo.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"Immersive"</i> (Java syntax) or <i>Immersive</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/immersive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/immersive.html</a>  */
	public static final String PROFILE_IMMERSIVE = "Immersive";

	/** 
	 * <i>Tooltip:</i> The MedicalInterchange profile adds support for VolumeRendering component to Interchange profile. Allowed X3D nodes for this profile are: Anchor Arc2D ArcClose2D Appearance Background Billboard BlendedVolumeStyle BooleanFilter BooleanSequencer BooleanToggle BooleanTrigger BoundaryEnhancementVolumeStyle Box CartoonVolumeStyle Circle2D ClipPlane Collision Color ColorInterpolator ColorRGBA ComposedVolumeStyle CompositeTexture3D Cone Coordinate CoordinateDouble CoordinateInterpolator Cylinder DirectionalLight Disk2D EdgeEnhancementVolumeStyle FillProperties FontStyle Group ImageTexture ImageTexture3D IndexedFaceSet IndexedLineSet IndexedTriangleFanSet IndexedTriangleSet IndexedTriangleStripSet Inline IntegerSequencer IntegerTrigger IsoSurfaceVolumeData LineProperties LineSet LOD Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString MultiTexture MultiTextureCoordinate MultiTextureTransform NavigationInfo Normal NormalInterpolator OctTree OpacityMapVolumeStyle OrientationInterpolator OrthoViewpoint PixelTexture PixelTexture3D PointSet Polyline2D Polypoint2D PositionInterpolator ProjectionVolumeStyle Rectangle2D ScalarInterpolator SegmentedVolumeData ShadedVolumeStyle Shape SilhouetteEnhancementVolumeStyle Sphere StaticGroup Switch Text TextureCoordinate TextureCoordinate3D TextureCoordinate4D TextureCoordinateGenerator TextureMatrixTransform TextureProperties TextureTransform TextureTransform3D TimeSensor TimeTrigger ToneMappedVolumeStyle Transform TriangleFanSet TriangleSet TriangleStripSet Viewpoint ViewpointGroup VolumeData WorldInfo.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"MedicalInterchange"</i> (Java syntax) or <i>MedicalInterchange</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MedInterchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MedInterchange.html</a>  */
	public static final String PROFILE_MEDICALINTERCHANGE = "MedicalInterchange";

	/** 
	 * <i>Tooltip:</i> MPEGInteractive Profile defines base interoperability with MPEG4 standards to a small subset of nodes needed to display lightweight compelling content. Allowed X3D nodes for this profile are: Anchor Appearance Background Box Color ColorInterpolator ColorRGBA Cone Coordinate CoordinateInterpolator Cylinder CylinderSensor DirectionalLight ElevationGrid Group ImageTexture IndexedFaceSet IndexedLineSet Inline LineSet Material MetadataBoolean MetadataDouble MetadataFloat MetadataInteger MetadataSet MetadataString NavigationInfo NormalInterpolator OrientationInterpolator PixelTexture PlaneSensor PointLight PointSet PositionInterpolator ProximitySensor ScalarInterpolator Shape Sphere SphereSensor SpotLight Switch TextureCoordinate TextureTransform TimeSensor TouchSensor Transform Viewpoint WorldInfo.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"MPEG4Interactive"</i> (Java syntax) or <i>MPEG4Interactive</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MPEG4interactive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MPEG4interactive.html</a>  */
	public static final String PROFILE_MPEG4INTERACTIVE = "MPEG4Interactive";

	/** 
	 * <i>Tooltip:</i> The Full Profile corresponds to all Immersive X3D nodes plus all approved/implemented extensions. All X3D nodes and statements are allowed in this profile.
	 * SFString field named <i>profile</i> with X3DUOM baseType <i>profileNameChoices</i> can equal this value <i>"Full"</i> (Java syntax) or <i>Full</i> (XML syntax).
	 * @see #profileNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fullProfile.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fullProfile.html</a>  */
	public static final String PROFILE_FULL = "Full";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "3.0", "3.1", "3.2", "3.3", "4.0".
<br ><br >
	 * x3dVersionChoices enumeration string constants are used to identify the allowed versions for an X3D scene graph.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Profiles" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Profiles</a> 
	*/
	public static final ArrayList<String> x3dVersionChoices = new ArrayList<>(Arrays.<String>asList("3.0", "3.1", "3.2", "3.3", "4.0"));

	/** 
	 * <i>Tooltip:</i> X3D version 3.0 approved by ISO in 2004.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>x3dVersionChoices</i> can equal this value <i>"3.0"</i> (Java syntax) or <i>3.0</i> (XML syntax).
	 * @see #x3dVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.0/index.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.0/index.html</a>  */
	public static final String VERSION_3_0 = "3.0";

	/** 
	 * <i>Tooltip:</i> X3D version 3.1 Amendment 1 approved by ISO in 2005. Backwards compatibility maintained with version 3.0.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>x3dVersionChoices</i> can equal this value <i>"3.1"</i> (Java syntax) or <i>3.1</i> (XML syntax).
	 * @see #x3dVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.1/index.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.1/index.html</a>  */
	public static final String VERSION_3_1 = "3.1";

	/** 
	 * <i>Tooltip:</i> X3D version 3.2 Amendment 2 approved by ISO in 2007. Backwards compatibility maintained with versions 3.0 and 3.1.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>x3dVersionChoices</i> can equal this value <i>"3.2"</i> (Java syntax) or <i>3.2</i> (XML syntax).
	 * @see #x3dVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.2/index.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.2/index.html</a>  */
	public static final String VERSION_3_2 = "3.2";

	/** 
	 * <i>Tooltip:</i> X3D version 3.3 approved by ISO in 2013 as International Standard (IS). Backwards compatibility maintained with versions 3.0, 3.1 and 3.2.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>x3dVersionChoices</i> can equal this value <i>"3.3"</i> (Java syntax) or <i>3.3</i> (XML syntax).
	 * @see #x3dVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/X3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/X3D.html</a>  */
	public static final String VERSION_3_3 = "3.3";

	/** 
	 * <i>Tooltip:</i> X3D version 4.0 under final development by Web3D Consortium. Backwards compatibility maintained with versions 3.0, 3.1, 3.2 and 3.3.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>x3dVersionChoices</i> can equal this value <i>"4.0"</i> (Java syntax) or <i>4.0</i> (XML syntax).
	 * @see #x3dVersionChoices
	 * @see  <a href="https://www.web3d.org/x3d4" target="_blank">https://www.web3d.org/x3d4</a>  */
	public static final String VERSION_4_0 = "4.0";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>X3D</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "X3D";

	/** Provides name of this element: <i>X3D</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>X3D</i> element: <i>Core</i> */
	public static final String COMPONENT = "Core";

	/** Defines X3D component for the <i>X3D</i> element: <i>Core</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Core</i> component level for this element: <i>1</i> */
	public static final int LEVEL = 1;

	/** Provides default X3D component level for this element: <i>1</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFNode field named <i>head</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final headObject HEAD_DEFAULT_VALUE = null;

	/** SFString field named <i>profile</i> has default value <i>"Immersive"</i> (Java syntax) or <i>Immersive</i> (XML syntax). */
	public static final String PROFILE_DEFAULT_VALUE = "Immersive";

	/** SFNode field named <i>Scene</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final SceneObject SCENE_DEFAULT_VALUE = null;

	/** SFString field named <i>version</i> has default value <i>"4.0"</i> (Java syntax) or <i>4.0</i> (XML syntax). */
	public static final String VERSION_DEFAULT_VALUE = "4.0";

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D statement
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_TYPE
	 * @return X3D type (SFvec3f etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE if not recognized
	 */
	@Override		
	public String getFieldType(String fieldName)
	{
		String result;

		switch (fieldName)
		{
			// String constants for exact field type values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing type-matching checks
											
			case "containerField":
				result = "SFString";
				break;
			case "head":
				result = "SFNode";
				break;
			case "profile":
				result = "SFString";
				break;
			case "Scene":
				result = "SFNode";
				break;
			case "version":
				result = "SFString";
				break;
			default:
			{
				// if fieldName has a prefix "set_" prepended (or a suffix "_changed" appended) then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getFieldType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getFieldType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE; // unique return value avoids mistaken matches
			}
		}
		return result;
	}

	/** Indicate accessType corresponding to given fieldName.
	 * @param fieldName name of field in this X3D statement
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_ACCESSTYPE
	 * @return X3D accessType (inputOnly etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE if not recognized
	 */
	@Override
	public String getAccessType(String fieldName)
	{
		String result; // set by following checks
		switch (fieldName)
		{
			// String constants for field accessType values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing accessType-matching checks
			case "head":
				result = "inputOutput";
				break;
			case "profile":
				result = "inputOutput";
				break;
			case "Scene":
				result = "inputOutput";
				break;
			case "version":
				result = "inputOutput";
				break;
			default:
			{
				// if user has added a prefix "set_" or suffix "_changed" then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getAccessType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getAccessType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE; // unique return value avoids mistaken matches
			}
		}
		return result;
	}

	/** Constructor for X3DObject to initialize member variables with default values. */
	public X3DObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		head = null; // clear out any prior node
		profile = PROFILE_DEFAULT_VALUE;
		Scene = null; // clear out any prior node
		version = VERSION_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	/**
	 * File extension for X3D XML Encoding, with dot prepended: <i>.x3d</i>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/X3D_XML.html">X3D XML Encoding</a>
	 */
	public static final String FILE_EXTENSION_X3D = ".x3d";
										
	/**
	 * File extension for X3D ClassicVRML Encoding, with dot prepended: <i>.x3dv</i>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/X3D_ClassicVRML.html">X3D ClassicVRML Encoding</a>
	 */
	public static final String FILE_EXTENSION_CLASSICVRML = ".x3dv";
	/**
	 * File extension for X3D Compressed Binary Encoding, with dot prepended: <i>.x3db</i>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-3/V3.3/Part03/X3D_Binary.html">X3D Compressed Binary Encoding Encoding</a>
	 */
	public static final String FILE_EXTENSION_X3DB = ".x3db";
										
	/**
	 * File extension for VRML97 Encoding, with dot prepended: <i>.wrl</i>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772/V2.0/index.html">VRML97 Encoding</a>
	 */
	public static final String FILE_EXTENSION_VRML97 = ".wrl";
										
	/**
	 * File extension for Extensible Markup Language, with dot prepended: <i>.xml</i>
	 * @see <a href="https://www.w3.org/TR/REC-xml">W3C Recommendation, Extensible Markup Language (XML)</a>
	 */
	public static final String FILE_EXTENSION_XML = ".xml";
										
	/**
	 * File extension for Scalable Vector Graphics (SVG), with dot prepended: <i>.svg</i>
	 * @see <a href="https://www.w3.org/Graphics/SVG">SVG Working Group</a>
	 */
	public static final String FILE_EXTENSION_SVG = ".svg";
										
	/**
	 * File extension for HTML Encoding, with dot prepended: <i>.html</i>
	 * @see <a href="https://www.w3.org/TR/html/syntax.html#syntax">HTML5: HTML syntax</a>
	 */
	public static final String FILE_EXTENSION_HTML = ".html";
										
	/**
	 * File extension for markdown encoding, with dot prepended: <i>.md</i>
	 * @see <a href="https://docs.gitlab.com/ee/user/markdown.html">GitLab Flavored Markdown (GFM)</a>
	 * @see <a href="https://en.wikipedia.org/wiki/Markdown">Wikipedia: Markdown</a>
	 */
	public static final String FILE_EXTENSION_MARKDOWN = ".md";
										
	/**
	 * File extension for PLY file format (Polygon File Format, or Stanford Triangle Format) with dot prepended: <i>.ply</i>.
	 * @see <a href="https://en.wikipedia.org/wiki/PLY_(file_format)">Wikipedia: PLY (file format)</a>
	 */
	public static final String FILE_EXTENSION_PLY = ".ply";
										
	/**
	 * File extension for STL (stereolithography) file format with dot prepended: <i>.stl</i>
	 * @see <a href="https://en.wikipedia.org/wiki/STL_(file_format)">Wikipedia: STL (file format)</a>
	 */
	public static final String FILE_EXTENSION_STL = ".stl";
										
	/**
	 * File extension for XHTML Encoding, with dot prepended: <i>.xhtml</i>
	 * @see <a href="https://www.w3.org/TR/html/xhtml.html#xhtml">HTML5: XHTML syntax</a>
	 */
	public static final String FILE_EXTENSION_XHTML = ".xhtml";
										
	/**
	 * File extension for text files, with dot prepended: <i>.txt</i>
	 */
	public static final String FILE_EXTENSION_TEXT = ".txt";
                                        
	/**
	 * File extension for Graphics Interchange Format (GIF) image format, with dot prepended: <i>.gif</i>
	 * @see <a href="https://en.wikipedia.org/wiki/GIF">Wikipedia: GIF</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
	 */
	public static final String FILE_EXTENSION_GIF = ".gif";
                                        
	/**
	 * File extension for Joint Photographic Experts Group (JPEG) image format, with dot prepended: <i>.jpg</i>
	 * @see <a href="https://en.wikipedia.org/wiki/JPEG">Wikipedia: JPEG</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
	 */
	public static final String FILE_EXTENSION_JPG = ".jpg";
                                        
	/**
	 * File extension for Joint Photographic Experts Group (JPEG) image format, with dot prepended: <i>.jpeg</i>
	 * @see <a href="https://en.wikipedia.org/wiki/JPEG">Wikipedia: JPEG</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
	 */
	public static final String FILE_EXTENSION_JPEG = ".jpeg";
                                        
	/**
	 * File extension for Portable Network Graphics (PNG) image format, with dot prepended: <i>.png</i>
	 * @see <a href="https://en.wikipedia.org/wiki/Portable_Network_Graphics">Wikipedia: Portable Network Graphics</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
	 */
	public static final String FILE_EXTENSION_PNG = ".png";
										
	/**
	 * File extension for Java source code, with dot prepended: <i>.java</i>
	 * @see <a href="http://www.oracle.com/technetwork/java/javase/overview">Java Platform, Standard Edition (Java SE)</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Java" target="_blank">X3D Scene Authoring Hints: Java</a>
	 */
	public static final String FILE_EXTENSION_JAVA = ".java";
										
	/**
	 * File extension for JavaScript source code, with dot prepended: <i>.js</i>
	 * @see <a href="https://en.wikipedia.org/wiki/JavaScript">JavaScript</a>
	 * @see <a href="https://en.wikipedia.org/wiki/ECMAScript">ECMAScript ECMA-262</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#JavaScript" target="_blank">X3D Scene Authoring Hints: JavaScript</a>
	 */
	public static final String FILE_EXTENSION_JAVASCRIPT = ".js";
										
	/**
	 * File extension for JavaScript Object Notation (JSON) source data, with dot prepended: <i>.json</i>
	 * @see <a href="https://en.wikipedia.org/wiki/JSON">JavaScript Object Notation (JSON)</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#JSON" target="_blank">X3D Scene Authoring Hints: JSON</a>
	 */
	public static final String FILE_EXTENSION_JSON = ".json";
										
	/**
	 * File extension for Python programming-language source code, with dot prepended: <i>.py</i>
	 * @see <a href="https://www.python.org">Python.org</a>
	 * @see <a href="https://en.wikipedia.org/wiki/Python_(programming_language)">Python (programming language)</a>
	 * @see <a href="https://pypi.org/project/x3d">Python X3D Package x3d.py</a>
	 */
	public static final String FILE_EXTENSION_PYTHON = ".py";
										
	/**
	 * File extension for Efficient XML Interchange (EXI) compressed XML file, with dot prepended: <i>.exi</i>
	 * @see <a href="https://en.wikipedia.org/wiki/Efficient_XML_Interchange">Wikipedia: Efficient XML Interchange (EXI) file format</a>
	 * @see <a href="https://www.w3.org/TR/2014/REC-exi-20140211">Efficient XML Interchange (EXI) Format 1.0 (Second Edition) W3C Recommendation</a>
	 * @see <a href="https://www.w3.org/XML/EXI">EXI Working Group (public page)</a>
	 * @see <a href="https://www.w3.org/XML/Group/EXI">EXI Working Group (member page)</a>
	 */
	public static final String FILE_EXTENSION_EXI = ".exi";
										
	/**
	 * File extension for GZIP compressed file, with dot prepended: <i>.gz</i>
	 * @see <a href="https://en.wikipedia.org/wiki/Gzip">Wikipedia: gzip file format</a>
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/zip/package-summary.html">Java Package java.util.zip for ZIP and GZIP file formats</a>
	 * @see <a href="http://www.oracle.com/technetwork/articles/java/compress-1565076.html">Compressing and Decompressing Data Using Java APIs by Qusay H. Mahmoud</a>
	 */
	public static final String FILE_EXTENSION_GZIP = ".gz";
										
	/**
	 * File extension for ZIP compressed file, with dot prepended: <i>.zip</i>
	 * @see <a href="https://en.wikipedia.org/wiki/Zip_(file_format)">Wikipedia: zip file format</a>
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/zip/package-summary.html">Java Package java.util.zip for ZIP and GZIP file formats</a>
	 * @see <a href="http://www.oracle.com/technetwork/articles/java/compress-1565076.html">Compressing and Decompressing Data Using Java APIs by Qusay H. Mahmoud</a>
	 */
	public static final String FILE_EXTENSION_ZIP = ".zip";

	/**
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
     */
	private BufferedWriter bufferedWriter;
	
	/**
	 * Setup EXIFactory as required, TODO EXIFICIENT documentation
	 */
//    EXIFactory exiFactory = DefaultEXIFactory.newInstance();
	
	/** @see TODO EXIFICIENT docs */
	Grammars exificientGrammarX3D; // TODO public

	/**
	 * Provide XML string serialization of this model subgraph, utilizing X3D XML encoding and conforming to X3D Canonical Form.
	 * @see X3DObject#FILE_EXTENSION_X3D
	 * @see X3DObject#FILE_EXTENSION_XML
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see X3DObject#toFileX3D(String)
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/X3D_XML.html">X3D XML Encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-3/V3.3/Part03/concepts.html#X3DCanonicalForm" target="blank">X3D Compressed Binary Encoding: X3D Canonical Form</a>
	 * @see <a href="https://www.web3d.org/x3d/tools/canonical/doc/x3dTools.htm">X3D Canonicalization (C14N) Tool</a>
	 * @return X3D string
	 */
	public String toStringXML()
	{
		return toStringX3D();
	}
	/**
	 * Provide XML string serialization of this model subgraph, utilizing X3D XML encoding and conforming to X3D Canonical Form.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_X3D
	 * @see X3DObject#FILE_EXTENSION_XML
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see X3DObject#toFileX3D(String)
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/X3D_XML.html">X3D XML Encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-3/V3.3/Part03/concepts.html#X3DCanonicalForm" target="blank">X3D Compressed Binary Encoding: X3D Canonical Form</a>
	 * @see <a href="https://www.web3d.org/x3d/tools/canonical/doc/x3dTools.htm">X3D Canonicalization (C14N) Tool</a>
	 * @return X3D string
	 */
	public String toStringXML(int indentLevel)
	{
		return toStringX3D(indentLevel);
	}

	/**
	 * Serialize scene graph using <i>toStringX3D()</i> to create a new XML-encoding X3D file with extension <i>x3d</i> or <i>xml</i>.
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see X3DObject#toFileX3D(String)
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .x3d
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileXML(String fileName)
	{
		return toFileX3D(fileName);
	}
/**
 * Check whether fileName is satisfactory NMTOKEN, ignoring prior path (if any).
 * @see SFStringObject#isNMTOKEN(String)
 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
 * @param fileName name of file to check
 * @return whether fileName is satisfactory NMTOKEN
 */
public static boolean isFileNameNMTOKEN(String fileName)
{
    String strippedFileName = fileName;
    if (strippedFileName.contains("/"))
        strippedFileName = strippedFileName.substring(strippedFileName.lastIndexOf("/")  + 1);
    if (strippedFileName.contains("\\"))
        strippedFileName = strippedFileName.substring(strippedFileName.lastIndexOf("\\") + 1);

    return SFStringObject.isNMTOKEN(strippedFileName);
}
/**
 * Check whether fileName ending in .x3d meets X3D naming conventions, ignoring prior path (if any).
 * Not observing these conventions can cause errors when converting to a Java file name.
 * @see X3DObject#FILE_EXTENSION_X3D
 * @see SFStringObject#isNMTOKEN(String)
 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
 * @param fileName name of file to check
 * @return whether fileName ending in .x3d is satisfactory NMTOKEN
 */
public static boolean fileNameMeetsX3dNamingConventions(String fileName)
{
    String strippedFileName = fileName;
    if (strippedFileName.contains("/"))
        strippedFileName = strippedFileName.substring(strippedFileName.lastIndexOf("/")   + 1);
    if (strippedFileName.contains("\\"))
        strippedFileName = strippedFileName.substring(strippedFileName.lastIndexOf("\\")  + 1);
    if (strippedFileName.contains(".")) // strip file extension
       strippedFileName = strippedFileName.substring(0, strippedFileName.lastIndexOf("."));

    if (!fileName.endsWith(FILE_EXTENSION_X3D)       || // avoid warning on file-format conversions in unit tests
         fileName.toUpperCase().contains(".EXI")     ||
         fileName.toUpperCase().contains(".OPENEXI") ||
         fileName.toUpperCase().contains(".NASHORN") ||
         fileName.toUpperCase().contains(".JAVA")    ||
         fileName.toUpperCase().contains(".JSON")    ||
         fileName.toUpperCase().contains(".PY")      ||
         fileName.toUpperCase().contains(".TEMP")    ||
         fileName.toUpperCase().contains("ROUNDTRIP"))
         return true;
    else return SFStringObject.meetsX3dInteroperabilityNamingConventions(strippedFileName);
}
	/**
	 * Serialize scene graph using <i>toStringX3D()</i> to create a new XML-encoding X3D file with extension <i>x3d</i> or <i>xml</i>.
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .x3d
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileX3D(String fileName)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileX3D(fileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_X3D + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_X3D) && !fileName.endsWith(FILE_EXTENSION_XML))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_X3D + "\" or " +
                            "\"" + FILE_EXTENSION_XML + "\"");
		}
        if (!fileNameMeetsX3dNamingConventions(fileName))
            System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
        else if (!isFileNameNMTOKEN(fileName)) // less strict
            System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");

		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		
		// http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
		// http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
		Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"
									
		try
		{	
			validate(); // strict checks before serializing scene and saving file
		}
		catch (Exception e)
		{
			System.out.println (e); // output exception but allow serialization to continue, file may be editable
			e.printStackTrace();
			if (ConfigurationProperties.isValidationExceptionAllowed())
				 System.out.println ("Output serialization allowed to continue, file may be editable...");
			else throw (e);
		}
		File priorFile = new File(fileName);
		if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
		{
			System.out.println ("Warning: toFileX3D() is overwriting prior file " + fileName);
		}
		else if  (priorFile.exists())
		{
			System.out.println ("Warning: toFileX3D() is not allowed to overwrite prior file: " + fileName);
			System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
			return null;
		}

		String outputSceneText = toStringX3D();
		try
		{
			Path directoryPath = outputFilePath.getParent();
			if ((directoryPath != null))
				 Files.createDirectories(directoryPath); // if needed
			bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
			bufferedWriter.write(outputSceneText, 0, outputSceneText.length());
			bufferedWriter.close(); // ensure file writing is complete
			return outputFilePath.toFile(); // success
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
			throw new X3DException("IOException for fileName " + fileName + ", unable to save file: " + exception);
		}
	}
	/**
	 * Serialize scene graph using <i>toStringClassicVRML()</i> to create a new X3D file with extension <i>x3dv</i>.
	 * @see X3DObject#toStringClassicVRML()
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .x3dv
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileClassicVRML(String fileName)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileClassicVRML(fileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_CLASSICVRML + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_CLASSICVRML))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension \"" + FILE_EXTENSION_CLASSICVRML + "\"");
		}
		if      (!fileNameMeetsX3dNamingConventions(fileName))
            System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
        else if (!isFileNameNMTOKEN(fileName)) // less strict
            System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			if (errorNotice.isEmpty()) errorNotice += "\n";
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		
		// http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
		// http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
		Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"
		
		try
		{	
			validate(); // strict checks before serializing scene and saving file
		}
		catch (Exception e)
		{
			System.out.println (e); // output exception but allow serialization to continue, file may be editable
			e.printStackTrace();
			if (ConfigurationProperties.isValidationExceptionAllowed())
				 System.out.println ("Output serialization allowed to continue, file may be editable...");
			else throw (e);
		}
		File priorFile = new File(fileName);
		if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
		{
			System.out.println ("Warning: toFileClassicVRML() is overwriting prior file " + fileName);
		}
		else if  (priorFile.exists())
		{
			System.out.println ("Warning: toFileClassicVRML() is not allowed to overwrite prior file: " + fileName);
			System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
			return null;
		}

		String outputSceneText = toStringClassicVRML();
		try
		{
			Path directoryPath = outputFilePath.getParent();
			if ((directoryPath != null))
				 Files.createDirectories(directoryPath); // if needed
			bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
			bufferedWriter.write(outputSceneText, 0, outputSceneText.length());
			bufferedWriter.close(); // ensure file writing is complete
			return outputFilePath.toFile(); // success
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
			throw new X3DException("IOException for fileName " + fileName + ", unable to save file: " + exception);
		}
	}
	/**
	 * Serialize scene graph using <i>toStringVRML97()</i> to create a new X3D file with extension <i>wrl</i>.
	 * @see X3DObject#toStringVRML97()
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .wrl
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileVRML97(String fileName)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileVRML97(fileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_VRML97 + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_VRML97))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension \"" + FILE_EXTENSION_VRML97 + "\"");
		}
		if      (!fileNameMeetsX3dNamingConventions(fileName))
            System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
        else if (!isFileNameNMTOKEN(fileName)) // less strict
            System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			if (errorNotice.isEmpty()) errorNotice += "\n";
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		
		// http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
		// http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
		Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"
		
		try
		{	
			validate(); // strict checks before serializing scene and saving file
		}
		catch (Exception e)
		{
			System.out.println (e); // output exception but allow serialization to continue, file may be editable
			e.printStackTrace();
			if (ConfigurationProperties.isValidationExceptionAllowed())
				 System.out.println ("Output serialization allowed to continue, file may be editable...");
			else throw (e);
		}
		File priorFile = new File(fileName);
		if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
		{
			System.out.println ("Warning: toFileVRML97() is overwriting prior file " + fileName);
		}
		else if  (priorFile.exists())
		{
			System.out.println ("Warning: toFileVRML97() is not allowed to overwrite prior file: " + fileName);
			System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
			return null;
		}

		String outputSceneText = toStringVRML97();
		try
		{
			Path directoryPath = outputFilePath.getParent();
			if ((directoryPath != null))
				 Files.createDirectories(directoryPath); // if needed
			bufferedWriter = Files.newBufferedWriter(outputFilePath, charset);
			bufferedWriter.write(outputSceneText, 0, outputSceneText.length());
			bufferedWriter.close(); // ensure file writing is complete
			return outputFilePath.toFile(); // success
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
			throw new X3DException("IOException for fileName " + fileName + ", unable to save file: " + exception);
		}
	}
	/**
	 * Utility method for toFileStylesheetConversion() with no stylesheet parameters.
	 * @param stylesheetName name of stylesheet to apply
	 * @param fileName name of file to create and save, can include local directory path, must end with allowed file extension (e.g. ".html")
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileStylesheetConversion(String stylesheetName, String fileName)
	{
            return toFileStylesheetConversion(stylesheetName, fileName, "", "", "", "");
	}
	/**
	 * Utility method for toFileStylesheetConversion() with a single stylesheet name=value parameter pair.
	 * @param stylesheetName name of stylesheet to apply
	 * @param fileName name of file to create and save, can include local directory path, must end with allowed file extension (e.g. ".html")
	 * @param parameterName1  first stylesheet parameter name
	 * @param parameterValue1 first stylesheet parameter value
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileStylesheetConversion(String stylesheetName, String fileName, String parameterName1, String parameterValue1)
	{
            return toFileStylesheetConversion(stylesheetName, fileName, parameterName1, parameterValue1, "", "");
	}

	/**
	 * Serialize current X3DObject scene graph using <i>toFileX3D()</i> and then create a new file with corresponding filename extension (e.g. <i>.html</i>) using an embedded stylesheet.
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see ConfigurationProperties#X3DJSAIL_JAR_RELEASE_VERSIONS
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param stylesheetName name of stylesheet to apply
	 * @param fileName name of file to create and save, can include local directory path, must end with allowed file extension (e.g. ".html")
	 * @param parameterName1  first stylesheet parameter name
	 * @param parameterValue1 first stylesheet parameter value
	 * @param parameterName2  second stylesheet parameter name
	 * @param parameterValue2 second stylesheet parameter value
	 * @return File containing result (if operation succeeds), null otherwise
	 */
    // http://docs.oracle.com/javase/8/docs/technotes/guides/javadoc/deprecation/deprecation.html
    // https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html
    // https://stackoverflow.com/questions/1858021/suppress-deprecated-import-warning-in-java
    @SuppressWarnings("deprecation")
	public File toFileStylesheetConversion(String stylesheetName, String fileName, String parameterName1, String parameterValue1, String parameterName2, String parameterValue2)
	{
		String errorNotice = new String();
        String expectedFileNameExtension = "";
		if ((stylesheetName == null || stylesheetName.isEmpty()))
		{
			throw new X3DException("toFileStylesheetConversion(stylesheetName, fileName) stylesheetName not provided;" +
				" (see ConfigurationProperties for allowed choices)");
		}
        expectedFileNameExtension = ConfigurationProperties.getExpectedOutputFileExtension(stylesheetName);

		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileStylesheetConversion(stylesheetName, fileName) fileName not provided;" +
				" (see ConfigurationProperties for allowed choices)");
		}
		if (!((fileName.endsWith(expectedFileNameExtension)) || // some variations allowed
              (fileName.endsWith(FILE_EXTENSION_XHTML)      && expectedFileNameExtension.equals(FILE_EXTENSION_HTML)) ||
              (fileName.endsWith(FILE_EXTENSION_JAVASCRIPT) && expectedFileNameExtension.equals(FILE_EXTENSION_JSON))))
		{
			throw new X3DException("fileName " + fileName + " does not end with expected extension \"" + expectedFileNameExtension + "\"");
		}
        // no need to check fileName for suggested X3D naming conventions
        if (!isFileNameNMTOKEN(fileName)) // less strict
            System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");
		
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
		}					
		
		String intermediateX3DFileName = fileName.substring(0, fileName.length() - 5) + "PrettyPrint.intermediate.x3d";
		Path   intermediateX3DFilePath = Paths.get(intermediateX3DFileName);
		if (ConfigurationProperties.isDebugModeActive())
			errorNotice += "[diagnostic] intermediateX3DFilePath=" + intermediateX3DFilePath.toAbsolutePath() + "\n";

		// http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
		// http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
		Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"
										
		try
		{	
			validate(); // strict checks before serializing scene and saving file
		}
		catch (Exception e)
		{
			System.out.println (e); // output exception but allow serialization to continue, file may be editable
			e.printStackTrace();
			if (ConfigurationProperties.isValidationExceptionAllowed())
				 System.out.println ("Output serialization allowed to continue, file may be editable...");
			else throw (e);
		}
		File priorFile = new File(fileName);
		if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
		{
			System.out.println ("Warning: toFileStylesheetConversion(" + stylesheetName + ") is overwriting prior file " + fileName);
		}
		else if  (priorFile.exists())
		{
			System.out.println ("Warning: toFileStylesheetConversion() is not allowed to overwrite prior file: " + fileName);
			System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
			return null;
		}

		String outputSceneText = toStringX3D();
		try
		{
			bufferedWriter = Files.newBufferedWriter(intermediateX3DFilePath, charset);
			bufferedWriter.write(outputSceneText, 0, outputSceneText.length());
			bufferedWriter.close(); // ensure file writing is complete
		}
		catch (IOException exception)
		{
			throw new X3DException("IOException when creating intermediateX3DFilePath " + intermediateX3DFilePath + 
				", unable to save file: " + exception);
		}
                
		try // https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html
		{
            // background references
			// https://stackoverflow.com/questions/20389255/reading-a-resource-file-from-within-jar/20389418#20389418
			// https://stackoverflow.com/questions/403256/how-do-i-read-a-resource-file-from-a-java-jar-file
			// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html#getResourceAsStream(String)
			// https://stackoverflow.com/questions/11501418/is-it-possible-to-create-a-file-object-from-inputstream
			// targets: X3DJSAIL.3.3.full.jar and X3DJSAIL.3.3.classes.jar

			final String systemClassPath = ConfigurationProperties.getClassPath();

			String currentX3dJsailJarName = "(unlocated)";
			boolean foundX3dJsailJar = false;
			if    ( systemClassPath.contains("X3DJSAIL"))
			{
					 currentX3dJsailJarName = systemClassPath.substring(systemClassPath.indexOf("X3DJSAIL"));
				if ((systemClassPath.indexOf("X3DJSAIL") > 0) &&
					(currentX3dJsailJarName.indexOf(java.io.File.pathSeparatorChar) > 0))
					 currentX3dJsailJarName = currentX3dJsailJarName.substring(0,currentX3dJsailJarName.indexOf(java.io.File.pathSeparatorChar));
				// X3DJSAIL.*.jar now extracted as currentX3dJsailJarName
				for (String nextX3dJsailJar : ConfigurationProperties.X3DJSAIL_JAR_RELEASE_VERSIONS)
				{
					if (currentX3dJsailJarName.equals(nextX3dJsailJar))
					{
						 foundX3dJsailJar = true;
						 break;
					}
				}
			}
			if (!foundX3dJsailJar)
			{
				errorNotice = ConfigurationProperties.ERROR_CONFIGURATION_X3DJSAIL + " X3DJSAIL .jar archive " + currentX3dJsailJarName 
								+ " not found in\n  CLASSPATH=" + systemClassPath+ "\n";
                errorNotice += "  invoked from toFileStylesheetConversion(" + stylesheetName + ", " + fileName
                                         + ", " + parameterName1 + ", " + parameterValue1 + ", " + parameterName2 + ", " + parameterValue2 + ")\n";
                validationResult.append(errorNotice);
				throw new InvalidFieldValueException(errorNotice);
			}

            // must end in !/ https://stackoverflow.com/questions/38488492/documentbuilder-gives-java-net-malformedurlexception-no-in-spec
			String        jarPath = "jar:file:" + currentX3dJsailJarName + "!/";
			String stylesheetPath = "stylesheets/" + stylesheetName;

			if (ConfigurationProperties.isDebugModeActive())
			{
				errorNotice += "[diagnostic] ConfigurationProperties.isDebugModeActive()=" + ConfigurationProperties.isDebugModeActive() + "\n";
				errorNotice += "[diagnostic] System java.class.path=" + systemClassPath   + "\n";
				errorNotice += "[diagnostic] jarPath=" + jarPath + ", ";
				errorNotice +=  "stylesheetPath=" + stylesheetPath + "\n";
			}
            // .class or getClass().getResourceAsStream looks within each classpath .jar for stylesheetPath
			InputStream stylesheetInputStream = getClass().getResourceAsStream("/" + stylesheetPath);
 			if (stylesheetInputStream == null)
			{
				errorNotice += "Stylesheet not found in " + jarPath + ": " + stylesheetPath + ", ";
			}
            // if class loader jar invocation not working then here is a bad hack for build testing: use local path instead
			File stylesheetFile = new File("lib/stylesheets/", ConfigurationProperties.STYLESHEET_HTML_DOCUMENTATION);
            if ((stylesheetInputStream == null) && !stylesheetFile.exists())
				errorNotice += "Stylesheet not found: " + stylesheetFile.getAbsolutePath() + ", ";

			// TODO check for subdirectory writeable
			File outputFile = outputFilePath.toFile();
			if (outputFile == null)
			{
					errorNotice += "outputFile not created: " + outputFilePath.getFileName() + ", ";
			}
//			else if (!outputFile.canWrite())
//					errorNotice += "outputFile not writable: " + outputFile.getAbsolutePath() + ", ";
			
			if (ConfigurationProperties.getXsltEngine().equals(ConfigurationProperties.XSLT_ENGINE_SAXON))
			{
				// reference: Saxon-HE 9.7 documentation and samples
				// S9APIExamples.jsail: private static class TransformA implements S9APIExamples.Test

				Processor           processor = new Processor(false);
				XsltCompiler     xsltCompiler = processor.newXsltCompiler();
				XsltExecutable xsltExecutable;
                if (stylesheetInputStream != null)
                    xsltExecutable = xsltCompiler.compile (new StreamSource(stylesheetInputStream));
				else
                    xsltExecutable = xsltCompiler.compile (new StreamSource(stylesheetFile)); // this fallback might easily fail

				XdmNode source = processor.newDocumentBuilder().build(new StreamSource(intermediateX3DFilePath.toFile()));
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
                if (stylesheetInputStream != null)
                    xsltTransformer.setParameter(new QName("produceSVGfigures"), new XdmAtomicValue("false"));
                xsltTransformer.transform();
			}
			else if (ConfigurationProperties.getXsltEngine().equals(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA))
			{
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    //          factory.setNamespaceAware(true);
    //          factory.setValidating    (true);
		
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document x3dDocument = builder.parse(intermediateX3DFilePath.toFile());
				TransformerFactory tFactory = TransformerFactory.newInstance();
                StreamSource styleStreamSource;
                if (stylesheetInputStream != null)
                    styleStreamSource = new StreamSource(stylesheetInputStream);
				else
                    styleStreamSource = new StreamSource(stylesheetFile);
				Transformer transformer = tFactory.newTransformer(styleStreamSource);
				if (parameterName1.length() > 0)
					transformer.setParameter(parameterName1, parameterValue1);
				if (parameterName2.length() > 0)
					transformer.setParameter(parameterName2, parameterValue2);
                if (stylesheetInputStream != null)
                        transformer.setParameter("produceSVGfigures", "false");

				DOMSource       domSource = new DOMSource(x3dDocument);
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
			if (ConfigurationProperties.isDeleteIntermediateFiles()) // clean up when done
				intermediateX3DFilePath.toFile().deleteOnExit();
		}
		catch (IOException | ParserConfigurationException | TransformerException | SAXException exception)
		{
			throw new X3DException(errorNotice + exception.toString() + " exception when transforming and creating fileName " + outputFilePath + 
				", unable to save result: " + exception);
		}
		catch (SaxonApiException saxonApiException)
		{
//			Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, saxonApiException);
										
			throw new X3DException(errorNotice + "SaxonApiException when transforming and creating fileName " + outputFilePath + 
				", unable to save result: " + saxonApiException);
		}
		return outputFilePath.toFile(); // success
	}

	/**
	 * Serialize scene graph using <i>toFileX3D()</i> and then create a new pretty-print HTML file with extension <i>.html</i>, suitable for documentation purposes.
     * Also create SVG output file (with same base name) for Extrusion crossSection, if found.
	 * @see ConfigurationProperties#STYLESHEET_HTML_DOCUMENTATION
	 * @see ConfigurationProperties#STYLESHEET_ExtrusionCrossSectionSVG
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileHtmlDocumentation(String fileName)
	{
            String   svgFileName = fileName;
            if (     svgFileName.endsWith(".html"))
                     svgFileName = svgFileName.replace(".html", ".svg");
            else if (svgFileName.endsWith(".xhtml"))
                     svgFileName = svgFileName.replace(".xhtml", ".svg");
            else     svgFileName+= ".svg";

//          if (true) // TODO consider adding method to check for presence of element (e.g. Extrusion)
//                    // though likely better to let stylesheet handle that
                   toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_ExtrusionCrossSectionSVG, svgFileName);

            return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_HTML_DOCUMENTATION,           fileName);
	}

	// TODO refactor XSLT conversion methods to re-use common code
    
    public static File getTempFileFromX3dJsailJar(String internalPath, String fileName)
    {
        // background references
        // https://stackoverflow.com/questions/20389255/reading-a-resource-file-from-within-jar/20389418#20389418
        // https://stackoverflow.com/questions/403256/how-do-i-read-a-resource-file-from-a-java-jar-file
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html#getResourceAsStream(String)
        // https://stackoverflow.com/questions/11501418/is-it-possible-to-create-a-file-object-from-inputstream
        // targets: X3DJSAIL.3.3.full.jar and X3DJSAIL.3.3.classes.jar

        final String systemClassPath = ConfigurationProperties.getClassPath();

        String currentX3dJsailJarName = new String();
        String errorNotice        = new String();
        boolean foundX3dJsailJar = false;
        if    ( systemClassPath.contains("X3DJSAIL"))
        {
                 currentX3dJsailJarName = systemClassPath.substring(systemClassPath.indexOf("X3DJSAIL"));
            if ((systemClassPath.indexOf("X3DJSAIL") > 0) &&
                (currentX3dJsailJarName.indexOf(java.io.File.pathSeparatorChar) > 0))
                 currentX3dJsailJarName = currentX3dJsailJarName.substring(0,currentX3dJsailJarName.indexOf(java.io.File.pathSeparatorChar));
            // X3DJSAIL.*.jar now extracted as currentX3dJsailJarName
            for (String nextX3dJsailJar : ConfigurationProperties.X3DJSAIL_JAR_RELEASE_VERSIONS)
            {
                if (currentX3dJsailJarName.equals(nextX3dJsailJar))
                {
                     foundX3dJsailJar = true;
                     break;
                }
            }
        }
        if (!foundX3dJsailJar)
        {
            errorNotice = ConfigurationProperties.ERROR_CONFIGURATION_X3DJSAIL + " X3DJSAIL jar archive \"" + currentX3dJsailJarName 
                            + "\" not found in CLASSPATH=" + systemClassPath + "\n";
            errorNotice += "  invoked from getTempFileFromX3dJsailJar(" + internalPath + ", " + fileName + ")\n";
           	System.out.println(errorNotice);
// TODO     throw new InvalidFieldValueException(errorNotice);
        }

        // TODO jar flexibility, once working
        // must end in !/ https://stackoverflow.com/questions/38488492/documentbuilder-gives-java-net-malformedurlexception-no-in-spec
        String  jarPath = "jar:file:" + currentX3dJsailJarName + "!/";
        String filePath = internalPath;
        if (!filePath.startsWith("/"))
             filePath = "/" + filePath;
        if (!filePath.endsWith("/"))
             filePath += "/";
        filePath += fileName;
        String fileNameRoot  = fileName;
        String fileExtension = new String();
        if (fileName.contains("."))
        {
            fileNameRoot  = fileName.substring(0,fileName.lastIndexOf("."));
            fileExtension = fileName.substring(  fileName.lastIndexOf("."));
        }
        if (ConfigurationProperties.isDebugModeActive())
        {
        	errorNotice += "[diagnostic] System java.class.path=" + systemClassPath   + "\n";
        	errorNotice += "[diagnostic] jarPath=" + jarPath + ", ";
        	errorNotice +=             "filePath=" + filePath + "\n";
        }
        // .class or getClass().getResourceAsStream looks within each classpath .jar for stylesheetPath
        InputStream fileInputStream = X3DObject.class.getResourceAsStream(filePath);
        if (fileInputStream == null)
        {
        	errorNotice += "File not found in " + jarPath + ": " + filePath + ", ";
        }
        // if class loader jar invocation not working then here is a bad hack for build testing: use local path instead
//        File stylesheetFile = new File("lib/stylesheets/", ConfigurationProperties.STYLESHEET_HTML_DOCUMENTATION);
//        if ((fileInputStream == null) && !stylesheetFile.exists())
//        	errorNotice += "Stylesheet not found: " + stylesheetFile.getAbsolutePath() + ", ";

        File outputFile;
        try
        {
            outputFile = File.createTempFile(fileNameRoot, fileExtension);
            if (outputFile == null)
            {
            	errorNotice += "outputFile not created: " + fileName + ", ";
            }
//            else if (!outputFile.canWrite())
//            	errorNotice += "outputFile not writable: " + outputFile.getAbsolutePath() + ", ";
            outputFile.deleteOnExit();
            java.nio.file.Files.copy (fileInputStream, outputFile.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            outputFile = null;
        }
        if      (!errorNotice.isEmpty() && errorNotice.trim().startsWith("[diagnostic]"))
                 System.out.println ("*** "        + errorNotice.trim());
        else if (!errorNotice.isEmpty())
                 System.out.println ("*** Error: " + errorNotice.trim());

        return outputFile;
    }

	/** Private method to read a file as a String
	 * @see https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file
	 * @return file contents
	 */
	private String readFile(String file) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader (file));
		String         line;
		StringBuilder  stringBuilder = new StringBuilder();
		String         ls = System.getProperty("line.separator");

		try {
			while((line = reader.readLine()) != null)
			{
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
			return stringBuilder.toString();
		} 
		finally
		{
			reader.close();
		}
	}

	/**
	 * Serialize scene graph using X3dToJson.xslt stylesheet to create a new JSON-encoding string.
	 * @see X3DObject#toFileJSON(String)
	 * @see ConfigurationProperties#isNormalizeCommentWhitespace()
	 * @see <a href="https://www.web3d.org/wiki/index.php/X3D_JSON_Encoding">X3D JSON Encoding</a>
	 * @see <a href="https://www.web3d.org/x3d/stylesheets/X3dToJson.html">X3D to JSON Stylesheet Converter</a>
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringJSON()
	{
		String temporaryFileName = "temporaryJsonOutputFile.json";
		
		try
		{
			File     fileJSON = toFileJSON(temporaryFileName);

			if  ((fileJSON != null) && fileJSON.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileJSON.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toStringJSON(): " + ioe);
		}
		return "";
	}

	/**
	 * Serialize scene graph using X3dToPython.xslt stylesheet to create a new Python-language string.
	 * @see X3DObject#toFilePython(String)
	 * @see ConfigurationProperties#isNormalizeCommentWhitespace()
	 * @see <a href="https://www.python.org">Python.org</a>
	 * @see <a href="https://en.wikipedia.org/wiki/Python_(programming_language)">Python (programming language)</a>
	 * @see <a href="https://pypi.org/project/x3d">Python X3D Package x3d.py</a>
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringPython()
	{
		String temporaryFileName = "temporaryPythonOutputFile.py";
		
		try
		{
			File     filePython = toFilePython(temporaryFileName);

			if  ((filePython != null) && filePython.exists())
			{
				String fileContents = readFile(temporaryFileName);
				filePython.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toStringPython(): " + ioe);
		}
		return "";
	}

	/**
	 * Serialize scene graph using toFileJava() to create new Java source as a string.
	 * @see X3DObject#toFileJava(String)
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringJava()
	{
		String temporaryFileName = "temporaryJavaOutputFile.java";
		
		try
		{
			File     fileJava = toFileJava(temporaryFileName);

			if  ((fileJava != null) && fileJava.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileJava.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (Exception e)
		{
			// TODO consider throwing exception instead
		}
		return "";
	}

	/**
	 * Serialize scene graph using JavaScriptSerializer.js to create a JavaScript string.
	 * @see X3DObject#toFileJavaScript(String)
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringJavaScript()
	{
		String temporaryFileName = "temporaryJavaScriptOutputFile.js";
		
		try
		{
			File     fileJavaScript = toFileJavaScript(temporaryFileName);

			if  ((fileJavaScript != null) && fileJavaScript.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileJavaScript.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (Exception e)
		{
			// TODO consider throwing exception instead
		}
		return "";
	}

	/**
	 * Serialize scene graph using JavaScriptSerializer.js to create a JavaScript file.
	 * @author John Carlson
	 * @see X3DObject#toStringJavaScript()
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @param fileName name of file to create and save, can include local directory path, must end with .js
	 * @return File containing result (if operation succeeds), empty otherwise
	 */
    public File toFileJavaScript(String fileName)
    {
                if ((fileName == null || fileName.isEmpty()))
                {
                       throw new X3DException("toFileJavaScript(fileName) fileName not provided;" +
                               " be sure to end with extension \"" + X3DObject.FILE_EXTENSION_JAVASCRIPT + "\"");
                }
                if (!fileName.endsWith(X3DObject.FILE_EXTENSION_JAVASCRIPT))
                {
                       throw new X3DException("fileName " + fileName + " does not end with extension \"" + X3DObject.FILE_EXTENSION_JAVASCRIPT + "\"");
                }
		if      (!fileNameMeetsX3dNamingConventions(fileName))
                    System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
                else if (!isFileNameNMTOKEN(fileName)) // less strict
                    System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");

                Path outputFilePath = Paths.get(fileName);

                String intermediateJSFileName = fileName + ".intermediate.js";
                Path   intermediateJSFilePath = Paths.get(intermediateJSFileName);

                // http://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
                // http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html
                Charset charset = Charset.forName(ConfigurationProperties.XML_ENCODING_DECLARATION_DEFAULT); // "UTF-8"

                try
                {
                       validate(); // strict checks before serializing scene and saving file
                }
                catch (Exception e)
                {
                       System.out.println (e); // output exception but allow serialization to continue, file may be editable
                       e.printStackTrace();
                       if (ConfigurationProperties.isValidationExceptionAllowed())
                                System.out.println ("Output serialization allowed to continue, file may be editable...");
                       else throw (e);
                }

                String errorNotice = new String();
                outputFilePath.toAbsolutePath(); // debug check, defaults to local directory
                File outputFile = outputFilePath.toFile();
//              if (!outputFile.canWrite())
//                  errorNotice += "outputFile not writable: " + outputFile.getAbsolutePath() + ", ";
                                        
				File priorFile = new File(fileName);
				if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
				{
					System.out.println ("Warning: toFileJavaScript() is overwriting prior file " + fileName);
				}
				else if  (priorFile.exists())
				{
					System.out.println ("Warning: toFileJavaScript() is not allowed to overwrite prior file: " + fileName);
					System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
					return null;
				}

                ConfigurationProperties.setXsltEngine(ConfigurationProperties.XSLT_ENGINE_NATIVE_JAVA); // built-in version avoids unwanted line breaks
                String outputSceneText = toStringJSON();
                try
                {
					// patches by John Carlson
                    bufferedWriter = Files.newBufferedWriter(intermediateJSFilePath, charset);
					String nashornFolder = "nashorn";
					String tmpStr = "load('classpath:"+nashornFolder+"/jvm-npm.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "load('classpath:"+nashornFolder+"/repeatPolyfill.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var xmldom = require('"+nashornFolder+"/node_modules/xmldom/dom-parser.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var DOMParser = xmldom.DOMParser;\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var XMLSerializer = new xmldom.XMLSerializer();\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var DOMImplementation = new xmldom.DOMImplementation();\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var json = "+outputSceneText+";\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var version = json['X3D']['@version'];\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var docType = DOMImplementation.createDocumentType('X3D', 'ISO//Web3D//DTD X3D '+version+'//EN', 'http://www.web3d.org/specifications/x3d-'+version+'.dtd', null);\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var document = DOMImplementation.createDocument(null, 'X3D', docType);\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var mapToMethod = require('"+nashornFolder+"/node/mapToMethod.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var mapToMethod2 = require('"+nashornFolder+"/node/mapToMethod2.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "for (var par in mapToMethod2) {\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "        for (var child in mapToMethod2[par]) {\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "                mapToMethod[par][child] = mapToMethod2[par][child];\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "        }\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "}\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var fieldTypes = require('"+nashornFolder+"/node/fieldTypes.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "load('classpath:"+nashornFolder+"/node/X3DJSONLD.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "load('classpath:"+nashornFolder+"/node/JavaScriptSerializer.js');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var child = CreateElement('X3D');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "ConvertToX3DOM(json, '', child, 'flipper.json');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "print('Returning with', child);\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var output = new JavaScriptSerializer().serializeToString(json, child, '"+fileName+"', mapToMethod, fieldTypes);\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var FileWriter = Java.type('java.io.FileWriter');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "var fw = new FileWriter('"+fileName+"');\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "fw.write(output);\n";
					bufferedWriter.write(tmpStr, 0, tmpStr.length());
					tmpStr = "fw.close();\n";
                    bufferedWriter.write(tmpStr, 0, tmpStr.length());
                    bufferedWriter.close(); // ensure file writing is complete
                }
                catch (IOException exception)
                {
					exception.printStackTrace();
                    throw new X3DException("IOException when creating intermediateJSFileName " + intermediateJSFileName +
                               ", unable to save file: " + exception);
                }
                try {
					ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
					System.out.println("nashorn diagnostic: toFileJavaScript(" + fileName + ") is running engine.eval(load(...)) using intermediateJSFileName='" + intermediateJSFileName + "'");
//					engine.eval("load('classpath:"+intermediateJSFileName+"');");
					engine.eval("load('"+intermediateJSFileName+"');");
					if (ConfigurationProperties.isDeleteIntermediateFiles()) // clean up when done
						intermediateJSFilePath.toFile().deleteOnExit();
					engine.eval("print('Hello World!');");
                }
                catch (ScriptException exception)
                {
					throw new X3DException(errorNotice + "ScriptException when processing fileName " + intermediateJSFilePath +
							", unable to save result: " + exception);
                }
                return outputFilePath.toFile(); // success
	}

	/**
	 * Serialize scene graph using STYLESHEET_HTML_DOCUMENTATION to create a new X3DOM html page as a string.
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#FILE_EXTENSION_HTML
	 * @see X3DObject#FILE_EXTENSION_XHTML
	 * @see ConfigurationProperties#STYLESHEET_HTML_DOCUMENTATION
	 * @see <a href="https://www.x3dom.org" target="_blank">X3DOM open-source X3D player</a>
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringHtmlDocumentation()
	{
		String temporaryFileName = "temporaryPrettyPrintOutputFile.html";
		
		try
		{
			File     fileHTML = toFileHtmlDocumentation(temporaryFileName);

			if  ((fileHTML != null) && fileHTML.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileHTML.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toHtmlDocumentation(): " + ioe);
		}
		return "";
	}

	/**
	 * Produce model meta information as `name`=`value` pairs, providing markdown output as a string.
	 * @see X3DObject#toFileModelMetaMarkdown(String)
	 * @see X3DObject#FILE_EXTENSION_MARKDOWN
	 * @see ConfigurationProperties#STYLESHEET_MODEL_META_TO_MARKDOWN
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringModelMetaMarkdown()
	{
		String temporaryFileName = "temporaryModelMetaMarkdownOutputFile.x3d";
		
		try
		{
			File     fileMarkdown = toFileModelMetaMarkdown(temporaryFileName);

			if  ((fileMarkdown != null) && fileMarkdown.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileMarkdown.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toStringModelMetaMarkdown(): " + ioe);
		}
		return "";
	}

	/**
	 * Produce alternate cleaned-up X3D scene using STYLESHEET_X3DTIDY, providing output as a string.
	 * @see X3DObject#toFileX3dTidy(String)
	 * @see X3DObject#FILE_EXTENSION_X3D
	 * @see ConfigurationProperties#STYLESHEET_X3DTIDY
	 * @see <a href="https://www.web3d.org/x3d/stylesheets/X3dTidy.html">X3D Tidy for Scene Cleanup, Corrections and Modifications</a>
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringX3dTidy()
	{
		String temporaryFileName = "temporaryPrettyPrintOutputFile.x3d";
		
		try
		{
			File     fileHTML = toFileX3dTidy(temporaryFileName);

			if  ((fileHTML != null) && fileHTML.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileHTML.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toStringX3dTidy(): " + ioe);
		}
		return "";
	}

	/**
	 * Serialize scene graph using STYLESHEET_X3DOM to create a new X3DOM html page as a string.
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#FILE_EXTENSION_HTML
	 * @see X3DObject#FILE_EXTENSION_XHTML
	 * @see ConfigurationProperties#STYLESHEET_X3DOM
	 * @see <a href="https://www.x3dom.org" target="_blank">X3DOM open-source X3D player</a>
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringX3DOM()
	{
		String temporaryFileName = "temporaryX3domOutputFile.html";
		
		try
		{
			File     fileX3DOM = toFileX3DOM(temporaryFileName);

			if  ((fileX3DOM != null) && fileX3DOM.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileX3DOM.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toStringX3DOM(): " + ioe);
		}
		return "";
	}

	/**
	 * Serialize scene graph using STYLESHEET_X3DOM (with appropriate parameters) to create a new X_ITE html page as a string.
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see <a href="http://create3000.de/x_ite" target="_blank">X_ITE open-source X3D player</a>
	 * @see X3DObject#FILE_EXTENSION_HTML
	 * @see X3DObject#FILE_EXTENSION_XHTML
	 * @see ConfigurationProperties#STYLESHEET_X3DOM
	 * @see ConfigurationProperties#STYLESHEET_X_ITE
	 * @param sourceSceneName X3D file to load and view
	 * @return String containing result (if operation succeeds), empty otherwise
	 */
	public String toStringX_ITE(String sourceSceneName)
	{
		String temporaryFileName = "temporaryX3domOutputFile.html";
		
		try
		{
			File     fileX_ITE = toFileX_ITE(sourceSceneName, temporaryFileName);

			if  ((fileX_ITE != null) && fileX_ITE.exists())
			{
				String fileContents = readFile(temporaryFileName);
				fileX_ITE.delete();
				return fileContents;
//				List<String> lines = Files.readAllLines(Paths.get(temporaryFileName)); // debug
//				return String.join("\n",lines);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			throw new X3DException("IOException when converting toStringX_ITE(): " + ioe);
		}
		return "";
	}

	/**
	 * Serialize scene graph using X3dToJson.xslt stylesheet to create a new JSON-encoding X3D file with extension <i>json</i>.
	 * @see X3DObject#toStringJSON()
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#FILE_EXTENSION_JSON
	 * @see X3DObject#FILE_EXTENSION_JAVASCRIPT
	 * @see ConfigurationProperties#STYLESHEET_JSON
	 * @see ConfigurationProperties#isNormalizeCommentWhitespace()
	 * @see <a href="../../../../../../lib/stylesheets/X3dToJson.xslt" target="_blank">X3dToJson.xslt</a>
	 * @see <a href="../../../../../../examples/HelloWorldProgramOutput.json" target="_blank">examples/HelloWorldProgramOutput.json</a>
	 * @see <a href="https://www.web3d.org/wiki/index.php/X3D_JSON_Encoding">X3D JSON Encoding</a>
	 * @see <a href="https://www.web3d.org/x3d/stylesheets/X3dToJson.html">X3D to JSON Stylesheet Converter</a>
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileJSON(String fileName)
	{
            return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_JSON, fileName,
                        "normalizeCommentWhitespace", Boolean.toString(ConfigurationProperties.isNormalizeCommentWhitespace()));
	}
	/**
	 * Serialize scene graph using X3dToPython.xslt stylesheet to create a new Python-language X3D file with extension <i>py</i>.
	 * @see X3DObject#toStringPython()
	 * @see X3DObject#toStringJSON()
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#FILE_EXTENSION_PYTHON
	 * @see ConfigurationProperties#STYLESHEET_PYTHON
	 * @see ConfigurationProperties#isNormalizeCommentWhitespace()
	 * @see <a href="../../../../../../lib/stylesheets/X3dToPython.xslt" target="_blank">X3dToPython.xslt</a>
	 * @see <a href="../../../../../../examples/HelloWorldProgramOutput.py" target="_blank">examples/HelloWorldProgramOutput.py</a>
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFilePython(String fileName)
	{
            return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_PYTHON, fileName,
                        "normalizeCommentWhitespace", Boolean.toString(ConfigurationProperties.isNormalizeCommentWhitespace()));
	}
	/**
	 * Serialize scene graph using X3dToJava.xslt stylesheet to create a new Java source file with extension <i>java</i>, no default license included.
	 * @see X3DObject#toFileJava(String,boolean)
	 * @see <a href="../../../../../../lib/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
	 * @see <a href="../../../../../../examples/HelloWorldProgramOutput.java" target="_blank">examples/HelloWorldProgramOutput.java</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileJava(String fileName)
	{
		return toFileJava(fileName, false); // no license
	}
	/**
	 * Serialize scene graph using X3dToJava.xslt stylesheet to create a new Java source file with extension <i>java</i>.
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#FILE_EXTENSION_JSON
	 * @see X3DObject#FILE_EXTENSION_JAVASCRIPT
	 * @see ConfigurationProperties#STYLESHEET_JSON
	 * @see <a href="../../../../../../lib/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
	 * @see <a href="../../../../../../examples/HelloWorldProgramOutput.java" target="_blank">examples/HelloWorldProgramOutput.java</a>
	 * @see <a href="https://www.web3d.org/wiki/index.php/X3D_JSON_Encoding">X3D JSON Encoding</a>
	 * @see <a href="https://www.web3d.org/x3d/stylesheets/X3dToJson.html">X3D to JSON Stylesheet Converter</a>
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @param includeWeb3dLicense whether to insert default open-source Web3D license at top of source file
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileJava(String fileName, boolean includeWeb3dLicense)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileJava(fileName, includeWeb3dLicense) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_X3D + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_JAVA))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_JAVA + "\"");
		}
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		String className = fileName.substring(0,fileName.indexOf(".java"));
		if (className.contains("/"))
			className = className.substring(fileName.lastIndexOf("/")  + 1); // strip path
		if (className.contains("\\/"))
			className = className.substring(fileName.lastIndexOf("\\") + 1); // strip path

		// XSLT stylesheet parameter names and values
		String parameterName1  = "className";
		String parameterValue1 =  className;
		String parameterName2  = "";
		String parameterValue2 = "";
		if (includeWeb3dLicense)
		{
				parameterName2  = "includeLicenseoriginals";
				parameterValue2 = Boolean.toString(includeWeb3dLicense);
		}
		return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_JAVA, fileName,
					parameterName1, parameterValue1, parameterName2, parameterValue2);
	}
        
        /* whether to include subdirectory paths when creating markdown with  */
        private boolean includeSubdirectoryPaths = true;
        
        /* Set whether to include subdirectory paths when creating markdown (default is true)
         * @param value whether to omit subdirectory paths when creating markdown (default is true)
	 * @see X3DObject#toFileModelMetaMarkdown(String)
	 * @see X3DObject#toStringModelMetaMarkdown(String)
	 * @see X3DObject#FILE_EXTENSION_MARKDOWN
	 * @see ConfigurationProperties#STYLESHEET_MODEL_META_TO_MARKDOWN
         */
        public void setIncludeSubdirectoryPaths (boolean value)
        {
            includeSubdirectoryPaths = value;
        }

	/**
	 * Create model meta information as `name`=`value` pairs, providing markdown output as an output file having extension <i>.md</i>.
	 * @see X3DObject#toStringModelMetaMarkdown()
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see ConfigurationProperties#STYLESHEET_MODEL_META_TO_MARKDOWN
	 * @see <a href="https://www.web3d.org/x3d/stylesheets/X3dTidy.html">X3D Tidy for Scene Cleanup, Corrections and Modifications</a>
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileModelMetaMarkdown(String fileName)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileX3dTidy(fileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_MARKDOWN + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_MARKDOWN))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_MARKDOWN + "\"");
		}
		if      (!fileNameMeetsX3dNamingConventions(fileName))
                    System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
                else if (!isFileNameNMTOKEN(fileName)) // less strict
                    System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
        	return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_MODEL_META_TO_MARKDOWN, fileName, "includeSubdirectoryPaths", Boolean.toString(includeSubdirectoryPaths)); // one stylesheet parameter
	}

	/**
	 * Create alternate cleaned-up X3D scene using STYLESHEET_X3DTIDY within an output file having extension <i>.x3d</i>.
	 * @see X3DObject#toStringX3dTidy()
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see ConfigurationProperties#STYLESHEET_X3DTIDY
	 * @see <a href="https://www.web3d.org/x3d/stylesheets/X3dTidy.html">X3D Tidy for Scene Cleanup, Corrections and Modifications</a>
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileX3dTidy(String fileName)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileX3dTidy(fileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_X3D + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_X3D))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_X3D + "\"");
		}
		if      (!fileNameMeetsX3dNamingConventions(fileName))
                    System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
                else if (!isFileNameNMTOKEN(fileName)) // less strict
                    System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
        return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_X3DTIDY, fileName); // no stylesheet parameters
	}
										
	/**
	 * Create displayable scene page rendered with X3DOM, using STYLESHEET_X3DOM by serializing XML syntax within an XHTML file having extension <i>.xhtml</i>.
	 * @see <a href="https://www.x3dom.org" target="_blank">X3DOM open-source X3D player</a>
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see SFStringObject#isNMTOKEN(String)
	 * @see SFStringObject#meetsX3dInteroperabilityNamingConventions(String)
	 * @see ConfigurationProperties#STYLESHEET_X3DOM
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param fileName name of file to create and save, can include local directory path, must end with .xhtml (preferred) or .html
	 * @return File containing result (if operation succeeds), null otherwise
	 */
	public File toFileX3DOM(String fileName)
	{
		String errorNotice = new String();
		if ((fileName == null || fileName.isEmpty()))
		{
			throw new X3DException("toFileX3DOM(fileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_HTML + "\" or \"" + FILE_EXTENSION_XHTML + "\"");
		}
		if (!fileName.endsWith(FILE_EXTENSION_HTML) && !fileName.endsWith(FILE_EXTENSION_XHTML))
		{
			throw new X3DException("fileName " + fileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_HTML + "\" or \"" + FILE_EXTENSION_XHTML + "\"");
		}
		if      (!fileNameMeetsX3dNamingConventions(fileName))
                    System.out.println ("Warning: " + fileName + " does not meet suggested X3D naming conventions, continuing...");
                else if (!isFileNameNMTOKEN(fileName)) // less strict
                    System.out.println ("Warning: " + fileName + " is not a valid NMTOKEN, continuing...");
		Path outputFilePath = Paths.get(fileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
        return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_X3DOM, fileName, "player", "X3DOM");
	}
										
	/**
	 * Create displayable scene page rendered with X_ITE (formerly Cobweb) using STYLESHEET_X3DOM and special settings, by serializing XML syntax within an XHTML file having extension <i>.xhtml</i>.
	 * @see <a href="http://create3000.de/x_ite" target="_blank">X_ITE open-source X3D player</a>
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see X3DObject#toFileCobweb(String,String)
	 * @see ConfigurationProperties#STYLESHEET_X3DOM
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param sourceSceneName X3D file to load and view
	 * @param resultFileName name of file to create and save, can include local directory path, must end with .html (preferred) or .xhtml
	 * @return File containing result (if operation succeeds), null otherwise
	 */
        // http://docs.oracle.com/javase/8/docs/technotes/guides/javadoc/deprecation/deprecation.html
        // https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html
        // https://stackoverflow.com/questions/1858021/suppress-deprecated-import-warning-in-java
    @SuppressWarnings("deprecation")
	public File toFileX_ITE(String sourceSceneName, String resultFileName)
	{
		return toFileStylesheetConversion(ConfigurationProperties.STYLESHEET_COBWEB, resultFileName, 
			"player", "Cobweb", "urlScene", sourceSceneName);
	}
										
	/**
	 * Create displayable scene page rendered with X_ITE (formerly Cobweb) using STYLESHEET_X3DOM and special settings, by serializing XML syntax within an XHTML file having extension <i>.xhtml</i>.
	 * @see <a href="http://create3000.de/x_ite" target="_blank">X_ITE open-source X3D player</a>
	 * @see X3DObject#toStringX3D()
	 * @see X3DObject#toFileX3D(String)
	 * @see X3DObject#toFileJava(String)
	 * @see X3DObject#toFileJSON(String)
	 * @see X3DObject#toFilePython(String)
	 * @see X3DObject#toFileHtmlDocumentation(String)
	 * @see X3DObject#toFileX3DOM(String)
	 * @see X3DObject#toFileX_ITE(String,String)
	 * @see ConfigurationProperties#STYLESHEET_X3DOM
	 * @see <a href="http://www.saxonica.com/documentation/index.html#!using-xsl/embedding">Saxonica &gt; Saxon &gt; Using XSLT &gt; Invoking XSLT from an application</a>
	 * @see <a href="http://saxon.sourceforge.net/#F9.7HE">Saxon-HE 9.7</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/xslt/transformingXML.html">Java Tutorials: Transforming XML Data with XSLT</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/jaxp/examples/xslt_samples.zip">Java Tutorials: Transforming XML Data with XSLT, sample files</a>
	 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/file.html#textfiles">Buffered I/O Methods for Text Files</a>
	 * @param sourceSceneName X3D file to load and view
	 * @param resultFileName name of file to create and save, can include local directory path, must end with .html (preferred) or .xhtml
	 * @return File containing result (if operation succeeds), null otherwise
	 */
    @Deprecated
	public File toFileCobweb(String sourceSceneName, String resultFileName)
	{
		return toFileX_ITE (sourceSceneName, resultFileName);
	}
									
	/**
	 * Load new model from a zip file, using unzip to extract the model plus any associated files into the same path location.
	 * @see X3DObject#fromFileZIP(String,String,String)
	 * @param zipFileName name of zip file to load, can include local directory path, must end with .zip
	 * @param outputFileName name of output file to save, can include local directory path, must end with .x3d or .xml
	 * @return boolean if operation succeeds in creating this X3DObject, false otherwise
	 */
    public boolean fromFileZIP(String zipFileName, String outputFileName)
	{
		return fromFileZIP(zipFileName, outputFileName, ""); // use whatever filename is found internally
	}
									
	/**
	 * Load new model from a zip file, using unzip to extract the model plus any associated files into the same path location.
	 * <br ><br >
	 * <i>Warning:</i> If no <code>modelFileName</code> is provided, then the first <code>.x3d</code> model encountered in the zip file is returned (if any).
	 * <br ><br >
	 * <i>Warning:</i> this method overwrites any previously existing file versions when decompressing.
	 * @see <a href="https://en.wikipedia.org/wiki/Zip_(file_format)">Wikipedia: ZIP file format</a>
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/zip/package-summary.html">Java Package java.util.zip for ZIP and GZIP file formats</a>
	 * @see X3DObject#FILE_EXTENSION_EXI
	 * @see X3DObject#FILE_EXTENSION_GZIP
	 * @see X3DObject#FILE_EXTENSION_ZIP
	 * @see X3DObject#fromFileEXI(String)
	 * @see X3DObject#fromFileGZIP(String)
	 * @see X3DObject#toFileZIP(String,String)
	 * @see X3DObject#fromFileZIP(String,String)
	 * @param zipFileName name of zip file to load, can include local directory path, must end with .zip
	 * @param outputFileName name of output file to save, can include local directory path, must end with .x3d or .xml
	 * @param modelFileName name of model file to load, can include local directory path, must end with .x3d
	 * @return boolean if operation succeeds in creating this X3DObject, false otherwise
	 */
    public boolean fromFileZIP(String zipFileName, String outputFileName, String modelFileName)
	{
		if (modelFileName == null)
			modelFileName = new String(); // avoid NPE
		String errorNotice = new String();
		if ((zipFileName == null || zipFileName.isEmpty()))
		{
			throw new X3DException("fromFileZIP(zipFileName, modelFileName) zipFileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_ZIP + "\"");
		}
		if (!zipFileName.endsWith(FILE_EXTENSION_ZIP))
		{
			errorNotice += ("fromFileZIP zipFileName " + zipFileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_ZIP + "\"" + "\n");
			System.out.println (errorNotice);
			return false;
		}
		if (!zipFileName.endsWith(FILE_EXTENSION_ZIP))
		{
			errorNotice += ("fromFileZIP zipFileName " + zipFileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_ZIP + "\"" + "\n");
			System.out.println (errorNotice);
			return false;
		}
		Path inputFilePath = Paths.get(zipFileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] fromFileZIP zipFileName path=" + inputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		// Elliotte Rusty Harold, "Java I/O" Chapter 10 Compressing Streams, O'Reilly and Associates, 2nd edition, May 2006.
		// Example 10-11, adapted
		
		File zipFile = new File(zipFileName);
		if (!zipFile.exists() || (zipFile == null))
		{
			errorNotice += "zipFileName " + zipFileName + "not found\n";
			System.out.println (errorNotice);
			return false;
		}
		try
		{
			FileInputStream fileInputStream = new FileInputStream(zipFile);
			ZipInputStream  zipInputStream = new  ZipInputStream(fileInputStream);
			ZipEntry        zipEntry       = null;
			while ((zipEntry = zipInputStream.getNextEntry()) != null)
			{
				if (ConfigurationProperties.isDebugModeActive())
				{
					System.out.println ("Unzipping " + zipEntry.getName() + " size=" + zipEntry.getSize() + " bytes");
				}
		
				if (outputFileName.isEmpty())
				{
					outputFileName = zipEntry.getName(); // first found .x3d file in .zip
					System.out.println ("Warning: fromFileZIP() outputFileName was empty, unzipping found initial X3D file to save: " + outputFileName);
				}
				if (modelFileName.isEmpty() && (zipEntry.getName().endsWith(FILE_EXTENSION_X3D) ||
                                                zipEntry.getName().endsWith(FILE_EXTENSION_XML)))
				{
					modelFileName = zipEntry.getName(); // first found .x3d file in .zip
					System.out.println ("Warning: fromFileZIP() modelFileName was empty, unzipping found initial X3D file to load: " + modelFileName);
				}
				File priorFile = new File(outputFileName);
				if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
				{
					System.out.println ("Warning: fromFileZIP() is overwriting prior file " + outputFileName);
				}
				else if  (priorFile.exists())
				{
					System.out.println ("Warning: fromFileZIP() is not allowed to overwrite prior file: " + outputFileName);
					System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
					return false;
				}
				// TODO add optional output directory path
				FileOutputStream fileOutputStream = new FileOutputStream (outputFileName);
				for (int c = zipInputStream.read(); c != -1; c = zipInputStream.read())
				{
					fileOutputStream.write(c);
				}
				zipInputStream.closeEntry();
				fileOutputStream.close();
				System.out.println ("Unzipped " + outputFileName + " size=" + zipEntry.getSize() + " bytes");
			}
			zipInputStream.close();

			if (modelFileName.isEmpty())
			{
				System.out.println ("fromZIP output modelFileName not found in zipFileName " + zipFileName + ", no X3D model to load");
				return false;
			}
										
			X3DLoaderDOM x3dLoader = new X3DLoaderDOM();
			boolean x3dLoaderSuccess = x3dLoader.loadModelFromFileX3D(modelFileName);
			if (x3dLoaderSuccess)
				replace((X3DObject) x3dLoader.getX3dObjectTree());
		}
		catch (IOException e)
		{
			errorNotice += "zipFileName " + zipFileName + "not readable\n";
			System.out.println (errorNotice);
			return false;
		}
		return hasHead() || hasScene(); // success test
	}
									
	/**
	 * Load new model from a gz gzip file, using ungzip to extract the model into the same path location.
	 * <br ><br >
	 * <i>Warning:</i> this method overwrites any previously existing file versions when decompressing.
	 * @see <a href="https://en.wikipedia.org/wiki/Gzip">Wikipedia: GZIP file format</a>
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/zip/package-summary.html">Java Package java.util.zip for ZIP and GZIP file formats</a>
	 * @see X3DObject#FILE_EXTENSION_EXI
	 * @see X3DObject#FILE_EXTENSION_GZIP
	 * @see X3DObject#FILE_EXTENSION_ZIP
	 * @see X3DObject#fromFileEXI(String)
	 * @see X3DObject#fromFileZIP(String,String)
	 * @see X3DObject#toFileGZIP(String)
	 * @param gzipFileName name of file to load, can include local directory path, must end with .exi
	 * @return boolean if operation succeeds in creating this X3DObject, false otherwise
	 */
    public boolean fromFileGZIP(String gzipFileName)
	{
		String errorNotice = new String();
		if ((gzipFileName == null || gzipFileName.isEmpty()))
		{
			throw new X3DException("fromFileGZIP(gzipFileName) fileName not provided;" +
				" be sure to end with extension \"" + FILE_EXTENSION_GZIP + "\"");
		}
		if (!gzipFileName.endsWith(FILE_EXTENSION_GZIP))
		{
			errorNotice += ("gzipFileName " + gzipFileName + " does not end with extension " +
                            "\"" + FILE_EXTENSION_GZIP + "\"" + "\n");
		}
		Path inputFilePath = Paths.get(gzipFileName);
		if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
		{
			errorNotice += "[diagnostic] gzipFileName path=" + inputFilePath.toAbsolutePath() + "\n";
			System.out.println (errorNotice);
		}
		// Elliotte Rusty Harold, "Java I/O" Chapter 10 Compressing Streams, O'Reilly and Associates, 2nd edition, May 2006.
		// Example 10-11, adapted
		
		File gzipFile = new File(gzipFileName);
		if (!gzipFile.exists() || (gzipFile == null))
		{
			errorNotice += "gzipFileName " + gzipFileName + "not found\n";
			System.out.println (errorNotice);
			return false;
		}
		String modelFileName = gzipFileName;
		if (modelFileName.contains(FILE_EXTENSION_GZIP))
			modelFileName = modelFileName.substring(0, modelFileName.lastIndexOf(FILE_EXTENSION_GZIP));
		if (!modelFileName.endsWith (FILE_EXTENSION_X3D))
			 modelFileName += FILE_EXTENSION_X3D;
		if ( modelFileName.isEmpty())
			 return false;
		System.out.println ("  fromFileGZIP() output modelFileName " + modelFileName);
		File priorFile = new File(modelFileName);
		if  (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles())
		{
			System.out.println ("Warning: fromFileGZIP() is overwriting prior file " + modelFileName);
		}
		else if  (priorFile.exists())
		{
			System.out.println ("Warning: fromFileGZIP() is not allowed to overwrite prior file: " + modelFileName);
			System.out.println ("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
			return false;
		}
		try
		{
			FileInputStream fileInputStream = new FileInputStream(gzipFile);
			GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
			
			if (ConfigurationProperties.isDebugModeActive())
			{
				System.out.println ("gunzipping " + gzipFile);
			}
			// TODO add optional output directory path
			FileOutputStream fileOutputStream = new FileOutputStream (modelFileName);
			for (int c = gzipInputStream.read(); c != -1; c = gzipInputStream.read())
			{
				fileOutputStream.write(c);
			}
			gzipInputStream.close();
			fileOutputStream.close();
			File decompressedFile = new File(modelFileName);
			System.out.println ("gunzipped " + decompressedFile.getPath() + " size=" + decompressedFile.length() + " bytes");
										
			X3DLoaderDOM x3dLoader = new X3DLoaderDOM();
			boolean x3dLoaderSuccess = x3dLoader.loadModelFromFileX3D(modelFileName);
			if (x3dLoaderSuccess)
				replace((X3DObject) x3dLoader.getX3dObjectTree());
		}
		catch (IOException e)
		{
			errorNotice += "gzipFileName " + gzipFileName + "not readable\n";
			System.out.println (errorNotice);
			return false;
		}
		
		return hasHead() || hasScene(); // success test
	}
									
    /**
     * Load new model from an EXI file, using unzip to extract the model plus
     * any associated files into the same path location.
     * <br ><br >
     * <i>Warning:</i> this method overwrites any previously existing file
     * versions when decompressing.
     *
     * @see
     * <a href="https://openexi.sourceforge.net/tutorial/index.html">OpenEXI
     * Nagasena Tutorial</a>
     * @see <a href="https://exificient.github.io/java">EXIFICIENT Java
     * Implementations</a>
     * @see
     * <a href="https://en.wikipedia.org/wiki/Efficient_XML_Interchange">Wikipedia:
     * Efficient XML Interchange (EXI) file format</a>
     * @see ConfigurationProperties#getExiEngine()
     * @see ConfigurationProperties#setExiEngine(String)
     * @see X3DObject#FILE_EXTENSION_EXI
     * @see X3DObject#FILE_EXTENSION_GZIP
     * @see X3DObject#FILE_EXTENSION_ZIP
     * @see X3DObject#toFileEXI(String)
     * @see X3DObject#fromFileZIP(String,String)
     * @see X3DObject#fromFileGZIP(String)
     * @param exiFileName name of file to load, can include local directory
     * path, must end with .exi
     * @return boolean if operation succeeds in creating this X3DObject, false
     * otherwise
     */
    public boolean fromFileEXI(String exiFileName) {
        String errorNotice = new String();
        if ((exiFileName == null || exiFileName.isEmpty())) {
            throw new X3DException("fromFileEXI(exiFileName) fileName not provided;"
                    + " be sure to end with extension \"" + FILE_EXTENSION_EXI + "\"");
        }
        if (!exiFileName.endsWith(FILE_EXTENSION_EXI)) {
            errorNotice += ("exiFileName " + exiFileName + " does not end with extension "
                    + "\"" + FILE_EXTENSION_EXI + "\"" + "\n");
        }
        File priorFile = new File(exiFileName);
        if (priorFile.exists() && ConfigurationProperties.isOverwriteExistingFiles()) {
            System.out.println("Warning: fromFileEXI() is overwriting prior file " + exiFileName);
        } else if (priorFile.exists()) {
            System.out.println("Warning: fromFileEXI() is not allowed to overwrite prior file: " + exiFileName);
            System.out.println("  see X3DJSAIL.properties file, or ConfigurationProperties.isOverwriteExistingFiles() and .setOverwriteExistingFiles(), to get/set permissions");
            return false;
        }

        Path inputFilePath = Paths.get(exiFileName);
        if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
        {
            errorNotice += "[diagnostic] exiFileName path=" + inputFilePath.toAbsolutePath() + "\n";
            System.out.println(errorNotice);
        }
                    
        String xmlFileName = "examples/temp.exiInputTransformed.x3d"; // XML output again
        switch (ConfigurationProperties.getExiEngine()) {
            case ConfigurationProperties.EXI_ENGINE_EXIFICIENT:
                try {
                    
                   /*
                    * Setup EXIFactory as required
                    */
                    EXIFactory exiFactory = DefaultEXIFactory.newInstance();
                    // e.g., add additional settings beyond the default values
                    // TODO separate string constants for schema addresses
                    // TODO use local copy of schema rather than online; is identifier needed for consistency?
                    // TODO can the grammar be precompiled and cached in X3DJSAIL library?
                    // TODO is a grammar needed for file reading?
                    if (exificientGrammarX3D == null) // only needed once, avoid recomputation
                    {
                        exificientGrammarX3D = GrammarFactory.newInstance().createGrammars("http://www.web3d.org/specifications/x3d-3.3.xsd"); // use XML schema
                    }
                    exiFactory.setGrammars(exificientGrammarX3D);
                    exiFactory.setCodingMode(CodingMode.COMPRESSION); // use deflate compression for larger XML files
                    
                   /*
                    *  decode EXI to XML
                    */
                    Result result = new StreamResult(xmlFileName);
                    InputSource is = new InputSource(exiFileName);
                    SAXSource exiSource = new EXISource(exiFactory);
                    exiSource.setInputSource(is);
                    TransformerFactory tf = TransformerFactory.newInstance();
                    Transformer transformer = tf.newTransformer();
                    transformer.transform(exiSource, result);
                    
                    // TODO someday: efficiently parse as X3D, rather than using string-based methods
                } catch (EXIException | TransformerException ex) {
                    Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }   
                break;
        
            // Nagasena
            case ConfigurationProperties.EXI_ENGINE_OPENEXI:
                
                InputStream in = null;
                InputStream is = null;
                Writer out = null;
                StringWriter stringWriter = new StringWriter();

                // The Grammar Cache stores schema and EXI options information. 
                // The settings must match when encoding and subsequently decoding 
                // a data set.
                GrammarCache grammarCache;

                // All EXI options can expressed in a single short integer. 
                // DEFAULT_OPTIONS=2;
                short options = GrammarOptions.DEFAULT_OPTIONS;

                try {

                    // Standard SAX methods parse content and lexical values.
                    SAXTransformerFactory saxTransformerFactory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
                    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
                    saxParserFactory.setNamespaceAware(true);
                    TransformerHandler transformerHandler = saxTransformerFactory.newTransformerHandler();

                    // EXIReader infers and reconstructs the XML file structure.
                    EXIReader reader = new EXIReader();

                    // Ensure smallest file size
                    reader.setAlignmentType(AlignmentType.compress);
                    
                    // If using strict interpretation of the schema, set 
                    // STRICT_OPTIONS and continue.
                    // NOTE: Strict does not work with X3D schema
//                    options = GrammarOptions.STRICT_OPTIONS;
                    
                    File inputFile = new File(exiFileName);
                    in = new FileInputStream(inputFile);
                    out = new OutputStreamWriter(new FileOutputStream(xmlFileName), "UTF-8");

                    // Set the schema and EXI Options in the Grammar Cache.
                    FileInputStream fis = null;

                    // Create a schema and set it to null. If useSchema == "None" it remains null.
                    EXISchema schema = null;

                    // Faster if the schema is already in EXIG format
                    if (!new File("examples/x3d-3.3.xsd.exig").exists()) {
                        SerializeEXISchema s = new SerializeEXISchema();
                        try {
                            is = getClass().getResourceAsStream("/specifications/x3d-3.3.xsd");
                            s.serializeEXISchema("/specifications/x3d-3.3.xsd", is, "examples/x3d-3.3.xsd.exig");
                        } catch (EXISchemaFactoryException | IOException ex) {
                            Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                            throw new IllegalArgumentException(ex);
                        } finally {
                            try {
                                if (is != null) {
                                    is.close();
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    
                    try {
                        fis = new FileInputStream("examples/x3d-3.3.xsd.exig");
                        schema = new EXISchemaReader().parse(fis);
                    } finally {
                        if (fis != null) {
                            fis.close();
                        }
                    }
                    grammarCache = new GrammarCache(schema, options);

                    // Use the Grammar Cache to set the schema and grammar options 
                    // for EXIReader.
                    reader.setGrammarCache(grammarCache);

                    // Prepare to send the results from the transformer to a 
                    // StringWriter object.
                    transformerHandler.setResult(new StreamResult(stringWriter));

                    // Read the file into a byte array.
                    byte fileContent[] = new byte[(int) inputFile.length()];
                    in.read(fileContent);

                    // Assign the transformer handler to interpret XML content.
                    reader.setContentHandler(transformerHandler);

                    // Parse the file information.
                    reader.parse(new InputSource(new ByteArrayInputStream(fileContent)));

                    // Get the resulting string, write it to the output file, and 
                    // flush the buffer contents.
                    final String reconstitutedString;
                    reconstitutedString = stringWriter.getBuffer().toString();
                    out.write(reconstitutedString);
                    out.flush();
                } catch (TransformerConfigurationException | EXIOptionsException | IOException | SAXException ex) {
                    Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
                
                // Verify that the input and output files are closed.
                finally {
                    try {
                        if (in != null) {
                            in.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
            default:
                errorNotice = ConfigurationProperties.ERROR_CONFIGURATION_X3DJSAIL + " illegal value \"" + ConfigurationProperties.getExiEngine()
                        + "\" found for ConfigurationProperties.getExiEngine()\n"
                        + "   allowed values are ConfigurationProperties.EXI_ENGINE_EXIFICIENT and ConfigurationProperties.EXI_ENGINE_OPENEXI";
                if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
                {
                    errorNotice += "[diagnostic] exiFileName path=" + inputFilePath.toAbsolutePath() + "\n";
                }
                System.err.println(errorNotice);
                throw new InvalidFieldValueException(errorNotice);
        }
        
        File decompressedFile = new File(xmlFileName);
/*
        // JDOM to pretty-fy
        org.jdom.Document doc;
        Format form = Format.getPrettyFormat();
        XMLOutputter xout = new XMLOutputter(form);
        try {
            doc = new SAXBuilder().build(decompressedFile);
            xout.output(doc, new FileWriter(decompressedFile));
        } catch (IOException | JDOMException ex) {
            Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
        System.out.println("EXI decompressed " + decompressedFile.getPath() + " size=" + decompressedFile.length() + " bytes");

        X3DLoaderDOM x3dLoader = new X3DLoaderDOM();
        boolean x3dLoaderSuccess = x3dLoader.loadModelFromFileX3D(xmlFileName);
        if (x3dLoaderSuccess) {
            replace((X3DObject) x3dLoader.getX3dObjectTree());
        }
        return hasHead() || hasScene(); // success test
    }
											
	/** Determine if this X3D model is empty and no content is present.
	 * @return true if no head and no Scene found, otherwise false
	 */
	public boolean isEmpty()
	{
		return !(hasHead() || hasScene()); 
	}
											
	/** Load X3D model from file to initialize or replace contents of this X3DObject.
	 * Supports .x3d or .xml file encodings.
	 * @param fileName name of model file that replaces current X3DObject
	 * @return true if replacement successful, false otherwise
	 */
	public boolean loadModelFromFileX3D (String fileName)
	{
        return loadModelFromFileX3D ("", fileName);
	}
											
	/** Load X3D model from file to initialize or replace contents of this X3DObject.
	 * Supports .x3d or .xml file encodings.
	 * @param path directory path to file of interest
	 * @param fileName name of model file that replaces current X3DObject
	 * @return true if replacement successful, false otherwise
	 */
	public boolean loadModelFromFileX3D (String path, String fileName)
	{
		File x3dFile;
        if ((path == null) || path.isEmpty() || path.equals("."))
             x3dFile = new File(      fileName);
		else x3dFile = new File(path, fileName);
                                        
		if (!x3dFile.exists())
		{
			throw new X3DException("path, fileName " + path + ", " + fileName + " does not exist and cannot be loaded, check path and filename.");
		}
		return loadModelFromFileX3D (x3dFile);
	}
											
	/** Load X3D model from file to initialize or replace contents of this X3DObject.
	 * Supports .x3d or .xml file encodings.
	 * @param x3dFile model file that replaces current X3DObject
	 * @return true if replacement successful, false otherwise
	 */
	public boolean loadModelFromFileX3D (File x3dFile)
	{
				X3DLoaderDOM x3dLoader = new X3DLoaderDOM();
				boolean x3dLoaderSuccess = x3dLoader.loadModelFromFileX3D(x3dFile);
				if  (x3dLoaderSuccess)
					 return replace((X3DObject) x3dLoader.getX3dObjectTree());
				else return false;
	}
										
	/** Replaces current X3DObject with new X3DObject. 
	 * @param newX3DObject replaces current X3DObject
	 * @return true if replacement successful, false otherwise
	 */
	public boolean replace (X3DObject newX3DObject)
	{
		if (newX3DObject == null)
			return false;
		setHead (newX3DObject.getHead());
		setScene(newX3DObject.getScene());
		return true;
	}
                                                                            							
    /**
     * Save current model as an EXI file.
     *
     * @see
     * <a href="https://openexi.sourceforge.net/tutorial/index.html">OpenEXI
     * Nagasena Tutorial</a>
     * @see ConfigurationProperties#getExiEngine()
     * @see ConfigurationProperties#setExiEngine(String)
     * @see X3DObject#FILE_EXTENSION_EXI
     * @see X3DObject#FILE_EXTENSION_GZIP
     * @see X3DObject#FILE_EXTENSION_ZIP
     * @see X3DObject#fromFileEXI(String)
     * @see X3DObject#toFileGZIP(String)
     * @see X3DObject#toFileZIP(String,String)
     * @see X3DObject#toFileX3D(String)
     * @param resultFileName name of file to create and save, can include local
     * directory path, must end with .exi
     * @return File containing result (if operation succeeds), null otherwise
     */
    public File toFileEXI(String resultFileName) {
        String errorNotice = new String();
        if ((resultFileName == null || resultFileName.isEmpty())) {
            throw new X3DException("toFileJava(resultFileName) fileName not provided;"
                    + " be sure to end with extension \"" + FILE_EXTENSION_EXI + "\"");
        }
        if (!resultFileName.endsWith(FILE_EXTENSION_EXI)) {
            throw new X3DException("resultFileName " + resultFileName + " does not end with extension "
                    + "\"" + FILE_EXTENSION_EXI + "\"");
        }
        Path outputFilePath = Paths.get(resultFileName);
        if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
        {
            errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
            System.out.println(errorNotice);
        }
        File newXmlFile = toFileX3D(resultFileName + ".temp.x3d");
        newXmlFile.deleteOnExit();
        String exiFileName = resultFileName;
        if (!exiFileName.endsWith(FILE_EXTENSION_EXI)) {
            exiFileName += FILE_EXTENSION_EXI;
            System.out.println(resultFileName + " changed to " + exiFileName);
        }
        File newExiFile = new File(exiFileName);
        
        // TODO convert this to an .exi file
        switch (ConfigurationProperties.getExiEngine()) {
            case ConfigurationProperties.EXI_ENGINE_EXIFICIENT:
                try {
                    
                   /*
                    * Setup EXIFactory as required
                    */
                    EXIFactory exiFactory = DefaultEXIFactory.newInstance();
                    // e.g., add additional settings beyond the default values
                    // TODO separate string constants for schema addresses
                    // TODO use local copy of schema rather than online; is identifier needed for consistency?
                    // TODO can the grammar be precompiled and cached in X3DJSAIL library?
                    if (exificientGrammarX3D == null) // only needed once, avoid recomputation
                    {
                        exificientGrammarX3D = GrammarFactory.newInstance().createGrammars("http://www.web3d.org/specifications/x3d-3.3.xsd"); // use XML schema
                    }
                    exiFactory.setGrammars(exificientGrammarX3D);
                    exiFactory.setCodingMode(CodingMode.COMPRESSION); // use deflate compression for larger XML files
                    
                    /*
                     * Encode XML to EXI
                     */
                     try (OutputStream osEXI = new FileOutputStream(exiFileName)) {
                        EXIResult exiResult = new EXIResult(exiFactory);
                        exiResult.setOutputStream(osEXI);
                        SAXParserFactory spf = SAXParserFactory.newInstance();
                        spf.setNamespaceAware(true);
                        SAXParser saxParser = spf.newSAXParser();
                        saxParser.parse(newXmlFile, (DefaultHandler) exiResult.getHandler()); // parse XML input
                        // all done, close stream and file
                    }
                } catch (SAXException | IOException | EXIException | ParserConfigurationException ex) {
                    Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                    // not rethrown
                }
                break;
        
            // Nagasena
            case ConfigurationProperties.EXI_ENGINE_OPENEXI:
                
                // reference EncodeEXI.java from Nagasena tutorial #4
                
                InputStream in = null;
                InputStream is = null;
                OutputStream out = null;
                GrammarCache grammarCache;
                
                // All EXI options can be stored in a single short integer. DEFAULT_OPTIONS=2.
                short options;
                try {
                    
                    // Encoding always requires the same steps.
                    // 1. Instantiate a Transmogrifier
                    Transmogrifier transmogrifier = new Transmogrifier();
                    
                    // Bit-packed alignment is the default when transforming XML to
                    // EXI. For some smaller file sizes, greater compaction can be
                    // achieved using the default bit-packed setting.
                    transmogrifier.setAlignmentType(AlignmentType.compress);
                    
                    // If you are confident that your XML file is 100% compliant with
                    // the schema, you can use strict interpretation to encode the
                    // file. This is faster to process, and results in the smallest
                    // possible file size.
//                options = GrammarOptions.STRICT_OPTIONS;
                    // Strict not going to work: org.openexi.sax.TransmogrifierException:
                    // Attribute "noNamespaceSchemaLocation" of namespace
                    // "http://www.w3.org/2001/XMLSchema-instance" with value
                    // "http://www.web3d.org/specifications/x3d-3.3.xsd" is not expected.
                    
                    // Therefore, set default
                    options = GrammarOptions.DEFAULT_OPTIONS;

                    // 2. Initialize the input and output streams.
                    in = new FileInputStream(newXmlFile); // source
                    out = new FileOutputStream(newExiFile); // destination

                    // 2.5. Turn x3d-3.3.xsd into an EXIG for faster parsing
                    
                    // Faster if the schema is already in EXIG format
                    if (!new File("examples/x3d-3.3.xsd.exig").exists()) {
                        SerializeEXISchema s = new SerializeEXISchema();
                        try {
                            is = getClass().getResourceAsStream("/specifications/x3d-3.3.xsd");
                            s.serializeEXISchema("/specifications/x3d-3.3.xsd", is, "examples/x3d-3.3.xsd.exig");
                        } catch (EXISchemaFactoryException | IOException ex) {
                            Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                            throw new IllegalArgumentException(ex);
                        } finally {
                            try {
                                if (is != null) {
                                    is.close();
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }

                    // 3. Set the schema and EXI options in the Grammar Cache.
                    InputStream fis = null;
                    EXISchema schema = null;

                    try {
                        fis = new FileInputStream("examples/x3d-3.3.xsd.exig");
                        schema = new EXISchemaReader().parse(fis);
                    } finally {
                        if (fis != null) {
                            fis.close();
                        }
                    }

                    grammarCache = new GrammarCache(schema, options);

                    // 4. Set the configuration options in the Transmogrifier.
                    transmogrifier.setGrammarCache(grammarCache);

                    // 5. Set the output stream.
                    transmogrifier.setOutputStream(out);

                    // 6. Encode the input stream.
                    transmogrifier.encode(new InputSource(in));
                } catch (EXIOptionsException | TransmogrifierException | IOException ex) {
                    Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    
                    // 7.  Verify that the streams are closed.
                    try {
                        if (in != null) {
                            in.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                // non schema based compression
//
//            InputStream   in = null;
//            OutputStream out = null;
//            GrammarCache grammarCache;
//
//            try {
//
//                // Encoding always requires the same steps.
//
//                // 1. Instantiate a Transmogrifier
//                Transmogrifier transmogrifier = new Transmogrifier();
//
//                // 2. Initialize the input and output streams.
//                in  = new FileInputStream (newXmlFile);
//                out = new FileOutputStream(newExiFile);
//
//                // 3. Create a Grammar Cache. This example uses default options and no schema.
//                grammarCache = new GrammarCache(null, GrammarOptions.DEFAULT_OPTIONS); // (EXISchema)null
//
//                // 4. Set the configuration options in the Transmogrifier.
//                transmogrifier.setGrammarCache(grammarCache);
//
//                // 5. Set the output stream.
//                transmogrifier.setOutputStream(out);
//
//                // 6. Encode the input stream.
//                transmogrifier.encode(new InputSource(in));
//            }
//            catch (EXIOptionsException | TransmogrifierException | IOException ex)
//            {
//                Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            finally
//            {
//                // 7.  Verify that the streams are closed.
//                try {
//                    if (in != null) {
//                        in.close();
//                    }
//                    if (out != null) {
//                        out.close();
//                    }
//                }
//                catch (IOException ex)
//                {
//                    Logger.getLogger(X3DObject.class.getName()).log(Level.SEVERE, null, ex);
//                }
//             }
                break;
            default:
                errorNotice = ConfigurationProperties.ERROR_CONFIGURATION_X3DJSAIL + " illegal value \"" + ConfigurationProperties.getExiEngine()
                        + "\" found for ConfigurationProperties.getExiEngine()\n"
                        + "   allowed values are ConfigurationProperties.EXI_ENGINE_EXIFICIENT and ConfigurationProperties.EXI_ENGINE_OPENEXI";
                if (ConfigurationProperties.isDebugModeActive()) // debug check, defaults to local directory
                {
                    errorNotice += "[diagnostic] Output file path=" + outputFilePath.toAbsolutePath() + "\n";
                }
                System.err.println(errorNotice);
                throw new InvalidFieldValueException(errorNotice);
        }
        return newExiFile;
    }
										
	/**
	 * Save current model as a GZIP file.
	 * @see <a href="https://openexi.sourceforge.net/tutorial/index.html">OpenEXI Nagasena Tutorial</a>
	 * @see X3DObject#FILE_EXTENSION_EXI
	 * @see X3DObject#FILE_EXTENSION_GZIP
	 * @see X3DObject#FILE_EXTENSION_ZIP
	 * @see X3DObject#toFileEXI(String)
	 * @see X3DObject#toFileZIP(String,String)
	 * @see X3DObject#toFileX3D(String)
	 * @param resultFileName name of file to create and save, can include local directory path, must end with .gz (TODO or .tgz)
	 * @return File containing result (if operation succeeds), null otherwise
	 */
    public File toFileGZIP(String resultFileName)
	{
		File resultFile = new File (resultFileName);
		try
		{
			FileOutputStream fos  = new FileOutputStream(resultFile);
			GZIPOutputStream gzos = new GZIPOutputStream (fos);
			gzos.write(toStringX3D().getBytes());
			gzos.close();
		}
		catch (IOException ioe)
		{
			System.out.println (ioe.getMessage());
			ioe.printStackTrace();
		}
		return resultFile;
	}
										
	/**
	 * Save current model as a ZIP file.
	 * @see <a href="https://openexi.sourceforge.net/tutorial/index.html">OpenEXI Nagasena Tutorial</a>
	 * @see X3DObject#FILE_EXTENSION_EXI
	 * @see X3DObject#FILE_EXTENSION_GZIP
	 * @see X3DObject#FILE_EXTENSION_ZIP
	 * @see X3DObject#toFileEXI(String)
	 * @see X3DObject#toFileGZIP(String)
	 * @see X3DObject#toFileX3D(String)
	 * @param zipFileName name of zip archive file to create and save, can include local directory path, must end with .zip
	 * @param modelName name of X3D file to create and save within the .zip archive
	 * @return File containing result (if operation succeeds), null otherwise
	 */
    public File toFileZIP(String zipFileName, String modelName)
	{
		File resultFile = new File (zipFileName);
		try
		{
			FileOutputStream fos = new FileOutputStream(resultFile);
			ZipOutputStream  zos = new ZipOutputStream (fos);
			zos.setMethod(ZipOutputStream.DEFLATED); // matches java default
			zos.setLevel(Deflater.BEST_COMPRESSION);
			zos.setComment("Created by " + ConfigurationProperties.NAME_X3DJSAIL + " " + ConfigurationProperties.URL_X3DJSAIL);
			ZipEntry         ze  = new ZipEntry(modelName);
			zos.putNextEntry(ze);
			zos.write(toStringX3D().getBytes());
			zos.close();
		}
		catch (IOException ioe)
		{
			System.out.println (ioe.getMessage());
			ioe.printStackTrace();
		}
		return resultFile;
	}
										
  /** Provide thorough X3DJSAIL validation results for this X3D model.
   * @return "success" or validation results plus exception information (if any)
   */
  public String validationReport()
  {
	String       metaResult = new String();
	String validationResult = new String();
	String  exceptionResult = new String();
	try
	{
		// do not initialize() prior to validation since that clears the X3D entire model!
										
		if (getHead() != null)
		{
			// first list informational meta elements of interest
			for (metaObject meta : getHead().getMetaList())
			{
				if (meta.getName().equals(metaObject.NAME_ERROR) ||
					meta.getName().equals(metaObject.NAME_WARNING) ||
					meta.getName().equals(metaObject.NAME_HINT) ||
					meta.getName().equals(metaObject.NAME_INFO) ||
					meta.getName().equals(metaObject.NAME_TODO))
				{
					metaResult += meta.toStringX3D();
				}
			}
		}
		validationResult += validate(); // walk entire tree to validate correctness
	}
	catch (Exception e)
	{
		exceptionResult = e.getMessage(); // report exception failures, if any
	    if (exceptionResult == null)
	    {
			exceptionResult = "Exception caught but null message!";
			e.printStackTrace();
	    }
	}
	if  (metaResult.isEmpty() && exceptionResult.isEmpty() && validationResult.isEmpty())
	     return "success";
	else
	{
		if (!metaResult.isEmpty())
			metaResult = "\n" + metaResult; // easier to read
		String returnMessage = metaResult;
		if  (!exceptionResult.isEmpty() && !validationResult.isEmpty())
			returnMessage += "\n*** ";
		returnMessage += exceptionResult;
		if  (exceptionResult.isEmpty() && !validationResult.isEmpty())
			returnMessage = "\n" + returnMessage; // skip line before meta tags, etc.
		returnMessage += validationResult;
		return returnMessage;
	}
  }
										
	/** Utility method for standalone programs that get created with stylesheet X3dToJava.xslt,
	 * also sets loaded X3D model in global CommandLine to this X3DObject.
	 * Invocation switches are listed in CommandLine.USAGE help.
	 * @see org.web3d.x3d.jsail.CommandLine
	 * @see org.web3d.x3d.jsail.CommandLine#USAGE
	 * @see org.web3d.x3d.jsail.CommandLine#USAGE_LONG
	 * @see <a href="../../../../../../lib/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
	 * @see <a href="../../../../../../examples/HelloWorldProgramOutput.java" target="_blank">examples/HelloWorldProgramOutput.java</a>
	 * @param args command-line arguments
	 */
	public void handleArguments(String[] args)
	{
		String fileName = new String();
		File   newFile;

		CommandLine.setLoadedX3dModel(this); // initialize using this object

		CommandLine.run(args);
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide headObject instance (using a properly typed node) from inputOutput SFNode field <i>head</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Include a head element to contain component, unit or meta statements for this X3D model.  * <br>

	 * @return value of head field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public headObject getHead()
	{
		return head;
	}

	/**
	 * Accessor method to assign headObject instance (using a properly typed node) to inputOutput SFNode field <i>head</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Include a head element to contain component, unit or meta statements for this X3D model.  * <br>

	 * @param newValue is new value for the head field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DObject setHead(headObject newValue)
	{
		// set-newValue-validity-checks #0
		head = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) head).setParentObject(this); // parentTest15
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of head field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public X3DObject clearHead()
	{
		((X3DConcreteElement) head).clearParentObject(); // remove references to facilitate Java memory management
		head = null; // reset SFNode field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>head</i>.
	 * @return whether a concrete statement or CommentsBlock is available.
	 * @see #getHead()
	 */
	public boolean hasHead()
	{
		return (head != null);
	}
	/**
	 * Provide String enumeration value (baseType profileNameChoices) ["Core" | "Interchange" | "CADInterchange" | "Interactive" | "Immersive" | "MedicalInterchange" | "MPEG4Interactive" | "Full"] from inputOutput SFString field named <i>profile</i>.
	 * <br><br>
	 * <i>Tooltip:</i> profile attribute is required and defines the player or tool support needed for this model.
 * <ul>
 *  <li> <i>Hint:</i> Core profile corresponds to minimalist extensible profile with Metadata* nodes, useful for defining custom scene capabilities via addition of individual component statements. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/coreprofile.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/coreprofile.html</a> </li> 
 *  <li> <i>Hint:</i> Interchange profile corresponds to minimum lightweight subset of nodes needed to display (or import/export) compelling 3D content. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interchange.html</a> </li> 
 *  <li> <i>Hint:</i> Interactive profile corresponds to Interchange geometry plus simple user interaction. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interactive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interactive.html</a> </li> 
 *  <li> <i>Hint:</i> Immersive profile is common and approximately matches VRML97 with Script and Prototypes. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/immersive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/immersive.html</a> </li> 
 *  <li> <i>Hint:</i> CADInterchange profile (X3D version 3.1 or later) corresponds to Interchange geometry plus distillation of computer-aided design (CAD) models. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/CADInterchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/CADInterchange.html</a> </li> 
 *  <li> <i>Hint:</i> MedicalInterchange profile (X3D version 3.3 or later) adds support for VolumeRendering component to Interchange profile. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MedInterchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MedInterchange.html</a> </li> 
 *  <li> <i>Hint:</i> Full profile contains all nodes defined in X3D specification. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fullProfile.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fullProfile.html</a> </li> 
 *  <li> <i>Warning:</i> PROFILE is capitalized and is a separate statement in the ClassicVRML Encoding. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 7.2.5.3 PROFILE statement <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#PROFILEStatement" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#PROFILEStatement</a> </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #PROFILE_CORE CORE}, {@link #PROFILE_INTERCHANGE INTERCHANGE}, {@link #PROFILE_CADINTERCHANGE CADINTERCHANGE}, {@link #PROFILE_INTERACTIVE INTERACTIVE}, {@link #PROFILE_IMMERSIVE IMMERSIVE}, {@link #PROFILE_MEDICALINTERCHANGE MEDICALINTERCHANGE}, {@link #PROFILE_MPEG4INTERACTIVE MPEG4INTERACTIVE}, {@link #PROFILE_FULL FULL}.
	 * @return value of profile field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getProfile()
	{
		return profile;
	}

	/**
	 * Accessor method to assign String enumeration value ("Core" | "Interchange" | "CADInterchange" | "Interactive" | "Immersive" | "MedicalInterchange" | "MPEG4Interactive" | "Full") to inputOutput SFString field named <i>profile</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #PROFILE_CORE CORE}, {@link #PROFILE_INTERCHANGE INTERCHANGE}, {@link #PROFILE_CADINTERCHANGE CADINTERCHANGE}, {@link #PROFILE_INTERACTIVE INTERACTIVE}, {@link #PROFILE_IMMERSIVE IMMERSIVE}, {@link #PROFILE_MEDICALINTERCHANGE MEDICALINTERCHANGE}, {@link #PROFILE_MPEG4INTERACTIVE MPEG4INTERACTIVE}, {@link #PROFILE_FULL FULL}).
	 * <br><br>
	 * <i>Tooltip:</i> profile attribute is required and defines the player or tool support needed for this model.
 * <ul>
 *  <li> <i>Hint:</i> Core profile corresponds to minimalist extensible profile with Metadata* nodes, useful for defining custom scene capabilities via addition of individual component statements. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/coreprofile.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/coreprofile.html</a> </li> 
 *  <li> <i>Hint:</i> Interchange profile corresponds to minimum lightweight subset of nodes needed to display (or import/export) compelling 3D content. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interchange.html</a> </li> 
 *  <li> <i>Hint:</i> Interactive profile corresponds to Interchange geometry plus simple user interaction. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interactive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/interactive.html</a> </li> 
 *  <li> <i>Hint:</i> Immersive profile is common and approximately matches VRML97 with Script and Prototypes. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/immersive.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/immersive.html</a> </li> 
 *  <li> <i>Hint:</i> CADInterchange profile (X3D version 3.1 or later) corresponds to Interchange geometry plus distillation of computer-aided design (CAD) models. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/CADInterchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/CADInterchange.html</a> </li> 
 *  <li> <i>Hint:</i> MedicalInterchange profile (X3D version 3.3 or later) adds support for VolumeRendering component to Interchange profile. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MedInterchange.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/MedInterchange.html</a> </li> 
 *  <li> <i>Hint:</i> Full profile contains all nodes defined in X3D specification. <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fullProfile.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fullProfile.html</a> </li> 
 *  <li> <i>Warning:</i> PROFILE is capitalized and is a separate statement in the ClassicVRML Encoding. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 7.2.5.3 PROFILE statement <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#PROFILEStatement" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#PROFILEStatement</a> </li> 
 * </ul>
	 * @param newValue is new value for the profile field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DObject setProfile(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			newValue = new String(); // null string check
        }
		newValue = MFStringObject.cleanupUnescapedEnclosingQuotes(newValue); // handle potential enumeration value
		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(PROFILE_CORE) ||
			newValue.equals(PROFILE_INTERCHANGE) ||
			newValue.equals(PROFILE_CADINTERCHANGE) ||
			newValue.equals(PROFILE_INTERACTIVE) ||
			newValue.equals(PROFILE_IMMERSIVE) ||
			newValue.equals(PROFILE_MEDICALINTERCHANGE) ||
			newValue.equals(PROFILE_MPEG4INTERACTIVE) ||
			newValue.equals(PROFILE_FULL)))
		{
			String warningMessage = "Warning: X3D profile newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		profile = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString profile field, similar to {@link #setProfile(String)}.
	 * @param newValue is new value for the profile field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DObject setProfile(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setProfile(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide SceneObject instance (using a properly typed node) from inputOutput SFNode field <i>Scene</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Include a Scene element to contain scene-graph nodes for this X3D model.
 * <ul>
 *  <li> <i> Warning:</i>  Scene is a child of X3D statement, and must follow the (optional) head statement. </li> 
 * </ul>
	 * @return value of Scene field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public SceneObject getScene()
	{
		return Scene;
	}

	/**
	 * Accessor method to assign SceneObject instance (using a properly typed node) to inputOutput SFNode field <i>Scene</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Include a Scene element to contain scene-graph nodes for this X3D model.
 * <ul>
 *  <li> <i> Warning:</i>  Scene is a child of X3D statement, and must follow the (optional) head statement. </li> 
 * </ul>
	 * @param newValue is new value for the Scene field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DObject setScene(SceneObject newValue)
	{
		// set-newValue-validity-checks #0
		Scene = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) Scene).setParentObject(this); // parentTest15
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of Scene field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public X3DObject clearScene()
	{
		((X3DConcreteElement) Scene).clearParentObject(); // remove references to facilitate Java memory management
		Scene = null; // reset SFNode field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>Scene</i>.
	 * @return whether a concrete statement or CommentsBlock is available.
	 * @see #getScene()
	 */
	public boolean hasScene()
	{
		return (Scene != null);
	}
	/**
	 * Provide String enumeration value (baseType x3dVersionChoices) ["3.0" | "3.1" | "3.2" | "3.3" | "4.0"] from inputOutput SFString field named <i>version</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default is highest value matching schema and DOCTYPE in the scene.
 * <ul>
 *  <li> <i>Hint:</i> X3D version 3.0 standardization occurred in 2004, version 3.1 standardization occurred in 2006, version 3.2 standardization occurred in 2008, version 3.3 standardization occurred in 2012, version 4.0 undergoing final implementation, evaluation and publication in 2020. </li> 
 *  <li> <i>Warning:</i> X3D version 4.0 is experimental and under development, focused on HTML5/DOM interoperability. </li> 
 *  <li> <i>Warning:</i> X3D version 4.1 is experimental and under development, focused on Mixed and Augmented Reality (MAR). </li> 
 *  <li> <i>Hint:</i> X3D version 4 Overview at <a href="https://www.web3d.org/x3d4" target="_blank">https://www.web3d.org/x3d4</a> </li> 
 *  <li> <i>Hint:</i>  X3D version 4 Implementations Status at <a href="http://www.web3d.org/x3dv4-implementations" target="_blank">http://www.web3d.org/x3dv4-implementations</a> </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #VERSION_3_0 3_0}, {@link #VERSION_3_1 3_1}, {@link #VERSION_3_2 3_2}, {@link #VERSION_3_3 3_3}, {@link #VERSION_4_0 4_0}.
	 * @return value of version field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getVersion()
	{
		return version;
	}

	/**
	 * Accessor method to assign String enumeration value ("3.0" | "3.1" | "3.2" | "3.3" | "4.0") to inputOutput SFString field named <i>version</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #VERSION_3_0 3_0}, {@link #VERSION_3_1 3_1}, {@link #VERSION_3_2 3_2}, {@link #VERSION_3_3 3_3}, {@link #VERSION_4_0 4_0}).
	 * <br><br>
	 * <i>Tooltip:</i> Default is highest value matching schema and DOCTYPE in the scene.
 * <ul>
 *  <li> <i>Hint:</i> X3D version 3.0 standardization occurred in 2004, version 3.1 standardization occurred in 2006, version 3.2 standardization occurred in 2008, version 3.3 standardization occurred in 2012, version 4.0 undergoing final implementation, evaluation and publication in 2020. </li> 
 *  <li> <i>Warning:</i> X3D version 4.0 is experimental and under development, focused on HTML5/DOM interoperability. </li> 
 *  <li> <i>Warning:</i> X3D version 4.1 is experimental and under development, focused on Mixed and Augmented Reality (MAR). </li> 
 *  <li> <i>Hint:</i> X3D version 4 Overview at <a href="https://www.web3d.org/x3d4" target="_blank">https://www.web3d.org/x3d4</a> </li> 
 *  <li> <i>Hint:</i>  X3D version 4 Implementations Status at <a href="http://www.web3d.org/x3dv4-implementations" target="_blank">http://www.web3d.org/x3dv4-implementations</a> </li> 
 * </ul>
	 * @param newValue is new value for the version field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DObject setVersion(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			newValue = new String(); // null string check
        }
		newValue = MFStringObject.cleanupUnescapedEnclosingQuotes(newValue); // handle potential enumeration value
		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(VERSION_3_0) ||
			newValue.equals(VERSION_3_1) ||
			newValue.equals(VERSION_3_2) ||
			newValue.equals(VERSION_3_3) ||
			newValue.equals(VERSION_4_0)))
		{
			String warningMessage = "Warning: X3D version newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		version = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString version field, similar to {@link #setVersion(String)}.
	 * @param newValue is new value for the version field.
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DObject setVersion(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVersion(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public X3DObject addComments (String newComment)
	{
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public X3DObject addComments (String[] newComments)
	{
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link X3DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public X3DObject addComments (CommentsBlock newCommentsBlock)
	{
		commentsList.addAll(newCommentsBlock.toStringList());
		return this;
	}
		
	/**
	 * Recursive method to provide X3D string serialization of this model subgraph, utilizing XML encoding and conforming to X3D Canonical Form.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_X3D
	 * @see X3DObject#FILE_EXTENSION_XML
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see X3DObject#toFileX3D(String)
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/X3D_XML.html">X3D XML Encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-3/V3.3/Part03/concepts.html#X3DCanonicalForm" target="blank">X3D Compressed Binary Encoding: X3D Canonical Form</a>
	 * @see <a href="https://www.web3d.org/x3d/tools/canonical/doc/x3dTools.htm">X3D Canonicalization (C14N) Tool</a>
	 * @return X3D string
	 */
	@Override
	public String toStringX3D(int indentLevel)
	{
		boolean hasAttributes = true; // TODO check for non-default attribute values
		boolean      hasChild = (head != null) || (Scene != null) || !commentsList.isEmpty();

		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(XML_HEADER).append("\n");
		switch (version)
		{
			case "3.0":
				stringX3D.append(XML_DOCTYPE_X3D_3_0).append("\n");
				break;
			case "3.1":
				stringX3D.append(XML_DOCTYPE_X3D_3_1).append("\n");
				break;
			case "3.2":
				stringX3D.append(XML_DOCTYPE_X3D_3_2).append("\n");
				break;
			case "3.3":
				stringX3D.append(XML_DOCTYPE_X3D_3_3).append("\n");
				break;
			case "4.0":
				stringX3D.append(XML_DOCTYPE_X3D_4_0).append("\n");
				break;
			case "4.1":
				stringX3D.append(XML_DOCTYPE_X3D_4_1).append("\n");
				break;
			default:
				stringX3D.append("<!-- unknown DOCTYPE for X3D version ").append(version).append(" -->").append("\n");
		}
		stringX3D.append(indent).append("<X3D"); // start opening tag
		if (hasAttributes)
		{
            // test attributes

			if ((true) /* required attribute */ )
			{
				stringX3D.append(" profile='").append(new SFStringObject(getProfile()).toStringX3D()).append("'");
			}
			if ((true) /* required attribute */ )
			{
				stringX3D.append(" version='").append(new SFStringObject(getVersion()).toStringX3D()).append("'");
			}
				switch (version)
				{
					case "3.0":
						stringX3D.append(" ").append(X3D_XML_SCHEMA_3_0_ATTRIBUTES);
						break;
					case "3.1":
						stringX3D.append(" ").append(X3D_XML_SCHEMA_3_1_ATTRIBUTES);
						break;
					case "3.2":
						stringX3D.append(" ").append(X3D_XML_SCHEMA_3_2_ATTRIBUTES);
						break;
					case "3.3":
						stringX3D.append(" ").append(X3D_XML_SCHEMA_3_3_ATTRIBUTES);
						break;
					case "4.0":
						stringX3D.append(" ").append(X3D_XML_SCHEMA_4_0_ATTRIBUTES);
						break;
					case "4.1":
						stringX3D.append(" ").append(X3D_XML_SCHEMA_4_1_ATTRIBUTES);
						break;
					default:
						stringX3D.append(" ").append(X3D_XML_SCHEMA_3_3_ATTRIBUTES); // TODO error condition
						break;
				}
		}
		if ((hasChild)) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
			if      (head != null)
			{
				stringX3D.append(((X3DConcreteElement)head).toStringX3D(indentLevel + indentIncrement));
			}
			if      (Scene != null)
			{
				stringX3D.append(((X3DConcreteElement)Scene).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</X3D>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=X3D, isX3dStatement=true, isClassX3dStatement=true, $hasChild=true, $hasAttributes=true
	/**
	 * Recursive method to provide ClassicVRML string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_CLASSICVRML
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/X3D_ClassicVRML.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/grammar.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding, Annex A: Grammar</a>
	 * @return ClassicVRML string
	 */
	@Override
	public String toStringClassicVRML(int indentLevel)
	{
		StringBuilder stringClassicVRML = new StringBuilder();
		boolean hasAttributes = true; // TODO further refinement
		boolean      hasChild = (head != null) || (Scene != null) || !commentsList.isEmpty();
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		stringClassicVRML.append("#X3D V").append(version).append(" utf8").append("\n");
		stringClassicVRML.append("PROFILE").append(" ").append(profile).append("\n");
			if (hasAttributes)
			{
				if (false) // attribute handled separately
				{
					stringClassicVRML.append("profile ").append("\"").append(SFStringObject.toString(getProfile())).append("\"").append("\n");
				}
				if (false) // attribute handled separately
				{
					stringClassicVRML.append("version ").append("\"").append(SFStringObject.toString(getVersion())).append("\"").append("\n");
				}
			}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child elements
			if (Scene != null)
			{
				stringClassicVRML.append(((X3DConcreteElement) Scene).toStringClassicVRML(indentLevel)); // end X3D statement
			}
			if (head != null)
			{
				stringClassicVRML.append(((X3DConcreteElement) head).toStringClassicVRML(indentLevel)); // end X3D statement
			}
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
			}
		}
		return stringClassicVRML.toString();
	}

	/**
	 * Recursive method to provide VRML97 string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_VRML97
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772/V2.0/index.html">Virtual Reality Modeling Language (VRML) 97 specification</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772-1/V2.1/index.html">VRML 97 v2.1 Amendment</a>
	 * @return VRML97 string
	 */
	@Override
	public String toStringVRML97(int indentLevel)
	{
		return toStringClassicVRML(indentLevel)
		.replace("#X3D V3.3 utf8","#VRML V2.0 utf8")
		.replace("#X3D V3.2 utf8","#VRML V2.0 utf8")
		.replace("#X3D V3.1 utf8","#VRML V2.0 utf8")
		.replace("#X3D V3.0 utf8","#VRML V2.0 utf8")
		.replaceAll("PROFILE ","#PROFILE ")
		.replaceAll("COMPONENT ","#COMPONENT ")
		.replaceAll("META ","#META ")
		.replaceAll("UNIT ","#UNIT "); // hide unavailable X3D features
	}

	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, CAD and HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @see #findNodeByDEF(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found element, null otherwise
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue)
	{
		return findElementByNameValue(nameValue, ""); // empty string is wildcard, any element match is allowed
	}
								
	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, CAD and HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @see #findNodeByDEF(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @return object reference to found element, null otherwise
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue, String elementName)
	{
		if ((nameValue == null) || nameValue.isEmpty())
		{
			String errorNotice = "findElementByNameValue(\"\", " + elementName + ") cannot use empty string to find a name attribute";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		// no name field available for this element
		X3DConcreteElement referenceElement;
		if (head != null)
		{
			referenceElement = ((X3DConcreteElement) head).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (Scene != null)
		{
			referenceElement = ((X3DConcreteElement) Scene).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node or statement with given name attribute is found, meaning both objects are attached to same scene graph.
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @see #findElementByNameValue(String, String)
	 * @return whether node is found
	 */
	public boolean hasElementByNameValue(String nameValue, String elementName)
	{
		return (findElementByNameValue(nameValue, elementName) != null);
	}

	/**
	 * Recursive method to provide object reference to node by DEF, if found as this node or in a contained node.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same DEF, this method does not handle that case.
	 * @see #findElementByNameValue(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found node, null otherwise
	 */
	@Override
	public X3DConcreteNode findNodeByDEF(String DEFvalue)
	{
		if ((DEFvalue == null) || DEFvalue.isEmpty())
		{
			String errorNotice = "findNodeByDEF(\"\") cannot use empty string to find a name";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		X3DConcreteNode referenceNode;
		if (head != null)
		{
			referenceNode = ((X3DConcreteElement) head).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (Scene != null)
		{
			referenceNode = ((X3DConcreteElement) Scene).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node with DEFvalue is found, meaning both objects are attached to same scene graph.
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @see #findNodeByDEF(String)
	 * @return whether node is found
	 */
	public boolean hasNodeByDEF(String DEFvalue)
	{
		return (findNodeByDEF(DEFvalue) != null);
	}

		
	/**
	 * Recursive method to validate this element plus all contained nodes and statements, 
	 * using both datatype-specification value checks and regular expression (regex) checking of corresponding string values.
	 * @return validation results (if any)
	 */
	@Override
	public String validate()
	{
		validationResult = new StringBuilder(); // prepare for updated results

		if (getProfile().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " profile field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setProfile(getProfile()); // exercise field checks, simple types
        
        if (!hasHead()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no head element, and thus has no meta elements and is undescribed" + "\n");
		}
        if (!hasScene()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no Scene element and thus has no model defined" + "\n");
		}
		if (getVersion().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " version field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setVersion(getVersion()); // exercise field checks, simple types
        
        if (!hasHead()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no head element, and thus has no meta elements and is undescribed" + "\n");
		}
        if (!hasScene()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no Scene element and thus has no model defined" + "\n");
		}
		if (head != null)
		{
			setHead(getHead());
			((X3DConcreteElement) head).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) head).getValidationResult());
		}
        if (!hasHead()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no head element, and thus has no meta elements and is undescribed" + "\n");
		}
        if (!hasScene()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no Scene element and thus has no model defined" + "\n");
		}
		if (Scene != null)
		{
			setScene(getScene());
			((X3DConcreteElement) Scene).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) Scene).getValidationResult());
		}
        if (!hasHead()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no head element, and thus has no meta elements and is undescribed" + "\n");
		}
        if (!hasScene()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D has no Scene element and thus has no model defined" + "\n");
		}
		return validationResult.toString();
	}
    /**
     * Confirm whether given version is supported by current X3D object.
     * @param otherVersion other X3D version to check
     * @return whether current X3D version is greater than or equal to otherVersion
     * @throws InvalidFieldValueException if provided with illegal value
     */
    public boolean supportsX3dVersion (String otherVersion) throws InvalidFieldValueException
    {
		if ((otherVersion == null || otherVersion.isEmpty()))
        {
            otherVersion = VERSION_DEFAULT_VALUE;
            System.out.println ("Warning: X3DObject.supportsX3dVersion{\"\") called with empty otherVersion value, substituting VERSION_DEFAULT_VALUE=" + VERSION_DEFAULT_VALUE);
        }

        if (!(
			otherVersion.equals(VERSION_3_0) ||
			otherVersion.equals(VERSION_3_1) ||
			otherVersion.equals(VERSION_3_2) ||
			otherVersion.equals(VERSION_3_3) ||
			otherVersion.equals(VERSION_4_0)))
        {
            String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + " illegal X3D version " + otherVersion;
            throw new InvalidFieldValueException(errorNotice);
        }
        return (getVersion().compareTo(otherVersion) >= 0); // Java string comparison
    }

    /**
     * Confirm whether given profile is supported by current X3D model
     * @param otherProfile different X3D profile for comparison
     * @return whether current X3D model supports otherProfile
     * @throws InvalidFieldValueException if provided with illegal value
     */
    public boolean supportsX3dProfile (String otherProfile) throws InvalidFieldValueException
    {
		if ((otherProfile == null || otherProfile.isEmpty()))
        {
            otherProfile = PROFILE_DEFAULT_VALUE;
            System.out.println ("Warning: X3DObject.supportsX3dProfile{\"\") called with empty otherProfile value, substituting PROFILE_DEFAULT_VALUE=" + PROFILE_DEFAULT_VALUE);
        }
        boolean legalProfile = profile.equals(PROFILE_CORE) ||
                               profile.equals(PROFILE_CADINTERCHANGE) ||
                               profile.equals(PROFILE_FULL) ||
                               profile.equals(PROFILE_IMMERSIVE) ||
                               profile.equals(PROFILE_INTERACTIVE) ||
                               profile.equals(PROFILE_INTERCHANGE) ||
                               profile.equals(PROFILE_MEDICALINTERCHANGE) ||
                               profile.equals(PROFILE_MPEG4INTERACTIVE);
        if (!legalProfile)
        {
            String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + " illegal X3D profile " + otherProfile;
            throw new InvalidFieldValueException(errorNotice);
        }
        boolean hasComponentCAD =    (head != null) && (head.hasComponent(componentObject.NAME_CADGEOMETRY));
        boolean hasComponentVolume = (head != null) && (head.hasComponent(componentObject.NAME_VOLUMERENDERING));

        boolean hasSupportedProfile =
            (     profile.equals(PROFILE_FULL)) ||  // FULL supports all profiles
			(otherProfile.equals(profile))      ||  // matched profiles
			(otherProfile.equals(PROFILE_CORE)) ||  // minimal CORE always supported
            
			(otherProfile.equals(PROFILE_INTERCHANGE) && 
                (!profile.equals(PROFILE_CORE))) || // any other profile is a superset
            
			(otherProfile.equals(PROFILE_INTERACTIVE) && 
                 (profile.equals(PROFILE_IMMERSIVE))) ||
            
			(otherProfile.equals(PROFILE_IMMERSIVE) && 
                 (profile.equals(PROFILE_IMMERSIVE))) ||
            
			(otherProfile.equals(PROFILE_CADINTERCHANGE) && 
                 (profile.equals(PROFILE_IMMERSIVE) && hasComponentCAD)) ||
            
			(otherProfile.equals(PROFILE_MEDICALINTERCHANGE) && 
                 (profile.equals(PROFILE_IMMERSIVE) && hasComponentVolume));
        
        return hasSupportedProfile;
    }

    /**
     * Confirm whether given component is supported by current X3D model,
     * Warning: no support for level tests yet.  TODO.
     * @param otherComponent other component to check
     * @param minimumLevel minimum level of component support needed
     * @return comparison result
     * @throws InvalidFieldValueException if provided with illegal value(s)
     */
    public boolean supportsX3dComponent (String otherComponent, int minimumLevel) throws InvalidFieldValueException
    {
		if ((otherComponent == null || otherComponent.isEmpty()))
        {
            System.out.println ("Warning: X3DObject.supportsX3dComponent(\"\"," + minimumLevel + ") called with empty otherComponent value, nothing to do, returning false");
            return false;
        }
		if ((minimumLevel < 1) || (minimumLevel > 5))
        {
            System.out.println ("Warning: X3DObject.supportsX3dComponent(\"" + otherComponent + "\") called with minimumLevel value outside allowed range [1..5], returning false");
            return false;
        }
        // check legal component values, throws InvalidFieldValueException if incorrect
        componentObject testComponentObject = new componentObject().setName(otherComponent).setLevel(minimumLevel);
            
        boolean hasComponentCADGEOMETRY          = (head != null) && (head.hasComponent(componentObject.NAME_CADGEOMETRY));
        boolean hasComponentCORE                 = (head != null) && (head.hasComponent(componentObject.NAME_CORE));
        boolean hasComponentCUBEMAPTEXTURING     = (head != null) && (head.hasComponent(componentObject.NAME_CUBEMAPTEXTURING));
        boolean hasComponentDIS                  = (head != null) && (head.hasComponent(componentObject.NAME_DIS));
        boolean hasComponentENVIRONMENTALEFFECTS = (head != null) && (head.hasComponent(componentObject.NAME_ENVIRONMENTALEFFECTS));
        boolean hasComponentENVIRONMENTALSENSOR  = (head != null) && (head.hasComponent(componentObject.NAME_ENVIRONMENTALSENSOR));
        boolean hasComponentEVENTUTILITIES       = (head != null) && (head.hasComponent(componentObject.NAME_EVENTUTILITIES));
        boolean hasComponentFOLLOWERS            = (head != null) && (head.hasComponent(componentObject.NAME_FOLLOWERS));
        boolean hasComponentGEOMETRY2D           = (head != null) && (head.hasComponent(componentObject.NAME_GEOMETRY2D));
        boolean hasComponentGEOMETRY3D           = (head != null) && (head.hasComponent(componentObject.NAME_GEOMETRY3D));
        boolean hasComponentGEOSPATIAL           = (head != null) && (head.hasComponent(componentObject.NAME_GEOSPATIAL));
        boolean hasComponentGROUPING             = (head != null) && (head.hasComponent(componentObject.NAME_GROUPING));
        boolean hasComponentH_ANIM               = (head != null) && (head.hasComponent(componentObject.NAME_H_ANIM));
        boolean hasComponentINTERPOLATION        = (head != null) && (head.hasComponent(componentObject.NAME_INTERPOLATION));
        boolean hasComponentKEYDEVICESENSOR      = (head != null) && (head.hasComponent(componentObject.NAME_KEYDEVICESENSOR));
        boolean hasComponentLAYERING             = (head != null) && (head.hasComponent(componentObject.NAME_LAYERING));
        boolean hasComponentLAYOUT               = (head != null) && (head.hasComponent(componentObject.NAME_LAYOUT));
        boolean hasComponentLIGHTING             = (head != null) && (head.hasComponent(componentObject.NAME_LIGHTING));
        boolean hasComponentNAVIGATION           = (head != null) && (head.hasComponent(componentObject.NAME_NAVIGATION));
        boolean hasComponentNETWORKING           = (head != null) && (head.hasComponent(componentObject.NAME_NETWORKING));
        boolean hasComponentNURBS                = (head != null) && (head.hasComponent(componentObject.NAME_NURBS));
        boolean hasComponentPARTICLESYSTEMS      = (head != null) && (head.hasComponent(componentObject.NAME_PARTICLESYSTEMS));
        boolean hasComponentPICKING              = (head != null) && (head.hasComponent(componentObject.NAME_PICKING));
        boolean hasComponentPOINTINGDEVICESENSOR = (head != null) && (head.hasComponent(componentObject.NAME_POINTINGDEVICESENSOR));
        boolean hasComponentRENDERING            = (head != null) && (head.hasComponent(componentObject.NAME_RENDERING));
        boolean hasComponentRIGIDBODYPHYSICS     = (head != null) && (head.hasComponent(componentObject.NAME_RIGIDBODYPHYSICS));
        boolean hasComponentSCRIPTING            = (head != null) && (head.hasComponent(componentObject.NAME_SCRIPTING));
        boolean hasComponentSHADERS              = (head != null) && (head.hasComponent(componentObject.NAME_SHADERS));
        boolean hasComponentSHAPE                = (head != null) && (head.hasComponent(componentObject.NAME_SHAPE));
        boolean hasComponentSOUND                = (head != null) && (head.hasComponent(componentObject.NAME_SOUND));
        boolean hasComponentTEXT                 = (head != null) && (head.hasComponent(componentObject.NAME_TEXT));
        boolean hasComponentTEXTURING            = (head != null) && (head.hasComponent(componentObject.NAME_TEXTURING));
        boolean hasComponentTEXTURING3D          = (head != null) && (head.hasComponent(componentObject.NAME_TEXTURING3D));
        boolean hasComponentTIME                 = (head != null) && (head.hasComponent(componentObject.NAME_TIME));
        boolean hasComponentVOLUMERENDERING      = (head != null) && (head.hasComponent(componentObject.NAME_VOLUMERENDERING));
            
        int hasLevelCADGEOMETRY          = 0;
        int hasLevelCORE                 = 0;
        int hasLevelCUBEMAPTEXTURING     = 0;
        int hasLevelDIS                  = 0;
        int hasLevelENVIRONMENTALEFFECTS = 0;
        int hasLevelENVIRONMENTALSENSOR  = 0;
        int hasLevelEVENTUTILITIES       = 0;
        int hasLevelFOLLOWERS            = 0;
        int hasLevelGEOMETRY2D           = 0;
        int hasLevelGEOMETRY3D           = 0;
        int hasLevelGEOSPATIAL           = 0;
        int hasLevelGROUPING             = 0;
        int hasLevelH_ANIM               = 0;
        int hasLevelINTERPOLATION        = 0;
        int hasLevelKEYDEVICESENSOR      = 0;
        int hasLevelLAYERING             = 0;
        int hasLevelLAYOUT               = 0;
        int hasLevelLIGHTING             = 0;
        int hasLevelNAVIGATION           = 0;
        int hasLevelNETWORKING           = 0;
        int hasLevelNURBS                = 0;
        int hasLevelPARTICLESYSTEMS      = 0;
        int hasLevelPICKING              = 0;
        int hasLevelPOINTINGDEVICESENSOR = 0;
        int hasLevelRENDERING            = 0;
        int hasLevelRIGIDBODYPHYSICS     = 0;
        int hasLevelSCRIPTING            = 0;
        int hasLevelSHADERS              = 0;
        int hasLevelSHAPE                = 0;
        int hasLevelSOUND                = 0;
        int hasLevelTEXT                 = 0;
        int hasLevelTEXTURING            = 0;
        int hasLevelTEXTURING3D          = 0;
        int hasLevelTIME                 = 0;
        int hasLevelVOLUMERENDERING      = 0;
        
        if (head != null)
        {
            if (head.hasComponent(componentObject.NAME_CADGEOMETRY))
                hasLevelCADGEOMETRY          = head.findComponentByName(componentObject.NAME_CADGEOMETRY).getLevel();
            if (head.hasComponent(componentObject.NAME_CORE))
                hasLevelCORE                 = head.findComponentByName(componentObject.NAME_CORE).getLevel();
            if (head.hasComponent(componentObject.NAME_CUBEMAPTEXTURING))
                hasLevelCUBEMAPTEXTURING     = head.findComponentByName(componentObject.NAME_CUBEMAPTEXTURING).getLevel();
            if (head.hasComponent(componentObject.NAME_DIS))
                hasLevelDIS                  = head.findComponentByName(componentObject.NAME_DIS).getLevel();
            if (head.hasComponent(componentObject.NAME_ENVIRONMENTALEFFECTS))
                hasLevelENVIRONMENTALEFFECTS = head.findComponentByName(componentObject.NAME_ENVIRONMENTALEFFECTS).getLevel();
            if (head.hasComponent(componentObject.NAME_ENVIRONMENTALSENSOR))
                hasLevelENVIRONMENTALSENSOR  = head.findComponentByName(componentObject.NAME_ENVIRONMENTALSENSOR).getLevel();
            if (head.hasComponent(componentObject.NAME_EVENTUTILITIES))
                hasLevelEVENTUTILITIES       = head.findComponentByName(componentObject.NAME_EVENTUTILITIES).getLevel();
            if (head.hasComponent(componentObject.NAME_FOLLOWERS))
                hasLevelFOLLOWERS            = head.findComponentByName(componentObject.NAME_FOLLOWERS).getLevel();
            if (head.hasComponent(componentObject.NAME_GEOMETRY2D))
                hasLevelGEOMETRY2D           = head.findComponentByName(componentObject.NAME_GEOMETRY2D).getLevel();
            if (head.hasComponent(componentObject.NAME_GEOMETRY3D))
                hasLevelGEOMETRY3D           = head.findComponentByName(componentObject.NAME_GEOMETRY3D).getLevel();
            if (head.hasComponent(componentObject.NAME_GEOSPATIAL))
                hasLevelGEOSPATIAL           = head.findComponentByName(componentObject.NAME_GEOSPATIAL).getLevel();
            if (head.hasComponent(componentObject.NAME_GROUPING))
                hasLevelGROUPING             = head.findComponentByName(componentObject.NAME_GROUPING).getLevel();
            if (head.hasComponent(componentObject.NAME_H_ANIM))
                hasLevelH_ANIM               = head.findComponentByName(componentObject.NAME_H_ANIM).getLevel();
            if (head.hasComponent(componentObject.NAME_INTERPOLATION))
                hasLevelINTERPOLATION        = head.findComponentByName(componentObject.NAME_INTERPOLATION).getLevel();
            if (head.hasComponent(componentObject.NAME_KEYDEVICESENSOR))
                hasLevelKEYDEVICESENSOR      = head.findComponentByName(componentObject.NAME_KEYDEVICESENSOR).getLevel();
            if (head.hasComponent(componentObject.NAME_LAYERING))
                hasLevelLAYERING             = head.findComponentByName(componentObject.NAME_LAYERING).getLevel();
            if (head.hasComponent(componentObject.NAME_LAYOUT))
                hasLevelLAYOUT               = head.findComponentByName(componentObject.NAME_LAYOUT).getLevel();
            if (head.hasComponent(componentObject.NAME_LIGHTING))
                hasLevelLIGHTING             = head.findComponentByName(componentObject.NAME_LIGHTING).getLevel();
            if (head.hasComponent(componentObject.NAME_NAVIGATION))
                hasLevelNAVIGATION           = head.findComponentByName(componentObject.NAME_NAVIGATION).getLevel();
            if (head.hasComponent(componentObject.NAME_NETWORKING))
                hasLevelNETWORKING           = head.findComponentByName(componentObject.NAME_NETWORKING).getLevel();
            if (head.hasComponent(componentObject.NAME_NURBS))
                hasLevelNURBS                = head.findComponentByName(componentObject.NAME_NURBS).getLevel();
            if (head.hasComponent(componentObject.NAME_PARTICLESYSTEMS))
                hasLevelPARTICLESYSTEMS      = head.findComponentByName(componentObject.NAME_PARTICLESYSTEMS).getLevel();
            if (head.hasComponent(componentObject.NAME_PICKING))
                hasLevelPICKING              = head.findComponentByName(componentObject.NAME_PICKING).getLevel();
            if (head.hasComponent(componentObject.NAME_POINTINGDEVICESENSOR))
                hasLevelPOINTINGDEVICESENSOR = head.findComponentByName(componentObject.NAME_POINTINGDEVICESENSOR).getLevel();
            if (head.hasComponent(componentObject.NAME_RENDERING))
                hasLevelRENDERING            = head.findComponentByName(componentObject.NAME_RENDERING).getLevel();
            if (head.hasComponent(componentObject.NAME_RIGIDBODYPHYSICS))
                hasLevelRIGIDBODYPHYSICS     = head.findComponentByName(componentObject.NAME_RIGIDBODYPHYSICS).getLevel();
            if (head.hasComponent(componentObject.NAME_SCRIPTING))
                hasLevelSCRIPTING            = head.findComponentByName(componentObject.NAME_SCRIPTING).getLevel();
            if (head.hasComponent(componentObject.NAME_SHADERS))
                hasLevelSHADERS              = head.findComponentByName(componentObject.NAME_SHADERS).getLevel();
            if (head.hasComponent(componentObject.NAME_SHAPE))
                hasLevelSHAPE                = head.findComponentByName(componentObject.NAME_SHAPE).getLevel();
            if (head.hasComponent(componentObject.NAME_SOUND))
                hasLevelSOUND                = head.findComponentByName(componentObject.NAME_SOUND).getLevel();
            if (head.hasComponent(componentObject.NAME_TEXT))
                hasLevelTEXT                 = head.findComponentByName(componentObject.NAME_TEXT).getLevel();
            if (head.hasComponent(componentObject.NAME_TEXTURING))
                hasLevelTEXTURING            = head.findComponentByName(componentObject.NAME_TEXTURING).getLevel();
            if (head.hasComponent(componentObject.NAME_TEXTURING3D))
                hasLevelTEXTURING3D          = head.findComponentByName(componentObject.NAME_TEXTURING3D).getLevel();
            if (head.hasComponent(componentObject.NAME_TIME))
                hasLevelTIME                 = head.findComponentByName(componentObject.NAME_TIME).getLevel();
            if (head.hasComponent(componentObject.NAME_VOLUMERENDERING))
                hasLevelVOLUMERENDERING      = head.findComponentByName(componentObject.NAME_VOLUMERENDERING).getLevel();
        }

        if       (profile.equals(PROFILE_CORE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 1);
        }
        else if  (profile.equals(PROFILE_INTERCHANGE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 1);
            hasComponentTIME                 = true;
                hasLevelTIME                 = Integer.max(hasLevelTIME, 1);
            hasComponentNETWORKING           = true;
                hasLevelNETWORKING           = Integer.max(hasLevelNETWORKING, 1);
            hasComponentGROUPING             = true;
                hasLevelGROUPING             = Integer.max(hasLevelGROUPING, 1);
            hasComponentRENDERING            = true;
                hasLevelRENDERING            = Integer.max(hasLevelRENDERING, 3);
            hasComponentSHAPE                = true;
                hasLevelSHAPE                = Integer.max(hasLevelSHAPE, 1);
            hasComponentGEOMETRY3D           = true;
                hasLevelGEOMETRY3D           = Integer.max(hasLevelGEOMETRY3D, 2);
            hasComponentLIGHTING             = true;
                hasLevelLIGHTING             = Integer.max(hasLevelLIGHTING, 1);
            hasComponentTEXTURING            = true;
                hasLevelTEXTURING            = Integer.max(hasLevelTEXTURING, 2);
            hasComponentINTERPOLATION        = true;
                hasLevelINTERPOLATION        = Integer.max(hasLevelINTERPOLATION, 2);
            hasComponentNAVIGATION           = true;
                hasLevelNAVIGATION           = Integer.max(hasLevelNAVIGATION, 1);
            hasComponentENVIRONMENTALEFFECTS = true;
                hasLevelENVIRONMENTALEFFECTS = Integer.max(hasLevelENVIRONMENTALEFFECTS, 1);
        }
        else if (profile.equals(PROFILE_INTERACTIVE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 1);
            hasComponentTIME                 = true;
                hasLevelTIME                 = Integer.max(hasLevelTIME, 1);
            hasComponentNETWORKING           = true;
                hasLevelNETWORKING           = Integer.max(hasLevelNETWORKING, 2);
            hasComponentGROUPING             = true;
                hasLevelGROUPING             = Integer.max(hasLevelGROUPING, 2);
            hasComponentRENDERING            = true;
                hasLevelRENDERING            = Integer.max(hasLevelRENDERING, 3);
            hasComponentSHAPE                = true;
                hasLevelSHAPE                = Integer.max(hasLevelSHAPE, 1);
            hasComponentGEOMETRY3D           = true;
                hasLevelGEOMETRY3D           = Integer.max(hasLevelGEOMETRY3D, 3);
            hasComponentLIGHTING             = true;
                hasLevelLIGHTING             = Integer.max(hasLevelLIGHTING, 2);
            hasComponentTEXTURING            = true;
                hasLevelTEXTURING            = Integer.max(hasLevelTEXTURING, 2);
            hasComponentINTERPOLATION        = true;
                hasLevelINTERPOLATION        = Integer.max(hasLevelINTERPOLATION, 2);
            hasComponentPOINTINGDEVICESENSOR = true;
                hasLevelPOINTINGDEVICESENSOR = Integer.max(hasLevelPOINTINGDEVICESENSOR, 2);
            hasComponentKEYDEVICESENSOR      = true;
                hasLevelKEYDEVICESENSOR      = Integer.max(hasLevelKEYDEVICESENSOR, 1);
            hasComponentENVIRONMENTALSENSOR  = true;
                hasLevelENVIRONMENTALSENSOR  = Integer.max(hasLevelENVIRONMENTALSENSOR, 1);
            hasComponentNAVIGATION           = true;
                hasLevelNAVIGATION           = Integer.max(hasLevelNAVIGATION, 1);
            hasComponentENVIRONMENTALEFFECTS = true;
                hasLevelENVIRONMENTALEFFECTS = Integer.max(hasLevelENVIRONMENTALEFFECTS, 1);
            hasComponentEVENTUTILITIES       = true;
                hasLevelEVENTUTILITIES       = Integer.max(hasLevelEVENTUTILITIES, 1);
        }
        else if (profile.equals(PROFILE_IMMERSIVE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 2);
            hasComponentTIME                 = true;
                hasLevelTIME                 = Integer.max(hasLevelTIME, 1);
            hasComponentNETWORKING           = true;
                hasLevelNETWORKING           = Integer.max(hasLevelNETWORKING, 3);
            hasComponentGROUPING             = true;
                hasLevelGROUPING             = Integer.max(hasLevelGROUPING, 2);
            hasComponentRENDERING            = true;
                hasLevelRENDERING            = Integer.max(hasLevelRENDERING, 3);
            hasComponentSHAPE                = true;
                hasLevelSHAPE                = Integer.max(hasLevelSHAPE, 2);
            hasComponentGEOMETRY3D           = true;
                hasLevelGEOMETRY3D           = Integer.max(hasLevelGEOMETRY3D, 4);
            hasComponentGEOMETRY2D           = true;
                hasLevelGEOMETRY2D           = Integer.max(hasLevelGEOMETRY2D, 1);
            hasComponentTEXT                 = true;
                hasLevelTEXT                 = Integer.max(hasLevelTEXT, 1);
            hasComponentSOUND                = true;
                hasLevelSOUND                = Integer.max(hasLevelSOUND, 1);
            hasComponentLIGHTING             = true;
                hasLevelLIGHTING             = Integer.max(hasLevelLIGHTING, 2);
            hasComponentTEXTURING            = true;
                hasLevelTEXTURING            = Integer.max(hasLevelTEXTURING, 3);
            hasComponentINTERPOLATION        = true;
                hasLevelINTERPOLATION        = Integer.max(hasLevelINTERPOLATION, 2);
            hasComponentPOINTINGDEVICESENSOR = true;
                hasLevelPOINTINGDEVICESENSOR = Integer.max(hasLevelPOINTINGDEVICESENSOR, 1);
            hasComponentKEYDEVICESENSOR      = true;
                hasLevelKEYDEVICESENSOR      = Integer.max(hasLevelKEYDEVICESENSOR, 2);
            hasComponentENVIRONMENTALSENSOR  = true;
                hasLevelENVIRONMENTALSENSOR  = Integer.max(hasLevelENVIRONMENTALSENSOR, 2);
            hasComponentNAVIGATION           = true;
                hasLevelNAVIGATION           = Integer.max(hasLevelNAVIGATION, 2);
            hasComponentENVIRONMENTALEFFECTS = true;
                hasLevelENVIRONMENTALEFFECTS = Integer.max(hasLevelENVIRONMENTALEFFECTS, 2);
            hasComponentSCRIPTING            = true;
                hasLevelSCRIPTING            = Integer.max(hasLevelSCRIPTING, 1);
            hasComponentEVENTUTILITIES       = true;
                hasLevelEVENTUTILITIES       = Integer.max(hasLevelEVENTUTILITIES, 1);
        }
        else if (profile.equals(PROFILE_CADINTERCHANGE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 1);
            hasComponentNETWORKING           = true;
                hasLevelNETWORKING           = Integer.max(hasLevelNETWORKING, 2);
            hasComponentGROUPING             = true;
                hasLevelGROUPING             = Integer.max(hasLevelGROUPING, 1);
            hasComponentRENDERING            = true;
                hasLevelRENDERING            = Integer.max(hasLevelRENDERING, 4);
            hasComponentSHAPE                = true;
                hasLevelSHAPE                = Integer.max(hasLevelSHAPE, 2);
            hasComponentLIGHTING             = true;
                hasLevelLIGHTING             = Integer.max(hasLevelLIGHTING, 1);
            hasComponentTEXTURING            = true;
                hasLevelTEXTURING            = Integer.max(hasLevelTEXTURING, 2);
            hasComponentNAVIGATION           = true;
                hasLevelNAVIGATION           = Integer.max(hasLevelNAVIGATION, 2);
            hasComponentSHADERS              = true;
                hasLevelSHADERS              = Integer.max(hasLevelSHADERS, 1);
            hasComponentCADGEOMETRY          = true;
                hasLevelCADGEOMETRY          = Integer.max(hasLevelCADGEOMETRY, 1);
        }
        else if (profile.equals(PROFILE_MEDICALINTERCHANGE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 1);
            hasComponentTIME                 = true;
                hasLevelTIME                 = Integer.max(hasLevelTIME, 1);
            hasComponentNETWORKING           = true;
                hasLevelNETWORKING           = Integer.max(hasLevelNETWORKING, 2);
            hasComponentGROUPING             = true;
                hasLevelGROUPING             = Integer.max(hasLevelGROUPING, 3);
            hasComponentRENDERING            = true;
                hasLevelRENDERING            = Integer.max(hasLevelRENDERING, 5);
            hasComponentSHAPE                = true;
                hasLevelSHAPE                = Integer.max(hasLevelSHAPE, 3);
            hasComponentGEOMETRY3D           = true;
                hasLevelGEOMETRY3D           = Integer.max(hasLevelGEOMETRY3D, 2);
            hasComponentGEOMETRY2D           = true;
                hasLevelGEOMETRY2D           = Integer.max(hasLevelGEOMETRY2D, 2);
            hasComponentTEXT                 = true;
                hasLevelTEXT                 = Integer.max(hasLevelTEXT, 1);
            hasComponentLIGHTING             = true;
                hasLevelLIGHTING             = Integer.max(hasLevelLIGHTING, 2);
            hasComponentTEXTURING            = true;
                hasLevelTEXTURING            = Integer.max(hasLevelTEXTURING, 2);
            hasComponentNAVIGATION           = true;
                hasLevelNAVIGATION           = Integer.max(hasLevelNAVIGATION, 3);
            hasComponentENVIRONMENTALEFFECTS = true;
                hasLevelENVIRONMENTALEFFECTS = Integer.max(hasLevelENVIRONMENTALEFFECTS, 1);
            hasComponentEVENTUTILITIES       = true;
                hasLevelEVENTUTILITIES       = Integer.max(hasLevelEVENTUTILITIES, 1);
            hasComponentTEXTURING3D          = true;
                hasLevelTEXTURING3D          = Integer.max(hasLevelTEXTURING3D, 2);
            hasComponentVOLUMERENDERING      = true;
                hasLevelVOLUMERENDERING      = Integer.max(hasLevelVOLUMERENDERING, 4);
        }
        else if (profile.equals(PROFILE_MPEG4INTERACTIVE))
        {
            hasComponentCORE                 = true;
                hasLevelCORE                 = Integer.max(hasLevelCORE, 1);
            hasComponentTIME                 = true;
                hasLevelTIME                 = Integer.max(hasLevelTIME, 1);
            hasComponentNETWORKING           = true;
                hasLevelNETWORKING           = Integer.max(hasLevelNETWORKING, 2);
            hasComponentGROUPING             = true;
                hasLevelGROUPING             = Integer.max(hasLevelGROUPING, 2);
            hasComponentRENDERING            = true;
                hasLevelRENDERING            = Integer.max(hasLevelRENDERING, 1);
            hasComponentSHAPE                = true;
                hasLevelSHAPE                = Integer.max(hasLevelSHAPE, 1);
            hasComponentGEOMETRY3D           = true;
                hasLevelGEOMETRY3D           = Integer.max(hasLevelGEOMETRY3D, 2);
            hasComponentLIGHTING             = true;
                hasLevelLIGHTING             = Integer.max(hasLevelLIGHTING, 1);
            hasComponentTEXTURING            = true;
                hasLevelTEXTURING            = Integer.max(hasLevelTEXTURING, 2);
            hasComponentINTERPOLATION        = true;
                hasLevelINTERPOLATION        = Integer.max(hasLevelINTERPOLATION, 1);
            hasComponentPOINTINGDEVICESENSOR = true;
                hasLevelPOINTINGDEVICESENSOR = Integer.max(hasLevelPOINTINGDEVICESENSOR, 1);
            hasComponentENVIRONMENTALSENSOR  = true;
                hasLevelENVIRONMENTALSENSOR  = Integer.max(hasLevelENVIRONMENTALSENSOR, 1);
            hasComponentNAVIGATION           = true;
                hasLevelNAVIGATION           = Integer.max(hasLevelNAVIGATION, 1);
            hasComponentENVIRONMENTALEFFECTS = true;
                hasLevelENVIRONMENTALEFFECTS = Integer.max(hasLevelENVIRONMENTALEFFECTS, 1);
        }
        
        boolean hasSupport =
            (profile.equals(PROFILE_FULL)) ||  // FULL supports all profiles
            
			(otherComponent.equals(componentObject.NAME_CORE)                 && hasComponentCORE &&
                (minimumLevel <= hasLevelCORE)) ||  // minimal CORE always supported
			(otherComponent.equals(componentObject.NAME_CADGEOMETRY)          && hasComponentCADGEOMETRY &&
                (minimumLevel <= hasLevelCADGEOMETRY)) ||
			(otherComponent.equals(componentObject.NAME_CUBEMAPTEXTURING)     && hasComponentCUBEMAPTEXTURING &&
                (minimumLevel <= hasLevelCUBEMAPTEXTURING)) ||
			(otherComponent.equals(componentObject.NAME_DIS)                  && hasComponentDIS &&
                (minimumLevel <= hasLevelDIS)) ||
			(otherComponent.equals(componentObject.NAME_ENVIRONMENTALEFFECTS) && hasComponentENVIRONMENTALEFFECTS &&
                (minimumLevel <= hasLevelENVIRONMENTALEFFECTS)) ||
			(otherComponent.equals(componentObject.NAME_ENVIRONMENTALSENSOR)  && hasComponentENVIRONMENTALSENSOR &&
                (minimumLevel <= hasLevelENVIRONMENTALSENSOR)) ||
			(otherComponent.equals(componentObject.NAME_EVENTUTILITIES)       && hasComponentEVENTUTILITIES &&
                (minimumLevel <= hasLevelEVENTUTILITIES)) ||
			(otherComponent.equals(componentObject.NAME_FOLLOWERS)            && hasComponentFOLLOWERS &&
                (minimumLevel <= hasLevelFOLLOWERS)) ||
			(otherComponent.equals(componentObject.NAME_GEOMETRY2D)           && hasComponentGEOMETRY2D &&
                (minimumLevel <= hasLevelGEOMETRY2D)) ||
			(otherComponent.equals(componentObject.NAME_GEOMETRY3D)           && hasComponentGEOMETRY3D &&
                (minimumLevel <= hasLevelGEOMETRY3D)) ||
			(otherComponent.equals(componentObject.NAME_GEOSPATIAL)           && hasComponentGEOSPATIAL &&
                (minimumLevel <= hasLevelGEOSPATIAL)) ||
			(otherComponent.equals(componentObject.NAME_GROUPING)             && hasComponentGROUPING &&
                (minimumLevel <= hasLevelGROUPING)) ||
			(otherComponent.equals(componentObject.NAME_H_ANIM)               && hasComponentH_ANIM &&
                (minimumLevel <= hasLevelH_ANIM)) ||
			(otherComponent.equals(componentObject.NAME_INTERPOLATION)        && hasComponentINTERPOLATION &&
                (minimumLevel <= hasLevelINTERPOLATION)) ||
			(otherComponent.equals(componentObject.NAME_KEYDEVICESENSOR)      && hasComponentKEYDEVICESENSOR &&
                (minimumLevel <= hasLevelKEYDEVICESENSOR)) ||
			(otherComponent.equals(componentObject.NAME_LAYERING)             && hasComponentLAYERING &&
                (minimumLevel <= hasLevelLAYERING)) ||
			(otherComponent.equals(componentObject.NAME_LAYOUT)               && hasComponentLAYOUT &&
                (minimumLevel <= hasLevelLAYOUT)) ||
			(otherComponent.equals(componentObject.NAME_INTERPOLATION)        && hasComponentINTERPOLATION &&
                (minimumLevel <= hasLevelINTERPOLATION)) ||
			(otherComponent.equals(componentObject.NAME_LIGHTING)             && hasComponentLIGHTING &&
                (minimumLevel <= hasLevelLIGHTING)) ||
			(otherComponent.equals(componentObject.NAME_NAVIGATION)           && hasComponentNAVIGATION &&
                (minimumLevel <= hasLevelNAVIGATION)) ||
			(otherComponent.equals(componentObject.NAME_NETWORKING)           && hasComponentNETWORKING &&
                (minimumLevel <= hasLevelNETWORKING)) ||
			(otherComponent.equals(componentObject.NAME_NURBS)                && hasComponentNURBS &&
                (minimumLevel <= hasLevelNURBS)) ||
			(otherComponent.equals(componentObject.NAME_PARTICLESYSTEMS)      && hasComponentPARTICLESYSTEMS &&
                (minimumLevel <= hasLevelPARTICLESYSTEMS)) ||
			(otherComponent.equals(componentObject.NAME_PICKING)              && hasComponentPICKING &&
                (minimumLevel <= hasLevelPICKING)) ||
			(otherComponent.equals(componentObject.NAME_POINTINGDEVICESENSOR) && hasComponentPOINTINGDEVICESENSOR &&
                (minimumLevel <= hasLevelPOINTINGDEVICESENSOR)) ||
			(otherComponent.equals(componentObject.NAME_RENDERING)            && hasComponentRENDERING &&
                (minimumLevel <= hasLevelRENDERING)) ||
			(otherComponent.equals(componentObject.NAME_RIGIDBODYPHYSICS)     && hasComponentRIGIDBODYPHYSICS &&
                (minimumLevel <= hasLevelRIGIDBODYPHYSICS)) ||
			(otherComponent.equals(componentObject.NAME_SCRIPTING)            && hasComponentSCRIPTING &&
                (minimumLevel <= hasLevelSCRIPTING)) ||
			(otherComponent.equals(componentObject.NAME_SHADERS)              && hasComponentSHADERS &&
                (minimumLevel <= hasLevelSHADERS)) ||
			(otherComponent.equals(componentObject.NAME_SHAPE)                && hasComponentSHAPE &&
                (minimumLevel <= hasLevelSHAPE)) ||
			(otherComponent.equals(componentObject.NAME_SOUND)                && hasComponentSOUND &&
                (minimumLevel <= hasLevelSOUND)) ||
			(otherComponent.equals(componentObject.NAME_TEXT)                 && hasComponentTEXT &&
                (minimumLevel <= hasLevelTEXT)) ||
			(otherComponent.equals(componentObject.NAME_TEXTURING)            && hasComponentTEXTURING &&
                (minimumLevel <= hasLevelTEXTURING)) ||
			(otherComponent.equals(componentObject.NAME_TEXTURING3D)          && hasComponentTEXTURING3D &&
                (minimumLevel <= hasLevelTEXTURING3D)) ||
			(otherComponent.equals(componentObject.NAME_TIME)                 && hasComponentTIME &&
                (minimumLevel <= hasLevelTIME)) ||
			(otherComponent.equals(componentObject.NAME_VOLUMERENDERING)      && hasComponentVOLUMERENDERING &&
                (minimumLevel <= hasLevelVOLUMERENDERING));

        return hasSupport;
    }
}
