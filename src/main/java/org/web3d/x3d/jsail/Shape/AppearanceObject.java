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
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Shape.*;
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
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.sai.Shape.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Shape.*;
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
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.sai.Shape.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Shaders.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Shaders.*;
import org.web3d.x3d.sai.Shape.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.sai.Shape.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import java.util.Arrays;

/**
 * Appearance specifies the visual properties of geometry by containing the Material, ImageTexture/MovieTexture/PixelTexture, FillProperties, LineProperties, programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) and TextureTransform nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DAppearanceNode] Appearance specifies the visual properties of geometry by containing the Material, ImageTexture/MovieTexture/PixelTexture, FillProperties, LineProperties, programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) and TextureTransform nodes.
 * <ul>
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. Interchange profile hint: only Material and ImageTexture children are allowed. </li> 
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes in a scene. </li> 
 *  <li> <i>Hint:</i> Advanced uses can contain MultiTexture, MultiTextureTransform/TextureTransformMatrix3D/TextureTransform3D, ComposedShader/PackagedShader/ProgramShader, ComposedTexture3D/ImageTexture3D/PixelTexture3D, or ComposedCubeMapTexture/GeneratedCubeMapTexture/ImageCubeMapTexture. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 12.2.2 Appearance node <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Appearancenode" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Appearancenode</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 17.2.2 Lighting model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Appearance" target="blank">X3D Abstract Specification: Appearance</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Appearance" target="_blank">X3D Tooltips: Appearance</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class AppearanceObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Shape.Appearance
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=fillProperties, @type=SFNode, $javaType=FillPropertiesObject, $javaReferenceType=FillPropertiesObject, $javaPrimitiveType=FillPropertiesObject, $normalizedMemberObjectName=fillProperties, $isX3dStatement=false, @acceptableNodeTypes=FillProperties */ 
	private FillPropertiesObject fillProperties; // SFNode acceptable node types: FillProperties or ProtoInstanceObject
	private ProtoInstanceObject fillPropertiesProtoInstance; // allowed alternative for fillProperties field

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=lineProperties, @type=SFNode, $javaType=LinePropertiesObject, $javaReferenceType=LinePropertiesObject, $javaPrimitiveType=LinePropertiesObject, $normalizedMemberObjectName=lineProperties, $isX3dStatement=false, @acceptableNodeTypes=LineProperties */ 
	private LinePropertiesObject lineProperties; // SFNode acceptable node types: LineProperties or ProtoInstanceObject
	private ProtoInstanceObject linePropertiesProtoInstance; // allowed alternative for lineProperties field

 /* @name=material, @type=SFNode, $javaType=X3DMaterialNode, $javaReferenceType=X3DMaterialNode, $javaPrimitiveType=X3DMaterialNode, $normalizedMemberObjectName=material, $isX3dStatement=false, @acceptableNodeTypes=X3DMaterialNode */ 
	private X3DMaterialNode material; // SFNode acceptable node types: X3DMaterialNode or ProtoInstanceObject
	private ProtoInstanceObject materialProtoInstance; // allowed alternative for material field

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=pointProperties, @type=SFNode, $javaType=PointPropertiesObject, $javaReferenceType=PointPropertiesObject, $javaPrimitiveType=PointPropertiesObject, $normalizedMemberObjectName=pointProperties, $isX3dStatement=false, @acceptableNodeTypes=PointProperties */ 
	private PointPropertiesObject pointProperties; // SFNode acceptable node types: PointProperties or ProtoInstanceObject
	private ProtoInstanceObject pointPropertiesProtoInstance; // allowed alternative for pointProperties field

 /* @name=shaders, @type=MFNode, $javaType=ArrayList<X3DShaderNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DShaderNode>, $normalizedMemberObjectName=shaders, $isX3dStatement=false, @acceptableNodeTypes=X3DShaderNode */ 
	private ArrayList<X3DNode> shaders = new ArrayList<>(); // MFNode acceptable node types: X3DShaderNode or ProtoInstanceObject

 /* @name=texture, @type=SFNode, $javaType=X3DTextureNode, $javaReferenceType=X3DTextureNode, $javaPrimitiveType=X3DTextureNode, $normalizedMemberObjectName=texture, $isX3dStatement=false, @acceptableNodeTypes=X3DTextureNode */ 
	private X3DTextureNode texture; // SFNode acceptable node types: X3DTextureNode or ProtoInstanceObject
	private ProtoInstanceObject textureProtoInstance; // allowed alternative for texture field

 /* @name=textureTransform, @type=SFNode, $javaType=X3DTextureTransformNode, $javaReferenceType=X3DTextureTransformNode, $javaPrimitiveType=X3DTextureTransformNode, $normalizedMemberObjectName=textureTransform, $isX3dStatement=false, @acceptableNodeTypes=X3DTextureTransformNode */ 
	private X3DTextureTransformNode textureTransform; // SFNode acceptable node types: X3DTextureTransformNode or ProtoInstanceObject
	private ProtoInstanceObject textureTransformProtoInstance; // allowed alternative for textureTransform field

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>Appearance</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "Appearance";

	/** Provides name of this element: <i>Appearance</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>Appearance</i> element: <i>Shape</i> */
	public static final String COMPONENT = "Shape";

	/** Defines X3D component for the <i>Appearance</i> element: <i>Shape</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Shape</i> component level for this element: <i>1</i> */
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

	/** SFNode field named <i>fillProperties</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final FillPropertiesObject FILLPROPERTIES_DEFAULT_VALUE = null;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>lineProperties</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final LinePropertiesObject LINEPROPERTIES_DEFAULT_VALUE = null;

	/** SFNode field named <i>material</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMaterialNode MATERIAL_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFNode field named <i>pointProperties</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final PointPropertiesObject POINTPROPERTIES_DEFAULT_VALUE = null;

	/** SFNode field named <i>texture</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTextureNode TEXTURE_DEFAULT_VALUE = null;

	/** SFNode field named <i>textureTransform</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DTextureTransformNode TEXTURETRANSFORM_DEFAULT_VALUE = null;

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
			case "fillProperties":
				result = "SFNode";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "lineProperties":
				result = "SFNode";
				break;
			case "material":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "pointProperties":
				result = "SFNode";
				break;
			case "shaders":
				result = "MFNode";
				break;
			case "texture":
				result = "SFNode";
				break;
			case "textureTransform":
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
			case "fillProperties":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "lineProperties":
				result = "inputOutput";
				break;
			case "material":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "pointProperties":
				result = "inputOutput";
				break;
			case "shaders":
				result = "inputOutput";
				break;
			case "texture":
				result = "inputOutput";
				break;
			case "textureTransform":
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
	public static final String containerField_DEFAULT_VALUE = "appearance"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFNode field named <i>fillProperties</i>. */
	public static final String fromField_FILLPROPERTIES = "fillProperties";

	/** toField ROUTE name for SFNode field named <i>fillProperties</i>. */
	public static final String toField_FILLPROPERTIES = "fillProperties";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>lineProperties</i>. */
	public static final String fromField_LINEPROPERTIES = "lineProperties";

	/** toField ROUTE name for SFNode field named <i>lineProperties</i>. */
	public static final String toField_LINEPROPERTIES = "lineProperties";

	/** fromField ROUTE name for SFNode field named <i>material</i>. */
	public static final String fromField_MATERIAL = "material";

	/** toField ROUTE name for SFNode field named <i>material</i>. */
	public static final String toField_MATERIAL = "material";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFNode field named <i>pointProperties</i>. */
	public static final String fromField_POINTPROPERTIES = "pointProperties";

	/** toField ROUTE name for SFNode field named <i>pointProperties</i>. */
	public static final String toField_POINTPROPERTIES = "pointProperties";

	/** fromField ROUTE name for MFNode field named <i>shaders</i>. */
	public static final String fromField_SHADERS = "shaders";

	/** toField ROUTE name for MFNode field named <i>shaders</i>. */
	public static final String toField_SHADERS = "shaders";

	/** fromField ROUTE name for SFNode field named <i>texture</i>. */
	public static final String fromField_TEXTURE = "texture";

	/** toField ROUTE name for SFNode field named <i>texture</i>. */
	public static final String toField_TEXTURE = "texture";

	/** fromField ROUTE name for SFNode field named <i>textureTransform</i>. */
	public static final String fromField_TEXTURETRANSFORM = "textureTransform";

	/** toField ROUTE name for SFNode field named <i>textureTransform</i>. */
	public static final String toField_TEXTURETRANSFORM = "textureTransform";

	/** Constructor for AppearanceObject to initialize member variables with default values. */
	public AppearanceObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "appearance" }; // type xs:NMTOKEN

		fillProperties = null;              // clear out any prior node
		fillPropertiesProtoInstance = null; // clear out any prior node
		IS = null; // clear out any prior node
		lineProperties = null;              // clear out any prior node
		linePropertiesProtoInstance = null; // clear out any prior node
		material = null;              // clear out any prior node
		materialProtoInstance = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		pointProperties = null;              // clear out any prior node
		pointPropertiesProtoInstance = null; // clear out any prior node
		shaders = new ArrayList<>();
		texture = null;              // clear out any prior node
		textureProtoInstance = null; // clear out any prior node
		textureTransform = null;              // clear out any prior node
		textureTransformProtoInstance = null; // clear out any prior node

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide FillPropertiesObject instance (using a properly typed node) from inputOutput SFNode field <i>fillProperties</i>.
	 * @see #getFillPropertiesProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [FillProperties] Single contained FillProperties node that specifies additional visual attributes applied to polygonal areas of corresponding geometry, on top of whatever other appearance is already defined.  * <br>

	 * @return value of fillProperties field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public FillProperties getFillProperties()
	{
		return (FillProperties)fillProperties;
	}

	/**
	 * Accessor method to assign FillPropertiesObject instance (using a properly typed node) to inputOutput SFNode field <i>fillProperties</i>.
	 * @see #setFillProperties(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [FillProperties] Single contained FillProperties node that specifies additional visual attributes applied to polygonal areas of corresponding geometry, on top of whatever other appearance is already defined.  * <br>

	 * @param newValue is new value for the fillProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setFillProperties(FillProperties newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setFillProperties(FILLPROPERTIES_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof FillPropertiesObject)
	{
       fillProperties = (FillPropertiesObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("FillProperties newValue=(fillPropertiesObject.toString(newValue)) is not instanceof FillPropertiesObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of fillProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearFillProperties()
	{
		((X3DConcreteElement) fillProperties).clearParentObject(); // remove references to facilitate Java memory management
		fillProperties = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>fillProperties</i>.
	 * @see #setFillProperties(FillProperties)
	 * @param newValue is new value for the fillProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setFillProperties(ProtoInstanceObject newValue)
	{
		if (fillPropertiesProtoInstance != null)
		{
			((X3DConcreteElement) fillPropertiesProtoInstance).setParentObject(null); // parentTest15.5
	    }
		fillPropertiesProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) fillPropertiesProtoInstance).setParentObject(this); // parentTest15.6
            fillPropertiesProtoInstance.setContainerField("fillProperties");
	    }
		if (fillProperties != null)
		{
			((X3DConcreteElement) fillProperties).setParentObject(null); // housekeeping, clear prior object
			fillProperties = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getFillPropertiesProtoInstance()
		{
			return fillPropertiesProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>fillProperties</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getFillProperties()
	 * @see #getFillPropertiesProtoInstance()
	 */
	public boolean hasFillProperties()
	{
		return (fillProperties != null) || (fillPropertiesProtoInstance != null);
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setIS(ISObject newValue)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearIS()
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
	 * Provide LinePropertiesObject instance (using a properly typed node) from inputOutput SFNode field <i>lineProperties</i>.
	 * @see #getLinePropertiesProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [LineProperties] Single contained LineProperties node that specifies additional visual attributes applied to corresponding line geometry.  * <br>

	 * @return value of lineProperties field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public LineProperties getLineProperties()
	{
		return (LineProperties)lineProperties;
	}

	/**
	 * Accessor method to assign LinePropertiesObject instance (using a properly typed node) to inputOutput SFNode field <i>lineProperties</i>.
	 * @see #setLineProperties(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [LineProperties] Single contained LineProperties node that specifies additional visual attributes applied to corresponding line geometry.  * <br>

	 * @param newValue is new value for the lineProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setLineProperties(LineProperties newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setLineProperties(LINEPROPERTIES_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof LinePropertiesObject)
	{
       lineProperties = (LinePropertiesObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("LineProperties newValue=(linePropertiesObject.toString(newValue)) is not instanceof LinePropertiesObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of lineProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearLineProperties()
	{
		((X3DConcreteElement) lineProperties).clearParentObject(); // remove references to facilitate Java memory management
		lineProperties = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>lineProperties</i>.
	 * @see #setLineProperties(LineProperties)
	 * @param newValue is new value for the lineProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setLineProperties(ProtoInstanceObject newValue)
	{
		if (linePropertiesProtoInstance != null)
		{
			((X3DConcreteElement) linePropertiesProtoInstance).setParentObject(null); // parentTest15.5
	    }
		linePropertiesProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) linePropertiesProtoInstance).setParentObject(this); // parentTest15.6
            linePropertiesProtoInstance.setContainerField("lineProperties");
	    }
		if (lineProperties != null)
		{
			((X3DConcreteElement) lineProperties).setParentObject(null); // housekeeping, clear prior object
			lineProperties = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getLinePropertiesProtoInstance()
		{
			return linePropertiesProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>lineProperties</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getLineProperties()
	 * @see #getLinePropertiesProtoInstance()
	 */
	public boolean hasLineProperties()
	{
		return (lineProperties != null) || (linePropertiesProtoInstance != null);
	}
	/**
	 * Provide X3DMaterialNode instance (using a properly typed node) from inputOutput SFNode field <i>material</i>.
	 * @see #getMaterialProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMaterialNode] Single contained Material node that specifies visual attributes for lighting response (color types, transparency, etc.) applied to corresponding geometry.
 * <ul>
 *  <li> <i> Warning:</i>  if material is NULL or unspecified, lighting is off (all lights ignored) for this Shape and unlit object color is (1, 1, 1). </li> 
 * </ul>
	 * @return value of material field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public X3DMaterialNode getMaterial()
	{
		return material;
	}

	/**
	 * Accessor method to assign X3DMaterialNode instance (using a properly typed node) to inputOutput SFNode field <i>material</i>.
	 * @see #setMaterial(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMaterialNode] Single contained Material node that specifies visual attributes for lighting response (color types, transparency, etc.) applied to corresponding geometry.
 * <ul>
 *  <li> <i> Warning:</i>  if material is NULL or unspecified, lighting is off (all lights ignored) for this Shape and unlit object color is (1, 1, 1). </li> 
 * </ul>
	 * @param newValue is new value for the material field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setMaterial(X3DMaterialNode newValue)
	{
		// set-newValue-validity-checks #0
		material = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) material).setParentObject(this); // parentTest15
		}
		if (materialProtoInstance != null)
		{
			materialProtoInstance.setParentObject(null); // housekeeping, clear prior object
			materialProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of material field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearMaterial()
	{
		((X3DConcreteElement) material).clearParentObject(); // remove references to facilitate Java memory management
		material = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>material</i>.
	 * @see #setMaterial(X3DMaterialNode)
	 * @param newValue is new value for the material field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setMaterial(ProtoInstanceObject newValue)
	{
		if (materialProtoInstance != null)
		{
			((X3DConcreteElement) materialProtoInstance).setParentObject(null); // parentTest15.5
	    }
		materialProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) materialProtoInstance).setParentObject(this); // parentTest15.6
            materialProtoInstance.setContainerField("material");
	    }
		if (material != null)
		{
			((X3DConcreteElement) material).setParentObject(null); // housekeeping, clear prior object
			material = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getMaterialProtoInstance()
		{
			return materialProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>material</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getMaterial()
	 * @see #getMaterialProtoInstance()
	 */
	public boolean hasMaterial()
	{
		return (material != null) || (materialProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide PointPropertiesObject instance (using a properly typed node) from inputOutput SFNode field <i>pointProperties</i>.
	 * @see #getPointPropertiesProtoInstance()
	 * @return value of pointProperties field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public PointProperties getPointProperties()
	{
		return (PointProperties)pointProperties;
	}

	/**
	 * Accessor method to assign PointPropertiesObject instance (using a properly typed node) to inputOutput SFNode field <i>pointProperties</i>.
	 * @see #setPointProperties(ProtoInstanceObject)
	 * @param newValue is new value for the pointProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setPointProperties(PointProperties newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setPointProperties(POINTPROPERTIES_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof PointPropertiesObject)
	{
       pointProperties = (PointPropertiesObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("PointProperties newValue=(pointPropertiesObject.toString(newValue)) is not instanceof PointPropertiesObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of pointProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearPointProperties()
	{
		((X3DConcreteElement) pointProperties).clearParentObject(); // remove references to facilitate Java memory management
		pointProperties = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>pointProperties</i>.
	 * @see #setPointProperties(PointProperties)
	 * @param newValue is new value for the pointProperties field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setPointProperties(ProtoInstanceObject newValue)
	{
		if (pointPropertiesProtoInstance != null)
		{
			((X3DConcreteElement) pointPropertiesProtoInstance).setParentObject(null); // parentTest15.5
	    }
		pointPropertiesProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) pointPropertiesProtoInstance).setParentObject(this); // parentTest15.6
            pointPropertiesProtoInstance.setContainerField("pointProperties");
	    }
		if (pointProperties != null)
		{
			((X3DConcreteElement) pointProperties).setParentObject(null); // housekeeping, clear prior object
			pointProperties = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getPointPropertiesProtoInstance()
		{
			return pointPropertiesProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>pointProperties</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getPointProperties()
	 * @see #getPointPropertiesProtoInstance()
	 */
	public boolean hasPointProperties()
	{
		return (pointProperties != null) || (pointPropertiesProtoInstance != null);
	}
	/**
	 * Provide array of X3DShaderNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>shaders</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DShaderNode] Zero or more contained programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) that specify, in order of preference, author-programmed rendering characteristics.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 31 Programmable shaders component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode.
	 * @see org.web3d.x3d.sai.Shaders.X3DShaderNode
	 * @return value of shaders field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getShaders()
	{
		final X3DNode[] valuesArray = new X3DNode[shaders.size()];
		int i = 0;
		for (X3DNode arrayElement : shaders) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode shaders field, similar to {@link #getShaders()}.
	 * @return value of shaders field
	 */
	public ArrayList<X3DNode> getShadersList()
	{
		return shaders;
	}

	/**
	 * Accessor method to assign X3DShaderNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>shaders</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DShaderNode] Zero or more contained programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) that specify, in order of preference, author-programmed rendering characteristics.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 31 Programmable shaders component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode.
	 * @param newValue is new value for the shaders field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setShaders(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearShaders(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearShaders(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				shaders.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode shaders field, similar to {@link #setShaders(X3DNode[])}.
	 * @param newValue is new value for the shaders field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setShaders(ArrayList<X3DShaderNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearShaders(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearShaders(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setShaders(newArray);
        }
		for (X3DShaderNode element : newValue)
		{
			shaders.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of shaders nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode and ProtoInstance.
	 * @param newValue is new value to be appended the shaders field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public AppearanceObject addShaders(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		shaders.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for shaders field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public AppearanceObject addShaders(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		shaders.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child shaders nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode.
	 * @param newValue is new value array to be appended the shaders field.
	 */
	@Override // or here2?
	public void addShaders(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				shaders.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("shaders");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child shaders node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DShaderNode.
	 * @param newValue is new node for the shaders field (restricted to X3DShaderNode)
	 */
	@Override
	public void setShaders(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearShaders(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : shaders)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearShaders(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			shaders.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of shaders field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public AppearanceObject clearShaders()
	{
		for (X3DNode element : shaders)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		shaders.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>shaders</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getShaders()
	 */
	public boolean hasShaders()
	{
		return (!shaders.isEmpty());
	}
	/**
	 * Provide X3DTextureNode instance (using a properly typed node) from inputOutput SFNode field <i>texture</i>.
	 * @see #getTextureProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureNode] Single contained texture node (ImageTexture, MovieTexture, PixelTexture, MultiTexture) that maps image(s) to surface geometry.
 * <ul>
 *  <li> <i>Hint:</i> if texture node is NULL or unspecified, corresponding Shape geometry for this Appearance is not textured. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 18 Texturing component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33 Texturing3D component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a> </li> 
 * </ul>
	 * @return value of texture field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTextureNode getTexture()
	{
		return texture;
	}

	/**
	 * Accessor method to assign X3DTextureNode instance (using a properly typed node) to inputOutput SFNode field <i>texture</i>.
	 * @see #setTexture(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureNode] Single contained texture node (ImageTexture, MovieTexture, PixelTexture, MultiTexture) that maps image(s) to surface geometry.
 * <ul>
 *  <li> <i>Hint:</i> if texture node is NULL or unspecified, corresponding Shape geometry for this Appearance is not textured. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 18 Texturing component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33 Texturing3D component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a> </li> 
 * </ul>
	 * @param newValue is new value for the texture field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setTexture(X3DTextureNode newValue)
	{
		// set-newValue-validity-checks #0
		texture = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) texture).setParentObject(this); // parentTest15
		}
		if (textureProtoInstance != null)
		{
			textureProtoInstance.setParentObject(null); // housekeeping, clear prior object
			textureProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of texture field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearTexture()
	{
		((X3DConcreteElement) texture).clearParentObject(); // remove references to facilitate Java memory management
		texture = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>texture</i>.
	 * @see #setTexture(X3DTextureNode)
	 * @param newValue is new value for the texture field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setTexture(ProtoInstanceObject newValue)
	{
		if (textureProtoInstance != null)
		{
			((X3DConcreteElement) textureProtoInstance).setParentObject(null); // parentTest15.5
	    }
		textureProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) textureProtoInstance).setParentObject(this); // parentTest15.6
            textureProtoInstance.setContainerField("texture");
	    }
		if (texture != null)
		{
			((X3DConcreteElement) texture).setParentObject(null); // housekeeping, clear prior object
			texture = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTextureProtoInstance()
		{
			return textureProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>texture</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTexture()
	 * @see #getTextureProtoInstance()
	 */
	public boolean hasTexture()
	{
		return (texture != null) || (textureProtoInstance != null);
	}
	/**
	 * Provide X3DTextureTransformNode instance (using a properly typed node) from inputOutput SFNode field <i>textureTransform</i>.
	 * @see #getTextureTransformProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureTransformNode] Single contained TextureTransform node that defines 2D transformation applied to texture coordinates.
 * <ul>
 *  <li> <i> Hint:</i>  if textureTransform array is empty, then this field has no effect. </li> 
 * </ul>
	 * @return value of textureTransform field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTextureTransformNode getTextureTransform()
	{
		return textureTransform;
	}

	/**
	 * Accessor method to assign X3DTextureTransformNode instance (using a properly typed node) to inputOutput SFNode field <i>textureTransform</i>.
	 * @see #setTextureTransform(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureTransformNode] Single contained TextureTransform node that defines 2D transformation applied to texture coordinates.
 * <ul>
 *  <li> <i> Hint:</i>  if textureTransform array is empty, then this field has no effect. </li> 
 * </ul>
	 * @param newValue is new value for the textureTransform field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public AppearanceObject setTextureTransform(X3DTextureTransformNode newValue)
	{
		// set-newValue-validity-checks #0
		textureTransform = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) textureTransform).setParentObject(this); // parentTest15
		}
		if (textureTransformProtoInstance != null)
		{
			textureTransformProtoInstance.setParentObject(null); // housekeeping, clear prior object
			textureTransformProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of textureTransform field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public AppearanceObject clearTextureTransform()
	{
		((X3DConcreteElement) textureTransform).clearParentObject(); // remove references to facilitate Java memory management
		textureTransform = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>textureTransform</i>.
	 * @see #setTextureTransform(X3DTextureTransformNode)
	 * @param newValue is new value for the textureTransform field.
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setTextureTransform(ProtoInstanceObject newValue)
	{
		if (textureTransformProtoInstance != null)
		{
			((X3DConcreteElement) textureTransformProtoInstance).setParentObject(null); // parentTest15.5
	    }
		textureTransformProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) textureTransformProtoInstance).setParentObject(this); // parentTest15.6
            textureTransformProtoInstance.setContainerField("textureTransform");
	    }
		if (textureTransform != null)
		{
			((X3DConcreteElement) textureTransform).setParentObject(null); // housekeeping, clear prior object
			textureTransform = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTextureTransformProtoInstance()
		{
			return textureTransformProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>textureTransform</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTextureTransform()
	 * @see #getTextureTransformProtoInstance()
	 */
	public boolean hasTextureTransform()
	{
		return (textureTransform != null) || (textureTransformProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final AppearanceObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to Appearance DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Appearance DEF newValue='" + newValue + "'" + 
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final AppearanceObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to Appearance USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Appearance USE newValue='" + newValue + "'" + 
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final AppearanceObject setCssClass(String newValue)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setCssClass(SFStringObject newValue)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public AppearanceObject setUSE(AppearanceObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on AppearanceObject" +
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
	public AppearanceObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public AppearanceObject addComments (String newComment)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public AppearanceObject addComments (String[] newComments)
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
	 * @return {@link AppearanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public AppearanceObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (fillProperties != null) || (fillPropertiesProtoInstance != null) || (IS != null) || (lineProperties != null) || (linePropertiesProtoInstance != null) || (material != null) || (materialProtoInstance != null) || (metadata != null) || (metadataProtoInstance != null) || (pointProperties != null) || (pointPropertiesProtoInstance != null) || (!shaders.isEmpty()) || (texture != null) || (textureProtoInstance != null) || (textureTransform != null) || (textureTransformProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<Appearance"); // start opening tag
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
			if      (fillProperties != null)
			{
				stringX3D.append(((X3DConcreteElement)fillProperties).toStringX3D(indentLevel + indentIncrement));
			}
			else if (fillPropertiesProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)fillPropertiesProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (lineProperties != null)
			{
				stringX3D.append(((X3DConcreteElement)lineProperties).toStringX3D(indentLevel + indentIncrement));
			}
			else if (linePropertiesProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)linePropertiesProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (material != null)
			{
				stringX3D.append(((X3DConcreteElement)material).toStringX3D(indentLevel + indentIncrement));
			}
			else if (materialProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)materialProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (pointProperties != null)
			{
				stringX3D.append(((X3DConcreteElement)pointProperties).toStringX3D(indentLevel + indentIncrement));
			}
			else if (pointPropertiesProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)pointPropertiesProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : shaders)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			if      (texture != null)
			{
				stringX3D.append(((X3DConcreteElement)texture).toStringX3D(indentLevel + indentIncrement));
			}
			else if (textureProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)textureProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (textureTransform != null)
			{
				stringX3D.append(((X3DConcreteElement)textureTransform).toStringX3D(indentLevel + indentIncrement));
			}
			else if (textureTransformProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)textureTransformProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</Appearance>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=Appearance, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (fillProperties != null) || (fillPropertiesProtoInstance != null) || (IS != null) || (lineProperties != null) || (linePropertiesProtoInstance != null) || (material != null) || (materialProtoInstance != null) || (metadata != null) || (metadataProtoInstance != null) || (pointProperties != null) || (pointPropertiesProtoInstance != null) || (!shaders.isEmpty()) || (texture != null) || (textureProtoInstance != null) || (textureTransform != null) || (textureTransformProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("Appearance").append(" { "); // define node name, node content follows

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
			if (fillProperties != null)
			{
				stringClassicVRML.append(indentCharacter).append("fillProperties").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) fillProperties).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (fillPropertiesProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("fillProperties").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) fillPropertiesProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (lineProperties != null)
			{
				stringClassicVRML.append(indentCharacter).append("lineProperties").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) lineProperties).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (linePropertiesProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("lineProperties").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) linePropertiesProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (material != null)
			{
				stringClassicVRML.append(indentCharacter).append("material").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) material).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (materialProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("material").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) materialProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (pointProperties != null)
			{
				stringClassicVRML.append(indentCharacter).append("pointProperties").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) pointProperties).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (pointPropertiesProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("pointProperties").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) pointPropertiesProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (shaders.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("shaders").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : shaders)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (texture != null)
			{
				stringClassicVRML.append(indentCharacter).append("texture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) texture).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (textureProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("texture").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) textureProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (textureTransform != null)
			{
				stringClassicVRML.append(indentCharacter).append("textureTransform").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) textureTransform).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (textureTransformProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("textureTransform").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) textureTransformProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
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
		if (fillProperties != null)
		{
			referenceElement = ((X3DConcreteElement) fillProperties).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (fillPropertiesProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) fillPropertiesProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (lineProperties != null)
		{
			referenceElement = ((X3DConcreteElement) lineProperties).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (linePropertiesProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) linePropertiesProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (material != null)
		{
			referenceElement = ((X3DConcreteElement) material).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (materialProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) materialProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (pointProperties != null)
		{
			referenceElement = ((X3DConcreteElement) pointProperties).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (pointPropertiesProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) pointPropertiesProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		for (X3DNode element : shaders) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		if (texture != null)
		{
			referenceElement = ((X3DConcreteElement) texture).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (textureProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) textureProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (textureTransform != null)
		{
			referenceElement = ((X3DConcreteElement) textureTransform).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (textureTransformProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) textureTransformProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (fillProperties != null)
		{
			referenceNode = ((X3DConcreteElement) fillProperties).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (fillPropertiesProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) fillPropertiesProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (lineProperties != null)
		{
			referenceNode = ((X3DConcreteElement) lineProperties).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (linePropertiesProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) linePropertiesProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (material != null)
		{
			referenceNode = ((X3DConcreteElement) material).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (materialProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) materialProtoInstance).findNodeByDEF(DEFvalue);
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
		if (pointProperties != null)
		{
			referenceNode = ((X3DConcreteElement) pointProperties).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (pointPropertiesProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) pointPropertiesProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		for (X3DNode element : shaders) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		if (texture != null)
		{
			referenceNode = ((X3DConcreteElement) texture).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (textureProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) textureProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (textureTransform != null)
		{
			referenceNode = ((X3DConcreteElement) textureTransform).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (textureTransformProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) textureTransformProtoInstance).findNodeByDEF(DEFvalue);
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
        
		if (fillProperties != null)
		{
			setFillProperties(getFillProperties());
			((X3DConcreteElement) fillProperties).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) fillProperties).getValidationResult());
		}
		if (fillPropertiesProtoInstance != null)
		{
			setFillProperties(getFillPropertiesProtoInstance());
			((X3DConcreteElement) fillPropertiesProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) fillPropertiesProtoInstance).getValidationResult());
		}
		if ((fillProperties != null) && (fillPropertiesProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both fillProperties and fillPropertiesProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasFillProperties()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode fillProperties";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (lineProperties != null)
		{
			setLineProperties(getLineProperties());
			((X3DConcreteElement) lineProperties).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) lineProperties).getValidationResult());
		}
		if (linePropertiesProtoInstance != null)
		{
			setLineProperties(getLinePropertiesProtoInstance());
			((X3DConcreteElement) linePropertiesProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) linePropertiesProtoInstance).getValidationResult());
		}
		if ((lineProperties != null) && (linePropertiesProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both lineProperties and linePropertiesProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasLineProperties()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode lineProperties";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (material != null)
		{
			setMaterial(getMaterial());
			((X3DConcreteElement) material).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) material).getValidationResult());
		}
		if (materialProtoInstance != null)
		{
			setMaterial(getMaterialProtoInstance());
			((X3DConcreteElement) materialProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) materialProtoInstance).getValidationResult());
		}
		if ((material != null) && (materialProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both material and materialProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasMaterial()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode material";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (pointProperties != null)
		{
			setPointProperties(getPointProperties());
			((X3DConcreteElement) pointProperties).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) pointProperties).getValidationResult());
		}
		if (pointPropertiesProtoInstance != null)
		{
			setPointProperties(getPointPropertiesProtoInstance());
			((X3DConcreteElement) pointPropertiesProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) pointPropertiesProtoInstance).getValidationResult());
		}
		if ((pointProperties != null) && (pointPropertiesProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both pointProperties and pointPropertiesProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasPointProperties()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode pointProperties";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : shaders) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setShaders(getShaders()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasShaders()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained MFNode shaders";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		if (texture != null)
		{
			setTexture(getTexture());
			((X3DConcreteElement) texture).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) texture).getValidationResult());
		}
		if (textureProtoInstance != null)
		{
			setTexture(getTextureProtoInstance());
			((X3DConcreteElement) textureProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) textureProtoInstance).getValidationResult());
		}
		if ((texture != null) && (textureProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both texture and textureProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTexture()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode texture";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (textureTransform != null)
		{
			setTextureTransform(getTextureTransform());
			((X3DConcreteElement) textureTransform).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) textureTransform).getValidationResult());
		}
		if (textureTransformProtoInstance != null)
		{
			setTextureTransform(getTextureTransformProtoInstance());
			((X3DConcreteElement) textureTransformProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) textureTransformProtoInstance).getValidationResult());
		}
		if ((textureTransform != null) && (textureTransformProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both textureTransform and textureTransformProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTextureTransform()) // test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained SFNode textureTransform";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Appearance USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'Appearance' node, add head statement <component name='Shape' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Shape\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
