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

package org.web3d.x3d.jsail.Core;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Core.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Core.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Core.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import java.util.Arrays;

/**
 * ProtoInstance can override field default values via fieldValue initializations. Non-recursive nested ProtoInstance and ProtoDeclare statements are allowed within a ProtoDeclare.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] ProtoInstance creates an instance node of a locally or externally declared prototype definition. ProtoDeclare/ExternProtoDeclare definitions are abstract, corresponding ProtoInstance nodes are concrete. ProtoInstance nodes typically contain fieldValue statements to override default field values defined in the original ProtoDeclare statement.
 * <ul>
 *  <li> <i>Hint:</i> the node type of a ProtoInstance exactly matches the first node in the corresponding ProtoDeclare/ProtoBody declaration. </li> 
 *  <li> <i>Warning:</i> be sure to correctly set the containerField value to match the intended field in the parent node. </li> 
 *  <li> <i>Warning:</i> do not mismatch node types when placing a ProtoInstance in a scene graph. Most validation tools will not catch this error. </li> 
 *  <li> <i>Hint:</i> scene authors can override default initializations of prototype fields by including contained &amp;lt;fieldValue&amp;gt; elements. </li> 
 *  <li> <i>Hint:</i> Nested ProtoInstance and ProtoDeclare statements are allowed within a ProtoDeclare/ProtoBody. </li> 
 *  <li> <i>Hint:</i> if contained within a ProtoDeclare, then a ProtoInstance node can also contain IS/connect statements for other defined fields. </li> 
 *  <li> <i>Warning:</i> a ProtoInstance node may not be instantiated inside its own ProtoDeclare or ExternProtoDeclare declaration (i.e. recursive prototypes are illegal). </li> 
 *  <li> <i>Warning:</i> the local context of each ProtoInstance node must match the node type of the first node in the original ProtoDeclare declaration. </li> 
 *  <li> <i>Warning:</i> ProtoInstance substitution for a Metadata* node might not validate. Workaround: put metadata-typed ProtoInstance nodes as contained values within a parent MetadataSet node. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Inlines and Prototypes <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.4.4 Prototype semantics, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics</a> Examples: X3D Example Archives, X3D for Web Authors, Chapter 14 Prototypes <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ProtoInstanceAndFieldValueStatement" target="blank">X3D Abstract Specification: ProtoInstance</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ProtoInstance" target="_blank">X3D Tooltips: ProtoInstance</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes" target="_blank">X3D Scene Authoring Hints: InlinesPrototypes</a>
    */
public class ProtoInstanceObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Core.ProtoInstance
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=fieldValue, @type=MFNode, $javaType=ArrayList<fieldValueObject>, $javaReferenceType=fieldValueObject, $javaPrimitiveType=ArrayList<fieldValueObject>, $normalizedMemberObjectName=fieldValueList, $isX3dStatement=true, @acceptableNodeTypes=fieldValue */ 
	private ArrayList<fieldValueObject> fieldValueList = new ArrayList<>(); // MFNode acceptable node types: fieldValue

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

					      ProtoDeclareObject referenceProtoDeclare;
					ExternProtoDeclareObject referenceExternProtoDeclare;
								
	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>ProtoInstance</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "ProtoInstance";

	/** Provides name of this element: <i>ProtoInstance</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>ProtoInstance</i> element: <i>Core</i> */
	public static final String COMPONENT = "Core";

	/** Defines X3D component for the <i>ProtoInstance</i> element: <i>Core</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Core</i> component level for this element: <i>2</i> */
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

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFString field named <i>name</i> has default value equal to an empty string. */
	public static final String NAME_DEFAULT_VALUE = "";

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D statement
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
			case "fieldValue":
				result = "MFNode";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "name":
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
		// now check author-defined fields
		fieldObject fieldDeclaration = null;
		if      (      hasProtoDeclare())
			fieldDeclaration =       referenceProtoDeclare.findFieldByName(fieldName);
		else if (hasExternProtoDeclare())
			fieldDeclaration = referenceExternProtoDeclare.findFieldByName(fieldName);
		if (fieldDeclaration != null)
			result = fieldDeclaration.getType(); // found it!
		return result;
	}

	/** Indicate accessType corresponding to given fieldName.
	 * @param fieldName name of field in this X3D statement
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
			case "fieldValue":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "name":
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
		// now check author-defined fields
		fieldObject fieldDeclaration = null;
		if      (       hasProtoDeclare())
			fieldDeclaration =       referenceProtoDeclare.findFieldByName(fieldName);
		else if (hasExternProtoDeclare())
			fieldDeclaration = referenceExternProtoDeclare.findFieldByName(fieldName);
		if (fieldDeclaration != null)
			result = fieldDeclaration.getAccessType(); // found it!
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

	/** Constructor for ProtoInstanceObject to initialize member variables with default values. */
	public ProtoInstanceObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		fieldValueList = new ArrayList<>();
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		name = NAME_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize

		fieldValueList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of fieldValueObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>fieldValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Include fieldValue statements if this ProtoInstance overrides default values in any of the original field declarations.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to fieldValue.
	 * @see org.web3d.x3d.jsail.Core.fieldValueObject
	 * @return value of fieldValue field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
	public ArrayList<fieldValueObject> getFieldValueList()
	{
		return fieldValueList;
	}

	/**
	 * Accessor method to assign fieldValueObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>fieldValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Include fieldValue statements if this ProtoInstance overrides default values in any of the original field declarations.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to fieldValue.
	 * @param newValue is new value for the fieldValue field.
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setFieldValueList(ArrayList<fieldValueObject> newValue)
	{
		// set-newValue-validity-checks #0
		fieldValueList = newValue;
		for (fieldValueObject arrayElement : fieldValueList)
		{
			((X3DConcreteElement) arrayElement).setParentObject(this); // parentTest11
		}
		return this;
	}

	/**
	 * Set single child fieldValue node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to fieldValue.
	 * @param newValue is new node for the fieldValue field (restricted to fieldValue)
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setFieldValue(fieldValueObject /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearFieldValue(); // reset newValueNullClearsFieldReturnThis
			return this;
		}
		for (fieldValueObject element : fieldValueList) // 
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		clearFieldValue(); // reset
		fieldValueList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest7

		return this;
}
	/**
	 * Utility method to clear MFNode value of fieldValueList field.
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ProtoInstanceObject clearFieldValue()
	{
		for (fieldValueObject element : fieldValueList)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		fieldValueList.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>fieldValueList</i>.
	 * @return whether a concrete statement array or CommentsBlock is available.
	 * @see #getFieldValueList()
	 */
	public boolean hasFieldValue()
	{
		return (fieldValueList.isEmpty() == false);
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setIS(ISObject newValue)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ProtoInstanceObject clearIS()
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ProtoInstanceObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ProtoInstanceObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ProtoInstanceObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide String value from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> name of the prototype node being instanced.
 * <ul>
 *  <li> <i>Hint:</i> must match name of corresponding ProtoDeclare or ExternProtoDeclare in this scene. </li> 
 *  <li> <i>Warning:</i> name must be specified unless this ProtoInstance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> name of the prototype node being instanced.
 * <ul>
 *  <li> <i>Hint:</i> must match name of corresponding ProtoDeclare or ExternProtoDeclare in this scene. </li> 
 *  <li> <i>Warning:</i> name must be specified unless this ProtoInstance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ProtoInstanceObject setName(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ProtoInstance name
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ProtoInstance name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("ProtoInstance name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ProtoInstanceObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ProtoInstance DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ProtoInstance DEF newValue='" + newValue + "'" + 
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ProtoInstanceObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ProtoInstance USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ProtoInstance USE newValue='" + newValue + "'" + 
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ProtoInstanceObject setCssClass(String newValue)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setCssClass(SFStringObject newValue)
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
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstanceObject setUSE(ProtoInstanceObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on ProtoInstanceObject" +
				" that has no DEF name defined, thus a copy cannot be referenced as a USE node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		setUSE(DEFnode.getDEF());
		return this;
	}
	/**
	 * Utility constructor that assigns ProtoInstanceObject name after initializing member variables with default values.
	 * @param prototypeName initial name for this ProtoInstanceObject statement
	 */
	public ProtoInstanceObject (String prototypeName)
	{
		initialize();
		setName(prototypeName); // apply checks
	}

	/**
	 * Utility constructor that assigns ProtoInstanceObject prototypeName and DEF after initializing member variables with default values.
	 * @param prototypeName initial name for this ProtoInstanceObject statement
	 * @param DEFlabel unique DEF name for this X3D node
	 */
	public ProtoInstanceObject (String prototypeName, String DEFlabel)
	{
		initialize();
		setName(prototypeName); // apply checks
		setDEF (DEFlabel);      // apply checks
	}

	/**
	 * Utility method that provides ProtoInstanceObject containerField value
	 * <i>Hint:</i> ProtoInstance containerField is important for determining parent-child node relationships.
	 * @see org.web3d.x3d.jsail.X3DConcreteNode#setContainerFieldOverride(String)
	 * @return containerField value
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ProtoInstance.containerField">X3D Tooltips: ProtoInstance.containerField</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 */
	public String getContainerField()
	{
		return getContainerFieldOverride();
	}

	/**
	 * Utility method that assigns ProtoInstanceObject containerField value
	 * <i>Hint:</i> ProtoInstance containerField is important for determining parent-child node relationships.
	 * @param containerFieldName overriding value
	 * @see org.web3d.x3d.jsail.X3DConcreteNode#setContainerFieldOverride(String)
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ProtoInstance.containerField">X3D Tooltips: ProtoInstance.containerField</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 */
	public ProtoInstanceObject setContainerField(String containerFieldName)
	{
		setContainerFieldOverride(containerFieldName);
		return this;
	}

	/**
	 * Utility method to find original ProtoInstance name if this ProtoInstance is a USE node (which does not include name).
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public String getOriginalName()
	{
		if (!getName().isEmpty())
		    return getName();

		String          originalName = getName();
		X3DConcreteNode originalProtoInstanceNode = null;
		if (originalName.isEmpty())
		{
            if (findAncestorSceneObject() != null)
                 originalProtoInstanceNode = findAncestorSceneObject().findNodeByDEF(getUSE());
         
			if (!ConfigurationProperties.isCreationConnectionValidationExceptionAllowed())
            {
                if (originalProtoInstanceNode == null)
                {
                    String errorNotice = ConfigurationProperties.ERROR_NODE_NOT_FOUND + 
                            ": unable to locate reference ProtoInstance DEF='" + getUSE() + "' for ProtoInstance USE='" + getUSE() + "'";
                    validationResult.append(errorNotice);
                    throw new InvalidProtoException(errorNotice); // report error
                }
                else if (!(originalProtoInstanceNode instanceof ProtoInstanceObject))
                {
                    String errorNotice = ConfigurationProperties.ERROR_NODE_NOT_FOUND + 
                            ": unable to locate correct node reference, ProtoInstance USE='" + getUSE() + "' mistakenly matches " + originalProtoInstanceNode.getClass() + " DEF='" + getUSE() + "'";
                    validationResult.append(errorNotice);
                    throw new InvalidProtoException(errorNotice); // report error
                }
                originalName = ((ProtoInstanceObject)originalProtoInstanceNode).getName();
			}
		}
		return originalName;
	}

	/**
	 * Determine whether a corresponding ProtoDeclare with same name is connected in this scene graph.
	 * @see #hasExternProtoDeclare
	 * @see #getProtoDeclare
	 * @see #getExternProtoDeclare
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public boolean hasProtoDeclare ()
	{
		// check for corresponding declaration
		if  (findAncestorSceneObject() == null)
			 return false;
		// ProtoInstance USE nodes don't include name, so utility method getOriginalName() helps here
		X3DConcreteElement matchingDeclaration = null;
        if (!getOriginalName().isEmpty())
             matchingDeclaration = findAncestorSceneObject().findElementByNameValue(getOriginalName(), ProtoDeclareObject.NAME); 
		if ((matchingDeclaration != null) && (matchingDeclaration instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject))
		{
			 referenceProtoDeclare = (ProtoDeclareObject) matchingDeclaration;
			 return true;
		}
		else return false;
	}
		 
	/**
	 * Determine whether a corresponding ExternProtoDeclare with same name is connected in this scene graph.
	 * @see #hasProtoDeclare
	 * @see #getProtoDeclare
	 * @see #getExternProtoDeclare
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public boolean hasExternProtoDeclare ()
	{
		// check for corresponding declaration
		if  (findAncestorSceneObject() == null)
			 return false;
		// ProtoInstance USE nodes don't include name, so utility method getOriginalName() helps here
		X3DConcreteElement matchingDeclaration = null;
        if  (!getOriginalName().isEmpty())
             matchingDeclaration = findAncestorSceneObject().findElementByNameValue(getOriginalName(), ExternProtoDeclareObject.NAME); 
		if ((matchingDeclaration != null) && (matchingDeclaration instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject))
		{
			 referenceExternProtoDeclare = (ExternProtoDeclareObject) matchingDeclaration;
			 return true;
		}
		else return false;
	}

	/**
	 * Provide corresponding ProtoDeclare with same name if connected in this scene graph.
	 * @see #hasProtoDeclare
	 * @see #hasExternProtoDeclare
	 * @see #getExternProtoDeclare
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoDeclareObject getProtoDeclare ()
	{
		if  (hasProtoDeclare())
			 return referenceProtoDeclare;
		else return null;
	}
	/**
	 * Provide corresponding ExternProtoDeclare with same name if connected in this scene graph.
	 * @see #hasProtoDeclare
	 * @see #hasExternProtoDeclare
	 * @see #getProtoDeclare
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ExternProtoDeclareObject getExternProtoDeclare ()
	{
		if  (hasExternProtoDeclare())
			 return referenceExternProtoDeclare;
		else return null;
	}

	/**
	 * This method helps determine node type of ProtoInstance by inspecting first node within corresponding ProtoDeclare ProtoBody.
	 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics">X3D Abstract Specification: 4.4.4.3 PROTO definition semantics</a>
	 * @see ProtoDeclareObject#getNodeType()
	 * @see ProtoBodyObject#getNodeType()
	 * @see ExternProtoDeclareObject#getNodeType()
	 * @see SceneObject
		 
	 * @return name of X3D node corresponding to node type for this ProtoInstanceObject statement
	 */
	public String getNodeType()
	{
		// check for corresponding declaration
		String errorNotice = new String();
		if (findAncestorSceneObject() == null)
		{
			if (!ConfigurationProperties.isCreationConnectionValidationExceptionAllowed())
			{
				errorNotice = ConfigurationProperties.ERROR_UNKNOWN_PROTOINSTANCE_NODE_TYPE + ": " +
							   "ProtoInstance name='" + getOriginalName() + "' must first be connected to SceneObject scene graph in order to get checked.";
				validationResult.append(errorNotice).append("\n");
				return ConfigurationProperties.ERROR_NOT_CONNECTED_TO_SCENE_GRAPH + "_PrototypeNotFound"; // node type not found
			}
			else return errorNotice;
		}
		// ProtoInstance USE nodes don't include name, so utility method getOriginalName() helps here
		X3DConcreteElement matchingDeclaration = null;
		if ((findAncestorSceneObject() != null) && !getOriginalName().isEmpty())
        {
            // first try ProtoDeclareObject
			matchingDeclaration = findAncestorSceneObject().findElementByNameValue(getOriginalName(), ProtoDeclareObject.NAME); 
            if ((matchingDeclaration != null) && (matchingDeclaration instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject))
            {
                if (getContainerFieldOverride().isEmpty()) // fall back to use ProtoDeclare default value since actual value not provided in source model
                {
					String computedContainerField = ((ProtoDeclareObject) matchingDeclaration).getContainerFieldDefault();
                    setContainerFieldOverride(computedContainerField);

                    if (!computedContainerField.equals(ProtoInstanceObject.containerField_DEFAULT_VALUE))
					{
						String warningNotice = ConfigurationProperties.WARNING_MESSAGE + ": " + 
							"ProtoInstance name='" + getOriginalName() + "' DEF='" + getDEF() + "' USE='" + getUSE() + 
							"' is missing containerField relationship to parent node, assuming " +
							"containerField='" + getContainerFieldOverride() + "' from initial node in corresponding ProtoDeclare. " +
							"Need to fix ProtoInstance definition in model source.";
						validationResult.append(warningNotice).append("\n");
						System.out.println(warningNotice);
					}
                }
                return ((ProtoDeclareObject) matchingDeclaration).getNodeType();
            }
            // next try ExternProtoDeclareObject
            matchingDeclaration = findAncestorSceneObject().findElementByNameValue(getOriginalName(), ExternProtoDeclareObject.NAME);
            if ((matchingDeclaration != null) && (matchingDeclaration instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject))
            {
                // no way to determine default containerField
                return ((ExternProtoDeclareObject) matchingDeclaration).getNodeType();
            }
        }
        if  (ConfigurationProperties.isCreationConnectionValidationExceptionAllowed())
             return "";
        else
        {
            errorNotice = ConfigurationProperties.ERROR_UNKNOWN_PROTOINSTANCE_NODE_TYPE + ": ";
            if  (isUSE())
                 errorNotice += "ProtoInstance USE='" + getUSE();
            else errorNotice += "ProtoInstance name='" + getName();
            errorNotice += "' has no corresponding ProtoDeclare or ExternProtoDeclare to provide type.";
            validationResult.append(errorNotice).append("\n");
            return errorNotice; // node type not found
        }
        

	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public ProtoInstanceObject addComments (String newComment)
	{
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ProtoInstanceObject addComments (String[] newComments)
	{
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ProtoInstanceObject addComments (CommentsBlock newCommentsBlock)
	{
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
		boolean      hasChild = (IS != null) || (!fieldValueList.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<ProtoInstance"); // start opening tag
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
			
			// note special case for ProtoInstance, do not include name field if USE is present
			if (!getName().equals(NAME_DEFAULT_VALUE) && !isUSE())
			{
				stringX3D.append(" name='").append(SFStringObject.toString(getName())).append("'");
			}
			
            // containerField is critical for ProtoInstance relationship to parent node
            if (!getContainerFieldOverride().isEmpty() && !getContainerFieldOverride().equals(this.getContainerFieldDefault())) // output if not default ProtoInstance containerField
            {
                    stringX3D.append(" containerField='").append(getContainerFieldOverride()).append("'");
            }

            // test attributes

			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
		}
		if ((hasChild)) // has contained node(s), comment(s), IS/connect and/or source code
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
			for (fieldValueObject element : fieldValueList)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</ProtoInstance>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=ProtoInstance, isX3dStatement=true, isClassX3dStatement=true, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (!fieldValueList.isEmpty()) || (!fieldValueList.isEmpty()) || (!fieldValueList.isEmpty()) || (IS != null) || (!fieldValueList.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
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
			if (getName().isEmpty())
				 stringClassicVRML.append("NoNameFoundError");
			else stringClassicVRML.append(getName());
			stringClassicVRML.append(" { "); // define ProtoInstance node name, fieldValue content follows

			if (hasAttributes)
			{
				if (!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("# class ").append("\"").append(SFStringObject.toString(getCssClass())).append("\"").append("\n");
				}
				if (!getName().equals(NAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("name ").append("\"").append(SFStringObject.toString(getName())).append("\"").append("\n");
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
			for (fieldValueObject element : fieldValueList)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel));
			}
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
			}
		}
		stringClassicVRML.append(indent).append("}").append("\n"); // finish closing tag
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
		if (elementName == null)
			elementName = "";
		if (getName().equals(nameValue) &&
			(elementName.isEmpty() || elementName.equals(getElementName())))
			return this;
		X3DConcreteElement referenceElement;
		for (fieldValueObject element : fieldValueList)
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if ((referenceElement != null))
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

        getNodeType(); // initialize ProtoInstance containerField, if missing and available in corresponding ProtoDeclare

		setName(getName()); // exercise field checks, simple types
        
        if (getName().isEmpty() && !isUSE())
        {
			String errorNotice = "ProtoInstance missing name field, which is usually required (since this ProtoInstance is not a USE node).";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
        }
		if (!getName().isEmpty() && isUSE())
        {
			String errorNotice = "ProtoInstance has name field, which is not included in a ProtoInstance USE node.";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
        }
		String originalName = getOriginalName(); // call once here, for efficiency and also to allow separate changes

		// check for presence of corresponding ProtoDeclare/ExternProtoDeclare having same name, report if missing
		if (ConfigurationProperties.isDebugModeActive() && hasProtoDeclare())
		{
			if  (isUSE())
			     validationResult.append("ProtoInstance ").append(originalName).append(" USE='").append(getUSE()).append("' has corresponding ProtoDeclare").append("\n");
			else validationResult.append("ProtoInstance ").append(getName())   .append(" DEF='").append(getDEF()).append("' has corresponding ProtoDeclare").append("\n");
		}
		else if (ConfigurationProperties.isDebugModeActive() && hasExternProtoDeclare())
		{
			if  (isUSE())
			     validationResult.append("ProtoInstance ").append(originalName).append(" USE='").append(getUSE()).append("' has corresponding ExternProtoDeclare (but node type is unconfirmed)").append("\n");
			else validationResult.append("ProtoInstance ").append(getName())   .append(" DEF='").append(getDEF()).append("' has corresponding ExternProtoDeclare (but node type is unconfirmed)").append("\n");
		}
		else if (hasProtoDeclare() && hasExternProtoDeclare())
		{
			String errorNotice = ConfigurationProperties.ERROR_UNKNOWN_PROTOINSTANCE_NODE_TYPE +
					"ProtoInstance " + getName() + " has both corresponding ProtoDeclare and ExternProtoDeclare";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
        }
		if (getNodeType().startsWith(ConfigurationProperties.ERROR_UNKNOWN_PROTOINSTANCE_NODE_TYPE))
        {
			String errorNotice = getNodeType();
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
        }
		if (getNodeType().startsWith(ConfigurationProperties.ERROR_UNKNOWN_PROTOINSTANCE_NODE_TYPE))
        {
			String errorNotice = getNodeType();
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
        }
		// TODO check for legal containerField among allowed getContainerFieldAlternateValues() for given nodeType

		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		for (fieldValueObject element : fieldValueList) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setFieldValueList(getFieldValueList()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasFieldValue()) // test USE restrictions
		{
			String errorNotice = "ProtoInstance USE='" + getUSE() + "' is not allowed to have contained MFNode fieldValue";
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
			String errorNotice = "ProtoInstance USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ProtoInstance USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (metadata != null)
		{
			setMetadata(getMetadata());
			((X3DConcreteElement) metadata).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadata).getValidationResult());
		}
		if (isUSE() && hasMetadata()) // test USE restrictions
		{
			String errorNotice = "ProtoInstance USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ProtoInstance USE='" + getUSE() + "' is not allowed to have contained comments";
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
		return validationResult.toString();
	}

	/**
	 * Add fieldValue
	 * @param newFieldValue is fieldValue to add
	 * @return {@link ProtoInstanceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ProtoInstanceObject addFieldValue (fieldValueObject newFieldValue)
	{
		String errorNotice = "Illegal addFieldValue() invocation for ProtoInstanceObject name='" + getName() +
					"' fieldValue name='" + newFieldValue.getName() + "', ";
        if (newFieldValue == null)
        {
            errorNotice += "provided null fieldValueObject";
            validationResult.append(errorNotice).append("\n");
            throw new InvalidFieldException(errorNotice);
        }
		for (fieldValueObject priorFieldValue : fieldValueList) // check for field with duplicate name
		{
			if (priorFieldValue.getName().equals(newFieldValue.getName()))
			{
				errorNotice += "trying to add fieldValue with duplicate name='" + newFieldValue.getName() + "'";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldValueException(errorNotice);
			}
		}
		String fieldValueValidationResult = newFieldValue.validate();
		if (!ConfigurationProperties.isCreationConnectionValidationExceptionAllowed() &&
			!fieldValueValidationResult.trim().isEmpty())
		{
			errorNotice += "newFieldValue.validation() failure:\n   " + fieldValueValidationResult;
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldException(errorNotice);
		}
		fieldValueList.add(newFieldValue);
		newFieldValue.setParentObject(this);
		return this;
	}
	
	/**
	 * Find contained fieldValue statement by name, if present.
	 * @param fieldValueName is name attribute for fieldValue of interest
	 * @return fieldValueObject reference of interest, null otherwise
	 */
	public fieldValueObject findFieldValueByName (String fieldValueName)
	{
		for (fieldValueObject element : fieldValueList)
		{
			 if (element.getName().equalsIgnoreCase(fieldValueName))
				 return element;
		}
		return null;
	}
	/**
	 * Remove a fieldValue from contained fieldValueList
	 * @param fieldValueToRemove matching fieldValue of interest
	 * @see #removeFieldValue(String)
	 * @return whether fieldValue was removed
	 */
	public boolean removeFieldValue (fieldValueObject fieldValueToRemove)
	{
		String errorNotice = "Illegal removeFieldValue() invocation for ProtoInstanceObject DEF='" + getDEF() + "', ";
        if (fieldValueToRemove == null)
        {
            errorNotice += "provided null fieldValueObject";
            validationResult.append(errorNotice).append("\n");
            throw new InvalidFieldException(errorNotice);
        }
		int  fieldValueIndex = fieldValueList.indexOf(fieldValueToRemove);
		if  (fieldValueIndex >= 0)
		{
			 fieldValueObject removedfieldValue = fieldValueList.remove(fieldValueIndex);
			 return (removedfieldValue != null);
		}
		else return false;
	}
	/**
	 * Remove a fieldValue by name from contained fieldValueList
	 * @param fieldValueName matching fieldValue of interest
	 * @see #removeFieldValue(fieldValueObject)
	 * @return whether fieldValue was removed
	 */
	public boolean removeFieldValue (String fieldValueName)
	{
		String errorNotice = "Illegal removeFieldValue() invocation for ProtoInstanceObject DEF='" + getDEF() + "', ";
        if ((fieldValueName == null) || fieldValueName.isEmpty())
        {
            errorNotice += "provided null or empty fieldValueName string";
            validationResult.append(errorNotice).append("\n");
            throw new InvalidFieldException(errorNotice);
        }
		fieldValueObject fieldValueToRemove = findFieldValueByName (fieldValueName);
		if (fieldValueToRemove != null)
			return removeFieldValue (fieldValueToRemove);
		else return false;
	}
	/**
	 * Clear all fieldValues
	 */
	public void clearFieldValues ()
	{
		fieldValueList.clear();
	}
	/**
	 * Determine if fieldValue statement is present.
	 * @param fieldValueName is name attribute for fieldValue of interest
	 * @return whether fieldValue is found
	 */
	public boolean hasFieldValue (String fieldValueName)
	{
		return (findFieldValueByName(fieldValueName) != null);
	}
}
