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

package org.web3d.x3d.jsail.HAnim;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * An HAnimMotion node supports discrete frame-by-frame playback for H-Anim motion data animation.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  (X3D version 4.0 draft) [X3DChildNode] An HAnimMotion node supports discrete frame-by-frame playback for H-Anim motion data animation. Design characteristics include integration with HAnim figure data and HAnimJoint nodes, animation control, and playback of raw motion data.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/" target="blank">X3D Abstract Specification: HAnimMotion</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimMotion" target="_blank">X3D Tooltips: HAnimMotion</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class HAnimMotionObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.HAnim.HAnimMotion
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=channels, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=channels, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> channels = new ArrayList<>(); // MFString

 /* @name=channelsEnabled, @type=MFBool, $javaType=ArrayList<Boolean>, $javaReferenceType=Boolean, $javaPrimitiveType=ArrayList<Boolean>, $normalizedMemberObjectName=channelsEnabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Boolean> channelsEnabled = new ArrayList<>(); // MFBool

 /* @name=cycleTime, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=cycleTime, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double cycleTime; // SFTime

 /* @name=description, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=description, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String description; // SFString

 /* @name=elapsedTime, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=elapsedTime, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double elapsedTime; // SFTime

 /* @name=enabled, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=enabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean enabled; // SFBool

 /* @name=endFrame, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=endFrame, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int endFrame; // SFInt32

 /* @name=frameCount, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=frameCount, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int frameCount; // SFInt32

 /* @name=frameDuration, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=frameDuration, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double frameDuration; // SFTime

 /* @name=frameIncrement, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=frameIncrement, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int frameIncrement; // SFInt32

 /* @name=frameIndex, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=frameIndex, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int frameIndex; // SFInt32

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=joints, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=joints, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> joints = new ArrayList<>(); // MFString

 /* @name=loa, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=loa, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int loa; // SFInt32

 /* @name=loop, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=loop, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean loop; // SFBool

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=startFrame, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=startFrame, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int startFrame; // SFInt32

 /* @name=values, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=values, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> values = new ArrayList<>(); // MFFloat

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>HAnimMotion</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "HAnimMotion";

	/** Provides name of this element: <i>HAnimMotion</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>HAnimMotion</i> element: <i>HAnim</i> */
	public static final String COMPONENT = "HAnim";

	/** Defines X3D component for the <i>HAnimMotion</i> element: <i>HAnim</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>HAnim</i> component level for this element: <i>2</i> */
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

	/** MFString field named <i>channels</i> has default value equal to an empty list. */
	public static final ArrayList<String> CHANNELS_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** MFBool field named <i>channelsEnabled</i> has default value equal to an empty list. */
	public static final ArrayList<Boolean> CHANNELSENABLED_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** SFString field named <i>description</i> has default value equal to an empty string. */
	public static final String DESCRIPTION_DEFAULT_VALUE = "";

	/** SFBool field named <i>enabled</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean ENABLED_DEFAULT_VALUE = false;

	/** SFInt32 field named <i>endFrame</i> has default value <i>-1</i> (Java syntax) or <i>-1</i> (XML syntax). */
	public static final int ENDFRAME_DEFAULT_VALUE = -1;

	/** SFTime field named <i>frameDuration</i> has default value <i>0.1</i> (Java syntax) or <i>0.1</i> (XML syntax). */
	public static final double FRAMEDURATION_DEFAULT_VALUE = 0.1;

	/** SFInt32 field named <i>frameIncrement</i> has default value <i>1</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final int FRAMEINCREMENT_DEFAULT_VALUE = 1;

	/** SFInt32 field named <i>frameIndex</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int FRAMEINDEX_DEFAULT_VALUE = 0;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** MFString field named <i>joints</i> has default value equal to an empty list. */
	public static final ArrayList<String> JOINTS_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** SFInt32 field named <i>loa</i> has default value <i>-1</i> (Java syntax) or <i>-1</i> (XML syntax). */
	public static final int LOA_DEFAULT_VALUE = -1;

	/** SFBool field named <i>loop</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean LOOP_DEFAULT_VALUE = false;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFInt32 field named <i>startFrame</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int STARTFRAME_DEFAULT_VALUE = 0;

	/** MFFloat field named <i>values</i> has default value equal to an empty list. */
	public static final ArrayList<Float> VALUES_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

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
			case "channels":
				result = "MFString";
				break;
			case "channelsEnabled":
				result = "MFBool";
				break;
			case "cycleTime":
				result = "SFTime";
				break;
			case "description":
				result = "SFString";
				break;
			case "elapsedTime":
				result = "SFTime";
				break;
			case "enabled":
				result = "SFBool";
				break;
			case "endFrame":
				result = "SFInt32";
				break;
			case "frameCount":
				result = "SFInt32";
				break;
			case "frameDuration":
				result = "SFTime";
				break;
			case "frameIncrement":
				result = "SFInt32";
				break;
			case "frameIndex":
				result = "SFInt32";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "joints":
				result = "MFString";
				break;
			case "loa":
				result = "SFInt32";
				break;
			case "loop":
				result = "SFBool";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "startFrame":
				result = "SFInt32";
				break;
			case "values":
				result = "MFFloat";
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
			case "channels":
				result = "inputOutput";
				break;
			case "channelsEnabled":
				result = "inputOutput";
				break;
			case "cycleTime":
				result = "outputOnly";
				break;
			case "description":
				result = "inputOutput";
				break;
			case "elapsedTime":
				result = "outputOnly";
				break;
			case "enabled":
				result = "inputOutput";
				break;
			case "endFrame":
				result = "inputOutput";
				break;
			case "frameCount":
				result = "outputOnly";
				break;
			case "frameDuration":
				result = "inputOutput";
				break;
			case "frameIncrement":
				result = "inputOutput";
				break;
			case "frameIndex":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "joints":
				result = "inputOutput";
				break;
			case "loa":
				result = "inputOutput";
				break;
			case "loop":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "startFrame":
				result = "inputOutput";
				break;
			case "values":
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
	public static final String containerField_DEFAULT_VALUE = "motions"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for MFString field named <i>channels</i>. */
	public static final String fromField_CHANNELS = "channels";

	/** toField ROUTE name for MFString field named <i>channels</i>. */
	public static final String toField_CHANNELS = "channels";

	/** fromField ROUTE name for MFBool field named <i>channelsEnabled</i>. */
	public static final String fromField_CHANNELSENABLED = "channelsEnabled";

	/** toField ROUTE name for MFBool field named <i>channelsEnabled</i>. */
	public static final String toField_CHANNELSENABLED = "channelsEnabled";

	/** fromField ROUTE name for SFTime field named <i>cycleTime</i>. */
	public static final String fromField_CYCLETIME = "cycleTime";

	/** fromField ROUTE name for SFString field named <i>description</i>. */
	public static final String fromField_DESCRIPTION = "description";

	/** toField ROUTE name for SFString field named <i>description</i>. */
	public static final String toField_DESCRIPTION = "description";

	/** fromField ROUTE name for SFTime field named <i>elapsedTime</i>. */
	public static final String fromField_ELAPSEDTIME = "elapsedTime";

	/** fromField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String fromField_ENABLED = "enabled";

	/** toField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String toField_ENABLED = "enabled";

	/** fromField ROUTE name for SFInt32 field named <i>endFrame</i>. */
	public static final String fromField_ENDFRAME = "endFrame";

	/** toField ROUTE name for SFInt32 field named <i>endFrame</i>. */
	public static final String toField_ENDFRAME = "endFrame";

	/** fromField ROUTE name for SFInt32 field named <i>frameCount</i>. */
	public static final String fromField_FRAMECOUNT = "frameCount";

	/** fromField ROUTE name for SFTime field named <i>frameDuration</i>. */
	public static final String fromField_FRAMEDURATION = "frameDuration";

	/** toField ROUTE name for SFTime field named <i>frameDuration</i>. */
	public static final String toField_FRAMEDURATION = "frameDuration";

	/** fromField ROUTE name for SFInt32 field named <i>frameIncrement</i>. */
	public static final String fromField_FRAMEINCREMENT = "frameIncrement";

	/** toField ROUTE name for SFInt32 field named <i>frameIncrement</i>. */
	public static final String toField_FRAMEINCREMENT = "frameIncrement";

	/** fromField ROUTE name for SFInt32 field named <i>frameIndex</i>. */
	public static final String fromField_FRAMEINDEX = "frameIndex";

	/** toField ROUTE name for SFInt32 field named <i>frameIndex</i>. */
	public static final String toField_FRAMEINDEX = "frameIndex";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for MFString field named <i>joints</i>. */
	public static final String fromField_JOINTS = "joints";

	/** toField ROUTE name for MFString field named <i>joints</i>. */
	public static final String toField_JOINTS = "joints";

	/** fromField ROUTE name for SFInt32 field named <i>loa</i>. */
	public static final String fromField_LOA = "loa";

	/** toField ROUTE name for SFInt32 field named <i>loa</i>. */
	public static final String toField_LOA = "loa";

	/** fromField ROUTE name for SFBool field named <i>loop</i>. */
	public static final String fromField_LOOP = "loop";

	/** toField ROUTE name for SFBool field named <i>loop</i>. */
	public static final String toField_LOOP = "loop";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFInt32 field named <i>startFrame</i>. */
	public static final String fromField_STARTFRAME = "startFrame";

	/** toField ROUTE name for SFInt32 field named <i>startFrame</i>. */
	public static final String toField_STARTFRAME = "startFrame";

	/** fromField ROUTE name for MFFloat field named <i>values</i>. */
	public static final String fromField_VALUES = "values";

	/** toField ROUTE name for MFFloat field named <i>values</i>. */
	public static final String toField_VALUES = "values";

	/** Constructor for HAnimMotionObject to initialize member variables with default values. */
	public HAnimMotionObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "motions" }; // type xs:NMTOKEN

		channels = new ArrayList<>(CHANNELS_DEFAULT_VALUE);
		channelsEnabled = new ArrayList<>();
		description = DESCRIPTION_DEFAULT_VALUE;
		enabled = ENABLED_DEFAULT_VALUE;
		endFrame = ENDFRAME_DEFAULT_VALUE;
		frameDuration = FRAMEDURATION_DEFAULT_VALUE;
		frameIncrement = FRAMEINCREMENT_DEFAULT_VALUE;
		frameIndex = FRAMEINDEX_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		joints = new ArrayList<>(JOINTS_DEFAULT_VALUE);
		loa = LOA_DEFAULT_VALUE;
		loop = LOOP_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		startFrame = STARTFRAME_DEFAULT_VALUE;
		values = new ArrayList<>();

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String results from inputOutput MFString field named <i>channels</i>.
	 * <br><br>
	 * <i>Tooltip:</i> list of number of channels for transformation, followed by transformation type of each channel of data. Each value is space or comma separated.
 * <ul>
 *  <li> <i> Hint:</i>  channels are enabled by default, unless otherwise indicated by channelsEnabled field. </li> 
 * </ul>
	 * @return value of channels field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getChannels()
	{
		final String[] valuesArray = new String[channels.size()];
		int i = 0;
		for (String arrayElement : channels) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString channels field, similar to {@link #getChannels()}.
	 * @return value of channels field
	 */
	public ArrayList<String> getChannelsList()
	{
		return channels;
	}
	/**
	 * Utility method to get String value of MFString channels field, similar to {@link #getChannels()}.
	 * @return value of channels field
	 */
	public String getChannelsString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : channels) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>channels</i>.
	 * <br><br>
	 * <i>Tooltip:</i> list of number of channels for transformation, followed by transformation type of each channel of data. Each value is space or comma separated.
 * <ul>
 *  <li> <i> Hint:</i>  channels are enabled by default, unless otherwise indicated by channelsEnabled field. </li> 
 * </ul>
	 * @param newValue is new value for the channels field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setChannels(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearChannels(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChannels(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			channels.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString channels field, similar to {@link #setChannels(String[])}.
	 * @param newValue is new value for the channels field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setChannels(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearChannels(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setChannels(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString channels field, similar to {@link #setChannels(String[])}.
	 * @param newValue is new value for the channels field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setChannels(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearChannels(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setChannels(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString channels field, similar to {@link #setChannels(String[])}.
	 * @param newValue is new value for the channels field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setChannels(String newValue)
	{
		if (newValue == null)		{
			clearChannels(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearChannels(); // reset
		channels.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString channels field, similar to {@link #setChannels(String[])}.
	 * @param newValue is new value for the channels field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setChannels(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearChannels(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChannels(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChannels(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of channels field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimMotionObject clearChannels()
	{
		channels.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString channels field.
	 * @param newValue is new value to add to the channels field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addChannels(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !channels.contains(newValue))
            channels.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString channels field.
	 * @param newValue is new value to add to the channels field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addChannels(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !channels.contains(newValue.getValue()))
            channels.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of Boolean results from inputOutput MFBool field named <i>channelsEnabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  boolean values for each channels indicating whether enabled.  * <br>

	 * @return value of channelsEnabled field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public boolean[] getChannelsEnabled()
	{
		final boolean[] valuesArray = new boolean[channelsEnabled.size()];
		int i = 0;
		for (Boolean arrayElement : channelsEnabled) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFBool channelsEnabled field, similar to {@link #getChannelsEnabled()}.
	 * @return value of channelsEnabled field
	 */
	public ArrayList<Boolean> getChannelsEnabledList()
	{
		return channelsEnabled;
	}
	/**
	 * Utility method to get String value of MFBool channelsEnabled field, similar to {@link #getChannelsEnabled()}.
	 * @return value of channelsEnabled field
	 */
	public String getChannelsEnabledString()
    {
        StringBuilder result = new StringBuilder();
		for (Boolean arrayElement : channelsEnabled) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Boolean array to inputOutput MFBool field named <i>channelsEnabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  boolean values for each channels indicating whether enabled.  * <br>

	 * @param newValue is new value for the channelsEnabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setChannelsEnabled(boolean[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearChannelsEnabled(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChannelsEnabled(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			channelsEnabled.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFBool channelsEnabled field, similar to {@link #setChannelsEnabled(boolean[])}.
	 * @param newValue is new value for the channelsEnabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setChannelsEnabled(MFBoolObject newValue)
	{
		if (newValue == null)		{
			clearChannelsEnabled(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setChannelsEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFBool channelsEnabled field, similar to {@link #setChannelsEnabled(boolean[])}.
	 * @param newValue is new value for the channelsEnabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setChannelsEnabled(ArrayList<Boolean> newValue)
	{
		if (newValue == null)		{
			clearChannelsEnabled(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChannelsEnabled(); // reset
        else
        {
            boolean[] newArray = new boolean[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChannelsEnabled(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFBool value of channelsEnabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimMotionObject clearChannelsEnabled()
	{
		channelsEnabled.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton boolean value to MFBool channelsEnabled field.
	 * @param newValue is new value to add to the channelsEnabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addChannelsEnabled(boolean newValue)
	{
		channelsEnabled.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFBoolObject value to MFBool channelsEnabled field.
	 * @param newValue is new value to add to the channelsEnabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addChannelsEnabled(SFBoolObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		channelsEnabled.add(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>cycleTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> cycleTime sends a time event at initial starting time and at beginning of each new cycle.
 * <ul>
 *  <li> <i>Hint:</i> this event is useful for synchronization with other time-based animation objects. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of cycleTime field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public double getCycleTime()
	{
		return cycleTime;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Author-provided text tooltip that tells users the expected action of this node.
 * <ul>
 *  <li> <i> Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @return value of description field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public String getDescription()
	{
		return description;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Author-provided text tooltip that tells users the expected action of this node.
 * <ul>
 *  <li> <i> Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setDescription(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		description = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString description field, similar to {@link #setDescription(String)}.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setDescription(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDescription(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>elapsedTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) elapsedTime is computed elapsed time since the Motion object was activated and running, counting all traversed frames (as if frameIndex equaled 1) and multiplied by frameDuration, cumulative in seconds.
 * <ul>
 *  <li> <i>Warning:</i> it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 *  <li> <i>Hint:</i>  elapsedTime is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of elapsedTime field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public double getElapsedTime()
	{
		return elapsedTime;
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setEnabled(boolean newValue)
	{
		// set-newValue-validity-checks #0
		enabled = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool enabled field, similar to {@link #setEnabled(boolean)}.
	 * @param newValue is new value for the enabled field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setEnabled(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value within allowed range of [-1,infinity) from inputOutput SFInt32 field named <i>endFrame</i>.
	 * @return value of endFrame field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getEndFrame()
	{
		return endFrame;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>endFrame</i>.
	 * @param newValue is new value for the endFrame field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setEndFrame(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < -1) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion endFrame newValue=" + newValue + " has component value less than restriction minInclusive=-1");
        }
		endFrame = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 endFrame field, similar to {@link #setEndFrame(int)}.
	 * @param newValue is new value for the endFrame field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setEndFrame(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEndFrame(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value within allowed range of [0,infinity) from outputOnly SFInt32 field named <i>frameCount</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) frameCount indicates the number of frames present in the animation, equaling the number of sets of channel data present in the values array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of frameCount field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getFrameCount()
	{
		return frameCount;
	}
	/**
	 * Provide double value in seconds within allowed range of (0,infinity) from inputOutput SFTime field named <i>frameDuration</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (0,+infinity) frameDuration specifies the duration of each frame in seconds.  * <br>

	 * @return value of frameDuration field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public double getFrameDuration()
	{
		return frameDuration;
	}

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>frameDuration</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (0,+infinity) frameDuration specifies the duration of each frame in seconds.  * <br>

	 * @param newValue is new value for the frameDuration field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setFrameDuration(double newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue <= 0) {
                throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion frameDuration newValue=" + newValue + " has component value less than (or equal to) restriction minExclusive=0");
        }
		frameDuration = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFTime frameDuration field, similar to {@link #setFrameDuration(double)}.
	 * @param newValue is new value for the frameDuration field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setFrameDuration(SFTimeObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setFrameDuration(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>frameIncrement</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-infinity,+infinity) frameIncrement field controls whether playback direction is forwards or backwards, and also whether frames are skipped (e.g. subsampled replay). For a single animation step, the next frameIndex value equals (frameIndex + frameIncrement) modulo frameCount.
 * <ul>
 *  <li> <i> Hint:</i>  note that setting frameIncrement to 0 prevents automatic advancement of frameIndex and pauses animation of HAnimMotion node. </li> 
 * </ul>
	 * @return value of frameIncrement field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getFrameIncrement()
	{
		return frameIncrement;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>frameIncrement</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-infinity,+infinity) frameIncrement field controls whether playback direction is forwards or backwards, and also whether frames are skipped (e.g. subsampled replay). For a single animation step, the next frameIndex value equals (frameIndex + frameIncrement) modulo frameCount.
 * <ul>
 *  <li> <i> Hint:</i>  note that setting frameIncrement to 0 prevents automatic advancement of frameIndex and pauses animation of HAnimMotion node. </li> 
 * </ul>
	 * @param newValue is new value for the frameIncrement field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setFrameIncrement(int newValue)
	{
		// set-newValue-validity-checks #0
		frameIncrement = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 frameIncrement field, similar to {@link #setFrameIncrement(int)}.
	 * @param newValue is new value for the frameIncrement field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setFrameIncrement(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setFrameIncrement(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>frameIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) frameIndex indicates index of current frame. Note that frameIndex can be modified whether the Motion node is enabled or not, and becomes effective when the next animation cycle occurs. Thus the frameIndex value indicates the frame currently (or next) being processed.
 * <ul>
 *  <li> <i> Hint:</i>  frameIndex starts at 0 and is no greater than (frameCount - 1). Values less than 0 are reset as 0. Values greater or equal to frameCount are stored as (frameCount - 1). Thus the value of frameIndex shall be greater than or equal to zero, and less than frameCount. </li> 
 * </ul>
	 * @return value of frameIndex field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getFrameIndex()
	{
		return frameIndex;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>frameIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) frameIndex indicates index of current frame. Note that frameIndex can be modified whether the Motion node is enabled or not, and becomes effective when the next animation cycle occurs. Thus the frameIndex value indicates the frame currently (or next) being processed.
 * <ul>
 *  <li> <i> Hint:</i>  frameIndex starts at 0 and is no greater than (frameCount - 1). Values less than 0 are reset as 0. Values greater or equal to frameCount are stored as (frameCount - 1). Thus the value of frameIndex shall be greater than or equal to zero, and less than frameCount. </li> 
 * </ul>
	 * @param newValue is new value for the frameIndex field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setFrameIndex(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion frameIndex newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		frameIndex = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 frameIndex field, similar to {@link #setFrameIndex(int)}.
	 * @param newValue is new value for the frameIndex field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setFrameIndex(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setFrameIndex(newValue.getPrimitiveValue());
			return this;
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setIS(ISObject newValue)
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimMotionObject clearIS()
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
	 * Provide array of String results from inputOutput MFString field named <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> joints field lists names of joints that raw motion data is to be applied to. The number and order of the names in the joints field shall match the number and order of the channels field information, and the number and order of the sets of values in the values field for each frame of the animation.
 * <ul>
 *  <li> <i>Hint:</i> values are space or comma separated. </li> 
 *  <li> <i>Hint:</i>  The joint name IGNORED shall be used for channel of motion data that is not used for any joint. </li> 
 * </ul>
	 * @return value of joints field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getJoints()
	{
		final String[] valuesArray = new String[joints.size()];
		int i = 0;
		for (String arrayElement : joints) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString joints field, similar to {@link #getJoints()}.
	 * @return value of joints field
	 */
	public ArrayList<String> getJointsList()
	{
		return joints;
	}
	/**
	 * Utility method to get String value of MFString joints field, similar to {@link #getJoints()}.
	 * @return value of joints field
	 */
	public String getJointsString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : joints) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> joints field lists names of joints that raw motion data is to be applied to. The number and order of the names in the joints field shall match the number and order of the channels field information, and the number and order of the sets of values in the values field for each frame of the animation.
 * <ul>
 *  <li> <i>Hint:</i> values are space or comma separated. </li> 
 *  <li> <i>Hint:</i>  The joint name IGNORED shall be used for channel of motion data that is not used for any joint. </li> 
 * </ul>
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setJoints(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearJoints(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			joints.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString joints field, similar to {@link #setJoints(String[])}.
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setJoints(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setJoints(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString joints field, similar to {@link #setJoints(String[])}.
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setJoints(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setJoints(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString joints field, similar to {@link #setJoints(String[])}.
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setJoints(String newValue)
	{
		if (newValue == null)		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearJoints(); // reset
		joints.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString joints field, similar to {@link #setJoints(String[])}.
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setJoints(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearJoints(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setJoints(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of joints field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimMotionObject clearJoints()
	{
		joints.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString joints field.
	 * @param newValue is new value to add to the joints field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addJoints(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !joints.contains(newValue))
            joints.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString joints field.
	 * @param newValue is new value to add to the joints field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addJoints(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !joints.contains(newValue.getValue()))
            joints.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide int value within allowed range of [-1,4] from inputOutput SFInt32 field named <i>loa</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,4] Level Of Articulation 0..4 indicates complexity and detail of joints for given humanoid skeletal hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> loa value of -1 indicates that no LOA conformance is provided. </li> 
 *  <li> <i>Hint:</i>  Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8.4 Levels of articulation, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation</a> </li> 
 * </ul>
	 * @return value of loa field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getLoa()
	{
		return loa;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>loa</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,4] Level Of Articulation 0..4 indicates complexity and detail of joints for given humanoid skeletal hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> loa value of -1 indicates that no LOA conformance is provided. </li> 
 *  <li> <i>Hint:</i>  Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8.4 Levels of articulation, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation</a> </li> 
 * </ul>
	 * @param newValue is new value for the loa field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setLoa(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < -1) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion loa newValue=" + newValue + " has component value less than restriction minInclusive=-1");
        }
        if (newValue > 4) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion loa newValue=" + SFInt32Object.toString(newValue) + " has component value greater than restriction maxInclusive=4");
            }
		loa = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 loa field, similar to {@link #setLoa(int)}.
	 * @param newValue is new value for the loa field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setLoa(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLoa(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>loop</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Repeat indefinitely when loop=true, repeat only once when loop=false.  * <br>

	 * @return value of loop field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getLoop()
	{
		return loop;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>loop</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Repeat indefinitely when loop=true, repeat only once when loop=false.  * <br>

	 * @param newValue is new value for the loop field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setLoop(boolean newValue)
	{
		// set-newValue-validity-checks #0
		loop = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool loop field, similar to {@link #setLoop(boolean)}.
	 * @param newValue is new value for the loop field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setLoop(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLoop(newValue.getPrimitiveValue());
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimMotionObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>startFrame</i>.
	 * @return value of startFrame field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public int getStartFrame()
	{
		return startFrame;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>startFrame</i>.
	 * @param newValue is new value for the startFrame field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setStartFrame(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion startFrame newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		startFrame = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 startFrame field, similar to {@link #setStartFrame(int)}.
	 * @param newValue is new value for the startFrame field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setStartFrame(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setStartFrame(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of Float results from inputOutput MFFloat field named <i>values</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  values field contains all transformation values, ordered first by frame, then by joint, and then by transformation Sets of floats in the values array matching the order listed in joints and channels fields.  * <br>

	 * @return value of values field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getValues()
	{
		final float[] valuesArray = new float[values.size()];
		int i = 0;
		for (Float arrayElement : values) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat values field, similar to {@link #getValues()}.
	 * @return value of values field
	 */
	public ArrayList<Float> getValuesList()
	{
		return values;
	}
	/**
	 * Utility method to get String value of MFFloat values field, similar to {@link #getValues()}.
	 * @return value of values field
	 */
	public String getValuesString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : values) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to inputOutput MFFloat field named <i>values</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  values field contains all transformation values, ordered first by frame, then by joint, and then by transformation Sets of floats in the values array matching the order listed in joints and channels fields.  * <br>

	 * @param newValue is new value for the values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotionObject setValues(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearValues(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearValues(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			values.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat values field, similar to {@link #setValues(float[])}.
	 * @param newValue is new value for the values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setValues(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearValues(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setValues(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat values field, similar to {@link #setValues(float[])}.
	 * @param newValue is new value for the values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setValues(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearValues(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearValues(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setValues(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimMotionObject clearValues()
	{
		values.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat values field, similar to {@link #setValues(float[])}.
	 * @param newValue is new value for the values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setValues(int[] newValue)
	{
		if (newValue == null)		{
			clearValues(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setValues(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat values field.
	 * @param newValue is new value to add to the values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addValues(float newValue)
	{
		values.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat values field.
	 * @param newValue is new value to add to the values field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject addValues(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		values.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setValues(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setValues(double[] newArray)
	{
		return setValues(new MFFloatObject(newArray));
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>DEF</i>.
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
	 *  Note that setting the DEF value clears the USE value.
	 * @param newValue is new value for the DEF field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimMotionObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimMotion DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion DEF newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setDEF(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDEF(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>USE</i>.
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
	 * <i>Note:</i> each <code>USE</code> node is still an independent object, with the <code>USE</code> value matching the <code>DEF</code> value in the preceding object. 
	 * <br><br>
	 * <i>Warning:</i> invoking the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.<br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param newValue is new value for the USE field.
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimMotionObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimMotion USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimMotion USE newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setUSE(SFStringObject newValue)
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimMotionObject setCssClass(String newValue)
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	/** Return reference to ancestor HAnimHumanoidObject
	 * @return HAnimHumanoidObject if found, otherwise null
	 */
	public HAnimHumanoidObject getAncestorHAnimHumanoid()
	{
		X3DConcreteElement parentElement = ((X3DConcreteElement)this).getParentObject();;
		while (parentElement != null)
		{
			if (parentElement instanceof HAnimHumanoidObject)
				return (HAnimHumanoidObject) parentElement;
			parentElement = ((X3DConcreteElement)this).getParentObject();
		}
		return null;
	}
	/** Return whether ancestor HAnimHumanoidObject is available
	 * @return true if ancestor HAnimHumanoidObject found
	 */
	public boolean hasAncestorHAnimHumanoid()
	{
		return (getAncestorHAnimHumanoid() != null);
	}

	/** Return version of ancestor HAnimHumanoidObject (if found) or this HAnimMotion node
	 * @return ancestor version if found, otherwise 2.0
	 * @see HAnimHumanoidObject#VERSION_2_0
	 */
	public String getHAnimVersion()
	{
		if  (hasAncestorHAnimHumanoid())
			 return getAncestorHAnimHumanoid().getVersion();
		else return HAnimHumanoidObject.VERSION_2_0;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotionObject setUSE(HAnimMotionObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on HAnimMotionObject" +
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
	public HAnimMotionObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public HAnimMotionObject addComments (String newComment)
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimMotionObject addComments (String[] newComments)
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
	 * @return {@link HAnimMotionObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimMotionObject addComments (CommentsBlock newCommentsBlock)
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

		stringX3D.append(indent).append("<HAnimMotion"); // start opening tag
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

			if (((getChannels().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" channels='").append(new MFStringObject(getChannels()).toStringX3D()).append("'");
			}
			if (((getChannelsEnabled().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" channelsEnabled='").append(MFBoolObject.toString(getChannelsEnabled())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if ((!getDescription().equals(DESCRIPTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" description='").append(new SFStringObject(getDescription()).toStringX3D()).append("'");
			}
			if (((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" enabled='").append(SFBoolObject.toString(getEnabled())).append("'");
			}
			if (((getEndFrame() != ENDFRAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" endFrame='").append(SFInt32Object.toString(getEndFrame())).append("'");
			}
			if (((getFrameDuration() != FRAMEDURATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" frameDuration='").append(SFTimeObject.toString(getFrameDuration())).append("'");
			}
			if (((getFrameIncrement() != FRAMEINCREMENT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" frameIncrement='").append(SFInt32Object.toString(getFrameIncrement())).append("'");
			}
			if (((getFrameIndex() != FRAMEINDEX_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" frameIndex='").append(SFInt32Object.toString(getFrameIndex())).append("'");
			}
			if (((getJoints().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" joints='").append(new MFStringObject(getJoints()).toStringX3D()).append("'");
			}
			if (((getLoa() != LOA_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" loa='").append(SFInt32Object.toString(getLoa())).append("'");
			}
			if (((getLoop() != LOOP_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" loop='").append(SFBoolObject.toString(getLoop())).append("'");
			}
			if (((getStartFrame() != STARTFRAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" startFrame='").append(SFInt32Object.toString(getStartFrame())).append("'");
			}
			if (((getValues().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" values='").append(MFFloatObject.toString(getValues())).append("'");
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
			stringX3D.append(indent).append("</HAnimMotion>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=HAnimMotion, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
			stringClassicVRML.append("HAnimMotion").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("channels"))
						{
							stringClassicVRML.append(indentCharacter).append("channels").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getChannels().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("channels ").append("[ ").append(MFStringObject.toString(getChannels())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("channelsEnabled"))
						{
							stringClassicVRML.append(indentCharacter).append("channelsEnabled").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getChannelsEnabled().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("channelsEnabled ").append("[ ").append(MFBoolObject.toString(getChannelsEnabled())).append(" ]").append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("description"))
						{
							stringClassicVRML.append(indentCharacter).append("description").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getDescription().equals(DESCRIPTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("description ").append("\"").append(SFStringObject.toString(getDescription())).append("\"").append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("endFrame"))
						{
							stringClassicVRML.append(indentCharacter).append("endFrame").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getEndFrame() != ENDFRAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("endFrame ").append(SFInt32Object.toString(getEndFrame())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("frameDuration"))
						{
							stringClassicVRML.append(indentCharacter).append("frameDuration").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getFrameDuration() != FRAMEDURATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("frameDuration ").append(SFTimeObject.toString(getFrameDuration())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("frameIncrement"))
						{
							stringClassicVRML.append(indentCharacter).append("frameIncrement").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getFrameIncrement() != FRAMEINCREMENT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("frameIncrement ").append(SFInt32Object.toString(getFrameIncrement())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("frameIndex"))
						{
							stringClassicVRML.append(indentCharacter).append("frameIndex").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getFrameIndex() != FRAMEINDEX_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("frameIndex ").append(SFInt32Object.toString(getFrameIndex())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("joints"))
						{
							stringClassicVRML.append(indentCharacter).append("joints").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getJoints().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("joints ").append("[ ").append(MFStringObject.toString(getJoints())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("loa"))
						{
							stringClassicVRML.append(indentCharacter).append("loa").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getLoa() != LOA_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("loa ").append(SFInt32Object.toString(getLoa())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("loop"))
						{
							stringClassicVRML.append(indentCharacter).append("loop").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getLoop() != LOOP_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("loop ").append(SFBoolObject.toString(getLoop())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("startFrame"))
						{
							stringClassicVRML.append(indentCharacter).append("startFrame").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getStartFrame() != STARTFRAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("startFrame ").append(SFInt32Object.toString(getStartFrame())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("values"))
						{
							stringClassicVRML.append(indentCharacter).append("values").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getValues().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("values ").append("[ ").append(MFFloatObject.toString(getValues())).append(" ]").append("\n").append(indent).append(indentCharacter);
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

		setChannels(getChannels()); // exercise field checks, simple types
        
		setChannelsEnabled(getChannelsEnabled()); // exercise field checks, simple types
        
		setDescription(getDescription()); // exercise field checks, simple types
        
		setEnabled(getEnabled()); // exercise field checks, simple types
        
		setEndFrame(getEndFrame()); // exercise field checks, simple types
        
		setFrameDuration(getFrameDuration()); // exercise field checks, simple types
        
		setFrameIncrement(getFrameIncrement()); // exercise field checks, simple types
        
		setFrameIndex(getFrameIndex()); // exercise field checks, simple types
        
		setJoints(getJoints()); // exercise field checks, simple types
        
		setLoa(getLoa()); // exercise field checks, simple types
        
		setLoop(getLoop()); // exercise field checks, simple types
        
		setStartFrame(getStartFrame()); // exercise field checks, simple types
        
		setValues(getValues()); // exercise field checks, simple types
        
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
			String errorNotice = "HAnimMotion USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimMotion USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "HAnimMotion USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimMotion USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'HAnimMotion' node, add head statement <component name='HAnim' level='2'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"HAnim\").setLevel(2);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
