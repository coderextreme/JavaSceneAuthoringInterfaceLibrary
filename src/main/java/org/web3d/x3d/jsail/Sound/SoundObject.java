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

package org.web3d.x3d.jsail.Sound;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Sound.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Sound.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Sound.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Sound.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Sound.*;

/**
 * The Sound node controls the 3D spatialization of sound playback by a child AudioClip or MovieTexture node.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DSoundNode] The Sound node controls the 3D spatialization of sound playback by a child AudioClip or MovieTexture node. Sound intensity includes stereo support, varying according to user location and view direction in the scene.
 * <ul>
 *  <li> <i>Hint:</i> if the audio source is stereo or multi-channel, channel separation is retained during playback. </li> 
 *  <li> <i>Warning:</i> while providing sounds on the ground plane, ensure that the audible auralization ellipse is sufficiently elevated to match avatar height. </li> 
 *  <li> <i>Hint:</i> X3D Sound component Figure 16.2 Sound Node Geometry, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html#f-Soundnodegeometry" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html#f-Soundnodegeometry</a> </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints:Audio <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Audio" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Audio</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html#Sound" target="blank">X3D Abstract Specification: Sound</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Sound" target="_blank">X3D Tooltips: Sound</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Audio" target="_blank">X3D Scene Authoring Hints: Audio</a>
    */
public class SoundObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Sound.Sound
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=direction, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=direction, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] direction; // SFVec3f

 /* @name=intensity, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=intensity, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float intensity; // SFFloat

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=location, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=location, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] location; // SFVec3f

 /* @name=maxBack, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=maxBack, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float maxBack; // SFFloat

 /* @name=maxFront, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=maxFront, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float maxFront; // SFFloat

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=minBack, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=minBack, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float minBack; // SFFloat

 /* @name=minFront, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=minFront, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float minFront; // SFFloat

 /* @name=priority, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=priority, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float priority; // SFFloat

 /* @name=source, @type=SFNode, $javaType=X3DSoundSourceNode, $javaReferenceType=X3DSoundSourceNode, $javaPrimitiveType=X3DSoundSourceNode, $normalizedMemberObjectName=source, $isX3dStatement=false, @acceptableNodeTypes=X3DSoundSourceNode */ 
	private X3DSoundSourceNode source; // SFNode acceptable node types: X3DSoundSourceNode or ProtoInstanceObject
	private ProtoInstanceObject sourceProtoInstance; // allowed alternative for source field

 /* @name=spatialize, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=spatialize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean spatialize; // SFBool

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>Sound</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "Sound";

	/** Provides name of this element: <i>Sound</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>Sound</i> element: <i>Sound</i> */
	public static final String COMPONENT = "Sound";

	/** Defines X3D component for the <i>Sound</i> element: <i>Sound</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Sound</i> component level for this element: <i>1</i> */
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

	/** SFVec3f field named <i>direction</i> has default value <i>{0f,0f,1f}</i> (Java syntax) or <i>0 0 1</i> (XML syntax). */
	public static final float[] DIRECTION_DEFAULT_VALUE = {0f,0f,1f};

	/** SFFloat field named <i>intensity</i> has default value <i>1f</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final float INTENSITY_DEFAULT_VALUE = 1f;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFVec3f field named <i>location</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] LOCATION_DEFAULT_VALUE = {0f,0f,0f};

	/** SFFloat field named <i>maxBack</i> has default value <i>10f</i> (Java syntax) or <i>10</i> (XML syntax). */
	public static final float MAXBACK_DEFAULT_VALUE = 10f;

	/** SFFloat field named <i>maxFront</i> has default value <i>10f</i> (Java syntax) or <i>10</i> (XML syntax). */
	public static final float MAXFRONT_DEFAULT_VALUE = 10f;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFFloat field named <i>minBack</i> has default value <i>1f</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final float MINBACK_DEFAULT_VALUE = 1f;

	/** SFFloat field named <i>minFront</i> has default value <i>1f</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final float MINFRONT_DEFAULT_VALUE = 1f;

	/** SFFloat field named <i>priority</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float PRIORITY_DEFAULT_VALUE = 0f;

	/** SFNode field named <i>source</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DSoundSourceNode SOURCE_DEFAULT_VALUE = null;

	/** SFBool field named <i>spatialize</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean SPATIALIZE_DEFAULT_VALUE = true;

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
			case "direction":
				result = "SFVec3f";
				break;
			case "intensity":
				result = "SFFloat";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "location":
				result = "SFVec3f";
				break;
			case "maxBack":
				result = "SFFloat";
				break;
			case "maxFront":
				result = "SFFloat";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "minBack":
				result = "SFFloat";
				break;
			case "minFront":
				result = "SFFloat";
				break;
			case "priority":
				result = "SFFloat";
				break;
			case "source":
				result = "SFNode";
				break;
			case "spatialize":
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
			case "direction":
				result = "inputOutput";
				break;
			case "intensity":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "location":
				result = "inputOutput";
				break;
			case "maxBack":
				result = "inputOutput";
				break;
			case "maxFront":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "minBack":
				result = "inputOutput";
				break;
			case "minFront":
				result = "inputOutput";
				break;
			case "priority":
				result = "inputOutput";
				break;
			case "source":
				result = "inputOutput";
				break;
			case "spatialize":
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

	/** fromField ROUTE name for SFVec3f field named <i>direction</i>. */
	public static final String fromField_DIRECTION = "direction";

	/** toField ROUTE name for SFVec3f field named <i>direction</i>. */
	public static final String toField_DIRECTION = "direction";

	/** fromField ROUTE name for SFFloat field named <i>intensity</i>. */
	public static final String fromField_INTENSITY = "intensity";

	/** toField ROUTE name for SFFloat field named <i>intensity</i>. */
	public static final String toField_INTENSITY = "intensity";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFVec3f field named <i>location</i>. */
	public static final String fromField_LOCATION = "location";

	/** toField ROUTE name for SFVec3f field named <i>location</i>. */
	public static final String toField_LOCATION = "location";

	/** fromField ROUTE name for SFFloat field named <i>maxBack</i>. */
	public static final String fromField_MAXBACK = "maxBack";

	/** toField ROUTE name for SFFloat field named <i>maxBack</i>. */
	public static final String toField_MAXBACK = "maxBack";

	/** fromField ROUTE name for SFFloat field named <i>maxFront</i>. */
	public static final String fromField_MAXFRONT = "maxFront";

	/** toField ROUTE name for SFFloat field named <i>maxFront</i>. */
	public static final String toField_MAXFRONT = "maxFront";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFFloat field named <i>minBack</i>. */
	public static final String fromField_MINBACK = "minBack";

	/** toField ROUTE name for SFFloat field named <i>minBack</i>. */
	public static final String toField_MINBACK = "minBack";

	/** fromField ROUTE name for SFFloat field named <i>minFront</i>. */
	public static final String fromField_MINFRONT = "minFront";

	/** toField ROUTE name for SFFloat field named <i>minFront</i>. */
	public static final String toField_MINFRONT = "minFront";

	/** fromField ROUTE name for SFFloat field named <i>priority</i>. */
	public static final String fromField_PRIORITY = "priority";

	/** toField ROUTE name for SFFloat field named <i>priority</i>. */
	public static final String toField_PRIORITY = "priority";

	/** fromField ROUTE name for SFNode field named <i>source</i>. */
	public static final String fromField_SOURCE = "source";

	/** toField ROUTE name for SFNode field named <i>source</i>. */
	public static final String toField_SOURCE = "source";

	/** Constructor for SoundObject to initialize member variables with default values. */
	public SoundObject()
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

		direction = DIRECTION_DEFAULT_VALUE;
		intensity = INTENSITY_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		location = LOCATION_DEFAULT_VALUE;
		maxBack = MAXBACK_DEFAULT_VALUE;
		maxFront = MAXFRONT_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		minBack = MINBACK_DEFAULT_VALUE;
		minFront = MINFRONT_DEFAULT_VALUE;
		priority = PRIORITY_DEFAULT_VALUE;
		source = null;              // clear out any prior node
		sourceProtoInstance = null; // clear out any prior node
		spatialize = SPATIALIZE_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  direction of sound axis, relative to local coordinate system.  * <br>

	 * @return value of direction field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getDirection()
	{
		return direction;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  direction of sound axis, relative to local coordinate system.  * <br>

	 * @param newValue is new value for the direction field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setDirection(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound direction newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		direction = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f direction field, similar to {@link #setDirection(float[])}.
	 * @param newValue is new value for the direction field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setDirection(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDirection(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f direction field, similar to {@link #setDirection(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setDirection(float x, float y, float z)
	{
		setDirection(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setDirection(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setDirection(double x, double y, double z)
	{
		return setDirection(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setDirection(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setDirection(double[] newArray)
	{
		return setDirection(new SFVec3fObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>intensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Factor [0,1] adjusting loudness (decibels) of emitted sound.  * <br>

	 * @return value of intensity field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float getIntensity()
	{
		return intensity;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>intensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Factor [0,1] adjusting loudness (decibels) of emitted sound.  * <br>

	 * @param newValue is new value for the intensity field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setIntensity(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound intensity newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound intensity newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		intensity = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat intensity field, similar to {@link #setIntensity(float)}.
	 * @param newValue is new value for the intensity field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setIntensity(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setIntensity(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setIntensity(float)}.
	 * @param newValue is new value for field
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setIntensity(double newValue)
	{
		return setIntensity((float) newValue);
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setIS(ISObject newValue)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SoundObject clearIS()
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
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>location</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of sound ellipsoid center, relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  improve audibility by setting location='0 1.6 0' so that center height of sound ellipsoid matches typical NavigationInfo avatarSize height. </li> 
 * </ul>
	 * @return value of location field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getLocation()
	{
		return location;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>location</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of sound ellipsoid center, relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  improve audibility by setting location='0 1.6 0' so that center height of sound ellipsoid matches typical NavigationInfo avatarSize height. </li> 
 * </ul>
	 * @param newValue is new value for the location field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setLocation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound location newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		location = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f location field, similar to {@link #setLocation(float[])}.
	 * @param newValue is new value for the location field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setLocation(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLocation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f location field, similar to {@link #setLocation(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setLocation(float x, float y, float z)
	{
		setLocation(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setLocation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setLocation(double x, double y, double z)
	{
		return setLocation(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setLocation(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setLocation(double[] newArray)
	{
		return setLocation(new SFVec3fObject(newArray));
	}
	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>maxBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @return value of maxBack field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float getMaxBack()
	{
		return maxBack;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @param newValue is new value for the maxBack field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setMaxBack(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound maxBack newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		maxBack = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat maxBack field, similar to {@link #setMaxBack(float)}.
	 * @param newValue is new value for the maxBack field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMaxBack(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMaxBack(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMaxBack(float)}.
	 * @param newValue is new value for field
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMaxBack(double newValue)
	{
		return setMaxBack((float) newValue);
	}
	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>maxFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @return value of maxFront field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float getMaxFront()
	{
		return maxFront;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @param newValue is new value for the maxFront field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setMaxFront(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound maxFront newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		maxFront = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat maxFront field, similar to {@link #setMaxFront(float)}.
	 * @param newValue is new value for the maxFront field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMaxFront(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMaxFront(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMaxFront(float)}.
	 * @param newValue is new value for field
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMaxFront(double newValue)
	{
		return setMaxFront((float) newValue);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SoundObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>minBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @return value of minBack field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float getMinBack()
	{
		return minBack;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @param newValue is new value for the minBack field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setMinBack(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound minBack newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		minBack = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat minBack field, similar to {@link #setMinBack(float)}.
	 * @param newValue is new value for the minBack field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMinBack(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMinBack(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMinBack(float)}.
	 * @param newValue is new value for field
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMinBack(double newValue)
	{
		return setMinBack((float) newValue);
	}
	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>minFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @return value of minFront field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float getMinFront()
	{
		return minFront;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @param newValue is new value for the minFront field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setMinFront(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound minFront newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		minFront = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat minFront field, similar to {@link #setMinFront(float)}.
	 * @param newValue is new value for the minFront field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMinFront(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMinFront(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMinFront(float)}.
	 * @param newValue is new value for field
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setMinFront(double newValue)
	{
		return setMinFront((float) newValue);
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>priority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Player hint [0,1] if needed to choose which sounds to play.  * <br>

	 * @return value of priority field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public float getPriority()
	{
		return priority;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>priority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Player hint [0,1] if needed to choose which sounds to play.  * <br>

	 * @param newValue is new value for the priority field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setPriority(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound priority newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound priority newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		priority = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat priority field, similar to {@link #setPriority(float)}.
	 * @param newValue is new value for the priority field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setPriority(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setPriority(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setPriority(float)}.
	 * @param newValue is new value for field
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setPriority(double newValue)
	{
		return setPriority((float) newValue);
	}
	/**
	 * Provide X3DSoundSourceNode instance (using a properly typed node) from inputOutput SFNode field <i>source</i>.
	 * @see #getSourceProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DSoundSourceNode] sound source for the Sound node, either an AudioClip node or a MovieTexture node.
 * <ul>
 *  <li> <i> Warning:</i>  if source field is not specified, the Sound node does not emit audio. </li> 
 * </ul>
	 * @return value of source field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DSoundSourceNode getSource()
	{
		return source;
	}

	/**
	 * Accessor method to assign X3DSoundSourceNode instance (using a properly typed node) to inputOutput SFNode field <i>source</i>.
	 * @see #setSource(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DSoundSourceNode] sound source for the Sound node, either an AudioClip node or a MovieTexture node.
 * <ul>
 *  <li> <i> Warning:</i>  if source field is not specified, the Sound node does not emit audio. </li> 
 * </ul>
	 * @param newValue is new value for the source field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setSource(X3DSoundSourceNode newValue)
	{
		// set-newValue-validity-checks #0
		source = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) source).setParentObject(this); // parentTest15
			if (source instanceof org.web3d.x3d.jsail.Texturing.MovieTextureObject)
				((X3DConcreteNode)    source).setContainerFieldOverride("source");
		}
		if (sourceProtoInstance != null)
		{
			sourceProtoInstance.setParentObject(null); // housekeeping, clear prior object
			sourceProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of source field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public SoundObject clearSource()
	{
		((X3DConcreteElement) source).clearParentObject(); // remove references to facilitate Java memory management
		source = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>source</i>.
	 * @see #setSource(X3DSoundSourceNode)
	 * @param newValue is new value for the source field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setSource(ProtoInstanceObject newValue)
	{
		if (sourceProtoInstance != null)
		{
			((X3DConcreteElement) sourceProtoInstance).setParentObject(null); // parentTest15.5
	    }
		sourceProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) sourceProtoInstance).setParentObject(this); // parentTest15.6
            sourceProtoInstance.setContainerField("source");
	    }
		if (source != null)
		{
			((X3DConcreteElement) source).setParentObject(null); // housekeeping, clear prior object
			source = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getSourceProtoInstance()
		{
			return sourceProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>source</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getSource()
	 * @see #getSourceProtoInstance()
	 */
	public boolean hasSource()
	{
		return (source != null) || (sourceProtoInstance != null);
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>spatialize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to spatialize sound playback relative to viewer.
 * <ul>
 *  <li> <i> Hint:</i>  only effective between minimum and maximum ellipsoids. </li> 
 * </ul>
	 * @return value of spatialize field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getSpatialize()
	{
		return spatialize;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>spatialize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to spatialize sound playback relative to viewer.
 * <ul>
 *  <li> <i> Hint:</i>  only effective between minimum and maximum ellipsoids. </li> 
 * </ul>
	 * @param newValue is new value for the spatialize field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SoundObject setSpatialize(boolean newValue)
	{
		// set-newValue-validity-checks #0
		spatialize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool spatialize field, similar to {@link #setSpatialize(boolean)}.
	 * @param newValue is new value for the spatialize field.
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setSpatialize(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSpatialize(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SoundObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to Sound DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound DEF newValue='" + newValue + "'" + 
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SoundObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to Sound USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Sound USE newValue='" + newValue + "'" + 
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final SoundObject setCssClass(String newValue)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setCssClass(SFStringObject newValue)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SoundObject setUSE(SoundObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on SoundObject" +
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
	public SoundObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public SoundObject addComments (String newComment)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public SoundObject addComments (String[] newComments)
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
	 * @return {@link SoundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public SoundObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (source != null) || (sourceProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<Sound"); // start opening tag
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
			if ((!Arrays.equals(getDirection(), DIRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" direction='").append(SFVec3fObject.toString(getDirection())).append("'");
			}
			if (((getIntensity() != INTENSITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" intensity='").append(SFFloatObject.toString(getIntensity())).append("'");
			}
			if ((!Arrays.equals(getLocation(), LOCATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" location='").append(SFVec3fObject.toString(getLocation())).append("'");
			}
			if (((getMaxBack() != MAXBACK_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" maxBack='").append(SFFloatObject.toString(getMaxBack())).append("'");
			}
			if (((getMaxFront() != MAXFRONT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" maxFront='").append(SFFloatObject.toString(getMaxFront())).append("'");
			}
			if (((getMinBack() != MINBACK_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" minBack='").append(SFFloatObject.toString(getMinBack())).append("'");
			}
			if (((getMinFront() != MINFRONT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" minFront='").append(SFFloatObject.toString(getMinFront())).append("'");
			}
			if (((getPriority() != PRIORITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" priority='").append(SFFloatObject.toString(getPriority())).append("'");
			}
			if (((getSpatialize() != SPATIALIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" spatialize='").append(SFBoolObject.toString(getSpatialize())).append("'");
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
			if      (source != null)
			{
				stringX3D.append(((X3DConcreteElement)source).toStringX3D(indentLevel + indentIncrement));
			}
			else if (sourceProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)sourceProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</Sound>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=Sound, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (source != null) || (sourceProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("Sound").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("direction"))
						{
							stringClassicVRML.append(indentCharacter).append("direction").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getDirection(), DIRECTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("direction ").append(SFVec3fObject.toString(getDirection())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("intensity"))
						{
							stringClassicVRML.append(indentCharacter).append("intensity").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getIntensity() != INTENSITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("intensity ").append(SFFloatObject.toString(getIntensity())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("location"))
						{
							stringClassicVRML.append(indentCharacter).append("location").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getLocation(), LOCATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("location ").append(SFVec3fObject.toString(getLocation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("maxBack"))
						{
							stringClassicVRML.append(indentCharacter).append("maxBack").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMaxBack() != MAXBACK_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("maxBack ").append(SFFloatObject.toString(getMaxBack())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("maxFront"))
						{
							stringClassicVRML.append(indentCharacter).append("maxFront").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMaxFront() != MAXFRONT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("maxFront ").append(SFFloatObject.toString(getMaxFront())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("minBack"))
						{
							stringClassicVRML.append(indentCharacter).append("minBack").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMinBack() != MINBACK_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("minBack ").append(SFFloatObject.toString(getMinBack())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("minFront"))
						{
							stringClassicVRML.append(indentCharacter).append("minFront").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMinFront() != MINFRONT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("minFront ").append(SFFloatObject.toString(getMinFront())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("priority"))
						{
							stringClassicVRML.append(indentCharacter).append("priority").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getPriority() != PRIORITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("priority ").append(SFFloatObject.toString(getPriority())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("spatialize"))
						{
							stringClassicVRML.append(indentCharacter).append("spatialize").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSpatialize() != SPATIALIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("spatialize ").append(SFBoolObject.toString(getSpatialize())).append("\n").append(indent).append(indentCharacter);
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
			if (source != null)
			{
				stringClassicVRML.append(indentCharacter).append("source").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) source).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (sourceProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("source").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) sourceProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
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
		if (source != null)
		{
			referenceElement = ((X3DConcreteElement) source).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (sourceProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) sourceProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (source != null)
		{
			referenceNode = ((X3DConcreteElement) source).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (sourceProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) sourceProtoInstance).findNodeByDEF(DEFvalue);
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

		setDirection(getDirection()); // exercise field checks, simple types
        
		setIntensity(getIntensity()); // exercise field checks, simple types
        
		setLocation(getLocation()); // exercise field checks, simple types
        
		setMaxBack(getMaxBack()); // exercise field checks, simple types
        
		setMaxFront(getMaxFront()); // exercise field checks, simple types
        
		setMinBack(getMinBack()); // exercise field checks, simple types
        
		setMinFront(getMinFront()); // exercise field checks, simple types
        
		setPriority(getPriority()); // exercise field checks, simple types
        
		setSpatialize(getSpatialize()); // exercise field checks, simple types
        
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
			String errorNotice = "Sound USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Sound USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "Sound USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Sound USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (source != null)
		{
			setSource(getSource());
			((X3DConcreteElement) source).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) source).getValidationResult());
		}
		if (sourceProtoInstance != null)
		{
			setSource(getSourceProtoInstance());
			((X3DConcreteElement) sourceProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) sourceProtoInstance).getValidationResult());
		}
		if ((source != null) && (sourceProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both source and sourceProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasSource()) // test USE restrictions
		{
			String errorNotice = "Sound USE='" + getUSE() + "' is not allowed to have contained SFNode source";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Sound USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'Sound' node, add head statement <component name='Sound' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Sound\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
