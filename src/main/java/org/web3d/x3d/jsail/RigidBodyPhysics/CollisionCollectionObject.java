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

package org.web3d.x3d.jsail.RigidBodyPhysics;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.RigidBodyPhysics.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.RigidBodyPhysics.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import java.util.Arrays;

/**
 * CollisionCollection holds a collection of objects that can be managed as a single entity for resolution of inter-object collisions.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DChildNode] CollisionCollection holds a collection of objects that can be managed as a single entity for resolution of inter-object collisions.
 * <ul>
 *  <li> <i> Hint:</i>  contains an array of CollisionSpace, CollidableShape or CollidableOffset nodes (containerField='collidables'). </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#CollisionCollection" target="blank">X3D Abstract Specification: CollisionCollection</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#CollisionCollection" target="_blank">X3D Tooltips: CollisionCollection</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class CollisionCollectionObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.RigidBodyPhysics.CollisionCollection
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=appliedParameters, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=appliedParameters, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> appliedParameters = new ArrayList<>(); // MFString

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=bounce, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=bounce, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float bounce; // SFFloat

 /* @name=collidables, @type=MFNode, $javaType=ArrayList<X3DNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DNode>, $normalizedMemberObjectName=collidables, $isX3dStatement=false, @acceptableNodeTypes=X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode */ 
	private ArrayList<X3DNode> collidables = new ArrayList<>(); // MFNode acceptable node types: X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode or ProtoInstanceObject

 /* @name=enabled, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=enabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean enabled; // SFBool

 /* @name=frictionCoefficients, @type=SFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=frictionCoefficients, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] frictionCoefficients; // SFVec2f

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=minBounceSpeed, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=minBounceSpeed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float minBounceSpeed; // SFFloat

 /* @name=slipFactors, @type=SFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=slipFactors, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] slipFactors; // SFVec2f

 /* @name=softnessConstantForceMix, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=softnessConstantForceMix, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float softnessConstantForceMix; // SFFloat

 /* @name=softnessErrorCorrection, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=softnessErrorCorrection, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float softnessErrorCorrection; // SFFloat

 /* @name=surfaceSpeed, @type=SFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=surfaceSpeed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] surfaceSpeed; // SFVec2f

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;BOUNCE&#34;", "&#34;USER_FRICTION&#34;", "&#34;FRICTION_COEFFICIENT-2&#34;", "&#34;ERROR_REDUCTION&#34;", "&#34;CONSTANT_FORCE&#34;", "&#34;SPEED-1&#34;", "&#34;SPEED-2&#34;", "&#34;SLIP-1&#34;", "&#34;SLIP-2&#34;".
<br ><br >
	 * Default global parameters for collision outputs of rigid body physics system. Contact node can override parent CollisionCollection node. Multiple optional values, but appliedParameters enumerations cannot be extended.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#t-AppliedParametersValidValues" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#t-AppliedParametersValidValues</a> 
	*/
	public static final ArrayList<String> appliedParametersChoices = new ArrayList<>(Arrays.<String>asList("\"BOUNCE\"", "\"USER_FRICTION\"", "\"FRICTION_COEFFICIENT-2\"", "\"ERROR_REDUCTION\"", "\"CONSTANT_FORCE\"", "\"SPEED-1\"", "\"SPEED-2\"", "\"SLIP-1\"", "\"SLIP-2\""));

	/** 
	 * <i>Tooltip:</i> The bounce field value is used.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"BOUNCE"</i> (Java syntax) or <i>'"BOUNCE"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_BOUNCE = "BOUNCE";

	/** 
	 * <i>Tooltip:</i> The system will normally calculate the friction direction vector that is perpendicular to the contact normal. This setting indicates that the user-supplied value in this contact should be used.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"USER_FRICTION"</i> (Java syntax) or <i>'"USER_FRICTION"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_USER_FRICTION = "USER_FRICTION";

	/** 
	 * <i>Tooltip:</i> Apply frictionCoefficients values.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"FRICTION_COEFFICIENT-2"</i> (Java syntax) or <i>'"FRICTION_COEFFICIENT-2"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2 = "FRICTION_COEFFICIENT-2";

	/** 
	 * <i>Tooltip:</i> Apply softnessErrorCorrection value.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"ERROR_REDUCTION"</i> (Java syntax) or <i>'"ERROR_REDUCTION"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_ERROR_REDUCTION = "ERROR_REDUCTION";

	/** 
	 * <i>Tooltip:</i> Apply softnessConstantForceMix value.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"CONSTANT_FORCE"</i> (Java syntax) or <i>'"CONSTANT_FORCE"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_CONSTANT_FORCE = "CONSTANT_FORCE";

	/** 
	 * <i>Tooltip:</i> Apply first component of surfaceSpeed array.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"SPEED-1"</i> (Java syntax) or <i>'"SPEED-1"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_SPEED_1 = "SPEED-1";

	/** 
	 * <i>Tooltip:</i> Apply second component of surfaceSpeed array.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"SPEED-2"</i> (Java syntax) or <i>'"SPEED-2"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_SPEED_2 = "SPEED-2";

	/** 
	 * <i>Tooltip:</i> Apply first component of slipFactors array.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"SLIP-1"</i> (Java syntax) or <i>'"SLIP-1"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_SLIP_1 = "SLIP-1";

	/** 
	 * <i>Tooltip:</i> Apply second component of slipFactors array.
	 * MFString field named <i>appliedParameters</i> with X3DUOM baseType <i>appliedParametersChoices</i> is an array that can only include one set of the quoted enumeration values <i>"SLIP-2"</i> (Java syntax) or <i>'"SLIP-2"'</i> (XML syntax).
	 * @see #appliedParametersChoices */
	public static final String APPLIEDPARAMETERS_SLIP_2 = "SLIP-2";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>CollisionCollection</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "CollisionCollection";

	/** Provides name of this element: <i>CollisionCollection</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>CollisionCollection</i> element: <i>RigidBodyPhysics</i> */
	public static final String COMPONENT = "RigidBodyPhysics";

	/** Defines X3D component for the <i>CollisionCollection</i> element: <i>RigidBodyPhysics</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>RigidBodyPhysics</i> component level for this element: <i>1</i> */
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

	/** MFString field named <i>appliedParameters</i> has default quoted value <i>new String[] {"BOUNCE"}</i> (Java syntax) or quoted value <i>"BOUNCE"</i> (XML syntax). */
	public static final ArrayList<String> APPLIEDPARAMETERS_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("BOUNCE"));

	/** SFVec3f field named <i>bboxCenter</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BBOXCENTER_DEFAULT_VALUE = {0f,0f,0f};

	/** SFVec3f field named <i>bboxSize</i> has default value <i>{-1f,-1f,-1f}</i> (Java syntax) or <i>-1 -1 -1</i> (XML syntax). */
	public static final float[] BBOXSIZE_DEFAULT_VALUE = {-1f,-1f,-1f};

	/** SFFloat field named <i>bounce</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float BOUNCE_DEFAULT_VALUE = 0f;

	/** SFBool field named <i>enabled</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean ENABLED_DEFAULT_VALUE = true;

	/** SFVec2f field named <i>frictionCoefficients</i> has default value <i>{0f,0f}</i> (Java syntax) or <i>0 0</i> (XML syntax). */
	public static final float[] FRICTIONCOEFFICIENTS_DEFAULT_VALUE = {0f,0f};

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFFloat field named <i>minBounceSpeed</i> has default value <i>0.1f</i> (Java syntax) or <i>0.1</i> (XML syntax). */
	public static final float MINBOUNCESPEED_DEFAULT_VALUE = 0.1f;

	/** SFVec2f field named <i>slipFactors</i> has default value <i>{0f,0f}</i> (Java syntax) or <i>0 0</i> (XML syntax). */
	public static final float[] SLIPFACTORS_DEFAULT_VALUE = {0f,0f};

	/** SFFloat field named <i>softnessConstantForceMix</i> has default value <i>0.0001f</i> (Java syntax) or <i>0.0001</i> (XML syntax). */
	public static final float SOFTNESSCONSTANTFORCEMIX_DEFAULT_VALUE = 0.0001f;

	/** SFFloat field named <i>softnessErrorCorrection</i> has default value <i>0.8f</i> (Java syntax) or <i>0.8</i> (XML syntax). */
	public static final float SOFTNESSERRORCORRECTION_DEFAULT_VALUE = 0.8f;

	/** SFVec2f field named <i>surfaceSpeed</i> has default value <i>{0f,0f}</i> (Java syntax) or <i>0 0</i> (XML syntax). */
	public static final float[] SURFACESPEED_DEFAULT_VALUE = {0f,0f};

	/** SFBool field named <i>visible</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean VISIBLE_DEFAULT_VALUE = true;

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
			case "appliedParameters":
				result = "MFString";
				break;
			case "bboxCenter":
				result = "SFVec3f";
				break;
			case "bboxSize":
				result = "SFVec3f";
				break;
			case "bounce":
				result = "SFFloat";
				break;
			case "collidables":
				result = "MFNode";
				break;
			case "enabled":
				result = "SFBool";
				break;
			case "frictionCoefficients":
				result = "SFVec2f";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "minBounceSpeed":
				result = "SFFloat";
				break;
			case "slipFactors":
				result = "SFVec2f";
				break;
			case "softnessConstantForceMix":
				result = "SFFloat";
				break;
			case "softnessErrorCorrection":
				result = "SFFloat";
				break;
			case "surfaceSpeed":
				result = "SFVec2f";
				break;
			case "visible":
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
			case "appliedParameters":
				result = "inputOutput";
				break;
			case "bboxCenter":
				result = "initializeOnly";
				break;
			case "bboxSize":
				result = "initializeOnly";
				break;
			case "bounce":
				result = "inputOutput";
				break;
			case "collidables":
				result = "inputOutput";
				break;
			case "enabled":
				result = "inputOutput";
				break;
			case "frictionCoefficients":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "minBounceSpeed":
				result = "inputOutput";
				break;
			case "slipFactors":
				result = "inputOutput";
				break;
			case "softnessConstantForceMix":
				result = "inputOutput";
				break;
			case "softnessErrorCorrection":
				result = "inputOutput";
				break;
			case "surfaceSpeed":
				result = "inputOutput";
				break;
			case "visible":
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
	public static final String containerField_DEFAULT_VALUE = "collider"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for MFString field named <i>appliedParameters</i>. */
	public static final String fromField_APPLIEDPARAMETERS = "appliedParameters";

	/** toField ROUTE name for MFString field named <i>appliedParameters</i>. */
	public static final String toField_APPLIEDPARAMETERS = "appliedParameters";

	/** fromField ROUTE name for SFFloat field named <i>bounce</i>. */
	public static final String fromField_BOUNCE = "bounce";

	/** toField ROUTE name for SFFloat field named <i>bounce</i>. */
	public static final String toField_BOUNCE = "bounce";

	/** fromField ROUTE name for MFNode field named <i>collidables</i>. */
	public static final String fromField_COLLIDABLES = "collidables";

	/** toField ROUTE name for MFNode field named <i>collidables</i>. */
	public static final String toField_COLLIDABLES = "collidables";

	/** fromField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String fromField_ENABLED = "enabled";

	/** toField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String toField_ENABLED = "enabled";

	/** fromField ROUTE name for SFVec2f field named <i>frictionCoefficients</i>. */
	public static final String fromField_FRICTIONCOEFFICIENTS = "frictionCoefficients";

	/** toField ROUTE name for SFVec2f field named <i>frictionCoefficients</i>. */
	public static final String toField_FRICTIONCOEFFICIENTS = "frictionCoefficients";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFFloat field named <i>minBounceSpeed</i>. */
	public static final String fromField_MINBOUNCESPEED = "minBounceSpeed";

	/** toField ROUTE name for SFFloat field named <i>minBounceSpeed</i>. */
	public static final String toField_MINBOUNCESPEED = "minBounceSpeed";

	/** fromField ROUTE name for SFVec2f field named <i>slipFactors</i>. */
	public static final String fromField_SLIPFACTORS = "slipFactors";

	/** toField ROUTE name for SFVec2f field named <i>slipFactors</i>. */
	public static final String toField_SLIPFACTORS = "slipFactors";

	/** fromField ROUTE name for SFFloat field named <i>softnessConstantForceMix</i>. */
	public static final String fromField_SOFTNESSCONSTANTFORCEMIX = "softnessConstantForceMix";

	/** toField ROUTE name for SFFloat field named <i>softnessConstantForceMix</i>. */
	public static final String toField_SOFTNESSCONSTANTFORCEMIX = "softnessConstantForceMix";

	/** fromField ROUTE name for SFFloat field named <i>softnessErrorCorrection</i>. */
	public static final String fromField_SOFTNESSERRORCORRECTION = "softnessErrorCorrection";

	/** toField ROUTE name for SFFloat field named <i>softnessErrorCorrection</i>. */
	public static final String toField_SOFTNESSERRORCORRECTION = "softnessErrorCorrection";

	/** fromField ROUTE name for SFVec2f field named <i>surfaceSpeed</i>. */
	public static final String fromField_SURFACESPEED = "surfaceSpeed";

	/** toField ROUTE name for SFVec2f field named <i>surfaceSpeed</i>. */
	public static final String toField_SURFACESPEED = "surfaceSpeed";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for CollisionCollectionObject to initialize member variables with default values. */
	public CollisionCollectionObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "collider" }; // type xs:NMTOKEN

		appliedParameters = new ArrayList<>(APPLIEDPARAMETERS_DEFAULT_VALUE);
		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		bounce = BOUNCE_DEFAULT_VALUE;
		collidables = new ArrayList<>();
		enabled = ENABLED_DEFAULT_VALUE;
		frictionCoefficients = FRICTIONCOEFFICIENTS_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		minBounceSpeed = MINBOUNCESPEED_DEFAULT_VALUE;
		slipFactors = SLIPFACTORS_DEFAULT_VALUE;
		softnessConstantForceMix = SOFTNESSCONSTANTFORCEMIX_DEFAULT_VALUE;
		softnessErrorCorrection = SOFTNESSERRORCORRECTION_DEFAULT_VALUE;
		surfaceSpeed = SURFACESPEED_DEFAULT_VALUE;
		visible = VISIBLE_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String enumeration results (baseType appliedParametersChoices) ['"BOUNCE"' | '"USER_FRICTION"' | '"FRICTION_COEFFICIENT-2"' | '"ERROR_REDUCTION"' | '"CONSTANT_FORCE"' | '"SPEED-1"' | '"SPEED-2"' | '"SLIP-1"' | '"SLIP-2"'] from inputOutput MFString field named <i>appliedParameters</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default global parameters for collision outputs of rigid body physics system. Contact node can override parent CollisionCollection node. Selectable values for array: "BOUNCE" "USER_FRICTION" "FRICTION_COEFFICIENT-2" "ERROR_REDUCTION" "CONSTANT_FORCE" "SPEED-1" "SPEED-2" "SLIP-1" "SLIP-2".
 * <ul>
 *  <li> <i> Hint:</i>  BOUNCE: bounce value is used; USER_FRICTION: apply user-supplied value; FRICTION_COEFFICIENT-2: apply frictionCoefficients values; ERROR_REDUCTION: apply softnessErrorCorrection value; CONSTANT_FORCE: apply softnessConstantForceMix value; SPEED-1: apply first component of surfaceSpeed array; SPEED-2: apply second component of surfaceSpeed array; SLIP-1: apply first component of slipFactors array; SLIP-2: apply second component of slipFactors array. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #APPLIEDPARAMETERS_BOUNCE BOUNCE}, {@link #APPLIEDPARAMETERS_USER_FRICTION USER_FRICTION}, {@link #APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2 FRICTION_COEFFICIENT_2}, {@link #APPLIEDPARAMETERS_ERROR_REDUCTION ERROR_REDUCTION}, {@link #APPLIEDPARAMETERS_CONSTANT_FORCE CONSTANT_FORCE}, {@link #APPLIEDPARAMETERS_SPEED_1 SPEED_1}, {@link #APPLIEDPARAMETERS_SPEED_2 SPEED_2}, {@link #APPLIEDPARAMETERS_SLIP_1 SLIP_1}, {@link #APPLIEDPARAMETERS_SLIP_2 SLIP_2}.
	 * @return value of appliedParameters field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getAppliedParameters()
	{
		final String[] valuesArray = new String[appliedParameters.size()];
		int i = 0;
		for (String arrayElement : appliedParameters) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString appliedParameters field, similar to {@link #getAppliedParameters()}.
	 * @return value of appliedParameters field
	 */
	public ArrayList<String> getAppliedParametersList()
	{
		return appliedParameters;
	}
	/**
	 * Utility method to get String value of MFString appliedParameters field, similar to {@link #getAppliedParameters()}.
	 * @return value of appliedParameters field
	 */
	public String getAppliedParametersString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : appliedParameters) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""BOUNCE"" | ""USER_FRICTION"" | ""FRICTION_COEFFICIENT-2"" | ""ERROR_REDUCTION"" | ""CONSTANT_FORCE"" | ""SPEED-1"" | ""SPEED-2"" | ""SLIP-1"" | ""SLIP-2"") to inputOutput MFString field named <i>appliedParameters</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #APPLIEDPARAMETERS_BOUNCE BOUNCE}, {@link #APPLIEDPARAMETERS_USER_FRICTION USER_FRICTION}, {@link #APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2 FRICTION_COEFFICIENT_2}, {@link #APPLIEDPARAMETERS_ERROR_REDUCTION ERROR_REDUCTION}, {@link #APPLIEDPARAMETERS_CONSTANT_FORCE CONSTANT_FORCE}, {@link #APPLIEDPARAMETERS_SPEED_1 SPEED_1}, {@link #APPLIEDPARAMETERS_SPEED_2 SPEED_2}, {@link #APPLIEDPARAMETERS_SLIP_1 SLIP_1}, {@link #APPLIEDPARAMETERS_SLIP_2 SLIP_2}).
	 * <br><br>
	 * <i>Tooltip:</i> Default global parameters for collision outputs of rigid body physics system. Contact node can override parent CollisionCollection node. Selectable values for array: "BOUNCE" "USER_FRICTION" "FRICTION_COEFFICIENT-2" "ERROR_REDUCTION" "CONSTANT_FORCE" "SPEED-1" "SPEED-2" "SLIP-1" "SLIP-2".
 * <ul>
 *  <li> <i> Hint:</i>  BOUNCE: bounce value is used; USER_FRICTION: apply user-supplied value; FRICTION_COEFFICIENT-2: apply frictionCoefficients values; ERROR_REDUCTION: apply softnessErrorCorrection value; CONSTANT_FORCE: apply softnessConstantForceMix value; SPEED-1: apply first component of surfaceSpeed array; SPEED-2: apply second component of surfaceSpeed array; SLIP-1: apply first component of slipFactors array; SLIP-2: apply second component of slipFactors array. </li> 
 * </ul>
	 * @param newValue is new value for the appliedParameters field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setAppliedParameters(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearAppliedParameters(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(APPLIEDPARAMETERS_BOUNCE) ||
			newValue[i].equals(APPLIEDPARAMETERS_USER_FRICTION) ||
			newValue[i].equals(APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2) ||
			newValue[i].equals(APPLIEDPARAMETERS_ERROR_REDUCTION) ||
			newValue[i].equals(APPLIEDPARAMETERS_CONSTANT_FORCE) ||
			newValue[i].equals(APPLIEDPARAMETERS_SPEED_1) ||
			newValue[i].equals(APPLIEDPARAMETERS_SPEED_2) ||
			newValue[i].equals(APPLIEDPARAMETERS_SLIP_1) ||
			newValue[i].equals(APPLIEDPARAMETERS_SLIP_2)))
		{
			String warningMessage = "Warning: CollisionCollection appliedParameters newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
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
			clearAppliedParameters(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearAppliedParameters(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			appliedParameters.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString appliedParameters field, similar to {@link #setAppliedParameters(String[])}.
	 * @param newValue is new value for the appliedParameters field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setAppliedParameters(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearAppliedParameters(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAppliedParameters(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString appliedParameters field, similar to {@link #setAppliedParameters(String[])}.
	 * @param newValue is new value for the appliedParameters field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setAppliedParameters(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearAppliedParameters(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearAppliedParameters(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(APPLIEDPARAMETERS_BOUNCE) ||
			newValue.equals(APPLIEDPARAMETERS_USER_FRICTION) ||
			newValue.equals(APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2) ||
			newValue.equals(APPLIEDPARAMETERS_ERROR_REDUCTION) ||
			newValue.equals(APPLIEDPARAMETERS_CONSTANT_FORCE) ||
			newValue.equals(APPLIEDPARAMETERS_SPEED_1) ||
			newValue.equals(APPLIEDPARAMETERS_SPEED_2) ||
			newValue.equals(APPLIEDPARAMETERS_SLIP_1) ||
			newValue.equals(APPLIEDPARAMETERS_SLIP_2)))
		{
			String warningMessage = "Warning: CollisionCollection appliedParameters newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.getValue().isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setAppliedParameters(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString appliedParameters field, similar to {@link #setAppliedParameters(String[])}.
	 * @param newValue is new value for the appliedParameters field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setAppliedParameters(String newValue)
	{
		if (newValue == null)		{
			clearAppliedParameters(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearAppliedParameters(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(APPLIEDPARAMETERS_BOUNCE) ||
			newValue.equals(APPLIEDPARAMETERS_USER_FRICTION) ||
			newValue.equals(APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2) ||
			newValue.equals(APPLIEDPARAMETERS_ERROR_REDUCTION) ||
			newValue.equals(APPLIEDPARAMETERS_CONSTANT_FORCE) ||
			newValue.equals(APPLIEDPARAMETERS_SPEED_1) ||
			newValue.equals(APPLIEDPARAMETERS_SPEED_2) ||
			newValue.equals(APPLIEDPARAMETERS_SLIP_1) ||
			newValue.equals(APPLIEDPARAMETERS_SLIP_2)))
		{
			String warningMessage = "Warning: CollisionCollection appliedParameters newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setAppliedParameters(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString appliedParameters field, similar to {@link #setAppliedParameters(String[])}.
	 * @param newValue is new value for the appliedParameters field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setAppliedParameters(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearAppliedParameters(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearAppliedParameters(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(APPLIEDPARAMETERS_BOUNCE) ||
			newValue.equals(APPLIEDPARAMETERS_USER_FRICTION) ||
			newValue.equals(APPLIEDPARAMETERS_FRICTION_COEFFICIENT_2) ||
			newValue.equals(APPLIEDPARAMETERS_ERROR_REDUCTION) ||
			newValue.equals(APPLIEDPARAMETERS_CONSTANT_FORCE) ||
			newValue.equals(APPLIEDPARAMETERS_SPEED_1) ||
			newValue.equals(APPLIEDPARAMETERS_SPEED_2) ||
			newValue.equals(APPLIEDPARAMETERS_SLIP_1) ||
			newValue.equals(APPLIEDPARAMETERS_SLIP_2)))
		{
			String warningMessage = "Warning: CollisionCollection appliedParameters newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!(newValue.size() == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        if (newValue.isEmpty())
            clearAppliedParameters(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setAppliedParameters(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of appliedParameters field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public CollisionCollectionObject clearAppliedParameters()
	{
		appliedParameters.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString appliedParameters field.
	 * @param newValue is new value to add to the appliedParameters field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject addAppliedParameters(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !appliedParameters.contains(newValue))
            appliedParameters.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString appliedParameters field.
	 * @param newValue is new value to add to the appliedParameters field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject addAppliedParameters(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !appliedParameters.contains(newValue.getValue()))
            appliedParameters.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of 3-tuple float results from initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * @return value of bboxCenter field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getBboxCenter()
	{
		return bboxCenter;
	}

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxCenter(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBboxCenter(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxCenter(double[] newArray)
	{
		return setBboxCenter(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results within allowed range of [0,infinity), or default value [-1 -1 -1], from initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * @return value of bboxSize field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getBboxSize()
	{
		return bboxSize;
	}

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxSize(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBboxSize(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] bounce indicates bounciness (0 = no bounce at all, 1 = maximum bounce).  * <br>

	 * @return value of bounce field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float getBounce()
	{
		return bounce;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] bounce indicates bounciness (0 = no bounce at all, 1 = maximum bounce).  * <br>

	 * @param newValue is new value for the bounce field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setBounce(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection bounce newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection bounce newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		bounce = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat bounce field, similar to {@link #setBounce(float)}.
	 * @param newValue is new value for the bounce field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBounce(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBounce(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setBounce(float)}.
	 * @param newValue is new value for field
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setBounce(double newValue)
	{
		return setBounce((float) newValue);
	}
	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode, from inputOutput MFNode field <i>collidables</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [CollisionSpace|CollidableShape|CollidableOffset] CollisionCollection node holds a collection of objects in the collidables field that can be managed as a single entity for resolution of inter-object collisions with other groups of collidable objects. A group consists of both collidable objects as well as spaces that may be collided against each other.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @see org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollisionSpaceNode
	 * @see org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode
	 * @return value of collidables field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getCollidables()
	{
		final X3DNode[] valuesArray = new X3DNode[collidables.size()];
		int i = 0;
		for (X3DNode arrayElement : collidables) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode collidables field, similar to {@link #getCollidables()}.
	 * @return value of collidables field
	 */
	public ArrayList<X3DNode> getCollidablesList()
	{
		return collidables;
	}

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>collidables</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollisionSpaceNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i>  [CollisionSpace|CollidableShape|CollidableOffset] CollisionCollection node holds a collection of objects in the collidables field that can be managed as a single entity for resolution of inter-object collisions with other groups of collidable objects. A group consists of both collidable objects as well as spaces that may be collided against each other.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @param newValue is new value for the collidables field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setCollidables(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearCollidables(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof X3DNBodyCollisionSpaceNode) || 
				(((X3DConcreteNode)newValue[i]) instanceof X3DNBodyCollidableNode);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; newValue["+i+"]=" + newValue[i]);
			}
		}
		clearCollidables(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				collidables.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode collidables field, similar to {@link #setCollidables(X3DNode[])}.
	 * @param newValue is new value for the collidables field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setCollidables(ArrayList<X3DNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearCollidables(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4

		// newValueArrayListAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #3
		for (X3DNode element : newValue)
		{
			boolean isNodeTypeAllowed = 
				(element instanceof X3DNBodyCollisionSpaceNode) || 
				(element instanceof X3DNBodyCollidableNode);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] element is not instanceof " +
					"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; element=" + element);
			}
		}
        if (newValue.isEmpty())
            clearCollidables(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setCollidables(newArray);
        }
		for (X3DNode element : newValue)
		{
			collidables.add(element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of collidables nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode and ProtoInstance.
	 * @param newValue is new value to be appended the collidables field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public CollisionCollectionObject addCollidables(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollisionSpaceNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; newValue=" + newValue);
		}
		collidables.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for collidables field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public CollisionCollectionObject addCollidables(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		collidables.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child collidables nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @param newValue is new value array to be appended the collidables field.
	 */
	@Override // or here2?
	public void addCollidables(X3DNode[] newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof X3DNBodyCollisionSpaceNode) || 
				(((X3DConcreteNode)newValue[i]) instanceof X3DNBodyCollidableNode);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; newValue["+i+"]=" + newValue[i]);
			}
		}
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				collidables.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("collidables");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child collidables node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @param newValue is new node for the collidables field (restricted to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode)
	 */
	@Override
	public void setCollidables(X3DNode newValue)
	{
		if (newValue == null)
		{
			clearCollidables(); // reset newValueNullClearsFieldReturnVoid
			return;
		}

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollisionSpaceNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; newValue=" + newValue);
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : collidables)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearCollidables(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			collidables.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of collidables field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public CollisionCollectionObject clearCollidables()
	{
		for (X3DNode element : collidables)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		collidables.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>collidables</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getCollidables()
	 */
	public boolean hasCollidables()
	{
		return (!collidables.isEmpty());
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setEnabled(boolean newValue)
	{
		// set-newValue-validity-checks #0
		enabled = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool enabled field, similar to {@link #setEnabled(boolean)}.
	 * @param newValue is new value for the enabled field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setEnabled(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of 2-tuple float results within allowed range of [0,infinity) from inputOutput SFVec2f field named <i>frictionCoefficients</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  frictionCoefficients used for computing surface drag.  * <br>

	 * @return value of frictionCoefficients field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getFrictionCoefficients()
	{
		return frictionCoefficients;
	}

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>frictionCoefficients</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  frictionCoefficients used for computing surface drag.  * <br>

	 * @param newValue is new value for the frictionCoefficients field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setFrictionCoefficients(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 2) // 2-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection frictionCoefficients newValue=" + SFVec2fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 2");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection frictionCoefficients newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		frictionCoefficients = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec2f frictionCoefficients field, similar to {@link #setFrictionCoefficients(float[])}.
	 * @param newValue is new value for the frictionCoefficients field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setFrictionCoefficients(SFVec2fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setFrictionCoefficients(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec2f frictionCoefficients field, similar to {@link #setFrictionCoefficients(float[])}.

	 * @param x first component
	 * @param y second component

	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setFrictionCoefficients(float x, float y)
	{
		setFrictionCoefficients(new float[] {x, y});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setFrictionCoefficients(float[])}.
	 * @param x first component
	 * @param y second component
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setFrictionCoefficients(double x, double y)
	{
		return setFrictionCoefficients(new SFVec2fObject(x, y));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setFrictionCoefficients(float[])}.
	 * @param newArray is new value for field                          
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setFrictionCoefficients(double[] newArray)
	{
		return setFrictionCoefficients(new SFVec2fObject(newArray));
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setIS(ISObject newValue)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public CollisionCollectionObject clearIS()
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public CollisionCollectionObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>minBounceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) minBounceSpeed m/s needed to bounce.  * <br>

	 * @return value of minBounceSpeed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float getMinBounceSpeed()
	{
		return minBounceSpeed;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minBounceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) minBounceSpeed m/s needed to bounce.  * <br>

	 * @param newValue is new value for the minBounceSpeed field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setMinBounceSpeed(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection minBounceSpeed newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		minBounceSpeed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat minBounceSpeed field, similar to {@link #setMinBounceSpeed(float)}.
	 * @param newValue is new value for the minBounceSpeed field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setMinBounceSpeed(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMinBounceSpeed(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMinBounceSpeed(float)}.
	 * @param newValue is new value for field
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setMinBounceSpeed(double newValue)
	{
		return setMinBounceSpeed((float) newValue);
	}
	/**
	 * Provide array of 2-tuple float results from inputOutput SFVec2f field named <i>slipFactors</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  slipFactors used for computing surface drag.  * <br>

	 * @return value of slipFactors field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getSlipFactors()
	{
		return slipFactors;
	}

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>slipFactors</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  slipFactors used for computing surface drag.  * <br>

	 * @param newValue is new value for the slipFactors field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setSlipFactors(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 2) // 2-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection slipFactors newValue=" + SFVec2fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 2");
		}
		slipFactors = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec2f slipFactors field, similar to {@link #setSlipFactors(float[])}.
	 * @param newValue is new value for the slipFactors field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSlipFactors(SFVec2fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSlipFactors(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec2f slipFactors field, similar to {@link #setSlipFactors(float[])}.

	 * @param x first component
	 * @param y second component

	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSlipFactors(float x, float y)
	{
		setSlipFactors(new float[] {x, y});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setSlipFactors(float[])}.
	 * @param x first component
	 * @param y second component
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSlipFactors(double x, double y)
	{
		return setSlipFactors(new SFVec2fObject(x, y));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setSlipFactors(float[])}.
	 * @param newArray is new value for field                          
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSlipFactors(double[] newArray)
	{
		return setSlipFactors(new SFVec2fObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>softnessConstantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessConstantForceMix value applies a constant force value to make colliding surfaces appear to be somewhat soft.  * <br>

	 * @return value of softnessConstantForceMix field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float getSoftnessConstantForceMix()
	{
		return softnessConstantForceMix;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>softnessConstantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessConstantForceMix value applies a constant force value to make colliding surfaces appear to be somewhat soft.  * <br>

	 * @param newValue is new value for the softnessConstantForceMix field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setSoftnessConstantForceMix(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection softnessConstantForceMix newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection softnessConstantForceMix newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		softnessConstantForceMix = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat softnessConstantForceMix field, similar to {@link #setSoftnessConstantForceMix(float)}.
	 * @param newValue is new value for the softnessConstantForceMix field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSoftnessConstantForceMix(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSoftnessConstantForceMix(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setSoftnessConstantForceMix(float)}.
	 * @param newValue is new value for field
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSoftnessConstantForceMix(double newValue)
	{
		return setSoftnessConstantForceMix((float) newValue);
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>softnessErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessErrorCorrection indicates fraction of collision error fixed in a set of evaluations (0 = no error correction, 1 = all errors corrected in single step).  * <br>

	 * @return value of softnessErrorCorrection field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float getSoftnessErrorCorrection()
	{
		return softnessErrorCorrection;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>softnessErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessErrorCorrection indicates fraction of collision error fixed in a set of evaluations (0 = no error correction, 1 = all errors corrected in single step).  * <br>

	 * @param newValue is new value for the softnessErrorCorrection field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setSoftnessErrorCorrection(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection softnessErrorCorrection newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection softnessErrorCorrection newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		softnessErrorCorrection = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat softnessErrorCorrection field, similar to {@link #setSoftnessErrorCorrection(float)}.
	 * @param newValue is new value for the softnessErrorCorrection field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSoftnessErrorCorrection(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSoftnessErrorCorrection(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setSoftnessErrorCorrection(float)}.
	 * @param newValue is new value for field
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSoftnessErrorCorrection(double newValue)
	{
		return setSoftnessErrorCorrection((float) newValue);
	}
	/**
	 * Provide array of 2-tuple float results from inputOutput SFVec2f field named <i>surfaceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  surfaceSpeed defines speed vectors for computing surface drag, if contact surfaces move independently of bodies.  * <br>

	 * @return value of surfaceSpeed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getSurfaceSpeed()
	{
		return surfaceSpeed;
	}

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>surfaceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  surfaceSpeed defines speed vectors for computing surface drag, if contact surfaces move independently of bodies.  * <br>

	 * @param newValue is new value for the surfaceSpeed field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setSurfaceSpeed(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 2) // 2-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection surfaceSpeed newValue=" + SFVec2fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 2");
		}
		surfaceSpeed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec2f surfaceSpeed field, similar to {@link #setSurfaceSpeed(float[])}.
	 * @param newValue is new value for the surfaceSpeed field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSurfaceSpeed(SFVec2fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSurfaceSpeed(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec2f surfaceSpeed field, similar to {@link #setSurfaceSpeed(float[])}.

	 * @param x first component
	 * @param y second component

	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSurfaceSpeed(float x, float y)
	{
		setSurfaceSpeed(new float[] {x, y});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setSurfaceSpeed(float[])}.
	 * @param x first component
	 * @param y second component
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSurfaceSpeed(double x, double y)
	{
		return setSurfaceSpeed(new SFVec2fObject(x, y));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setSurfaceSpeed(float[])}.
	 * @param newArray is new value for field                          
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setSurfaceSpeed(double[] newArray)
	{
		return setSurfaceSpeed(new SFVec2fObject(newArray));
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible()
	{
		return visible;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollectionObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setVisible(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVisible(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final CollisionCollectionObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to CollisionCollection DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection DEF newValue='" + newValue + "'" + 
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final CollisionCollectionObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to CollisionCollection USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection USE newValue='" + newValue + "'" + 
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final CollisionCollectionObject setCssClass(String newValue)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setCssClass(SFStringObject newValue)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollectionObject setUSE(CollisionCollectionObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on CollisionCollectionObject" +
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
	public CollisionCollectionObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public CollisionCollectionObject addComments (String newComment)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public CollisionCollectionObject addComments (String[] newComments)
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
	 * @return {@link CollisionCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public CollisionCollectionObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (!collidables.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<CollisionCollection"); // start opening tag
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

			if (((getAppliedParameters().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" appliedParameters='").append(new MFStringObject(getAppliedParameters()).toStringX3D()).append("'");
			}
			if ((!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxCenter='").append(SFVec3fObject.toString(getBboxCenter())).append("'");
			}
			if ((!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxSize='").append(SFVec3fObject.toString(getBboxSize())).append("'");
			}
			if (((getBounce() != BOUNCE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" bounce='").append(SFFloatObject.toString(getBounce())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" enabled='").append(SFBoolObject.toString(getEnabled())).append("'");
			}
			if ((!Arrays.equals(getFrictionCoefficients(), FRICTIONCOEFFICIENTS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" frictionCoefficients='").append(SFVec2fObject.toString(getFrictionCoefficients())).append("'");
			}
			if (((getMinBounceSpeed() != MINBOUNCESPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" minBounceSpeed='").append(SFFloatObject.toString(getMinBounceSpeed())).append("'");
			}
			if ((!Arrays.equals(getSlipFactors(), SLIPFACTORS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" slipFactors='").append(SFVec2fObject.toString(getSlipFactors())).append("'");
			}
			if (((getSoftnessConstantForceMix() != SOFTNESSCONSTANTFORCEMIX_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" softnessConstantForceMix='").append(SFFloatObject.toString(getSoftnessConstantForceMix())).append("'");
			}
			if (((getSoftnessErrorCorrection() != SOFTNESSERRORCORRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" softnessErrorCorrection='").append(SFFloatObject.toString(getSoftnessErrorCorrection())).append("'");
			}
			if ((!Arrays.equals(getSurfaceSpeed(), SURFACESPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" surfaceSpeed='").append(SFVec2fObject.toString(getSurfaceSpeed())).append("'");
			}
			if (((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" visible='").append(SFBoolObject.toString(getVisible())).append("'");
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
			for (X3DNode element : collidables)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</CollisionCollection>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=CollisionCollection, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (!collidables.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("CollisionCollection").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("appliedParameters"))
						{
							stringClassicVRML.append(indentCharacter).append("appliedParameters").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getAppliedParameters().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("appliedParameters ").append("[ ").append(MFStringObject.toString(getAppliedParameters())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("bboxCenter"))
						{
							stringClassicVRML.append(indentCharacter).append("bboxCenter").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bboxCenter ").append(SFVec3fObject.toString(getBboxCenter())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("bboxSize"))
						{
							stringClassicVRML.append(indentCharacter).append("bboxSize").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bboxSize ").append(SFVec3fObject.toString(getBboxSize())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("bounce"))
						{
							stringClassicVRML.append(indentCharacter).append("bounce").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getBounce() != BOUNCE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bounce ").append(SFFloatObject.toString(getBounce())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("frictionCoefficients"))
						{
							stringClassicVRML.append(indentCharacter).append("frictionCoefficients").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getFrictionCoefficients(), FRICTIONCOEFFICIENTS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("frictionCoefficients ").append(SFVec2fObject.toString(getFrictionCoefficients())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("minBounceSpeed"))
						{
							stringClassicVRML.append(indentCharacter).append("minBounceSpeed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMinBounceSpeed() != MINBOUNCESPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("minBounceSpeed ").append(SFFloatObject.toString(getMinBounceSpeed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("slipFactors"))
						{
							stringClassicVRML.append(indentCharacter).append("slipFactors").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getSlipFactors(), SLIPFACTORS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("slipFactors ").append(SFVec2fObject.toString(getSlipFactors())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("softnessConstantForceMix"))
						{
							stringClassicVRML.append(indentCharacter).append("softnessConstantForceMix").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSoftnessConstantForceMix() != SOFTNESSCONSTANTFORCEMIX_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("softnessConstantForceMix ").append(SFFloatObject.toString(getSoftnessConstantForceMix())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("softnessErrorCorrection"))
						{
							stringClassicVRML.append(indentCharacter).append("softnessErrorCorrection").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSoftnessErrorCorrection() != SOFTNESSERRORCORRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("softnessErrorCorrection ").append(SFFloatObject.toString(getSoftnessErrorCorrection())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("surfaceSpeed"))
						{
							stringClassicVRML.append(indentCharacter).append("surfaceSpeed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getSurfaceSpeed(), SURFACESPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("surfaceSpeed ").append(SFVec2fObject.toString(getSurfaceSpeed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("visible"))
						{
							stringClassicVRML.append(indentCharacter).append("visible").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("visible ").append(SFBoolObject.toString(getVisible())).append("\n").append(indent).append(indentCharacter);
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
			if (collidables.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("collidables").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : collidables)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
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
		for (X3DNode element : collidables) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
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
		for (X3DNode element : collidables) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
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

		setAppliedParameters(getAppliedParameters()); // exercise field checks, simple types
        
		setBboxCenter(getBboxCenter()); // exercise field checks, simple types
        
		setBboxSize(getBboxSize()); // exercise field checks, simple types
        
		setBounce(getBounce()); // exercise field checks, simple types
        
		setEnabled(getEnabled()); // exercise field checks, simple types
        
		setFrictionCoefficients(getFrictionCoefficients()); // exercise field checks, simple types
        
		setMinBounceSpeed(getMinBounceSpeed()); // exercise field checks, simple types
        
		setSlipFactors(getSlipFactors()); // exercise field checks, simple types
        
		setSoftnessConstantForceMix(getSoftnessConstantForceMix()); // exercise field checks, simple types
        
		setSoftnessErrorCorrection(getSoftnessErrorCorrection()); // exercise field checks, simple types
        
		setSurfaceSpeed(getSurfaceSpeed()); // exercise field checks, simple types
        
		setVisible(getVisible()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		for (X3DNode element : collidables) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setCollidables(getCollidables()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasCollidables()) // test USE restrictions
		{
			String errorNotice = "CollisionCollection USE='" + getUSE() + "' is not allowed to have contained MFNode collidables";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "CollisionCollection USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "CollisionCollection USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "CollisionCollection USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "CollisionCollection USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'CollisionCollection' node, add head statement <component name='RigidBodyPhysics' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"RigidBodyPhysics\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
