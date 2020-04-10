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

import org.web3d.x3d.sai.Grouping.X3DGroupingNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * PickableGroup is a Grouping node that can contain most nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DGroupingNode,X3DPickableObject] PickableGroup is a Grouping node that can contain most nodes. PickableGroup contains children that are marked as having a given classification of picking types, and can also enable or disable picking of the children.
 * <ul>
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. </li> 
 *  <li> <i>Hint:</i>  content must be visible to be pickable. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#PickableGroup" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#PickableGroup" target="blank">X3D Abstract Specification: PickableGroup</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PickableGroup" target="_blank">X3D Tooltips: PickableGroup</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface PickableGroup extends X3DGroupingNode, X3DPickableObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box center accompanies bboxSize and provides an optional hint for bounding box position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @return value of bboxCenter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	@Override
	public float[] getBboxCenter();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box center accompanies bboxSize and provides an optional hint for bounding box position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PickableGroup setBboxCenter(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of [0,infinity), or default value [-1 -1 -1], from initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box size is usually omitted, and can easily be calculated automatically by an X3D player at scene-loading time with minimal computational cost. Bounding box size can also be defined as an optional authoring hint that suggests an optimization or constraint.
 * <ul>
 *  <li> <i>Hint:</i> can be useful for collision computations or inverse-kinematics (IK) engines. </li> 
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @return value of bboxSize field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	@Override
	public float[] getBboxSize();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box size is usually omitted, and can easily be calculated automatically by an X3D player at scene-loading time with minimal computational cost. Bounding box size can also be defined as an optional authoring hint that suggests an optimization or constraint.
 * <ul>
 *  <li> <i>Hint:</i> can be useful for collision computations or inverse-kinematics (IK) engines. </li> 
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PickableGroup setBboxSize(float[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of children field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	@Override
	public X3DNode[] getChildren(); // acceptable node types #1: X3DChildNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value for the children field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PickableGroup setChildren(X3DNode[] newValue); // acceptable node types #2: X3DChildNode

	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value array to be appended the children field.
	 */
	@Override // or here2?
	public void addChildren(X3DNode[] newValue); // acceptable node types #3: X3DChildNode
	/**
	 * Set single children node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the children field
	 */
	public void setChildren(X3DNode newValue); // acceptable node types #5: X3DChildNode
	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	@Override
	public X3DMetadataObject getMetadata(); // acceptable node types #1: X3DMetadataObject

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PickableGroup setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String enumeration results with quoted value(s) ["ALL","NONE","TERRAIN",...] from inputOutput MFString field named <i>objectType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The objectType field specifies a set of labels used in the picking process. Each string specified is treated as an independent label that needs to be matched against the same type in one of the pick sensor instances. Example: labeling a PickableGroup with the objectType value "WATER" and then attempting to intersect a pick sensor with objectType value "GROUND" fails since the objectType values do not match. Example: the special value "ALL" means that each node is available for picking regardless of the type specified by the pick sensor. Example: the special value "NONE" effectively disables all picking for this node and is the equivalent of setting the pickable field to false.
 * <ul>
 *  <li> <i>Hint:</i> authors may define any value for objectType. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @return value of objectType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	public String[] getObjectType();

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"" | ""TERRAIN"") to inputOutput MFString field named <i>objectType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The objectType field specifies a set of labels used in the picking process. Each string specified is treated as an independent label that needs to be matched against the same type in one of the pick sensor instances. Example: labeling a PickableGroup with the objectType value "WATER" and then attempting to intersect a pick sensor with objectType value "GROUND" fails since the objectType values do not match. Example: the special value "ALL" means that each node is available for picking regardless of the type specified by the pick sensor. Example: the special value "NONE" effectively disables all picking for this node and is the equivalent of setting the pickable field to false.
 * <ul>
 *  <li> <i>Hint:</i> authors may define any value for objectType. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the objectType field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PickableGroup setObjectType(String[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>pickable</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The pickable field determines whether pick traversal is performed on this node or its children.
 * <ul>
 *  <li> <i>Hint:</i> pickable only affects children accessed through the transformation hierarchy of the parent. </li> 
 *  <li> <i>Warning:</i>  if one or more of the children of this instance is accessible through another transformation hierarchy through DEF/USE that still has picking enabled, they are still pickable through that path only. </li> 
 * </ul>
	 * @return value of pickable field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	@Override
	public boolean getPickable();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>pickable</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The pickable field determines whether pick traversal is performed on this node or its children.
 * <ul>
 *  <li> <i>Hint:</i> pickable only affects children accessed through the transformation hierarchy of the parent. </li> 
 *  <li> <i>Warning:</i>  if one or more of the children of this instance is accessible through another transformation hierarchy through DEF/USE that still has picking enabled, they are still pickable through that path only. </li> 
 * </ul>
	 * @param newValue is new value for the pickable field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PickableGroup setPickable(boolean newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DPickableObject)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link PickableGroup} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PickableGroup setVisible(boolean newValue);

}
