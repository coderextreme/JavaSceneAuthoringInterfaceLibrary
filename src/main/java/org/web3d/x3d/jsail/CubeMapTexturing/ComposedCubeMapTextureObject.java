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

package org.web3d.x3d.jsail.CubeMapTexturing;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.sai.CubeMapTexturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;

/**
 * ComposedCubeMapTexture is a texture node that defines a cubic environment map source as an explicit set of images drawn from individual 2D texture nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.1 or later) [X3DEnvironmentTextureNode] ComposedCubeMapTexture is a texture node that defines a cubic environment map source as an explicit set of images drawn from individual 2D texture nodes.
 * <ul>
 *  <li> <i>Hint:</i> 0..6 child image nodes are allowed (ImageTexture MovieTexture PixelTexture) with corresponding containerField values: front back left right top bottom. </li> 
 *  <li> <i>Warning:</i>  each of the child ImageTexture or PixelTexture nodes must have unique containerField values for back, bottom, front, left, right, or top. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/env_texture.html#ComposedCubeMapTexture" target="blank">X3D Abstract Specification: ComposedCubeMapTexture</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ComposedCubeMapTexture" target="_blank">X3D Tooltips: ComposedCubeMapTexture</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public class ComposedCubeMapTextureObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.CubeMapTexturing.ComposedCubeMapTexture
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=back, @type=SFNode, $javaType=X3DTexture2DNode, $javaReferenceType=X3DTexture2DNode, $javaPrimitiveType=X3DTexture2DNode, $normalizedMemberObjectName=back, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode */ 
	private X3DTexture2DNode back; // SFNode acceptable node types: X3DTexture2DNode or ProtoInstanceObject
	private ProtoInstanceObject backProtoInstance; // allowed alternative for back field

 /* @name=bottom, @type=SFNode, $javaType=X3DTexture2DNode, $javaReferenceType=X3DTexture2DNode, $javaPrimitiveType=X3DTexture2DNode, $normalizedMemberObjectName=bottom, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode */ 
	private X3DTexture2DNode bottom; // SFNode acceptable node types: X3DTexture2DNode or ProtoInstanceObject
	private ProtoInstanceObject bottomProtoInstance; // allowed alternative for bottom field

 /* @name=front, @type=SFNode, $javaType=X3DTexture2DNode, $javaReferenceType=X3DTexture2DNode, $javaPrimitiveType=X3DTexture2DNode, $normalizedMemberObjectName=front, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode */ 
	private X3DTexture2DNode front; // SFNode acceptable node types: X3DTexture2DNode or ProtoInstanceObject
	private ProtoInstanceObject frontProtoInstance; // allowed alternative for front field

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=left, @type=SFNode, $javaType=X3DTexture2DNode, $javaReferenceType=X3DTexture2DNode, $javaPrimitiveType=X3DTexture2DNode, $normalizedMemberObjectName=left, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode */ 
	private X3DTexture2DNode left; // SFNode acceptable node types: X3DTexture2DNode or ProtoInstanceObject
	private ProtoInstanceObject leftProtoInstance; // allowed alternative for left field

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=right, @type=SFNode, $javaType=X3DTexture2DNode, $javaReferenceType=X3DTexture2DNode, $javaPrimitiveType=X3DTexture2DNode, $normalizedMemberObjectName=right, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode */ 
	private X3DTexture2DNode right; // SFNode acceptable node types: X3DTexture2DNode or ProtoInstanceObject
	private ProtoInstanceObject rightProtoInstance; // allowed alternative for right field

 /* @name=top, @type=SFNode, $javaType=X3DTexture2DNode, $javaReferenceType=X3DTexture2DNode, $javaPrimitiveType=X3DTexture2DNode, $normalizedMemberObjectName=top, $isX3dStatement=false, @acceptableNodeTypes=X3DTexture2DNode */ 
	private X3DTexture2DNode top; // SFNode acceptable node types: X3DTexture2DNode or ProtoInstanceObject
	private ProtoInstanceObject topProtoInstance; // allowed alternative for top field

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>ComposedCubeMapTexture</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "ComposedCubeMapTexture";

	/** Provides name of this element: <i>ComposedCubeMapTexture</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>ComposedCubeMapTexture</i> element: <i>CubeMapTexturing</i> */
	public static final String COMPONENT = "CubeMapTexturing";

	/** Defines X3D component for the <i>ComposedCubeMapTexture</i> element: <i>CubeMapTexturing</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>CubeMapTexturing</i> component level for this element: <i>1</i> */
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

	/** SFNode field named <i>back</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTexture2DNode BACK_DEFAULT_VALUE = null;

	/** SFNode field named <i>bottom</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTexture2DNode BOTTOM_DEFAULT_VALUE = null;

	/** SFNode field named <i>front</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTexture2DNode FRONT_DEFAULT_VALUE = null;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>left</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTexture2DNode LEFT_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFNode field named <i>right</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTexture2DNode RIGHT_DEFAULT_VALUE = null;

	/** SFNode field named <i>top</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTexture2DNode TOP_DEFAULT_VALUE = null;

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
			case "back":
				result = "SFNode";
				break;
			case "bottom":
				result = "SFNode";
				break;
			case "front":
				result = "SFNode";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "left":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "right":
				result = "SFNode";
				break;
			case "top":
				result = "SFNode";
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
			case "back":
				result = "inputOutput";
				break;
			case "bottom":
				result = "inputOutput";
				break;
			case "front":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "left":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "right":
				result = "inputOutput";
				break;
			case "top":
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
	public static final String containerField_DEFAULT_VALUE = "texture"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFNode field named <i>back</i>. */
	public static final String fromField_BACK = "back";

	/** toField ROUTE name for SFNode field named <i>back</i>. */
	public static final String toField_BACK = "back";

	/** fromField ROUTE name for SFNode field named <i>bottom</i>. */
	public static final String fromField_BOTTOM = "bottom";

	/** toField ROUTE name for SFNode field named <i>bottom</i>. */
	public static final String toField_BOTTOM = "bottom";

	/** fromField ROUTE name for SFNode field named <i>front</i>. */
	public static final String fromField_FRONT = "front";

	/** toField ROUTE name for SFNode field named <i>front</i>. */
	public static final String toField_FRONT = "front";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>left</i>. */
	public static final String fromField_LEFT = "left";

	/** toField ROUTE name for SFNode field named <i>left</i>. */
	public static final String toField_LEFT = "left";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFNode field named <i>right</i>. */
	public static final String fromField_RIGHT = "right";

	/** toField ROUTE name for SFNode field named <i>right</i>. */
	public static final String toField_RIGHT = "right";

	/** fromField ROUTE name for SFNode field named <i>top</i>. */
	public static final String fromField_TOP = "top";

	/** toField ROUTE name for SFNode field named <i>top</i>. */
	public static final String toField_TOP = "top";

	/** Constructor for ComposedCubeMapTextureObject to initialize member variables with default values. */
	public ComposedCubeMapTextureObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "texture" }; // type xs:NMTOKEN

		back = null;              // clear out any prior node
		backProtoInstance = null; // clear out any prior node
		bottom = null;              // clear out any prior node
		bottomProtoInstance = null; // clear out any prior node
		front = null;              // clear out any prior node
		frontProtoInstance = null; // clear out any prior node
		IS = null; // clear out any prior node
		left = null;              // clear out any prior node
		leftProtoInstance = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		right = null;              // clear out any prior node
		rightProtoInstance = null; // clear out any prior node
		top = null;              // clear out any prior node
		topProtoInstance = null; // clear out any prior node

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DTexture2DNode instance (using a properly typed node) from inputOutput SFNode field <i>back</i>.
	 * @see #getBackProtoInstance()
	 * @return value of back field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTexture2DNode getBack()
	{
		return back;
	}

	/**
	 * Accessor method to assign X3DTexture2DNode instance (using a properly typed node) to inputOutput SFNode field <i>back</i>.
	 * @see #setBack(ProtoInstanceObject)
	 * @param newValue is new value for the back field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setBack(X3DTexture2DNode newValue)
	{
		// set-newValue-validity-checks #0
		back = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) back).setParentObject(this); // parentTest15
			((X3DConcreteNode)back).setContainerFieldOverride("back");
		}
		if (backProtoInstance != null)
		{
			backProtoInstance.setParentObject(null); // housekeeping, clear prior object
			backProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of back field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearBack()
	{
		((X3DConcreteElement) back).clearParentObject(); // remove references to facilitate Java memory management
		back = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>back</i>.
	 * @see #setBack(X3DTexture2DNode)
	 * @param newValue is new value for the back field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setBack(ProtoInstanceObject newValue)
	{
		if (backProtoInstance != null)
		{
			((X3DConcreteElement) backProtoInstance).setParentObject(null); // parentTest15.5
	    }
		backProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) backProtoInstance).setParentObject(this); // parentTest15.6
            backProtoInstance.setContainerField("back");
	    }
		if (back != null)
		{
			((X3DConcreteElement) back).setParentObject(null); // housekeeping, clear prior object
			back = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getBackProtoInstance()
		{
			return backProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>back</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getBack()
	 * @see #getBackProtoInstance()
	 */
	public boolean hasBack()
	{
		return (back != null) || (backProtoInstance != null);
	}
	/**
	 * Provide X3DTexture2DNode instance (using a properly typed node) from inputOutput SFNode field <i>bottom</i>.
	 * @see #getBottomProtoInstance()
	 * @return value of bottom field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTexture2DNode getBottom()
	{
		return bottom;
	}

	/**
	 * Accessor method to assign X3DTexture2DNode instance (using a properly typed node) to inputOutput SFNode field <i>bottom</i>.
	 * @see #setBottom(ProtoInstanceObject)
	 * @param newValue is new value for the bottom field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setBottom(X3DTexture2DNode newValue)
	{
		// set-newValue-validity-checks #0
		bottom = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) bottom).setParentObject(this); // parentTest15
			((X3DConcreteNode)bottom).setContainerFieldOverride("bottom");
		}
		if (bottomProtoInstance != null)
		{
			bottomProtoInstance.setParentObject(null); // housekeeping, clear prior object
			bottomProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of bottom field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearBottom()
	{
		((X3DConcreteElement) bottom).clearParentObject(); // remove references to facilitate Java memory management
		bottom = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>bottom</i>.
	 * @see #setBottom(X3DTexture2DNode)
	 * @param newValue is new value for the bottom field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setBottom(ProtoInstanceObject newValue)
	{
		if (bottomProtoInstance != null)
		{
			((X3DConcreteElement) bottomProtoInstance).setParentObject(null); // parentTest15.5
	    }
		bottomProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) bottomProtoInstance).setParentObject(this); // parentTest15.6
            bottomProtoInstance.setContainerField("bottom");
	    }
		if (bottom != null)
		{
			((X3DConcreteElement) bottom).setParentObject(null); // housekeeping, clear prior object
			bottom = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getBottomProtoInstance()
		{
			return bottomProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>bottom</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getBottom()
	 * @see #getBottomProtoInstance()
	 */
	public boolean hasBottom()
	{
		return (bottom != null) || (bottomProtoInstance != null);
	}
	/**
	 * Provide X3DTexture2DNode instance (using a properly typed node) from inputOutput SFNode field <i>front</i>.
	 * @see #getFrontProtoInstance()
	 * @return value of front field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTexture2DNode getFront()
	{
		return front;
	}

	/**
	 * Accessor method to assign X3DTexture2DNode instance (using a properly typed node) to inputOutput SFNode field <i>front</i>.
	 * @see #setFront(ProtoInstanceObject)
	 * @param newValue is new value for the front field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setFront(X3DTexture2DNode newValue)
	{
		// set-newValue-validity-checks #0
		front = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) front).setParentObject(this); // parentTest15
			((X3DConcreteNode)front).setContainerFieldOverride("front");
		}
		if (frontProtoInstance != null)
		{
			frontProtoInstance.setParentObject(null); // housekeeping, clear prior object
			frontProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of front field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearFront()
	{
		((X3DConcreteElement) front).clearParentObject(); // remove references to facilitate Java memory management
		front = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>front</i>.
	 * @see #setFront(X3DTexture2DNode)
	 * @param newValue is new value for the front field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setFront(ProtoInstanceObject newValue)
	{
		if (frontProtoInstance != null)
		{
			((X3DConcreteElement) frontProtoInstance).setParentObject(null); // parentTest15.5
	    }
		frontProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) frontProtoInstance).setParentObject(this); // parentTest15.6
            frontProtoInstance.setContainerField("front");
	    }
		if (front != null)
		{
			((X3DConcreteElement) front).setParentObject(null); // housekeeping, clear prior object
			front = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getFrontProtoInstance()
		{
			return frontProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>front</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getFront()
	 * @see #getFrontProtoInstance()
	 */
	public boolean hasFront()
	{
		return (front != null) || (frontProtoInstance != null);
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setIS(ISObject newValue)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearIS()
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
	 * Provide X3DTexture2DNode instance (using a properly typed node) from inputOutput SFNode field <i>left</i>.
	 * @see #getLeftProtoInstance()
	 * @return value of left field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTexture2DNode getLeft()
	{
		return left;
	}

	/**
	 * Accessor method to assign X3DTexture2DNode instance (using a properly typed node) to inputOutput SFNode field <i>left</i>.
	 * @see #setLeft(ProtoInstanceObject)
	 * @param newValue is new value for the left field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setLeft(X3DTexture2DNode newValue)
	{
		// set-newValue-validity-checks #0
		left = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) left).setParentObject(this); // parentTest15
			((X3DConcreteNode)left).setContainerFieldOverride("left");
		}
		if (leftProtoInstance != null)
		{
			leftProtoInstance.setParentObject(null); // housekeeping, clear prior object
			leftProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of left field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearLeft()
	{
		((X3DConcreteElement) left).clearParentObject(); // remove references to facilitate Java memory management
		left = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>left</i>.
	 * @see #setLeft(X3DTexture2DNode)
	 * @param newValue is new value for the left field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setLeft(ProtoInstanceObject newValue)
	{
		if (leftProtoInstance != null)
		{
			((X3DConcreteElement) leftProtoInstance).setParentObject(null); // parentTest15.5
	    }
		leftProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) leftProtoInstance).setParentObject(this); // parentTest15.6
            leftProtoInstance.setContainerField("left");
	    }
		if (left != null)
		{
			((X3DConcreteElement) left).setParentObject(null); // housekeeping, clear prior object
			left = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getLeftProtoInstance()
		{
			return leftProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>left</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getLeft()
	 * @see #getLeftProtoInstance()
	 */
	public boolean hasLeft()
	{
		return (left != null) || (leftProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide X3DTexture2DNode instance (using a properly typed node) from inputOutput SFNode field <i>right</i>.
	 * @see #getRightProtoInstance()
	 * @return value of right field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTexture2DNode getRight()
	{
		return right;
	}

	/**
	 * Accessor method to assign X3DTexture2DNode instance (using a properly typed node) to inputOutput SFNode field <i>right</i>.
	 * @see #setRight(ProtoInstanceObject)
	 * @param newValue is new value for the right field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setRight(X3DTexture2DNode newValue)
	{
		// set-newValue-validity-checks #0
		right = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) right).setParentObject(this); // parentTest15
			((X3DConcreteNode)right).setContainerFieldOverride("right");
		}
		if (rightProtoInstance != null)
		{
			rightProtoInstance.setParentObject(null); // housekeeping, clear prior object
			rightProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of right field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearRight()
	{
		((X3DConcreteElement) right).clearParentObject(); // remove references to facilitate Java memory management
		right = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>right</i>.
	 * @see #setRight(X3DTexture2DNode)
	 * @param newValue is new value for the right field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setRight(ProtoInstanceObject newValue)
	{
		if (rightProtoInstance != null)
		{
			((X3DConcreteElement) rightProtoInstance).setParentObject(null); // parentTest15.5
	    }
		rightProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) rightProtoInstance).setParentObject(this); // parentTest15.6
            rightProtoInstance.setContainerField("right");
	    }
		if (right != null)
		{
			((X3DConcreteElement) right).setParentObject(null); // housekeeping, clear prior object
			right = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getRightProtoInstance()
		{
			return rightProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>right</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getRight()
	 * @see #getRightProtoInstance()
	 */
	public boolean hasRight()
	{
		return (right != null) || (rightProtoInstance != null);
	}
	/**
	 * Provide X3DTexture2DNode instance (using a properly typed node) from inputOutput SFNode field <i>top</i>.
	 * @see #getTopProtoInstance()
	 * @return value of top field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTexture2DNode getTop()
	{
		return top;
	}

	/**
	 * Accessor method to assign X3DTexture2DNode instance (using a properly typed node) to inputOutput SFNode field <i>top</i>.
	 * @see #setTop(ProtoInstanceObject)
	 * @param newValue is new value for the top field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedCubeMapTextureObject setTop(X3DTexture2DNode newValue)
	{
		// set-newValue-validity-checks #0
		top = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) top).setParentObject(this); // parentTest15
			((X3DConcreteNode)top).setContainerFieldOverride("top");
		}
		if (topProtoInstance != null)
		{
			topProtoInstance.setParentObject(null); // housekeeping, clear prior object
			topProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of top field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ComposedCubeMapTextureObject clearTop()
	{
		((X3DConcreteElement) top).clearParentObject(); // remove references to facilitate Java memory management
		top = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>top</i>.
	 * @see #setTop(X3DTexture2DNode)
	 * @param newValue is new value for the top field.
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setTop(ProtoInstanceObject newValue)
	{
		if (topProtoInstance != null)
		{
			((X3DConcreteElement) topProtoInstance).setParentObject(null); // parentTest15.5
	    }
		topProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) topProtoInstance).setParentObject(this); // parentTest15.6
            topProtoInstance.setContainerField("top");
	    }
		if (top != null)
		{
			((X3DConcreteElement) top).setParentObject(null); // housekeeping, clear prior object
			top = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTopProtoInstance()
		{
			return topProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>top</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTop()
	 * @see #getTopProtoInstance()
	 */
	public boolean hasTop()
	{
		return (top != null) || (topProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ComposedCubeMapTextureObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ComposedCubeMapTexture DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ComposedCubeMapTexture DEF newValue='" + newValue + "'" + 
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ComposedCubeMapTextureObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ComposedCubeMapTexture USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ComposedCubeMapTexture USE newValue='" + newValue + "'" + 
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentTextureNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ComposedCubeMapTextureObject setCssClass(String newValue)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setCssClass(SFStringObject newValue)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedCubeMapTextureObject setUSE(ComposedCubeMapTextureObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on ComposedCubeMapTextureObject" +
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
	public ComposedCubeMapTextureObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public ComposedCubeMapTextureObject addComments (String newComment)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ComposedCubeMapTextureObject addComments (String[] newComments)
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
	 * @return {@link ComposedCubeMapTextureObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ComposedCubeMapTextureObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (back != null) || (backProtoInstance != null) || (bottom != null) || (bottomProtoInstance != null) || (front != null) || (frontProtoInstance != null) || (IS != null) || (left != null) || (leftProtoInstance != null) || (metadata != null) || (metadataProtoInstance != null) || (right != null) || (rightProtoInstance != null) || (top != null) || (topProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<ComposedCubeMapTexture"); // start opening tag
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
			if      (back != null)
			{
				stringX3D.append(((X3DConcreteElement)back).toStringX3D(indentLevel + indentIncrement));
			}
			else if (backProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)backProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (bottom != null)
			{
				stringX3D.append(((X3DConcreteElement)bottom).toStringX3D(indentLevel + indentIncrement));
			}
			else if (bottomProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)bottomProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (front != null)
			{
				stringX3D.append(((X3DConcreteElement)front).toStringX3D(indentLevel + indentIncrement));
			}
			else if (frontProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)frontProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (left != null)
			{
				stringX3D.append(((X3DConcreteElement)left).toStringX3D(indentLevel + indentIncrement));
			}
			else if (leftProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)leftProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (right != null)
			{
				stringX3D.append(((X3DConcreteElement)right).toStringX3D(indentLevel + indentIncrement));
			}
			else if (rightProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)rightProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (top != null)
			{
				stringX3D.append(((X3DConcreteElement)top).toStringX3D(indentLevel + indentIncrement));
			}
			else if (topProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)topProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</ComposedCubeMapTexture>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=ComposedCubeMapTexture, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (back != null) || (backProtoInstance != null) || (bottom != null) || (bottomProtoInstance != null) || (front != null) || (frontProtoInstance != null) || (IS != null) || (left != null) || (leftProtoInstance != null) || (metadata != null) || (metadataProtoInstance != null) || (right != null) || (rightProtoInstance != null) || (top != null) || (topProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("ComposedCubeMapTexture").append(" { "); // define node name, node content follows

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
			if (back != null)
			{
				stringClassicVRML.append(indentCharacter).append("back").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) back).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (backProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("back").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) backProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (bottom != null)
			{
				stringClassicVRML.append(indentCharacter).append("bottom").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) bottom).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (bottomProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("bottom").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) bottomProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (front != null)
			{
				stringClassicVRML.append(indentCharacter).append("front").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) front).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (frontProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("front").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) frontProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (left != null)
			{
				stringClassicVRML.append(indentCharacter).append("left").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) left).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (leftProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("left").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) leftProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (right != null)
			{
				stringClassicVRML.append(indentCharacter).append("right").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) right).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (rightProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("right").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) rightProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (top != null)
			{
				stringClassicVRML.append(indentCharacter).append("top").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) top).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (topProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("top").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) topProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
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
		if (back != null)
		{
			referenceElement = ((X3DConcreteElement) back).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (backProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) backProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (bottom != null)
		{
			referenceElement = ((X3DConcreteElement) bottom).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (bottomProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) bottomProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (front != null)
		{
			referenceElement = ((X3DConcreteElement) front).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (frontProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) frontProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (left != null)
		{
			referenceElement = ((X3DConcreteElement) left).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (leftProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) leftProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (right != null)
		{
			referenceElement = ((X3DConcreteElement) right).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (rightProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) rightProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (top != null)
		{
			referenceElement = ((X3DConcreteElement) top).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (topProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) topProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (back != null)
		{
			referenceNode = ((X3DConcreteElement) back).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (backProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) backProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (bottom != null)
		{
			referenceNode = ((X3DConcreteElement) bottom).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (bottomProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) bottomProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (front != null)
		{
			referenceNode = ((X3DConcreteElement) front).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (frontProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) frontProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (left != null)
		{
			referenceNode = ((X3DConcreteElement) left).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (leftProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) leftProtoInstance).findNodeByDEF(DEFvalue);
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
		if (right != null)
		{
			referenceNode = ((X3DConcreteElement) right).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (rightProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) rightProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (top != null)
		{
			referenceNode = ((X3DConcreteElement) top).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (topProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) topProtoInstance).findNodeByDEF(DEFvalue);
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

		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (back != null)
		{
			setBack(getBack());
			((X3DConcreteElement) back).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) back).getValidationResult());
		}
		if (backProtoInstance != null)
		{
			setBack(getBackProtoInstance());
			((X3DConcreteElement) backProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) backProtoInstance).getValidationResult());
		}
		if ((back != null) && (backProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both back and backProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasBack()) // test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode back";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (bottom != null)
		{
			setBottom(getBottom());
			((X3DConcreteElement) bottom).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) bottom).getValidationResult());
		}
		if (bottomProtoInstance != null)
		{
			setBottom(getBottomProtoInstance());
			((X3DConcreteElement) bottomProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) bottomProtoInstance).getValidationResult());
		}
		if ((bottom != null) && (bottomProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both bottom and bottomProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasBottom()) // test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode bottom";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (front != null)
		{
			setFront(getFront());
			((X3DConcreteElement) front).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) front).getValidationResult());
		}
		if (frontProtoInstance != null)
		{
			setFront(getFrontProtoInstance());
			((X3DConcreteElement) frontProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) frontProtoInstance).getValidationResult());
		}
		if ((front != null) && (frontProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both front and frontProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasFront()) // test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode front";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (left != null)
		{
			setLeft(getLeft());
			((X3DConcreteElement) left).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) left).getValidationResult());
		}
		if (leftProtoInstance != null)
		{
			setLeft(getLeftProtoInstance());
			((X3DConcreteElement) leftProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) leftProtoInstance).getValidationResult());
		}
		if ((left != null) && (leftProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both left and leftProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasLeft()) // test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode left";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (right != null)
		{
			setRight(getRight());
			((X3DConcreteElement) right).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) right).getValidationResult());
		}
		if (rightProtoInstance != null)
		{
			setRight(getRightProtoInstance());
			((X3DConcreteElement) rightProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) rightProtoInstance).getValidationResult());
		}
		if ((right != null) && (rightProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both right and rightProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasRight()) // test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode right";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (top != null)
		{
			setTop(getTop());
			((X3DConcreteElement) top).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) top).getValidationResult());
		}
		if (topProtoInstance != null)
		{
			setTop(getTopProtoInstance());
			((X3DConcreteElement) topProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) topProtoInstance).getValidationResult());
		}
		if ((top != null) && (topProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both top and topProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTop()) // test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained SFNode top";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ComposedCubeMapTexture USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'ComposedCubeMapTexture' node, add head statement <component name='CubeMapTexturing' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"CubeMapTexturing\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}