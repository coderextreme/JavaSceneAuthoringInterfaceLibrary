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

package org.web3d.x3d.sai.Picking;
import org.web3d.x3d.sai.Core.X3DSensorNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Rendering.*;
import java.util.Arrays;

/**
 * The X3DPickSensorNode abstract node type is the base node type that represents the lowest common denominator of picking capabilities.
 * 
 * <br><br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/abstracts.html#X3DPickSensorNode" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#X3DPickSensorNode" target="blank">X3D Abstract Specification: TODO</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html" target="_blank">X3D Tooltips</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface X3DPickSensorNode extends X3DSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * @param newValue is new value for the enabled field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setEnabled(boolean newValue);

	/**
	 * Provide String enumeration value (baseType intersectionTypeValues) ["BOUNDS" | "GEOMETRY" | 'etc.'] from initializeOnly SFString field named <i>intersectionType</i>.
	 * @return value of intersectionType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getIntersectionType();

	/**
	 * Accessor method to assign String enumeration value ("BOUNDS" | "GEOMETRY") to initializeOnly SFString field named <i>intersectionType</i>.
	 * @param newValue is new value for the intersectionType field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setIntersectionType(String newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getIsActive();
	/**
	 * Provide String enumeration value (baseType pickSensorMatchCriterionChoices) ["MATCH_ANY" | "MATCH_EVERY" | "MATCH_ONLY_ONE"] from inputOutput SFString field named <i>matchCriterion</i>.
	 * @return value of matchCriterion field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getMatchCriterion();

	/**
	 * Accessor method to assign String enumeration value ("MATCH_ANY" | "MATCH_EVERY" | "MATCH_ONLY_ONE") to inputOutput SFString field named <i>matchCriterion</i>.
	 * @param newValue is new value for the matchCriterion field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setMatchCriterion(String newValue);

	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata(); // acceptable node types #1: X3DMetadataObject

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public X3DPickSensorNode setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String enumeration results with quoted value(s) ["ALL","NONE","TERRAIN",...] from inputOutput MFString field named <i>objectType</i>.
	 * @return value of objectType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String[] getObjectType();

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"" | ""TERRAIN"") to inputOutput MFString field named <i>objectType</i>.
	 * @param newValue is new value for the objectType field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setObjectType(String[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from outputOnly MFNode field <i>pickedGeometry</i>.
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of pickedGeometry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DNode[] getPickedGeometry(); // acceptable node types #1: X3DChildNode
	/**
	 * Provide X3DGeometryNode instance (using a properly typed node) from inputOutput SFNode field <i>pickingGeometry</i>.
	 * @return value of pickingGeometry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DGeometryNode getPickingGeometry(); // acceptable node types #1: X3DGeometryNode

	/**
	 * Accessor method to assign X3DGeometryNode instance (using a properly typed node) to inputOutput SFNode field <i>pickingGeometry</i>.
	 * @param newValue is new value for the pickingGeometry field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setPickingGeometry(X3DGeometryNode newValue); // acceptable node types #2: X3DGeometryNode

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to X3DGroupingNode|X3DShapeNode|Inline, from inputOutput MFNode field <i>pickTarget</i>.
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @see org.web3d.x3d.sai.Grouping.X3DGroupingNode
	 * @see org.web3d.x3d.sai.Shape.X3DShapeNode
	 * @see org.web3d.x3d.jsail.Networking.InlineObject
	 * @return value of pickTarget field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DNode[] getPickTarget(); // acceptable node types #1: X3DGroupingNode|X3DShapeNode|Inline

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>pickTarget</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Grouping.X3DGroupingNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Shape.X3DShapeNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new value for the pickTarget field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setPickTarget(X3DNode[] newValue); // acceptable node types #2: X3DGroupingNode|X3DShapeNode|Inline

	/**
	 * Add array of child pickTarget nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new value array to be appended the pickTarget field.
	 */
	public void addPickTarget(X3DNode[] newValue); // acceptable node types #3: X3DGroupingNode|X3DShapeNode|Inline
	/**
	 * Set single child pickTarget node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the pickTarget field
	 */
	public void setPickTarget(X3DNode newValue); // acceptable node types #5: X3DGroupingNode|X3DShapeNode|Inline
	/**
	 * Provide String enumeration value (baseType pickSensorSortOrderValues) ["ANY" | "CLOSEST" | "ALL" | "ALL_SORTED" | 'etc.'] from initializeOnly SFString field named <i>sortOrder</i>.
	 * @return value of sortOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getSortOrder();

	/**
	 * Accessor method to assign String enumeration value ("ANY" | "CLOSEST" | "ALL" | "ALL_SORTED") to initializeOnly SFString field named <i>sortOrder</i>.
	 * @param newValue is new value for the sortOrder field.
	 * @return {@link X3DPickSensorNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DPickSensorNode setSortOrder(String newValue);

}
