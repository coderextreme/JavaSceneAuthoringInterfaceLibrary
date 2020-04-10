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
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.sai.HAnim.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.HAnim.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.HAnim.*;
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
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimSegment" target="blank">X3D Abstract Specification: HAnimSegment</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimSegment" target="_blank">X3D Tooltips: HAnimSegment</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class HAnimSegmentObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.HAnim.HAnimSegment
{
	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=centerOfMass, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=centerOfMass, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] centerOfMass; // SFVec3f

 /* @name=children, @type=MFNode, $javaType=ArrayList<X3DChildNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DChildNode>, $normalizedMemberObjectName=children, $isX3dStatement=false, @acceptableNodeTypes=X3DChildNode */ 
	private ArrayList<X3DNode> children = new ArrayList<>(); // MFNode acceptable node types: X3DChildNode or ProtoInstanceObject

 /* @name=coord, @type=SFNode, $javaType=X3DCoordinateNode, $javaReferenceType=X3DCoordinateNode, $javaPrimitiveType=X3DCoordinateNode, $normalizedMemberObjectName=coord, $isX3dStatement=false, @acceptableNodeTypes=X3DCoordinateNode */ 
	private X3DCoordinateNode coord; // SFNode acceptable node types: X3DCoordinateNode or ProtoInstanceObject
	private ProtoInstanceObject coordProtoInstance; // allowed alternative for coord field

 /* @name=description, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=description, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String description; // SFString

 /* @name=displacers, @type=MFNode, $javaType=ArrayList<HAnimDisplacerObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimDisplacerObject>, $normalizedMemberObjectName=displacers, $isX3dStatement=false, @acceptableNodeTypes=HAnimDisplacer */ 
	private ArrayList<X3DNode> displacers = new ArrayList<>(); // MFNode acceptable node types: HAnimDisplacer or ProtoInstanceObject

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=mass, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=mass, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float mass; // SFFloat

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=momentsOfInertia, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=momentsOfInertia, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> momentsOfInertia = new ArrayList<>(); // MFFloat

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "sacrum", "pelvis", "l_thigh", "l_calf", "l_talus", "l_navicular", "l_cuneiform_1", "l_metatarsal_1", "l_tarsal_proximal_phalanx_1", "l_tarsal_distal_phalanx_1", "l_cuneiform_2", "l_metatarsal_2", "l_tarsal_proximal_phalanx_2", "l_tarsal_middle_phalanx_2", "l_tarsal_distal_phalanx_2", "l_cuneiform_3", "l_metatarsal_3", "l_tarsal_proximal_phalanx_3", "l_tarsal_middle_phalanx_3", "l_tarsal_distal_phalanx_3", "l_calcaneus", "l_cuboid", "l_metatarsal_4", "l_tarsal_proximal_phalanx_4", "l_tarsal_middle_phalanx_4", "l_tarsal_distal_phalanx_4", "l_metatarsal_5", "l_tarsal_proximal_phalanx_5", "l_tarsal_middle_phalanx_5", "l_tarsal_distal_phalanx_5", "r_thigh", "r_calf", "r_talus", "r_navicular", "r_cuneiform_1", "r_metatarsal_1", "r_tarsal_proximal_phalanx_1", "r_tarsal_distal_phalanx_1", "r_cuneiform_2", "r_metatarsal_2", "r_tarsal_proximal_phalanx_2", "r_tarsal_middle_phalanx_2", "r_tarsal_distal_phalanx_2", "r_cuneiform_3", "r_metatarsal_3", "r_tarsal_proximal_phalanx_3", "r_tarsal_middle_phalanx_3", "r_tarsal_distal_phalanx_3", "r_calcaneus", "r_cuboid", "r_metatarsal_4", "r_tarsal_proximal_phalanx_4", "r_tarsal_middle_phalanx_4", "r_tarsal_distal_phalanx_4", "r_metatarsal_5", "r_tarsal_proximal_phalanx_5", "r_tarsal_middle_phalanx_5", "r_tarsal_distal_phalanx_5", "l5", "l4", "l3", "l2", "l1", "t12", "t11", "t10", "t9", "t8", "t7", "t6", "t5", "t4", "t3", "t2", "t1", "c7", "c6", "c5", "c4", "c3", "c2", "c1", "skull", "l_eyelid", "r_eyelid", "l_eyeball", "r_eyeball", "l_eyebrow", "r_eyebrow", "jaw", "l_clavicle", "l_scapula", "l_upperarm", "l_forearm", "l_carpal", "l_trapezium", "l_metacarpal_1", "l_carpal_proximal_phalanx_1", "l_carpal_distal_phalanx_1", "l_trapezoid", "l_metacarpal_2", "l_carpal_proximal_phalanx_2", "l_carpal_middle_phalanx_2", "l_carpal_distal_phalanx_2", "l_capitate", "l_metacarpal_3", "l_carpal_proximal_phalanx_3", "l_carpal_middle_phalanx_3", "l_carpal_distal_phalanx_3", "l_hamate", "l_metacarpal_4", "l_carpal_proximal_phalanx_4", "l_carpal_middle_phalanx_4", "l_carpal_distal_phalanx_4", "l_metacarpal_5", "l_carpal_proximal_phalanx_5", "l_carpal_middle_phalanx_5", "l_carpal_distal_phalanx_5", "r_clavicle", "r_scapula", "r_upperarm", "r_forearm", "r_carpal", "r_trapezium", "r_metacarpal_1", "r_carpal_proximal_phalanx_1", "r_carpal_distal_phalanx_1", "r_trapezoid", "r_metacarpal_2", "r_carpal_proximal_phalanx_2", "r_carpal_middle_phalanx_2", "r_carpal_distal_phalanx_2", "r_capitate", "r_metacarpal_3", "r_carpal_proximal_phalanx_3", "r_carpal_middle_phalanx_3", "r_carpal_distal_phalanx_3", "r_hamate", "r_metacarpal_4", "r_carpal_proximal_phalanx_4", "r_carpal_middle_phalanx_4", "r_carpal_distal_phalanx_4", "r_metacarpal_5", "r_carpal_proximal_phalanx_5", "r_carpal_middle_phalanx_5", "r_carpal_distal_phalanx_5".
<br ><br >
	 * CAESAR segment names for identification of HAnimSegment nodes as defined in the HAnim Architecture specification. Alternate names are also allowed.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/concepts.html#Hierarchy" target="_blank">https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/concepts.html#Hierarchy</a> 
	*/
	public static final ArrayList<String> segmentNameValues = new ArrayList<>(Arrays.<String>asList("sacrum", "pelvis", "l_thigh", "l_calf", "l_talus", "l_navicular", "l_cuneiform_1", "l_metatarsal_1", "l_tarsal_proximal_phalanx_1", "l_tarsal_distal_phalanx_1", "l_cuneiform_2", "l_metatarsal_2", "l_tarsal_proximal_phalanx_2", "l_tarsal_middle_phalanx_2", "l_tarsal_distal_phalanx_2", "l_cuneiform_3", "l_metatarsal_3", "l_tarsal_proximal_phalanx_3", "l_tarsal_middle_phalanx_3", "l_tarsal_distal_phalanx_3", "l_calcaneus", "l_cuboid", "l_metatarsal_4", "l_tarsal_proximal_phalanx_4", "l_tarsal_middle_phalanx_4", "l_tarsal_distal_phalanx_4", "l_metatarsal_5", "l_tarsal_proximal_phalanx_5", "l_tarsal_middle_phalanx_5", "l_tarsal_distal_phalanx_5", "r_thigh", "r_calf", "r_talus", "r_navicular", "r_cuneiform_1", "r_metatarsal_1", "r_tarsal_proximal_phalanx_1", "r_tarsal_distal_phalanx_1", "r_cuneiform_2", "r_metatarsal_2", "r_tarsal_proximal_phalanx_2", "r_tarsal_middle_phalanx_2", "r_tarsal_distal_phalanx_2", "r_cuneiform_3", "r_metatarsal_3", "r_tarsal_proximal_phalanx_3", "r_tarsal_middle_phalanx_3", "r_tarsal_distal_phalanx_3", "r_calcaneus", "r_cuboid", "r_metatarsal_4", "r_tarsal_proximal_phalanx_4", "r_tarsal_middle_phalanx_4", "r_tarsal_distal_phalanx_4", "r_metatarsal_5", "r_tarsal_proximal_phalanx_5", "r_tarsal_middle_phalanx_5", "r_tarsal_distal_phalanx_5", "l5", "l4", "l3", "l2", "l1", "t12", "t11", "t10", "t9", "t8", "t7", "t6", "t5", "t4", "t3", "t2", "t1", "c7", "c6", "c5", "c4", "c3", "c2", "c1", "skull", "l_eyelid", "r_eyelid", "l_eyeball", "r_eyeball", "l_eyebrow", "r_eyebrow", "jaw", "l_clavicle", "l_scapula", "l_upperarm", "l_forearm", "l_carpal", "l_trapezium", "l_metacarpal_1", "l_carpal_proximal_phalanx_1", "l_carpal_distal_phalanx_1", "l_trapezoid", "l_metacarpal_2", "l_carpal_proximal_phalanx_2", "l_carpal_middle_phalanx_2", "l_carpal_distal_phalanx_2", "l_capitate", "l_metacarpal_3", "l_carpal_proximal_phalanx_3", "l_carpal_middle_phalanx_3", "l_carpal_distal_phalanx_3", "l_hamate", "l_metacarpal_4", "l_carpal_proximal_phalanx_4", "l_carpal_middle_phalanx_4", "l_carpal_distal_phalanx_4", "l_metacarpal_5", "l_carpal_proximal_phalanx_5", "l_carpal_middle_phalanx_5", "l_carpal_distal_phalanx_5", "r_clavicle", "r_scapula", "r_upperarm", "r_forearm", "r_carpal", "r_trapezium", "r_metacarpal_1", "r_carpal_proximal_phalanx_1", "r_carpal_distal_phalanx_1", "r_trapezoid", "r_metacarpal_2", "r_carpal_proximal_phalanx_2", "r_carpal_middle_phalanx_2", "r_carpal_distal_phalanx_2", "r_capitate", "r_metacarpal_3", "r_carpal_proximal_phalanx_3", "r_carpal_middle_phalanx_3", "r_carpal_distal_phalanx_3", "r_hamate", "r_metacarpal_4", "r_carpal_proximal_phalanx_4", "r_carpal_middle_phalanx_4", "r_carpal_distal_phalanx_4", "r_metacarpal_5", "r_carpal_proximal_phalanx_5", "r_carpal_middle_phalanx_5", "r_carpal_distal_phalanx_5"));

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"sacrum"</i> (Java syntax) or <i>sacrum</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Sacrum" target="_blank">https://en.wikipedia.org/wiki/Sacrum</a>  */
	public static final String NAME_SACRUM = "sacrum";
	/** SFString segmentNameValues enumeration value "<i>sacrum</i>" has unique index 1
	 * @see #NAME_SACRUM */
	public static final int NAME_SACRUM_INDEX = 1;
	/** SFString segmentNameValues enumeration value "<i>sacrum</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_SACRUM */
	public static final int NAME_SACRUM_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>sacrum</i>" has unique parent "<i>humanoid_root</i>" in HAnimJointObject
	 * @see #NAME_SACRUM
	 * @see HAnimJointObject#NAME_HUMANOID_ROOT */
	public static final String NAME_SACRUM_PARENT = "humanoid_root";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"pelvis"</i> (Java syntax) or <i>pelvis</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Pelvis" target="_blank">https://en.wikipedia.org/wiki/Pelvis</a>  */
	public static final String NAME_PELVIS = "pelvis";
	/** SFString segmentNameValues enumeration value "<i>pelvis</i>" has unique index 2
	 * @see #NAME_PELVIS */
	public static final int NAME_PELVIS_INDEX = 2;
	/** SFString segmentNameValues enumeration value "<i>pelvis</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_PELVIS */
	public static final int NAME_PELVIS_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>pelvis</i>" has unique parent "<i>sacroiliac</i>" in HAnimJointObject
	 * @see #NAME_PELVIS
	 * @see HAnimJointObject#NAME_SACROILIAC */
	public static final String NAME_PELVIS_PARENT = "sacroiliac";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_thigh"</i> (Java syntax) or <i>l_thigh</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Thigh" target="_blank">https://en.wikipedia.org/wiki/Thigh</a>  */
	public static final String NAME_L_THIGH = "l_thigh";
	/** SFString segmentNameValues enumeration value "<i>l_thigh</i>" has unique index 3
	 * @see #NAME_L_THIGH */
	public static final int NAME_L_THIGH_INDEX = 3;
	/** SFString segmentNameValues enumeration value "<i>l_thigh</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_THIGH */
	public static final int NAME_L_THIGH_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_thigh</i>" has unique parent "<i>l_hip</i>" in HAnimJointObject
	 * @see #NAME_L_THIGH
	 * @see HAnimJointObject#NAME_L_HIP */
	public static final String NAME_L_THIGH_PARENT = "l_hip";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_calf"</i> (Java syntax) or <i>l_calf</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calf_(leg)" target="_blank">https://en.wikipedia.org/wiki/Calf_(leg)</a>  */
	public static final String NAME_L_CALF = "l_calf";
	/** SFString segmentNameValues enumeration value "<i>l_calf</i>" has unique index 4
	 * @see #NAME_L_CALF */
	public static final int NAME_L_CALF_INDEX = 4;
	/** SFString segmentNameValues enumeration value "<i>l_calf</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_CALF */
	public static final int NAME_L_CALF_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_calf</i>" has unique parent "<i>l_knee</i>" in HAnimJointObject
	 * @see #NAME_L_CALF
	 * @see HAnimJointObject#NAME_L_KNEE */
	public static final String NAME_L_CALF_PARENT = "l_knee";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_talus"</i> (Java syntax) or <i>l_talus</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Talus_bone" target="_blank">https://en.wikipedia.org/wiki/Talus_bone</a>  */
	public static final String NAME_L_TALUS = "l_talus";
	/** SFString segmentNameValues enumeration value "<i>l_talus</i>" has unique index 5
	 * @see #NAME_L_TALUS */
	public static final int NAME_L_TALUS_INDEX = 5;
	/** SFString segmentNameValues enumeration value "<i>l_talus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_TALUS */
	public static final int NAME_L_TALUS_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_talus</i>" has unique parent "<i>l_talocrural</i>" in HAnimJointObject
	 * @see #NAME_L_TALUS
	 * @see HAnimJointObject#NAME_L_TALOCRURAL */
	public static final String NAME_L_TALUS_PARENT = "l_talocrural";
	/** SFString segmentNameValues enumeration value "<i>l_talus</i>" has alias "<i>l_hindfoot</i>"
	 * @see #NAME_L_TALUS */
	public static final String NAME_L_TALUS_ALIAS = "l_hindfoot";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_navicular"</i> (Java syntax) or <i>l_navicular</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Navicular_bone" target="_blank">https://en.wikipedia.org/wiki/Navicular_bone</a>  */
	public static final String NAME_L_NAVICULAR = "l_navicular";
	/** SFString segmentNameValues enumeration value "<i>l_navicular</i>" has unique index 6
	 * @see #NAME_L_NAVICULAR */
	public static final int NAME_L_NAVICULAR_INDEX = 6;
	/** SFString segmentNameValues enumeration value "<i>l_navicular</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_NAVICULAR */
	public static final int NAME_L_NAVICULAR_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_navicular</i>" has unique parent "<i>l_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_L_NAVICULAR
	 * @see HAnimJointObject#NAME_L_TALOCALCANEONAVICULAR */
	public static final String NAME_L_NAVICULAR_PARENT = "l_talocalcaneonavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_cuneiform_1"</i> (Java syntax) or <i>l_cuneiform_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneiform_bones" target="_blank">https://en.wikipedia.org/wiki/Cuneiform_bones</a>  */
	public static final String NAME_L_CUNEIFORM_1 = "l_cuneiform_1";
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_1</i>" has unique index 7
	 * @see #NAME_L_CUNEIFORM_1 */
	public static final int NAME_L_CUNEIFORM_1_INDEX = 7;
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUNEIFORM_1 */
	public static final int NAME_L_CUNEIFORM_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_1</i>" has unique parent "<i>l_cuneonavicular_1</i>" in HAnimJointObject
	 * @see #NAME_L_CUNEIFORM_1
	 * @see HAnimJointObject#NAME_L_CUNEONAVICULAR_1 */
	public static final String NAME_L_CUNEIFORM_1_PARENT = "l_cuneonavicular_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metatarsal_1"</i> (Java syntax) or <i>l_metatarsal_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_1 = "l_metatarsal_1";
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_1</i>" has unique index 8
	 * @see #NAME_L_METATARSAL_1 */
	public static final int NAME_L_METATARSAL_1_INDEX = 8;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSAL_1 */
	public static final int NAME_L_METATARSAL_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_1</i>" has unique parent "<i>l_tarsometatarsal_1</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSAL_1
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_1 */
	public static final String NAME_L_METATARSAL_1_PARENT = "l_tarsometatarsal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_proximal_phalanx_1"</i> (Java syntax) or <i>l_tarsal_proximal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_1 = "l_tarsal_proximal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_1</i>" has unique index 9
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_1_INDEX = 9;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_1</i>" has unique parent "<i>l_metatarsophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_1
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_1 */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_1_PARENT = "l_metatarsophalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_1"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_1 = "l_tarsal_distal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_1</i>" has unique index 10
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_1_INDEX = 10;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_1</i>" has unique parent "<i>l_tarsal_interphalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_1
	 * @see HAnimJointObject#NAME_L_TARSAL_INTERPHALANGEAL_1 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_1_PARENT = "l_tarsal_interphalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_cuneiform_2"</i> (Java syntax) or <i>l_cuneiform_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneiform_bones" target="_blank">https://en.wikipedia.org/wiki/Cuneiform_bones</a>  */
	public static final String NAME_L_CUNEIFORM_2 = "l_cuneiform_2";
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_2</i>" has unique index 11
	 * @see #NAME_L_CUNEIFORM_2 */
	public static final int NAME_L_CUNEIFORM_2_INDEX = 11;
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUNEIFORM_2 */
	public static final int NAME_L_CUNEIFORM_2_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_2</i>" has unique parent "<i>l_cuneonavicular_2</i>" in HAnimJointObject
	 * @see #NAME_L_CUNEIFORM_2
	 * @see HAnimJointObject#NAME_L_CUNEONAVICULAR_2 */
	public static final String NAME_L_CUNEIFORM_2_PARENT = "l_cuneonavicular_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metatarsal_2"</i> (Java syntax) or <i>l_metatarsal_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_2 = "l_metatarsal_2";
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_2</i>" has unique index 12
	 * @see #NAME_L_METATARSAL_2 */
	public static final int NAME_L_METATARSAL_2_INDEX = 12;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METATARSAL_2 */
	public static final int NAME_L_METATARSAL_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_2</i>" has unique parent "<i>l_tarsometatarsal_2</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSAL_2
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_2 */
	public static final String NAME_L_METATARSAL_2_PARENT = "l_tarsometatarsal_2";
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_2</i>" has alias "<i>l_midproximal</i>"
	 * @see #NAME_L_METATARSAL_2 */
	public static final String NAME_L_METATARSAL_2_ALIAS = "l_midproximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_proximal_phalanx_2"</i> (Java syntax) or <i>l_tarsal_proximal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_2 = "l_tarsal_proximal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_2</i>" has unique index 13
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_2_INDEX = 13;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_2</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_2_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_2</i>" has unique parent "<i>l_metatarsophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_2
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_2 */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_2_PARENT = "l_metatarsophalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_2</i>" has alias "<i>l_middistal</i>"
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_2 */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_2_ALIAS = "l_middistal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_middle_phalanx_2"</i> (Java syntax) or <i>l_tarsal_middle_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_2 = "l_tarsal_middle_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_2</i>" has unique index 14
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_2 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_2_INDEX = 14;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_2 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_2_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_2</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_2
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_2_PARENT = "l_tarsal_proximal_interphalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_2"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_2 = "l_tarsal_distal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has unique index 15
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_2_INDEX = 15;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has unique parent "<i>l_tarsal_distal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2
	 * @see HAnimJointObject#NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_2_PARENT = "l_tarsal_distal_interphalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_2</i>" has alias "<i>l_forefoot</i>"
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_2_ALIAS = "l_forefoot";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_cuneiform_3"</i> (Java syntax) or <i>l_cuneiform_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneiform_bones" target="_blank">https://en.wikipedia.org/wiki/Cuneiform_bones</a>  */
	public static final String NAME_L_CUNEIFORM_3 = "l_cuneiform_3";
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_3</i>" has unique index 16
	 * @see #NAME_L_CUNEIFORM_3 */
	public static final int NAME_L_CUNEIFORM_3_INDEX = 16;
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUNEIFORM_3 */
	public static final int NAME_L_CUNEIFORM_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_cuneiform_3</i>" has unique parent "<i>l_cuneonavicular_3</i>" in HAnimJointObject
	 * @see #NAME_L_CUNEIFORM_3
	 * @see HAnimJointObject#NAME_L_CUNEONAVICULAR_3 */
	public static final String NAME_L_CUNEIFORM_3_PARENT = "l_cuneonavicular_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metatarsal_3"</i> (Java syntax) or <i>l_metatarsal_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_3 = "l_metatarsal_3";
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_3</i>" has unique index 17
	 * @see #NAME_L_METATARSAL_3 */
	public static final int NAME_L_METATARSAL_3_INDEX = 17;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSAL_3 */
	public static final int NAME_L_METATARSAL_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_3</i>" has unique parent "<i>l_tarsometatarsal_3</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSAL_3
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_3 */
	public static final String NAME_L_METATARSAL_3_PARENT = "l_tarsometatarsal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_proximal_phalanx_3"</i> (Java syntax) or <i>l_tarsal_proximal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_3 = "l_tarsal_proximal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_3</i>" has unique index 18
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_3_INDEX = 18;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_3</i>" has unique parent "<i>l_metatarsophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_3
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_3 */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_3_PARENT = "l_metatarsophalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_middle_phalanx_3"</i> (Java syntax) or <i>l_tarsal_middle_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_3 = "l_tarsal_middle_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_3</i>" has unique index 19
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_3 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_3_INDEX = 19;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_3 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_3</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_3
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_3_PARENT = "l_tarsal_proximal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_3"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_3 = "l_tarsal_distal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_3</i>" has unique index 20
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_3_INDEX = 20;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_3</i>" has unique parent "<i>l_tarsal_distal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_3
	 * @see HAnimJointObject#NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_3_PARENT = "l_tarsal_distal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_calcaneus"</i> (Java syntax) or <i>l_calcaneus</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calcaneus" target="_blank">https://en.wikipedia.org/wiki/Calcaneus</a>  */
	public static final String NAME_L_CALCANEUS = "l_calcaneus";
	/** SFString segmentNameValues enumeration value "<i>l_calcaneus</i>" has unique index 21
	 * @see #NAME_L_CALCANEUS */
	public static final int NAME_L_CALCANEUS_INDEX = 21;
	/** SFString segmentNameValues enumeration value "<i>l_calcaneus</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CALCANEUS */
	public static final int NAME_L_CALCANEUS_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_calcaneus</i>" has unique parent "<i>l_calcaneocuboid</i>" in HAnimJointObject
	 * @see #NAME_L_CALCANEUS
	 * @see HAnimJointObject#NAME_L_CALCANEOCUBOID */
	public static final String NAME_L_CALCANEUS_PARENT = "l_calcaneocuboid";
	/** SFString segmentNameValues enumeration value "<i>l_calcaneus</i>" has alias "<i>l_calcaneum</i>"
	 * @see #NAME_L_CALCANEUS */
	public static final String NAME_L_CALCANEUS_ALIAS = "l_calcaneum";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_cuboid"</i> (Java syntax) or <i>l_cuboid</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuboid" target="_blank">https://en.wikipedia.org/wiki/Cuboid</a>  */
	public static final String NAME_L_CUBOID = "l_cuboid";
	/** SFString segmentNameValues enumeration value "<i>l_cuboid</i>" has unique index 22
	 * @see #NAME_L_CUBOID */
	public static final int NAME_L_CUBOID_INDEX = 22;
	/** SFString segmentNameValues enumeration value "<i>l_cuboid</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUBOID */
	public static final int NAME_L_CUBOID_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_cuboid</i>" has unique parent "<i>l_transversetarsal</i>" in HAnimJointObject
	 * @see #NAME_L_CUBOID
	 * @see HAnimJointObject#NAME_L_TRANSVERSETARSAL */
	public static final String NAME_L_CUBOID_PARENT = "l_transversetarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metatarsal_4"</i> (Java syntax) or <i>l_metatarsal_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_4 = "l_metatarsal_4";
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_4</i>" has unique index 23
	 * @see #NAME_L_METATARSAL_4 */
	public static final int NAME_L_METATARSAL_4_INDEX = 23;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSAL_4 */
	public static final int NAME_L_METATARSAL_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_4</i>" has unique parent "<i>l_tarsometatarsal_4</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSAL_4
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_4 */
	public static final String NAME_L_METATARSAL_4_PARENT = "l_tarsometatarsal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_proximal_phalanx_4"</i> (Java syntax) or <i>l_tarsal_proximal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_4 = "l_tarsal_proximal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_4</i>" has unique index 24
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_4_INDEX = 24;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_4</i>" has unique parent "<i>l_metatarsophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_4
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_4 */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_4_PARENT = "l_metatarsophalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_middle_phalanx_4"</i> (Java syntax) or <i>l_tarsal_middle_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_4 = "l_tarsal_middle_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_4</i>" has unique index 25
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_4 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_4_INDEX = 25;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_4 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_4</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_4
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_4_PARENT = "l_tarsal_proximal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_4"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_4 = "l_tarsal_distal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_4</i>" has unique index 26
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_4_INDEX = 26;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_4</i>" has unique parent "<i>l_tarsal_distal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_4
	 * @see HAnimJointObject#NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_4_PARENT = "l_tarsal_distal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metatarsal_5"</i> (Java syntax) or <i>l_metatarsal_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_L_METATARSAL_5 = "l_metatarsal_5";
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_5</i>" has unique index 27
	 * @see #NAME_L_METATARSAL_5 */
	public static final int NAME_L_METATARSAL_5_INDEX = 27;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSAL_5 */
	public static final int NAME_L_METATARSAL_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_metatarsal_5</i>" has unique parent "<i>l_tarsometatarsal_5</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSAL_5
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_5 */
	public static final String NAME_L_METATARSAL_5_PARENT = "l_tarsometatarsal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_proximal_phalanx_5"</i> (Java syntax) or <i>l_tarsal_proximal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_5 = "l_tarsal_proximal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_5</i>" has unique index 28
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_5_INDEX = 28;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_L_TARSAL_PROXIMAL_PHALANX_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_proximal_phalanx_5</i>" has unique parent "<i>l_metatarsophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_PHALANX_5
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_5 */
	public static final String NAME_L_TARSAL_PROXIMAL_PHALANX_5_PARENT = "l_metatarsophalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_middle_phalanx_5"</i> (Java syntax) or <i>l_tarsal_middle_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_5 = "l_tarsal_middle_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_5</i>" has unique index 29
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_5 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_5_INDEX = 29;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_5 */
	public static final int NAME_L_TARSAL_MIDDLE_PHALANX_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_middle_phalanx_5</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_MIDDLE_PHALANX_5
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_L_TARSAL_MIDDLE_PHALANX_5_PARENT = "l_tarsal_proximal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_tarsal_distal_phalanx_5"</i> (Java syntax) or <i>l_tarsal_distal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_5 = "l_tarsal_distal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has unique index 30
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_5_INDEX = 30;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_TARSAL_DISTAL_PHALANX_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_tarsal_distal_phalanx_5</i>" has unique parent "<i>l_tarsal_distal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_PHALANX_5
	 * @see HAnimJointObject#NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5 */
	public static final String NAME_L_TARSAL_DISTAL_PHALANX_5_PARENT = "l_tarsal_distal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_thigh"</i> (Java syntax) or <i>r_thigh</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Thigh" target="_blank">https://en.wikipedia.org/wiki/Thigh</a>  */
	public static final String NAME_R_THIGH = "r_thigh";
	/** SFString segmentNameValues enumeration value "<i>r_thigh</i>" has unique index 31
	 * @see #NAME_R_THIGH */
	public static final int NAME_R_THIGH_INDEX = 31;
	/** SFString segmentNameValues enumeration value "<i>r_thigh</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_THIGH */
	public static final int NAME_R_THIGH_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_thigh</i>" has unique parent "<i>r_hip</i>" in HAnimJointObject
	 * @see #NAME_R_THIGH
	 * @see HAnimJointObject#NAME_R_HIP */
	public static final String NAME_R_THIGH_PARENT = "r_hip";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_calf"</i> (Java syntax) or <i>r_calf</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calf_(leg)" target="_blank">https://en.wikipedia.org/wiki/Calf_(leg)</a>  */
	public static final String NAME_R_CALF = "r_calf";
	/** SFString segmentNameValues enumeration value "<i>r_calf</i>" has unique index 32
	 * @see #NAME_R_CALF */
	public static final int NAME_R_CALF_INDEX = 32;
	/** SFString segmentNameValues enumeration value "<i>r_calf</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_CALF */
	public static final int NAME_R_CALF_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_calf</i>" has unique parent "<i>r_knee</i>" in HAnimJointObject
	 * @see #NAME_R_CALF
	 * @see HAnimJointObject#NAME_R_KNEE */
	public static final String NAME_R_CALF_PARENT = "r_knee";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_talus"</i> (Java syntax) or <i>r_talus</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Talus_bone" target="_blank">https://en.wikipedia.org/wiki/Talus_bone</a>  */
	public static final String NAME_R_TALUS = "r_talus";
	/** SFString segmentNameValues enumeration value "<i>r_talus</i>" has unique index 33
	 * @see #NAME_R_TALUS */
	public static final int NAME_R_TALUS_INDEX = 33;
	/** SFString segmentNameValues enumeration value "<i>r_talus</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_TALUS */
	public static final int NAME_R_TALUS_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_talus</i>" has unique parent "<i>r_talocrural</i>" in HAnimJointObject
	 * @see #NAME_R_TALUS
	 * @see HAnimJointObject#NAME_R_TALOCRURAL */
	public static final String NAME_R_TALUS_PARENT = "r_talocrural";
	/** SFString segmentNameValues enumeration value "<i>r_talus</i>" has alias "<i>r_hindfoot</i>"
	 * @see #NAME_R_TALUS */
	public static final String NAME_R_TALUS_ALIAS = "r_hindfoot";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_navicular"</i> (Java syntax) or <i>r_navicular</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Navicular_bone" target="_blank">https://en.wikipedia.org/wiki/Navicular_bone</a>  */
	public static final String NAME_R_NAVICULAR = "r_navicular";
	/** SFString segmentNameValues enumeration value "<i>r_navicular</i>" has unique index 34
	 * @see #NAME_R_NAVICULAR */
	public static final int NAME_R_NAVICULAR_INDEX = 34;
	/** SFString segmentNameValues enumeration value "<i>r_navicular</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_NAVICULAR */
	public static final int NAME_R_NAVICULAR_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_navicular</i>" has unique parent "<i>r_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_R_NAVICULAR
	 * @see HAnimJointObject#NAME_R_TALOCALCANEONAVICULAR */
	public static final String NAME_R_NAVICULAR_PARENT = "r_talocalcaneonavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_cuneiform_1"</i> (Java syntax) or <i>r_cuneiform_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneiform_bones" target="_blank">https://en.wikipedia.org/wiki/Cuneiform_bones</a>  */
	public static final String NAME_R_CUNEIFORM_1 = "r_cuneiform_1";
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_1</i>" has unique index 35
	 * @see #NAME_R_CUNEIFORM_1 */
	public static final int NAME_R_CUNEIFORM_1_INDEX = 35;
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUNEIFORM_1 */
	public static final int NAME_R_CUNEIFORM_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_1</i>" has unique parent "<i>r_cuneonavicular_1</i>" in HAnimJointObject
	 * @see #NAME_R_CUNEIFORM_1
	 * @see HAnimJointObject#NAME_R_CUNEONAVICULAR_1 */
	public static final String NAME_R_CUNEIFORM_1_PARENT = "r_cuneonavicular_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metatarsal_1"</i> (Java syntax) or <i>r_metatarsal_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_1 = "r_metatarsal_1";
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_1</i>" has unique index 36
	 * @see #NAME_R_METATARSAL_1 */
	public static final int NAME_R_METATARSAL_1_INDEX = 36;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSAL_1 */
	public static final int NAME_R_METATARSAL_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_1</i>" has unique parent "<i>r_tarsometatarsal_1</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSAL_1
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_1 */
	public static final String NAME_R_METATARSAL_1_PARENT = "r_tarsometatarsal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_proximal_phalanx_1"</i> (Java syntax) or <i>r_tarsal_proximal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_1 = "r_tarsal_proximal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_1</i>" has unique index 37
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_1_INDEX = 37;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_1</i>" has unique parent "<i>r_metatarsophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_1
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_1 */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_1_PARENT = "r_metatarsophalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_1"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_1 = "r_tarsal_distal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_1</i>" has unique index 38
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_1_INDEX = 38;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_1_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_1</i>" has unique parent "<i>r_tarsal_interphalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_1
	 * @see HAnimJointObject#NAME_R_TARSAL_INTERPHALANGEAL_1 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_1_PARENT = "r_tarsal_interphalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_cuneiform_2"</i> (Java syntax) or <i>r_cuneiform_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneiform_bones" target="_blank">https://en.wikipedia.org/wiki/Cuneiform_bones</a>  */
	public static final String NAME_R_CUNEIFORM_2 = "r_cuneiform_2";
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_2</i>" has unique index 39
	 * @see #NAME_R_CUNEIFORM_2 */
	public static final int NAME_R_CUNEIFORM_2_INDEX = 39;
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUNEIFORM_2 */
	public static final int NAME_R_CUNEIFORM_2_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_2</i>" has unique parent "<i>r_cuneonavicular_2</i>" in HAnimJointObject
	 * @see #NAME_R_CUNEIFORM_2
	 * @see HAnimJointObject#NAME_R_CUNEONAVICULAR_2 */
	public static final String NAME_R_CUNEIFORM_2_PARENT = "r_cuneonavicular_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metatarsal_2"</i> (Java syntax) or <i>r_metatarsal_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_2 = "r_metatarsal_2";
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_2</i>" has unique index 40
	 * @see #NAME_R_METATARSAL_2 */
	public static final int NAME_R_METATARSAL_2_INDEX = 40;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METATARSAL_2 */
	public static final int NAME_R_METATARSAL_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_2</i>" has unique parent "<i>r_tarsometatarsal_2</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSAL_2
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_2 */
	public static final String NAME_R_METATARSAL_2_PARENT = "r_tarsometatarsal_2";
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_2</i>" has alias "<i>r_midproximal</i>"
	 * @see #NAME_R_METATARSAL_2 */
	public static final String NAME_R_METATARSAL_2_ALIAS = "r_midproximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_proximal_phalanx_2"</i> (Java syntax) or <i>r_tarsal_proximal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_2 = "r_tarsal_proximal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_2</i>" has unique index 41
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_2_INDEX = 41;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_2</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_2_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_2</i>" has unique parent "<i>r_metatarsophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_2
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_2 */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_2_PARENT = "r_metatarsophalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_2</i>" has alias "<i>r_middistal</i>"
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_2 */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_2_ALIAS = "r_middistal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_middle_phalanx_2"</i> (Java syntax) or <i>r_tarsal_middle_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_2 = "r_tarsal_middle_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_2</i>" has unique index 42
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_2 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_2_INDEX = 42;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_2 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_2_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_2</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_2
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_2_PARENT = "r_tarsal_proximal_interphalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_2"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_2 = "r_tarsal_distal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has unique index 43
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_2_INDEX = 43;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has unique parent "<i>r_tarsal_distal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2
	 * @see HAnimJointObject#NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_2_PARENT = "r_tarsal_distal_interphalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_2</i>" has alias "<i>r_forefoot</i>"
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_2_ALIAS = "r_forefoot";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_cuneiform_3"</i> (Java syntax) or <i>r_cuneiform_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneiform_bones" target="_blank">https://en.wikipedia.org/wiki/Cuneiform_bones</a>  */
	public static final String NAME_R_CUNEIFORM_3 = "r_cuneiform_3";
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_3</i>" has unique index 44
	 * @see #NAME_R_CUNEIFORM_3 */
	public static final int NAME_R_CUNEIFORM_3_INDEX = 44;
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUNEIFORM_3 */
	public static final int NAME_R_CUNEIFORM_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_cuneiform_3</i>" has unique parent "<i>r_cuneonavicular_3</i>" in HAnimJointObject
	 * @see #NAME_R_CUNEIFORM_3
	 * @see HAnimJointObject#NAME_R_CUNEONAVICULAR_3 */
	public static final String NAME_R_CUNEIFORM_3_PARENT = "r_cuneonavicular_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metatarsal_3"</i> (Java syntax) or <i>r_metatarsal_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_3 = "r_metatarsal_3";
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_3</i>" has unique index 45
	 * @see #NAME_R_METATARSAL_3 */
	public static final int NAME_R_METATARSAL_3_INDEX = 45;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSAL_3 */
	public static final int NAME_R_METATARSAL_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_3</i>" has unique parent "<i>r_tarsometatarsal_3</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSAL_3
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_3 */
	public static final String NAME_R_METATARSAL_3_PARENT = "r_tarsometatarsal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_proximal_phalanx_3"</i> (Java syntax) or <i>r_tarsal_proximal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_3 = "r_tarsal_proximal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_3</i>" has unique index 46
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_3_INDEX = 46;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_3</i>" has unique parent "<i>r_metatarsophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_3
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_3 */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_3_PARENT = "r_metatarsophalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_middle_phalanx_3"</i> (Java syntax) or <i>r_tarsal_middle_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_3 = "r_tarsal_middle_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_3</i>" has unique index 47
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_3 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_3_INDEX = 47;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_3 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_3</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_3
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_3_PARENT = "r_tarsal_proximal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_3"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_3 = "r_tarsal_distal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_3</i>" has unique index 48
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_3_INDEX = 48;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_3_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_3</i>" has unique parent "<i>r_tarsal_distal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_3
	 * @see HAnimJointObject#NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_3_PARENT = "r_tarsal_distal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_calcaneus"</i> (Java syntax) or <i>r_calcaneus</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calcaneus" target="_blank">https://en.wikipedia.org/wiki/Calcaneus</a>  */
	public static final String NAME_R_CALCANEUS = "r_calcaneus";
	/** SFString segmentNameValues enumeration value "<i>r_calcaneus</i>" has unique index 49
	 * @see #NAME_R_CALCANEUS */
	public static final int NAME_R_CALCANEUS_INDEX = 49;
	/** SFString segmentNameValues enumeration value "<i>r_calcaneus</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CALCANEUS */
	public static final int NAME_R_CALCANEUS_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_calcaneus</i>" has unique parent "<i>r_calcaneocuboid</i>" in HAnimJointObject
	 * @see #NAME_R_CALCANEUS
	 * @see HAnimJointObject#NAME_R_CALCANEOCUBOID */
	public static final String NAME_R_CALCANEUS_PARENT = "r_calcaneocuboid";
	/** SFString segmentNameValues enumeration value "<i>r_calcaneus</i>" has alias "<i>r_calcaneum</i>"
	 * @see #NAME_R_CALCANEUS */
	public static final String NAME_R_CALCANEUS_ALIAS = "r_calcaneum";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_cuboid"</i> (Java syntax) or <i>r_cuboid</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuboid" target="_blank">https://en.wikipedia.org/wiki/Cuboid</a>  */
	public static final String NAME_R_CUBOID = "r_cuboid";
	/** SFString segmentNameValues enumeration value "<i>r_cuboid</i>" has unique index 50
	 * @see #NAME_R_CUBOID */
	public static final int NAME_R_CUBOID_INDEX = 50;
	/** SFString segmentNameValues enumeration value "<i>r_cuboid</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUBOID */
	public static final int NAME_R_CUBOID_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_cuboid</i>" has unique parent "<i>r_transversetarsal</i>" in HAnimJointObject
	 * @see #NAME_R_CUBOID
	 * @see HAnimJointObject#NAME_R_TRANSVERSETARSAL */
	public static final String NAME_R_CUBOID_PARENT = "r_transversetarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metatarsal_4"</i> (Java syntax) or <i>r_metatarsal_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_4 = "r_metatarsal_4";
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_4</i>" has unique index 51
	 * @see #NAME_R_METATARSAL_4 */
	public static final int NAME_R_METATARSAL_4_INDEX = 51;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSAL_4 */
	public static final int NAME_R_METATARSAL_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_4</i>" has unique parent "<i>r_tarsometatarsal_4</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSAL_4
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_4 */
	public static final String NAME_R_METATARSAL_4_PARENT = "r_tarsometatarsal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_proximal_phalanx_4"</i> (Java syntax) or <i>r_tarsal_proximal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_4 = "r_tarsal_proximal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_4</i>" has unique index 52
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_4_INDEX = 52;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_4</i>" has unique parent "<i>r_metatarsophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_4
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_4 */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_4_PARENT = "r_metatarsophalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_middle_phalanx_4"</i> (Java syntax) or <i>r_tarsal_middle_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_4 = "r_tarsal_middle_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_4</i>" has unique index 53
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_4 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_4_INDEX = 53;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_4 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_4</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_4
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_4_PARENT = "r_tarsal_proximal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_4"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_4 = "r_tarsal_distal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_4</i>" has unique index 54
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_4_INDEX = 54;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_4_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_4</i>" has unique parent "<i>r_tarsal_distal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_4
	 * @see HAnimJointObject#NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_4_PARENT = "r_tarsal_distal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metatarsal_5"</i> (Java syntax) or <i>r_metatarsal_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsal_bones" target="_blank">https://en.wikipedia.org/wiki/Metatarsal_bones</a>  */
	public static final String NAME_R_METATARSAL_5 = "r_metatarsal_5";
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_5</i>" has unique index 55
	 * @see #NAME_R_METATARSAL_5 */
	public static final int NAME_R_METATARSAL_5_INDEX = 55;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSAL_5 */
	public static final int NAME_R_METATARSAL_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_metatarsal_5</i>" has unique parent "<i>r_tarsometatarsal_5</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSAL_5
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_5 */
	public static final String NAME_R_METATARSAL_5_PARENT = "r_tarsometatarsal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_proximal_phalanx_5"</i> (Java syntax) or <i>r_tarsal_proximal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_5 = "r_tarsal_proximal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_5</i>" has unique index 56
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_5_INDEX = 56;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_R_TARSAL_PROXIMAL_PHALANX_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_proximal_phalanx_5</i>" has unique parent "<i>r_metatarsophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_PHALANX_5
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_5 */
	public static final String NAME_R_TARSAL_PROXIMAL_PHALANX_5_PARENT = "r_metatarsophalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_middle_phalanx_5"</i> (Java syntax) or <i>r_tarsal_middle_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_5 = "r_tarsal_middle_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_5</i>" has unique index 57
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_5 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_5_INDEX = 57;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_5 */
	public static final int NAME_R_TARSAL_MIDDLE_PHALANX_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_middle_phalanx_5</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_MIDDLE_PHALANX_5
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_R_TARSAL_MIDDLE_PHALANX_5_PARENT = "r_tarsal_proximal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_tarsal_distal_phalanx_5"</i> (Java syntax) or <i>r_tarsal_distal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_5 = "r_tarsal_distal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has unique index 58
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_5_INDEX = 58;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_TARSAL_DISTAL_PHALANX_5_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_tarsal_distal_phalanx_5</i>" has unique parent "<i>r_tarsal_distal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_PHALANX_5
	 * @see HAnimJointObject#NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5 */
	public static final String NAME_R_TARSAL_DISTAL_PHALANX_5_PARENT = "r_tarsal_distal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l5"</i> (Java syntax) or <i>l5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_L5 = "l5";
	/** SFString segmentNameValues enumeration value "<i>l5</i>" has unique index 59
	 * @see #NAME_L5 */
	public static final int NAME_L5_INDEX = 59;
	/** SFString segmentNameValues enumeration value "<i>l5</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L5 */
	public static final int NAME_L5_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l5</i>" has unique parent "<i>vl5</i>" in HAnimJointObject
	 * @see #NAME_L5
	 * @see HAnimJointObject#NAME_VL5 */
	public static final String NAME_L5_PARENT = "vl5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l4"</i> (Java syntax) or <i>l4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_L4 = "l4";
	/** SFString segmentNameValues enumeration value "<i>l4</i>" has unique index 60
	 * @see #NAME_L4 */
	public static final int NAME_L4_INDEX = 60;
	/** SFString segmentNameValues enumeration value "<i>l4</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L4 */
	public static final int NAME_L4_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>l4</i>" has unique parent "<i>vl4</i>" in HAnimJointObject
	 * @see #NAME_L4
	 * @see HAnimJointObject#NAME_VL4 */
	public static final String NAME_L4_PARENT = "vl4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l3"</i> (Java syntax) or <i>l3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_L3 = "l3";
	/** SFString segmentNameValues enumeration value "<i>l3</i>" has unique index 61
	 * @see #NAME_L3 */
	public static final int NAME_L3_INDEX = 61;
	/** SFString segmentNameValues enumeration value "<i>l3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L3 */
	public static final int NAME_L3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l3</i>" has unique parent "<i>vl3</i>" in HAnimJointObject
	 * @see #NAME_L3
	 * @see HAnimJointObject#NAME_VL3 */
	public static final String NAME_L3_PARENT = "vl3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l2"</i> (Java syntax) or <i>l2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_L2 = "l2";
	/** SFString segmentNameValues enumeration value "<i>l2</i>" has unique index 62
	 * @see #NAME_L2 */
	public static final int NAME_L2_INDEX = 62;
	/** SFString segmentNameValues enumeration value "<i>l2</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L2 */
	public static final int NAME_L2_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>l2</i>" has unique parent "<i>vl2</i>" in HAnimJointObject
	 * @see #NAME_L2
	 * @see HAnimJointObject#NAME_VL2 */
	public static final String NAME_L2_PARENT = "vl2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l1"</i> (Java syntax) or <i>l1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_L1 = "l1";
	/** SFString segmentNameValues enumeration value "<i>l1</i>" has unique index 63
	 * @see #NAME_L1 */
	public static final int NAME_L1_INDEX = 63;
	/** SFString segmentNameValues enumeration value "<i>l1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L1 */
	public static final int NAME_L1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l1</i>" has unique parent "<i>vl1</i>" in HAnimJointObject
	 * @see #NAME_L1
	 * @see HAnimJointObject#NAME_VL1 */
	public static final String NAME_L1_PARENT = "vl1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t12"</i> (Java syntax) or <i>t12</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T12 = "t12";
	/** SFString segmentNameValues enumeration value "<i>t12</i>" has unique index 64
	 * @see #NAME_T12 */
	public static final int NAME_T12_INDEX = 64;
	/** SFString segmentNameValues enumeration value "<i>t12</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T12 */
	public static final int NAME_T12_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t12</i>" has unique parent "<i>vt12</i>" in HAnimJointObject
	 * @see #NAME_T12
	 * @see HAnimJointObject#NAME_VT12 */
	public static final String NAME_T12_PARENT = "vt12";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t11"</i> (Java syntax) or <i>t11</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T11 = "t11";
	/** SFString segmentNameValues enumeration value "<i>t11</i>" has unique index 65
	 * @see #NAME_T11 */
	public static final int NAME_T11_INDEX = 65;
	/** SFString segmentNameValues enumeration value "<i>t11</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T11 */
	public static final int NAME_T11_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t11</i>" has unique parent "<i>vt11</i>" in HAnimJointObject
	 * @see #NAME_T11
	 * @see HAnimJointObject#NAME_VT11 */
	public static final String NAME_T11_PARENT = "vt11";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t10"</i> (Java syntax) or <i>t10</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T10 = "t10";
	/** SFString segmentNameValues enumeration value "<i>t10</i>" has unique index 66
	 * @see #NAME_T10 */
	public static final int NAME_T10_INDEX = 66;
	/** SFString segmentNameValues enumeration value "<i>t10</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_T10 */
	public static final int NAME_T10_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>t10</i>" has unique parent "<i>vt10</i>" in HAnimJointObject
	 * @see #NAME_T10
	 * @see HAnimJointObject#NAME_VT10 */
	public static final String NAME_T10_PARENT = "vt10";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t9"</i> (Java syntax) or <i>t9</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T9 = "t9";
	/** SFString segmentNameValues enumeration value "<i>t9</i>" has unique index 67
	 * @see #NAME_T9 */
	public static final int NAME_T9_INDEX = 67;
	/** SFString segmentNameValues enumeration value "<i>t9</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T9 */
	public static final int NAME_T9_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t9</i>" has unique parent "<i>vt9</i>" in HAnimJointObject
	 * @see #NAME_T9
	 * @see HAnimJointObject#NAME_VT9 */
	public static final String NAME_T9_PARENT = "vt9";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t8"</i> (Java syntax) or <i>t8</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T8 = "t8";
	/** SFString segmentNameValues enumeration value "<i>t8</i>" has unique index 68
	 * @see #NAME_T8 */
	public static final int NAME_T8_INDEX = 68;
	/** SFString segmentNameValues enumeration value "<i>t8</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T8 */
	public static final int NAME_T8_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t8</i>" has unique parent "<i>vt8</i>" in HAnimJointObject
	 * @see #NAME_T8
	 * @see HAnimJointObject#NAME_VT8 */
	public static final String NAME_T8_PARENT = "vt8";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t7"</i> (Java syntax) or <i>t7</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T7 = "t7";
	/** SFString segmentNameValues enumeration value "<i>t7</i>" has unique index 69
	 * @see #NAME_T7 */
	public static final int NAME_T7_INDEX = 69;
	/** SFString segmentNameValues enumeration value "<i>t7</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T7 */
	public static final int NAME_T7_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t7</i>" has unique parent "<i>vt7</i>" in HAnimJointObject
	 * @see #NAME_T7
	 * @see HAnimJointObject#NAME_VT7 */
	public static final String NAME_T7_PARENT = "vt7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t6"</i> (Java syntax) or <i>t6</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T6 = "t6";
	/** SFString segmentNameValues enumeration value "<i>t6</i>" has unique index 70
	 * @see #NAME_T6 */
	public static final int NAME_T6_INDEX = 70;
	/** SFString segmentNameValues enumeration value "<i>t6</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_T6 */
	public static final int NAME_T6_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>t6</i>" has unique parent "<i>vt6</i>" in HAnimJointObject
	 * @see #NAME_T6
	 * @see HAnimJointObject#NAME_VT6 */
	public static final String NAME_T6_PARENT = "vt6";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t5"</i> (Java syntax) or <i>t5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T5 = "t5";
	/** SFString segmentNameValues enumeration value "<i>t5</i>" has unique index 71
	 * @see #NAME_T5 */
	public static final int NAME_T5_INDEX = 71;
	/** SFString segmentNameValues enumeration value "<i>t5</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T5 */
	public static final int NAME_T5_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t5</i>" has unique parent "<i>vt5</i>" in HAnimJointObject
	 * @see #NAME_T5
	 * @see HAnimJointObject#NAME_VT5 */
	public static final String NAME_T5_PARENT = "vt5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t4"</i> (Java syntax) or <i>t4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T4 = "t4";
	/** SFString segmentNameValues enumeration value "<i>t4</i>" has unique index 72
	 * @see #NAME_T4 */
	public static final int NAME_T4_INDEX = 72;
	/** SFString segmentNameValues enumeration value "<i>t4</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T4 */
	public static final int NAME_T4_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t4</i>" has unique parent "<i>vt4</i>" in HAnimJointObject
	 * @see #NAME_T4
	 * @see HAnimJointObject#NAME_VT4 */
	public static final String NAME_T4_PARENT = "vt4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t3"</i> (Java syntax) or <i>t3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T3 = "t3";
	/** SFString segmentNameValues enumeration value "<i>t3</i>" has unique index 73
	 * @see #NAME_T3 */
	public static final int NAME_T3_INDEX = 73;
	/** SFString segmentNameValues enumeration value "<i>t3</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T3 */
	public static final int NAME_T3_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t3</i>" has unique parent "<i>vt3</i>" in HAnimJointObject
	 * @see #NAME_T3
	 * @see HAnimJointObject#NAME_VT3 */
	public static final String NAME_T3_PARENT = "vt3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t2"</i> (Java syntax) or <i>t2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T2 = "t2";
	/** SFString segmentNameValues enumeration value "<i>t2</i>" has unique index 74
	 * @see #NAME_T2 */
	public static final int NAME_T2_INDEX = 74;
	/** SFString segmentNameValues enumeration value "<i>t2</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_T2 */
	public static final int NAME_T2_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>t2</i>" has unique parent "<i>vt2</i>" in HAnimJointObject
	 * @see #NAME_T2
	 * @see HAnimJointObject#NAME_VT2 */
	public static final String NAME_T2_PARENT = "vt2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"t1"</i> (Java syntax) or <i>t1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_T1 = "t1";
	/** SFString segmentNameValues enumeration value "<i>t1</i>" has unique index 75
	 * @see #NAME_T1 */
	public static final int NAME_T1_INDEX = 75;
	/** SFString segmentNameValues enumeration value "<i>t1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_T1 */
	public static final int NAME_T1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>t1</i>" has unique parent "<i>vt1</i>" in HAnimJointObject
	 * @see #NAME_T1
	 * @see HAnimJointObject#NAME_VT1 */
	public static final String NAME_T1_PARENT = "vt1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c7"</i> (Java syntax) or <i>c7</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C7 = "c7";
	/** SFString segmentNameValues enumeration value "<i>c7</i>" has unique index 76
	 * @see #NAME_C7 */
	public static final int NAME_C7_INDEX = 76;
	/** SFString segmentNameValues enumeration value "<i>c7</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_C7 */
	public static final int NAME_C7_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>c7</i>" has unique parent "<i>vc7</i>" in HAnimJointObject
	 * @see #NAME_C7
	 * @see HAnimJointObject#NAME_VC7 */
	public static final String NAME_C7_PARENT = "vc7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c6"</i> (Java syntax) or <i>c6</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C6 = "c6";
	/** SFString segmentNameValues enumeration value "<i>c6</i>" has unique index 77
	 * @see #NAME_C6 */
	public static final int NAME_C6_INDEX = 77;
	/** SFString segmentNameValues enumeration value "<i>c6</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_C6 */
	public static final int NAME_C6_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>c6</i>" has unique parent "<i>vc6</i>" in HAnimJointObject
	 * @see #NAME_C6
	 * @see HAnimJointObject#NAME_VC6 */
	public static final String NAME_C6_PARENT = "vc6";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c5"</i> (Java syntax) or <i>c5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C5 = "c5";
	/** SFString segmentNameValues enumeration value "<i>c5</i>" has unique index 78
	 * @see #NAME_C5 */
	public static final int NAME_C5_INDEX = 78;
	/** SFString segmentNameValues enumeration value "<i>c5</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_C5 */
	public static final int NAME_C5_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>c5</i>" has unique parent "<i>vc5</i>" in HAnimJointObject
	 * @see #NAME_C5
	 * @see HAnimJointObject#NAME_VC5 */
	public static final String NAME_C5_PARENT = "vc5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c4"</i> (Java syntax) or <i>c4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C4 = "c4";
	/** SFString segmentNameValues enumeration value "<i>c4</i>" has unique index 79
	 * @see #NAME_C4 */
	public static final int NAME_C4_INDEX = 79;
	/** SFString segmentNameValues enumeration value "<i>c4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_C4 */
	public static final int NAME_C4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>c4</i>" has unique parent "<i>vc4</i>" in HAnimJointObject
	 * @see #NAME_C4
	 * @see HAnimJointObject#NAME_VC4 */
	public static final String NAME_C4_PARENT = "vc4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c3"</i> (Java syntax) or <i>c3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C3 = "c3";
	/** SFString segmentNameValues enumeration value "<i>c3</i>" has unique index 80
	 * @see #NAME_C3 */
	public static final int NAME_C3_INDEX = 80;
	/** SFString segmentNameValues enumeration value "<i>c3</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_C3 */
	public static final int NAME_C3_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>c3</i>" has unique parent "<i>vc3</i>" in HAnimJointObject
	 * @see #NAME_C3
	 * @see HAnimJointObject#NAME_VC3 */
	public static final String NAME_C3_PARENT = "vc3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c2"</i> (Java syntax) or <i>c2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C2 = "c2";
	/** SFString segmentNameValues enumeration value "<i>c2</i>" has unique index 81
	 * @see #NAME_C2 */
	public static final int NAME_C2_INDEX = 81;
	/** SFString segmentNameValues enumeration value "<i>c2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_C2 */
	public static final int NAME_C2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>c2</i>" has unique parent "<i>vc2</i>" in HAnimJointObject
	 * @see #NAME_C2
	 * @see HAnimJointObject#NAME_VC2 */
	public static final String NAME_C2_PARENT = "vc2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"c1"</i> (Java syntax) or <i>c1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_C1 = "c1";
	/** SFString segmentNameValues enumeration value "<i>c1</i>" has unique index 82
	 * @see #NAME_C1 */
	public static final int NAME_C1_INDEX = 82;
	/** SFString segmentNameValues enumeration value "<i>c1</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_C1 */
	public static final int NAME_C1_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>c1</i>" has unique parent "<i>vc1</i>" in HAnimJointObject
	 * @see #NAME_C1
	 * @see HAnimJointObject#NAME_VC1 */
	public static final String NAME_C1_PARENT = "vc1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"skull"</i> (Java syntax) or <i>skull</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Skull" target="_blank">https://en.wikipedia.org/wiki/Skull</a>  */
	public static final String NAME_SKULL = "skull";
	/** SFString segmentNameValues enumeration value "<i>skull</i>" has unique index 83
	 * @see #NAME_SKULL */
	public static final int NAME_SKULL_INDEX = 83;
	/** SFString segmentNameValues enumeration value "<i>skull</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_SKULL */
	public static final int NAME_SKULL_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>skull</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_SKULL
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_SKULL_PARENT = "skullbase";
	/** SFString segmentNameValues enumeration value "<i>skull</i>" has alias "<i>head</i>"
	 * @see #NAME_SKULL */
	public static final String NAME_SKULL_ALIAS = "head";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_eyelid"</i> (Java syntax) or <i>l_eyelid</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyelid" target="_blank">https://en.wikipedia.org/wiki/Eyelid</a>  */
	public static final String NAME_L_EYELID = "l_eyelid";
	/** SFString segmentNameValues enumeration value "<i>l_eyelid</i>" has unique index 84
	 * @see #NAME_L_EYELID */
	public static final int NAME_L_EYELID_INDEX = 84;
	/** SFString segmentNameValues enumeration value "<i>l_eyelid</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_EYELID */
	public static final int NAME_L_EYELID_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>l_eyelid</i>" has unique parent "<i>l_eyelid_joint</i>" in HAnimJointObject
	 * @see #NAME_L_EYELID
	 * @see HAnimJointObject#NAME_L_EYELID_JOINT */
	public static final String NAME_L_EYELID_PARENT = "l_eyelid_joint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_eyelid"</i> (Java syntax) or <i>r_eyelid</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyelid" target="_blank">https://en.wikipedia.org/wiki/Eyelid</a>  */
	public static final String NAME_R_EYELID = "r_eyelid";
	/** SFString segmentNameValues enumeration value "<i>r_eyelid</i>" has unique index 85
	 * @see #NAME_R_EYELID */
	public static final int NAME_R_EYELID_INDEX = 85;
	/** SFString segmentNameValues enumeration value "<i>r_eyelid</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_EYELID */
	public static final int NAME_R_EYELID_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>r_eyelid</i>" has unique parent "<i>r_eyelid_joint</i>" in HAnimJointObject
	 * @see #NAME_R_EYELID
	 * @see HAnimJointObject#NAME_R_EYELID_JOINT */
	public static final String NAME_R_EYELID_PARENT = "r_eyelid_joint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_eyeball"</i> (Java syntax) or <i>l_eyeball</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eye" target="_blank">https://en.wikipedia.org/wiki/Eye</a>  */
	public static final String NAME_L_EYEBALL = "l_eyeball";
	/** SFString segmentNameValues enumeration value "<i>l_eyeball</i>" has unique index 86
	 * @see #NAME_L_EYEBALL */
	public static final int NAME_L_EYEBALL_INDEX = 86;
	/** SFString segmentNameValues enumeration value "<i>l_eyeball</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_EYEBALL */
	public static final int NAME_L_EYEBALL_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>l_eyeball</i>" has unique parent "<i>l_eyeball_joint</i>" in HAnimJointObject
	 * @see #NAME_L_EYEBALL
	 * @see HAnimJointObject#NAME_L_EYEBALL_JOINT */
	public static final String NAME_L_EYEBALL_PARENT = "l_eyeball_joint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_eyeball"</i> (Java syntax) or <i>r_eyeball</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eye" target="_blank">https://en.wikipedia.org/wiki/Eye</a>  */
	public static final String NAME_R_EYEBALL = "r_eyeball";
	/** SFString segmentNameValues enumeration value "<i>r_eyeball</i>" has unique index 87
	 * @see #NAME_R_EYEBALL */
	public static final int NAME_R_EYEBALL_INDEX = 87;
	/** SFString segmentNameValues enumeration value "<i>r_eyeball</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_EYEBALL */
	public static final int NAME_R_EYEBALL_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>r_eyeball</i>" has unique parent "<i>r_eyeball_joint</i>" in HAnimJointObject
	 * @see #NAME_R_EYEBALL
	 * @see HAnimJointObject#NAME_R_EYEBALL_JOINT */
	public static final String NAME_R_EYEBALL_PARENT = "r_eyeball_joint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_eyebrow"</i> (Java syntax) or <i>l_eyebrow</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyebrow" target="_blank">https://en.wikipedia.org/wiki/Eyebrow</a>  */
	public static final String NAME_L_EYEBROW = "l_eyebrow";
	/** SFString segmentNameValues enumeration value "<i>l_eyebrow</i>" has unique index 88
	 * @see #NAME_L_EYEBROW */
	public static final int NAME_L_EYEBROW_INDEX = 88;
	/** SFString segmentNameValues enumeration value "<i>l_eyebrow</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_EYEBROW */
	public static final int NAME_L_EYEBROW_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>l_eyebrow</i>" has unique parent "<i>l_eyebrow_joint</i>" in HAnimJointObject
	 * @see #NAME_L_EYEBROW
	 * @see HAnimJointObject#NAME_L_EYEBROW_JOINT */
	public static final String NAME_L_EYEBROW_PARENT = "l_eyebrow_joint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_eyebrow"</i> (Java syntax) or <i>r_eyebrow</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyebrow" target="_blank">https://en.wikipedia.org/wiki/Eyebrow</a>  */
	public static final String NAME_R_EYEBROW = "r_eyebrow";
	/** SFString segmentNameValues enumeration value "<i>r_eyebrow</i>" has unique index 89
	 * @see #NAME_R_EYEBROW */
	public static final int NAME_R_EYEBROW_INDEX = 89;
	/** SFString segmentNameValues enumeration value "<i>r_eyebrow</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_EYEBROW */
	public static final int NAME_R_EYEBROW_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>r_eyebrow</i>" has unique parent "<i>r_eyebrow_joint</i>" in HAnimJointObject
	 * @see #NAME_R_EYEBROW
	 * @see HAnimJointObject#NAME_R_EYEBROW_JOINT */
	public static final String NAME_R_EYEBROW_PARENT = "r_eyebrow_joint";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"jaw"</i> (Java syntax) or <i>jaw</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Jaw" target="_blank">https://en.wikipedia.org/wiki/Jaw</a>  */
	public static final String NAME_JAW = "jaw";
	/** SFString segmentNameValues enumeration value "<i>jaw</i>" has unique index 90
	 * @see #NAME_JAW */
	public static final int NAME_JAW_INDEX = 90;
	/** SFString segmentNameValues enumeration value "<i>jaw</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_JAW */
	public static final int NAME_JAW_LOA = 3;
	/** SFString segmentNameValues enumeration value "<i>jaw</i>" has unique parent "<i>temporomandibular</i>" in HAnimJointObject
	 * @see #NAME_JAW
	 * @see HAnimJointObject#NAME_TEMPOROMANDIBULAR */
	public static final String NAME_JAW_PARENT = "temporomandibular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_clavicle"</i> (Java syntax) or <i>l_clavicle</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Clavicle" target="_blank">https://en.wikipedia.org/wiki/Clavicle</a>  */
	public static final String NAME_L_CLAVICLE = "l_clavicle";
	/** SFString segmentNameValues enumeration value "<i>l_clavicle</i>" has unique index 91
	 * @see #NAME_L_CLAVICLE */
	public static final int NAME_L_CLAVICLE_INDEX = 91;
	/** SFString segmentNameValues enumeration value "<i>l_clavicle</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CLAVICLE */
	public static final int NAME_L_CLAVICLE_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_clavicle</i>" has unique parent "<i>l_sternoclavicular</i>" in HAnimJointObject
	 * @see #NAME_L_CLAVICLE
	 * @see HAnimJointObject#NAME_L_STERNOCLAVICULAR */
	public static final String NAME_L_CLAVICLE_PARENT = "l_sternoclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_scapula"</i> (Java syntax) or <i>l_scapula</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Scapula" target="_blank">https://en.wikipedia.org/wiki/Scapula</a>  */
	public static final String NAME_L_SCAPULA = "l_scapula";
	/** SFString segmentNameValues enumeration value "<i>l_scapula</i>" has unique index 92
	 * @see #NAME_L_SCAPULA */
	public static final int NAME_L_SCAPULA_INDEX = 92;
	/** SFString segmentNameValues enumeration value "<i>l_scapula</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_SCAPULA */
	public static final int NAME_L_SCAPULA_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_scapula</i>" has unique parent "<i>l_acromioclavicular</i>" in HAnimJointObject
	 * @see #NAME_L_SCAPULA
	 * @see HAnimJointObject#NAME_L_ACROMIOCLAVICULAR */
	public static final String NAME_L_SCAPULA_PARENT = "l_acromioclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_upperarm"</i> (Java syntax) or <i>l_upperarm</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Arm" target="_blank">https://en.wikipedia.org/wiki/Arm</a>  */
	public static final String NAME_L_UPPERARM = "l_upperarm";
	/** SFString segmentNameValues enumeration value "<i>l_upperarm</i>" has unique index 93
	 * @see #NAME_L_UPPERARM */
	public static final int NAME_L_UPPERARM_INDEX = 93;
	/** SFString segmentNameValues enumeration value "<i>l_upperarm</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_UPPERARM */
	public static final int NAME_L_UPPERARM_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_upperarm</i>" has unique parent "<i>l_shoulder</i>" in HAnimJointObject
	 * @see #NAME_L_UPPERARM
	 * @see HAnimJointObject#NAME_L_SHOULDER */
	public static final String NAME_L_UPPERARM_PARENT = "l_shoulder";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_forearm"</i> (Java syntax) or <i>l_forearm</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Forearm" target="_blank">https://en.wikipedia.org/wiki/Forearm</a>  */
	public static final String NAME_L_FOREARM = "l_forearm";
	/** SFString segmentNameValues enumeration value "<i>l_forearm</i>" has unique index 94
	 * @see #NAME_L_FOREARM */
	public static final int NAME_L_FOREARM_INDEX = 94;
	/** SFString segmentNameValues enumeration value "<i>l_forearm</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_FOREARM */
	public static final int NAME_L_FOREARM_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_forearm</i>" has unique parent "<i>l_elbow</i>" in HAnimJointObject
	 * @see #NAME_L_FOREARM
	 * @see HAnimJointObject#NAME_L_ELBOW */
	public static final String NAME_L_FOREARM_PARENT = "l_elbow";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal"</i> (Java syntax) or <i>l_carpal</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpal_bones" target="_blank">https://en.wikipedia.org/wiki/Carpal_bones</a>  */
	public static final String NAME_L_CARPAL = "l_carpal";
	/** SFString segmentNameValues enumeration value "<i>l_carpal</i>" has unique index 95
	 * @see #NAME_L_CARPAL */
	public static final int NAME_L_CARPAL_INDEX = 95;
	/** SFString segmentNameValues enumeration value "<i>l_carpal</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_CARPAL */
	public static final int NAME_L_CARPAL_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>l_carpal</i>" has unique parent "<i>l_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL
	 * @see HAnimJointObject#NAME_L_RADIOCARPAL */
	public static final String NAME_L_CARPAL_PARENT = "l_radiocarpal";
	/** SFString segmentNameValues enumeration value "<i>l_carpal</i>" has alias "<i>l_hand</i>"
	 * @see #NAME_L_CARPAL */
	public static final String NAME_L_CARPAL_ALIAS = "l_hand";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_trapezium"</i> (Java syntax) or <i>l_trapezium</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Trapezium_(bone)" target="_blank">https://en.wikipedia.org/wiki/Trapezium_(bone)</a>  */
	public static final String NAME_L_TRAPEZIUM = "l_trapezium";
	/** SFString segmentNameValues enumeration value "<i>l_trapezium</i>" has unique index 96
	 * @see #NAME_L_TRAPEZIUM */
	public static final int NAME_L_TRAPEZIUM_INDEX = 96;
	/** SFString segmentNameValues enumeration value "<i>l_trapezium</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TRAPEZIUM */
	public static final int NAME_L_TRAPEZIUM_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_trapezium</i>" has unique parent "<i>l_midcarpal_1</i>" in HAnimJointObject
	 * @see #NAME_L_TRAPEZIUM
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_1 */
	public static final String NAME_L_TRAPEZIUM_PARENT = "l_midcarpal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metacarpal_1"</i> (Java syntax) or <i>l_metacarpal_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_1 = "l_metacarpal_1";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_1</i>" has unique index 97
	 * @see #NAME_L_METACARPAL_1 */
	public static final int NAME_L_METACARPAL_1_INDEX = 97;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_1 */
	public static final int NAME_L_METACARPAL_1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_1</i>" has unique parent "<i>l_carpometacarpal_1</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPAL_1
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_1 */
	public static final String NAME_L_METACARPAL_1_PARENT = "l_carpometacarpal_1";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_1</i>" has alias "<i>l_thumb_metacarpal</i>"
	 * @see #NAME_L_METACARPAL_1 */
	public static final String NAME_L_METACARPAL_1_ALIAS = "l_thumb_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_proximal_phalanx_1"</i> (Java syntax) or <i>l_carpal_proximal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_1 = "l_carpal_proximal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_1</i>" has unique index 98
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_1_INDEX = 98;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_1</i>" has unique parent "<i>l_metacarpophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_1
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_1 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_1_PARENT = "l_metacarpophalangeal_1";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_1</i>" has alias "<i>l_thumb_proximal</i>"
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_1 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_1_ALIAS = "l_thumb_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_1"</i> (Java syntax) or <i>l_carpal_distal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_1 = "l_carpal_distal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has unique index 99
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_1_INDEX = 99;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has unique parent "<i>l_carpal_interphalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1
	 * @see HAnimJointObject#NAME_L_CARPAL_INTERPHALANGEAL_1 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_1_PARENT = "l_carpal_interphalangeal_1";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_1</i>" has alias "<i>l_thumb_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_1 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_1_ALIAS = "l_thumb_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_trapezoid"</i> (Java syntax) or <i>l_trapezoid</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Trapezoid_bone" target="_blank">https://en.wikipedia.org/wiki/Trapezoid_bone</a>  */
	public static final String NAME_L_TRAPEZOID = "l_trapezoid";
	/** SFString segmentNameValues enumeration value "<i>l_trapezoid</i>" has unique index 100
	 * @see #NAME_L_TRAPEZOID */
	public static final int NAME_L_TRAPEZOID_INDEX = 100;
	/** SFString segmentNameValues enumeration value "<i>l_trapezoid</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TRAPEZOID */
	public static final int NAME_L_TRAPEZOID_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_trapezoid</i>" has unique parent "<i>l_midcarpal_2</i>" in HAnimJointObject
	 * @see #NAME_L_TRAPEZOID
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_2 */
	public static final String NAME_L_TRAPEZOID_PARENT = "l_midcarpal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metacarpal_2"</i> (Java syntax) or <i>l_metacarpal_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_2 = "l_metacarpal_2";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_2</i>" has unique index 101
	 * @see #NAME_L_METACARPAL_2 */
	public static final int NAME_L_METACARPAL_2_INDEX = 101;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_2 */
	public static final int NAME_L_METACARPAL_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_2</i>" has unique parent "<i>l_carpometacarpal_2</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPAL_2
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_2 */
	public static final String NAME_L_METACARPAL_2_PARENT = "l_carpometacarpal_2";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_2</i>" has alias "<i>l_index_metacarpal</i>"
	 * @see #NAME_L_METACARPAL_2 */
	public static final String NAME_L_METACARPAL_2_ALIAS = "l_index_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_proximal_phalanx_2"</i> (Java syntax) or <i>l_carpal_proximal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_2 = "l_carpal_proximal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_2</i>" has unique index 102
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_2_INDEX = 102;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_2</i>" has unique parent "<i>l_metacarpophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_2
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_2 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_2_PARENT = "l_metacarpophalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_2</i>" has alias "<i>l_index_proximal</i>"
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_2 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_2_ALIAS = "l_index_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_middle_phalanx_2"</i> (Java syntax) or <i>l_carpal_middle_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_2 = "l_carpal_middle_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_2</i>" has unique index 103
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_2 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_2_INDEX = 103;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_2 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_2</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_2
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_2_PARENT = "l_carpal_proximal_interphalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_2</i>" has alias "<i>l_index_middle</i>"
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_2 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_2_ALIAS = "l_index_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_2"</i> (Java syntax) or <i>l_carpal_distal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_2 = "l_carpal_distal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has unique index 104
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_2_INDEX = 104;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has unique parent "<i>l_carpal_distal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2
	 * @see HAnimJointObject#NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_2_PARENT = "l_carpal_distal_interphalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_2</i>" has alias "<i>l_index_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_2_ALIAS = "l_index_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_capitate"</i> (Java syntax) or <i>l_capitate</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Capitate_bone" target="_blank">https://en.wikipedia.org/wiki/Capitate_bone</a>  */
	public static final String NAME_L_CAPITATE = "l_capitate";
	/** SFString segmentNameValues enumeration value "<i>l_capitate</i>" has unique index 105
	 * @see #NAME_L_CAPITATE */
	public static final int NAME_L_CAPITATE_INDEX = 105;
	/** SFString segmentNameValues enumeration value "<i>l_capitate</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CAPITATE */
	public static final int NAME_L_CAPITATE_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_capitate</i>" has unique parent "<i>l_midcarpal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CAPITATE
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_3 */
	public static final String NAME_L_CAPITATE_PARENT = "l_midcarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metacarpal_3"</i> (Java syntax) or <i>l_metacarpal_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_3 = "l_metacarpal_3";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_3</i>" has unique index 106
	 * @see #NAME_L_METACARPAL_3 */
	public static final int NAME_L_METACARPAL_3_INDEX = 106;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_3 */
	public static final int NAME_L_METACARPAL_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_3</i>" has unique parent "<i>l_carpometacarpal_3</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPAL_3
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_3 */
	public static final String NAME_L_METACARPAL_3_PARENT = "l_carpometacarpal_3";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_3</i>" has alias "<i>l_middle_metacarpal</i>"
	 * @see #NAME_L_METACARPAL_3 */
	public static final String NAME_L_METACARPAL_3_ALIAS = "l_middle_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_proximal_phalanx_3"</i> (Java syntax) or <i>l_carpal_proximal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_3 = "l_carpal_proximal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_3</i>" has unique index 107
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_3_INDEX = 107;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_3</i>" has unique parent "<i>l_metacarpophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_3
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_3 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_3_PARENT = "l_metacarpophalangeal_3";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_3</i>" has alias "<i>l_middle_proximal</i>"
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_3 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_3_ALIAS = "l_middle_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_middle_phalanx_3"</i> (Java syntax) or <i>l_carpal_middle_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_3 = "l_carpal_middle_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_3</i>" has unique index 108
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_3 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_3_INDEX = 108;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_3 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_3</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_3
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_3_PARENT = "l_carpal_proximal_interphalangeal_3";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_3</i>" has alias "<i>l_middle_middle</i>"
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_3 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_3_ALIAS = "l_middle_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_3"</i> (Java syntax) or <i>l_carpal_distal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_3 = "l_carpal_distal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has unique index 109
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_3_INDEX = 109;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has unique parent "<i>l_carpal_distal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3
	 * @see HAnimJointObject#NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_3_PARENT = "l_carpal_distal_interphalangeal_3";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_3</i>" has alias "<i>l_middle_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_3 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_3_ALIAS = "l_middle_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_hamate"</i> (Java syntax) or <i>l_hamate</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Hamate_bone" target="_blank">https://en.wikipedia.org/wiki/Hamate_bone</a>  */
	public static final String NAME_L_HAMATE = "l_hamate";
	/** SFString segmentNameValues enumeration value "<i>l_hamate</i>" has unique index 110
	 * @see #NAME_L_HAMATE */
	public static final int NAME_L_HAMATE_INDEX = 110;
	/** SFString segmentNameValues enumeration value "<i>l_hamate</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_HAMATE */
	public static final int NAME_L_HAMATE_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>l_hamate</i>" has unique parent "<i>l_midcarpal_4_5</i>" in HAnimJointObject
	 * @see #NAME_L_HAMATE
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_4_5 */
	public static final String NAME_L_HAMATE_PARENT = "l_midcarpal_4_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metacarpal_4"</i> (Java syntax) or <i>l_metacarpal_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_4 = "l_metacarpal_4";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_4</i>" has unique index 111
	 * @see #NAME_L_METACARPAL_4 */
	public static final int NAME_L_METACARPAL_4_INDEX = 111;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_4 */
	public static final int NAME_L_METACARPAL_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_4</i>" has unique parent "<i>l_carpometacarpal_4</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPAL_4
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_4 */
	public static final String NAME_L_METACARPAL_4_PARENT = "l_carpometacarpal_4";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_4</i>" has alias "<i>l_ring_metacarpal</i>"
	 * @see #NAME_L_METACARPAL_4 */
	public static final String NAME_L_METACARPAL_4_ALIAS = "l_ring_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_proximal_phalanx_4"</i> (Java syntax) or <i>l_carpal_proximal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_4 = "l_carpal_proximal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_4</i>" has unique index 112
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_4_INDEX = 112;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_4</i>" has unique parent "<i>l_metacarpophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_4
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_4 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_4_PARENT = "l_metacarpophalangeal_4";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_4</i>" has alias "<i>l_ring_proximal</i>"
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_4 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_4_ALIAS = "l_ring_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_middle_phalanx_4"</i> (Java syntax) or <i>l_carpal_middle_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_4 = "l_carpal_middle_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_4</i>" has unique index 113
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_4 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_4_INDEX = 113;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_4 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_4</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_4
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_4_PARENT = "l_carpal_proximal_interphalangeal_4";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_4</i>" has alias "<i>l_ring_middle</i>"
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_4 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_4_ALIAS = "l_ring_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_4"</i> (Java syntax) or <i>l_carpal_distal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_4 = "l_carpal_distal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has unique index 114
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_4_INDEX = 114;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has unique parent "<i>l_carpal_distal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4
	 * @see HAnimJointObject#NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_4_PARENT = "l_carpal_distal_interphalangeal_4";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_4</i>" has alias "<i>l_ring_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_4 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_4_ALIAS = "l_ring_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_metacarpal_5"</i> (Java syntax) or <i>l_metacarpal_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_L_METACARPAL_5 = "l_metacarpal_5";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_5</i>" has unique index 115
	 * @see #NAME_L_METACARPAL_5 */
	public static final int NAME_L_METACARPAL_5_INDEX = 115;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPAL_5 */
	public static final int NAME_L_METACARPAL_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_5</i>" has unique parent "<i>l_carpometacarpal_5</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPAL_5
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_5 */
	public static final String NAME_L_METACARPAL_5_PARENT = "l_carpometacarpal_5";
	/** SFString segmentNameValues enumeration value "<i>l_metacarpal_5</i>" has alias "<i>l_pinky_metacarpal</i>"
	 * @see #NAME_L_METACARPAL_5 */
	public static final String NAME_L_METACARPAL_5_ALIAS = "l_pinky_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_proximal_phalanx_5"</i> (Java syntax) or <i>l_carpal_proximal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_5 = "l_carpal_proximal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_5</i>" has unique index 116
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_5_INDEX = 116;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_L_CARPAL_PROXIMAL_PHALANX_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_5</i>" has unique parent "<i>l_metacarpophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_5
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_5 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_5_PARENT = "l_metacarpophalangeal_5";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_proximal_phalanx_5</i>" has alias "<i>l_pinky_proximal</i>"
	 * @see #NAME_L_CARPAL_PROXIMAL_PHALANX_5 */
	public static final String NAME_L_CARPAL_PROXIMAL_PHALANX_5_ALIAS = "l_pinky_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_middle_phalanx_5"</i> (Java syntax) or <i>l_carpal_middle_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_5 = "l_carpal_middle_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_5</i>" has unique index 117
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_5 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_5_INDEX = 117;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_5 */
	public static final int NAME_L_CARPAL_MIDDLE_PHALANX_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_5</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_5
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_5_PARENT = "l_carpal_proximal_interphalangeal_5";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_middle_phalanx_5</i>" has alias "<i>l_pinky_middle</i>"
	 * @see #NAME_L_CARPAL_MIDDLE_PHALANX_5 */
	public static final String NAME_L_CARPAL_MIDDLE_PHALANX_5_ALIAS = "l_pinky_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"l_carpal_distal_phalanx_5"</i> (Java syntax) or <i>l_carpal_distal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_5 = "l_carpal_distal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has unique index 118
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_5_INDEX = 118;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_L_CARPAL_DISTAL_PHALANX_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has unique parent "<i>l_carpal_distal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5
	 * @see HAnimJointObject#NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_5_PARENT = "l_carpal_distal_interphalangeal_5";
	/** SFString segmentNameValues enumeration value "<i>l_carpal_distal_phalanx_5</i>" has alias "<i>l_pinky_distal</i>"
	 * @see #NAME_L_CARPAL_DISTAL_PHALANX_5 */
	public static final String NAME_L_CARPAL_DISTAL_PHALANX_5_ALIAS = "l_pinky_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_clavicle"</i> (Java syntax) or <i>r_clavicle</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Clavicle" target="_blank">https://en.wikipedia.org/wiki/Clavicle</a>  */
	public static final String NAME_R_CLAVICLE = "r_clavicle";
	/** SFString segmentNameValues enumeration value "<i>r_clavicle</i>" has unique index 119
	 * @see #NAME_R_CLAVICLE */
	public static final int NAME_R_CLAVICLE_INDEX = 119;
	/** SFString segmentNameValues enumeration value "<i>r_clavicle</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CLAVICLE */
	public static final int NAME_R_CLAVICLE_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_clavicle</i>" has unique parent "<i>r_sternoclavicular</i>" in HAnimJointObject
	 * @see #NAME_R_CLAVICLE
	 * @see HAnimJointObject#NAME_R_STERNOCLAVICULAR */
	public static final String NAME_R_CLAVICLE_PARENT = "r_sternoclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_scapula"</i> (Java syntax) or <i>r_scapula</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Scapula" target="_blank">https://en.wikipedia.org/wiki/Scapula</a>  */
	public static final String NAME_R_SCAPULA = "r_scapula";
	/** SFString segmentNameValues enumeration value "<i>r_scapula</i>" has unique index 120
	 * @see #NAME_R_SCAPULA */
	public static final int NAME_R_SCAPULA_INDEX = 120;
	/** SFString segmentNameValues enumeration value "<i>r_scapula</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_SCAPULA */
	public static final int NAME_R_SCAPULA_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_scapula</i>" has unique parent "<i>r_acromioclavicular</i>" in HAnimJointObject
	 * @see #NAME_R_SCAPULA
	 * @see HAnimJointObject#NAME_R_ACROMIOCLAVICULAR */
	public static final String NAME_R_SCAPULA_PARENT = "r_acromioclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_upperarm"</i> (Java syntax) or <i>r_upperarm</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Arm" target="_blank">https://en.wikipedia.org/wiki/Arm</a>  */
	public static final String NAME_R_UPPERARM = "r_upperarm";
	/** SFString segmentNameValues enumeration value "<i>r_upperarm</i>" has unique index 121
	 * @see #NAME_R_UPPERARM */
	public static final int NAME_R_UPPERARM_INDEX = 121;
	/** SFString segmentNameValues enumeration value "<i>r_upperarm</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_UPPERARM */
	public static final int NAME_R_UPPERARM_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_upperarm</i>" has unique parent "<i>r_shoulder</i>" in HAnimJointObject
	 * @see #NAME_R_UPPERARM
	 * @see HAnimJointObject#NAME_R_SHOULDER */
	public static final String NAME_R_UPPERARM_PARENT = "r_shoulder";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_forearm"</i> (Java syntax) or <i>r_forearm</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Forearm" target="_blank">https://en.wikipedia.org/wiki/Forearm</a>  */
	public static final String NAME_R_FOREARM = "r_forearm";
	/** SFString segmentNameValues enumeration value "<i>r_forearm</i>" has unique index 122
	 * @see #NAME_R_FOREARM */
	public static final int NAME_R_FOREARM_INDEX = 122;
	/** SFString segmentNameValues enumeration value "<i>r_forearm</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_FOREARM */
	public static final int NAME_R_FOREARM_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_forearm</i>" has unique parent "<i>r_elbow</i>" in HAnimJointObject
	 * @see #NAME_R_FOREARM
	 * @see HAnimJointObject#NAME_R_ELBOW */
	public static final String NAME_R_FOREARM_PARENT = "r_elbow";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal"</i> (Java syntax) or <i>r_carpal</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpal_bones" target="_blank">https://en.wikipedia.org/wiki/Carpal_bones</a>  */
	public static final String NAME_R_CARPAL = "r_carpal";
	/** SFString segmentNameValues enumeration value "<i>r_carpal</i>" has unique index 123
	 * @see #NAME_R_CARPAL */
	public static final int NAME_R_CARPAL_INDEX = 123;
	/** SFString segmentNameValues enumeration value "<i>r_carpal</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_CARPAL */
	public static final int NAME_R_CARPAL_LOA = 1;
	/** SFString segmentNameValues enumeration value "<i>r_carpal</i>" has unique parent "<i>r_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL
	 * @see HAnimJointObject#NAME_R_RADIOCARPAL */
	public static final String NAME_R_CARPAL_PARENT = "r_radiocarpal";
	/** SFString segmentNameValues enumeration value "<i>r_carpal</i>" has alias "<i>r_hand</i>"
	 * @see #NAME_R_CARPAL */
	public static final String NAME_R_CARPAL_ALIAS = "r_hand";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_trapezium"</i> (Java syntax) or <i>r_trapezium</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Trapezium_(bone)" target="_blank">https://en.wikipedia.org/wiki/Trapezium_(bone)</a>  */
	public static final String NAME_R_TRAPEZIUM = "r_trapezium";
	/** SFString segmentNameValues enumeration value "<i>r_trapezium</i>" has unique index 124
	 * @see #NAME_R_TRAPEZIUM */
	public static final int NAME_R_TRAPEZIUM_INDEX = 124;
	/** SFString segmentNameValues enumeration value "<i>r_trapezium</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TRAPEZIUM */
	public static final int NAME_R_TRAPEZIUM_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_trapezium</i>" has unique parent "<i>r_midcarpal_1</i>" in HAnimJointObject
	 * @see #NAME_R_TRAPEZIUM
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_1 */
	public static final String NAME_R_TRAPEZIUM_PARENT = "r_midcarpal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metacarpal_1"</i> (Java syntax) or <i>r_metacarpal_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_1 = "r_metacarpal_1";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_1</i>" has unique index 125
	 * @see #NAME_R_METACARPAL_1 */
	public static final int NAME_R_METACARPAL_1_INDEX = 125;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_1 */
	public static final int NAME_R_METACARPAL_1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_1</i>" has unique parent "<i>r_carpometacarpal_1</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPAL_1
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_1 */
	public static final String NAME_R_METACARPAL_1_PARENT = "r_carpometacarpal_1";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_1</i>" has alias "<i>r_thumb_metacarpal</i>"
	 * @see #NAME_R_METACARPAL_1 */
	public static final String NAME_R_METACARPAL_1_ALIAS = "r_thumb_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_proximal_phalanx_1"</i> (Java syntax) or <i>r_carpal_proximal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_1 = "r_carpal_proximal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_1</i>" has unique index 126
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_1_INDEX = 126;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_1 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_1</i>" has unique parent "<i>r_metacarpophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_1
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_1 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_1_PARENT = "r_metacarpophalangeal_1";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_1</i>" has alias "<i>r_thumb_proximal</i>"
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_1 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_1_ALIAS = "r_thumb_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_1"</i> (Java syntax) or <i>r_carpal_distal_phalanx_1</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_1 = "r_carpal_distal_phalanx_1";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has unique index 127
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_1_INDEX = 127;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_1_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has unique parent "<i>r_carpal_interphalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1
	 * @see HAnimJointObject#NAME_R_CARPAL_INTERPHALANGEAL_1 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_1_PARENT = "r_carpal_interphalangeal_1";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_1</i>" has alias "<i>r_thumb_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_1 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_1_ALIAS = "r_thumb_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_trapezoid"</i> (Java syntax) or <i>r_trapezoid</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Trapezoid_bone" target="_blank">https://en.wikipedia.org/wiki/Trapezoid_bone</a>  */
	public static final String NAME_R_TRAPEZOID = "r_trapezoid";
	/** SFString segmentNameValues enumeration value "<i>r_trapezoid</i>" has unique index 128
	 * @see #NAME_R_TRAPEZOID */
	public static final int NAME_R_TRAPEZOID_INDEX = 128;
	/** SFString segmentNameValues enumeration value "<i>r_trapezoid</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TRAPEZOID */
	public static final int NAME_R_TRAPEZOID_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_trapezoid</i>" has unique parent "<i>r_midcarpal_2</i>" in HAnimJointObject
	 * @see #NAME_R_TRAPEZOID
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_2 */
	public static final String NAME_R_TRAPEZOID_PARENT = "r_midcarpal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metacarpal_2"</i> (Java syntax) or <i>r_metacarpal_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_2 = "r_metacarpal_2";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_2</i>" has unique index 129
	 * @see #NAME_R_METACARPAL_2 */
	public static final int NAME_R_METACARPAL_2_INDEX = 129;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_2 */
	public static final int NAME_R_METACARPAL_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_2</i>" has unique parent "<i>r_carpometacarpal_2</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPAL_2
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_2 */
	public static final String NAME_R_METACARPAL_2_PARENT = "r_carpometacarpal_2";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_2</i>" has alias "<i>r_index_metacarpal</i>"
	 * @see #NAME_R_METACARPAL_2 */
	public static final String NAME_R_METACARPAL_2_ALIAS = "r_index_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_proximal_phalanx_2"</i> (Java syntax) or <i>r_carpal_proximal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_2 = "r_carpal_proximal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_2</i>" has unique index 130
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_2_INDEX = 130;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_2 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_2</i>" has unique parent "<i>r_metacarpophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_2
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_2 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_2_PARENT = "r_metacarpophalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_2</i>" has alias "<i>r_index_proximal</i>"
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_2 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_2_ALIAS = "r_index_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_middle_phalanx_2"</i> (Java syntax) or <i>r_carpal_middle_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_2 = "r_carpal_middle_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_2</i>" has unique index 131
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_2 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_2_INDEX = 131;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_2 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_2</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_2
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_2_PARENT = "r_carpal_proximal_interphalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_2</i>" has alias "<i>r_index_middle</i>"
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_2 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_2_ALIAS = "r_index_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_2"</i> (Java syntax) or <i>r_carpal_distal_phalanx_2</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_2 = "r_carpal_distal_phalanx_2";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has unique index 132
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_2_INDEX = 132;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_2_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has unique parent "<i>r_carpal_distal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2
	 * @see HAnimJointObject#NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_2_PARENT = "r_carpal_distal_interphalangeal_2";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_2</i>" has alias "<i>r_index_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_2 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_2_ALIAS = "r_index_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_capitate"</i> (Java syntax) or <i>r_capitate</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Capitate_bone" target="_blank">https://en.wikipedia.org/wiki/Capitate_bone</a>  */
	public static final String NAME_R_CAPITATE = "r_capitate";
	/** SFString segmentNameValues enumeration value "<i>r_capitate</i>" has unique index 133
	 * @see #NAME_R_CAPITATE */
	public static final int NAME_R_CAPITATE_INDEX = 133;
	/** SFString segmentNameValues enumeration value "<i>r_capitate</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CAPITATE */
	public static final int NAME_R_CAPITATE_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_capitate</i>" has unique parent "<i>r_midcarpal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CAPITATE
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_3 */
	public static final String NAME_R_CAPITATE_PARENT = "r_midcarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metacarpal_3"</i> (Java syntax) or <i>r_metacarpal_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_3 = "r_metacarpal_3";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_3</i>" has unique index 134
	 * @see #NAME_R_METACARPAL_3 */
	public static final int NAME_R_METACARPAL_3_INDEX = 134;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_3 */
	public static final int NAME_R_METACARPAL_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_3</i>" has unique parent "<i>r_carpometacarpal_3</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPAL_3
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_3 */
	public static final String NAME_R_METACARPAL_3_PARENT = "r_carpometacarpal_3";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_3</i>" has alias "<i>r_middle_metacarpal</i>"
	 * @see #NAME_R_METACARPAL_3 */
	public static final String NAME_R_METACARPAL_3_ALIAS = "r_middle_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_proximal_phalanx_3"</i> (Java syntax) or <i>r_carpal_proximal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_3 = "r_carpal_proximal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_3</i>" has unique index 135
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_3_INDEX = 135;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_3 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_3</i>" has unique parent "<i>r_metacarpophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_3
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_3 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_3_PARENT = "r_metacarpophalangeal_3";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_3</i>" has alias "<i>r_middle_proximal</i>"
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_3 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_3_ALIAS = "r_middle_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_middle_phalanx_3"</i> (Java syntax) or <i>r_carpal_middle_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_3 = "r_carpal_middle_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_3</i>" has unique index 136
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_3 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_3_INDEX = 136;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_3 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_3</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_3
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_3_PARENT = "r_carpal_proximal_interphalangeal_3";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_3</i>" has alias "<i>r_middle_middle</i>"
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_3 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_3_ALIAS = "r_middle_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_3"</i> (Java syntax) or <i>r_carpal_distal_phalanx_3</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_3 = "r_carpal_distal_phalanx_3";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has unique index 137
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_3_INDEX = 137;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_3_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has unique parent "<i>r_carpal_distal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3
	 * @see HAnimJointObject#NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_3_PARENT = "r_carpal_distal_interphalangeal_3";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_3</i>" has alias "<i>r_middle_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_3 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_3_ALIAS = "r_middle_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_hamate"</i> (Java syntax) or <i>r_hamate</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Hamate_bone" target="_blank">https://en.wikipedia.org/wiki/Hamate_bone</a>  */
	public static final String NAME_R_HAMATE = "r_hamate";
	/** SFString segmentNameValues enumeration value "<i>r_hamate</i>" has unique index 138
	 * @see #NAME_R_HAMATE */
	public static final int NAME_R_HAMATE_INDEX = 138;
	/** SFString segmentNameValues enumeration value "<i>r_hamate</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_HAMATE */
	public static final int NAME_R_HAMATE_LOA = 4;
	/** SFString segmentNameValues enumeration value "<i>r_hamate</i>" has unique parent "<i>r_midcarpal_4_5</i>" in HAnimJointObject
	 * @see #NAME_R_HAMATE
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_4_5 */
	public static final String NAME_R_HAMATE_PARENT = "r_midcarpal_4_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metacarpal_4"</i> (Java syntax) or <i>r_metacarpal_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_4 = "r_metacarpal_4";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_4</i>" has unique index 139
	 * @see #NAME_R_METACARPAL_4 */
	public static final int NAME_R_METACARPAL_4_INDEX = 139;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_4 */
	public static final int NAME_R_METACARPAL_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_4</i>" has unique parent "<i>r_carpometacarpal_4</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPAL_4
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_4 */
	public static final String NAME_R_METACARPAL_4_PARENT = "r_carpometacarpal_4";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_4</i>" has alias "<i>r_ring_metacarpal</i>"
	 * @see #NAME_R_METACARPAL_4 */
	public static final String NAME_R_METACARPAL_4_ALIAS = "r_ring_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_proximal_phalanx_4"</i> (Java syntax) or <i>r_carpal_proximal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_4 = "r_carpal_proximal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_4</i>" has unique index 140
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_4_INDEX = 140;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_4 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_4</i>" has unique parent "<i>r_metacarpophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_4
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_4 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_4_PARENT = "r_metacarpophalangeal_4";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_4</i>" has alias "<i>r_ring_proximal</i>"
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_4 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_4_ALIAS = "r_ring_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_middle_phalanx_4"</i> (Java syntax) or <i>r_carpal_middle_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_4 = "r_carpal_middle_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_4</i>" has unique index 141
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_4 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_4_INDEX = 141;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_4 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_4</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_4
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_4_PARENT = "r_carpal_proximal_interphalangeal_4";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_4</i>" has alias "<i>r_ring_middle</i>"
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_4 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_4_ALIAS = "r_ring_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_4"</i> (Java syntax) or <i>r_carpal_distal_phalanx_4</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_4 = "r_carpal_distal_phalanx_4";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has unique index 142
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_4_INDEX = 142;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_4_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has unique parent "<i>r_carpal_distal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4
	 * @see HAnimJointObject#NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_4_PARENT = "r_carpal_distal_interphalangeal_4";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_4</i>" has alias "<i>r_ring_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_4 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_4_ALIAS = "r_ring_distal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_metacarpal_5"</i> (Java syntax) or <i>r_metacarpal_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpal_bones" target="_blank">https://en.wikipedia.org/wiki/Metacarpal_bones</a>  */
	public static final String NAME_R_METACARPAL_5 = "r_metacarpal_5";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_5</i>" has unique index 143
	 * @see #NAME_R_METACARPAL_5 */
	public static final int NAME_R_METACARPAL_5_INDEX = 143;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPAL_5 */
	public static final int NAME_R_METACARPAL_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_5</i>" has unique parent "<i>r_carpometacarpal_5</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPAL_5
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_5 */
	public static final String NAME_R_METACARPAL_5_PARENT = "r_carpometacarpal_5";
	/** SFString segmentNameValues enumeration value "<i>r_metacarpal_5</i>" has alias "<i>r_pinky_metacarpal</i>"
	 * @see #NAME_R_METACARPAL_5 */
	public static final String NAME_R_METACARPAL_5_ALIAS = "r_pinky_metacarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_proximal_phalanx_5"</i> (Java syntax) or <i>r_carpal_proximal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_5 = "r_carpal_proximal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_5</i>" has unique index 144
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_5_INDEX = 144;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_5 */
	public static final int NAME_R_CARPAL_PROXIMAL_PHALANX_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_5</i>" has unique parent "<i>r_metacarpophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_5
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_5 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_5_PARENT = "r_metacarpophalangeal_5";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_proximal_phalanx_5</i>" has alias "<i>r_pinky_proximal</i>"
	 * @see #NAME_R_CARPAL_PROXIMAL_PHALANX_5 */
	public static final String NAME_R_CARPAL_PROXIMAL_PHALANX_5_ALIAS = "r_pinky_proximal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_middle_phalanx_5"</i> (Java syntax) or <i>r_carpal_middle_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_5 = "r_carpal_middle_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_5</i>" has unique index 145
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_5 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_5_INDEX = 145;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_5 */
	public static final int NAME_R_CARPAL_MIDDLE_PHALANX_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_5</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_5
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_5_PARENT = "r_carpal_proximal_interphalangeal_5";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_middle_phalanx_5</i>" has alias "<i>r_pinky_middle</i>"
	 * @see #NAME_R_CARPAL_MIDDLE_PHALANX_5 */
	public static final String NAME_R_CARPAL_MIDDLE_PHALANX_5_ALIAS = "r_pinky_middle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>segmentNameValues</i> can equal this value <i>"r_carpal_distal_phalanx_5"</i> (Java syntax) or <i>r_carpal_distal_phalanx_5</i> (XML syntax).
	 * @see #segmentNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Phalanx_bone" target="_blank">https://en.wikipedia.org/wiki/Phalanx_bone</a>  */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_5 = "r_carpal_distal_phalanx_5";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has unique index 146
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_5_INDEX = 146;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final int NAME_R_CARPAL_DISTAL_PHALANX_5_LOA = 2;
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has unique parent "<i>r_carpal_distal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5
	 * @see HAnimJointObject#NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_5_PARENT = "r_carpal_distal_interphalangeal_5";
	/** SFString segmentNameValues enumeration value "<i>r_carpal_distal_phalanx_5</i>" has alias "<i>r_pinky_distal</i>"
	 * @see #NAME_R_CARPAL_DISTAL_PHALANX_5 */
	public static final String NAME_R_CARPAL_DISTAL_PHALANX_5_ALIAS = "r_pinky_distal";

	// special enumeration utility methods

	/** Get index for this segmentName
	 * @param segmentName of interest
	 * @return index value, otherwise -1 if not found
	 */
	public static int getSegmentNameIndex(String segmentName)
	{
		if      (segmentName.equalsIgnoreCase(NAME_SACRUM)) return NAME_SACRUM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_PELVIS)) return NAME_PELVIS_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_THIGH)) return NAME_L_THIGH_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALF)) return NAME_L_CALF_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TALUS)) return NAME_L_TALUS_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_NAVICULAR)) return NAME_L_NAVICULAR_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_1)) return NAME_L_CUNEIFORM_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_1)) return NAME_L_METATARSAL_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_1)) return NAME_L_TARSAL_PROXIMAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_1)) return NAME_L_TARSAL_DISTAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_2)) return NAME_L_CUNEIFORM_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_2)) return NAME_L_METATARSAL_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_2)) return NAME_L_TARSAL_PROXIMAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_2)) return NAME_L_TARSAL_MIDDLE_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_3)) return NAME_L_CUNEIFORM_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_3)) return NAME_L_METATARSAL_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_3)) return NAME_L_TARSAL_PROXIMAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_3)) return NAME_L_TARSAL_MIDDLE_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_3)) return NAME_L_TARSAL_DISTAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALCANEUS)) return NAME_L_CALCANEUS_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUBOID)) return NAME_L_CUBOID_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_4)) return NAME_L_METATARSAL_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_4)) return NAME_L_TARSAL_PROXIMAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_4)) return NAME_L_TARSAL_MIDDLE_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_4)) return NAME_L_TARSAL_DISTAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_5)) return NAME_L_METATARSAL_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_5)) return NAME_L_TARSAL_PROXIMAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_5)) return NAME_L_TARSAL_MIDDLE_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_THIGH)) return NAME_R_THIGH_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALF)) return NAME_R_CALF_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TALUS)) return NAME_R_TALUS_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_NAVICULAR)) return NAME_R_NAVICULAR_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_1)) return NAME_R_CUNEIFORM_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_1)) return NAME_R_METATARSAL_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_1)) return NAME_R_TARSAL_PROXIMAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_1)) return NAME_R_TARSAL_DISTAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_2)) return NAME_R_CUNEIFORM_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_2)) return NAME_R_METATARSAL_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_2)) return NAME_R_TARSAL_PROXIMAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_2)) return NAME_R_TARSAL_MIDDLE_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_3)) return NAME_R_CUNEIFORM_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_3)) return NAME_R_METATARSAL_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_3)) return NAME_R_TARSAL_PROXIMAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_3)) return NAME_R_TARSAL_MIDDLE_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_3)) return NAME_R_TARSAL_DISTAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALCANEUS)) return NAME_R_CALCANEUS_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUBOID)) return NAME_R_CUBOID_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_4)) return NAME_R_METATARSAL_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_4)) return NAME_R_TARSAL_PROXIMAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_4)) return NAME_R_TARSAL_MIDDLE_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_4)) return NAME_R_TARSAL_DISTAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_5)) return NAME_R_METATARSAL_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_5)) return NAME_R_TARSAL_PROXIMAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_5)) return NAME_R_TARSAL_MIDDLE_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L5)) return NAME_L5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L4)) return NAME_L4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L3)) return NAME_L3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L2)) return NAME_L2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L1)) return NAME_L1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T12)) return NAME_T12_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T11)) return NAME_T11_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T10)) return NAME_T10_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T9)) return NAME_T9_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T8)) return NAME_T8_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T7)) return NAME_T7_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T6)) return NAME_T6_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T5)) return NAME_T5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T4)) return NAME_T4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T3)) return NAME_T3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T2)) return NAME_T2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_T1)) return NAME_T1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C7)) return NAME_C7_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C6)) return NAME_C6_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C5)) return NAME_C5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C4)) return NAME_C4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C3)) return NAME_C3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C2)) return NAME_C2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_C1)) return NAME_C1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_SKULL)) return NAME_SKULL_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYELID)) return NAME_L_EYELID_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYELID)) return NAME_R_EYELID_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYEBALL)) return NAME_L_EYEBALL_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYEBALL)) return NAME_R_EYEBALL_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYEBROW)) return NAME_L_EYEBROW_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYEBROW)) return NAME_R_EYEBROW_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_JAW)) return NAME_JAW_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_SCAPULA)) return NAME_L_SCAPULA_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_UPPERARM)) return NAME_L_UPPERARM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_FOREARM)) return NAME_L_FOREARM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL)) return NAME_L_CARPAL_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TRAPEZIUM)) return NAME_L_TRAPEZIUM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_1)) return NAME_L_METACARPAL_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_1)) return NAME_L_CARPAL_PROXIMAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_TRAPEZOID)) return NAME_L_TRAPEZOID_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_2)) return NAME_L_METACARPAL_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_2)) return NAME_L_CARPAL_PROXIMAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_2)) return NAME_L_CARPAL_MIDDLE_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CAPITATE)) return NAME_L_CAPITATE_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_3)) return NAME_L_METACARPAL_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_3)) return NAME_L_CARPAL_PROXIMAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_3)) return NAME_L_CARPAL_MIDDLE_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_HAMATE)) return NAME_L_HAMATE_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_4)) return NAME_L_METACARPAL_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_4)) return NAME_L_CARPAL_PROXIMAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_4)) return NAME_L_CARPAL_MIDDLE_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_5)) return NAME_L_METACARPAL_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_5)) return NAME_L_CARPAL_PROXIMAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_5)) return NAME_L_CARPAL_MIDDLE_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_SCAPULA)) return NAME_R_SCAPULA_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_UPPERARM)) return NAME_R_UPPERARM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_FOREARM)) return NAME_R_FOREARM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL)) return NAME_R_CARPAL_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TRAPEZIUM)) return NAME_R_TRAPEZIUM_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_1)) return NAME_R_METACARPAL_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_1)) return NAME_R_CARPAL_PROXIMAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_TRAPEZOID)) return NAME_R_TRAPEZOID_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_2)) return NAME_R_METACARPAL_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_2)) return NAME_R_CARPAL_PROXIMAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_2)) return NAME_R_CARPAL_MIDDLE_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CAPITATE)) return NAME_R_CAPITATE_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_3)) return NAME_R_METACARPAL_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_3)) return NAME_R_CARPAL_PROXIMAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_3)) return NAME_R_CARPAL_MIDDLE_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_HAMATE)) return NAME_R_HAMATE_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_4)) return NAME_R_METACARPAL_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_4)) return NAME_R_CARPAL_PROXIMAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_4)) return NAME_R_CARPAL_MIDDLE_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_5)) return NAME_R_METACARPAL_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_5)) return NAME_R_CARPAL_PROXIMAL_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_5)) return NAME_R_CARPAL_MIDDLE_PHALANX_5_INDEX;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_INDEX;
		else return -1; // not found
	}
	/** Whether an index exists for this segmentName
	 * @param segmentName of interest
	 * @return true if found
	 */
	public static boolean hasSegmentNameIndex(String segmentName)
	{
		return (getSegmentNameIndex(segmentName) > -1);
	}

	/** Get Level of Articulation (loa) for this segmentName
	 * @param segmentName of interest
	 * @return loa value, otherwise -1 if not found
	 */
	public static int getSegmentNameLoa(String segmentName)
	{
		if      (segmentName.equalsIgnoreCase(NAME_SACRUM)) return NAME_SACRUM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_PELVIS)) return NAME_PELVIS_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_THIGH)) return NAME_L_THIGH_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALF)) return NAME_L_CALF_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TALUS)) return NAME_L_TALUS_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_NAVICULAR)) return NAME_L_NAVICULAR_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_1)) return NAME_L_CUNEIFORM_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_1)) return NAME_L_METATARSAL_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_1)) return NAME_L_TARSAL_PROXIMAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_1)) return NAME_L_TARSAL_DISTAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_2)) return NAME_L_CUNEIFORM_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_2)) return NAME_L_METATARSAL_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_2)) return NAME_L_TARSAL_PROXIMAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_2)) return NAME_L_TARSAL_MIDDLE_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_3)) return NAME_L_CUNEIFORM_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_3)) return NAME_L_METATARSAL_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_3)) return NAME_L_TARSAL_PROXIMAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_3)) return NAME_L_TARSAL_MIDDLE_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_3)) return NAME_L_TARSAL_DISTAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALCANEUS)) return NAME_L_CALCANEUS_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUBOID)) return NAME_L_CUBOID_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_4)) return NAME_L_METATARSAL_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_4)) return NAME_L_TARSAL_PROXIMAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_4)) return NAME_L_TARSAL_MIDDLE_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_4)) return NAME_L_TARSAL_DISTAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_5)) return NAME_L_METATARSAL_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_5)) return NAME_L_TARSAL_PROXIMAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_5)) return NAME_L_TARSAL_MIDDLE_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_THIGH)) return NAME_R_THIGH_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALF)) return NAME_R_CALF_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TALUS)) return NAME_R_TALUS_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_NAVICULAR)) return NAME_R_NAVICULAR_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_1)) return NAME_R_CUNEIFORM_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_1)) return NAME_R_METATARSAL_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_1)) return NAME_R_TARSAL_PROXIMAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_1)) return NAME_R_TARSAL_DISTAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_2)) return NAME_R_CUNEIFORM_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_2)) return NAME_R_METATARSAL_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_2)) return NAME_R_TARSAL_PROXIMAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_2)) return NAME_R_TARSAL_MIDDLE_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_3)) return NAME_R_CUNEIFORM_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_3)) return NAME_R_METATARSAL_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_3)) return NAME_R_TARSAL_PROXIMAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_3)) return NAME_R_TARSAL_MIDDLE_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_3)) return NAME_R_TARSAL_DISTAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALCANEUS)) return NAME_R_CALCANEUS_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUBOID)) return NAME_R_CUBOID_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_4)) return NAME_R_METATARSAL_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_4)) return NAME_R_TARSAL_PROXIMAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_4)) return NAME_R_TARSAL_MIDDLE_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_4)) return NAME_R_TARSAL_DISTAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_5)) return NAME_R_METATARSAL_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_5)) return NAME_R_TARSAL_PROXIMAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_5)) return NAME_R_TARSAL_MIDDLE_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L5)) return NAME_L5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L4)) return NAME_L4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L3)) return NAME_L3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L2)) return NAME_L2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L1)) return NAME_L1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T12)) return NAME_T12_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T11)) return NAME_T11_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T10)) return NAME_T10_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T9)) return NAME_T9_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T8)) return NAME_T8_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T7)) return NAME_T7_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T6)) return NAME_T6_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T5)) return NAME_T5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T4)) return NAME_T4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T3)) return NAME_T3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T2)) return NAME_T2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_T1)) return NAME_T1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C7)) return NAME_C7_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C6)) return NAME_C6_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C5)) return NAME_C5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C4)) return NAME_C4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C3)) return NAME_C3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C2)) return NAME_C2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_C1)) return NAME_C1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_SKULL)) return NAME_SKULL_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYELID)) return NAME_L_EYELID_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYELID)) return NAME_R_EYELID_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYEBALL)) return NAME_L_EYEBALL_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYEBALL)) return NAME_R_EYEBALL_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYEBROW)) return NAME_L_EYEBROW_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYEBROW)) return NAME_R_EYEBROW_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_JAW)) return NAME_JAW_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_SCAPULA)) return NAME_L_SCAPULA_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_UPPERARM)) return NAME_L_UPPERARM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_FOREARM)) return NAME_L_FOREARM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL)) return NAME_L_CARPAL_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TRAPEZIUM)) return NAME_L_TRAPEZIUM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_1)) return NAME_L_METACARPAL_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_1)) return NAME_L_CARPAL_PROXIMAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_TRAPEZOID)) return NAME_L_TRAPEZOID_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_2)) return NAME_L_METACARPAL_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_2)) return NAME_L_CARPAL_PROXIMAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_2)) return NAME_L_CARPAL_MIDDLE_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CAPITATE)) return NAME_L_CAPITATE_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_3)) return NAME_L_METACARPAL_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_3)) return NAME_L_CARPAL_PROXIMAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_3)) return NAME_L_CARPAL_MIDDLE_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_HAMATE)) return NAME_L_HAMATE_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_4)) return NAME_L_METACARPAL_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_4)) return NAME_L_CARPAL_PROXIMAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_4)) return NAME_L_CARPAL_MIDDLE_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_5)) return NAME_L_METACARPAL_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_5)) return NAME_L_CARPAL_PROXIMAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_5)) return NAME_L_CARPAL_MIDDLE_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_SCAPULA)) return NAME_R_SCAPULA_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_UPPERARM)) return NAME_R_UPPERARM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_FOREARM)) return NAME_R_FOREARM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL)) return NAME_R_CARPAL_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TRAPEZIUM)) return NAME_R_TRAPEZIUM_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_1)) return NAME_R_METACARPAL_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_1)) return NAME_R_CARPAL_PROXIMAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_TRAPEZOID)) return NAME_R_TRAPEZOID_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_2)) return NAME_R_METACARPAL_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_2)) return NAME_R_CARPAL_PROXIMAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_2)) return NAME_R_CARPAL_MIDDLE_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CAPITATE)) return NAME_R_CAPITATE_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_3)) return NAME_R_METACARPAL_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_3)) return NAME_R_CARPAL_PROXIMAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_3)) return NAME_R_CARPAL_MIDDLE_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_HAMATE)) return NAME_R_HAMATE_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_4)) return NAME_R_METACARPAL_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_4)) return NAME_R_CARPAL_PROXIMAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_4)) return NAME_R_CARPAL_MIDDLE_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_5)) return NAME_R_METACARPAL_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_5)) return NAME_R_CARPAL_PROXIMAL_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_5)) return NAME_R_CARPAL_MIDDLE_PHALANX_5_LOA;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_LOA;
		else return -1; // not found
	}
	/** Whether an loa exists for this segmentName
	 * @param segmentName of interest
	 * @return true if found
	 */
	public static boolean hasSegmentNameLoa(String segmentName)
	{
		return (getSegmentNameLoa(segmentName) > -1);
	}

	/** Get alias for this segmentName
	 * @param segmentName of interest
	 * @return alias value, otherwise empty string if not found
	 */
	public static String getSegmentNameAlias(String segmentName)
	{
		if      (segmentName.equalsIgnoreCase(NAME_L_TALUS)) return NAME_L_TALUS_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_2)) return NAME_L_METATARSAL_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_2)) return NAME_L_TARSAL_PROXIMAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALCANEUS)) return NAME_L_CALCANEUS_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_TALUS)) return NAME_R_TALUS_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_2)) return NAME_R_METATARSAL_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_2)) return NAME_R_TARSAL_PROXIMAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALCANEUS)) return NAME_R_CALCANEUS_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_SKULL)) return NAME_SKULL_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL)) return NAME_L_CARPAL_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_1)) return NAME_L_METACARPAL_1_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_1)) return NAME_L_CARPAL_PROXIMAL_PHALANX_1_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_2)) return NAME_L_METACARPAL_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_2)) return NAME_L_CARPAL_PROXIMAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_2)) return NAME_L_CARPAL_MIDDLE_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_3)) return NAME_L_METACARPAL_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_3)) return NAME_L_CARPAL_PROXIMAL_PHALANX_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_3)) return NAME_L_CARPAL_MIDDLE_PHALANX_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_4)) return NAME_L_METACARPAL_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_4)) return NAME_L_CARPAL_PROXIMAL_PHALANX_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_4)) return NAME_L_CARPAL_MIDDLE_PHALANX_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_5)) return NAME_L_METACARPAL_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_5)) return NAME_L_CARPAL_PROXIMAL_PHALANX_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_5)) return NAME_L_CARPAL_MIDDLE_PHALANX_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL)) return NAME_R_CARPAL_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_1)) return NAME_R_METACARPAL_1_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_1)) return NAME_R_CARPAL_PROXIMAL_PHALANX_1_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_2)) return NAME_R_METACARPAL_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_2)) return NAME_R_CARPAL_PROXIMAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_2)) return NAME_R_CARPAL_MIDDLE_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_3)) return NAME_R_METACARPAL_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_3)) return NAME_R_CARPAL_PROXIMAL_PHALANX_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_3)) return NAME_R_CARPAL_MIDDLE_PHALANX_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_4)) return NAME_R_METACARPAL_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_4)) return NAME_R_CARPAL_PROXIMAL_PHALANX_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_4)) return NAME_R_CARPAL_MIDDLE_PHALANX_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_5)) return NAME_R_METACARPAL_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_5)) return NAME_R_CARPAL_PROXIMAL_PHALANX_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_5)) return NAME_R_CARPAL_MIDDLE_PHALANX_5_ALIAS;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_ALIAS;
		else return ""; // not found
	}
	/** Whether a alias exists for this segmentName
	 * @param segmentName of interest
	 * @return true if found
	 */
	public static boolean hasSegmentNameAlias(String segmentName)
	{
		return !getSegmentNameAlias(segmentName).isEmpty();
	}

	/** Get parent for this segmentName
	 * @param segmentName of interest
	 * @return parent value, otherwise empty string if not found
	 */
	public static String getParentSegmentName(String segmentName)
	{
		if      (segmentName.equalsIgnoreCase(NAME_SACRUM)) return NAME_SACRUM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_PELVIS)) return NAME_PELVIS_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_THIGH)) return NAME_L_THIGH_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALF)) return NAME_L_CALF_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TALUS)) return NAME_L_TALUS_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_NAVICULAR)) return NAME_L_NAVICULAR_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_1)) return NAME_L_CUNEIFORM_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_1)) return NAME_L_METATARSAL_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_1)) return NAME_L_TARSAL_PROXIMAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_1)) return NAME_L_TARSAL_DISTAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_2)) return NAME_L_CUNEIFORM_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_2)) return NAME_L_METATARSAL_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_2)) return NAME_L_TARSAL_PROXIMAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_2)) return NAME_L_TARSAL_MIDDLE_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_2)) return NAME_L_TARSAL_DISTAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUNEIFORM_3)) return NAME_L_CUNEIFORM_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_3)) return NAME_L_METATARSAL_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_3)) return NAME_L_TARSAL_PROXIMAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_3)) return NAME_L_TARSAL_MIDDLE_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_3)) return NAME_L_TARSAL_DISTAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CALCANEUS)) return NAME_L_CALCANEUS_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CUBOID)) return NAME_L_CUBOID_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_4)) return NAME_L_METATARSAL_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_4)) return NAME_L_TARSAL_PROXIMAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_4)) return NAME_L_TARSAL_MIDDLE_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_4)) return NAME_L_TARSAL_DISTAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METATARSAL_5)) return NAME_L_METATARSAL_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_PHALANX_5)) return NAME_L_TARSAL_PROXIMAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_MIDDLE_PHALANX_5)) return NAME_L_TARSAL_MIDDLE_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_PHALANX_5)) return NAME_L_TARSAL_DISTAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_THIGH)) return NAME_R_THIGH_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALF)) return NAME_R_CALF_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TALUS)) return NAME_R_TALUS_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_NAVICULAR)) return NAME_R_NAVICULAR_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_1)) return NAME_R_CUNEIFORM_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_1)) return NAME_R_METATARSAL_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_1)) return NAME_R_TARSAL_PROXIMAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_1)) return NAME_R_TARSAL_DISTAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_2)) return NAME_R_CUNEIFORM_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_2)) return NAME_R_METATARSAL_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_2)) return NAME_R_TARSAL_PROXIMAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_2)) return NAME_R_TARSAL_MIDDLE_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_2)) return NAME_R_TARSAL_DISTAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUNEIFORM_3)) return NAME_R_CUNEIFORM_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_3)) return NAME_R_METATARSAL_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_3)) return NAME_R_TARSAL_PROXIMAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_3)) return NAME_R_TARSAL_MIDDLE_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_3)) return NAME_R_TARSAL_DISTAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CALCANEUS)) return NAME_R_CALCANEUS_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CUBOID)) return NAME_R_CUBOID_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_4)) return NAME_R_METATARSAL_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_4)) return NAME_R_TARSAL_PROXIMAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_4)) return NAME_R_TARSAL_MIDDLE_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_4)) return NAME_R_TARSAL_DISTAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METATARSAL_5)) return NAME_R_METATARSAL_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_PHALANX_5)) return NAME_R_TARSAL_PROXIMAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_MIDDLE_PHALANX_5)) return NAME_R_TARSAL_MIDDLE_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_PHALANX_5)) return NAME_R_TARSAL_DISTAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L5)) return NAME_L5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L4)) return NAME_L4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L3)) return NAME_L3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L2)) return NAME_L2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L1)) return NAME_L1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T12)) return NAME_T12_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T11)) return NAME_T11_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T10)) return NAME_T10_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T9)) return NAME_T9_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T8)) return NAME_T8_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T7)) return NAME_T7_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T6)) return NAME_T6_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T5)) return NAME_T5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T4)) return NAME_T4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T3)) return NAME_T3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T2)) return NAME_T2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_T1)) return NAME_T1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C7)) return NAME_C7_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C6)) return NAME_C6_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C5)) return NAME_C5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C4)) return NAME_C4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C3)) return NAME_C3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C2)) return NAME_C2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_C1)) return NAME_C1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_SKULL)) return NAME_SKULL_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYELID)) return NAME_L_EYELID_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYELID)) return NAME_R_EYELID_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYEBALL)) return NAME_L_EYEBALL_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYEBALL)) return NAME_R_EYEBALL_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_EYEBROW)) return NAME_L_EYEBROW_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_EYEBROW)) return NAME_R_EYEBROW_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_JAW)) return NAME_JAW_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CLAVICLE)) return NAME_L_CLAVICLE_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_SCAPULA)) return NAME_L_SCAPULA_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_UPPERARM)) return NAME_L_UPPERARM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_FOREARM)) return NAME_L_FOREARM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL)) return NAME_L_CARPAL_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TRAPEZIUM)) return NAME_L_TRAPEZIUM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_1)) return NAME_L_METACARPAL_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_1)) return NAME_L_CARPAL_PROXIMAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_1)) return NAME_L_CARPAL_DISTAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_TRAPEZOID)) return NAME_L_TRAPEZOID_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_2)) return NAME_L_METACARPAL_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_2)) return NAME_L_CARPAL_PROXIMAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_2)) return NAME_L_CARPAL_MIDDLE_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_2)) return NAME_L_CARPAL_DISTAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CAPITATE)) return NAME_L_CAPITATE_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_3)) return NAME_L_METACARPAL_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_3)) return NAME_L_CARPAL_PROXIMAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_3)) return NAME_L_CARPAL_MIDDLE_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_3)) return NAME_L_CARPAL_DISTAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_HAMATE)) return NAME_L_HAMATE_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_4)) return NAME_L_METACARPAL_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_4)) return NAME_L_CARPAL_PROXIMAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_4)) return NAME_L_CARPAL_MIDDLE_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_4)) return NAME_L_CARPAL_DISTAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_METACARPAL_5)) return NAME_L_METACARPAL_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_PHALANX_5)) return NAME_L_CARPAL_PROXIMAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_MIDDLE_PHALANX_5)) return NAME_L_CARPAL_MIDDLE_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_PHALANX_5)) return NAME_L_CARPAL_DISTAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CLAVICLE)) return NAME_R_CLAVICLE_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_SCAPULA)) return NAME_R_SCAPULA_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_UPPERARM)) return NAME_R_UPPERARM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_FOREARM)) return NAME_R_FOREARM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL)) return NAME_R_CARPAL_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TRAPEZIUM)) return NAME_R_TRAPEZIUM_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_1)) return NAME_R_METACARPAL_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_1)) return NAME_R_CARPAL_PROXIMAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_1)) return NAME_R_CARPAL_DISTAL_PHALANX_1_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_TRAPEZOID)) return NAME_R_TRAPEZOID_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_2)) return NAME_R_METACARPAL_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_2)) return NAME_R_CARPAL_PROXIMAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_2)) return NAME_R_CARPAL_MIDDLE_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_2)) return NAME_R_CARPAL_DISTAL_PHALANX_2_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CAPITATE)) return NAME_R_CAPITATE_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_3)) return NAME_R_METACARPAL_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_3)) return NAME_R_CARPAL_PROXIMAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_3)) return NAME_R_CARPAL_MIDDLE_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_3)) return NAME_R_CARPAL_DISTAL_PHALANX_3_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_HAMATE)) return NAME_R_HAMATE_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_4)) return NAME_R_METACARPAL_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_4)) return NAME_R_CARPAL_PROXIMAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_4)) return NAME_R_CARPAL_MIDDLE_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_4)) return NAME_R_CARPAL_DISTAL_PHALANX_4_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_METACARPAL_5)) return NAME_R_METACARPAL_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_PHALANX_5)) return NAME_R_CARPAL_PROXIMAL_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_MIDDLE_PHALANX_5)) return NAME_R_CARPAL_MIDDLE_PHALANX_5_PARENT;
		else if (segmentName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_PHALANX_5)) return NAME_R_CARPAL_DISTAL_PHALANX_5_PARENT;
		else return ""; // not found
	}
	/** Whether a parent exists for this segmentName
	 * @param segmentName of interest
	 * @return true if found
	 */
	public static boolean hasParentMatchingName(String segmentName)
	{
		return !getParentSegmentName(segmentName).isEmpty();
	}

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>HAnimSegment</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "HAnimSegment";

	/** Provides name of this element: <i>HAnimSegment</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>HAnimSegment</i> element: <i>HAnim</i> */
	public static final String COMPONENT = "HAnim";

	/** Defines X3D component for the <i>HAnimSegment</i> element: <i>HAnim</i>
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

	/** SFVec3f field named <i>centerOfMass</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] CENTEROFMASS_DEFAULT_VALUE = {0f,0f,0f};

	/** SFNode field named <i>coord</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DCoordinateNode COORD_DEFAULT_VALUE = null;

	/** SFString field named <i>description</i> has default value equal to an empty string. */
	public static final String DESCRIPTION_DEFAULT_VALUE = "";

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFFloat field named <i>mass</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float MASS_DEFAULT_VALUE = 0f;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** MFFloat field named <i>momentsOfInertia</i> has default value <i>{0f,0f,0f,0f,0f,0f,0f,0f,0f}</i> (Java syntax) or <i>0 0 0 0 0 0 0 0 0</i> (XML syntax). */
	public static final ArrayList<Float> MOMENTSOFINERTIA_DEFAULT_VALUE = new ArrayList<>(Arrays.asList(0f,0f,0f,0f,0f,0f,0f,0f,0f));

	/** SFString field named <i>name</i> has default value equal to an empty string. */
	public static final String NAME_DEFAULT_VALUE = "";

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
			case "centerOfMass":
				result = "SFVec3f";
				break;
			case "children":
				result = "MFNode";
				break;
			case "coord":
				result = "SFNode";
				break;
			case "description":
				result = "SFString";
				break;
			case "displacers":
				result = "MFNode";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "mass":
				result = "SFFloat";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "momentsOfInertia":
				result = "MFFloat";
				break;
			case "name":
				result = "SFString";
				break;
			case "removeChildren":
				result = "MFNode";
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
			case "centerOfMass":
				result = "inputOutput";
				break;
			case "children":
				result = "inputOutput";
				break;
			case "coord":
				result = "inputOutput";
				break;
			case "description":
				result = "inputOutput";
				break;
			case "displacers":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "mass":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "momentsOfInertia":
				result = "inputOutput";
				break;
			case "name":
				result = "inputOutput";
				break;
			case "removeChildren":
				result = "inputOnly";
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
	public static final String containerField_DEFAULT_VALUE = "children"; // type containerFieldChoicesHAnimSegment
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

	/** fromField ROUTE name for SFVec3f field named <i>centerOfMass</i>. */
	public static final String fromField_CENTEROFMASS = "centerOfMass";

	/** toField ROUTE name for SFVec3f field named <i>centerOfMass</i>. */
	public static final String toField_CENTEROFMASS = "centerOfMass";

	/** fromField ROUTE name for MFNode field named <i>children</i>. */
	public static final String fromField_CHILDREN = "children";

	/** toField ROUTE name for MFNode field named <i>children</i>. */
	public static final String toField_CHILDREN = "children";

	/** fromField ROUTE name for SFNode field named <i>coord</i>. */
	public static final String fromField_COORD = "coord";

	/** toField ROUTE name for SFNode field named <i>coord</i>. */
	public static final String toField_COORD = "coord";

	/** fromField ROUTE name for SFString field named <i>description</i>. */
	public static final String fromField_DESCRIPTION = "description";

	/** toField ROUTE name for SFString field named <i>description</i>. */
	public static final String toField_DESCRIPTION = "description";

	/** fromField ROUTE name for MFNode field named <i>displacers</i>. */
	public static final String fromField_DISPLACERS = "displacers";

	/** toField ROUTE name for MFNode field named <i>displacers</i>. */
	public static final String toField_DISPLACERS = "displacers";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFFloat field named <i>mass</i>. */
	public static final String fromField_MASS = "mass";

	/** toField ROUTE name for SFFloat field named <i>mass</i>. */
	public static final String toField_MASS = "mass";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for MFFloat field named <i>momentsOfInertia</i>. */
	public static final String fromField_MOMENTSOFINERTIA = "momentsOfInertia";

	/** toField ROUTE name for MFFloat field named <i>momentsOfInertia</i>. */
	public static final String toField_MOMENTSOFINERTIA = "momentsOfInertia";

	/** fromField ROUTE name for SFString field named <i>name</i>. */
	public static final String fromField_NAME = "name";

	/** toField ROUTE name for SFString field named <i>name</i>. */
	public static final String toField_NAME = "name";

	/** toField ROUTE name for MFNode field named <i>removeChildren</i>. */
	public static final String toField_REMOVECHILDREN = "removeChildren";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for HAnimSegmentObject to initialize member variables with default values. */
	public HAnimSegmentObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "children" }; // type containerFieldChoicesHAnimSegment

		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		centerOfMass = CENTEROFMASS_DEFAULT_VALUE;
		children = new ArrayList<>();
		coord = null;              // clear out any prior node
		coordProtoInstance = null; // clear out any prior node
		description = DESCRIPTION_DEFAULT_VALUE;
		displacers = new ArrayList<>();
		IS = null; // clear out any prior node
		mass = MASS_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		momentsOfInertia = MOMENTSOFINERTIA_DEFAULT_VALUE;
		name = NAME_DEFAULT_VALUE;
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxCenter(SFVec3fObject newValue)
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

	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxCenter(double[] newArray)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxSize(SFVec3fObject newValue)
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

	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>centerOfMass</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Location within segment of center of mass.  * <br>

	 * @return value of centerOfMass field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getCenterOfMass()
	{
		return centerOfMass;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>centerOfMass</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Location within segment of center of mass.  * <br>

	 * @param newValue is new value for the centerOfMass field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setCenterOfMass(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment centerOfMass newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		centerOfMass = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f centerOfMass field, similar to {@link #setCenterOfMass(float[])}.
	 * @param newValue is new value for the centerOfMass field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setCenterOfMass(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCenterOfMass(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f centerOfMass field, similar to {@link #setCenterOfMass(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setCenterOfMass(float x, float y, float z)
	{
		setCenterOfMass(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setCenterOfMass(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setCenterOfMass(double x, double y, double z)
	{
		return setCenterOfMass(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setCenterOfMass(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setCenterOfMass(double[] newArray)
	{
		return setCenterOfMass(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of X3DChildNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>children</i>.
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
 *  <li> <i>Hint:</i> place any geometry for parent HAnimJoint within a child Transform having the same translation value as the parent HAnimJoint center value. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value for the children field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setChildren(X3DNode[] newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setChildren(ArrayList<X3DChildNode> newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimSegmentObject addChildren(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}

	/**
	 * Utility method to add single child element to contained list of existing children nodes (if any).
	 * @param newValue is new node value to be appended the children field.	 
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	*/
	public HAnimSegmentObject addChild(X3DChildNode newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimSegmentObject clearChildren()
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimSegmentObject addComments (String newComment)
	{
		if (newComment == null) return this;
		children.add(new CommentsBlock (newComment));
		return this;
	}
	/**
	 * Add comments as String[] array to children field
	 * @param newComments array of comments
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimSegmentObject addComments (String[] newComments)
	{
		if (newComments == null) return this;
		children.add(new CommentsBlock (newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to children field
	 * @param newCommentsBlock block of comments to add
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject addComments (CommentsBlock newCommentsBlock)
	{
		if (newCommentsBlock == null) return this;
		children.add(newCommentsBlock);
		return this;
	}
											/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>coord</i>.
	 * @see #getCoordProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] the coord field is used for HAnimSegment objects that have deformable meshes and shall contain coordinates referenced from the IndexedFaceSet for the paarent HAnimSegment object. The coordinates are given the same name as the HAnim Segment object, but with "_coords" appended to the name (e.g., "skull_coords").
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @return value of coord field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public X3DCoordinateNode getCoord()
	{
		return coord;
	}

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * @see #setCoord(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] the coord field is used for HAnimSegment objects that have deformable meshes and shall contain coordinates referenced from the IndexedFaceSet for the paarent HAnimSegment object. The coordinates are given the same name as the HAnim Segment object, but with "_coords" appended to the name (e.g., "skull_coords").
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @param newValue is new value for the coord field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setCoord(X3DCoordinateNode newValue)
	{
		// set-newValue-validity-checks #0
		coord = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) coord).setParentObject(this); // parentTest15
		}
		if (coordProtoInstance != null)
		{
			coordProtoInstance.setParentObject(null); // housekeeping, clear prior object
			coordProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of coord field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimSegmentObject clearCoord()
	{
		((X3DConcreteElement) coord).clearParentObject(); // remove references to facilitate Java memory management
		coord = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * @see #setCoord(X3DCoordinateNode)
	 * @param newValue is new value for the coord field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setCoord(ProtoInstanceObject newValue)
	{
		if (coordProtoInstance != null)
		{
			((X3DConcreteElement) coordProtoInstance).setParentObject(null); // parentTest15.5
	    }
		coordProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) coordProtoInstance).setParentObject(this); // parentTest15.6
            coordProtoInstance.setContainerField("coord");
	    }
		if (coord != null)
		{
			((X3DConcreteElement) coord).setParentObject(null); // housekeeping, clear prior object
			coord = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getCoordProtoInstance()
		{
			return coordProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>coord</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getCoord()
	 * @see #getCoordProtoInstance()
	 */
	public boolean hasCoord()
	{
		return (coord != null) || (coordProtoInstance != null);
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setDescription(String newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setDescription(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDescription(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of HAnimDisplacerObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>displacers</i>.
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getDisplacers()
	{
		final X3DNode[] valuesArray = new X3DNode[displacers.size()];
		int i = 0;
		for (X3DNode arrayElement : displacers) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode displacers field, similar to {@link #getDisplacers()}.
	 * @return value of displacers field
	 */
	public ArrayList<X3DNode> getDisplacersList()
	{
		return displacers;
	}

	/**
	 * Accessor method to assign HAnimDisplacerObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>displacers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimDisplacer] the displacers field stores HAnimDisplacer objects for a particular HAnimSegment object.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @param newValue is new value for the displacers field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setDisplacers(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearDisplacers(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearDisplacers(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				displacers.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode displacers field, similar to {@link #setDisplacers(X3DNode[])}.
	 * @param newValue is new value for the displacers field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setDisplacers(ArrayList<HAnimDisplacerObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearDisplacers(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearDisplacers(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setDisplacers(newArray);
        }
		for (HAnimDisplacerObject element : newValue)
		{
			displacers.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of displacers nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer and ProtoInstance.
	 * @param newValue is new value to be appended the displacers field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimSegmentObject addDisplacers(HAnimDisplacerObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		displacers.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for displacers field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimSegmentObject addDisplacers(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		displacers.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child displacers nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @param newValue is new value array to be appended the displacers field.
	 */
	@Override // or here2?
	public void addDisplacers(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				displacers.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("displacers");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child displacers node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimDisplacer.
	 * @param newValue is new node for the displacers field (restricted to HAnimDisplacer)
	 */
	@Override
	public void setDisplacers(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearDisplacers(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : displacers)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearDisplacers(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			displacers.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of displacers field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimSegmentObject clearDisplacers()
	{
		for (X3DNode element : displacers)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		displacers.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>displacers</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getDisplacers()
	 */
	public boolean hasDisplacers()
	{
		return (!displacers.isEmpty());
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setIS(ISObject newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimSegmentObject clearIS()
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
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Total mass of the segment, 0 if not available, defined in mass base units (default is kilograms).
 * <ul>
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @return value of mass field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float getMass()
	{
		return mass;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Total mass of the segment, 0 if not available, defined in mass base units (default is kilograms).
 * <ul>
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @param newValue is new value for the mass field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setMass(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment mass newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		mass = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat mass field, similar to {@link #setMass(float)}.
	 * @param newValue is new value for the mass field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setMass(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMass(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setMass(float)}.
	 * @param newValue is new value for field
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setMass(double newValue)
	{
		return setMass((float) newValue);
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimSegmentObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide array of Float results within allowed range of [0,infinity) from inputOutput MFFloat field named <i>momentsOfInertia</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  3x3 moments of inertia matrix. default: 0 0 0 0 0 0 0 0 0.  * <br>

	 * @return value of momentsOfInertia field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getMomentsOfInertia()
	{
		final float[] valuesArray = new float[momentsOfInertia.size()];
		int i = 0;
		for (Float arrayElement : momentsOfInertia) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat momentsOfInertia field, similar to {@link #getMomentsOfInertia()}.
	 * @return value of momentsOfInertia field
	 */
	public ArrayList<Float> getMomentsOfInertiaList()
	{
		return momentsOfInertia;
	}
	/**
	 * Utility method to get String value of MFFloat momentsOfInertia field, similar to {@link #getMomentsOfInertia()}.
	 * @return value of momentsOfInertia field
	 */
	public String getMomentsOfInertiaString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : momentsOfInertia) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to inputOutput MFFloat field named <i>momentsOfInertia</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  3x3 moments of inertia matrix. default: 0 0 0 0 0 0 0 0 0.  * <br>

	 * @param newValue is new value for the momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setMomentsOfInertia(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearMomentsOfInertia(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearMomentsOfInertia(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			momentsOfInertia.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat momentsOfInertia field, similar to {@link #setMomentsOfInertia(float[])}.
	 * @param newValue is new value for the momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setMomentsOfInertia(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearMomentsOfInertia(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMomentsOfInertia(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat momentsOfInertia field, similar to {@link #setMomentsOfInertia(float[])}.
	 * @param newValue is new value for the momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setMomentsOfInertia(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearMomentsOfInertia(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearMomentsOfInertia(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setMomentsOfInertia(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimSegmentObject clearMomentsOfInertia()
	{
		momentsOfInertia.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat momentsOfInertia field, similar to {@link #setMomentsOfInertia(float[])}.
	 * @param newValue is new value for the momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setMomentsOfInertia(int[] newValue)
	{
		if (newValue == null)		{
			clearMomentsOfInertia(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setMomentsOfInertia(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat momentsOfInertia field.
	 * @param newValue is new value to add to the momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject addMomentsOfInertia(float newValue)
	{
		momentsOfInertia.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat momentsOfInertia field.
	 * @param newValue is new value to add to the momentsOfInertia field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject addMomentsOfInertia(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		momentsOfInertia.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setMomentsOfInertia(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setMomentsOfInertia(double[] newArray)
	{
		return setMomentsOfInertia(new MFFloatObject(newArray));
	}
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
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #NAME_SACRUM SACRUM}, {@link #NAME_PELVIS PELVIS}, {@link #NAME_L_THIGH L_THIGH}, {@link #NAME_L_CALF L_CALF}, {@link #NAME_L_TALUS L_TALUS}, {@link #NAME_L_NAVICULAR L_NAVICULAR}, {@link #NAME_L_CUNEIFORM_1 L_CUNEIFORM_1}, {@link #NAME_L_METATARSAL_1 L_METATARSAL_1}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_1 L_TARSAL_PROXIMAL_PHALANX_1}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_1 L_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_L_CUNEIFORM_2 L_CUNEIFORM_2}, {@link #NAME_L_METATARSAL_2 L_METATARSAL_2}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_2 L_TARSAL_PROXIMAL_PHALANX_2}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_2 L_TARSAL_MIDDLE_PHALANX_2}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_2 L_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_L_CUNEIFORM_3 L_CUNEIFORM_3}, {@link #NAME_L_METATARSAL_3 L_METATARSAL_3}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_3 L_TARSAL_PROXIMAL_PHALANX_3}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_3 L_TARSAL_MIDDLE_PHALANX_3}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_3 L_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_L_CALCANEUS L_CALCANEUS}, {@link #NAME_L_CUBOID L_CUBOID}, {@link #NAME_L_METATARSAL_4 L_METATARSAL_4}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_4 L_TARSAL_PROXIMAL_PHALANX_4}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_4 L_TARSAL_MIDDLE_PHALANX_4}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_4 L_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_L_METATARSAL_5 L_METATARSAL_5}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_5 L_TARSAL_PROXIMAL_PHALANX_5}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_5 L_TARSAL_MIDDLE_PHALANX_5}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_5 L_TARSAL_DISTAL_PHALANX_5}, {@link #NAME_R_THIGH R_THIGH}, {@link #NAME_R_CALF R_CALF}, {@link #NAME_R_TALUS R_TALUS}, {@link #NAME_R_NAVICULAR R_NAVICULAR}, {@link #NAME_R_CUNEIFORM_1 R_CUNEIFORM_1}, {@link #NAME_R_METATARSAL_1 R_METATARSAL_1}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_1 R_TARSAL_PROXIMAL_PHALANX_1}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_1 R_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_R_CUNEIFORM_2 R_CUNEIFORM_2}, {@link #NAME_R_METATARSAL_2 R_METATARSAL_2}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_2 R_TARSAL_PROXIMAL_PHALANX_2}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_2 R_TARSAL_MIDDLE_PHALANX_2}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_2 R_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_R_CUNEIFORM_3 R_CUNEIFORM_3}, {@link #NAME_R_METATARSAL_3 R_METATARSAL_3}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_3 R_TARSAL_PROXIMAL_PHALANX_3}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_3 R_TARSAL_MIDDLE_PHALANX_3}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_3 R_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_R_CALCANEUS R_CALCANEUS}, {@link #NAME_R_CUBOID R_CUBOID}, {@link #NAME_R_METATARSAL_4 R_METATARSAL_4}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_4 R_TARSAL_PROXIMAL_PHALANX_4}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_4 R_TARSAL_MIDDLE_PHALANX_4}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_4 R_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_R_METATARSAL_5 R_METATARSAL_5}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_5 R_TARSAL_PROXIMAL_PHALANX_5}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_5 R_TARSAL_MIDDLE_PHALANX_5}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_5 R_TARSAL_DISTAL_PHALANX_5}, {@link #NAME_L5 L5}, {@link #NAME_L4 L4}, {@link #NAME_L3 L3}, {@link #NAME_L2 L2}, {@link #NAME_L1 L1}, {@link #NAME_T12 T12}, {@link #NAME_T11 T11}, {@link #NAME_T10 T10}, {@link #NAME_T9 T9}, {@link #NAME_T8 T8}, {@link #NAME_T7 T7}, {@link #NAME_T6 T6}, {@link #NAME_T5 T5}, {@link #NAME_T4 T4}, {@link #NAME_T3 T3}, {@link #NAME_T2 T2}, {@link #NAME_T1 T1}, {@link #NAME_C7 C7}, {@link #NAME_C6 C6}, {@link #NAME_C5 C5}, {@link #NAME_C4 C4}, {@link #NAME_C3 C3}, {@link #NAME_C2 C2}, {@link #NAME_C1 C1}, {@link #NAME_SKULL SKULL}, {@link #NAME_L_EYELID L_EYELID}, {@link #NAME_R_EYELID R_EYELID}, {@link #NAME_L_EYEBALL L_EYEBALL}, {@link #NAME_R_EYEBALL R_EYEBALL}, {@link #NAME_L_EYEBROW L_EYEBROW}, {@link #NAME_R_EYEBROW R_EYEBROW}, {@link #NAME_JAW JAW}, {@link #NAME_L_CLAVICLE L_CLAVICLE}, {@link #NAME_L_SCAPULA L_SCAPULA}, {@link #NAME_L_UPPERARM L_UPPERARM}, {@link #NAME_L_FOREARM L_FOREARM}, {@link #NAME_L_CARPAL L_CARPAL}, {@link #NAME_L_TRAPEZIUM L_TRAPEZIUM}, {@link #NAME_L_METACARPAL_1 L_METACARPAL_1}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_1 L_CARPAL_PROXIMAL_PHALANX_1}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_1 L_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_L_TRAPEZOID L_TRAPEZOID}, {@link #NAME_L_METACARPAL_2 L_METACARPAL_2}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_2 L_CARPAL_PROXIMAL_PHALANX_2}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_2 L_CARPAL_MIDDLE_PHALANX_2}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_2 L_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_L_CAPITATE L_CAPITATE}, {@link #NAME_L_METACARPAL_3 L_METACARPAL_3}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_3 L_CARPAL_PROXIMAL_PHALANX_3}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_3 L_CARPAL_MIDDLE_PHALANX_3}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_3 L_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_L_HAMATE L_HAMATE}, {@link #NAME_L_METACARPAL_4 L_METACARPAL_4}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_4 L_CARPAL_PROXIMAL_PHALANX_4}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_4 L_CARPAL_MIDDLE_PHALANX_4}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_4 L_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_L_METACARPAL_5 L_METACARPAL_5}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_5 L_CARPAL_PROXIMAL_PHALANX_5}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_5 L_CARPAL_MIDDLE_PHALANX_5}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_5 L_CARPAL_DISTAL_PHALANX_5}, {@link #NAME_R_CLAVICLE R_CLAVICLE}, {@link #NAME_R_SCAPULA R_SCAPULA}, {@link #NAME_R_UPPERARM R_UPPERARM}, {@link #NAME_R_FOREARM R_FOREARM}, {@link #NAME_R_CARPAL R_CARPAL}, {@link #NAME_R_TRAPEZIUM R_TRAPEZIUM}, {@link #NAME_R_METACARPAL_1 R_METACARPAL_1}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_1 R_CARPAL_PROXIMAL_PHALANX_1}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_1 R_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_R_TRAPEZOID R_TRAPEZOID}, {@link #NAME_R_METACARPAL_2 R_METACARPAL_2}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_2 R_CARPAL_PROXIMAL_PHALANX_2}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_2 R_CARPAL_MIDDLE_PHALANX_2}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_2 R_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_R_CAPITATE R_CAPITATE}, {@link #NAME_R_METACARPAL_3 R_METACARPAL_3}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_3 R_CARPAL_PROXIMAL_PHALANX_3}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_3 R_CARPAL_MIDDLE_PHALANX_3}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_3 R_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_R_HAMATE R_HAMATE}, {@link #NAME_R_METACARPAL_4 R_METACARPAL_4}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_4 R_CARPAL_PROXIMAL_PHALANX_4}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_4 R_CARPAL_MIDDLE_PHALANX_4}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_4 R_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_R_METACARPAL_5 R_METACARPAL_5}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_5 R_CARPAL_PROXIMAL_PHALANX_5}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_5 R_CARPAL_MIDDLE_PHALANX_5}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_5 R_CARPAL_DISTAL_PHALANX_5}.
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=)
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String enumeration value ("sacrum" | "pelvis" | "l_thigh" | "l_calf" | "l_talus" | "l_navicular" | "l_cuneiform_1" | "l_metatarsal_1" | "l_tarsal_proximal_phalanx_1" | "l_tarsal_distal_phalanx_1" | "l_cuneiform_2" | "l_metatarsal_2" | "l_tarsal_proximal_phalanx_2" | "l_tarsal_middle_phalanx_2" | "l_tarsal_distal_phalanx_2" | "l_cuneiform_3" | "l_metatarsal_3" | "l_tarsal_proximal_phalanx_3" | "l_tarsal_middle_phalanx_3" | "l_tarsal_distal_phalanx_3" | "l_calcaneus" | "l_cuboid" | "l_metatarsal_4" | "l_tarsal_proximal_phalanx_4" | "l_tarsal_middle_phalanx_4" | "l_tarsal_distal_phalanx_4" | "l_metatarsal_5" | "l_tarsal_proximal_phalanx_5" | "l_tarsal_middle_phalanx_5" | "l_tarsal_distal_phalanx_5" | "r_thigh" | "r_calf" | "r_talus" | "r_navicular" | "r_cuneiform_1" | "r_metatarsal_1" | "r_tarsal_proximal_phalanx_1" | "r_tarsal_distal_phalanx_1" | "r_cuneiform_2" | "r_metatarsal_2" | "r_tarsal_proximal_phalanx_2" | "r_tarsal_middle_phalanx_2" | "r_tarsal_distal_phalanx_2" | "r_cuneiform_3" | "r_metatarsal_3" | "r_tarsal_proximal_phalanx_3" | "r_tarsal_middle_phalanx_3" | "r_tarsal_distal_phalanx_3" | "r_calcaneus" | "r_cuboid" | "r_metatarsal_4" | "r_tarsal_proximal_phalanx_4" | "r_tarsal_middle_phalanx_4" | "r_tarsal_distal_phalanx_4" | "r_metatarsal_5" | "r_tarsal_proximal_phalanx_5" | "r_tarsal_middle_phalanx_5" | "r_tarsal_distal_phalanx_5" | "l5" | "l4" | "l3" | "l2" | "l1" | "t12" | "t11" | "t10" | "t9" | "t8" | "t7" | "t6" | "t5" | "t4" | "t3" | "t2" | "t1" | "c7" | "c6" | "c5" | "c4" | "c3" | "c2" | "c1" | "skull" | "l_eyelid" | "r_eyelid" | "l_eyeball" | "r_eyeball" | "l_eyebrow" | "r_eyebrow" | "jaw" | "l_clavicle" | "l_scapula" | "l_upperarm" | "l_forearm" | "l_carpal" | "l_trapezium" | "l_metacarpal_1" | "l_carpal_proximal_phalanx_1" | "l_carpal_distal_phalanx_1" | "l_trapezoid" | "l_metacarpal_2" | "l_carpal_proximal_phalanx_2" | "l_carpal_middle_phalanx_2" | "l_carpal_distal_phalanx_2" | "l_capitate" | "l_metacarpal_3" | "l_carpal_proximal_phalanx_3" | "l_carpal_middle_phalanx_3" | "l_carpal_distal_phalanx_3" | "l_hamate" | "l_metacarpal_4" | "l_carpal_proximal_phalanx_4" | "l_carpal_middle_phalanx_4" | "l_carpal_distal_phalanx_4" | "l_metacarpal_5" | "l_carpal_proximal_phalanx_5" | "l_carpal_middle_phalanx_5" | "l_carpal_distal_phalanx_5" | "r_clavicle" | "r_scapula" | "r_upperarm" | "r_forearm" | "r_carpal" | "r_trapezium" | "r_metacarpal_1" | "r_carpal_proximal_phalanx_1" | "r_carpal_distal_phalanx_1" | "r_trapezoid" | "r_metacarpal_2" | "r_carpal_proximal_phalanx_2" | "r_carpal_middle_phalanx_2" | "r_carpal_distal_phalanx_2" | "r_capitate" | "r_metacarpal_3" | "r_carpal_proximal_phalanx_3" | "r_carpal_middle_phalanx_3" | "r_carpal_distal_phalanx_3" | "r_hamate" | "r_metacarpal_4" | "r_carpal_proximal_phalanx_4" | "r_carpal_middle_phalanx_4" | "r_carpal_distal_phalanx_4" | "r_metacarpal_5" | "r_carpal_proximal_phalanx_5" | "r_carpal_middle_phalanx_5" | "r_carpal_distal_phalanx_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #NAME_SACRUM SACRUM}, {@link #NAME_PELVIS PELVIS}, {@link #NAME_L_THIGH L_THIGH}, {@link #NAME_L_CALF L_CALF}, {@link #NAME_L_TALUS L_TALUS}, {@link #NAME_L_NAVICULAR L_NAVICULAR}, {@link #NAME_L_CUNEIFORM_1 L_CUNEIFORM_1}, {@link #NAME_L_METATARSAL_1 L_METATARSAL_1}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_1 L_TARSAL_PROXIMAL_PHALANX_1}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_1 L_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_L_CUNEIFORM_2 L_CUNEIFORM_2}, {@link #NAME_L_METATARSAL_2 L_METATARSAL_2}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_2 L_TARSAL_PROXIMAL_PHALANX_2}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_2 L_TARSAL_MIDDLE_PHALANX_2}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_2 L_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_L_CUNEIFORM_3 L_CUNEIFORM_3}, {@link #NAME_L_METATARSAL_3 L_METATARSAL_3}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_3 L_TARSAL_PROXIMAL_PHALANX_3}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_3 L_TARSAL_MIDDLE_PHALANX_3}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_3 L_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_L_CALCANEUS L_CALCANEUS}, {@link #NAME_L_CUBOID L_CUBOID}, {@link #NAME_L_METATARSAL_4 L_METATARSAL_4}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_4 L_TARSAL_PROXIMAL_PHALANX_4}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_4 L_TARSAL_MIDDLE_PHALANX_4}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_4 L_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_L_METATARSAL_5 L_METATARSAL_5}, {@link #NAME_L_TARSAL_PROXIMAL_PHALANX_5 L_TARSAL_PROXIMAL_PHALANX_5}, {@link #NAME_L_TARSAL_MIDDLE_PHALANX_5 L_TARSAL_MIDDLE_PHALANX_5}, {@link #NAME_L_TARSAL_DISTAL_PHALANX_5 L_TARSAL_DISTAL_PHALANX_5}, {@link #NAME_R_THIGH R_THIGH}, {@link #NAME_R_CALF R_CALF}, {@link #NAME_R_TALUS R_TALUS}, {@link #NAME_R_NAVICULAR R_NAVICULAR}, {@link #NAME_R_CUNEIFORM_1 R_CUNEIFORM_1}, {@link #NAME_R_METATARSAL_1 R_METATARSAL_1}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_1 R_TARSAL_PROXIMAL_PHALANX_1}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_1 R_TARSAL_DISTAL_PHALANX_1}, {@link #NAME_R_CUNEIFORM_2 R_CUNEIFORM_2}, {@link #NAME_R_METATARSAL_2 R_METATARSAL_2}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_2 R_TARSAL_PROXIMAL_PHALANX_2}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_2 R_TARSAL_MIDDLE_PHALANX_2}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_2 R_TARSAL_DISTAL_PHALANX_2}, {@link #NAME_R_CUNEIFORM_3 R_CUNEIFORM_3}, {@link #NAME_R_METATARSAL_3 R_METATARSAL_3}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_3 R_TARSAL_PROXIMAL_PHALANX_3}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_3 R_TARSAL_MIDDLE_PHALANX_3}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_3 R_TARSAL_DISTAL_PHALANX_3}, {@link #NAME_R_CALCANEUS R_CALCANEUS}, {@link #NAME_R_CUBOID R_CUBOID}, {@link #NAME_R_METATARSAL_4 R_METATARSAL_4}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_4 R_TARSAL_PROXIMAL_PHALANX_4}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_4 R_TARSAL_MIDDLE_PHALANX_4}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_4 R_TARSAL_DISTAL_PHALANX_4}, {@link #NAME_R_METATARSAL_5 R_METATARSAL_5}, {@link #NAME_R_TARSAL_PROXIMAL_PHALANX_5 R_TARSAL_PROXIMAL_PHALANX_5}, {@link #NAME_R_TARSAL_MIDDLE_PHALANX_5 R_TARSAL_MIDDLE_PHALANX_5}, {@link #NAME_R_TARSAL_DISTAL_PHALANX_5 R_TARSAL_DISTAL_PHALANX_5}, {@link #NAME_L5 L5}, {@link #NAME_L4 L4}, {@link #NAME_L3 L3}, {@link #NAME_L2 L2}, {@link #NAME_L1 L1}, {@link #NAME_T12 T12}, {@link #NAME_T11 T11}, {@link #NAME_T10 T10}, {@link #NAME_T9 T9}, {@link #NAME_T8 T8}, {@link #NAME_T7 T7}, {@link #NAME_T6 T6}, {@link #NAME_T5 T5}, {@link #NAME_T4 T4}, {@link #NAME_T3 T3}, {@link #NAME_T2 T2}, {@link #NAME_T1 T1}, {@link #NAME_C7 C7}, {@link #NAME_C6 C6}, {@link #NAME_C5 C5}, {@link #NAME_C4 C4}, {@link #NAME_C3 C3}, {@link #NAME_C2 C2}, {@link #NAME_C1 C1}, {@link #NAME_SKULL SKULL}, {@link #NAME_L_EYELID L_EYELID}, {@link #NAME_R_EYELID R_EYELID}, {@link #NAME_L_EYEBALL L_EYEBALL}, {@link #NAME_R_EYEBALL R_EYEBALL}, {@link #NAME_L_EYEBROW L_EYEBROW}, {@link #NAME_R_EYEBROW R_EYEBROW}, {@link #NAME_JAW JAW}, {@link #NAME_L_CLAVICLE L_CLAVICLE}, {@link #NAME_L_SCAPULA L_SCAPULA}, {@link #NAME_L_UPPERARM L_UPPERARM}, {@link #NAME_L_FOREARM L_FOREARM}, {@link #NAME_L_CARPAL L_CARPAL}, {@link #NAME_L_TRAPEZIUM L_TRAPEZIUM}, {@link #NAME_L_METACARPAL_1 L_METACARPAL_1}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_1 L_CARPAL_PROXIMAL_PHALANX_1}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_1 L_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_L_TRAPEZOID L_TRAPEZOID}, {@link #NAME_L_METACARPAL_2 L_METACARPAL_2}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_2 L_CARPAL_PROXIMAL_PHALANX_2}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_2 L_CARPAL_MIDDLE_PHALANX_2}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_2 L_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_L_CAPITATE L_CAPITATE}, {@link #NAME_L_METACARPAL_3 L_METACARPAL_3}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_3 L_CARPAL_PROXIMAL_PHALANX_3}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_3 L_CARPAL_MIDDLE_PHALANX_3}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_3 L_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_L_HAMATE L_HAMATE}, {@link #NAME_L_METACARPAL_4 L_METACARPAL_4}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_4 L_CARPAL_PROXIMAL_PHALANX_4}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_4 L_CARPAL_MIDDLE_PHALANX_4}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_4 L_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_L_METACARPAL_5 L_METACARPAL_5}, {@link #NAME_L_CARPAL_PROXIMAL_PHALANX_5 L_CARPAL_PROXIMAL_PHALANX_5}, {@link #NAME_L_CARPAL_MIDDLE_PHALANX_5 L_CARPAL_MIDDLE_PHALANX_5}, {@link #NAME_L_CARPAL_DISTAL_PHALANX_5 L_CARPAL_DISTAL_PHALANX_5}, {@link #NAME_R_CLAVICLE R_CLAVICLE}, {@link #NAME_R_SCAPULA R_SCAPULA}, {@link #NAME_R_UPPERARM R_UPPERARM}, {@link #NAME_R_FOREARM R_FOREARM}, {@link #NAME_R_CARPAL R_CARPAL}, {@link #NAME_R_TRAPEZIUM R_TRAPEZIUM}, {@link #NAME_R_METACARPAL_1 R_METACARPAL_1}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_1 R_CARPAL_PROXIMAL_PHALANX_1}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_1 R_CARPAL_DISTAL_PHALANX_1}, {@link #NAME_R_TRAPEZOID R_TRAPEZOID}, {@link #NAME_R_METACARPAL_2 R_METACARPAL_2}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_2 R_CARPAL_PROXIMAL_PHALANX_2}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_2 R_CARPAL_MIDDLE_PHALANX_2}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_2 R_CARPAL_DISTAL_PHALANX_2}, {@link #NAME_R_CAPITATE R_CAPITATE}, {@link #NAME_R_METACARPAL_3 R_METACARPAL_3}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_3 R_CARPAL_PROXIMAL_PHALANX_3}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_3 R_CARPAL_MIDDLE_PHALANX_3}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_3 R_CARPAL_DISTAL_PHALANX_3}, {@link #NAME_R_HAMATE R_HAMATE}, {@link #NAME_R_METACARPAL_4 R_METACARPAL_4}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_4 R_CARPAL_PROXIMAL_PHALANX_4}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_4 R_CARPAL_MIDDLE_PHALANX_4}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_4 R_CARPAL_DISTAL_PHALANX_4}, {@link #NAME_R_METACARPAL_5 R_METACARPAL_5}, {@link #NAME_R_CARPAL_PROXIMAL_PHALANX_5 R_CARPAL_PROXIMAL_PHALANX_5}, {@link #NAME_R_CARPAL_MIDDLE_PHALANX_5 R_CARPAL_MIDDLE_PHALANX_5}, {@link #NAME_R_CARPAL_DISTAL_PHALANX_5 R_CARPAL_DISTAL_PHALANX_5}).
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSegmentObject setName(String newValue)
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
				namingMessage += "Warning: HAnim name values are lower case, check capitalization/spelling of HAnimSegment name='" + newValue + "'";
		}
		if (!(
			newValue.isEmpty() ||
			newValue.equals(NAME_SACRUM) ||
			newValue.equals(NAME_PELVIS) ||
			newValue.equals(NAME_L_THIGH) ||
			newValue.equals(NAME_L_CALF) ||
			newValue.equals(NAME_L_TALUS) ||
			newValue.equals(NAME_L_NAVICULAR) ||
			newValue.equals(NAME_L_CUNEIFORM_1) ||
			newValue.equals(NAME_L_METATARSAL_1) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_PHALANX_1) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_L_CUNEIFORM_2) ||
			newValue.equals(NAME_L_METATARSAL_2) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_PHALANX_2) ||
			newValue.equals(NAME_L_TARSAL_MIDDLE_PHALANX_2) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_L_CUNEIFORM_3) ||
			newValue.equals(NAME_L_METATARSAL_3) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_PHALANX_3) ||
			newValue.equals(NAME_L_TARSAL_MIDDLE_PHALANX_3) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_L_CALCANEUS) ||
			newValue.equals(NAME_L_CUBOID) ||
			newValue.equals(NAME_L_METATARSAL_4) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_PHALANX_4) ||
			newValue.equals(NAME_L_TARSAL_MIDDLE_PHALANX_4) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_L_METATARSAL_5) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_PHALANX_5) ||
			newValue.equals(NAME_L_TARSAL_MIDDLE_PHALANX_5) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_PHALANX_5) ||
			newValue.equals(NAME_R_THIGH) ||
			newValue.equals(NAME_R_CALF) ||
			newValue.equals(NAME_R_TALUS) ||
			newValue.equals(NAME_R_NAVICULAR) ||
			newValue.equals(NAME_R_CUNEIFORM_1) ||
			newValue.equals(NAME_R_METATARSAL_1) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_PHALANX_1) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_R_CUNEIFORM_2) ||
			newValue.equals(NAME_R_METATARSAL_2) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_PHALANX_2) ||
			newValue.equals(NAME_R_TARSAL_MIDDLE_PHALANX_2) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_R_CUNEIFORM_3) ||
			newValue.equals(NAME_R_METATARSAL_3) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_PHALANX_3) ||
			newValue.equals(NAME_R_TARSAL_MIDDLE_PHALANX_3) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_R_CALCANEUS) ||
			newValue.equals(NAME_R_CUBOID) ||
			newValue.equals(NAME_R_METATARSAL_4) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_PHALANX_4) ||
			newValue.equals(NAME_R_TARSAL_MIDDLE_PHALANX_4) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_R_METATARSAL_5) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_PHALANX_5) ||
			newValue.equals(NAME_R_TARSAL_MIDDLE_PHALANX_5) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_PHALANX_5) ||
			newValue.equals(NAME_L5) ||
			newValue.equals(NAME_L4) ||
			newValue.equals(NAME_L3) ||
			newValue.equals(NAME_L2) ||
			newValue.equals(NAME_L1) ||
			newValue.equals(NAME_T12) ||
			newValue.equals(NAME_T11) ||
			newValue.equals(NAME_T10) ||
			newValue.equals(NAME_T9) ||
			newValue.equals(NAME_T8) ||
			newValue.equals(NAME_T7) ||
			newValue.equals(NAME_T6) ||
			newValue.equals(NAME_T5) ||
			newValue.equals(NAME_T4) ||
			newValue.equals(NAME_T3) ||
			newValue.equals(NAME_T2) ||
			newValue.equals(NAME_T1) ||
			newValue.equals(NAME_C7) ||
			newValue.equals(NAME_C6) ||
			newValue.equals(NAME_C5) ||
			newValue.equals(NAME_C4) ||
			newValue.equals(NAME_C3) ||
			newValue.equals(NAME_C2) ||
			newValue.equals(NAME_C1) ||
			newValue.equals(NAME_SKULL) ||
			newValue.equals(NAME_L_EYELID) ||
			newValue.equals(NAME_R_EYELID) ||
			newValue.equals(NAME_L_EYEBALL) ||
			newValue.equals(NAME_R_EYEBALL) ||
			newValue.equals(NAME_L_EYEBROW) ||
			newValue.equals(NAME_R_EYEBROW) ||
			newValue.equals(NAME_JAW) ||
			newValue.equals(NAME_L_CLAVICLE) ||
			newValue.equals(NAME_L_SCAPULA) ||
			newValue.equals(NAME_L_UPPERARM) ||
			newValue.equals(NAME_L_FOREARM) ||
			newValue.equals(NAME_L_CARPAL) ||
			newValue.equals(NAME_L_TRAPEZIUM) ||
			newValue.equals(NAME_L_METACARPAL_1) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_PHALANX_1) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_L_TRAPEZOID) ||
			newValue.equals(NAME_L_METACARPAL_2) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_PHALANX_2) ||
			newValue.equals(NAME_L_CARPAL_MIDDLE_PHALANX_2) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_L_CAPITATE) ||
			newValue.equals(NAME_L_METACARPAL_3) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_PHALANX_3) ||
			newValue.equals(NAME_L_CARPAL_MIDDLE_PHALANX_3) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_L_HAMATE) ||
			newValue.equals(NAME_L_METACARPAL_4) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_PHALANX_4) ||
			newValue.equals(NAME_L_CARPAL_MIDDLE_PHALANX_4) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_L_METACARPAL_5) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_PHALANX_5) ||
			newValue.equals(NAME_L_CARPAL_MIDDLE_PHALANX_5) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_PHALANX_5) ||
			newValue.equals(NAME_R_CLAVICLE) ||
			newValue.equals(NAME_R_SCAPULA) ||
			newValue.equals(NAME_R_UPPERARM) ||
			newValue.equals(NAME_R_FOREARM) ||
			newValue.equals(NAME_R_CARPAL) ||
			newValue.equals(NAME_R_TRAPEZIUM) ||
			newValue.equals(NAME_R_METACARPAL_1) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_PHALANX_1) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_1) ||
			newValue.equals(NAME_R_TRAPEZOID) ||
			newValue.equals(NAME_R_METACARPAL_2) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_PHALANX_2) ||
			newValue.equals(NAME_R_CARPAL_MIDDLE_PHALANX_2) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_2) ||
			newValue.equals(NAME_R_CAPITATE) ||
			newValue.equals(NAME_R_METACARPAL_3) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_PHALANX_3) ||
			newValue.equals(NAME_R_CARPAL_MIDDLE_PHALANX_3) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_3) ||
			newValue.equals(NAME_R_HAMATE) ||
			newValue.equals(NAME_R_METACARPAL_4) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_PHALANX_4) ||
			newValue.equals(NAME_R_CARPAL_MIDDLE_PHALANX_4) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_4) ||
			newValue.equals(NAME_R_METACARPAL_5) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_PHALANX_5) ||
			newValue.equals(NAME_R_CARPAL_MIDDLE_PHALANX_5) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_PHALANX_5)))
		{
			String warningMessage = "Warning: HAnimSegment name newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
			if (!namingMessage.trim().isEmpty())              System.out.println(namingMessage);
		}
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimSegment name
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("HAnimSegment name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
			return this;
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimSegmentObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setVisible(SFBoolObject newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSegmentObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimSegment DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment DEF newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setDEF(SFStringObject newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSegmentObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimSegment USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimSegment USE newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setUSE(SFStringObject newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimSegmentObject setCssClass(String newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setCssClass(SFStringObject newValue)
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
	 * @return {@link HAnimSegmentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimSegmentObject setUSE(HAnimSegmentObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on HAnimSegmentObject" +
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
	public HAnimSegmentObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Utility constructor that assigns both DEF label and name, after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 * @param newName  name for this meta element
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimSegmentObject">X3D Tooltips: HAnimSegmentObject</a>
	 */
	public HAnimSegmentObject (String DEFlabel, String newName)
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
		boolean      hasChild = (IS != null) || (!children.isEmpty()) || (coord != null) || (coordProtoInstance != null) || (!displacers.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null);

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<HAnimSegment"); // start opening tag
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
			if ((!Arrays.equals(getCenterOfMass(), CENTEROFMASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" centerOfMass='").append(SFVec3fObject.toString(getCenterOfMass())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if ((!getDescription().equals(DESCRIPTION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" description='").append(new SFStringObject(getDescription()).toStringX3D()).append("'");
			}
			if (((getMass() != MASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" mass='").append(SFFloatObject.toString(getMass())).append("'");
			}
			if (((getMomentsOfInertia().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" momentsOfInertia='").append(MFFloatObject.toString(getMomentsOfInertia())).append("'");
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
			if      (coord != null)
			{
				stringX3D.append(((X3DConcreteElement)coord).toStringX3D(indentLevel + indentIncrement));
			}
			else if (coordProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)coordProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : displacers)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</HAnimSegment>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=HAnimSegment, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (!children.isEmpty()) || (coord != null) || (coordProtoInstance != null) || (!displacers.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null);
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
			stringClassicVRML.append("HAnimSegment").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("centerOfMass"))
						{
							stringClassicVRML.append(indentCharacter).append("centerOfMass").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getCenterOfMass(), CENTEROFMASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("centerOfMass ").append(SFVec3fObject.toString(getCenterOfMass())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("mass"))
						{
							stringClassicVRML.append(indentCharacter).append("mass").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMass() != MASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("mass ").append(SFFloatObject.toString(getMass())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("momentsOfInertia"))
						{
							stringClassicVRML.append(indentCharacter).append("momentsOfInertia").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMomentsOfInertia().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("momentsOfInertia ").append("[ ").append(MFFloatObject.toString(getMomentsOfInertia())).append(" ]").append("\n").append(indent).append(indentCharacter);
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

			if (coord != null)
			{
				stringClassicVRML.append(indentCharacter).append("coord").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) coord).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (coordProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("coord").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) coordProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (displacers.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("displacers").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : displacers)
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
		if (coord != null)
		{
			referenceElement = ((X3DConcreteElement) coord).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (coordProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) coordProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		for (X3DNode element : displacers) // MFNode
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
		if (coord != null)
		{
			referenceNode = ((X3DConcreteElement) coord).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (coordProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) coordProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		for (X3DNode element : displacers) // MFNode
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
        
		setCenterOfMass(getCenterOfMass()); // exercise field checks, simple types
        
		setDescription(getDescription()); // exercise field checks, simple types
        
		setMass(getMass()); // exercise field checks, simple types
        
		setMomentsOfInertia(getMomentsOfInertia()); // exercise field checks, simple types
        
		if (getName().isEmpty() && !isUSE()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " name field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setName(getName()); // exercise field checks, simple types
        
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
			String errorNotice = "HAnimSegment USE='" + getUSE() + "' is not allowed to have contained MFNode children";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		if (coord != null)
		{
			setCoord(getCoord());
			((X3DConcreteElement) coord).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) coord).getValidationResult());
		}
		if (coordProtoInstance != null)
		{
			setCoord(getCoordProtoInstance());
			((X3DConcreteElement) coordProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) coordProtoInstance).getValidationResult());
		}
		if ((coord != null) && (coordProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both coord and coordProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasCoord()) // test USE restrictions
		{
			String errorNotice = "HAnimSegment USE='" + getUSE() + "' is not allowed to have contained SFNode coord";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		for (X3DNode element : displacers) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setDisplacers(getDisplacers()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasDisplacers()) // test USE restrictions
		{
			String errorNotice = "HAnimSegment USE='" + getUSE() + "' is not allowed to have contained MFNode displacers";
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
			String errorNotice = "HAnimSegment USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
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
			String errorNotice = "HAnimSegment USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
         // test for correct parent
         X3DConcreteElement parent = getParentObject();
         if (hasParentObject())
         {
             if      (parent.getElementName().equals(HAnimSegmentObject.NAME))
             {
                 // now test for correct parent-child LOA4 relationship pair
                 if (!hasParentMatchingName(((HAnimJointObject)parent).getName()))
                 {
                     String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE +
                         ": illegal parent name found: '" + ((HAnimSegmentObject)parent).getName() + "' instead of TODO" ;
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
					"' for parent X3D model containing 'HAnimSegment' node, add head statement <component name='HAnim' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"HAnim\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
