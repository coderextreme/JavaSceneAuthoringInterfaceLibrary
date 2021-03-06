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
import java.util.Arrays;

/**
 * Functional summary: a field statement defines an interface attribute or node. Each field statement can contain either attribute-value or node content. This concrete class represents an X3D field statement.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] A field statement defines an interface attribute or node.
 * <ul>
 *  <li> <i>Hint:</i> first add a parent Script node or ProtoDeclare/ProtoInterface statements before defining a new field. </li> 
 *  <li> <i>Hint:</i>  in addition to defining a simple-type value attribute, a field statement can alternatively hold initializing SFNode/MFNode values as contained node(s). </li> 
 * </ul>
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#NodeAndFieldStatementSyntax" target="blank">X3D Abstract Specification: field</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#field" target="_blank">X3D Tooltips: field</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class fieldObject extends org.web3d.x3d.jsail.X3DConcreteStatement
{
	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=accessType, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=accessType, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String accessType; // SFString

 /* @name=appinfo, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=appinfo, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String appinfo; // SFString

 /* @name=children, @type=MFNode, $javaType=ArrayList<X3DNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DNode>, $normalizedMemberObjectName=children, $isX3dStatement=false, @acceptableNodeTypes=X3DNode */ 
	private ArrayList<X3DNode> children = new ArrayList<>(); // MFNode acceptable node types: X3DNode or ProtoInstanceObject

 /* @name=documentation, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=documentation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String documentation; // SFString

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

 /* @name=type, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=type, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String type; // SFString

 /* @name=value, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=value, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String value; // SFString or MFString

	/** Default value for this field type is an empty array. */
	private static final boolean[] DEFAULT_VALUE_BOOLEAN = new boolean[0]; // initialize as empty array

	/** boolean array, typed value holder */
	private boolean[] valueArrayBoolean;

	/** Default value for this field type is an empty array. */
	private static final int[] DEFAULT_VALUE_INTEGER = new int[0]; // initialize as empty array

	/** int array, typed value holder */
	private int[] valueArrayInteger;

	/** Default value for this field type is an empty array. */
	private static final float[] DEFAULT_VALUE_FLOAT = new float[0]; // initialize as empty array
								
	/** float array, typed value holder */	
	private float[] valueArrayFloat;
									
	/** Default value for this field type is an empty array. */
	private static final double[] DEFAULT_VALUE_DOUBLE = new double[0]; // initialize as empty array
									
	/** double array, typed value holder */	
	private double[] valueArrayDouble;


	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "initializeOnly", "inputOnly", "outputOnly", "inputOutput".
<br ><br >
	 * accessTypeChoices are strictly allowed enumeration values for accessType. Prior names in VRML97 were eventIn, eventOut, field, exposedField respectively.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics</a> 
	*/
	public static final ArrayList<String> accessTypeChoices = new ArrayList<>(Arrays.<String>asList("initializeOnly", "inputOnly", "outputOnly", "inputOutput"));

	/** 
	 * <i>Tooltip:</i> A field with accessType initializeOnly can be initialized, but cannot send or receive events.
	 * SFString field named <i>accessType</i> with X3DUOM baseType <i>accessTypeChoices</i> can equal this value <i>"initializeOnly"</i> (Java syntax) or <i>initializeOnly</i> (XML syntax).
	 * @see #accessTypeChoices */
	public static final String ACCESSTYPE_INITIALIZEONLY = "initializeOnly";

	/** 
	 * <i>Tooltip:</i> A field with accessType inputOnly cannot be initialized or included in a scene file, but can receive input event values via a ROUTE.
	 * SFString field named <i>accessType</i> with X3DUOM baseType <i>accessTypeChoices</i> can equal this value <i>"inputOnly"</i> (Java syntax) or <i>inputOnly</i> (XML syntax).
	 * @see #accessTypeChoices */
	public static final String ACCESSTYPE_INPUTONLY = "inputOnly";

	/** 
	 * <i>Tooltip:</i> A field with accessType outputOnly cannot be initialized or included in a scene file, but can send output event values via a ROUTE.
	 * SFString field named <i>accessType</i> with X3DUOM baseType <i>accessTypeChoices</i> can equal this value <i>"outputOnly"</i> (Java syntax) or <i>outputOnly</i> (XML syntax).
	 * @see #accessTypeChoices */
	public static final String ACCESSTYPE_OUTPUTONLY = "outputOnly";

	/** 
	 * <i>Tooltip:</i> A field with accessType inputOutput can be initialized, and can also send or receive events.
	 * SFString field named <i>accessType</i> with X3DUOM baseType <i>accessTypeChoices</i> can equal this value <i>"inputOutput"</i> (Java syntax) or <i>inputOutput</i> (XML syntax).
	 * @see #accessTypeChoices */
	public static final String ACCESSTYPE_INPUTOUTPUT = "inputOutput";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "SFBool", "MFBool", "SFColor", "MFColor", "SFColorRGBA", "MFColorRGBA", "SFDouble", "MFDouble", "SFFloat", "MFFloat", "SFImage", "MFImage", "SFInt32", "SFNode", "MFNode", "MFInt32", "SFRotation", "MFRotation", "SFString", "MFString", "SFTime", "MFTime", "SFVec2d", "MFVec2d", "SFVec2f", "MFVec2f", "SFVec3d", "MFVec3d", "SFVec3f", "MFVec3f", "SFVec4d", "MFVec4d", "SFVec4f", "MFVec4f", "SFMatrix3d", "MFMatrix3d", "SFMatrix3f", "MFMatrix3f", "SFMatrix4d", "MFMatrix4d", "SFMatrix4f", "MFMatrix4f".
<br ><br >
	 * fieldTypeChoices are enumerations for all allowed names of X3DField types.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html</a> 
	*/
	public static final ArrayList<String> fieldTypeChoices = new ArrayList<>(Arrays.<String>asList("SFBool", "MFBool", "SFColor", "MFColor", "SFColorRGBA", "MFColorRGBA", "SFDouble", "MFDouble", "SFFloat", "MFFloat", "SFImage", "MFImage", "SFInt32", "SFNode", "MFNode", "MFInt32", "SFRotation", "MFRotation", "SFString", "MFString", "SFTime", "MFTime", "SFVec2d", "MFVec2d", "SFVec2f", "MFVec2f", "SFVec3d", "MFVec3d", "SFVec3f", "MFVec3f", "SFVec4d", "MFVec4d", "SFVec4f", "MFVec4f", "SFMatrix3d", "MFMatrix3d", "SFMatrix3f", "MFMatrix3f", "SFMatrix4d", "MFMatrix4d", "SFMatrix4f", "MFMatrix4f"));

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFBool"</i> (Java syntax) or <i>SFBool</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFBOOL = "SFBool";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFBool"</i> (Java syntax) or <i>MFBool</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFBOOL = "MFBool";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFColor"</i> (Java syntax) or <i>SFColor</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFCOLOR = "SFColor";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFColor"</i> (Java syntax) or <i>MFColor</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFCOLOR = "MFColor";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFColorRGBA"</i> (Java syntax) or <i>SFColorRGBA</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFCOLORRGBA = "SFColorRGBA";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFColorRGBA"</i> (Java syntax) or <i>MFColorRGBA</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFCOLORRGBA = "MFColorRGBA";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFDouble"</i> (Java syntax) or <i>SFDouble</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFDOUBLE = "SFDouble";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFDouble"</i> (Java syntax) or <i>MFDouble</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFDOUBLE = "MFDouble";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFFloat"</i> (Java syntax) or <i>SFFloat</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFFLOAT = "SFFloat";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFFloat"</i> (Java syntax) or <i>MFFloat</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFFLOAT = "MFFloat";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFImage"</i> (Java syntax) or <i>SFImage</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFIMAGE = "SFImage";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFImage"</i> (Java syntax) or <i>MFImage</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFIMAGE = "MFImage";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFInt32"</i> (Java syntax) or <i>SFInt32</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFINT32 = "SFInt32";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFNode"</i> (Java syntax) or <i>SFNode</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFNODE = "SFNode";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFNode"</i> (Java syntax) or <i>MFNode</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFNODE = "MFNode";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFInt32"</i> (Java syntax) or <i>MFInt32</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFINT32 = "MFInt32";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFRotation"</i> (Java syntax) or <i>SFRotation</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFROTATION = "SFRotation";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFRotation"</i> (Java syntax) or <i>MFRotation</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFROTATION = "MFRotation";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFString"</i> (Java syntax) or <i>SFString</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFSTRING = "SFString";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFString"</i> (Java syntax) or <i>MFString</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFSTRING = "MFString";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFTime"</i> (Java syntax) or <i>SFTime</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFTIME = "SFTime";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFTime"</i> (Java syntax) or <i>MFTime</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFTIME = "MFTime";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFVec2d"</i> (Java syntax) or <i>SFVec2d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFVEC2D = "SFVec2d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFVec2d"</i> (Java syntax) or <i>MFVec2d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFVEC2D = "MFVec2d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFVec2f"</i> (Java syntax) or <i>SFVec2f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFVEC2F = "SFVec2f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFVec2f"</i> (Java syntax) or <i>MFVec2f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFVEC2F = "MFVec2f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFVec3d"</i> (Java syntax) or <i>SFVec3d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFVEC3D = "SFVec3d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFVec3d"</i> (Java syntax) or <i>MFVec3d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFVEC3D = "MFVec3d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFVec3f"</i> (Java syntax) or <i>SFVec3f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFVEC3F = "SFVec3f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFVec3f"</i> (Java syntax) or <i>MFVec3f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFVEC3F = "MFVec3f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFVec4d"</i> (Java syntax) or <i>SFVec4d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFVEC4D = "SFVec4d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFVec4d"</i> (Java syntax) or <i>MFVec4d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFVEC4D = "MFVec4d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFVec4f"</i> (Java syntax) or <i>SFVec4f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFVEC4F = "SFVec4f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFVec4f"</i> (Java syntax) or <i>MFVec4f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFVEC4F = "MFVec4f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFMatrix3d"</i> (Java syntax) or <i>SFMatrix3d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFMATRIX3D = "SFMatrix3d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFMatrix3d"</i> (Java syntax) or <i>MFMatrix3d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFMATRIX3D = "MFMatrix3d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFMatrix3f"</i> (Java syntax) or <i>SFMatrix3f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFMATRIX3F = "SFMatrix3f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFMatrix3f"</i> (Java syntax) or <i>MFMatrix3f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFMATRIX3F = "MFMatrix3f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFMatrix4d"</i> (Java syntax) or <i>SFMatrix4d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFMATRIX4D = "SFMatrix4d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFMatrix4d"</i> (Java syntax) or <i>MFMatrix4d</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFMATRIX4D = "MFMatrix4d";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"SFMatrix4f"</i> (Java syntax) or <i>SFMatrix4f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_SFMATRIX4F = "SFMatrix4f";

	/** SFString field named <i>type</i> with X3DUOM baseType <i>fieldTypeChoices</i> can equal this value <i>"MFMatrix4f"</i> (Java syntax) or <i>MFMatrix4f</i> (XML syntax).
	 * @see #fieldTypeChoices */
	public static final String TYPE_MFMATRIX4F = "MFMatrix4f";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>field</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "field";

	/** Provides name of this element: <i>field</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>field</i> element: <i>Core</i> */
	public static final String COMPONENT = "Core";

	/** Defines X3D component for the <i>field</i> element: <i>Core</i>
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

	/** <i>Initial value is required to be set for validity:</i> SFString field named <i>accessType</i> has default value equal to an empty string. */
	public static final String ACCESSTYPE_DEFAULT_VALUE = "";

	/** SFString field named <i>appinfo</i> has default value equal to an empty string. */
	public static final String APPINFO_DEFAULT_VALUE = "";

	/** SFString field named <i>documentation</i> has default value equal to an empty string. */
	public static final String DOCUMENTATION_DEFAULT_VALUE = "";

	/** SFString field named <i>name</i> has default value equal to an empty string. */
	public static final String NAME_DEFAULT_VALUE = "";

	/** <i>Initial value is required to be set for validity:</i> SFString field named <i>type</i> has default value equal to an empty string. */
	public static final String TYPE_DEFAULT_VALUE = "";

	/** SFString field named <i>value</i> has default value equal to an empty string. */
	public static final String VALUE_DEFAULT_VALUE = "";

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
			case "accessType":
				result = "SFString";
				break;
			case "appinfo":
				result = "SFString";
				break;
			case "children":
				result = "MFNode";
				break;
			case "documentation":
				result = "SFString";
				break;
			case "name":
				result = "SFString";
				break;
			case "type":
				result = "SFString";
				break;
			case "value":
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
			case "accessType":
				result = "inputOutput";
				break;
			case "appinfo":
				result = "inputOutput";
				break;
			case "children":
				result = "inputOutput";
				break;
			case "documentation":
				result = "inputOutput";
				break;
			case "name":
				result = "inputOutput";
				break;
			case "type":
				result = "inputOutput";
				break;
			case "value":
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

	/** Constructor for fieldObject to initialize member variables with default values. */
	public fieldObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		accessType = ACCESSTYPE_DEFAULT_VALUE;
		appinfo = APPINFO_DEFAULT_VALUE;
		children = new ArrayList<>();
		documentation = DOCUMENTATION_DEFAULT_VALUE;
		name = NAME_DEFAULT_VALUE;
		type = TYPE_DEFAULT_VALUE;
		value = VALUE_DEFAULT_VALUE;

		valueArrayBoolean = java.util.Arrays.copyOf(DEFAULT_VALUE_BOOLEAN, DEFAULT_VALUE_BOOLEAN.length); // must be separate copy
		valueArrayInteger = java.util.Arrays.copyOf(DEFAULT_VALUE_INTEGER, DEFAULT_VALUE_INTEGER.length); // must be separate copy
		valueArrayFloat   = java.util.Arrays.copyOf(DEFAULT_VALUE_FLOAT,   DEFAULT_VALUE_FLOAT.length  ); // must be separate copy
		valueArrayDouble  = java.util.Arrays.copyOf(DEFAULT_VALUE_DOUBLE,  DEFAULT_VALUE_DOUBLE.length ); // must be separate copy
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String enumeration value (baseType accessTypeChoices) ["initializeOnly" | "inputOnly" | "outputOnly" | "inputOutput"] from inputOutput SFString field named <i>accessType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Event-model semantics for field set/get capabilities.
 * <ul>
 *  <li> <i>Hint:</i> renamed accessType correspondences for X3D from VRML97 are inputOnly=eventIn, outputOnly=eventOut, initializeOnly=field, inputOutput=exposedField. </li> 
 *  <li> <i>Warning:</i> inputOutput=exposedField not allowed in VRML97 Script nodes, use initializeOnly=field for backwards compatibility. </li> 
 *  <li> <i>Hint:</i> an accessType value is required and must be provided. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 4.4.2.2 Field semantics, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics</a> </li> 
 *  <li> <i>Hint:</i>  X3D XML Encoding 4.3.7 Prototype and field declaration syntax, <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#PrototypeAndFieldDeclarationSyntax" target="_blank">https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#PrototypeAndFieldDeclarationSyntax</a> </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #ACCESSTYPE_INITIALIZEONLY INITIALIZEONLY}, {@link #ACCESSTYPE_INPUTONLY INPUTONLY}, {@link #ACCESSTYPE_OUTPUTONLY OUTPUTONLY}, {@link #ACCESSTYPE_INPUTOUTPUT INPUTOUTPUT}.
	 * @return value of accessType field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getAccessType()
	{
		return accessType;
	}

	/**
	 * Accessor method to assign String enumeration value ("initializeOnly" | "inputOnly" | "outputOnly" | "inputOutput") to inputOutput SFString field named <i>accessType</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #ACCESSTYPE_INITIALIZEONLY INITIALIZEONLY}, {@link #ACCESSTYPE_INPUTONLY INPUTONLY}, {@link #ACCESSTYPE_OUTPUTONLY OUTPUTONLY}, {@link #ACCESSTYPE_INPUTOUTPUT INPUTOUTPUT}).
	 * <br><br>
	 * <i>Tooltip:</i> Event-model semantics for field set/get capabilities.
 * <ul>
 *  <li> <i>Hint:</i> renamed accessType correspondences for X3D from VRML97 are inputOnly=eventIn, outputOnly=eventOut, initializeOnly=field, inputOutput=exposedField. </li> 
 *  <li> <i>Warning:</i> inputOutput=exposedField not allowed in VRML97 Script nodes, use initializeOnly=field for backwards compatibility. </li> 
 *  <li> <i>Hint:</i> an accessType value is required and must be provided. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 4.4.2.2 Field semantics, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics</a> </li> 
 *  <li> <i>Hint:</i>  X3D XML Encoding 4.3.7 Prototype and field declaration syntax, <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#PrototypeAndFieldDeclarationSyntax" target="_blank">https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#PrototypeAndFieldDeclarationSyntax</a> </li> 
 * </ul>
	 * @param newValue is new value for the accessType field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setAccessType(String newValue)
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
			newValue.equals(ACCESSTYPE_INITIALIZEONLY) ||
			newValue.equals(ACCESSTYPE_INPUTONLY) ||
			newValue.equals(ACCESSTYPE_OUTPUTONLY) ||
			newValue.equals(ACCESSTYPE_INPUTOUTPUT)))
		{
			String warningMessage = "Warning: field accessType newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		accessType = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString accessType field, similar to {@link #setAccessType(String)}.
	 * @param newValue is new value for the accessType field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setAccessType(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAccessType(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>appinfo</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Application information to provide simple description usable as a tooltip, similar to XML Schema appinfo tag.  * <br>

	 * @return value of appinfo field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getAppinfo()
	{
		return appinfo;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>appinfo</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Application information to provide simple description usable as a tooltip, similar to XML Schema appinfo tag.  * <br>

	 * @param newValue is new value for the appinfo field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setAppinfo(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		appinfo = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString appinfo field, similar to {@link #setAppinfo(String)}.
	 * @param newValue is new value for the appinfo field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setAppinfo(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAppinfo(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode.
	 * @see org.web3d.x3d.sai.Core.X3DNode
	 * @return value of children field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public ArrayList<X3DNode> getChildren()
	{
		return children;
	}

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode.
	 * @param newValue is new value for the children field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setChildren(ArrayList<X3DNode> newValue)
	{
		// set-newValue-validity-checks #0
		children = newValue;
		for (X3DNode arrayElement : children)
		{
			((X3DConcreteElement) arrayElement).setParentObject(this); // parentTest11
		}
		return this;
	}

	/**
	 * Add single node to existing array of children nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode and ProtoInstance.
	 * @param newValue is new value to be appended the children field.	 */
	public void addChildren(X3DNode newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for children field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public fieldObject addChildren(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}

	/**
	 * Utility method to add single child element to contained list of existing children nodes (if any).
	 * @param newValue is new node value to be appended the children field.	 
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	*/
	public fieldObject addChild(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest3
        if (newValue instanceof ProtoInstanceObject)
            ((ProtoInstanceObject) newValue).setContainerField("children");
		return this;
	}
	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode.
	 * @param newValue is new value array to be appended the children field.
	 */
	public void addChildren(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				children.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("children");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single children node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DNode.
	 * @param newValue is new node for the children field (restricted to X3DNode)
	 */
	public void setChildren(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearChildren(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : children)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearChildren(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			children.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of children field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public fieldObject clearChildren()
	{
		for (X3DNode element : children)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		children.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>children</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getChildren()
	 */
	public boolean hasChildren()
	{
		return (!children.isEmpty());
	}

	/**
	 * Add comment as CommentsBlock to children field
	 * @param newComment initial value
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public fieldObject addComments (String newComment)
	{
		if (newComment == null) return this;
		children.add(new CommentsBlock (newComment));
		return this;
	}
	/**
	 * Add comments as String[] array to children field
	 * @param newComments array of comments
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public fieldObject addComments (String[] newComments)
	{
		if (newComments == null) return this;
		children.add(new CommentsBlock (newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to children field
	 * @param newCommentsBlock block of comments to add
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public fieldObject addComments (CommentsBlock newCommentsBlock)
	{
		if (newCommentsBlock == null) return this;
		children.add(newCommentsBlock);
		return this;
	}
											/**
	 * Provide String value from inputOutput SFString field named <i>documentation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Documentation url for further information, similar to XML Schema documentation tag.  * <br>

	 * @return value of documentation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getDocumentation()
	{
		return documentation;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>documentation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Documentation url for further information, similar to XML Schema documentation tag.  * <br>

	 * @param newValue is new value for the documentation field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setDocumentation(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		documentation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString documentation field, similar to {@link #setDocumentation(String)}.
	 * @param newValue is new value for the documentation field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setDocumentation(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDocumentation(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Name of this field declaration.
 * <ul>
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Name of this field declaration.
 * <ul>
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public final fieldObject setName(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to field name
		if (!org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("field name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("field name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType fieldTypeChoices) ["SFBool" | "MFBool" | "SFColor" | "MFColor" | "SFColorRGBA" | "MFColorRGBA" | "SFDouble" | "MFDouble" | "SFFloat" | "MFFloat" | "SFImage" | "MFImage" | "SFInt32" | "SFNode" | "MFNode" | "MFInt32" | "SFRotation" | "MFRotation" | "SFString" | "MFString" | "SFTime" | "MFTime" | "SFVec2d" | "MFVec2d" | "SFVec2f" | "MFVec2f" | "SFVec3d" | "MFVec3d" | "SFVec3f" | "MFVec3f" | "SFVec4d" | "MFVec4d" | "SFVec4f" | "MFVec4f" | "SFMatrix3d" | "MFMatrix3d" | "SFMatrix3f" | "MFMatrix3f" | "SFMatrix4d" | "MFMatrix4d" | "SFMatrix4f" | "MFMatrix4f"] from inputOutput SFString field named <i>type</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Base type of this field variable.
 * <ul>
 *  <li> <i> Hint:</i>  a type value is required and must be provided. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #TYPE_SFBOOL SFBOOL}, {@link #TYPE_MFBOOL MFBOOL}, {@link #TYPE_SFCOLOR SFCOLOR}, {@link #TYPE_MFCOLOR MFCOLOR}, {@link #TYPE_SFCOLORRGBA SFCOLORRGBA}, {@link #TYPE_MFCOLORRGBA MFCOLORRGBA}, {@link #TYPE_SFDOUBLE SFDOUBLE}, {@link #TYPE_MFDOUBLE MFDOUBLE}, {@link #TYPE_SFFLOAT SFFLOAT}, {@link #TYPE_MFFLOAT MFFLOAT}, {@link #TYPE_SFIMAGE SFIMAGE}, {@link #TYPE_MFIMAGE MFIMAGE}, {@link #TYPE_SFINT32 SFINT32}, {@link #TYPE_SFNODE SFNODE}, {@link #TYPE_MFNODE MFNODE}, {@link #TYPE_MFINT32 MFINT32}, {@link #TYPE_SFROTATION SFROTATION}, {@link #TYPE_MFROTATION MFROTATION}, {@link #TYPE_SFSTRING SFSTRING}, {@link #TYPE_MFSTRING MFSTRING}, {@link #TYPE_SFTIME SFTIME}, {@link #TYPE_MFTIME MFTIME}, {@link #TYPE_SFVEC2D SFVEC2D}, {@link #TYPE_MFVEC2D MFVEC2D}, {@link #TYPE_SFVEC2F SFVEC2F}, {@link #TYPE_MFVEC2F MFVEC2F}, {@link #TYPE_SFVEC3D SFVEC3D}, {@link #TYPE_MFVEC3D MFVEC3D}, {@link #TYPE_SFVEC3F SFVEC3F}, {@link #TYPE_MFVEC3F MFVEC3F}, {@link #TYPE_SFVEC4D SFVEC4D}, {@link #TYPE_MFVEC4D MFVEC4D}, {@link #TYPE_SFVEC4F SFVEC4F}, {@link #TYPE_MFVEC4F MFVEC4F}, {@link #TYPE_SFMATRIX3D SFMATRIX3D}, {@link #TYPE_MFMATRIX3D MFMATRIX3D}, {@link #TYPE_SFMATRIX3F SFMATRIX3F}, {@link #TYPE_MFMATRIX3F MFMATRIX3F}, {@link #TYPE_SFMATRIX4D SFMATRIX4D}, {@link #TYPE_MFMATRIX4D MFMATRIX4D}, {@link #TYPE_SFMATRIX4F SFMATRIX4F}, {@link #TYPE_MFMATRIX4F MFMATRIX4F}.
	 * @return value of type field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getType()
	{
		return type;
	}

	/**
	 * Accessor method to assign String enumeration value ("SFBool" | "MFBool" | "SFColor" | "MFColor" | "SFColorRGBA" | "MFColorRGBA" | "SFDouble" | "MFDouble" | "SFFloat" | "MFFloat" | "SFImage" | "MFImage" | "SFInt32" | "SFNode" | "MFNode" | "MFInt32" | "SFRotation" | "MFRotation" | "SFString" | "MFString" | "SFTime" | "MFTime" | "SFVec2d" | "MFVec2d" | "SFVec2f" | "MFVec2f" | "SFVec3d" | "MFVec3d" | "SFVec3f" | "MFVec3f" | "SFVec4d" | "MFVec4d" | "SFVec4f" | "MFVec4f" | "SFMatrix3d" | "MFMatrix3d" | "SFMatrix3f" | "MFMatrix3f" | "SFMatrix4d" | "MFMatrix4d" | "SFMatrix4f" | "MFMatrix4f") to inputOutput SFString field named <i>type</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #TYPE_SFBOOL SFBOOL}, {@link #TYPE_MFBOOL MFBOOL}, {@link #TYPE_SFCOLOR SFCOLOR}, {@link #TYPE_MFCOLOR MFCOLOR}, {@link #TYPE_SFCOLORRGBA SFCOLORRGBA}, {@link #TYPE_MFCOLORRGBA MFCOLORRGBA}, {@link #TYPE_SFDOUBLE SFDOUBLE}, {@link #TYPE_MFDOUBLE MFDOUBLE}, {@link #TYPE_SFFLOAT SFFLOAT}, {@link #TYPE_MFFLOAT MFFLOAT}, {@link #TYPE_SFIMAGE SFIMAGE}, {@link #TYPE_MFIMAGE MFIMAGE}, {@link #TYPE_SFINT32 SFINT32}, {@link #TYPE_SFNODE SFNODE}, {@link #TYPE_MFNODE MFNODE}, {@link #TYPE_MFINT32 MFINT32}, {@link #TYPE_SFROTATION SFROTATION}, {@link #TYPE_MFROTATION MFROTATION}, {@link #TYPE_SFSTRING SFSTRING}, {@link #TYPE_MFSTRING MFSTRING}, {@link #TYPE_SFTIME SFTIME}, {@link #TYPE_MFTIME MFTIME}, {@link #TYPE_SFVEC2D SFVEC2D}, {@link #TYPE_MFVEC2D MFVEC2D}, {@link #TYPE_SFVEC2F SFVEC2F}, {@link #TYPE_MFVEC2F MFVEC2F}, {@link #TYPE_SFVEC3D SFVEC3D}, {@link #TYPE_MFVEC3D MFVEC3D}, {@link #TYPE_SFVEC3F SFVEC3F}, {@link #TYPE_MFVEC3F MFVEC3F}, {@link #TYPE_SFVEC4D SFVEC4D}, {@link #TYPE_MFVEC4D MFVEC4D}, {@link #TYPE_SFVEC4F SFVEC4F}, {@link #TYPE_MFVEC4F MFVEC4F}, {@link #TYPE_SFMATRIX3D SFMATRIX3D}, {@link #TYPE_MFMATRIX3D MFMATRIX3D}, {@link #TYPE_SFMATRIX3F SFMATRIX3F}, {@link #TYPE_MFMATRIX3F MFMATRIX3F}, {@link #TYPE_SFMATRIX4D SFMATRIX4D}, {@link #TYPE_MFMATRIX4D MFMATRIX4D}, {@link #TYPE_SFMATRIX4F SFMATRIX4F}, {@link #TYPE_MFMATRIX4F MFMATRIX4F}).
	 * <br><br>
	 * <i>Tooltip:</i> Base type of this field variable.
 * <ul>
 *  <li> <i> Hint:</i>  a type value is required and must be provided. </li> 
 * </ul>
	 * @param newValue is new value for the type field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setType(String newValue)
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
			newValue.equals(TYPE_SFBOOL) ||
			newValue.equals(TYPE_MFBOOL) ||
			newValue.equals(TYPE_SFCOLOR) ||
			newValue.equals(TYPE_MFCOLOR) ||
			newValue.equals(TYPE_SFCOLORRGBA) ||
			newValue.equals(TYPE_MFCOLORRGBA) ||
			newValue.equals(TYPE_SFDOUBLE) ||
			newValue.equals(TYPE_MFDOUBLE) ||
			newValue.equals(TYPE_SFFLOAT) ||
			newValue.equals(TYPE_MFFLOAT) ||
			newValue.equals(TYPE_SFIMAGE) ||
			newValue.equals(TYPE_MFIMAGE) ||
			newValue.equals(TYPE_SFINT32) ||
			newValue.equals(TYPE_SFNODE) ||
			newValue.equals(TYPE_MFNODE) ||
			newValue.equals(TYPE_MFINT32) ||
			newValue.equals(TYPE_SFROTATION) ||
			newValue.equals(TYPE_MFROTATION) ||
			newValue.equals(TYPE_SFSTRING) ||
			newValue.equals(TYPE_MFSTRING) ||
			newValue.equals(TYPE_SFTIME) ||
			newValue.equals(TYPE_MFTIME) ||
			newValue.equals(TYPE_SFVEC2D) ||
			newValue.equals(TYPE_MFVEC2D) ||
			newValue.equals(TYPE_SFVEC2F) ||
			newValue.equals(TYPE_MFVEC2F) ||
			newValue.equals(TYPE_SFVEC3D) ||
			newValue.equals(TYPE_MFVEC3D) ||
			newValue.equals(TYPE_SFVEC3F) ||
			newValue.equals(TYPE_MFVEC3F) ||
			newValue.equals(TYPE_SFVEC4D) ||
			newValue.equals(TYPE_MFVEC4D) ||
			newValue.equals(TYPE_SFVEC4F) ||
			newValue.equals(TYPE_MFVEC4F) ||
			newValue.equals(TYPE_SFMATRIX3D) ||
			newValue.equals(TYPE_MFMATRIX3D) ||
			newValue.equals(TYPE_SFMATRIX3F) ||
			newValue.equals(TYPE_MFMATRIX3F) ||
			newValue.equals(TYPE_SFMATRIX4D) ||
			newValue.equals(TYPE_MFMATRIX4D) ||
			newValue.equals(TYPE_SFMATRIX4F) ||
			newValue.equals(TYPE_MFMATRIX4F)))
		{
			String warningMessage = "Warning: field type newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment

		if (newValue.isEmpty() ) // no value provided to set type
		{
			String warningMessage = "Warning: field type newValue=\"" + newValue + "\" has no value, ignored.";
			System.out.println(warningMessage);
			return this;
		}									
		boolean isStringType  = newValue.equals(fieldObject.TYPE_SFSTRING) || newValue.equals(fieldObject.TYPE_MFSTRING);					
		boolean isBooleanType = newValue.equals(fieldObject.TYPE_SFBOOL)   || newValue.equals(fieldObject.TYPE_MFBOOL);
		boolean isIntegerType = newValue.equals(fieldObject.TYPE_SFINT32)  || newValue.equals(fieldObject.TYPE_MFINT32) ||
								newValue.equals(fieldObject.TYPE_SFIMAGE)  || newValue.equals(fieldObject.TYPE_MFIMAGE);
		boolean isFloatType   = newValue.equals(fieldObject.TYPE_SFCOLOR)    || newValue.equals(fieldObject.TYPE_MFCOLOR) ||
								newValue.equals(fieldObject.TYPE_SFCOLORRGBA)|| newValue.equals(fieldObject.TYPE_MFCOLORRGBA) ||
								newValue.equals(fieldObject.TYPE_SFFLOAT)    || newValue.equals(fieldObject.TYPE_MFFLOAT) ||
								newValue.equals(fieldObject.TYPE_SFROTATION) || newValue.equals(fieldObject.TYPE_MFROTATION) ||
								newValue.equals(fieldObject.TYPE_SFTIME)     || newValue.equals(fieldObject.TYPE_MFTIME) ||
								newValue.equals(fieldObject.TYPE_SFVEC2F)    || newValue.equals(fieldObject.TYPE_MFVEC2F) ||
								newValue.equals(fieldObject.TYPE_SFVEC3F)    || newValue.equals(fieldObject.TYPE_MFVEC3F) ||
								newValue.equals(fieldObject.TYPE_SFVEC4F)    || newValue.equals(fieldObject.TYPE_MFVEC4F) ||
								newValue.equals(fieldObject.TYPE_SFMATRIX3F) || newValue.equals(fieldObject.TYPE_MFMATRIX3F) ||
								newValue.equals(fieldObject.TYPE_SFMATRIX4F) || newValue.equals(fieldObject.TYPE_MFMATRIX4F);										
		boolean isDoubleType  = newValue.equals(fieldObject.TYPE_SFDOUBLE)   || newValue.equals(fieldObject.TYPE_MFDOUBLE) ||
								newValue.equals(fieldObject.TYPE_SFTIME)     || newValue.equals(fieldObject.TYPE_MFTIME) ||
								newValue.equals(fieldObject.TYPE_SFVEC2D)    || newValue.equals(fieldObject.TYPE_MFVEC2D) ||
								newValue.equals(fieldObject.TYPE_SFVEC3D)    || newValue.equals(fieldObject.TYPE_MFVEC3D) ||
								newValue.equals(fieldObject.TYPE_SFVEC4D)    || newValue.equals(fieldObject.TYPE_MFVEC4D) ||
								newValue.equals(fieldObject.TYPE_SFMATRIX3D) || newValue.equals(fieldObject.TYPE_MFMATRIX3D) ||
								newValue.equals(fieldObject.TYPE_SFMATRIX4D);
												
		boolean hasStringValuePresent  = (value.length() > 0);
		boolean hasBooleanValuePresent = (valueArrayBoolean.length > 0);
		boolean hasIntegerValuePresent = (valueArrayInteger.length > 0);
		boolean hasFloatValuePresent   = (valueArrayFloat.length   > 0);
		boolean hasDoubleValuePresent  = (valueArrayDouble.length  > 0);
												
		boolean hasMismatchedValuePresent = // (hasStringValuePresent  && !isStringType)  ||
											(hasBooleanValuePresent && !isBooleanType) ||
											(hasIntegerValuePresent && !isIntegerType) ||
											(hasFloatValuePresent   && !isFloatType)   ||
											(hasDoubleValuePresent  && !isDoubleType);
		if (hasMismatchedValuePresent)
		{
			// Report if prior data is getting cleared from a differently typed value holder
			String warningMessage = "Warning: field name=\"" + getName() + "\" type=\"" + newValue + "\" has prior value with mismatched type already set, ";
//			if (!isStringType && hasStringValuePresent)
//          {
//              maxLength = max (value.length(),40);
//				System.out.println(warningMessage + "String value=\"" + value.substring(0,maxLength) + "\"");
//			}
			int maxLength;
            if (!isBooleanType && hasBooleanValuePresent)
            {
                maxLength = Integer.min(new MFBoolObject(valueArrayBoolean).toString().length(),40);
                System.out.println(warningMessage + "valueArrayBoolean=[" + new MFBoolObject(valueArrayBoolean).toString().substring(0,maxLength)  + "]");
            }
			if (!isIntegerType && hasIntegerValuePresent)
            {
                maxLength = Integer.min(new MFInt32Object(valueArrayInteger).toString().length(),40);
				System.out.println(warningMessage + "valueArrayInteger=[" + new MFInt32Object(valueArrayInteger).toString().substring(0,maxLength) + "]");
			}
			if (!isFloatType && hasFloatValuePresent)
            {
                maxLength = Integer.min(new MFFloatObject(valueArrayFloat).toString().length(),40);
				System.out.println(warningMessage + "valueArrayFloat=["   + new MFFloatObject(valueArrayFloat).toString().substring(0,maxLength)   + "]");
			}
			if (!isDoubleType && hasDoubleValuePresent)
            {
                maxLength = Integer.min(new MFDoubleObject(valueArrayDouble).toString().length(),40);
				System.out.println(warningMessage + "valueArrayDouble=["  + new MFDoubleObject(valueArrayDouble).toString().substring(0,maxLength) + "]");
			}
		}
		// When assigning type: if appropriate, shift prior string value to corresponding typed array
		if (newValue.equals(fieldObject.TYPE_SFNODE)   || newValue.equals(fieldObject.TYPE_MFNODE))
		{
			// clear all arrays
			value             = new   String(); // reset
			valueArrayBoolean = new boolean[0]; // reset
			valueArrayInteger = new     int[0]; // reset
			valueArrayFloat   = new   float[0]; // reset
			valueArrayDouble  = new  double[0]; // reset
		}
		else if (isStringType)
		{
			// leave String value array alone, clear other arrays
			valueArrayBoolean = new boolean[0]; // reset
			valueArrayInteger = new     int[0]; // reset
			valueArrayFloat   = new   float[0]; // reset
			valueArrayDouble  = new  double[0]; // reset
		}
		else if (isBooleanType)
		{
			// don't overwrite prior array if present, otherwise recover string value
			if (!hasBooleanValuePresent && hasStringValuePresent)
				valueArrayBoolean = new MFBoolObject().setValueByString(value).getPrimitiveValue();
			value             = new   String(); // reset
			valueArrayInteger = new     int[0]; // reset
			valueArrayFloat   = new   float[0]; // reset
			valueArrayDouble  = new  double[0]; // reset
		}
		else if (isIntegerType)
		{
			// don't overwrite prior array if present, otherwise recover string value
			if (!hasIntegerValuePresent && hasStringValuePresent)
				valueArrayInteger = new MFInt32Object().setValueByString(value).getPrimitiveValue();
			value             = new   String(); // reset
			valueArrayBoolean = new boolean[0]; // reset
			valueArrayFloat   = new   float[0]; // reset
			valueArrayDouble  = new  double[0]; // reset
		}
		else if (isFloatType)
		{
			// don't overwrite prior array if present, otherwise recover string value
			if (!hasFloatValuePresent && hasStringValuePresent)
				valueArrayFloat = new MFFloatObject().setValueByString(value).getPrimitiveValue();
			value             = new   String(); // reset
			valueArrayBoolean = new boolean[0]; // reset
			valueArrayInteger = new     int[0]; // reset
			valueArrayDouble  = new  double[0]; // reset
		}
		else if (isDoubleType)
		{
			// don't overwrite prior array if present, otherwise recover string value
			if (!hasDoubleValuePresent && hasStringValuePresent)
				valueArrayDouble = new MFDoubleObject().setValueByString(value).getPrimitiveValue();
			value             = new   String(); // reset
			valueArrayBoolean = new boolean[0]; // reset
			valueArrayInteger = new     int[0]; // reset
			valueArrayFloat   = new   float[0]; // reset
		}
		type = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString type field, similar to {@link #setType(String)}.
	 * @param newValue is new value for the type field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setType(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setType(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>value</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Provide default initialization value for this field variable (which may be re-initialized later by instantiation value of a named ProtoInstance fieldValue).
 * <ul>
 *  <li> <i>Hint:</i> SFNode/MFNode fields are initialized using contained node content, instead of this value attribute. </li> 
 *  <li> <i>Hint:</i> value is required for Script and ProtoDeclare unless MF-type array initialization is empty list, SFString initialization is empty string, or SFNode is being initialized. </li> 
 *  <li> <i>Hint:</i> SFNode/MFNode fields are initialized by contained node element(s), if any. </li> 
 *  <li> <i>Warning:</i> setting a value is not allowed for ExternProtoDeclare field declarations, since original ProtoDeclare initializations or local ProtoInstance fieldValue initializations take precedence. </li> 
 *  <li> <i>Warning:</i> not allowed for field variables with accessType inputOnly or outputOnly. </li> 
 *  <li> <i>Warning:</i>  initialization value is not allowed if this field is part of a Script interface and has a corresponding IS/connect definition. </li> 
 * </ul>
	 * @return value of value field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getValue()
	{

		String valueType = getType();
		// alternatives for return typed value
		if ((valueArrayBoolean != null) && (valueArrayBoolean.length > 0))
		{
			if      (valueType.equals(fieldObject.TYPE_SFBOOL)) return SFBoolObject.toString(valueArrayBoolean[0]);
			else if (valueType.equals(fieldObject.TYPE_MFBOOL)) return MFBoolObject.toString(valueArrayBoolean);
		}
		else if ((valueArrayInteger != null) && (valueArrayInteger.length > 0))
		{
			if      (valueType.equals(fieldObject.TYPE_SFINT32)) return SFInt32Object.toString(valueArrayInteger[0]);
			else if (valueType.equals(fieldObject.TYPE_MFINT32)) return MFInt32Object.toString(valueArrayInteger);
			else if (valueType.equals(fieldObject.TYPE_SFIMAGE)) return SFImageObject.toString(valueArrayInteger);
			else if (valueType.equals(fieldObject.TYPE_MFIMAGE)) return MFImageObject.toString(valueArrayInteger);
		}
		else if ((valueArrayFloat != null) && (valueArrayFloat.length > 0))
		{
			if      (valueType.equals(fieldObject.TYPE_SFFLOAT))     return SFFloatObject.toString(valueArrayFloat[0]);
			else if (valueType.equals(fieldObject.TYPE_MFFLOAT))     return MFFloatObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_SFCOLOR))     return SFColorObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFCOLOR))     return MFColorObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_SFCOLORRGBA)) return SFColorRGBAObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFCOLORRGBA)) return MFColorRGBAObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_SFROTATION))  return SFRotationObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFROTATION))  return MFRotationObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_SFVEC2F))     return SFVec2fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_SFVEC3F))     return SFVec3fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_SFVEC4F))     return SFVec4fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFVEC2F))     return MFVec2fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFVEC3F))     return MFVec3fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFVEC4F))     return MFVec4fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFMATRIX3F))  return MFMatrix3fObject.toString(valueArrayFloat);
			else if (valueType.equals(fieldObject.TYPE_MFMATRIX4F))  return MFMatrix4fObject.toString(valueArrayFloat);
		}
		else if ((valueArrayDouble != null) && (valueArrayDouble.length > 0))
		{
			if      (valueType.equals(fieldObject.TYPE_SFDOUBLE))    return SFDoubleObject.toString(valueArrayDouble[0]);
			else if (valueType.equals(fieldObject.TYPE_MFDOUBLE))    return MFDoubleObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_SFTIME))      return SFTimeObject.toString(valueArrayDouble[0]);
			else if (valueType.equals(fieldObject.TYPE_MFTIME))      return MFTimeObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_SFVEC2D))     return SFVec2dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_SFVEC3D))     return SFVec3dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_SFVEC4D))     return SFVec4dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_MFVEC2D))     return MFVec2dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_MFVEC3D))     return MFVec3dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_MFVEC4D))     return MFVec4dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_MFMATRIX3D))  return MFMatrix3dObject.toString(valueArrayDouble);
			else if (valueType.equals(fieldObject.TYPE_MFMATRIX4D))  return MFMatrix4dObject.toString(valueArrayDouble);
		}
		else if (value != null)
		{
			if      (valueType.equals(fieldObject.TYPE_SFSTRING) ||
					 valueType.equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE)) // matches XML default; might not be connected yet
				return new SFStringObject(value).toString();
			else if (valueType.equals(fieldObject.TYPE_MFSTRING))
				return new MFStringObject(value).toString();
		}
		// TODO error handling
		if (value == null)
		{
			return "";
		}
		else return value;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>value</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Provide default initialization value for this field variable (which may be re-initialized later by instantiation value of a named ProtoInstance fieldValue).
 * <ul>
 *  <li> <i>Hint:</i> SFNode/MFNode fields are initialized using contained node content, instead of this value attribute. </li> 
 *  <li> <i>Hint:</i> value is required for Script and ProtoDeclare unless MF-type array initialization is empty list, SFString initialization is empty string, or SFNode is being initialized. </li> 
 *  <li> <i>Hint:</i> SFNode/MFNode fields are initialized by contained node element(s), if any. </li> 
 *  <li> <i>Warning:</i> setting a value is not allowed for ExternProtoDeclare field declarations, since original ProtoDeclare initializations or local ProtoInstance fieldValue initializations take precedence. </li> 
 *  <li> <i>Warning:</i> not allowed for field variables with accessType inputOnly or outputOnly. </li> 
 *  <li> <i>Warning:</i>  initialization value is not allowed if this field is part of a Script interface and has a corresponding IS/connect definition. </li> 
 * </ul>
	 * @param newValue is new value for the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setValue(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		// check for legal type
		String valueType = getType();
		if (valueType.equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE))
			valueType = fieldObject.TYPE_SFSTRING; // same as default found in file encodings
			// TODO must recheck during run-time validation to ensure fully constructed OK

		if ((valueType.equals(fieldObject.TYPE_SFNODE) || valueType.equals(fieldObject.TYPE_MFNODE)) &&
			(newValue.length() > 0))
		{
			throw new InvalidProtoException("field name='" + getName() + "' with type='" + valueType +
					"' cannot have any simple-type value (newValue='" + newValue + "').  Use setChildren() method instead.");
		}
		else if (valueType.equals(fieldObject.TYPE_SFSTRING) || valueType.equals(fieldObject.TYPE_MFSTRING))
		{
			value = newValue;
		}
		else if (valueType.equals(fieldObject.TYPE_SFBOOL))
		{
			valueArrayBoolean = new MFBoolObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFCOLOR))
		{
			valueArrayFloat = new MFColorObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFCOLORRGBA))
		{
			valueArrayFloat = new MFColorRGBAObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFDOUBLE))
		{
			valueArrayDouble = new MFDoubleObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFFLOAT))
		{
			valueArrayFloat = new MFFloatObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFIMAGE))
		{
			valueArrayInteger = new MFImageObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFINT32))
		{
			valueArrayInteger = new MFInt32Object().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFMATRIX3D))
		{
			valueArrayDouble = new MFMatrix3dObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFMATRIX3F))
		{
			valueArrayFloat = new MFMatrix3fObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFMATRIX4D))
		{
			valueArrayDouble = new MFMatrix4dObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFMATRIX4F))
		{
			valueArrayFloat = new MFMatrix4fObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFROTATION))
		{
			valueArrayFloat = new MFRotationObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFTIME))
		{
			valueArrayDouble = new MFTimeObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFVEC2D))
		{
			valueArrayDouble = new MFVec2dObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFVEC2F))
		{
			valueArrayFloat = new MFVec2fObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFVEC3D))
		{
			valueArrayDouble = new MFVec3dObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFVEC3F))
		{
			valueArrayFloat = new MFVec3fObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFVEC4D))
		{
			valueArrayDouble = new MFVec4dObject().setValueByString(newValue).getPrimitiveValue();
		}
	
		else if (valueType.equals(fieldObject.TYPE_SFVEC4F))
		{
			valueArrayFloat = new MFVec4fObject().setValueByString(newValue).getPrimitiveValue();
		}
			value = newValue;
		return this;
	}


	/**
	 * Append SFBoolObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFBoolObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFBOOL) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            boolean[] newArray = new boolean[valueArrayBoolean.length + 1];
            System.arraycopy(valueArrayBoolean, 0, newArray, 0, valueArrayBoolean.length);
            newArray[valueArrayBoolean.length] = newValue.getPrimitiveValue();
            valueArrayBoolean = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFBoolObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFBoolObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFBoolObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFBOOL) || 
             getType().equals(fieldObject.TYPE_SFBOOL) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            boolean[] newArray = new boolean[valueArrayBoolean.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayBoolean, 0, newArray, 0, valueArrayBoolean.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayBoolean = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFBoolObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFColorObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFColorObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFCOLOR) || 
             getType().equals(fieldObject.TYPE_SFCOLOR) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFColorObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFColorObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFColorObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFCOLOR) || 
             getType().equals(fieldObject.TYPE_SFCOLOR) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFColorObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFColorRGBAObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFColorRGBAObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFCOLORRGBA) || 
             getType().equals(fieldObject.TYPE_SFCOLORRGBA) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFColorRGBAObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFColorRGBAObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFColorRGBAObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFCOLORRGBA) || 
             getType().equals(fieldObject.TYPE_SFCOLORRGBA) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFColorRGBAObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFDoubleObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFDoubleObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFDOUBLE) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + 1];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            newArray[valueArrayDouble.length] = newValue.getPrimitiveValue();
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFDoubleObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFDoubleObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFDoubleObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFDOUBLE) || 
             getType().equals(fieldObject.TYPE_SFDOUBLE) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFDoubleObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFFloatObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFFloatObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFFLOAT) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + 1];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            newArray[valueArrayFloat.length] = newValue.getPrimitiveValue();
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFFloatObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFFloatObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFFloatObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFFLOAT) || 
             getType().equals(fieldObject.TYPE_SFFLOAT) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFFloatObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFImageObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFImageObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFIMAGE) || 
             getType().equals(fieldObject.TYPE_SFIMAGE) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            int[] newArray = new int[valueArrayInteger.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayInteger, 0, newArray, 0, valueArrayInteger.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayInteger = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFImageObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFImageObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFImageObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFIMAGE) || 
             getType().equals(fieldObject.TYPE_SFIMAGE) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            int[] newArray = new int[valueArrayInteger.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayInteger, 0, newArray, 0, valueArrayInteger.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayInteger = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFImageObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFInt32Object to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFInt32Object newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFINT32) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            int[] newArray = new int[valueArrayInteger.length + 1];
            System.arraycopy(valueArrayInteger, 0, newArray, 0, valueArrayInteger.length);
            newArray[valueArrayInteger.length] = newValue.getPrimitiveValue();
            valueArrayInteger = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFInt32Object " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFInt32Object to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFInt32Object newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFINT32) || 
             getType().equals(fieldObject.TYPE_SFINT32) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            int[] newArray = new int[valueArrayInteger.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayInteger, 0, newArray, 0, valueArrayInteger.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayInteger = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFInt32Object " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFMatrix3dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFMatrix3dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFMATRIX3D) || 
             getType().equals(fieldObject.TYPE_SFMATRIX3D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFMatrix3dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFMatrix3dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFMatrix3dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFMATRIX3D) || 
             getType().equals(fieldObject.TYPE_SFMATRIX3D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFMatrix3dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFMatrix3fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFMatrix3fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFMATRIX3F) || 
             getType().equals(fieldObject.TYPE_SFMATRIX3F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFMatrix3fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFMatrix3fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFMatrix3fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFMATRIX3F) || 
             getType().equals(fieldObject.TYPE_SFMATRIX3F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFMatrix3fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFMatrix4dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFMatrix4dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFMATRIX4D) || 
             getType().equals(fieldObject.TYPE_SFMATRIX4D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFMatrix4dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFMatrix4dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFMatrix4dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFMATRIX4D) || 
             getType().equals(fieldObject.TYPE_SFMATRIX4D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFMatrix4dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFMatrix4fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFMatrix4fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFMATRIX4F) || 
             getType().equals(fieldObject.TYPE_SFMATRIX4F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFMatrix4fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFMatrix4fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFMatrix4fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFMATRIX4F) || 
             getType().equals(fieldObject.TYPE_SFMATRIX4F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFMatrix4fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFRotationObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFRotationObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFROTATION) || 
             getType().equals(fieldObject.TYPE_SFROTATION) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFRotationObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFRotationObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFRotationObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFROTATION) || 
             getType().equals(fieldObject.TYPE_SFROTATION) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFRotationObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFStringObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFStringObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFSTRING) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            if (newValue != null)
                   value += newValue.getPrimitiveValue();
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFStringObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFStringObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFStringObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFSTRING) || getType().equals(fieldObject.TYPE_MFSTRING) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            if (newValue != null)
                   value += newValue.getPrimitiveValue();
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFStringObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFTimeObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFTimeObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFTIME) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + 1];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            newArray[valueArrayDouble.length] = newValue.getPrimitiveValue();
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFTimeObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFTimeObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFTimeObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFTIME) || 
             getType().equals(fieldObject.TYPE_SFTIME) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFTimeObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFVec2dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFVec2dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFVEC2D) || 
             getType().equals(fieldObject.TYPE_SFVEC2D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFVec2dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFVec2dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFVec2dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFVEC2D) || 
             getType().equals(fieldObject.TYPE_SFVEC2D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFVec2dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFVec2fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFVec2fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFVEC2F) || 
             getType().equals(fieldObject.TYPE_SFVEC2F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFVec2fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFVec2fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFVec2fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFVEC2F) || 
             getType().equals(fieldObject.TYPE_SFVEC2F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFVec2fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFVec3dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFVec3dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFVEC3D) || 
             getType().equals(fieldObject.TYPE_SFVEC3D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFVec3dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFVec3dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFVec3dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFVEC3D) || 
             getType().equals(fieldObject.TYPE_SFVEC3D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFVec3dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFVec3fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFVec3fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFVEC3F) || 
             getType().equals(fieldObject.TYPE_SFVEC3F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFVec3fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFVec3fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFVec3fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFVEC3F) || 
             getType().equals(fieldObject.TYPE_SFVEC3F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFVec3fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFVec4dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFVec4dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFVEC4D) || 
             getType().equals(fieldObject.TYPE_SFVEC4D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFVec4dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFVec4dObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFVec4dObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFVEC4D) || 
             getType().equals(fieldObject.TYPE_SFVEC4D) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            double[] newArray = new double[valueArrayDouble.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFVec4dObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append SFVec4fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(SFVec4fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_SFVEC4F) || 
             getType().equals(fieldObject.TYPE_SFVEC4F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(SFVec4fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append MFVec4fObject to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(MFVec4fObject newValue)
	{
        // set-newValue-validity-checks #TODO

        if ( getType().equals(fieldObject.TYPE_MFVEC4F) || 
             getType().equals(fieldObject.TYPE_SFVEC4F) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            // https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array
            // arrays cannot be dynamically resized, must create new array of proper length
            float[] newArray = new float[valueArrayFloat.length + newValue.getPrimitiveValue().length];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            System.arraycopy(newValue.getPrimitiveValue(), 0, newArray, 0, newValue.getPrimitiveValue().length);
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFVec4fObject " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }

	/**
	 * Append boolean to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldValueObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(boolean newValue)
	{
        if ( getType().equals(fieldObject.TYPE_MFBOOL) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            boolean[] newArray = new boolean[valueArrayBoolean.length + 1];
            System.arraycopy(valueArrayBoolean, 0, newArray, 0, valueArrayBoolean.length);
            newArray[valueArrayBoolean.length] = newValue;
            valueArrayBoolean = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(boolean " + newValue + ") when fieldValue type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }
	/**
	 * Append integer to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldValueObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(int newValue)
	{
        if ( getType().equals(fieldObject.TYPE_SFINT32) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            int[] newArray = new int[valueArrayInteger.length + 1];
            System.arraycopy(valueArrayInteger, 0, newArray, 0, valueArrayInteger.length);
            newArray[valueArrayInteger.length] = newValue;
            valueArrayInteger = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(int " + newValue + ") when fieldValue type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }
	/**
	 * Append float to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldValueObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(float newValue)
	{
        if ( getType().equals(fieldObject.TYPE_SFFLOAT) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            float[] newArray = new float[valueArrayFloat.length + 1];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            newArray[valueArrayFloat.length] = newValue;
            valueArrayFloat = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(float " + newValue + ") when fieldValue type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }
	/**
	 * Append double to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldValueObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(double newValue)
	{
        if ( getType().equals(fieldObject.TYPE_MFDOUBLE) || getType().equals(fieldObject.TYPE_MFTIME) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            double[] newArray = new double[valueArrayDouble.length + 1];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            newArray[valueArrayDouble.length] = newValue;
            valueArrayDouble = newArray;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(double " + newValue + ") when fieldValue type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }
	/**
	 * Append String to field for <i>value</i> attribute.
	 * <br><br>
	 * <i>Tooltip:</i> fieldValue contains initial value for this field, which overrides default initialization value defined in original ProtoDeclare field.
	 * @param newValue is new value to append to the value field.
	 * @return {@link fieldValueObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject appendValue(String newValue)
	{
        // set-newValue-validity-checks #TODO
        if ( getType().equals(fieldObject.TYPE_SFSTRING) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            value += newValue; // append string
        }
        else if (getType().equals(fieldObject.TYPE_MFSTRING))
        {
            if (!newValue.startsWith(" "))
                value += " ";
            if (!newValue.trim().startsWith("\""))
                value += "\""; // wrap quote
            value += newValue; // append string
            if (!newValue.trim().endsWith("\""))
                value += "\""; // wrap quote
        }
		else if (getType().equals(fieldObject.TYPE_MFBOOL))
		{
            boolean[] newArray = new boolean[valueArrayBoolean.length + 1];
            System.arraycopy(valueArrayBoolean, 0, newArray, 0, valueArrayBoolean.length);
            newArray[valueArrayBoolean.length] = new SFBoolObject().setValueByString(newValue).getValue(); // type conversion
            valueArrayBoolean = newArray;
		}
		else if (getType().equals(fieldObject.TYPE_MFINT32))
		{
            int[] newArray = new int[valueArrayInteger.length + 1];
            System.arraycopy(valueArrayInteger, 0, newArray, 0, valueArrayInteger.length);
            newArray[valueArrayInteger.length] = new SFInt32Object().setValueByString(newValue).getValue(); // type conversion
            valueArrayInteger = newArray;
		}
		else if (getType().equals(fieldObject.TYPE_MFFLOAT))
		{
            float[] newArray = new float[valueArrayFloat.length + 1];
            System.arraycopy(valueArrayFloat, 0, newArray, 0, valueArrayFloat.length);
            newArray[valueArrayFloat.length] = new SFFloatObject().setValueByString(newValue).getValue(); // type conversion
            valueArrayFloat = newArray;
		}
		else if (getType().equals(fieldObject.TYPE_MFDOUBLE) || getType().equals(fieldObject.TYPE_MFTIME))
		{
            double[] newArray = new double[valueArrayDouble.length + 1];
            System.arraycopy(valueArrayDouble, 0, newArray, 0, valueArrayDouble.length);
            newArray[valueArrayDouble.length] = new SFDoubleObject().setValueByString(newValue).getValue(); // type conversion
            valueArrayDouble = newArray;
		}
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(String " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		return this;
    }
	/**
	 * Assign typed object MFString value to field, similar to {@link #setValue(String)}.
	 * @param newValue is new value for the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setValue(MFStringObject newValue)
	{
        if ( getType().equals(fieldObject.TYPE_MFSTRING) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            if (newValue != null)
                value += newValue.getPrimitiveValue();
            return this;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFString " + newValue + ") when fieldValue type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
	}
	/**
	 * Assign typed object String[] array value to field, similar to {@link #setValue(String)}.
	 * @param newValue is new value for the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setValue(String[] newValue)
	{
        if ( getType().equals(fieldObject.TYPE_MFSTRING) ||
            (getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
        {
            if (newValue != null)
                setValue (new MFStringObject(newValue));
            return this;
        }
        else
		{
			String errorNotice = "Illegal type: cannot appendValue(MFString " + newValue + ") when fieldValue type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
	}
	/**
	 * Assign typed object SFString value field, similar to {@link #setValue(String)}.
	 * @param newValue is new value for the value field.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public fieldObject setValue(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setValue(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	// no other constructors because field must have name, type, accessType (required)
	/**
	 * Utility constructor that assigns name, type, accessType (required)
	 * @param fieldName name for this field (required, and locally unique among peer fields)
	 * @param fieldType appropriate type value for this field (required)
	 * @param fieldAccessType appropriate accessType value for this field (required)
	 */
	public fieldObject (String fieldName, String fieldType, String fieldAccessType)
	{
		initialize();
		      setName(fieldName);		// apply checks
		      setType(fieldType);		// apply checks
		setAccessType(fieldAccessType);	// apply checks
	}
	/**
	 * Utility constructor that assigns name, type, accessType (required) and default value (if appropriate)
	 * @param fieldName name for this field (required, and locally unique among peer fields)
	 * @param fieldType appropriate type value for this field (required)
	 * @param fieldAccessType appropriate accessType value for this field (required)
	 * @param defaultValue string version of default value for this field (if appropriate)
	 */
	public fieldObject (String fieldName, String fieldType, String fieldAccessType, String defaultValue)
	{
		initialize();
		      setName(fieldName);		// apply checks
		      setType(fieldType);		// apply checks
		setAccessType(fieldAccessType);	// apply checks
		     setValue(defaultValue);	// apply checks
	}

	/**
	 * Indicate whether a node or statement is found in inputOutput MFNode field <i>children</i>.
	 * @return whether a node or statement is found; ignores CommentsBlock.
	 * @see #getChildren()
	 */
	public boolean hasChildrenElements()
	{
		if (children.isEmpty())
			return false; // nothing found
		for (X3DNode node : children)
		{
			if (!(node instanceof CommentsBlock))
				return true;
		}
		return false; // nothing but CommentsBlock found
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
		boolean      hasChild = (!children.isEmpty());

		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<field"); // start opening tag
		if (hasAttributes)
		{
			if (!getName().equals(NAME_DEFAULT_VALUE))
			{
				stringX3D.append(" name='").append(SFStringObject.toString(getName())).append("'");
			}
			
            // test attributes

			if ((!getAccessType().equals(ACCESSTYPE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" accessType='").append(new SFStringObject(getAccessType()).toStringX3D()).append("'");
			}
			if ((!getAppinfo().equals(APPINFO_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" appinfo='").append(new SFStringObject(getAppinfo()).toStringX3D()).append("'");
			}
			if ((!getDocumentation().equals(DOCUMENTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" documentation='").append(new SFStringObject(getDocumentation()).toStringX3D()).append("'");
			}
			if ((!getType().equals(TYPE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" type='").append(new SFStringObject(getType()).toStringX3D()).append("'");
			}
			if ((!getValue().equals(VALUE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" value='").append(new SFStringObject(getValue()).toStringX3D()).append("'");
			}
		}
		if ((hasChild)) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
			for (X3DNode element : children)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</field>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=field, isX3dStatement=true, isClassX3dStatement=true, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (!children.isEmpty());
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		// field definition
		stringClassicVRML.append("\n").append(indent).append(indentCharacter).append(indentCharacter).append(accessType).append(" ").append(type).append(" ").append(name);
		if (value.length() > 0)
		{
			stringClassicVRML.append(" ");
			if (getType().equals(fieldObject.TYPE_SFSTRING))
				 stringClassicVRML.append("\"").append(value).append("\"");
			else stringClassicVRML             .append(value);
		}
		if (!getAppinfo().equals(APPINFO_DEFAULT_VALUE) || (!getAppinfo().isEmpty() && !ConfigurationProperties.getStripDefaultAttributes()))
		{
			stringClassicVRML.append(" # [appinfo] ").append("\"").append(SFStringObject.toString(getAppinfo())).append("\"").append("\n").append(indent);
		}
		if (!getDocumentation().equals(DOCUMENTATION_DEFAULT_VALUE) || (!getDocumentation().isEmpty() && !ConfigurationProperties.getStripDefaultAttributes()))
		{
			stringClassicVRML.append("# [documentation] ").append("\"").append(SFStringObject.toString(getDocumentation())).append("\"").append("\n").append(indent);
		}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child elements
			if (children.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("children").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : children)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
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
		if (elementName == null)
			elementName = "";
		if (getName().equals(nameValue) &&
			(elementName.isEmpty() || elementName.equals(getElementName())))
			return this;
		X3DConcreteElement referenceElement;
		for (X3DNode element : children) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
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
		for (X3DNode element : children) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
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

		if (getAccessType().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " accessType field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setAccessType(getAccessType()); // exercise field checks, simple types
        
		setAppinfo(getAppinfo()); // exercise field checks, simple types
        
		setDocumentation(getDocumentation()); // exercise field checks, simple types
        
		if (getName().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " name field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setName(getName()); // exercise field checks, simple types
        
		if (getType().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " type field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setType(getType()); // exercise field checks, simple types
        
		if (!hasChildren()) // be careful! only check simple types if no children nodes found
			setValue(getValue()); // exercise field checks, simple types
        
		for (X3DNode element : children) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setChildren(getChildren()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		return validationResult.toString();
	}

	/**
	 * If type matches, then get typed value of a SFBool field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFBoolObject getValueSFBool()
	{
		if (getType().equals(fieldObject.TYPE_SFBOOL))
		{
			if (valueArrayBoolean.length == 0)
			{
				return new SFBoolObject();
			}
			else if (valueArrayBoolean.length == 1)
			{
				return new SFBoolObject(valueArrayBoolean[0]);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFBool() singleton method when field value='" +
									 valueArrayBoolean + "' has length=" + valueArrayBoolean.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFBool() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFBool field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFBoolObject newValue)
	{
		clearValues();
		valueArrayBoolean = new boolean[1]; // fix array size
		valueArrayBoolean[0] = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFBoolObject getValueMFBool()
	{
		if (getType().equals(fieldObject.TYPE_MFBOOL))
		{
			return new MFBoolObject(valueArrayBoolean);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFBool() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFBool field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFBoolObject newValue)
	{
		clearValues();
		valueArrayBoolean = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFColor field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFColorObject getValueSFColor()
	{
		if (getType().equals(fieldObject.TYPE_SFCOLOR))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFColorObject();
			}
			else if (valueArrayFloat.length == 3)
			{
				return new SFColorObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFColor() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFColor() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFColor field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFColorObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFColorObject getValueMFColor()
	{
		if (getType().equals(fieldObject.TYPE_MFCOLOR))
		{
			return new MFColorObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFColor() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFColor field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFColorObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFColorRGBA field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFColorRGBAObject getValueSFColorRGBA()
	{
		if (getType().equals(fieldObject.TYPE_SFCOLORRGBA))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFColorRGBAObject();
			}
			else if (valueArrayFloat.length == 4)
			{
				return new SFColorRGBAObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFColorRGBA() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFColorRGBA() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFColorRGBA field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFColorRGBAObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFColorRGBAObject getValueMFColorRGBA()
	{
		if (getType().equals(fieldObject.TYPE_MFCOLORRGBA))
		{
			return new MFColorRGBAObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFColorRGBA() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFColorRGBA field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFColorRGBAObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFDouble field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFDoubleObject getValueSFDouble()
	{
		if (getType().equals(fieldObject.TYPE_SFDOUBLE))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFDoubleObject();
			}
			else if (valueArrayDouble.length == 1)
			{
				return new SFDoubleObject(valueArrayDouble[0]);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFDouble() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFDouble() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFDouble field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFDoubleObject newValue)
	{
		clearValues();
		valueArrayDouble = new double[1]; // fix array size
		valueArrayDouble[0] = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFDoubleObject getValueMFDouble()
	{
		if (getType().equals(fieldObject.TYPE_MFDOUBLE))
		{
			return new MFDoubleObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFDouble() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFDouble field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFDoubleObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFFloat field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFFloatObject getValueSFFloat()
	{
		if (getType().equals(fieldObject.TYPE_SFFLOAT))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFFloatObject();
			}
			else if (valueArrayFloat.length == 1)
			{
				return new SFFloatObject(valueArrayFloat[0]);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFFloat() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFFloat() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFFloat field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFFloatObject newValue)
	{
		clearValues();
		valueArrayFloat = new float[1]; // fix array size
		valueArrayFloat[0] = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFFloatObject getValueMFFloat()
	{
		if (getType().equals(fieldObject.TYPE_MFFLOAT))
		{
			return new MFFloatObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFFloat() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFFloat field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFFloatObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFImage field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFImageObject getValueSFImage()
	{
		if (getType().equals(fieldObject.TYPE_SFIMAGE))
		{
			if (valueArrayInteger.length == 0)
			{
				return new SFImageObject();
			}
			else if (valueArrayInteger.length == 1)
			{
				return new SFImageObject(valueArrayInteger);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFImage() singleton method when field value='" +
									 valueArrayInteger + "' has length=" + valueArrayInteger.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFImage() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFImage field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFImageObject newValue)
	{
		clearValues();
		valueArrayInteger = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFImageObject getValueMFImage()
	{
		if (getType().equals(fieldObject.TYPE_MFIMAGE))
		{
			return new MFImageObject(valueArrayInteger);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFImage() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFImage field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFImageObject newValue)
	{
		clearValues();
		valueArrayInteger = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFInt32 field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFInt32Object getValueSFInt32()
	{
		if (getType().equals(fieldObject.TYPE_SFINT32))
		{
			if (valueArrayInteger.length == 0)
			{
				return new SFInt32Object();
			}
			else if (valueArrayInteger.length == 1)
			{
				return new SFInt32Object(valueArrayInteger[0]);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFInt32() singleton method when field value='" +
									 valueArrayInteger + "' has length=" + valueArrayInteger.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFInt32() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFInt32 field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFInt32Object newValue)
	{
		clearValues();
		valueArrayInteger = new int[1]; // fix array size
		valueArrayInteger[0] = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFInt32Object getValueMFInt32()
	{
		if (getType().equals(fieldObject.TYPE_MFINT32))
		{
			return new MFInt32Object(valueArrayInteger);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFInt32() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFInt32 field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFInt32Object newValue)
	{
		clearValues();
		valueArrayInteger = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFMatrix3d field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFMatrix3dObject getValueSFMatrix3d()
	{
		if (getType().equals(fieldObject.TYPE_SFMATRIX3D))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFMatrix3dObject();
			}
			else if (valueArrayDouble.length == 9)
			{
				return new SFMatrix3dObject(valueArrayDouble);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFMatrix3d() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFMatrix3d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFMatrix3d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFMatrix3dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFMatrix3dObject getValueMFMatrix3d()
	{
		if (getType().equals(fieldObject.TYPE_MFMATRIX3D))
		{
			return new MFMatrix3dObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFMatrix3d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFMatrix3d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFMatrix3dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFMatrix3f field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFMatrix3fObject getValueSFMatrix3f()
	{
		if (getType().equals(fieldObject.TYPE_SFMATRIX3F))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFMatrix3fObject();
			}
			else if (valueArrayFloat.length == 9)
			{
				return new SFMatrix3fObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFMatrix3f() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFMatrix3f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFMatrix3f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFMatrix3fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFMatrix3fObject getValueMFMatrix3f()
	{
		if (getType().equals(fieldObject.TYPE_MFMATRIX3F))
		{
			return new MFMatrix3fObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFMatrix3f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFMatrix3f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFMatrix3fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFMatrix4d field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFMatrix4dObject getValueSFMatrix4d()
	{
		if (getType().equals(fieldObject.TYPE_SFMATRIX4D))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFMatrix4dObject();
			}
			else if (valueArrayDouble.length == 16)
			{
				return new SFMatrix4dObject(valueArrayDouble);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFMatrix4d() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFMatrix4d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFMatrix4d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFMatrix4dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFMatrix4dObject getValueMFMatrix4d()
	{
		if (getType().equals(fieldObject.TYPE_MFMATRIX4D))
		{
			return new MFMatrix4dObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFMatrix4d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFMatrix4d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFMatrix4dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFMatrix4f field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFMatrix4fObject getValueSFMatrix4f()
	{
		if (getType().equals(fieldObject.TYPE_SFMATRIX4F))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFMatrix4fObject();
			}
			else if (valueArrayFloat.length == 16)
			{
				return new SFMatrix4fObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFMatrix4f() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFMatrix4f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFMatrix4f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFMatrix4fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFMatrix4fObject getValueMFMatrix4f()
	{
		if (getType().equals(fieldObject.TYPE_MFMATRIX4F))
		{
			return new MFMatrix4fObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFMatrix4f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFMatrix4f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFMatrix4fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFRotation field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFRotationObject getValueSFRotation()
	{
		if (getType().equals(fieldObject.TYPE_SFROTATION))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFRotationObject();
			}
			else if (valueArrayFloat.length == 4)
			{
				return new SFRotationObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFRotation() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFRotation() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFRotation field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFRotationObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFRotationObject getValueMFRotation()
	{
		if (getType().equals(fieldObject.TYPE_MFROTATION))
		{
			return new MFRotationObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFRotation() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFRotation field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFRotationObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFString field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFStringObject getValueSFString()
	{
		if (getType().equals(fieldObject.TYPE_SFSTRING))
		{
			if (value.isEmpty())
			{
				return new SFStringObject();
			}
			else
			{
				return new SFStringObject(value);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValue() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFStringObject getValueMFString()
	{
		if (getType().equals(fieldObject.TYPE_MFSTRING))
		{
			return new MFStringObject(value);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValue() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * If type matches, then get typed value of a SFTime field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFTimeObject getValueSFTime()
	{
		if (getType().equals(fieldObject.TYPE_SFTIME))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFTimeObject();
			}
			else if (valueArrayDouble.length == 1)
			{
				return new SFTimeObject(valueArrayDouble[0]);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFTime() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFTime() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFTime field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFTimeObject newValue)
	{
		clearValues();
		valueArrayDouble = new double[1]; // fix array size
		valueArrayDouble[0] = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFTimeObject getValueMFTime()
	{
		if (getType().equals(fieldObject.TYPE_MFTIME))
		{
			return new MFTimeObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFTime() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFTime field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFTimeObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFVec2d field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFVec2dObject getValueSFVec2d()
	{
		if (getType().equals(fieldObject.TYPE_SFVEC2D))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFVec2dObject();
			}
			else if (valueArrayDouble.length == 2)
			{
				return new SFVec2dObject(valueArrayDouble);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFVec2d() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFVec2d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFVec2d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFVec2dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFVec2dObject getValueMFVec2d()
	{
		if (getType().equals(fieldObject.TYPE_MFVEC2D))
		{
			return new MFVec2dObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFVec2d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFVec2d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFVec2dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFVec2f field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFVec2fObject getValueSFVec2f()
	{
		if (getType().equals(fieldObject.TYPE_SFVEC2F))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFVec2fObject();
			}
			else if (valueArrayFloat.length == 2)
			{
				return new SFVec2fObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFVec2f() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFVec2f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFVec2f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFVec2fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFVec2fObject getValueMFVec2f()
	{
		if (getType().equals(fieldObject.TYPE_MFVEC2F))
		{
			return new MFVec2fObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFVec2f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFVec2f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFVec2fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFVec3d field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFVec3dObject getValueSFVec3d()
	{
		if (getType().equals(fieldObject.TYPE_SFVEC3D))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFVec3dObject();
			}
			else if (valueArrayDouble.length == 3)
			{
				return new SFVec3dObject(valueArrayDouble);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFVec3d() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFVec3d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFVec3d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFVec3dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFVec3dObject getValueMFVec3d()
	{
		if (getType().equals(fieldObject.TYPE_MFVEC3D))
		{
			return new MFVec3dObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFVec3d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFVec3d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFVec3dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFVec3f field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFVec3fObject getValueSFVec3f()
	{
		if (getType().equals(fieldObject.TYPE_SFVEC3F))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFVec3fObject();
			}
			else if (valueArrayFloat.length == 3)
			{
				return new SFVec3fObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFVec3f() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFVec3f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFVec3f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFVec3fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFVec3fObject getValueMFVec3f()
	{
		if (getType().equals(fieldObject.TYPE_MFVEC3F))
		{
			return new MFVec3fObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFVec3f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFVec3f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFVec3fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFVec4d field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFVec4dObject getValueSFVec4d()
	{
		if (getType().equals(fieldObject.TYPE_SFVEC4D))
		{
			if (valueArrayDouble.length == 0)
			{
				return new SFVec4dObject();
			}
			else if (valueArrayDouble.length == 4)
			{
				return new SFVec4dObject(valueArrayDouble);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFVec4d() singleton method when field value='" +
									 valueArrayDouble + "' has length=" + valueArrayDouble.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFVec4d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFVec4d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFVec4dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFVec4dObject getValueMFVec4d()
	{
		if (getType().equals(fieldObject.TYPE_MFVEC4D))
		{
			return new MFVec4dObject(valueArrayDouble);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFVec4d() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFVec4d field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFVec4dObject newValue)
	{
		clearValues();
		valueArrayDouble = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * If type matches, then get typed value of a SFVec4f field declaration.
	 * @return typed value object (if values are available), otherwise returns default object
	 */
	public SFVec4fObject getValueSFVec4f()
	{
		if (getType().equals(fieldObject.TYPE_SFVEC4F))
		{
			if (valueArrayFloat.length == 0)
			{
				return new SFVec4fObject();
			}
			else if (valueArrayFloat.length == 4)
			{
				return new SFVec4fObject(valueArrayFloat);
			}
			else // hopefully this case cannot occur, possible internal library error
			{
				String errorNotice = "Invalid invocation of field.getValueSFVec4f() singleton method when field value='" +
									 valueArrayFloat + "' has length=" + valueArrayFloat.length;
				throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
			}
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueSFVec4f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a SFVec4f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(SFVec4fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Get typed value of this field declaration.
	 * @return typed value object, if values are available
	 */
	public MFVec4fObject getValueMFVec4f()
	{
		if (getType().equals(fieldObject.TYPE_MFVEC4F))
		{
			return new MFVec4fObject(valueArrayFloat);
		}
		else
		{
			String errorNotice = "Invalid invocation of field.getValueMFVec4f() when declared field type='" + getType() + "'";
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
	}

	/**
	 * Set typed value of a MFVec4f field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(MFVec4fObject newValue)
	{
		clearValues();
		valueArrayFloat = newValue.getPrimitiveValue();
		return this;
	}						

	/**
	 * Clear all values in a field declaration.
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject clearValues()
	{
		value = VALUE_DEFAULT_VALUE;
		valueArrayBoolean = java.util.Arrays.copyOf(DEFAULT_VALUE_BOOLEAN, DEFAULT_VALUE_BOOLEAN.length); // must be separate copy
		valueArrayInteger = java.util.Arrays.copyOf(DEFAULT_VALUE_INTEGER, DEFAULT_VALUE_INTEGER.length); // must be separate copy
		valueArrayFloat   = java.util.Arrays.copyOf(DEFAULT_VALUE_FLOAT,   DEFAULT_VALUE_FLOAT.length  ); // must be separate copy
		valueArrayDouble  = java.util.Arrays.copyOf(DEFAULT_VALUE_DOUBLE,  DEFAULT_VALUE_DOUBLE.length ); // must be separate copy
		clearChildren(); // clear all contained children including nodes, statements and comments (if any)
		return this;
	}
	/**
	 * Set typed value of a boolean field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(boolean newValue)
	{
		if (!getType().isEmpty() && 
			!getType().equals(fieldObject.TYPE_SFBOOL) && !getType().equals(fieldObject.TYPE_MFBOOL) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(boolean " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		clearValues();
		valueArrayBoolean = new boolean[1]; // fix array size
		valueArrayBoolean[0] = newValue;
		return this;
	}
	/**
	 * Set typed value of a boolean[] field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(boolean[] newValue)
	{
		if (!getType().isEmpty() && 
			!getType().equals(fieldObject.TYPE_SFBOOL) && !getType().equals(fieldObject.TYPE_MFBOOL) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(boolean[] " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		clearValues();
		if (newValue == null)
		{
			return this; // nothing to do
		}
		valueArrayBoolean = newValue;
		return this;
	}
	/**
	 * Set typed value of a integer field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(int newValue)
	{
		// type promotion first
		if (getType().equals(fieldObject.TYPE_SFDOUBLE)  || getType().equals(fieldObject.TYPE_MFDOUBLE) ||
            getType().equals(fieldObject.TYPE_SFTIME)    || getType().equals(fieldObject.TYPE_MFTIME))
		{
            clearValues();
            valueArrayDouble = new double[1]; // fix array size
            valueArrayDouble[0] = (double) newValue;
            return this;
        }
		if (!getType().isEmpty() &&
			getType().equals(fieldObject.TYPE_SFFLOAT)   || getType().equals(fieldObject.TYPE_MFFLOAT))
		{
            clearValues();
            valueArrayFloat = new float[1]; // fix array size
            valueArrayFloat[0] = (float) newValue;
            return this;
        }
		if (!getType().equals(fieldObject.TYPE_SFINT32) && !getType().equals(fieldObject.TYPE_MFINT32) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(int " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		clearValues();
		valueArrayInteger = new int[1]; // fix array size
		valueArrayInteger[0] = newValue;
		return this;
	}
	/**
	 * Set typed value of a integer array field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(int[] newValue)
	{
		if (!getType().isEmpty() &&
			!getType().equals(fieldObject.TYPE_SFINT32) && !getType().equals(fieldObject.TYPE_MFINT32) &&
			!getType().equals(fieldObject.TYPE_SFIMAGE) && !getType().equals(fieldObject.TYPE_MFIMAGE) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(int[] " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		clearValues();
		if (newValue == null)
		{
			return this; // nothing to do
		}
		valueArrayInteger = newValue;
		return this;
	}
	/**
	 * Set typed value of a float field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(float newValue)
	{
		// type promotion first
		if (getType().equals(fieldObject.TYPE_SFDOUBLE)  || getType().equals(fieldObject.TYPE_MFDOUBLE) ||
            getType().equals(fieldObject.TYPE_SFTIME)    || getType().equals(fieldObject.TYPE_MFTIME))
		{
            clearValues();
            valueArrayDouble = new double[1]; // fix array size
            valueArrayDouble[0] = (double) newValue;
            return this;
        }
		if (!getType().isEmpty() &&
			!getType().equals(fieldObject.TYPE_SFFLOAT)    && !getType().equals(fieldObject.TYPE_MFFLOAT) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(float " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		clearValues();
        valueArrayFloat = new float[1]; // fix array size
        valueArrayFloat[0] = newValue;
		return this;
	}
	/**
	 * Set typed value of a float[] array field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(float[] newValue)
	{
		if (!getType().isEmpty() && 
			!getType().equals(fieldObject.TYPE_SFCOLOR)    && !getType().equals(fieldObject.TYPE_MFCOLOR) &&
			!getType().equals(fieldObject.TYPE_SFCOLORRGBA)&& !getType().equals(fieldObject.TYPE_MFCOLORRGBA) &&
			!getType().equals(fieldObject.TYPE_SFFLOAT)    && !getType().equals(fieldObject.TYPE_MFFLOAT) &&
			!getType().equals(fieldObject.TYPE_SFROTATION) && !getType().equals(fieldObject.TYPE_MFROTATION) &&
			!getType().equals(fieldObject.TYPE_SFTIME)     && !getType().equals(fieldObject.TYPE_MFTIME) &&
			!getType().equals(fieldObject.TYPE_SFVEC2F)    && !getType().equals(fieldObject.TYPE_MFVEC2F) &&
			!getType().equals(fieldObject.TYPE_SFVEC3F)    && !getType().equals(fieldObject.TYPE_MFVEC3F) &&
			!getType().equals(fieldObject.TYPE_SFVEC4F)    && !getType().equals(fieldObject.TYPE_MFVEC4F) &&
			!getType().equals(fieldObject.TYPE_SFMATRIX3F) && !getType().equals(fieldObject.TYPE_MFMATRIX3F) &&
			!getType().equals(fieldObject.TYPE_SFMATRIX4F) && !getType().equals(fieldObject.TYPE_MFMATRIX4F) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(float[] " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}									
		if ((getType() != ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) &&
            (newValue.length % X3DConcreteField.getTupleSize(getType())) != 0) // tupleSize modulus check
		{
			String errorNotice = "illegal number of values (" + newValue.length + ")" +
				" in initialization string, must be multiple of " + X3DConcreteField.getTupleSize(getType());
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}			
		clearValues();
		if (newValue == null)
		{
			return this; // nothing to do
		}
		valueArrayFloat = newValue;
		return this;
	}
	/**
	 * Set typed value of a double field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(double newValue)
	{
		if (!getType().isEmpty() && 
			!getType().equals(fieldObject.TYPE_SFDOUBLE)   && !getType().equals(fieldObject.TYPE_MFDOUBLE) &&
			!getType().equals(fieldObject.TYPE_SFTIME)     && !getType().equals(fieldObject.TYPE_MFTIME) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(double " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		clearValues();
        valueArrayDouble = new double[1]; // fix array size
        valueArrayDouble[0] = newValue;
		return this;
	}
	/**
	 * Set typed value of a double[] array field declaration.
	 * <i>WARNING</i>: must first <i>setType()</i> in ancestor <i>fieldObject</i> declaration to ensure validity of the proper corresponding X3D type.
	 * @param newValue is new value to assign
	 * @return {@link fieldObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public fieldObject setValue(double[] newValue)
	{
		if (!getType().isEmpty() && 
			!getType().equals(fieldObject.TYPE_SFDOUBLE)   && !getType().equals(fieldObject.TYPE_MFDOUBLE)   &&
			!getType().equals(fieldObject.TYPE_SFTIME)     && !getType().equals(fieldObject.TYPE_MFTIME)     &&
			!getType().equals(fieldObject.TYPE_SFVEC2D)    && !getType().equals(fieldObject.TYPE_MFVEC2D)    &&
			!getType().equals(fieldObject.TYPE_SFVEC3D)    && !getType().equals(fieldObject.TYPE_MFVEC3D)    &&
			!getType().equals(fieldObject.TYPE_SFVEC4D)    && !getType().equals(fieldObject.TYPE_MFVEC4D)    &&
			!getType().equals(fieldObject.TYPE_SFMATRIX3D) && !getType().equals(fieldObject.TYPE_MFMATRIX3D) &&
			!getType().equals(fieldObject.TYPE_SFMATRIX4D) && !getType().equals(fieldObject.TYPE_MFMATRIX4D) &&
            !(getType().equals(ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) && ConfigurationProperties.isCreationConnectionValidationExceptionAllowed()))
		{
			String errorNotice = "Illegal type: cannot setValue(double[] " + newValue + ") when field type='" + getType() + "'";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		if ((getType() != ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE) &&
            (newValue.length % X3DConcreteField.getTupleSize(getType())) != 0) // tupleSize modulus check
		{
			String errorNotice = "illegal number of values (" + newValue.length + ")" +
				" in initialization string, must be multiple of " + X3DConcreteField.getTupleSize(getType());
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		clearValues();
		if (newValue == null)
		{
			return this; // nothing to do
		}
		valueArrayDouble = newValue;
		return this;
	}
}
