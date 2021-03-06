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
import java.util.Arrays;

/**
 * RigidBodyCollection represents a system of bodies that interact within a single physics model.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  (X3D version 3.2 or later) [X3DChildNode] RigidBodyCollection represents a system of bodies that interact within a single physics model.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#RigidBodyCollection" target="blank">X3D Abstract Specification: RigidBodyCollection</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#RigidBodyCollection" target="_blank">X3D Tooltips: RigidBodyCollection</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class RigidBodyCollectionObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.RigidBodyPhysics.RigidBodyCollection
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=autoDisable, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=autoDisable, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean autoDisable; // SFBool

 /* @name=bodies, @type=MFNode, $javaType=ArrayList<RigidBodyObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<RigidBodyObject>, $normalizedMemberObjectName=bodies, $isX3dStatement=false, @acceptableNodeTypes=RigidBody */ 
	private ArrayList<X3DNode> bodies = new ArrayList<>(); // MFNode acceptable node types: RigidBody or ProtoInstanceObject

 /* @name=collider, @type=SFNode, $javaType=CollisionCollectionObject, $javaReferenceType=CollisionCollectionObject, $javaPrimitiveType=CollisionCollectionObject, $normalizedMemberObjectName=collider, $isX3dStatement=false, @acceptableNodeTypes=CollisionCollection */ 
	private CollisionCollectionObject collider; // SFNode acceptable node types: CollisionCollection or ProtoInstanceObject
	private ProtoInstanceObject colliderProtoInstance; // allowed alternative for collider field

 /* @name=constantForceMix, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=constantForceMix, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float constantForceMix; // SFFloat

 /* @name=contactSurfaceThickness, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=contactSurfaceThickness, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float contactSurfaceThickness; // SFFloat

 /* @name=disableAngularSpeed, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=disableAngularSpeed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float disableAngularSpeed; // SFFloat

 /* @name=disableLinearSpeed, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=disableLinearSpeed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float disableLinearSpeed; // SFFloat

 /* @name=disableTime, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=disableTime, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double disableTime; // SFTime

 /* @name=enabled, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=enabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean enabled; // SFBool

 /* @name=errorCorrection, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=errorCorrection, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float errorCorrection; // SFFloat

 /* @name=gravity, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=gravity, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] gravity; // SFVec3f

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=iterations, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=iterations, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int iterations; // SFInt32

 /* @name=joints, @type=MFNode, $javaType=ArrayList<X3DRigidJointNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DRigidJointNode>, $normalizedMemberObjectName=joints, $isX3dStatement=false, @acceptableNodeTypes=X3DRigidJointNode */ 
	private ArrayList<X3DNode> joints = new ArrayList<>(); // MFNode acceptable node types: X3DRigidJointNode or ProtoInstanceObject

 /* @name=maxCorrectionSpeed, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=maxCorrectionSpeed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float maxCorrectionSpeed; // SFFloat

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=preferAccuracy, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=preferAccuracy, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean preferAccuracy; // SFBool

 /* @name=set_contacts, @type=MFNode, $javaType=ArrayList<ContactObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<ContactObject>, $normalizedMemberObjectName=contacts, $isX3dStatement=false, @acceptableNodeTypes=Contact */ 
	private ArrayList<X3DNode> contacts = new ArrayList<>(); // MFNode acceptable node types: Contact or ProtoInstanceObject

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>RigidBodyCollection</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "RigidBodyCollection";

	/** Provides name of this element: <i>RigidBodyCollection</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>RigidBodyCollection</i> element: <i>RigidBodyPhysics</i> */
	public static final String COMPONENT = "RigidBodyPhysics";

	/** Defines X3D component for the <i>RigidBodyCollection</i> element: <i>RigidBodyPhysics</i>
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

	/** SFBool field named <i>autoDisable</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean AUTODISABLE_DEFAULT_VALUE = false;

	/** SFNode field named <i>collider</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final CollisionCollectionObject COLLIDER_DEFAULT_VALUE = null;

	/** SFFloat field named <i>constantForceMix</i> has default value <i>0.0001f</i> (Java syntax) or <i>0.0001</i> (XML syntax). */
	public static final float CONSTANTFORCEMIX_DEFAULT_VALUE = 0.0001f;

	/** SFFloat field named <i>contactSurfaceThickness</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float CONTACTSURFACETHICKNESS_DEFAULT_VALUE = 0f;

	/** SFFloat field named <i>disableAngularSpeed</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float DISABLEANGULARSPEED_DEFAULT_VALUE = 0f;

	/** SFFloat field named <i>disableLinearSpeed</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float DISABLELINEARSPEED_DEFAULT_VALUE = 0f;

	/** SFTime field named <i>disableTime</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final double DISABLETIME_DEFAULT_VALUE = 0;

	/** SFBool field named <i>enabled</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean ENABLED_DEFAULT_VALUE = true;

	/** SFFloat field named <i>errorCorrection</i> has default value <i>0.8f</i> (Java syntax) or <i>0.8</i> (XML syntax). */
	public static final float ERRORCORRECTION_DEFAULT_VALUE = 0.8f;

	/** SFVec3f field named <i>gravity</i> has default value <i>{0f,-9.8f,0f}</i> (Java syntax) or <i>0 -9.8 0</i> (XML syntax). */
	public static final float[] GRAVITY_DEFAULT_VALUE = {0f,-9.8f,0f};

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFInt32 field named <i>iterations</i> has default value <i>10</i> (Java syntax) or <i>10</i> (XML syntax). */
	public static final int ITERATIONS_DEFAULT_VALUE = 10;

	/** SFFloat field named <i>maxCorrectionSpeed</i> has default value <i>-1f</i> (Java syntax) or <i>-1</i> (XML syntax). */
	public static final float MAXCORRECTIONSPEED_DEFAULT_VALUE = -1f;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFBool field named <i>preferAccuracy</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean PREFERACCURACY_DEFAULT_VALUE = false;

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
			case "autoDisable":
				result = "SFBool";
				break;
			case "bodies":
				result = "MFNode";
				break;
			case "collider":
				result = "SFNode";
				break;
			case "constantForceMix":
				result = "SFFloat";
				break;
			case "contactSurfaceThickness":
				result = "SFFloat";
				break;
			case "disableAngularSpeed":
				result = "SFFloat";
				break;
			case "disableLinearSpeed":
				result = "SFFloat";
				break;
			case "disableTime":
				result = "SFTime";
				break;
			case "enabled":
				result = "SFBool";
				break;
			case "errorCorrection":
				result = "SFFloat";
				break;
			case "gravity":
				result = "SFVec3f";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "iterations":
				result = "SFInt32";
				break;
			case "joints":
				result = "MFNode";
				break;
			case "maxCorrectionSpeed":
				result = "SFFloat";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "preferAccuracy":
				result = "SFBool";
				break;
			case "contacts":
				result = "MFNode";
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
			case "autoDisable":
				result = "inputOutput";
				break;
			case "bodies":
				result = "inputOutput";
				break;
			case "collider":
				result = "initializeOnly";
				break;
			case "constantForceMix":
				result = "inputOutput";
				break;
			case "contactSurfaceThickness":
				result = "inputOutput";
				break;
			case "disableAngularSpeed":
				result = "inputOutput";
				break;
			case "disableLinearSpeed":
				result = "inputOutput";
				break;
			case "disableTime":
				result = "inputOutput";
				break;
			case "enabled":
				result = "inputOutput";
				break;
			case "errorCorrection":
				result = "inputOutput";
				break;
			case "gravity":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "iterations":
				result = "inputOutput";
				break;
			case "joints":
				result = "inputOutput";
				break;
			case "maxCorrectionSpeed":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "preferAccuracy":
				result = "inputOutput";
				break;
			case "set_contacts":
				result = "inputOnly";
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

	/** fromField ROUTE name for SFBool field named <i>autoDisable</i>. */
	public static final String fromField_AUTODISABLE = "autoDisable";

	/** toField ROUTE name for SFBool field named <i>autoDisable</i>. */
	public static final String toField_AUTODISABLE = "autoDisable";

	/** fromField ROUTE name for MFNode field named <i>bodies</i>. */
	public static final String fromField_BODIES = "bodies";

	/** toField ROUTE name for MFNode field named <i>bodies</i>. */
	public static final String toField_BODIES = "bodies";

	/** fromField ROUTE name for SFFloat field named <i>constantForceMix</i>. */
	public static final String fromField_CONSTANTFORCEMIX = "constantForceMix";

	/** toField ROUTE name for SFFloat field named <i>constantForceMix</i>. */
	public static final String toField_CONSTANTFORCEMIX = "constantForceMix";

	/** fromField ROUTE name for SFFloat field named <i>contactSurfaceThickness</i>. */
	public static final String fromField_CONTACTSURFACETHICKNESS = "contactSurfaceThickness";

	/** toField ROUTE name for SFFloat field named <i>contactSurfaceThickness</i>. */
	public static final String toField_CONTACTSURFACETHICKNESS = "contactSurfaceThickness";

	/** fromField ROUTE name for SFFloat field named <i>disableAngularSpeed</i>. */
	public static final String fromField_DISABLEANGULARSPEED = "disableAngularSpeed";

	/** toField ROUTE name for SFFloat field named <i>disableAngularSpeed</i>. */
	public static final String toField_DISABLEANGULARSPEED = "disableAngularSpeed";

	/** fromField ROUTE name for SFFloat field named <i>disableLinearSpeed</i>. */
	public static final String fromField_DISABLELINEARSPEED = "disableLinearSpeed";

	/** toField ROUTE name for SFFloat field named <i>disableLinearSpeed</i>. */
	public static final String toField_DISABLELINEARSPEED = "disableLinearSpeed";

	/** fromField ROUTE name for SFTime field named <i>disableTime</i>. */
	public static final String fromField_DISABLETIME = "disableTime";

	/** toField ROUTE name for SFTime field named <i>disableTime</i>. */
	public static final String toField_DISABLETIME = "disableTime";

	/** fromField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String fromField_ENABLED = "enabled";

	/** toField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String toField_ENABLED = "enabled";

	/** fromField ROUTE name for SFFloat field named <i>errorCorrection</i>. */
	public static final String fromField_ERRORCORRECTION = "errorCorrection";

	/** toField ROUTE name for SFFloat field named <i>errorCorrection</i>. */
	public static final String toField_ERRORCORRECTION = "errorCorrection";

	/** fromField ROUTE name for SFVec3f field named <i>gravity</i>. */
	public static final String fromField_GRAVITY = "gravity";

	/** toField ROUTE name for SFVec3f field named <i>gravity</i>. */
	public static final String toField_GRAVITY = "gravity";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFInt32 field named <i>iterations</i>. */
	public static final String fromField_ITERATIONS = "iterations";

	/** toField ROUTE name for SFInt32 field named <i>iterations</i>. */
	public static final String toField_ITERATIONS = "iterations";

	/** fromField ROUTE name for MFNode field named <i>joints</i>. */
	public static final String fromField_JOINTS = "joints";

	/** toField ROUTE name for MFNode field named <i>joints</i>. */
	public static final String toField_JOINTS = "joints";

	/** fromField ROUTE name for SFFloat field named <i>maxCorrectionSpeed</i>. */
	public static final String fromField_MAXCORRECTIONSPEED = "maxCorrectionSpeed";

	/** toField ROUTE name for SFFloat field named <i>maxCorrectionSpeed</i>. */
	public static final String toField_MAXCORRECTIONSPEED = "maxCorrectionSpeed";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFBool field named <i>preferAccuracy</i>. */
	public static final String fromField_PREFERACCURACY = "preferAccuracy";

	/** toField ROUTE name for SFBool field named <i>preferAccuracy</i>. */
	public static final String toField_PREFERACCURACY = "preferAccuracy";

	/** toField ROUTE name for MFNode field named <i>set_contacts</i>. */
	public static final String toField_SET_CONTACTS = "set_contacts";

	/** Constructor for RigidBodyCollectionObject to initialize member variables with default values. */
	public RigidBodyCollectionObject()
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

		autoDisable = AUTODISABLE_DEFAULT_VALUE;
		bodies = new ArrayList<>();
		collider = null;              // clear out any prior node
		colliderProtoInstance = null; // clear out any prior node
		constantForceMix = CONSTANTFORCEMIX_DEFAULT_VALUE;
		contactSurfaceThickness = CONTACTSURFACETHICKNESS_DEFAULT_VALUE;
		disableAngularSpeed = DISABLEANGULARSPEED_DEFAULT_VALUE;
		disableLinearSpeed = DISABLELINEARSPEED_DEFAULT_VALUE;
		disableTime = DISABLETIME_DEFAULT_VALUE;
		enabled = ENABLED_DEFAULT_VALUE;
		errorCorrection = ERRORCORRECTION_DEFAULT_VALUE;
		gravity = GRAVITY_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		iterations = ITERATIONS_DEFAULT_VALUE;
		joints = new ArrayList<>();
		maxCorrectionSpeed = MAXCORRECTIONSPEED_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		preferAccuracy = PREFERACCURACY_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>autoDisable</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoDisable toggles operation of disableAngularSpeed, disableLinearSpeed, disableTime.  * <br>

	 * @return value of autoDisable field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getAutoDisable()
	{
		return autoDisable;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>autoDisable</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoDisable toggles operation of disableAngularSpeed, disableLinearSpeed, disableTime.  * <br>

	 * @param newValue is new value for the autoDisable field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setAutoDisable(boolean newValue)
	{
		// set-newValue-validity-checks #0
		autoDisable = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool autoDisable field, similar to {@link #setAutoDisable(boolean)}.
	 * @param newValue is new value for the autoDisable field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setAutoDisable(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAutoDisable(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of RigidBodyObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>bodies</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [RigidBody] Collection of top-level nodes that comprise a set of bodies evaluated as a single set of interactions.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to RigidBody.
	 * @see org.web3d.x3d.jsail.RigidBodyPhysics.RigidBodyObject
	 * @return value of bodies field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getBodies()
	{
		final X3DNode[] valuesArray = new X3DNode[bodies.size()];
		int i = 0;
		for (X3DNode arrayElement : bodies) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode bodies field, similar to {@link #getBodies()}.
	 * @return value of bodies field
	 */
	public ArrayList<X3DNode> getBodiesList()
	{
		return bodies;
	}

	/**
	 * Accessor method to assign RigidBodyObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>bodies</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [RigidBody] Collection of top-level nodes that comprise a set of bodies evaluated as a single set of interactions.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to RigidBody.
	 * @param newValue is new value for the bodies field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setBodies(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearBodies(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearBodies(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				bodies.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode bodies field, similar to {@link #setBodies(X3DNode[])}.
	 * @param newValue is new value for the bodies field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setBodies(ArrayList<RigidBodyObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearBodies(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearBodies(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setBodies(newArray);
        }
		for (RigidBodyObject element : newValue)
		{
			bodies.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of bodies nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to RigidBody and ProtoInstance.
	 * @param newValue is new value to be appended the bodies field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public RigidBodyCollectionObject addBodies(RigidBodyObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		bodies.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for bodies field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public RigidBodyCollectionObject addBodies(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		bodies.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child bodies nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to RigidBody.
	 * @param newValue is new value array to be appended the bodies field.
	 */
	@Override // or here2?
	public void addBodies(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				bodies.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("bodies");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child bodies node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to RigidBody.
	 * @param newValue is new node for the bodies field (restricted to RigidBody)
	 */
	@Override
	public void setBodies(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearBodies(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : bodies)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearBodies(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			bodies.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of bodies field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public RigidBodyCollectionObject clearBodies()
	{
		for (X3DNode element : bodies)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		bodies.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>bodies</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getBodies()
	 */
	public boolean hasBodies()
	{
		return (!bodies.isEmpty());
	}
	/**
	 * Provide CollisionCollectionObject instance (using a properly typed node) from initializeOnly SFNode field <i>collider</i>.
	 * @see #getColliderProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [CollisionCollection] The collider field associates a collision collection with this rigid body collection allowing seamless updates and integration without the need to use the X3D event model.  * <br>

	 * @return value of collider field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public CollisionCollection getCollider()
	{
		return (CollisionCollection)collider;
	}

	/**
	 * Accessor method to assign CollisionCollectionObject instance (using a properly typed node) to initializeOnly SFNode field <i>collider</i>.
	 * @see #setCollider(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [CollisionCollection] The collider field associates a collision collection with this rigid body collection allowing seamless updates and integration without the need to use the X3D event model.  * <br>

	 * @param newValue is new value for the collider field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setCollider(CollisionCollection newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setCollider(COLLIDER_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof CollisionCollectionObject)
	{
       collider = (CollisionCollectionObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("CollisionCollection newValue=(colliderObject.toString(newValue)) is not instanceof CollisionCollectionObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of collider field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public RigidBodyCollectionObject clearCollider()
	{
		((X3DConcreteElement) collider).clearParentObject(); // remove references to facilitate Java memory management
		collider = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to initializeOnly SFNode field <i>collider</i>.
	 * @see #setCollider(CollisionCollection)
	 * @param newValue is new value for the collider field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setCollider(ProtoInstanceObject newValue)
	{
		if (colliderProtoInstance != null)
		{
			((X3DConcreteElement) colliderProtoInstance).setParentObject(null); // parentTest15.5
	    }
		colliderProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) colliderProtoInstance).setParentObject(this); // parentTest15.6
            colliderProtoInstance.setContainerField("collider");
	    }
		if (collider != null)
		{
			((X3DConcreteElement) collider).setParentObject(null); // housekeeping, clear prior object
			collider = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getColliderProtoInstance()
		{
			return colliderProtoInstance;
		}

	/**
	 * Indicate whether an object is available for initializeOnly SFNode field <i>collider</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getCollider()
	 * @see #getColliderProtoInstance()
	 */
	public boolean hasCollider()
	{
		return (collider != null) || (colliderProtoInstance != null);
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>constantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) constantForceMix modifies damping calculations by violating normal constraints while applying small, constant forces in those calculations.
 * <ul>
 *  <li> <i>Hint:</i> this allows joints and bodies to be a fraction springy, and helps to eliminate numerical instability. </li> 
 *  <li> <i>Hint:</i>  spring-driven or spongy connections can be emulated by combined use of errorCorrection and constantForceMix. </li> 
 * </ul>
	 * @return value of constantForceMix field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float getConstantForceMix()
	{
		return constantForceMix;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>constantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) constantForceMix modifies damping calculations by violating normal constraints while applying small, constant forces in those calculations.
 * <ul>
 *  <li> <i>Hint:</i> this allows joints and bodies to be a fraction springy, and helps to eliminate numerical instability. </li> 
 *  <li> <i>Hint:</i>  spring-driven or spongy connections can be emulated by combined use of errorCorrection and constantForceMix. </li> 
 * </ul>
	 * @param newValue is new value for the constantForceMix field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setConstantForceMix(float newValue)
	{
		// set-newValue-validity-checks #0
		constantForceMix = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat constantForceMix field, similar to {@link #setConstantForceMix(float)}.
	 * @param newValue is new value for the constantForceMix field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setConstantForceMix(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setConstantForceMix(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setConstantForceMix(float)}.
	 * @param newValue is new value for field
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setConstantForceMix(double newValue)
	{
		return setConstantForceMix((float) newValue);
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>contactSurfaceThickness</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) contactSurfaceThickness defines how far bodies may interpenetrate after a collision, allowing simulation of softer bodies that deform somewhat during collision.  * <br>

	 * @return value of contactSurfaceThickness field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float getContactSurfaceThickness()
	{
		return contactSurfaceThickness;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>contactSurfaceThickness</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) contactSurfaceThickness defines how far bodies may interpenetrate after a collision, allowing simulation of softer bodies that deform somewhat during collision.  * <br>

	 * @param newValue is new value for the contactSurfaceThickness field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setContactSurfaceThickness(float newValue)
	{
		// set-newValue-validity-checks #0
		contactSurfaceThickness = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat contactSurfaceThickness field, similar to {@link #setContactSurfaceThickness(float)}.
	 * @param newValue is new value for the contactSurfaceThickness field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setContactSurfaceThickness(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setContactSurfaceThickness(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setContactSurfaceThickness(float)}.
	 * @param newValue is new value for field
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setContactSurfaceThickness(double newValue)
	{
		return setContactSurfaceThickness((float) newValue);
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>disableAngularSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableAngularSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @return value of disableAngularSpeed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float getDisableAngularSpeed()
	{
		return disableAngularSpeed;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>disableAngularSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableAngularSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @param newValue is new value for the disableAngularSpeed field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setDisableAngularSpeed(float newValue)
	{
		// set-newValue-validity-checks #0
		disableAngularSpeed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat disableAngularSpeed field, similar to {@link #setDisableAngularSpeed(float)}.
	 * @param newValue is new value for the disableAngularSpeed field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setDisableAngularSpeed(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDisableAngularSpeed(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setDisableAngularSpeed(float)}.
	 * @param newValue is new value for field
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setDisableAngularSpeed(double newValue)
	{
		return setDisableAngularSpeed((float) newValue);
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>disableLinearSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableLinearSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculation, reducing numeric instabilitiess.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @return value of disableLinearSpeed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float getDisableLinearSpeed()
	{
		return disableLinearSpeed;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>disableLinearSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableLinearSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculation, reducing numeric instabilitiess.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @param newValue is new value for the disableLinearSpeed field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setDisableLinearSpeed(float newValue)
	{
		// set-newValue-validity-checks #0
		disableLinearSpeed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat disableLinearSpeed field, similar to {@link #setDisableLinearSpeed(float)}.
	 * @param newValue is new value for the disableLinearSpeed field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setDisableLinearSpeed(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDisableLinearSpeed(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setDisableLinearSpeed(float)}.
	 * @param newValue is new value for field
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setDisableLinearSpeed(double newValue)
	{
		return setDisableLinearSpeed((float) newValue);
	}
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>disableTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableTime defines interval when body becomes at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i>Hint:</i> only activated if autoDisable='true' </li> 
 *  <li> <i>Hint:</i>  disableTime is an SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of disableTime field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public double getDisableTime()
	{
		return disableTime;
	}

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>disableTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableTime defines interval when body becomes at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i>Hint:</i> only activated if autoDisable='true' </li> 
 *  <li> <i>Hint:</i>  disableTime is an SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the disableTime field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setDisableTime(double newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("RigidBodyCollection disableTime newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		disableTime = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFTime disableTime field, similar to {@link #setDisableTime(double)}.
	 * @param newValue is new value for the disableTime field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setDisableTime(SFTimeObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDisableTime(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setEnabled(boolean newValue)
	{
		// set-newValue-validity-checks #0
		enabled = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool enabled field, similar to {@link #setEnabled(boolean)}.
	 * @param newValue is new value for the enabled field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setEnabled(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>errorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] errorCorrection describes how quickly intersection errors due to floating-point inaccuracies are resolved (0=no correction, 1=all corrected in single step).  * <br>

	 * @return value of errorCorrection field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float getErrorCorrection()
	{
		return errorCorrection;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>errorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] errorCorrection describes how quickly intersection errors due to floating-point inaccuracies are resolved (0=no correction, 1=all corrected in single step).  * <br>

	 * @param newValue is new value for the errorCorrection field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setErrorCorrection(float newValue)
	{
		// set-newValue-validity-checks #0
		errorCorrection = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat errorCorrection field, similar to {@link #setErrorCorrection(float)}.
	 * @param newValue is new value for the errorCorrection field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setErrorCorrection(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setErrorCorrection(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setErrorCorrection(float)}.
	 * @param newValue is new value for field
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setErrorCorrection(double newValue)
	{
		return setErrorCorrection((float) newValue);
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>gravity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  gravity indicates direction and strength of local gravity vector for this collection of bodies (units m/sec^2).  * <br>

	 * @return value of gravity field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getGravity()
	{
		return gravity;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>gravity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  gravity indicates direction and strength of local gravity vector for this collection of bodies (units m/sec^2).  * <br>

	 * @param newValue is new value for the gravity field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setGravity(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("RigidBodyCollection gravity newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		gravity = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f gravity field, similar to {@link #setGravity(float[])}.
	 * @param newValue is new value for the gravity field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setGravity(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGravity(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f gravity field, similar to {@link #setGravity(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setGravity(float x, float y, float z)
	{
		setGravity(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setGravity(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setGravity(double x, double y, double z)
	{
		return setGravity(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setGravity(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setGravity(double[] newArray)
	{
		return setGravity(new SFVec3fObject(newArray));
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setIS(ISObject newValue)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public RigidBodyCollectionObject clearIS()
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
	 * Provide int value from inputOutput SFInt32 field named <i>iterations</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) iterations controls number of iterations performed over collectioned joints and bodies during each evaluation.  * <br>

	 * @return value of iterations field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getIterations()
	{
		return iterations;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>iterations</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) iterations controls number of iterations performed over collectioned joints and bodies during each evaluation.  * <br>

	 * @param newValue is new value for the iterations field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setIterations(int newValue)
	{
		// set-newValue-validity-checks #0
		iterations = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 iterations field, similar to {@link #setIterations(int)}.
	 * @param newValue is new value for the iterations field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setIterations(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setIterations(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of X3DRigidJointNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DRigidJointNode] The joints field is used to register all joints between bodies contained in this collection.
 * <ul>
 *  <li> <i>Warning:</i> If a joint is connected between bodies in two different collections, the result is implementation-dependent. </li> 
 *  <li> <i>Warning:</i> If a joint instance is registered with more than one collection, the results are implementation dependent. </li> 
 *  <li> <i>Warning:</i>  Joints not registered with any collection are not evaluated. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DRigidJointNode.
	 * @see org.web3d.x3d.sai.RigidBodyPhysics.X3DRigidJointNode
	 * @return value of joints field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getJoints()
	{
		final X3DNode[] valuesArray = new X3DNode[joints.size()];
		int i = 0;
		for (X3DNode arrayElement : joints) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode joints field, similar to {@link #getJoints()}.
	 * @return value of joints field
	 */
	public ArrayList<X3DNode> getJointsList()
	{
		return joints;
	}

	/**
	 * Accessor method to assign X3DRigidJointNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DRigidJointNode] The joints field is used to register all joints between bodies contained in this collection.
 * <ul>
 *  <li> <i>Warning:</i> If a joint is connected between bodies in two different collections, the result is implementation-dependent. </li> 
 *  <li> <i>Warning:</i> If a joint instance is registered with more than one collection, the results are implementation dependent. </li> 
 *  <li> <i>Warning:</i>  Joints not registered with any collection are not evaluated. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DRigidJointNode.
	 * @param newValue is new value for the joints field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setJoints(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearJoints(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				joints.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode joints field, similar to {@link #setJoints(X3DNode[])}.
	 * @param newValue is new value for the joints field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setJoints(ArrayList<X3DRigidJointNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearJoints(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setJoints(newArray);
        }
		for (X3DRigidJointNode element : newValue)
		{
			joints.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of joints nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DRigidJointNode and ProtoInstance.
	 * @param newValue is new value to be appended the joints field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public RigidBodyCollectionObject addJoints(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		joints.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for joints field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public RigidBodyCollectionObject addJoints(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		joints.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child joints nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DRigidJointNode.
	 * @param newValue is new value array to be appended the joints field.
	 */
	@Override // or here2?
	public void addJoints(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				joints.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("joints");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child joints node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DRigidJointNode.
	 * @param newValue is new node for the joints field (restricted to X3DRigidJointNode)
	 */
	@Override
	public void setJoints(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearJoints(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : joints)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearJoints(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			joints.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of joints field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public RigidBodyCollectionObject clearJoints()
	{
		for (X3DNode element : joints)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		joints.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>joints</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getJoints()
	 */
	public boolean hasJoints()
	{
		return (!joints.isEmpty());
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>maxCorrectionSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) or -1, maxCorrectionSpeed .  * <br>

	 * @return value of maxCorrectionSpeed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float getMaxCorrectionSpeed()
	{
		return maxCorrectionSpeed;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxCorrectionSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) or -1, maxCorrectionSpeed .  * <br>

	 * @param newValue is new value for the maxCorrectionSpeed field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setMaxCorrectionSpeed(float newValue)
	{
		// set-newValue-validity-checks #0
		maxCorrectionSpeed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat maxCorrectionSpeed field, similar to {@link #setMaxCorrectionSpeed(float)}.
	 * @param newValue is new value for the maxCorrectionSpeed field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setMaxCorrectionSpeed(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMaxCorrectionSpeed(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMaxCorrectionSpeed(float)}.
	 * @param newValue is new value for field
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setMaxCorrectionSpeed(double newValue)
	{
		return setMaxCorrectionSpeed((float) newValue);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public RigidBodyCollectionObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide boolean value from inputOutput SFBool field named <i>preferAccuracy</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  preferAccuracy provides hint for performance preference: higher accuracy or faster computational speed.  * <br>

	 * @return value of preferAccuracy field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getPreferAccuracy()
	{
		return preferAccuracy;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>preferAccuracy</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  preferAccuracy provides hint for performance preference: higher accuracy or faster computational speed.  * <br>

	 * @param newValue is new value for the preferAccuracy field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBodyCollectionObject setPreferAccuracy(boolean newValue)
	{
		// set-newValue-validity-checks #0
		preferAccuracy = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool preferAccuracy field, similar to {@link #setPreferAccuracy(boolean)}.
	 * @param newValue is new value for the preferAccuracy field.
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setPreferAccuracy(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setPreferAccuracy(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final RigidBodyCollectionObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to RigidBodyCollection DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("RigidBodyCollection DEF newValue='" + newValue + "'" + 
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final RigidBodyCollectionObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to RigidBodyCollection USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("RigidBodyCollection USE newValue='" + newValue + "'" + 
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final RigidBodyCollectionObject setCssClass(String newValue)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setCssClass(SFStringObject newValue)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBodyCollectionObject setUSE(RigidBodyCollectionObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on RigidBodyCollectionObject" +
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
	public RigidBodyCollectionObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public RigidBodyCollectionObject addComments (String newComment)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public RigidBodyCollectionObject addComments (String[] newComments)
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
	 * @return {@link RigidBodyCollectionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public RigidBodyCollectionObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (!bodies.isEmpty()) || (collider != null) || (colliderProtoInstance != null) || (IS != null) || (!joints.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<RigidBodyCollection"); // start opening tag
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

			if (((getAutoDisable() != AUTODISABLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" autoDisable='").append(SFBoolObject.toString(getAutoDisable())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getConstantForceMix() != CONSTANTFORCEMIX_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" constantForceMix='").append(SFFloatObject.toString(getConstantForceMix())).append("'");
			}
			if (((getContactSurfaceThickness() != CONTACTSURFACETHICKNESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" contactSurfaceThickness='").append(SFFloatObject.toString(getContactSurfaceThickness())).append("'");
			}
			if (((getDisableAngularSpeed() != DISABLEANGULARSPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" disableAngularSpeed='").append(SFFloatObject.toString(getDisableAngularSpeed())).append("'");
			}
			if (((getDisableLinearSpeed() != DISABLELINEARSPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" disableLinearSpeed='").append(SFFloatObject.toString(getDisableLinearSpeed())).append("'");
			}
			if (((getDisableTime() != DISABLETIME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" disableTime='").append(SFTimeObject.toString(getDisableTime())).append("'");
			}
			if (((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" enabled='").append(SFBoolObject.toString(getEnabled())).append("'");
			}
			if (((getErrorCorrection() != ERRORCORRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" errorCorrection='").append(SFFloatObject.toString(getErrorCorrection())).append("'");
			}
			if ((!Arrays.equals(getGravity(), GRAVITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" gravity='").append(SFVec3fObject.toString(getGravity())).append("'");
			}
			if (((getIterations() != ITERATIONS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" iterations='").append(SFInt32Object.toString(getIterations())).append("'");
			}
			if (((getMaxCorrectionSpeed() != MAXCORRECTIONSPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" maxCorrectionSpeed='").append(SFFloatObject.toString(getMaxCorrectionSpeed())).append("'");
			}
			if (((getPreferAccuracy() != PREFERACCURACY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" preferAccuracy='").append(SFBoolObject.toString(getPreferAccuracy())).append("'");
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
			for (X3DNode element : bodies)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			if      (collider != null)
			{
				stringX3D.append(((X3DConcreteElement)collider).toStringX3D(indentLevel + indentIncrement));
			}
			else if (colliderProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)colliderProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : joints)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</RigidBodyCollection>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=RigidBodyCollection, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (!bodies.isEmpty()) || (collider != null) || (colliderProtoInstance != null) || (IS != null) || (!joints.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("RigidBodyCollection").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("autoDisable"))
						{
							stringClassicVRML.append(indentCharacter).append("autoDisable").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getAutoDisable() != AUTODISABLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("autoDisable ").append(SFBoolObject.toString(getAutoDisable())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("constantForceMix"))
						{
							stringClassicVRML.append(indentCharacter).append("constantForceMix").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getConstantForceMix() != CONSTANTFORCEMIX_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("constantForceMix ").append(SFFloatObject.toString(getConstantForceMix())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("contactSurfaceThickness"))
						{
							stringClassicVRML.append(indentCharacter).append("contactSurfaceThickness").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getContactSurfaceThickness() != CONTACTSURFACETHICKNESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("contactSurfaceThickness ").append(SFFloatObject.toString(getContactSurfaceThickness())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("disableAngularSpeed"))
						{
							stringClassicVRML.append(indentCharacter).append("disableAngularSpeed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getDisableAngularSpeed() != DISABLEANGULARSPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("disableAngularSpeed ").append(SFFloatObject.toString(getDisableAngularSpeed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("disableLinearSpeed"))
						{
							stringClassicVRML.append(indentCharacter).append("disableLinearSpeed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getDisableLinearSpeed() != DISABLELINEARSPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("disableLinearSpeed ").append(SFFloatObject.toString(getDisableLinearSpeed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("disableTime"))
						{
							stringClassicVRML.append(indentCharacter).append("disableTime").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getDisableTime() != DISABLETIME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("disableTime ").append(SFTimeObject.toString(getDisableTime())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("errorCorrection"))
						{
							stringClassicVRML.append(indentCharacter).append("errorCorrection").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getErrorCorrection() != ERRORCORRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("errorCorrection ").append(SFFloatObject.toString(getErrorCorrection())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("gravity"))
						{
							stringClassicVRML.append(indentCharacter).append("gravity").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getGravity(), GRAVITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("gravity ").append(SFVec3fObject.toString(getGravity())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("iterations"))
						{
							stringClassicVRML.append(indentCharacter).append("iterations").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getIterations() != ITERATIONS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("iterations ").append(SFInt32Object.toString(getIterations())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("maxCorrectionSpeed"))
						{
							stringClassicVRML.append(indentCharacter).append("maxCorrectionSpeed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMaxCorrectionSpeed() != MAXCORRECTIONSPEED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("maxCorrectionSpeed ").append(SFFloatObject.toString(getMaxCorrectionSpeed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("preferAccuracy"))
						{
							stringClassicVRML.append(indentCharacter).append("preferAccuracy").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getPreferAccuracy() != PREFERACCURACY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("preferAccuracy ").append(SFBoolObject.toString(getPreferAccuracy())).append("\n").append(indent).append(indentCharacter);
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
			if (bodies.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("bodies").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : bodies)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (collider != null)
			{
				stringClassicVRML.append(indentCharacter).append("collider").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) collider).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (colliderProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("collider").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) colliderProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (joints.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("joints").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : joints)
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
		for (X3DNode element : bodies) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		if (collider != null)
		{
			referenceElement = ((X3DConcreteElement) collider).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (colliderProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) colliderProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		for (X3DNode element : joints) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
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
		for (X3DNode element : bodies) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		if (collider != null)
		{
			referenceNode = ((X3DConcreteElement) collider).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (colliderProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) colliderProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		for (X3DNode element : joints) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
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

		setAutoDisable(getAutoDisable()); // exercise field checks, simple types
        
		setConstantForceMix(getConstantForceMix()); // exercise field checks, simple types
        
		setContactSurfaceThickness(getContactSurfaceThickness()); // exercise field checks, simple types
        
		setDisableAngularSpeed(getDisableAngularSpeed()); // exercise field checks, simple types
        
		setDisableLinearSpeed(getDisableLinearSpeed()); // exercise field checks, simple types
        
		setDisableTime(getDisableTime()); // exercise field checks, simple types
        
		setEnabled(getEnabled()); // exercise field checks, simple types
        
		setErrorCorrection(getErrorCorrection()); // exercise field checks, simple types
        
		setGravity(getGravity()); // exercise field checks, simple types
        
		setIterations(getIterations()); // exercise field checks, simple types
        
		setMaxCorrectionSpeed(getMaxCorrectionSpeed()); // exercise field checks, simple types
        
		setPreferAccuracy(getPreferAccuracy()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		for (X3DNode element : bodies) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setBodies(getBodies()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasBodies()) // test USE restrictions
		{
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained MFNode bodies";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		if (collider != null)
		{
			setCollider(getCollider());
			((X3DConcreteElement) collider).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) collider).getValidationResult());
		}
		if (colliderProtoInstance != null)
		{
			setCollider(getColliderProtoInstance());
			((X3DConcreteElement) colliderProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) colliderProtoInstance).getValidationResult());
		}
		if ((collider != null) && (colliderProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both collider and colliderProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasCollider()) // test USE restrictions
		{
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained SFNode collider";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : joints) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setJoints(getJoints()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasJoints()) // test USE restrictions
		{
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained MFNode joints";
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
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "RigidBodyCollection USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'RigidBodyCollection' node, add head statement <component name='RigidBodyPhysics' level='2'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"RigidBodyPhysics\").setLevel(2);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
