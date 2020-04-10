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
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.RigidBodyPhysics.*;
import org.web3d.x3d.sai.RigidBodyPhysics.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.RigidBodyPhysics.*;
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

/**
 * SliderJoint constrains all movement between body1 and body2 along a single axis. Contains two RigidBody nodes (containerField values body1, body2).
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DRigidJointNode] SliderJoint constrains all movement between body1 and body2 along a single axis. Contains two RigidBody nodes (containerField values body1, body2).
 * <ul>
 *  <li> <i> Hint:</i>  RigidBodyPhysics component, level 2. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#SliderJoint" target="blank">X3D Abstract Specification: SliderJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SliderJoint" target="_blank">X3D Tooltips: SliderJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class SliderJointObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.RigidBodyPhysics.SliderJoint
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=axis, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=axis, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] axis; // SFVec3f

 /* @name=body1, @type=SFNode, $javaType=RigidBodyObject, $javaReferenceType=RigidBodyObject, $javaPrimitiveType=RigidBodyObject, $normalizedMemberObjectName=body1, $isX3dStatement=false, @acceptableNodeTypes=RigidBody */ 
	private RigidBodyObject body1; // SFNode acceptable node types: RigidBody or ProtoInstanceObject
	private ProtoInstanceObject body1ProtoInstance; // allowed alternative for body1 field

 /* @name=body2, @type=SFNode, $javaType=RigidBodyObject, $javaReferenceType=RigidBodyObject, $javaPrimitiveType=RigidBodyObject, $normalizedMemberObjectName=body2, $isX3dStatement=false, @acceptableNodeTypes=RigidBody */ 
	private RigidBodyObject body2; // SFNode acceptable node types: RigidBody or ProtoInstanceObject
	private ProtoInstanceObject body2ProtoInstance; // allowed alternative for body2 field

 /* @name=forceOutput, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=forceOutput, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> forceOutput = new ArrayList<>(); // MFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=maxSeparation, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=maxSeparation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float maxSeparation; // SFFloat

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=minSeparation, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=minSeparation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float minSeparation; // SFFloat

 /* @name=separation, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=separation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float separation; // SFFloat

 /* @name=separationRate, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=separationRate, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float separationRate; // SFFloat

 /* @name=sliderForce, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=sliderForce, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float sliderForce; // SFFloat

 /* @name=stopBounce, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=stopBounce, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float stopBounce; // SFFloat

 /* @name=stopErrorCorrection, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=stopErrorCorrection, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float stopErrorCorrection; // SFFloat

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;ALL&#34;", "&#34;NONE&#34;".
<br ><br >
	 * forceOutputValues are suggested values for X3DRigidJointNode type forceOutput field. Unbounded, additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#X3DRigidJointNode" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#X3DRigidJointNode</a> 
	*/
	public static final ArrayList<String> forceOutputValues = new ArrayList<>(Arrays.<String>asList("\"ALL\"", "\"NONE\""));

	/** MFString field named <i>forceOutput</i> with X3DUOM baseType <i>forceOutputValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"ALL"</i> (Java syntax) or <i>'"ALL"'</i> (XML syntax).
	 * @see #forceOutputValues */
	public static final String FORCEOUTPUT_ALL = "ALL";

	/** MFString field named <i>forceOutput</i> with X3DUOM baseType <i>forceOutputValues</i> is an array that can include this quoted enumeration value (and also may include alternate values) <i>"NONE"</i> (Java syntax) or <i>'"NONE"'</i> (XML syntax).
	 * @see #forceOutputValues */
	public static final String FORCEOUTPUT_NONE = "NONE";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>SliderJoint</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "SliderJoint";

	/** Provides name of this element: <i>SliderJoint</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>SliderJoint</i> element: <i>RigidBodyPhysics</i> */
	public static final String COMPONENT = "RigidBodyPhysics";

	/** Defines X3D component for the <i>SliderJoint</i> element: <i>RigidBodyPhysics</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>RigidBodyPhysics</i> component level for this element: <i>2</i> */
	public static final int LEVEL = 2;

	/** Provides default X3D component level for this element: <i>2</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFVec3f field named <i>axis</i> has default value <i>{0f,1f,0f}</i> (Java syntax) or <i>0 1 0</i> (XML syntax). */
	public static final float[] AXIS_DEFAULT_VALUE = {0f,1f,0f};

	/** SFNode field named <i>body1</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final RigidBodyObject BODY1_DEFAULT_VALUE = null;

	/** SFNode field named <i>body2</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final RigidBodyObject BODY2_DEFAULT_VALUE = null;

	/** MFString field named <i>forceOutput</i> has default quoted value <i>new String[] {"NONE"}</i> (Java syntax) or quoted value <i>"NONE"</i> (XML syntax). */
	public static final ArrayList<String> FORCEOUTPUT_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("NONE"));

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFFloat field named <i>maxSeparation</i> has default value <i>1f</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final float MAXSEPARATION_DEFAULT_VALUE = 1f;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFFloat field named <i>minSeparation</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float MINSEPARATION_DEFAULT_VALUE = 0f;

	/** SFFloat field named <i>sliderForce</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float SLIDERFORCE_DEFAULT_VALUE = 0f;

	/** SFFloat field named <i>stopBounce</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float STOPBOUNCE_DEFAULT_VALUE = 0f;

	/** SFFloat field named <i>stopErrorCorrection</i> has default value <i>1f</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final float STOPERRORCORRECTION_DEFAULT_VALUE = 1f;

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
			case "axis":
				result = "SFVec3f";
				break;
			case "body1":
				result = "SFNode";
				break;
			case "body2":
				result = "SFNode";
				break;
			case "forceOutput":
				result = "MFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "maxSeparation":
				result = "SFFloat";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "minSeparation":
				result = "SFFloat";
				break;
			case "separation":
				result = "SFFloat";
				break;
			case "separationRate":
				result = "SFFloat";
				break;
			case "sliderForce":
				result = "SFFloat";
				break;
			case "stopBounce":
				result = "SFFloat";
				break;
			case "stopErrorCorrection":
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
			case "axis":
				result = "inputOutput";
				break;
			case "body1":
				result = "inputOutput";
				break;
			case "body2":
				result = "inputOutput";
				break;
			case "forceOutput":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "maxSeparation":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "minSeparation":
				result = "inputOutput";
				break;
			case "separation":
				result = "outputOnly";
				break;
			case "separationRate":
				result = "outputOnly";
				break;
			case "sliderForce":
				result = "inputOutput";
				break;
			case "stopBounce":
				result = "inputOutput";
				break;
			case "stopErrorCorrection":
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
	public static final String containerField_DEFAULT_VALUE = "joints"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFVec3f field named <i>axis</i>. */
	public static final String fromField_AXIS = "axis";

	/** toField ROUTE name for SFVec3f field named <i>axis</i>. */
	public static final String toField_AXIS = "axis";

	/** fromField ROUTE name for SFNode field named <i>body1</i>. */
	public static final String fromField_BODY1 = "body1";

	/** toField ROUTE name for SFNode field named <i>body1</i>. */
	public static final String toField_BODY1 = "body1";

	/** fromField ROUTE name for SFNode field named <i>body2</i>. */
	public static final String fromField_BODY2 = "body2";

	/** toField ROUTE name for SFNode field named <i>body2</i>. */
	public static final String toField_BODY2 = "body2";

	/** fromField ROUTE name for MFString field named <i>forceOutput</i>. */
	public static final String fromField_FORCEOUTPUT = "forceOutput";

	/** toField ROUTE name for MFString field named <i>forceOutput</i>. */
	public static final String toField_FORCEOUTPUT = "forceOutput";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFFloat field named <i>maxSeparation</i>. */
	public static final String fromField_MAXSEPARATION = "maxSeparation";

	/** toField ROUTE name for SFFloat field named <i>maxSeparation</i>. */
	public static final String toField_MAXSEPARATION = "maxSeparation";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFFloat field named <i>minSeparation</i>. */
	public static final String fromField_MINSEPARATION = "minSeparation";

	/** toField ROUTE name for SFFloat field named <i>minSeparation</i>. */
	public static final String toField_MINSEPARATION = "minSeparation";

	/** fromField ROUTE name for SFFloat field named <i>separation</i>. */
	public static final String fromField_SEPARATION = "separation";

	/** fromField ROUTE name for SFFloat field named <i>separationRate</i>. */
	public static final String fromField_SEPARATIONRATE = "separationRate";

	/** fromField ROUTE name for SFFloat field named <i>sliderForce</i>. */
	public static final String fromField_SLIDERFORCE = "sliderForce";

	/** toField ROUTE name for SFFloat field named <i>sliderForce</i>. */
	public static final String toField_SLIDERFORCE = "sliderForce";

	/** fromField ROUTE name for SFFloat field named <i>stopBounce</i>. */
	public static final String fromField_STOPBOUNCE = "stopBounce";

	/** toField ROUTE name for SFFloat field named <i>stopBounce</i>. */
	public static final String toField_STOPBOUNCE = "stopBounce";

	/** fromField ROUTE name for SFFloat field named <i>stopErrorCorrection</i>. */
	public static final String fromField_STOPERRORCORRECTION = "stopErrorCorrection";

	/** toField ROUTE name for SFFloat field named <i>stopErrorCorrection</i>. */
	public static final String toField_STOPERRORCORRECTION = "stopErrorCorrection";

	/** Constructor for SliderJointObject to initialize member variables with default values. */
	public SliderJointObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "joints" }; // type xs:NMTOKEN

		axis = AXIS_DEFAULT_VALUE;
		body1 = null;              // clear out any prior node
		body1ProtoInstance = null; // clear out any prior node
		body2 = null;              // clear out any prior node
		body2ProtoInstance = null; // clear out any prior node
		forceOutput = new ArrayList<>(FORCEOUTPUT_DEFAULT_VALUE);
		IS = null; // clear out any prior node
		maxSeparation = MAXSEPARATION_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		minSeparation = MINSEPARATION_DEFAULT_VALUE;
		sliderForce = SLIDERFORCE_DEFAULT_VALUE;
		stopBounce = STOPBOUNCE_DEFAULT_VALUE;
		stopErrorCorrection = STOPERRORCORRECTION_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] axis is normalized vector specifying direction of motion.  * <br>

	 * @return value of axis field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getAxis()
	{
		return axis;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] axis is normalized vector specifying direction of motion.  * <br>

	 * @param newValue is new value for the axis field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setAxis(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SliderJoint axis newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		axis = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f axis field, similar to {@link #setAxis(float[])}.
	 * @param newValue is new value for the axis field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setAxis(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAxis(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f axis field, similar to {@link #setAxis(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setAxis(float x, float y, float z)
	{
		setAxis(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setAxis(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setAxis(double x, double y, double z)
	{
		return setAxis(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setAxis(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setAxis(double[] newArray)
	{
		return setAxis(new SFVec3fObject(newArray));
	}
	/**
	 * Provide RigidBodyObject instance (using a properly typed node) from inputOutput SFNode field <i>body1</i>.
	 * @see #getBody1ProtoInstance()
	 * @return value of body1 field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public RigidBody getBody1()
	{
		return (RigidBody)body1;
	}

	/**
	 * Accessor method to assign RigidBodyObject instance (using a properly typed node) to inputOutput SFNode field <i>body1</i>.
	 * @see #setBody1(ProtoInstanceObject)
	 * @param newValue is new value for the body1 field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setBody1(RigidBody newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setBody1(BODY1_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof RigidBodyObject)
	{
       body1 = (RigidBodyObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("RigidBody newValue=(body1Object.toString(newValue)) is not instanceof RigidBodyObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of body1 field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SliderJointObject clearBody1()
	{
		((X3DConcreteElement) body1).clearParentObject(); // remove references to facilitate Java memory management
		body1 = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>body1</i>.
	 * @see #setBody1(RigidBody)
	 * @param newValue is new value for the body1 field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setBody1(ProtoInstanceObject newValue)
	{
		if (body1ProtoInstance != null)
		{
			((X3DConcreteElement) body1ProtoInstance).setParentObject(null); // parentTest15.5
	    }
		body1ProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) body1ProtoInstance).setParentObject(this); // parentTest15.6
            body1ProtoInstance.setContainerField("body1");
	    }
		if (body1 != null)
		{
			((X3DConcreteElement) body1).setParentObject(null); // housekeeping, clear prior object
			body1 = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getBody1ProtoInstance()
		{
			return body1ProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>body1</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getBody1()
	 * @see #getBody1ProtoInstance()
	 */
	public boolean hasBody1()
	{
		return (body1 != null) || (body1ProtoInstance != null);
	}
	/**
	 * Provide RigidBodyObject instance (using a properly typed node) from inputOutput SFNode field <i>body2</i>.
	 * @see #getBody2ProtoInstance()
	 * @return value of body2 field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public RigidBody getBody2()
	{
		return (RigidBody)body2;
	}

	/**
	 * Accessor method to assign RigidBodyObject instance (using a properly typed node) to inputOutput SFNode field <i>body2</i>.
	 * @see #setBody2(ProtoInstanceObject)
	 * @param newValue is new value for the body2 field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setBody2(RigidBody newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setBody2(BODY2_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof RigidBodyObject)
	{
       body2 = (RigidBodyObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("RigidBody newValue=(body2Object.toString(newValue)) is not instanceof RigidBodyObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of body2 field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SliderJointObject clearBody2()
	{
		((X3DConcreteElement) body2).clearParentObject(); // remove references to facilitate Java memory management
		body2 = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>body2</i>.
	 * @see #setBody2(RigidBody)
	 * @param newValue is new value for the body2 field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setBody2(ProtoInstanceObject newValue)
	{
		if (body2ProtoInstance != null)
		{
			((X3DConcreteElement) body2ProtoInstance).setParentObject(null); // parentTest15.5
	    }
		body2ProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) body2ProtoInstance).setParentObject(this); // parentTest15.6
            body2ProtoInstance.setContainerField("body2");
	    }
		if (body2 != null)
		{
			((X3DConcreteElement) body2).setParentObject(null); // housekeeping, clear prior object
			body2 = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getBody2ProtoInstance()
		{
			return body2ProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>body2</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getBody2()
	 * @see #getBody2ProtoInstance()
	 */
	public boolean hasBody2()
	{
		return (body2 != null) || (body2ProtoInstance != null);
	}
	/**
	 * Provide array of String enumeration results (baseType forceOutputValues) ['"ALL"' | '"NONE"' | '"etc."'] from inputOutput MFString field named <i>forceOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceOutput controls which output fields are generated for the next frame. Values are ALL, NONE, or exact names of output fields updated at start of next frame.  * <br>

	 * <br><br>
	 * Available enumeration values for string comparison: {@link #FORCEOUTPUT_ALL ALL}, {@link #FORCEOUTPUT_NONE NONE}.
	 * @return value of forceOutput field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getForceOutput()
	{
		final String[] valuesArray = new String[forceOutput.size()];
		int i = 0;
		for (String arrayElement : forceOutput) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString forceOutput field, similar to {@link #getForceOutput()}.
	 * @return value of forceOutput field
	 */
	public ArrayList<String> getForceOutputList()
	{
		return forceOutput;
	}
	/**
	 * Utility method to get String value of MFString forceOutput field, similar to {@link #getForceOutput()}.
	 * @return value of forceOutput field
	 */
	public String getForceOutputString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : forceOutput) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"") to inputOutput MFString field named <i>forceOutput</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #FORCEOUTPUT_ALL ALL}, {@link #FORCEOUTPUT_NONE NONE}).
	 * <br><br>
	 * <i>Tooltip:</i>  forceOutput controls which output fields are generated for the next frame. Values are ALL, NONE, or exact names of output fields updated at start of next frame.  * <br>

	 * @param newValue is new value for the forceOutput field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setForceOutput(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearForceOutput(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(FORCEOUTPUT_ALL) ||
			newValue[i].equals(FORCEOUTPUT_NONE)))
		{
			String warningMessage = "Warning: SliderJoint forceOutput newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the optional string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);
		}
        }
		if (newValue == null)		{
			clearForceOutput(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearForceOutput(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			forceOutput.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString forceOutput field, similar to {@link #setForceOutput(String[])}.
	 * @param newValue is new value for the forceOutput field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setForceOutput(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearForceOutput(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setForceOutput(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString forceOutput field, similar to {@link #setForceOutput(String[])}.
	 * @param newValue is new value for the forceOutput field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setForceOutput(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearForceOutput(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearForceOutput(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(FORCEOUTPUT_ALL) ||
			newValue.equals(FORCEOUTPUT_NONE)))
		{
			String warningMessage = "Warning: SliderJoint forceOutput newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		setForceOutput(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString forceOutput field, similar to {@link #setForceOutput(String[])}.
	 * @param newValue is new value for the forceOutput field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setForceOutput(String newValue)
	{
		if (newValue == null)		{
			clearForceOutput(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearForceOutput(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(FORCEOUTPUT_ALL) ||
			newValue.equals(FORCEOUTPUT_NONE)))
		{
			String warningMessage = "Warning: SliderJoint forceOutput newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		setForceOutput(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString forceOutput field, similar to {@link #setForceOutput(String[])}.
	 * @param newValue is new value for the forceOutput field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setForceOutput(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearForceOutput(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearForceOutput(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(FORCEOUTPUT_ALL) ||
			newValue.equals(FORCEOUTPUT_NONE)))
		{
			String warningMessage = "Warning: SliderJoint forceOutput newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
        if (newValue.isEmpty())
            clearForceOutput(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setForceOutput(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of forceOutput field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public SliderJointObject clearForceOutput()
	{
		forceOutput.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString forceOutput field.
	 * @param newValue is new value to add to the forceOutput field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject addForceOutput(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !forceOutput.contains(newValue))
            forceOutput.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString forceOutput field.
	 * @param newValue is new value to add to the forceOutput field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject addForceOutput(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !forceOutput.contains(newValue.getValue()))
            forceOutput.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setIS(ISObject newValue)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SliderJointObject clearIS()
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
	 * Provide float value from inputOutput SFFloat field named <i>maxSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> maxSeparation is maximum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @return value of maxSeparation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getMaxSeparation()
	{
		return maxSeparation;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> maxSeparation is maximum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @param newValue is new value for the maxSeparation field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setMaxSeparation(float newValue)
	{
		// set-newValue-validity-checks #0
		maxSeparation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat maxSeparation field, similar to {@link #setMaxSeparation(float)}.
	 * @param newValue is new value for the maxSeparation field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setMaxSeparation(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMaxSeparation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMaxSeparation(float)}.
	 * @param newValue is new value for field
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setMaxSeparation(double newValue)
	{
		return setMaxSeparation((float) newValue);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SliderJointObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide float value from inputOutput SFFloat field named <i>minSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minSeparation is minimum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @return value of minSeparation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getMinSeparation()
	{
		return minSeparation;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minSeparation is minimum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @param newValue is new value for the minSeparation field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setMinSeparation(float newValue)
	{
		// set-newValue-validity-checks #0
		minSeparation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat minSeparation field, similar to {@link #setMinSeparation(float)}.
	 * @param newValue is new value for the minSeparation field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setMinSeparation(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMinSeparation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMinSeparation(float)}.
	 * @param newValue is new value for field
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setMinSeparation(double newValue)
	{
		return setMinSeparation((float) newValue);
	}
	/**
	 * Provide float value from outputOnly SFFloat field named <i>separation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separation indicates final separation distance between the two bodies.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of separation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getSeparation()
	{
		return separation;
	}
	/**
	 * Provide float value from outputOnly SFFloat field named <i>separationRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separationRate indicates change in separation distance over time between the two bodies.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of separationRate field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getSeparationRate()
	{
		return separationRate;
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>sliderForce</i>.
	 * @return value of sliderForce field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getSliderForce()
	{
		return sliderForce;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>sliderForce</i>.
	 * @param newValue is new value for the sliderForce field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setSliderForce(float newValue)
	{
		// set-newValue-validity-checks #0
		sliderForce = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat sliderForce field, similar to {@link #setSliderForce(float)}.
	 * @param newValue is new value for the sliderForce field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setSliderForce(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSliderForce(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setSliderForce(float)}.
	 * @param newValue is new value for field
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setSliderForce(double newValue)
	{
		return setSliderForce((float) newValue);
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>stopBounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopBounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stopBounce field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getStopBounce()
	{
		return stopBounce;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stopBounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopBounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stopBounce field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setStopBounce(float newValue)
	{
		// set-newValue-validity-checks #0
		stopBounce = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat stopBounce field, similar to {@link #setStopBounce(float)}.
	 * @param newValue is new value for the stopBounce field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setStopBounce(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setStopBounce(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setStopBounce(float)}.
	 * @param newValue is new value for field
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setStopBounce(double newValue)
	{
		return setStopBounce((float) newValue);
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>stopErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stopErrorCorrection field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public float getStopErrorCorrection()
	{
		return stopErrorCorrection;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stopErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stopErrorCorrection field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJointObject setStopErrorCorrection(float newValue)
	{
		// set-newValue-validity-checks #0
		stopErrorCorrection = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat stopErrorCorrection field, similar to {@link #setStopErrorCorrection(float)}.
	 * @param newValue is new value for the stopErrorCorrection field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setStopErrorCorrection(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setStopErrorCorrection(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setStopErrorCorrection(float)}.
	 * @param newValue is new value for field
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setStopErrorCorrection(double newValue)
	{
		return setStopErrorCorrection((float) newValue);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SliderJointObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to SliderJoint DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SliderJoint DEF newValue='" + newValue + "'" + 
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setDEF(SFStringObject newValue)
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
 *  <li> <i> Hint:</i>  USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance.do NOT include DEF (or any other attribute values) when using a USE attribute!. </li> 
 * </ul>
	 * @return value of USE field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
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
 *  <li> <i> Hint:</i>  USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance.do NOT include DEF (or any other attribute values) when using a USE attribute!. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> each <code>USE</code> node is still an independent object, with the <code>USE</code> value matching the <code>DEF</code> value in the preceding object. 
	 * <br><br>
	 * <i>Warning:</i> invoking the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.<br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param newValue is new value for the USE field.
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SliderJointObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to SliderJoint USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SliderJoint USE newValue='" + newValue + "'" + 
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SliderJointObject setCssClass(String newValue)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setCssClass(SFStringObject newValue)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJointObject setUSE(SliderJointObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on SliderJointObject" +
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
	public SliderJointObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public SliderJointObject addComments (String newComment)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public SliderJointObject addComments (String[] newComments)
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
	 * @return {@link SliderJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public SliderJointObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (body1 != null) || (body1ProtoInstance != null) || (body2 != null) || (body2ProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<SliderJoint"); // start opening tag
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

			if ((!Arrays.equals(getAxis(), AXIS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" axis='").append(SFVec3fObject.toString(getAxis())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getForceOutput().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" forceOutput='").append(new MFStringObject(getForceOutput()).toStringX3D()).append("'");
			}
			if (((getMaxSeparation() != MAXSEPARATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" maxSeparation='").append(SFFloatObject.toString(getMaxSeparation())).append("'");
			}
			if (((getMinSeparation() != MINSEPARATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" minSeparation='").append(SFFloatObject.toString(getMinSeparation())).append("'");
			}
			if (((getSliderForce() != SLIDERFORCE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" sliderForce='").append(SFFloatObject.toString(getSliderForce())).append("'");
			}
			if (((getStopBounce() != STOPBOUNCE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" stopBounce='").append(SFFloatObject.toString(getStopBounce())).append("'");
			}
			if (((getStopErrorCorrection() != STOPERRORCORRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" stopErrorCorrection='").append(SFFloatObject.toString(getStopErrorCorrection())).append("'");
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
			if      (body1 != null)
			{
				stringX3D.append(((X3DConcreteElement)body1).toStringX3D(indentLevel + indentIncrement));
			}
			else if (body1ProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)body1ProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (body2 != null)
			{
				stringX3D.append(((X3DConcreteElement)body2).toStringX3D(indentLevel + indentIncrement));
			}
			else if (body2ProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)body2ProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</SliderJoint>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=SliderJoint, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (body1 != null) || (body1ProtoInstance != null) || (body2 != null) || (body2ProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("SliderJoint").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("axis"))
						{
							stringClassicVRML.append(indentCharacter).append("axis").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getAxis(), AXIS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("axis ").append(SFVec3fObject.toString(getAxis())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("forceOutput"))
						{
							stringClassicVRML.append(indentCharacter).append("forceOutput").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getForceOutput().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("forceOutput ").append("[ ").append(MFStringObject.toString(getForceOutput())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("maxSeparation"))
						{
							stringClassicVRML.append(indentCharacter).append("maxSeparation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMaxSeparation() != MAXSEPARATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("maxSeparation ").append(SFFloatObject.toString(getMaxSeparation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("minSeparation"))
						{
							stringClassicVRML.append(indentCharacter).append("minSeparation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMinSeparation() != MINSEPARATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("minSeparation ").append(SFFloatObject.toString(getMinSeparation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("sliderForce"))
						{
							stringClassicVRML.append(indentCharacter).append("sliderForce").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSliderForce() != SLIDERFORCE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("sliderForce ").append(SFFloatObject.toString(getSliderForce())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("stopBounce"))
						{
							stringClassicVRML.append(indentCharacter).append("stopBounce").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getStopBounce() != STOPBOUNCE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("stopBounce ").append(SFFloatObject.toString(getStopBounce())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("stopErrorCorrection"))
						{
							stringClassicVRML.append(indentCharacter).append("stopErrorCorrection").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getStopErrorCorrection() != STOPERRORCORRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("stopErrorCorrection ").append(SFFloatObject.toString(getStopErrorCorrection())).append("\n").append(indent).append(indentCharacter);
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
			if (body1 != null)
			{
				stringClassicVRML.append(indentCharacter).append("body1").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) body1).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (body1ProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("body1").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) body1ProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (body2 != null)
			{
				stringClassicVRML.append(indentCharacter).append("body2").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) body2).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (body2ProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("body2").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) body2ProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
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
		if (body1 != null)
		{
			referenceElement = ((X3DConcreteElement) body1).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (body1ProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) body1ProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (body2 != null)
		{
			referenceElement = ((X3DConcreteElement) body2).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (body2ProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) body2ProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
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
		if (body1 != null)
		{
			referenceNode = ((X3DConcreteElement) body1).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (body1ProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) body1ProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (body2 != null)
		{
			referenceNode = ((X3DConcreteElement) body2).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (body2ProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) body2ProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
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

		setAxis(getAxis()); // exercise field checks, simple types
        
		setForceOutput(getForceOutput()); // exercise field checks, simple types
        
		setMaxSeparation(getMaxSeparation()); // exercise field checks, simple types
        
		setMinSeparation(getMinSeparation()); // exercise field checks, simple types
        
		setSliderForce(getSliderForce()); // exercise field checks, simple types
        
		setStopBounce(getStopBounce()); // exercise field checks, simple types
        
		setStopErrorCorrection(getStopErrorCorrection()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (body1 != null)
		{
			setBody1(getBody1());
			((X3DConcreteElement) body1).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) body1).getValidationResult());
		}
		if (body1ProtoInstance != null)
		{
			setBody1(getBody1ProtoInstance());
			((X3DConcreteElement) body1ProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) body1ProtoInstance).getValidationResult());
		}
		if ((body1 != null) && (body1ProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both body1 and body1ProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasBody1()) // test USE restrictions
		{
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained SFNode body1";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (body2 != null)
		{
			setBody2(getBody2());
			((X3DConcreteElement) body2).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) body2).getValidationResult());
		}
		if (body2ProtoInstance != null)
		{
			setBody2(getBody2ProtoInstance());
			((X3DConcreteElement) body2ProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) body2ProtoInstance).getValidationResult());
		}
		if ((body2 != null) && (body2ProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both body2 and body2ProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasBody2()) // test USE restrictions
		{
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained SFNode body2";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "SliderJoint USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'SliderJoint' node, add head statement <component name='RigidBodyPhysics' level='2'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"RigidBodyPhysics\").setLevel(2);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
