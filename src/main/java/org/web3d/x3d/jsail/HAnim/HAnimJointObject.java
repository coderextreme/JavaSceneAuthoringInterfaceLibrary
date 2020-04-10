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
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimJoint" target="blank">X3D Abstract Specification: HAnimJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimJoint" target="_blank">X3D Tooltips: HAnimJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class HAnimJointObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.HAnim.HAnimJoint
{
	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=center, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=center, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] center; // SFVec3f

 /* @name=children, @type=MFNode, $javaType=ArrayList<X3DNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DNode>, $normalizedMemberObjectName=children, $isX3dStatement=false, @acceptableNodeTypes=HAnimJoint|HAnimSegment|HAnimSite */ 
	private ArrayList<X3DNode> children = new ArrayList<>(); // MFNode acceptable node types: HAnimJoint|HAnimSegment|HAnimSite or ProtoInstanceObject

 /* @name=description, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=description, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String description; // SFString

 /* @name=displacers, @type=MFNode, $javaType=ArrayList<HAnimDisplacerObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimDisplacerObject>, $normalizedMemberObjectName=displacers, $isX3dStatement=false, @acceptableNodeTypes=HAnimDisplacer */ 
	private ArrayList<X3DNode> displacers = new ArrayList<>(); // MFNode acceptable node types: HAnimDisplacer or ProtoInstanceObject

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=limitOrientation, @type=SFRotation, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=limitOrientation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] limitOrientation; // SFRotation

 /* @name=llimit, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=llimit, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] llimit; // SFVec3f

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

 /* @name=skinCoordIndex, @type=MFInt32, $javaType=ArrayList<Integer>, $javaReferenceType=Integer, $javaPrimitiveType=ArrayList<Integer>, $normalizedMemberObjectName=skinCoordIndex, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Integer> skinCoordIndex = new ArrayList<>(); // MFInt32

 /* @name=skinCoordWeight, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=skinCoordWeight, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> skinCoordWeight = new ArrayList<>(); // MFFloat

 /* @name=stiffness, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=stiffness, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] stiffness; // SFVec3f

 /* @name=translation, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=translation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] translation; // SFVec3f

 /* @name=ulimit, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=ulimit, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] ulimit; // SFVec3f

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "humanoid_root", "sacroiliac", "l_hip", "l_knee", "l_talocrural", "l_talocalcaneonavicular", "l_cuneonavicular_1", "l_tarsometatarsal_1", "l_metatarsophalangeal_1", "l_tarsal_interphalangeal_1", "l_cuneonavicular_2", "l_tarsometatarsal_2", "l_metatarsophalangeal_2", "l_tarsal_proximal_interphalangeal_2", "l_tarsal_distal_interphalangeal_2", "l_cuneonavicular_3", "l_tarsometatarsal_3", "l_metatarsophalangeal_3", "l_tarsal_proximal_interphalangeal_3", "l_tarsal_distal_interphalangeal_3", "l_calcaneocuboid", "l_transversetarsal", "l_tarsometatarsal_4", "l_metatarsophalangeal_4", "l_tarsal_proximal_interphalangeal_4", "l_tarsal_distal_interphalangeal_4", "l_tarsometatarsal_5", "l_metatarsophalangeal_5", "l_tarsal_proximal_interphalangeal_5", "l_tarsal_distal_interphalangeal_5", "r_hip", "r_knee", "r_talocrural", "r_talocalcaneonavicular", "r_cuneonavicular_1", "r_tarsometatarsal_1", "r_metatarsophalangeal_1", "r_tarsal_interphalangeal_1", "r_cuneonavicular_2", "r_tarsometatarsal_2", "r_metatarsophalangeal_2", "r_tarsal_proximal_interphalangeal_2", "r_tarsal_distal_interphalangeal_2", "r_cuneonavicular_3", "r_tarsometatarsal_3", "r_metatarsophalangeal_3", "r_tarsal_proximal_interphalangeal_3", "r_tarsal_distal_interphalangeal_3", "r_calcaneocuboid", "r_transversetarsal", "r_tarsometatarsal_4", "r_metatarsophalangeal_4", "r_tarsal_proximal_interphalangeal_4", "r_tarsal_distal_interphalangeal_4", "r_tarsometatarsal_5", "r_metatarsophalangeal_5", "r_tarsal_proximal_interphalangeal_5", "r_tarsal_distal_interphalangeal_5", "vl5", "vl4", "vl3", "vl2", "vl1", "vt12", "vt11", "vt10", "vt9", "vt8", "vt7", "vt6", "vt5", "vt4", "vt3", "vt2", "vt1", "vc7", "vc6", "vc5", "vc4", "vc3", "vc2", "vc1", "skullbase", "l_eyelid_joint", "r_eyelid_joint", "l_eyeball_joint", "r_eyeball_joint", "l_eyebrow_joint", "r_eyebrow_joint", "temporomandibular", "l_sternoclavicular", "l_acromioclavicular", "l_shoulder", "l_elbow", "l_radiocarpal", "l_midcarpal_1", "l_carpometacarpal_1", "l_metacarpophalangeal_1", "l_carpal_interphalangeal_1", "l_midcarpal_2", "l_carpometacarpal_2", "l_metacarpophalangeal_2", "l_carpal_proximal_interphalangeal_2", "l_carpal_distal_interphalangeal_2", "l_midcarpal_3", "l_carpometacarpal_3", "l_metacarpophalangeal_3", "l_carpal_proximal_interphalangeal_3", "l_carpal_distal_interphalangeal_3", "l_midcarpal_4_5", "l_carpometacarpal_4", "l_metacarpophalangeal_4", "l_carpal_proximal_interphalangeal_4", "l_carpal_distal_interphalangeal_4", "l_carpometacarpal_5", "l_metacarpophalangeal_5", "l_carpal_proximal_interphalangeal_5", "l_carpal_distal_interphalangeal_5", "r_sternoclavicular", "r_acromioclavicular", "r_shoulder", "r_elbow", "r_radiocarpal", "r_midcarpal_1", "r_carpometacarpal_1", "r_metacarpophalangeal_1", "r_carpal_interphalangeal_1", "r_midcarpal_2", "r_carpometacarpal_2", "r_metacarpophalangeal_2", "r_carpal_proximal_interphalangeal_2", "r_carpal_distal_interphalangeal_2", "r_midcarpal_3", "r_carpometacarpal_3", "r_metacarpophalangeal_3", "r_carpal_proximal_interphalangeal_3", "r_carpal_distal_interphalangeal_3", "r_midcarpal_4_5", "r_carpometacarpal_4", "r_metacarpophalangeal_4", "r_carpal_proximal_interphalangeal_4", "r_carpal_distal_interphalangeal_4", "r_carpometacarpal_5", "r_metacarpophalangeal_5", "r_carpal_proximal_interphalangeal_5", "r_carpal_distal_interphalangeal_5".
<br ><br >
	 * CAESAR joint names for identification of HAnimJoint nodes as defined in the HAnim Architecture specification. Alternate names are also allowed.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/concepts.html#Hierarchy" target="_blank">https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/concepts.html#Hierarchy</a> 
	*/
	public static final ArrayList<String> jointNameValues = new ArrayList<>(Arrays.<String>asList("humanoid_root", "sacroiliac", "l_hip", "l_knee", "l_talocrural", "l_talocalcaneonavicular", "l_cuneonavicular_1", "l_tarsometatarsal_1", "l_metatarsophalangeal_1", "l_tarsal_interphalangeal_1", "l_cuneonavicular_2", "l_tarsometatarsal_2", "l_metatarsophalangeal_2", "l_tarsal_proximal_interphalangeal_2", "l_tarsal_distal_interphalangeal_2", "l_cuneonavicular_3", "l_tarsometatarsal_3", "l_metatarsophalangeal_3", "l_tarsal_proximal_interphalangeal_3", "l_tarsal_distal_interphalangeal_3", "l_calcaneocuboid", "l_transversetarsal", "l_tarsometatarsal_4", "l_metatarsophalangeal_4", "l_tarsal_proximal_interphalangeal_4", "l_tarsal_distal_interphalangeal_4", "l_tarsometatarsal_5", "l_metatarsophalangeal_5", "l_tarsal_proximal_interphalangeal_5", "l_tarsal_distal_interphalangeal_5", "r_hip", "r_knee", "r_talocrural", "r_talocalcaneonavicular", "r_cuneonavicular_1", "r_tarsometatarsal_1", "r_metatarsophalangeal_1", "r_tarsal_interphalangeal_1", "r_cuneonavicular_2", "r_tarsometatarsal_2", "r_metatarsophalangeal_2", "r_tarsal_proximal_interphalangeal_2", "r_tarsal_distal_interphalangeal_2", "r_cuneonavicular_3", "r_tarsometatarsal_3", "r_metatarsophalangeal_3", "r_tarsal_proximal_interphalangeal_3", "r_tarsal_distal_interphalangeal_3", "r_calcaneocuboid", "r_transversetarsal", "r_tarsometatarsal_4", "r_metatarsophalangeal_4", "r_tarsal_proximal_interphalangeal_4", "r_tarsal_distal_interphalangeal_4", "r_tarsometatarsal_5", "r_metatarsophalangeal_5", "r_tarsal_proximal_interphalangeal_5", "r_tarsal_distal_interphalangeal_5", "vl5", "vl4", "vl3", "vl2", "vl1", "vt12", "vt11", "vt10", "vt9", "vt8", "vt7", "vt6", "vt5", "vt4", "vt3", "vt2", "vt1", "vc7", "vc6", "vc5", "vc4", "vc3", "vc2", "vc1", "skullbase", "l_eyelid_joint", "r_eyelid_joint", "l_eyeball_joint", "r_eyeball_joint", "l_eyebrow_joint", "r_eyebrow_joint", "temporomandibular", "l_sternoclavicular", "l_acromioclavicular", "l_shoulder", "l_elbow", "l_radiocarpal", "l_midcarpal_1", "l_carpometacarpal_1", "l_metacarpophalangeal_1", "l_carpal_interphalangeal_1", "l_midcarpal_2", "l_carpometacarpal_2", "l_metacarpophalangeal_2", "l_carpal_proximal_interphalangeal_2", "l_carpal_distal_interphalangeal_2", "l_midcarpal_3", "l_carpometacarpal_3", "l_metacarpophalangeal_3", "l_carpal_proximal_interphalangeal_3", "l_carpal_distal_interphalangeal_3", "l_midcarpal_4_5", "l_carpometacarpal_4", "l_metacarpophalangeal_4", "l_carpal_proximal_interphalangeal_4", "l_carpal_distal_interphalangeal_4", "l_carpometacarpal_5", "l_metacarpophalangeal_5", "l_carpal_proximal_interphalangeal_5", "l_carpal_distal_interphalangeal_5", "r_sternoclavicular", "r_acromioclavicular", "r_shoulder", "r_elbow", "r_radiocarpal", "r_midcarpal_1", "r_carpometacarpal_1", "r_metacarpophalangeal_1", "r_carpal_interphalangeal_1", "r_midcarpal_2", "r_carpometacarpal_2", "r_metacarpophalangeal_2", "r_carpal_proximal_interphalangeal_2", "r_carpal_distal_interphalangeal_2", "r_midcarpal_3", "r_carpometacarpal_3", "r_metacarpophalangeal_3", "r_carpal_proximal_interphalangeal_3", "r_carpal_distal_interphalangeal_3", "r_midcarpal_4_5", "r_carpometacarpal_4", "r_metacarpophalangeal_4", "r_carpal_proximal_interphalangeal_4", "r_carpal_distal_interphalangeal_4", "r_carpometacarpal_5", "r_metacarpophalangeal_5", "r_carpal_proximal_interphalangeal_5", "r_carpal_distal_interphalangeal_5"));

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"humanoid_root"</i> (Java syntax) or <i>humanoid_root</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Outline_of_human_anatomy#Joints" target="_blank">https://en.wikipedia.org/wiki/Outline_of_human_anatomy#Joints</a>  */
	public static final String NAME_HUMANOID_ROOT = "humanoid_root";
	/** SFString jointNameValues enumeration value "<i>humanoid_root</i>" has unique index 1
	 * @see #NAME_HUMANOID_ROOT */
	public static final int NAME_HUMANOID_ROOT_INDEX = 1;
	/** SFString jointNameValues enumeration value "<i>humanoid_root</i>" has unique Level Of Articulation loa=0
	 * @see #NAME_HUMANOID_ROOT */
	public static final int NAME_HUMANOID_ROOT_LOA = 0;

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"sacroiliac"</i> (Java syntax) or <i>sacroiliac</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Sacroiliac_joint" target="_blank">https://en.wikipedia.org/wiki/Sacroiliac_joint</a>  */
	public static final String NAME_SACROILIAC = "sacroiliac";
	/** SFString jointNameValues enumeration value "<i>sacroiliac</i>" has unique index 2
	 * @see #NAME_SACROILIAC */
	public static final int NAME_SACROILIAC_INDEX = 2;
	/** SFString jointNameValues enumeration value "<i>sacroiliac</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_SACROILIAC */
	public static final int NAME_SACROILIAC_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>sacroiliac</i>" has unique parent "<i>humanoid_root</i>" in HAnimJointObject
	 * @see #NAME_SACROILIAC
	 * @see HAnimJointObject#NAME_HUMANOID_ROOT */
	public static final String NAME_SACROILIAC_PARENT = "humanoid_root";
	/** SFString jointNameValues enumeration value "<i>sacroiliac</i>" has alias "<i>SIJ</i>"
	 * @see #NAME_SACROILIAC */
	public static final String NAME_SACROILIAC_ALIAS = "SIJ";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_hip"</i> (Java syntax) or <i>l_hip</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Hip" target="_blank">https://en.wikipedia.org/wiki/Hip</a>  */
	public static final String NAME_L_HIP = "l_hip";
	/** SFString jointNameValues enumeration value "<i>l_hip</i>" has unique index 3
	 * @see #NAME_L_HIP */
	public static final int NAME_L_HIP_INDEX = 3;
	/** SFString jointNameValues enumeration value "<i>l_hip</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_HIP */
	public static final int NAME_L_HIP_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_hip</i>" has unique parent "<i>sacroiliac</i>" in HAnimJointObject
	 * @see #NAME_L_HIP
	 * @see HAnimJointObject#NAME_SACROILIAC */
	public static final String NAME_L_HIP_PARENT = "sacroiliac";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_knee"</i> (Java syntax) or <i>l_knee</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Knee" target="_blank">https://en.wikipedia.org/wiki/Knee</a>  */
	public static final String NAME_L_KNEE = "l_knee";
	/** SFString jointNameValues enumeration value "<i>l_knee</i>" has unique index 4
	 * @see #NAME_L_KNEE */
	public static final int NAME_L_KNEE_INDEX = 4;
	/** SFString jointNameValues enumeration value "<i>l_knee</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_KNEE */
	public static final int NAME_L_KNEE_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_knee</i>" has unique parent "<i>l_hip</i>" in HAnimJointObject
	 * @see #NAME_L_KNEE
	 * @see HAnimJointObject#NAME_L_HIP */
	public static final String NAME_L_KNEE_PARENT = "l_hip";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_talocrural"</i> (Java syntax) or <i>l_talocrural</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Ankle" target="_blank">https://en.wikipedia.org/wiki/Ankle</a>  */
	public static final String NAME_L_TALOCRURAL = "l_talocrural";
	/** SFString jointNameValues enumeration value "<i>l_talocrural</i>" has unique index 5
	 * @see #NAME_L_TALOCRURAL */
	public static final int NAME_L_TALOCRURAL_INDEX = 5;
	/** SFString jointNameValues enumeration value "<i>l_talocrural</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_TALOCRURAL */
	public static final int NAME_L_TALOCRURAL_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_talocrural</i>" has unique parent "<i>l_knee</i>" in HAnimJointObject
	 * @see #NAME_L_TALOCRURAL
	 * @see HAnimJointObject#NAME_L_KNEE */
	public static final String NAME_L_TALOCRURAL_PARENT = "l_knee";
	/** SFString jointNameValues enumeration value "<i>l_talocrural</i>" has alias "<i>l_ankle</i>"
	 * @see #NAME_L_TALOCRURAL */
	public static final String NAME_L_TALOCRURAL_ALIAS = "l_ankle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_talocalcaneonavicular"</i> (Java syntax) or <i>l_talocalcaneonavicular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Subtalar_joint" target="_blank">https://en.wikipedia.org/wiki/Subtalar_joint</a>  */
	public static final String NAME_L_TALOCALCANEONAVICULAR = "l_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>l_talocalcaneonavicular</i>" has unique index 6
	 * @see #NAME_L_TALOCALCANEONAVICULAR */
	public static final int NAME_L_TALOCALCANEONAVICULAR_INDEX = 6;
	/** SFString jointNameValues enumeration value "<i>l_talocalcaneonavicular</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TALOCALCANEONAVICULAR */
	public static final int NAME_L_TALOCALCANEONAVICULAR_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_talocalcaneonavicular</i>" has unique parent "<i>l_talocrural</i>" in HAnimJointObject
	 * @see #NAME_L_TALOCALCANEONAVICULAR
	 * @see HAnimJointObject#NAME_L_TALOCRURAL */
	public static final String NAME_L_TALOCALCANEONAVICULAR_PARENT = "l_talocrural";
	/** SFString jointNameValues enumeration value "<i>l_talocalcaneonavicular</i>" has alias "<i>l_talocalcaneal</i>"
	 * @see #NAME_L_TALOCALCANEONAVICULAR */
	public static final String NAME_L_TALOCALCANEONAVICULAR_ALIAS = "l_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_cuneonavicular_1"</i> (Java syntax) or <i>l_cuneonavicular_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneonavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Cuneonavicular_joint</a>  */
	public static final String NAME_L_CUNEONAVICULAR_1 = "l_cuneonavicular_1";
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_1</i>" has unique index 7
	 * @see #NAME_L_CUNEONAVICULAR_1 */
	public static final int NAME_L_CUNEONAVICULAR_1_INDEX = 7;
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUNEONAVICULAR_1 */
	public static final int NAME_L_CUNEONAVICULAR_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_1</i>" has unique parent "<i>l_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_L_CUNEONAVICULAR_1
	 * @see HAnimJointObject#NAME_L_TALOCALCANEONAVICULAR */
	public static final String NAME_L_CUNEONAVICULAR_1_PARENT = "l_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_1</i>" has alias "<i>l_talocalcaneal</i>"
	 * @see #NAME_L_CUNEONAVICULAR_1 */
	public static final String NAME_L_CUNEONAVICULAR_1_ALIAS = "l_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsometatarsal_1"</i> (Java syntax) or <i>l_tarsometatarsal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_L_TARSOMETATARSAL_1 = "l_tarsometatarsal_1";
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_1</i>" has unique index 8
	 * @see #NAME_L_TARSOMETATARSAL_1 */
	public static final int NAME_L_TARSOMETATARSAL_1_INDEX = 8;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSOMETATARSAL_1 */
	public static final int NAME_L_TARSOMETATARSAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_1</i>" has unique parent "<i>l_cuneonavicular_1</i>" in HAnimJointObject
	 * @see #NAME_L_TARSOMETATARSAL_1
	 * @see HAnimJointObject#NAME_L_CUNEONAVICULAR_1 */
	public static final String NAME_L_TARSOMETATARSAL_1_PARENT = "l_cuneonavicular_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metatarsophalangeal_1"</i> (Java syntax) or <i>l_metatarsophalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_L_METATARSOPHALANGEAL_1 = "l_metatarsophalangeal_1";
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_1</i>" has unique index 9
	 * @see #NAME_L_METATARSOPHALANGEAL_1 */
	public static final int NAME_L_METATARSOPHALANGEAL_1_INDEX = 9;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSOPHALANGEAL_1 */
	public static final int NAME_L_METATARSOPHALANGEAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_1</i>" has unique parent "<i>l_tarsometatarsal_1</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSOPHALANGEAL_1
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_1 */
	public static final String NAME_L_METATARSOPHALANGEAL_1_PARENT = "l_tarsometatarsal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_interphalangeal_1"</i> (Java syntax) or <i>l_tarsal_interphalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_INTERPHALANGEAL_1 = "l_tarsal_interphalangeal_1";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_interphalangeal_1</i>" has unique index 10
	 * @see #NAME_L_TARSAL_INTERPHALANGEAL_1 */
	public static final int NAME_L_TARSAL_INTERPHALANGEAL_1_INDEX = 10;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_interphalangeal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_INTERPHALANGEAL_1 */
	public static final int NAME_L_TARSAL_INTERPHALANGEAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_interphalangeal_1</i>" has unique parent "<i>l_metatarsophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_INTERPHALANGEAL_1
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_1 */
	public static final String NAME_L_TARSAL_INTERPHALANGEAL_1_PARENT = "l_metatarsophalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_cuneonavicular_2"</i> (Java syntax) or <i>l_cuneonavicular_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneonavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Cuneonavicular_joint</a>  */
	public static final String NAME_L_CUNEONAVICULAR_2 = "l_cuneonavicular_2";
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_2</i>" has unique index 11
	 * @see #NAME_L_CUNEONAVICULAR_2 */
	public static final int NAME_L_CUNEONAVICULAR_2_INDEX = 11;
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUNEONAVICULAR_2 */
	public static final int NAME_L_CUNEONAVICULAR_2_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_2</i>" has unique parent "<i>l_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_L_CUNEONAVICULAR_2
	 * @see HAnimJointObject#NAME_L_TALOCALCANEONAVICULAR */
	public static final String NAME_L_CUNEONAVICULAR_2_PARENT = "l_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_2</i>" has alias "<i>l_talocalcaneal</i>"
	 * @see #NAME_L_CUNEONAVICULAR_2 */
	public static final String NAME_L_CUNEONAVICULAR_2_ALIAS = "l_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsometatarsal_2"</i> (Java syntax) or <i>l_tarsometatarsal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_L_TARSOMETATARSAL_2 = "l_tarsometatarsal_2";
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_2</i>" has unique index 12
	 * @see #NAME_L_TARSOMETATARSAL_2 */
	public static final int NAME_L_TARSOMETATARSAL_2_INDEX = 12;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_TARSOMETATARSAL_2 */
	public static final int NAME_L_TARSOMETATARSAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_2</i>" has unique parent "<i>l_cuneonavicular_2</i>" in HAnimJointObject
	 * @see #NAME_L_TARSOMETATARSAL_2
	 * @see HAnimJointObject#NAME_L_CUNEONAVICULAR_2 */
	public static final String NAME_L_TARSOMETATARSAL_2_PARENT = "l_cuneonavicular_2";
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_2</i>" has alias "<i>l_subtalar</i>"
	 * @see #NAME_L_TARSOMETATARSAL_2 */
	public static final String NAME_L_TARSOMETATARSAL_2_ALIAS = "l_subtalar";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metatarsophalangeal_2"</i> (Java syntax) or <i>l_metatarsophalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_L_METATARSOPHALANGEAL_2 = "l_metatarsophalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_2</i>" has unique index 13
	 * @see #NAME_L_METATARSOPHALANGEAL_2 */
	public static final int NAME_L_METATARSOPHALANGEAL_2_INDEX = 13;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_2</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_METATARSOPHALANGEAL_2 */
	public static final int NAME_L_METATARSOPHALANGEAL_2_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_2</i>" has unique parent "<i>l_tarsometatarsal_2</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSOPHALANGEAL_2
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_2 */
	public static final String NAME_L_METATARSOPHALANGEAL_2_PARENT = "l_tarsometatarsal_2";
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_2</i>" has alias "<i>l_midtarsal</i>"
	 * @see #NAME_L_METATARSOPHALANGEAL_2 */
	public static final String NAME_L_METATARSOPHALANGEAL_2_ALIAS = "l_midtarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_proximal_interphalangeal_2"</i> (Java syntax) or <i>l_tarsal_proximal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 = "l_tarsal_proximal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_2</i>" has unique index 14
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2_INDEX = 14;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_2</i>" has unique parent "<i>l_metatarsophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_2 */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2_PARENT = "l_metatarsophalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_distal_interphalangeal_2"</i> (Java syntax) or <i>l_tarsal_distal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 = "l_tarsal_distal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_2</i>" has unique index 15
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_INDEX = 15;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_2</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_PARENT = "l_tarsal_proximal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_2</i>" has alias "<i>l_metatarsal</i>"
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_ALIAS = "l_metatarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_cuneonavicular_3"</i> (Java syntax) or <i>l_cuneonavicular_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneonavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Cuneonavicular_joint</a>  */
	public static final String NAME_L_CUNEONAVICULAR_3 = "l_cuneonavicular_3";
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_3</i>" has unique index 16
	 * @see #NAME_L_CUNEONAVICULAR_3 */
	public static final int NAME_L_CUNEONAVICULAR_3_INDEX = 16;
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CUNEONAVICULAR_3 */
	public static final int NAME_L_CUNEONAVICULAR_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_3</i>" has unique parent "<i>l_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_L_CUNEONAVICULAR_3
	 * @see HAnimJointObject#NAME_L_TALOCALCANEONAVICULAR */
	public static final String NAME_L_CUNEONAVICULAR_3_PARENT = "l_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>l_cuneonavicular_3</i>" has alias "<i>l_talocalcaneal</i>"
	 * @see #NAME_L_CUNEONAVICULAR_3 */
	public static final String NAME_L_CUNEONAVICULAR_3_ALIAS = "l_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsometatarsal_3"</i> (Java syntax) or <i>l_tarsometatarsal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_L_TARSOMETATARSAL_3 = "l_tarsometatarsal_3";
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_3</i>" has unique index 17
	 * @see #NAME_L_TARSOMETATARSAL_3 */
	public static final int NAME_L_TARSOMETATARSAL_3_INDEX = 17;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSOMETATARSAL_3 */
	public static final int NAME_L_TARSOMETATARSAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_3</i>" has unique parent "<i>l_cuneonavicular_3</i>" in HAnimJointObject
	 * @see #NAME_L_TARSOMETATARSAL_3
	 * @see HAnimJointObject#NAME_L_CUNEONAVICULAR_3 */
	public static final String NAME_L_TARSOMETATARSAL_3_PARENT = "l_cuneonavicular_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metatarsophalangeal_3"</i> (Java syntax) or <i>l_metatarsophalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_L_METATARSOPHALANGEAL_3 = "l_metatarsophalangeal_3";
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_3</i>" has unique index 18
	 * @see #NAME_L_METATARSOPHALANGEAL_3 */
	public static final int NAME_L_METATARSOPHALANGEAL_3_INDEX = 18;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSOPHALANGEAL_3 */
	public static final int NAME_L_METATARSOPHALANGEAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_3</i>" has unique parent "<i>l_tarsometatarsal_3</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSOPHALANGEAL_3
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_3 */
	public static final String NAME_L_METATARSOPHALANGEAL_3_PARENT = "l_tarsometatarsal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_proximal_interphalangeal_3"</i> (Java syntax) or <i>l_tarsal_proximal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 = "l_tarsal_proximal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_3</i>" has unique index 19
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3_INDEX = 19;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_3</i>" has unique parent "<i>l_metatarsophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_3 */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3_PARENT = "l_metatarsophalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_distal_interphalangeal_3"</i> (Java syntax) or <i>l_tarsal_distal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3 = "l_tarsal_distal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_3</i>" has unique index 20
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3_INDEX = 20;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_3</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3_PARENT = "l_tarsal_proximal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_calcaneocuboid"</i> (Java syntax) or <i>l_calcaneocuboid</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calcaneocuboid_joint" target="_blank">https://en.wikipedia.org/wiki/Calcaneocuboid_joint</a>  */
	public static final String NAME_L_CALCANEOCUBOID = "l_calcaneocuboid";
	/** SFString jointNameValues enumeration value "<i>l_calcaneocuboid</i>" has unique index 21
	 * @see #NAME_L_CALCANEOCUBOID */
	public static final int NAME_L_CALCANEOCUBOID_INDEX = 21;
	/** SFString jointNameValues enumeration value "<i>l_calcaneocuboid</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_CALCANEOCUBOID */
	public static final int NAME_L_CALCANEOCUBOID_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_calcaneocuboid</i>" has unique parent "<i>l_talocrural</i>" in HAnimJointObject
	 * @see #NAME_L_CALCANEOCUBOID
	 * @see HAnimJointObject#NAME_L_TALOCRURAL */
	public static final String NAME_L_CALCANEOCUBOID_PARENT = "l_talocrural";
	/** SFString jointNameValues enumeration value "<i>l_calcaneocuboid</i>" has alias "<i>l_calcaneuscuboid</i>"
	 * @see #NAME_L_CALCANEOCUBOID */
	public static final String NAME_L_CALCANEOCUBOID_ALIAS = "l_calcaneuscuboid";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_transversetarsal"</i> (Java syntax) or <i>l_transversetarsal</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Transverse_tarsal_joint" target="_blank">https://en.wikipedia.org/wiki/Transverse_tarsal_joint</a>  */
	public static final String NAME_L_TRANSVERSETARSAL = "l_transversetarsal";
	/** SFString jointNameValues enumeration value "<i>l_transversetarsal</i>" has unique index 22
	 * @see #NAME_L_TRANSVERSETARSAL */
	public static final int NAME_L_TRANSVERSETARSAL_INDEX = 22;
	/** SFString jointNameValues enumeration value "<i>l_transversetarsal</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TRANSVERSETARSAL */
	public static final int NAME_L_TRANSVERSETARSAL_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_transversetarsal</i>" has unique parent "<i>l_calcaneocuboid</i>" in HAnimJointObject
	 * @see #NAME_L_TRANSVERSETARSAL
	 * @see HAnimJointObject#NAME_L_CALCANEOCUBOID */
	public static final String NAME_L_TRANSVERSETARSAL_PARENT = "l_calcaneocuboid";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsometatarsal_4"</i> (Java syntax) or <i>l_tarsometatarsal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_L_TARSOMETATARSAL_4 = "l_tarsometatarsal_4";
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_4</i>" has unique index 23
	 * @see #NAME_L_TARSOMETATARSAL_4 */
	public static final int NAME_L_TARSOMETATARSAL_4_INDEX = 23;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSOMETATARSAL_4 */
	public static final int NAME_L_TARSOMETATARSAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_4</i>" has unique parent "<i>l_transversetarsal</i>" in HAnimJointObject
	 * @see #NAME_L_TARSOMETATARSAL_4
	 * @see HAnimJointObject#NAME_L_TRANSVERSETARSAL */
	public static final String NAME_L_TARSOMETATARSAL_4_PARENT = "l_transversetarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metatarsophalangeal_4"</i> (Java syntax) or <i>l_metatarsophalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_L_METATARSOPHALANGEAL_4 = "l_metatarsophalangeal_4";
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_4</i>" has unique index 24
	 * @see #NAME_L_METATARSOPHALANGEAL_4 */
	public static final int NAME_L_METATARSOPHALANGEAL_4_INDEX = 24;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSOPHALANGEAL_4 */
	public static final int NAME_L_METATARSOPHALANGEAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_4</i>" has unique parent "<i>l_tarsometatarsal_4</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSOPHALANGEAL_4
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_4 */
	public static final String NAME_L_METATARSOPHALANGEAL_4_PARENT = "l_tarsometatarsal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_proximal_interphalangeal_4"</i> (Java syntax) or <i>l_tarsal_proximal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 = "l_tarsal_proximal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_4</i>" has unique index 25
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4_INDEX = 25;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_4</i>" has unique parent "<i>l_metatarsophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_4 */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4_PARENT = "l_metatarsophalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_distal_interphalangeal_4"</i> (Java syntax) or <i>l_tarsal_distal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4 = "l_tarsal_distal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_4</i>" has unique index 26
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4_INDEX = 26;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_4</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4_PARENT = "l_tarsal_proximal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsometatarsal_5"</i> (Java syntax) or <i>l_tarsometatarsal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_L_TARSOMETATARSAL_5 = "l_tarsometatarsal_5";
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_5</i>" has unique index 27
	 * @see #NAME_L_TARSOMETATARSAL_5 */
	public static final int NAME_L_TARSOMETATARSAL_5_INDEX = 27;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSOMETATARSAL_5 */
	public static final int NAME_L_TARSOMETATARSAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsometatarsal_5</i>" has unique parent "<i>l_transversetarsal</i>" in HAnimJointObject
	 * @see #NAME_L_TARSOMETATARSAL_5
	 * @see HAnimJointObject#NAME_L_TRANSVERSETARSAL */
	public static final String NAME_L_TARSOMETATARSAL_5_PARENT = "l_transversetarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metatarsophalangeal_5"</i> (Java syntax) or <i>l_metatarsophalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_L_METATARSOPHALANGEAL_5 = "l_metatarsophalangeal_5";
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_5</i>" has unique index 28
	 * @see #NAME_L_METATARSOPHALANGEAL_5 */
	public static final int NAME_L_METATARSOPHALANGEAL_5_INDEX = 28;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_METATARSOPHALANGEAL_5 */
	public static final int NAME_L_METATARSOPHALANGEAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_metatarsophalangeal_5</i>" has unique parent "<i>l_tarsometatarsal_5</i>" in HAnimJointObject
	 * @see #NAME_L_METATARSOPHALANGEAL_5
	 * @see HAnimJointObject#NAME_L_TARSOMETATARSAL_5 */
	public static final String NAME_L_METATARSOPHALANGEAL_5_PARENT = "l_tarsometatarsal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_proximal_interphalangeal_5"</i> (Java syntax) or <i>l_tarsal_proximal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 = "l_tarsal_proximal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_5</i>" has unique index 29
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5_INDEX = 29;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_proximal_interphalangeal_5</i>" has unique parent "<i>l_metatarsophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_L_METATARSOPHALANGEAL_5 */
	public static final String NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5_PARENT = "l_metatarsophalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_tarsal_distal_interphalangeal_5"</i> (Java syntax) or <i>l_tarsal_distal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5 = "l_tarsal_distal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_5</i>" has unique index 30
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5_INDEX = 30;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_tarsal_distal_interphalangeal_5</i>" has unique parent "<i>l_tarsal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5_PARENT = "l_tarsal_proximal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_hip"</i> (Java syntax) or <i>r_hip</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Hip" target="_blank">https://en.wikipedia.org/wiki/Hip</a>  */
	public static final String NAME_R_HIP = "r_hip";
	/** SFString jointNameValues enumeration value "<i>r_hip</i>" has unique index 31
	 * @see #NAME_R_HIP */
	public static final int NAME_R_HIP_INDEX = 31;
	/** SFString jointNameValues enumeration value "<i>r_hip</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_HIP */
	public static final int NAME_R_HIP_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_hip</i>" has unique parent "<i>sacroiliac</i>" in HAnimJointObject
	 * @see #NAME_R_HIP
	 * @see HAnimJointObject#NAME_SACROILIAC */
	public static final String NAME_R_HIP_PARENT = "sacroiliac";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_knee"</i> (Java syntax) or <i>r_knee</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Knee" target="_blank">https://en.wikipedia.org/wiki/Knee</a>  */
	public static final String NAME_R_KNEE = "r_knee";
	/** SFString jointNameValues enumeration value "<i>r_knee</i>" has unique index 32
	 * @see #NAME_R_KNEE */
	public static final int NAME_R_KNEE_INDEX = 32;
	/** SFString jointNameValues enumeration value "<i>r_knee</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_KNEE */
	public static final int NAME_R_KNEE_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_knee</i>" has unique parent "<i>r_hip</i>" in HAnimJointObject
	 * @see #NAME_R_KNEE
	 * @see HAnimJointObject#NAME_R_HIP */
	public static final String NAME_R_KNEE_PARENT = "r_hip";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_talocrural"</i> (Java syntax) or <i>r_talocrural</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Ankle" target="_blank">https://en.wikipedia.org/wiki/Ankle</a>  */
	public static final String NAME_R_TALOCRURAL = "r_talocrural";
	/** SFString jointNameValues enumeration value "<i>r_talocrural</i>" has unique index 33
	 * @see #NAME_R_TALOCRURAL */
	public static final int NAME_R_TALOCRURAL_INDEX = 33;
	/** SFString jointNameValues enumeration value "<i>r_talocrural</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_TALOCRURAL */
	public static final int NAME_R_TALOCRURAL_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_talocrural</i>" has unique parent "<i>r_knee</i>" in HAnimJointObject
	 * @see #NAME_R_TALOCRURAL
	 * @see HAnimJointObject#NAME_R_KNEE */
	public static final String NAME_R_TALOCRURAL_PARENT = "r_knee";
	/** SFString jointNameValues enumeration value "<i>r_talocrural</i>" has alias "<i>r_ankle</i>"
	 * @see #NAME_R_TALOCRURAL */
	public static final String NAME_R_TALOCRURAL_ALIAS = "r_ankle";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_talocalcaneonavicular"</i> (Java syntax) or <i>r_talocalcaneonavicular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Subtalar_joint" target="_blank">https://en.wikipedia.org/wiki/Subtalar_joint</a>  */
	public static final String NAME_R_TALOCALCANEONAVICULAR = "r_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>r_talocalcaneonavicular</i>" has unique index 34
	 * @see #NAME_R_TALOCALCANEONAVICULAR */
	public static final int NAME_R_TALOCALCANEONAVICULAR_INDEX = 34;
	/** SFString jointNameValues enumeration value "<i>r_talocalcaneonavicular</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TALOCALCANEONAVICULAR */
	public static final int NAME_R_TALOCALCANEONAVICULAR_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_talocalcaneonavicular</i>" has unique parent "<i>r_talocrural</i>" in HAnimJointObject
	 * @see #NAME_R_TALOCALCANEONAVICULAR
	 * @see HAnimJointObject#NAME_R_TALOCRURAL */
	public static final String NAME_R_TALOCALCANEONAVICULAR_PARENT = "r_talocrural";
	/** SFString jointNameValues enumeration value "<i>r_talocalcaneonavicular</i>" has alias "<i>r_talocalcaneal</i>"
	 * @see #NAME_R_TALOCALCANEONAVICULAR */
	public static final String NAME_R_TALOCALCANEONAVICULAR_ALIAS = "r_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_cuneonavicular_1"</i> (Java syntax) or <i>r_cuneonavicular_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneonavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Cuneonavicular_joint</a>  */
	public static final String NAME_R_CUNEONAVICULAR_1 = "r_cuneonavicular_1";
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_1</i>" has unique index 35
	 * @see #NAME_R_CUNEONAVICULAR_1 */
	public static final int NAME_R_CUNEONAVICULAR_1_INDEX = 35;
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUNEONAVICULAR_1 */
	public static final int NAME_R_CUNEONAVICULAR_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_1</i>" has unique parent "<i>r_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_R_CUNEONAVICULAR_1
	 * @see HAnimJointObject#NAME_R_TALOCALCANEONAVICULAR */
	public static final String NAME_R_CUNEONAVICULAR_1_PARENT = "r_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_1</i>" has alias "<i>r_talocalcaneal</i>"
	 * @see #NAME_R_CUNEONAVICULAR_1 */
	public static final String NAME_R_CUNEONAVICULAR_1_ALIAS = "r_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsometatarsal_1"</i> (Java syntax) or <i>r_tarsometatarsal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_R_TARSOMETATARSAL_1 = "r_tarsometatarsal_1";
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_1</i>" has unique index 36
	 * @see #NAME_R_TARSOMETATARSAL_1 */
	public static final int NAME_R_TARSOMETATARSAL_1_INDEX = 36;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSOMETATARSAL_1 */
	public static final int NAME_R_TARSOMETATARSAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_1</i>" has unique parent "<i>r_cuneonavicular_1</i>" in HAnimJointObject
	 * @see #NAME_R_TARSOMETATARSAL_1
	 * @see HAnimJointObject#NAME_R_CUNEONAVICULAR_1 */
	public static final String NAME_R_TARSOMETATARSAL_1_PARENT = "r_cuneonavicular_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metatarsophalangeal_1"</i> (Java syntax) or <i>r_metatarsophalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_R_METATARSOPHALANGEAL_1 = "r_metatarsophalangeal_1";
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_1</i>" has unique index 37
	 * @see #NAME_R_METATARSOPHALANGEAL_1 */
	public static final int NAME_R_METATARSOPHALANGEAL_1_INDEX = 37;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSOPHALANGEAL_1 */
	public static final int NAME_R_METATARSOPHALANGEAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_1</i>" has unique parent "<i>r_tarsometatarsal_1</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSOPHALANGEAL_1
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_1 */
	public static final String NAME_R_METATARSOPHALANGEAL_1_PARENT = "r_tarsometatarsal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_interphalangeal_1"</i> (Java syntax) or <i>r_tarsal_interphalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_INTERPHALANGEAL_1 = "r_tarsal_interphalangeal_1";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_interphalangeal_1</i>" has unique index 38
	 * @see #NAME_R_TARSAL_INTERPHALANGEAL_1 */
	public static final int NAME_R_TARSAL_INTERPHALANGEAL_1_INDEX = 38;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_interphalangeal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_INTERPHALANGEAL_1 */
	public static final int NAME_R_TARSAL_INTERPHALANGEAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_interphalangeal_1</i>" has unique parent "<i>r_metatarsophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_INTERPHALANGEAL_1
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_1 */
	public static final String NAME_R_TARSAL_INTERPHALANGEAL_1_PARENT = "r_metatarsophalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_cuneonavicular_2"</i> (Java syntax) or <i>r_cuneonavicular_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneonavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Cuneonavicular_joint</a>  */
	public static final String NAME_R_CUNEONAVICULAR_2 = "r_cuneonavicular_2";
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_2</i>" has unique index 39
	 * @see #NAME_R_CUNEONAVICULAR_2 */
	public static final int NAME_R_CUNEONAVICULAR_2_INDEX = 39;
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUNEONAVICULAR_2 */
	public static final int NAME_R_CUNEONAVICULAR_2_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_2</i>" has unique parent "<i>r_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_R_CUNEONAVICULAR_2
	 * @see HAnimJointObject#NAME_R_TALOCALCANEONAVICULAR */
	public static final String NAME_R_CUNEONAVICULAR_2_PARENT = "r_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_2</i>" has alias "<i>r_talocalcaneal</i>"
	 * @see #NAME_R_CUNEONAVICULAR_2 */
	public static final String NAME_R_CUNEONAVICULAR_2_ALIAS = "r_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsometatarsal_2"</i> (Java syntax) or <i>r_tarsometatarsal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_R_TARSOMETATARSAL_2 = "r_tarsometatarsal_2";
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_2</i>" has unique index 40
	 * @see #NAME_R_TARSOMETATARSAL_2 */
	public static final int NAME_R_TARSOMETATARSAL_2_INDEX = 40;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_TARSOMETATARSAL_2 */
	public static final int NAME_R_TARSOMETATARSAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_2</i>" has unique parent "<i>r_cuneonavicular_2</i>" in HAnimJointObject
	 * @see #NAME_R_TARSOMETATARSAL_2
	 * @see HAnimJointObject#NAME_R_CUNEONAVICULAR_2 */
	public static final String NAME_R_TARSOMETATARSAL_2_PARENT = "r_cuneonavicular_2";
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_2</i>" has alias "<i>r_subtalar</i>"
	 * @see #NAME_R_TARSOMETATARSAL_2 */
	public static final String NAME_R_TARSOMETATARSAL_2_ALIAS = "r_subtalar";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metatarsophalangeal_2"</i> (Java syntax) or <i>r_metatarsophalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_R_METATARSOPHALANGEAL_2 = "r_metatarsophalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_2</i>" has unique index 41
	 * @see #NAME_R_METATARSOPHALANGEAL_2 */
	public static final int NAME_R_METATARSOPHALANGEAL_2_INDEX = 41;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_2</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_METATARSOPHALANGEAL_2 */
	public static final int NAME_R_METATARSOPHALANGEAL_2_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_2</i>" has unique parent "<i>r_tarsometatarsal_2</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSOPHALANGEAL_2
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_2 */
	public static final String NAME_R_METATARSOPHALANGEAL_2_PARENT = "r_tarsometatarsal_2";
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_2</i>" has alias "<i>r_midtarsal</i>"
	 * @see #NAME_R_METATARSOPHALANGEAL_2 */
	public static final String NAME_R_METATARSOPHALANGEAL_2_ALIAS = "r_midtarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_proximal_interphalangeal_2"</i> (Java syntax) or <i>r_tarsal_proximal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 = "r_tarsal_proximal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_2</i>" has unique index 42
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2_INDEX = 42;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_2</i>" has unique parent "<i>r_metatarsophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_2 */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2_PARENT = "r_metatarsophalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_distal_interphalangeal_2"</i> (Java syntax) or <i>r_tarsal_distal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 = "r_tarsal_distal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_2</i>" has unique index 43
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_INDEX = 43;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_2</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_PARENT = "r_tarsal_proximal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_2</i>" has alias "<i>r_metatarsal</i>"
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_ALIAS = "r_metatarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_cuneonavicular_3"</i> (Java syntax) or <i>r_cuneonavicular_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Cuneonavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Cuneonavicular_joint</a>  */
	public static final String NAME_R_CUNEONAVICULAR_3 = "r_cuneonavicular_3";
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_3</i>" has unique index 44
	 * @see #NAME_R_CUNEONAVICULAR_3 */
	public static final int NAME_R_CUNEONAVICULAR_3_INDEX = 44;
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CUNEONAVICULAR_3 */
	public static final int NAME_R_CUNEONAVICULAR_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_3</i>" has unique parent "<i>r_talocalcaneonavicular</i>" in HAnimJointObject
	 * @see #NAME_R_CUNEONAVICULAR_3
	 * @see HAnimJointObject#NAME_R_TALOCALCANEONAVICULAR */
	public static final String NAME_R_CUNEONAVICULAR_3_PARENT = "r_talocalcaneonavicular";
	/** SFString jointNameValues enumeration value "<i>r_cuneonavicular_3</i>" has alias "<i>r_talocalcaneal</i>"
	 * @see #NAME_R_CUNEONAVICULAR_3 */
	public static final String NAME_R_CUNEONAVICULAR_3_ALIAS = "r_talocalcaneal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsometatarsal_3"</i> (Java syntax) or <i>r_tarsometatarsal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_R_TARSOMETATARSAL_3 = "r_tarsometatarsal_3";
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_3</i>" has unique index 45
	 * @see #NAME_R_TARSOMETATARSAL_3 */
	public static final int NAME_R_TARSOMETATARSAL_3_INDEX = 45;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSOMETATARSAL_3 */
	public static final int NAME_R_TARSOMETATARSAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_3</i>" has unique parent "<i>r_cuneonavicular_3</i>" in HAnimJointObject
	 * @see #NAME_R_TARSOMETATARSAL_3
	 * @see HAnimJointObject#NAME_R_CUNEONAVICULAR_3 */
	public static final String NAME_R_TARSOMETATARSAL_3_PARENT = "r_cuneonavicular_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metatarsophalangeal_3"</i> (Java syntax) or <i>r_metatarsophalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_R_METATARSOPHALANGEAL_3 = "r_metatarsophalangeal_3";
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_3</i>" has unique index 46
	 * @see #NAME_R_METATARSOPHALANGEAL_3 */
	public static final int NAME_R_METATARSOPHALANGEAL_3_INDEX = 46;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSOPHALANGEAL_3 */
	public static final int NAME_R_METATARSOPHALANGEAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_3</i>" has unique parent "<i>r_tarsometatarsal_3</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSOPHALANGEAL_3
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_3 */
	public static final String NAME_R_METATARSOPHALANGEAL_3_PARENT = "r_tarsometatarsal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_proximal_interphalangeal_3"</i> (Java syntax) or <i>r_tarsal_proximal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 = "r_tarsal_proximal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_3</i>" has unique index 47
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3_INDEX = 47;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_3</i>" has unique parent "<i>r_metatarsophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_3 */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3_PARENT = "r_metatarsophalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_distal_interphalangeal_3"</i> (Java syntax) or <i>r_tarsal_distal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3 = "r_tarsal_distal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_3</i>" has unique index 48
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3_INDEX = 48;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_3</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3_PARENT = "r_tarsal_proximal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_calcaneocuboid"</i> (Java syntax) or <i>r_calcaneocuboid</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Calcaneocuboid_joint" target="_blank">https://en.wikipedia.org/wiki/Calcaneocuboid_joint</a>  */
	public static final String NAME_R_CALCANEOCUBOID = "r_calcaneocuboid";
	/** SFString jointNameValues enumeration value "<i>r_calcaneocuboid</i>" has unique index 49
	 * @see #NAME_R_CALCANEOCUBOID */
	public static final int NAME_R_CALCANEOCUBOID_INDEX = 49;
	/** SFString jointNameValues enumeration value "<i>r_calcaneocuboid</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_CALCANEOCUBOID */
	public static final int NAME_R_CALCANEOCUBOID_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_calcaneocuboid</i>" has unique parent "<i>r_talocrural</i>" in HAnimJointObject
	 * @see #NAME_R_CALCANEOCUBOID
	 * @see HAnimJointObject#NAME_R_TALOCRURAL */
	public static final String NAME_R_CALCANEOCUBOID_PARENT = "r_talocrural";
	/** SFString jointNameValues enumeration value "<i>r_calcaneocuboid</i>" has alias "<i>r_calcaneuscuboid</i>"
	 * @see #NAME_R_CALCANEOCUBOID */
	public static final String NAME_R_CALCANEOCUBOID_ALIAS = "r_calcaneuscuboid";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_transversetarsal"</i> (Java syntax) or <i>r_transversetarsal</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Transverse_tarsal_joint" target="_blank">https://en.wikipedia.org/wiki/Transverse_tarsal_joint</a>  */
	public static final String NAME_R_TRANSVERSETARSAL = "r_transversetarsal";
	/** SFString jointNameValues enumeration value "<i>r_transversetarsal</i>" has unique index 50
	 * @see #NAME_R_TRANSVERSETARSAL */
	public static final int NAME_R_TRANSVERSETARSAL_INDEX = 50;
	/** SFString jointNameValues enumeration value "<i>r_transversetarsal</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TRANSVERSETARSAL */
	public static final int NAME_R_TRANSVERSETARSAL_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_transversetarsal</i>" has unique parent "<i>r_calcaneocuboid</i>" in HAnimJointObject
	 * @see #NAME_R_TRANSVERSETARSAL
	 * @see HAnimJointObject#NAME_R_CALCANEOCUBOID */
	public static final String NAME_R_TRANSVERSETARSAL_PARENT = "r_calcaneocuboid";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsometatarsal_4"</i> (Java syntax) or <i>r_tarsometatarsal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_R_TARSOMETATARSAL_4 = "r_tarsometatarsal_4";
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_4</i>" has unique index 51
	 * @see #NAME_R_TARSOMETATARSAL_4 */
	public static final int NAME_R_TARSOMETATARSAL_4_INDEX = 51;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSOMETATARSAL_4 */
	public static final int NAME_R_TARSOMETATARSAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_4</i>" has unique parent "<i>r_transversetarsal</i>" in HAnimJointObject
	 * @see #NAME_R_TARSOMETATARSAL_4
	 * @see HAnimJointObject#NAME_R_TRANSVERSETARSAL */
	public static final String NAME_R_TARSOMETATARSAL_4_PARENT = "r_transversetarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metatarsophalangeal_4"</i> (Java syntax) or <i>r_metatarsophalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_R_METATARSOPHALANGEAL_4 = "r_metatarsophalangeal_4";
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_4</i>" has unique index 52
	 * @see #NAME_R_METATARSOPHALANGEAL_4 */
	public static final int NAME_R_METATARSOPHALANGEAL_4_INDEX = 52;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSOPHALANGEAL_4 */
	public static final int NAME_R_METATARSOPHALANGEAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_4</i>" has unique parent "<i>r_tarsometatarsal_4</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSOPHALANGEAL_4
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_4 */
	public static final String NAME_R_METATARSOPHALANGEAL_4_PARENT = "r_tarsometatarsal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_proximal_interphalangeal_4"</i> (Java syntax) or <i>r_tarsal_proximal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 = "r_tarsal_proximal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_4</i>" has unique index 53
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4_INDEX = 53;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_4</i>" has unique parent "<i>r_metatarsophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_4 */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4_PARENT = "r_metatarsophalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_distal_interphalangeal_4"</i> (Java syntax) or <i>r_tarsal_distal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4 = "r_tarsal_distal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_4</i>" has unique index 54
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4_INDEX = 54;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_4</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_4</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4_PARENT = "r_tarsal_proximal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsometatarsal_5"</i> (Java syntax) or <i>r_tarsometatarsal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Tarsometatarsal_joints" target="_blank">https://en.wikipedia.org/wiki/Tarsometatarsal_joints</a>  */
	public static final String NAME_R_TARSOMETATARSAL_5 = "r_tarsometatarsal_5";
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_5</i>" has unique index 55
	 * @see #NAME_R_TARSOMETATARSAL_5 */
	public static final int NAME_R_TARSOMETATARSAL_5_INDEX = 55;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSOMETATARSAL_5 */
	public static final int NAME_R_TARSOMETATARSAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsometatarsal_5</i>" has unique parent "<i>r_transversetarsal</i>" in HAnimJointObject
	 * @see #NAME_R_TARSOMETATARSAL_5
	 * @see HAnimJointObject#NAME_R_TRANSVERSETARSAL */
	public static final String NAME_R_TARSOMETATARSAL_5_PARENT = "r_transversetarsal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metatarsophalangeal_5"</i> (Java syntax) or <i>r_metatarsophalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metatarsophalangeal_joints" target="_blank">https://en.wikipedia.org/wiki/Metatarsophalangeal_joints</a>  */
	public static final String NAME_R_METATARSOPHALANGEAL_5 = "r_metatarsophalangeal_5";
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_5</i>" has unique index 56
	 * @see #NAME_R_METATARSOPHALANGEAL_5 */
	public static final int NAME_R_METATARSOPHALANGEAL_5_INDEX = 56;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_METATARSOPHALANGEAL_5 */
	public static final int NAME_R_METATARSOPHALANGEAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_metatarsophalangeal_5</i>" has unique parent "<i>r_tarsometatarsal_5</i>" in HAnimJointObject
	 * @see #NAME_R_METATARSOPHALANGEAL_5
	 * @see HAnimJointObject#NAME_R_TARSOMETATARSAL_5 */
	public static final String NAME_R_METATARSOPHALANGEAL_5_PARENT = "r_tarsometatarsal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_proximal_interphalangeal_5"</i> (Java syntax) or <i>r_tarsal_proximal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 = "r_tarsal_proximal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_5</i>" has unique index 57
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5_INDEX = 57;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_proximal_interphalangeal_5</i>" has unique parent "<i>r_metatarsophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_R_METATARSOPHALANGEAL_5 */
	public static final String NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5_PARENT = "r_metatarsophalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_tarsal_distal_interphalangeal_5"</i> (Java syntax) or <i>r_tarsal_distal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_foot</a>  */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5 = "r_tarsal_distal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_5</i>" has unique index 58
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5_INDEX = 58;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_tarsal_distal_interphalangeal_5</i>" has unique parent "<i>r_tarsal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5_PARENT = "r_tarsal_proximal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vl5"</i> (Java syntax) or <i>vl5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VL5 = "vl5";
	/** SFString jointNameValues enumeration value "<i>vl5</i>" has unique index 59
	 * @see #NAME_VL5 */
	public static final int NAME_VL5_INDEX = 59;
	/** SFString jointNameValues enumeration value "<i>vl5</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_VL5 */
	public static final int NAME_VL5_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>vl5</i>" has unique parent "<i>sacroiliac</i>" in HAnimJointObject
	 * @see #NAME_VL5
	 * @see HAnimJointObject#NAME_SACROILIAC */
	public static final String NAME_VL5_PARENT = "sacroiliac";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vl4"</i> (Java syntax) or <i>vl4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VL4 = "vl4";
	/** SFString jointNameValues enumeration value "<i>vl4</i>" has unique index 60
	 * @see #NAME_VL4 */
	public static final int NAME_VL4_INDEX = 60;
	/** SFString jointNameValues enumeration value "<i>vl4</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VL4 */
	public static final int NAME_VL4_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vl4</i>" has unique parent "<i>vl5</i>" in HAnimJointObject
	 * @see #NAME_VL4
	 * @see HAnimJointObject#NAME_VL5 */
	public static final String NAME_VL4_PARENT = "vl5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vl3"</i> (Java syntax) or <i>vl3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VL3 = "vl3";
	/** SFString jointNameValues enumeration value "<i>vl3</i>" has unique index 61
	 * @see #NAME_VL3 */
	public static final int NAME_VL3_INDEX = 61;
	/** SFString jointNameValues enumeration value "<i>vl3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VL3 */
	public static final int NAME_VL3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vl3</i>" has unique parent "<i>vl4</i>" in HAnimJointObject
	 * @see #NAME_VL3
	 * @see HAnimJointObject#NAME_VL4 */
	public static final String NAME_VL3_PARENT = "vl4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vl2"</i> (Java syntax) or <i>vl2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VL2 = "vl2";
	/** SFString jointNameValues enumeration value "<i>vl2</i>" has unique index 62
	 * @see #NAME_VL2 */
	public static final int NAME_VL2_INDEX = 62;
	/** SFString jointNameValues enumeration value "<i>vl2</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VL2 */
	public static final int NAME_VL2_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vl2</i>" has unique parent "<i>vl3</i>" in HAnimJointObject
	 * @see #NAME_VL2
	 * @see HAnimJointObject#NAME_VL3 */
	public static final String NAME_VL2_PARENT = "vl3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vl1"</i> (Java syntax) or <i>vl1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VL1 = "vl1";
	/** SFString jointNameValues enumeration value "<i>vl1</i>" has unique index 63
	 * @see #NAME_VL1 */
	public static final int NAME_VL1_INDEX = 63;
	/** SFString jointNameValues enumeration value "<i>vl1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VL1 */
	public static final int NAME_VL1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vl1</i>" has unique parent "<i>vl2</i>" in HAnimJointObject
	 * @see #NAME_VL1
	 * @see HAnimJointObject#NAME_VL2 */
	public static final String NAME_VL1_PARENT = "vl2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt12"</i> (Java syntax) or <i>vt12</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT12 = "vt12";
	/** SFString jointNameValues enumeration value "<i>vt12</i>" has unique index 64
	 * @see #NAME_VT12 */
	public static final int NAME_VT12_INDEX = 64;
	/** SFString jointNameValues enumeration value "<i>vt12</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT12 */
	public static final int NAME_VT12_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt12</i>" has unique parent "<i>vl1</i>" in HAnimJointObject
	 * @see #NAME_VT12
	 * @see HAnimJointObject#NAME_VL1 */
	public static final String NAME_VT12_PARENT = "vl1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt11"</i> (Java syntax) or <i>vt11</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT11 = "vt11";
	/** SFString jointNameValues enumeration value "<i>vt11</i>" has unique index 65
	 * @see #NAME_VT11 */
	public static final int NAME_VT11_INDEX = 65;
	/** SFString jointNameValues enumeration value "<i>vt11</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT11 */
	public static final int NAME_VT11_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt11</i>" has unique parent "<i>vt12</i>" in HAnimJointObject
	 * @see #NAME_VT11
	 * @see HAnimJointObject#NAME_VT12 */
	public static final String NAME_VT11_PARENT = "vt12";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt10"</i> (Java syntax) or <i>vt10</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT10 = "vt10";
	/** SFString jointNameValues enumeration value "<i>vt10</i>" has unique index 66
	 * @see #NAME_VT10 */
	public static final int NAME_VT10_INDEX = 66;
	/** SFString jointNameValues enumeration value "<i>vt10</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VT10 */
	public static final int NAME_VT10_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vt10</i>" has unique parent "<i>vt11</i>" in HAnimJointObject
	 * @see #NAME_VT10
	 * @see HAnimJointObject#NAME_VT11 */
	public static final String NAME_VT10_PARENT = "vt11";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt9"</i> (Java syntax) or <i>vt9</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT9 = "vt9";
	/** SFString jointNameValues enumeration value "<i>vt9</i>" has unique index 67
	 * @see #NAME_VT9 */
	public static final int NAME_VT9_INDEX = 67;
	/** SFString jointNameValues enumeration value "<i>vt9</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT9 */
	public static final int NAME_VT9_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt9</i>" has unique parent "<i>vt10</i>" in HAnimJointObject
	 * @see #NAME_VT9
	 * @see HAnimJointObject#NAME_VT10 */
	public static final String NAME_VT9_PARENT = "vt10";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt8"</i> (Java syntax) or <i>vt8</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT8 = "vt8";
	/** SFString jointNameValues enumeration value "<i>vt8</i>" has unique index 68
	 * @see #NAME_VT8 */
	public static final int NAME_VT8_INDEX = 68;
	/** SFString jointNameValues enumeration value "<i>vt8</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT8 */
	public static final int NAME_VT8_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt8</i>" has unique parent "<i>vt9</i>" in HAnimJointObject
	 * @see #NAME_VT8
	 * @see HAnimJointObject#NAME_VT9 */
	public static final String NAME_VT8_PARENT = "vt9";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt7"</i> (Java syntax) or <i>vt7</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT7 = "vt7";
	/** SFString jointNameValues enumeration value "<i>vt7</i>" has unique index 69
	 * @see #NAME_VT7 */
	public static final int NAME_VT7_INDEX = 69;
	/** SFString jointNameValues enumeration value "<i>vt7</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT7 */
	public static final int NAME_VT7_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt7</i>" has unique parent "<i>vt8</i>" in HAnimJointObject
	 * @see #NAME_VT7
	 * @see HAnimJointObject#NAME_VT8 */
	public static final String NAME_VT7_PARENT = "vt8";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt6"</i> (Java syntax) or <i>vt6</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT6 = "vt6";
	/** SFString jointNameValues enumeration value "<i>vt6</i>" has unique index 70
	 * @see #NAME_VT6 */
	public static final int NAME_VT6_INDEX = 70;
	/** SFString jointNameValues enumeration value "<i>vt6</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VT6 */
	public static final int NAME_VT6_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vt6</i>" has unique parent "<i>vt7</i>" in HAnimJointObject
	 * @see #NAME_VT6
	 * @see HAnimJointObject#NAME_VT7 */
	public static final String NAME_VT6_PARENT = "vt7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt5"</i> (Java syntax) or <i>vt5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT5 = "vt5";
	/** SFString jointNameValues enumeration value "<i>vt5</i>" has unique index 71
	 * @see #NAME_VT5 */
	public static final int NAME_VT5_INDEX = 71;
	/** SFString jointNameValues enumeration value "<i>vt5</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT5 */
	public static final int NAME_VT5_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt5</i>" has unique parent "<i>vt6</i>" in HAnimJointObject
	 * @see #NAME_VT5
	 * @see HAnimJointObject#NAME_VT6 */
	public static final String NAME_VT5_PARENT = "vt6";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt4"</i> (Java syntax) or <i>vt4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT4 = "vt4";
	/** SFString jointNameValues enumeration value "<i>vt4</i>" has unique index 72
	 * @see #NAME_VT4 */
	public static final int NAME_VT4_INDEX = 72;
	/** SFString jointNameValues enumeration value "<i>vt4</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT4 */
	public static final int NAME_VT4_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt4</i>" has unique parent "<i>vt5</i>" in HAnimJointObject
	 * @see #NAME_VT4
	 * @see HAnimJointObject#NAME_VT5 */
	public static final String NAME_VT4_PARENT = "vt5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt3"</i> (Java syntax) or <i>vt3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT3 = "vt3";
	/** SFString jointNameValues enumeration value "<i>vt3</i>" has unique index 73
	 * @see #NAME_VT3 */
	public static final int NAME_VT3_INDEX = 73;
	/** SFString jointNameValues enumeration value "<i>vt3</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT3 */
	public static final int NAME_VT3_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt3</i>" has unique parent "<i>vt4</i>" in HAnimJointObject
	 * @see #NAME_VT3
	 * @see HAnimJointObject#NAME_VT4 */
	public static final String NAME_VT3_PARENT = "vt4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt2"</i> (Java syntax) or <i>vt2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT2 = "vt2";
	/** SFString jointNameValues enumeration value "<i>vt2</i>" has unique index 74
	 * @see #NAME_VT2 */
	public static final int NAME_VT2_INDEX = 74;
	/** SFString jointNameValues enumeration value "<i>vt2</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VT2 */
	public static final int NAME_VT2_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vt2</i>" has unique parent "<i>vt3</i>" in HAnimJointObject
	 * @see #NAME_VT2
	 * @see HAnimJointObject#NAME_VT3 */
	public static final String NAME_VT2_PARENT = "vt3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vt1"</i> (Java syntax) or <i>vt1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VT1 = "vt1";
	/** SFString jointNameValues enumeration value "<i>vt1</i>" has unique index 75
	 * @see #NAME_VT1 */
	public static final int NAME_VT1_INDEX = 75;
	/** SFString jointNameValues enumeration value "<i>vt1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VT1 */
	public static final int NAME_VT1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vt1</i>" has unique parent "<i>vt2</i>" in HAnimJointObject
	 * @see #NAME_VT1
	 * @see HAnimJointObject#NAME_VT2 */
	public static final String NAME_VT1_PARENT = "vt2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc7"</i> (Java syntax) or <i>vc7</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC7 = "vc7";
	/** SFString jointNameValues enumeration value "<i>vc7</i>" has unique index 76
	 * @see #NAME_VC7 */
	public static final int NAME_VC7_INDEX = 76;
	/** SFString jointNameValues enumeration value "<i>vc7</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VC7 */
	public static final int NAME_VC7_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vc7</i>" has unique parent "<i>vt1</i>" in HAnimJointObject
	 * @see #NAME_VC7
	 * @see HAnimJointObject#NAME_VT1 */
	public static final String NAME_VC7_PARENT = "vt1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc6"</i> (Java syntax) or <i>vc6</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC6 = "vc6";
	/** SFString jointNameValues enumeration value "<i>vc6</i>" has unique index 77
	 * @see #NAME_VC6 */
	public static final int NAME_VC6_INDEX = 77;
	/** SFString jointNameValues enumeration value "<i>vc6</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VC6 */
	public static final int NAME_VC6_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vc6</i>" has unique parent "<i>vc7</i>" in HAnimJointObject
	 * @see #NAME_VC6
	 * @see HAnimJointObject#NAME_VC7 */
	public static final String NAME_VC6_PARENT = "vc7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc5"</i> (Java syntax) or <i>vc5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC5 = "vc5";
	/** SFString jointNameValues enumeration value "<i>vc5</i>" has unique index 78
	 * @see #NAME_VC5 */
	public static final int NAME_VC5_INDEX = 78;
	/** SFString jointNameValues enumeration value "<i>vc5</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VC5 */
	public static final int NAME_VC5_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vc5</i>" has unique parent "<i>vc6</i>" in HAnimJointObject
	 * @see #NAME_VC5
	 * @see HAnimJointObject#NAME_VC6 */
	public static final String NAME_VC5_PARENT = "vc6";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc4"</i> (Java syntax) or <i>vc4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC4 = "vc4";
	/** SFString jointNameValues enumeration value "<i>vc4</i>" has unique index 79
	 * @see #NAME_VC4 */
	public static final int NAME_VC4_INDEX = 79;
	/** SFString jointNameValues enumeration value "<i>vc4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VC4 */
	public static final int NAME_VC4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vc4</i>" has unique parent "<i>vc5</i>" in HAnimJointObject
	 * @see #NAME_VC4
	 * @see HAnimJointObject#NAME_VC5 */
	public static final String NAME_VC4_PARENT = "vc5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc3"</i> (Java syntax) or <i>vc3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC3 = "vc3";
	/** SFString jointNameValues enumeration value "<i>vc3</i>" has unique index 80
	 * @see #NAME_VC3 */
	public static final int NAME_VC3_INDEX = 80;
	/** SFString jointNameValues enumeration value "<i>vc3</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VC3 */
	public static final int NAME_VC3_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vc3</i>" has unique parent "<i>vc4</i>" in HAnimJointObject
	 * @see #NAME_VC3
	 * @see HAnimJointObject#NAME_VC4 */
	public static final String NAME_VC3_PARENT = "vc4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc2"</i> (Java syntax) or <i>vc2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC2 = "vc2";
	/** SFString jointNameValues enumeration value "<i>vc2</i>" has unique index 81
	 * @see #NAME_VC2 */
	public static final int NAME_VC2_INDEX = 81;
	/** SFString jointNameValues enumeration value "<i>vc2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_VC2 */
	public static final int NAME_VC2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>vc2</i>" has unique parent "<i>vc3</i>" in HAnimJointObject
	 * @see #NAME_VC2
	 * @see HAnimJointObject#NAME_VC3 */
	public static final String NAME_VC2_PARENT = "vc3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"vc1"</i> (Java syntax) or <i>vc1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Vertebral_column" target="_blank">https://en.wikipedia.org/wiki/Vertebral_column</a>  */
	public static final String NAME_VC1 = "vc1";
	/** SFString jointNameValues enumeration value "<i>vc1</i>" has unique index 82
	 * @see #NAME_VC1 */
	public static final int NAME_VC1_INDEX = 82;
	/** SFString jointNameValues enumeration value "<i>vc1</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_VC1 */
	public static final int NAME_VC1_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>vc1</i>" has unique parent "<i>vc2</i>" in HAnimJointObject
	 * @see #NAME_VC1
	 * @see HAnimJointObject#NAME_VC2 */
	public static final String NAME_VC1_PARENT = "vc2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"skullbase"</i> (Java syntax) or <i>skullbase</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Skull" target="_blank">https://en.wikipedia.org/wiki/Skull</a>  */
	public static final String NAME_SKULLBASE = "skullbase";
	/** SFString jointNameValues enumeration value "<i>skullbase</i>" has unique index 83
	 * @see #NAME_SKULLBASE */
	public static final int NAME_SKULLBASE_INDEX = 83;
	/** SFString jointNameValues enumeration value "<i>skullbase</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_SKULLBASE */
	public static final int NAME_SKULLBASE_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>skullbase</i>" has unique parent "<i>vc1</i>" in HAnimJointObject
	 * @see #NAME_SKULLBASE
	 * @see HAnimJointObject#NAME_VC1 */
	public static final String NAME_SKULLBASE_PARENT = "vc1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_eyelid_joint"</i> (Java syntax) or <i>l_eyelid_joint</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyelid" target="_blank">https://en.wikipedia.org/wiki/Eyelid</a>  */
	public static final String NAME_L_EYELID_JOINT = "l_eyelid_joint";
	/** SFString jointNameValues enumeration value "<i>l_eyelid_joint</i>" has unique index 84
	 * @see #NAME_L_EYELID_JOINT */
	public static final int NAME_L_EYELID_JOINT_INDEX = 84;
	/** SFString jointNameValues enumeration value "<i>l_eyelid_joint</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_EYELID_JOINT */
	public static final int NAME_L_EYELID_JOINT_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>l_eyelid_joint</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_L_EYELID_JOINT
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_L_EYELID_JOINT_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_eyelid_joint"</i> (Java syntax) or <i>r_eyelid_joint</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyelid" target="_blank">https://en.wikipedia.org/wiki/Eyelid</a>  */
	public static final String NAME_R_EYELID_JOINT = "r_eyelid_joint";
	/** SFString jointNameValues enumeration value "<i>r_eyelid_joint</i>" has unique index 85
	 * @see #NAME_R_EYELID_JOINT */
	public static final int NAME_R_EYELID_JOINT_INDEX = 85;
	/** SFString jointNameValues enumeration value "<i>r_eyelid_joint</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_EYELID_JOINT */
	public static final int NAME_R_EYELID_JOINT_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>r_eyelid_joint</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_R_EYELID_JOINT
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_R_EYELID_JOINT_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_eyeball_joint"</i> (Java syntax) or <i>l_eyeball_joint</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eye" target="_blank">https://en.wikipedia.org/wiki/Eye</a>  */
	public static final String NAME_L_EYEBALL_JOINT = "l_eyeball_joint";
	/** SFString jointNameValues enumeration value "<i>l_eyeball_joint</i>" has unique index 86
	 * @see #NAME_L_EYEBALL_JOINT */
	public static final int NAME_L_EYEBALL_JOINT_INDEX = 86;
	/** SFString jointNameValues enumeration value "<i>l_eyeball_joint</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_EYEBALL_JOINT */
	public static final int NAME_L_EYEBALL_JOINT_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>l_eyeball_joint</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_L_EYEBALL_JOINT
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_L_EYEBALL_JOINT_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_eyeball_joint"</i> (Java syntax) or <i>r_eyeball_joint</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eye" target="_blank">https://en.wikipedia.org/wiki/Eye</a>  */
	public static final String NAME_R_EYEBALL_JOINT = "r_eyeball_joint";
	/** SFString jointNameValues enumeration value "<i>r_eyeball_joint</i>" has unique index 87
	 * @see #NAME_R_EYEBALL_JOINT */
	public static final int NAME_R_EYEBALL_JOINT_INDEX = 87;
	/** SFString jointNameValues enumeration value "<i>r_eyeball_joint</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_EYEBALL_JOINT */
	public static final int NAME_R_EYEBALL_JOINT_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>r_eyeball_joint</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_R_EYEBALL_JOINT
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_R_EYEBALL_JOINT_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_eyebrow_joint"</i> (Java syntax) or <i>l_eyebrow_joint</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyebrow" target="_blank">https://en.wikipedia.org/wiki/Eyebrow</a>  */
	public static final String NAME_L_EYEBROW_JOINT = "l_eyebrow_joint";
	/** SFString jointNameValues enumeration value "<i>l_eyebrow_joint</i>" has unique index 88
	 * @see #NAME_L_EYEBROW_JOINT */
	public static final int NAME_L_EYEBROW_JOINT_INDEX = 88;
	/** SFString jointNameValues enumeration value "<i>l_eyebrow_joint</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_L_EYEBROW_JOINT */
	public static final int NAME_L_EYEBROW_JOINT_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>l_eyebrow_joint</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_L_EYEBROW_JOINT
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_L_EYEBROW_JOINT_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_eyebrow_joint"</i> (Java syntax) or <i>r_eyebrow_joint</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Eyebrow" target="_blank">https://en.wikipedia.org/wiki/Eyebrow</a>  */
	public static final String NAME_R_EYEBROW_JOINT = "r_eyebrow_joint";
	/** SFString jointNameValues enumeration value "<i>r_eyebrow_joint</i>" has unique index 89
	 * @see #NAME_R_EYEBROW_JOINT */
	public static final int NAME_R_EYEBROW_JOINT_INDEX = 89;
	/** SFString jointNameValues enumeration value "<i>r_eyebrow_joint</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_R_EYEBROW_JOINT */
	public static final int NAME_R_EYEBROW_JOINT_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>r_eyebrow_joint</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_R_EYEBROW_JOINT
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_R_EYEBROW_JOINT_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"temporomandibular"</i> (Java syntax) or <i>temporomandibular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Temporomandibular_joint" target="_blank">https://en.wikipedia.org/wiki/Temporomandibular_joint</a>  */
	public static final String NAME_TEMPOROMANDIBULAR = "temporomandibular";
	/** SFString jointNameValues enumeration value "<i>temporomandibular</i>" has unique index 90
	 * @see #NAME_TEMPOROMANDIBULAR */
	public static final int NAME_TEMPOROMANDIBULAR_INDEX = 90;
	/** SFString jointNameValues enumeration value "<i>temporomandibular</i>" has unique Level Of Articulation loa=3
	 * @see #NAME_TEMPOROMANDIBULAR */
	public static final int NAME_TEMPOROMANDIBULAR_LOA = 3;
	/** SFString jointNameValues enumeration value "<i>temporomandibular</i>" has unique parent "<i>skullbase</i>" in HAnimJointObject
	 * @see #NAME_TEMPOROMANDIBULAR
	 * @see HAnimJointObject#NAME_SKULLBASE */
	public static final String NAME_TEMPOROMANDIBULAR_PARENT = "skullbase";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_sternoclavicular"</i> (Java syntax) or <i>l_sternoclavicular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Sternoclavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Sternoclavicular_joint</a>  */
	public static final String NAME_L_STERNOCLAVICULAR = "l_sternoclavicular";
	/** SFString jointNameValues enumeration value "<i>l_sternoclavicular</i>" has unique index 91
	 * @see #NAME_L_STERNOCLAVICULAR */
	public static final int NAME_L_STERNOCLAVICULAR_INDEX = 91;
	/** SFString jointNameValues enumeration value "<i>l_sternoclavicular</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_STERNOCLAVICULAR */
	public static final int NAME_L_STERNOCLAVICULAR_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_sternoclavicular</i>" has unique parent "<i>vc7</i>" in HAnimJointObject
	 * @see #NAME_L_STERNOCLAVICULAR
	 * @see HAnimJointObject#NAME_VC7 */
	public static final String NAME_L_STERNOCLAVICULAR_PARENT = "vc7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_acromioclavicular"</i> (Java syntax) or <i>l_acromioclavicular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Acromioclavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Acromioclavicular_joint</a>  */
	public static final String NAME_L_ACROMIOCLAVICULAR = "l_acromioclavicular";
	/** SFString jointNameValues enumeration value "<i>l_acromioclavicular</i>" has unique index 92
	 * @see #NAME_L_ACROMIOCLAVICULAR */
	public static final int NAME_L_ACROMIOCLAVICULAR_INDEX = 92;
	/** SFString jointNameValues enumeration value "<i>l_acromioclavicular</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_ACROMIOCLAVICULAR */
	public static final int NAME_L_ACROMIOCLAVICULAR_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_acromioclavicular</i>" has unique parent "<i>l_sternoclavicular</i>" in HAnimJointObject
	 * @see #NAME_L_ACROMIOCLAVICULAR
	 * @see HAnimJointObject#NAME_L_STERNOCLAVICULAR */
	public static final String NAME_L_ACROMIOCLAVICULAR_PARENT = "l_sternoclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_shoulder"</i> (Java syntax) or <i>l_shoulder</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Shoulder" target="_blank">https://en.wikipedia.org/wiki/Shoulder</a>  */
	public static final String NAME_L_SHOULDER = "l_shoulder";
	/** SFString jointNameValues enumeration value "<i>l_shoulder</i>" has unique index 93
	 * @see #NAME_L_SHOULDER */
	public static final int NAME_L_SHOULDER_INDEX = 93;
	/** SFString jointNameValues enumeration value "<i>l_shoulder</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_SHOULDER */
	public static final int NAME_L_SHOULDER_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_shoulder</i>" has unique parent "<i>l_acromioclavicular</i>" in HAnimJointObject
	 * @see #NAME_L_SHOULDER
	 * @see HAnimJointObject#NAME_L_ACROMIOCLAVICULAR */
	public static final String NAME_L_SHOULDER_PARENT = "l_acromioclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_elbow"</i> (Java syntax) or <i>l_elbow</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Elbow" target="_blank">https://en.wikipedia.org/wiki/Elbow</a>  */
	public static final String NAME_L_ELBOW = "l_elbow";
	/** SFString jointNameValues enumeration value "<i>l_elbow</i>" has unique index 94
	 * @see #NAME_L_ELBOW */
	public static final int NAME_L_ELBOW_INDEX = 94;
	/** SFString jointNameValues enumeration value "<i>l_elbow</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_ELBOW */
	public static final int NAME_L_ELBOW_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_elbow</i>" has unique parent "<i>l_shoulder</i>" in HAnimJointObject
	 * @see #NAME_L_ELBOW
	 * @see HAnimJointObject#NAME_L_SHOULDER */
	public static final String NAME_L_ELBOW_PARENT = "l_shoulder";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_radiocarpal"</i> (Java syntax) or <i>l_radiocarpal</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Wrist" target="_blank">https://en.wikipedia.org/wiki/Wrist</a>  */
	public static final String NAME_L_RADIOCARPAL = "l_radiocarpal";
	/** SFString jointNameValues enumeration value "<i>l_radiocarpal</i>" has unique index 95
	 * @see #NAME_L_RADIOCARPAL */
	public static final int NAME_L_RADIOCARPAL_INDEX = 95;
	/** SFString jointNameValues enumeration value "<i>l_radiocarpal</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_L_RADIOCARPAL */
	public static final int NAME_L_RADIOCARPAL_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>l_radiocarpal</i>" has unique parent "<i>l_elbow</i>" in HAnimJointObject
	 * @see #NAME_L_RADIOCARPAL
	 * @see HAnimJointObject#NAME_L_ELBOW */
	public static final String NAME_L_RADIOCARPAL_PARENT = "l_elbow";
	/** SFString jointNameValues enumeration value "<i>l_radiocarpal</i>" has alias "<i>l_wrist</i>"
	 * @see #NAME_L_RADIOCARPAL */
	public static final String NAME_L_RADIOCARPAL_ALIAS = "l_wrist";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_midcarpal_1"</i> (Java syntax) or <i>l_midcarpal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_L_MIDCARPAL_1 = "l_midcarpal_1";
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_1</i>" has unique index 96
	 * @see #NAME_L_MIDCARPAL_1 */
	public static final int NAME_L_MIDCARPAL_1_INDEX = 96;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_MIDCARPAL_1 */
	public static final int NAME_L_MIDCARPAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_1</i>" has unique parent "<i>l_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_L_MIDCARPAL_1
	 * @see HAnimJointObject#NAME_L_RADIOCARPAL */
	public static final String NAME_L_MIDCARPAL_1_PARENT = "l_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpometacarpal_1"</i> (Java syntax) or <i>l_carpometacarpal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_L_CARPOMETACARPAL_1 = "l_carpometacarpal_1";
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_1</i>" has unique index 97
	 * @see #NAME_L_CARPOMETACARPAL_1 */
	public static final int NAME_L_CARPOMETACARPAL_1_INDEX = 97;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPOMETACARPAL_1 */
	public static final int NAME_L_CARPOMETACARPAL_1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_1</i>" has unique parent "<i>l_midcarpal_1</i>" in HAnimJointObject
	 * @see #NAME_L_CARPOMETACARPAL_1
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_1 */
	public static final String NAME_L_CARPOMETACARPAL_1_PARENT = "l_midcarpal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metacarpophalangeal_1"</i> (Java syntax) or <i>l_metacarpophalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_L_METACARPOPHALANGEAL_1 = "l_metacarpophalangeal_1";
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_1</i>" has unique index 98
	 * @see #NAME_L_METACARPOPHALANGEAL_1 */
	public static final int NAME_L_METACARPOPHALANGEAL_1_INDEX = 98;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPOPHALANGEAL_1 */
	public static final int NAME_L_METACARPOPHALANGEAL_1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_1</i>" has unique parent "<i>l_carpometacarpal_1</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPOPHALANGEAL_1
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_1 */
	public static final String NAME_L_METACARPOPHALANGEAL_1_PARENT = "l_carpometacarpal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_interphalangeal_1"</i> (Java syntax) or <i>l_carpal_interphalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_INTERPHALANGEAL_1 = "l_carpal_interphalangeal_1";
	/** SFString jointNameValues enumeration value "<i>l_carpal_interphalangeal_1</i>" has unique index 99
	 * @see #NAME_L_CARPAL_INTERPHALANGEAL_1 */
	public static final int NAME_L_CARPAL_INTERPHALANGEAL_1_INDEX = 99;
	/** SFString jointNameValues enumeration value "<i>l_carpal_interphalangeal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_INTERPHALANGEAL_1 */
	public static final int NAME_L_CARPAL_INTERPHALANGEAL_1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_interphalangeal_1</i>" has unique parent "<i>l_metacarpophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_INTERPHALANGEAL_1
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_1 */
	public static final String NAME_L_CARPAL_INTERPHALANGEAL_1_PARENT = "l_metacarpophalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_midcarpal_2"</i> (Java syntax) or <i>l_midcarpal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_L_MIDCARPAL_2 = "l_midcarpal_2";
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_2</i>" has unique index 100
	 * @see #NAME_L_MIDCARPAL_2 */
	public static final int NAME_L_MIDCARPAL_2_INDEX = 100;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_MIDCARPAL_2 */
	public static final int NAME_L_MIDCARPAL_2_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_2</i>" has unique parent "<i>l_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_L_MIDCARPAL_2
	 * @see HAnimJointObject#NAME_L_RADIOCARPAL */
	public static final String NAME_L_MIDCARPAL_2_PARENT = "l_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpometacarpal_2"</i> (Java syntax) or <i>l_carpometacarpal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_L_CARPOMETACARPAL_2 = "l_carpometacarpal_2";
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_2</i>" has unique index 101
	 * @see #NAME_L_CARPOMETACARPAL_2 */
	public static final int NAME_L_CARPOMETACARPAL_2_INDEX = 101;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPOMETACARPAL_2 */
	public static final int NAME_L_CARPOMETACARPAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_2</i>" has unique parent "<i>l_midcarpal_2</i>" in HAnimJointObject
	 * @see #NAME_L_CARPOMETACARPAL_2
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_2 */
	public static final String NAME_L_CARPOMETACARPAL_2_PARENT = "l_midcarpal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metacarpophalangeal_2"</i> (Java syntax) or <i>l_metacarpophalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_L_METACARPOPHALANGEAL_2 = "l_metacarpophalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_2</i>" has unique index 102
	 * @see #NAME_L_METACARPOPHALANGEAL_2 */
	public static final int NAME_L_METACARPOPHALANGEAL_2_INDEX = 102;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPOPHALANGEAL_2 */
	public static final int NAME_L_METACARPOPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_2</i>" has unique parent "<i>l_carpometacarpal_2</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPOPHALANGEAL_2
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_2 */
	public static final String NAME_L_METACARPOPHALANGEAL_2_PARENT = "l_carpometacarpal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_proximal_interphalangeal_2"</i> (Java syntax) or <i>l_carpal_proximal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 = "l_carpal_proximal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_2</i>" has unique index 103
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2_INDEX = 103;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_2</i>" has unique parent "<i>l_metacarpophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_2 */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2_PARENT = "l_metacarpophalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_distal_interphalangeal_2"</i> (Java syntax) or <i>l_carpal_distal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2 = "l_carpal_distal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_2</i>" has unique index 104
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2_INDEX = 104;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_2</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2_PARENT = "l_carpal_proximal_interphalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_midcarpal_3"</i> (Java syntax) or <i>l_midcarpal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_L_MIDCARPAL_3 = "l_midcarpal_3";
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_3</i>" has unique index 105
	 * @see #NAME_L_MIDCARPAL_3 */
	public static final int NAME_L_MIDCARPAL_3_INDEX = 105;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_MIDCARPAL_3 */
	public static final int NAME_L_MIDCARPAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_3</i>" has unique parent "<i>l_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_L_MIDCARPAL_3
	 * @see HAnimJointObject#NAME_L_RADIOCARPAL */
	public static final String NAME_L_MIDCARPAL_3_PARENT = "l_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpometacarpal_3"</i> (Java syntax) or <i>l_carpometacarpal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_L_CARPOMETACARPAL_3 = "l_carpometacarpal_3";
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_3</i>" has unique index 106
	 * @see #NAME_L_CARPOMETACARPAL_3 */
	public static final int NAME_L_CARPOMETACARPAL_3_INDEX = 106;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPOMETACARPAL_3 */
	public static final int NAME_L_CARPOMETACARPAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_3</i>" has unique parent "<i>l_midcarpal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CARPOMETACARPAL_3
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_3 */
	public static final String NAME_L_CARPOMETACARPAL_3_PARENT = "l_midcarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metacarpophalangeal_3"</i> (Java syntax) or <i>l_metacarpophalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_L_METACARPOPHALANGEAL_3 = "l_metacarpophalangeal_3";
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_3</i>" has unique index 107
	 * @see #NAME_L_METACARPOPHALANGEAL_3 */
	public static final int NAME_L_METACARPOPHALANGEAL_3_INDEX = 107;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPOPHALANGEAL_3 */
	public static final int NAME_L_METACARPOPHALANGEAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_3</i>" has unique parent "<i>l_carpometacarpal_3</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPOPHALANGEAL_3
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_3 */
	public static final String NAME_L_METACARPOPHALANGEAL_3_PARENT = "l_carpometacarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_proximal_interphalangeal_3"</i> (Java syntax) or <i>l_carpal_proximal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 = "l_carpal_proximal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_3</i>" has unique index 108
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3_INDEX = 108;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_3</i>" has unique parent "<i>l_metacarpophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_3 */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3_PARENT = "l_metacarpophalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_distal_interphalangeal_3"</i> (Java syntax) or <i>l_carpal_distal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3 = "l_carpal_distal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_3</i>" has unique index 109
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3_INDEX = 109;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_3</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3_PARENT = "l_carpal_proximal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_midcarpal_4_5"</i> (Java syntax) or <i>l_midcarpal_4_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_L_MIDCARPAL_4_5 = "l_midcarpal_4_5";
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_4_5</i>" has unique index 110
	 * @see #NAME_L_MIDCARPAL_4_5 */
	public static final int NAME_L_MIDCARPAL_4_5_INDEX = 110;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_4_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_L_MIDCARPAL_4_5 */
	public static final int NAME_L_MIDCARPAL_4_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>l_midcarpal_4_5</i>" has unique parent "<i>l_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_L_MIDCARPAL_4_5
	 * @see HAnimJointObject#NAME_L_RADIOCARPAL */
	public static final String NAME_L_MIDCARPAL_4_5_PARENT = "l_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpometacarpal_4"</i> (Java syntax) or <i>l_carpometacarpal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_L_CARPOMETACARPAL_4 = "l_carpometacarpal_4";
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_4</i>" has unique index 111
	 * @see #NAME_L_CARPOMETACARPAL_4 */
	public static final int NAME_L_CARPOMETACARPAL_4_INDEX = 111;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPOMETACARPAL_4 */
	public static final int NAME_L_CARPOMETACARPAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_4</i>" has unique parent "<i>l_midcarpal_4_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPOMETACARPAL_4
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_4_5 */
	public static final String NAME_L_CARPOMETACARPAL_4_PARENT = "l_midcarpal_4_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metacarpophalangeal_4"</i> (Java syntax) or <i>l_metacarpophalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_L_METACARPOPHALANGEAL_4 = "l_metacarpophalangeal_4";
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_4</i>" has unique index 112
	 * @see #NAME_L_METACARPOPHALANGEAL_4 */
	public static final int NAME_L_METACARPOPHALANGEAL_4_INDEX = 112;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPOPHALANGEAL_4 */
	public static final int NAME_L_METACARPOPHALANGEAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_4</i>" has unique parent "<i>l_carpometacarpal_4</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPOPHALANGEAL_4
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_4 */
	public static final String NAME_L_METACARPOPHALANGEAL_4_PARENT = "l_carpometacarpal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_proximal_interphalangeal_4"</i> (Java syntax) or <i>l_carpal_proximal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 = "l_carpal_proximal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_4</i>" has unique index 113
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4_INDEX = 113;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_4</i>" has unique parent "<i>l_metacarpophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_4 */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4_PARENT = "l_metacarpophalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_distal_interphalangeal_4"</i> (Java syntax) or <i>l_carpal_distal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4 = "l_carpal_distal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_4</i>" has unique index 114
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4_INDEX = 114;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_4</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4_PARENT = "l_carpal_proximal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpometacarpal_5"</i> (Java syntax) or <i>l_carpometacarpal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_L_CARPOMETACARPAL_5 = "l_carpometacarpal_5";
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_5</i>" has unique index 115
	 * @see #NAME_L_CARPOMETACARPAL_5 */
	public static final int NAME_L_CARPOMETACARPAL_5_INDEX = 115;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPOMETACARPAL_5 */
	public static final int NAME_L_CARPOMETACARPAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpometacarpal_5</i>" has unique parent "<i>l_midcarpal_4_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPOMETACARPAL_5
	 * @see HAnimJointObject#NAME_L_MIDCARPAL_4_5 */
	public static final String NAME_L_CARPOMETACARPAL_5_PARENT = "l_midcarpal_4_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_metacarpophalangeal_5"</i> (Java syntax) or <i>l_metacarpophalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_L_METACARPOPHALANGEAL_5 = "l_metacarpophalangeal_5";
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_5</i>" has unique index 116
	 * @see #NAME_L_METACARPOPHALANGEAL_5 */
	public static final int NAME_L_METACARPOPHALANGEAL_5_INDEX = 116;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_METACARPOPHALANGEAL_5 */
	public static final int NAME_L_METACARPOPHALANGEAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_metacarpophalangeal_5</i>" has unique parent "<i>l_carpometacarpal_5</i>" in HAnimJointObject
	 * @see #NAME_L_METACARPOPHALANGEAL_5
	 * @see HAnimJointObject#NAME_L_CARPOMETACARPAL_5 */
	public static final String NAME_L_METACARPOPHALANGEAL_5_PARENT = "l_carpometacarpal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_proximal_interphalangeal_5"</i> (Java syntax) or <i>l_carpal_proximal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 = "l_carpal_proximal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_5</i>" has unique index 117
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5_INDEX = 117;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_proximal_interphalangeal_5</i>" has unique parent "<i>l_metacarpophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_L_METACARPOPHALANGEAL_5 */
	public static final String NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5_PARENT = "l_metacarpophalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"l_carpal_distal_interphalangeal_5"</i> (Java syntax) or <i>l_carpal_distal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5 = "l_carpal_distal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_5</i>" has unique index 118
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5_INDEX = 118;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>l_carpal_distal_interphalangeal_5</i>" has unique parent "<i>l_carpal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5_PARENT = "l_carpal_proximal_interphalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_sternoclavicular"</i> (Java syntax) or <i>r_sternoclavicular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Sternoclavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Sternoclavicular_joint</a>  */
	public static final String NAME_R_STERNOCLAVICULAR = "r_sternoclavicular";
	/** SFString jointNameValues enumeration value "<i>r_sternoclavicular</i>" has unique index 119
	 * @see #NAME_R_STERNOCLAVICULAR */
	public static final int NAME_R_STERNOCLAVICULAR_INDEX = 119;
	/** SFString jointNameValues enumeration value "<i>r_sternoclavicular</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_STERNOCLAVICULAR */
	public static final int NAME_R_STERNOCLAVICULAR_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_sternoclavicular</i>" has unique parent "<i>vc7</i>" in HAnimJointObject
	 * @see #NAME_R_STERNOCLAVICULAR
	 * @see HAnimJointObject#NAME_VC7 */
	public static final String NAME_R_STERNOCLAVICULAR_PARENT = "vc7";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_acromioclavicular"</i> (Java syntax) or <i>r_acromioclavicular</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Acromioclavicular_joint" target="_blank">https://en.wikipedia.org/wiki/Acromioclavicular_joint</a>  */
	public static final String NAME_R_ACROMIOCLAVICULAR = "r_acromioclavicular";
	/** SFString jointNameValues enumeration value "<i>r_acromioclavicular</i>" has unique index 120
	 * @see #NAME_R_ACROMIOCLAVICULAR */
	public static final int NAME_R_ACROMIOCLAVICULAR_INDEX = 120;
	/** SFString jointNameValues enumeration value "<i>r_acromioclavicular</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_ACROMIOCLAVICULAR */
	public static final int NAME_R_ACROMIOCLAVICULAR_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_acromioclavicular</i>" has unique parent "<i>r_sternoclavicular</i>" in HAnimJointObject
	 * @see #NAME_R_ACROMIOCLAVICULAR
	 * @see HAnimJointObject#NAME_R_STERNOCLAVICULAR */
	public static final String NAME_R_ACROMIOCLAVICULAR_PARENT = "r_sternoclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_shoulder"</i> (Java syntax) or <i>r_shoulder</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Shoulder" target="_blank">https://en.wikipedia.org/wiki/Shoulder</a>  */
	public static final String NAME_R_SHOULDER = "r_shoulder";
	/** SFString jointNameValues enumeration value "<i>r_shoulder</i>" has unique index 121
	 * @see #NAME_R_SHOULDER */
	public static final int NAME_R_SHOULDER_INDEX = 121;
	/** SFString jointNameValues enumeration value "<i>r_shoulder</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_SHOULDER */
	public static final int NAME_R_SHOULDER_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_shoulder</i>" has unique parent "<i>r_acromioclavicular</i>" in HAnimJointObject
	 * @see #NAME_R_SHOULDER
	 * @see HAnimJointObject#NAME_R_ACROMIOCLAVICULAR */
	public static final String NAME_R_SHOULDER_PARENT = "r_acromioclavicular";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_elbow"</i> (Java syntax) or <i>r_elbow</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Elbow" target="_blank">https://en.wikipedia.org/wiki/Elbow</a>  */
	public static final String NAME_R_ELBOW = "r_elbow";
	/** SFString jointNameValues enumeration value "<i>r_elbow</i>" has unique index 122
	 * @see #NAME_R_ELBOW */
	public static final int NAME_R_ELBOW_INDEX = 122;
	/** SFString jointNameValues enumeration value "<i>r_elbow</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_ELBOW */
	public static final int NAME_R_ELBOW_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_elbow</i>" has unique parent "<i>r_shoulder</i>" in HAnimJointObject
	 * @see #NAME_R_ELBOW
	 * @see HAnimJointObject#NAME_R_SHOULDER */
	public static final String NAME_R_ELBOW_PARENT = "r_shoulder";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_radiocarpal"</i> (Java syntax) or <i>r_radiocarpal</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Wrist" target="_blank">https://en.wikipedia.org/wiki/Wrist</a>  */
	public static final String NAME_R_RADIOCARPAL = "r_radiocarpal";
	/** SFString jointNameValues enumeration value "<i>r_radiocarpal</i>" has unique index 123
	 * @see #NAME_R_RADIOCARPAL */
	public static final int NAME_R_RADIOCARPAL_INDEX = 123;
	/** SFString jointNameValues enumeration value "<i>r_radiocarpal</i>" has unique Level Of Articulation loa=1
	 * @see #NAME_R_RADIOCARPAL */
	public static final int NAME_R_RADIOCARPAL_LOA = 1;
	/** SFString jointNameValues enumeration value "<i>r_radiocarpal</i>" has unique parent "<i>r_elbow</i>" in HAnimJointObject
	 * @see #NAME_R_RADIOCARPAL
	 * @see HAnimJointObject#NAME_R_ELBOW */
	public static final String NAME_R_RADIOCARPAL_PARENT = "r_elbow";
	/** SFString jointNameValues enumeration value "<i>r_radiocarpal</i>" has alias "<i>r_wrist</i>"
	 * @see #NAME_R_RADIOCARPAL */
	public static final String NAME_R_RADIOCARPAL_ALIAS = "r_wrist";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_midcarpal_1"</i> (Java syntax) or <i>r_midcarpal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_R_MIDCARPAL_1 = "r_midcarpal_1";
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_1</i>" has unique index 124
	 * @see #NAME_R_MIDCARPAL_1 */
	public static final int NAME_R_MIDCARPAL_1_INDEX = 124;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_1</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_MIDCARPAL_1 */
	public static final int NAME_R_MIDCARPAL_1_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_1</i>" has unique parent "<i>r_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_R_MIDCARPAL_1
	 * @see HAnimJointObject#NAME_R_RADIOCARPAL */
	public static final String NAME_R_MIDCARPAL_1_PARENT = "r_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpometacarpal_1"</i> (Java syntax) or <i>r_carpometacarpal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_R_CARPOMETACARPAL_1 = "r_carpometacarpal_1";
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_1</i>" has unique index 125
	 * @see #NAME_R_CARPOMETACARPAL_1 */
	public static final int NAME_R_CARPOMETACARPAL_1_INDEX = 125;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPOMETACARPAL_1 */
	public static final int NAME_R_CARPOMETACARPAL_1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_1</i>" has unique parent "<i>r_midcarpal_1</i>" in HAnimJointObject
	 * @see #NAME_R_CARPOMETACARPAL_1
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_1 */
	public static final String NAME_R_CARPOMETACARPAL_1_PARENT = "r_midcarpal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metacarpophalangeal_1"</i> (Java syntax) or <i>r_metacarpophalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_R_METACARPOPHALANGEAL_1 = "r_metacarpophalangeal_1";
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_1</i>" has unique index 126
	 * @see #NAME_R_METACARPOPHALANGEAL_1 */
	public static final int NAME_R_METACARPOPHALANGEAL_1_INDEX = 126;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPOPHALANGEAL_1 */
	public static final int NAME_R_METACARPOPHALANGEAL_1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_1</i>" has unique parent "<i>r_carpometacarpal_1</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPOPHALANGEAL_1
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_1 */
	public static final String NAME_R_METACARPOPHALANGEAL_1_PARENT = "r_carpometacarpal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_interphalangeal_1"</i> (Java syntax) or <i>r_carpal_interphalangeal_1</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_INTERPHALANGEAL_1 = "r_carpal_interphalangeal_1";
	/** SFString jointNameValues enumeration value "<i>r_carpal_interphalangeal_1</i>" has unique index 127
	 * @see #NAME_R_CARPAL_INTERPHALANGEAL_1 */
	public static final int NAME_R_CARPAL_INTERPHALANGEAL_1_INDEX = 127;
	/** SFString jointNameValues enumeration value "<i>r_carpal_interphalangeal_1</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_INTERPHALANGEAL_1 */
	public static final int NAME_R_CARPAL_INTERPHALANGEAL_1_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_interphalangeal_1</i>" has unique parent "<i>r_metacarpophalangeal_1</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_INTERPHALANGEAL_1
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_1 */
	public static final String NAME_R_CARPAL_INTERPHALANGEAL_1_PARENT = "r_metacarpophalangeal_1";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_midcarpal_2"</i> (Java syntax) or <i>r_midcarpal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_R_MIDCARPAL_2 = "r_midcarpal_2";
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_2</i>" has unique index 128
	 * @see #NAME_R_MIDCARPAL_2 */
	public static final int NAME_R_MIDCARPAL_2_INDEX = 128;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_2</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_MIDCARPAL_2 */
	public static final int NAME_R_MIDCARPAL_2_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_2</i>" has unique parent "<i>r_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_R_MIDCARPAL_2
	 * @see HAnimJointObject#NAME_R_RADIOCARPAL */
	public static final String NAME_R_MIDCARPAL_2_PARENT = "r_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpometacarpal_2"</i> (Java syntax) or <i>r_carpometacarpal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_R_CARPOMETACARPAL_2 = "r_carpometacarpal_2";
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_2</i>" has unique index 129
	 * @see #NAME_R_CARPOMETACARPAL_2 */
	public static final int NAME_R_CARPOMETACARPAL_2_INDEX = 129;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPOMETACARPAL_2 */
	public static final int NAME_R_CARPOMETACARPAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_2</i>" has unique parent "<i>r_midcarpal_2</i>" in HAnimJointObject
	 * @see #NAME_R_CARPOMETACARPAL_2
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_2 */
	public static final String NAME_R_CARPOMETACARPAL_2_PARENT = "r_midcarpal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metacarpophalangeal_2"</i> (Java syntax) or <i>r_metacarpophalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_R_METACARPOPHALANGEAL_2 = "r_metacarpophalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_2</i>" has unique index 130
	 * @see #NAME_R_METACARPOPHALANGEAL_2 */
	public static final int NAME_R_METACARPOPHALANGEAL_2_INDEX = 130;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPOPHALANGEAL_2 */
	public static final int NAME_R_METACARPOPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_2</i>" has unique parent "<i>r_carpometacarpal_2</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPOPHALANGEAL_2
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_2 */
	public static final String NAME_R_METACARPOPHALANGEAL_2_PARENT = "r_carpometacarpal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_proximal_interphalangeal_2"</i> (Java syntax) or <i>r_carpal_proximal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 = "r_carpal_proximal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_2</i>" has unique index 131
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2_INDEX = 131;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_2</i>" has unique parent "<i>r_metacarpophalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_2 */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2_PARENT = "r_metacarpophalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_distal_interphalangeal_2"</i> (Java syntax) or <i>r_carpal_distal_interphalangeal_2</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2 = "r_carpal_distal_interphalangeal_2";
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_2</i>" has unique index 132
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2_INDEX = 132;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_2</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_2</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_2</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2_PARENT = "r_carpal_proximal_interphalangeal_2";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_midcarpal_3"</i> (Java syntax) or <i>r_midcarpal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_R_MIDCARPAL_3 = "r_midcarpal_3";
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_3</i>" has unique index 133
	 * @see #NAME_R_MIDCARPAL_3 */
	public static final int NAME_R_MIDCARPAL_3_INDEX = 133;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_3</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_MIDCARPAL_3 */
	public static final int NAME_R_MIDCARPAL_3_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_3</i>" has unique parent "<i>r_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_R_MIDCARPAL_3
	 * @see HAnimJointObject#NAME_R_RADIOCARPAL */
	public static final String NAME_R_MIDCARPAL_3_PARENT = "r_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpometacarpal_3"</i> (Java syntax) or <i>r_carpometacarpal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_R_CARPOMETACARPAL_3 = "r_carpometacarpal_3";
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_3</i>" has unique index 134
	 * @see #NAME_R_CARPOMETACARPAL_3 */
	public static final int NAME_R_CARPOMETACARPAL_3_INDEX = 134;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPOMETACARPAL_3 */
	public static final int NAME_R_CARPOMETACARPAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_3</i>" has unique parent "<i>r_midcarpal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CARPOMETACARPAL_3
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_3 */
	public static final String NAME_R_CARPOMETACARPAL_3_PARENT = "r_midcarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metacarpophalangeal_3"</i> (Java syntax) or <i>r_metacarpophalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_R_METACARPOPHALANGEAL_3 = "r_metacarpophalangeal_3";
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_3</i>" has unique index 135
	 * @see #NAME_R_METACARPOPHALANGEAL_3 */
	public static final int NAME_R_METACARPOPHALANGEAL_3_INDEX = 135;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPOPHALANGEAL_3 */
	public static final int NAME_R_METACARPOPHALANGEAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_3</i>" has unique parent "<i>r_carpometacarpal_3</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPOPHALANGEAL_3
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_3 */
	public static final String NAME_R_METACARPOPHALANGEAL_3_PARENT = "r_carpometacarpal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_proximal_interphalangeal_3"</i> (Java syntax) or <i>r_carpal_proximal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 = "r_carpal_proximal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_3</i>" has unique index 136
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3_INDEX = 136;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_3</i>" has unique parent "<i>r_metacarpophalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_3 */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3_PARENT = "r_metacarpophalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_distal_interphalangeal_3"</i> (Java syntax) or <i>r_carpal_distal_interphalangeal_3</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3 = "r_carpal_distal_interphalangeal_3";
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_3</i>" has unique index 137
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3_INDEX = 137;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_3</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_3</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_3</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3_PARENT = "r_carpal_proximal_interphalangeal_3";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_midcarpal_4_5"</i> (Java syntax) or <i>r_midcarpal_4_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Midcarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Midcarpal_joint</a>  */
	public static final String NAME_R_MIDCARPAL_4_5 = "r_midcarpal_4_5";
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_4_5</i>" has unique index 138
	 * @see #NAME_R_MIDCARPAL_4_5 */
	public static final int NAME_R_MIDCARPAL_4_5_INDEX = 138;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_4_5</i>" has unique Level Of Articulation loa=4
	 * @see #NAME_R_MIDCARPAL_4_5 */
	public static final int NAME_R_MIDCARPAL_4_5_LOA = 4;
	/** SFString jointNameValues enumeration value "<i>r_midcarpal_4_5</i>" has unique parent "<i>r_radiocarpal</i>" in HAnimJointObject
	 * @see #NAME_R_MIDCARPAL_4_5
	 * @see HAnimJointObject#NAME_R_RADIOCARPAL */
	public static final String NAME_R_MIDCARPAL_4_5_PARENT = "r_radiocarpal";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpometacarpal_4"</i> (Java syntax) or <i>r_carpometacarpal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_R_CARPOMETACARPAL_4 = "r_carpometacarpal_4";
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_4</i>" has unique index 139
	 * @see #NAME_R_CARPOMETACARPAL_4 */
	public static final int NAME_R_CARPOMETACARPAL_4_INDEX = 139;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPOMETACARPAL_4 */
	public static final int NAME_R_CARPOMETACARPAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_4</i>" has unique parent "<i>r_midcarpal_4_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPOMETACARPAL_4
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_4_5 */
	public static final String NAME_R_CARPOMETACARPAL_4_PARENT = "r_midcarpal_4_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metacarpophalangeal_4"</i> (Java syntax) or <i>r_metacarpophalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_R_METACARPOPHALANGEAL_4 = "r_metacarpophalangeal_4";
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_4</i>" has unique index 140
	 * @see #NAME_R_METACARPOPHALANGEAL_4 */
	public static final int NAME_R_METACARPOPHALANGEAL_4_INDEX = 140;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPOPHALANGEAL_4 */
	public static final int NAME_R_METACARPOPHALANGEAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_4</i>" has unique parent "<i>r_carpometacarpal_4</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPOPHALANGEAL_4
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_4 */
	public static final String NAME_R_METACARPOPHALANGEAL_4_PARENT = "r_carpometacarpal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_proximal_interphalangeal_4"</i> (Java syntax) or <i>r_carpal_proximal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 = "r_carpal_proximal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_4</i>" has unique index 141
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4_INDEX = 141;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_4</i>" has unique parent "<i>r_metacarpophalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_4 */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4_PARENT = "r_metacarpophalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_distal_interphalangeal_4"</i> (Java syntax) or <i>r_carpal_distal_interphalangeal_4</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4 = "r_carpal_distal_interphalangeal_4";
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_4</i>" has unique index 142
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4_INDEX = 142;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_4</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_4</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_4</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4_PARENT = "r_carpal_proximal_interphalangeal_4";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpometacarpal_5"</i> (Java syntax) or <i>r_carpometacarpal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Carpometacarpal_joint" target="_blank">https://en.wikipedia.org/wiki/Carpometacarpal_joint</a>  */
	public static final String NAME_R_CARPOMETACARPAL_5 = "r_carpometacarpal_5";
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_5</i>" has unique index 143
	 * @see #NAME_R_CARPOMETACARPAL_5 */
	public static final int NAME_R_CARPOMETACARPAL_5_INDEX = 143;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPOMETACARPAL_5 */
	public static final int NAME_R_CARPOMETACARPAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpometacarpal_5</i>" has unique parent "<i>r_midcarpal_4_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPOMETACARPAL_5
	 * @see HAnimJointObject#NAME_R_MIDCARPAL_4_5 */
	public static final String NAME_R_CARPOMETACARPAL_5_PARENT = "r_midcarpal_4_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_metacarpophalangeal_5"</i> (Java syntax) or <i>r_metacarpophalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Metacarpophalangeal_joint" target="_blank">https://en.wikipedia.org/wiki/Metacarpophalangeal_joint</a>  */
	public static final String NAME_R_METACARPOPHALANGEAL_5 = "r_metacarpophalangeal_5";
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_5</i>" has unique index 144
	 * @see #NAME_R_METACARPOPHALANGEAL_5 */
	public static final int NAME_R_METACARPOPHALANGEAL_5_INDEX = 144;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_METACARPOPHALANGEAL_5 */
	public static final int NAME_R_METACARPOPHALANGEAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_metacarpophalangeal_5</i>" has unique parent "<i>r_carpometacarpal_5</i>" in HAnimJointObject
	 * @see #NAME_R_METACARPOPHALANGEAL_5
	 * @see HAnimJointObject#NAME_R_CARPOMETACARPAL_5 */
	public static final String NAME_R_METACARPOPHALANGEAL_5_PARENT = "r_carpometacarpal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_proximal_interphalangeal_5"</i> (Java syntax) or <i>r_carpal_proximal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 = "r_carpal_proximal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_5</i>" has unique index 145
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5_INDEX = 145;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_proximal_interphalangeal_5</i>" has unique parent "<i>r_metacarpophalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_R_METACARPOPHALANGEAL_5 */
	public static final String NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5_PARENT = "r_metacarpophalangeal_5";

	/** SFString field named <i>name</i> with X3DUOM baseType <i>jointNameValues</i> can equal this value <i>"r_carpal_distal_interphalangeal_5"</i> (Java syntax) or <i>r_carpal_distal_interphalangeal_5</i> (XML syntax).
	 * @see #jointNameValues
	 * @see  <a href="https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand" target="_blank">https://en.wikipedia.org/wiki/Interphalangeal_joints_of_the_hand</a>  */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5 = "r_carpal_distal_interphalangeal_5";
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_5</i>" has unique index 146
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5_INDEX = 146;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_5</i>" has unique Level Of Articulation loa=2
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5 */
	public static final int NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5_LOA = 2;
	/** SFString jointNameValues enumeration value "<i>r_carpal_distal_interphalangeal_5</i>" has unique parent "<i>r_carpal_proximal_interphalangeal_5</i>" in HAnimJointObject
	 * @see #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5
	 * @see HAnimJointObject#NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 */
	public static final String NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5_PARENT = "r_carpal_proximal_interphalangeal_5";

	// special enumeration utility methods

	/** Get index for this jointName
	 * @param jointName of interest
	 * @return index value, otherwise -1 if not found
	 */
	public static int getJointNameIndex(String jointName)
	{
		if      (jointName.equalsIgnoreCase(NAME_HUMANOID_ROOT)) return NAME_HUMANOID_ROOT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_SACROILIAC)) return NAME_SACROILIAC_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_HIP)) return NAME_L_HIP_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_KNEE)) return NAME_L_KNEE_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCRURAL)) return NAME_L_TALOCRURAL_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCALCANEONAVICULAR)) return NAME_L_TALOCALCANEONAVICULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_1)) return NAME_L_CUNEONAVICULAR_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_1)) return NAME_L_TARSOMETATARSAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_1)) return NAME_L_METATARSOPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_INTERPHALANGEAL_1)) return NAME_L_TARSAL_INTERPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_2)) return NAME_L_CUNEONAVICULAR_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_2)) return NAME_L_TARSOMETATARSAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_2)) return NAME_L_METATARSOPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_3)) return NAME_L_CUNEONAVICULAR_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_3)) return NAME_L_TARSOMETATARSAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_3)) return NAME_L_METATARSOPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CALCANEOCUBOID)) return NAME_L_CALCANEOCUBOID_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TRANSVERSETARSAL)) return NAME_L_TRANSVERSETARSAL_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_4)) return NAME_L_TARSOMETATARSAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_4)) return NAME_L_METATARSOPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_5)) return NAME_L_TARSOMETATARSAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_5)) return NAME_L_METATARSOPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_HIP)) return NAME_R_HIP_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_KNEE)) return NAME_R_KNEE_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCRURAL)) return NAME_R_TALOCRURAL_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCALCANEONAVICULAR)) return NAME_R_TALOCALCANEONAVICULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_1)) return NAME_R_CUNEONAVICULAR_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_1)) return NAME_R_TARSOMETATARSAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_1)) return NAME_R_METATARSOPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_INTERPHALANGEAL_1)) return NAME_R_TARSAL_INTERPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_2)) return NAME_R_CUNEONAVICULAR_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_2)) return NAME_R_TARSOMETATARSAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_2)) return NAME_R_METATARSOPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_3)) return NAME_R_CUNEONAVICULAR_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_3)) return NAME_R_TARSOMETATARSAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_3)) return NAME_R_METATARSOPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CALCANEOCUBOID)) return NAME_R_CALCANEOCUBOID_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TRANSVERSETARSAL)) return NAME_R_TRANSVERSETARSAL_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_4)) return NAME_R_TARSOMETATARSAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_4)) return NAME_R_METATARSOPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_5)) return NAME_R_TARSOMETATARSAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_5)) return NAME_R_METATARSOPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VL5)) return NAME_VL5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VL4)) return NAME_VL4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VL3)) return NAME_VL3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VL2)) return NAME_VL2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VL1)) return NAME_VL1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT12)) return NAME_VT12_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT11)) return NAME_VT11_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT10)) return NAME_VT10_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT9)) return NAME_VT9_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT8)) return NAME_VT8_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT7)) return NAME_VT7_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT6)) return NAME_VT6_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT5)) return NAME_VT5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT4)) return NAME_VT4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT3)) return NAME_VT3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT2)) return NAME_VT2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VT1)) return NAME_VT1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC7)) return NAME_VC7_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC6)) return NAME_VC6_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC5)) return NAME_VC5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC4)) return NAME_VC4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC3)) return NAME_VC3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC2)) return NAME_VC2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_VC1)) return NAME_VC1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_SKULLBASE)) return NAME_SKULLBASE_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_EYELID_JOINT)) return NAME_L_EYELID_JOINT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_EYELID_JOINT)) return NAME_R_EYELID_JOINT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_EYEBALL_JOINT)) return NAME_L_EYEBALL_JOINT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_EYEBALL_JOINT)) return NAME_R_EYEBALL_JOINT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_EYEBROW_JOINT)) return NAME_L_EYEBROW_JOINT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_EYEBROW_JOINT)) return NAME_R_EYEBROW_JOINT_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_TEMPOROMANDIBULAR)) return NAME_TEMPOROMANDIBULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_STERNOCLAVICULAR)) return NAME_L_STERNOCLAVICULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_ACROMIOCLAVICULAR)) return NAME_L_ACROMIOCLAVICULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_SHOULDER)) return NAME_L_SHOULDER_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_ELBOW)) return NAME_L_ELBOW_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_RADIOCARPAL)) return NAME_L_RADIOCARPAL_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_1)) return NAME_L_MIDCARPAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_1)) return NAME_L_CARPOMETACARPAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_1)) return NAME_L_METACARPOPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_INTERPHALANGEAL_1)) return NAME_L_CARPAL_INTERPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_2)) return NAME_L_MIDCARPAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_2)) return NAME_L_CARPOMETACARPAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_2)) return NAME_L_METACARPOPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_3)) return NAME_L_MIDCARPAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_3)) return NAME_L_CARPOMETACARPAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_3)) return NAME_L_METACARPOPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_4_5)) return NAME_L_MIDCARPAL_4_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_4)) return NAME_L_CARPOMETACARPAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_4)) return NAME_L_METACARPOPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_5)) return NAME_L_CARPOMETACARPAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_5)) return NAME_L_METACARPOPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_STERNOCLAVICULAR)) return NAME_R_STERNOCLAVICULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_ACROMIOCLAVICULAR)) return NAME_R_ACROMIOCLAVICULAR_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_SHOULDER)) return NAME_R_SHOULDER_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_ELBOW)) return NAME_R_ELBOW_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_RADIOCARPAL)) return NAME_R_RADIOCARPAL_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_1)) return NAME_R_MIDCARPAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_1)) return NAME_R_CARPOMETACARPAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_1)) return NAME_R_METACARPOPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_INTERPHALANGEAL_1)) return NAME_R_CARPAL_INTERPHALANGEAL_1_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_2)) return NAME_R_MIDCARPAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_2)) return NAME_R_CARPOMETACARPAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_2)) return NAME_R_METACARPOPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_3)) return NAME_R_MIDCARPAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_3)) return NAME_R_CARPOMETACARPAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_3)) return NAME_R_METACARPOPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_4_5)) return NAME_R_MIDCARPAL_4_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_4)) return NAME_R_CARPOMETACARPAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_4)) return NAME_R_METACARPOPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_5)) return NAME_R_CARPOMETACARPAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_5)) return NAME_R_METACARPOPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5_INDEX;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5_INDEX;
		else return -1; // not found
	}
	/** Whether an index exists for this jointName
	 * @param jointName of interest
	 * @return true if found
	 */
	public static boolean hasJointNameIndex(String jointName)
	{
		return (getJointNameIndex(jointName) > -1);
	}

	/** Get Level of Articulation (loa) for this jointName
	 * @param jointName of interest
	 * @return loa value, otherwise -1 if not found
	 */
	public static int getJointNameLoa(String jointName)
	{
		if      (jointName.equalsIgnoreCase(NAME_HUMANOID_ROOT)) return NAME_HUMANOID_ROOT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_SACROILIAC)) return NAME_SACROILIAC_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_HIP)) return NAME_L_HIP_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_KNEE)) return NAME_L_KNEE_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCRURAL)) return NAME_L_TALOCRURAL_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCALCANEONAVICULAR)) return NAME_L_TALOCALCANEONAVICULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_1)) return NAME_L_CUNEONAVICULAR_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_1)) return NAME_L_TARSOMETATARSAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_1)) return NAME_L_METATARSOPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_INTERPHALANGEAL_1)) return NAME_L_TARSAL_INTERPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_2)) return NAME_L_CUNEONAVICULAR_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_2)) return NAME_L_TARSOMETATARSAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_2)) return NAME_L_METATARSOPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_3)) return NAME_L_CUNEONAVICULAR_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_3)) return NAME_L_TARSOMETATARSAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_3)) return NAME_L_METATARSOPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CALCANEOCUBOID)) return NAME_L_CALCANEOCUBOID_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TRANSVERSETARSAL)) return NAME_L_TRANSVERSETARSAL_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_4)) return NAME_L_TARSOMETATARSAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_4)) return NAME_L_METATARSOPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_5)) return NAME_L_TARSOMETATARSAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_5)) return NAME_L_METATARSOPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_HIP)) return NAME_R_HIP_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_KNEE)) return NAME_R_KNEE_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCRURAL)) return NAME_R_TALOCRURAL_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCALCANEONAVICULAR)) return NAME_R_TALOCALCANEONAVICULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_1)) return NAME_R_CUNEONAVICULAR_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_1)) return NAME_R_TARSOMETATARSAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_1)) return NAME_R_METATARSOPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_INTERPHALANGEAL_1)) return NAME_R_TARSAL_INTERPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_2)) return NAME_R_CUNEONAVICULAR_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_2)) return NAME_R_TARSOMETATARSAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_2)) return NAME_R_METATARSOPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_3)) return NAME_R_CUNEONAVICULAR_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_3)) return NAME_R_TARSOMETATARSAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_3)) return NAME_R_METATARSOPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CALCANEOCUBOID)) return NAME_R_CALCANEOCUBOID_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TRANSVERSETARSAL)) return NAME_R_TRANSVERSETARSAL_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_4)) return NAME_R_TARSOMETATARSAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_4)) return NAME_R_METATARSOPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_5)) return NAME_R_TARSOMETATARSAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_5)) return NAME_R_METATARSOPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VL5)) return NAME_VL5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VL4)) return NAME_VL4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VL3)) return NAME_VL3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VL2)) return NAME_VL2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VL1)) return NAME_VL1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT12)) return NAME_VT12_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT11)) return NAME_VT11_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT10)) return NAME_VT10_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT9)) return NAME_VT9_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT8)) return NAME_VT8_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT7)) return NAME_VT7_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT6)) return NAME_VT6_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT5)) return NAME_VT5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT4)) return NAME_VT4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT3)) return NAME_VT3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT2)) return NAME_VT2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VT1)) return NAME_VT1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC7)) return NAME_VC7_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC6)) return NAME_VC6_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC5)) return NAME_VC5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC4)) return NAME_VC4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC3)) return NAME_VC3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC2)) return NAME_VC2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_VC1)) return NAME_VC1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_SKULLBASE)) return NAME_SKULLBASE_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_EYELID_JOINT)) return NAME_L_EYELID_JOINT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_EYELID_JOINT)) return NAME_R_EYELID_JOINT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_EYEBALL_JOINT)) return NAME_L_EYEBALL_JOINT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_EYEBALL_JOINT)) return NAME_R_EYEBALL_JOINT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_EYEBROW_JOINT)) return NAME_L_EYEBROW_JOINT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_EYEBROW_JOINT)) return NAME_R_EYEBROW_JOINT_LOA;
		else if (jointName.equalsIgnoreCase(NAME_TEMPOROMANDIBULAR)) return NAME_TEMPOROMANDIBULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_STERNOCLAVICULAR)) return NAME_L_STERNOCLAVICULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_ACROMIOCLAVICULAR)) return NAME_L_ACROMIOCLAVICULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_SHOULDER)) return NAME_L_SHOULDER_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_ELBOW)) return NAME_L_ELBOW_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_RADIOCARPAL)) return NAME_L_RADIOCARPAL_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_1)) return NAME_L_MIDCARPAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_1)) return NAME_L_CARPOMETACARPAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_1)) return NAME_L_METACARPOPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_INTERPHALANGEAL_1)) return NAME_L_CARPAL_INTERPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_2)) return NAME_L_MIDCARPAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_2)) return NAME_L_CARPOMETACARPAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_2)) return NAME_L_METACARPOPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_3)) return NAME_L_MIDCARPAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_3)) return NAME_L_CARPOMETACARPAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_3)) return NAME_L_METACARPOPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_4_5)) return NAME_L_MIDCARPAL_4_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_4)) return NAME_L_CARPOMETACARPAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_4)) return NAME_L_METACARPOPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_5)) return NAME_L_CARPOMETACARPAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_5)) return NAME_L_METACARPOPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_STERNOCLAVICULAR)) return NAME_R_STERNOCLAVICULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_ACROMIOCLAVICULAR)) return NAME_R_ACROMIOCLAVICULAR_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_SHOULDER)) return NAME_R_SHOULDER_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_ELBOW)) return NAME_R_ELBOW_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_RADIOCARPAL)) return NAME_R_RADIOCARPAL_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_1)) return NAME_R_MIDCARPAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_1)) return NAME_R_CARPOMETACARPAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_1)) return NAME_R_METACARPOPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_INTERPHALANGEAL_1)) return NAME_R_CARPAL_INTERPHALANGEAL_1_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_2)) return NAME_R_MIDCARPAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_2)) return NAME_R_CARPOMETACARPAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_2)) return NAME_R_METACARPOPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_3)) return NAME_R_MIDCARPAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_3)) return NAME_R_CARPOMETACARPAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_3)) return NAME_R_METACARPOPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_4_5)) return NAME_R_MIDCARPAL_4_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_4)) return NAME_R_CARPOMETACARPAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_4)) return NAME_R_METACARPOPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_5)) return NAME_R_CARPOMETACARPAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_5)) return NAME_R_METACARPOPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5_LOA;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5_LOA;
		else return -1; // not found
	}
	/** Whether an loa exists for this jointName
	 * @param jointName of interest
	 * @return true if found
	 */
	public static boolean hasJointNameLoa(String jointName)
	{
		return (getJointNameLoa(jointName) > -1);
	}

	/** Get alias for this jointName
	 * @param jointName of interest
	 * @return alias value, otherwise empty string if not found
	 */
	public static String getJointNameAlias(String jointName)
	{
		if      (jointName.equalsIgnoreCase(NAME_SACROILIAC)) return NAME_SACROILIAC_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCRURAL)) return NAME_L_TALOCRURAL_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCALCANEONAVICULAR)) return NAME_L_TALOCALCANEONAVICULAR_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_1)) return NAME_L_CUNEONAVICULAR_1_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_2)) return NAME_L_CUNEONAVICULAR_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_2)) return NAME_L_TARSOMETATARSAL_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_2)) return NAME_L_METATARSOPHALANGEAL_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_3)) return NAME_L_CUNEONAVICULAR_3_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_CALCANEOCUBOID)) return NAME_L_CALCANEOCUBOID_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCRURAL)) return NAME_R_TALOCRURAL_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCALCANEONAVICULAR)) return NAME_R_TALOCALCANEONAVICULAR_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_1)) return NAME_R_CUNEONAVICULAR_1_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_2)) return NAME_R_CUNEONAVICULAR_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_2)) return NAME_R_TARSOMETATARSAL_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_2)) return NAME_R_METATARSOPHALANGEAL_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_3)) return NAME_R_CUNEONAVICULAR_3_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_CALCANEOCUBOID)) return NAME_R_CALCANEOCUBOID_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_L_RADIOCARPAL)) return NAME_L_RADIOCARPAL_ALIAS;
		else if (jointName.equalsIgnoreCase(NAME_R_RADIOCARPAL)) return NAME_R_RADIOCARPAL_ALIAS;
		else return ""; // not found
	}
	/** Whether a alias exists for this jointName
	 * @param jointName of interest
	 * @return true if found
	 */
	public static boolean hasJointNameAlias(String jointName)
	{
		return !getJointNameAlias(jointName).isEmpty();
	}

	/** Get parent for this jointName
	 * @param jointName of interest
	 * @return parent value, otherwise empty string if not found
	 */
	public static String getParentJointName(String jointName)
	{
		if      (jointName.equalsIgnoreCase(NAME_SACROILIAC)) return NAME_SACROILIAC_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_HIP)) return NAME_L_HIP_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_KNEE)) return NAME_L_KNEE_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCRURAL)) return NAME_L_TALOCRURAL_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TALOCALCANEONAVICULAR)) return NAME_L_TALOCALCANEONAVICULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_1)) return NAME_L_CUNEONAVICULAR_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_1)) return NAME_L_TARSOMETATARSAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_1)) return NAME_L_METATARSOPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_INTERPHALANGEAL_1)) return NAME_L_TARSAL_INTERPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_2)) return NAME_L_CUNEONAVICULAR_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_2)) return NAME_L_TARSOMETATARSAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_2)) return NAME_L_METATARSOPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CUNEONAVICULAR_3)) return NAME_L_CUNEONAVICULAR_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_3)) return NAME_L_TARSOMETATARSAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_3)) return NAME_L_METATARSOPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CALCANEOCUBOID)) return NAME_L_CALCANEOCUBOID_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TRANSVERSETARSAL)) return NAME_L_TRANSVERSETARSAL_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_4)) return NAME_L_TARSOMETATARSAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_4)) return NAME_L_METATARSOPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSOMETATARSAL_5)) return NAME_L_TARSOMETATARSAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METATARSOPHALANGEAL_5)) return NAME_L_METATARSOPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5)) return NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_HIP)) return NAME_R_HIP_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_KNEE)) return NAME_R_KNEE_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCRURAL)) return NAME_R_TALOCRURAL_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TALOCALCANEONAVICULAR)) return NAME_R_TALOCALCANEONAVICULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_1)) return NAME_R_CUNEONAVICULAR_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_1)) return NAME_R_TARSOMETATARSAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_1)) return NAME_R_METATARSOPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_INTERPHALANGEAL_1)) return NAME_R_TARSAL_INTERPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_2)) return NAME_R_CUNEONAVICULAR_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_2)) return NAME_R_TARSOMETATARSAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_2)) return NAME_R_METATARSOPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CUNEONAVICULAR_3)) return NAME_R_CUNEONAVICULAR_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_3)) return NAME_R_TARSOMETATARSAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_3)) return NAME_R_METATARSOPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CALCANEOCUBOID)) return NAME_R_CALCANEOCUBOID_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TRANSVERSETARSAL)) return NAME_R_TRANSVERSETARSAL_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_4)) return NAME_R_TARSOMETATARSAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_4)) return NAME_R_METATARSOPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSOMETATARSAL_5)) return NAME_R_TARSOMETATARSAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METATARSOPHALANGEAL_5)) return NAME_R_METATARSOPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5)) return NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VL5)) return NAME_VL5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VL4)) return NAME_VL4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VL3)) return NAME_VL3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VL2)) return NAME_VL2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VL1)) return NAME_VL1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT12)) return NAME_VT12_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT11)) return NAME_VT11_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT10)) return NAME_VT10_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT9)) return NAME_VT9_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT8)) return NAME_VT8_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT7)) return NAME_VT7_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT6)) return NAME_VT6_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT5)) return NAME_VT5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT4)) return NAME_VT4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT3)) return NAME_VT3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT2)) return NAME_VT2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VT1)) return NAME_VT1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC7)) return NAME_VC7_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC6)) return NAME_VC6_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC5)) return NAME_VC5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC4)) return NAME_VC4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC3)) return NAME_VC3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC2)) return NAME_VC2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_VC1)) return NAME_VC1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_SKULLBASE)) return NAME_SKULLBASE_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_EYELID_JOINT)) return NAME_L_EYELID_JOINT_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_EYELID_JOINT)) return NAME_R_EYELID_JOINT_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_EYEBALL_JOINT)) return NAME_L_EYEBALL_JOINT_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_EYEBALL_JOINT)) return NAME_R_EYEBALL_JOINT_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_EYEBROW_JOINT)) return NAME_L_EYEBROW_JOINT_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_EYEBROW_JOINT)) return NAME_R_EYEBROW_JOINT_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_TEMPOROMANDIBULAR)) return NAME_TEMPOROMANDIBULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_STERNOCLAVICULAR)) return NAME_L_STERNOCLAVICULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_ACROMIOCLAVICULAR)) return NAME_L_ACROMIOCLAVICULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_SHOULDER)) return NAME_L_SHOULDER_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_ELBOW)) return NAME_L_ELBOW_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_RADIOCARPAL)) return NAME_L_RADIOCARPAL_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_1)) return NAME_L_MIDCARPAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_1)) return NAME_L_CARPOMETACARPAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_1)) return NAME_L_METACARPOPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_INTERPHALANGEAL_1)) return NAME_L_CARPAL_INTERPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_2)) return NAME_L_MIDCARPAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_2)) return NAME_L_CARPOMETACARPAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_2)) return NAME_L_METACARPOPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_3)) return NAME_L_MIDCARPAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_3)) return NAME_L_CARPOMETACARPAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_3)) return NAME_L_METACARPOPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_MIDCARPAL_4_5)) return NAME_L_MIDCARPAL_4_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_4)) return NAME_L_CARPOMETACARPAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_4)) return NAME_L_METACARPOPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPOMETACARPAL_5)) return NAME_L_CARPOMETACARPAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_METACARPOPHALANGEAL_5)) return NAME_L_METACARPOPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5)) return NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_STERNOCLAVICULAR)) return NAME_R_STERNOCLAVICULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_ACROMIOCLAVICULAR)) return NAME_R_ACROMIOCLAVICULAR_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_SHOULDER)) return NAME_R_SHOULDER_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_ELBOW)) return NAME_R_ELBOW_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_RADIOCARPAL)) return NAME_R_RADIOCARPAL_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_1)) return NAME_R_MIDCARPAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_1)) return NAME_R_CARPOMETACARPAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_1)) return NAME_R_METACARPOPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_INTERPHALANGEAL_1)) return NAME_R_CARPAL_INTERPHALANGEAL_1_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_2)) return NAME_R_MIDCARPAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_2)) return NAME_R_CARPOMETACARPAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_2)) return NAME_R_METACARPOPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_3)) return NAME_R_MIDCARPAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_3)) return NAME_R_CARPOMETACARPAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_3)) return NAME_R_METACARPOPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_MIDCARPAL_4_5)) return NAME_R_MIDCARPAL_4_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_4)) return NAME_R_CARPOMETACARPAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_4)) return NAME_R_METACARPOPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPOMETACARPAL_5)) return NAME_R_CARPOMETACARPAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_METACARPOPHALANGEAL_5)) return NAME_R_METACARPOPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5)) return NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5_PARENT;
		else if (jointName.equalsIgnoreCase(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5)) return NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5_PARENT;
		else return ""; // not found
	}
	/** Whether a parent exists for this jointName
	 * @param jointName of interest
	 * @return true if found
	 */
	public static boolean hasParentMatchingName(String jointName)
	{
		return !getParentJointName(jointName).isEmpty();
	}

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>HAnimJoint</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "HAnimJoint";

	/** Provides name of this element: <i>HAnimJoint</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>HAnimJoint</i> element: <i>HAnim</i> */
	public static final String COMPONENT = "HAnim";

	/** Defines X3D component for the <i>HAnimJoint</i> element: <i>HAnim</i>
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

	/** SFRotation field named <i>limitOrientation</i> has default value <i>{0f,0f,1f,0f}</i> (Java syntax) or <i>0 0 1 0</i> (XML syntax). */
	public static final float[] LIMITORIENTATION_DEFAULT_VALUE = {0f,0f,1f,0f};

	/** SFVec3f field named <i>llimit</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] LLIMIT_DEFAULT_VALUE = {0f,0f,0f};

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

	/** MFInt32 field named <i>skinCoordIndex</i> has default value equal to an empty list. */
	public static final ArrayList<Integer> SKINCOORDINDEX_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** MFFloat field named <i>skinCoordWeight</i> has default value equal to an empty list. */
	public static final ArrayList<Float> SKINCOORDWEIGHT_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** SFVec3f field named <i>stiffness</i> has default value <i>{1f,1f,1f}</i> (Java syntax) or <i>1 1 1</i> (XML syntax). */
	public static final float[] STIFFNESS_DEFAULT_VALUE = {1f,1f,1f};

	/** SFVec3f field named <i>translation</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] TRANSLATION_DEFAULT_VALUE = {0f,0f,0f};

	/** SFVec3f field named <i>ulimit</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] ULIMIT_DEFAULT_VALUE = {0f,0f,0f};

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
			case "displacers":
				result = "MFNode";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "limitOrientation":
				result = "SFRotation";
				break;
			case "llimit":
				result = "SFVec3f";
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
			case "skinCoordIndex":
				result = "MFInt32";
				break;
			case "skinCoordWeight":
				result = "MFFloat";
				break;
			case "stiffness":
				result = "SFVec3f";
				break;
			case "translation":
				result = "SFVec3f";
				break;
			case "ulimit":
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
			case "displacers":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "limitOrientation":
				result = "inputOutput";
				break;
			case "llimit":
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
			case "skinCoordIndex":
				result = "inputOutput";
				break;
			case "skinCoordWeight":
				result = "inputOutput";
				break;
			case "stiffness":
				result = "inputOutput";
				break;
			case "translation":
				result = "inputOutput";
				break;
			case "ulimit":
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
	public static final String containerField_DEFAULT_VALUE = "children"; // type containerFieldChoicesHAnimJoint
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

	/** fromField ROUTE name for MFNode field named <i>displacers</i>. */
	public static final String fromField_DISPLACERS = "displacers";

	/** toField ROUTE name for MFNode field named <i>displacers</i>. */
	public static final String toField_DISPLACERS = "displacers";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFRotation field named <i>limitOrientation</i>. */
	public static final String fromField_LIMITORIENTATION = "limitOrientation";

	/** toField ROUTE name for SFRotation field named <i>limitOrientation</i>. */
	public static final String toField_LIMITORIENTATION = "limitOrientation";

	/** fromField ROUTE name for SFVec3f field named <i>llimit</i>. */
	public static final String fromField_LLIMIT = "llimit";

	/** toField ROUTE name for SFVec3f field named <i>llimit</i>. */
	public static final String toField_LLIMIT = "llimit";

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

	/** fromField ROUTE name for MFInt32 field named <i>skinCoordIndex</i>. */
	public static final String fromField_SKINCOORDINDEX = "skinCoordIndex";

	/** toField ROUTE name for MFInt32 field named <i>skinCoordIndex</i>. */
	public static final String toField_SKINCOORDINDEX = "skinCoordIndex";

	/** fromField ROUTE name for MFFloat field named <i>skinCoordWeight</i>. */
	public static final String fromField_SKINCOORDWEIGHT = "skinCoordWeight";

	/** toField ROUTE name for MFFloat field named <i>skinCoordWeight</i>. */
	public static final String toField_SKINCOORDWEIGHT = "skinCoordWeight";

	/** fromField ROUTE name for SFVec3f field named <i>stiffness</i>. */
	public static final String fromField_STIFFNESS = "stiffness";

	/** toField ROUTE name for SFVec3f field named <i>stiffness</i>. */
	public static final String toField_STIFFNESS = "stiffness";

	/** fromField ROUTE name for SFVec3f field named <i>translation</i>. */
	public static final String fromField_TRANSLATION = "translation";

	/** toField ROUTE name for SFVec3f field named <i>translation</i>. */
	public static final String toField_TRANSLATION = "translation";

	/** fromField ROUTE name for SFVec3f field named <i>ulimit</i>. */
	public static final String fromField_ULIMIT = "ulimit";

	/** toField ROUTE name for SFVec3f field named <i>ulimit</i>. */
	public static final String toField_ULIMIT = "ulimit";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for HAnimJointObject to initialize member variables with default values. */
	public HAnimJointObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "children" }; // type containerFieldChoicesHAnimJoint

		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		center = CENTER_DEFAULT_VALUE;
		children = new ArrayList<>();
		description = DESCRIPTION_DEFAULT_VALUE;
		displacers = new ArrayList<>();
		IS = null; // clear out any prior node
		limitOrientation = LIMITORIENTATION_DEFAULT_VALUE;
		llimit = LLIMIT_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		name = NAME_DEFAULT_VALUE;
		rotation = ROTATION_DEFAULT_VALUE;
		scale = SCALE_DEFAULT_VALUE;
		scaleOrientation = SCALEORIENTATION_DEFAULT_VALUE;
		skinCoordIndex = new ArrayList<>();
		skinCoordWeight = new ArrayList<>();
		stiffness = STIFFNESS_DEFAULT_VALUE;
		translation = TRANSLATION_DEFAULT_VALUE;
		ulimit = ULIMIT_DEFAULT_VALUE;
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxCenter(SFVec3fObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxCenter(double[] newArray)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxSize(SFVec3fObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Translation offset from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 * </ul>
	 * @return value of center field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getCenter()
	{
		return center;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Translation offset from origin of local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 * </ul>
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint center newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		center = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f center field, similar to {@link #setCenter(float[])}.
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setCenter(SFVec3fObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setCenter(float x, float y, float z)
	{
		setCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setCenter(double x, double y, double z)
	{
		return setCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setCenter(double[] newArray)
	{
		return setCenter(new SFVec3fObject(newArray));
	}
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setChildren(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearChildren(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.CommentsBlock) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.ROUTEObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Networking.IMPORTObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Networking.EXPORTObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject) ||
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimSegmentObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes HAnimJoint|HAnimSegment|HAnimSite; newValue["+i+"]=" + newValue[i]);
			}
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setChildren(ArrayList<X3DNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearChildren(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4

		// newValueArrayListAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #3
		for (X3DNode element : newValue)
		{
			boolean isNodeTypeAllowed = 
				(element instanceof org.web3d.x3d.jsail.Core.CommentsBlock) ||
				(element instanceof org.web3d.x3d.jsail.Core.ROUTEObject) ||
				(element instanceof org.web3d.x3d.jsail.Networking.IMPORTObject) ||
				(element instanceof org.web3d.x3d.jsail.Networking.EXPORTObject) ||
				(element instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject) ||
				(element instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject) ||
				(element instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(element instanceof org.web3d.x3d.jsail.HAnim.HAnimSegmentObject) || 
				(element instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] element is not instanceof " +
					"acceptableNodeTypes HAnimJoint|HAnimSegment|HAnimSite; element=" + element);
			}
		}
        if (newValue.isEmpty())
            clearChildren(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChildren(newArray);
        }
		for (X3DNode element : newValue)
		{
			children.add(element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single node to existing array of children nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSegment|HAnimSite and ProtoInstance.
	 * @param newValue is new value to be appended the children field.	 */
	public void addChildren(X3DNode newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf

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
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for children field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimJointObject addChildren(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}

	/**
	 * Utility method to add single child element to contained list of existing children nodes (if any).
	 * @param newValue is new node value to be appended the children field.	 
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	*/
	public HAnimJointObject addChild(X3DChildNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

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

		children.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest3
        if (newValue instanceof ProtoInstanceObject)
            ((ProtoInstanceObject) newValue).setContainerField("children");
		return this;
	}
	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSegment|HAnimSite.
	 * @param newValue is new value array to be appended the children field.
	 */
	@Override // or here2?
	public void addChildren(X3DNode[] newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.CommentsBlock) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.ROUTEObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Networking.IMPORTObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Networking.EXPORTObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject) ||
				(newValue[i] instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject) ||
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimSegmentObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes HAnimJoint|HAnimSegment|HAnimSite; newValue["+i+"]=" + newValue[i]);
			}
		}
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
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimJoint|HAnimSegment|HAnimSite.
	 * @param newValue is new node for the children field (restricted to HAnimJoint|HAnimSegment|HAnimSite)
	 */
	@Override
	public void setChildren(X3DNode newValue)
	{
		if (newValue == null)
		{
			clearChildren(); // reset newValueNullClearsFieldReturnVoid
			return;
		}

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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimJointObject clearChildren()
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimJointObject addComments (String newComment)
	{
		if (newComment == null) return this;
		children.add(new CommentsBlock (newComment));
		return this;
	}
	/**
	 * Add comments as String[] array to children field
	 * @param newComments array of comments
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimJointObject addComments (String[] newComments)
	{
		if (newComments == null) return this;
		children.add(new CommentsBlock (newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to children field
	 * @param newCommentsBlock block of comments to add
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject addComments (CommentsBlock newCommentsBlock)
	{
		if (newCommentsBlock == null) return this;
		children.add(newCommentsBlock);
		return this;
	}
											/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * @return value of description field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getDescription()
	{
		return description;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setDescription(String newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setDescription(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDescription(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of HAnimDisplacerObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>displacers</i>.
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * <i>Tooltip:</i> [HAnimDisplacer] the displacers field stores HAnimDisplacer objects for a particular HAnimJoint object.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimDisplacer.
	 * @param newValue is new value for the displacers field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setDisplacers(X3DNode[] newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setDisplacers(ArrayList<HAnimDisplacerObject> newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimJointObject addDisplacers(HAnimDisplacerObject newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimJointObject addDisplacers(ProtoInstanceObject newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimJointObject clearDisplacers()
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setIS(ISObject newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimJointObject clearIS()
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
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>limitOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of upper/lower rotation limits, relative to HAnimJoint center.  * <br>

	 * @return value of limitOrientation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getLimitOrientation()
	{
		return limitOrientation;
	}

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>limitOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of upper/lower rotation limits, relative to HAnimJoint center.  * <br>

	 * @param newValue is new value for the limitOrientation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setLimitOrientation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint limitOrientation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		limitOrientation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation limitOrientation field, similar to {@link #setLimitOrientation(float[])}.
	 * @param newValue is new value for the limitOrientation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLimitOrientation(SFRotationObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLimitOrientation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFRotation limitOrientation field, similar to {@link #setLimitOrientation(float[])}.

	 * @param x first component of axis
	 * @param y second component of axis
	 * @param z third component of axis
	 * @param angleRadians fourth component of rotation around axis

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLimitOrientation(float x, float y, float z, float angleRadians)
	{
		setLimitOrientation(new float[] {x, y, z, angleRadians});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setLimitOrientation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @param angleRadians fourth component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLimitOrientation(double x, double y, double z, double angleRadians)
	{
		return setLimitOrientation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setLimitOrientation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLimitOrientation(double[] newArray)
	{
		return setLimitOrientation(new SFRotationObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>llimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Lower limit for minimum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @return value of llimit field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getLlimit()
	{
		return llimit;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>llimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Lower limit for minimum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @param newValue is new value for the llimit field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setLlimit(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint llimit newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		llimit = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f llimit field, similar to {@link #setLlimit(float[])}.
	 * @param newValue is new value for the llimit field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLlimit(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLlimit(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f llimit field, similar to {@link #setLlimit(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLlimit(float x, float y, float z)
	{
		setLlimit(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setLlimit(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLlimit(double x, double y, double z)
	{
		return setLlimit(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setLlimit(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setLlimit(double[] newArray)
	{
		return setLlimit(new SFVec3fObject(newArray));
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimJointObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setMetadata(ProtoInstanceObject newValue)
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
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #NAME_HUMANOID_ROOT HUMANOID_ROOT}, {@link #NAME_SACROILIAC SACROILIAC}, {@link #NAME_L_HIP L_HIP}, {@link #NAME_L_KNEE L_KNEE}, {@link #NAME_L_TALOCRURAL L_TALOCRURAL}, {@link #NAME_L_TALOCALCANEONAVICULAR L_TALOCALCANEONAVICULAR}, {@link #NAME_L_CUNEONAVICULAR_1 L_CUNEONAVICULAR_1}, {@link #NAME_L_TARSOMETATARSAL_1 L_TARSOMETATARSAL_1}, {@link #NAME_L_METATARSOPHALANGEAL_1 L_METATARSOPHALANGEAL_1}, {@link #NAME_L_TARSAL_INTERPHALANGEAL_1 L_TARSAL_INTERPHALANGEAL_1}, {@link #NAME_L_CUNEONAVICULAR_2 L_CUNEONAVICULAR_2}, {@link #NAME_L_TARSOMETATARSAL_2 L_TARSOMETATARSAL_2}, {@link #NAME_L_METATARSOPHALANGEAL_2 L_METATARSOPHALANGEAL_2}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 L_TARSAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 L_TARSAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_L_CUNEONAVICULAR_3 L_CUNEONAVICULAR_3}, {@link #NAME_L_TARSOMETATARSAL_3 L_TARSOMETATARSAL_3}, {@link #NAME_L_METATARSOPHALANGEAL_3 L_METATARSOPHALANGEAL_3}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 L_TARSAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3 L_TARSAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_L_CALCANEOCUBOID L_CALCANEOCUBOID}, {@link #NAME_L_TRANSVERSETARSAL L_TRANSVERSETARSAL}, {@link #NAME_L_TARSOMETATARSAL_4 L_TARSOMETATARSAL_4}, {@link #NAME_L_METATARSOPHALANGEAL_4 L_METATARSOPHALANGEAL_4}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 L_TARSAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4 L_TARSAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_L_TARSOMETATARSAL_5 L_TARSOMETATARSAL_5}, {@link #NAME_L_METATARSOPHALANGEAL_5 L_METATARSOPHALANGEAL_5}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 L_TARSAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5 L_TARSAL_DISTAL_INTERPHALANGEAL_5}, {@link #NAME_R_HIP R_HIP}, {@link #NAME_R_KNEE R_KNEE}, {@link #NAME_R_TALOCRURAL R_TALOCRURAL}, {@link #NAME_R_TALOCALCANEONAVICULAR R_TALOCALCANEONAVICULAR}, {@link #NAME_R_CUNEONAVICULAR_1 R_CUNEONAVICULAR_1}, {@link #NAME_R_TARSOMETATARSAL_1 R_TARSOMETATARSAL_1}, {@link #NAME_R_METATARSOPHALANGEAL_1 R_METATARSOPHALANGEAL_1}, {@link #NAME_R_TARSAL_INTERPHALANGEAL_1 R_TARSAL_INTERPHALANGEAL_1}, {@link #NAME_R_CUNEONAVICULAR_2 R_CUNEONAVICULAR_2}, {@link #NAME_R_TARSOMETATARSAL_2 R_TARSOMETATARSAL_2}, {@link #NAME_R_METATARSOPHALANGEAL_2 R_METATARSOPHALANGEAL_2}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 R_TARSAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 R_TARSAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_R_CUNEONAVICULAR_3 R_CUNEONAVICULAR_3}, {@link #NAME_R_TARSOMETATARSAL_3 R_TARSOMETATARSAL_3}, {@link #NAME_R_METATARSOPHALANGEAL_3 R_METATARSOPHALANGEAL_3}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 R_TARSAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3 R_TARSAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_R_CALCANEOCUBOID R_CALCANEOCUBOID}, {@link #NAME_R_TRANSVERSETARSAL R_TRANSVERSETARSAL}, {@link #NAME_R_TARSOMETATARSAL_4 R_TARSOMETATARSAL_4}, {@link #NAME_R_METATARSOPHALANGEAL_4 R_METATARSOPHALANGEAL_4}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 R_TARSAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4 R_TARSAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_R_TARSOMETATARSAL_5 R_TARSOMETATARSAL_5}, {@link #NAME_R_METATARSOPHALANGEAL_5 R_METATARSOPHALANGEAL_5}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 R_TARSAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5 R_TARSAL_DISTAL_INTERPHALANGEAL_5}, {@link #NAME_VL5 VL5}, {@link #NAME_VL4 VL4}, {@link #NAME_VL3 VL3}, {@link #NAME_VL2 VL2}, {@link #NAME_VL1 VL1}, {@link #NAME_VT12 VT12}, {@link #NAME_VT11 VT11}, {@link #NAME_VT10 VT10}, {@link #NAME_VT9 VT9}, {@link #NAME_VT8 VT8}, {@link #NAME_VT7 VT7}, {@link #NAME_VT6 VT6}, {@link #NAME_VT5 VT5}, {@link #NAME_VT4 VT4}, {@link #NAME_VT3 VT3}, {@link #NAME_VT2 VT2}, {@link #NAME_VT1 VT1}, {@link #NAME_VC7 VC7}, {@link #NAME_VC6 VC6}, {@link #NAME_VC5 VC5}, {@link #NAME_VC4 VC4}, {@link #NAME_VC3 VC3}, {@link #NAME_VC2 VC2}, {@link #NAME_VC1 VC1}, {@link #NAME_SKULLBASE SKULLBASE}, {@link #NAME_L_EYELID_JOINT L_EYELID_JOINT}, {@link #NAME_R_EYELID_JOINT R_EYELID_JOINT}, {@link #NAME_L_EYEBALL_JOINT L_EYEBALL_JOINT}, {@link #NAME_R_EYEBALL_JOINT R_EYEBALL_JOINT}, {@link #NAME_L_EYEBROW_JOINT L_EYEBROW_JOINT}, {@link #NAME_R_EYEBROW_JOINT R_EYEBROW_JOINT}, {@link #NAME_TEMPOROMANDIBULAR TEMPOROMANDIBULAR}, {@link #NAME_L_STERNOCLAVICULAR L_STERNOCLAVICULAR}, {@link #NAME_L_ACROMIOCLAVICULAR L_ACROMIOCLAVICULAR}, {@link #NAME_L_SHOULDER L_SHOULDER}, {@link #NAME_L_ELBOW L_ELBOW}, {@link #NAME_L_RADIOCARPAL L_RADIOCARPAL}, {@link #NAME_L_MIDCARPAL_1 L_MIDCARPAL_1}, {@link #NAME_L_CARPOMETACARPAL_1 L_CARPOMETACARPAL_1}, {@link #NAME_L_METACARPOPHALANGEAL_1 L_METACARPOPHALANGEAL_1}, {@link #NAME_L_CARPAL_INTERPHALANGEAL_1 L_CARPAL_INTERPHALANGEAL_1}, {@link #NAME_L_MIDCARPAL_2 L_MIDCARPAL_2}, {@link #NAME_L_CARPOMETACARPAL_2 L_CARPOMETACARPAL_2}, {@link #NAME_L_METACARPOPHALANGEAL_2 L_METACARPOPHALANGEAL_2}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 L_CARPAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2 L_CARPAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_L_MIDCARPAL_3 L_MIDCARPAL_3}, {@link #NAME_L_CARPOMETACARPAL_3 L_CARPOMETACARPAL_3}, {@link #NAME_L_METACARPOPHALANGEAL_3 L_METACARPOPHALANGEAL_3}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 L_CARPAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3 L_CARPAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_L_MIDCARPAL_4_5 L_MIDCARPAL_4_5}, {@link #NAME_L_CARPOMETACARPAL_4 L_CARPOMETACARPAL_4}, {@link #NAME_L_METACARPOPHALANGEAL_4 L_METACARPOPHALANGEAL_4}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 L_CARPAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4 L_CARPAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_L_CARPOMETACARPAL_5 L_CARPOMETACARPAL_5}, {@link #NAME_L_METACARPOPHALANGEAL_5 L_METACARPOPHALANGEAL_5}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 L_CARPAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5 L_CARPAL_DISTAL_INTERPHALANGEAL_5}, {@link #NAME_R_STERNOCLAVICULAR R_STERNOCLAVICULAR}, {@link #NAME_R_ACROMIOCLAVICULAR R_ACROMIOCLAVICULAR}, {@link #NAME_R_SHOULDER R_SHOULDER}, {@link #NAME_R_ELBOW R_ELBOW}, {@link #NAME_R_RADIOCARPAL R_RADIOCARPAL}, {@link #NAME_R_MIDCARPAL_1 R_MIDCARPAL_1}, {@link #NAME_R_CARPOMETACARPAL_1 R_CARPOMETACARPAL_1}, {@link #NAME_R_METACARPOPHALANGEAL_1 R_METACARPOPHALANGEAL_1}, {@link #NAME_R_CARPAL_INTERPHALANGEAL_1 R_CARPAL_INTERPHALANGEAL_1}, {@link #NAME_R_MIDCARPAL_2 R_MIDCARPAL_2}, {@link #NAME_R_CARPOMETACARPAL_2 R_CARPOMETACARPAL_2}, {@link #NAME_R_METACARPOPHALANGEAL_2 R_METACARPOPHALANGEAL_2}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 R_CARPAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2 R_CARPAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_R_MIDCARPAL_3 R_MIDCARPAL_3}, {@link #NAME_R_CARPOMETACARPAL_3 R_CARPOMETACARPAL_3}, {@link #NAME_R_METACARPOPHALANGEAL_3 R_METACARPOPHALANGEAL_3}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 R_CARPAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3 R_CARPAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_R_MIDCARPAL_4_5 R_MIDCARPAL_4_5}, {@link #NAME_R_CARPOMETACARPAL_4 R_CARPOMETACARPAL_4}, {@link #NAME_R_METACARPOPHALANGEAL_4 R_METACARPOPHALANGEAL_4}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 R_CARPAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4 R_CARPAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_R_CARPOMETACARPAL_5 R_CARPOMETACARPAL_5}, {@link #NAME_R_METACARPOPHALANGEAL_5 R_METACARPOPHALANGEAL_5}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 R_CARPAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5 R_CARPAL_DISTAL_INTERPHALANGEAL_5}.
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String enumeration value ("humanoid_root" | "sacroiliac" | "l_hip" | "l_knee" | "l_talocrural" | "l_talocalcaneonavicular" | "l_cuneonavicular_1" | "l_tarsometatarsal_1" | "l_metatarsophalangeal_1" | "l_tarsal_interphalangeal_1" | "l_cuneonavicular_2" | "l_tarsometatarsal_2" | "l_metatarsophalangeal_2" | "l_tarsal_proximal_interphalangeal_2" | "l_tarsal_distal_interphalangeal_2" | "l_cuneonavicular_3" | "l_tarsometatarsal_3" | "l_metatarsophalangeal_3" | "l_tarsal_proximal_interphalangeal_3" | "l_tarsal_distal_interphalangeal_3" | "l_calcaneocuboid" | "l_transversetarsal" | "l_tarsometatarsal_4" | "l_metatarsophalangeal_4" | "l_tarsal_proximal_interphalangeal_4" | "l_tarsal_distal_interphalangeal_4" | "l_tarsometatarsal_5" | "l_metatarsophalangeal_5" | "l_tarsal_proximal_interphalangeal_5" | "l_tarsal_distal_interphalangeal_5" | "r_hip" | "r_knee" | "r_talocrural" | "r_talocalcaneonavicular" | "r_cuneonavicular_1" | "r_tarsometatarsal_1" | "r_metatarsophalangeal_1" | "r_tarsal_interphalangeal_1" | "r_cuneonavicular_2" | "r_tarsometatarsal_2" | "r_metatarsophalangeal_2" | "r_tarsal_proximal_interphalangeal_2" | "r_tarsal_distal_interphalangeal_2" | "r_cuneonavicular_3" | "r_tarsometatarsal_3" | "r_metatarsophalangeal_3" | "r_tarsal_proximal_interphalangeal_3" | "r_tarsal_distal_interphalangeal_3" | "r_calcaneocuboid" | "r_transversetarsal" | "r_tarsometatarsal_4" | "r_metatarsophalangeal_4" | "r_tarsal_proximal_interphalangeal_4" | "r_tarsal_distal_interphalangeal_4" | "r_tarsometatarsal_5" | "r_metatarsophalangeal_5" | "r_tarsal_proximal_interphalangeal_5" | "r_tarsal_distal_interphalangeal_5" | "vl5" | "vl4" | "vl3" | "vl2" | "vl1" | "vt12" | "vt11" | "vt10" | "vt9" | "vt8" | "vt7" | "vt6" | "vt5" | "vt4" | "vt3" | "vt2" | "vt1" | "vc7" | "vc6" | "vc5" | "vc4" | "vc3" | "vc2" | "vc1" | "skullbase" | "l_eyelid_joint" | "r_eyelid_joint" | "l_eyeball_joint" | "r_eyeball_joint" | "l_eyebrow_joint" | "r_eyebrow_joint" | "temporomandibular" | "l_sternoclavicular" | "l_acromioclavicular" | "l_shoulder" | "l_elbow" | "l_radiocarpal" | "l_midcarpal_1" | "l_carpometacarpal_1" | "l_metacarpophalangeal_1" | "l_carpal_interphalangeal_1" | "l_midcarpal_2" | "l_carpometacarpal_2" | "l_metacarpophalangeal_2" | "l_carpal_proximal_interphalangeal_2" | "l_carpal_distal_interphalangeal_2" | "l_midcarpal_3" | "l_carpometacarpal_3" | "l_metacarpophalangeal_3" | "l_carpal_proximal_interphalangeal_3" | "l_carpal_distal_interphalangeal_3" | "l_midcarpal_4_5" | "l_carpometacarpal_4" | "l_metacarpophalangeal_4" | "l_carpal_proximal_interphalangeal_4" | "l_carpal_distal_interphalangeal_4" | "l_carpometacarpal_5" | "l_metacarpophalangeal_5" | "l_carpal_proximal_interphalangeal_5" | "l_carpal_distal_interphalangeal_5" | "r_sternoclavicular" | "r_acromioclavicular" | "r_shoulder" | "r_elbow" | "r_radiocarpal" | "r_midcarpal_1" | "r_carpometacarpal_1" | "r_metacarpophalangeal_1" | "r_carpal_interphalangeal_1" | "r_midcarpal_2" | "r_carpometacarpal_2" | "r_metacarpophalangeal_2" | "r_carpal_proximal_interphalangeal_2" | "r_carpal_distal_interphalangeal_2" | "r_midcarpal_3" | "r_carpometacarpal_3" | "r_metacarpophalangeal_3" | "r_carpal_proximal_interphalangeal_3" | "r_carpal_distal_interphalangeal_3" | "r_midcarpal_4_5" | "r_carpometacarpal_4" | "r_metacarpophalangeal_4" | "r_carpal_proximal_interphalangeal_4" | "r_carpal_distal_interphalangeal_4" | "r_carpometacarpal_5" | "r_metacarpophalangeal_5" | "r_carpal_proximal_interphalangeal_5" | "r_carpal_distal_interphalangeal_5") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #NAME_HUMANOID_ROOT HUMANOID_ROOT}, {@link #NAME_SACROILIAC SACROILIAC}, {@link #NAME_L_HIP L_HIP}, {@link #NAME_L_KNEE L_KNEE}, {@link #NAME_L_TALOCRURAL L_TALOCRURAL}, {@link #NAME_L_TALOCALCANEONAVICULAR L_TALOCALCANEONAVICULAR}, {@link #NAME_L_CUNEONAVICULAR_1 L_CUNEONAVICULAR_1}, {@link #NAME_L_TARSOMETATARSAL_1 L_TARSOMETATARSAL_1}, {@link #NAME_L_METATARSOPHALANGEAL_1 L_METATARSOPHALANGEAL_1}, {@link #NAME_L_TARSAL_INTERPHALANGEAL_1 L_TARSAL_INTERPHALANGEAL_1}, {@link #NAME_L_CUNEONAVICULAR_2 L_CUNEONAVICULAR_2}, {@link #NAME_L_TARSOMETATARSAL_2 L_TARSOMETATARSAL_2}, {@link #NAME_L_METATARSOPHALANGEAL_2 L_METATARSOPHALANGEAL_2}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2 L_TARSAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2 L_TARSAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_L_CUNEONAVICULAR_3 L_CUNEONAVICULAR_3}, {@link #NAME_L_TARSOMETATARSAL_3 L_TARSOMETATARSAL_3}, {@link #NAME_L_METATARSOPHALANGEAL_3 L_METATARSOPHALANGEAL_3}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3 L_TARSAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3 L_TARSAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_L_CALCANEOCUBOID L_CALCANEOCUBOID}, {@link #NAME_L_TRANSVERSETARSAL L_TRANSVERSETARSAL}, {@link #NAME_L_TARSOMETATARSAL_4 L_TARSOMETATARSAL_4}, {@link #NAME_L_METATARSOPHALANGEAL_4 L_METATARSOPHALANGEAL_4}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4 L_TARSAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4 L_TARSAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_L_TARSOMETATARSAL_5 L_TARSOMETATARSAL_5}, {@link #NAME_L_METATARSOPHALANGEAL_5 L_METATARSOPHALANGEAL_5}, {@link #NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5 L_TARSAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5 L_TARSAL_DISTAL_INTERPHALANGEAL_5}, {@link #NAME_R_HIP R_HIP}, {@link #NAME_R_KNEE R_KNEE}, {@link #NAME_R_TALOCRURAL R_TALOCRURAL}, {@link #NAME_R_TALOCALCANEONAVICULAR R_TALOCALCANEONAVICULAR}, {@link #NAME_R_CUNEONAVICULAR_1 R_CUNEONAVICULAR_1}, {@link #NAME_R_TARSOMETATARSAL_1 R_TARSOMETATARSAL_1}, {@link #NAME_R_METATARSOPHALANGEAL_1 R_METATARSOPHALANGEAL_1}, {@link #NAME_R_TARSAL_INTERPHALANGEAL_1 R_TARSAL_INTERPHALANGEAL_1}, {@link #NAME_R_CUNEONAVICULAR_2 R_CUNEONAVICULAR_2}, {@link #NAME_R_TARSOMETATARSAL_2 R_TARSOMETATARSAL_2}, {@link #NAME_R_METATARSOPHALANGEAL_2 R_METATARSOPHALANGEAL_2}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2 R_TARSAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2 R_TARSAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_R_CUNEONAVICULAR_3 R_CUNEONAVICULAR_3}, {@link #NAME_R_TARSOMETATARSAL_3 R_TARSOMETATARSAL_3}, {@link #NAME_R_METATARSOPHALANGEAL_3 R_METATARSOPHALANGEAL_3}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3 R_TARSAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3 R_TARSAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_R_CALCANEOCUBOID R_CALCANEOCUBOID}, {@link #NAME_R_TRANSVERSETARSAL R_TRANSVERSETARSAL}, {@link #NAME_R_TARSOMETATARSAL_4 R_TARSOMETATARSAL_4}, {@link #NAME_R_METATARSOPHALANGEAL_4 R_METATARSOPHALANGEAL_4}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4 R_TARSAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4 R_TARSAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_R_TARSOMETATARSAL_5 R_TARSOMETATARSAL_5}, {@link #NAME_R_METATARSOPHALANGEAL_5 R_METATARSOPHALANGEAL_5}, {@link #NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5 R_TARSAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5 R_TARSAL_DISTAL_INTERPHALANGEAL_5}, {@link #NAME_VL5 VL5}, {@link #NAME_VL4 VL4}, {@link #NAME_VL3 VL3}, {@link #NAME_VL2 VL2}, {@link #NAME_VL1 VL1}, {@link #NAME_VT12 VT12}, {@link #NAME_VT11 VT11}, {@link #NAME_VT10 VT10}, {@link #NAME_VT9 VT9}, {@link #NAME_VT8 VT8}, {@link #NAME_VT7 VT7}, {@link #NAME_VT6 VT6}, {@link #NAME_VT5 VT5}, {@link #NAME_VT4 VT4}, {@link #NAME_VT3 VT3}, {@link #NAME_VT2 VT2}, {@link #NAME_VT1 VT1}, {@link #NAME_VC7 VC7}, {@link #NAME_VC6 VC6}, {@link #NAME_VC5 VC5}, {@link #NAME_VC4 VC4}, {@link #NAME_VC3 VC3}, {@link #NAME_VC2 VC2}, {@link #NAME_VC1 VC1}, {@link #NAME_SKULLBASE SKULLBASE}, {@link #NAME_L_EYELID_JOINT L_EYELID_JOINT}, {@link #NAME_R_EYELID_JOINT R_EYELID_JOINT}, {@link #NAME_L_EYEBALL_JOINT L_EYEBALL_JOINT}, {@link #NAME_R_EYEBALL_JOINT R_EYEBALL_JOINT}, {@link #NAME_L_EYEBROW_JOINT L_EYEBROW_JOINT}, {@link #NAME_R_EYEBROW_JOINT R_EYEBROW_JOINT}, {@link #NAME_TEMPOROMANDIBULAR TEMPOROMANDIBULAR}, {@link #NAME_L_STERNOCLAVICULAR L_STERNOCLAVICULAR}, {@link #NAME_L_ACROMIOCLAVICULAR L_ACROMIOCLAVICULAR}, {@link #NAME_L_SHOULDER L_SHOULDER}, {@link #NAME_L_ELBOW L_ELBOW}, {@link #NAME_L_RADIOCARPAL L_RADIOCARPAL}, {@link #NAME_L_MIDCARPAL_1 L_MIDCARPAL_1}, {@link #NAME_L_CARPOMETACARPAL_1 L_CARPOMETACARPAL_1}, {@link #NAME_L_METACARPOPHALANGEAL_1 L_METACARPOPHALANGEAL_1}, {@link #NAME_L_CARPAL_INTERPHALANGEAL_1 L_CARPAL_INTERPHALANGEAL_1}, {@link #NAME_L_MIDCARPAL_2 L_MIDCARPAL_2}, {@link #NAME_L_CARPOMETACARPAL_2 L_CARPOMETACARPAL_2}, {@link #NAME_L_METACARPOPHALANGEAL_2 L_METACARPOPHALANGEAL_2}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2 L_CARPAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2 L_CARPAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_L_MIDCARPAL_3 L_MIDCARPAL_3}, {@link #NAME_L_CARPOMETACARPAL_3 L_CARPOMETACARPAL_3}, {@link #NAME_L_METACARPOPHALANGEAL_3 L_METACARPOPHALANGEAL_3}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3 L_CARPAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3 L_CARPAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_L_MIDCARPAL_4_5 L_MIDCARPAL_4_5}, {@link #NAME_L_CARPOMETACARPAL_4 L_CARPOMETACARPAL_4}, {@link #NAME_L_METACARPOPHALANGEAL_4 L_METACARPOPHALANGEAL_4}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4 L_CARPAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4 L_CARPAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_L_CARPOMETACARPAL_5 L_CARPOMETACARPAL_5}, {@link #NAME_L_METACARPOPHALANGEAL_5 L_METACARPOPHALANGEAL_5}, {@link #NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5 L_CARPAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5 L_CARPAL_DISTAL_INTERPHALANGEAL_5}, {@link #NAME_R_STERNOCLAVICULAR R_STERNOCLAVICULAR}, {@link #NAME_R_ACROMIOCLAVICULAR R_ACROMIOCLAVICULAR}, {@link #NAME_R_SHOULDER R_SHOULDER}, {@link #NAME_R_ELBOW R_ELBOW}, {@link #NAME_R_RADIOCARPAL R_RADIOCARPAL}, {@link #NAME_R_MIDCARPAL_1 R_MIDCARPAL_1}, {@link #NAME_R_CARPOMETACARPAL_1 R_CARPOMETACARPAL_1}, {@link #NAME_R_METACARPOPHALANGEAL_1 R_METACARPOPHALANGEAL_1}, {@link #NAME_R_CARPAL_INTERPHALANGEAL_1 R_CARPAL_INTERPHALANGEAL_1}, {@link #NAME_R_MIDCARPAL_2 R_MIDCARPAL_2}, {@link #NAME_R_CARPOMETACARPAL_2 R_CARPOMETACARPAL_2}, {@link #NAME_R_METACARPOPHALANGEAL_2 R_METACARPOPHALANGEAL_2}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2 R_CARPAL_PROXIMAL_INTERPHALANGEAL_2}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2 R_CARPAL_DISTAL_INTERPHALANGEAL_2}, {@link #NAME_R_MIDCARPAL_3 R_MIDCARPAL_3}, {@link #NAME_R_CARPOMETACARPAL_3 R_CARPOMETACARPAL_3}, {@link #NAME_R_METACARPOPHALANGEAL_3 R_METACARPOPHALANGEAL_3}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3 R_CARPAL_PROXIMAL_INTERPHALANGEAL_3}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3 R_CARPAL_DISTAL_INTERPHALANGEAL_3}, {@link #NAME_R_MIDCARPAL_4_5 R_MIDCARPAL_4_5}, {@link #NAME_R_CARPOMETACARPAL_4 R_CARPOMETACARPAL_4}, {@link #NAME_R_METACARPOPHALANGEAL_4 R_METACARPOPHALANGEAL_4}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4 R_CARPAL_PROXIMAL_INTERPHALANGEAL_4}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4 R_CARPAL_DISTAL_INTERPHALANGEAL_4}, {@link #NAME_R_CARPOMETACARPAL_5 R_CARPOMETACARPAL_5}, {@link #NAME_R_METACARPOPHALANGEAL_5 R_METACARPOPHALANGEAL_5}, {@link #NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5 R_CARPAL_PROXIMAL_INTERPHALANGEAL_5}, {@link #NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5 R_CARPAL_DISTAL_INTERPHALANGEAL_5}).
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimJointObject setName(String newValue)
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
				namingMessage += "Warning: HAnim name values are lower case, check capitalization/spelling of HAnimJoint name='" + newValue + "'";
		}
		if (!(
			newValue.isEmpty() ||
			newValue.equals(NAME_HUMANOID_ROOT) ||
			newValue.equals(NAME_SACROILIAC) ||
			newValue.equals(NAME_L_HIP) ||
			newValue.equals(NAME_L_KNEE) ||
			newValue.equals(NAME_L_TALOCRURAL) ||
			newValue.equals(NAME_L_TALOCALCANEONAVICULAR) ||
			newValue.equals(NAME_L_CUNEONAVICULAR_1) ||
			newValue.equals(NAME_L_TARSOMETATARSAL_1) ||
			newValue.equals(NAME_L_METATARSOPHALANGEAL_1) ||
			newValue.equals(NAME_L_TARSAL_INTERPHALANGEAL_1) ||
			newValue.equals(NAME_L_CUNEONAVICULAR_2) ||
			newValue.equals(NAME_L_TARSOMETATARSAL_2) ||
			newValue.equals(NAME_L_METATARSOPHALANGEAL_2) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_L_CUNEONAVICULAR_3) ||
			newValue.equals(NAME_L_TARSOMETATARSAL_3) ||
			newValue.equals(NAME_L_METATARSOPHALANGEAL_3) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_L_CALCANEOCUBOID) ||
			newValue.equals(NAME_L_TRANSVERSETARSAL) ||
			newValue.equals(NAME_L_TARSOMETATARSAL_4) ||
			newValue.equals(NAME_L_METATARSOPHALANGEAL_4) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_L_TARSOMETATARSAL_5) ||
			newValue.equals(NAME_L_METATARSOPHALANGEAL_5) ||
			newValue.equals(NAME_L_TARSAL_PROXIMAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_L_TARSAL_DISTAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_R_HIP) ||
			newValue.equals(NAME_R_KNEE) ||
			newValue.equals(NAME_R_TALOCRURAL) ||
			newValue.equals(NAME_R_TALOCALCANEONAVICULAR) ||
			newValue.equals(NAME_R_CUNEONAVICULAR_1) ||
			newValue.equals(NAME_R_TARSOMETATARSAL_1) ||
			newValue.equals(NAME_R_METATARSOPHALANGEAL_1) ||
			newValue.equals(NAME_R_TARSAL_INTERPHALANGEAL_1) ||
			newValue.equals(NAME_R_CUNEONAVICULAR_2) ||
			newValue.equals(NAME_R_TARSOMETATARSAL_2) ||
			newValue.equals(NAME_R_METATARSOPHALANGEAL_2) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_R_CUNEONAVICULAR_3) ||
			newValue.equals(NAME_R_TARSOMETATARSAL_3) ||
			newValue.equals(NAME_R_METATARSOPHALANGEAL_3) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_R_CALCANEOCUBOID) ||
			newValue.equals(NAME_R_TRANSVERSETARSAL) ||
			newValue.equals(NAME_R_TARSOMETATARSAL_4) ||
			newValue.equals(NAME_R_METATARSOPHALANGEAL_4) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_R_TARSOMETATARSAL_5) ||
			newValue.equals(NAME_R_METATARSOPHALANGEAL_5) ||
			newValue.equals(NAME_R_TARSAL_PROXIMAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_R_TARSAL_DISTAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_VL5) ||
			newValue.equals(NAME_VL4) ||
			newValue.equals(NAME_VL3) ||
			newValue.equals(NAME_VL2) ||
			newValue.equals(NAME_VL1) ||
			newValue.equals(NAME_VT12) ||
			newValue.equals(NAME_VT11) ||
			newValue.equals(NAME_VT10) ||
			newValue.equals(NAME_VT9) ||
			newValue.equals(NAME_VT8) ||
			newValue.equals(NAME_VT7) ||
			newValue.equals(NAME_VT6) ||
			newValue.equals(NAME_VT5) ||
			newValue.equals(NAME_VT4) ||
			newValue.equals(NAME_VT3) ||
			newValue.equals(NAME_VT2) ||
			newValue.equals(NAME_VT1) ||
			newValue.equals(NAME_VC7) ||
			newValue.equals(NAME_VC6) ||
			newValue.equals(NAME_VC5) ||
			newValue.equals(NAME_VC4) ||
			newValue.equals(NAME_VC3) ||
			newValue.equals(NAME_VC2) ||
			newValue.equals(NAME_VC1) ||
			newValue.equals(NAME_SKULLBASE) ||
			newValue.equals(NAME_L_EYELID_JOINT) ||
			newValue.equals(NAME_R_EYELID_JOINT) ||
			newValue.equals(NAME_L_EYEBALL_JOINT) ||
			newValue.equals(NAME_R_EYEBALL_JOINT) ||
			newValue.equals(NAME_L_EYEBROW_JOINT) ||
			newValue.equals(NAME_R_EYEBROW_JOINT) ||
			newValue.equals(NAME_TEMPOROMANDIBULAR) ||
			newValue.equals(NAME_L_STERNOCLAVICULAR) ||
			newValue.equals(NAME_L_ACROMIOCLAVICULAR) ||
			newValue.equals(NAME_L_SHOULDER) ||
			newValue.equals(NAME_L_ELBOW) ||
			newValue.equals(NAME_L_RADIOCARPAL) ||
			newValue.equals(NAME_L_MIDCARPAL_1) ||
			newValue.equals(NAME_L_CARPOMETACARPAL_1) ||
			newValue.equals(NAME_L_METACARPOPHALANGEAL_1) ||
			newValue.equals(NAME_L_CARPAL_INTERPHALANGEAL_1) ||
			newValue.equals(NAME_L_MIDCARPAL_2) ||
			newValue.equals(NAME_L_CARPOMETACARPAL_2) ||
			newValue.equals(NAME_L_METACARPOPHALANGEAL_2) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_L_MIDCARPAL_3) ||
			newValue.equals(NAME_L_CARPOMETACARPAL_3) ||
			newValue.equals(NAME_L_METACARPOPHALANGEAL_3) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_L_MIDCARPAL_4_5) ||
			newValue.equals(NAME_L_CARPOMETACARPAL_4) ||
			newValue.equals(NAME_L_METACARPOPHALANGEAL_4) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_L_CARPOMETACARPAL_5) ||
			newValue.equals(NAME_L_METACARPOPHALANGEAL_5) ||
			newValue.equals(NAME_L_CARPAL_PROXIMAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_L_CARPAL_DISTAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_R_STERNOCLAVICULAR) ||
			newValue.equals(NAME_R_ACROMIOCLAVICULAR) ||
			newValue.equals(NAME_R_SHOULDER) ||
			newValue.equals(NAME_R_ELBOW) ||
			newValue.equals(NAME_R_RADIOCARPAL) ||
			newValue.equals(NAME_R_MIDCARPAL_1) ||
			newValue.equals(NAME_R_CARPOMETACARPAL_1) ||
			newValue.equals(NAME_R_METACARPOPHALANGEAL_1) ||
			newValue.equals(NAME_R_CARPAL_INTERPHALANGEAL_1) ||
			newValue.equals(NAME_R_MIDCARPAL_2) ||
			newValue.equals(NAME_R_CARPOMETACARPAL_2) ||
			newValue.equals(NAME_R_METACARPOPHALANGEAL_2) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_2) ||
			newValue.equals(NAME_R_MIDCARPAL_3) ||
			newValue.equals(NAME_R_CARPOMETACARPAL_3) ||
			newValue.equals(NAME_R_METACARPOPHALANGEAL_3) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_3) ||
			newValue.equals(NAME_R_MIDCARPAL_4_5) ||
			newValue.equals(NAME_R_CARPOMETACARPAL_4) ||
			newValue.equals(NAME_R_METACARPOPHALANGEAL_4) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_4) ||
			newValue.equals(NAME_R_CARPOMETACARPAL_5) ||
			newValue.equals(NAME_R_METACARPOPHALANGEAL_5) ||
			newValue.equals(NAME_R_CARPAL_PROXIMAL_INTERPHALANGEAL_5) ||
			newValue.equals(NAME_R_CARPAL_DISTAL_INTERPHALANGEAL_5)))
		{
			String warningMessage = "Warning: HAnimJoint name newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
			if (!namingMessage.trim().isEmpty())              System.out.println(namingMessage);
		}
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimJoint name
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("HAnimJoint name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Orientation of children relative to local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  default pose is typically empty (or an identity rotation) to avoid distorted body animations. </li> 
 * </ul>
	 * @return value of rotation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getRotation()
	{
		return rotation;
	}

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Orientation of children relative to local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  default pose is typically empty (or an identity rotation) to avoid distorted body animations. </li> 
 * </ul>
	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setRotation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint rotation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		rotation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation rotation field, similar to {@link #setRotation(float[])}.
	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setRotation(SFRotationObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setRotation(float x, float y, float z, float angleRadians)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setRotation(double x, double y, double z, double angleRadians)
	{
		return setRotation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setRotation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setRotation(double[] newArray)
	{
		return setRotation(new SFRotationObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results within allowed range of (0,infinity) from inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @return value of scale field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setScale(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint scale newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] <= 0f) || (newValue[1] <= 0f) || (newValue[2] <= 0f)) {
                throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint scale newValue=" + newValue + " has component value less than (or equal to) restriction minExclusive=0");
        }
		scale = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f scale field, similar to {@link #setScale(float[])}.
	 * @param newValue is new value for the scale field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScale(SFVec3fObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScale(float x, float y, float z)
	{
		setScale(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setScale(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScale(double x, double y, double z)
	{
		return setScale(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setScale(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScale(double[] newArray)
	{
		return setScale(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @return value of scaleOrientation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setScaleOrientation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint scaleOrientation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		scaleOrientation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation scaleOrientation field, similar to {@link #setScaleOrientation(float[])}.
	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScaleOrientation(SFRotationObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScaleOrientation(float x, float y, float z, float angleRadians)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScaleOrientation(double x, double y, double z, double angleRadians)
	{
		return setScaleOrientation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setScaleOrientation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setScaleOrientation(double[] newArray)
	{
		return setScaleOrientation(new SFRotationObject(newArray));
	}
	/**
	 * Provide array of Integer results within allowed range of [0,infinity) from inputOutput MFInt32 field named <i>skinCoordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Coordinate index values referencing which vertices are influenced by the HAnimJoint.
 * <ul>
 *  <li> <i>Warning:</i> -1 sentinel values are not allowed. </li> 
 *  <li> <i>Hint:</i> corresponding skinCoord Coordinate and skinNormal Normal nodes are directly contained within the ancestor HAnimHumanoid node for this HAnimJoint. </li> 
 *  <li> <i>Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @return value of skinCoordIndex field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int[] getSkinCoordIndex()
	{
		final int[] valuesArray = new int[skinCoordIndex.size()];
		int i = 0;
		for (Integer arrayElement : skinCoordIndex) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFInt32 skinCoordIndex field, similar to {@link #getSkinCoordIndex()}.
	 * @return value of skinCoordIndex field
	 */
	public ArrayList<Integer> getSkinCoordIndexList()
	{
		return skinCoordIndex;
	}
	/**
	 * Utility method to get String value of MFInt32 skinCoordIndex field, similar to {@link #getSkinCoordIndex()}.
	 * @return value of skinCoordIndex field
	 */
	public String getSkinCoordIndexString()
    {
        StringBuilder result = new StringBuilder();
		for (Integer arrayElement : skinCoordIndex) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Integer array to inputOutput MFInt32 field named <i>skinCoordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Coordinate index values referencing which vertices are influenced by the HAnimJoint.
 * <ul>
 *  <li> <i>Warning:</i> -1 sentinel values are not allowed. </li> 
 *  <li> <i>Hint:</i> corresponding skinCoord Coordinate and skinNormal Normal nodes are directly contained within the ancestor HAnimHumanoid node for this HAnimJoint. </li> 
 *  <li> <i>Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @param newValue is new value for the skinCoordIndex field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setSkinCoordIndex(int[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearSkinCoordIndex(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSkinCoordIndex(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			skinCoordIndex.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFInt32 skinCoordIndex field, similar to {@link #setSkinCoordIndex(int[])}.
	 * @param newValue is new value for the skinCoordIndex field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setSkinCoordIndex(MFInt32Object newValue)
	{
		if (newValue == null)		{
			clearSkinCoordIndex(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSkinCoordIndex(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFInt32 skinCoordIndex field, similar to {@link #setSkinCoordIndex(int[])}.
	 * @param newValue is new value for the skinCoordIndex field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setSkinCoordIndex(ArrayList<Integer> newValue)
	{
		if (newValue == null)		{
			clearSkinCoordIndex(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearSkinCoordIndex(); // reset
        else
        {
            int[] newArray = new int[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSkinCoordIndex(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFInt32 value of skinCoordIndex field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimJointObject clearSkinCoordIndex()
	{
		skinCoordIndex.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton int value to MFInt32 skinCoordIndex field.
	 * @param newValue is new value to add to the skinCoordIndex field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject addSkinCoordIndex(int newValue)
	{
		skinCoordIndex.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFInt32Object value to MFInt32 skinCoordIndex field.
	 * @param newValue is new value to add to the skinCoordIndex field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject addSkinCoordIndex(SFInt32Object newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		skinCoordIndex.add(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Provide array of Float results from inputOutput MFFloat field named <i>skinCoordWeight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Weight deformation values for the corresponding values in the skinCoordIndex field.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @return value of skinCoordWeight field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getSkinCoordWeight()
	{
		final float[] valuesArray = new float[skinCoordWeight.size()];
		int i = 0;
		for (Float arrayElement : skinCoordWeight) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat skinCoordWeight field, similar to {@link #getSkinCoordWeight()}.
	 * @return value of skinCoordWeight field
	 */
	public ArrayList<Float> getSkinCoordWeightList()
	{
		return skinCoordWeight;
	}
	/**
	 * Utility method to get String value of MFFloat skinCoordWeight field, similar to {@link #getSkinCoordWeight()}.
	 * @return value of skinCoordWeight field
	 */
	public String getSkinCoordWeightString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : skinCoordWeight) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to inputOutput MFFloat field named <i>skinCoordWeight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Weight deformation values for the corresponding values in the skinCoordIndex field.
 * <ul>
 *  <li> <i> Warning:</i>  index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 * </ul>
	 * @param newValue is new value for the skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setSkinCoordWeight(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearSkinCoordWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSkinCoordWeight(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			skinCoordWeight.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat skinCoordWeight field, similar to {@link #setSkinCoordWeight(float[])}.
	 * @param newValue is new value for the skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setSkinCoordWeight(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearSkinCoordWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSkinCoordWeight(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat skinCoordWeight field, similar to {@link #setSkinCoordWeight(float[])}.
	 * @param newValue is new value for the skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setSkinCoordWeight(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearSkinCoordWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearSkinCoordWeight(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSkinCoordWeight(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimJointObject clearSkinCoordWeight()
	{
		skinCoordWeight.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat skinCoordWeight field, similar to {@link #setSkinCoordWeight(float[])}.
	 * @param newValue is new value for the skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setSkinCoordWeight(int[] newValue)
	{
		if (newValue == null)		{
			clearSkinCoordWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setSkinCoordWeight(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat skinCoordWeight field.
	 * @param newValue is new value to add to the skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject addSkinCoordWeight(float newValue)
	{
		skinCoordWeight.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat skinCoordWeight field.
	 * @param newValue is new value to add to the skinCoordWeight field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject addSkinCoordWeight(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		skinCoordWeight.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setSkinCoordWeight(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setSkinCoordWeight(double[] newArray)
	{
		return setSkinCoordWeight(new MFFloatObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results within allowed range of [0,1] from inputOutput SFVec3f field named <i>stiffness</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] A scale factor of (1 - stiffness) is applied around the corresponding axis (X, Y, or Z for entries 0, 1 and 2 of the stiffness field). Thus a stiffness value of zero means that no rotation scaling occurs, while a stiffness value of one means that no rotation occurs regardless of any provided rotation.
 * <ul>
 *  <li> <i> Hint:</i>  used by inverse kinematics (IK) systems. </li> 
 * </ul>
	 * @return value of stiffness field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getStiffness()
	{
		return stiffness;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>stiffness</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] A scale factor of (1 - stiffness) is applied around the corresponding axis (X, Y, or Z for entries 0, 1 and 2 of the stiffness field). Thus a stiffness value of zero means that no rotation scaling occurs, while a stiffness value of one means that no rotation occurs regardless of any provided rotation.
 * <ul>
 *  <li> <i> Hint:</i>  used by inverse kinematics (IK) systems. </li> 
 * </ul>
	 * @param newValue is new value for the stiffness field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setStiffness(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint stiffness newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint stiffness newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint stiffness newValue=" + SFVec3fObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		stiffness = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f stiffness field, similar to {@link #setStiffness(float[])}.
	 * @param newValue is new value for the stiffness field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setStiffness(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setStiffness(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f stiffness field, similar to {@link #setStiffness(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setStiffness(float x, float y, float z)
	{
		setStiffness(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setStiffness(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setStiffness(double x, double y, double z)
	{
		return setStiffness(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setStiffness(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setStiffness(double[] newArray)
	{
		return setStiffness(new SFVec3fObject(newArray));
	}
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
 *  <li> <i>Warning:</i> usually HAnimJoint position is controlled by the center field, not the translation field. </li> 
 *  <li> <i>Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 * </ul>
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setTranslation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint translation newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		translation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f translation field, similar to {@link #setTranslation(float[])}.
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setTranslation(SFVec3fObject newValue)
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

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setTranslation(float x, float y, float z)
	{
		setTranslation(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setTranslation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setTranslation(double x, double y, double z)
	{
		return setTranslation(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setTranslation(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setTranslation(double[] newArray)
	{
		return setTranslation(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>ulimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Upper limit for maximum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @return value of ulimit field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getUlimit()
	{
		return ulimit;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>ulimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Upper limit for maximum joint rotation in radians.
 * <ul>
 *  <li> <i> Hint:</i>  always contains 3 values, one for each local axis. </li> 
 * </ul>
	 * @param newValue is new value for the ulimit field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setUlimit(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint ulimit newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		ulimit = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f ulimit field, similar to {@link #setUlimit(float[])}.
	 * @param newValue is new value for the ulimit field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setUlimit(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUlimit(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f ulimit field, similar to {@link #setUlimit(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setUlimit(float x, float y, float z)
	{
		setUlimit(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setUlimit(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setUlimit(double x, double y, double z)
	{
		return setUlimit(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setUlimit(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setUlimit(double[] newArray)
	{
		return setUlimit(new SFVec3fObject(newArray));
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible()
	{
		return visible;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimJointObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setVisible(SFBoolObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimJointObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimJoint DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint DEF newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimJointObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimJoint USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimJoint USE newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimJointObject setCssClass(String newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setCssClass(SFStringObject newValue)
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
	 * @return {@link HAnimJointObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimJointObject setUSE(HAnimJointObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on HAnimJointObject" +
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
	public HAnimJointObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Utility constructor that assigns both DEF label and name, after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 * @param newName  name for this meta element
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimJointObject">X3D Tooltips: HAnimJointObject</a>
	 */
	public HAnimJointObject (String DEFlabel, String newName)
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
		boolean      hasChild = (IS != null) || (!children.isEmpty()) || (!displacers.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null);

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<HAnimJoint"); // start opening tag
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
			if ((!Arrays.equals(getLimitOrientation(), LIMITORIENTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" limitOrientation='").append(SFRotationObject.toString(getLimitOrientation())).append("'");
			}
			if ((!Arrays.equals(getLlimit(), LLIMIT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" llimit='").append(SFVec3fObject.toString(getLlimit())).append("'");
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
			if (((getSkinCoordIndex().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" skinCoordIndex='").append(MFInt32Object.toString(getSkinCoordIndex())).append("'");
			}
			if (((getSkinCoordWeight().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" skinCoordWeight='").append(MFFloatObject.toString(getSkinCoordWeight())).append("'");
			}
			if ((!Arrays.equals(getStiffness(), STIFFNESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" stiffness='").append(SFVec3fObject.toString(getStiffness())).append("'");
			}
			if ((!Arrays.equals(getTranslation(), TRANSLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" translation='").append(SFVec3fObject.toString(getTranslation())).append("'");
			}
			if ((!Arrays.equals(getUlimit(), ULIMIT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" ulimit='").append(SFVec3fObject.toString(getUlimit())).append("'");
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
			for (X3DNode element : displacers)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</HAnimJoint>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=HAnimJoint, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (!children.isEmpty()) || (!displacers.isEmpty()) || (IS != null) || (metadata != null) || (metadataProtoInstance != null);
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
			stringClassicVRML.append("HAnimJoint").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("limitOrientation"))
						{
							stringClassicVRML.append(indentCharacter).append("limitOrientation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getLimitOrientation(), LIMITORIENTATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("limitOrientation ").append(SFRotationObject.toString(getLimitOrientation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("llimit"))
						{
							stringClassicVRML.append(indentCharacter).append("llimit").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getLlimit(), LLIMIT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("llimit ").append(SFVec3fObject.toString(getLlimit())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("skinCoordIndex"))
						{
							stringClassicVRML.append(indentCharacter).append("skinCoordIndex").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSkinCoordIndex().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("skinCoordIndex ").append("[ ").append(MFInt32Object.toString(getSkinCoordIndex())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("skinCoordWeight"))
						{
							stringClassicVRML.append(indentCharacter).append("skinCoordWeight").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSkinCoordWeight().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("skinCoordWeight ").append("[ ").append(MFFloatObject.toString(getSkinCoordWeight())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("stiffness"))
						{
							stringClassicVRML.append(indentCharacter).append("stiffness").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getStiffness(), STIFFNESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("stiffness ").append(SFVec3fObject.toString(getStiffness())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("ulimit"))
						{
							stringClassicVRML.append(indentCharacter).append("ulimit").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getUlimit(), ULIMIT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("ulimit ").append(SFVec3fObject.toString(getUlimit())).append("\n").append(indent).append(indentCharacter);
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
        
		setCenter(getCenter()); // exercise field checks, simple types
        
		setDescription(getDescription()); // exercise field checks, simple types
        
		setLimitOrientation(getLimitOrientation()); // exercise field checks, simple types
        
		setLlimit(getLlimit()); // exercise field checks, simple types
        
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
        
		setSkinCoordIndex(getSkinCoordIndex()); // exercise field checks, simple types
        
		setSkinCoordWeight(getSkinCoordWeight()); // exercise field checks, simple types
        
		setStiffness(getStiffness()); // exercise field checks, simple types
        
		setTranslation(getTranslation()); // exercise field checks, simple types
        
		setUlimit(getUlimit()); // exercise field checks, simple types
        
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
			String errorNotice = "HAnimJoint USE='" + getUSE() + "' is not allowed to have contained MFNode children";
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
			String errorNotice = "HAnimJoint USE='" + getUSE() + "' is not allowed to have contained MFNode displacers";
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
			String errorNotice = "HAnimJoint USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
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
			String errorNotice = "HAnimJoint USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
         // test for correct parent
         X3DConcreteElement parent = getParentObject();
         if (hasParentObject())
         {
             if      (parent.getElementName().equals(HAnimJointObject.NAME))
             {
                 // now test for correct parent-child LOA4 relationship pair
                 if (!hasParentMatchingName(((HAnimJointObject)parent).getName()))
                 {
                     String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE +
                         ": illegal parent name found: '" + ((HAnimJointObject)parent).getName() + "' instead of TODO" ;
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
					"' for parent X3D model containing 'HAnimJoint' node, add head statement <component name='HAnim' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"HAnim\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
