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

package org.web3d.x3d.jsail.Shape;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Shape.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Shape.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * TwoSidedMaterial specifies surface rendering properties for associated geometry nodes, for outer (front) and inner (back) sides of polygons.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DMaterialNode] TwoSidedMaterial specifies surface rendering properties for associated geometry nodes, for outer (front) and inner (back) sides of polygons. Material attributes are used by the X3D lighting equations during rendering.
 * <ul>
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Shape' level='4'/&amp;gt; </li> 
 *  <li> <i>Hint:</i> insert Shape and Appearance nodes before adding material. </li> 
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes in a scene. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 *  <li> <i>Warning:</i> corresponding geometry within the parent Shape must have solid='false' for two-sided rendering, otherwise no reverse-side back geometry is displayed. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 12.2.3 Two-sided materials <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#TwoSidedMaterials" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#TwoSidedMaterials</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 17.2.2 Lighting model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel</a> </li> 
 * </ul>
 * <br>
 * Note that {@linkplain SFColorObject#ALICEBLUE SFColorObject} provides a variety of color constants.
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Material" target="blank">X3D Abstract Specification: TwoSidedMaterial</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TwoSidedMaterial" target="_blank">X3D Tooltips: TwoSidedMaterial</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class TwoSidedMaterialObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Shape.TwoSidedMaterial
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=ambientIntensity, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=ambientIntensity, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float ambientIntensity; // SFFloat

 /* @name=backAmbientIntensity, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=backAmbientIntensity, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float backAmbientIntensity; // SFFloat

 /* @name=backDiffuseColor, @type=SFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=backDiffuseColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] backDiffuseColor; // SFColor

 /* @name=backEmissiveColor, @type=SFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=backEmissiveColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] backEmissiveColor; // SFColor

 /* @name=backShininess, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=backShininess, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float backShininess; // SFFloat

 /* @name=backSpecularColor, @type=SFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=backSpecularColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] backSpecularColor; // SFColor

 /* @name=backTransparency, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=backTransparency, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float backTransparency; // SFFloat

 /* @name=diffuseColor, @type=SFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=diffuseColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] diffuseColor; // SFColor

 /* @name=emissiveColor, @type=SFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=emissiveColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] emissiveColor; // SFColor

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=separateBackColor, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=separateBackColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean separateBackColor; // SFBool

 /* @name=shininess, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=shininess, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float shininess; // SFFloat

 /* @name=specularColor, @type=SFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=specularColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] specularColor; // SFColor

 /* @name=transparency, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=transparency, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float transparency; // SFFloat

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>TwoSidedMaterial</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "TwoSidedMaterial";

	/** Provides name of this element: <i>TwoSidedMaterial</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>TwoSidedMaterial</i> element: <i>Shape</i> */
	public static final String COMPONENT = "Shape";

	/** Defines X3D component for the <i>TwoSidedMaterial</i> element: <i>Shape</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Shape</i> component level for this element: <i>4</i> */
	public static final int LEVEL = 4;

	/** Provides default X3D component level for this element: <i>4</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFFloat field named <i>ambientIntensity</i> has default value <i>0.2f</i> (Java syntax) or <i>0.2</i> (XML syntax). */
	public static final float AMBIENTINTENSITY_DEFAULT_VALUE = 0.2f;

	/** SFFloat field named <i>backAmbientIntensity</i> has default value <i>0.2f</i> (Java syntax) or <i>0.2</i> (XML syntax). */
	public static final float BACKAMBIENTINTENSITY_DEFAULT_VALUE = 0.2f;

	/** SFColor field named <i>backDiffuseColor</i> has default value <i>{0.8f,0.8f,0.8f}</i> (Java syntax) or <i>0.8 0.8 0.8</i> (XML syntax). */
	public static final float[] BACKDIFFUSECOLOR_DEFAULT_VALUE = {0.8f,0.8f,0.8f};

	/** SFColor field named <i>backEmissiveColor</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BACKEMISSIVECOLOR_DEFAULT_VALUE = {0f,0f,0f};

	/** SFFloat field named <i>backShininess</i> has default value <i>0.2f</i> (Java syntax) or <i>0.2</i> (XML syntax). */
	public static final float BACKSHININESS_DEFAULT_VALUE = 0.2f;

	/** SFColor field named <i>backSpecularColor</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BACKSPECULARCOLOR_DEFAULT_VALUE = {0f,0f,0f};

	/** SFFloat field named <i>backTransparency</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float BACKTRANSPARENCY_DEFAULT_VALUE = 0f;

	/** SFColor field named <i>diffuseColor</i> has default value <i>{0.8f,0.8f,0.8f}</i> (Java syntax) or <i>0.8 0.8 0.8</i> (XML syntax). */
	public static final float[] DIFFUSECOLOR_DEFAULT_VALUE = {0.8f,0.8f,0.8f};

	/** SFColor field named <i>emissiveColor</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] EMISSIVECOLOR_DEFAULT_VALUE = {0f,0f,0f};

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFBool field named <i>separateBackColor</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean SEPARATEBACKCOLOR_DEFAULT_VALUE = false;

	/** SFFloat field named <i>shininess</i> has default value <i>0.2f</i> (Java syntax) or <i>0.2</i> (XML syntax). */
	public static final float SHININESS_DEFAULT_VALUE = 0.2f;

	/** SFColor field named <i>specularColor</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] SPECULARCOLOR_DEFAULT_VALUE = {0f,0f,0f};

	/** SFFloat field named <i>transparency</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float TRANSPARENCY_DEFAULT_VALUE = 0f;

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
			case "ambientIntensity":
				result = "SFFloat";
				break;
			case "backAmbientIntensity":
				result = "SFFloat";
				break;
			case "backDiffuseColor":
				result = "SFColor";
				break;
			case "backEmissiveColor":
				result = "SFColor";
				break;
			case "backShininess":
				result = "SFFloat";
				break;
			case "backSpecularColor":
				result = "SFColor";
				break;
			case "backTransparency":
				result = "SFFloat";
				break;
			case "diffuseColor":
				result = "SFColor";
				break;
			case "emissiveColor":
				result = "SFColor";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "separateBackColor":
				result = "SFBool";
				break;
			case "shininess":
				result = "SFFloat";
				break;
			case "specularColor":
				result = "SFColor";
				break;
			case "transparency":
				result = "SFFloat";
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
			case "ambientIntensity":
				result = "inputOutput";
				break;
			case "backAmbientIntensity":
				result = "inputOutput";
				break;
			case "backDiffuseColor":
				result = "inputOutput";
				break;
			case "backEmissiveColor":
				result = "inputOutput";
				break;
			case "backShininess":
				result = "inputOutput";
				break;
			case "backSpecularColor":
				result = "inputOutput";
				break;
			case "backTransparency":
				result = "inputOutput";
				break;
			case "diffuseColor":
				result = "inputOutput";
				break;
			case "emissiveColor":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "separateBackColor":
				result = "inputOutput";
				break;
			case "shininess":
				result = "inputOutput";
				break;
			case "specularColor":
				result = "inputOutput";
				break;
			case "transparency":
				result = "inputOutput";
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
	public static final String containerField_DEFAULT_VALUE = "material"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFFloat field named <i>ambientIntensity</i>. */
	public static final String fromField_AMBIENTINTENSITY = "ambientIntensity";

	/** toField ROUTE name for SFFloat field named <i>ambientIntensity</i>. */
	public static final String toField_AMBIENTINTENSITY = "ambientIntensity";

	/** fromField ROUTE name for SFFloat field named <i>backAmbientIntensity</i>. */
	public static final String fromField_BACKAMBIENTINTENSITY = "backAmbientIntensity";

	/** toField ROUTE name for SFFloat field named <i>backAmbientIntensity</i>. */
	public static final String toField_BACKAMBIENTINTENSITY = "backAmbientIntensity";

	/** fromField ROUTE name for SFColor field named <i>backDiffuseColor</i>. */
	public static final String fromField_BACKDIFFUSECOLOR = "backDiffuseColor";

	/** toField ROUTE name for SFColor field named <i>backDiffuseColor</i>. */
	public static final String toField_BACKDIFFUSECOLOR = "backDiffuseColor";

	/** fromField ROUTE name for SFColor field named <i>backEmissiveColor</i>. */
	public static final String fromField_BACKEMISSIVECOLOR = "backEmissiveColor";

	/** toField ROUTE name for SFColor field named <i>backEmissiveColor</i>. */
	public static final String toField_BACKEMISSIVECOLOR = "backEmissiveColor";

	/** fromField ROUTE name for SFFloat field named <i>backShininess</i>. */
	public static final String fromField_BACKSHININESS = "backShininess";

	/** toField ROUTE name for SFFloat field named <i>backShininess</i>. */
	public static final String toField_BACKSHININESS = "backShininess";

	/** fromField ROUTE name for SFColor field named <i>backSpecularColor</i>. */
	public static final String fromField_BACKSPECULARCOLOR = "backSpecularColor";

	/** toField ROUTE name for SFColor field named <i>backSpecularColor</i>. */
	public static final String toField_BACKSPECULARCOLOR = "backSpecularColor";

	/** fromField ROUTE name for SFFloat field named <i>backTransparency</i>. */
	public static final String fromField_BACKTRANSPARENCY = "backTransparency";

	/** toField ROUTE name for SFFloat field named <i>backTransparency</i>. */
	public static final String toField_BACKTRANSPARENCY = "backTransparency";

	/** fromField ROUTE name for SFColor field named <i>diffuseColor</i>. */
	public static final String fromField_DIFFUSECOLOR = "diffuseColor";

	/** toField ROUTE name for SFColor field named <i>diffuseColor</i>. */
	public static final String toField_DIFFUSECOLOR = "diffuseColor";

	/** fromField ROUTE name for SFColor field named <i>emissiveColor</i>. */
	public static final String fromField_EMISSIVECOLOR = "emissiveColor";

	/** toField ROUTE name for SFColor field named <i>emissiveColor</i>. */
	public static final String toField_EMISSIVECOLOR = "emissiveColor";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFBool field named <i>separateBackColor</i>. */
	public static final String fromField_SEPARATEBACKCOLOR = "separateBackColor";

	/** toField ROUTE name for SFBool field named <i>separateBackColor</i>. */
	public static final String toField_SEPARATEBACKCOLOR = "separateBackColor";

	/** fromField ROUTE name for SFFloat field named <i>shininess</i>. */
	public static final String fromField_SHININESS = "shininess";

	/** toField ROUTE name for SFFloat field named <i>shininess</i>. */
	public static final String toField_SHININESS = "shininess";

	/** fromField ROUTE name for SFColor field named <i>specularColor</i>. */
	public static final String fromField_SPECULARCOLOR = "specularColor";

	/** toField ROUTE name for SFColor field named <i>specularColor</i>. */
	public static final String toField_SPECULARCOLOR = "specularColor";

	/** fromField ROUTE name for SFFloat field named <i>transparency</i>. */
	public static final String fromField_TRANSPARENCY = "transparency";

	/** toField ROUTE name for SFFloat field named <i>transparency</i>. */
	public static final String toField_TRANSPARENCY = "transparency";

	/** Constructor for TwoSidedMaterialObject to initialize member variables with default values. */
	public TwoSidedMaterialObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "material" }; // type xs:NMTOKEN

		ambientIntensity = AMBIENTINTENSITY_DEFAULT_VALUE;
		backAmbientIntensity = BACKAMBIENTINTENSITY_DEFAULT_VALUE;
		backDiffuseColor = BACKDIFFUSECOLOR_DEFAULT_VALUE;
		backEmissiveColor = BACKEMISSIVECOLOR_DEFAULT_VALUE;
		backShininess = BACKSHININESS_DEFAULT_VALUE;
		backSpecularColor = BACKSPECULARCOLOR_DEFAULT_VALUE;
		backTransparency = BACKTRANSPARENCY_DEFAULT_VALUE;
		diffuseColor = DIFFUSECOLOR_DEFAULT_VALUE;
		emissiveColor = EMISSIVECOLOR_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		separateBackColor = SEPARATEBACKCOLOR_DEFAULT_VALUE;
		shininess = SHININESS_DEFAULT_VALUE;
		specularColor = SPECULARCOLOR_DEFAULT_VALUE;
		transparency = TRANSPARENCY_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>ambientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of ambientIntensity field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float getAmbientIntensity()
	{
		return ambientIntensity;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>ambientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the ambientIntensity field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setAmbientIntensity(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial ambientIntensity newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial ambientIntensity newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		ambientIntensity = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat ambientIntensity field, similar to {@link #setAmbientIntensity(float)}.
	 * @param newValue is new value for the ambientIntensity field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setAmbientIntensity(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAmbientIntensity(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setAmbientIntensity(float)}.
	 * @param newValue is new value for field
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setAmbientIntensity(double newValue)
	{
		return setAmbientIntensity((float) newValue);
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>backAmbientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of backAmbientIntensity field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float getBackAmbientIntensity()
	{
		return backAmbientIntensity;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>backAmbientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the backAmbientIntensity field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setBackAmbientIntensity(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backAmbientIntensity newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backAmbientIntensity newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		backAmbientIntensity = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat backAmbientIntensity field, similar to {@link #setBackAmbientIntensity(float)}.
	 * @param newValue is new value for the backAmbientIntensity field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackAmbientIntensity(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBackAmbientIntensity(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setBackAmbientIntensity(float)}.
	 * @param newValue is new value for field
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackAmbientIntensity(double newValue)
	{
		return setBackAmbientIntensity((float) newValue);
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>backDiffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @return value of backDiffuseColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBackDiffuseColor()
	{
		return backDiffuseColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>backDiffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @param newValue is new value for the backDiffuseColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setBackDiffuseColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backDiffuseColor newValue=" + SFColorObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backDiffuseColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backDiffuseColor newValue=" + SFColorObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		backDiffuseColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColor backDiffuseColor field, similar to {@link #setBackDiffuseColor(float[])}.
	 * @param newValue is new value for the backDiffuseColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackDiffuseColor(SFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBackDiffuseColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColor backDiffuseColor field, similar to {@link #setBackDiffuseColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component

	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackDiffuseColor(float red, float green, float blue)
	{
		setBackDiffuseColor(new float[] {red, green, blue});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBackDiffuseColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackDiffuseColor(double red, double green, double blue)
	{
		return setBackDiffuseColor((float) red, (float) green, (float) blue);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBackDiffuseColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackDiffuseColor(double[] newArray)
	{
		return setBackDiffuseColor(new SFColorObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>backEmissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @return value of backEmissiveColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBackEmissiveColor()
	{
		return backEmissiveColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>backEmissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @param newValue is new value for the backEmissiveColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setBackEmissiveColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backEmissiveColor newValue=" + SFColorObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backEmissiveColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backEmissiveColor newValue=" + SFColorObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		backEmissiveColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColor backEmissiveColor field, similar to {@link #setBackEmissiveColor(float[])}.
	 * @param newValue is new value for the backEmissiveColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackEmissiveColor(SFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBackEmissiveColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColor backEmissiveColor field, similar to {@link #setBackEmissiveColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component

	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackEmissiveColor(float red, float green, float blue)
	{
		setBackEmissiveColor(new float[] {red, green, blue});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBackEmissiveColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackEmissiveColor(double red, double green, double blue)
	{
		return setBackEmissiveColor((float) red, (float) green, (float) blue);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBackEmissiveColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackEmissiveColor(double[] newArray)
	{
		return setBackEmissiveColor(new SFColorObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>backShininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of backShininess field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float getBackShininess()
	{
		return backShininess;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>backShininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the backShininess field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setBackShininess(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backShininess newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backShininess newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		backShininess = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat backShininess field, similar to {@link #setBackShininess(float)}.
	 * @param newValue is new value for the backShininess field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackShininess(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBackShininess(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setBackShininess(float)}.
	 * @param newValue is new value for field
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackShininess(double newValue)
	{
		return setBackShininess((float) newValue);
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>backSpecularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of backSpecularColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBackSpecularColor()
	{
		return backSpecularColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>backSpecularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the backSpecularColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setBackSpecularColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backSpecularColor newValue=" + SFColorObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backSpecularColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backSpecularColor newValue=" + SFColorObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		backSpecularColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColor backSpecularColor field, similar to {@link #setBackSpecularColor(float[])}.
	 * @param newValue is new value for the backSpecularColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackSpecularColor(SFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBackSpecularColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColor backSpecularColor field, similar to {@link #setBackSpecularColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component

	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackSpecularColor(float red, float green, float blue)
	{
		setBackSpecularColor(new float[] {red, green, blue});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBackSpecularColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackSpecularColor(double red, double green, double blue)
	{
		return setBackSpecularColor((float) red, (float) green, (float) blue);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBackSpecularColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackSpecularColor(double[] newArray)
	{
		return setBackSpecularColor(new SFColorObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>backTransparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @return value of backTransparency field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float getBackTransparency()
	{
		return backTransparency;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>backTransparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @param newValue is new value for the backTransparency field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setBackTransparency(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backTransparency newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial backTransparency newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		backTransparency = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat backTransparency field, similar to {@link #setBackTransparency(float)}.
	 * @param newValue is new value for the backTransparency field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackTransparency(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBackTransparency(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setBackTransparency(float)}.
	 * @param newValue is new value for field
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setBackTransparency(double newValue)
	{
		return setBackTransparency((float) newValue);
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>diffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @return value of diffuseColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getDiffuseColor()
	{
		return diffuseColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>diffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @param newValue is new value for the diffuseColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setDiffuseColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial diffuseColor newValue=" + SFColorObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial diffuseColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial diffuseColor newValue=" + SFColorObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		diffuseColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColor diffuseColor field, similar to {@link #setDiffuseColor(float[])}.
	 * @param newValue is new value for the diffuseColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setDiffuseColor(SFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDiffuseColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColor diffuseColor field, similar to {@link #setDiffuseColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component

	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setDiffuseColor(float red, float green, float blue)
	{
		setDiffuseColor(new float[] {red, green, blue});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setDiffuseColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setDiffuseColor(double red, double green, double blue)
	{
		return setDiffuseColor((float) red, (float) green, (float) blue);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setDiffuseColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setDiffuseColor(double[] newArray)
	{
		return setDiffuseColor(new SFColorObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>emissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @return value of emissiveColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getEmissiveColor()
	{
		return emissiveColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>emissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @param newValue is new value for the emissiveColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setEmissiveColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial emissiveColor newValue=" + SFColorObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial emissiveColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial emissiveColor newValue=" + SFColorObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		emissiveColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColor emissiveColor field, similar to {@link #setEmissiveColor(float[])}.
	 * @param newValue is new value for the emissiveColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setEmissiveColor(SFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEmissiveColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColor emissiveColor field, similar to {@link #setEmissiveColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component

	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setEmissiveColor(float red, float green, float blue)
	{
		setEmissiveColor(new float[] {red, green, blue});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setEmissiveColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setEmissiveColor(double red, double green, double blue)
	{
		return setEmissiveColor((float) red, (float) green, (float) blue);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setEmissiveColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setEmissiveColor(double[] newArray)
	{
		return setEmissiveColor(new SFColorObject(newArray));
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setIS(ISObject newValue)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TwoSidedMaterialObject clearIS()
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TwoSidedMaterialObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide boolean value from inputOutput SFBool field named <i>separateBackColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separateBackColor determines whether separate Material values are used for back faces.
 * <ul>
 *  <li> <i> Warning:</i>  backface Material values are ignored unless you set separateBackColor='true'. </li> 
 * </ul>
	 * @return value of separateBackColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getSeparateBackColor()
	{
		return separateBackColor;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>separateBackColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separateBackColor determines whether separate Material values are used for back faces.
 * <ul>
 *  <li> <i> Warning:</i>  backface Material values are ignored unless you set separateBackColor='true'. </li> 
 * </ul>
	 * @param newValue is new value for the separateBackColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setSeparateBackColor(boolean newValue)
	{
		// set-newValue-validity-checks #0
		separateBackColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool separateBackColor field, similar to {@link #setSeparateBackColor(boolean)}.
	 * @param newValue is new value for the separateBackColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setSeparateBackColor(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSeparateBackColor(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>shininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of shininess field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float getShininess()
	{
		return shininess;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>shininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the shininess field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setShininess(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial shininess newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial shininess newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		shininess = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat shininess field, similar to {@link #setShininess(float)}.
	 * @param newValue is new value for the shininess field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setShininess(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setShininess(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setShininess(float)}.
	 * @param newValue is new value for field
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setShininess(double newValue)
	{
		return setShininess((float) newValue);
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>specularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of specularColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSpecularColor()
	{
		return specularColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>specularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the specularColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setSpecularColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial specularColor newValue=" + SFColorObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial specularColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial specularColor newValue=" + SFColorObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		specularColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColor specularColor field, similar to {@link #setSpecularColor(float[])}.
	 * @param newValue is new value for the specularColor field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setSpecularColor(SFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSpecularColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColor specularColor field, similar to {@link #setSpecularColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component

	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setSpecularColor(float red, float green, float blue)
	{
		setSpecularColor(new float[] {red, green, blue});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setSpecularColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setSpecularColor(double red, double green, double blue)
	{
		return setSpecularColor((float) red, (float) green, (float) blue);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setSpecularColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setSpecularColor(double[] newArray)
	{
		return setSpecularColor(new SFColorObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @return value of transparency field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	@Override
	public float getTransparency()
	{
		return transparency;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @param newValue is new value for the transparency field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterialObject setTransparency(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial transparency newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial transparency newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		transparency = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat transparency field, similar to {@link #setTransparency(float)}.
	 * @param newValue is new value for the transparency field.
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setTransparency(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTransparency(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setTransparency(float)}.
	 * @param newValue is new value for field
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setTransparency(double newValue)
	{
		return setTransparency((float) newValue);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TwoSidedMaterialObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to TwoSidedMaterial DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial DEF newValue='" + newValue + "'" + 
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TwoSidedMaterialObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to TwoSidedMaterial USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TwoSidedMaterial USE newValue='" + newValue + "'" + 
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TwoSidedMaterialObject setCssClass(String newValue)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setCssClass(SFStringObject newValue)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterialObject setUSE(TwoSidedMaterialObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on TwoSidedMaterialObject" +
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
	public TwoSidedMaterialObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public TwoSidedMaterialObject addComments (String newComment)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public TwoSidedMaterialObject addComments (String[] newComments)
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
	 * @return {@link TwoSidedMaterialObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public TwoSidedMaterialObject addComments (CommentsBlock newCommentsBlock)
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

		stringX3D.append(indent).append("<TwoSidedMaterial"); // start opening tag
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

			if (((getAmbientIntensity() != AMBIENTINTENSITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" ambientIntensity='").append(SFFloatObject.toString(getAmbientIntensity())).append("'");
			}
			if (((getBackAmbientIntensity() != BACKAMBIENTINTENSITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" backAmbientIntensity='").append(SFFloatObject.toString(getBackAmbientIntensity())).append("'");
			}
			if ((!Arrays.equals(getBackDiffuseColor(), BACKDIFFUSECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" backDiffuseColor='").append(SFColorObject.toString(getBackDiffuseColor())).append("'");
			}
			if ((!Arrays.equals(getBackEmissiveColor(), BACKEMISSIVECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" backEmissiveColor='").append(SFColorObject.toString(getBackEmissiveColor())).append("'");
			}
			if (((getBackShininess() != BACKSHININESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" backShininess='").append(SFFloatObject.toString(getBackShininess())).append("'");
			}
			if ((!Arrays.equals(getBackSpecularColor(), BACKSPECULARCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" backSpecularColor='").append(SFColorObject.toString(getBackSpecularColor())).append("'");
			}
			if (((getBackTransparency() != BACKTRANSPARENCY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" backTransparency='").append(SFFloatObject.toString(getBackTransparency())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if ((!Arrays.equals(getDiffuseColor(), DIFFUSECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" diffuseColor='").append(SFColorObject.toString(getDiffuseColor())).append("'");
			}
			if ((!Arrays.equals(getEmissiveColor(), EMISSIVECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" emissiveColor='").append(SFColorObject.toString(getEmissiveColor())).append("'");
			}
			if (((getSeparateBackColor() != SEPARATEBACKCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" separateBackColor='").append(SFBoolObject.toString(getSeparateBackColor())).append("'");
			}
			if (((getShininess() != SHININESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" shininess='").append(SFFloatObject.toString(getShininess())).append("'");
			}
			if ((!Arrays.equals(getSpecularColor(), SPECULARCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" specularColor='").append(SFColorObject.toString(getSpecularColor())).append("'");
			}
			if (((getTransparency() != TRANSPARENCY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" transparency='").append(SFFloatObject.toString(getTransparency())).append("'");
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
			stringX3D.append(indent).append("</TwoSidedMaterial>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=TwoSidedMaterial, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
			stringClassicVRML.append("TwoSidedMaterial").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("ambientIntensity"))
						{
							stringClassicVRML.append(indentCharacter).append("ambientIntensity").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getAmbientIntensity() != AMBIENTINTENSITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("ambientIntensity ").append(SFFloatObject.toString(getAmbientIntensity())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("backAmbientIntensity"))
						{
							stringClassicVRML.append(indentCharacter).append("backAmbientIntensity").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getBackAmbientIntensity() != BACKAMBIENTINTENSITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("backAmbientIntensity ").append(SFFloatObject.toString(getBackAmbientIntensity())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("backDiffuseColor"))
						{
							stringClassicVRML.append(indentCharacter).append("backDiffuseColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBackDiffuseColor(), BACKDIFFUSECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("backDiffuseColor ").append(SFColorObject.toString(getBackDiffuseColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("backEmissiveColor"))
						{
							stringClassicVRML.append(indentCharacter).append("backEmissiveColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBackEmissiveColor(), BACKEMISSIVECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("backEmissiveColor ").append(SFColorObject.toString(getBackEmissiveColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("backShininess"))
						{
							stringClassicVRML.append(indentCharacter).append("backShininess").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getBackShininess() != BACKSHININESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("backShininess ").append(SFFloatObject.toString(getBackShininess())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("backSpecularColor"))
						{
							stringClassicVRML.append(indentCharacter).append("backSpecularColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBackSpecularColor(), BACKSPECULARCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("backSpecularColor ").append(SFColorObject.toString(getBackSpecularColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("backTransparency"))
						{
							stringClassicVRML.append(indentCharacter).append("backTransparency").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getBackTransparency() != BACKTRANSPARENCY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("backTransparency ").append(SFFloatObject.toString(getBackTransparency())).append("\n").append(indent).append(indentCharacter);
				}
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
						if (element.getNodeField().equals("diffuseColor"))
						{
							stringClassicVRML.append(indentCharacter).append("diffuseColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getDiffuseColor(), DIFFUSECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("diffuseColor ").append(SFColorObject.toString(getDiffuseColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("emissiveColor"))
						{
							stringClassicVRML.append(indentCharacter).append("emissiveColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getEmissiveColor(), EMISSIVECOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("emissiveColor ").append(SFColorObject.toString(getEmissiveColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("separateBackColor"))
						{
							stringClassicVRML.append(indentCharacter).append("separateBackColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSeparateBackColor() != SEPARATEBACKCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("separateBackColor ").append(SFBoolObject.toString(getSeparateBackColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("shininess"))
						{
							stringClassicVRML.append(indentCharacter).append("shininess").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getShininess() != SHININESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("shininess ").append(SFFloatObject.toString(getShininess())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("specularColor"))
						{
							stringClassicVRML.append(indentCharacter).append("specularColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getSpecularColor(), SPECULARCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("specularColor ").append(SFColorObject.toString(getSpecularColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("transparency"))
						{
							stringClassicVRML.append(indentCharacter).append("transparency").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTransparency() != TRANSPARENCY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("transparency ").append(SFFloatObject.toString(getTransparency())).append("\n").append(indent).append(indentCharacter);
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

		setAmbientIntensity(getAmbientIntensity()); // exercise field checks, simple types
        
		setBackAmbientIntensity(getBackAmbientIntensity()); // exercise field checks, simple types
        
		setBackDiffuseColor(getBackDiffuseColor()); // exercise field checks, simple types
        
		setBackEmissiveColor(getBackEmissiveColor()); // exercise field checks, simple types
        
		setBackShininess(getBackShininess()); // exercise field checks, simple types
        
		setBackSpecularColor(getBackSpecularColor()); // exercise field checks, simple types
        
		setBackTransparency(getBackTransparency()); // exercise field checks, simple types
        
		setDiffuseColor(getDiffuseColor()); // exercise field checks, simple types
        
		setEmissiveColor(getEmissiveColor()); // exercise field checks, simple types
        
		setSeparateBackColor(getSeparateBackColor()); // exercise field checks, simple types
        
		setShininess(getShininess()); // exercise field checks, simple types
        
		setSpecularColor(getSpecularColor()); // exercise field checks, simple types
        
		setTransparency(getTransparency()); // exercise field checks, simple types
        
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
			String errorNotice = "TwoSidedMaterial USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TwoSidedMaterial USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "TwoSidedMaterial USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TwoSidedMaterial USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'TwoSidedMaterial' node, add head statement <component name='Shape' level='4'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Shape\").setLevel(4);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
