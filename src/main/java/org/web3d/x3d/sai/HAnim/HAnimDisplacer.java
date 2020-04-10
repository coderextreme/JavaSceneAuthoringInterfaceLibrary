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

import org.web3d.x3d.sai.Rendering.X3DGeometricPropertyNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * HAnimDisplacer nodes alter the shape of coordinate-based geometry within parent HAnimJoint or HAnimSegment nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGeometricPropertyNode] HAnimDisplacer nodes alter the shape of coordinate-based geometry within parent HAnimJoint or HAnimSegment nodes. Displacer effects are scaled by the corresponding weight field.
 * <ul>
 *  <li> <i>Hint:</i> HAnimDisplacer can be used in three different ways: (a) identify vertices corresponding to a particular feature in a parent HAnimSegment node, (b) represent a particular muscular action for a parent HAnimJoint node by displacing corresponding HAnimHumanoid skin vertices in various directions (linearly or radially), or (c) represent a complete configuration of coordinate vertices in parent HAnimSegment or HAnimJoint nodes. Example: in the case of a face, there might be a separate HAnimDisplacer node for each facial expression. </li> 
 *  <li> <i>Warning:</i> allowed name suffixes include _feature, _action and _config. </li> 
 *  <li> <i>Hint:</i> multiple HAnimDisplacer nodes must appear consecutively inside parent HAnimSegment for proper content validation in XML encoding. </li> 
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Hint:</i> H-Anim Specification <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Displacer <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Displacer" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Displacer</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='1'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#HAnimDisplacer" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimDisplacer" target="blank">X3D Abstract Specification: HAnimDisplacer</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimDisplacer" target="_blank">X3D Tooltips: HAnimDisplacer</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface HAnimDisplacer extends X3DGeometricPropertyNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of int results within allowed range of [0,infinity) from initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Defines index values into the parent HAnimSegment or HAnimBody/HAnimHumanoid coordinate array for the mesh of vertices affected by this HAnimDisplacer. Values start at index 0.
 * <ul>
 *  <li> <i> Warning:</i>  -1 sentinel values are not allowed. </li> 
 * </ul>
	 * @return value of coordIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometricPropertyNode, $additionalInheritanceBaseType=)
	public int[] getCoordIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Defines index values into the parent HAnimSegment or HAnimBody/HAnimHumanoid coordinate array for the mesh of vertices affected by this HAnimDisplacer. Values start at index 0.
 * <ul>
 *  <li> <i> Warning:</i>  -1 sentinel values are not allowed. </li> 
 * </ul>
	 * @param newValue is new value for the coordIndex field.
	 * @return {@link HAnimDisplacer} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimDisplacer setCoordIndex(int[] newValue);

	/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * @return value of description field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometricPropertyNode, $additionalInheritanceBaseType=)
	public String getDescription();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimDisplacer} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimDisplacer setDescription(String newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>displacements</i>.
	 * <br><br>
	 * <i>Tooltip:</i> displacements are a set of SFVec3f values added to neutral/resting position of each of the corresponding HAnimSegment vertices (or HAnimJoint/HAnimHumanoid vertices) referenced by coordIndex field.
 * <ul>
 *  <li> <i>Hint:</i> Individual displacement values are scaled by the weight factor, if present. </li> 
 *  <li> <i>Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 * </ul>
	 * @return value of displacements field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometricPropertyNode, $additionalInheritanceBaseType=)
	public float[] getDisplacements();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>displacements</i>.
	 * <br><br>
	 * <i>Tooltip:</i> displacements are a set of SFVec3f values added to neutral/resting position of each of the corresponding HAnimSegment vertices (or HAnimJoint/HAnimHumanoid vertices) referenced by coordIndex field.
 * <ul>
 *  <li> <i>Hint:</i> Individual displacement values are scaled by the weight factor, if present. </li> 
 *  <li> <i>Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 * </ul>
	 * @param newValue is new value for the displacements field.
	 * @return {@link HAnimDisplacer} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimDisplacer setDisplacements(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometricPropertyNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimDisplacer} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimDisplacer setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String enumeration value (baseType featurePointNameValues) ["skull_vertex" | "glabella" | "sellion" | "l_infraorbitale" | "l_tragion" | "l_gonion" | "r_infraorbitale" | "r_tragion" | "r_gonion" | "supramenton" | "cervicale" | "adams_apple" | "suprasternale" | "substernale" | "l_clavicle" | "l_acromion" | "l_axilla_proximal" | "l_axilla_distal" | "l_axilla_posterior_folds" | "r_clavicle" | "r_acromion" | "r_axilla_proximal" | "r_axilla_distal" | "r_axilla_posterior_folds" | "spine_1_middle_back" | "spine_2_lower_back" | "waist_preferred_anterior" | "waist_preferred_posterior" | "l_rib10" | "l_thelion" | "r_rib10" | "r_thelion" | "l_asis" | "l_iliocristale" | "l_psis" | "r_asis" | "r_iliocristale" | "r_psis" | "crotch" | "l_femoral_lateral_epicondyle" | "l_femoral_medial_epicondyle" | "l_suprapatella" | "l_trochanterion" | "r_femoral_lateral_epicondyle" | "r_femoral_medial_epicondyle" | "r_suprapatella" | "r_trochanterion" | "l_tibiale" | "l_medial_malleolus" | "l_lateral_malleolus" | "l_sphyrion" | "r_tibiale" | "r_medial_malleolus" | "r_lateral_malleolus" | "r_sphyrion" | "l_metatarsal_phalanx_1" | "l_metatarsal_phalanx_5" | "l_dactylion" | "l_calcaneus_posterior" | "r_metatarsal_phalanx_1" | "r_metatarsal_phalanx_5" | "r_dactylion" | "r_calcaneus_posterior" | "l_humeral_lateral_epicondyle" | "l_humeral_medial_epicondyle" | "l_olecranon" | "r_humeral_lateral_epicondyle" | "r_humeral_medial_epicondyle" | "r_olecranon" | "l_radiale" | "l_ulnar_styloid" | "l_radial_styloid" | "r_radiale" | "r_ulnar_styloid" | "r_radial_styloid" | "l_metacarpal_phalanx_2" | "l_metacarpal_phalanx_3" | "l_metacarpal_phalanx_5" | "r_metacarpal_phalanx_2" | "r_metacarpal_phalanx_3" | "r_metacarpal_phalanx_5" | "nuchale" | "l_neck_base" | "r_neck_base" | "navel" | "l_ectocanthus" | "r_ectocanthus" | "menton" | "mesosternale" | "opisthocranion" | "l_knee_crease" | "r_knee_crease" | "rear_center_midsagittal_plane" | "buttocks_standing_wall_contact_point" | "l_chest_midsagittal_plane" | "r_chest_midsagittal_plane" | "l_bideltoid" | "r_bideltoid" | "l_carpal_distal_phalanx_1" | "l_carpal_distal_phalanx_2" | "l_carpal_distal_phalanx_3" | "l_carpal_distal_phalanx_4" | "l_carpal_distal_phalanx_5" | "r_carpal_distal_phalanx_1" | "r_carpal_distal_phalanx_2" | "r_carpal_distal_phalanx_3" | "r_carpal_distal_phalanx_4" | "r_carpal_distal_phalanx_5" | "l_tarsal_distal_phalanx_1" | "l_tarsal_distal_phalanx_2" | "l_tarsal_distal_phalanx_3" | "l_tarsal_distal_phalanx_4" | "l_tarsal_distal_phalanx_5" | "r_tarsal_distal_phalanx_1" | "r_tarsal_distal_phalanx_2" | "r_tarsal_distal_phalanx_3" | "r_tarsal_distal_phalanx_4" | "r_tarsal_distal_phalanx_5" | 'etc.'] from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimDisplacer node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Hint:</i> HAnimDisplacer names are based on feature point names. </li> 
 *  <li> <i>Hint:</i> <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html</a> </li> 
 *  <li> <i>Warning:</i> allowed name suffixes include _feature, _action and _config. </li> 
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. Examples: sellion r_infraorbitale etc. as listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> H-Anim Feature Points <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSurfaceFeaturePoints19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSurfaceFeaturePoints19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometricPropertyNode, $additionalInheritanceBaseType=)
	public String getName();

	/**
	 * Accessor method to assign String enumeration value ("skull_vertex" | "glabella" | "sellion" | "l_infraorbitale" | "l_tragion" | "l_gonion" | "r_infraorbitale" | "r_tragion" | "r_gonion" | "supramenton" | "cervicale" | "adams_apple" | "suprasternale" | "substernale" | "l_clavicle" | "l_acromion" | "l_axilla_proximal" | "l_axilla_distal" | "l_axilla_posterior_folds" | "r_clavicle" | "r_acromion" | "r_axilla_proximal" | "r_axilla_distal" | "r_axilla_posterior_folds" | "spine_1_middle_back" | "spine_2_lower_back" | "waist_preferred_anterior" | "waist_preferred_posterior" | "l_rib10" | "l_thelion" | "r_rib10" | "r_thelion" | "l_asis" | "l_iliocristale" | "l_psis" | "r_asis" | "r_iliocristale" | "r_psis" | "crotch" | "l_femoral_lateral_epicondyle" | "l_femoral_medial_epicondyle" | "l_suprapatella" | "l_trochanterion" | "r_femoral_lateral_epicondyle" | "r_femoral_medial_epicondyle" | "r_suprapatella" | "r_trochanterion" | "l_tibiale" | "l_medial_malleolus" | "l_lateral_malleolus" | "l_sphyrion" | "r_tibiale" | "r_medial_malleolus" | "r_lateral_malleolus" | "r_sphyrion" | "l_metatarsal_phalanx_1" | "l_metatarsal_phalanx_5" | "l_dactylion" | "l_calcaneus_posterior" | "r_metatarsal_phalanx_1" | "r_metatarsal_phalanx_5" | "r_dactylion" | "r_calcaneus_posterior" | "l_humeral_lateral_epicondyle" | "l_humeral_medial_epicondyle" | "l_olecranon" | "r_humeral_lateral_epicondyle" | "r_humeral_medial_epicondyle" | "r_olecranon" | "l_radiale" | "l_ulnar_styloid" | "l_radial_styloid" | "r_radiale" | "r_ulnar_styloid" | "r_radial_styloid" | "l_metacarpal_phalanx_2" | "l_metacarpal_phalanx_3" | "l_metacarpal_phalanx_5" | "r_metacarpal_phalanx_2" | "r_metacarpal_phalanx_3" | "r_metacarpal_phalanx_5" | "nuchale" | "l_neck_base" | "r_neck_base" | "navel" | "l_ectocanthus" | "r_ectocanthus" | "menton" | "mesosternale" | "opisthocranion" | "l_knee_crease" | "r_knee_crease" | "rear_center_midsagittal_plane" | "buttocks_standing_wall_contact_point" | "l_chest_midsagittal_plane" | "r_chest_midsagittal_plane" | "l_bideltoid" | "r_bideltoid" | "l_carpal_distal_phalanx_1" | "l_carpal_distal_phalanx_2" | "l_carpal_distal_phalanx_3" | "l_carpal_distal_phalanx_4" | "l_carpal_distal_phalanx_5" | "r_carpal_distal_phalanx_1" | "r_carpal_distal_phalanx_2" | "r_carpal_distal_phalanx_3" | "r_carpal_distal_phalanx_4" | "r_carpal_distal_phalanx_5" | "l_tarsal_distal_phalanx_1" | "l_tarsal_distal_phalanx_2" | "l_tarsal_distal_phalanx_3" | "l_tarsal_distal_phalanx_4" | "l_tarsal_distal_phalanx_5" | "r_tarsal_distal_phalanx_1" | "r_tarsal_distal_phalanx_2" | "r_tarsal_distal_phalanx_3" | "r_tarsal_distal_phalanx_4" | "r_tarsal_distal_phalanx_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that HAnimDisplacer node can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Hint:</i> HAnimDisplacer names are based on feature point names. </li> 
 *  <li> <i>Hint:</i> <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/FeaturePoints.html</a> </li> 
 *  <li> <i>Warning:</i> allowed name suffixes include _feature, _action and _config. </li> 
 *  <li> <i>Warning:</i> name prefix must match ancestor HAnimHumanoid name followed by underscore character, if more than one humanoid appears within a scene file. For example, 'Nancy_' prepended before location name. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. Examples: sellion r_infraorbitale etc. as listed in H-Anim Specification. </li> 
 *  <li> <i>Hint:</i> H-Anim Feature Points <a href="https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSurfaceFeaturePoints19774V1.0.txt" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/HumanoidAnimation/tables/HAnimSurfaceFeaturePoints19774V1.0.txt</a> </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimDisplacer} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimDisplacer setName(String newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The weigh factor has typical range [0,1] and defines the scale factor applied to displacement values before adding them to neutral vertex positions.
 * <ul>
 *  <li> <i> Hint:</i>  apply a non-zero weight factor to see the effect of HAnimDisplacer displacements. </li> 
 * </ul>
	 * @return value of weight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometricPropertyNode, $additionalInheritanceBaseType=)
	public float getWeight();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The weigh factor has typical range [0,1] and defines the scale factor applied to displacement values before adding them to neutral vertex positions.
 * <ul>
 *  <li> <i> Hint:</i>  apply a non-zero weight factor to see the effect of HAnimDisplacer displacements. </li> 
 * </ul>
	 * @param newValue is new value for the weight field.
	 * @return {@link HAnimDisplacer} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimDisplacer setWeight(float newValue);

}
