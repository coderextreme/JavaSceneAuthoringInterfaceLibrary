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

package org.web3d.x3d.jsail.EnvironmentalEffects;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.EnvironmentalEffects.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.EnvironmentalEffects.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * TextureBackground simulates ground and sky, using vertical arrays of wraparound color values, TextureBackground can also provide backdrop texture images on all six sides.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DBackgroundNode] TextureBackground simulates ground and sky, using vertical arrays of wraparound color values, TextureBackground can also provide backdrop texture images on all six sides.
 * <ul>
 *  <li> <i>Hint:</i> Background, Fog, GeoViewpoint, NavigationInfo, OrthoViewpoint, TextureBackground and Viewpoint are bindable nodes, meaning that no more than one of each node type can be active at a given time. </li> 
 *  <li> <i>Warning:</i> results are undefined if a bindable node (Background, Fog, NavigationInfo, OrthoViewpoint, TextureBackground, Viewpoint) is a contained descendant node of either LOD or Switch. </li> 
 *  <li> <i>Warning:</i> each of the child ImageTexture or PixelTexture nodes must have unique containerField values for backTexture, bottomTexture, frontTexture, leftTexture, rightTexture, or topTexture. </li> 
 *  <li> <i>Hint:</i>  authors can have LoadSensor nodes receive notifications and send reporting events when background texture node(s) are loaded. </li> 
 * </ul>
 * <br>
 * Note that {@linkplain SFColorObject#ALICEBLUE SFColorObject} provides a variety of color constants.
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/enveffects.html#TextureBackground" target="blank">X3D Abstract Specification: TextureBackground</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TextureBackground" target="_blank">X3D Tooltips: TextureBackground</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public class TextureBackgroundObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.EnvironmentalEffects.TextureBackground
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=backTexture, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=backTexture, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode|MultiTexture */ 
	private X3DNode backTexture; // SFNode acceptable node types: X3DTexture2DNode|MultiTexture or ProtoInstanceObject
	private ProtoInstanceObject backTextureProtoInstance; // allowed alternative for backTexture field

 /* @name=bindTime, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=bindTime, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double bindTime; // SFTime

 /* @name=bottomTexture, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=bottomTexture, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode|MultiTexture */ 
	private X3DNode bottomTexture; // SFNode acceptable node types: X3DTexture2DNode|MultiTexture or ProtoInstanceObject
	private ProtoInstanceObject bottomTextureProtoInstance; // allowed alternative for bottomTexture field

 /* @name=frontTexture, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=frontTexture, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode|MultiTexture */ 
	private X3DNode frontTexture; // SFNode acceptable node types: X3DTexture2DNode|MultiTexture or ProtoInstanceObject
	private ProtoInstanceObject frontTextureProtoInstance; // allowed alternative for frontTexture field

 /* @name=groundAngle, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=groundAngle, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> groundAngle = new ArrayList<>(); // MFFloat

 /* @name=groundColor, @type=MFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=groundColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] groundColor; // MFColor

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=isBound, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isBound, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isBound; // SFBool

 /* @name=leftTexture, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=leftTexture, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode|MultiTexture */ 
	private X3DNode leftTexture; // SFNode acceptable node types: X3DTexture2DNode|MultiTexture or ProtoInstanceObject
	private ProtoInstanceObject leftTextureProtoInstance; // allowed alternative for leftTexture field

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=rightTexture, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=rightTexture, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode|MultiTexture */ 
	private X3DNode rightTexture; // SFNode acceptable node types: X3DTexture2DNode|MultiTexture or ProtoInstanceObject
	private ProtoInstanceObject rightTextureProtoInstance; // allowed alternative for rightTexture field

 /* @name=set_bind, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=bind, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean bind; // SFBool

 /* @name=skyAngle, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=skyAngle, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> skyAngle = new ArrayList<>(); // MFFloat

 /* @name=skyColor, @type=MFColor, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=skyColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] skyColor; // MFColor

 /* @name=topTexture, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=topTexture, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode|MultiTexture */ 
	private X3DNode topTexture; // SFNode acceptable node types: X3DTexture2DNode|MultiTexture or ProtoInstanceObject
	private ProtoInstanceObject topTextureProtoInstance; // allowed alternative for topTexture field

 /* @name=transparency, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=transparency, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float transparency; // SFFloat

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>TextureBackground</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "TextureBackground";

	/** Provides name of this element: <i>TextureBackground</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>TextureBackground</i> element: <i>EnvironmentalEffects</i> */
	public static final String COMPONENT = "EnvironmentalEffects";

	/** Defines X3D component for the <i>TextureBackground</i> element: <i>EnvironmentalEffects</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>EnvironmentalEffects</i> component level for this element: <i>3</i> */
	public static final int LEVEL = 3;

	/** Provides default X3D component level for this element: <i>3</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFNode field named <i>backTexture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode BACKTEXTURE_DEFAULT_VALUE = null;

	/** SFNode field named <i>bottomTexture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode BOTTOMTEXTURE_DEFAULT_VALUE = null;

	/** SFNode field named <i>frontTexture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode FRONTTEXTURE_DEFAULT_VALUE = null;

	/** MFFloat field named <i>groundAngle</i> has default value equal to an empty list. */
	public static final ArrayList<Float> GROUNDANGLE_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** MFColor field named <i>groundColor</i> has default value equal to an empty list. */
	public static final float[] GROUNDCOLOR_DEFAULT_VALUE = {};

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>leftTexture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode LEFTTEXTURE_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFNode field named <i>rightTexture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode RIGHTTEXTURE_DEFAULT_VALUE = null;

	/** MFFloat field named <i>skyAngle</i> has default value equal to an empty list. */
	public static final ArrayList<Float> SKYANGLE_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** MFColor field named <i>skyColor</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] SKYCOLOR_DEFAULT_VALUE = {0f,0f,0f};

	/** SFNode field named <i>topTexture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode TOPTEXTURE_DEFAULT_VALUE = null;

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
			case "backTexture":
				result = "SFNode";
				break;
			case "bindTime":
				result = "SFTime";
				break;
			case "bottomTexture":
				result = "SFNode";
				break;
			case "frontTexture":
				result = "SFNode";
				break;
			case "groundAngle":
				result = "MFFloat";
				break;
			case "groundColor":
				result = "MFColor";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "isBound":
				result = "SFBool";
				break;
			case "leftTexture":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "rightTexture":
				result = "SFNode";
				break;
			case "bind":
				result = "SFBool";
				break;
			case "skyAngle":
				result = "MFFloat";
				break;
			case "skyColor":
				result = "MFColor";
				break;
			case "topTexture":
				result = "SFNode";
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
			case "backTexture":
				result = "inputOutput";
				break;
			case "bindTime":
				result = "outputOnly";
				break;
			case "bottomTexture":
				result = "inputOutput";
				break;
			case "frontTexture":
				result = "inputOutput";
				break;
			case "groundAngle":
				result = "inputOutput";
				break;
			case "groundColor":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "isBound":
				result = "outputOnly";
				break;
			case "leftTexture":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "rightTexture":
				result = "inputOutput";
				break;
			case "set_bind":
				result = "inputOnly";
				break;
			case "skyAngle":
				result = "inputOutput";
				break;
			case "skyColor":
				result = "inputOutput";
				break;
			case "topTexture":
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

	/** fromField ROUTE name for SFNode field named <i>backTexture</i>. */
	public static final String fromField_BACKTEXTURE = "backTexture";

	/** toField ROUTE name for SFNode field named <i>backTexture</i>. */
	public static final String toField_BACKTEXTURE = "backTexture";

	/** fromField ROUTE name for SFTime field named <i>bindTime</i>. */
	public static final String fromField_BINDTIME = "bindTime";

	/** fromField ROUTE name for SFNode field named <i>bottomTexture</i>. */
	public static final String fromField_BOTTOMTEXTURE = "bottomTexture";

	/** toField ROUTE name for SFNode field named <i>bottomTexture</i>. */
	public static final String toField_BOTTOMTEXTURE = "bottomTexture";

	/** fromField ROUTE name for SFNode field named <i>frontTexture</i>. */
	public static final String fromField_FRONTTEXTURE = "frontTexture";

	/** toField ROUTE name for SFNode field named <i>frontTexture</i>. */
	public static final String toField_FRONTTEXTURE = "frontTexture";

	/** fromField ROUTE name for MFFloat field named <i>groundAngle</i>. */
	public static final String fromField_GROUNDANGLE = "groundAngle";

	/** toField ROUTE name for MFFloat field named <i>groundAngle</i>. */
	public static final String toField_GROUNDANGLE = "groundAngle";

	/** fromField ROUTE name for MFColor field named <i>groundColor</i>. */
	public static final String fromField_GROUNDCOLOR = "groundColor";

	/** toField ROUTE name for MFColor field named <i>groundColor</i>. */
	public static final String toField_GROUNDCOLOR = "groundColor";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFBool field named <i>isBound</i>. */
	public static final String fromField_ISBOUND = "isBound";

	/** fromField ROUTE name for SFNode field named <i>leftTexture</i>. */
	public static final String fromField_LEFTTEXTURE = "leftTexture";

	/** toField ROUTE name for SFNode field named <i>leftTexture</i>. */
	public static final String toField_LEFTTEXTURE = "leftTexture";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFNode field named <i>rightTexture</i>. */
	public static final String fromField_RIGHTTEXTURE = "rightTexture";

	/** toField ROUTE name for SFNode field named <i>rightTexture</i>. */
	public static final String toField_RIGHTTEXTURE = "rightTexture";

	/** toField ROUTE name for SFBool field named <i>set_bind</i>. */
	public static final String toField_SET_BIND = "set_bind";

	/** fromField ROUTE name for MFFloat field named <i>skyAngle</i>. */
	public static final String fromField_SKYANGLE = "skyAngle";

	/** toField ROUTE name for MFFloat field named <i>skyAngle</i>. */
	public static final String toField_SKYANGLE = "skyAngle";

	/** fromField ROUTE name for MFColor field named <i>skyColor</i>. */
	public static final String fromField_SKYCOLOR = "skyColor";

	/** toField ROUTE name for MFColor field named <i>skyColor</i>. */
	public static final String toField_SKYCOLOR = "skyColor";

	/** fromField ROUTE name for SFNode field named <i>topTexture</i>. */
	public static final String fromField_TOPTEXTURE = "topTexture";

	/** toField ROUTE name for SFNode field named <i>topTexture</i>. */
	public static final String toField_TOPTEXTURE = "topTexture";

	/** fromField ROUTE name for SFFloat field named <i>transparency</i>. */
	public static final String fromField_TRANSPARENCY = "transparency";

	/** toField ROUTE name for SFFloat field named <i>transparency</i>. */
	public static final String toField_TRANSPARENCY = "transparency";

	/** Constructor for TextureBackgroundObject to initialize member variables with default values. */
	public TextureBackgroundObject()
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

		backTexture = null;              // clear out any prior node
		backTextureProtoInstance = null; // clear out any prior node
		bottomTexture = null;              // clear out any prior node
		bottomTextureProtoInstance = null; // clear out any prior node
		frontTexture = null;              // clear out any prior node
		frontTextureProtoInstance = null; // clear out any prior node
		groundAngle = new ArrayList<>();
		groundColor =  new float[] { };
		IS = null; // clear out any prior node
		leftTexture = null;              // clear out any prior node
		leftTextureProtoInstance = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		rightTexture = null;              // clear out any prior node
		rightTextureProtoInstance = null; // clear out any prior node
		skyAngle = new ArrayList<>();
		skyColor = SKYCOLOR_DEFAULT_VALUE;
		topTexture = null;              // clear out any prior node
		topTextureProtoInstance = null; // clear out any prior node
		transparency = TRANSPARENCY_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTexture2DNode|MultiTexture, from inputOutput SFNode field <i>backTexture</i>.
	 * @see #getBackTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @return value of backTexture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getBackTexture()
	{
		return backTexture;
	}

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>backTexture</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

	 * @see #setBackTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @param newValue is new value for the backTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setBackTexture(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		backTexture = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) backTexture).setParentObject(this); // parentTest15
			((X3DConcreteNode)backTexture).setContainerFieldOverride("backTexture");
		}
		if (backTextureProtoInstance != null)
		{
			backTextureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			backTextureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of backTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearBackTexture()
	{
		((X3DConcreteElement) backTexture).clearParentObject(); // remove references to facilitate Java memory management
		backTexture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>backTexture</i>.
	 * @see #setBackTexture(X3DNode)
	 * @param newValue is new value for the backTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setBackTexture(ProtoInstanceObject newValue)
	{
		if (backTextureProtoInstance != null)
		{
			((X3DConcreteElement) backTextureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		backTextureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) backTextureProtoInstance).setParentObject(this); // parentTest15.6
            backTextureProtoInstance.setContainerField("backTexture");
	    }
		if (backTexture != null)
		{
			((X3DConcreteElement) backTexture).setParentObject(null); // housekeeping, clear prior object
			backTexture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getBackTextureProtoInstance()
		{
			return backTextureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>backTexture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getBackTexture()
	 * @see #getBackTextureProtoInstance()
	 */
	public boolean hasBackTexture()
	{
		return (backTexture != null) || (backTextureProtoInstance != null);
	}
	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>bindTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> event sent when node becomes active/inactive.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of bindTime field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public double getBindTime()
	{
		return bindTime;
	}
	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTexture2DNode|MultiTexture, from inputOutput SFNode field <i>bottomTexture</i>.
	 * @see #getBottomTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @return value of bottomTexture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getBottomTexture()
	{
		return bottomTexture;
	}

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>bottomTexture</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

	 * @see #setBottomTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @param newValue is new value for the bottomTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setBottomTexture(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		bottomTexture = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) bottomTexture).setParentObject(this); // parentTest15
			((X3DConcreteNode)bottomTexture).setContainerFieldOverride("bottomTexture");
		}
		if (bottomTextureProtoInstance != null)
		{
			bottomTextureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			bottomTextureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of bottomTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearBottomTexture()
	{
		((X3DConcreteElement) bottomTexture).clearParentObject(); // remove references to facilitate Java memory management
		bottomTexture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>bottomTexture</i>.
	 * @see #setBottomTexture(X3DNode)
	 * @param newValue is new value for the bottomTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setBottomTexture(ProtoInstanceObject newValue)
	{
		if (bottomTextureProtoInstance != null)
		{
			((X3DConcreteElement) bottomTextureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		bottomTextureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) bottomTextureProtoInstance).setParentObject(this); // parentTest15.6
            bottomTextureProtoInstance.setContainerField("bottomTexture");
	    }
		if (bottomTexture != null)
		{
			((X3DConcreteElement) bottomTexture).setParentObject(null); // housekeeping, clear prior object
			bottomTexture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getBottomTextureProtoInstance()
		{
			return bottomTextureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>bottomTexture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getBottomTexture()
	 * @see #getBottomTextureProtoInstance()
	 */
	public boolean hasBottomTexture()
	{
		return (bottomTexture != null) || (bottomTextureProtoInstance != null);
	}
	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTexture2DNode|MultiTexture, from inputOutput SFNode field <i>frontTexture</i>.
	 * @see #getFrontTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @return value of frontTexture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getFrontTexture()
	{
		return frontTexture;
	}

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>frontTexture</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

	 * @see #setFrontTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @param newValue is new value for the frontTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setFrontTexture(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		frontTexture = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) frontTexture).setParentObject(this); // parentTest15
			((X3DConcreteNode)frontTexture).setContainerFieldOverride("frontTexture");
		}
		if (frontTextureProtoInstance != null)
		{
			frontTextureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			frontTextureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of frontTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearFrontTexture()
	{
		((X3DConcreteElement) frontTexture).clearParentObject(); // remove references to facilitate Java memory management
		frontTexture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>frontTexture</i>.
	 * @see #setFrontTexture(X3DNode)
	 * @param newValue is new value for the frontTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setFrontTexture(ProtoInstanceObject newValue)
	{
		if (frontTextureProtoInstance != null)
		{
			((X3DConcreteElement) frontTextureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		frontTextureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) frontTextureProtoInstance).setParentObject(this); // parentTest15.6
            frontTextureProtoInstance.setContainerField("frontTexture");
	    }
		if (frontTexture != null)
		{
			((X3DConcreteElement) frontTexture).setParentObject(null); // housekeeping, clear prior object
			frontTexture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getFrontTextureProtoInstance()
		{
			return frontTextureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>frontTexture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getFrontTexture()
	 * @see #getFrontTextureProtoInstance()
	 */
	public boolean hasFrontTexture()
	{
		return (frontTexture != null) || (frontTextureProtoInstance != null);
	}
	/**
	 * Provide array of Float results unit axis, angle (in radians) within allowed range of [0,1.5708] from inputOutput MFFloat field named <i>groundAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi/2] The angle array values increase from 0.0 nadir (straight down) to pi/2=1.570796 (horizon).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. </li> 
 *  <li> <i>Warning:</i> colors at groundAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of groundAngle field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getGroundAngle()
	{
		final float[] valuesArray = new float[groundAngle.size()];
		int i = 0;
		for (Float arrayElement : groundAngle) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat groundAngle field, similar to {@link #getGroundAngle()}.
	 * @return value of groundAngle field
	 */
	public ArrayList<Float> getGroundAngleList()
	{
		return groundAngle;
	}
	/**
	 * Utility method to get String value of MFFloat groundAngle field, similar to {@link #getGroundAngle()}.
	 * @return value of groundAngle field
	 */
	public String getGroundAngleString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : groundAngle) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array unit axis, angle (in radians) to inputOutput MFFloat field named <i>groundAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi/2] The angle array values increase from 0.0 nadir (straight down) to pi/2=1.570796 (horizon).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. </li> 
 *  <li> <i>Warning:</i> colors at groundAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setGroundAngle(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearGroundAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearGroundAngle(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			groundAngle.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat groundAngle field, similar to {@link #setGroundAngle(float[])}.
	 * @param newValue is new value for the groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setGroundAngle(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearGroundAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGroundAngle(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat groundAngle field, similar to {@link #setGroundAngle(float[])}.
	 * @param newValue is new value for the groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setGroundAngle(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearGroundAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearGroundAngle(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setGroundAngle(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public TextureBackgroundObject clearGroundAngle()
	{
		groundAngle.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat groundAngle field, similar to {@link #setGroundAngle(float[])}.
	 * @param newValue is new value for the groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setGroundAngle(int[] newValue)
	{
		if (newValue == null)		{
			clearGroundAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setGroundAngle(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat groundAngle field.
	 * @param newValue is new value to add to the groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject addGroundAngle(float newValue)
	{
		groundAngle.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat groundAngle field.
	 * @param newValue is new value to add to the groundAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject addGroundAngle(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		groundAngle.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setGroundAngle(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setGroundAngle(double[] newArray)
	{
		return setGroundAngle(new MFFloatObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput MFColor field named <i>groundColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the ground at the various angles on the ground partial sphere. First value is color of ground at 0.0 radians representing the nadir (straight down).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of groundColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getGroundColor()
	{
		return groundColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput MFColor field named <i>groundColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the ground at the various angles on the ground partial sphere. First value is color of ground at 0.0 radians representing the nadir (straight down).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the groundColor field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setGroundColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 3 != 0) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureBackground groundColor newValue=" + MFColorObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 3");
		}
		groundColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFColor groundColor field, similar to {@link #setGroundColor(float[])}.
	 * @param newValue is new value for the groundColor field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setGroundColor(MFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGroundColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFColorObject value to MFColor groundColor field.
	 * @param newValue is new value to add to the groundColor field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject addGroundColor(SFColorObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(groundColor, groundColor.length + 3);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, groundColor.length, 3);
		groundColor =  result;
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setGroundColor(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setGroundColor(double[] newArray)
	{
		return setGroundColor(new MFColorObject(newArray));
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setIS(ISObject newValue)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearIS()
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
	 * Provide boolean value from outputOnly SFBool field named <i>isBound</i>.
	 * <br><br>
	 * <i>Tooltip:</i> event true sent when node becomes active, event false sent when unbound by another node.
 * <ul>
 *  <li> <i>Hint:</i> paired node operations can be established by connecting set_bind and isBound fields of corresponding bindable nodes. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isBound field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsBound()
	{
		return isBound;
	}
	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTexture2DNode|MultiTexture, from inputOutput SFNode field <i>leftTexture</i>.
	 * @see #getLeftTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @return value of leftTexture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getLeftTexture()
	{
		return leftTexture;
	}

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>leftTexture</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

	 * @see #setLeftTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @param newValue is new value for the leftTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setLeftTexture(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		leftTexture = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) leftTexture).setParentObject(this); // parentTest15
			((X3DConcreteNode)leftTexture).setContainerFieldOverride("leftTexture");
		}
		if (leftTextureProtoInstance != null)
		{
			leftTextureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			leftTextureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of leftTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearLeftTexture()
	{
		((X3DConcreteElement) leftTexture).clearParentObject(); // remove references to facilitate Java memory management
		leftTexture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>leftTexture</i>.
	 * @see #setLeftTexture(X3DNode)
	 * @param newValue is new value for the leftTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setLeftTexture(ProtoInstanceObject newValue)
	{
		if (leftTextureProtoInstance != null)
		{
			((X3DConcreteElement) leftTextureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		leftTextureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) leftTextureProtoInstance).setParentObject(this); // parentTest15.6
            leftTextureProtoInstance.setContainerField("leftTexture");
	    }
		if (leftTexture != null)
		{
			((X3DConcreteElement) leftTexture).setParentObject(null); // housekeeping, clear prior object
			leftTexture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getLeftTextureProtoInstance()
		{
			return leftTextureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>leftTexture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getLeftTexture()
	 * @see #getLeftTextureProtoInstance()
	 */
	public boolean hasLeftTexture()
	{
		return (leftTexture != null) || (leftTextureProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTexture2DNode|MultiTexture, from inputOutput SFNode field <i>rightTexture</i>.
	 * @see #getRightTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @return value of rightTexture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getRightTexture()
	{
		return rightTexture;
	}

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>rightTexture</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

	 * @see #setRightTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @param newValue is new value for the rightTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setRightTexture(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		rightTexture = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) rightTexture).setParentObject(this); // parentTest15
			((X3DConcreteNode)rightTexture).setContainerFieldOverride("rightTexture");
		}
		if (rightTextureProtoInstance != null)
		{
			rightTextureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			rightTextureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of rightTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearRightTexture()
	{
		((X3DConcreteElement) rightTexture).clearParentObject(); // remove references to facilitate Java memory management
		rightTexture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>rightTexture</i>.
	 * @see #setRightTexture(X3DNode)
	 * @param newValue is new value for the rightTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setRightTexture(ProtoInstanceObject newValue)
	{
		if (rightTextureProtoInstance != null)
		{
			((X3DConcreteElement) rightTextureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		rightTextureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) rightTextureProtoInstance).setParentObject(this); // parentTest15.6
            rightTextureProtoInstance.setContainerField("rightTexture");
	    }
		if (rightTexture != null)
		{
			((X3DConcreteElement) rightTexture).setParentObject(null); // housekeeping, clear prior object
			rightTexture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getRightTextureProtoInstance()
		{
			return rightTextureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>rightTexture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getRightTexture()
	 * @see #getRightTextureProtoInstance()
	 */
	public boolean hasRightTexture()
	{
		return (rightTexture != null) || (rightTextureProtoInstance != null);
	}
	/**
	 * Provide array of Float results unit axis, angle (in radians) within allowed range of [0,3.1416] from inputOutput MFFloat field named <i>skyAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi] The angle array values increase from 0.0 zenith (straight up) to pi/2=1.570796 (horizon) to pi=3.14159 (nadir).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. </li> 
 *  <li> <i>Warning:</i> colors at skyAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of skyAngle field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSkyAngle()
	{
		final float[] valuesArray = new float[skyAngle.size()];
		int i = 0;
		for (Float arrayElement : skyAngle) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat skyAngle field, similar to {@link #getSkyAngle()}.
	 * @return value of skyAngle field
	 */
	public ArrayList<Float> getSkyAngleList()
	{
		return skyAngle;
	}
	/**
	 * Utility method to get String value of MFFloat skyAngle field, similar to {@link #getSkyAngle()}.
	 * @return value of skyAngle field
	 */
	public String getSkyAngleString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : skyAngle) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array unit axis, angle (in radians) to inputOutput MFFloat field named <i>skyAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi] The angle array values increase from 0.0 zenith (straight up) to pi/2=1.570796 (horizon) to pi=3.14159 (nadir).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. </li> 
 *  <li> <i>Warning:</i> colors at skyAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setSkyAngle(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearSkyAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSkyAngle(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			skyAngle.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat skyAngle field, similar to {@link #setSkyAngle(float[])}.
	 * @param newValue is new value for the skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setSkyAngle(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearSkyAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSkyAngle(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat skyAngle field, similar to {@link #setSkyAngle(float[])}.
	 * @param newValue is new value for the skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setSkyAngle(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearSkyAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearSkyAngle(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSkyAngle(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public TextureBackgroundObject clearSkyAngle()
	{
		skyAngle.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat skyAngle field, similar to {@link #setSkyAngle(float[])}.
	 * @param newValue is new value for the skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setSkyAngle(int[] newValue)
	{
		if (newValue == null)		{
			clearSkyAngle(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setSkyAngle(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat skyAngle field.
	 * @param newValue is new value to add to the skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject addSkyAngle(float newValue)
	{
		skyAngle.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat skyAngle field.
	 * @param newValue is new value to add to the skyAngle field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject addSkyAngle(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		skyAngle.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setSkyAngle(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setSkyAngle(double[] newArray)
	{
		return setSkyAngle(new MFFloatObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput MFColor field named <i>skyColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the sky at various angles on the sky sphere. First value is color of sky at 0.0 radians representing the zenith (straight up).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. Interchange profile hint: only one color might be rendered, others can be ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of skyColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSkyColor()
	{
		return skyColor;
	}

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput MFColor field named <i>skyColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the sky at various angles on the sky sphere. First value is color of sky at 0.0 radians representing the zenith (straight up).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. Interchange profile hint: only one color might be rendered, others can be ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the skyColor field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setSkyColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 3 != 0) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureBackground skyColor newValue=" + MFColorObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 3");
		}
		skyColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFColor skyColor field, similar to {@link #setSkyColor(float[])}.
	 * @param newValue is new value for the skyColor field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setSkyColor(MFColorObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSkyColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFColorObject value to MFColor skyColor field.
	 * @param newValue is new value to add to the skyColor field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject addSkyColor(SFColorObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(skyColor, skyColor.length + 3);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, skyColor.length, 3);
		skyColor =  result;
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setSkyColor(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setSkyColor(double[] newArray)
	{
		return setSkyColor(new MFColorObject(newArray));
	}
	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTexture2DNode|MultiTexture, from inputOutput SFNode field <i>topTexture</i>.
	 * @see #getTopTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @return value of topTexture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getTopTexture()
	{
		return topTexture;
	}

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>topTexture</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

	 * @see #setTopTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture2DNode | MultiTexture] Parent TextureBackground element can contain up to six image nodes (ImageTexture PixelTexture MovieTexture MultiTexture).
 * <ul>
 *  <li> <i> Warning:</i>  each child image node must have a different containerField value. </li> 
 * </ul>
	 * @param newValue is new value for the topTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setTopTexture(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		topTexture = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTexture2DNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Texturing.MultiTextureObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTexture2DNode|MultiTexture; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) topTexture).setParentObject(this); // parentTest15
			((X3DConcreteNode)topTexture).setContainerFieldOverride("topTexture");
		}
		if (topTextureProtoInstance != null)
		{
			topTextureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			topTextureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of topTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TextureBackgroundObject clearTopTexture()
	{
		((X3DConcreteElement) topTexture).clearParentObject(); // remove references to facilitate Java memory management
		topTexture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>topTexture</i>.
	 * @see #setTopTexture(X3DNode)
	 * @param newValue is new value for the topTexture field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setTopTexture(ProtoInstanceObject newValue)
	{
		if (topTextureProtoInstance != null)
		{
			((X3DConcreteElement) topTextureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		topTextureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) topTextureProtoInstance).setParentObject(this); // parentTest15.6
            topTextureProtoInstance.setContainerField("topTexture");
	    }
		if (topTexture != null)
		{
			((X3DConcreteElement) topTexture).setParentObject(null); // housekeeping, clear prior object
			topTexture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTopTextureProtoInstance()
		{
			return topTextureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>topTexture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTopTexture()
	 * @see #getTopTextureProtoInstance()
	 */
	public boolean hasTopTexture()
	{
		return (topTexture != null) || (topTextureProtoInstance != null);
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  transparency applied to texture images, enabling an X3D scene to overlay an HTML page or desktop.  * <br>

	 * @return value of transparency field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float getTransparency()
	{
		return transparency;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  transparency applied to texture images, enabling an X3D scene to overlay an HTML page or desktop.  * <br>

	 * @param newValue is new value for the transparency field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureBackgroundObject setTransparency(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureBackground transparency newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureBackground transparency newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		transparency = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat transparency field, similar to {@link #setTransparency(float)}.
	 * @param newValue is new value for the transparency field.
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setTransparency(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTransparency(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setTransparency(float)}.
	 * @param newValue is new value for field
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setTransparency(double newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TextureBackgroundObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to TextureBackground DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureBackground DEF newValue='" + newValue + "'" + 
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TextureBackgroundObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to TextureBackground USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureBackground USE newValue='" + newValue + "'" + 
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TextureBackgroundObject setCssClass(String newValue)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setCssClass(SFStringObject newValue)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureBackgroundObject setUSE(TextureBackgroundObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on TextureBackgroundObject" +
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
	public TextureBackgroundObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public TextureBackgroundObject addComments (String newComment)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public TextureBackgroundObject addComments (String[] newComments)
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
	 * @return {@link TextureBackgroundObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public TextureBackgroundObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (backTexture != null) || (backTextureProtoInstance != null) || (bottomTexture != null) || (bottomTextureProtoInstance != null) || (frontTexture != null) || (frontTextureProtoInstance != null) || (IS != null) || (leftTexture != null) || (leftTextureProtoInstance != null) || (metadata != null) || (metadataProtoInstance != null) || (rightTexture != null) || (rightTextureProtoInstance != null) || (topTexture != null) || (topTextureProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<TextureBackground"); // start opening tag
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
			if (((getGroundAngle().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" groundAngle='").append(MFFloatObject.toString(getGroundAngle())).append("'");
			}
			if ((getGroundColor().length > 0) || !ConfigurationProperties.getStripDefaultAttributes() /* otherwise */ && !isUSE())
			{
				stringX3D.append(" groundColor='").append(MFColorObject.toString(getGroundColor())).append("'");
			}
			if (((getSkyAngle().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" skyAngle='").append(MFFloatObject.toString(getSkyAngle())).append("'");
			}
			if ((!Arrays.equals(getSkyColor(), SKYCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" skyColor='").append(MFColorObject.toString(getSkyColor())).append("'");
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
			if      (backTexture != null)
			{
				stringX3D.append(((X3DConcreteElement)backTexture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (backTextureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)backTextureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (bottomTexture != null)
			{
				stringX3D.append(((X3DConcreteElement)bottomTexture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (bottomTextureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)bottomTextureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (frontTexture != null)
			{
				stringX3D.append(((X3DConcreteElement)frontTexture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (frontTextureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)frontTextureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (leftTexture != null)
			{
				stringX3D.append(((X3DConcreteElement)leftTexture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (leftTextureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)leftTextureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (rightTexture != null)
			{
				stringX3D.append(((X3DConcreteElement)rightTexture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (rightTextureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)rightTextureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (topTexture != null)
			{
				stringX3D.append(((X3DConcreteElement)topTexture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (topTextureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)topTextureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</TextureBackground>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=TextureBackground, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (backTexture != null) || (backTextureProtoInstance != null) || (bottomTexture != null) || (bottomTextureProtoInstance != null) || (frontTexture != null) || (frontTextureProtoInstance != null) || (IS != null) || (leftTexture != null) || (leftTextureProtoInstance != null) || (metadata != null) || (metadataProtoInstance != null) || (rightTexture != null) || (rightTextureProtoInstance != null) || (topTexture != null) || (topTextureProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("TextureBackground").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("groundAngle"))
						{
							stringClassicVRML.append(indentCharacter).append("groundAngle").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getGroundAngle().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("groundAngle ").append("[ ").append(MFFloatObject.toString(getGroundAngle())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("groundColor"))
						{
							stringClassicVRML.append(indentCharacter).append("groundColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getGroundColor().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("groundColor ").append("[ ").append(MFColorObject.toString(getGroundColor())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("skyAngle"))
						{
							stringClassicVRML.append(indentCharacter).append("skyAngle").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSkyAngle().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("skyAngle ").append("[ ").append(MFFloatObject.toString(getSkyAngle())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("skyColor"))
						{
							stringClassicVRML.append(indentCharacter).append("skyColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getSkyColor(), SKYCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("skyColor ").append("[ ").append(MFColorObject.toString(getSkyColor())).append(" ]").append("\n").append(indent).append(indentCharacter);
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
			if (backTexture != null)
			{
				stringClassicVRML.append(indentCharacter).append("backTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) backTexture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (backTextureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("backTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) backTextureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (bottomTexture != null)
			{
				stringClassicVRML.append(indentCharacter).append("bottomTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) bottomTexture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (bottomTextureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("bottomTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) bottomTextureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (frontTexture != null)
			{
				stringClassicVRML.append(indentCharacter).append("frontTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) frontTexture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (frontTextureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("frontTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) frontTextureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (leftTexture != null)
			{
				stringClassicVRML.append(indentCharacter).append("leftTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) leftTexture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (leftTextureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("leftTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) leftTextureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (rightTexture != null)
			{
				stringClassicVRML.append(indentCharacter).append("rightTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) rightTexture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (rightTextureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("rightTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) rightTextureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (topTexture != null)
			{
				stringClassicVRML.append(indentCharacter).append("topTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) topTexture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (topTextureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("topTexture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) topTextureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
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
		if (backTexture != null)
		{
			referenceElement = ((X3DConcreteElement) backTexture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (backTextureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) backTextureProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (bottomTexture != null)
		{
			referenceElement = ((X3DConcreteElement) bottomTexture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (bottomTextureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) bottomTextureProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (frontTexture != null)
		{
			referenceElement = ((X3DConcreteElement) frontTexture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (frontTextureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) frontTextureProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (leftTexture != null)
		{
			referenceElement = ((X3DConcreteElement) leftTexture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (leftTextureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) leftTextureProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (rightTexture != null)
		{
			referenceElement = ((X3DConcreteElement) rightTexture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (rightTextureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) rightTextureProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (topTexture != null)
		{
			referenceElement = ((X3DConcreteElement) topTexture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (topTextureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) topTextureProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (backTexture != null)
		{
			referenceNode = ((X3DConcreteElement) backTexture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (backTextureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) backTextureProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (bottomTexture != null)
		{
			referenceNode = ((X3DConcreteElement) bottomTexture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (bottomTextureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) bottomTextureProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (frontTexture != null)
		{
			referenceNode = ((X3DConcreteElement) frontTexture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (frontTextureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) frontTextureProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (leftTexture != null)
		{
			referenceNode = ((X3DConcreteElement) leftTexture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (leftTextureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) leftTextureProtoInstance).findNodeByDEF(DEFvalue);
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
		if (rightTexture != null)
		{
			referenceNode = ((X3DConcreteElement) rightTexture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (rightTextureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) rightTextureProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (topTexture != null)
		{
			referenceNode = ((X3DConcreteElement) topTexture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (topTextureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) topTextureProtoInstance).findNodeByDEF(DEFvalue);
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

		setGroundAngle(getGroundAngle()); // exercise field checks, simple types
        
		setGroundColor(getGroundColor()); // exercise field checks, simple types
        
		setSkyAngle(getSkyAngle()); // exercise field checks, simple types
        
		setSkyColor(getSkyColor()); // exercise field checks, simple types
        
		setTransparency(getTransparency()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (backTexture != null)
		{
			setBackTexture(getBackTexture());
			((X3DConcreteElement) backTexture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) backTexture).getValidationResult());
		}
		if (backTextureProtoInstance != null)
		{
			setBackTexture(getBackTextureProtoInstance());
			((X3DConcreteElement) backTextureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) backTextureProtoInstance).getValidationResult());
		}
		if ((backTexture != null) && (backTextureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both backTexture and backTextureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasBackTexture()) // test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode backTexture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (bottomTexture != null)
		{
			setBottomTexture(getBottomTexture());
			((X3DConcreteElement) bottomTexture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) bottomTexture).getValidationResult());
		}
		if (bottomTextureProtoInstance != null)
		{
			setBottomTexture(getBottomTextureProtoInstance());
			((X3DConcreteElement) bottomTextureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) bottomTextureProtoInstance).getValidationResult());
		}
		if ((bottomTexture != null) && (bottomTextureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both bottomTexture and bottomTextureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasBottomTexture()) // test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode bottomTexture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (frontTexture != null)
		{
			setFrontTexture(getFrontTexture());
			((X3DConcreteElement) frontTexture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) frontTexture).getValidationResult());
		}
		if (frontTextureProtoInstance != null)
		{
			setFrontTexture(getFrontTextureProtoInstance());
			((X3DConcreteElement) frontTextureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) frontTextureProtoInstance).getValidationResult());
		}
		if ((frontTexture != null) && (frontTextureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both frontTexture and frontTextureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasFrontTexture()) // test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode frontTexture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (leftTexture != null)
		{
			setLeftTexture(getLeftTexture());
			((X3DConcreteElement) leftTexture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) leftTexture).getValidationResult());
		}
		if (leftTextureProtoInstance != null)
		{
			setLeftTexture(getLeftTextureProtoInstance());
			((X3DConcreteElement) leftTextureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) leftTextureProtoInstance).getValidationResult());
		}
		if ((leftTexture != null) && (leftTextureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both leftTexture and leftTextureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasLeftTexture()) // test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode leftTexture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (rightTexture != null)
		{
			setRightTexture(getRightTexture());
			((X3DConcreteElement) rightTexture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) rightTexture).getValidationResult());
		}
		if (rightTextureProtoInstance != null)
		{
			setRightTexture(getRightTextureProtoInstance());
			((X3DConcreteElement) rightTextureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) rightTextureProtoInstance).getValidationResult());
		}
		if ((rightTexture != null) && (rightTextureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both rightTexture and rightTextureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasRightTexture()) // test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode rightTexture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (topTexture != null)
		{
			setTopTexture(getTopTexture());
			((X3DConcreteElement) topTexture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) topTexture).getValidationResult());
		}
		if (topTextureProtoInstance != null)
		{
			setTopTexture(getTopTextureProtoInstance());
			((X3DConcreteElement) topTextureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) topTextureProtoInstance).getValidationResult());
		}
		if ((topTexture != null) && (topTextureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both topTexture and topTextureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTopTexture()) // test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained SFNode topTexture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureBackground USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'TextureBackground' node, add head statement <component name='EnvironmentalEffects' level='3'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"EnvironmentalEffects\").setLevel(3);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
