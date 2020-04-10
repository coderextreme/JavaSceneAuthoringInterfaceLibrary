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

package org.web3d.x3d.jsail.Text;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Text.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Text.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * FontStyle is an X3DFontStyleNode that defines the size, family, justification, and other styles used by Text nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DFontStyleNode] FontStyle is an X3DFontStyleNode that defines the size, family, justification, and other styles used by Text nodes.
 * <ul>
 *  <li> <i>Hint:</i> full internationalization (i18n) and localization (l10n) features are available for any written language. </li> 
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes. </li> 
 *  <li> <i>Hint:</i> relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 *  <li> <i>Hint:</i>  first add a Text node as a parent node for FontStyle. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#FontStyle" target="blank">X3D Abstract Specification: FontStyle</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#FontStyle" target="_blank">X3D Tooltips: FontStyle</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class FontStyleObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Text.FontStyle
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=family, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=family, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> family = new ArrayList<>(); // MFString

 /* @name=horizontal, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=horizontal, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean horizontal; // SFBool

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=justify, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=justify, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> justify = new ArrayList<>(); // MFString

 /* @name=language, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=language, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String language; // SFString

 /* @name=leftToRight, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=leftToRight, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean leftToRight; // SFBool

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=size, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=size, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float size; // SFFloat

 /* @name=spacing, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=spacing, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float spacing; // SFFloat

 /* @name=style, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=style, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String style; // SFString

 /* @name=topToBottom, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=topToBottom, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean topToBottom; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;SANS&#34;", "&#34;SERIF&#34;", "&#34;TYPEWRITER&#34;".
<br ><br >
	 * fontFamilyValues are allowed enumeration values for FontStyle/ScreenFontStyle node family field. Unbounded, additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> 
	*/
	public static final ArrayList<String> fontFamilyValues = new ArrayList<>(Arrays.<String>asList("\"SANS\"", "\"SERIF\"", "\"TYPEWRITER\""));

	/** MFString field named <i>family</i> with X3DUOM baseType <i>fontFamilyValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"SANS"</i> (Java syntax) or <i>'"SANS"'</i> (XML syntax).
	 * @see #fontFamilyValues */
	public static final String FAMILY_SANS = "SANS";

	/** MFString field named <i>family</i> with X3DUOM baseType <i>fontFamilyValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"SERIF"</i> (Java syntax) or <i>'"SERIF"'</i> (XML syntax).
	 * @see #fontFamilyValues */
	public static final String FAMILY_SERIF = "SERIF";

	/** MFString field named <i>family</i> with X3DUOM baseType <i>fontFamilyValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"TYPEWRITER"</i> (Java syntax) or <i>'"TYPEWRITER"'</i> (XML syntax).
	 * @see #fontFamilyValues */
	public static final String FAMILY_TYPEWRITER = "TYPEWRITER";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;MIDDLE&#34;", "&#34;MIDDLE&#34; &#34;BEGIN&#34;", "&#34;MIDDLE&#34; &#34;END&#34;", "&#34;MIDDLE&#34; &#34;FIRST&#34;", "&#34;MIDDLE&#34; &#34;MIDDLE&#34;", "&#34;BEGIN&#34;", "&#34;BEGIN&#34; &#34;BEGIN&#34;", "&#34;BEGIN&#34; &#34;END&#34;", "&#34;BEGIN&#34; &#34;FIRST&#34;", "&#34;BEGIN&#34; &#34;MIDDLE&#34;", "&#34;END&#34;", "&#34;END&#34; &#34;BEGIN&#34;", "&#34;END&#34; &#34;END&#34;", "&#34;END&#34; &#34;FIRST&#34;", "&#34;END&#34; &#34;MIDDLE&#34;", "&#34;FIRST&#34;", "&#34;FIRST&#34; &#34;BEGIN&#34;", "&#34;FIRST&#34; &#34;END&#34;", "&#34;FIRST&#34; &#34;FIRST&#34;", "&#34;FIRST&#34; &#34;MIDDLE&#34;".
<br ><br >
	 * justifyChoices are strictly allowed enumeration values for FontStyle node justify field. Note that intermediate commas and extraneous whitespace are disallowed by these strictly defined enumeration values.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> 
	*/
	public static final ArrayList<String> justifyChoices = new ArrayList<>(Arrays.<String>asList("\"MIDDLE\"", "\"MIDDLE\" \"BEGIN\"", "\"MIDDLE\" \"END\"", "\"MIDDLE\" \"FIRST\"", "\"MIDDLE\" \"MIDDLE\"", "\"BEGIN\"", "\"BEGIN\" \"BEGIN\"", "\"BEGIN\" \"END\"", "\"BEGIN\" \"FIRST\"", "\"BEGIN\" \"MIDDLE\"", "\"END\"", "\"END\" \"BEGIN\"", "\"END\" \"END\"", "\"END\" \"FIRST\"", "\"END\" \"MIDDLE\"", "\"FIRST\"", "\"FIRST\" \"BEGIN\"", "\"FIRST\" \"END\"", "\"FIRST\" \"FIRST\"", "\"FIRST\" \"MIDDLE\""));

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"MIDDLE"</i> (Java syntax) or <i>'"MIDDLE"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_MIDDLE = "MIDDLE";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"MIDDLE\" \"BEGIN\""</i> (Java syntax) or <i>'"MIDDLE" "BEGIN"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_MIDDLE_BEGIN = "\"MIDDLE\" \"BEGIN\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"MIDDLE\" \"END\""</i> (Java syntax) or <i>'"MIDDLE" "END"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_MIDDLE_END = "\"MIDDLE\" \"END\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"MIDDLE\" \"FIRST\""</i> (Java syntax) or <i>'"MIDDLE" "FIRST"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_MIDDLE_FIRST = "\"MIDDLE\" \"FIRST\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"MIDDLE\" \"MIDDLE\""</i> (Java syntax) or <i>'"MIDDLE" "MIDDLE"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_MIDDLE_MIDDLE = "\"MIDDLE\" \"MIDDLE\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"BEGIN"</i> (Java syntax) or <i>'"BEGIN"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_BEGIN = "BEGIN";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"BEGIN\" \"BEGIN\""</i> (Java syntax) or <i>'"BEGIN" "BEGIN"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_BEGIN_BEGIN = "\"BEGIN\" \"BEGIN\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"BEGIN\" \"END\""</i> (Java syntax) or <i>'"BEGIN" "END"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_BEGIN_END = "\"BEGIN\" \"END\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"BEGIN\" \"FIRST\""</i> (Java syntax) or <i>'"BEGIN" "FIRST"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_BEGIN_FIRST = "\"BEGIN\" \"FIRST\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"BEGIN\" \"MIDDLE\""</i> (Java syntax) or <i>'"BEGIN" "MIDDLE"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_BEGIN_MIDDLE = "\"BEGIN\" \"MIDDLE\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"END"</i> (Java syntax) or <i>'"END"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_END = "END";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"END\" \"BEGIN\""</i> (Java syntax) or <i>'"END" "BEGIN"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_END_BEGIN = "\"END\" \"BEGIN\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"END\" \"END\""</i> (Java syntax) or <i>'"END" "END"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_END_END = "\"END\" \"END\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"END\" \"FIRST\""</i> (Java syntax) or <i>'"END" "FIRST"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_END_FIRST = "\"END\" \"FIRST\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"END\" \"MIDDLE\""</i> (Java syntax) or <i>'"END" "MIDDLE"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_END_MIDDLE = "\"END\" \"MIDDLE\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"FIRST"</i> (Java syntax) or <i>'"FIRST"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_FIRST = "FIRST";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FIRST\" \"BEGIN\""</i> (Java syntax) or <i>'"FIRST" "BEGIN"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_FIRST_BEGIN = "\"FIRST\" \"BEGIN\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FIRST\" \"END\""</i> (Java syntax) or <i>'"FIRST" "END"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_FIRST_END = "\"FIRST\" \"END\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FIRST\" \"FIRST\""</i> (Java syntax) or <i>'"FIRST" "FIRST"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_FIRST_FIRST = "\"FIRST\" \"FIRST\"";

	/** MFString field named <i>justify</i> with X3DUOM baseType <i>justifyChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FIRST\" \"MIDDLE\""</i> (Java syntax) or <i>'"FIRST" "MIDDLE"'</i> (XML syntax).
	 * @see #justifyChoices */
	public static final String JUSTIFY_FIRST_MIDDLE = "\"FIRST\" \"MIDDLE\"";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "PLAIN", "BOLD", "ITALIC", "BOLDITALIC".
<br ><br >
	 * fontStyleChoices are strictly allowed enumeration values for FontStyle/ScreenFontStyle node style field.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> 
	*/
	public static final ArrayList<String> fontStyleChoices = new ArrayList<>(Arrays.<String>asList("PLAIN", "BOLD", "ITALIC", "BOLDITALIC"));

	/** SFString field named <i>style</i> with X3DUOM baseType <i>fontStyleChoices</i> can equal this value <i>"PLAIN"</i> (Java syntax) or <i>PLAIN</i> (XML syntax).
	 * @see #fontStyleChoices */
	public static final String STYLE_PLAIN = "PLAIN";

	/** SFString field named <i>style</i> with X3DUOM baseType <i>fontStyleChoices</i> can equal this value <i>"BOLD"</i> (Java syntax) or <i>BOLD</i> (XML syntax).
	 * @see #fontStyleChoices */
	public static final String STYLE_BOLD = "BOLD";

	/** SFString field named <i>style</i> with X3DUOM baseType <i>fontStyleChoices</i> can equal this value <i>"ITALIC"</i> (Java syntax) or <i>ITALIC</i> (XML syntax).
	 * @see #fontStyleChoices */
	public static final String STYLE_ITALIC = "ITALIC";

	/** SFString field named <i>style</i> with X3DUOM baseType <i>fontStyleChoices</i> can equal this value <i>"BOLDITALIC"</i> (Java syntax) or <i>BOLDITALIC</i> (XML syntax).
	 * @see #fontStyleChoices */
	public static final String STYLE_BOLDITALIC = "BOLDITALIC";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>FontStyle</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "FontStyle";

	/** Provides name of this element: <i>FontStyle</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>FontStyle</i> element: <i>Text</i> */
	public static final String COMPONENT = "Text";

	/** Defines X3D component for the <i>FontStyle</i> element: <i>Text</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Text</i> component level for this element: <i>1</i> */
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

	/** MFString field named <i>family</i> has default quoted value <i>new String[] {"SERIF"}</i> (Java syntax) or quoted value <i>"SERIF"</i> (XML syntax). */
	public static final ArrayList<String> FAMILY_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("SERIF"));

	/** SFBool field named <i>horizontal</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean HORIZONTAL_DEFAULT_VALUE = true;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** MFString field named <i>justify</i> has default quoted value <i>new String[] {"BEGIN"}</i> (Java syntax) or quoted value <i>"BEGIN"</i> (XML syntax). */
	public static final ArrayList<String> JUSTIFY_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("BEGIN"));

	/** SFString field named <i>language</i> has default value equal to an empty string. */
	public static final String LANGUAGE_DEFAULT_VALUE = "";

	/** SFBool field named <i>leftToRight</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean LEFTTORIGHT_DEFAULT_VALUE = true;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFFloat field named <i>size</i> has default value <i>1.0f</i> (Java syntax) or <i>1.0</i> (XML syntax). */
	public static final float SIZE_DEFAULT_VALUE = 1.0f;

	/** SFFloat field named <i>spacing</i> has default value <i>1.0f</i> (Java syntax) or <i>1.0</i> (XML syntax). */
	public static final float SPACING_DEFAULT_VALUE = 1.0f;

	/** SFString field named <i>style</i> has default value <i>"PLAIN"</i> (Java syntax) or <i>PLAIN</i> (XML syntax). */
	public static final String STYLE_DEFAULT_VALUE = "PLAIN";

	/** SFBool field named <i>topToBottom</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean TOPTOBOTTOM_DEFAULT_VALUE = true;

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D node
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
			case "family":
				result = "MFString";
				break;
			case "horizontal":
				result = "SFBool";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "justify":
				result = "MFString";
				break;
			case "language":
				result = "SFString";
				break;
			case "leftToRight":
				result = "SFBool";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "size":
				result = "SFFloat";
				break;
			case "spacing":
				result = "SFFloat";
				break;
			case "style":
				result = "SFString";
				break;
			case "topToBottom":
				result = "SFBool";
				break;
			case "DEF":
				result = "SFString";
				break;
			case "USE":
				result = "SFString";
				break;
			case "class":
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
	 * @param fieldName name of field in this X3D node
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
			case "family":
				result = "initializeOnly";
				break;
			case "horizontal":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "justify":
				result = "initializeOnly";
				break;
			case "language":
				result = "initializeOnly";
				break;
			case "leftToRight":
				result = "initializeOnly";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "size":
				result = "initializeOnly";
				break;
			case "spacing":
				result = "initializeOnly";
				break;
			case "style":
				result = "initializeOnly";
				break;
			case "topToBottom":
				result = "initializeOnly";
				break;
			case "DEF":
				result = "inputOutput";
				break;
			case "USE":
				result = "inputOutput";
				break;
			case "class":
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

	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 * @see <a href="https://www.web3d.org/specifications/X3DUOM.html">X3D Unified Object Model (X3DUOM)</a>
	 */
	public static final String containerField_DEFAULT_VALUE = "fontStyle"; // type xs:NMTOKEN
	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 * @see <a href="https://www.web3d.org/specifications/X3DUOM.html">X3D Unified Object Model (X3DUOM)</a>
     * @return default containerField value            
	 */
    @Override
    public final String getContainerFieldDefault()
    {
        return containerField_DEFAULT_VALUE;
    }

	// String constants for field names usable in ROUTE statements

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** Constructor for FontStyleObject to initialize member variables with default values. */
	public FontStyleObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

        setContainerFieldOverride(""); // ensuring default value used
		containerField_ALTERNATE_VALUES = new String[] { "fontStyle" }; // type xs:NMTOKEN

		family = new ArrayList<>(FAMILY_DEFAULT_VALUE);
		horizontal = HORIZONTAL_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		justify = new ArrayList<>(JUSTIFY_DEFAULT_VALUE);
		language = LANGUAGE_DEFAULT_VALUE;
		leftToRight = LEFTTORIGHT_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		size = SIZE_DEFAULT_VALUE;
		spacing = SPACING_DEFAULT_VALUE;
		style = STYLE_DEFAULT_VALUE;
		topToBottom = TOPTOBOTTOM_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String enumeration results (baseType fontFamilyValues) ['"SANS"' | '"SERIF"' | '"TYPEWRITER"' | '"etc."'] from initializeOnly MFString field named <i>family</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Array of quoted font family names in preference order, browsers use the first supported family.
 * <ul>
 *  <li> <i>Hint:</i> example family array might be "Times" "SERIF" </li> 
 *  <li> <i>Warning:</i> font family support often varies. </li> 
 *  <li> <i>Hint:</i> values with guaranteed support include "SERIF" "SANS" "TYPEWRITER". </li> 
 *  <li> <i>Hint:</i> SERIF and SANS are variable-width fonts (for example, Times Roman and Arial). </li> 
 *  <li> <i>Hint:</i> TYPEWRITER is a fixed-width font (for example, Courier). </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i> see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #FAMILY_SANS SANS}, {@link #FAMILY_SERIF SERIF}, {@link #FAMILY_TYPEWRITER TYPEWRITER}.
	 * @return value of family field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getFamily()
	{
		final String[] valuesArray = new String[family.size()];
		int i = 0;
		for (String arrayElement : family) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString family field, similar to {@link #getFamily()}.
	 * @return value of family field
	 */
	public ArrayList<String> getFamilyList()
	{
		return family;
	}
	/**
	 * Utility method to get String value of MFString family field, similar to {@link #getFamily()}.
	 * @return value of family field
	 */
	public String getFamilyString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : family) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""SANS"" | ""SERIF"" | ""TYPEWRITER"") to initializeOnly MFString field named <i>family</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #FAMILY_SANS SANS}, {@link #FAMILY_SERIF SERIF}, {@link #FAMILY_TYPEWRITER TYPEWRITER}).
	 * <br><br>
	 * <i>Tooltip:</i> Array of quoted font family names in preference order, browsers use the first supported family.
 * <ul>
 *  <li> <i>Hint:</i> example family array might be "Times" "SERIF" </li> 
 *  <li> <i>Warning:</i> font family support often varies. </li> 
 *  <li> <i>Hint:</i> values with guaranteed support include "SERIF" "SANS" "TYPEWRITER". </li> 
 *  <li> <i>Hint:</i> SERIF and SANS are variable-width fonts (for example, Times Roman and Arial). </li> 
 *  <li> <i>Hint:</i> TYPEWRITER is a fixed-width font (for example, Courier). </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i> see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the family field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setFamily(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearFamily(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(FAMILY_SANS) ||
			newValue[i].equals(FAMILY_SERIF) ||
			newValue[i].equals(FAMILY_TYPEWRITER)))
		{
			String warningMessage = "Warning: FontStyle family newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the optional string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);
			// TODO figure out problem when checking ArrayList for single value
				if (newValue.equals("SANSERIF"))
				warningMessage += " FontStyle family value \"SANSERIF\" needs correction as \"SANS\" instead.";
		}
        }
		if (newValue == null)		{
			clearFamily(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearFamily(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			family.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString family field, similar to {@link #setFamily(String[])}.
	 * @param newValue is new value for the family field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setFamily(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearFamily(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setFamily(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString family field, similar to {@link #setFamily(String[])}.
	 * @param newValue is new value for the family field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setFamily(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearFamily(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearFamily(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(FAMILY_SANS) ||
			newValue.equals(FAMILY_SERIF) ||
			newValue.equals(FAMILY_TYPEWRITER)))
		{
			String warningMessage = "Warning: FontStyle family newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
			// TODO figure out problem when checking ArrayList for single value
				if (newValue.equals("SANSERIF"))
				warningMessage += " FontStyle family value \"SANSERIF\" needs correction as \"SANS\" instead.";
		}
		setFamily(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString family field, similar to {@link #setFamily(String[])}.
	 * @param newValue is new value for the family field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setFamily(String newValue)
	{
		if (newValue == null)		{
			clearFamily(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearFamily(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(FAMILY_SANS) ||
			newValue.equals(FAMILY_SERIF) ||
			newValue.equals(FAMILY_TYPEWRITER)))
		{
			String warningMessage = "Warning: FontStyle family newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
			// TODO figure out problem when checking ArrayList for single value
				if (newValue.equals("SANSERIF"))
				warningMessage += " FontStyle family value \"SANSERIF\" needs correction as \"SANS\" instead.";
		}
		setFamily(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString family field, similar to {@link #setFamily(String[])}.
	 * @param newValue is new value for the family field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setFamily(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearFamily(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearFamily(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(FAMILY_SANS) ||
			newValue.equals(FAMILY_SERIF) ||
			newValue.equals(FAMILY_TYPEWRITER)))
		{
			String warningMessage = "Warning: FontStyle family newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
			// TODO figure out problem when checking ArrayList for single value
				if (newValue.equals("SANSERIF"))
				warningMessage += " FontStyle family value \"SANSERIF\" needs correction as \"SANS\" instead.";
		}
        if (newValue.isEmpty())
            clearFamily(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setFamily(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of family field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public FontStyleObject clearFamily()
	{
		family.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString family field.
	 * @param newValue is new value to add to the family field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject addFamily(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !family.contains(newValue))
            family.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString family field.
	 * @param newValue is new value to add to the family field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject addFamily(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !family.contains(newValue.getValue()))
            family.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>horizontal</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is horizontal (true) or vertical (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of horizontal field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getHorizontal()
	{
		return horizontal;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>horizontal</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is horizontal (true) or vertical (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the horizontal field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setHorizontal(boolean newValue)
	{
		// set-newValue-validity-checks #0
		horizontal = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool horizontal field, similar to {@link #setHorizontal(boolean)}.
	 * @param newValue is new value for the horizontal field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setHorizontal(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setHorizontal(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setIS(ISObject newValue)
	{
		// set-newValue-validity-checks #0
		IS = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) IS).setParentObject(this); // parentTest15
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of IS field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public FontStyleObject clearIS()
	{
		((X3DConcreteElement) IS).clearParentObject(); // remove references to facilitate Java memory management
		IS = null; // reset SFNode field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>IS</i>.
	 * @return whether a concrete statement or CommentsBlock is available.
	 * @see #getIS()
	 */
	public boolean hasIS()
	{
		return (IS != null);
	}
	/**
	 * Provide array of String enumeration results (baseType justifyChoices) ['"MIDDLE"' | '"MIDDLE" "BEGIN"' | '"MIDDLE" "END"' | '"MIDDLE" "FIRST"' | '"MIDDLE" "MIDDLE"' | '"BEGIN"' | '"BEGIN" "BEGIN"' | '"BEGIN" "END"' | '"BEGIN" "FIRST"' | '"BEGIN" "MIDDLE"' | '"END"' | '"END" "BEGIN"' | '"END" "END"' | '"END" "FIRST"' | '"END" "MIDDLE"' | '"FIRST"' | '"FIRST" "BEGIN"' | '"FIRST" "END"' | '"FIRST" "FIRST"' | '"FIRST" "MIDDLE"'] from initializeOnly MFString field named <i>justify</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The justify field determines alignment of the above text layout relative to the origin of the object coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> preferred value is usually justify=' "MIDDLE" "MIDDLE" ' for centered justification horizontally and vertically. </li> 
 *  <li> <i>Warning:</i> exactly two string values are provided for major and minor axis alignment. </li> 
 *  <li> <i>Warning:</i> do not use illegal values such as LEFT RIGHT TOP BOTTOM or CENTER. </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #JUSTIFY_MIDDLE MIDDLE}, {@link #JUSTIFY_MIDDLE_BEGIN MIDDLE_BEGIN}, {@link #JUSTIFY_MIDDLE_END MIDDLE_END}, {@link #JUSTIFY_MIDDLE_FIRST MIDDLE_FIRST}, {@link #JUSTIFY_MIDDLE_MIDDLE MIDDLE_MIDDLE}, {@link #JUSTIFY_BEGIN BEGIN}, {@link #JUSTIFY_BEGIN_BEGIN BEGIN_BEGIN}, {@link #JUSTIFY_BEGIN_END BEGIN_END}, {@link #JUSTIFY_BEGIN_FIRST BEGIN_FIRST}, {@link #JUSTIFY_BEGIN_MIDDLE BEGIN_MIDDLE}, {@link #JUSTIFY_END END}, {@link #JUSTIFY_END_BEGIN END_BEGIN}, {@link #JUSTIFY_END_END END_END}, {@link #JUSTIFY_END_FIRST END_FIRST}, {@link #JUSTIFY_END_MIDDLE END_MIDDLE}, {@link #JUSTIFY_FIRST FIRST}, {@link #JUSTIFY_FIRST_BEGIN FIRST_BEGIN}, {@link #JUSTIFY_FIRST_END FIRST_END}, {@link #JUSTIFY_FIRST_FIRST FIRST_FIRST}, {@link #JUSTIFY_FIRST_MIDDLE FIRST_MIDDLE}.
	 * @return value of justify field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getJustify()
	{
		final String[] valuesArray = new String[justify.size()];
		int i = 0;
		for (String arrayElement : justify) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString justify field, similar to {@link #getJustify()}.
	 * @return value of justify field
	 */
	public ArrayList<String> getJustifyList()
	{
		return justify;
	}
	/**
	 * Utility method to get String value of MFString justify field, similar to {@link #getJustify()}.
	 * @return value of justify field
	 */
	public String getJustifyString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : justify) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""MIDDLE"" | ""MIDDLE" "BEGIN"" | ""MIDDLE" "END"" | ""MIDDLE" "FIRST"" | ""MIDDLE" "MIDDLE"" | ""BEGIN"" | ""BEGIN" "BEGIN"" | ""BEGIN" "END"" | ""BEGIN" "FIRST"" | ""BEGIN" "MIDDLE"" | ""END"" | ""END" "BEGIN"" | ""END" "END"" | ""END" "FIRST"" | ""END" "MIDDLE"" | ""FIRST"" | ""FIRST" "BEGIN"" | ""FIRST" "END"" | ""FIRST" "FIRST"" | ""FIRST" "MIDDLE"") to initializeOnly MFString field named <i>justify</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #JUSTIFY_MIDDLE MIDDLE}, {@link #JUSTIFY_MIDDLE_BEGIN MIDDLE_BEGIN}, {@link #JUSTIFY_MIDDLE_END MIDDLE_END}, {@link #JUSTIFY_MIDDLE_FIRST MIDDLE_FIRST}, {@link #JUSTIFY_MIDDLE_MIDDLE MIDDLE_MIDDLE}, {@link #JUSTIFY_BEGIN BEGIN}, {@link #JUSTIFY_BEGIN_BEGIN BEGIN_BEGIN}, {@link #JUSTIFY_BEGIN_END BEGIN_END}, {@link #JUSTIFY_BEGIN_FIRST BEGIN_FIRST}, {@link #JUSTIFY_BEGIN_MIDDLE BEGIN_MIDDLE}, {@link #JUSTIFY_END END}, {@link #JUSTIFY_END_BEGIN END_BEGIN}, {@link #JUSTIFY_END_END END_END}, {@link #JUSTIFY_END_FIRST END_FIRST}, {@link #JUSTIFY_END_MIDDLE END_MIDDLE}, {@link #JUSTIFY_FIRST FIRST}, {@link #JUSTIFY_FIRST_BEGIN FIRST_BEGIN}, {@link #JUSTIFY_FIRST_END FIRST_END}, {@link #JUSTIFY_FIRST_FIRST FIRST_FIRST}, {@link #JUSTIFY_FIRST_MIDDLE FIRST_MIDDLE}).
	 * <br><br>
	 * <i>Tooltip:</i> The justify field determines alignment of the above text layout relative to the origin of the object coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> preferred value is usually justify=' "MIDDLE" "MIDDLE" ' for centered justification horizontally and vertically. </li> 
 *  <li> <i>Warning:</i> exactly two string values are provided for major and minor axis alignment. </li> 
 *  <li> <i>Warning:</i> do not use illegal values such as LEFT RIGHT TOP BOTTOM or CENTER. </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the justify field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setJustify(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearJustify(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(JUSTIFY_MIDDLE) ||
			newValue[i].equals(JUSTIFY_MIDDLE_BEGIN) ||
			newValue[i].equals(JUSTIFY_MIDDLE_END) ||
			newValue[i].equals(JUSTIFY_MIDDLE_FIRST) ||
			newValue[i].equals(JUSTIFY_MIDDLE_MIDDLE) ||
			newValue[i].equals(JUSTIFY_BEGIN) ||
			newValue[i].equals(JUSTIFY_BEGIN_BEGIN) ||
			newValue[i].equals(JUSTIFY_BEGIN_END) ||
			newValue[i].equals(JUSTIFY_BEGIN_FIRST) ||
			newValue[i].equals(JUSTIFY_BEGIN_MIDDLE) ||
			newValue[i].equals(JUSTIFY_END) ||
			newValue[i].equals(JUSTIFY_END_BEGIN) ||
			newValue[i].equals(JUSTIFY_END_END) ||
			newValue[i].equals(JUSTIFY_END_FIRST) ||
			newValue[i].equals(JUSTIFY_END_MIDDLE) ||
			newValue[i].equals(JUSTIFY_FIRST) ||
			newValue[i].equals(JUSTIFY_FIRST_BEGIN) ||
			newValue[i].equals(JUSTIFY_FIRST_END) ||
			newValue[i].equals(JUSTIFY_FIRST_FIRST) ||
			newValue[i].equals(JUSTIFY_FIRST_MIDDLE)))
		{
			String warningMessage = "Warning: FontStyle justify newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);

            if (!(newValue.length == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        }
		if (newValue == null)		{
			clearJustify(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearJustify(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			justify.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString justify field, similar to {@link #setJustify(String[])}.
	 * @param newValue is new value for the justify field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setJustify(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearJustify(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setJustify(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString justify field, similar to {@link #setJustify(String[])}.
	 * @param newValue is new value for the justify field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setJustify(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearJustify(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearJustify(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(JUSTIFY_MIDDLE) ||
			newValue.equals(JUSTIFY_MIDDLE_BEGIN) ||
			newValue.equals(JUSTIFY_MIDDLE_END) ||
			newValue.equals(JUSTIFY_MIDDLE_FIRST) ||
			newValue.equals(JUSTIFY_MIDDLE_MIDDLE) ||
			newValue.equals(JUSTIFY_BEGIN) ||
			newValue.equals(JUSTIFY_BEGIN_BEGIN) ||
			newValue.equals(JUSTIFY_BEGIN_END) ||
			newValue.equals(JUSTIFY_BEGIN_FIRST) ||
			newValue.equals(JUSTIFY_BEGIN_MIDDLE) ||
			newValue.equals(JUSTIFY_END) ||
			newValue.equals(JUSTIFY_END_BEGIN) ||
			newValue.equals(JUSTIFY_END_END) ||
			newValue.equals(JUSTIFY_END_FIRST) ||
			newValue.equals(JUSTIFY_END_MIDDLE) ||
			newValue.equals(JUSTIFY_FIRST) ||
			newValue.equals(JUSTIFY_FIRST_BEGIN) ||
			newValue.equals(JUSTIFY_FIRST_END) ||
			newValue.equals(JUSTIFY_FIRST_FIRST) ||
			newValue.equals(JUSTIFY_FIRST_MIDDLE)))
		{
			String warningMessage = "Warning: FontStyle justify newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.getValue().isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setJustify(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString justify field, similar to {@link #setJustify(String[])}.
	 * @param newValue is new value for the justify field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setJustify(String newValue)
	{
		if (newValue == null)		{
			clearJustify(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearJustify(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(JUSTIFY_MIDDLE) ||
			newValue.equals(JUSTIFY_MIDDLE_BEGIN) ||
			newValue.equals(JUSTIFY_MIDDLE_END) ||
			newValue.equals(JUSTIFY_MIDDLE_FIRST) ||
			newValue.equals(JUSTIFY_MIDDLE_MIDDLE) ||
			newValue.equals(JUSTIFY_BEGIN) ||
			newValue.equals(JUSTIFY_BEGIN_BEGIN) ||
			newValue.equals(JUSTIFY_BEGIN_END) ||
			newValue.equals(JUSTIFY_BEGIN_FIRST) ||
			newValue.equals(JUSTIFY_BEGIN_MIDDLE) ||
			newValue.equals(JUSTIFY_END) ||
			newValue.equals(JUSTIFY_END_BEGIN) ||
			newValue.equals(JUSTIFY_END_END) ||
			newValue.equals(JUSTIFY_END_FIRST) ||
			newValue.equals(JUSTIFY_END_MIDDLE) ||
			newValue.equals(JUSTIFY_FIRST) ||
			newValue.equals(JUSTIFY_FIRST_BEGIN) ||
			newValue.equals(JUSTIFY_FIRST_END) ||
			newValue.equals(JUSTIFY_FIRST_FIRST) ||
			newValue.equals(JUSTIFY_FIRST_MIDDLE)))
		{
			String warningMessage = "Warning: FontStyle justify newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setJustify(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString justify field, similar to {@link #setJustify(String[])}.
	 * @param newValue is new value for the justify field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setJustify(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearJustify(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearJustify(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(JUSTIFY_MIDDLE) ||
			newValue.equals(JUSTIFY_MIDDLE_BEGIN) ||
			newValue.equals(JUSTIFY_MIDDLE_END) ||
			newValue.equals(JUSTIFY_MIDDLE_FIRST) ||
			newValue.equals(JUSTIFY_MIDDLE_MIDDLE) ||
			newValue.equals(JUSTIFY_BEGIN) ||
			newValue.equals(JUSTIFY_BEGIN_BEGIN) ||
			newValue.equals(JUSTIFY_BEGIN_END) ||
			newValue.equals(JUSTIFY_BEGIN_FIRST) ||
			newValue.equals(JUSTIFY_BEGIN_MIDDLE) ||
			newValue.equals(JUSTIFY_END) ||
			newValue.equals(JUSTIFY_END_BEGIN) ||
			newValue.equals(JUSTIFY_END_END) ||
			newValue.equals(JUSTIFY_END_FIRST) ||
			newValue.equals(JUSTIFY_END_MIDDLE) ||
			newValue.equals(JUSTIFY_FIRST) ||
			newValue.equals(JUSTIFY_FIRST_BEGIN) ||
			newValue.equals(JUSTIFY_FIRST_END) ||
			newValue.equals(JUSTIFY_FIRST_FIRST) ||
			newValue.equals(JUSTIFY_FIRST_MIDDLE)))
		{
			String warningMessage = "Warning: FontStyle justify newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!(newValue.size() == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        if (newValue.isEmpty())
            clearJustify(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setJustify(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of justify field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public FontStyleObject clearJustify()
	{
		justify.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString justify field.
	 * @param newValue is new value to add to the justify field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject addJustify(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !justify.contains(newValue))
            justify.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString justify field.
	 * @param newValue is new value to add to the justify field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject addJustify(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !justify.contains(newValue.getValue()))
            justify.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide String value from initializeOnly SFString field named <i>language</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Language codes consist of a primary code and a (possibly empty) series of subcodes. [ language-code = primary-code ( "-" subcode )* ] Two-letter primary codes are reserved for language abbreviations. Two-letter primary codes include en (English), fr (French), de (German), it (Italian), nl (Dutch), el (Greek), es (Spanish), pt (Portuguese), ar (Arabic), he (Hebrew), ru (Russian), zh (Chinese), ja (Japanese), hi (Hindi), ur (Urdu), and sa (Sanskrit). Any two-letter subcode is understood to be a country code.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> see ISO639.2 Codes for the Representation of Names of Languages <a href="http://www.loc.gov/standards/iso639-2/php/code_list.php" target="_blank">http://www.loc.gov/standards/iso639-2/php/code_list.php</a> </li> 
 *  <li> <i>Hint:</i> see RFC3066 Tags for the Identification of Languages <a href="http://tools.ietf.org/html/rfc3066" target="_blank">http://tools.ietf.org/html/rfc3066</a> </li> 
 *  <li> <i>Hint:</i> see ISO3166 or <a href="http://xml.coverpages.org/languageIdentifiers.html" target="_blank">http://xml.coverpages.org/languageIdentifiers.html</a> </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of language field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String getLanguage()
	{
		return language;
	}

	/**
	 * Accessor method to assign String value to initializeOnly SFString field named <i>language</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Language codes consist of a primary code and a (possibly empty) series of subcodes. [ language-code = primary-code ( "-" subcode )* ] Two-letter primary codes are reserved for language abbreviations. Two-letter primary codes include en (English), fr (French), de (German), it (Italian), nl (Dutch), el (Greek), es (Spanish), pt (Portuguese), ar (Arabic), he (Hebrew), ru (Russian), zh (Chinese), ja (Japanese), hi (Hindi), ur (Urdu), and sa (Sanskrit). Any two-letter subcode is understood to be a country code.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> see ISO639.2 Codes for the Representation of Names of Languages <a href="http://www.loc.gov/standards/iso639-2/php/code_list.php" target="_blank">http://www.loc.gov/standards/iso639-2/php/code_list.php</a> </li> 
 *  <li> <i>Hint:</i> see RFC3066 Tags for the Identification of Languages <a href="http://tools.ietf.org/html/rfc3066" target="_blank">http://tools.ietf.org/html/rfc3066</a> </li> 
 *  <li> <i>Hint:</i> see ISO3166 or <a href="http://xml.coverpages.org/languageIdentifiers.html" target="_blank">http://xml.coverpages.org/languageIdentifiers.html</a> </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the language field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setLanguage(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		language = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString language field, similar to {@link #setLanguage(String)}.
	 * @param newValue is new value for the language field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setLanguage(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLanguage(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>leftToRight</i>.
	 * @return value of leftToRight field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getLeftToRight()
	{
		return leftToRight;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>leftToRight</i>.
	 * @param newValue is new value for the leftToRight field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setLeftToRight(boolean newValue)
	{
		// set-newValue-validity-checks #0
		leftToRight = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool leftToRight field, similar to {@link #setLeftToRight(boolean)}.
	 * @param newValue is new value for the leftToRight field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setLeftToRight(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLeftToRight(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see #getMetadataProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata()
	{
		return metadata;
	}

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setMetadata(X3DMetadataObject newValue)
	{
		// set-newValue-validity-checks #0
		metadata = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadata).setParentObject(this); // parentTest15
		}
		if (metadataProtoInstance != null)
		{
			metadataProtoInstance.setParentObject(null); // housekeeping, clear prior object
			metadataProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of metadata field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public FontStyleObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setMetadata(ProtoInstanceObject newValue)
	{
		if (metadataProtoInstance != null)
		{
			((X3DConcreteElement) metadataProtoInstance).setParentObject(null); // parentTest15.5
	    }
		metadataProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadataProtoInstance).setParentObject(this); // parentTest15.6
            metadataProtoInstance.setContainerField("metadata");
	    }
		if (metadata != null)
		{
			((X3DConcreteElement) metadata).setParentObject(null); // housekeeping, clear prior object
			metadata = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getMetadataProtoInstance()
		{
			return metadataProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>metadata</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getMetadata()
	 * @see #getMetadataProtoInstance()
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 */
	public boolean hasMetadata()
	{
		return (metadata != null) || (metadataProtoInstance != null);
	}
	/**
	 * Provide float value within allowed range of (0,infinity) from initializeOnly SFFloat field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (0,+infinity) Nominal height (in local coordinate system) of text glyphs Also sets default spacing between adjacent lines of text.  * <br>

	 * @return value of size field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public float getSize()
	{
		return size;
	}

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (0,+infinity) Nominal height (in local coordinate system) of text glyphs Also sets default spacing between adjacent lines of text.  * <br>

	 * @param newValue is new value for the size field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setSize(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue <= 0f) {
                throw new org.web3d.x3d.sai.InvalidFieldValueException("FontStyle size newValue=" + newValue + " has component value less than (or equal to) restriction minExclusive=0");
        }
		size = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat size field, similar to {@link #setSize(float)}.
	 * @param newValue is new value for the size field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setSize(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSize(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setSize(float)}.
	 * @param newValue is new value for field
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setSize(double newValue)
	{
		return setSize((float) newValue);
	}
	/**
	 * Provide float value within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>spacing</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Adjustment factor for line spacing between adjacent lines of text.  * <br>

	 * @return value of spacing field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public float getSpacing()
	{
		return spacing;
	}

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>spacing</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Adjustment factor for line spacing between adjacent lines of text.  * <br>

	 * @param newValue is new value for the spacing field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setSpacing(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("FontStyle spacing newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		spacing = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat spacing field, similar to {@link #setSpacing(float)}.
	 * @param newValue is new value for the spacing field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setSpacing(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSpacing(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setSpacing(float)}.
	 * @param newValue is new value for field
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setSpacing(double newValue)
	{
		return setSpacing((float) newValue);
	}
	/**
	 * Provide String enumeration value (baseType fontStyleChoices) ["PLAIN" | "BOLD" | "ITALIC" | "BOLDITALIC"] from initializeOnly SFString field named <i>style</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Pick one of four values for text style.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #STYLE_PLAIN PLAIN}, {@link #STYLE_BOLD BOLD}, {@link #STYLE_ITALIC ITALIC}, {@link #STYLE_BOLDITALIC BOLDITALIC}.
	 * @return value of style field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String getStyle()
	{
		return style;
	}

	/**
	 * Accessor method to assign String enumeration value ("PLAIN" | "BOLD" | "ITALIC" | "BOLDITALIC") to initializeOnly SFString field named <i>style</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #STYLE_PLAIN PLAIN}, {@link #STYLE_BOLD BOLD}, {@link #STYLE_ITALIC ITALIC}, {@link #STYLE_BOLDITALIC BOLDITALIC}).
	 * <br><br>
	 * <i>Tooltip:</i> Pick one of four values for text style.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the style field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setStyle(String newValue)
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
			newValue.equals(STYLE_PLAIN) ||
			newValue.equals(STYLE_BOLD) ||
			newValue.equals(STYLE_ITALIC) ||
			newValue.equals(STYLE_BOLDITALIC)))
		{
			String warningMessage = "Warning: FontStyle style newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		style = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString style field, similar to {@link #setStyle(String)}.
	 * @param newValue is new value for the style field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setStyle(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setStyle(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>topToBottom</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is top-to-bottom (true) or bottom-to-top (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of topToBottom field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getTopToBottom()
	{
		return topToBottom;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>topToBottom</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is top-to-bottom (true) or bottom-to-top (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the topToBottom field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public FontStyleObject setTopToBottom(boolean newValue)
	{
		// set-newValue-validity-checks #0
		topToBottom = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool topToBottom field, similar to {@link #setTopToBottom(boolean)}.
	 * @param newValue is new value for the topToBottom field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setTopToBottom(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTopToBottom(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes.
 * <ul>
 *  <li> <i>Hint:</i> descriptive DEF names improve clarity and help document a model. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of DEF field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String getDEF()
	{
		// override abstract method in X3DConcreteNode
		return super.getDEF();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes.
 * <ul>
 *  <li> <i>Hint:</i> descriptive DEF names improve clarity and help document a model. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>
	 *  Note that setting the DEF value clears the USE value.
	 * @param newValue is new value for the DEF field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final FontStyleObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to FontStyle DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("FontStyle DEF newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteUSE(""); // ensure that no previous USE value remains
		setConcreteDEF(newValue); // private superclass methods
		return this;
	}

	/**
	 * Assign typed object value to SFString DEF field, similar to {@link #setDEF(String)}.
	 * @param newValue is new value for the DEF field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setDEF(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDEF(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value).
 * <ul>
 *  <li> <i>Hint:</i> USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. </li> 
 *  <li> <i>Warning:</i> do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. </li> 
 *  <li> <i>Warning:</i>  each USE value must match a corresponding DEF value that is defined earlier in the scene. </li> 
 * </ul>
	 * @return value of USE field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String getUSE()
	{
		// override abstract method in X3DConcreteNode
		return super.getUSE();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value).
 * <ul>
 *  <li> <i>Hint:</i> USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. </li> 
 *  <li> <i>Warning:</i> do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. </li> 
 *  <li> <i>Warning:</i>  each USE value must match a corresponding DEF value that is defined earlier in the scene. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> each <code>USE</code> node is still an independent object, with the <code>USE</code> value matching the <code>DEF</code> value in the preceding object. 
	 * <br><br>
	 * <i>Warning:</i> invoking the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.<br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param newValue is new value for the USE field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final FontStyleObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to FontStyle USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("FontStyle USE newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteDEF(""); // ensure that no previous DEF value remains
		setConcreteUSE(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString USE field, similar to {@link #setUSE(String)}.
	 * @param newValue is new value for the USE field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setUSE(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUSE(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets.
 * <ul>
 *  <li> <i>Warning:</i> currently the class attribute is only supported in XML encoding of X3D scenes. </li> 
 *  <li> <i>Hint:</i>  W3C Cascading Style Sheets <a href="https://www.w3.org/Style/CSS" target="_blank">https://www.w3.org/Style/CSS</a> </li> 
 * </ul>
	 * @return value of class field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	@Override
	public String getCssClass()
	{
		// override abstract method in X3DConcreteNode
		return super.getCssClass();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets.
 * <ul>
 *  <li> <i>Warning:</i> currently the class attribute is only supported in XML encoding of X3D scenes. </li> 
 *  <li> <i>Hint:</i>  W3C Cascading Style Sheets <a href="https://www.w3.org/Style/CSS" target="_blank">https://www.w3.org/Style/CSS</a> </li> 
 * </ul>
	 * @param newValue is new value for the class field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final FontStyleObject setCssClass(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		setConcreteCssClass(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString cssClass field, similar to {@link #setCssClass(String)}.
	 * @param newValue is new value for the class field.
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public FontStyleObject setUSE(FontStyleObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on FontStyleObject" +
				" that has no DEF name defined, thus a copy cannot be referenced as a USE node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		setUSE(DEFnode.getDEF());
		return this;
	}
	/**
	 * Utility constructor that assigns DEF label after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 */
	public FontStyleObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public FontStyleObject addComments (String newComment)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(\"" + newComment + "\")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public FontStyleObject addComments (String[] newComments)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(" + Arrays.toString(newComments) + ")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link FontStyleObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public FontStyleObject addComments (CommentsBlock newCommentsBlock)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(CommentsBlock) " +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<FontStyle"); // start opening tag
		if (hasAttributes)
		{
			if (!getDEF().equals(DEF_DEFAULT_VALUE) && !isUSE())
			{
				stringX3D.append(" DEF='").append(SFStringObject.toString(getDEF())).append("'");
			}
			
			if (!getUSE().equals(USE_DEFAULT_VALUE))
			{
				stringX3D.append(" USE='").append(SFStringObject.toString(getUSE())).append("'");
			}
			
            // containerField is critical for ProtoInstance relationship to parent node
            if (!getContainerFieldOverride().isEmpty() && !getContainerFieldOverride().equals(this.getContainerFieldDefault())) // output if not default ProtoInstance containerField
            {
                    stringX3D.append(" containerField='").append(getContainerFieldOverride()).append("'");
            }

            // test attributes

			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getFamily().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" family='").append(new MFStringObject(getFamily()).toStringX3D()).append("'");
			}
			if (((getHorizontal() != HORIZONTAL_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" horizontal='").append(SFBoolObject.toString(getHorizontal())).append("'");
			}
			if (((getJustify().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" justify='").append(new MFStringObject(getJustify()).toStringX3D()).append("'");
			}
			if ((!getLanguage().equals(LANGUAGE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" language='").append(new SFStringObject(getLanguage()).toStringX3D()).append("'");
			}
			if (((getLeftToRight() != LEFTTORIGHT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" leftToRight='").append(SFBoolObject.toString(getLeftToRight())).append("'");
			}
			if (((getSize() != SIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" size='").append(SFFloatObject.toString(getSize())).append("'");
			}
			if (((getSpacing() != SPACING_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" spacing='").append(SFFloatObject.toString(getSpacing())).append("'");
			}
			if ((!getStyle().equals(STYLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" style='").append(new SFStringObject(getStyle()).toStringX3D()).append("'");
			}
			if (((getTopToBottom() != TOPTOBOTTOM_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" topToBottom='").append(SFBoolObject.toString(getTopToBottom())).append("'");
			}
		}
		if ((hasChild) && !isUSE()) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
			if      (metadata != null)
			{
				stringX3D.append(((X3DConcreteElement)metadata).toStringX3D(indentLevel + indentIncrement));
			}
			else if (metadataProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)metadataProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (IS != null)
			{
				stringX3D.append(((X3DConcreteElement)IS).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</FontStyle>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=FontStyle, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
		if (isUSE())
		{
			hasAttributes = false;
			hasChild      = false; // USE nodes include no other fields
		}
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		if (!getDEF().equals(DEF_DEFAULT_VALUE))
		{
			stringClassicVRML.append("DEF ").append(SFStringObject.toString(getDEF())).append(" ");
		}
		if (!getUSE().equals(USE_DEFAULT_VALUE))
		{
			 stringClassicVRML.append("USE ").append(SFStringObject.toString(getUSE())).append("\n");
		}
		else // only have further output if not a USE node
		{
			stringClassicVRML.append("FontStyle").append(" { "); // define node name, node content follows

			if (hasAttributes || hasChild)
			{
				stringClassicVRML.append("\n").append(indent).append(indentCharacter); // fields for this node follow
			}
			if (hasAttributes)
			{
				boolean hasISconnect = (getIS() != null) && !getIS().getConnectList().isEmpty();
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("class"))
						{
							stringClassicVRML.append(indentCharacter).append("class").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("# class ").append("\"").append(SFStringObject.toString(getCssClass())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("family"))
						{
							stringClassicVRML.append(indentCharacter).append("family").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getFamily().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("family ").append("[ ").append(MFStringObject.toString(getFamily())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("horizontal"))
						{
							stringClassicVRML.append(indentCharacter).append("horizontal").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getHorizontal() != HORIZONTAL_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("horizontal ").append(SFBoolObject.toString(getHorizontal())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("justify"))
						{
							stringClassicVRML.append(indentCharacter).append("justify").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getJustify().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("justify ").append("[ ").append(MFStringObject.toString(getJustify())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("language"))
						{
							stringClassicVRML.append(indentCharacter).append("language").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getLanguage().equals(LANGUAGE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("language ").append("\"").append(SFStringObject.toString(getLanguage())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("leftToRight"))
						{
							stringClassicVRML.append(indentCharacter).append("leftToRight").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getLeftToRight() != LEFTTORIGHT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("leftToRight ").append(SFBoolObject.toString(getLeftToRight())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("size"))
						{
							stringClassicVRML.append(indentCharacter).append("size").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSize() != SIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("size ").append(SFFloatObject.toString(getSize())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("spacing"))
						{
							stringClassicVRML.append(indentCharacter).append("spacing").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSpacing() != SPACING_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("spacing ").append(SFFloatObject.toString(getSpacing())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("style"))
						{
							stringClassicVRML.append(indentCharacter).append("style").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getStyle().equals(STYLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("style ").append("\"").append(SFStringObject.toString(getStyle())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("topToBottom"))
						{
							stringClassicVRML.append(indentCharacter).append("topToBottom").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTopToBottom() != TOPTOBOTTOM_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("topToBottom ").append(SFBoolObject.toString(getTopToBottom())).append("\n").append(indent).append(indentCharacter);
				}
			}
		}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child elements
			if (metadata != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadata).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (metadataProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadataProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (IS != null)
			{
				stringClassicVRML.append(((X3DConcreteElement) IS).toStringClassicVRML(indentLevel)); // end X3D statement
			}
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
				stringClassicVRML.append(indent); // end SFNode
			}
		}
		if (hasAttributes || hasChild)
		{
			stringClassicVRML.append("}").append("\n"); // finish node content
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
		return toStringClassicVRML(indentLevel);
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
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadata != null)
		{
			referenceElement = ((X3DConcreteElement) metadata).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadataProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) metadataProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (getDEF().equals(DEFvalue))
			return this;
		X3DConcreteNode referenceNode;
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (metadata != null)
		{
			referenceNode = ((X3DConcreteElement) metadata).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (metadataProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) metadataProtoInstance).findNodeByDEF(DEFvalue);
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

		setFamily(getFamily()); // exercise field checks, simple types
        
		setHorizontal(getHorizontal()); // exercise field checks, simple types
        
		setJustify(getJustify()); // exercise field checks, simple types
        
		setLanguage(getLanguage()); // exercise field checks, simple types
        
		setLeftToRight(getLeftToRight()); // exercise field checks, simple types
        
		setSize(getSize()); // exercise field checks, simple types
        
		setSpacing(getSpacing()); // exercise field checks, simple types
        
		setStyle(getStyle()); // exercise field checks, simple types
        
		setTopToBottom(getTopToBottom()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "FontStyle USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "FontStyle USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (metadata != null)
		{
			setMetadata(getMetadata());
			((X3DConcreteElement) metadata).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadata).getValidationResult());
		}
		if (metadataProtoInstance != null)
		{
			setMetadata(getMetadataProtoInstance());
			((X3DConcreteElement) metadataProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadataProtoInstance).getValidationResult());
		}
		if ((metadata != null) && (metadataProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both metadata and metadataProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasMetadata()) // test USE restrictions
		{
			String errorNotice = "FontStyle USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "FontStyle USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (getIS() != null)
		{
			if (getIS().getConnectList().isEmpty())
			{
				String errorNotice = "IS statement present, but contains no connect statements";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidProtoException(errorNotice); // report error
			}				
			// TODO also check that this node has ancestor ProtoBody, and that a field with same name also exists, so that IS is legal
		}
		if (!getContainerFieldOverride().isEmpty() &&
			!Arrays.asList(containerField_ALTERNATE_VALUES).contains(getContainerFieldOverride()))
		{
			String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
				": illegal value encountered, containerField='" + getContainerFieldOverride() +
				"' but allowed values are containerField_ALTERNATE_VALUES='" + 
				new MFStringObject(containerField_ALTERNATE_VALUES).toStringX3D() + "'.";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldException(errorNotice); // report error
		}

		// profile validation test, if connected to full scene
		if (findAncestorX3DObject() != null)
		{
			String     modelProfile = findAncestorX3DObject().getProfile();

			// check whether model has a satisfactory profile for this node
			boolean hasSatisfactorySupport = findAncestorX3DObject().supportsX3dComponent (COMPONENT, LEVEL);
                        
			if (!hasSatisfactorySupport)
			{
				String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
					" insufficient X3D profile='" + modelProfile +
					"' for parent X3D model containing 'FontStyle' node, add head statement <component name='Text' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Text\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
