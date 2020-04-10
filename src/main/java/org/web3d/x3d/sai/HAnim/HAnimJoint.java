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

import org.web3d.x3d.sai.Core.X3DChildNode;
import org.web3d.x3d.sai.Grouping.X3DBoundedObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.HAnim.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * HAnimJoint node can represent each joint in a body.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGroupingNode] HAnimJoint node can represent each joint in a body.
 * <ul>
 *  <li> <i>Hint:</i> HAnimJoint may only get inserted as one (or more) root nodes of HAnimHumanoid skeleton field, as a child of another HAnimJoint node, or as a USE node in the HAnimHumanoid joints field. </li> 
 *  <li> <i>Warning:</i> HAnimJoint can only contain certain nodes: HAnimJoint, HAnimSegment, HAnimSite (with containerField='children') and also HAnimDisplacer nodes (with containerField='displacers'). </li> 
 *  <li> <i>Hint:</i> visualization shapes for HAnimJoint nodes can be placed in child HAnimSegment or HAnimSite nodes. </li> 
 *  <li> <i>Warning:</i> an HAnimJoint may not be a child of an HAnimSegment. </li> 
 *  <li> <i>Hint:</i> H-Anim Specification <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Joint <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Joint" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Joint</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='1'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  the number of contained &amp;lt;HAnimJoint USE='*' containerField='joints'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimJoint node instances found within the preceding skeleton hierarchy. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#HAnimJoint" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimJoint" target="blank">X3D Abstract Specification: HAnimJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimJoint" target="_blank">X3D Tooltips: HAnimJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface HAnimJoint extends X3DChildNode, X3DBoundedObject
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJoint setBboxCenter(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJoint setBboxSize(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Translation offset from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 * </ul>
	 * @return value of center field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getCenter();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Translation offset from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 * </ul>
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setCenter(float[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to HAnimJoint|HAnimSegment|HAnimSite, from inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimJoint|HAnimSegment|HAnimSite] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Warning:</i> HAnimJoint can only contain HAnimJoint|HAnimSegment|HAnimSite nodes (each having default containerField='children'). </li> 
 *  <li> <i>Hint:</i> place any geometry for this HAnimJoint in the child HAnimSegment, wrapped within a Transform having the same translation value as the current HAnimJoint center value. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSegment|HAnimSite.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimJointObject
	 * @see org.web3d.x3d.jsail.HAnim.HAnimSegmentObject
	 * @see org.web3d.x3d.jsail.HAnim.HAnimSiteObject
	 * @return value of children field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public X3DNode[] getChildren(); // acceptable node types #1: HAnimJoint|HAnimSegment|HAnimSite

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(newValue instanceof org.web3d.x3d.jsail.Core.CommentsBlock) ||
				(newValue instanceof org.web3d.x3d.jsail.Core.ROUTEObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Networking.IMPORTObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Networking.EXPORTObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject) ||
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimSegmentObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes HAnimJoint|HAnimSegment|HAnimSite; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i> [HAnimJoint|HAnimSegment|HAnimSite] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Warning:</i> HAnimJoint can only contain HAnimJoint|HAnimSegment|HAnimSite nodes (each having default containerField='children'). </li> 
 *  <li> <i>Hint:</i> place any geometry for this HAnimJoint in the child HAnimSegment, wrapped within a Transform having the same translation value as the current HAnimJoint center value. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSegment|HAnimSite.
	 * @param newValue is new value for the children field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setChildren(X3DNode[] newValue); // acceptable node types #2: HAnimJoint|HAnimSegment|HAnimSite

	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSegment|HAnimSite.
	 * @param newValue is new value array to be appended the children field.
	 */
	public void addChildren(X3DNode[] newValue); // acceptable node types #3: HAnimJoint|HAnimSegment|HAnimSite
	/**
	 * Set single children node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the children field
	 */
	public void setChildren(X3DNode newValue); // acceptable node types #5: HAnimJoint|HAnimSegment|HAnimSite
	/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * @return value of description field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String getDescription();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setDescription(String newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>displacers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimDisplacer] the displacers field stores HAnimDisplacer objects for a particular HAnimJoint object.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimDisplacerObject
	 * @return value of displacers field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public X3DNode[] getDisplacers(); // acceptable node types #1: HAnimDisplacer

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>displacers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimDisplacer] the displacers field stores HAnimDisplacer objects for a particular HAnimJoint object.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @param newValue is new value for the displacers field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setDisplacers(X3DNode[] newValue); // acceptable node types #2: HAnimDisplacer

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
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>limitOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of upper/lower rotation limits, relative to HAnimJoint center.  * <br>

	 * @return value of limitOrientation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getLimitOrientation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>limitOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of upper/lower rotation limits, relative to HAnimJoint center.  * <br>

	 * @param newValue is new value for the limitOrientation field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setLimitOrientation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>llimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Lower limit for minimum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @return value of llimit field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getLlimit();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>llimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Lower limit for minimum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @param newValue is new value for the llimit field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setLlimit(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJoint setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String enumeration value (baseType jointNameValues) ["humanoid_root" | "sacroiliac" | "l_hip" | "l_knee" | "l_talocrural" | "l_talocalcaneonavicular" | "l_cuneonavicular_1" | "l_tarsometatarsal_1" | "l_metatarsophalangeal_1" | "l_tarsal_interphalangeal_1" | "l_cuneonavicular_2" | "l_tarsometatarsal_2" | "l_metatarsophalangeal_2" | "l_tarsal_proximal_interphalangeal_2" | "l_tarsal_distal_interphalangeal_2" | "l_cuneonavicular_3" | "l_tarsometatarsal_3" | "l_metatarsophalangeal_3" | "l_tarsal_proximal_interphalangeal_3" | "l_tarsal_distal_interphalangeal_3" | "l_calcaneocuboid" | "l_transversetarsal" | "l_tarsometatarsal_4" | "l_metatarsophalangeal_4" | "l_tarsal_proximal_interphalangeal_4" | "l_tarsal_distal_interphalangeal_4" | "l_tarsometatarsal_5" | "l_metatarsophalangeal_5" | "l_tarsal_proximal_interphalangeal_5" | "l_tarsal_distal_interphalangeal_5" | "r_hip" | "r_knee" | "r_talocrural" | "r_talocalcaneonavicular" | "r_cuneonavicular_1" | "r_tarsometatarsal_1" | "r_metatarsophalangeal_1" | "r_tarsal_interphalangeal_1" | "r_cuneonavicular_2" | "r_tarsometatarsal_2" | "r_metatarsophalangeal_2" | "r_tarsal_proximal_interphalangeal_2" | "r_tarsal_distal_interphalangeal_2" | "r_cuneonavicular_3" | "r_tarsometatarsal_3" | "r_metatarsophalangeal_3" | "r_tarsal_proximal_interphalangeal_3" | "r_tarsal_distal_interphalangeal_3" | "r_calcaneocuboid" | "r_transversetarsal" | "r_tarsometatarsal_4" | "r_metatarsophalangeal_4" | "r_tarsal_proximal_interphalangeal_4" | "r_tarsal_distal_interphalangeal_4" | "r_tarsometatarsal_5" | "r_metatarsophalangeal_5" | "r_tarsal_proximal_interphalangeal_5" | "r_tarsal_distal_interphalangeal_5" | "vl5" | "vl4" | "vl3" | "vl2" | "vl1" | "vt12" | "vt11" | "vt10" | "vt9" | "vt8" | "vt7" | "vt6" | "vt5" | "vt4" | "vt3" | "vt2" | "vt1" | "vc7" | "vc6" | "vc5" | "vc4" | "vc3" | "vc2" | "vc1" | "skullbase" | "l_eyelid_joint" | "r_eyelid_joint" | "l_eyeball_joint" | "r_eyeball_joint" | "l_eyebrow_joint" | "r_eyebrow_joint" | "temporomandibular" | "l_sternoclavicular" | "l_acromioclavicular" | "l_shoulder" | "l_elbow" | "l_radiocarpal" | "l_midcarpal_1" | "l_carpometacarpal_1" | "l_metacarpophalangeal_1" | "l_carpal_interphalangeal_1" | "l_midcarpal_2" | "l_carpometacarpal_2" | "l_metacarpophalangeal_2" | "l_carpal_proximal_interphalangeal_2" | "l_carpal_distal_interphalangeal_2" | "l_midcarpal_3" | "l_carpometacarpal_3" | "l_metacarpophalangeal_3" | "l_carpal_proximal_interphalangeal_3" | "l_carpal_distal_interphalangeal_3" | "l_midcarpal_4_5" | "l_carpometacarpal_4" | "l_metacarpophalangeal_4" | "l_carpal_proximal_interphalangeal_4" | "l_carpal_distal_interphalangeal_4" | "l_carpometacarpal_5" | "l_metacarpophalangeal_5" | "l_carpal_proximal_interphalangeal_5" | "l_carpal_distal_interphalangeal_5" | "r_sternoclavicular" | "r_acromioclavicular" | "r_shoulder" | "r_elbow" | "r_radiocarpal" | "r_midcarpal_1" | "r_carpometacarpal_1" | "r_metacarpophalangeal_1" | "r_carpal_interphalangeal_1" | "r_midcarpal_2" | "r_carpometacarpal_2" | "r_metacarpophalangeal_2" | "r_carpal_proximal_interphalangeal_2" | "r_carpal_distal_interphalangeal_2" | "r_midcarpal_3" | "r_carpometacarpal_3" | "r_metacarpophalangeal_3" | "r_carpal_proximal_interphalangeal_3" | "r_carpal_distal_interphalangeal_3" | "r_midcarpal_4_5" | "r_carpometacarpal_4" | "r_metacarpophalangeal_4" | "r_carpal_proximal_interphalangeal_4" | "r_carpal_distal_interphalangeal_4" | "r_carpometacarpal_5" | "r_metacarpophalangeal_5" | "r_carpal_proximal_interphalangeal_5" | "r_carpal_distal_interphalangeal_5" | 'etc.'] from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimJoint node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. Examples: humanoid_root sacroiliac l_hip l_knee l_ankle etc. as listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> H-Anim Humanoid Joint Names <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimJointNames19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimJointNames19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Humanoid Joint-Segment Hierarchy <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String getName();

	/**
	 * Accessor method to assign String enumeration value ("humanoid_root" | "sacroiliac" | "l_hip" | "l_knee" | "l_talocrural" | "l_talocalcaneonavicular" | "l_cuneonavicular_1" | "l_tarsometatarsal_1" | "l_metatarsophalangeal_1" | "l_tarsal_interphalangeal_1" | "l_cuneonavicular_2" | "l_tarsometatarsal_2" | "l_metatarsophalangeal_2" | "l_tarsal_proximal_interphalangeal_2" | "l_tarsal_distal_interphalangeal_2" | "l_cuneonavicular_3" | "l_tarsometatarsal_3" | "l_metatarsophalangeal_3" | "l_tarsal_proximal_interphalangeal_3" | "l_tarsal_distal_interphalangeal_3" | "l_calcaneocuboid" | "l_transversetarsal" | "l_tarsometatarsal_4" | "l_metatarsophalangeal_4" | "l_tarsal_proximal_interphalangeal_4" | "l_tarsal_distal_interphalangeal_4" | "l_tarsometatarsal_5" | "l_metatarsophalangeal_5" | "l_tarsal_proximal_interphalangeal_5" | "l_tarsal_distal_interphalangeal_5" | "r_hip" | "r_knee" | "r_talocrural" | "r_talocalcaneonavicular" | "r_cuneonavicular_1" | "r_tarsometatarsal_1" | "r_metatarsophalangeal_1" | "r_tarsal_interphalangeal_1" | "r_cuneonavicular_2" | "r_tarsometatarsal_2" | "r_metatarsophalangeal_2" | "r_tarsal_proximal_interphalangeal_2" | "r_tarsal_distal_interphalangeal_2" | "r_cuneonavicular_3" | "r_tarsometatarsal_3" | "r_metatarsophalangeal_3" | "r_tarsal_proximal_interphalangeal_3" | "r_tarsal_distal_interphalangeal_3" | "r_calcaneocuboid" | "r_transversetarsal" | "r_tarsometatarsal_4" | "r_metatarsophalangeal_4" | "r_tarsal_proximal_interphalangeal_4" | "r_tarsal_distal_interphalangeal_4" | "r_tarsometatarsal_5" | "r_metatarsophalangeal_5" | "r_tarsal_proximal_interphalangeal_5" | "r_tarsal_distal_interphalangeal_5" | "vl5" | "vl4" | "vl3" | "vl2" | "vl1" | "vt12" | "vt11" | "vt10" | "vt9" | "vt8" | "vt7" | "vt6" | "vt5" | "vt4" | "vt3" | "vt2" | "vt1" | "vc7" | "vc6" | "vc5" | "vc4" | "vc3" | "vc2" | "vc1" | "skullbase" | "l_eyelid_joint" | "r_eyelid_joint" | "l_eyeball_joint" | "r_eyeball_joint" | "l_eyebrow_joint" | "r_eyebrow_joint" | "temporomandibular" | "l_sternoclavicular" | "l_acromioclavicular" | "l_shoulder" | "l_elbow" | "l_radiocarpal" | "l_midcarpal_1" | "l_carpometacarpal_1" | "l_metacarpophalangeal_1" | "l_carpal_interphalangeal_1" | "l_midcarpal_2" | "l_carpometacarpal_2" | "l_metacarpophalangeal_2" | "l_carpal_proximal_interphalangeal_2" | "l_carpal_distal_interphalangeal_2" | "l_midcarpal_3" | "l_carpometacarpal_3" | "l_metacarpophalangeal_3" | "l_carpal_proximal_interphalangeal_3" | "l_carpal_distal_interphalangeal_3" | "l_midcarpal_4_5" | "l_carpometacarpal_4" | "l_metacarpophalangeal_4" | "l_carpal_proximal_interphalangeal_4" | "l_carpal_distal_interphalangeal_4" | "l_carpometacarpal_5" | "l_metacarpophalangeal_5" | "l_carpal_proximal_interphalangeal_5" | "l_carpal_distal_interphalangeal_5" | "r_sternoclavicular" | "r_acromioclavicular" | "r_shoulder" | "r_elbow" | "r_radiocarpal" | "r_midcarpal_1" | "r_carpometacarpal_1" | "r_metacarpophalangeal_1" | "r_carpal_interphalangeal_1" | "r_midcarpal_2" | "r_carpometacarpal_2" | "r_metacarpophalangeal_2" | "r_carpal_proximal_interphalangeal_2" | "r_carpal_distal_interphalangeal_2" | "r_midcarpal_3" | "r_carpometacarpal_3" | "r_metacarpophalangeal_3" | "r_carpal_proximal_interphalangeal_3" | "r_carpal_distal_interphalangeal_3" | "r_midcarpal_4_5" | "r_carpometacarpal_4" | "r_metacarpophalangeal_4" | "r_carpal_proximal_interphalangeal_4" | "r_carpal_distal_interphalangeal_4" | "r_carpometacarpal_5" | "r_metacarpophalangeal_5" | "r_carpal_proximal_interphalangeal_5" | "r_carpal_distal_interphalangeal_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimJoint node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. Examples: humanoid_root sacroiliac l_hip l_knee l_ankle etc. as listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> H-Anim Humanoid Joint Names <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimJointNames19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimJointNames19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Humanoid Joint-Segment Hierarchy <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#Hierarchy</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setName(String newValue);

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Orientation of children relative to local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  default pose is typically empty (or an identity rotation) to avoid distorted body animations. </li> 
 * </ul>
	 * @return value of rotation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getRotation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Orientation of children relative to local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  default pose is typically empty (or an identity rotation) to avoid distorted body animations. </li> 
 * </ul>
	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setRotation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of (0,infinity) from inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @return value of scale field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getScale();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @param newValue is new value for the scale field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setScale(float[] newValue);

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @return value of scaleOrientation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getScaleOrientation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setScaleOrientation(float[] newValue);

	/**
	 * Provide array of int results within allowed range of [0,infinity) from inputOutput MFInt32 field named <i>skinCoordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Coordinate index values referencing which vertices are influenced by the HAnimJoint.
 * <ul>
 *  <li> <i>Warning:</i> -1 sentinel values are not allowed. </li> 
 *  <li> <i>Hint:</i> corresponding skinCoord Coordinate and skinNormal Normal nodes are directly contained within the ancestor HAnimHumanoid node for this HAnimJoint. </li> 
 *  <li> <i>Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @return value of skinCoordIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int[] getSkinCoordIndex();

	/**
	 * Accessor method to assign int array to inputOutput MFInt32 field named <i>skinCoordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Coordinate index values referencing which vertices are influenced by the HAnimJoint.
 * <ul>
 *  <li> <i>Warning:</i> -1 sentinel values are not allowed. </li> 
 *  <li> <i>Hint:</i> corresponding skinCoord Coordinate and skinNormal Normal nodes are directly contained within the ancestor HAnimHumanoid node for this HAnimJoint. </li> 
 *  <li> <i>Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @param newValue is new value for the skinCoordIndex field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setSkinCoordIndex(int[] newValue);

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>skinCoordWeight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Weight deformation values for the corresponding values in the skinCoordIndex field.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @return value of skinCoordWeight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getSkinCoordWeight();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>skinCoordWeight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Weight deformation values for the corresponding values in the skinCoordIndex field.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @param newValue is new value for the skinCoordWeight field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setSkinCoordWeight(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of [0,1] from inputOutput SFVec3f field named <i>stiffness</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] A scale factor of (1 - stiffness) is applied around the corresponding axis (X, Y, or Z for entries 0, 1 and 2 of the stiffness field). Thus a stiffness value of zero means that no rotation scaling occurs, while a stiffness value of one means that no rotation occurs regardless of any provided rotation.
 * <ul>
 *  <li> <i> Hint:</i>  used by inverse kinematics (IK) systems. </li> 
 * </ul>
	 * @return value of stiffness field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getStiffness();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>stiffness</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] A scale factor of (1 - stiffness) is applied around the corresponding axis (X, Y, or Z for entries 0, 1 and 2 of the stiffness field). Thus a stiffness value of zero means that no rotation scaling occurs, while a stiffness value of one means that no rotation occurs regardless of any provided rotation.
 * <ul>
 *  <li> <i> Hint:</i>  used by inverse kinematics (IK) systems. </li> 
 * </ul>
	 * @param newValue is new value for the stiffness field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setStiffness(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of children relative to local coordinate system.
 * <ul>
 *  <li> <i>Warning:</i> usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 *  <li> <i>Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 * </ul>
	 * @return value of translation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getTranslation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of children relative to local coordinate system.
 * <ul>
 *  <li> <i>Warning:</i> usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 *  <li> <i>Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 * </ul>
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setTranslation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>ulimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Upper limit for maximum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @return value of ulimit field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getUlimit();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>ulimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Upper limit for maximum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @param newValue is new value for the ulimit field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJoint setUlimit(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJoint setVisible(boolean newValue);

}
