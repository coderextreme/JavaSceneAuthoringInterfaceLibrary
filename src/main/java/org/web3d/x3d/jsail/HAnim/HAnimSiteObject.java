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

package org.web3d.x3d.jsail.HAnim;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
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
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimSite" target="blank">X3D Abstract Specification: HAnimSite</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimSite" target="_blank">X3D Tooltips: HAnimSite</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class HAnimSiteObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.HAnim.HAnimSite
{
	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=center, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=center, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] center; // SFVec3f

 /* @name=children, @type=MFNode, $javaType=ArrayList<X3DChildNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DChildNode>, $normalizedMemberObjectName=children, $isX3dStatement=false, @acceptableNodeTypes=X3DChildNode */ 
	private ArrayList<X3DNode> children = new ArrayList<>(); // MFNode acceptable node types: X3DChildNode or ProtoInstanceObject

 /* @name=description, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=description, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String description; // SFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

 /* @name=rotation, @type=SFRotation, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=rotation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] rotation; // SFRotation

 /* @name=scale, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=scale, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] scale; // SFVec3f

 /* @name=scaleOrientation, @type=SFRotation, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=scaleOrientation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] scaleOrientation; // SFRotation

 /* @name=translation, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=translation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] translation; // SFVec3f

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "skull_vertex", "glabella", "sellion", "l_infraorbitale", "l_tragion", "l_gonion", "r_infraorbitale", "r_tragion", "r_gonion", "supramenton", "cervicale", "adams_apple", "suprasternale", "substernale", "l_clavicle", "l_acromion", "l_axilla_proximal", "l_axilla_distal", "l_axilla_posterior_folds", "r_clavicle", "r_acromion", "r_axilla_proximal", "r_axilla_distal", "r_axilla_posterior_folds", "spine_1_middle_back", "spine_2_lower_back", "waist_preferred_anterior", "waist_preferred_posterior", "l_rib10", "l_thelion", "r_rib10", "r_thelion", "l_asis", "l_iliocristale", "l_psis", "r_asis", "r_iliocristale", "r_psis", "crotch", "l_femoral_lateral_epicondyle", "l_femoral_medial_epicondyle", "l_suprapatella", "l_trochanterion", "r_femoral_lateral_epicondyle", "r_femoral_medial_epicondyle", "r_suprapatella", "r_trochanterion", "l_tibiale", "l_medial_malleolus", "l_lateral_malleolus", "l_sphyrion", "r_tibiale", "r_medial_malleolus", "r_lateral_malleolus", "r_sphyrion", "l_metatarsal_phalanx_1", "l_metatarsal_phalanx_5", "l_dactylion", "l_calcaneus_posterior", "r_metatarsal_phalanx_1", "r_metatarsal_phalanx_5", "r_dactylion", "r_calcaneus_posterior", "l_humeral_lateral_epicondyle", "l_humeral_medial_epicondyle", "l_olecranon", "r_humeral_lateral_epicondyle", "r_humeral_medial_epicondyle", "r_olecranon", "l_radiale", "l_ulnar_styloid", "l_radial_styloid", "r_radiale", "r_ulnar_styloid", "r_radial_styloid", "l_metacarpal_phalanx_2", "l_metacarpal_phalanx_3", "l_metacarpal_phalanx_5", "r_metacarpal_phalanx_2", "r_metacarpal_phalanx_3", "r_metacarpal_phalanx_5", "nuchale", "l_neck_base", "r_neck_base", "navel", "l_ectocanthus", "r_ectocanthus", "menton", "mesosternale", "opisthocranion", "l_knee_crease", "r_knee_crease", "rear_center_midsagittal_plane", "buttocks_standing_wall_contact_point", "l_chest_midsagittal_plane", "r_chest_midsagittal_plane", "l_bideltoid", "r_bideltoid", "l_carpal_distal_phalanx_1", "l_carpal_distal_phalanx_2", "l_carpal_distal_phalanx_3", "l_carpal_distal_phalanx_4", "l_carpal_distal_phalanx_5", "r_carpal_distal_phalanx_1", "r_carpal_distal_phalanx_2", "r_carpal_distal_phalanx_3", "r_carpal_distal_phalanx_4", "r_carpal_distal_phalanx_5", "l_tarsal_distal_phalanx_1", "l_tarsal_distal_phalanx_2", "l_tarsal_distal_phalanx_3", "l_tarsal_distal_phalanx_4", "l_tarsal_distal_phalanx_5", "r_tarsal_distal_phalanx_1", "r_tarsal_distal_phalanx_2", "r_tarsal_distal_phalanx_3", "r_tarsal_distal_phalanx_4", "r_tarsal_distal_phalanx_5".
<br ><br >
	 * Feature point names for identification of HAnimSite/HAnimDIsplacer nodes as defined in the HAnim Architecture specification. Alternate names are also allowed, aliases from CAESAR and ISO 7250 are provided. HAnimSite/HAnimDisplacer name fields must append suffix _view _tip _pt based on functional purpose, thus strict featurePointNameValues validation is turned off by default. CAESAR feature point names, index and description for use by HAnimDisplacer nodes as defined in the HAnim Architecture specification. ISO 7250-1 points are defined at https://www.iso.org/standard/65246.html Wikipedia overview reference https://en.wikipedia.org/wiki/Anatomical_terminology
	 * @see  <a href="https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/FeaturePoints.html" target="_blank">https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/FeaturePoints.html</a> 
	*/
	public static final ArrayList<String> featurePointNameValues = new ArrayList<>(Arrays.<String>asList("skull_vertex", "glabella", "sellion", "l_infraorbitale", "l_tragion", "l_gonion", "r_infraorbitale", "r_tragion", "r_gonion", "supramenton", "cervicale", "adams_apple", "suprasternale", "substernale", "l_clavicle", "l_acromion", "l_axilla_proximal", "l_axilla_distal", "l_axilla_posterior_folds", "r_clavicle", "r_acromion", "r_axilla_proximal", "r_axilla_distal", "r_axilla_posterior_folds", "spine_1_middle_back", "spine_2_lower_back", "waist_preferred_anterior", "waist_preferred_posterior", "l_rib10", "l_thelion", "r_rib10", "r_thelion", "l_asis", "l_iliocristale", "l_psis", "r_asis", "r_iliocristale", "r_psis", "crotch", "l_femoral_lateral_epicondyle", "l_femoral_medial_epicondyle", "l_suprapatella", "l_trochanterion", "r_femoral_lateral_epicondyle", "r_femoral_medial_epicondyle", "r_suprapatella", "r_trochanterion", "l_tibiale", "l_medial_malleolus", "l_lateral_malleolus", "l_sphyrion", "r_tibiale", "r_medial_malleolus", "r_lateral_malleolus", "r_sphyrion", "l_metatarsal_phalanx_1", "l_metatarsal_phalanx_5", "l_dactylion", "l_calcaneus_posterior", "r_metatarsal_phalanx_1", "r_metatarsal_phalanx_5", "r_dactylion", "r_calcaneus_posterior", "l_humeral_lateral_epicondyle", "l_humeral_medial_epicondyle", "l_olecranon", "r_humeral_lateral_epicondyle", "r_humeral_medial_epicondyle", "r_olecranon", "l_radiale", "l_ulnar_styloid", "l_radial_styloid", "r_radiale", "r_ulnar_styloid", "r_radial_styloid", "l_metacarpal_phalanx_2", "l_metacarpal_phalanx_3", "l_metacarpal_phalanx_5", "r_metacarpal_phalanx_2", "r_metacarpal_phalanx_3", "r_metacarpal_phalanx_5", "nuchale", "l_neck_base", "r_neck_base", "navel", "l_ectocanthus", "r_ectocanthus", "menton", "mesosternale", "opisthocranion", "l_knee_crease", "r_knee_crease", "rear_center_midsagittal_plane", "buttocks_standing_wall_contact_point", "l_chest_midsagittal_plane", "r_chest_midsagittal_plane", "l_bideltoid", "r_bideltoid", "l_carpal_distal_phalanx_1", "l_carpal_distal_phalanx_2", "l_carpal_distal_phalanx_3", "l_carpal_distal_phalanx_4", "l_carpal_distal_phalanx_5", "r_carpal_distal_phalanx_1", "r_carpal_distal_phalanx_2", "r_carpal_distal_phalanx_3", "r_carpal_distal_phalanx_4", "r_carpal_distal_phalanx_5", "l_tarsal_distal_phalanx_1", "l_tarsal_distal_phalanx_2", "l_tarsal_distal_phalanx_3", "l_tarsal_distal_phalanx_4", "l_tarsal_distal_phalanx_5", "r_tarsal_distal_phalanx_1", "r_tarsal_distal_phalanx_2", "r_tarsal_distal_phalanx_3", "r_tarsal_distal_phalanx_4", "r_tarsal_distal_phalanx_5"));

	/** 
	 * <i>Tooltip:</i> CAESAR 2003 skull_vertex matches ISO 7250-1 part 5.22 Vertex (top of head). No corresponding landmark provided in CAESAR 2018.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"skull_vertex"</i> (Java syntax) or <i>skull_vertex</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertex_(anatomy)" target="_blank">https://en.wikipedia.org/wiki/Vertex_(anatomy)</a>  */
	public static final String NAME_SKULL_VERTEX = "skull_vertex";
	/** SFString featurePointNameValues enumeration value "<i>skull_vertex</i>" has unique index 0
	 * @see #NAME_SKULL_VERTEX */
	public static final int NAME_SKULL_VERTEX_INDEX = 0;
	/** SFString featurePointNameValues enumeration value "<i>skull_vertex</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_SKULL_VERTEX */
	public static final int NAME_SKULL_VERTEX_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>skull_vertex</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_SKULL_VERTEX
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_SKULL_VERTEX_PARENT = "skull";
	/** SFString featurePointNameValues enumeration value "<i>skull_vertex</i>" has alias "<i>vertex</i>"
	 * @see #NAME_SKULL_VERTEX */
	public static final String NAME_SKULL_VERTEX_ALIAS = "vertex";

	/** 
	 * <i>Tooltip:</i> glabella is between the eyebrows and above the nose.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"glabella"</i> (Java syntax) or <i>glabella</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Glabella" target="_blank">https://en.wikipedia.org/wiki/Glabella</a>  */
	public static final String NAME_GLABELLA = "glabella";
	/** SFString featurePointNameValues enumeration value "<i>glabella</i>" has unique index 1
	 * @see #NAME_GLABELLA */
	public static final int NAME_GLABELLA_INDEX = 1;
	/** SFString featurePointNameValues enumeration value "<i>glabella</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_GLABELLA */
	public static final int NAME_GLABELLA_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>glabella</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_GLABELLA
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_GLABELLA_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> osseocartilaginous junction of the nasal dorsum.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"sellion"</i> (Java syntax) or <i>sellion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Human_head" target="_blank">https://en.wikipedia.org/wiki/Human_head</a>  */
	public static final String NAME_SELLION = "sellion";
	/** SFString featurePointNameValues enumeration value "<i>sellion</i>" has unique index 2
	 * @see #NAME_SELLION */
	public static final int NAME_SELLION_INDEX = 2;
	/** SFString featurePointNameValues enumeration value "<i>sellion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_SELLION */
	public static final int NAME_SELLION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>sellion</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_SELLION
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_SELLION_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> Left Infraorbitale foramen is opening in maxillary bone of skull located below the infraorbital margin of the orbit.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_infraorbitale"</i> (Java syntax) or <i>l_infraorbitale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Infraorbital_foramen" target="_blank">https://en.wikipedia.org/wiki/Infraorbital_foramen</a>  */
	public static final String NAME_L_INFRAORBITALE = "l_infraorbitale";
	/** SFString featurePointNameValues enumeration value "<i>l_infraorbitale</i>" has unique index 3
	 * @see #NAME_L_INFRAORBITALE */
	public static final int NAME_L_INFRAORBITALE_INDEX = 3;
	/** SFString featurePointNameValues enumeration value "<i>l_infraorbitale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_INFRAORBITALE */
	public static final int NAME_L_INFRAORBITALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_infraorbitale</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_L_INFRAORBITALE
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_L_INFRAORBITALE_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> notch just above the tragus of the ear.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tragion"</i> (Java syntax) or <i>l_tragion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/tragion" target="_blank">https://en.wiktionary.org/wiki/tragion</a>  */
	public static final String NAME_L_TRAGION = "l_tragion";
	/** SFString featurePointNameValues enumeration value "<i>l_tragion</i>" has unique index 4
	 * @see #NAME_L_TRAGION */
	public static final int NAME_L_TRAGION_INDEX = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_tragion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_TRAGION */
	public static final int NAME_L_TRAGION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_tragion</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_L_TRAGION
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_L_TRAGION_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> Left Gonion is midpoint of mandibular angle of the jaw.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_gonion"</i> (Java syntax) or <i>l_gonion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Angle_of_the_mandible" target="_blank">https://en.wikipedia.org/wiki/Angle_of_the_mandible</a>  */
	public static final String NAME_L_GONION = "l_gonion";
	/** SFString featurePointNameValues enumeration value "<i>l_gonion</i>" has unique index 5
	 * @see #NAME_L_GONION */
	public static final int NAME_L_GONION_INDEX = 5;
	/** SFString featurePointNameValues enumeration value "<i>l_gonion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_GONION */
	public static final int NAME_L_GONION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_gonion</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_L_GONION
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_L_GONION_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> Right Infraorbitale foramen is opening in maxillary bone of skull located below the infraorbital margin of the orbit.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_infraorbitale"</i> (Java syntax) or <i>r_infraorbitale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Infraorbital_foramen" target="_blank">https://en.wikipedia.org/wiki/Infraorbital_foramen</a>  */
	public static final String NAME_R_INFRAORBITALE = "r_infraorbitale";
	/** SFString featurePointNameValues enumeration value "<i>r_infraorbitale</i>" has unique index 6
	 * @see #NAME_R_INFRAORBITALE */
	public static final int NAME_R_INFRAORBITALE_INDEX = 6;
	/** SFString featurePointNameValues enumeration value "<i>r_infraorbitale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_INFRAORBITALE */
	public static final int NAME_R_INFRAORBITALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_infraorbitale</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_R_INFRAORBITALE
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_R_INFRAORBITALE_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> notch just above the tragus of the ear.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tragion"</i> (Java syntax) or <i>r_tragion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/tragion" target="_blank">https://en.wiktionary.org/wiki/tragion</a>  */
	public static final String NAME_R_TRAGION = "r_tragion";
	/** SFString featurePointNameValues enumeration value "<i>r_tragion</i>" has unique index 7
	 * @see #NAME_R_TRAGION */
	public static final int NAME_R_TRAGION_INDEX = 7;
	/** SFString featurePointNameValues enumeration value "<i>r_tragion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_TRAGION */
	public static final int NAME_R_TRAGION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_tragion</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_R_TRAGION
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_R_TRAGION_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> Right Gonion is midpoint of the mandibular angle of the jaw.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_gonion"</i> (Java syntax) or <i>r_gonion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Angle_of_the_mandible" target="_blank">https://en.wikipedia.org/wiki/Angle_of_the_mandible</a>  */
	public static final String NAME_R_GONION = "r_gonion";
	/** SFString featurePointNameValues enumeration value "<i>r_gonion</i>" has unique index 8
	 * @see #NAME_R_GONION */
	public static final int NAME_R_GONION_INDEX = 8;
	/** SFString featurePointNameValues enumeration value "<i>r_gonion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_GONION */
	public static final int NAME_R_GONION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_gonion</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_R_GONION
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_R_GONION_PARENT = "skull";

	/** 
	 * <i>Tooltip:</i> center point above tip of chin.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"supramenton"</i> (Java syntax) or <i>supramenton</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="http://www.cs.uu.nl/groups/MG/multimedia/publications/art/rsfp05.pdf" target="_blank">http://www.cs.uu.nl/groups/MG/multimedia/publications/art/rsfp05.pdf</a>  */
	public static final String NAME_SUPRAMENTON = "supramenton";
	/** SFString featurePointNameValues enumeration value "<i>supramenton</i>" has unique index 9
	 * @see #NAME_SUPRAMENTON */
	public static final int NAME_SUPRAMENTON_INDEX = 9;
	/** SFString featurePointNameValues enumeration value "<i>supramenton</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_SUPRAMENTON */
	public static final int NAME_SUPRAMENTON_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>supramenton</i>" has unique parent "<i>jaw</i>" in HAnimSegmentObject
	 * @see #NAME_SUPRAMENTON
	 * @see HAnimSegmentObject#NAME_JAW */
	public static final String NAME_SUPRAMENTON_PARENT = "jaw";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"cervicale"</i> (Java syntax) or <i>cervicale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://www.merriam-webster.com/dictionary/cervicale" target="_blank">https://www.merriam-webster.com/dictionary/cervicale</a>  */
	public static final String NAME_CERVICALE = "cervicale";
	/** SFString featurePointNameValues enumeration value "<i>cervicale</i>" has unique index 10
	 * @see #NAME_CERVICALE */
	public static final int NAME_CERVICALE_INDEX = 10;
	/** SFString featurePointNameValues enumeration value "<i>cervicale</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_CERVICALE */
	public static final int NAME_CERVICALE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>cervicale</i>" has unique parent "<i>t1</i>" in HAnimSegmentObject
	 * @see #NAME_CERVICALE
	 * @see HAnimSegmentObject#NAME_T1 */
	public static final String NAME_CERVICALE_PARENT = "t1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"adams_apple"</i> (Java syntax) or <i>adams_apple</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Adam_s_apple" target="_blank">https://en.wikipedia.org/wiki/Adam_s_apple</a>  */
	public static final String NAME_ADAMS_APPLE = "adams_apple";
	/** SFString featurePointNameValues enumeration value "<i>adams_apple</i>" has unique index 11
	 * @see #NAME_ADAMS_APPLE */
	public static final int NAME_ADAMS_APPLE_INDEX = 11;
	/** SFString featurePointNameValues enumeration value "<i>adams_apple</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_ADAMS_APPLE */
	public static final int NAME_ADAMS_APPLE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>adams_apple</i>" has unique parent "<i>c2</i>" in HAnimSegmentObject
	 * @see #NAME_ADAMS_APPLE
	 * @see HAnimSegmentObject#NAME_C2 */
	public static final String NAME_ADAMS_APPLE_PARENT = "c2";

	/** 
	 * <i>Tooltip:</i> Suprasternale.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"suprasternale"</i> (Java syntax) or <i>suprasternale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://medical-dictionary.thefreedictionary.com/spatium+suprasternale" target="_blank">https://medical-dictionary.thefreedictionary.com/spatium+suprasternale</a>  */
	public static final String NAME_SUPRASTERNALE = "suprasternale";
	/** SFString featurePointNameValues enumeration value "<i>suprasternale</i>" has unique index 12
	 * @see #NAME_SUPRASTERNALE */
	public static final int NAME_SUPRASTERNALE_INDEX = 12;
	/** SFString featurePointNameValues enumeration value "<i>suprasternale</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_SUPRASTERNALE */
	public static final int NAME_SUPRASTERNALE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>suprasternale</i>" has unique parent "<i>t1</i>" in HAnimSegmentObject
	 * @see #NAME_SUPRASTERNALE
	 * @see HAnimSegmentObject#NAME_T1 */
	public static final String NAME_SUPRASTERNALE_PARENT = "t1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"substernale"</i> (Java syntax) or <i>substernale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://medical-dictionary.thefreedictionary.com/spatium+substernale" target="_blank">https://medical-dictionary.thefreedictionary.com/spatium+substernale</a>  */
	public static final String NAME_SUBSTERNALE = "substernale";
	/** SFString featurePointNameValues enumeration value "<i>substernale</i>" has unique index 13
	 * @see #NAME_SUBSTERNALE */
	public static final int NAME_SUBSTERNALE_INDEX = 13;
	/** SFString featurePointNameValues enumeration value "<i>substernale</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_SUBSTERNALE */
	public static final int NAME_SUBSTERNALE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>substernale</i>" has unique parent "<i>t10</i>" in HAnimSegmentObject
	 * @see #NAME_SUBSTERNALE
	 * @see HAnimSegmentObject#NAME_T10 */
	public static final String NAME_SUBSTERNALE_PARENT = "t10";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_clavicle"</i> (Java syntax) or <i>l_clavicle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Clavicle" target="_blank">https://en.wikipedia.org/wiki/Clavicle</a>  */
	public static final String NAME_L_CLAVICLE = "l_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>l_clavicle</i>" has unique index 14
	 * @see #NAME_L_CLAVICLE */
	public static final int NAME_L_CLAVICLE_INDEX = 14;
	/** SFString featurePointNameValues enumeration value "<i>l_clavicle</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CLAVICLE */
	public static final int NAME_L_CLAVICLE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_clavicle</i>" has unique parent "<i>l_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_L_CLAVICLE
	 * @see HAnimSegmentObject#NAME_L_CLAVICLE */
	public static final String NAME_L_CLAVICLE_PARENT = "l_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>l_clavicle</i>" has alias "<i>l_clavicale</i>"
	 * @see #NAME_L_CLAVICLE */
	public static final String NAME_L_CLAVICLE_ALIAS = "l_clavicale";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_acromion"</i> (Java syntax) or <i>l_acromion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Acromion" target="_blank">https://en.wikipedia.org/wiki/Acromion</a>  */
	public static final String NAME_L_ACROMION = "l_acromion";
	/** SFString featurePointNameValues enumeration value "<i>l_acromion</i>" has unique index 15
	 * @see #NAME_L_ACROMION */
	public static final int NAME_L_ACROMION_INDEX = 15;
	/** SFString featurePointNameValues enumeration value "<i>l_acromion</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_ACROMION */
	public static final int NAME_L_ACROMION_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_acromion</i>" has unique parent "<i>l_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_L_ACROMION
	 * @see HAnimSegmentObject#NAME_L_CLAVICLE */
	public static final String NAME_L_ACROMION_PARENT = "l_clavicle";

	/** 
	 * <i>Tooltip:</i> Left Axilla Proximal (Anterior).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_axilla_proximal"</i> (Java syntax) or <i>l_axilla_proximal</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Axilla" target="_blank">https://en.wikipedia.org/wiki/Axilla</a>  */
	public static final String NAME_L_AXILLA_PROXIMAL = "l_axilla_proximal";
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_proximal</i>" has unique index 16
	 * @see #NAME_L_AXILLA_PROXIMAL */
	public static final int NAME_L_AXILLA_PROXIMAL_INDEX = 16;
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_proximal</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_AXILLA_PROXIMAL */
	public static final int NAME_L_AXILLA_PROXIMAL_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_proximal</i>" has unique parent "<i>l_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_L_AXILLA_PROXIMAL
	 * @see HAnimSegmentObject#NAME_L_CLAVICLE */
	public static final String NAME_L_AXILLA_PROXIMAL_PARENT = "l_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_proximal</i>" has alias "<i>l_axilla_ant</i>"
	 * @see #NAME_L_AXILLA_PROXIMAL */
	public static final String NAME_L_AXILLA_PROXIMAL_ALIAS = "l_axilla_ant";

	/** 
	 * <i>Tooltip:</i> Left Axilla Distal (Posterior).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_axilla_distal"</i> (Java syntax) or <i>l_axilla_distal</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Axilla" target="_blank">https://en.wikipedia.org/wiki/Axilla</a>  */
	public static final String NAME_L_AXILLA_DISTAL = "l_axilla_distal";
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_distal</i>" has unique index 17
	 * @see #NAME_L_AXILLA_DISTAL */
	public static final int NAME_L_AXILLA_DISTAL_INDEX = 17;
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_distal</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_AXILLA_DISTAL */
	public static final int NAME_L_AXILLA_DISTAL_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_distal</i>" has unique parent "<i>l_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_L_AXILLA_DISTAL
	 * @see HAnimSegmentObject#NAME_L_CLAVICLE */
	public static final String NAME_L_AXILLA_DISTAL_PARENT = "l_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_distal</i>" has alias "<i>l_axilla_post</i>"
	 * @see #NAME_L_AXILLA_DISTAL */
	public static final String NAME_L_AXILLA_DISTAL_ALIAS = "l_axilla_post";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_axilla_posterior_folds"</i> (Java syntax) or <i>l_axilla_posterior_folds</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Axilla" target="_blank">https://en.wikipedia.org/wiki/Axilla</a>  */
	public static final String NAME_L_AXILLA_POSTERIOR_FOLDS = "l_axilla_posterior_folds";
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_posterior_folds</i>" has unique index 18
	 * @see #NAME_L_AXILLA_POSTERIOR_FOLDS */
	public static final int NAME_L_AXILLA_POSTERIOR_FOLDS_INDEX = 18;
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_posterior_folds</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_AXILLA_POSTERIOR_FOLDS */
	public static final int NAME_L_AXILLA_POSTERIOR_FOLDS_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_axilla_posterior_folds</i>" has unique parent "<i>l_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_L_AXILLA_POSTERIOR_FOLDS
	 * @see HAnimSegmentObject#NAME_L_CLAVICLE */
	public static final String NAME_L_AXILLA_POSTERIOR_FOLDS_PARENT = "l_clavicle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_clavicle"</i> (Java syntax) or <i>r_clavicle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Clavicle" target="_blank">https://en.wikipedia.org/wiki/Clavicle</a>  */
	public static final String NAME_R_CLAVICLE = "r_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>r_clavicle</i>" has unique index 19
	 * @see #NAME_R_CLAVICLE */
	public static final int NAME_R_CLAVICLE_INDEX = 19;
	/** SFString featurePointNameValues enumeration value "<i>r_clavicle</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CLAVICLE */
	public static final int NAME_R_CLAVICLE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_clavicle</i>" has unique parent "<i>r_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_R_CLAVICLE
	 * @see HAnimSegmentObject#NAME_R_CLAVICLE */
	public static final String NAME_R_CLAVICLE_PARENT = "r_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>r_clavicle</i>" has alias "<i>r_clavicale</i>"
	 * @see #NAME_R_CLAVICLE */
	public static final String NAME_R_CLAVICLE_ALIAS = "r_clavicale";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_acromion"</i> (Java syntax) or <i>r_acromion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Acromion" target="_blank">https://en.wikipedia.org/wiki/Acromion</a>  */
	public static final String NAME_R_ACROMION = "r_acromion";
	/** SFString featurePointNameValues enumeration value "<i>r_acromion</i>" has unique index 20
	 * @see #NAME_R_ACROMION */
	public static final int NAME_R_ACROMION_INDEX = 20;
	/** SFString featurePointNameValues enumeration value "<i>r_acromion</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_ACROMION */
	public static final int NAME_R_ACROMION_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_acromion</i>" has unique parent "<i>r_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_R_ACROMION
	 * @see HAnimSegmentObject#NAME_R_CLAVICLE */
	public static final String NAME_R_ACROMION_PARENT = "r_clavicle";

	/** 
	 * <i>Tooltip:</i> Right Axilla Proximal (Anterior).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_axilla_proximal"</i> (Java syntax) or <i>r_axilla_proximal</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Axilla" target="_blank">https://en.wikipedia.org/wiki/Axilla</a>  */
	public static final String NAME_R_AXILLA_PROXIMAL = "r_axilla_proximal";
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_proximal</i>" has unique index 21
	 * @see #NAME_R_AXILLA_PROXIMAL */
	public static final int NAME_R_AXILLA_PROXIMAL_INDEX = 21;
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_proximal</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_AXILLA_PROXIMAL */
	public static final int NAME_R_AXILLA_PROXIMAL_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_proximal</i>" has unique parent "<i>r_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_R_AXILLA_PROXIMAL
	 * @see HAnimSegmentObject#NAME_R_CLAVICLE */
	public static final String NAME_R_AXILLA_PROXIMAL_PARENT = "r_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_proximal</i>" has alias "<i>r_axilla_ant</i>"
	 * @see #NAME_R_AXILLA_PROXIMAL */
	public static final String NAME_R_AXILLA_PROXIMAL_ALIAS = "r_axilla_ant";

	/** 
	 * <i>Tooltip:</i> Right Axilla Distal (Posterior).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_axilla_distal"</i> (Java syntax) or <i>r_axilla_distal</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Axilla" target="_blank">https://en.wikipedia.org/wiki/Axilla</a>  */
	public static final String NAME_R_AXILLA_DISTAL = "r_axilla_distal";
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_distal</i>" has unique index 22
	 * @see #NAME_R_AXILLA_DISTAL */
	public static final int NAME_R_AXILLA_DISTAL_INDEX = 22;
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_distal</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_AXILLA_DISTAL */
	public static final int NAME_R_AXILLA_DISTAL_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_distal</i>" has unique parent "<i>r_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_R_AXILLA_DISTAL
	 * @see HAnimSegmentObject#NAME_R_CLAVICLE */
	public static final String NAME_R_AXILLA_DISTAL_PARENT = "r_clavicle";
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_distal</i>" has alias "<i>r_axilla_post</i>"
	 * @see #NAME_R_AXILLA_DISTAL */
	public static final String NAME_R_AXILLA_DISTAL_ALIAS = "r_axilla_post";

	/** 
	 * <i>Tooltip:</i> Right Posterior Axillary Folds.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_axilla_posterior_folds"</i> (Java syntax) or <i>r_axilla_posterior_folds</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Axilla" target="_blank">https://en.wikipedia.org/wiki/Axilla</a>  */
	public static final String NAME_R_AXILLA_POSTERIOR_FOLDS = "r_axilla_posterior_folds";
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_posterior_folds</i>" has unique index 23
	 * @see #NAME_R_AXILLA_POSTERIOR_FOLDS */
	public static final int NAME_R_AXILLA_POSTERIOR_FOLDS_INDEX = 23;
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_posterior_folds</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_AXILLA_POSTERIOR_FOLDS */
	public static final int NAME_R_AXILLA_POSTERIOR_FOLDS_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_axilla_posterior_folds</i>" has unique parent "<i>r_clavicle</i>" in HAnimSegmentObject
	 * @see #NAME_R_AXILLA_POSTERIOR_FOLDS
	 * @see HAnimSegmentObject#NAME_R_CLAVICLE */
	public static final String NAME_R_AXILLA_POSTERIOR_FOLDS_PARENT = "r_clavicle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"spine_1_middle_back"</i> (Java syntax) or <i>spine_1_middle_back</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_SPINE_1_MIDDLE_BACK = "spine_1_middle_back";
	/** SFString featurePointNameValues enumeration value "<i>spine_1_middle_back</i>" has unique index 24
	 * @see #NAME_SPINE_1_MIDDLE_BACK */
	public static final int NAME_SPINE_1_MIDDLE_BACK_INDEX = 24;
	/** SFString featurePointNameValues enumeration value "<i>spine_1_middle_back</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_SPINE_1_MIDDLE_BACK */
	public static final int NAME_SPINE_1_MIDDLE_BACK_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>spine_1_middle_back</i>" has unique parent "<i>t5</i>" in HAnimSegmentObject
	 * @see #NAME_SPINE_1_MIDDLE_BACK
	 * @see HAnimSegmentObject#NAME_T5 */
	public static final String NAME_SPINE_1_MIDDLE_BACK_PARENT = "t5";
	/** SFString featurePointNameValues enumeration value "<i>spine_1_middle_back</i>" has alias "<i>middle back</i>"
	 * @see #NAME_SPINE_1_MIDDLE_BACK */
	public static final String NAME_SPINE_1_MIDDLE_BACK_ALIAS = "middle back";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"spine_2_lower_back"</i> (Java syntax) or <i>spine_2_lower_back</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_SPINE_2_LOWER_BACK = "spine_2_lower_back";
	/** SFString featurePointNameValues enumeration value "<i>spine_2_lower_back</i>" has unique index 25
	 * @see #NAME_SPINE_2_LOWER_BACK */
	public static final int NAME_SPINE_2_LOWER_BACK_INDEX = 25;
	/** SFString featurePointNameValues enumeration value "<i>spine_2_lower_back</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_SPINE_2_LOWER_BACK */
	public static final int NAME_SPINE_2_LOWER_BACK_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>spine_2_lower_back</i>" has unique parent "<i>l2</i>" in HAnimSegmentObject
	 * @see #NAME_SPINE_2_LOWER_BACK
	 * @see HAnimSegmentObject#NAME_L2 */
	public static final String NAME_SPINE_2_LOWER_BACK_PARENT = "l2";
	/** SFString featurePointNameValues enumeration value "<i>spine_2_lower_back</i>" has alias "<i>lower back</i>"
	 * @see #NAME_SPINE_2_LOWER_BACK */
	public static final String NAME_SPINE_2_LOWER_BACK_ALIAS = "lower back";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"waist_preferred_anterior"</i> (Java syntax) or <i>waist_preferred_anterior</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Waist" target="_blank">https://en.wikipedia.org/wiki/Waist</a>  */
	public static final String NAME_WAIST_PREFERRED_ANTERIOR = "waist_preferred_anterior";
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_anterior</i>" has unique index 26
	 * @see #NAME_WAIST_PREFERRED_ANTERIOR */
	public static final int NAME_WAIST_PREFERRED_ANTERIOR_INDEX = 26;
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_anterior</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_WAIST_PREFERRED_ANTERIOR */
	public static final int NAME_WAIST_PREFERRED_ANTERIOR_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_anterior</i>" has unique parent "<i>l2</i>" in HAnimSegmentObject
	 * @see #NAME_WAIST_PREFERRED_ANTERIOR
	 * @see HAnimSegmentObject#NAME_L2 */
	public static final String NAME_WAIST_PREFERRED_ANTERIOR_PARENT = "l2";
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_anterior</i>" has alias "<i>waist_preferred_post</i>"
	 * @see #NAME_WAIST_PREFERRED_ANTERIOR */
	public static final String NAME_WAIST_PREFERRED_ANTERIOR_ALIAS = "waist_preferred_post";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"waist_preferred_posterior"</i> (Java syntax) or <i>waist_preferred_posterior</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Waist" target="_blank">https://en.wikipedia.org/wiki/Waist</a>  */
	public static final String NAME_WAIST_PREFERRED_POSTERIOR = "waist_preferred_posterior";
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_posterior</i>" has unique index 27
	 * @see #NAME_WAIST_PREFERRED_POSTERIOR */
	public static final int NAME_WAIST_PREFERRED_POSTERIOR_INDEX = 27;
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_posterior</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_WAIST_PREFERRED_POSTERIOR */
	public static final int NAME_WAIST_PREFERRED_POSTERIOR_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_posterior</i>" has unique parent "<i>l2</i>" in HAnimSegmentObject
	 * @see #NAME_WAIST_PREFERRED_POSTERIOR
	 * @see HAnimSegmentObject#NAME_L2 */
	public static final String NAME_WAIST_PREFERRED_POSTERIOR_PARENT = "l2";
	/** SFString featurePointNameValues enumeration value "<i>waist_preferred_posterior</i>" has alias "<i>waist_preferred_ant</i>"
	 * @see #NAME_WAIST_PREFERRED_POSTERIOR */
	public static final String NAME_WAIST_PREFERRED_POSTERIOR_ALIAS = "waist_preferred_ant";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_rib10"</i> (Java syntax) or <i>l_rib10</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Rib" target="_blank">https://en.wikipedia.org/wiki/Rib</a>  */
	public static final String NAME_L_RIB10 = "l_rib10";
	/** SFString featurePointNameValues enumeration value "<i>l_rib10</i>" has unique index 28
	 * @see #NAME_L_RIB10 */
	public static final int NAME_L_RIB10_INDEX = 28;
	/** SFString featurePointNameValues enumeration value "<i>l_rib10</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_RIB10 */
	public static final int NAME_L_RIB10_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>l_rib10</i>" has unique parent "<i>l2</i>" in HAnimSegmentObject
	 * @see #NAME_L_RIB10
	 * @see HAnimSegmentObject#NAME_L2 */
	public static final String NAME_L_RIB10_PARENT = "l2";
	/** SFString featurePointNameValues enumeration value "<i>l_rib10</i>" has alias "<i>l_rib10_midspine</i>"
	 * @see #NAME_L_RIB10 */
	public static final String NAME_L_RIB10_ALIAS = "l_rib10_midspine";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_thelion"</i> (Java syntax) or <i>l_thelion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://www.cdc.gov/niosh/data/datasets/rd-1008-2016-0/pdfs/EMT-Data-Dictionary-508.pdf" target="_blank">https://www.cdc.gov/niosh/data/datasets/rd-1008-2016-0/pdfs/EMT-Data-Dictionary-508.pdf</a>  */
	public static final String NAME_L_THELION = "l_thelion";
	/** SFString featurePointNameValues enumeration value "<i>l_thelion</i>" has unique index 29
	 * @see #NAME_L_THELION */
	public static final int NAME_L_THELION_INDEX = 29;
	/** SFString featurePointNameValues enumeration value "<i>l_thelion</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_THELION */
	public static final int NAME_L_THELION_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>l_thelion</i>" has unique parent "<i>t9</i>" in HAnimSegmentObject
	 * @see #NAME_L_THELION
	 * @see HAnimSegmentObject#NAME_T9 */
	public static final String NAME_L_THELION_PARENT = "t9";
	/** SFString featurePointNameValues enumeration value "<i>l_thelion</i>" has alias "<i>Left Bustpoint</i>"
	 * @see #NAME_L_THELION */
	public static final String NAME_L_THELION_ALIAS = "Left Bustpoint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_rib10"</i> (Java syntax) or <i>r_rib10</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Rib" target="_blank">https://en.wikipedia.org/wiki/Rib</a>  */
	public static final String NAME_R_RIB10 = "r_rib10";
	/** SFString featurePointNameValues enumeration value "<i>r_rib10</i>" has unique index 30
	 * @see #NAME_R_RIB10 */
	public static final int NAME_R_RIB10_INDEX = 30;
	/** SFString featurePointNameValues enumeration value "<i>r_rib10</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_RIB10 */
	public static final int NAME_R_RIB10_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>r_rib10</i>" has unique parent "<i>l2</i>" in HAnimSegmentObject
	 * @see #NAME_R_RIB10
	 * @see HAnimSegmentObject#NAME_L2 */
	public static final String NAME_R_RIB10_PARENT = "l2";
	/** SFString featurePointNameValues enumeration value "<i>r_rib10</i>" has alias "<i>r_rib10_midspine</i>"
	 * @see #NAME_R_RIB10 */
	public static final String NAME_R_RIB10_ALIAS = "r_rib10_midspine";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_thelion"</i> (Java syntax) or <i>r_thelion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://www.cdc.gov/niosh/data/datasets/rd-1008-2016-0/pdfs/EMT-Data-Dictionary-508.pdf" target="_blank">https://www.cdc.gov/niosh/data/datasets/rd-1008-2016-0/pdfs/EMT-Data-Dictionary-508.pdf</a>  */
	public static final String NAME_R_THELION = "r_thelion";
	/** SFString featurePointNameValues enumeration value "<i>r_thelion</i>" has unique index 31
	 * @see #NAME_R_THELION */
	public static final int NAME_R_THELION_INDEX = 31;
	/** SFString featurePointNameValues enumeration value "<i>r_thelion</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_THELION */
	public static final int NAME_R_THELION_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>r_thelion</i>" has unique parent "<i>t9</i>" in HAnimSegmentObject
	 * @see #NAME_R_THELION
	 * @see HAnimSegmentObject#NAME_T9 */
	public static final String NAME_R_THELION_PARENT = "t9";
	/** SFString featurePointNameValues enumeration value "<i>r_thelion</i>" has alias "<i>Right Bustpoint</i>"
	 * @see #NAME_R_THELION */
	public static final String NAME_R_THELION_ALIAS = "Right Bustpoint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_asis"</i> (Java syntax) or <i>l_asis</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Anterior_superior_iliac_spine" target="_blank">https://en.wikipedia.org/wiki/Anterior_superior_iliac_spine</a>  */
	public static final String NAME_L_ASIS = "l_asis";
	/** SFString featurePointNameValues enumeration value "<i>l_asis</i>" has unique index 32
	 * @see #NAME_L_ASIS */
	public static final int NAME_L_ASIS_INDEX = 32;
	/** SFString featurePointNameValues enumeration value "<i>l_asis</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_ASIS */
	public static final int NAME_L_ASIS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_asis</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_L_ASIS
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_L_ASIS_PARENT = "pelvis";
	/** SFString featurePointNameValues enumeration value "<i>l_asis</i>" has alias "<i>Leftt Anterior Superior Iliac Spine</i>"
	 * @see #NAME_L_ASIS */
	public static final String NAME_L_ASIS_ALIAS = "Leftt Anterior Superior Iliac Spine";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_iliocristale"</i> (Java syntax) or <i>l_iliocristale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://www.topendsports.com/testing/skinfold-iliac-crest.htm" target="_blank">https://www.topendsports.com/testing/skinfold-iliac-crest.htm</a>  */
	public static final String NAME_L_ILIOCRISTALE = "l_iliocristale";
	/** SFString featurePointNameValues enumeration value "<i>l_iliocristale</i>" has unique index 33
	 * @see #NAME_L_ILIOCRISTALE */
	public static final int NAME_L_ILIOCRISTALE_INDEX = 33;
	/** SFString featurePointNameValues enumeration value "<i>l_iliocristale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_ILIOCRISTALE */
	public static final int NAME_L_ILIOCRISTALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_iliocristale</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_L_ILIOCRISTALE
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_L_ILIOCRISTALE_PARENT = "pelvis";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_psis"</i> (Java syntax) or <i>l_psis</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Posterior_superior_iliac_spine" target="_blank">https://en.wikipedia.org/wiki/Posterior_superior_iliac_spine</a>  */
	public static final String NAME_L_PSIS = "l_psis";
	/** SFString featurePointNameValues enumeration value "<i>l_psis</i>" has unique index 34
	 * @see #NAME_L_PSIS */
	public static final int NAME_L_PSIS_INDEX = 34;
	/** SFString featurePointNameValues enumeration value "<i>l_psis</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_PSIS */
	public static final int NAME_L_PSIS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_psis</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_L_PSIS
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_L_PSIS_PARENT = "pelvis";
	/** SFString featurePointNameValues enumeration value "<i>l_psis</i>" has alias "<i>Left Posterior Superior Iliac Spine</i>"
	 * @see #NAME_L_PSIS */
	public static final String NAME_L_PSIS_ALIAS = "Left Posterior Superior Iliac Spine";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_asis"</i> (Java syntax) or <i>r_asis</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Anterior_superior_iliac_spine" target="_blank">https://en.wikipedia.org/wiki/Anterior_superior_iliac_spine</a>  */
	public static final String NAME_R_ASIS = "r_asis";
	/** SFString featurePointNameValues enumeration value "<i>r_asis</i>" has unique index 35
	 * @see #NAME_R_ASIS */
	public static final int NAME_R_ASIS_INDEX = 35;
	/** SFString featurePointNameValues enumeration value "<i>r_asis</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_ASIS */
	public static final int NAME_R_ASIS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_asis</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_R_ASIS
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_R_ASIS_PARENT = "pelvis";
	/** SFString featurePointNameValues enumeration value "<i>r_asis</i>" has alias "<i>Right Anterior Superior Iliac Spine</i>"
	 * @see #NAME_R_ASIS */
	public static final String NAME_R_ASIS_ALIAS = "Right Anterior Superior Iliac Spine";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_iliocristale"</i> (Java syntax) or <i>r_iliocristale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://www.topendsports.com/testing/skinfold-iliac-crest.htm" target="_blank">https://www.topendsports.com/testing/skinfold-iliac-crest.htm</a>  */
	public static final String NAME_R_ILIOCRISTALE = "r_iliocristale";
	/** SFString featurePointNameValues enumeration value "<i>r_iliocristale</i>" has unique index 36
	 * @see #NAME_R_ILIOCRISTALE */
	public static final int NAME_R_ILIOCRISTALE_INDEX = 36;
	/** SFString featurePointNameValues enumeration value "<i>r_iliocristale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_ILIOCRISTALE */
	public static final int NAME_R_ILIOCRISTALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_iliocristale</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_R_ILIOCRISTALE
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_R_ILIOCRISTALE_PARENT = "pelvis";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_psis"</i> (Java syntax) or <i>r_psis</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Posterior_superior_iliac_spine" target="_blank">https://en.wikipedia.org/wiki/Posterior_superior_iliac_spine</a>  */
	public static final String NAME_R_PSIS = "r_psis";
	/** SFString featurePointNameValues enumeration value "<i>r_psis</i>" has unique index 37
	 * @see #NAME_R_PSIS */
	public static final int NAME_R_PSIS_INDEX = 37;
	/** SFString featurePointNameValues enumeration value "<i>r_psis</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_PSIS */
	public static final int NAME_R_PSIS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_psis</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_R_PSIS
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_R_PSIS_PARENT = "pelvis";
	/** SFString featurePointNameValues enumeration value "<i>r_psis</i>" has alias "<i>Right Posterior Superior Iliac Spine</i>"
	 * @see #NAME_R_PSIS */
	public static final String NAME_R_PSIS_ALIAS = "Right Posterior Superior Iliac Spine";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"crotch"</i> (Java syntax) or <i>crotch</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Crotch" target="_blank">https://en.wikipedia.org/wiki/Crotch</a>  */
	public static final String NAME_CROTCH = "crotch";
	/** SFString featurePointNameValues enumeration value "<i>crotch</i>" has unique index 38
	 * @see #NAME_CROTCH */
	public static final int NAME_CROTCH_INDEX = 38;
	/** SFString featurePointNameValues enumeration value "<i>crotch</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_CROTCH */
	public static final int NAME_CROTCH_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>crotch</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_CROTCH
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_CROTCH_PARENT = "pelvis";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_femoral_lateral_epicondyle"</i> (Java syntax) or <i>l_femoral_lateral_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_femur" target="_blank">https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_femur</a>  */
	public static final String NAME_L_FEMORAL_LATERAL_EPICONDYLE = "l_femoral_lateral_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_lateral_epicondyle</i>" has unique index 39
	 * @see #NAME_L_FEMORAL_LATERAL_EPICONDYLE */
	public static final int NAME_L_FEMORAL_LATERAL_EPICONDYLE_INDEX = 39;
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_lateral_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_FEMORAL_LATERAL_EPICONDYLE */
	public static final int NAME_L_FEMORAL_LATERAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_lateral_epicondyle</i>" has unique parent "<i>l_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_L_FEMORAL_LATERAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_L_THIGH */
	public static final String NAME_L_FEMORAL_LATERAL_EPICONDYLE_PARENT = "l_thigh";
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_lateral_epicondyle</i>" has alias "<i>l_femoral_lateral_epicn</i>"
	 * @see #NAME_L_FEMORAL_LATERAL_EPICONDYLE */
	public static final String NAME_L_FEMORAL_LATERAL_EPICONDYLE_ALIAS = "l_femoral_lateral_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_femoral_medial_epicondyle"</i> (Java syntax) or <i>l_femoral_medial_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_femur" target="_blank">https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_femur</a>  */
	public static final String NAME_L_FEMORAL_MEDIAL_EPICONDYLE = "l_femoral_medial_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_medial_epicondyle</i>" has unique index 40
	 * @see #NAME_L_FEMORAL_MEDIAL_EPICONDYLE */
	public static final int NAME_L_FEMORAL_MEDIAL_EPICONDYLE_INDEX = 40;
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_medial_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_FEMORAL_MEDIAL_EPICONDYLE */
	public static final int NAME_L_FEMORAL_MEDIAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_medial_epicondyle</i>" has unique parent "<i>l_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_L_FEMORAL_MEDIAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_L_THIGH */
	public static final String NAME_L_FEMORAL_MEDIAL_EPICONDYLE_PARENT = "l_thigh";
	/** SFString featurePointNameValues enumeration value "<i>l_femoral_medial_epicondyle</i>" has alias "<i>l_femoral_medial_epicn</i>"
	 * @see #NAME_L_FEMORAL_MEDIAL_EPICONDYLE */
	public static final String NAME_L_FEMORAL_MEDIAL_EPICONDYLE_ALIAS = "l_femoral_medial_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_suprapatella"</i> (Java syntax) or <i>l_suprapatella</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Patella" target="_blank">https://en.wikipedia.org/wiki/Patella</a>  */
	public static final String NAME_L_SUPRAPATELLA = "l_suprapatella";
	/** SFString featurePointNameValues enumeration value "<i>l_suprapatella</i>" has unique index 41
	 * @see #NAME_L_SUPRAPATELLA */
	public static final int NAME_L_SUPRAPATELLA_INDEX = 41;
	/** SFString featurePointNameValues enumeration value "<i>l_suprapatella</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_SUPRAPATELLA */
	public static final int NAME_L_SUPRAPATELLA_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_suprapatella</i>" has unique parent "<i>l_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_L_SUPRAPATELLA
	 * @see HAnimSegmentObject#NAME_L_THIGH */
	public static final String NAME_L_SUPRAPATELLA_PARENT = "l_thigh";
	/** SFString featurePointNameValues enumeration value "<i>l_suprapatella</i>" has alias "<i>l_kneecap</i>"
	 * @see #NAME_L_SUPRAPATELLA */
	public static final String NAME_L_SUPRAPATELLA_ALIAS = "l_kneecap";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_trochanterion"</i> (Java syntax) or <i>l_trochanterion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Trochanter" target="_blank">https://en.wikipedia.org/wiki/Trochanter</a>  */
	public static final String NAME_L_TROCHANTERION = "l_trochanterion";
	/** SFString featurePointNameValues enumeration value "<i>l_trochanterion</i>" has unique index 42
	 * @see #NAME_L_TROCHANTERION */
	public static final int NAME_L_TROCHANTERION_INDEX = 42;
	/** SFString featurePointNameValues enumeration value "<i>l_trochanterion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_TROCHANTERION */
	public static final int NAME_L_TROCHANTERION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_trochanterion</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_L_TROCHANTERION
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_L_TROCHANTERION_PARENT = "pelvis";
	/** SFString featurePointNameValues enumeration value "<i>l_trochanterion</i>" has alias "<i>l_trochanter</i>"
	 * @see #NAME_L_TROCHANTERION */
	public static final String NAME_L_TROCHANTERION_ALIAS = "l_trochanter";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_femoral_lateral_epicondyle"</i> (Java syntax) or <i>r_femoral_lateral_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_femur" target="_blank">https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_femur</a>  */
	public static final String NAME_R_FEMORAL_LATERAL_EPICONDYLE = "r_femoral_lateral_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_lateral_epicondyle</i>" has unique index 43
	 * @see #NAME_R_FEMORAL_LATERAL_EPICONDYLE */
	public static final int NAME_R_FEMORAL_LATERAL_EPICONDYLE_INDEX = 43;
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_lateral_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_FEMORAL_LATERAL_EPICONDYLE */
	public static final int NAME_R_FEMORAL_LATERAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_lateral_epicondyle</i>" has unique parent "<i>r_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_R_FEMORAL_LATERAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_R_THIGH */
	public static final String NAME_R_FEMORAL_LATERAL_EPICONDYLE_PARENT = "r_thigh";
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_lateral_epicondyle</i>" has alias "<i>r_femoral_lateral_epicn</i>"
	 * @see #NAME_R_FEMORAL_LATERAL_EPICONDYLE */
	public static final String NAME_R_FEMORAL_LATERAL_EPICONDYLE_ALIAS = "r_femoral_lateral_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_femoral_medial_epicondyle"</i> (Java syntax) or <i>r_femoral_medial_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_femur" target="_blank">https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_femur</a>  */
	public static final String NAME_R_FEMORAL_MEDIAL_EPICONDYLE = "r_femoral_medial_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_medial_epicondyle</i>" has unique index 44
	 * @see #NAME_R_FEMORAL_MEDIAL_EPICONDYLE */
	public static final int NAME_R_FEMORAL_MEDIAL_EPICONDYLE_INDEX = 44;
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_medial_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_FEMORAL_MEDIAL_EPICONDYLE */
	public static final int NAME_R_FEMORAL_MEDIAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_medial_epicondyle</i>" has unique parent "<i>r_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_R_FEMORAL_MEDIAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_R_THIGH */
	public static final String NAME_R_FEMORAL_MEDIAL_EPICONDYLE_PARENT = "r_thigh";
	/** SFString featurePointNameValues enumeration value "<i>r_femoral_medial_epicondyle</i>" has alias "<i>r_femoral_medial_epicn</i>"
	 * @see #NAME_R_FEMORAL_MEDIAL_EPICONDYLE */
	public static final String NAME_R_FEMORAL_MEDIAL_EPICONDYLE_ALIAS = "r_femoral_medial_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_suprapatella"</i> (Java syntax) or <i>r_suprapatella</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Patella" target="_blank">https://en.wikipedia.org/wiki/Patella</a>  */
	public static final String NAME_R_SUPRAPATELLA = "r_suprapatella";
	/** SFString featurePointNameValues enumeration value "<i>r_suprapatella</i>" has unique index 45
	 * @see #NAME_R_SUPRAPATELLA */
	public static final int NAME_R_SUPRAPATELLA_INDEX = 45;
	/** SFString featurePointNameValues enumeration value "<i>r_suprapatella</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_SUPRAPATELLA */
	public static final int NAME_R_SUPRAPATELLA_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_suprapatella</i>" has unique parent "<i>r_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_R_SUPRAPATELLA
	 * @see HAnimSegmentObject#NAME_R_THIGH */
	public static final String NAME_R_SUPRAPATELLA_PARENT = "r_thigh";
	/** SFString featurePointNameValues enumeration value "<i>r_suprapatella</i>" has alias "<i>r_kneecap</i>"
	 * @see #NAME_R_SUPRAPATELLA */
	public static final String NAME_R_SUPRAPATELLA_ALIAS = "r_kneecap";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_trochanterion"</i> (Java syntax) or <i>r_trochanterion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Trochanter" target="_blank">https://en.wikipedia.org/wiki/Trochanter</a>  */
	public static final String NAME_R_TROCHANTERION = "r_trochanterion";
	/** SFString featurePointNameValues enumeration value "<i>r_trochanterion</i>" has unique index 46
	 * @see #NAME_R_TROCHANTERION */
	public static final int NAME_R_TROCHANTERION_INDEX = 46;
	/** SFString featurePointNameValues enumeration value "<i>r_trochanterion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_TROCHANTERION */
	public static final int NAME_R_TROCHANTERION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_trochanterion</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_R_TROCHANTERION
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_R_TROCHANTERION_PARENT = "pelvis";
	/** SFString featurePointNameValues enumeration value "<i>r_trochanterion</i>" has alias "<i>r_trochanter</i>"
	 * @see #NAME_R_TROCHANTERION */
	public static final String NAME_R_TROCHANTERION_ALIAS = "r_trochanter";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tibiale"</i> (Java syntax) or <i>l_tibiale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Accessory_navicular_bone" target="_blank">https://en.wikipedia.org/wiki/Accessory_navicular_bone</a>  */
	public static final String NAME_L_TIBIALE = "l_tibiale";
	/** SFString featurePointNameValues enumeration value "<i>l_tibiale</i>" has unique index 47
	 * @see #NAME_L_TIBIALE */
	public static final int NAME_L_TIBIALE_INDEX = 47;
	/** SFString featurePointNameValues enumeration value "<i>l_tibiale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_TIBIALE */
	public static final int NAME_L_TIBIALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_tibiale</i>" has unique parent "<i>l_calf</i>" in HAnimSegmentObject
	 * @see #NAME_L_TIBIALE
	 * @see HAnimSegmentObject#NAME_L_CALF */
	public static final String NAME_L_TIBIALE_PARENT = "l_calf";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_medial_malleolus"</i> (Java syntax) or <i>l_medial_malleolus</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Malleolus" target="_blank">https://en.wikipedia.org/wiki/Malleolus</a>  */
	public static final String NAME_L_MEDIAL_MALLEOLUS = "l_medial_malleolus";
	/** SFString featurePointNameValues enumeration value "<i>l_medial_malleolus</i>" has unique index 48
	 * @see #NAME_L_MEDIAL_MALLEOLUS */
	public static final int NAME_L_MEDIAL_MALLEOLUS_INDEX = 48;
	/** SFString featurePointNameValues enumeration value "<i>l_medial_malleolus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_MEDIAL_MALLEOLUS */
	public static final int NAME_L_MEDIAL_MALLEOLUS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_medial_malleolus</i>" has unique parent "<i>l_calf</i>" in HAnimSegmentObject
	 * @see #NAME_L_MEDIAL_MALLEOLUS
	 * @see HAnimSegmentObject#NAME_L_CALF */
	public static final String NAME_L_MEDIAL_MALLEOLUS_PARENT = "l_calf";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_lateral_malleolus"</i> (Java syntax) or <i>l_lateral_malleolus</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Malleolus" target="_blank">https://en.wikipedia.org/wiki/Malleolus</a>  */
	public static final String NAME_L_LATERAL_MALLEOLUS = "l_lateral_malleolus";
	/** SFString featurePointNameValues enumeration value "<i>l_lateral_malleolus</i>" has unique index 49
	 * @see #NAME_L_LATERAL_MALLEOLUS */
	public static final int NAME_L_LATERAL_MALLEOLUS_INDEX = 49;
	/** SFString featurePointNameValues enumeration value "<i>l_lateral_malleolus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_LATERAL_MALLEOLUS */
	public static final int NAME_L_LATERAL_MALLEOLUS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_lateral_malleolus</i>" has unique parent "<i>l_calf</i>" in HAnimSegmentObject
	 * @see #NAME_L_LATERAL_MALLEOLUS
	 * @see HAnimSegmentObject#NAME_L_CALF */
	public static final String NAME_L_LATERAL_MALLEOLUS_PARENT = "l_calf";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_sphyrion"</i> (Java syntax) or <i>l_sphyrion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="http://www.oxfordreference.com/view/10.1093/oi/authority.20110803100523385" target="_blank">http://www.oxfordreference.com/view/10.1093/oi/authority.20110803100523385</a>  */
	public static final String NAME_L_SPHYRION = "l_sphyrion";
	/** SFString featurePointNameValues enumeration value "<i>l_sphyrion</i>" has unique index 50
	 * @see #NAME_L_SPHYRION */
	public static final int NAME_L_SPHYRION_INDEX = 50;
	/** SFString featurePointNameValues enumeration value "<i>l_sphyrion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_SPHYRION */
	public static final int NAME_L_SPHYRION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_sphyrion</i>" has unique parent "<i>l_talus</i>" in HAnimSegmentObject
	 * @see #NAME_L_SPHYRION
	 * @see HAnimSegmentObject#NAME_L_TALUS */
	public static final String NAME_L_SPHYRION_PARENT = "l_talus";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tibiale"</i> (Java syntax) or <i>r_tibiale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Accessory_navicular_bone" target="_blank">https://en.wikipedia.org/wiki/Accessory_navicular_bone</a>  */
	public static final String NAME_R_TIBIALE = "r_tibiale";
	/** SFString featurePointNameValues enumeration value "<i>r_tibiale</i>" has unique index 51
	 * @see #NAME_R_TIBIALE */
	public static final int NAME_R_TIBIALE_INDEX = 51;
	/** SFString featurePointNameValues enumeration value "<i>r_tibiale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_TIBIALE */
	public static final int NAME_R_TIBIALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_tibiale</i>" has unique parent "<i>r_calf</i>" in HAnimSegmentObject
	 * @see #NAME_R_TIBIALE
	 * @see HAnimSegmentObject#NAME_R_CALF */
	public static final String NAME_R_TIBIALE_PARENT = "r_calf";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_medial_malleolus"</i> (Java syntax) or <i>r_medial_malleolus</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Malleolus" target="_blank">https://en.wikipedia.org/wiki/Malleolus</a>  */
	public static final String NAME_R_MEDIAL_MALLEOLUS = "r_medial_malleolus";
	/** SFString featurePointNameValues enumeration value "<i>r_medial_malleolus</i>" has unique index 52
	 * @see #NAME_R_MEDIAL_MALLEOLUS */
	public static final int NAME_R_MEDIAL_MALLEOLUS_INDEX = 52;
	/** SFString featurePointNameValues enumeration value "<i>r_medial_malleolus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_MEDIAL_MALLEOLUS */
	public static final int NAME_R_MEDIAL_MALLEOLUS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_medial_malleolus</i>" has unique parent "<i>r_calf</i>" in HAnimSegmentObject
	 * @see #NAME_R_MEDIAL_MALLEOLUS
	 * @see HAnimSegmentObject#NAME_R_CALF */
	public static final String NAME_R_MEDIAL_MALLEOLUS_PARENT = "r_calf";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_lateral_malleolus"</i> (Java syntax) or <i>r_lateral_malleolus</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Malleolus" target="_blank">https://en.wikipedia.org/wiki/Malleolus</a>  */
	public static final String NAME_R_LATERAL_MALLEOLUS = "r_lateral_malleolus";
	/** SFString featurePointNameValues enumeration value "<i>r_lateral_malleolus</i>" has unique index 53
	 * @see #NAME_R_LATERAL_MALLEOLUS */
	public static final int NAME_R_LATERAL_MALLEOLUS_INDEX = 53;
	/** SFString featurePointNameValues enumeration value "<i>r_lateral_malleolus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_LATERAL_MALLEOLUS */
	public static final int NAME_R_LATERAL_MALLEOLUS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_lateral_malleolus</i>" has unique parent "<i>r_calf</i>" in HAnimSegmentObject
	 * @see #NAME_R_LATERAL_MALLEOLUS
	 * @see HAnimSegmentObject#NAME_R_CALF */
	public static final String NAME_R_LATERAL_MALLEOLUS_PARENT = "r_calf";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_sphyrion"</i> (Java syntax) or <i>r_sphyrion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="http://www.oxfordreference.com/view/10.1093/oi/authority.20110803100523385" target="_blank">http://www.oxfordreference.com/view/10.1093/oi/authority.20110803100523385</a>  */
	public static final String NAME_R_SPHYRION = "r_sphyrion";
	/** SFString featurePointNameValues enumeration value "<i>r_sphyrion</i>" has unique index 54
	 * @see #NAME_R_SPHYRION */
	public static final int NAME_R_SPHYRION_INDEX = 54;
	/** SFString featurePointNameValues enumeration value "<i>r_sphyrion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_SPHYRION */
	public static final int NAME_R_SPHYRION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_sphyrion</i>" has unique parent "<i>r_talus</i>" in HAnimSegmentObject
	 * @see #NAME_R_SPHYRION
	 * @see HAnimSegmentObject#NAME_R_TALUS */
	public static final String NAME_R_SPHYRION_PARENT = "r_talus";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_metatarsal_phalanx_1"</i> (Java syntax) or <i>l_metatarsal_phalanx_1</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_PHALANX_1 = "l_metatarsal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_1</i>" has unique index 55
	 * @see #NAME_L_METATARSAL_PHALANX_1 */
	public static final int NAME_L_METATARSAL_PHALANX_1_INDEX = 55;
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSAL_PHALANX_1 */
	public static final int NAME_L_METATARSAL_PHALANX_1_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_1</i>" has unique parent "<i>l_tarsal_proximal_phalanx_1</i>" in HAnimSegmentObject
	 * @see #NAME_L_METATARSAL_PHALANX_1
	 * @see HAnimSegmentObject#NAME_L_TARSAL_PROXIMAL_PHALANX_1 */
	public static final String NAME_L_METATARSAL_PHALANX_1_PARENT = "l_tarsal_proximal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_1</i>" has alias "<i>l_metatarsal_pha1</i>"
	 * @see #NAME_L_METATARSAL_PHALANX_1 */
	public static final String NAME_L_METATARSAL_PHALANX_1_ALIAS = "l_metatarsal_pha1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_metatarsal_phalanx_5"</i> (Java syntax) or <i>l_metatarsal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_PHALANX_5 = "l_metatarsal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_5</i>" has unique index 56
	 * @see #NAME_L_METATARSAL_PHALANX_5 */
	public static final int NAME_L_METATARSAL_PHALANX_5_INDEX = 56;
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSAL_PHALANX_5 */
	public static final int NAME_L_METATARSAL_PHALANX_5_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_5</i>" has unique parent "<i>l_tarsal_proximal_phalanx_5</i>" in HAnimSegmentObject
	 * @see #NAME_L_METATARSAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_L_TARSAL_PROXIMAL_PHALANX_5 */
	public static final String NAME_L_METATARSAL_PHALANX_5_PARENT = "l_tarsal_proximal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_metatarsal_phalanx_5</i>" has alias "<i>l_metatarsal_pha5</i>"
	 * @see #NAME_L_METATARSAL_PHALANX_5 */
	public static final String NAME_L_METATARSAL_PHALANX_5_ALIAS = "l_metatarsal_pha5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_dactylion"</i> (Java syntax) or <i>l_dactylion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/dactylion" target="_blank">https://en.wiktionary.org/wiki/dactylion</a>  */
	public static final String NAME_L_DACTYLION = "l_dactylion";
	/** SFString featurePointNameValues enumeration value "<i>l_dactylion</i>" has unique index 57
	 * @see #NAME_L_DACTYLION */
	public static final int NAME_L_DACTYLION_INDEX = 57;
	/** SFString featurePointNameValues enumeration value "<i>l_dactylion</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_DACTYLION */
	public static final int NAME_L_DACTYLION_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_dactylion</i>" has unique parent "<i>l_carpal_distal_phalanx_2</i>" in HAnimSegmentObject
	 * @see #NAME_L_DACTYLION
	 * @see HAnimSegmentObject#NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_DACTYLION_PARENT = "l_carpal_distal_phalanx_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_calcaneus_posterior"</i> (Java syntax) or <i>l_calcaneus_posterior</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calcaneus" target="_blank">https://en.wikipedia.org/wiki/Calcaneus</a>  */
	public static final String NAME_L_CALCANEUS_POSTERIOR = "l_calcaneus_posterior";
	/** SFString featurePointNameValues enumeration value "<i>l_calcaneus_posterior</i>" has unique index 58
	 * @see #NAME_L_CALCANEUS_POSTERIOR */
	public static final int NAME_L_CALCANEUS_POSTERIOR_INDEX = 58;
	/** SFString featurePointNameValues enumeration value "<i>l_calcaneus_posterior</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_CALCANEUS_POSTERIOR */
	public static final int NAME_L_CALCANEUS_POSTERIOR_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_calcaneus_posterior</i>" has unique parent "<i>l_talus</i>" in HAnimSegmentObject
	 * @see #NAME_L_CALCANEUS_POSTERIOR
	 * @see HAnimSegmentObject#NAME_L_TALUS */
	public static final String NAME_L_CALCANEUS_POSTERIOR_PARENT = "l_talus";
	/** SFString featurePointNameValues enumeration value "<i>l_calcaneus_posterior</i>" has alias "<i>l_calcaneum</i>"
	 * @see #NAME_L_CALCANEUS_POSTERIOR */
	public static final String NAME_L_CALCANEUS_POSTERIOR_ALIAS = "l_calcaneum";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_metatarsal_phalanx_1"</i> (Java syntax) or <i>r_metatarsal_phalanx_1</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_PHALANX_1 = "r_metatarsal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_1</i>" has unique index 59
	 * @see #NAME_R_METATARSAL_PHALANX_1 */
	public static final int NAME_R_METATARSAL_PHALANX_1_INDEX = 59;
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSAL_PHALANX_1 */
	public static final int NAME_R_METATARSAL_PHALANX_1_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_1</i>" has unique parent "<i>r_tarsal_proximal_phalanx_1</i>" in HAnimSegmentObject
	 * @see #NAME_R_METATARSAL_PHALANX_1
	 * @see HAnimSegmentObject#NAME_R_TARSAL_PROXIMAL_PHALANX_1 */
	public static final String NAME_R_METATARSAL_PHALANX_1_PARENT = "r_tarsal_proximal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_1</i>" has alias "<i>r_metatarsal_pha1</i>"
	 * @see #NAME_R_METATARSAL_PHALANX_1 */
	public static final String NAME_R_METATARSAL_PHALANX_1_ALIAS = "r_metatarsal_pha1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_metatarsal_phalanx_5"</i> (Java syntax) or <i>r_metatarsal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_PHALANX_5 = "r_metatarsal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_5</i>" has unique index 60
	 * @see #NAME_R_METATARSAL_PHALANX_5 */
	public static final int NAME_R_METATARSAL_PHALANX_5_INDEX = 60;
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSAL_PHALANX_5 */
	public static final int NAME_R_METATARSAL_PHALANX_5_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_5</i>" has unique parent "<i>r_tarsal_proximal_phalanx_5</i>" in HAnimSegmentObject
	 * @see #NAME_R_METATARSAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_R_TARSAL_PROXIMAL_PHALANX_5 */
	public static final String NAME_R_METATARSAL_PHALANX_5_PARENT = "r_tarsal_proximal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_metatarsal_phalanx_5</i>" has alias "<i>r_metatarsal_pha5</i>"
	 * @see #NAME_R_METATARSAL_PHALANX_5 */
	public static final String NAME_R_METATARSAL_PHALANX_5_ALIAS = "r_metatarsal_pha5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_dactylion"</i> (Java syntax) or <i>r_dactylion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/dactylion" target="_blank">https://en.wiktionary.org/wiki/dactylion</a>  */
	public static final String NAME_R_DACTYLION = "r_dactylion";
	/** SFString featurePointNameValues enumeration value "<i>r_dactylion</i>" has unique index 61
	 * @see #NAME_R_DACTYLION */
	public static final int NAME_R_DACTYLION_INDEX = 61;
	/** SFString featurePointNameValues enumeration value "<i>r_dactylion</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_DACTYLION */
	public static final int NAME_R_DACTYLION_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_dactylion</i>" has unique parent "<i>r_carpal_distal_phalanx_2</i>" in HAnimSegmentObject
	 * @see #NAME_R_DACTYLION
	 * @see HAnimSegmentObject#NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_DACTYLION_PARENT = "r_carpal_distal_phalanx_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_calcaneus_posterior"</i> (Java syntax) or <i>r_calcaneus_posterior</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calcaneus" target="_blank">https://en.wikipedia.org/wiki/Calcaneus</a>  */
	public static final String NAME_R_CALCANEUS_POSTERIOR = "r_calcaneus_posterior";
	/** SFString featurePointNameValues enumeration value "<i>r_calcaneus_posterior</i>" has unique index 62
	 * @see #NAME_R_CALCANEUS_POSTERIOR */
	public static final int NAME_R_CALCANEUS_POSTERIOR_INDEX = 62;
	/** SFString featurePointNameValues enumeration value "<i>r_calcaneus_posterior</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_CALCANEUS_POSTERIOR */
	public static final int NAME_R_CALCANEUS_POSTERIOR_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_calcaneus_posterior</i>" has unique parent "<i>r_talus</i>" in HAnimSegmentObject
	 * @see #NAME_R_CALCANEUS_POSTERIOR
	 * @see HAnimSegmentObject#NAME_R_TALUS */
	public static final String NAME_R_CALCANEUS_POSTERIOR_PARENT = "r_talus";
	/** SFString featurePointNameValues enumeration value "<i>r_calcaneus_posterior</i>" has alias "<i>r_calcaneum</i>"
	 * @see #NAME_R_CALCANEUS_POSTERIOR */
	public static final String NAME_R_CALCANEUS_POSTERIOR_ALIAS = "r_calcaneum";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_humeral_lateral_epicondyle"</i> (Java syntax) or <i>l_humeral_lateral_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_humerus" target="_blank">https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_humerus</a>  */
	public static final String NAME_L_HUMERAL_LATERAL_EPICONDYLE = "l_humeral_lateral_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_lateral_epicondyle</i>" has unique index 63
	 * @see #NAME_L_HUMERAL_LATERAL_EPICONDYLE */
	public static final int NAME_L_HUMERAL_LATERAL_EPICONDYLE_INDEX = 63;
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_lateral_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_HUMERAL_LATERAL_EPICONDYLE */
	public static final int NAME_L_HUMERAL_LATERAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_lateral_epicondyle</i>" has unique parent "<i>l_upperarm</i>" in HAnimSegmentObject
	 * @see #NAME_L_HUMERAL_LATERAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_L_UPPERARM */
	public static final String NAME_L_HUMERAL_LATERAL_EPICONDYLE_PARENT = "l_upperarm";
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_lateral_epicondyle</i>" has alias "<i>l_humeral_lateral_epicn</i>"
	 * @see #NAME_L_HUMERAL_LATERAL_EPICONDYLE */
	public static final String NAME_L_HUMERAL_LATERAL_EPICONDYLE_ALIAS = "l_humeral_lateral_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_humeral_medial_epicondyle"</i> (Java syntax) or <i>l_humeral_medial_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_humerus" target="_blank">https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_humerus</a>  */
	public static final String NAME_L_HUMERAL_MEDIAL_EPICONDYLE = "l_humeral_medial_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_medial_epicondyle</i>" has unique index 64
	 * @see #NAME_L_HUMERAL_MEDIAL_EPICONDYLE */
	public static final int NAME_L_HUMERAL_MEDIAL_EPICONDYLE_INDEX = 64;
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_medial_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_HUMERAL_MEDIAL_EPICONDYLE */
	public static final int NAME_L_HUMERAL_MEDIAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_medial_epicondyle</i>" has unique parent "<i>l_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_L_HUMERAL_MEDIAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_L_FOREARM */
	public static final String NAME_L_HUMERAL_MEDIAL_EPICONDYLE_PARENT = "l_forearm";
	/** SFString featurePointNameValues enumeration value "<i>l_humeral_medial_epicondyle</i>" has alias "<i>l_humeral_lateral_epicn</i>"
	 * @see #NAME_L_HUMERAL_MEDIAL_EPICONDYLE */
	public static final String NAME_L_HUMERAL_MEDIAL_EPICONDYLE_ALIAS = "l_humeral_lateral_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_olecranon"</i> (Java syntax) or <i>l_olecranon</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Olecranon" target="_blank">https://en.wikipedia.org/wiki/Olecranon</a>  */
	public static final String NAME_L_OLECRANON = "l_olecranon";
	/** SFString featurePointNameValues enumeration value "<i>l_olecranon</i>" has unique index 65
	 * @see #NAME_L_OLECRANON */
	public static final int NAME_L_OLECRANON_INDEX = 65;
	/** SFString featurePointNameValues enumeration value "<i>l_olecranon</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_OLECRANON */
	public static final int NAME_L_OLECRANON_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_olecranon</i>" has unique parent "<i>l_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_L_OLECRANON
	 * @see HAnimSegmentObject#NAME_L_FOREARM */
	public static final String NAME_L_OLECRANON_PARENT = "l_forearm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_humeral_lateral_epicondyle"</i> (Java syntax) or <i>r_humeral_lateral_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_humerus" target="_blank">https://en.wikipedia.org/wiki/Lateral_epicondyle_of_the_humerus</a>  */
	public static final String NAME_R_HUMERAL_LATERAL_EPICONDYLE = "r_humeral_lateral_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_lateral_epicondyle</i>" has unique index 66
	 * @see #NAME_R_HUMERAL_LATERAL_EPICONDYLE */
	public static final int NAME_R_HUMERAL_LATERAL_EPICONDYLE_INDEX = 66;
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_lateral_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_HUMERAL_LATERAL_EPICONDYLE */
	public static final int NAME_R_HUMERAL_LATERAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_lateral_epicondyle</i>" has unique parent "<i>r_upperarm</i>" in HAnimSegmentObject
	 * @see #NAME_R_HUMERAL_LATERAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_R_UPPERARM */
	public static final String NAME_R_HUMERAL_LATERAL_EPICONDYLE_PARENT = "r_upperarm";
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_lateral_epicondyle</i>" has alias "<i>r_humeral_lateral_epicn</i>"
	 * @see #NAME_R_HUMERAL_LATERAL_EPICONDYLE */
	public static final String NAME_R_HUMERAL_LATERAL_EPICONDYLE_ALIAS = "r_humeral_lateral_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_humeral_medial_epicondyle"</i> (Java syntax) or <i>r_humeral_medial_epicondyle</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_humerus" target="_blank">https://en.wikipedia.org/wiki/Medial_epicondyle_of_the_humerus</a>  */
	public static final String NAME_R_HUMERAL_MEDIAL_EPICONDYLE = "r_humeral_medial_epicondyle";
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_medial_epicondyle</i>" has unique index 67
	 * @see #NAME_R_HUMERAL_MEDIAL_EPICONDYLE */
	public static final int NAME_R_HUMERAL_MEDIAL_EPICONDYLE_INDEX = 67;
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_medial_epicondyle</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_HUMERAL_MEDIAL_EPICONDYLE */
	public static final int NAME_R_HUMERAL_MEDIAL_EPICONDYLE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_medial_epicondyle</i>" has unique parent "<i>r_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_R_HUMERAL_MEDIAL_EPICONDYLE
	 * @see HAnimSegmentObject#NAME_R_FOREARM */
	public static final String NAME_R_HUMERAL_MEDIAL_EPICONDYLE_PARENT = "r_forearm";
	/** SFString featurePointNameValues enumeration value "<i>r_humeral_medial_epicondyle</i>" has alias "<i>r_humeral_lateral_epicn</i>"
	 * @see #NAME_R_HUMERAL_MEDIAL_EPICONDYLE */
	public static final String NAME_R_HUMERAL_MEDIAL_EPICONDYLE_ALIAS = "r_humeral_lateral_epicn";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_olecranon"</i> (Java syntax) or <i>r_olecranon</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Olecranon" target="_blank">https://en.wikipedia.org/wiki/Olecranon</a>  */
	public static final String NAME_R_OLECRANON = "r_olecranon";
	/** SFString featurePointNameValues enumeration value "<i>r_olecranon</i>" has unique index 68
	 * @see #NAME_R_OLECRANON */
	public static final int NAME_R_OLECRANON_INDEX = 68;
	/** SFString featurePointNameValues enumeration value "<i>r_olecranon</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_OLECRANON */
	public static final int NAME_R_OLECRANON_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_olecranon</i>" has unique parent "<i>r_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_R_OLECRANON
	 * @see HAnimSegmentObject#NAME_R_FOREARM */
	public static final String NAME_R_OLECRANON_PARENT = "r_forearm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_radiale"</i> (Java syntax) or <i>l_radiale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpal_bones" target="_blank">https://en.wikipedia.org/wiki/Carpal_bones</a>  */
	public static final String NAME_L_RADIALE = "l_radiale";
	/** SFString featurePointNameValues enumeration value "<i>l_radiale</i>" has unique index 69
	 * @see #NAME_L_RADIALE */
	public static final int NAME_L_RADIALE_INDEX = 69;
	/** SFString featurePointNameValues enumeration value "<i>l_radiale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_RADIALE */
	public static final int NAME_L_RADIALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_radiale</i>" has unique parent "<i>l_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_L_RADIALE
	 * @see HAnimSegmentObject#NAME_L_FOREARM */
	public static final String NAME_L_RADIALE_PARENT = "l_forearm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_ulnar_styloid"</i> (Java syntax) or <i>l_ulnar_styloid</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Ulnar_styloid_process" target="_blank">https://en.wikipedia.org/wiki/Ulnar_styloid_process</a>  */
	public static final String NAME_L_ULNAR_STYLOID = "l_ulnar_styloid";
	/** SFString featurePointNameValues enumeration value "<i>l_ulnar_styloid</i>" has unique index 70
	 * @see #NAME_L_ULNAR_STYLOID */
	public static final int NAME_L_ULNAR_STYLOID_INDEX = 70;
	/** SFString featurePointNameValues enumeration value "<i>l_ulnar_styloid</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_ULNAR_STYLOID */
	public static final int NAME_L_ULNAR_STYLOID_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_ulnar_styloid</i>" has unique parent "<i>l_carpal</i>" in HAnimSegmentObject
	 * @see #NAME_L_ULNAR_STYLOID
	 * @see HAnimSegmentObject#NAME_L_CARPAL */
	public static final String NAME_L_ULNAR_STYLOID_PARENT = "l_carpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_radial_styloid"</i> (Java syntax) or <i>l_radial_styloid</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Radial_styloid_process" target="_blank">https://en.wikipedia.org/wiki/Radial_styloid_process</a>  */
	public static final String NAME_L_RADIAL_STYLOID = "l_radial_styloid";
	/** SFString featurePointNameValues enumeration value "<i>l_radial_styloid</i>" has unique index 71
	 * @see #NAME_L_RADIAL_STYLOID */
	public static final int NAME_L_RADIAL_STYLOID_INDEX = 71;
	/** SFString featurePointNameValues enumeration value "<i>l_radial_styloid</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_RADIAL_STYLOID */
	public static final int NAME_L_RADIAL_STYLOID_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_radial_styloid</i>" has unique parent "<i>l_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_L_RADIAL_STYLOID
	 * @see HAnimSegmentObject#NAME_L_FOREARM */
	public static final String NAME_L_RADIAL_STYLOID_PARENT = "l_forearm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_radiale"</i> (Java syntax) or <i>r_radiale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpal_bones" target="_blank">https://en.wikipedia.org/wiki/Carpal_bones</a>  */
	public static final String NAME_R_RADIALE = "r_radiale";
	/** SFString featurePointNameValues enumeration value "<i>r_radiale</i>" has unique index 72
	 * @see #NAME_R_RADIALE */
	public static final int NAME_R_RADIALE_INDEX = 72;
	/** SFString featurePointNameValues enumeration value "<i>r_radiale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_RADIALE */
	public static final int NAME_R_RADIALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_radiale</i>" has unique parent "<i>r_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_R_RADIALE
	 * @see HAnimSegmentObject#NAME_R_FOREARM */
	public static final String NAME_R_RADIALE_PARENT = "r_forearm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_ulnar_styloid"</i> (Java syntax) or <i>r_ulnar_styloid</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Ulnar_styloid_process" target="_blank">https://en.wikipedia.org/wiki/Ulnar_styloid_process</a>  */
	public static final String NAME_R_ULNAR_STYLOID = "r_ulnar_styloid";
	/** SFString featurePointNameValues enumeration value "<i>r_ulnar_styloid</i>" has unique index 73
	 * @see #NAME_R_ULNAR_STYLOID */
	public static final int NAME_R_ULNAR_STYLOID_INDEX = 73;
	/** SFString featurePointNameValues enumeration value "<i>r_ulnar_styloid</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_ULNAR_STYLOID */
	public static final int NAME_R_ULNAR_STYLOID_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_ulnar_styloid</i>" has unique parent "<i>r_carpal</i>" in HAnimSegmentObject
	 * @see #NAME_R_ULNAR_STYLOID
	 * @see HAnimSegmentObject#NAME_R_CARPAL */
	public static final String NAME_R_ULNAR_STYLOID_PARENT = "r_carpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_radial_styloid"</i> (Java syntax) or <i>r_radial_styloid</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Radial_styloid_process" target="_blank">https://en.wikipedia.org/wiki/Radial_styloid_process</a>  */
	public static final String NAME_R_RADIAL_STYLOID = "r_radial_styloid";
	/** SFString featurePointNameValues enumeration value "<i>r_radial_styloid</i>" has unique index 74
	 * @see #NAME_R_RADIAL_STYLOID */
	public static final int NAME_R_RADIAL_STYLOID_INDEX = 74;
	/** SFString featurePointNameValues enumeration value "<i>r_radial_styloid</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_RADIAL_STYLOID */
	public static final int NAME_R_RADIAL_STYLOID_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_radial_styloid</i>" has unique parent "<i>r_forearm</i>" in HAnimSegmentObject
	 * @see #NAME_R_RADIAL_STYLOID
	 * @see HAnimSegmentObject#NAME_R_FOREARM */
	public static final String NAME_R_RADIAL_STYLOID_PARENT = "r_forearm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_metacarpal_phalanx_2"</i> (Java syntax) or <i>l_metacarpal_phalanx_2</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_PHALANX_2 = "l_metacarpal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_2</i>" has unique index 75
	 * @see #NAME_L_METACARPAL_PHALANX_2 */
	public static final int NAME_L_METACARPAL_PHALANX_2_INDEX = 75;
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_PHALANX_2 */
	public static final int NAME_L_METACARPAL_PHALANX_2_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_2</i>" has unique parent "<i>l_metacarpal_2</i>" in HAnimSegmentObject
	 * @see #NAME_L_METACARPAL_PHALANX_2
	 * @see HAnimSegmentObject#NAME_L_METACARPAL_2 */
	public static final String NAME_L_METACARPAL_PHALANX_2_PARENT = "l_metacarpal_2";
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_2</i>" has alias "<i>l_metacarpal_pha2</i>"
	 * @see #NAME_L_METACARPAL_PHALANX_2 */
	public static final String NAME_L_METACARPAL_PHALANX_2_ALIAS = "l_metacarpal_pha2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_metacarpal_phalanx_3"</i> (Java syntax) or <i>l_metacarpal_phalanx_3</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_PHALANX_3 = "l_metacarpal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_3</i>" has unique index 76
	 * @see #NAME_L_METACARPAL_PHALANX_3 */
	public static final int NAME_L_METACARPAL_PHALANX_3_INDEX = 76;
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_PHALANX_3 */
	public static final int NAME_L_METACARPAL_PHALANX_3_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_3</i>" has unique parent "<i>l_metacarpal_3</i>" in HAnimSegmentObject
	 * @see #NAME_L_METACARPAL_PHALANX_3
	 * @see HAnimSegmentObject#NAME_L_METACARPAL_3 */
	public static final String NAME_L_METACARPAL_PHALANX_3_PARENT = "l_metacarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_metacarpal_phalanx_5"</i> (Java syntax) or <i>l_metacarpal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_PHALANX_5 = "l_metacarpal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_5</i>" has unique index 77
	 * @see #NAME_L_METACARPAL_PHALANX_5 */
	public static final int NAME_L_METACARPAL_PHALANX_5_INDEX = 77;
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_PHALANX_5 */
	public static final int NAME_L_METACARPAL_PHALANX_5_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_5</i>" has unique parent "<i>l_metacarpal_5</i>" in HAnimSegmentObject
	 * @see #NAME_L_METACARPAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_L_METACARPAL_5 */
	public static final String NAME_L_METACARPAL_PHALANX_5_PARENT = "l_metacarpal_5";
	/** SFString featurePointNameValues enumeration value "<i>l_metacarpal_phalanx_5</i>" has alias "<i>l_metacarpal_pha5</i>"
	 * @see #NAME_L_METACARPAL_PHALANX_5 */
	public static final String NAME_L_METACARPAL_PHALANX_5_ALIAS = "l_metacarpal_pha5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_metacarpal_phalanx_2"</i> (Java syntax) or <i>r_metacarpal_phalanx_2</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_PHALANX_2 = "r_metacarpal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_2</i>" has unique index 78
	 * @see #NAME_R_METACARPAL_PHALANX_2 */
	public static final int NAME_R_METACARPAL_PHALANX_2_INDEX = 78;
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_PHALANX_2 */
	public static final int NAME_R_METACARPAL_PHALANX_2_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_2</i>" has unique parent "<i>r_metacarpal_2</i>" in HAnimSegmentObject
	 * @see #NAME_R_METACARPAL_PHALANX_2
	 * @see HAnimSegmentObject#NAME_R_METACARPAL_2 */
	public static final String NAME_R_METACARPAL_PHALANX_2_PARENT = "r_metacarpal_2";
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_2</i>" has alias "<i>r_metacarpal_pha2</i>"
	 * @see #NAME_R_METACARPAL_PHALANX_2 */
	public static final String NAME_R_METACARPAL_PHALANX_2_ALIAS = "r_metacarpal_pha2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_metacarpal_phalanx_3"</i> (Java syntax) or <i>r_metacarpal_phalanx_3</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_PHALANX_3 = "r_metacarpal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_3</i>" has unique index 79
	 * @see #NAME_R_METACARPAL_PHALANX_3 */
	public static final int NAME_R_METACARPAL_PHALANX_3_INDEX = 79;
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_PHALANX_3 */
	public static final int NAME_R_METACARPAL_PHALANX_3_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_3</i>" has unique parent "<i>r_metacarpal_3</i>" in HAnimSegmentObject
	 * @see #NAME_R_METACARPAL_PHALANX_3
	 * @see HAnimSegmentObject#NAME_R_METACARPAL_3 */
	public static final String NAME_R_METACARPAL_PHALANX_3_PARENT = "r_metacarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_metacarpal_phalanx_5"</i> (Java syntax) or <i>r_metacarpal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_PHALANX_5 = "r_metacarpal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_5</i>" has unique index 80
	 * @see #NAME_R_METACARPAL_PHALANX_5 */
	public static final int NAME_R_METACARPAL_PHALANX_5_INDEX = 80;
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_PHALANX_5 */
	public static final int NAME_R_METACARPAL_PHALANX_5_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_5</i>" has unique parent "<i>r_metacarpal_5</i>" in HAnimSegmentObject
	 * @see #NAME_R_METACARPAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_R_METACARPAL_5 */
	public static final String NAME_R_METACARPAL_PHALANX_5_PARENT = "r_metacarpal_5";
	/** SFString featurePointNameValues enumeration value "<i>r_metacarpal_phalanx_5</i>" has alias "<i>r_metacarpal_pha5</i>"
	 * @see #NAME_R_METACARPAL_PHALANX_5 */
	public static final String NAME_R_METACARPAL_PHALANX_5_ALIAS = "r_metacarpal_pha5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"nuchale"</i> (Java syntax) or <i>nuchale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Squamous_part_of_occipital_bone" target="_blank">https://en.wikipedia.org/wiki/Squamous_part_of_occipital_bone</a>  */
	public static final String NAME_NUCHALE = "nuchale";
	/** SFString featurePointNameValues enumeration value "<i>nuchale</i>" has unique index 81
	 * @see #NAME_NUCHALE */
	public static final int NAME_NUCHALE_INDEX = 81;
	/** SFString featurePointNameValues enumeration value "<i>nuchale</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_NUCHALE */
	public static final int NAME_NUCHALE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>nuchale</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_NUCHALE
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_NUCHALE_PARENT = "skull";
	/** SFString featurePointNameValues enumeration value "<i>nuchale</i>" has alias "<i>nuchal</i>"
	 * @see #NAME_NUCHALE */
	public static final String NAME_NUCHALE_ALIAS = "nuchal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_neck_base"</i> (Java syntax) or <i>l_neck_base</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Neck" target="_blank">https://en.wikipedia.org/wiki/Neck</a>  */
	public static final String NAME_L_NECK_BASE = "l_neck_base";
	/** SFString featurePointNameValues enumeration value "<i>l_neck_base</i>" has unique index 82
	 * @see #NAME_L_NECK_BASE */
	public static final int NAME_L_NECK_BASE_INDEX = 82;
	/** SFString featurePointNameValues enumeration value "<i>l_neck_base</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_NECK_BASE */
	public static final int NAME_L_NECK_BASE_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>l_neck_base</i>" has unique parent "<i>c7</i>" in HAnimSegmentObject
	 * @see #NAME_L_NECK_BASE
	 * @see HAnimSegmentObject#NAME_C7 */
	public static final String NAME_L_NECK_BASE_PARENT = "c7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_neck_base"</i> (Java syntax) or <i>r_neck_base</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Neck" target="_blank">https://en.wikipedia.org/wiki/Neck</a>  */
	public static final String NAME_R_NECK_BASE = "r_neck_base";
	/** SFString featurePointNameValues enumeration value "<i>r_neck_base</i>" has unique index 83
	 * @see #NAME_R_NECK_BASE */
	public static final int NAME_R_NECK_BASE_INDEX = 83;
	/** SFString featurePointNameValues enumeration value "<i>r_neck_base</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_NECK_BASE */
	public static final int NAME_R_NECK_BASE_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>r_neck_base</i>" has unique parent "<i>c7</i>" in HAnimSegmentObject
	 * @see #NAME_R_NECK_BASE
	 * @see HAnimSegmentObject#NAME_C7 */
	public static final String NAME_R_NECK_BASE_PARENT = "c7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"navel"</i> (Java syntax) or <i>navel</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Navel" target="_blank">https://en.wikipedia.org/wiki/Navel</a>  */
	public static final String NAME_NAVEL = "navel";
	/** SFString featurePointNameValues enumeration value "<i>navel</i>" has unique index 84
	 * @see #NAME_NAVEL */
	public static final int NAME_NAVEL_INDEX = 84;
	/** SFString featurePointNameValues enumeration value "<i>navel</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_NAVEL */
	public static final int NAME_NAVEL_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>navel</i>" has unique parent "<i>l5</i>" in HAnimSegmentObject
	 * @see #NAME_NAVEL
	 * @see HAnimSegmentObject#NAME_L5 */
	public static final String NAME_NAVEL_PARENT = "l5";
	/** SFString featurePointNameValues enumeration value "<i>navel</i>" has alias "<i>belly button</i>"
	 * @see #NAME_NAVEL */
	public static final String NAME_NAVEL_ALIAS = "belly button";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_ectocanthus"</i> (Java syntax) or <i>l_ectocanthus</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Canthus" target="_blank">https://en.wikipedia.org/wiki/Canthus</a>  */
	public static final String NAME_L_ECTOCANTHUS = "l_ectocanthus";
	/** SFString featurePointNameValues enumeration value "<i>l_ectocanthus</i>" has unique index 85
	 * @see #NAME_L_ECTOCANTHUS */
	public static final int NAME_L_ECTOCANTHUS_INDEX = 85;
	/** SFString featurePointNameValues enumeration value "<i>l_ectocanthus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_ECTOCANTHUS */
	public static final int NAME_L_ECTOCANTHUS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_ectocanthus</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_L_ECTOCANTHUS
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_L_ECTOCANTHUS_PARENT = "skull";
	/** SFString featurePointNameValues enumeration value "<i>l_ectocanthus</i>" has alias "<i>l_canthus</i>"
	 * @see #NAME_L_ECTOCANTHUS */
	public static final String NAME_L_ECTOCANTHUS_ALIAS = "l_canthus";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_ectocanthus"</i> (Java syntax) or <i>r_ectocanthus</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Canthus" target="_blank">https://en.wikipedia.org/wiki/Canthus</a>  */
	public static final String NAME_R_ECTOCANTHUS = "r_ectocanthus";
	/** SFString featurePointNameValues enumeration value "<i>r_ectocanthus</i>" has unique index 86
	 * @see #NAME_R_ECTOCANTHUS */
	public static final int NAME_R_ECTOCANTHUS_INDEX = 86;
	/** SFString featurePointNameValues enumeration value "<i>r_ectocanthus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_ECTOCANTHUS */
	public static final int NAME_R_ECTOCANTHUS_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_ectocanthus</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_R_ECTOCANTHUS
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_R_ECTOCANTHUS_PARENT = "skull";
	/** SFString featurePointNameValues enumeration value "<i>r_ectocanthus</i>" has alias "<i>r_canthus</i>"
	 * @see #NAME_R_ECTOCANTHUS */
	public static final String NAME_R_ECTOCANTHUS_ALIAS = "r_canthus";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"menton"</i> (Java syntax) or <i>menton</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Human_head" target="_blank">https://en.wikipedia.org/wiki/Human_head</a>  */
	public static final String NAME_MENTON = "menton";
	/** SFString featurePointNameValues enumeration value "<i>menton</i>" has unique index 87
	 * @see #NAME_MENTON */
	public static final int NAME_MENTON_INDEX = 87;
	/** SFString featurePointNameValues enumeration value "<i>menton</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_MENTON */
	public static final int NAME_MENTON_LOA = 3;
	/** SFString featurePointNameValues enumeration value "<i>menton</i>" has unique parent "<i>jaw</i>" in HAnimSegmentObject
	 * @see #NAME_MENTON
	 * @see HAnimSegmentObject#NAME_JAW */
	public static final String NAME_MENTON_PARENT = "jaw";
	/** SFString featurePointNameValues enumeration value "<i>menton</i>" has alias "<i>chin</i>"
	 * @see #NAME_MENTON */
	public static final String NAME_MENTON_ALIAS = "chin";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"mesosternale"</i> (Java syntax) or <i>mesosternale</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/mesosternum" target="_blank">https://en.wiktionary.org/wiki/mesosternum</a>  */
	public static final String NAME_MESOSTERNALE = "mesosternale";
	/** SFString featurePointNameValues enumeration value "<i>mesosternale</i>" has unique index 88
	 * @see #NAME_MESOSTERNALE */
	public static final int NAME_MESOSTERNALE_INDEX = 88;
	/** SFString featurePointNameValues enumeration value "<i>mesosternale</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_MESOSTERNALE */
	public static final int NAME_MESOSTERNALE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>mesosternale</i>" has unique parent "<i>t6</i>" in HAnimSegmentObject
	 * @see #NAME_MESOSTERNALE
	 * @see HAnimSegmentObject#NAME_T6 */
	public static final String NAME_MESOSTERNALE_PARENT = "t6";
	/** SFString featurePointNameValues enumeration value "<i>mesosternale</i>" has alias "<i>mesosternum</i>"
	 * @see #NAME_MESOSTERNALE */
	public static final String NAME_MESOSTERNALE_ALIAS = "mesosternum";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"opisthocranion"</i> (Java syntax) or <i>opisthocranion</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="http://www.columbia.edu/itc/hs/medical/humanAnatomy/yuan/craniologyISlides.pdf" target="_blank">http://www.columbia.edu/itc/hs/medical/humanAnatomy/yuan/craniologyISlides.pdf</a>  */
	public static final String NAME_OPISTHOCRANION = "opisthocranion";
	/** SFString featurePointNameValues enumeration value "<i>opisthocranion</i>" has unique index 89
	 * @see #NAME_OPISTHOCRANION */
	public static final int NAME_OPISTHOCRANION_INDEX = 89;
	/** SFString featurePointNameValues enumeration value "<i>opisthocranion</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_OPISTHOCRANION */
	public static final int NAME_OPISTHOCRANION_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>opisthocranion</i>" has unique parent "<i>skull</i>" in HAnimSegmentObject
	 * @see #NAME_OPISTHOCRANION
	 * @see HAnimSegmentObject#NAME_SKULL */
	public static final String NAME_OPISTHOCRANION_PARENT = "skull";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_knee_crease"</i> (Java syntax) or <i>l_knee_crease</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Popliteal_fossa" target="_blank">https://en.wikipedia.org/wiki/Popliteal_fossa</a>  */
	public static final String NAME_L_KNEE_CREASE = "l_knee_crease";
	/** SFString featurePointNameValues enumeration value "<i>l_knee_crease</i>" has unique index 90
	 * @see #NAME_L_KNEE_CREASE */
	public static final int NAME_L_KNEE_CREASE_INDEX = 90;
	/** SFString featurePointNameValues enumeration value "<i>l_knee_crease</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_KNEE_CREASE */
	public static final int NAME_L_KNEE_CREASE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_knee_crease</i>" has unique parent "<i>l_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_L_KNEE_CREASE
	 * @see HAnimSegmentObject#NAME_L_THIGH */
	public static final String NAME_L_KNEE_CREASE_PARENT = "l_thigh";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_knee_crease"</i> (Java syntax) or <i>r_knee_crease</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Popliteal_fossa" target="_blank">https://en.wikipedia.org/wiki/Popliteal_fossa</a>  */
	public static final String NAME_R_KNEE_CREASE = "r_knee_crease";
	/** SFString featurePointNameValues enumeration value "<i>r_knee_crease</i>" has unique index 91
	 * @see #NAME_R_KNEE_CREASE */
	public static final int NAME_R_KNEE_CREASE_INDEX = 91;
	/** SFString featurePointNameValues enumeration value "<i>r_knee_crease</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_KNEE_CREASE */
	public static final int NAME_R_KNEE_CREASE_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_knee_crease</i>" has unique parent "<i>r_thigh</i>" in HAnimSegmentObject
	 * @see #NAME_R_KNEE_CREASE
	 * @see HAnimSegmentObject#NAME_R_THIGH */
	public static final String NAME_R_KNEE_CREASE_PARENT = "r_thigh";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"rear_center_midsagittal_plane"</i> (Java syntax) or <i>rear_center_midsagittal_plane</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Median_plane" target="_blank">https://en.wikipedia.org/wiki/Median_plane</a>  */
	public static final String NAME_REAR_CENTER_MIDSAGITTAL_PLANE = "rear_center_midsagittal_plane";
	/** SFString featurePointNameValues enumeration value "<i>rear_center_midsagittal_plane</i>" has unique index 92
	 * @see #NAME_REAR_CENTER_MIDSAGITTAL_PLANE */
	public static final int NAME_REAR_CENTER_MIDSAGITTAL_PLANE_INDEX = 92;
	/** SFString featurePointNameValues enumeration value "<i>rear_center_midsagittal_plane</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_REAR_CENTER_MIDSAGITTAL_PLANE */
	public static final int NAME_REAR_CENTER_MIDSAGITTAL_PLANE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>rear_center_midsagittal_plane</i>" has unique parent "<i>t6</i>" in HAnimSegmentObject
	 * @see #NAME_REAR_CENTER_MIDSAGITTAL_PLANE
	 * @see HAnimSegmentObject#NAME_T6 */
	public static final String NAME_REAR_CENTER_MIDSAGITTAL_PLANE_PARENT = "t6";
	/** SFString featurePointNameValues enumeration value "<i>rear_center_midsagittal_plane</i>" has alias "<i>median plane</i>"
	 * @see #NAME_REAR_CENTER_MIDSAGITTAL_PLANE */
	public static final String NAME_REAR_CENTER_MIDSAGITTAL_PLANE_ALIAS = "median plane";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"buttocks_standing_wall_contact_point"</i> (Java syntax) or <i>buttocks_standing_wall_contact_point</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Buttocks" target="_blank">https://en.wikipedia.org/wiki/Buttocks</a>  */
	public static final String NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT = "buttocks_standing_wall_contact_point";
	/** SFString featurePointNameValues enumeration value "<i>buttocks_standing_wall_contact_point</i>" has unique index 93
	 * @see #NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT */
	public static final int NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT_INDEX = 93;
	/** SFString featurePointNameValues enumeration value "<i>buttocks_standing_wall_contact_point</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT */
	public static final int NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>buttocks_standing_wall_contact_point</i>" has unique parent "<i>pelvis</i>" in HAnimSegmentObject
	 * @see #NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT
	 * @see HAnimSegmentObject#NAME_PELVIS */
	public static final String NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT_PARENT = "pelvis";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_chest_midsagittal_plane"</i> (Java syntax) or <i>l_chest_midsagittal_plane</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Sagittal_plane" target="_blank">https://en.wikipedia.org/wiki/Sagittal_plane</a>  */
	public static final String NAME_L_CHEST_MIDSAGITTAL_PLANE = "l_chest_midsagittal_plane";
	/** SFString featurePointNameValues enumeration value "<i>l_chest_midsagittal_plane</i>" has unique index 94
	 * @see #NAME_L_CHEST_MIDSAGITTAL_PLANE */
	public static final int NAME_L_CHEST_MIDSAGITTAL_PLANE_INDEX = 94;
	/** SFString featurePointNameValues enumeration value "<i>l_chest_midsagittal_plane</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CHEST_MIDSAGITTAL_PLANE */
	public static final int NAME_L_CHEST_MIDSAGITTAL_PLANE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_chest_midsagittal_plane</i>" has unique parent "<i>t6</i>" in HAnimSegmentObject
	 * @see #NAME_L_CHEST_MIDSAGITTAL_PLANE
	 * @see HAnimSegmentObject#NAME_T6 */
	public static final String NAME_L_CHEST_MIDSAGITTAL_PLANE_PARENT = "t6";
	/** SFString featurePointNameValues enumeration value "<i>l_chest_midsagittal_plane</i>" has alias "<i>l_shoulder</i>"
	 * @see #NAME_L_CHEST_MIDSAGITTAL_PLANE */
	public static final String NAME_L_CHEST_MIDSAGITTAL_PLANE_ALIAS = "l_shoulder";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_chest_midsagittal_plane"</i> (Java syntax) or <i>r_chest_midsagittal_plane</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Sagittal_plane" target="_blank">https://en.wikipedia.org/wiki/Sagittal_plane</a>  */
	public static final String NAME_R_CHEST_MIDSAGITTAL_PLANE = "r_chest_midsagittal_plane";
	/** SFString featurePointNameValues enumeration value "<i>r_chest_midsagittal_plane</i>" has unique index 95
	 * @see #NAME_R_CHEST_MIDSAGITTAL_PLANE */
	public static final int NAME_R_CHEST_MIDSAGITTAL_PLANE_INDEX = 95;
	/** SFString featurePointNameValues enumeration value "<i>r_chest_midsagittal_plane</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CHEST_MIDSAGITTAL_PLANE */
	public static final int NAME_R_CHEST_MIDSAGITTAL_PLANE_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_chest_midsagittal_plane</i>" has unique parent "<i>t6</i>" in HAnimSegmentObject
	 * @see #NAME_R_CHEST_MIDSAGITTAL_PLANE
	 * @see HAnimSegmentObject#NAME_T6 */
	public static final String NAME_R_CHEST_MIDSAGITTAL_PLANE_PARENT = "t6";
	/** SFString featurePointNameValues enumeration value "<i>r_chest_midsagittal_plane</i>" has alias "<i>r_shoulder</i>"
	 * @see #NAME_R_CHEST_MIDSAGITTAL_PLANE */
	public static final String NAME_R_CHEST_MIDSAGITTAL_PLANE_ALIAS = "r_shoulder";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_bideltoid"</i> (Java syntax) or <i>l_bideltoid</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/bideltoid" target="_blank">https://en.wiktionary.org/wiki/bideltoid</a>  */
	public static final String NAME_L_BIDELTOID = "l_bideltoid";
	/** SFString featurePointNameValues enumeration value "<i>l_bideltoid</i>" has unique index 96
	 * @see #NAME_L_BIDELTOID */
	public static final int NAME_L_BIDELTOID_INDEX = 96;
	/** SFString featurePointNameValues enumeration value "<i>l_bideltoid</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_BIDELTOID */
	public static final int NAME_L_BIDELTOID_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>l_bideltoid</i>" has unique parent "<i>l_upperarm</i>" in HAnimSegmentObject
	 * @see #NAME_L_BIDELTOID
	 * @see HAnimSegmentObject#NAME_L_UPPERARM */
	public static final String NAME_L_BIDELTOID_PARENT = "l_upperarm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_bideltoid"</i> (Java syntax) or <i>r_bideltoid</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wiktionary.org/wiki/bideltoid" target="_blank">https://en.wiktionary.org/wiki/bideltoid</a>  */
	public static final String NAME_R_BIDELTOID = "r_bideltoid";
	/** SFString featurePointNameValues enumeration value "<i>r_bideltoid</i>" has unique index 97
	 * @see #NAME_R_BIDELTOID */
	public static final int NAME_R_BIDELTOID_INDEX = 97;
	/** SFString featurePointNameValues enumeration value "<i>r_bideltoid</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_BIDELTOID */
	public static final int NAME_R_BIDELTOID_LOA = 1;
	/** SFString featurePointNameValues enumeration value "<i>r_bideltoid</i>" has unique parent "<i>r_upperarm</i>" in HAnimSegmentObject
	 * @see #NAME_R_BIDELTOID
	 * @see HAnimSegmentObject#NAME_R_UPPERARM */
	public static final String NAME_R_BIDELTOID_PARENT = "r_upperarm";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_1"</i> (Java syntax) or <i>l_carpal_distal_phalanx_1</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_1 = "l_carpal_distal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has unique index 101
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_1_INDEX = 101;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_1_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has unique parent "<i>l_carpal_distal_phalanx_1</i>" in HAnimSegmentObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1
	 * @see HAnimSegmentObject#NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_1_PARENT = "l_carpal_distal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has alias "<i>l_thumb_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_1_ALIAS = "l_thumb_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_2"</i> (Java syntax) or <i>l_carpal_distal_phalanx_2</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_2 = "l_carpal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has unique index 102
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_2_INDEX = 102;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has unique parent "<i>l_carpal_distal_phalanx_2</i>" in HAnimSegmentObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2
	 * @see HAnimSegmentObject#NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_2_PARENT = "l_carpal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has alias "<i>l_index_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_2_ALIAS = "l_index_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_3"</i> (Java syntax) or <i>l_carpal_distal_phalanx_3</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_3 = "l_carpal_distal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has unique index 103
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_3_INDEX = 103;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_3_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has unique parent "<i>l_carpal_distal_phalanx_3</i>" in HAnimSegmentObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3
	 * @see HAnimSegmentObject#NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_3_PARENT = "l_carpal_distal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has alias "<i>l_middle_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_3_ALIAS = "l_middle_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_4"</i> (Java syntax) or <i>l_carpal_distal_phalanx_4</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_4 = "l_carpal_distal_phalanx_4";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has unique index 104
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_4_INDEX = 104;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_4_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has unique parent "<i>l_carpal_distal_phalanx_4</i>" in HAnimSegmentObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4
	 * @see HAnimSegmentObject#NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_4_PARENT = "l_carpal_distal_phalanx_4";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has alias "<i>l_ring_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_4_ALIAS = "l_ring_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_5"</i> (Java syntax) or <i>l_carpal_distal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_5 = "l_carpal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has unique index 105
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_5_INDEX = 105;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_5_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has unique parent "<i>l_carpal_distal_phalanx_5</i>" in HAnimSegmentObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_5_PARENT = "l_carpal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has alias "<i>l_pinky_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_5_ALIAS = "l_pinky_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_1"</i> (Java syntax) or <i>r_carpal_distal_phalanx_1</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_1 = "r_carpal_distal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has unique index 106
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_1_INDEX = 106;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_1_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has unique parent "<i>r_carpal_distal_phalanx_1</i>" in HAnimSegmentObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1
	 * @see HAnimSegmentObject#NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_1_PARENT = "r_carpal_distal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has alias "<i>r_thumb_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_1_ALIAS = "r_thumb_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_2"</i> (Java syntax) or <i>r_carpal_distal_phalanx_2</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_2 = "r_carpal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has unique index 107
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_2_INDEX = 107;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has unique parent "<i>r_carpal_distal_phalanx_2</i>" in HAnimSegmentObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2
	 * @see HAnimSegmentObject#NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_2_PARENT = "r_carpal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has alias "<i>r_index_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_2_ALIAS = "r_index_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_3"</i> (Java syntax) or <i>r_carpal_distal_phalanx_3</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_3 = "r_carpal_distal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has unique index 108
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_3_INDEX = 108;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_3_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has unique parent "<i>r_carpal_distal_phalanx_3</i>" in HAnimSegmentObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3
	 * @see HAnimSegmentObject#NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_3_PARENT = "r_carpal_distal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has alias "<i>r_middle_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_3_ALIAS = "r_middle_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_4"</i> (Java syntax) or <i>r_carpal_distal_phalanx_4</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_4 = "r_carpal_distal_phalanx_4";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has unique index 109
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_4_INDEX = 109;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_4_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has unique parent "<i>r_carpal_distal_phalanx_4</i>" in HAnimSegmentObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4
	 * @see HAnimSegmentObject#NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_4_PARENT = "r_carpal_distal_phalanx_4";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has alias "<i>r_ring_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_4_ALIAS = "r_ring_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_5"</i> (Java syntax) or <i>r_carpal_distal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_5 = "r_carpal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has unique index 110
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_5_INDEX = 110;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_5_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has unique parent "<i>r_carpal_distal_phalanx_5</i>" in HAnimSegmentObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_5_PARENT = "r_carpal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has alias "<i>r_pinky_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_5_ALIAS = "r_pinky_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_1"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_1</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_1 = "l_tarsal_distal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_1</i>" has unique index 111
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_1_INDEX = 111;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_1_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_1</i>" has unique parent "<i>l_tarsal_distal_phalanx_1</i>" in HAnimSegmentObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_1
	 * @see HAnimSegmentObject#NAME_L_TARSAL_DISTAL_PHALANX_1 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_1_PARENT = "l_tarsal_distal_phalanx_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_2"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_2</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_2 = "l_tarsal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has unique index 112
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_2_INDEX = 112;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has unique parent "<i>l_tarsal_distal_phalanx_2</i>" in HAnimSegmentObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2
	 * @see HAnimSegmentObject#NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_2_PARENT = "l_tarsal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has alias "<i>l_digit2</i>"
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_2_ALIAS = "l_digit2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_3"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_3</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_3 = "l_tarsal_distal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_3</i>" has unique index 113
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_3_INDEX = 113;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_3_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_3</i>" has unique parent "<i>l_tarsal_distal_phalanx_3</i>" in HAnimSegmentObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_3
	 * @see HAnimSegmentObject#NAME_L_TARSAL_DISTAL_PHALANX_3 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_3_PARENT = "l_tarsal_distal_phalanx_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_4"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_4</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_4 = "l_tarsal_distal_phalanx_4";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_4</i>" has unique index 114
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_4_INDEX = 114;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_4_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_4</i>" has unique parent "<i>l_tarsal_distal_phalanx_4</i>" in HAnimSegmentObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_4
	 * @see HAnimSegmentObject#NAME_L_TARSAL_DISTAL_PHALANX_4 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_4_PARENT = "l_tarsal_distal_phalanx_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_5"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_5 = "l_tarsal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has unique index 115
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_5_INDEX = 115;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_5_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has unique parent "<i>l_tarsal_distal_phalanx_5</i>" in HAnimSegmentObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_L_TARSAL_DISTAL_PHALANX_5 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_5_PARENT = "l_tarsal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has alias "<i>l_tarsal_interphalangeal_pha5</i>"
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_5_ALIAS = "l_tarsal_interphalangeal_pha5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_1"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_1</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_1 = "r_tarsal_distal_phalanx_1";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_1</i>" has unique index 116
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_1_INDEX = 116;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_1_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_1</i>" has unique parent "<i>r_tarsal_distal_phalanx_1</i>" in HAnimSegmentObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_1
	 * @see HAnimSegmentObject#NAME_R_TARSAL_DISTAL_PHALANX_1 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_1_PARENT = "r_tarsal_distal_phalanx_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_2"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_2</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_2 = "r_tarsal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has unique index 117
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_2_INDEX = 117;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has unique parent "<i>r_tarsal_distal_phalanx_2</i>" in HAnimSegmentObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2
	 * @see HAnimSegmentObject#NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_2_PARENT = "r_tarsal_distal_phalanx_2";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has alias "<i>r_digit2</i>"
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_2_ALIAS = "r_digit2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_3"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_3</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_3 = "r_tarsal_distal_phalanx_3";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_3</i>" has unique index 118
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_3_INDEX = 118;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_3_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_3</i>" has unique parent "<i>r_tarsal_distal_phalanx_3</i>" in HAnimSegmentObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_3
	 * @see HAnimSegmentObject#NAME_R_TARSAL_DISTAL_PHALANX_3 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_3_PARENT = "r_tarsal_distal_phalanx_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_4"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_4</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_4 = "r_tarsal_distal_phalanx_4";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_4</i>" has unique index 119
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_4_INDEX = 119;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_4_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_4</i>" has unique parent "<i>r_tarsal_distal_phalanx_4</i>" in HAnimSegmentObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_4
	 * @see HAnimSegmentObject#NAME_R_TARSAL_DISTAL_PHALANX_4 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_4_PARENT = "r_tarsal_distal_phalanx_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>featurePointNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_5"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_5</i> (XML syntax).
	 * @see #featurePointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_5 = "r_tarsal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has unique index 120
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_5_INDEX = 120;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_5_LOA = 4;
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has unique parent "<i>r_tarsal_distal_phalanx_5</i>" in HAnimSegmentObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5
	 * @see HAnimSegmentObject#NAME_R_TARSAL_DISTAL_PHALANX_5 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_5_PARENT = "r_tarsal_distal_phalanx_5";
	/** SFString featurePointNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has alias "<i>r_tarsal_interphalangeal_pha5</i>"
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_5_ALIAS = "r_tarsal_interphalangeal_pha5";

	// special enumeration utility methods

	/** Get index for this featurePointName
	 * @param featurePointName of interest
	 * @return index value, otherwise -1 if not found
	 */
	public static int getFeaturePointNameIndex(String featurePointName)
	{
		if      (featurePointName.equalsIgnoreCase(NAME_SKULL_VERTEX)) return NAME_SKULL_VERTEX_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_GLABELLA)) return NAME_GLABELLA_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_SELLION)) return NAME_SELLION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_INFRAORBITALE)) return NAME_L_INFRAORBITALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TRAGION)) return NAME_L_TRAGION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_GONION)) return NAME_L_GONION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_INFRAORBITALE)) return NAME_R_INFRAORBITALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TRAGION)) return NAME_R_TRAGION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_GONION)) return NAME_R_GONION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_SUPRAMENTON)) return NAME_SUPRAMENTON_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_CERVICALE)) return NAME_CERVICALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_ADAMS_APPLE)) return NAME_ADAMS_APPLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_SUPRASTERNALE)) return NAME_SUPRASTERNALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_SUBSTERNALE)) return NAME_SUBSTERNALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ACROMION)) return NAME_L_ACROMION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_PROXIMAL)) return NAME_L_AXILLA_PROXIMAL_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_DISTAL)) return NAME_L_AXILLA_DISTAL_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_POSTERIOR_FOLDS)) return NAME_L_AXILLA_POSTERIOR_FOLDS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ACROMION)) return NAME_R_ACROMION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_PROXIMAL)) return NAME_R_AXILLA_PROXIMAL_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_DISTAL)) return NAME_R_AXILLA_DISTAL_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_POSTERIOR_FOLDS)) return NAME_R_AXILLA_POSTERIOR_FOLDS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_1_MIDDLE_BACK)) return NAME_SPINE_1_MIDDLE_BACK_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_2_LOWER_BACK)) return NAME_SPINE_2_LOWER_BACK_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_ANTERIOR)) return NAME_WAIST_PREFERRED_ANTERIOR_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_POSTERIOR)) return NAME_WAIST_PREFERRED_POSTERIOR_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RIB10)) return NAME_L_RIB10_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_THELION)) return NAME_L_THELION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RIB10)) return NAME_R_RIB10_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_THELION)) return NAME_R_THELION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ASIS)) return NAME_L_ASIS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ILIOCRISTALE)) return NAME_L_ILIOCRISTALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_PSIS)) return NAME_L_PSIS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ASIS)) return NAME_R_ASIS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ILIOCRISTALE)) return NAME_R_ILIOCRISTALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_PSIS)) return NAME_R_PSIS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_CROTCH)) return NAME_CROTCH_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_LATERAL_EPICONDYLE)) return NAME_L_FEMORAL_LATERAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_L_FEMORAL_MEDIAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SUPRAPATELLA)) return NAME_L_SUPRAPATELLA_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TROCHANTERION)) return NAME_L_TROCHANTERION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_LATERAL_EPICONDYLE)) return NAME_R_FEMORAL_LATERAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_R_FEMORAL_MEDIAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SUPRAPATELLA)) return NAME_R_SUPRAPATELLA_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TROCHANTERION)) return NAME_R_TROCHANTERION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TIBIALE)) return NAME_L_TIBIALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_MEDIAL_MALLEOLUS)) return NAME_L_MEDIAL_MALLEOLUS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_LATERAL_MALLEOLUS)) return NAME_L_LATERAL_MALLEOLUS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SPHYRION)) return NAME_L_SPHYRION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TIBIALE)) return NAME_R_TIBIALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_MEDIAL_MALLEOLUS)) return NAME_R_MEDIAL_MALLEOLUS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_LATERAL_MALLEOLUS)) return NAME_R_LATERAL_MALLEOLUS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SPHYRION)) return NAME_R_SPHYRION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_1)) return NAME_L_METATARSAL_PHALANX_1_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_5)) return NAME_L_METATARSAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_DACTYLION)) return NAME_L_DACTYLION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CALCANEUS_POSTERIOR)) return NAME_L_CALCANEUS_POSTERIOR_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_1)) return NAME_R_METATARSAL_PHALANX_1_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_5)) return NAME_R_METATARSAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_DACTYLION)) return NAME_R_DACTYLION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CALCANEUS_POSTERIOR)) return NAME_R_CALCANEUS_POSTERIOR_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_LATERAL_EPICONDYLE)) return NAME_L_HUMERAL_LATERAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_L_HUMERAL_MEDIAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_OLECRANON)) return NAME_L_OLECRANON_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_LATERAL_EPICONDYLE)) return NAME_R_HUMERAL_LATERAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_R_HUMERAL_MEDIAL_EPICONDYLE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_OLECRANON)) return NAME_R_OLECRANON_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RADIALE)) return NAME_L_RADIALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ULNAR_STYLOID)) return NAME_L_ULNAR_STYLOID_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RADIAL_STYLOID)) return NAME_L_RADIAL_STYLOID_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RADIALE)) return NAME_R_RADIALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ULNAR_STYLOID)) return NAME_R_ULNAR_STYLOID_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RADIAL_STYLOID)) return NAME_R_RADIAL_STYLOID_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_2)) return NAME_L_METACARPAL_PHALANX_2_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_3)) return NAME_L_METACARPAL_PHALANX_3_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_5)) return NAME_L_METACARPAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_2)) return NAME_R_METACARPAL_PHALANX_2_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_3)) return NAME_R_METACARPAL_PHALANX_3_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_5)) return NAME_R_METACARPAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_NUCHALE)) return NAME_NUCHALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_NECK_BASE)) return NAME_L_NECK_BASE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_NECK_BASE)) return NAME_R_NECK_BASE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_NAVEL)) return NAME_NAVEL_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ECTOCANTHUS)) return NAME_L_ECTOCANTHUS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ECTOCANTHUS)) return NAME_R_ECTOCANTHUS_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_MENTON)) return NAME_MENTON_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_MESOSTERNALE)) return NAME_MESOSTERNALE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_OPISTHOCRANION)) return NAME_OPISTHOCRANION_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_KNEE_CREASE)) return NAME_L_KNEE_CREASE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_KNEE_CREASE)) return NAME_R_KNEE_CREASE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_REAR_CENTER_MIDSAGITTAL_PLANE)) return NAME_REAR_CENTER_MIDSAGITTAL_PLANE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT)) return NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CHEST_MIDSAGITTAL_PLANE)) return NAME_L_CHEST_MIDSAGITTAL_PLANE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CHEST_MIDSAGITTAL_PLANE)) return NAME_R_CHEST_MIDSAGITTAL_PLANE_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_BIDELTOID)) return NAME_L_BIDELTOID_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_BIDELTOID)) return NAME_R_BIDELTOID_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_1)) return NAME_L_TARSAL_DISTAL_PHALANX_1_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_3)) return NAME_L_TARSAL_DISTAL_PHALANX_3_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_4)) return NAME_L_TARSAL_DISTAL_PHALANX_4_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_1)) return NAME_R_TARSAL_DISTAL_PHALANX_1_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_3)) return NAME_R_TARSAL_DISTAL_PHALANX_3_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_4)) return NAME_R_TARSAL_DISTAL_PHALANX_4_INDEX;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_INDEX;
		else return -1; // not found
	}
	/** Whether an index exists for this featurePointName
	 * @param featurePointName of interest
	 * @return true if found
	 */
	public static boolean hasFeaturePointNameIndex(String featurePointName)
	{
		return (getFeaturePointNameIndex(featurePointName) > -1);
	}

	/** Get Level of Articulation (loa) for this featurePointName
	 * @param featurePointName of interest
	 * @return loa value, otherwise -1 if not found
	 */
	public static int getFeaturePointNameLoa(String featurePointName)
	{
		if      (featurePointName.equalsIgnoreCase(NAME_SKULL_VERTEX)) return NAME_SKULL_VERTEX_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_GLABELLA)) return NAME_GLABELLA_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_SELLION)) return NAME_SELLION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_INFRAORBITALE)) return NAME_L_INFRAORBITALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TRAGION)) return NAME_L_TRAGION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_GONION)) return NAME_L_GONION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_INFRAORBITALE)) return NAME_R_INFRAORBITALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TRAGION)) return NAME_R_TRAGION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_GONION)) return NAME_R_GONION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_SUPRAMENTON)) return NAME_SUPRAMENTON_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_CERVICALE)) return NAME_CERVICALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_ADAMS_APPLE)) return NAME_ADAMS_APPLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_SUPRASTERNALE)) return NAME_SUPRASTERNALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_SUBSTERNALE)) return NAME_SUBSTERNALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ACROMION)) return NAME_L_ACROMION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_PROXIMAL)) return NAME_L_AXILLA_PROXIMAL_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_DISTAL)) return NAME_L_AXILLA_DISTAL_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_POSTERIOR_FOLDS)) return NAME_L_AXILLA_POSTERIOR_FOLDS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ACROMION)) return NAME_R_ACROMION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_PROXIMAL)) return NAME_R_AXILLA_PROXIMAL_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_DISTAL)) return NAME_R_AXILLA_DISTAL_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_POSTERIOR_FOLDS)) return NAME_R_AXILLA_POSTERIOR_FOLDS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_1_MIDDLE_BACK)) return NAME_SPINE_1_MIDDLE_BACK_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_2_LOWER_BACK)) return NAME_SPINE_2_LOWER_BACK_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_ANTERIOR)) return NAME_WAIST_PREFERRED_ANTERIOR_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_POSTERIOR)) return NAME_WAIST_PREFERRED_POSTERIOR_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RIB10)) return NAME_L_RIB10_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_THELION)) return NAME_L_THELION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RIB10)) return NAME_R_RIB10_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_THELION)) return NAME_R_THELION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ASIS)) return NAME_L_ASIS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ILIOCRISTALE)) return NAME_L_ILIOCRISTALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_PSIS)) return NAME_L_PSIS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ASIS)) return NAME_R_ASIS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ILIOCRISTALE)) return NAME_R_ILIOCRISTALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_PSIS)) return NAME_R_PSIS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_CROTCH)) return NAME_CROTCH_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_LATERAL_EPICONDYLE)) return NAME_L_FEMORAL_LATERAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_L_FEMORAL_MEDIAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SUPRAPATELLA)) return NAME_L_SUPRAPATELLA_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TROCHANTERION)) return NAME_L_TROCHANTERION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_LATERAL_EPICONDYLE)) return NAME_R_FEMORAL_LATERAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_R_FEMORAL_MEDIAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SUPRAPATELLA)) return NAME_R_SUPRAPATELLA_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TROCHANTERION)) return NAME_R_TROCHANTERION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TIBIALE)) return NAME_L_TIBIALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_MEDIAL_MALLEOLUS)) return NAME_L_MEDIAL_MALLEOLUS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_LATERAL_MALLEOLUS)) return NAME_L_LATERAL_MALLEOLUS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SPHYRION)) return NAME_L_SPHYRION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TIBIALE)) return NAME_R_TIBIALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_MEDIAL_MALLEOLUS)) return NAME_R_MEDIAL_MALLEOLUS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_LATERAL_MALLEOLUS)) return NAME_R_LATERAL_MALLEOLUS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SPHYRION)) return NAME_R_SPHYRION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_1)) return NAME_L_METATARSAL_PHALANX_1_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_5)) return NAME_L_METATARSAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_DACTYLION)) return NAME_L_DACTYLION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CALCANEUS_POSTERIOR)) return NAME_L_CALCANEUS_POSTERIOR_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_1)) return NAME_R_METATARSAL_PHALANX_1_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_5)) return NAME_R_METATARSAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_DACTYLION)) return NAME_R_DACTYLION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CALCANEUS_POSTERIOR)) return NAME_R_CALCANEUS_POSTERIOR_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_LATERAL_EPICONDYLE)) return NAME_L_HUMERAL_LATERAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_L_HUMERAL_MEDIAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_OLECRANON)) return NAME_L_OLECRANON_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_LATERAL_EPICONDYLE)) return NAME_R_HUMERAL_LATERAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_R_HUMERAL_MEDIAL_EPICONDYLE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_OLECRANON)) return NAME_R_OLECRANON_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RADIALE)) return NAME_L_RADIALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ULNAR_STYLOID)) return NAME_L_ULNAR_STYLOID_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RADIAL_STYLOID)) return NAME_L_RADIAL_STYLOID_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RADIALE)) return NAME_R_RADIALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ULNAR_STYLOID)) return NAME_R_ULNAR_STYLOID_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RADIAL_STYLOID)) return NAME_R_RADIAL_STYLOID_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_2)) return NAME_L_METACARPAL_PHALANX_2_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_3)) return NAME_L_METACARPAL_PHALANX_3_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_5)) return NAME_L_METACARPAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_2)) return NAME_R_METACARPAL_PHALANX_2_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_3)) return NAME_R_METACARPAL_PHALANX_3_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_5)) return NAME_R_METACARPAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_NUCHALE)) return NAME_NUCHALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_NECK_BASE)) return NAME_L_NECK_BASE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_NECK_BASE)) return NAME_R_NECK_BASE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_NAVEL)) return NAME_NAVEL_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ECTOCANTHUS)) return NAME_L_ECTOCANTHUS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ECTOCANTHUS)) return NAME_R_ECTOCANTHUS_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_MENTON)) return NAME_MENTON_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_MESOSTERNALE)) return NAME_MESOSTERNALE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_OPISTHOCRANION)) return NAME_OPISTHOCRANION_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_KNEE_CREASE)) return NAME_L_KNEE_CREASE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_KNEE_CREASE)) return NAME_R_KNEE_CREASE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_REAR_CENTER_MIDSAGITTAL_PLANE)) return NAME_REAR_CENTER_MIDSAGITTAL_PLANE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT)) return NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CHEST_MIDSAGITTAL_PLANE)) return NAME_L_CHEST_MIDSAGITTAL_PLANE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CHEST_MIDSAGITTAL_PLANE)) return NAME_R_CHEST_MIDSAGITTAL_PLANE_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_BIDELTOID)) return NAME_L_BIDELTOID_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_BIDELTOID)) return NAME_R_BIDELTOID_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_1)) return NAME_L_TARSAL_DISTAL_PHALANX_1_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_3)) return NAME_L_TARSAL_DISTAL_PHALANX_3_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_4)) return NAME_L_TARSAL_DISTAL_PHALANX_4_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_1)) return NAME_R_TARSAL_DISTAL_PHALANX_1_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_3)) return NAME_R_TARSAL_DISTAL_PHALANX_3_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_4)) return NAME_R_TARSAL_DISTAL_PHALANX_4_LOA;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_LOA;
		else return -1; // not found
	}
	/** Whether an loa exists for this featurePointName
	 * @param featurePointName of interest
	 * @return true if found
	 */
	public static boolean hasFeaturePointNameLoa(String featurePointName)
	{
		return (getFeaturePointNameLoa(featurePointName) > -1);
	}

	/** Get alias for this featurePointName
	 * @param featurePointName of interest
	 * @return alias value, otherwise empty string if not found
	 */
	public static String getFeaturePointNameAlias(String featurePointName)
	{
		if      (featurePointName.equalsIgnoreCase(NAME_SKULL_VERTEX)) return NAME_SKULL_VERTEX_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_PROXIMAL)) return NAME_L_AXILLA_PROXIMAL_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_DISTAL)) return NAME_L_AXILLA_DISTAL_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_PROXIMAL)) return NAME_R_AXILLA_PROXIMAL_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_DISTAL)) return NAME_R_AXILLA_DISTAL_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_1_MIDDLE_BACK)) return NAME_SPINE_1_MIDDLE_BACK_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_2_LOWER_BACK)) return NAME_SPINE_2_LOWER_BACK_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_ANTERIOR)) return NAME_WAIST_PREFERRED_ANTERIOR_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_POSTERIOR)) return NAME_WAIST_PREFERRED_POSTERIOR_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RIB10)) return NAME_L_RIB10_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_THELION)) return NAME_L_THELION_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RIB10)) return NAME_R_RIB10_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_THELION)) return NAME_R_THELION_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ASIS)) return NAME_L_ASIS_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_PSIS)) return NAME_L_PSIS_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ASIS)) return NAME_R_ASIS_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_PSIS)) return NAME_R_PSIS_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_LATERAL_EPICONDYLE)) return NAME_L_FEMORAL_LATERAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_L_FEMORAL_MEDIAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SUPRAPATELLA)) return NAME_L_SUPRAPATELLA_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TROCHANTERION)) return NAME_L_TROCHANTERION_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_LATERAL_EPICONDYLE)) return NAME_R_FEMORAL_LATERAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_R_FEMORAL_MEDIAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SUPRAPATELLA)) return NAME_R_SUPRAPATELLA_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TROCHANTERION)) return NAME_R_TROCHANTERION_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_1)) return NAME_L_METATARSAL_PHALANX_1_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_5)) return NAME_L_METATARSAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CALCANEUS_POSTERIOR)) return NAME_L_CALCANEUS_POSTERIOR_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_1)) return NAME_R_METATARSAL_PHALANX_1_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_5)) return NAME_R_METATARSAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CALCANEUS_POSTERIOR)) return NAME_R_CALCANEUS_POSTERIOR_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_LATERAL_EPICONDYLE)) return NAME_L_HUMERAL_LATERAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_L_HUMERAL_MEDIAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_LATERAL_EPICONDYLE)) return NAME_R_HUMERAL_LATERAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_R_HUMERAL_MEDIAL_EPICONDYLE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_2)) return NAME_L_METACARPAL_PHALANX_2_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_5)) return NAME_L_METACARPAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_2)) return NAME_R_METACARPAL_PHALANX_2_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_5)) return NAME_R_METACARPAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_NUCHALE)) return NAME_NUCHALE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_NAVEL)) return NAME_NAVEL_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ECTOCANTHUS)) return NAME_L_ECTOCANTHUS_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ECTOCANTHUS)) return NAME_R_ECTOCANTHUS_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_MENTON)) return NAME_MENTON_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_MESOSTERNALE)) return NAME_MESOSTERNALE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_REAR_CENTER_MIDSAGITTAL_PLANE)) return NAME_REAR_CENTER_MIDSAGITTAL_PLANE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CHEST_MIDSAGITTAL_PLANE)) return NAME_L_CHEST_MIDSAGITTAL_PLANE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CHEST_MIDSAGITTAL_PLANE)) return NAME_R_CHEST_MIDSAGITTAL_PLANE_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_ALIAS;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_ALIAS;
		else return ""; // not found
	}
	/** Whether a alias exists for this featurePointName
	 * @param featurePointName of interest
	 * @return true if found
	 */
	public static boolean hasFeaturePointNameAlias(String featurePointName)
	{
		return !getFeaturePointNameAlias(featurePointName).isEmpty();
	}

	/** Get parent for this featurePointName
	 * @param featurePointName of interest
	 * @return parent value, otherwise empty string if not found
	 */
	public static String getParentFeaturePointName(String featurePointName)
	{
		if      (featurePointName.equalsIgnoreCase(NAME_SKULL_VERTEX)) return NAME_SKULL_VERTEX_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_GLABELLA)) return NAME_GLABELLA_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_SELLION)) return NAME_SELLION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_INFRAORBITALE)) return NAME_L_INFRAORBITALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TRAGION)) return NAME_L_TRAGION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_GONION)) return NAME_L_GONION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_INFRAORBITALE)) return NAME_R_INFRAORBITALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TRAGION)) return NAME_R_TRAGION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_GONION)) return NAME_R_GONION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_SUPRAMENTON)) return NAME_SUPRAMENTON_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_CERVICALE)) return NAME_CERVICALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_ADAMS_APPLE)) return NAME_ADAMS_APPLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_SUPRASTERNALE)) return NAME_SUPRASTERNALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_SUBSTERNALE)) return NAME_SUBSTERNALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ACROMION)) return NAME_L_ACROMION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_PROXIMAL)) return NAME_L_AXILLA_PROXIMAL_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_DISTAL)) return NAME_L_AXILLA_DISTAL_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_AXILLA_POSTERIOR_FOLDS)) return NAME_L_AXILLA_POSTERIOR_FOLDS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ACROMION)) return NAME_R_ACROMION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_PROXIMAL)) return NAME_R_AXILLA_PROXIMAL_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_DISTAL)) return NAME_R_AXILLA_DISTAL_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_AXILLA_POSTERIOR_FOLDS)) return NAME_R_AXILLA_POSTERIOR_FOLDS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_1_MIDDLE_BACK)) return NAME_SPINE_1_MIDDLE_BACK_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_SPINE_2_LOWER_BACK)) return NAME_SPINE_2_LOWER_BACK_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_ANTERIOR)) return NAME_WAIST_PREFERRED_ANTERIOR_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_WAIST_PREFERRED_POSTERIOR)) return NAME_WAIST_PREFERRED_POSTERIOR_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RIB10)) return NAME_L_RIB10_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_THELION)) return NAME_L_THELION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RIB10)) return NAME_R_RIB10_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_THELION)) return NAME_R_THELION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ASIS)) return NAME_L_ASIS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ILIOCRISTALE)) return NAME_L_ILIOCRISTALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_PSIS)) return NAME_L_PSIS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ASIS)) return NAME_R_ASIS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ILIOCRISTALE)) return NAME_R_ILIOCRISTALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_PSIS)) return NAME_R_PSIS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_CROTCH)) return NAME_CROTCH_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_LATERAL_EPICONDYLE)) return NAME_L_FEMORAL_LATERAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_L_FEMORAL_MEDIAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SUPRAPATELLA)) return NAME_L_SUPRAPATELLA_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TROCHANTERION)) return NAME_L_TROCHANTERION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_LATERAL_EPICONDYLE)) return NAME_R_FEMORAL_LATERAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_FEMORAL_MEDIAL_EPICONDYLE)) return NAME_R_FEMORAL_MEDIAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SUPRAPATELLA)) return NAME_R_SUPRAPATELLA_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TROCHANTERION)) return NAME_R_TROCHANTERION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TIBIALE)) return NAME_L_TIBIALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_MEDIAL_MALLEOLUS)) return NAME_L_MEDIAL_MALLEOLUS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_LATERAL_MALLEOLUS)) return NAME_L_LATERAL_MALLEOLUS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_SPHYRION)) return NAME_L_SPHYRION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TIBIALE)) return NAME_R_TIBIALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_MEDIAL_MALLEOLUS)) return NAME_R_MEDIAL_MALLEOLUS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_LATERAL_MALLEOLUS)) return NAME_R_LATERAL_MALLEOLUS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_SPHYRION)) return NAME_R_SPHYRION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_1)) return NAME_L_METATARSAL_PHALANX_1_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METATARSAL_PHALANX_5)) return NAME_L_METATARSAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_DACTYLION)) return NAME_L_DACTYLION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CALCANEUS_POSTERIOR)) return NAME_L_CALCANEUS_POSTERIOR_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_1)) return NAME_R_METATARSAL_PHALANX_1_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METATARSAL_PHALANX_5)) return NAME_R_METATARSAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_DACTYLION)) return NAME_R_DACTYLION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CALCANEUS_POSTERIOR)) return NAME_R_CALCANEUS_POSTERIOR_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_LATERAL_EPICONDYLE)) return NAME_L_HUMERAL_LATERAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_L_HUMERAL_MEDIAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_OLECRANON)) return NAME_L_OLECRANON_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_LATERAL_EPICONDYLE)) return NAME_R_HUMERAL_LATERAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_HUMERAL_MEDIAL_EPICONDYLE)) return NAME_R_HUMERAL_MEDIAL_EPICONDYLE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_OLECRANON)) return NAME_R_OLECRANON_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RADIALE)) return NAME_L_RADIALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ULNAR_STYLOID)) return NAME_L_ULNAR_STYLOID_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_RADIAL_STYLOID)) return NAME_L_RADIAL_STYLOID_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RADIALE)) return NAME_R_RADIALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ULNAR_STYLOID)) return NAME_R_ULNAR_STYLOID_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_RADIAL_STYLOID)) return NAME_R_RADIAL_STYLOID_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_2)) return NAME_L_METACARPAL_PHALANX_2_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_3)) return NAME_L_METACARPAL_PHALANX_3_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_METACARPAL_PHALANX_5)) return NAME_L_METACARPAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_2)) return NAME_R_METACARPAL_PHALANX_2_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_3)) return NAME_R_METACARPAL_PHALANX_3_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_METACARPAL_PHALANX_5)) return NAME_R_METACARPAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_NUCHALE)) return NAME_NUCHALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_NECK_BASE)) return NAME_L_NECK_BASE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_NECK_BASE)) return NAME_R_NECK_BASE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_NAVEL)) return NAME_NAVEL_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_ECTOCANTHUS)) return NAME_L_ECTOCANTHUS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_ECTOCANTHUS)) return NAME_R_ECTOCANTHUS_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_MENTON)) return NAME_MENTON_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_MESOSTERNALE)) return NAME_MESOSTERNALE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_OPISTHOCRANION)) return NAME_OPISTHOCRANION_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_KNEE_CREASE)) return NAME_L_KNEE_CREASE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_KNEE_CREASE)) return NAME_R_KNEE_CREASE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_REAR_CENTER_MIDSAGITTAL_PLANE)) return NAME_REAR_CENTER_MIDSAGITTAL_PLANE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT)) return NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CHEST_MIDSAGITTAL_PLANE)) return NAME_L_CHEST_MIDSAGITTAL_PLANE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CHEST_MIDSAGITTAL_PLANE)) return NAME_R_CHEST_MIDSAGITTAL_PLANE_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_BIDELTOID)) return NAME_L_BIDELTOID_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_BIDELTOID)) return NAME_R_BIDELTOID_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_1)) return NAME_L_TARSAL_DISTAL_PHALANX_1_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_3)) return NAME_L_TARSAL_DISTAL_PHALANX_3_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_4)) return NAME_L_TARSAL_DISTAL_PHALANX_4_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_1)) return NAME_R_TARSAL_DISTAL_PHALANX_1_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_3)) return NAME_R_TARSAL_DISTAL_PHALANX_3_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_4)) return NAME_R_TARSAL_DISTAL_PHALANX_4_PARENT;
		else if (featurePointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_PARENT;
		else return ""; // not found
	}
	/** Whether a parent exists for this featurePointName
	 * @param featurePointName of interest
	 * @return true if found
	 */
	public static boolean hasParentMatchingName(String featurePointName)
	{
		return !getParentFeaturePointName(featurePointName).isEmpty();
	}

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>HAnimSite</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "HAnimSite";

	/** Provides name of this element: <i>HAnimSite</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>HAnimSite</i> element: <i>HAnim</i> */
	public static final String COMPONENT = "HAnim";

	/** Defines X3D component for the <i>HAnimSite</i> element: <i>HAnim</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>HAnim</i> component level for this element: <i>1</i> */
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

	/** SFVec3f field named <i>bboxCenter</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BBOXCENTER_DEFAULT_VALUE = {0f,0f,0f};

	/** SFVec3f field named <i>bboxSize</i> has default value <i>{-1f,-1f,-1f}</i> (Java syntax) or <i>-1 -1 -1</i> (XML syntax). */
	public static final float[] BBOXSIZE_DEFAULT_VALUE = {-1f,-1f,-1f};

	/** SFVec3f field named <i>center</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] CENTER_DEFAULT_VALUE = {0f,0f,0f};

	/** SFString field named <i>description</i> has default value equal to an empty string. */
	public static final String DESCRIPTION_DEFAULT_VALUE = "";

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFString field named <i>name</i> has default value equal to an empty string. */
	public static final String NAME_DEFAULT_VALUE = "";

	/** SFRotation field named <i>rotation</i> has default value <i>{0f,0f,1f,0f}</i> (Java syntax) or <i>0 0 1 0</i> (XML syntax). */
	public static final float[] ROTATION_DEFAULT_VALUE = {0f,0f,1f,0f};

	/** SFVec3f field named <i>scale</i> has default value <i>{1f,1f,1f}</i> (Java syntax) or <i>1 1 1</i> (XML syntax). */
	public static final float[] SCALE_DEFAULT_VALUE = {1f,1f,1f};

	/** SFRotation field named <i>scaleOrientation</i> has default value <i>{0f,0f,1f,0f}</i> (Java syntax) or <i>0 0 1 0</i> (XML syntax). */
	public static final float[] SCALEORIENTATION_DEFAULT_VALUE = {0f,0f,1f,0f};

	/** SFVec3f field named <i>translation</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] TRANSLATION_DEFAULT_VALUE = {0f,0f,0f};

	/** SFBool field named <i>visible</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean VISIBLE_DEFAULT_VALUE = true;

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
			case "addChildren":
				result = "MFNode";
				break;
			case "bboxCenter":
				result = "SFVec3f";
				break;
			case "bboxSize":
				result = "SFVec3f";
				break;
			case "center":
				result = "SFVec3f";
				break;
			case "children":
				result = "MFNode";
				break;
			case "description":
				result = "SFString";
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
			case "removeChildren":
				result = "MFNode";
				break;
			case "rotation":
				result = "SFRotation";
				break;
			case "scale":
				result = "SFVec3f";
				break;
			case "scaleOrientation":
				result = "SFRotation";
				break;
			case "translation":
				result = "SFVec3f";
				break;
			case "visible":
				result = "SFBool";
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
			case "addChildren":
				result = "inputOnly";
				break;
			case "bboxCenter":
				result = "initializeOnly";
				break;
			case "bboxSize":
				result = "initializeOnly";
				break;
			case "center":
				result = "inputOutput";
				break;
			case "children":
				result = "inputOutput";
				break;
			case "description":
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
			case "removeChildren":
				result = "inputOnly";
				break;
			case "rotation":
				result = "inputOutput";
				break;
			case "scale":
				result = "inputOutput";
				break;
			case "scaleOrientation":
				result = "inputOutput";
				break;
			case "translation":
				result = "inputOutput";
				break;
			case "visible":
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
	public static final String containerField_DEFAULT_VALUE = "children"; // type containerFieldChoicesHAnimSite
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

	/** toField ROUTE name for MFNode field named <i>addChildren</i>. */
	public static final String toField_ADDCHILDREN = "addChildren";

	/** fromField ROUTE name for SFVec3f field named <i>center</i>. */
	public static final String fromField_CENTER = "center";

	/** toField ROUTE name for SFVec3f field named <i>center</i>. */
	public static final String toField_CENTER = "center";

	/** fromField ROUTE name for MFNode field named <i>children</i>. */
	public static final String fromField_CHILDREN = "children";

	/** toField ROUTE name for MFNode field named <i>children</i>. */
	public static final String toField_CHILDREN = "children";

	/** fromField ROUTE name for SFString field named <i>description</i>. */
	public static final String fromField_DESCRIPTION = "description";

	/** toField ROUTE name for SFString field named <i>description</i>. */
	public static final String toField_DESCRIPTION = "description";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFString field named <i>name</i>. */
	public static final String fromField_NAME = "name";

	/** toField ROUTE name for SFString field named <i>name</i>. */
	public static final String toField_NAME = "name";

	/** toField ROUTE name for MFNode field named <i>removeChildren</i>. */
	public static final String toField_REMOVECHILDREN = "removeChildren";

	/** fromField ROUTE name for SFRotation field named <i>rotation</i>. */
	public static final String fromField_ROTATION = "rotation";

	/** toField ROUTE name for SFRotation field named <i>rotation</i>. */
	public static final String toField_ROTATION = "rotation";

	/** fromField ROUTE name for SFVec3f field named <i>scale</i>. */
	public static final String fromField_SCALE = "scale";

	/** toField ROUTE name for SFVec3f field named <i>scale</i>. */
	public static final String toField_SCALE = "scale";

	/** fromField ROUTE name for SFRotation field named <i>scaleOrientation</i>. */
	public static final String fromField_SCALEORIENTATION = "scaleOrientation";

	/** toField ROUTE name for SFRotation field named <i>scaleOrientation</i>. */
	public static final String toField_SCALEORIENTATION = "scaleOrientation";

	/** fromField ROUTE name for SFVec3f field named <i>translation</i>. */
	public static final String fromField_TRANSLATION = "translation";

	/** toField ROUTE name for SFVec3f field named <i>translation</i>. */
	public static final String toField_TRANSLATION = "translation";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for HAnimSiteObject to initialize member variables with default values. */
	public HAnimSiteObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "children" }; // type containerFieldChoicesHAnimSite

		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		center = CENTER_DEFAULT_VALUE;
		children = new ArrayList<>();
		description = DESCRIPTION_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		name = NAME_DEFAULT_VALUE;
		rotation = ROTATION_DEFAULT_VALUE;
		scale = SCALE_DEFAULT_VALUE;
		scaleOrientation = SCALEORIENTATION_DEFAULT_VALUE;
		translation = TRANSLATION_DEFAULT_VALUE;
		visible = VISIBLE_DEFAULT_VALUE;
	}

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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBboxCenter()
	{
		return bboxCenter;
	}

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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxCenter(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBboxCenter(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxCenter(double[] newArray)
	{
		return setBboxCenter(new SFVec3fObject(newArray));
	}
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBboxSize()
	{
		return bboxSize;
	}

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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxSize(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBboxSize(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default location of this HAnimSite, i.e. offset of center from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @return value of center field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getCenter()
	{
		return center;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default location of this HAnimSite, i.e. offset of center from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite center newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		center = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f center field, similar to {@link #setCenter(float[])}.
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setCenter(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCenter(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f center field, similar to {@link #setCenter(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setCenter(float x, float y, float z)
	{
		setCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setCenter(double x, double y, double z)
	{
		return setCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setCenter(double[] newArray)
	{
		return setCenter(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of X3DChildNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>children</i>.
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getChildren()
	{
		final X3DNode[] valuesArray = new X3DNode[children.size()];
		int i = 0;
		for (X3DNode arrayElement : children) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode children field, similar to {@link #getChildren()}.
	 * @return value of children field
	 */
	public ArrayList<X3DNode> getChildrenList()
	{
		return children;
	}

	/**
	 * Accessor method to assign X3DChildNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setChildren(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearChildren(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChildren(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				children.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode children field, similar to {@link #setChildren(X3DNode[])}.
	 * @param newValue is new value for the children field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setChildren(ArrayList<X3DChildNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearChildren(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChildren(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChildren(newArray);
        }
		for (X3DChildNode element : newValue)
		{
			children.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single node to existing array of children nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode and ProtoInstance.
	 * @param newValue is new value to be appended the children field.	 */
	public void addChildren(X3DNode newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for children field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimSiteObject addChildren(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}

	/**
	 * Utility method to add single child element to contained list of existing children nodes (if any).
	 * @param newValue is new node value to be appended the children field.	 
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	*/
	public HAnimSiteObject addChild(X3DChildNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest3
        if (newValue instanceof ProtoInstanceObject)
            ((ProtoInstanceObject) newValue).setContainerField("children");
		return this;
	}
	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value array to be appended the children field.
	 */
	@Override // or here2?
	public void addChildren(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				children.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("children");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single children node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DChildNode.
	 * @param newValue is new node for the children field (restricted to X3DChildNode)
	 */
	@Override
	public void setChildren(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearChildren(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : children)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearChildren(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			children.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of children field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimSiteObject clearChildren()
	{
		for (X3DNode element : children)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		children.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>children</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getChildren()
	 */
	public boolean hasChildren()
	{
		return (!children.isEmpty());
	}

	/**
	 * Add comment as CommentsBlock to children field
	 * @param newComment initial value
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimSiteObject addComments (String newComment)
	{
		if (newComment == null) return this;
		children.add(new CommentsBlock (newComment));
		return this;
	}
	/**
	 * Add comments as String[] array to children field
	 * @param newComments array of comments
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimSiteObject addComments (String[] newComments)
	{
		if (newComments == null) return this;
		children.add(new CommentsBlock (newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to children field
	 * @param newCommentsBlock block of comments to add
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject addComments (CommentsBlock newCommentsBlock)
	{
		if (newCommentsBlock == null) return this;
		children.add(newCommentsBlock);
		return this;
	}
											/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * @return value of description field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public String getDescription()
	{
		return description;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setDescription(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		description = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString description field, similar to {@link #setDescription(String)}.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setDescription(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDescription(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setIS(ISObject newValue)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimSiteObject clearIS()
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimSiteObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setMetadata(ProtoInstanceObject newValue)
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
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #NAME_SKULL_VERTEX SKULL_VERTEX}, {@link #NAME_GLABELLA GLABELLA}, {@link #NAME_SELLION SELLION}, {@link #NAME_L_INFRAORBITALE L_INFRAORBITALE}, {@link #NAME_L_TRAGION L_TRAGION}, {@link #NAME_L_GONION L_GONION}, {@link #NAME_R_INFRAORBITALE R_INFRAORBITALE}, {@link #NAME_R_TRAGION R_TRAGION}, {@link #NAME_R_GONION R_GONION}, {@link #NAME_SUPRAMENTON SUPRAMENTON}, {@link #NAME_CERVICALE CERVICALE}, {@link #NAME_ADAMS_APPLE ADAMS_APPLE}, {@link #NAME_SUPRASTERNALE SUPRASTERNALE}, {@link #NAME_SUBSTERNALE SUBSTERNALE}, {@link #NAME_L_CLAVICLE L_CLAVICLE}, {@link #NAME_L_ACROMION L_ACROMION}, {@link #NAME_L_AXILLA_PROXIMAL L_AXILLA_PROXIMAL}, {@link #NAME_L_AXILLA_DISTAL L_AXILLA_DISTAL}, {@link #NAME_L_AXILLA_POSTERIOR_FOLDS L_AXILLA_POSTERIOR_FOLDS}, {@link #NAME_R_CLAVICLE R_CLAVICLE}, {@link #NAME_R_ACROMION R_ACROMION}, {@link #NAME_R_AXILLA_PROXIMAL R_AXILLA_PROXIMAL}, {@link #NAME_R_AXILLA_DISTAL R_AXILLA_DISTAL}, {@link #NAME_R_AXILLA_POSTERIOR_FOLDS R_AXILLA_POSTERIOR_FOLDS}, {@link #NAME_SPINE_1_MIDDLE_BACK SPINE_1_MIDDLE_BACK}, {@link #NAME_SPINE_2_LOWER_BACK SPINE_2_LOWER_BACK}, {@link #NAME_WAIST_PREFERRED_ANTERIOR WAIST_PREFERRED_ANTERIOR}, {@link #NAME_WAIST_PREFERRED_POSTERIOR WAIST_PREFERRED_POSTERIOR}, {@link #NAME_L_RIB10 L_RIB10}, {@link #NAME_L_THELION L_THELION}, {@link #NAME_R_RIB10 R_RIB10}, {@link #NAME_R_THELION R_THELION}, {@link #NAME_L_ASIS L_ASIS}, {@link #NAME_L_ILIOCRISTALE L_ILIOCRISTALE}, {@link #NAME_L_PSIS L_PSIS}, {@link #NAME_R_ASIS R_ASIS}, {@link #NAME_R_ILIOCRISTALE R_ILIOCRISTALE}, {@link #NAME_R_PSIS R_PSIS}, {@link #NAME_CROTCH CROTCH}, {@link #NAME_L_FEMORAL_LATERAL_EPICONDYLE L_FEMORAL_LATERAL_EPICONDYLE}, {@link #NAME_L_FEMORAL_MEDIAL_EPICONDYLE L_FEMORAL_MEDIAL_EPICONDYLE}, {@link #NAME_L_SUPRAPATELLA L_SUPRAPATELLA}, {@link #NAME_L_TROCHANTERION L_TROCHANTERION}, {@link #NAME_R_FEMORAL_LATERAL_EPICONDYLE R_FEMORAL_LATERAL_EPICONDYLE}, {@link #NAME_R_FEMORAL_MEDIAL_EPICONDYLE R_FEMORAL_MEDIAL_EPICONDYLE}, {@link #NAME_R_SUPRAPATELLA R_SUPRAPATELLA}, {@link #NAME_R_TROCHANTERION R_TROCHANTERION}, {@link #NAME_L_TIBIALE L_TIBIALE}, {@link #NAME_L_MEDIAL_MALLEOLUS L_MEDIAL_MALLEOLUS}, {@link #NAME_L_LATERAL_MALLEOLUS L_LATERAL_MALLEOLUS}, {@link #NAME_L_SPHYRION L_SPHYRION}, {@link #NAME_R_TIBIALE R_TIBIALE}, {@link #NAME_R_MEDIAL_MALLEOLUS R_MEDIAL_MALLEOLUS}, {@link #NAME_R_LATERAL_MALLEOLUS R_LATERAL_MALLEOLUS}, {@link #NAME_R_SPHYRION R_SPHYRION}, {@link #NAME_L_METATARSAL_PHALANX_1 L_METATARSAL_PHALANX_1}, {@link #NAME_L_METATARSAL_PHALANX_5 L_METATARSAL_PHALANX_5}, {@link #NAME_L_DACTYLION L_DACTYLION}, {@link #NAME_L_CALCANEUS_POSTERIOR L_CALCANEUS_POSTERIOR}, {@link #NAME_R_METATARSAL_PHALANX_1 R_METATARSAL_PHALANX_1}, {@link #NAME_R_METATARSAL_PHALANX_5 R_METATARSAL_PHALANX_5}, {@link #NAME_R_DACTYLION R_DACTYLION}, {@link #NAME_R_CALCANEUS_POSTERIOR R_CALCANEUS_POSTERIOR}, {@link #NAME_L_HUMERAL_LATERAL_EPICONDYLE L_HUMERAL_LATERAL_EPICONDYLE}, {@link #NAME_L_HUMERAL_MEDIAL_EPICONDYLE L_HUMERAL_MEDIAL_EPICONDYLE}, {@link #NAME_L_OLECRANON L_OLECRANON}, {@link #NAME_R_HUMERAL_LATERAL_EPICONDYLE R_HUMERAL_LATERAL_EPICONDYLE}, {@link #NAME_R_HUMERAL_MEDIAL_EPICONDYLE R_HUMERAL_MEDIAL_EPICONDYLE}, {@link #NAME_R_OLECRANON R_OLECRANON}, {@link #NAME_L_RADIALE L_RADIALE}, {@link #NAME_L_ULNAR_STYLOID L_ULNAR_STYLOID}, {@link #NAME_L_RADIAL_STYLOID L_RADIAL_STYLOID}, {@link #NAME_R_RADIALE R_RADIALE}, {@link #NAME_R_ULNAR_STYLOID R_ULNAR_STYLOID}, {@link #NAME_R_RADIAL_STYLOID R_RADIAL_STYLOID}, {@link #NAME_L_METACARPAL_PHALANX_2 L_METACARPAL_PHALANX_2}, {@link #NAME_L_METACARPAL_PHALANX_3 L_METACARPAL_PHALANX_3}, {@link #NAME_L_METACARPAL_PHALANX_5 L_METACARPAL_PHALANX_5}, {@link #NAME_R_METACARPAL_PHALANX_2 R_METACARPAL_PHALANX_2}, {@link #NAME_R_METACARPAL_PHALANX_3 R_METACARPAL_PHALANX_3}, {@link #NAME_R_METACARPAL_PHALANX_5 R_METACARPAL_PHALANX_5}, {@link #NAME_NUCHALE NUCHALE}, {@link #NAME_L_NECK_BASE L_NECK_BASE}, {@link #NAME_R_NECK_BASE R_NECK_BASE}, {@link #NAME_NAVEL NAVEL}, {@link #NAME_L_ECTOCANTHUS L_ECTOCANTHUS}, {@link #NAME_R_ECTOCANTHUS R_ECTOCANTHUS}, {@link #NAME_MENTON MENTON}, {@link #NAME_MESOSTERNALE MESOSTERNALE}, {@link #NAME_OPISTHOCRANION OPISTHOCRANION}, {@link #NAME_L_KNEE_CREASE L_KNEE_CREASE}, {@link #NAME_R_KNEE_CREASE R_KNEE_CREASE}, {@link #NAME_REAR_CENTER_MIDSAGITTAL_PLANE REAR_CENTER_MIDSAGITTAL_PLANE}, {@link #NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT BUTTOCKS_STANDING_WALL_CONTACT_POINT}, {@link #NAME_L_CHEST_MIDSAGITTAL_PLANE L_CHEST_MIDSAGITTAL_PLANE}, {@link #NAME_R_CHEST_MIDSAGITTAL_PLANE R_CHEST_MIDSAGITTAL_PLANE}, {@link #NAME_L_BIDELTOID L_BIDELTOID}, {@link #NAME_R_BIDELTOID R_BIDELTOID}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_1 L_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_2 L_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_3 L_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_4 L_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_5 L_CARPAL_DISTAL_PHALANX_5}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_1 R_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_2 R_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_3 R_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_4 R_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_5 R_CARPAL_DISTAL_PHALANX_5}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_1 L_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_2 L_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_3 L_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_4 L_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_5 L_TARSAL_DISTAL_PHALANX_5}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_1 R_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_2 R_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_3 R_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_4 R_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_5 R_TARSAL_DISTAL_PHALANX_5}.
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String enumeration value ("skull_vertex" | "glabella" | "sellion" | "l_infraorbitale" | "l_tragion" | "l_gonion" | "r_infraorbitale" | "r_tragion" | "r_gonion" | "supramenton" | "cervicale" | "adams_apple" | "suprasternale" | "substernale" | "l_clavicle" | "l_acromion" | "l_axilla_proximal" | "l_axilla_distal" | "l_axilla_posterior_folds" | "r_clavicle" | "r_acromion" | "r_axilla_proximal" | "r_axilla_distal" | "r_axilla_posterior_folds" | "spine_1_middle_back" | "spine_2_lower_back" | "waist_preferred_anterior" | "waist_preferred_posterior" | "l_rib10" | "l_thelion" | "r_rib10" | "r_thelion" | "l_asis" | "l_iliocristale" | "l_psis" | "r_asis" | "r_iliocristale" | "r_psis" | "crotch" | "l_femoral_lateral_epicondyle" | "l_femoral_medial_epicondyle" | "l_suprapatella" | "l_trochanterion" | "r_femoral_lateral_epicondyle" | "r_femoral_medial_epicondyle" | "r_suprapatella" | "r_trochanterion" | "l_tibiale" | "l_medial_malleolus" | "l_lateral_malleolus" | "l_sphyrion" | "r_tibiale" | "r_medial_malleolus" | "r_lateral_malleolus" | "r_sphyrion" | "l_metatarsal_phalanx_1" | "l_metatarsal_phalanx_5" | "l_dactylion" | "l_calcaneus_posterior" | "r_metatarsal_phalanx_1" | "r_metatarsal_phalanx_5" | "r_dactylion" | "r_calcaneus_posterior" | "l_humeral_lateral_epicondyle" | "l_humeral_medial_epicondyle" | "l_olecranon" | "r_humeral_lateral_epicondyle" | "r_humeral_medial_epicondyle" | "r_olecranon" | "l_radiale" | "l_ulnar_styloid" | "l_radial_styloid" | "r_radiale" | "r_ulnar_styloid" | "r_radial_styloid" | "l_metacarpal_phalanx_2" | "l_metacarpal_phalanx_3" | "l_metacarpal_phalanx_5" | "r_metacarpal_phalanx_2" | "r_metacarpal_phalanx_3" | "r_metacarpal_phalanx_5" | "nuchale" | "l_neck_base" | "r_neck_base" | "navel" | "l_ectocanthus" | "r_ectocanthus" | "menton" | "mesosternale" | "opisthocranion" | "l_knee_crease" | "r_knee_crease" | "rear_center_midsagittal_plane" | "buttocks_standing_wall_contact_point" | "l_chest_midsagittal_plane" | "r_chest_midsagittal_plane" | "l_bideltoid" | "r_bideltoid" | "l_carpal_distal_phalanx_1" | "l_carpal_distal_phalanx_2" | "l_carpal_distal_phalanx_3" | "l_carpal_distal_phalanx_4" | "l_carpal_distal_phalanx_5" | "r_carpal_distal_phalanx_1" | "r_carpal_distal_phalanx_2" | "r_carpal_distal_phalanx_3" | "r_carpal_distal_phalanx_4" | "r_carpal_distal_phalanx_5" | "l_tarsal_distal_phalanx_1" | "l_tarsal_distal_phalanx_2" | "l_tarsal_distal_phalanx_3" | "l_tarsal_distal_phalanx_4" | "l_tarsal_distal_phalanx_5" | "r_tarsal_distal_phalanx_1" | "r_tarsal_distal_phalanx_2" | "r_tarsal_distal_phalanx_3" | "r_tarsal_distal_phalanx_4" | "r_tarsal_distal_phalanx_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #NAME_SKULL_VERTEX SKULL_VERTEX}, {@link #NAME_GLABELLA GLABELLA}, {@link #NAME_SELLION SELLION}, {@link #NAME_L_INFRAORBITALE L_INFRAORBITALE}, {@link #NAME_L_TRAGION L_TRAGION}, {@link #NAME_L_GONION L_GONION}, {@link #NAME_R_INFRAORBITALE R_INFRAORBITALE}, {@link #NAME_R_TRAGION R_TRAGION}, {@link #NAME_R_GONION R_GONION}, {@link #NAME_SUPRAMENTON SUPRAMENTON}, {@link #NAME_CERVICALE CERVICALE}, {@link #NAME_ADAMS_APPLE ADAMS_APPLE}, {@link #NAME_SUPRASTERNALE SUPRASTERNALE}, {@link #NAME_SUBSTERNALE SUBSTERNALE}, {@link #NAME_L_CLAVICLE L_CLAVICLE}, {@link #NAME_L_ACROMION L_ACROMION}, {@link #NAME_L_AXILLA_PROXIMAL L_AXILLA_PROXIMAL}, {@link #NAME_L_AXILLA_DISTAL L_AXILLA_DISTAL}, {@link #NAME_L_AXILLA_POSTERIOR_FOLDS L_AXILLA_POSTERIOR_FOLDS}, {@link #NAME_R_CLAVICLE R_CLAVICLE}, {@link #NAME_R_ACROMION R_ACROMION}, {@link #NAME_R_AXILLA_PROXIMAL R_AXILLA_PROXIMAL}, {@link #NAME_R_AXILLA_DISTAL R_AXILLA_DISTAL}, {@link #NAME_R_AXILLA_POSTERIOR_FOLDS R_AXILLA_POSTERIOR_FOLDS}, {@link #NAME_SPINE_1_MIDDLE_BACK SPINE_1_MIDDLE_BACK}, {@link #NAME_SPINE_2_LOWER_BACK SPINE_2_LOWER_BACK}, {@link #NAME_WAIST_PREFERRED_ANTERIOR WAIST_PREFERRED_ANTERIOR}, {@link #NAME_WAIST_PREFERRED_POSTERIOR WAIST_PREFERRED_POSTERIOR}, {@link #NAME_L_RIB10 L_RIB10}, {@link #NAME_L_THELION L_THELION}, {@link #NAME_R_RIB10 R_RIB10}, {@link #NAME_R_THELION R_THELION}, {@link #NAME_L_ASIS L_ASIS}, {@link #NAME_L_ILIOCRISTALE L_ILIOCRISTALE}, {@link #NAME_L_PSIS L_PSIS}, {@link #NAME_R_ASIS R_ASIS}, {@link #NAME_R_ILIOCRISTALE R_ILIOCRISTALE}, {@link #NAME_R_PSIS R_PSIS}, {@link #NAME_CROTCH CROTCH}, {@link #NAME_L_FEMORAL_LATERAL_EPICONDYLE L_FEMORAL_LATERAL_EPICONDYLE}, {@link #NAME_L_FEMORAL_MEDIAL_EPICONDYLE L_FEMORAL_MEDIAL_EPICONDYLE}, {@link #NAME_L_SUPRAPATELLA L_SUPRAPATELLA}, {@link #NAME_L_TROCHANTERION L_TROCHANTERION}, {@link #NAME_R_FEMORAL_LATERAL_EPICONDYLE R_FEMORAL_LATERAL_EPICONDYLE}, {@link #NAME_R_FEMORAL_MEDIAL_EPICONDYLE R_FEMORAL_MEDIAL_EPICONDYLE}, {@link #NAME_R_SUPRAPATELLA R_SUPRAPATELLA}, {@link #NAME_R_TROCHANTERION R_TROCHANTERION}, {@link #NAME_L_TIBIALE L_TIBIALE}, {@link #NAME_L_MEDIAL_MALLEOLUS L_MEDIAL_MALLEOLUS}, {@link #NAME_L_LATERAL_MALLEOLUS L_LATERAL_MALLEOLUS}, {@link #NAME_L_SPHYRION L_SPHYRION}, {@link #NAME_R_TIBIALE R_TIBIALE}, {@link #NAME_R_MEDIAL_MALLEOLUS R_MEDIAL_MALLEOLUS}, {@link #NAME_R_LATERAL_MALLEOLUS R_LATERAL_MALLEOLUS}, {@link #NAME_R_SPHYRION R_SPHYRION}, {@link #NAME_L_METATARSAL_PHALANX_1 L_METATARSAL_PHALANX_1}, {@link #NAME_L_METATARSAL_PHALANX_5 L_METATARSAL_PHALANX_5}, {@link #NAME_L_DACTYLION L_DACTYLION}, {@link #NAME_L_CALCANEUS_POSTERIOR L_CALCANEUS_POSTERIOR}, {@link #NAME_R_METATARSAL_PHALANX_1 R_METATARSAL_PHALANX_1}, {@link #NAME_R_METATARSAL_PHALANX_5 R_METATARSAL_PHALANX_5}, {@link #NAME_R_DACTYLION R_DACTYLION}, {@link #NAME_R_CALCANEUS_POSTERIOR R_CALCANEUS_POSTERIOR}, {@link #NAME_L_HUMERAL_LATERAL_EPICONDYLE L_HUMERAL_LATERAL_EPICONDYLE}, {@link #NAME_L_HUMERAL_MEDIAL_EPICONDYLE L_HUMERAL_MEDIAL_EPICONDYLE}, {@link #NAME_L_OLECRANON L_OLECRANON}, {@link #NAME_R_HUMERAL_LATERAL_EPICONDYLE R_HUMERAL_LATERAL_EPICONDYLE}, {@link #NAME_R_HUMERAL_MEDIAL_EPICONDYLE R_HUMERAL_MEDIAL_EPICONDYLE}, {@link #NAME_R_OLECRANON R_OLECRANON}, {@link #NAME_L_RADIALE L_RADIALE}, {@link #NAME_L_ULNAR_STYLOID L_ULNAR_STYLOID}, {@link #NAME_L_RADIAL_STYLOID L_RADIAL_STYLOID}, {@link #NAME_R_RADIALE R_RADIALE}, {@link #NAME_R_ULNAR_STYLOID R_ULNAR_STYLOID}, {@link #NAME_R_RADIAL_STYLOID R_RADIAL_STYLOID}, {@link #NAME_L_METACARPAL_PHALANX_2 L_METACARPAL_PHALANX_2}, {@link #NAME_L_METACARPAL_PHALANX_3 L_METACARPAL_PHALANX_3}, {@link #NAME_L_METACARPAL_PHALANX_5 L_METACARPAL_PHALANX_5}, {@link #NAME_R_METACARPAL_PHALANX_2 R_METACARPAL_PHALANX_2}, {@link #NAME_R_METACARPAL_PHALANX_3 R_METACARPAL_PHALANX_3}, {@link #NAME_R_METACARPAL_PHALANX_5 R_METACARPAL_PHALANX_5}, {@link #NAME_NUCHALE NUCHALE}, {@link #NAME_L_NECK_BASE L_NECK_BASE}, {@link #NAME_R_NECK_BASE R_NECK_BASE}, {@link #NAME_NAVEL NAVEL}, {@link #NAME_L_ECTOCANTHUS L_ECTOCANTHUS}, {@link #NAME_R_ECTOCANTHUS R_ECTOCANTHUS}, {@link #NAME_MENTON MENTON}, {@link #NAME_MESOSTERNALE MESOSTERNALE}, {@link #NAME_OPISTHOCRANION OPISTHOCRANION}, {@link #NAME_L_KNEE_CREASE L_KNEE_CREASE}, {@link #NAME_R_KNEE_CREASE R_KNEE_CREASE}, {@link #NAME_REAR_CENTER_MIDSAGITTAL_PLANE REAR_CENTER_MIDSAGITTAL_PLANE}, {@link #NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT BUTTOCKS_STANDING_WALL_CONTACT_POINT}, {@link #NAME_L_CHEST_MIDSAGITTAL_PLANE L_CHEST_MIDSAGITTAL_PLANE}, {@link #NAME_R_CHEST_MIDSAGITTAL_PLANE R_CHEST_MIDSAGITTAL_PLANE}, {@link #NAME_L_BIDELTOID L_BIDELTOID}, {@link #NAME_R_BIDELTOID R_BIDELTOID}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_1 L_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_2 L_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_3 L_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_4 L_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_5 L_CARPAL_DISTAL_PHALANX_5}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_1 R_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_2 R_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_3 R_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_4 R_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_5 R_CARPAL_DISTAL_PHALANX_5}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_1 L_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_2 L_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_3 L_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_4 L_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_5 L_TARSAL_DISTAL_PHALANX_5}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_1 R_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_2 R_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_3 R_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_4 R_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_5 R_TARSAL_DISTAL_PHALANX_5}).
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSiteObject setName(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			newValue = new String(); // null string check
        }
		newValue = MFStringObject.cleanupUnescapedEnclosingQuotes(newValue); // handle potential enumeration value
		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

		String namingMessage = new String();

		if (!newValue.equals(newValue.toLowerCase()))
		{
				namingMessage += "Warning: HAnim name values are lower case, check capitalization/spelling of HAnimSite name='" + newValue + "'";
		}
		String savedValue = newValue; // save invocation value
		if      (newValue.endsWith("_tip"))
			newValue = newValue.substring(0,newValue.lastIndexOf("_tip"));
		else if (newValue.endsWith("_view"))
			newValue = newValue.substring(0,newValue.lastIndexOf("_view"));
		else if (newValue.endsWith("_pt"))
			newValue = newValue.substring(0,newValue.lastIndexOf("_pt"));
		else
		{
			newValue = ""; // missing necessary suffix
			if (!namingMessage.isEmpty())
				 namingMessage += "\n";
            namingMessage += "Warning: HAnimSite name must end in \"_tip\" \"_view\" or \"_pt\".";
        }
		if (!(
			newValue.isEmpty() ||
			newValue.equals(NAME_SKULL_VERTEX) ||
			newValue.equals(NAME_GLABELLA) ||
			newValue.equals(NAME_SELLION) ||
			newValue.equals(NAME_L_INFRAORBITALE) ||
			newValue.equals(NAME_L_TRAGION) ||
			newValue.equals(NAME_L_GONION) ||
			newValue.equals(NAME_R_INFRAORBITALE) ||
			newValue.equals(NAME_R_TRAGION) ||
			newValue.equals(NAME_R_GONION) ||
			newValue.equals(NAME_SUPRAMENTON) ||
			newValue.equals(NAME_CERVICALE) ||
			newValue.equals(NAME_ADAMS_APPLE) ||
			newValue.equals(NAME_SUPRASTERNALE) ||
			newValue.equals(NAME_SUBSTERNALE) ||
			newValue.equals(NAME_L_CLAVICLE) ||
			newValue.equals(NAME_L_ACROMION) ||
			newValue.equals(NAME_L_AXILLA_PROXIMAL) ||
			newValue.equals(NAME_L_AXILLA_DISTAL) ||
			newValue.equals(NAME_L_AXILLA_POSTERIOR_FOLDS) ||
			newValue.equals(NAME_R_CLAVICLE) ||
			newValue.equals(NAME_R_ACROMION) ||
			newValue.equals(NAME_R_AXILLA_PROXIMAL) ||
			newValue.equals(NAME_R_AXILLA_DISTAL) ||
			newValue.equals(NAME_R_AXILLA_POSTERIOR_FOLDS) ||
			newValue.equals(NAME_SPINE_1_MIDDLE_BACK) ||
			newValue.equals(NAME_SPINE_2_LOWER_BACK) ||
			newValue.equals(NAME_WAIST_PREFERRED_ANTERIOR) ||
			newValue.equals(NAME_WAIST_PREFERRED_POSTERIOR) ||
			newValue.equals(NAME_L_RIB10) ||
			newValue.equals(NAME_L_THELION) ||
			newValue.equals(NAME_R_RIB10) ||
			newValue.equals(NAME_R_THELION) ||
			newValue.equals(NAME_L_ASIS) ||
			newValue.equals(NAME_L_ILIOCRISTALE) ||
			newValue.equals(NAME_L_PSIS) ||
			newValue.equals(NAME_R_ASIS) ||
			newValue.equals(NAME_R_ILIOCRISTALE) ||
			newValue.equals(NAME_R_PSIS) ||
			newValue.equals(NAME_CROTCH) ||
			newValue.equals(NAME_L_FEMORAL_LATERAL_EPICONDYLE) ||
			newValue.equals(NAME_L_FEMORAL_MEDIAL_EPICONDYLE) ||
			newValue.equals(NAME_L_SUPRAPATELLA) ||
			newValue.equals(NAME_L_TROCHANTERION) ||
			newValue.equals(NAME_R_FEMORAL_LATERAL_EPICONDYLE) ||
			newValue.equals(NAME_R_FEMORAL_MEDIAL_EPICONDYLE) ||
			newValue.equals(NAME_R_SUPRAPATELLA) ||
			newValue.equals(NAME_R_TROCHANTERION) ||
			newValue.equals(NAME_L_TIBIALE) ||
			newValue.equals(NAME_L_MEDIAL_MALLEOLUS) ||
			newValue.equals(NAME_L_LATERAL_MALLEOLUS) ||
			newValue.equals(NAME_L_SPHYRION) ||
			newValue.equals(NAME_R_TIBIALE) ||
			newValue.equals(NAME_R_MEDIAL_MALLEOLUS) ||
			newValue.equals(NAME_R_LATERAL_MALLEOLUS) ||
			newValue.equals(NAME_R_SPHYRION) ||
			newValue.equals(NAME_L_METATARSAL_PHALANX_1) ||
			newValue.equals(NAME_L_METATARSAL_PHALANX_5) ||
			newValue.equals(NAME_L_DACTYLION) ||
			newValue.equals(NAME_L_CALCANEUS_POSTERIOR) ||
			newValue.equals(NAME_R_METATARSAL_PHALANX_1) ||
			newValue.equals(NAME_R_METATARSAL_PHALANX_5) ||
			newValue.equals(NAME_R_DACTYLION) ||
			newValue.equals(NAME_R_CALCANEUS_POSTERIOR) ||
			newValue.equals(NAME_L_HUMERAL_LATERAL_EPICONDYLE) ||
			newValue.equals(NAME_L_HUMERAL_MEDIAL_EPICONDYLE) ||
			newValue.equals(NAME_L_OLECRANON) ||
			newValue.equals(NAME_R_HUMERAL_LATERAL_EPICONDYLE) ||
			newValue.equals(NAME_R_HUMERAL_MEDIAL_EPICONDYLE) ||
			newValue.equals(NAME_R_OLECRANON) ||
			newValue.equals(NAME_L_RADIALE) ||
			newValue.equals(NAME_L_ULNAR_STYLOID) ||
			newValue.equals(NAME_L_RADIAL_STYLOID) ||
			newValue.equals(NAME_R_RADIALE) ||
			newValue.equals(NAME_R_ULNAR_STYLOID) ||
			newValue.equals(NAME_R_RADIAL_STYLOID) ||
			newValue.equals(NAME_L_METACARPAL_PHALANX_2) ||
			newValue.equals(NAME_L_METACARPAL_PHALANX_3) ||
			newValue.equals(NAME_L_METACARPAL_PHALANX_5) ||
			newValue.equals(NAME_R_METACARPAL_PHALANX_2) ||
			newValue.equals(NAME_R_METACARPAL_PHALANX_3) ||
			newValue.equals(NAME_R_METACARPAL_PHALANX_5) ||
			newValue.equals(NAME_NUCHALE) ||
			newValue.equals(NAME_L_NECK_BASE) ||
			newValue.equals(NAME_R_NECK_BASE) ||
			newValue.equals(NAME_NAVEL) ||
			newValue.equals(NAME_L_ECTOCANTHUS) ||
			newValue.equals(NAME_R_ECTOCANTHUS) ||
			newValue.equals(NAME_MENTON) ||
			newValue.equals(NAME_MESOSTERNALE) ||
			newValue.equals(NAME_OPISTHOCRANION) ||
			newValue.equals(NAME_L_KNEE_CREASE) ||
			newValue.equals(NAME_R_KNEE_CREASE) ||
			newValue.equals(NAME_REAR_CENTER_MIDSAGITTAL_PLANE) ||
			newValue.equals(NAME_BUTTOCKS_STANDING_WALL_CONTACT_POINT) ||
			newValue.equals(NAME_L_CHEST_MIDSAGITTAL_PLANE) ||
			newValue.equals(NAME_R_CHEST_MIDSAGITTAL_PLANE) ||
			newValue.equals(NAME_L_BIDELTOID) ||
			newValue.equals(NAME_R_BIDELTOID) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_5) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_5) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_5) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_5)))
		{
			newValue = savedValue; // restore invocation value with suffix (if any)
			String warningMessage = "Warning: HAnimSite name newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
 			if (!newValue.endsWith("_tip") && !newValue.endsWith("_view") && !newValue.endsWith("_pt"))
			    namingMessage += " Also note that HAnimSite name must end in \"_tip\" \"_view\" or \"_pt\".";
			if (!namingMessage.trim().isEmpty())              System.out.println(namingMessage);
		}
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimSite name
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("HAnimSite name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of children relative to local coordinate system.  * <br>

	 * @return value of rotation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getRotation()
	{
		return rotation;
	}

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of children relative to local coordinate system.  * <br>

	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setRotation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite rotation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		rotation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation rotation field, similar to {@link #setRotation(float[])}.
	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setRotation(SFRotationObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setRotation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFRotation rotation field, similar to {@link #setRotation(float[])}.

	 * @param x first component of axis
	 * @param y second component of axis
	 * @param z third component of axis
	 * @param angleRadians fourth component of rotation around axis

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setRotation(float x, float y, float z, float angleRadians)
	{
		setRotation(new float[] {x, y, z, angleRadians});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setRotation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @param angleRadians fourth component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setRotation(double x, double y, double z, double angleRadians)
	{
		return setRotation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setRotation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setRotation(double[] newArray)
	{
		return setRotation(new SFRotationObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results within allowed range of (0,infinity) from inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @return value of scale field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getScale()
	{
		return scale;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @param newValue is new value for the scale field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setScale(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite scale newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] <= 0f) || (newValue[1] <= 0f) || (newValue[2] <= 0f)) {
                throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite scale newValue=" + newValue + " has component value less than (or equal to) restriction minExclusive=0");
        }
		scale = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f scale field, similar to {@link #setScale(float[])}.
	 * @param newValue is new value for the scale field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScale(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setScale(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f scale field, similar to {@link #setScale(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScale(float x, float y, float z)
	{
		setScale(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setScale(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScale(double x, double y, double z)
	{
		return setScale(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setScale(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScale(double[] newArray)
	{
		return setScale(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @return value of scaleOrientation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getScaleOrientation()
	{
		return scaleOrientation;
	}

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setScaleOrientation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite scaleOrientation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		scaleOrientation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation scaleOrientation field, similar to {@link #setScaleOrientation(float[])}.
	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScaleOrientation(SFRotationObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setScaleOrientation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFRotation scaleOrientation field, similar to {@link #setScaleOrientation(float[])}.

	 * @param x first component of axis
	 * @param y second component of axis
	 * @param z third component of axis
	 * @param angleRadians fourth component of rotation around axis

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScaleOrientation(float x, float y, float z, float angleRadians)
	{
		setScaleOrientation(new float[] {x, y, z, angleRadians});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setScaleOrientation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @param angleRadians fourth component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScaleOrientation(double x, double y, double z, double angleRadians)
	{
		return setScaleOrientation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setScaleOrientation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setScaleOrientation(double[] newArray)
	{
		return setScaleOrientation(new SFRotationObject(newArray));
	}
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getTranslation()
	{
		return translation;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of children relative to local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 *  <li> <i>Hint:</i>  center field indicates default origin relative to overall humanoid body and is rarely modified. For HAnimSite animation, ROUTE position-change events to translation field instead. </li> 
 * </ul>
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setTranslation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite translation newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		translation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f translation field, similar to {@link #setTranslation(float[])}.
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setTranslation(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTranslation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f translation field, similar to {@link #setTranslation(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setTranslation(float x, float y, float z)
	{
		setTranslation(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setTranslation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setTranslation(double x, double y, double z)
	{
		return setTranslation(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setTranslation(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setTranslation(double[] newArray)
	{
		return setTranslation(new SFVec3fObject(newArray));
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getVisible()
	{
		return visible;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSiteObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setVisible(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVisible(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSiteObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimSite DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite DEF newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSiteObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimSite USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSite USE newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSiteObject setCssClass(String newValue)
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
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	/** Return reference to ancestor HAnimHumanoidObject
	 * @return HAnimHumanoidObject if found, otherwise null
	 */
	public HAnimHumanoidObject getAncestorHAnimHumanoid()
	{
		X3DConcreteElement parentElement = ((X3DConcreteElement)this).getParentObject();;
		while (parentElement != null)
		{
			if (parentElement instanceof HAnimHumanoidObject)
				return (HAnimHumanoidObject) parentElement;
			parentElement = ((X3DConcreteElement)this).getParentObject();
		}
		return null;
	}
	/** Return whether ancestor HAnimHumanoidObject is available
	 * @return true if ancestor HAnimHumanoidObject found
	 */
	public boolean hasAncestorHAnimHumanoid()
	{
		return (getAncestorHAnimHumanoid() != null);
	}

	/** Return version of ancestor HAnimHumanoidObject
	 * @return version if found, otherwise "-1"
	 */
	public String getHAnimVersion()
	{
		if (hasAncestorHAnimHumanoid())
			return getAncestorHAnimHumanoid().getVersion();
		else return "-1";
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link HAnimSiteObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSiteObject setUSE(HAnimSiteObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on HAnimSiteObject" +
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
	public HAnimSiteObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Utility constructor that assigns both DEF label and name, after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 * @param newName  name for this meta element
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimSiteObject">X3D Tooltips: HAnimSiteObject</a>
	 */
	public HAnimSiteObject (String DEFlabel, String newName)
	{
		initialize();
		setDEF  (DEFlabel);
		setName (newName);
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
		boolean      hasChild = (IS != null) || (!children.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null);

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<HAnimSite"); // start opening tag
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

			if ((!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxCenter='").append(SFVec3fObject.toString(getBboxCenter())).append("'");
			}
			if ((!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxSize='").append(SFVec3fObject.toString(getBboxSize())).append("'");
			}
			if ((!Arrays.equals(getCenter(), CENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" center='").append(SFVec3fObject.toString(getCenter())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if ((!getDescription().equals(DESCRIPTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" description='").append(new SFStringObject(getDescription()).toStringX3D()).append("'");
			}
			if ((!Arrays.equals(getRotation(), ROTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" rotation='").append(SFRotationObject.toString(getRotation())).append("'");
			}
			if ((!Arrays.equals(getScale(), SCALE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" scale='").append(SFVec3fObject.toString(getScale())).append("'");
			}
			if ((!Arrays.equals(getScaleOrientation(), SCALEORIENTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" scaleOrientation='").append(SFRotationObject.toString(getScaleOrientation())).append("'");
			}
			if ((!Arrays.equals(getTranslation(), TRANSLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" translation='").append(SFVec3fObject.toString(getTranslation())).append("'");
			}
			if (((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" visible='").append(SFBoolObject.toString(getVisible())).append("'");
			}
		}
		if ((hasChild) && !isUSE()) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
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
			for (X3DNode element : children)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</HAnimSite>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=HAnimSite, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (!children.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null);
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
			stringClassicVRML.append("HAnimSite").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("bboxCenter"))
						{
							stringClassicVRML.append(indentCharacter).append("bboxCenter").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bboxCenter ").append(SFVec3fObject.toString(getBboxCenter())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("bboxSize"))
						{
							stringClassicVRML.append(indentCharacter).append("bboxSize").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bboxSize ").append(SFVec3fObject.toString(getBboxSize())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("center"))
						{
							stringClassicVRML.append(indentCharacter).append("center").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getCenter(), CENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("center ").append(SFVec3fObject.toString(getCenter())).append("\n").append(indent).append(indentCharacter);
				}
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
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("description"))
						{
							stringClassicVRML.append(indentCharacter).append("description").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getDescription().equals(DESCRIPTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("description ").append("\"").append(SFStringObject.toString(getDescription())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("name"))
						{
							stringClassicVRML.append(indentCharacter).append("name").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getName().equals(NAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("name ").append("\"").append(SFStringObject.toString(getName())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("rotation"))
						{
							stringClassicVRML.append(indentCharacter).append("rotation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getRotation(), ROTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("rotation ").append(SFRotationObject.toString(getRotation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("scale"))
						{
							stringClassicVRML.append(indentCharacter).append("scale").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getScale(), SCALE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("scale ").append(SFVec3fObject.toString(getScale())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("scaleOrientation"))
						{
							stringClassicVRML.append(indentCharacter).append("scaleOrientation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getScaleOrientation(), SCALEORIENTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("scaleOrientation ").append(SFRotationObject.toString(getScaleOrientation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("translation"))
						{
							stringClassicVRML.append(indentCharacter).append("translation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getTranslation(), TRANSLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("translation ").append(SFVec3fObject.toString(getTranslation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("visible"))
						{
							stringClassicVRML.append(indentCharacter).append("visible").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("visible ").append(SFBoolObject.toString(getVisible())).append("\n").append(indent).append(indentCharacter);
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
			if (children.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("children").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : children)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
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
		if (elementName == null)
			elementName = "";
		if (getName().equals(nameValue) &&
			(elementName.isEmpty() || elementName.equals(getElementName())))
			return this;
		X3DConcreteElement referenceElement;
		for (X3DNode element : children) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
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
		if (metadataProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) metadataProtoInstance).findElementByNameValue(nameValue, elementName);
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
		for (X3DNode element : children) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
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

		setBboxCenter(getBboxCenter()); // exercise field checks, simple types
        
		setBboxSize(getBboxSize()); // exercise field checks, simple types
        
		setCenter(getCenter()); // exercise field checks, simple types
        
		setDescription(getDescription()); // exercise field checks, simple types
        
		if (getName().isEmpty() && !isUSE()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " name field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setName(getName()); // exercise field checks, simple types
        
		setRotation(getRotation()); // exercise field checks, simple types
        
		setScale(getScale()); // exercise field checks, simple types
        
		setScaleOrientation(getScaleOrientation()); // exercise field checks, simple types
        
		setTranslation(getTranslation()); // exercise field checks, simple types
        
		setVisible(getVisible()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		for (X3DNode element : children) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setChildren(getChildren()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasChildren()) // test USE restrictions
		{
			String errorNotice = "HAnimSite USE='" + getUSE() + "' is not allowed to have contained MFNode children";
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
			String errorNotice = "HAnimSite USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
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
			String errorNotice = "HAnimSite USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
         // test for correct parent
         X3DConcreteElement parent = getParentObject();
         if (hasParentObject())
         {
             if      (parent.getElementName().equals(HAnimSiteObject.NAME))
             {
                 // now test for correct parent-child LOA4 relationship pair
                 if (!hasParentMatchingName(((HAnimJointObject)parent).getName()))
                 {
                     String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE +
                         ": illegal parent name found: '" + ((HAnimSiteObject)parent).getName() + "' instead of TODO" ;
                     validationResult.append(errorNotice).append("\n");
                     throw new InvalidFieldException(errorNotice); // report error
                 }
             }
             else if (!parent.getElementName().equals(fieldObject.NAME) && !parent.getElementName().equals(fieldValueObject.NAME) &&
                      !parent.getElementName().equals(ProtoBodyObject.NAME))
             {
                 String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE +
                     ": illegal parent found: '" + parent.getElementName() + "'";
                 validationResult.append(errorNotice).append("\n");
                 throw new InvalidFieldException(errorNotice); // report error
             }
         }
// TODO: if LOA less than 4, modify test to compare whether immediate parent is a legal ancestor.
// Warning: this is not 100% test until the LOA 0..3 alias-matching algorithms are also added.


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
					"' for parent X3D model containing 'HAnimSite' node, add head statement <component name='HAnim' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"HAnim\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
