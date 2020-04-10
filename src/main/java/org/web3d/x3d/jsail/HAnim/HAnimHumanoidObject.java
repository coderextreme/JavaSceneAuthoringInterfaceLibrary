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
import org.web3d.x3d.sai.HAnim.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.HAnim.*;
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
import org.web3d.x3d.sai.HAnim.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.HAnim.*;
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
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Rendering.*;
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
import java.util.Arrays;

/**
 * The HAnimHumanoid node is used to: (a) store references to the joints, segments, sites, skeleton, optional skin, and fixed viewpoints, (b) serve as a container for the entire humanoid, (c) provide a convenient way of moving the humanoid through its environment, and (d) store human-readable metadata such as name, version, author, copyright, age, gender and other information.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DChildNode,X3DBoundedObject] The HAnimHumanoid node is used to: (a) store references to the joints, segments, sites, skeleton, optional skin, and fixed viewpoints, (b) serve as a container for the entire humanoid, (c) provide a convenient way of moving the humanoid through its environment, and (d) store human-readable metadata such as name, version, author, copyright, age, gender and other information. HAnimHumanoid contains a skeleton consisting of HAnimJoint, HAnimSegment and HAnimSite nodes. HAnimHumanoid can also contain an optional skin consisting of an IndexedFaceSet mesh with corresponding skinCoord Coordinate|CoordinateDouble vertices and skinNormal Normal vectors.
 * <ul>
 *  <li> <i>Hint:</i> MFNode arrays for the joints, segments, sites, and viewpoints fields provide lists for all HAnim nodes found in the skeleton hierarchy and thus only contain USE node references. </li> 
 *  <li> <i>Hint:</i> H-Anim Specification <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/HAnimArchitecture.html</a> </li> 
 *  <li> <i>Hint:</i> H-Anim Specification, Humanoid <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Humanoid" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/ObjectInterfaces.html#Humanoid</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/HumanoidAnimation.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='1'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimHumanoid" target="blank">X3D Abstract Specification: HAnimHumanoid</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimHumanoid" target="_blank">X3D Tooltips: HAnimHumanoid</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class HAnimHumanoidObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.HAnim.HAnimHumanoid
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=center, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=center, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] center; // SFVec3f

 /* @name=description, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=description, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String description; // SFString

 /* @name=info, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=info, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> info = new ArrayList<>(); // MFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=jointBindingPositions, @type=MFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=jointBindingPositions, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] jointBindingPositions; // MFVec3f

 /* @name=jointBindingRotations, @type=MFRotation, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=jointBindingRotations, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] jointBindingRotations; // MFRotation

 /* @name=jointBindingScales, @type=MFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=jointBindingScales, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] jointBindingScales; // MFVec3f

 /* @name=joints, @type=MFNode, $javaType=ArrayList<HAnimJointObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimJointObject>, $normalizedMemberObjectName=joints, $isX3dStatement=false, @acceptableNodeTypes=HAnimJoint */ 
	private ArrayList<X3DNode> joints = new ArrayList<>(); // MFNode acceptable node types: HAnimJoint or ProtoInstanceObject

 /* @name=loa, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=loa, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int loa; // SFInt32

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=motions, @type=MFNode, $javaType=ArrayList<HAnimMotionObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimMotionObject>, $normalizedMemberObjectName=motions, $isX3dStatement=false, @acceptableNodeTypes=HAnimMotion */ 
	private ArrayList<X3DNode> motions = new ArrayList<>(); // MFNode acceptable node types: HAnimMotion or ProtoInstanceObject

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

 /* @name=rotation, @type=SFRotation, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=rotation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] rotation; // SFRotation

 /* @name=scale, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=scale, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] scale; // SFVec3f

 /* @name=scaleOrientation, @type=SFRotation, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=scaleOrientation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] scaleOrientation; // SFRotation

 /* @name=segments, @type=MFNode, $javaType=ArrayList<HAnimSegmentObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimSegmentObject>, $normalizedMemberObjectName=segments, $isX3dStatement=false, @acceptableNodeTypes=HAnimSegment */ 
	private ArrayList<X3DNode> segments = new ArrayList<>(); // MFNode acceptable node types: HAnimSegment or ProtoInstanceObject

 /* @name=sites, @type=MFNode, $javaType=ArrayList<HAnimSiteObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimSiteObject>, $normalizedMemberObjectName=sites, $isX3dStatement=false, @acceptableNodeTypes=HAnimSite */ 
	private ArrayList<X3DNode> sites = new ArrayList<>(); // MFNode acceptable node types: HAnimSite or ProtoInstanceObject

 /* @name=skeletalConfiguration, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=skeletalConfiguration, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String skeletalConfiguration; // SFString

 /* @name=skeleton, @type=MFNode, $javaType=ArrayList<X3DNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DNode>, $normalizedMemberObjectName=skeleton, $isX3dStatement=false, @acceptableNodeTypes=HAnimJoint|HAnimSite */ 
	private ArrayList<X3DNode> skeleton = new ArrayList<>(); // MFNode acceptable node types: HAnimJoint|HAnimSite or ProtoInstanceObject

 /* @name=skin, @type=MFNode, $javaType=ArrayList<X3DNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DNode>, $normalizedMemberObjectName=skin, $isX3dStatement=false, @acceptableNodeTypes=Group|Transform|Shape|IndexedFaceSet */ 
	private ArrayList<X3DNode> skin = new ArrayList<>(); // MFNode acceptable node types: Group|Transform|Shape|IndexedFaceSet or ProtoInstanceObject

 /* @name=skinBindingCoords, @type=SFNode, $javaType=X3DCoordinateNode, $javaReferenceType=X3DCoordinateNode, $javaPrimitiveType=X3DCoordinateNode, $normalizedMemberObjectName=skinBindingCoords, $isX3dStatement=false, @acceptableNodeTypes=X3DCoordinateNode */ 
	private X3DCoordinateNode skinBindingCoords; // SFNode acceptable node types: X3DCoordinateNode or ProtoInstanceObject
	private ProtoInstanceObject skinBindingCoordsProtoInstance; // allowed alternative for skinBindingCoords field

 /* @name=skinBindingNormals, @type=SFNode, $javaType=X3DNormalNode, $javaReferenceType=X3DNormalNode, $javaPrimitiveType=X3DNormalNode, $normalizedMemberObjectName=skinBindingNormals, $isX3dStatement=false, @acceptableNodeTypes=X3DNormalNode */ 
	private X3DNormalNode skinBindingNormals; // SFNode acceptable node types: X3DNormalNode or ProtoInstanceObject
	private ProtoInstanceObject skinBindingNormalsProtoInstance; // allowed alternative for skinBindingNormals field

 /* @name=skinCoord, @type=SFNode, $javaType=X3DCoordinateNode, $javaReferenceType=X3DCoordinateNode, $javaPrimitiveType=X3DCoordinateNode, $normalizedMemberObjectName=skinCoord, $isX3dStatement=false, @acceptableNodeTypes=X3DCoordinateNode */ 
	private X3DCoordinateNode skinCoord; // SFNode acceptable node types: X3DCoordinateNode or ProtoInstanceObject
	private ProtoInstanceObject skinCoordProtoInstance; // allowed alternative for skinCoord field

 /* @name=skinNormal, @type=SFNode, $javaType=X3DNormalNode, $javaReferenceType=X3DNormalNode, $javaPrimitiveType=X3DNormalNode, $normalizedMemberObjectName=skinNormal, $isX3dStatement=false, @acceptableNodeTypes=X3DNormalNode */ 
	private X3DNormalNode skinNormal; // SFNode acceptable node types: X3DNormalNode or ProtoInstanceObject
	private ProtoInstanceObject skinNormalProtoInstance; // allowed alternative for skinNormal field

 /* @name=translation, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=translation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] translation; // SFVec3f

 /* @name=version, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=version, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String version; // SFString

 /* @name=viewpoints, @type=MFNode, $javaType=ArrayList<HAnimSiteObject>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<HAnimSiteObject>, $normalizedMemberObjectName=viewpoints, $isX3dStatement=false, @acceptableNodeTypes=HAnimSite */ 
	private ArrayList<X3DNode> viewpoints = new ArrayList<>(); // MFNode acceptable node types: HAnimSite or ProtoInstanceObject

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "1.0", "1.1", "2.0".
<br ><br >
	 * hanimVersionChoices enumeration constants are used to identify the allowed versions for an HAnimHumanoid node. Note that HAnim version 2.0 is under review, while versions 1.0/1.1 include small incompatibilities.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimHumanoid" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html#HAnimHumanoid</a> 
	*/
	public static final ArrayList<String> hanimVersionChoices = new ArrayList<>(Arrays.<String>asList("1.0", "1.1", "2.0"));

	/** 
	 * <i>Tooltip:</i> International standard HAnim 19774 version 1 approved by ISO in 2006.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>hanimVersionChoices</i> can equal this value <i>"1.0"</i> (Java syntax) or <i>1.0</i> (XML syntax).
	 * @see #hanimVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/ObjectInterfaces.html#Humanoid" target="_blank">https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/ObjectInterfaces.html#Humanoid</a>  */
	public static final String VERSION_1_0 = "1.0";

	/** 
	 * <i>Tooltip:</i> International standard HAnim 19774 version 1 amendment.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>hanimVersionChoices</i> can equal this value <i>"1.1"</i> (Java syntax) or <i>1.1</i> (XML syntax).
	 * @see #hanimVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/ObjectInterfaces.html#Humanoid" target="_blank">https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/ObjectInterfaces.html#Humanoid</a>  */
	public static final String VERSION_1_1 = "1.1";

	/** 
	 * <i>Tooltip:</i> Draft revision standard HAnim 19774 version 2 under review by ISO in 2018.
	 * SFString field named <i>version</i> with X3DUOM baseType <i>hanimVersionChoices</i> can equal this value <i>"2.0"</i> (Java syntax) or <i>2.0</i> (XML syntax).
	 * @see #hanimVersionChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/ObjectInterfaces.html#Humanoid" target="_blank">https://www.web3d.org/documents/specifications/19774/V1.0/HAnim/ObjectInterfaces.html#Humanoid</a>  */
	public static final String VERSION_2_0 = "2.0";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>HAnimHumanoid</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "HAnimHumanoid";

	/** Provides name of this element: <i>HAnimHumanoid</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>HAnimHumanoid</i> element: <i>HAnim</i> */
	public static final String COMPONENT = "HAnim";

	/** Defines X3D component for the <i>HAnimHumanoid</i> element: <i>HAnim</i>
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

	/** MFString field named <i>info</i> has default value equal to an empty list. */
	public static final ArrayList<String> INFO_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** MFVec3f field named <i>jointBindingPositions</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] JOINTBINDINGPOSITIONS_DEFAULT_VALUE = {0f,0f,0f};

	/** MFRotation field named <i>jointBindingRotations</i> has default value <i>{0f,0f,1f,0f}</i> (Java syntax) or <i>0 0 1 0</i> (XML syntax). */
	public static final float[] JOINTBINDINGROTATIONS_DEFAULT_VALUE = {0f,0f,1f,0f};

	/** MFVec3f field named <i>jointBindingScales</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] JOINTBINDINGSCALES_DEFAULT_VALUE = {0f,0f,0f};

	/** SFInt32 field named <i>loa</i> has default value <i>-1</i> (Java syntax) or <i>-1</i> (XML syntax). */
	public static final int LOA_DEFAULT_VALUE = -1;

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

	/** SFString field named <i>skeletalConfiguration</i> has default value <i>"BASIC"</i> (Java syntax) or <i>BASIC</i> (XML syntax). */
	public static final String SKELETALCONFIGURATION_DEFAULT_VALUE = "BASIC";

	/** SFNode field named <i>skinBindingCoords</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DCoordinateNode SKINBINDINGCOORDS_DEFAULT_VALUE = null;

	/** SFNode field named <i>skinBindingNormals</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNormalNode SKINBINDINGNORMALS_DEFAULT_VALUE = null;

	/** SFNode field named <i>skinCoord</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DCoordinateNode SKINCOORD_DEFAULT_VALUE = null;

	/** SFNode field named <i>skinNormal</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNormalNode SKINNORMAL_DEFAULT_VALUE = null;

	/** SFVec3f field named <i>translation</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] TRANSLATION_DEFAULT_VALUE = {0f,0f,0f};

	/** SFString field named <i>version</i> has default value <i>"2.0"</i> (Java syntax) or <i>2.0</i> (XML syntax). */
	public static final String VERSION_DEFAULT_VALUE = "2.0";

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
			case "bboxCenter":
				result = "SFVec3f";
				break;
			case "bboxSize":
				result = "SFVec3f";
				break;
			case "center":
				result = "SFVec3f";
				break;
			case "description":
				result = "SFString";
				break;
			case "info":
				result = "MFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "jointBindingPositions":
				result = "MFVec3f";
				break;
			case "jointBindingRotations":
				result = "MFRotation";
				break;
			case "jointBindingScales":
				result = "MFVec3f";
				break;
			case "joints":
				result = "MFNode";
				break;
			case "loa":
				result = "SFInt32";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "motions":
				result = "MFNode";
				break;
			case "name":
				result = "SFString";
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
			case "segments":
				result = "MFNode";
				break;
			case "sites":
				result = "MFNode";
				break;
			case "skeletalConfiguration":
				result = "SFString";
				break;
			case "skeleton":
				result = "MFNode";
				break;
			case "skin":
				result = "MFNode";
				break;
			case "skinBindingCoords":
				result = "SFNode";
				break;
			case "skinBindingNormals":
				result = "SFNode";
				break;
			case "skinCoord":
				result = "SFNode";
				break;
			case "skinNormal":
				result = "SFNode";
				break;
			case "translation":
				result = "SFVec3f";
				break;
			case "version":
				result = "SFString";
				break;
			case "viewpoints":
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
			case "bboxCenter":
				result = "initializeOnly";
				break;
			case "bboxSize":
				result = "initializeOnly";
				break;
			case "center":
				result = "inputOutput";
				break;
			case "description":
				result = "inputOutput";
				break;
			case "info":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "jointBindingPositions":
				result = "inputOutput";
				break;
			case "jointBindingRotations":
				result = "inputOutput";
				break;
			case "jointBindingScales":
				result = "inputOutput";
				break;
			case "joints":
				result = "inputOutput";
				break;
			case "loa":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "motions":
				result = "inputOutput";
				break;
			case "name":
				result = "inputOutput";
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
			case "segments":
				result = "inputOutput";
				break;
			case "sites":
				result = "inputOutput";
				break;
			case "skeletalConfiguration":
				result = "inputOutput";
				break;
			case "skeleton":
				result = "inputOutput";
				break;
			case "skin":
				result = "inputOutput";
				break;
			case "skinBindingCoords":
				result = "inputOutput";
				break;
			case "skinBindingNormals":
				result = "inputOutput";
				break;
			case "skinCoord":
				result = "inputOutput";
				break;
			case "skinNormal":
				result = "inputOutput";
				break;
			case "translation":
				result = "inputOutput";
				break;
			case "version":
				result = "inputOutput";
				break;
			case "viewpoints":
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
	public static final String containerField_DEFAULT_VALUE = "children"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFVec3f field named <i>center</i>. */
	public static final String fromField_CENTER = "center";

	/** toField ROUTE name for SFVec3f field named <i>center</i>. */
	public static final String toField_CENTER = "center";

	/** fromField ROUTE name for SFString field named <i>description</i>. */
	public static final String fromField_DESCRIPTION = "description";

	/** toField ROUTE name for SFString field named <i>description</i>. */
	public static final String toField_DESCRIPTION = "description";

	/** fromField ROUTE name for MFString field named <i>info</i>. */
	public static final String fromField_INFO = "info";

	/** toField ROUTE name for MFString field named <i>info</i>. */
	public static final String toField_INFO = "info";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for MFVec3f field named <i>jointBindingPositions</i>. */
	public static final String fromField_JOINTBINDINGPOSITIONS = "jointBindingPositions";

	/** toField ROUTE name for MFVec3f field named <i>jointBindingPositions</i>. */
	public static final String toField_JOINTBINDINGPOSITIONS = "jointBindingPositions";

	/** fromField ROUTE name for MFRotation field named <i>jointBindingRotations</i>. */
	public static final String fromField_JOINTBINDINGROTATIONS = "jointBindingRotations";

	/** toField ROUTE name for MFRotation field named <i>jointBindingRotations</i>. */
	public static final String toField_JOINTBINDINGROTATIONS = "jointBindingRotations";

	/** fromField ROUTE name for MFVec3f field named <i>jointBindingScales</i>. */
	public static final String fromField_JOINTBINDINGSCALES = "jointBindingScales";

	/** toField ROUTE name for MFVec3f field named <i>jointBindingScales</i>. */
	public static final String toField_JOINTBINDINGSCALES = "jointBindingScales";

	/** fromField ROUTE name for MFNode field named <i>joints</i>. */
	public static final String fromField_JOINTS = "joints";

	/** toField ROUTE name for MFNode field named <i>joints</i>. */
	public static final String toField_JOINTS = "joints";

	/** fromField ROUTE name for SFInt32 field named <i>loa</i>. */
	public static final String fromField_LOA = "loa";

	/** toField ROUTE name for SFInt32 field named <i>loa</i>. */
	public static final String toField_LOA = "loa";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for MFNode field named <i>motions</i>. */
	public static final String fromField_MOTIONS = "motions";

	/** toField ROUTE name for MFNode field named <i>motions</i>. */
	public static final String toField_MOTIONS = "motions";

	/** fromField ROUTE name for SFString field named <i>name</i>. */
	public static final String fromField_NAME = "name";

	/** toField ROUTE name for SFString field named <i>name</i>. */
	public static final String toField_NAME = "name";

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

	/** fromField ROUTE name for MFNode field named <i>segments</i>. */
	public static final String fromField_SEGMENTS = "segments";

	/** toField ROUTE name for MFNode field named <i>segments</i>. */
	public static final String toField_SEGMENTS = "segments";

	/** fromField ROUTE name for MFNode field named <i>sites</i>. */
	public static final String fromField_SITES = "sites";

	/** toField ROUTE name for MFNode field named <i>sites</i>. */
	public static final String toField_SITES = "sites";

	/** fromField ROUTE name for SFString field named <i>skeletalConfiguration</i>. */
	public static final String fromField_SKELETALCONFIGURATION = "skeletalConfiguration";

	/** toField ROUTE name for SFString field named <i>skeletalConfiguration</i>. */
	public static final String toField_SKELETALCONFIGURATION = "skeletalConfiguration";

	/** fromField ROUTE name for MFNode field named <i>skeleton</i>. */
	public static final String fromField_SKELETON = "skeleton";

	/** toField ROUTE name for MFNode field named <i>skeleton</i>. */
	public static final String toField_SKELETON = "skeleton";

	/** fromField ROUTE name for MFNode field named <i>skin</i>. */
	public static final String fromField_SKIN = "skin";

	/** toField ROUTE name for MFNode field named <i>skin</i>. */
	public static final String toField_SKIN = "skin";

	/** fromField ROUTE name for SFNode field named <i>skinBindingCoords</i>. */
	public static final String fromField_SKINBINDINGCOORDS = "skinBindingCoords";

	/** toField ROUTE name for SFNode field named <i>skinBindingCoords</i>. */
	public static final String toField_SKINBINDINGCOORDS = "skinBindingCoords";

	/** fromField ROUTE name for SFNode field named <i>skinBindingNormals</i>. */
	public static final String fromField_SKINBINDINGNORMALS = "skinBindingNormals";

	/** toField ROUTE name for SFNode field named <i>skinBindingNormals</i>. */
	public static final String toField_SKINBINDINGNORMALS = "skinBindingNormals";

	/** fromField ROUTE name for SFNode field named <i>skinCoord</i>. */
	public static final String fromField_SKINCOORD = "skinCoord";

	/** toField ROUTE name for SFNode field named <i>skinCoord</i>. */
	public static final String toField_SKINCOORD = "skinCoord";

	/** fromField ROUTE name for SFNode field named <i>skinNormal</i>. */
	public static final String fromField_SKINNORMAL = "skinNormal";

	/** toField ROUTE name for SFNode field named <i>skinNormal</i>. */
	public static final String toField_SKINNORMAL = "skinNormal";

	/** fromField ROUTE name for SFVec3f field named <i>translation</i>. */
	public static final String fromField_TRANSLATION = "translation";

	/** toField ROUTE name for SFVec3f field named <i>translation</i>. */
	public static final String toField_TRANSLATION = "translation";

	/** fromField ROUTE name for SFString field named <i>version</i>. */
	public static final String fromField_VERSION = "version";

	/** toField ROUTE name for SFString field named <i>version</i>. */
	public static final String toField_VERSION = "version";

	/** fromField ROUTE name for MFNode field named <i>viewpoints</i>. */
	public static final String fromField_VIEWPOINTS = "viewpoints";

	/** toField ROUTE name for MFNode field named <i>viewpoints</i>. */
	public static final String toField_VIEWPOINTS = "viewpoints";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for HAnimHumanoidObject to initialize member variables with default values. */
	public HAnimHumanoidObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "children" }; // type xs:NMTOKEN

		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		center = CENTER_DEFAULT_VALUE;
		description = DESCRIPTION_DEFAULT_VALUE;
		info = new ArrayList<>(INFO_DEFAULT_VALUE);
		IS = null; // clear out any prior node
		jointBindingPositions = JOINTBINDINGPOSITIONS_DEFAULT_VALUE;
		jointBindingRotations = JOINTBINDINGROTATIONS_DEFAULT_VALUE;
		jointBindingScales = JOINTBINDINGSCALES_DEFAULT_VALUE;
		joints = new ArrayList<>();
		loa = LOA_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		motions = new ArrayList<>();
		name = NAME_DEFAULT_VALUE;
		rotation = ROTATION_DEFAULT_VALUE;
		scale = SCALE_DEFAULT_VALUE;
		scaleOrientation = SCALEORIENTATION_DEFAULT_VALUE;
		segments = new ArrayList<>();
		sites = new ArrayList<>();
		skeletalConfiguration = SKELETALCONFIGURATION_DEFAULT_VALUE;
		skeleton = new ArrayList<>();
		skin = new ArrayList<>();
		skinBindingCoords = null;              // clear out any prior node
		skinBindingCoordsProtoInstance = null; // clear out any prior node
		skinBindingNormals = null;              // clear out any prior node
		skinBindingNormalsProtoInstance = null; // clear out any prior node
		skinCoord = null;              // clear out any prior node
		skinCoordProtoInstance = null; // clear out any prior node
		skinNormal = null;              // clear out any prior node
		skinNormalProtoInstance = null; // clear out any prior node
		translation = TRANSLATION_DEFAULT_VALUE;
		version = VERSION_DEFAULT_VALUE;
		viewpoints = new ArrayList<>();
		visible = VISIBLE_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxCenter(SFVec3fObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxCenter(double[] newArray)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxSize(SFVec3fObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Translation offset from origin of local coordinate system.  * <br>

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
	 * <i>Tooltip:</i>  Translation offset from origin of local coordinate system.  * <br>

	 * @param newValue is new value for the center field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid center newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		center = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f center field, similar to {@link #setCenter(float[])}.
	 * @param newValue is new value for the center field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setCenter(SFVec3fObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setCenter(float x, float y, float z)
	{
		setCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setCenter(double x, double y, double z)
	{
		return setCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setCenter(double[] newArray)
	{
		return setCenter(new SFVec3fObject(newArray));
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setDescription(String newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setDescription(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDescription(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of String results from inputOutput MFString field named <i>info</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Contains metadata keyword=value pairs, where approved keyword terms are humanoidVersion authorName authorEmail copyright creationDate usageRestrictions age gender height and weight.
 * <ul>
 *  <li> <i> Hint:</i>  alternate metadata keywords are also allowed. </li> 
 * </ul>
	 * @return value of info field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getInfo()
	{
		final String[] valuesArray = new String[info.size()];
		int i = 0;
		for (String arrayElement : info) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString info field, similar to {@link #getInfo()}.
	 * @return value of info field
	 */
	public ArrayList<String> getInfoList()
	{
		return info;
	}
	/**
	 * Utility method to get String value of MFString info field, similar to {@link #getInfo()}.
	 * @return value of info field
	 */
	public String getInfoString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : info) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>info</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Contains metadata keyword=value pairs, where approved keyword terms are humanoidVersion authorName authorEmail copyright creationDate usageRestrictions age gender height and weight.
 * <ul>
 *  <li> <i> Hint:</i>  alternate metadata keywords are also allowed. </li> 
 * </ul>
	 * @param newValue is new value for the info field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setInfo(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearInfo(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearInfo(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			info.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString info field, similar to {@link #setInfo(String[])}.
	 * @param newValue is new value for the info field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setInfo(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearInfo(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setInfo(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString info field, similar to {@link #setInfo(String[])}.
	 * @param newValue is new value for the info field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setInfo(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearInfo(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setInfo(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString info field, similar to {@link #setInfo(String[])}.
	 * @param newValue is new value for the info field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setInfo(String newValue)
	{
		if (newValue == null)		{
			clearInfo(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearInfo(); // reset
		info.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString info field, similar to {@link #setInfo(String[])}.
	 * @param newValue is new value for the info field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setInfo(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearInfo(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearInfo(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setInfo(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of info field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearInfo()
	{
		info.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString info field.
	 * @param newValue is new value to add to the info field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject addInfo(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !info.contains(newValue))
            info.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString info field.
	 * @param newValue is new value to add to the info field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject addInfo(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !info.contains(newValue.getValue()))
            info.add(newValue.getValue()); // only add if not already present

		return this;
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setIS(ISObject newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimHumanoidObject clearIS()
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
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>jointBindingPositions</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies an array of position values for each HAnimJoint node in the joints field, in order, corresponding to each binding pose.
 * <ul>
 *  <li> <i>Hint:</i> if only one value is provided, it is provided to each Joint equivalently. </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @return value of jointBindingPositions field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getJointBindingPositions()
	{
		return jointBindingPositions;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>jointBindingPositions</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies an array of position values for each HAnimJoint node in the joints field, in order, corresponding to each binding pose.
 * <ul>
 *  <li> <i>Hint:</i> if only one value is provided, it is provided to each Joint equivalently. </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @param newValue is new value for the jointBindingPositions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setJointBindingPositions(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 3 != 0) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid jointBindingPositions newValue=" + MFVec3fObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 3");
		}
		jointBindingPositions = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFVec3f jointBindingPositions field, similar to {@link #setJointBindingPositions(float[])}.
	 * @param newValue is new value for the jointBindingPositions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setJointBindingPositions(MFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setJointBindingPositions(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFVec3fObject value to MFVec3f jointBindingPositions field.
	 * @param newValue is new value to add to the jointBindingPositions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject addJointBindingPositions(SFVec3fObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(jointBindingPositions, jointBindingPositions.length + 3);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, jointBindingPositions.length, 3);
		jointBindingPositions =  result;
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setJointBindingPositions(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setJointBindingPositions(double[] newArray)
	{
		return setJointBindingPositions(new MFVec3fObject(newArray));
	}
	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput MFRotation field named <i>jointBindingRotations</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies an array of rotation values for each HAnimJoint node in the joints field, in order, corresponding to each binding pose.
 * <ul>
 *  <li> <i>Hint:</i> if only one value is provided, it is provided to each Joint equivalently. </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @return value of jointBindingRotations field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getJointBindingRotations()
	{
		return jointBindingRotations;
	}

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput MFRotation field named <i>jointBindingRotations</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies an array of rotation values for each HAnimJoint node in the joints field, in order, corresponding to each binding pose.
 * <ul>
 *  <li> <i>Hint:</i> if only one value is provided, it is provided to each Joint equivalently. </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @param newValue is new value for the jointBindingRotations field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setJointBindingRotations(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 4 != 0) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid jointBindingRotations newValue=" + MFRotationObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 4");
		}
		jointBindingRotations = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFRotation jointBindingRotations field, similar to {@link #setJointBindingRotations(float[])}.
	 * @param newValue is new value for the jointBindingRotations field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setJointBindingRotations(MFRotationObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setJointBindingRotations(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFRotationObject value to MFRotation jointBindingRotations field.
	 * @param newValue is new value to add to the jointBindingRotations field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject addJointBindingRotations(SFRotationObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(jointBindingRotations, jointBindingRotations.length + 4);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, jointBindingRotations.length, 4);
		jointBindingRotations =  result;
		return this;
	}

	/**
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>jointBindingScales</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies an array of scale values for each HAnimJoint node in the joints field, in order, corresponding to each binding pose.
 * <ul>
 *  <li> <i>Hint:</i> if only one value is provided, it is provided to each Joint equivalently. </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @return value of jointBindingScales field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getJointBindingScales()
	{
		return jointBindingScales;
	}

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>jointBindingScales</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies an array of scale values for each HAnimJoint node in the joints field, in order, corresponding to each binding pose.
 * <ul>
 *  <li> <i>Hint:</i> if only one value is provided, it is provided to each Joint equivalently. </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @param newValue is new value for the jointBindingScales field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setJointBindingScales(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length % 3 != 0) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid jointBindingScales newValue=" + MFVec3fObject.toString(newValue) + " has length=" + newValue.length + ", must be a multiple of 3");
		}
		jointBindingScales = newValue;
		return this;
	}

	/**
	 * Assign typed object value to MFVec3f jointBindingScales field, similar to {@link #setJointBindingScales(float[])}.
	 * @param newValue is new value for the jointBindingScales field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setJointBindingScales(MFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setJointBindingScales(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Add singleton SFVec3fObject value to MFVec3f jointBindingScales field.
	 * @param newValue is new value to add to the jointBindingScales field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject addJointBindingScales(SFVec3fObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		float[] result =  Arrays.copyOf(jointBindingScales, jointBindingScales.length + 3);
		System.arraycopy(newValue.getPrimitiveValue(), 0, result, jointBindingScales.length, 3);
		jointBindingScales =  result;
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setJointBindingScales(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setJointBindingScales(double[] newArray)
	{
		return setJointBindingScales(new MFVec3fObject(newArray));
	}
	/**
	 * Provide array of HAnimJointObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimJoint] The joints field contains a list of USE references for all HAnimJoint node instances found within the preceding skeleton hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> order is irrelevant since names are contained in the original DEF objects. </li> 
 *  <li> <i>Hint:</i> these USE nodes can be utilitized by inverse kinematics (IK) and animation engines. </li> 
 *  <li> <i>Warning:</i> the number of contained &amp;lt;HAnimJoint USE='*' containerField='joints'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimJoint node instances found within the preceding skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimJoint USE nodes must include containerField='joints' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimJointObject
	 * @return value of joints field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getJoints()
	{
		final X3DNode[] valuesArray = new X3DNode[joints.size()];
		int i = 0;
		for (X3DNode arrayElement : joints) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode joints field, similar to {@link #getJoints()}.
	 * @return value of joints field
	 */
	public ArrayList<X3DNode> getJointsList()
	{
		return joints;
	}

	/**
	 * Accessor method to assign HAnimJointObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimJoint] The joints field contains a list of USE references for all HAnimJoint node instances found within the preceding skeleton hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> order is irrelevant since names are contained in the original DEF objects. </li> 
 *  <li> <i>Hint:</i> these USE nodes can be utilitized by inverse kinematics (IK) and animation engines. </li> 
 *  <li> <i>Warning:</i> the number of contained &amp;lt;HAnimJoint USE='*' containerField='joints'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimJoint node instances found within the preceding skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimJoint USE nodes must include containerField='joints' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint.
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setJoints(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearJoints(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				joints.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode joints field, similar to {@link #setJoints(X3DNode[])}.
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setJoints(ArrayList<HAnimJointObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearJoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearJoints(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setJoints(newArray);
        }
		for (HAnimJointObject element : newValue)
		{
			joints.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of joints nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint and ProtoInstance.
	 * @param newValue is new value to be appended the joints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addJoints(HAnimJointObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		joints.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for joints field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addJoints(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		joints.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child joints nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint.
	 * @param newValue is new value array to be appended the joints field.
	 */
	@Override // or here2?
	public void addJoints(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				joints.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("joints");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child joints node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimJoint.
	 * @param newValue is new node for the joints field (restricted to HAnimJoint)
	 */
	@Override
	public void setJoints(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearJoints(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : joints)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearJoints(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			joints.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of joints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearJoints()
	{
		for (X3DNode element : joints)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		joints.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>joints</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getJoints()
	 */
	public boolean hasJoints()
	{
		return (!joints.isEmpty());
	}
	/**
	 * Provide int value within allowed range of [-1,4] from inputOutput SFInt32 field named <i>loa</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,4] Level Of Articulation 0..4 indicates complexity and detail of joints for given humanoid skeletal hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> loa value of -1 indicates that no LOA conformance is provided. </li> 
 *  <li> <i>Hint:</i>  Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8.4 Levels of articulation, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation</a> </li> 
 * </ul>
	 * @return value of loa field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getLoa()
	{
		return loa;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>loa</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,4] Level Of Articulation 0..4 indicates complexity and detail of joints for given humanoid skeletal hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> loa value of -1 indicates that no LOA conformance is provided. </li> 
 *  <li> <i>Hint:</i>  Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8.4 Levels of articulation, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation</a> </li> 
 * </ul>
	 * @param newValue is new value for the loa field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setLoa(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < -1) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid loa newValue=" + newValue + " has component value less than restriction minInclusive=-1");
        }
        if (newValue > 4) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid loa newValue=" + SFInt32Object.toString(newValue) + " has component value greater than restriction maxInclusive=4");
            }
		loa = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 loa field, similar to {@link #setLoa(int)}.
	 * @param newValue is new value for the loa field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setLoa(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLoa(newValue.getPrimitiveValue());
			return this;
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimHumanoidObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide array of HAnimMotionObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>motions</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [HAnimMotion] Contains any HAnimMotion nodes that can animate the HAnimHumanoid.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimMotion.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimMotionObject
	 * @return value of motions field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getMotions()
	{
		final X3DNode[] valuesArray = new X3DNode[motions.size()];
		int i = 0;
		for (X3DNode arrayElement : motions) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode motions field, similar to {@link #getMotions()}.
	 * @return value of motions field
	 */
	public ArrayList<X3DNode> getMotionsList()
	{
		return motions;
	}

	/**
	 * Accessor method to assign HAnimMotionObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>motions</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [HAnimMotion] Contains any HAnimMotion nodes that can animate the HAnimHumanoid.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimMotion.
	 * @param newValue is new value for the motions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setMotions(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearMotions(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearMotions(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				motions.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode motions field, similar to {@link #setMotions(X3DNode[])}.
	 * @param newValue is new value for the motions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setMotions(ArrayList<HAnimMotionObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearMotions(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearMotions(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setMotions(newArray);
        }
		for (HAnimMotionObject element : newValue)
		{
			motions.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of motions nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimMotion and ProtoInstance.
	 * @param newValue is new value to be appended the motions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addMotions(HAnimMotionObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		motions.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for motions field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addMotions(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		motions.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child motions nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimMotion.
	 * @param newValue is new value array to be appended the motions field.
	 */
	@Override // or here2?
	public void addMotions(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				motions.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("motions");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child motions node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimMotion.
	 * @param newValue is new node for the motions field (restricted to HAnimMotion)
	 */
	@Override
	public void setMotions(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearMotions(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : motions)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearMotions(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			motions.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of motions field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearMotions()
	{
		for (X3DNode element : motions)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		motions.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>motions</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getMotions()
	 */
	public boolean hasMotions()
	{
		return (!motions.isEmpty());
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that each HAnimHumanoid node in a scene can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Hint:</i> this same name is a required name prefix for all other HAnim nodes within the HAnimHumanoid, if more than one humanoid appears within a scene file. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Unique name attribute must be defined so that each HAnimHumanoid node in a scene can be identified at run time for animation purposes.
 * <ul>
 *  <li> <i>Hint:</i> this same name is a required name prefix for all other HAnim nodes within the HAnimHumanoid, if more than one humanoid appears within a scene file. </li> 
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimHumanoidObject setName(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimHumanoid name
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("HAnimHumanoid name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setName(SFStringObject newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setRotation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid rotation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		rotation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation rotation field, similar to {@link #setRotation(float[])}.
	 * @param newValue is new value for the rotation field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setRotation(SFRotationObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setRotation(float x, float y, float z, float angleRadians)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setRotation(double x, double y, double z, double angleRadians)
	{
		return setRotation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setRotation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setRotation(double[] newArray)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setScale(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid scale newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] <= 0f) || (newValue[1] <= 0f) || (newValue[2] <= 0f)) {
                throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid scale newValue=" + newValue + " has component value less than (or equal to) restriction minExclusive=0");
        }
		scale = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f scale field, similar to {@link #setScale(float[])}.
	 * @param newValue is new value for the scale field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScale(SFVec3fObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScale(float x, float y, float z)
	{
		setScale(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setScale(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScale(double x, double y, double z)
	{
		return setScale(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setScale(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScale(double[] newArray)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setScaleOrientation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid scaleOrientation newValue=" + SFRotationObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
		scaleOrientation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFRotation scaleOrientation field, similar to {@link #setScaleOrientation(float[])}.
	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScaleOrientation(SFRotationObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScaleOrientation(float x, float y, float z, float angleRadians)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScaleOrientation(double x, double y, double z, double angleRadians)
	{
		return setScaleOrientation(new SFRotationObject(x, y, z, angleRadians));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setScaleOrientation(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setScaleOrientation(double[] newArray)
	{
		return setScaleOrientation(new SFRotationObject(newArray));
	}
	/**
	 * Provide array of HAnimSegmentObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>segments</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimSegment] The segments field contains a list of USE references for all HAnimSegment node instances found within the preceding skeleton hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> order is irrelevant since names are contained in the original DEF objects. </li> 
 *  <li> <i>Hint:</i> these USE nodes can be utilitized by inverse kinematics (IK) and animation engines. </li> 
 *  <li> <i>Warning:</i> the number of contained &amp;lt;HAnimSegment USE='*' containerField='segments'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimSegment node instances found within the preceding skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimSegment USE nodes must include containerField='segments' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSegment.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimSegmentObject
	 * @return value of segments field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getSegments()
	{
		final X3DNode[] valuesArray = new X3DNode[segments.size()];
		int i = 0;
		for (X3DNode arrayElement : segments) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode segments field, similar to {@link #getSegments()}.
	 * @return value of segments field
	 */
	public ArrayList<X3DNode> getSegmentsList()
	{
		return segments;
	}

	/**
	 * Accessor method to assign HAnimSegmentObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>segments</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimSegment] The segments field contains a list of USE references for all HAnimSegment node instances found within the preceding skeleton hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> order is irrelevant since names are contained in the original DEF objects. </li> 
 *  <li> <i>Hint:</i> these USE nodes can be utilitized by inverse kinematics (IK) and animation engines. </li> 
 *  <li> <i>Warning:</i> the number of contained &amp;lt;HAnimSegment USE='*' containerField='segments'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimSegment node instances found within the preceding skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimSegment USE nodes must include containerField='segments' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSegment.
	 * @param newValue is new value for the segments field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSegments(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearSegments(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSegments(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				segments.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode segments field, similar to {@link #setSegments(X3DNode[])}.
	 * @param newValue is new value for the segments field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSegments(ArrayList<HAnimSegmentObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearSegments(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearSegments(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSegments(newArray);
        }
		for (HAnimSegmentObject element : newValue)
		{
			segments.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of segments nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSegment and ProtoInstance.
	 * @param newValue is new value to be appended the segments field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSegments(HAnimSegmentObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		segments.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for segments field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSegments(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		segments.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child segments nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSegment.
	 * @param newValue is new value array to be appended the segments field.
	 */
	@Override // or here2?
	public void addSegments(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				segments.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("segments");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child segments node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimSegment.
	 * @param newValue is new node for the segments field (restricted to HAnimSegment)
	 */
	@Override
	public void setSegments(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearSegments(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : segments)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearSegments(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			segments.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of segments field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearSegments()
	{
		for (X3DNode element : segments)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		segments.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>segments</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getSegments()
	 */
	public boolean hasSegments()
	{
		return (!segments.isEmpty());
	}
	/**
	 * Provide array of HAnimSiteObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>sites</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimSite] sites field contains a list of USE references for all HAnimSite node instances found within the preceding skeleton hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> order is irrelevant since names are contained in the original DEF objects. </li> 
 *  <li> <i>Hint:</i> these USE nodes can be utilitized by inverse kinematics (IK) and animation engines. </li> 
 *  <li> <i>Warning:</i> the number of contained &amp;lt;HAnimSite USE='*' containerField='sites, skeleton or viewpoints'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimSite node instances found within the preceding skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimSite USE nodes must include containerField='sites' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimSiteObject
	 * @return value of sites field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getSites()
	{
		final X3DNode[] valuesArray = new X3DNode[sites.size()];
		int i = 0;
		for (X3DNode arrayElement : sites) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode sites field, similar to {@link #getSites()}.
	 * @return value of sites field
	 */
	public ArrayList<X3DNode> getSitesList()
	{
		return sites;
	}

	/**
	 * Accessor method to assign HAnimSiteObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>sites</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimSite] sites field contains a list of USE references for all HAnimSite node instances found within the preceding skeleton hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> order is irrelevant since names are contained in the original DEF objects. </li> 
 *  <li> <i>Hint:</i> these USE nodes can be utilitized by inverse kinematics (IK) and animation engines. </li> 
 *  <li> <i>Warning:</i> the number of contained &amp;lt;HAnimSite USE='*' containerField='sites, skeleton or viewpoints'/&amp;gt; nodes at top level of HAnimHumanoid needs to match the number of corresponding HAnimSite node instances found within the preceding skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimSite USE nodes must include containerField='sites' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite.
	 * @param newValue is new value for the sites field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSites(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearSites(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSites(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				sites.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode sites field, similar to {@link #setSites(X3DNode[])}.
	 * @param newValue is new value for the sites field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSites(ArrayList<HAnimSiteObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearSites(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearSites(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSites(newArray);
        }
		for (HAnimSiteObject element : newValue)
		{
			sites.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of sites nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite and ProtoInstance.
	 * @param newValue is new value to be appended the sites field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSites(HAnimSiteObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		sites.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for sites field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSites(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		sites.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child sites nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite.
	 * @param newValue is new value array to be appended the sites field.
	 */
	@Override // or here2?
	public void addSites(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				sites.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("sites");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child sites node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimSite.
	 * @param newValue is new node for the sites field (restricted to HAnimSite)
	 */
	@Override
	public void setSites(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearSites(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : sites)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearSites(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			sites.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of sites field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearSites()
	{
		for (X3DNode element : sites)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		sites.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>sites</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getSites()
	 */
	public boolean hasSites()
	{
		return (!sites.isEmpty());
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>skeletalConfiguration</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Models sharing a common skeletal configuration can share animations and binding poses.
 * <ul>
 *  <li> <i> Hint:</i>  a value of 'BASIC' conforms to restrictive skeletal model in X3D Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8 Modelling of humanoids, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#ModellingOfHumanoids" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#ModellingOfHumanoids</a> </li> 
 * </ul>
	 * @return value of skeletalConfiguration field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getSkeletalConfiguration()
	{
		return skeletalConfiguration;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>skeletalConfiguration</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Models sharing a common skeletal configuration can share animations and binding poses.
 * <ul>
 *  <li> <i> Hint:</i>  a value of 'BASIC' conforms to restrictive skeletal model in X3D Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8 Modelling of humanoids, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#ModellingOfHumanoids" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#ModellingOfHumanoids</a> </li> 
 * </ul>
	 * @param newValue is new value for the skeletalConfiguration field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkeletalConfiguration(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		skeletalConfiguration = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString skeletalConfiguration field, similar to {@link #setSkeletalConfiguration(String)}.
	 * @param newValue is new value for the skeletalConfiguration field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkeletalConfiguration(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSkeletalConfiguration(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to HAnimJoint|HAnimSite, from inputOutput MFNode field <i>skeleton</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimJoint|HAnimSite] List of top-level HAnimJoint and HAnimSite nodes that create the skeleton model. The skeleton field contains the humanoid_root Joint object, and thus the entire hierarchy of HAnimJoint/HAnimSegment nodes making up the articulated skeleton model.
 * <ul>
 *  <li> <i>Hint:</i> typically contains HAnimJoint with name='humanoid_root'. </li> 
 *  <li> <i>Hint:</i> immediate children in the skeleton field can also include top-level HAnimSite node declarations, which are landmarks for the overall humanoid figure that are not affected by HAnimJoint movement. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimJoint and HAnimSite nodes must include containerField='skeleton' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSite.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimJointObject
	 * @see org.web3d.x3d.jsail.HAnim.HAnimSiteObject
	 * @return value of skeleton field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getSkeleton()
	{
		final X3DNode[] valuesArray = new X3DNode[skeleton.size()];
		int i = 0;
		for (X3DNode arrayElement : skeleton) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode skeleton field, similar to {@link #getSkeleton()}.
	 * @return value of skeleton field
	 */
	public ArrayList<X3DNode> getSkeletonList()
	{
		return skeleton;
	}

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>skeleton</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes HAnimJoint|HAnimSite; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i> [HAnimJoint|HAnimSite] List of top-level HAnimJoint and HAnimSite nodes that create the skeleton model. The skeleton field contains the humanoid_root Joint object, and thus the entire hierarchy of HAnimJoint/HAnimSegment nodes making up the articulated skeleton model.
 * <ul>
 *  <li> <i>Hint:</i> typically contains HAnimJoint with name='humanoid_root'. </li> 
 *  <li> <i>Hint:</i> immediate children in the skeleton field can also include top-level HAnimSite node declarations, which are landmarks for the overall humanoid figure that are not affected by HAnimJoint movement. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimJoint and HAnimSite nodes must include containerField='skeleton' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSite.
	 * @param newValue is new value for the skeleton field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkeleton(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearSkeleton(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes HAnimJoint|HAnimSite; newValue["+i+"]=" + newValue[i]);
			}
		}
		clearSkeleton(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				skeleton.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode skeleton field, similar to {@link #setSkeleton(X3DNode[])}.
	 * @param newValue is new value for the skeleton field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkeleton(ArrayList<X3DNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearSkeleton(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4

		// newValueArrayListAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #3
		for (X3DNode element : newValue)
		{
			boolean isNodeTypeAllowed = 
				(element instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(element instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] element is not instanceof " +
					"acceptableNodeTypes HAnimJoint|HAnimSite; element=" + element);
			}
		}
        if (newValue.isEmpty())
            clearSkeleton(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSkeleton(newArray);
        }
		for (X3DNode element : newValue)
		{
			skeleton.add(element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of skeleton nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSite and ProtoInstance.
	 * @param newValue is new value to be appended the skeleton field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSkeleton(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes HAnimJoint|HAnimSite; newValue=" + newValue);
		}
		skeleton.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for skeleton field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSkeleton(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		skeleton.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child skeleton nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimJoint|HAnimSite.
	 * @param newValue is new value array to be appended the skeleton field.
	 */
	@Override // or here2?
	public void addSkeleton(X3DNode[] newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes HAnimJoint|HAnimSite; newValue["+i+"]=" + newValue[i]);
			}
		}
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				skeleton.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("skeleton");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child skeleton node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimJoint|HAnimSite.
	 * @param newValue is new node for the skeleton field (restricted to HAnimJoint|HAnimSite)
	 */
	@Override
	public void setSkeleton(X3DNode newValue)
	{
		if (newValue == null)
		{
			clearSkeleton(); // reset newValueNullClearsFieldReturnVoid
			return;
		}

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimJointObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.HAnim.HAnimSiteObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes HAnimJoint|HAnimSite; newValue=" + newValue);
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : skeleton)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearSkeleton(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			skeleton.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of skeleton field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearSkeleton()
	{
		for (X3DNode element : skeleton)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		skeleton.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>skeleton</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getSkeleton()
	 */
	public boolean hasSkeleton()
	{
		return (!skeleton.isEmpty());
	}
	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to Group|Transform|Shape|IndexedFaceSet, from inputOutput MFNode field <i>skin</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [IndexedFaceSet|Group|Transform|Shape] List of one or more indexed mesh definitions (such as IndexedFaceSet) that utilize skinCoord point and skinNormal normal data.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level node must include containerField='skin' for proper validation and operation. </li> 
 *  <li> <i>Hint:</i> put skin node first and provide DEF label to simplify USE node usage within the skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt;. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Group|Transform|Shape|IndexedFaceSet.
	 * @see org.web3d.x3d.jsail.Grouping.GroupObject
	 * @see org.web3d.x3d.jsail.Grouping.TransformObject
	 * @see org.web3d.x3d.jsail.Shape.ShapeObject
	 * @see org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject
	 * @return value of skin field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getSkin()
	{
		final X3DNode[] valuesArray = new X3DNode[skin.size()];
		int i = 0;
		for (X3DNode arrayElement : skin) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode skin field, similar to {@link #getSkin()}.
	 * @return value of skin field
	 */
	public ArrayList<X3DNode> getSkinList()
	{
		return skin;
	}

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>skin</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Grouping.GroupObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Grouping.TransformObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Shape.ShapeObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes Group|Transform|Shape|IndexedFaceSet; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i> [IndexedFaceSet|Group|Transform|Shape] List of one or more indexed mesh definitions (such as IndexedFaceSet) that utilize skinCoord point and skinNormal normal data.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level node must include containerField='skin' for proper validation and operation. </li> 
 *  <li> <i>Hint:</i> put skin node first and provide DEF label to simplify USE node usage within the skeleton hierarchy. </li> 
 *  <li> <i>Warning:</i>  (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt;. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Group|Transform|Shape|IndexedFaceSet.
	 * @param newValue is new value for the skin field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkin(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearSkin(); // newValueNullSetDEFAULT_VALUE
			return this;
		}

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Grouping.GroupObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Grouping.TransformObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Shape.ShapeObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes Group|Transform|Shape|IndexedFaceSet; newValue["+i+"]=" + newValue[i]);
			}
		}
		clearSkin(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				skin.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode skin field, similar to {@link #setSkin(X3DNode[])}.
	 * @param newValue is new value for the skin field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkin(ArrayList<X3DNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearSkin(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4

		// newValueArrayListAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #3
		for (X3DNode element : newValue)
		{
			boolean isNodeTypeAllowed = 
				(element instanceof org.web3d.x3d.jsail.Grouping.GroupObject) || 
				(element instanceof org.web3d.x3d.jsail.Grouping.TransformObject) || 
				(element instanceof org.web3d.x3d.jsail.Shape.ShapeObject) || 
				(element instanceof org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] element is not instanceof " +
					"acceptableNodeTypes Group|Transform|Shape|IndexedFaceSet; element=" + element);
			}
		}
        if (newValue.isEmpty())
            clearSkin(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSkin(newArray);
        }
		for (X3DNode element : newValue)
		{
			skin.add(element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of skin nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Group|Transform|Shape|IndexedFaceSet and ProtoInstance.
	 * @param newValue is new value to be appended the skin field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSkin(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Grouping.GroupObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Grouping.TransformObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Shape.ShapeObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes Group|Transform|Shape|IndexedFaceSet; newValue=" + newValue);
		}
		skin.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for skin field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addSkin(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		skin.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child skin nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Group|Transform|Shape|IndexedFaceSet.
	 * @param newValue is new value array to be appended the skin field.
	 */
	@Override // or here2?
	public void addSkin(X3DNode[] newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf

		// newValueArrayAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #2
		for (int i = 0; i < newValue.length; i++)
		{
			boolean isNodeTypeAllowed = 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Grouping.GroupObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Grouping.TransformObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Shape.ShapeObject) || 
				(((X3DConcreteNode)newValue[i]) instanceof org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject);
			if  (!isNodeTypeAllowed)
			{
				throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof " +
					"acceptableNodeTypes Group|Transform|Shape|IndexedFaceSet; newValue["+i+"]=" + newValue[i]);
			}
		}
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				skin.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("skin");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child skin node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to Group|Transform|Shape|IndexedFaceSet.
	 * @param newValue is new node for the skin field (restricted to Group|Transform|Shape|IndexedFaceSet)
	 */
	@Override
	public void setSkin(X3DNode newValue)
	{
		if (newValue == null)
		{
			clearSkin(); // reset newValueNullClearsFieldReturnVoid
			return;
		}

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Grouping.GroupObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Grouping.TransformObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Shape.ShapeObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Geometry3D.IndexedFaceSetObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes Group|Transform|Shape|IndexedFaceSet; newValue=" + newValue);
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : skin)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearSkin(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			skin.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of skin field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearSkin()
	{
		for (X3DNode element : skin)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		skin.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>skin</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getSkin()
	 */
	public boolean hasSkin()
	{
		return (!skin.isEmpty());
	}
	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>skinBindingCoords</i>.
	 * @see #getSkinBindingCoordsProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] Array of Coordinate nodes to handle non-default source pose so that both skin and skeleton can be in same binding pose.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Coordinate or CoordinateDouble nodes must include containerField='skinBindingCoords' for proper validation and operation. </li> 
 *  <li> <i>Hint:</i> a single node is used so that coordIndex references are consistent for all references to these coordinates. </li> 
 *  <li> <i>Warning:</i> (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @return value of skinBindingCoords field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DCoordinateNode getSkinBindingCoords()
	{
		return skinBindingCoords;
	}

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>skinBindingCoords</i>.
	 * @see #setSkinBindingCoords(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] Array of Coordinate nodes to handle non-default source pose so that both skin and skeleton can be in same binding pose.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Coordinate or CoordinateDouble nodes must include containerField='skinBindingCoords' for proper validation and operation. </li> 
 *  <li> <i>Hint:</i> a single node is used so that coordIndex references are consistent for all references to these coordinates. </li> 
 *  <li> <i>Warning:</i> (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @param newValue is new value for the skinBindingCoords field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkinBindingCoords(X3DCoordinateNode newValue)
	{
		// set-newValue-validity-checks #0
		skinBindingCoords = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinBindingCoords).setParentObject(this); // parentTest15
		}
		if (skinBindingCoordsProtoInstance != null)
		{
			skinBindingCoordsProtoInstance.setParentObject(null); // housekeeping, clear prior object
			skinBindingCoordsProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of skinBindingCoords field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimHumanoidObject clearSkinBindingCoords()
	{
		((X3DConcreteElement) skinBindingCoords).clearParentObject(); // remove references to facilitate Java memory management
		skinBindingCoords = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>skinBindingCoords</i>.
	 * @see #setSkinBindingCoords(X3DCoordinateNode)
	 * @param newValue is new value for the skinBindingCoords field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkinBindingCoords(ProtoInstanceObject newValue)
	{
		if (skinBindingCoordsProtoInstance != null)
		{
			((X3DConcreteElement) skinBindingCoordsProtoInstance).setParentObject(null); // parentTest15.5
	    }
		skinBindingCoordsProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinBindingCoordsProtoInstance).setParentObject(this); // parentTest15.6
            skinBindingCoordsProtoInstance.setContainerField("skinBindingCoords");
	    }
		if (skinBindingCoords != null)
		{
			((X3DConcreteElement) skinBindingCoords).setParentObject(null); // housekeeping, clear prior object
			skinBindingCoords = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getSkinBindingCoordsProtoInstance()
		{
			return skinBindingCoordsProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>skinBindingCoords</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getSkinBindingCoords()
	 * @see #getSkinBindingCoordsProtoInstance()
	 */
	public boolean hasSkinBindingCoords()
	{
		return (skinBindingCoords != null) || (skinBindingCoordsProtoInstance != null);
	}
	/**
	 * Provide X3DNormalNode instance (using a properly typed node) from inputOutput SFNode field <i>skinBindingNormals</i>.
	 * @see #getSkinBindingNormalsProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DNormalNode] Array of Normal nodes to handle non-default source pose so that both skin and skeleton can be in same binding pose.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Normal nodes must include containerField='skinBindingNormals' for proper validation and operation. </li> 
 *  <li> <i>Warning:</i> (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @return value of skinBindingNormals field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNormalNode getSkinBindingNormals()
	{
		return skinBindingNormals;
	}

	/**
	 * Accessor method to assign X3DNormalNode instance (using a properly typed node) to inputOutput SFNode field <i>skinBindingNormals</i>.
	 * @see #setSkinBindingNormals(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DNormalNode] Array of Normal nodes to handle non-default source pose so that both skin and skeleton can be in same binding pose.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Normal nodes must include containerField='skinBindingNormals' for proper validation and operation. </li> 
 *  <li> <i>Warning:</i> (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  not used when skeletalConfiguration='BASIC'. </li> 
 * </ul>
	 * @param newValue is new value for the skinBindingNormals field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkinBindingNormals(X3DNormalNode newValue)
	{
		// set-newValue-validity-checks #0
		skinBindingNormals = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinBindingNormals).setParentObject(this); // parentTest15
		}
		if (skinBindingNormalsProtoInstance != null)
		{
			skinBindingNormalsProtoInstance.setParentObject(null); // housekeeping, clear prior object
			skinBindingNormalsProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of skinBindingNormals field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimHumanoidObject clearSkinBindingNormals()
	{
		((X3DConcreteElement) skinBindingNormals).clearParentObject(); // remove references to facilitate Java memory management
		skinBindingNormals = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>skinBindingNormals</i>.
	 * @see #setSkinBindingNormals(X3DNormalNode)
	 * @param newValue is new value for the skinBindingNormals field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkinBindingNormals(ProtoInstanceObject newValue)
	{
		if (skinBindingNormalsProtoInstance != null)
		{
			((X3DConcreteElement) skinBindingNormalsProtoInstance).setParentObject(null); // parentTest15.5
	    }
		skinBindingNormalsProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinBindingNormalsProtoInstance).setParentObject(this); // parentTest15.6
            skinBindingNormalsProtoInstance.setContainerField("skinBindingNormals");
	    }
		if (skinBindingNormals != null)
		{
			((X3DConcreteElement) skinBindingNormals).setParentObject(null); // housekeeping, clear prior object
			skinBindingNormals = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getSkinBindingNormalsProtoInstance()
		{
			return skinBindingNormalsProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>skinBindingNormals</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getSkinBindingNormals()
	 * @see #getSkinBindingNormalsProtoInstance()
	 */
	public boolean hasSkinBindingNormals()
	{
		return (skinBindingNormals != null) || (skinBindingNormalsProtoInstance != null);
	}
	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>skinCoord</i>.
	 * @see #getSkinCoordProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] Coordinate node utilized by indexed mesh definitions for skin. The skinCoord field contains a single sequence of points, used by internal HAnimHumanoid mechanisms to create appropriate surface deformations as well as by the indexed face set definitions within the skin field that perform the actual rendering of surface geometry.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Coordinate or CoordinateDouble node must include containerField='skinCoord' for proper validation and operation. </li> 
 *  <li> <i>Hint:</i> a single node is used so that coordIndex references are consistent for all references to these coordinates. </li> 
 *  <li> <i>Warning:</i>  (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt;. </li> 
 * </ul>
	 * @return value of skinCoord field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DCoordinateNode getSkinCoord()
	{
		return skinCoord;
	}

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>skinCoord</i>.
	 * @see #setSkinCoord(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DCoordinateNode] Coordinate node utilized by indexed mesh definitions for skin. The skinCoord field contains a single sequence of points, used by internal HAnimHumanoid mechanisms to create appropriate surface deformations as well as by the indexed face set definitions within the skin field that perform the actual rendering of surface geometry.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Coordinate or CoordinateDouble node must include containerField='skinCoord' for proper validation and operation. </li> 
 *  <li> <i>Hint:</i> a single node is used so that coordIndex references are consistent for all references to these coordinates. </li> 
 *  <li> <i>Warning:</i>  (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt;. </li> 
 * </ul>
	 * @param newValue is new value for the skinCoord field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkinCoord(X3DCoordinateNode newValue)
	{
		// set-newValue-validity-checks #0
		skinCoord = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinCoord).setParentObject(this); // parentTest15
		}
		if (skinCoordProtoInstance != null)
		{
			skinCoordProtoInstance.setParentObject(null); // housekeeping, clear prior object
			skinCoordProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of skinCoord field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimHumanoidObject clearSkinCoord()
	{
		((X3DConcreteElement) skinCoord).clearParentObject(); // remove references to facilitate Java memory management
		skinCoord = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>skinCoord</i>.
	 * @see #setSkinCoord(X3DCoordinateNode)
	 * @param newValue is new value for the skinCoord field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkinCoord(ProtoInstanceObject newValue)
	{
		if (skinCoordProtoInstance != null)
		{
			((X3DConcreteElement) skinCoordProtoInstance).setParentObject(null); // parentTest15.5
	    }
		skinCoordProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinCoordProtoInstance).setParentObject(this); // parentTest15.6
            skinCoordProtoInstance.setContainerField("skinCoord");
	    }
		if (skinCoord != null)
		{
			((X3DConcreteElement) skinCoord).setParentObject(null); // housekeeping, clear prior object
			skinCoord = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getSkinCoordProtoInstance()
		{
			return skinCoordProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>skinCoord</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getSkinCoord()
	 * @see #getSkinCoordProtoInstance()
	 */
	public boolean hasSkinCoord()
	{
		return (skinCoord != null) || (skinCoordProtoInstance != null);
	}
	/**
	 * Provide X3DNormalNode instance (using a properly typed node) from inputOutput SFNode field <i>skinNormal</i>.
	 * @see #getSkinNormalProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DNormalNode] Single Normal node utilized by indexed mesh definitions for skin. The skinNormal field contains a single sequence of normal values, used by internal HAnimHumanoid mechanisms to create appropriate surface deformations as well as by the indexed face set definitions within the skin field that perform the actual rendering of surface geometry.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Normal node must include containerField='skinNormal' for proper validation and operation. </li> 
 *  <li> <i>Warning:</i>  (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt;. </li> 
 * </ul>
	 * @return value of skinNormal field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNormalNode getSkinNormal()
	{
		return skinNormal;
	}

	/**
	 * Accessor method to assign X3DNormalNode instance (using a properly typed node) to inputOutput SFNode field <i>skinNormal</i>.
	 * @see #setSkinNormal(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DNormalNode] Single Normal node utilized by indexed mesh definitions for skin. The skinNormal field contains a single sequence of normal values, used by internal HAnimHumanoid mechanisms to create appropriate surface deformations as well as by the indexed face set definitions within the skin field that perform the actual rendering of surface geometry.
 * <ul>
 *  <li> <i>Warning:</i> index values for HanimHumanoid skin IndexedFaceSet, skinCoord and skinNormal nodes must all be consistently defined together with HAnimJoint HAnimSegment and HAnimDisplacer nodes for proper skin animation. </li> 
 *  <li> <i>Warning:</i> top-level Normal node must include containerField='skinNormal' for proper validation and operation. </li> 
 *  <li> <i>Warning:</i>  (X3D version 4.0 draft) requires X3D profile='Full' or else include &amp;lt;component name='H-Anim' level='2'/&amp;gt;. </li> 
 * </ul>
	 * @param newValue is new value for the skinNormal field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setSkinNormal(X3DNormalNode newValue)
	{
		// set-newValue-validity-checks #0
		skinNormal = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinNormal).setParentObject(this); // parentTest15
		}
		if (skinNormalProtoInstance != null)
		{
			skinNormalProtoInstance.setParentObject(null); // housekeeping, clear prior object
			skinNormalProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of skinNormal field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public HAnimHumanoidObject clearSkinNormal()
	{
		((X3DConcreteElement) skinNormal).clearParentObject(); // remove references to facilitate Java memory management
		skinNormal = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>skinNormal</i>.
	 * @see #setSkinNormal(X3DNormalNode)
	 * @param newValue is new value for the skinNormal field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setSkinNormal(ProtoInstanceObject newValue)
	{
		if (skinNormalProtoInstance != null)
		{
			((X3DConcreteElement) skinNormalProtoInstance).setParentObject(null); // parentTest15.5
	    }
		skinNormalProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) skinNormalProtoInstance).setParentObject(this); // parentTest15.6
            skinNormalProtoInstance.setContainerField("skinNormal");
	    }
		if (skinNormal != null)
		{
			((X3DConcreteElement) skinNormal).setParentObject(null); // housekeeping, clear prior object
			skinNormal = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getSkinNormalProtoInstance()
		{
			return skinNormalProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>skinNormal</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getSkinNormal()
	 * @see #getSkinNormalProtoInstance()
	 */
	public boolean hasSkinNormal()
	{
		return (skinNormal != null) || (skinNormalProtoInstance != null);
	}
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of children relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
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
 *  <li> <i> Hint:</i>  since default pose faces along +Z axis, -x values are right side and +x values are left side within HAnimHumanoid. </li> 
 * </ul>
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setTranslation(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid translation newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		translation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f translation field, similar to {@link #setTranslation(float[])}.
	 * @param newValue is new value for the translation field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setTranslation(SFVec3fObject newValue)
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

	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setTranslation(float x, float y, float z)
	{
		setTranslation(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setTranslation(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setTranslation(double x, double y, double z)
	{
		return setTranslation(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setTranslation(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setTranslation(double[] newArray)
	{
		return setTranslation(new SFVec3fObject(newArray));
	}
	/**
	 * Provide String enumeration value (baseType hanimVersionChoices) ["1.0" | "1.1" | "2.0"] from inputOutput SFString field named <i>version</i>.
	 * <br><br>
	 * <i>Tooltip:</i> HAnimHumanoid version, where value is 2.0 for standardized ISO 19774 initial version from 2006, and value is 2.2 for draft ISO 19774 version from 2018.
 * <ul>
 *  <li> <i> Warning:</i>  prior versions of HAnim nodes might not validate correctly due to small changes in the contained-node content model. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #VERSION_1_0 1_0}, {@link #VERSION_1_1 1_1}, {@link #VERSION_2_0 2_0}.
	 * @return value of version field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getVersion()
	{
		return version;
	}

	/**
	 * Accessor method to assign String enumeration value ("1.0" | "1.1" | "2.0") to inputOutput SFString field named <i>version</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #VERSION_1_0 1_0}, {@link #VERSION_1_1 1_1}, {@link #VERSION_2_0 2_0}).
	 * <br><br>
	 * <i>Tooltip:</i> HAnimHumanoid version, where value is 2.0 for standardized ISO 19774 initial version from 2006, and value is 2.2 for draft ISO 19774 version from 2018.
 * <ul>
 *  <li> <i> Warning:</i>  prior versions of HAnim nodes might not validate correctly due to small changes in the contained-node content model. </li> 
 * </ul>
	 * @param newValue is new value for the version field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setVersion(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			newValue = new String(); // null string check
        }
		newValue = MFStringObject.cleanupUnescapedEnclosingQuotes(newValue); // handle potential enumeration value
		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(VERSION_1_0) ||
			newValue.equals(VERSION_1_1) ||
			newValue.equals(VERSION_2_0)))
		{
			String warningMessage = "Warning: HAnimHumanoid version newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		version = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString version field, similar to {@link #setVersion(String)}.
	 * @param newValue is new value for the version field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setVersion(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVersion(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of HAnimSiteObject results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>viewpoints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimSite] List of HAnimSite nodes containing Viewpoint nodes that appear in the skeleton model, usually as USE node references. The viewpoints field contains zero or more special HAnimSite nodes that are only affected by HAnimHumanoid transformations (and no HAnimJoint transformations). Each HAnimSite can contain a Viewpoint as virtual camera in the HAnimHumanoid reference frame (such as viewing the face or profile of the human figure).
 * <ul>
 *  <li> <i>Warning:</i> these are actual node declarations, not USE nodes. </li> 
 *  <li> <i>Hint:</i> the viewpoint field has different functionality than the joints, segments and sites fields. </li> 
 *  <li> <i>Hint:</i> the viewpoints field connects internal Site nodes that in turn hold relative Viewpoint nodes, such as &amp;lt;HAnimSite USE='ObserveFaceSite_view' containerField='viewpoints'/&amp;gt; which has corresponding counterpart nodes &amp;lt;HAnimSite DEF='ObserveFaceSite_view' name='ObserveFaceSite_view' containerField='children'&amp;gt; &amp;lt;Viewpoint description='look at me!'/&amp;gt; &amp;lt;/HAnimSite&amp;gt;. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimSite nodes (in turn containing Viewpoint nodes) must include containerField='viewpoints' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite.
	 * @see org.web3d.x3d.jsail.HAnim.HAnimSiteObject
	 * @return value of viewpoints field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getViewpoints()
	{
		final X3DNode[] valuesArray = new X3DNode[viewpoints.size()];
		int i = 0;
		for (X3DNode arrayElement : viewpoints) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode viewpoints field, similar to {@link #getViewpoints()}.
	 * @return value of viewpoints field
	 */
	public ArrayList<X3DNode> getViewpointsList()
	{
		return viewpoints;
	}

	/**
	 * Accessor method to assign HAnimSiteObject array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>viewpoints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [HAnimSite] List of HAnimSite nodes containing Viewpoint nodes that appear in the skeleton model, usually as USE node references. The viewpoints field contains zero or more special HAnimSite nodes that are only affected by HAnimHumanoid transformations (and no HAnimJoint transformations). Each HAnimSite can contain a Viewpoint as virtual camera in the HAnimHumanoid reference frame (such as viewing the face or profile of the human figure).
 * <ul>
 *  <li> <i>Warning:</i> these are actual node declarations, not USE nodes. </li> 
 *  <li> <i>Hint:</i> the viewpoint field has different functionality than the joints, segments and sites fields. </li> 
 *  <li> <i>Hint:</i> the viewpoints field connects internal Site nodes that in turn hold relative Viewpoint nodes, such as &amp;lt;HAnimSite USE='ObserveFaceSite_view' containerField='viewpoints'/&amp;gt; which has corresponding counterpart nodes &amp;lt;HAnimSite DEF='ObserveFaceSite_view' name='ObserveFaceSite_view' containerField='children'&amp;gt; &amp;lt;Viewpoint description='look at me!'/&amp;gt; &amp;lt;/HAnimSite&amp;gt;. </li> 
 *  <li> <i>Warning:</i>  top-level HAnimSite nodes (in turn containing Viewpoint nodes) must include containerField='viewpoints' for proper validation and operation. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite.
	 * @param newValue is new value for the viewpoints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setViewpoints(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearViewpoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearViewpoints(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				viewpoints.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode viewpoints field, similar to {@link #setViewpoints(X3DNode[])}.
	 * @param newValue is new value for the viewpoints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setViewpoints(ArrayList<HAnimSiteObject> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearViewpoints(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearViewpoints(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setViewpoints(newArray);
        }
		for (HAnimSiteObject element : newValue)
		{
			viewpoints.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of viewpoints nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite and ProtoInstance.
	 * @param newValue is new value to be appended the viewpoints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addViewpoints(HAnimSiteObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		viewpoints.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for viewpoints field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public HAnimHumanoidObject addViewpoints(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		viewpoints.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child viewpoints nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to HAnimSite.
	 * @param newValue is new value array to be appended the viewpoints field.
	 */
	@Override // or here2?
	public void addViewpoints(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				viewpoints.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("viewpoints");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child viewpoints node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to HAnimSite.
	 * @param newValue is new node for the viewpoints field (restricted to HAnimSite)
	 */
	@Override
	public void setViewpoints(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearViewpoints(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : viewpoints)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearViewpoints(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			viewpoints.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of viewpoints field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public HAnimHumanoidObject clearViewpoints()
	{
		for (X3DNode element : viewpoints)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		viewpoints.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput MFNode field <i>viewpoints</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getViewpoints()
	 */
	public boolean hasViewpoints()
	{
		return (!viewpoints.isEmpty());
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimHumanoidObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setVisible(SFBoolObject newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimHumanoidObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimHumanoid DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid DEF newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setDEF(SFStringObject newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimHumanoidObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to HAnimHumanoid USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("HAnimHumanoid USE newValue='" + newValue + "'" + 
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setUSE(SFStringObject newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final HAnimHumanoidObject setCssClass(String newValue)
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
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	/** Return version of this HAnimHumanoidObject
	 * @return HAnim version
	 */
	public String getHAnimVersion()
	{
		return getVersion();
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimHumanoidObject setUSE(HAnimHumanoidObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on HAnimHumanoidObject" +
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
	public HAnimHumanoidObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Utility constructor that assigns both DEF label and name, after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 * @param newName  name for this meta element
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimHumanoidObject">X3D Tooltips: HAnimHumanoidObject</a>
	 */
	public HAnimHumanoidObject (String DEFlabel, String newName)
	{
		initialize();
		setDEF  (DEFlabel);
		setName (newName);
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public HAnimHumanoidObject addComments (String newComment)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(\"" + newComment + "\")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimHumanoidObject addComments (String[] newComments)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(" + Arrays.toString(newComments) + ")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link HAnimHumanoidObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public HAnimHumanoidObject addComments (CommentsBlock newCommentsBlock)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(CommentsBlock) " +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
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
		boolean      hasChild = (IS != null) || (IS != null) || (!joints.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || (!motions.isEmpty()) || (!segments.isEmpty()) || (!sites.isEmpty()) || (!skeleton.isEmpty()) || (!skin.isEmpty()) || (skinBindingCoords != null) || (skinBindingCoordsProtoInstance != null) || (skinBindingNormals != null) || (skinBindingNormalsProtoInstance != null) || (skinCoord != null) || (skinCoordProtoInstance != null) || (skinNormal != null) || (skinNormalProtoInstance != null) || (!viewpoints.isEmpty()) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<HAnimHumanoid"); // start opening tag
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
			if (((getInfo().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" info='").append(new MFStringObject(getInfo()).toStringX3D()).append("'");
			}
			if ((!Arrays.equals(getJointBindingPositions(), JOINTBINDINGPOSITIONS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" jointBindingPositions='").append(MFVec3fObject.toString(getJointBindingPositions())).append("'");
			}
			if ((!Arrays.equals(getJointBindingRotations(), JOINTBINDINGROTATIONS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" jointBindingRotations='").append(MFRotationObject.toString(getJointBindingRotations())).append("'");
			}
			if ((!Arrays.equals(getJointBindingScales(), JOINTBINDINGSCALES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" jointBindingScales='").append(MFVec3fObject.toString(getJointBindingScales())).append("'");
			}
			if (((getLoa() != LOA_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" loa='").append(SFInt32Object.toString(getLoa())).append("'");
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
			if ((!getSkeletalConfiguration().equals(SKELETALCONFIGURATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" skeletalConfiguration='").append(new SFStringObject(getSkeletalConfiguration()).toStringX3D()).append("'");
			}
			if ((!Arrays.equals(getTranslation(), TRANSLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" translation='").append(SFVec3fObject.toString(getTranslation())).append("'");
			}
			if ((true) /* required attribute */  && !isUSE())
			{
				stringX3D.append(" version='").append(new SFStringObject(getVersion()).toStringX3D()).append("'");
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
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
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
			for (X3DNode element : joints)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : motions)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : segments)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : sites)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : skeleton)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : skin)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			if      (skinBindingCoords != null)
			{
				stringX3D.append(((X3DConcreteElement)skinBindingCoords).toStringX3D(indentLevel + indentIncrement));
			}
			else if (skinBindingCoordsProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)skinBindingCoordsProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (skinBindingNormals != null)
			{
				stringX3D.append(((X3DConcreteElement)skinBindingNormals).toStringX3D(indentLevel + indentIncrement));
			}
			else if (skinBindingNormalsProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)skinBindingNormalsProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (skinCoord != null)
			{
				stringX3D.append(((X3DConcreteElement)skinCoord).toStringX3D(indentLevel + indentIncrement));
			}
			else if (skinCoordProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)skinCoordProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (skinNormal != null)
			{
				stringX3D.append(((X3DConcreteElement)skinNormal).toStringX3D(indentLevel + indentIncrement));
			}
			else if (skinNormalProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)skinNormalProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : viewpoints)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</HAnimHumanoid>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=HAnimHumanoid, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (!joints.isEmpty()) || (metadata != null) || (metadataProtoInstance != null) || (!motions.isEmpty()) || (!segments.isEmpty()) || (!sites.isEmpty()) || (!skeleton.isEmpty()) || (!skin.isEmpty()) || (skinBindingCoords != null) || (skinBindingCoordsProtoInstance != null) || (skinBindingNormals != null) || (skinBindingNormalsProtoInstance != null) || (skinCoord != null) || (skinCoordProtoInstance != null) || (skinNormal != null) || (skinNormalProtoInstance != null) || (!viewpoints.isEmpty()) || !commentsList.isEmpty();
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
			stringClassicVRML.append("HAnimHumanoid").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("info"))
						{
							stringClassicVRML.append(indentCharacter).append("info").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getInfo().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("info ").append("[ ").append(MFStringObject.toString(getInfo())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("jointBindingPositions"))
						{
							stringClassicVRML.append(indentCharacter).append("jointBindingPositions").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getJointBindingPositions(), JOINTBINDINGPOSITIONS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("jointBindingPositions ").append("[ ").append(MFVec3fObject.toString(getJointBindingPositions())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("jointBindingRotations"))
						{
							stringClassicVRML.append(indentCharacter).append("jointBindingRotations").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getJointBindingRotations(), JOINTBINDINGROTATIONS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("jointBindingRotations ").append("[ ").append(MFRotationObject.toString(getJointBindingRotations())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("jointBindingScales"))
						{
							stringClassicVRML.append(indentCharacter).append("jointBindingScales").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getJointBindingScales(), JOINTBINDINGSCALES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("jointBindingScales ").append("[ ").append(MFVec3fObject.toString(getJointBindingScales())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("loa"))
						{
							stringClassicVRML.append(indentCharacter).append("loa").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getLoa() != LOA_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("loa ").append(SFInt32Object.toString(getLoa())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("skeletalConfiguration"))
						{
							stringClassicVRML.append(indentCharacter).append("skeletalConfiguration").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getSkeletalConfiguration().equals(SKELETALCONFIGURATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("skeletalConfiguration ").append("\"").append(SFStringObject.toString(getSkeletalConfiguration())).append("\"").append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("version"))
						{
							stringClassicVRML.append(indentCharacter).append("version").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (true) /* required attribute */ 
				{
					stringClassicVRML.append("version ").append("\"").append(SFStringObject.toString(getVersion())).append("\"").append("\n").append(indent).append(indentCharacter);
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
			if (joints.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("joints").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : joints)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (motions.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("motions").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : motions)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (segments.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("segments").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : segments)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (sites.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("sites").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : sites)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (skeleton.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("skeleton").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : skeleton)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (skin.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("skin").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : skin)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (skinBindingCoords != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinBindingCoords").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinBindingCoords).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (skinBindingCoordsProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinBindingCoords").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinBindingCoordsProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (skinBindingNormals != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinBindingNormals").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinBindingNormals).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (skinBindingNormalsProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinBindingNormals").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinBindingNormalsProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (skinCoord != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinCoord").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinCoord).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (skinCoordProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinCoord").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinCoordProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (skinNormal != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinNormal").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinNormal).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (skinNormalProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("skinNormal").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) skinNormalProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (viewpoints.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("viewpoints").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : viewpoints)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
				stringClassicVRML.append(indent); // end SFNode
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
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		for (X3DNode element : joints) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
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
		for (X3DNode element : motions) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		for (X3DNode element : segments) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		for (X3DNode element : sites) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		for (X3DNode element : skeleton) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		for (X3DNode element : skin) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		if (skinBindingCoords != null)
		{
			referenceElement = ((X3DConcreteElement) skinBindingCoords).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinBindingCoordsProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) skinBindingCoordsProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinBindingNormals != null)
		{
			referenceElement = ((X3DConcreteElement) skinBindingNormals).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinBindingNormalsProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) skinBindingNormalsProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinCoord != null)
		{
			referenceElement = ((X3DConcreteElement) skinCoord).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinCoordProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) skinCoordProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinNormal != null)
		{
			referenceElement = ((X3DConcreteElement) skinNormal).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (skinNormalProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) skinNormalProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		for (X3DNode element : viewpoints) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
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
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		for (X3DNode element : joints) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
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
		for (X3DNode element : motions) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		for (X3DNode element : segments) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		for (X3DNode element : sites) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		for (X3DNode element : skeleton) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		for (X3DNode element : skin) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		if (skinBindingCoords != null)
		{
			referenceNode = ((X3DConcreteElement) skinBindingCoords).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinBindingCoordsProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) skinBindingCoordsProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinBindingNormals != null)
		{
			referenceNode = ((X3DConcreteElement) skinBindingNormals).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinBindingNormalsProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) skinBindingNormalsProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinCoord != null)
		{
			referenceNode = ((X3DConcreteElement) skinCoord).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinCoordProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) skinCoordProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinNormal != null)
		{
			referenceNode = ((X3DConcreteElement) skinNormal).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (skinNormalProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) skinNormalProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		for (X3DNode element : viewpoints) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
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
        
		setInfo(getInfo()); // exercise field checks, simple types
        
		setJointBindingPositions(getJointBindingPositions()); // exercise field checks, simple types
        
		setJointBindingRotations(getJointBindingRotations()); // exercise field checks, simple types
        
		setJointBindingScales(getJointBindingScales()); // exercise field checks, simple types
        
		setLoa(getLoa()); // exercise field checks, simple types
        
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
        
		setSkeletalConfiguration(getSkeletalConfiguration()); // exercise field checks, simple types
        
		setTranslation(getTranslation()); // exercise field checks, simple types
        
		if (getVersion().isEmpty() && !isUSE()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " version field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setVersion(getVersion()); // exercise field checks, simple types
        
		setVisible(getVisible()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : joints) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setJoints(getJoints()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasJoints()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode joints";
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
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : motions) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setMotions(getMotions()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasMotions()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode motions";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		for (X3DNode element : segments) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setSegments(getSegments()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasSegments()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode segments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		for (X3DNode element : sites) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setSites(getSites()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasSites()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode sites";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		for (X3DNode element : skeleton) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setSkeleton(getSkeleton()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasSkeleton()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode skeleton";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		for (X3DNode element : skin) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setSkin(getSkin()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasSkin()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode skin";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		if (skinBindingCoords != null)
		{
			setSkinBindingCoords(getSkinBindingCoords());
			((X3DConcreteElement) skinBindingCoords).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinBindingCoords).getValidationResult());
		}
		if (skinBindingCoordsProtoInstance != null)
		{
			setSkinBindingCoords(getSkinBindingCoordsProtoInstance());
			((X3DConcreteElement) skinBindingCoordsProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinBindingCoordsProtoInstance).getValidationResult());
		}
		if ((skinBindingCoords != null) && (skinBindingCoordsProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both skinBindingCoords and skinBindingCoordsProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasSkinBindingCoords()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained SFNode skinBindingCoords";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (skinBindingNormals != null)
		{
			setSkinBindingNormals(getSkinBindingNormals());
			((X3DConcreteElement) skinBindingNormals).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinBindingNormals).getValidationResult());
		}
		if (skinBindingNormalsProtoInstance != null)
		{
			setSkinBindingNormals(getSkinBindingNormalsProtoInstance());
			((X3DConcreteElement) skinBindingNormalsProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinBindingNormalsProtoInstance).getValidationResult());
		}
		if ((skinBindingNormals != null) && (skinBindingNormalsProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both skinBindingNormals and skinBindingNormalsProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasSkinBindingNormals()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained SFNode skinBindingNormals";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (skinCoord != null)
		{
			setSkinCoord(getSkinCoord());
			((X3DConcreteElement) skinCoord).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinCoord).getValidationResult());
		}
		if (skinCoordProtoInstance != null)
		{
			setSkinCoord(getSkinCoordProtoInstance());
			((X3DConcreteElement) skinCoordProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinCoordProtoInstance).getValidationResult());
		}
		if ((skinCoord != null) && (skinCoordProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both skinCoord and skinCoordProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasSkinCoord()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained SFNode skinCoord";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (skinNormal != null)
		{
			setSkinNormal(getSkinNormal());
			((X3DConcreteElement) skinNormal).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinNormal).getValidationResult());
		}
		if (skinNormalProtoInstance != null)
		{
			setSkinNormal(getSkinNormalProtoInstance());
			((X3DConcreteElement) skinNormalProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) skinNormalProtoInstance).getValidationResult());
		}
		if ((skinNormal != null) && (skinNormalProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both skinNormal and skinNormalProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasSkinNormal()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained SFNode skinNormal";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : viewpoints) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setViewpoints(getViewpoints()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasViewpoints()) // test USE restrictions
		{
			String errorNotice = "HAnimHumanoid USE='" + getUSE() + "' is not allowed to have contained MFNode viewpoints";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
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
					"' for parent X3D model containing 'HAnimHumanoid' node, add head statement <component name='HAnim' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"HAnim\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
