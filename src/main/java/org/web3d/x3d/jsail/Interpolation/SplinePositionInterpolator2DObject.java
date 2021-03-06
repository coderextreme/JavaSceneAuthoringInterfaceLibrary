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

package org.web3d.x3d.jsail.Interpolation;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Interpolation.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Interpolation.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * SplinePositionInterpolator2D performs non-linear interpolation among paired lists of 2-tuple values and velocities to produce an SFVec2f value_changed output event.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DInterpolatorNode] SplinePositionInterpolator2D performs non-linear interpolation among paired lists of 2-tuple values and velocities to produce an SFVec2f value_changed output event.
 * <ul>
 *  <li> <i>Hint:</i> typical input connection is ROUTE someTimeSensorDEF.fraction_changed TO thisInterpolatorDEF.set_fraction </li> 
 *  <li> <i>Hint:</i> typical output connection is ROUTE thisInterpolatorDEF.value_changed TO someDestinationNodeDEF.set_someAttribute. </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Interpolation' level='4'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#SplinePositionInterpolator2D" target="blank">X3D Abstract Specification: SplinePositionInterpolator2D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SplinePositionInterpolator2D" target="_blank">X3D Tooltips: SplinePositionInterpolator2D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class SplinePositionInterpolator2DObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Interpolation.SplinePositionInterpolator2D
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=closed, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=closed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean closed; // SFBool

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=key, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=key, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> key = new ArrayList<>(); // MFFloat

 /* @name=keyValue, @type=MFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=keyValue, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] keyValue; // MFVec2f

 /* @name=keyVelocity, @type=MFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=keyVelocity, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] keyVelocity; // MFVec2f

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=normalizeVelocity, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=normalizeVelocity, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean normalizeVelocity; // SFBool

 /* @name=set_fraction, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=fraction, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float fraction; // SFFloat

 /* @name=value_changed, @type=SFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=value, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] value; // SFVec2f

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>SplinePositionInterpolator2D</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "SplinePositionInterpolator2D";

	/** Provides name of this element: <i>SplinePositionInterpolator2D</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>SplinePositionInterpolator2D</i> element: <i>Interpolation</i> */
	public static final String COMPONENT = "Interpolation";

	/** Defines X3D component for the <i>SplinePositionInterpolator2D</i> element: <i>Interpolation</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Interpolation</i> component level for this element: <i>4</i> */
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

	/** SFBool field named <i>closed</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean CLOSED_DEFAULT_VALUE = false;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** MFFloat field named <i>key</i> has default value equal to an empty list. */
	public static final ArrayList<Float> KEY_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** MFVec2f field named <i>keyValue</i> has default value equal to an empty list. */
	public static final float[] KEYVALUE_DEFAULT_VALUE = {};

	/** MFVec2f field named <i>keyVelocity</i> has default value equal to an empty list. */
	public static final float[] KEYVELOCITY_DEFAULT_VALUE = {};

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFBool field named <i>normalizeVelocity</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean NORMALIZEVELOCITY_DEFAULT_VALUE = false;

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
			case "closed":
				result = "SFBool";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "key":
				result = "MFFloat";
				break;
			case "keyValue":
				result = "MFVec2f";
				break;
			case "keyVelocity":
				result = "MFVec2f";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "normalizeVelocity":
				result = "SFBool";
				break;
			case "fraction":
				result = "SFFloat";
				break;
			case "value":
				result = "SFVec2f";
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
			case "closed":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "key":
				result = "inputOutput";
				break;
			case "keyValue":
				result = "inputOutput";
				break;
			case "keyVelocity":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "normalizeVelocity":
				result = "inputOutput";
				break;
			case "set_fraction":
				result = "inputOnly";
				break;
			case "value_changed":
				result = "outputOnly";
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

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for MFFloat field named <i>key</i>. */
	public static final String fromField_KEY = "key";

	/** toField ROUTE name for MFFloat field named <i>key</i>. */
	public static final String toField_KEY = "key";

	/** fromField ROUTE name for MFVec2f field named <i>keyValue</i>. */
	public static final String fromField_KEYVALUE = "keyValue";

	/** toField ROUTE name for MFVec2f field named <i>keyValue</i>. */
	public static final String toField_KEYVALUE = "keyValue";

	/** fromField ROUTE name for MFVec2f field named <i>keyVelocity</i>. */
	public static final String fromField_KEYVELOCITY = "keyVelocity";

	/** toField ROUTE name for MFVec2f field named <i>keyVelocity</i>. */
	public static final String toField_KEYVELOCITY = "keyVelocity";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFBool field named <i>normalizeVelocity</i>. */
	public static final String fromField_NORMALIZEVELOCITY = "normalizeVelocity";

	/** toField ROUTE name for SFBool field named <i>normalizeVelocity</i>. */
	public static final String toField_NORMALIZEVELOCITY = "normalizeVelocity";

	/** toField ROUTE name for SFFloat field named <i>set_fraction</i>. */
	public static final String toField_SET_FRACTION = "set_fraction";

	/** fromField ROUTE name for SFVec2f field named <i>value_changed</i>. */
	public static final String fromField_VALUE_CHANGED = "value_changed";

	/** Constructor for SplinePositionInterpolator2DObject to initialize member variables with default values. */
	public SplinePositionInterpolator2DObject()
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

		closed = CLOSED_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		key = new ArrayList<>();
		keyValue =  new float[] { };
		keyVelocity =  new float[] { };
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		normalizeVelocity = NORMALIZEVELOCITY_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>closed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether or not the curve is closed (i.e. matching end values), with continuous velocity vectors as the interpolator transitions from the last key to the first key.
 * <ul>
 *  <li> <i>Warning:</i> if velocity vectors at first and last keys are specified, the closed field is ignored. </li> 
 *  <li> <i>Warning:</i>  if keyValues at first and last key are not identical, the closed field is ignored. </li> 
 * </ul>
	 * @return value of closed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getClosed()
	{
		return closed;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>closed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether or not the curve is closed (i.e. matching end values), with continuous velocity vectors as the interpolator transitions from the last key to the first key.
 * <ul>
 *  <li> <i>Warning:</i> if velocity vectors at first and last keys are specified, the closed field is ignored. </li> 
 *  <li> <i>Warning:</i>  if keyValues at first and last key are not identical, the closed field is ignored. </li> 
 * </ul>
	 * @param newValue is new value for the closed field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setClosed(boolean newValue)
	{
		// set-newValue-validity-checks #0
		closed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool closed field, similar to {@link #setClosed(boolean)}.
	 * @param newValue is new value for the closed field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setClosed(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setClosed(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setIS(ISObject newValue)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SplinePositionInterpolator2DObject clearIS()
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
	 * Provide array of Float results from inputOutput MFFloat field named <i>key</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Definition parameters for nonlinear-interpolation function time intervals, listed in non-decreasing order and corresponding to keyValue, keyVelocity array values.
 * <ul>
 *  <li> <i>Warning:</i> number of keys must match number of keyValues! </li> 
 *  <li> <i>Warning:</i> values in key array shall be monotonically non-decreasing, meaning that each value is greater than or equal to the preceding value. </li> 
 *  <li> <i>Hint:</i>  typical interval for values in key array is within range of 0 to 1, but larger intervals can be defined with arbitrary bounds. </li> 
 * </ul>
	 * @return value of key field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getKey()
	{
		final float[] valuesArray = new float[key.size()];
		int i = 0;
		for (Float arrayElement : key) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat key field, similar to {@link #getKey()}.
	 * @return value of key field
	 */
	public ArrayList<Float> getKeyList()
	{
		return key;
	}
	/**
	 * Utility method to get String value of MFFloat key field, similar to {@link #getKey()}.
	 * @return value of key field
	 */
	public String getKeyString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : key) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to inputOutput MFFloat field named <i>key</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Definition parameters for nonlinear-interpolation function time intervals, listed in non-decreasing order and corresponding to keyValue, keyVelocity array values.
 * <ul>
 *  <li> <i>Warning:</i> number of keys must match number of keyValues! </li> 
 *  <li> <i>Warning:</i> values in key array shall be monotonically non-decreasing, meaning that each value is greater than or equal to the preceding value. </li> 
 *  <li> <i>Hint:</i>  typical interval for values in key array is within range of 0 to 1, but larger intervals can be defined with arbitrary bounds. </li> 
 * </ul>
	 * @param newValue is new value for the key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setKey(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearKey(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			key.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat key field, similar to {@link #setKey(float[])}.
	 * @param newValue is new value for the key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKey(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setKey(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat key field, similar to {@link #setKey(float[])}.
	 * @param newValue is new value for the key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKey(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearKey(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setKey(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public SplinePositionInterpolator2DObject clearKey()
	{
		key.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat key field, similar to {@link #setKey(float[])}.
	 * @param newValue is new value for the key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKey(int[] newValue)
	{
		if (newValue == null)		{
			clearKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setKey(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat key field.
	 * @param newValue is new value to add to the key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject addKey(float newValue)
	{
		key.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat key field.
	 * @param newValue is new value to add to the key field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject addKey(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		key.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setKey(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKey(double[] newArray)
	{
		return setKey(new MFFloatObject(newArray));
	}
	/**
	 * Provide array of 2-tuple float results from inputOutput MFVec2f field named <i>keyValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyValues!. </li> 
 * </ul>
	 * @return value of keyValue field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getKeyValue()
	{
		return keyValue;
	}

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput MFVec2f field named <i>keyValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyValues!. </li> 
 * </ul>
	 * @param newValue is new value for the keyValue field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setKeyValue(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 2 != 0) // 2-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SplinePositionInterpolator2D keyValue newValue=" + MFVec2fObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 2");
		}
		keyValue = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFVec2f keyValue field, similar to {@link #setKeyValue(float[])}.
	 * @param newValue is new value for the keyValue field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKeyValue(MFVec2fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setKeyValue(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFVec2fObject value to MFVec2f keyValue field.
	 * @param newValue is new value to add to the keyValue field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject addKeyValue(SFVec2fObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(keyValue, keyValue.length + 2);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, keyValue.length, 2);
		keyValue =  result;
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setKeyValue(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKeyValue(double[] newArray)
	{
		return setKeyValue(new MFVec2fObject(newArray));
	}
	/**
	 * Provide array of 2-tuple float results from inputOutput MFVec2f field named <i>keyVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyVelocity values!. </li> 
 * </ul>
	 * @return value of keyVelocity field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getKeyVelocity()
	{
		return keyVelocity;
	}

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput MFVec2f field named <i>keyVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyVelocity values!. </li> 
 * </ul>
	 * @param newValue is new value for the keyVelocity field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setKeyVelocity(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 2 != 0) // 2-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SplinePositionInterpolator2D keyVelocity newValue=" + MFVec2fObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 2");
		}
		keyVelocity = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFVec2f keyVelocity field, similar to {@link #setKeyVelocity(float[])}.
	 * @param newValue is new value for the keyVelocity field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKeyVelocity(MFVec2fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setKeyVelocity(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFVec2fObject value to MFVec2f keyVelocity field.
	 * @param newValue is new value to add to the keyVelocity field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject addKeyVelocity(SFVec2fObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(keyVelocity, keyVelocity.length + 2);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, keyVelocity.length, 2);
		keyVelocity =  result;
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setKeyVelocity(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setKeyVelocity(double[] newArray)
	{
		return setKeyVelocity(new MFVec2fObject(newArray));
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SplinePositionInterpolator2DObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide boolean value from inputOutput SFBool field named <i>normalizeVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> normalizeVelocity field specifies whether the velocity vectors are normalized to produce smooth speed transitions, or transformed into tangency vectors.
 * <ul>
 *  <li> <i> Hint:</i>  X3D 19.2.3 Non-linear interpolation <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation</a> </li> 
 * </ul>
	 * @return value of normalizeVelocity field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getNormalizeVelocity()
	{
		return normalizeVelocity;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>normalizeVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> normalizeVelocity field specifies whether the velocity vectors are normalized to produce smooth speed transitions, or transformed into tangency vectors.
 * <ul>
 *  <li> <i> Hint:</i>  X3D 19.2.3 Non-linear interpolation <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation</a> </li> 
 * </ul>
	 * @param newValue is new value for the normalizeVelocity field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator2DObject setNormalizeVelocity(boolean newValue)
	{
		// set-newValue-validity-checks #0
		normalizeVelocity = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool normalizeVelocity field, similar to {@link #setNormalizeVelocity(boolean)}.
	 * @param newValue is new value for the normalizeVelocity field.
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setNormalizeVelocity(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setNormalizeVelocity(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of 2-tuple float results from outputOnly SFVec2f field named <i>value_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Nonlinearly interpolated output value computed by using current time fraction along with corresponding key, keyValue and keyVelocity values.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of value_changed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getValue()
	{
		return value;
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SplinePositionInterpolator2DObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to SplinePositionInterpolator2D DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SplinePositionInterpolator2D DEF newValue='" + newValue + "'" + 
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SplinePositionInterpolator2DObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to SplinePositionInterpolator2D USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("SplinePositionInterpolator2D USE newValue='" + newValue + "'" + 
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SplinePositionInterpolator2DObject setCssClass(String newValue)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setCssClass(SFStringObject newValue)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator2DObject setUSE(SplinePositionInterpolator2DObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on SplinePositionInterpolator2DObject" +
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
	public SplinePositionInterpolator2DObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public SplinePositionInterpolator2DObject addComments (String newComment)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public SplinePositionInterpolator2DObject addComments (String[] newComments)
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
	 * @return {@link SplinePositionInterpolator2DObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public SplinePositionInterpolator2DObject addComments (CommentsBlock newCommentsBlock)
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

		stringX3D.append(indent).append("<SplinePositionInterpolator2D"); // start opening tag
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
			if (((getClosed() != CLOSED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" closed='").append(SFBoolObject.toString(getClosed())).append("'");
			}
			if (((getKey().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" key='").append(MFFloatObject.toString(getKey())).append("'");
			}
			if ((getKeyValue().length > 0) || !ConfigurationProperties.getStripDefaultAttributes() /* otherwise */ && !isUSE())
			{
				stringX3D.append(" keyValue='").append(MFVec2fObject.toString(getKeyValue())).append("'");
			}
			if ((getKeyVelocity().length > 0) || !ConfigurationProperties.getStripDefaultAttributes() /* otherwise */ && !isUSE())
			{
				stringX3D.append(" keyVelocity='").append(MFVec2fObject.toString(getKeyVelocity())).append("'");
			}
			if (((getNormalizeVelocity() != NORMALIZEVELOCITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" normalizeVelocity='").append(SFBoolObject.toString(getNormalizeVelocity())).append("'");
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
			stringX3D.append(indent).append("</SplinePositionInterpolator2D>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=SplinePositionInterpolator2D, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
			stringClassicVRML.append("SplinePositionInterpolator2D").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("closed"))
						{
							stringClassicVRML.append(indentCharacter).append("closed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getClosed() != CLOSED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("closed ").append(SFBoolObject.toString(getClosed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("key"))
						{
							stringClassicVRML.append(indentCharacter).append("key").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getKey().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("key ").append("[ ").append(MFFloatObject.toString(getKey())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("keyValue"))
						{
							stringClassicVRML.append(indentCharacter).append("keyValue").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getKeyValue().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("keyValue ").append("[ ").append(MFVec2fObject.toString(getKeyValue())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("keyVelocity"))
						{
							stringClassicVRML.append(indentCharacter).append("keyVelocity").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getKeyVelocity().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("keyVelocity ").append("[ ").append(MFVec2fObject.toString(getKeyVelocity())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("normalizeVelocity"))
						{
							stringClassicVRML.append(indentCharacter).append("normalizeVelocity").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getNormalizeVelocity() != NORMALIZEVELOCITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("normalizeVelocity ").append(SFBoolObject.toString(getNormalizeVelocity())).append("\n").append(indent).append(indentCharacter);
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

		setClosed(getClosed()); // exercise field checks, simple types
        
		setKey(getKey()); // exercise field checks, simple types
        
		setKeyValue(getKeyValue()); // exercise field checks, simple types
        
		setKeyVelocity(getKeyVelocity()); // exercise field checks, simple types
        
		setNormalizeVelocity(getNormalizeVelocity()); // exercise field checks, simple types
        
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
			String errorNotice = "SplinePositionInterpolator2D USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "SplinePositionInterpolator2D USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "SplinePositionInterpolator2D USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "SplinePositionInterpolator2D USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'SplinePositionInterpolator2D' node, add head statement <component name='Interpolation' level='4'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Interpolation\").setLevel(4);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
