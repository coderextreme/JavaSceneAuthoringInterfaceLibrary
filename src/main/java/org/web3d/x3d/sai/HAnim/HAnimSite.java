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
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * An HAnimSite node serves three purposes: (a) define an "end effector" location which can be used by an inverse kinematics system, (b) define an attachment point for accessories such as jewelry and clothing, and (c) define a location for a Viewpoint virtual camera in the reference frame of an HAnimSegment (such as a view "through the eyes" of the humanoid for use in multi-user worlds).
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGroupingNode] An HAnimSite node serves three purposes: (a) define an "end effector" location which can be used by an inverse kinematics system, (b) define an attachment point for accessories such as jewelry and clothing, and (c) define a location for a Viewpoint virtual camera in the reference frame of an HAnimSegment (such as a view "through the eyes" of the humanoid for use in multi-user worlds).
 * <ul>
 *  <li> <i>Hint:</i> HAnimSite nodes are stored as children of an HAnimSegment node. </li> 
 *  <li> <i>Warning:</i> ensure that visible HAnimSite locations are not inadvertently obscured by skin animation. </li> 
 *  <li> <i>Hint:</i> H-Anim Specification <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Site <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Site" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Site</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Annex B, Feature points for the human body <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='1'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  the number of contained &amp;lt;HAnimSite USE='*' containerField='sites, skeleton or viewpoints'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimSite node instances found within the preceding skeleton hierarchy. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#HAnimSite" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimSite" target="blank">X3D Abstract Specification: HAnimSite</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimSite" target="_blank">X3D Tooltips: HAnimSite</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface HAnimSite extends X3DGroupingNode
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
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSite setBboxCenter(float[] newValue);

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
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSite setBboxSize(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default location of this HAnimSite, i.e. offset of center from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @return value of center field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getCenter();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default location of this HAnimSite, i.e. offset of center from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setCenter(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSite setChildren(X3DNode[] newValue); // acceptable node types #2: X3DChildNode

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
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * @return value of description field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public String getDescription();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setDescription(String newValue);

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
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSite setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String enumeration value (baseType featurePointNameValues) ["skull_vertex" | "glabella" | "sellion" | "l_infraorbitale" | "l_tragion" | "l_gonion" | "r_infraorbitale" | "r_tragion" | "r_gonion" | "supramenton" | "cervicale" | "adams_apple" | "suprasternale" | "substernale" | "l_clavicle" | "l_acromion" | "l_axilla_proximal" | "l_axilla_distal" | "l_axilla_posterior_folds" | "r_clavicle" | "r_acromion" | "r_axilla_proximal" | "r_axilla_distal" | "r_axilla_posterior_folds" | "spine_1_middle_back" | "spine_2_lower_back" | "waist_preferred_anterior" | "waist_preferred_posterior" | "l_rib10" | "l_thelion" | "r_rib10" | "r_thelion" | "l_asis" | "l_iliocristale" | "l_psis" | "r_asis" | "r_iliocristale" | "r_psis" | "crotch" | "l_femoral_lateral_epicondyle" | "l_femoral_medial_epicondyle" | "l_suprapatella" | "l_trochanterion" | "r_femoral_lateral_epicondyle" | "r_femoral_medial_epicondyle" | "r_suprapatella" | "r_trochanterion" | "l_tibiale" | "l_medial_malleolus" | "l_lateral_malleolus" | "l_sphyrion" | "r_tibiale" | "r_medial_malleolus" | "r_lateral_malleolus" | "r_sphyrion" | "l_metatarsal_phalanx_1" | "l_metatarsal_phalanx_5" | "l_dactylion" | "l_calcaneus_posterior" | "r_metatarsal_phalanx_1" | "r_metatarsal_phalanx_5" | "r_dactylion" | "r_calcaneus_posterior" | "l_humeral_lateral_epicondyle" | "l_humeral_medial_epicondyle" | "l_olecranon" | "r_humeral_lateral_epicondyle" | "r_humeral_medial_epicondyle" | "r_olecranon" | "l_radiale" | "l_ulnar_styloid" | "l_radial_styloid" | "r_radiale" | "r_ulnar_styloid" | "r_radial_styloid" | "l_metacarpal_phalanx_2" | "l_metacarpal_phalanx_3" | "l_metacarpal_phalanx_5" | "r_metacarpal_phalanx_2" | "r_metacarpal_phalanx_3" | "r_metacarpal_phalanx_5" | "nuchale" | "l_neck_base" | "r_neck_base" | "navel" | "l_ectocanthus" | "r_ectocanthus" | "menton" | "mesosternale" | "opisthocranion" | "l_knee_crease" | "r_knee_crease" | "rear_center_midsagittal_plane" | "buttocks_standing_wall_contact_point" | "l_chest_midsagittal_plane" | "r_chest_midsagittal_plane" | "l_bideltoid" | "r_bideltoid" | "l_carpal_distal_phalanx_1" | "l_carpal_distal_phalanx_2" | "l_carpal_distal_phalanx_3" | "l_carpal_distal_phalanx_4" | "l_carpal_distal_phalanx_5" | "r_carpal_distal_phalanx_1" | "r_carpal_distal_phalanx_2" | "r_carpal_distal_phalanx_3" | "r_carpal_distal_phalanx_4" | "r_carpal_distal_phalanx_5" | "l_tarsal_distal_phalanx_1" | "l_tarsal_distal_phalanx_2" | "l_tarsal_distal_phalanx_3" | "l_tarsal_distal_phalanx_4" | "l_tarsal_distal_phalanx_5" | "r_tarsal_distal_phalanx_1" | "r_tarsal_distal_phalanx_2" | "r_tarsal_distal_phalanx_3" | "r_tarsal_distal_phalanx_4" | "r_tarsal_distal_phalanx_5" | 'etc.'] from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimSite node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Hint:</i> HAnimSite names are based on feature point names. </li> 
 *  <li> <i>Hint:</i> <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html</a> </li> 
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. </li> 
 *  <li> <i>Hint:</i> HAnimSite nodes used as end effectors have '_tip' suffix appended to the name. </li> 
 *  <li> <i>Hint:</i> HAnimSite nodes containing a Viewpoint location have '_view' suffix appended to the name. </li> 
 *  <li> <i>Hint:</i> HAnimSite nodes serving other purposes have '_pt' suffix appended to the name. </li> 
 *  <li> <i>Warning:</i> HAnimSite name must end in '_tip' or '_view' or '_pt' suffix. </li> 
 *  <li> <i>Hint:</i> additional example name bases (such as cervicale l_infraorbitale supramenton etc.) are listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> H-Anim Humanoid Site Names LOA-3 <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSiteLoa3Names19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSiteLoa3Names19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, LOA-3 default Site object translations <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/BodyDimensionsAndLOAs.html#LOA3DefaultSiteTranslations" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/BodyDimensionsAndLOAs.html#LOA3DefaultSiteTranslations</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public String getName();

	/**
	 * Accessor method to assign String enumeration value ("skull_vertex" | "glabella" | "sellion" | "l_infraorbitale" | "l_tragion" | "l_gonion" | "r_infraorbitale" | "r_tragion" | "r_gonion" | "supramenton" | "cervicale" | "adams_apple" | "suprasternale" | "substernale" | "l_clavicle" | "l_acromion" | "l_axilla_proximal" | "l_axilla_distal" | "l_axilla_posterior_folds" | "r_clavicle" | "r_acromion" | "r_axilla_proximal" | "r_axilla_distal" | "r_axilla_posterior_folds" | "spine_1_middle_back" | "spine_2_lower_back" | "waist_preferred_anterior" | "waist_preferred_posterior" | "l_rib10" | "l_thelion" | "r_rib10" | "r_thelion" | "l_asis" | "l_iliocristale" | "l_psis" | "r_asis" | "r_iliocristale" | "r_psis" | "crotch" | "l_femoral_lateral_epicondyle" | "l_femoral_medial_epicondyle" | "l_suprapatella" | "l_trochanterion" | "r_femoral_lateral_epicondyle" | "r_femoral_medial_epicondyle" | "r_suprapatella" | "r_trochanterion" | "l_tibiale" | "l_medial_malleolus" | "l_lateral_malleolus" | "l_sphyrion" | "r_tibiale" | "r_medial_malleolus" | "r_lateral_malleolus" | "r_sphyrion" | "l_metatarsal_phalanx_1" | "l_metatarsal_phalanx_5" | "l_dactylion" | "l_calcaneus_posterior" | "r_metatarsal_phalanx_1" | "r_metatarsal_phalanx_5" | "r_dactylion" | "r_calcaneus_posterior" | "l_humeral_lateral_epicondyle" | "l_humeral_medial_epicondyle" | "l_olecranon" | "r_humeral_lateral_epicondyle" | "r_humeral_medial_epicondyle" | "r_olecranon" | "l_radiale" | "l_ulnar_styloid" | "l_radial_styloid" | "r_radiale" | "r_ulnar_styloid" | "r_radial_styloid" | "l_metacarpal_phalanx_2" | "l_metacarpal_phalanx_3" | "l_metacarpal_phalanx_5" | "r_metacarpal_phalanx_2" | "r_metacarpal_phalanx_3" | "r_metacarpal_phalanx_5" | "nuchale" | "l_neck_base" | "r_neck_base" | "navel" | "l_ectocanthus" | "r_ectocanthus" | "menton" | "mesosternale" | "opisthocranion" | "l_knee_crease" | "r_knee_crease" | "rear_center_midsagittal_plane" | "buttocks_standing_wall_contact_point" | "l_chest_midsagittal_plane" | "r_chest_midsagittal_plane" | "l_bideltoid" | "r_bideltoid" | "l_carpal_distal_phalanx_1" | "l_carpal_distal_phalanx_2" | "l_carpal_distal_phalanx_3" | "l_carpal_distal_phalanx_4" | "l_carpal_distal_phalanx_5" | "r_carpal_distal_phalanx_1" | "r_carpal_distal_phalanx_2" | "r_carpal_distal_phalanx_3" | "r_carpal_distal_phalanx_4" | "r_carpal_distal_phalanx_5" | "l_tarsal_distal_phalanx_1" | "l_tarsal_distal_phalanx_2" | "l_tarsal_distal_phalanx_3" | "l_tarsal_distal_phalanx_4" | "l_tarsal_distal_phalanx_5" | "r_tarsal_distal_phalanx_1" | "r_tarsal_distal_phalanx_2" | "r_tarsal_distal_phalanx_3" | "r_tarsal_distal_phalanx_4" | "r_tarsal_distal_phalanx_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimSite node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Hint:</i> HAnimSite names are based on feature point names. </li> 
 *  <li> <i>Hint:</i> <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html</a> </li> 
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. </li> 
 *  <li> <i>Hint:</i> HAnimSite nodes used as end effectors have '_tip' suffix appended to the name. </li> 
 *  <li> <i>Hint:</i> HAnimSite nodes containing a Viewpoint location have '_view' suffix appended to the name. </li> 
 *  <li> <i>Hint:</i> HAnimSite nodes serving other purposes have '_pt' suffix appended to the name. </li> 
 *  <li> <i>Warning:</i> HAnimSite name must end in '_tip' or '_view' or '_pt' suffix. </li> 
 *  <li> <i>Hint:</i> additional example name bases (such as cervicale l_infraorbitale supramenton etc.) are listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> H-Anim Humanoid Site Names LOA-3 <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSiteLoa3Names19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSiteLoa3Names19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, LOA-3 default Site object translations <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/BodyDimensionsAndLOAs.html#LOA3DefaultSiteTranslations" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/BodyDimensionsAndLOAs.html#LOA3DefaultSiteTranslations</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setName(String newValue);

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of children relative to local coordinate system.  * <br>

	 * @return value of rotation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getRotation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of children relative to local coordinate system.  * <br>

	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setRotation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of (0,infinity) from inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @return value of scale field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getScale();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @param newValue is new value for the scale field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setScale(float[] newValue);

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @return value of scaleOrientation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getScaleOrientation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setScaleOrientation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of children relative to local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 *  <li> <i>Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @return value of translation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public float[] getTranslation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of children relative to local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 *  <li> <i>Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSite setTranslation(float[] newValue);

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
	 * @return {@link HAnimSite} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSite setVisible(boolean newValue);

}
