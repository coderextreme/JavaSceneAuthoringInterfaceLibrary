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
import org.web3d.x3d.jsail.*; // again making sure #2

import java.util.Arrays;
import org.web3d.x3d.sai.Core.*;  // making sure #3
import org.web3d.x3d.jsail.*;
import org.web3d.x3d.jsail.Core.*;

import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import java.util.Arrays;

/**
 * Functional summary: each X3D scene includes a head statement that can contain component, unit and meta statements. This concrete class represents an X3D head statement.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] head can contain component, unit, and author-defined meta (metadata) elements.
 * <ul>
 *  <li> <i>Hint:</i> design for this element is patterned after the &amp;lt;head&amp;gt; tag in HTML: <a href="https://www.w3.org/TR/html5/document-metadata.html#the-head-element" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#the-head-element</a> </li> 
 *  <li> <i>Warning:</i> head is optional first child of X3D statement, and must precede the Scene statement. </li> 
 *  <li> <i>Warning:</i>  in order to pass XML validation, these contained optional statements must appear in order: first component statements, then unit statements, then meta statements. </li> 
 * </ul>
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Header" target="blank">X3D Abstract Specification: head</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#head" target="_blank">X3D Tooltips: head</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class headObject extends org.web3d.x3d.jsail.X3DConcreteStatement
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=component, @type=MFNode, $javaType=ArrayList<componentObject>, $javaReferenceType=componentObject, $javaPrimitiveType=ArrayList<componentObject>, $normalizedMemberObjectName=componentList, $isX3dStatement=true, @acceptableNodeTypes=component */ 
	private ArrayList<componentObject> componentList = new ArrayList<>(); // MFNode acceptable node types: component or ProtoInstanceObject

 /* @name=meta, @type=MFNode, $javaType=ArrayList<metaObject>, $javaReferenceType=metaObject, $javaPrimitiveType=ArrayList<metaObject>, $normalizedMemberObjectName=metaList, $isX3dStatement=true, @acceptableNodeTypes=meta */ 
	private ArrayList<metaObject> metaList = new ArrayList<>(); // MFNode acceptable node types: meta or ProtoInstanceObject

 /* @name=unit, @type=MFNode, $javaType=ArrayList<unitObject>, $javaReferenceType=unitObject, $javaPrimitiveType=ArrayList<unitObject>, $normalizedMemberObjectName=unitList, $isX3dStatement=true, @acceptableNodeTypes=unit */ 
	private ArrayList<unitObject> unitList = new ArrayList<>(); // MFNode acceptable node types: unit or ProtoInstanceObject

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>head</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "head";

	/** Provides name of this element: <i>head</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>head</i> element: <i>Core</i> */
	public static final String COMPONENT = "Core";

	/** Defines X3D component for the <i>head</i> element: <i>Core</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Core</i> component level for this element: <i>1</i> */
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
			case "component":
				result = "MFNode";
				break;
			case "meta":
				result = "MFNode";
				break;
			case "unit":
				result = "MFNode";
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
			case "component":
				result = "inputOutput";
				break;
			case "meta":
				result = "inputOutput";
				break;
			case "unit":
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

	/** Constructor for headObject to initialize member variables with default values. */
	public headObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		componentList = new ArrayList<>();
		metaList = new ArrayList<>();
		unitList = new ArrayList<>();

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of componentObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>component</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Add component statements to indicate necessary scene functionality above the given profile for this X3D model.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to component.
	 * @see org.web3d.x3d.jsail.Core.componentObject
	 * @return value of component field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public ArrayList<componentObject> getComponentList()
	{
		return componentList;
	}

	/**
	 * Accessor method to assign componentObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>component</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Add component statements to indicate necessary scene functionality above the given profile for this X3D model.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to component.
	 * @param newValue is new value for the component field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject setComponentList(ArrayList<componentObject> newValue)
	{
		// set-newValue-validity-checks #0
		componentList = newValue;
		for (componentObject arrayElement : componentList)
		{
			((X3DConcreteElement) arrayElement).setParentObject(this); // parentTest11
		}
		return this;
	}

	/**
	 * Add array of child component nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to component.
	 * @param newValue is new value array to be appended the component field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject addComponent(componentObject /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearComponent(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		componentList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest5
		return this;
	}

	/**
	 * Set single child component node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to component.
	 * @param newValue is new node for the component field (restricted to component)
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject setComponent(componentObject /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearComponent(); // reset newValueNullClearsFieldReturnThis
			return this;
		}
		for (componentObject element : componentList) // 
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		clearComponent(); // reset
		componentList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest7

		return this;
}
	/**
	 * Utility method to clear MFNode value of componentList field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public headObject clearComponent()
	{
		for (componentObject element : componentList)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		componentList.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>componentList</i>.
	 * @return whether a concrete statement array or CommentsBlock is available.
	 * @see #getComponentList()
	 */
	public boolean hasComponent()
	{
		return (componentList.isEmpty() == false);
	}
	/**
	 * Provide array of metaObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>meta</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Add meta statements to provide metadata information about this X3D model.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to meta.
	 * @see org.web3d.x3d.jsail.Core.metaObject
	 * @return value of meta field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public ArrayList<metaObject> getMetaList()
	{
		return metaList;
	}

	/**
	 * Accessor method to assign metaObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>meta</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Add meta statements to provide metadata information about this X3D model.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to meta.
	 * @param newValue is new value for the meta field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject setMetaList(ArrayList<metaObject> newValue)
	{
		// set-newValue-validity-checks #0
		metaList = newValue;
		for (metaObject arrayElement : metaList)
		{
			((X3DConcreteElement) arrayElement).setParentObject(this); // parentTest11
		}
		return this;
	}

	/**
	 * Add array of child meta nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to meta.
	 * @param newValue is new value array to be appended the meta field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject addMeta(metaObject /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearMeta(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		metaList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest5
		return this;
	}

	/**
	 * Set single child meta node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to meta.
	 * @param newValue is new node for the meta field (restricted to meta)
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject setMeta(metaObject /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearMeta(); // reset newValueNullClearsFieldReturnThis
			return this;
		}
		for (metaObject element : metaList) // 
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		clearMeta(); // reset
		metaList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest7

		return this;
}
	/**
	 * Utility method to clear MFNode value of metaList field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public headObject clearMeta()
	{
		for (metaObject element : metaList)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		metaList.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>metaList</i>.
	 * @return whether a concrete statement array or CommentsBlock is available.
	 * @see #getMetaList()
	 */
	public boolean hasMeta()
	{
		return (metaList.isEmpty() == false);
	}
	/**
	 * Provide array of unitObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>unit</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Add unit statements to define data-conversion factors for typed values defined within a scene.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to unit.
	 * @see org.web3d.x3d.jsail.Core.unitObject
	 * @return value of unit field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public ArrayList<unitObject> getUnitList()
	{
		return unitList;
	}

	/**
	 * Accessor method to assign unitObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>unit</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Add unit statements to define data-conversion factors for typed values defined within a scene.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to unit.
	 * @param newValue is new value for the unit field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject setUnitList(ArrayList<unitObject> newValue)
	{
		// set-newValue-validity-checks #0
		unitList = newValue;
		for (unitObject arrayElement : unitList)
		{
			((X3DConcreteElement) arrayElement).setParentObject(this); // parentTest11
		}
		return this;
	}

	/**
	 * Add array of child unit nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to unit.
	 * @param newValue is new value array to be appended the unit field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject addUnit(unitObject /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearUnit(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		unitList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest5
		return this;
	}

	/**
	 * Set single child unit node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to unit.
	 * @param newValue is new node for the unit field (restricted to unit)
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public headObject setUnit(unitObject /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearUnit(); // reset newValueNullClearsFieldReturnThis
			return this;
		}
		for (unitObject element : unitList) // 
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		clearUnit(); // reset
		unitList.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest7

		return this;
}
	/**
	 * Utility method to clear MFNode value of unitList field.
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public headObject clearUnit()
	{
		for (unitObject element : unitList)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		unitList.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>unitList</i>.
	 * @return whether a concrete statement array or CommentsBlock is available.
	 * @see #getUnitList()
	 */
	public boolean hasUnit()
	{
		return (unitList.isEmpty() == false);
	}

	// Additional utility methods for this class ==============================

	/**
	 * Add a child <i>component</i> statement.
     * @param componentName name for component statement
     * @param level for component statement
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#component">X3D Tooltips: component</a>
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	public headObject addComponent (String componentName, int level)
	{
        return addComponent(new componentObject(componentName, level));
	}
	/**
	 * Add a child <i>unit</i> statement.
	 * @param newName name for this unit statement
	 * @param newCategory category value for this unit statement
	 * @param newConversionFactor conversion factor for this unit statement
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#unit">X3D Tooltips: unit statement</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scale" target="_blank">X3D Scene Authoring Hints: Scale Factors and Unit Conversions </a>
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	public headObject addUnit (String newName, String newCategory, float newConversionFactor)
	{
        return addUnit(new unitObject(newName, newCategory, newConversionFactor));
	}
	/**
	 * Add a child <i>unit</i> statement.
	 * @param newName name for this unit statement
	 * @param newCategory category value for this unit statement
	 * @param newConversionFactor conversion factor for this unit statement
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#unit">X3D Tooltips: unit statement</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scale" target="_blank">X3D Scene Authoring Hints: Scale Factors and Unit Conversions </a>
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	public headObject addUnit (String newName, String newCategory, double newConversionFactor)
	{
        return addUnit(new unitObject(newName, newCategory, newConversionFactor));
	}
	/**
	 * Add a child <i>meta</i> statement.
     * @param newName name for meta statement
     * @param newDescription description for meta statement
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#meta">X3D Tooltips: meta statement</a>
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	public headObject addMeta (String newName, String newDescription)
	{
        return addMeta(new metaObject(newName, newDescription));
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public headObject addComments (String newComment)
	{
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public headObject addComments (String[] newComments)
	{
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link headObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public headObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (!componentList.isEmpty()) || (!metaList.isEmpty()) || (!unitList.isEmpty()) || !commentsList.isEmpty();

		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<head"); // start opening tag
		if (hasAttributes)
		{
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
			for (componentObject element : componentList)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			for (unitObject element : unitList)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			// note required order of component, unit, meta (though relaxation of this requirement has been proposed)
			for (metaObject element : metaList)
				 stringX3D.append(element.toStringX3D(indentLevel + indentIncrement));

			stringX3D.append(indent).append("</head>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=head, isX3dStatement=true, isClassX3dStatement=true, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (!componentList.isEmpty()) || (!metaList.isEmpty()) || (!unitList.isEmpty()) || !commentsList.isEmpty();
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		stringClassicVRML.append("# head").append("\n");
			if (hasAttributes)
			{
			}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child elements
			for (componentObject element : componentList)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel));
			}
			for (unitObject element : unitList)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel));
			}
			// note required order of component, unit, meta (though relaxation of this requirement has been proposed)
			for (metaObject element : metaList)
			{
				 stringClassicVRML.append(element.toStringClassicVRML(indentLevel));
			}

			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
			}
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
		X3DConcreteNode referenceNode;
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

		for (componentObject element : componentList) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setComponentList(getComponentList()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

        if (!hasMeta()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D head has no meta elements and thus is undescribed" + "\n");
		}
		for (metaObject element : metaList) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setMetaList(getMetaList()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

        if (!hasMeta()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D head has no meta elements and thus is undescribed" + "\n");
		}
		for (unitObject element : unitList) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setUnitList(getUnitList()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

        if (!hasMeta()) // special warning
		{
            validationResult.append(ConfigurationProperties.ERROR_NODE_NOT_FOUND + ": X3D head has no meta elements and thus is undescribed" + "\n");
		}
        // check for redundant component tag
        int index = 0;
		for (componentObject componentStatement : componentList)
		{
            for (int j = 0; j < index; j++)
            {
                if (componentStatement.getName().equalsIgnoreCase(componentList.get(j).getName()))
                {
                    validationResult.append("Redundant statements found, same category:\n  ").append(componentStatement.toStringX3D()).append(" and\n  ")
                        .append(componentList.get(j).toStringX3D());
                }
            }
            index++; // proceed to next, only checking in reverse
        }  
        // check for redundant unit tag
        index = 0;
		for (unitObject unitStatement : unitList)
		{
            for (int j = 0; j < index; j++)
            {
                if (unitStatement.getCategory().equalsIgnoreCase(unitList.get(j).getCategory()))
                {
                    validationResult.append("Redundant statements found: ").append(unitStatement.toStringX3D()).append(" and ")
                        .append(unitList.get(j).toStringX3D());
                }
            }
            index++; // proceed to next, only checking in reverse
        }
        // check for duplicate meta tag
        index = -1; // list indices are zero-based
		for (metaObject metaStatement : metaList)
		{
            for (int j = 0; j < index; j++)
            {
                if (metaStatement.getName()   .equalsIgnoreCase(metaList.get(j).getName()) &&
                    metaStatement.getContent().equalsIgnoreCase(metaList.get(j).getContent()))
                {
                    validationResult.append(ConfigurationProperties.WARNING_MESSAGE)
                        .append(": duplicate statement found: <meta name='").append(metaStatement.getName())
                        .append("' content='").append(metaStatement.getContent()).append("'/>\n");
                }
                // singleton meta tags
                else if ( metaStatement.getName().equalsIgnoreCase(metaList.get(j).getName()) &&
                         (metaStatement.getName().equalsIgnoreCase(metaObject.NAME_DESCRIPTION) ||
                          metaStatement.getName().equalsIgnoreCase(metaObject.NAME_CREATED)     ||
                          metaStatement.getName().equalsIgnoreCase(metaObject.NAME_MODIFIED)    ||
                          metaStatement.getName().equalsIgnoreCase(metaObject.NAME_IDENTIFIER)    ||
                          metaStatement.getName().equalsIgnoreCase(metaObject.NAME_TITLE)    ||
                          metaStatement.getName().equalsIgnoreCase(metaObject.NAME_SUBJECT)))
                {
                    validationResult.append("Duplicate found: <meta name='").append(metaStatement.getName()).append("'/>\n");
                }
            }
            index++; // proceed to next, only checking in reverse
		}

		return validationResult.toString();
	}

	/**
	 * Find contained meta statement by name, if present.
	 * @param metaName is NMTOKEN name attribute for meta statement of interest
	 * @return metaObject reference of interest, null otherwise
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#meta">X3D Tooltips: meta statement</a>
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#NMTOKEN">X3D Tooltips: type NMTOKEN</a>
	 */
	public metaObject findMetaByName (String metaName)
	{
		for (metaObject element : metaList)
		{
			 if (element.getName().equalsIgnoreCase(metaName))
				 return element;
		}
		return null;
	}
	/**
	 * Determine whether relevant meta statement is present.
	 * @param metaName is name attribute for meta statement of interest
	 * @return whether meta is found.
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#meta">X3D Tooltips: meta statement</a>
	 */
	public boolean hasMeta (String metaName)
	{
		return (findMetaByName(metaName) != null);
	}
									
	/**
	 * Find contained component statement by name, if present.
	 * @param componentName name for component statement
	 * @return componentObject reference of interest, null otherwise
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#component">X3D Tooltips: component</a>
	 */
	public componentObject findComponentByName (String componentName)
	{
		for (componentObject element : componentList)
		{
			 if (element.getName().equalsIgnoreCase(componentName))
				 return element;
		}
		return null;
	}
	/**
	 * Determine whether relevant component statement is present.
	 * @param componentName name for component statement
	 * @return whether component is found.
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#component">X3D Tooltips: component</a>
	 */
	public boolean hasComponent (String componentName)
	{
		return (findComponentByName(componentName) != null);
	}
									
	/**
	 * Find contained unit statement by name, if present.
	 * @param unitName is name attribute for unit statement of interest
	 * @return unitObject reference of interest, null otherwise
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#unit">X3D Tooltips: unit</a>
	 */
	public unitObject findUnitByName (String unitName)
	{
		for (unitObject element : unitList)
		{
			 if (element.getName().equalsIgnoreCase(unitName))
				 return element;
		}
		return null;
	}
	/**
	 * Determine whether relevant unit statement is present.
	 * @param unitName is name attribute for unit statement of interest
	 * @return whether unit is found.
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#unit">X3D Tooltips: unit</a>
	 */
	public boolean hasUnit (String unitName)
	{
		return (findUnitByName(unitName) != null);
	}
}
