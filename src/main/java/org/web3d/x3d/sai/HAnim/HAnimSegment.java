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

package org.web3d.x3d.sai.HAnim;

import org.web3d.x3d.sai.Grouping.X3DGroupingNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.HAnim.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * HAnimSegment node contains Shape geometry for each body segment.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGroupingNode] HAnimSegment node contains Shape geometry for each body segment. HAnimSegment contains Coordinate|CoordinateDouble with containerField='coord', HAnimDisplacer with containerField='displacers' and Shape or grouping nodes with containerField='children'.
 * <ul>
 *  <li> <i>Hint:</i> HAnimSegment displays geometry between parent HAnimJoint and sibling HAnimJoint nodes. </li> 
 *  <li> <i>Hint:</i> H-Anim Specification <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Segment <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Segment" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Segment</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='1'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  the number of contained &amp;lt;HAnimSegment USE='*' containerField='segments'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimJoint node instances found within the preceding skeleton hierarchy. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#HAnimSegment" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimSegment" target="blank">X3D Abstract Specification: HAnimSegment</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimSegment" target="_blank">X3D Tooltips: HAnimSegment</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface HAnimSegment extends X3DGroupingNode
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegment setBboxCenter(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegment setBboxSize(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>centerOfMass</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Location within segment of center of mass.  * <br>

	 * @return value of centerOfMass field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getCenterOfMass();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>centerOfMass</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Location within segment of center of mass.  * <br>

	 * @param newValue is new value for the centerOfMass field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setCenterOfMass(float[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Hint:</i> place any geometry for parent HAnimJoint within a child Transform having the same translation value as the parent HAnimJoint center value. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of children field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getChildren(); // acceptable node types #1: X3DChildNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Hint:</i> place any geometry for parent HAnimJoint within a child Transform having the same translation value as the parent HAnimJoint center value. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value for the children field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegment setChildren(X3DNode[] newValue); // acceptable node types #2: X3DChildNode

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
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] the coord field is used for HAnimSegment objects that have deformable meshes and shall contain coordinates referenced from the IndexedFaceSet for the paarent HAnimSegment object. The coordinates are given the same name as the HAnim Segment object, but with "_coords" appended to the name (e.g., "skull_coords").
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @return value of coord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public X3DCoordinateNode getCoord(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] the coord field is used for HAnimSegment objects that have deformable meshes and shall contain coordinates referenced from the IndexedFaceSet for the paarent HAnimSegment object. The coordinates are given the same name as the HAnim Segment object, but with "_coords" appended to the name (e.g., "skull_coords").
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @param newValue is new value for the coord field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setCoord(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * @return value of description field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public String getDescription();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setDescription(String newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>displacers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimDisplacer] the displacers field stores HAnimDisplacer objects for a particular HAnimSegment object.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimDisplacerObject
	 * @return value of displacers field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public X3DNode[] getDisplacers(); // acceptable node types #1: HAnimDisplacer

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>displacers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimDisplacer] the displacers field stores HAnimDisplacer objects for a particular HAnimSegment object.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @param newValue is new value for the displacers field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setDisplacers(X3DNode[] newValue); // acceptable node types #2: HAnimDisplacer

	/**
	 * Add array of child displacers nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @param newValue is new value array to be appended the displacers field.
	 */
	public void addDisplacers(X3DNode[] newValue); // acceptable node types #3: HAnimDisplacer
	/**
	 * Set single child displacers node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the displacers field
	 */
	public void setDisplacers(X3DNode newValue); // acceptable node types #5: HAnimDisplacer
	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Total mass of the segment, 0 if not available, defined in mass base units (default is kilograms).
 * <ul>
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @return value of mass field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float getMass();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Total mass of the segment, 0 if not available, defined in mass base units (default is kilograms).
 * <ul>
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @param newValue is new value for the mass field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setMass(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegment setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of float results within allowed range of [0,infinity) from inputOutput MFFloat field named <i>momentsOfInertia</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  3x3 moments of inertia matrix. default: 0 0 0 0 0 0 0 0 0.  * <br>

	 * @return value of momentsOfInertia field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getMomentsOfInertia();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>momentsOfInertia</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  3x3 moments of inertia matrix. default: 0 0 0 0 0 0 0 0 0.  * <br>

	 * @param newValue is new value for the momentsOfInertia field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setMomentsOfInertia(float[] newValue);

	/**
	 * Provide String enumeration value (baseType segmentNameValues) ["sacrum" | "pelvis" | "l_thigh" | "l_calf" | "l_talus" | "l_navicular" | "l_cuneiform_1" | "l_metatarsal_1" | "l_tarsal_proximal_phalanx_1" | "l_tarsal_distal_phalanx_1" | "l_cuneiform_2" | "l_metatarsal_2" | "l_tarsal_proximal_phalanx_2" | "l_tarsal_middle_phalanx_2" | "l_tarsal_distal_phalanx_2" | "l_cuneiform_3" | "l_metatarsal_3" | "l_tarsal_proximal_phalanx_3" | "l_tarsal_middle_phalanx_3" | "l_tarsal_distal_phalanx_3" | "l_calcaneus" | "l_cuboid" | "l_metatarsal_4" | "l_tarsal_proximal_phalanx_4" | "l_tarsal_middle_phalanx_4" | "l_tarsal_distal_phalanx_4" | "l_metatarsal_5" | "l_tarsal_proximal_phalanx_5" | "l_tarsal_middle_phalanx_5" | "l_tarsal_distal_phalanx_5" | "r_thigh" | "r_calf" | "r_talus" | "r_navicular" | "r_cuneiform_1" | "r_metatarsal_1" | "r_tarsal_proximal_phalanx_1" | "r_tarsal_distal_phalanx_1" | "r_cuneiform_2" | "r_metatarsal_2" | "r_tarsal_proximal_phalanx_2" | "r_tarsal_middle_phalanx_2" | "r_tarsal_distal_phalanx_2" | "r_cuneiform_3" | "r_metatarsal_3" | "r_tarsal_proximal_phalanx_3" | "r_tarsal_middle_phalanx_3" | "r_tarsal_distal_phalanx_3" | "r_calcaneus" | "r_cuboid" | "r_metatarsal_4" | "r_tarsal_proximal_phalanx_4" | "r_tarsal_middle_phalanx_4" | "r_tarsal_distal_phalanx_4" | "r_metatarsal_5" | "r_tarsal_proximal_phalanx_5" | "r_tarsal_middle_phalanx_5" | "r_tarsal_distal_phalanx_5" | "l5" | "l4" | "l3" | "l2" | "l1" | "t12" | "t11" | "t10" | "t9" | "t8" | "t7" | "t6" | "t5" | "t4" | "t3" | "t2" | "t1" | "c7" | "c6" | "c5" | "c4" | "c3" | "c2" | "c1" | "skull" | "l_eyelid" | "r_eyelid" | "l_eyeball" | "r_eyeball" | "l_eyebrow" | "r_eyebrow" | "jaw" | "l_clavicle" | "l_scapula" | "l_upperarm" | "l_forearm" | "l_carpal" | "l_trapezium" | "l_metacarpal_1" | "l_carpal_proximal_phalanx_1" | "l_carpal_distal_phalanx_1" | "l_trapezoid" | "l_metacarpal_2" | "l_carpal_proximal_phalanx_2" | "l_carpal_middle_phalanx_2" | "l_carpal_distal_phalanx_2" | "l_capitate" | "l_metacarpal_3" | "l_carpal_proximal_phalanx_3" | "l_carpal_middle_phalanx_3" | "l_carpal_distal_phalanx_3" | "l_hamate" | "l_metacarpal_4" | "l_carpal_proximal_phalanx_4" | "l_carpal_middle_phalanx_4" | "l_carpal_distal_phalanx_4" | "l_metacarpal_5" | "l_carpal_proximal_phalanx_5" | "l_carpal_middle_phalanx_5" | "l_carpal_distal_phalanx_5" | "r_clavicle" | "r_scapula" | "r_upperarm" | "r_forearm" | "r_carpal" | "r_trapezium" | "r_metacarpal_1" | "r_carpal_proximal_phalanx_1" | "r_carpal_distal_phalanx_1" | "r_trapezoid" | "r_metacarpal_2" | "r_carpal_proximal_phalanx_2" | "r_carpal_middle_phalanx_2" | "r_carpal_distal_phalanx_2" | "r_capitate" | "r_metacarpal_3" | "r_carpal_proximal_phalanx_3" | "r_carpal_middle_phalanx_3" | "r_carpal_distal_phalanx_3" | "r_hamate" | "r_metacarpal_4" | "r_carpal_proximal_phalanx_4" | "r_carpal_middle_phalanx_4" | "r_carpal_distal_phalanx_4" | "r_metacarpal_5" | "r_carpal_proximal_phalanx_5" | "r_carpal_middle_phalanx_5" | "r_carpal_distal_phalanx_5" | 'etc.'] from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimSegment node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. Examples: sacrum pelvis l_thigh l_calf etc. as listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> for abitrary humanoids, HAnimSegment name can describe geometry between parent HAnimJoint and sibling HAnimJoint nodes (for example LeftHip_to_LeftKnee). </li> 
 *  <li> <i>Hint:</i> H-Anim Humanoid Segment Names H-Anim Specification, Humanoid Joint-Segment Hierarchy <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSegmentNames19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSegmentNames19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Humanoid Joint-Segment Hierarchy <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public String getName();

	/**
	 * Accessor method to assign String enumeration value ("sacrum" | "pelvis" | "l_thigh" | "l_calf" | "l_talus" | "l_navicular" | "l_cuneiform_1" | "l_metatarsal_1" | "l_tarsal_proximal_phalanx_1" | "l_tarsal_distal_phalanx_1" | "l_cuneiform_2" | "l_metatarsal_2" | "l_tarsal_proximal_phalanx_2" | "l_tarsal_middle_phalanx_2" | "l_tarsal_distal_phalanx_2" | "l_cuneiform_3" | "l_metatarsal_3" | "l_tarsal_proximal_phalanx_3" | "l_tarsal_middle_phalanx_3" | "l_tarsal_distal_phalanx_3" | "l_calcaneus" | "l_cuboid" | "l_metatarsal_4" | "l_tarsal_proximal_phalanx_4" | "l_tarsal_middle_phalanx_4" | "l_tarsal_distal_phalanx_4" | "l_metatarsal_5" | "l_tarsal_proximal_phalanx_5" | "l_tarsal_middle_phalanx_5" | "l_tarsal_distal_phalanx_5" | "r_thigh" | "r_calf" | "r_talus" | "r_navicular" | "r_cuneiform_1" | "r_metatarsal_1" | "r_tarsal_proximal_phalanx_1" | "r_tarsal_distal_phalanx_1" | "r_cuneiform_2" | "r_metatarsal_2" | "r_tarsal_proximal_phalanx_2" | "r_tarsal_middle_phalanx_2" | "r_tarsal_distal_phalanx_2" | "r_cuneiform_3" | "r_metatarsal_3" | "r_tarsal_proximal_phalanx_3" | "r_tarsal_middle_phalanx_3" | "r_tarsal_distal_phalanx_3" | "r_calcaneus" | "r_cuboid" | "r_metatarsal_4" | "r_tarsal_proximal_phalanx_4" | "r_tarsal_middle_phalanx_4" | "r_tarsal_distal_phalanx_4" | "r_metatarsal_5" | "r_tarsal_proximal_phalanx_5" | "r_tarsal_middle_phalanx_5" | "r_tarsal_distal_phalanx_5" | "l5" | "l4" | "l3" | "l2" | "l1" | "t12" | "t11" | "t10" | "t9" | "t8" | "t7" | "t6" | "t5" | "t4" | "t3" | "t2" | "t1" | "c7" | "c6" | "c5" | "c4" | "c3" | "c2" | "c1" | "skull" | "l_eyelid" | "r_eyelid" | "l_eyeball" | "r_eyeball" | "l_eyebrow" | "r_eyebrow" | "jaw" | "l_clavicle" | "l_scapula" | "l_upperarm" | "l_forearm" | "l_carpal" | "l_trapezium" | "l_metacarpal_1" | "l_carpal_proximal_phalanx_1" | "l_carpal_distal_phalanx_1" | "l_trapezoid" | "l_metacarpal_2" | "l_carpal_proximal_phalanx_2" | "l_carpal_middle_phalanx_2" | "l_carpal_distal_phalanx_2" | "l_capitate" | "l_metacarpal_3" | "l_carpal_proximal_phalanx_3" | "l_carpal_middle_phalanx_3" | "l_carpal_distal_phalanx_3" | "l_hamate" | "l_metacarpal_4" | "l_carpal_proximal_phalanx_4" | "l_carpal_middle_phalanx_4" | "l_carpal_distal_phalanx_4" | "l_metacarpal_5" | "l_carpal_proximal_phalanx_5" | "l_carpal_middle_phalanx_5" | "l_carpal_distal_phalanx_5" | "r_clavicle" | "r_scapula" | "r_upperarm" | "r_forearm" | "r_carpal" | "r_trapezium" | "r_metacarpal_1" | "r_carpal_proximal_phalanx_1" | "r_carpal_distal_phalanx_1" | "r_trapezoid" | "r_metacarpal_2" | "r_carpal_proximal_phalanx_2" | "r_carpal_middle_phalanx_2" | "r_carpal_distal_phalanx_2" | "r_capitate" | "r_metacarpal_3" | "r_carpal_proximal_phalanx_3" | "r_carpal_middle_phalanx_3" | "r_carpal_distal_phalanx_3" | "r_hamate" | "r_metacarpal_4" | "r_carpal_proximal_phalanx_4" | "r_carpal_middle_phalanx_4" | "r_carpal_distal_phalanx_4" | "r_metacarpal_5" | "r_carpal_proximal_phalanx_5" | "r_carpal_middle_phalanx_5" | "r_carpal_distal_phalanx_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimSegment node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. Examples: sacrum pelvis l_thigh l_calf etc. as listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> for abitrary humanoids, HAnimSegment name can describe geometry between parent HAnimJoint and sibling HAnimJoint nodes (for example LeftHip_to_LeftKnee). </li> 
 *  <li> <i>Hint:</i> H-Anim Humanoid Segment Names H-Anim Specification, Humanoid Joint-Segment Hierarchy <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSegmentNames19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSegmentNames19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Humanoid Joint-Segment Hierarchy <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegment setName(String newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimSegment} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegment setVisible(boolean newValue);

}
