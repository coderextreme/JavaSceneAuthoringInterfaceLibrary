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

package org.web3d.x3d.jsail.Picking;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Picking.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Picking.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Picking.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Picking.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Rendering.*;
import java.util.Arrays;

/**
 * PointPickSensor tests one or more pickingGeometry points in space as lying inside the provided pickTarget geometry.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DPickSensorNode] PointPickSensor tests one or more pickingGeometry points in space as lying inside the provided pickTarget geometry. For each pickingGeometry PointSet coordinate point that lies inside the pickTarget geometry, a pickedPoint coordinate is returned along with a corresponding pickedGeometry node inside which the point lies.
 * <ul>
 *  <li> <i>Hint:</i> because points represent an infinitely small location in space, sortOrder values CLOSEST and ALL_SORTED are defined to mean ANY and ALL respectively. </li> 
 *  <li> <i>Hint:</i> picking is performed between rendered frames of the event model. An author sets up the picking request in one frame by placing a LinePickSensor in the desired location. At the start of the next frame, any picking intersections are reported by the pick sensor. </li> 
 *  <li> <i>Hint:</i> picking notification is performed at the start of the frame for all enabled pick sensors once all other sensors are processed. </li> 
 *  <li> <i>Hint:</i> event timing details are explained in X3D Specification 4.4.8.3 Execution model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModelWarning" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModelWarning</a>: order of contained nodes is significant, single pickingGeometry node must precede pickTarget node array. </li> 
 *  <li> <i>Hint:</i>  PointSet can be used for pickingGeometry node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#PointPickSensor" target="blank">X3D Abstract Specification: PointPickSensor</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PointPickSensor" target="_blank">X3D Tooltips: PointPickSensor</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class PointPickSensorObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Picking.PointPickSensor
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=enabled, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=enabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean enabled; // SFBool

 /* @name=intersectionType, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=intersectionType, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String intersectionType; // SFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=isActive, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isActive, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isActive; // SFBool

 /* @name=matchCriterion, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=matchCriterion, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String matchCriterion; // SFString

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=objectType, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=objectType, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> objectType = new ArrayList<>(); // MFString

 /* @name=pickedGeometry, @type=MFNode, $javaType=ArrayList<X3DChildNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DChildNode>, $normalizedMemberObjectName=pickedGeometry, $isX3dStatement=false, @acceptableNodeTypes=X3DChildNode */ 
	private ArrayList<X3DNode> pickedGeometry = new ArrayList<>(); // MFNode acceptable node types: X3DChildNode or ProtoInstanceObject

 /* @name=pickedPoint, @type=MFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=pickedPoint, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] pickedPoint; // MFVec3f

 /* @name=pickingGeometry, @type=SFNode, $javaType=X3DGeometryNode, $javaReferenceType=X3DGeometryNode, $javaPrimitiveType=X3DGeometryNode, $normalizedMemberObjectName=pickingGeometry, $isX3dStatement=false, @acceptableNodeTypes=X3DGeometryNode */ 
	private X3DGeometryNode pickingGeometry; // SFNode acceptable node types: X3DGeometryNode or ProtoInstanceObject
	private ProtoInstanceObject pickingGeometryProtoInstance; // allowed alternative for pickingGeometry field

 /* @name=pickTarget, @type=MFNode, $javaType=ArrayList<X3DNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DNode>, $normalizedMemberObjectName=pickTarget, $isX3dStatement=false, @acceptableNodeTypes=X3DGroupingNode|X3DShapeNode|Inline */ 
	private ArrayList<X3DNode> pickTarget = new ArrayList<>(); // MFNode acceptable node types: X3DGroupingNode|X3DShapeNode|Inline or ProtoInstanceObject

 /* @name=sortOrder, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=sortOrder, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String sortOrder; // SFString

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "BOUNDS", "GEOMETRY".
<br ><br >
	 * intersectionTypeValues are suggested values for X3DPickSensorNode type intersectionType field. Unbounded, additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode</a> 
	*/
	public static final ArrayList<String> intersectionTypeValues = new ArrayList<>(Arrays.<String>asList("BOUNDS", "GEOMETRY"));

	/** SFString field named <i>intersectionType</i> with X3DUOM baseType <i>intersectionTypeValues</i> can equal this value <i>"BOUNDS"</i> (Java syntax) or <i>BOUNDS</i> (XML syntax).
	 * @see #intersectionTypeValues */
	public static final String INTERSECTIONTYPE_BOUNDS = "BOUNDS";

	/** SFString field named <i>intersectionType</i> with X3DUOM baseType <i>intersectionTypeValues</i> can equal this value <i>"GEOMETRY"</i> (Java syntax) or <i>GEOMETRY</i> (XML syntax).
	 * @see #intersectionTypeValues */
	public static final String INTERSECTIONTYPE_GEOMETRY = "GEOMETRY";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "MATCH_ANY", "MATCH_EVERY", "MATCH_ONLY_ONE".
<br ><br >
	 * pickSensorMatchCriterionChoices are strictly allowed enumeration values for X3DPickSensorNode node matchCriterion field. Bounded, no additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode</a> 
	*/
	public static final ArrayList<String> pickSensorMatchCriterionChoices = new ArrayList<>(Arrays.<String>asList("MATCH_ANY", "MATCH_EVERY", "MATCH_ONLY_ONE"));

	/** SFString field named <i>matchCriterion</i> with X3DUOM baseType <i>pickSensorMatchCriterionChoices</i> can equal this value <i>"MATCH_ANY"</i> (Java syntax) or <i>MATCH_ANY</i> (XML syntax).
	 * @see #pickSensorMatchCriterionChoices */
	public static final String MATCHCRITERION_MATCH_ANY = "MATCH_ANY";

	/** SFString field named <i>matchCriterion</i> with X3DUOM baseType <i>pickSensorMatchCriterionChoices</i> can equal this value <i>"MATCH_EVERY"</i> (Java syntax) or <i>MATCH_EVERY</i> (XML syntax).
	 * @see #pickSensorMatchCriterionChoices */
	public static final String MATCHCRITERION_MATCH_EVERY = "MATCH_EVERY";

	/** SFString field named <i>matchCriterion</i> with X3DUOM baseType <i>pickSensorMatchCriterionChoices</i> can equal this value <i>"MATCH_ONLY_ONE"</i> (Java syntax) or <i>MATCH_ONLY_ONE</i> (XML syntax).
	 * @see #pickSensorMatchCriterionChoices */
	public static final String MATCHCRITERION_MATCH_ONLY_ONE = "MATCH_ONLY_ONE";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;ALL&#34;", "&#34;NONE&#34;", "&#34;TERRAIN&#34;".
<br ><br >
	 * Suggested values for the objectType field in the abstract types X3DPickableObject and X3DPickSensorNode. Unbounded, additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickableObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickableObject</a> 
	*/
	public static final ArrayList<String> pickableObjectTypeValues = new ArrayList<>(Arrays.<String>asList("\"ALL\"", "\"NONE\"", "\"TERRAIN\""));

	/** MFString field named <i>objectType</i> with X3DUOM baseType <i>pickableObjectTypeValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"ALL"</i> (Java syntax) or <i>'"ALL"'</i> (XML syntax).
	 * @see #pickableObjectTypeValues */
	public static final String OBJECTTYPE_ALL = "ALL";

	/** MFString field named <i>objectType</i> with X3DUOM baseType <i>pickableObjectTypeValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"NONE"</i> (Java syntax) or <i>'"NONE"'</i> (XML syntax).
	 * @see #pickableObjectTypeValues */
	public static final String OBJECTTYPE_NONE = "NONE";

	/** MFString field named <i>objectType</i> with X3DUOM baseType <i>pickableObjectTypeValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"TERRAIN"</i> (Java syntax) or <i>'"TERRAIN"'</i> (XML syntax).
	 * @see #pickableObjectTypeValues */
	public static final String OBJECTTYPE_TERRAIN = "TERRAIN";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "ANY", "CLOSEST", "ALL", "ALL_SORTED".
<br ><br >
	 * pickSensorSortOrderValues are allowed enumeration values for X3DPickSensorNode node sortOrder field. Unbounded, additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode</a> 
	*/
	public static final ArrayList<String> pickSensorSortOrderValues = new ArrayList<>(Arrays.<String>asList("ANY", "CLOSEST", "ALL", "ALL_SORTED"));

	/** SFString field named <i>sortOrder</i> with X3DUOM baseType <i>pickSensorSortOrderValues</i> can equal this value <i>"ANY"</i> (Java syntax) or <i>ANY</i> (XML syntax).
	 * @see #pickSensorSortOrderValues */
	public static final String SORTORDER_ANY = "ANY";

	/** SFString field named <i>sortOrder</i> with X3DUOM baseType <i>pickSensorSortOrderValues</i> can equal this value <i>"CLOSEST"</i> (Java syntax) or <i>CLOSEST</i> (XML syntax).
	 * @see #pickSensorSortOrderValues */
	public static final String SORTORDER_CLOSEST = "CLOSEST";

	/** SFString field named <i>sortOrder</i> with X3DUOM baseType <i>pickSensorSortOrderValues</i> can equal this value <i>"ALL"</i> (Java syntax) or <i>ALL</i> (XML syntax).
	 * @see #pickSensorSortOrderValues */
	public static final String SORTORDER_ALL = "ALL";

	/** SFString field named <i>sortOrder</i> with X3DUOM baseType <i>pickSensorSortOrderValues</i> can equal this value <i>"ALL_SORTED"</i> (Java syntax) or <i>ALL_SORTED</i> (XML syntax).
	 * @see #pickSensorSortOrderValues */
	public static final String SORTORDER_ALL_SORTED = "ALL_SORTED";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>PointPickSensor</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "PointPickSensor";

	/** Provides name of this element: <i>PointPickSensor</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>PointPickSensor</i> element: <i>Picking</i> */
	public static final String COMPONENT = "Picking";

	/** Defines X3D component for the <i>PointPickSensor</i> element: <i>Picking</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Picking</i> component level for this element: <i>1</i> */
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

	/** SFBool field named <i>enabled</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean ENABLED_DEFAULT_VALUE = true;

	/** SFString field named <i>intersectionType</i> has default value <i>"BOUNDS"</i> (Java syntax) or <i>BOUNDS</i> (XML syntax). */
	public static final String INTERSECTIONTYPE_DEFAULT_VALUE = "BOUNDS";

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFString field named <i>matchCriterion</i> has default value <i>"MATCH_ANY"</i> (Java syntax) or <i>MATCH_ANY</i> (XML syntax). */
	public static final String MATCHCRITERION_DEFAULT_VALUE = "MATCH_ANY";

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** MFString field named <i>objectType</i> has default quoted value <i>new String[] {"ALL"}</i> (Java syntax) or quoted value <i>"ALL"</i> (XML syntax). */
	public static final ArrayList<String> OBJECTTYPE_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("ALL"));

	/** SFNode field named <i>pickingGeometry</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DGeometryNode PICKINGGEOMETRY_DEFAULT_VALUE = null;

	/** SFString field named <i>sortOrder</i> has default value <i>"CLOSEST"</i> (Java syntax) or <i>CLOSEST</i> (XML syntax). */
	public static final String SORTORDER_DEFAULT_VALUE = "CLOSEST";

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
			case "enabled":
				result = "SFBool";
				break;
			case "intersectionType":
				result = "SFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "isActive":
				result = "SFBool";
				break;
			case "matchCriterion":
				result = "SFString";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "objectType":
				result = "MFString";
				break;
			case "pickedGeometry":
				result = "MFNode";
				break;
			case "pickedPoint":
				result = "MFVec3f";
				break;
			case "pickingGeometry":
				result = "SFNode";
				break;
			case "pickTarget":
				result = "MFNode";
				break;
			case "sortOrder":
				result = "SFString";
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
			case "enabled":
				result = "inputOutput";
				break;
			case "intersectionType":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "isActive":
				result = "outputOnly";
				break;
			case "matchCriterion":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "objectType":
				result = "inputOutput";
				break;
			case "pickedGeometry":
				result = "outputOnly";
				break;
			case "pickedPoint":
				result = "outputOnly";
				break;
			case "pickingGeometry":
				result = "inputOutput";
				break;
			case "pickTarget":
				result = "inputOutput";
				break;
			case "sortOrder":
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
	public static final String containerField_DEFAULT_VALUE = "children"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String fromField_ENABLED = "enabled";

	/** toField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String toField_ENABLED = "enabled";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFBool field named <i>isActive</i>. */
	public static final String fromField_ISACTIVE = "isActive";

	/** fromField ROUTE name for SFString field named <i>matchCriterion</i>. */
	public static final String fromField_MATCHCRITERION = "matchCriterion";

	/** toField ROUTE name for SFString field named <i>matchCriterion</i>. */
	public static final String toField_MATCHCRITERION = "matchCriterion";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for MFString field named <i>objectType</i>. */
	public static final String fromField_OBJECTTYPE = "objectType";

	/** toField ROUTE name for MFString field named <i>objectType</i>. */
	public static final String toField_OBJECTTYPE = "objectType";

	/** fromField ROUTE name for MFNode field named <i>pickedGeometry</i>. */
	public static final String fromField_PICKEDGEOMETRY = "pickedGeometry";

	/** fromField ROUTE name for MFVec3f field named <i>pickedPoint</i>. */
	public static final String fromField_PICKEDPOINT = "pickedPoint";

	/** fromField ROUTE name for SFNode field named <i>pickingGeometry</i>. */
	public static final String fromField_PICKINGGEOMETRY = "pickingGeometry";

	/** toField ROUTE name for SFNode field named <i>pickingGeometry</i>. */
	public static final String toField_PICKINGGEOMETRY = "pickingGeometry";

	/** fromField ROUTE name for MFNode field named <i>pickTarget</i>. */
	public static final String fromField_PICKTARGET = "pickTarget";

	/** toField ROUTE name for MFNode field named <i>pickTarget</i>. */
	public static final String toField_PICKTARGET = "pickTarget";

	/** Constructor for PointPickSensorObject to initialize member variables with default values. */
	public PointPickSensorObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "children" }; // type xs:NMTOKEN

		enabled = ENABLED_DEFAULT_VALUE;
		intersectionType = INTERSECTIONTYPE_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		matchCriterion = MATCHCRITERION_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		objectType = new ArrayList<>(OBJECTTYPE_DEFAULT_VALUE);
		pickingGeometry = null;              // clear out any prior node
		pickingGeometryProtoInstance = null; // clear out any prior node
		pickTarget = new ArrayList<>();
		sortOrder = SORTORDER_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled()
	{
		return enabled;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setEnabled(boolean newValue)
	{
		// set-newValue-validity-checks #0
		enabled = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool enabled field, similar to {@link #setEnabled(boolean)}.
	 * @param newValue is new value for the enabled field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setEnabled(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType intersectionTypeValues) ["BOUNDS" | "GEOMETRY" | 'etc.'] from initializeOnly SFString field named <i>intersectionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> intersectionType specifies precision of the collision computation.
 * <ul>
 *  <li> <i>Hint:</i> intersectionType constants may be extended by the browser to provide additional options. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #INTERSECTIONTYPE_BOUNDS BOUNDS}, {@link #INTERSECTIONTYPE_GEOMETRY GEOMETRY}.
	 * @return value of intersectionType field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String getIntersectionType()
	{
		return intersectionType;
	}

	/**
	 * Accessor method to assign String enumeration value ("BOUNDS" | "GEOMETRY") to initializeOnly SFString field named <i>intersectionType</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #INTERSECTIONTYPE_BOUNDS BOUNDS}, {@link #INTERSECTIONTYPE_GEOMETRY GEOMETRY}).
	 * <br><br>
	 * <i>Tooltip:</i> intersectionType specifies precision of the collision computation.
 * <ul>
 *  <li> <i>Hint:</i> intersectionType constants may be extended by the browser to provide additional options. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @param newValue is new value for the intersectionType field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setIntersectionType(String newValue)
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
			newValue.equals(INTERSECTIONTYPE_BOUNDS) ||
			newValue.equals(INTERSECTIONTYPE_GEOMETRY)))
		{
			String warningMessage = "Warning: PointPickSensor intersectionType newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		intersectionType = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString intersectionType field, similar to {@link #setIntersectionType(String)}.
	 * @param newValue is new value for the intersectionType field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setIntersectionType(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setIntersectionType(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setIS(ISObject newValue)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public PointPickSensorObject clearIS()
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
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive indicates when the intersecting object is picked by the picking geometry. Output event isActive=true gets sent once a picked item is found. Output event isActive=false gets sent once no picked item is found.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsActive()
	{
		return isActive;
	}
	/**
	 * Provide String enumeration value (baseType pickSensorMatchCriterionChoices) ["MATCH_ANY" | "MATCH_EVERY" | "MATCH_ONLY_ONE"] from inputOutput SFString field named <i>matchCriterion</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  defines whether the intersection test (i.e. pick) by this X3DPickSensorNode must match one or more objectType. Specifically MATCH_ANY means any match of objectType values is acceptable, MATCH_EVERY means that every objectType value in this node shall match an objectType value in the X3DPickableObject, and MATCH_ONLY_ONE means that one and only one objectType value can match.  * <br>

	 * <br><br>
	 * Available enumeration values for string comparison: {@link #MATCHCRITERION_MATCH_ANY MATCH_ANY}, {@link #MATCHCRITERION_MATCH_EVERY MATCH_EVERY}, {@link #MATCHCRITERION_MATCH_ONLY_ONE MATCH_ONLY_ONE}.
	 * @return value of matchCriterion field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String getMatchCriterion()
	{
		return matchCriterion;
	}

	/**
	 * Accessor method to assign String enumeration value ("MATCH_ANY" | "MATCH_EVERY" | "MATCH_ONLY_ONE") to inputOutput SFString field named <i>matchCriterion</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #MATCHCRITERION_MATCH_ANY MATCH_ANY}, {@link #MATCHCRITERION_MATCH_EVERY MATCH_EVERY}, {@link #MATCHCRITERION_MATCH_ONLY_ONE MATCH_ONLY_ONE}).
	 * <br><br>
	 * <i>Tooltip:</i>  defines whether the intersection test (i.e. pick) by this X3DPickSensorNode must match one or more objectType. Specifically MATCH_ANY means any match of objectType values is acceptable, MATCH_EVERY means that every objectType value in this node shall match an objectType value in the X3DPickableObject, and MATCH_ONLY_ONE means that one and only one objectType value can match.  * <br>

	 * @param newValue is new value for the matchCriterion field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setMatchCriterion(String newValue)
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
			newValue.equals(MATCHCRITERION_MATCH_ANY) ||
			newValue.equals(MATCHCRITERION_MATCH_EVERY) ||
			newValue.equals(MATCHCRITERION_MATCH_ONLY_ONE)))
		{
			String warningMessage = "Warning: PointPickSensor matchCriterion newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		matchCriterion = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString matchCriterion field, similar to {@link #setMatchCriterion(String)}.
	 * @param newValue is new value for the matchCriterion field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setMatchCriterion(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMatchCriterion(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public PointPickSensorObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide array of String enumeration results with quoted value(s) ["ALL","NONE","TERRAIN",...] from inputOutput MFString field named <i>objectType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The objectType field specifies a set of labels used in the picking process. Each string specified is treated as an independent label that needs to be matched against the same type in one of the pick sensor instances. Example: labeling a PickableGroup with the objectType value "WATER" and then attempting to intersect a pick sensor with objectType value "GROUND" fails since the objectType values do not match. Example: the special value "ALL" means that each node is available for picking regardless of the type specified by the pick sensor. Example: the special value "NONE" effectively disables all picking for this node and is the equivalent of setting the pickable field of the corresponding PickableGroup to false.
 * <ul>
 *  <li> <i>Hint:</i> authors may define any value for objectType. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #OBJECTTYPE_ALL ALL}, {@link #OBJECTTYPE_NONE NONE}, {@link #OBJECTTYPE_TERRAIN TERRAIN}.
	 * @return value of objectType field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getObjectType()
	{
		final String[] valuesArray = new String[objectType.size()];
		int i = 0;
		for (String arrayElement : objectType) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString objectType field, similar to {@link #getObjectType()}.
	 * @return value of objectType field
	 */
	public ArrayList<String> getObjectTypeList()
	{
		return objectType;
	}
	/**
	 * Utility method to get String value of MFString objectType field, similar to {@link #getObjectType()}.
	 * @return value of objectType field
	 */
	public String getObjectTypeString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : objectType) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"" | ""TERRAIN"") to inputOutput MFString field named <i>objectType</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #OBJECTTYPE_ALL ALL}, {@link #OBJECTTYPE_NONE NONE}, {@link #OBJECTTYPE_TERRAIN TERRAIN}).
	 * <br><br>
	 * <i>Tooltip:</i> The objectType field specifies a set of labels used in the picking process. Each string specified is treated as an independent label that needs to be matched against the same type in one of the pick sensor instances. Example: labeling a PickableGroup with the objectType value "WATER" and then attempting to intersect a pick sensor with objectType value "GROUND" fails since the objectType values do not match. Example: the special value "ALL" means that each node is available for picking regardless of the type specified by the pick sensor. Example: the special value "NONE" effectively disables all picking for this node and is the equivalent of setting the pickable field of the corresponding PickableGroup to false.
 * <ul>
 *  <li> <i>Hint:</i> authors may define any value for objectType. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the objectType field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setObjectType(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearObjectType(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(OBJECTTYPE_ALL) ||
			newValue[i].equals(OBJECTTYPE_NONE) ||
			newValue[i].equals(OBJECTTYPE_TERRAIN)))
		{
			String warningMessage = "Warning: PointPickSensor objectType newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the optional string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);
		}
        }
		if (newValue == null)		{
			clearObjectType(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearObjectType(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			objectType.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString objectType field, similar to {@link #setObjectType(String[])}.
	 * @param newValue is new value for the objectType field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setObjectType(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearObjectType(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setObjectType(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString objectType field, similar to {@link #setObjectType(String[])}.
	 * @param newValue is new value for the objectType field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setObjectType(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearObjectType(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearObjectType(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(OBJECTTYPE_ALL) ||
			newValue.equals(OBJECTTYPE_NONE) ||
			newValue.equals(OBJECTTYPE_TERRAIN)))
		{
			String warningMessage = "Warning: PointPickSensor objectType newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		setObjectType(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString objectType field, similar to {@link #setObjectType(String[])}.
	 * @param newValue is new value for the objectType field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setObjectType(String newValue)
	{
		if (newValue == null)		{
			clearObjectType(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearObjectType(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(OBJECTTYPE_ALL) ||
			newValue.equals(OBJECTTYPE_NONE) ||
			newValue.equals(OBJECTTYPE_TERRAIN)))
		{
			String warningMessage = "Warning: PointPickSensor objectType newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		setObjectType(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString objectType field, similar to {@link #setObjectType(String[])}.
	 * @param newValue is new value for the objectType field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setObjectType(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearObjectType(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearObjectType(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(OBJECTTYPE_ALL) ||
			newValue.equals(OBJECTTYPE_NONE) ||
			newValue.equals(OBJECTTYPE_TERRAIN)))
		{
			String warningMessage = "Warning: PointPickSensor objectType newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
        if (newValue.isEmpty())
            clearObjectType(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setObjectType(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of objectType field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public PointPickSensorObject clearObjectType()
	{
		objectType.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString objectType field.
	 * @param newValue is new value to add to the objectType field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject addObjectType(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !objectType.contains(newValue))
            objectType.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString objectType field.
	 * @param newValue is new value to add to the objectType field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject addObjectType(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !objectType.contains(newValue.getValue()))
            objectType.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of X3DChildNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from outputOnly MFNode field <i>pickedGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event containing the node or nodes that have been found to intersect with the picking geometry from the last time this node performed a picking operation, given in the local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of pickedGeometry field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getPickedGeometry()
	{
		final X3DNode[] valuesArray = new X3DNode[pickedGeometry.size()];
		int i = 0;
		for (X3DNode arrayElement : pickedGeometry) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode pickedGeometry field, similar to {@link #getPickedGeometry()}.
	 * @return value of pickedGeometry field
	 */
	public ArrayList<X3DNode> getPickedGeometryList()
	{
		return pickedGeometry;
	}
	/**
	 * Provide array of 3-tuple float results from outputOnly MFVec3f field named <i>pickedPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event containing 3D points on surface of underlying pickingGeometry computed by the picking intersection computations, given in the local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of pickedPoint field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getPickedPoint()
	{
		return pickedPoint;
	}
	/**
	 * Provide X3DGeometryNode instance (using a properly typed node) from inputOutput SFNode field <i>pickingGeometry</i>.
	 * @see #getPickingGeometryProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [PointSet] pickingGeometry specifies the exact geometry coordinates that are used to perform the intersection testing of the picking operation.  * <br>

	 * @return value of pickingGeometry field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public X3DGeometryNode getPickingGeometry()
	{
		return pickingGeometry;
	}

	/**
	 * Accessor method to assign X3DGeometryNode instance (using a properly typed node) to inputOutput SFNode field <i>pickingGeometry</i>.
	 * @see #setPickingGeometry(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [PointSet] pickingGeometry specifies the exact geometry coordinates that are used to perform the intersection testing of the picking operation.  * <br>

	 * @param newValue is new value for the pickingGeometry field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setPickingGeometry(X3DGeometryNode newValue)
	{
		// set-newValue-validity-checks #0
		pickingGeometry = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) pickingGeometry).setParentObject(this); // parentTest15
		}
		if (pickingGeometryProtoInstance != null)
		{
			pickingGeometryProtoInstance.setParentObject(null); // housekeeping, clear prior object
			pickingGeometryProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of pickingGeometry field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public PointPickSensorObject clearPickingGeometry()
	{
		((X3DConcreteElement) pickingGeometry).clearParentObject(); // remove references to facilitate Java memory management
		pickingGeometry = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>pickingGeometry</i>.
	 * @see #setPickingGeometry(X3DGeometryNode)
	 * @param newValue is new value for the pickingGeometry field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setPickingGeometry(ProtoInstanceObject newValue)
	{
		if (pickingGeometryProtoInstance != null)
		{
			((X3DConcreteElement) pickingGeometryProtoInstance).setParentObject(null); // parentTest15.5
	    }
		pickingGeometryProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) pickingGeometryProtoInstance).setParentObject(this); // parentTest15.6
            pickingGeometryProtoInstance.setContainerField("pickingGeometry");
	    }
		if (pickingGeometry != null)
		{
			((X3DConcreteElement) pickingGeometry).setParentObject(null); // housekeeping, clear prior object
			pickingGeometry = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getPickingGeometryProtoInstance()
		{
			return pickingGeometryProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>pickingGeometry</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getPickingGeometry()
	 * @see #getPickingGeometryProtoInstance()
	 */
	public boolean hasPickingGeometry()
	{
		return (pickingGeometry != null) || (pickingGeometryProtoInstance != null);
	}
	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to X3DGroupingNode|X3DShapeNode|Inline, from inputOutput MFNode field <i>pickTarget</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGroupingNode|X3DShapeNode|Inline] pickTarget specifies the list of nodes against which picking operations are performed. All nodes declared in this field and their descendents are evaluated for intersections.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @see org.web3d.x3d.sai.Grouping.X3DGroupingNode
	 * @see org.web3d.x3d.sai.Shape.X3DShapeNode
	 * @see org.web3d.x3d.jsail.Networking.InlineObject
	 * @return value of pickTarget field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getPickTarget()
	{
		final X3DNode[] valuesArray = new X3DNode[pickTarget.size()];
		int i = 0;
		for (X3DNode arrayElement : pickTarget) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode pickTarget field, similar to {@link #getPickTarget()}.
	 * @return value of pickTarget field
	 */
	public ArrayList<X3DNode> getPickTargetList()
	{
		return pickTarget;
	}

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>pickTarget</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Grouping.X3DGroupingNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Shape.X3DShapeNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGroupingNode|X3DShapeNode|Inline] pickTarget specifies the list of nodes against which picking operations are performed. All nodes declared in this field and their descendents are evaluated for intersections.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new value for the pickTarget field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setPickTarget(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearPickTarget(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof X3DGroupingNode) || 
				(((X3DConcreteNode)newValue[i]) instanceof X3DShapeNode) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue["+i+"]=" + newValue[i]);
			}
		}
		clearPickTarget(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				pickTarget.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode pickTarget field, similar to {@link #setPickTarget(X3DNode[])}.
	 * @param newValue is new value for the pickTarget field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setPickTarget(ArrayList<X3DNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearPickTarget(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4

		// newValueArrayListAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #3
		for (X3DNode element : newValue)
		{
			boolean isNodeTypeAllowed = 
				(element instanceof X3DGroupingNode) || 
				(element instanceof X3DShapeNode) || 
				(element instanceof org.web3d.x3d.jsail.Networking.InlineObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] element is not instanceof " +
					"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; element=" + element);
			}
		}
        if (newValue.isEmpty())
            clearPickTarget(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setPickTarget(newArray);
        }
		for (X3DNode element : newValue)
		{
			pickTarget.add(element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of pickTarget nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline and ProtoInstance.
	 * @param newValue is new value to be appended the pickTarget field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public PointPickSensorObject addPickTarget(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Grouping.X3DGroupingNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Shape.X3DShapeNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue=" + newValue);
		}
		pickTarget.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for pickTarget field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public PointPickSensorObject addPickTarget(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		pickTarget.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child pickTarget nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new value array to be appended the pickTarget field.
	 */
	@Override // or here2?
	public void addPickTarget(X3DNode[] newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof X3DGroupingNode) || 
				(((X3DConcreteNode)newValue[i]) instanceof X3DShapeNode) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue["+i+"]=" + newValue[i]);
			}
		}
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				pickTarget.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("pickTarget");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child pickTarget node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new node for the pickTarget field (restricted to X3DGroupingNode|X3DShapeNode|Inline)
	 */
	@Override
	public void setPickTarget(X3DNode newValue)
	{
		if (newValue == null)
		{
			clearPickTarget(); // reset newValueNullClearsFieldReturnVoid
			return;
		}

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Grouping.X3DGroupingNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Shape.X3DShapeNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue=" + newValue);
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : pickTarget)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearPickTarget(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			pickTarget.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of pickTarget field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public PointPickSensorObject clearPickTarget()
	{
		for (X3DNode element : pickTarget)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		pickTarget.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>pickTarget</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getPickTarget()
	 */
	public boolean hasPickTarget()
	{
		return (!pickTarget.isEmpty());
	}
	/**
	 * Provide String enumeration value (baseType pickSensorSortOrderValues) ["ANY" | "CLOSEST" | "ALL" | "ALL_SORTED" | 'etc.'] from initializeOnly SFString field named <i>sortOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The sortOrder field determines the order provided for picked output events. Example: ANY means that any single object can satisfy picking conditions for this pick sensor. Consistency of results is not guaranteed. Example: ALL means that every object that satisfies the picking conditions for this pick sensor shall be returned. Example: ALL_SORTED means that every object that satisfies the picking conditions for this pick sensor shall be returned with the order of the output fields provided in a distance-sorted order from closest to farthest away. The exact algorithm for sorting is defined by the individual node definitions. Example: CLOSEST means that the closest object by distance that satisfies the conditions of this pick sensor. *The exact algorithm for distance determination shall be defined by individual node definitions*.
 * <ul>
 *  <li> <i>Hint:</i> browser implementations may define additional values and algorithms beyond these four required values. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #SORTORDER_ANY ANY}, {@link #SORTORDER_CLOSEST CLOSEST}, {@link #SORTORDER_ALL ALL}, {@link #SORTORDER_ALL_SORTED ALL_SORTED}.
	 * @return value of sortOrder field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String getSortOrder()
	{
		return sortOrder;
	}

	/**
	 * Accessor method to assign String enumeration value ("ANY" | "CLOSEST" | "ALL" | "ALL_SORTED") to initializeOnly SFString field named <i>sortOrder</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #SORTORDER_ANY ANY}, {@link #SORTORDER_CLOSEST CLOSEST}, {@link #SORTORDER_ALL ALL}, {@link #SORTORDER_ALL_SORTED ALL_SORTED}).
	 * <br><br>
	 * <i>Tooltip:</i> The sortOrder field determines the order provided for picked output events. Example: ANY means that any single object can satisfy picking conditions for this pick sensor. Consistency of results is not guaranteed. Example: ALL means that every object that satisfies the picking conditions for this pick sensor shall be returned. Example: ALL_SORTED means that every object that satisfies the picking conditions for this pick sensor shall be returned with the order of the output fields provided in a distance-sorted order from closest to farthest away. The exact algorithm for sorting is defined by the individual node definitions. Example: CLOSEST means that the closest object by distance that satisfies the conditions of this pick sensor. *The exact algorithm for distance determination shall be defined by individual node definitions*.
 * <ul>
 *  <li> <i>Hint:</i> browser implementations may define additional values and algorithms beyond these four required values. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @param newValue is new value for the sortOrder field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointPickSensorObject setSortOrder(String newValue)
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
			newValue.equals(SORTORDER_ANY) ||
			newValue.equals(SORTORDER_CLOSEST) ||
			newValue.equals(SORTORDER_ALL) ||
			newValue.equals(SORTORDER_ALL_SORTED)))
		{
			String warningMessage = "Warning: PointPickSensor sortOrder newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		sortOrder = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString sortOrder field, similar to {@link #setSortOrder(String)}.
	 * @param newValue is new value for the sortOrder field.
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setSortOrder(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSortOrder(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final PointPickSensorObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to PointPickSensor DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("PointPickSensor DEF newValue='" + newValue + "'" + 
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final PointPickSensorObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to PointPickSensor USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("PointPickSensor USE newValue='" + newValue + "'" + 
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final PointPickSensorObject setCssClass(String newValue)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setCssClass(SFStringObject newValue)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointPickSensorObject setUSE(PointPickSensorObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on PointPickSensorObject" +
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
	public PointPickSensorObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public PointPickSensorObject addComments (String newComment)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public PointPickSensorObject addComments (String[] newComments)
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
	 * @return {@link PointPickSensorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public PointPickSensorObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (pickingGeometry != null) || (pickingGeometryProtoInstance != null) || (!pickTarget.isEmpty()) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<PointPickSensor"); // start opening tag
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
			if (((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" enabled='").append(SFBoolObject.toString(getEnabled())).append("'");
			}
			if ((!getIntersectionType().equals(INTERSECTIONTYPE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" intersectionType='").append(new SFStringObject(getIntersectionType()).toStringX3D()).append("'");
			}
			if ((!getMatchCriterion().equals(MATCHCRITERION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" matchCriterion='").append(new SFStringObject(getMatchCriterion()).toStringX3D()).append("'");
			}
			if (((getObjectType().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" objectType='").append(new MFStringObject(getObjectType()).toStringX3D()).append("'");
			}
			if ((!getSortOrder().equals(SORTORDER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" sortOrder='").append(new SFStringObject(getSortOrder()).toStringX3D()).append("'");
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
			for (X3DNode element : pickTarget)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			if      (pickingGeometry != null)
			{
				stringX3D.append(((X3DConcreteElement)pickingGeometry).toStringX3D(indentLevel + indentIncrement));
			}
			else if (pickingGeometryProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)pickingGeometryProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</PointPickSensor>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=PointPickSensor, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (pickingGeometry != null) || (pickingGeometryProtoInstance != null) || (!pickTarget.isEmpty()) || !commentsList.isEmpty();
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
			stringClassicVRML.append("PointPickSensor").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("enabled"))
						{
							stringClassicVRML.append(indentCharacter).append("enabled").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("enabled ").append(SFBoolObject.toString(getEnabled())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("intersectionType"))
						{
							stringClassicVRML.append(indentCharacter).append("intersectionType").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getIntersectionType().equals(INTERSECTIONTYPE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("intersectionType ").append("\"").append(SFStringObject.toString(getIntersectionType())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("matchCriterion"))
						{
							stringClassicVRML.append(indentCharacter).append("matchCriterion").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getMatchCriterion().equals(MATCHCRITERION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("matchCriterion ").append("\"").append(SFStringObject.toString(getMatchCriterion())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("objectType"))
						{
							stringClassicVRML.append(indentCharacter).append("objectType").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getObjectType().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("objectType ").append("[ ").append(MFStringObject.toString(getObjectType())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("sortOrder"))
						{
							stringClassicVRML.append(indentCharacter).append("sortOrder").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getSortOrder().equals(SORTORDER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("sortOrder ").append("\"").append(SFStringObject.toString(getSortOrder())).append("\"").append("\n").append(indent).append(indentCharacter);
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
			if (pickTarget.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("pickTarget").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : pickTarget)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (pickingGeometry != null)
			{
				stringClassicVRML.append(indentCharacter).append("pickingGeometry").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) pickingGeometry).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (pickingGeometryProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("pickingGeometry").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) pickingGeometryProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
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
		if (pickingGeometry != null)
		{
			referenceElement = ((X3DConcreteElement) pickingGeometry).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (pickingGeometryProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) pickingGeometryProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		for (X3DNode element : pickTarget) // MFNode
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
		if (pickingGeometry != null)
		{
			referenceNode = ((X3DConcreteElement) pickingGeometry).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (pickingGeometryProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) pickingGeometryProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		for (X3DNode element : pickTarget) // MFNode
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

		setEnabled(getEnabled()); // exercise field checks, simple types
        
		setIntersectionType(getIntersectionType()); // exercise field checks, simple types
        
		setMatchCriterion(getMatchCriterion()); // exercise field checks, simple types
        
		setObjectType(getObjectType()); // exercise field checks, simple types
        
		setSortOrder(getSortOrder()); // exercise field checks, simple types
        
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
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (pickingGeometry != null)
		{
			setPickingGeometry(getPickingGeometry());
			((X3DConcreteElement) pickingGeometry).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) pickingGeometry).getValidationResult());
		}
		if (pickingGeometryProtoInstance != null)
		{
			setPickingGeometry(getPickingGeometryProtoInstance());
			((X3DConcreteElement) pickingGeometryProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) pickingGeometryProtoInstance).getValidationResult());
		}
		if ((pickingGeometry != null) && (pickingGeometryProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both pickingGeometry and pickingGeometryProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasPickingGeometry()) // test USE restrictions
		{
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained SFNode pickingGeometry";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : pickTarget) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setPickTarget(getPickTarget()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasPickTarget()) // test USE restrictions
		{
			String errorNotice = "PointPickSensor USE='" + getUSE() + "' is not allowed to have contained MFNode pickTarget";
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
					"' for parent X3D model containing 'PointPickSensor' node, add head statement <component name='Picking' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Picking\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
