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

package org.web3d.x3d.jsail.ParticleSystems;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.ParticleSystems.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.ParticleSystems.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.ParticleSystems.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.ParticleSystems.*;
import org.web3d.x3d.sai.ParticleSystems.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Texturing.*;
import java.util.Arrays;

/**
 * ParticleSystem specifies a complete particle system.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DShapeNode] ParticleSystem specifies a complete particle system. It can contain Appearance for particle appearance, a geometry node if gemoetryType='GEOMETRY', a colorRamp Color|ColorRGBA node for changing base color over each particle's lifetime, a texcoordRamp TextureCoordinate node to control texture coordinates of provided texture(s) in the Appearance node over time, a single emitter X3DParticleEmitterNode, and an array of physics X3DParticlePhysicsModelNode nodes.
 * <ul>
 *  <li> <i> Hint:</i>  event timing details are explained in X3D Specification 4.4.8.3 Execution model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModelHint" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModelHint</a>: Wikipedia, particle system <a href="https://en.wikipedia.org/wiki/Particle_system" target="_blank">https://en.wikipedia.org/wiki/Particle_system</a> </li> 
 * </ul>
 * <br>
 * Note that {@linkplain SFColorObject#ALICEBLUE SFColorObject} provides a variety of color constants.
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html#ParticleSystem" target="blank">X3D Abstract Specification: ParticleSystem</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ParticleSystem" target="_blank">X3D Tooltips: ParticleSystem</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class ParticleSystemObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.ParticleSystems.ParticleSystem
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=appearance, @type=SFNode, $javaType=X3DAppearanceNode, $javaReferenceType=X3DAppearanceNode, $javaPrimitiveType=X3DAppearanceNode, $normalizedMemberObjectName=appearance, $isX3dStatement=false, @acceptableNodeTypes=X3DAppearanceNode */ 
	private X3DAppearanceNode appearance; // SFNode acceptable node types: X3DAppearanceNode or ProtoInstanceObject
	private ProtoInstanceObject appearanceProtoInstance; // allowed alternative for appearance field

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=colorKey, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=colorKey, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> colorKey = new ArrayList<>(); // MFFloat

 /* @name=colorRamp, @type=SFNode, $javaType=X3DColorNode, $javaReferenceType=X3DColorNode, $javaPrimitiveType=X3DColorNode, $normalizedMemberObjectName=colorRamp, $isX3dStatement=false, @acceptableNodeTypes=X3DColorNode */ 
	private X3DColorNode colorRamp; // SFNode acceptable node types: X3DColorNode or ProtoInstanceObject
	private ProtoInstanceObject colorRampProtoInstance; // allowed alternative for colorRamp field

 /* @name=createParticles, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=createParticles, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean createParticles; // SFBool

 /* @name=emitter, @type=SFNode, $javaType=X3DParticleEmitterNode, $javaReferenceType=X3DParticleEmitterNode, $javaPrimitiveType=X3DParticleEmitterNode, $normalizedMemberObjectName=emitter, $isX3dStatement=false, @acceptableNodeTypes=X3DParticleEmitterNode */ 
	private X3DParticleEmitterNode emitter; // SFNode acceptable node types: X3DParticleEmitterNode or ProtoInstanceObject
	private ProtoInstanceObject emitterProtoInstance; // allowed alternative for emitter field

 /* @name=enabled, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=enabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean enabled; // SFBool

 /* @name=geometry, @type=SFNode, $javaType=X3DGeometryNode, $javaReferenceType=X3DGeometryNode, $javaPrimitiveType=X3DGeometryNode, $normalizedMemberObjectName=geometry, $isX3dStatement=false, @acceptableNodeTypes=X3DGeometryNode */ 
	private X3DGeometryNode geometry; // SFNode acceptable node types: X3DGeometryNode or ProtoInstanceObject
	private ProtoInstanceObject geometryProtoInstance; // allowed alternative for geometry field

 /* @name=geometryType, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=geometryType, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String geometryType; // SFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=isActive, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isActive, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isActive; // SFBool

 /* @name=lifetimeVariation, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=lifetimeVariation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float lifetimeVariation; // SFFloat

 /* @name=maxParticles, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=maxParticles, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int maxParticles; // SFInt32

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=particleLifetime, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=particleLifetime, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float particleLifetime; // SFFloat

 /* @name=particleSize, @type=SFVec2f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=particleSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] particleSize; // SFVec2f

 /* @name=physics, @type=MFNode, $javaType=ArrayList<X3DParticlePhysicsModelNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DParticlePhysicsModelNode>, $normalizedMemberObjectName=physics, $isX3dStatement=false, @acceptableNodeTypes=X3DParticlePhysicsModelNode */ 
	private ArrayList<X3DNode> physics = new ArrayList<>(); // MFNode acceptable node types: X3DParticlePhysicsModelNode or ProtoInstanceObject

 /* @name=texCoordKey, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=texCoordKey, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> texCoordKey = new ArrayList<>(); // MFFloat

 /* @name=texCoordRamp, @type=SFNode, $javaType=TextureCoordinateObject, $javaReferenceType=TextureCoordinateObject, $javaPrimitiveType=TextureCoordinateObject, $normalizedMemberObjectName=texCoordRamp, $isX3dStatement=false, @acceptableNodeTypes=TextureCoordinate */ 
	private TextureCoordinateObject texCoordRamp; // SFNode acceptable node types: TextureCoordinate or ProtoInstanceObject
	private ProtoInstanceObject texCoordRampProtoInstance; // allowed alternative for texCoordRamp field

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "LINE", "POINT", "QUAD", "SPRITE", "TRIANGLE", "GEOMETRY".
<br ><br >
	 * particleSystemGeometryTypeValues are allowed enumeration values for the ParticleSystem node geometryType field. Unbounded, additional values are possible.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html#ParticleSystem" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html#ParticleSystem</a> 
	*/
	public static final ArrayList<String> particleSystemGeometryTypeValues = new ArrayList<>(Arrays.<String>asList("LINE", "POINT", "QUAD", "SPRITE", "TRIANGLE", "GEOMETRY"));

	/** SFString field named <i>geometryType</i> with X3DUOM baseType <i>particleSystemGeometryTypeValues</i> can equal this value <i>"LINE"</i> (Java syntax) or <i>LINE</i> (XML syntax).
	 * @see #particleSystemGeometryTypeValues */
	public static final String GEOMETRYTYPE_LINE = "LINE";

	/** SFString field named <i>geometryType</i> with X3DUOM baseType <i>particleSystemGeometryTypeValues</i> can equal this value <i>"POINT"</i> (Java syntax) or <i>POINT</i> (XML syntax).
	 * @see #particleSystemGeometryTypeValues */
	public static final String GEOMETRYTYPE_POINT = "POINT";

	/** SFString field named <i>geometryType</i> with X3DUOM baseType <i>particleSystemGeometryTypeValues</i> can equal this value <i>"QUAD"</i> (Java syntax) or <i>QUAD</i> (XML syntax).
	 * @see #particleSystemGeometryTypeValues */
	public static final String GEOMETRYTYPE_QUAD = "QUAD";

	/** SFString field named <i>geometryType</i> with X3DUOM baseType <i>particleSystemGeometryTypeValues</i> can equal this value <i>"SPRITE"</i> (Java syntax) or <i>SPRITE</i> (XML syntax).
	 * @see #particleSystemGeometryTypeValues */
	public static final String GEOMETRYTYPE_SPRITE = "SPRITE";

	/** SFString field named <i>geometryType</i> with X3DUOM baseType <i>particleSystemGeometryTypeValues</i> can equal this value <i>"TRIANGLE"</i> (Java syntax) or <i>TRIANGLE</i> (XML syntax).
	 * @see #particleSystemGeometryTypeValues */
	public static final String GEOMETRYTYPE_TRIANGLE = "TRIANGLE";

	/** SFString field named <i>geometryType</i> with X3DUOM baseType <i>particleSystemGeometryTypeValues</i> can equal this value <i>"GEOMETRY"</i> (Java syntax) or <i>GEOMETRY</i> (XML syntax).
	 * @see #particleSystemGeometryTypeValues */
	public static final String GEOMETRYTYPE_GEOMETRY = "GEOMETRY";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>ParticleSystem</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "ParticleSystem";

	/** Provides name of this element: <i>ParticleSystem</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>ParticleSystem</i> element: <i>ParticleSystems</i> */
	public static final String COMPONENT = "ParticleSystems";

	/** Defines X3D component for the <i>ParticleSystem</i> element: <i>ParticleSystems</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>ParticleSystems</i> component level for this element: <i>2</i> */
	public static final int LEVEL = 2;

	/** Provides default X3D component level for this element: <i>2</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFNode field named <i>appearance</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DAppearanceNode APPEARANCE_DEFAULT_VALUE = null;

	/** SFVec3f field named <i>bboxCenter</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BBOXCENTER_DEFAULT_VALUE = {0f,0f,0f};

	/** SFVec3f field named <i>bboxSize</i> has default value <i>{-1f,-1f,-1f}</i> (Java syntax) or <i>-1 -1 -1</i> (XML syntax). */
	public static final float[] BBOXSIZE_DEFAULT_VALUE = {-1f,-1f,-1f};

	/** MFFloat field named <i>colorKey</i> has default value equal to an empty list. */
	public static final ArrayList<Float> COLORKEY_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** SFNode field named <i>colorRamp</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DColorNode COLORRAMP_DEFAULT_VALUE = null;

	/** SFBool field named <i>createParticles</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean CREATEPARTICLES_DEFAULT_VALUE = true;

	/** SFNode field named <i>emitter</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DParticleEmitterNode EMITTER_DEFAULT_VALUE = null;

	/** SFBool field named <i>enabled</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean ENABLED_DEFAULT_VALUE = true;

	/** SFNode field named <i>geometry</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DGeometryNode GEOMETRY_DEFAULT_VALUE = null;

	/** SFString field named <i>geometryType</i> has default value <i>"QUAD"</i> (Java syntax) or <i>QUAD</i> (XML syntax). */
	public static final String GEOMETRYTYPE_DEFAULT_VALUE = "QUAD";

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFFloat field named <i>lifetimeVariation</i> has default value <i>0.25f</i> (Java syntax) or <i>0.25</i> (XML syntax). */
	public static final float LIFETIMEVARIATION_DEFAULT_VALUE = 0.25f;

	/** SFInt32 field named <i>maxParticles</i> has default value <i>200</i> (Java syntax) or <i>200</i> (XML syntax). */
	public static final int MAXPARTICLES_DEFAULT_VALUE = 200;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFFloat field named <i>particleLifetime</i> has default value <i>5f</i> (Java syntax) or <i>5</i> (XML syntax). */
	public static final float PARTICLELIFETIME_DEFAULT_VALUE = 5f;

	/** SFVec2f field named <i>particleSize</i> has default value <i>{0.02f,0.02f}</i> (Java syntax) or <i>0.02 0.02</i> (XML syntax). */
	public static final float[] PARTICLESIZE_DEFAULT_VALUE = {0.02f,0.02f};

	/** MFFloat field named <i>texCoordKey</i> has default value equal to an empty list. */
	public static final ArrayList<Float> TEXCOORDKEY_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** SFNode field named <i>texCoordRamp</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final TextureCoordinateObject TEXCOORDRAMP_DEFAULT_VALUE = null;

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
			case "appearance":
				result = "SFNode";
				break;
			case "bboxCenter":
				result = "SFVec3f";
				break;
			case "bboxSize":
				result = "SFVec3f";
				break;
			case "colorKey":
				result = "MFFloat";
				break;
			case "colorRamp":
				result = "SFNode";
				break;
			case "createParticles":
				result = "SFBool";
				break;
			case "emitter":
				result = "SFNode";
				break;
			case "enabled":
				result = "SFBool";
				break;
			case "geometry":
				result = "SFNode";
				break;
			case "geometryType":
				result = "SFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "isActive":
				result = "SFBool";
				break;
			case "lifetimeVariation":
				result = "SFFloat";
				break;
			case "maxParticles":
				result = "SFInt32";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "particleLifetime":
				result = "SFFloat";
				break;
			case "particleSize":
				result = "SFVec2f";
				break;
			case "physics":
				result = "MFNode";
				break;
			case "texCoordKey":
				result = "MFFloat";
				break;
			case "texCoordRamp":
				result = "SFNode";
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
			case "appearance":
				result = "inputOutput";
				break;
			case "bboxCenter":
				result = "initializeOnly";
				break;
			case "bboxSize":
				result = "initializeOnly";
				break;
			case "colorKey":
				result = "initializeOnly";
				break;
			case "colorRamp":
				result = "initializeOnly";
				break;
			case "createParticles":
				result = "inputOutput";
				break;
			case "emitter":
				result = "initializeOnly";
				break;
			case "enabled":
				result = "inputOutput";
				break;
			case "geometry":
				result = "inputOutput";
				break;
			case "geometryType":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "isActive":
				result = "outputOnly";
				break;
			case "lifetimeVariation":
				result = "inputOutput";
				break;
			case "maxParticles":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "particleLifetime":
				result = "inputOutput";
				break;
			case "particleSize":
				result = "inputOutput";
				break;
			case "physics":
				result = "initializeOnly";
				break;
			case "texCoordKey":
				result = "initializeOnly";
				break;
			case "texCoordRamp":
				result = "initializeOnly";
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

	/** fromField ROUTE name for SFNode field named <i>appearance</i>. */
	public static final String fromField_APPEARANCE = "appearance";

	/** toField ROUTE name for SFNode field named <i>appearance</i>. */
	public static final String toField_APPEARANCE = "appearance";

	/** fromField ROUTE name for SFBool field named <i>createParticles</i>. */
	public static final String fromField_CREATEPARTICLES = "createParticles";

	/** toField ROUTE name for SFBool field named <i>createParticles</i>. */
	public static final String toField_CREATEPARTICLES = "createParticles";

	/** fromField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String fromField_ENABLED = "enabled";

	/** toField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String toField_ENABLED = "enabled";

	/** fromField ROUTE name for SFNode field named <i>geometry</i>. */
	public static final String fromField_GEOMETRY = "geometry";

	/** toField ROUTE name for SFNode field named <i>geometry</i>. */
	public static final String toField_GEOMETRY = "geometry";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFBool field named <i>isActive</i>. */
	public static final String fromField_ISACTIVE = "isActive";

	/** fromField ROUTE name for SFFloat field named <i>lifetimeVariation</i>. */
	public static final String fromField_LIFETIMEVARIATION = "lifetimeVariation";

	/** toField ROUTE name for SFFloat field named <i>lifetimeVariation</i>. */
	public static final String toField_LIFETIMEVARIATION = "lifetimeVariation";

	/** fromField ROUTE name for SFInt32 field named <i>maxParticles</i>. */
	public static final String fromField_MAXPARTICLES = "maxParticles";

	/** toField ROUTE name for SFInt32 field named <i>maxParticles</i>. */
	public static final String toField_MAXPARTICLES = "maxParticles";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFFloat field named <i>particleLifetime</i>. */
	public static final String fromField_PARTICLELIFETIME = "particleLifetime";

	/** toField ROUTE name for SFFloat field named <i>particleLifetime</i>. */
	public static final String toField_PARTICLELIFETIME = "particleLifetime";

	/** fromField ROUTE name for SFVec2f field named <i>particleSize</i>. */
	public static final String fromField_PARTICLESIZE = "particleSize";

	/** toField ROUTE name for SFVec2f field named <i>particleSize</i>. */
	public static final String toField_PARTICLESIZE = "particleSize";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for ParticleSystemObject to initialize member variables with default values. */
	public ParticleSystemObject()
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

		appearance = null;              // clear out any prior node
		appearanceProtoInstance = null; // clear out any prior node
		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		colorKey = new ArrayList<>();
		colorRamp = null;              // clear out any prior node
		colorRampProtoInstance = null; // clear out any prior node
		createParticles = CREATEPARTICLES_DEFAULT_VALUE;
		emitter = null;              // clear out any prior node
		emitterProtoInstance = null; // clear out any prior node
		enabled = ENABLED_DEFAULT_VALUE;
		geometry = null;              // clear out any prior node
		geometryProtoInstance = null; // clear out any prior node
		geometry = null;              // clear out any prior node
		geometryProtoInstance = null; // clear out any prior node
		geometryType = GEOMETRYTYPE_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		lifetimeVariation = LIFETIMEVARIATION_DEFAULT_VALUE;
		maxParticles = MAXPARTICLES_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		particleLifetime = PARTICLELIFETIME_DEFAULT_VALUE;
		particleSize = PARTICLESIZE_DEFAULT_VALUE;
		physics = new ArrayList<>();
		texCoordKey = new ArrayList<>();
		texCoordRamp = null;              // clear out any prior node
		texCoordRampProtoInstance = null; // clear out any prior node
		visible = VISIBLE_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DAppearanceNode instance (using a properly typed node) from inputOutput SFNode field <i>appearance</i>.
	 * @see #getAppearanceProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DAppearanceNode] The appearance field holds an Appearance node that is used for the geometry. All effects, such as material colors and/or multi-textures, are applied to each particle.
 * <ul>
 *  <li> <i>Hint:</i> if a texture coordinate ramp and key is supplied with this geometry, it shall be used in preference to any automatic texture coordinate generation. </li> 
 *  <li> <i>Hint:</i>  if automatic texture coordinate generation is used, results shall be based on the entire volume that the particles consume, not locally applied to each particle. </li> 
 * </ul>
	 * @return value of appearance field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public X3DAppearanceNode getAppearance()
	{
		return appearance;
	}

	/**
	 * Accessor method to assign X3DAppearanceNode instance (using a properly typed node) to inputOutput SFNode field <i>appearance</i>.
	 * @see #setAppearance(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DAppearanceNode] The appearance field holds an Appearance node that is used for the geometry. All effects, such as material colors and/or multi-textures, are applied to each particle.
 * <ul>
 *  <li> <i>Hint:</i> if a texture coordinate ramp and key is supplied with this geometry, it shall be used in preference to any automatic texture coordinate generation. </li> 
 *  <li> <i>Hint:</i>  if automatic texture coordinate generation is used, results shall be based on the entire volume that the particles consume, not locally applied to each particle. </li> 
 * </ul>
	 * @param newValue is new value for the appearance field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setAppearance(X3DAppearanceNode newValue)
	{
		// set-newValue-validity-checks #0
		appearance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) appearance).setParentObject(this); // parentTest15
		}
		if (appearanceProtoInstance != null)
		{
			appearanceProtoInstance.setParentObject(null); // housekeeping, clear prior object
			appearanceProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of appearance field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearAppearance()
	{
		((X3DConcreteElement) appearance).clearParentObject(); // remove references to facilitate Java memory management
		appearance = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>appearance</i>.
	 * @see #setAppearance(X3DAppearanceNode)
	 * @param newValue is new value for the appearance field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setAppearance(ProtoInstanceObject newValue)
	{
		if (appearanceProtoInstance != null)
		{
			((X3DConcreteElement) appearanceProtoInstance).setParentObject(null); // parentTest15.5
	    }
		appearanceProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) appearanceProtoInstance).setParentObject(this); // parentTest15.6
            appearanceProtoInstance.setContainerField("appearance");
	    }
		if (appearance != null)
		{
			((X3DConcreteElement) appearance).setParentObject(null); // housekeeping, clear prior object
			appearance = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getAppearanceProtoInstance()
		{
			return appearanceProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>appearance</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getAppearance()
	 * @see #getAppearanceProtoInstance()
	 */
	public boolean hasAppearance()
	{
		return (appearance != null) || (appearanceProtoInstance != null);
	}
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxCenter(SFVec3fObject newValue)
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

	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxCenter(double[] newArray)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxSize(SFVec3fObject newValue)
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

	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of Float results using RGB values [0..1] from initializeOnly MFFloat field named <i>colorKey</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Array of time intervals in seconds, corresponding to particle lifetime, that are used to interpolate colorRamp array values.
 * <ul>
 *  <li> <i>Hint:</i> color values are interpolated in linear Hue Saturation Value (HSV) space, similar to ColorInterpolator node. </li> 
 *  <li> <i>Hint:</i> color values are defined as per-vertex color values. </li> 
 *  <li> <i>Warning:</i> if an Appearance and Material nodes are provided, those material properties override colorRamp interpolation. </li> 
 *  <li> <i>Hint:</i> number of colorKey values must match length of the per-vertex colorRamp arrays! </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of colorKey field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getColorKey()
	{
		final float[] valuesArray = new float[colorKey.size()];
		int i = 0;
		for (Float arrayElement : colorKey) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat colorKey field, similar to {@link #getColorKey()}.
	 * @return value of colorKey field
	 */
	public ArrayList<Float> getColorKeyList()
	{
		return colorKey;
	}
	/**
	 * Utility method to get String value of MFFloat colorKey field, similar to {@link #getColorKey()}.
	 * @return value of colorKey field
	 */
	public String getColorKeyString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : colorKey) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to initializeOnly MFFloat field named <i>colorKey</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Array of time intervals in seconds, corresponding to particle lifetime, that are used to interpolate colorRamp array values.
 * <ul>
 *  <li> <i>Hint:</i> color values are interpolated in linear Hue Saturation Value (HSV) space, similar to ColorInterpolator node. </li> 
 *  <li> <i>Hint:</i> color values are defined as per-vertex color values. </li> 
 *  <li> <i>Warning:</i> if an Appearance and Material nodes are provided, those material properties override colorRamp interpolation. </li> 
 *  <li> <i>Hint:</i> number of colorKey values must match length of the per-vertex colorRamp arrays! </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setColorKey(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearColorKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearColorKey(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			colorKey.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat colorKey field, similar to {@link #setColorKey(float[])}.
	 * @param newValue is new value for the colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setColorKey(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearColorKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setColorKey(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat colorKey field, similar to {@link #setColorKey(float[])}.
	 * @param newValue is new value for the colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setColorKey(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearColorKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearColorKey(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setColorKey(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ParticleSystemObject clearColorKey()
	{
		colorKey.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat colorKey field, similar to {@link #setColorKey(float[])}.
	 * @param newValue is new value for the colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setColorKey(int[] newValue)
	{
		if (newValue == null)		{
			clearColorKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setColorKey(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat colorKey field.
	 * @param newValue is new value to add to the colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject addColorKey(float newValue)
	{
		colorKey.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat colorKey field.
	 * @param newValue is new value to add to the colorKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject addColorKey(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		colorKey.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setColorKey(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setColorKey(double[] newArray)
	{
		return setColorKey(new MFFloatObject(newArray));
	}
	/**
	 * Provide X3DColorNode instance (using a properly typed node) using RGB values [0..1] from initializeOnly SFNode field <i>colorRamp</i>.
	 * @see #getColorRampProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DColorNode] The colorRamp Color|ColorRGBA node holds a series of color values to be used at the given colorKey points in time.
 * <ul>
 *  <li> <i>Hint:</i> color values are defined as per-vertex color values. </li> 
 *  <li> <i>Warning:</i> if an Appearance and Material nodes are provided, those material properties override colorRamp interpolation. </li> 
 *  <li> <i>Hint:</i> number of colorKey values must match length of the per-vertex colorRamp arrays! </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of colorRamp field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public X3DColorNode getColorRamp()
	{
		return colorRamp;
	}

	/**
	 * Accessor method to assign X3DColorNode instance (using a properly typed node) to initializeOnly SFNode field <i>colorRamp</i>.
	 * @see #setColorRamp(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DColorNode] The colorRamp Color|ColorRGBA node holds a series of color values to be used at the given colorKey points in time.
 * <ul>
 *  <li> <i>Hint:</i> color values are defined as per-vertex color values. </li> 
 *  <li> <i>Warning:</i> if an Appearance and Material nodes are provided, those material properties override colorRamp interpolation. </li> 
 *  <li> <i>Hint:</i> number of colorKey values must match length of the per-vertex colorRamp arrays! </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the colorRamp field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setColorRamp(X3DColorNode newValue)
	{
		// set-newValue-validity-checks #0
		colorRamp = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) colorRamp).setParentObject(this); // parentTest15
		}
		if (colorRampProtoInstance != null)
		{
			colorRampProtoInstance.setParentObject(null); // housekeeping, clear prior object
			colorRampProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of colorRamp field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearColorRamp()
	{
		((X3DConcreteElement) colorRamp).clearParentObject(); // remove references to facilitate Java memory management
		colorRamp = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to initializeOnly SFNode field <i>colorRamp</i>.
	 * @see #setColorRamp(X3DColorNode)
	 * @param newValue is new value for the colorRamp field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setColorRamp(ProtoInstanceObject newValue)
	{
		if (colorRampProtoInstance != null)
		{
			((X3DConcreteElement) colorRampProtoInstance).setParentObject(null); // parentTest15.5
	    }
		colorRampProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) colorRampProtoInstance).setParentObject(this); // parentTest15.6
            colorRampProtoInstance.setContainerField("colorRamp");
	    }
		if (colorRamp != null)
		{
			((X3DConcreteElement) colorRamp).setParentObject(null); // housekeeping, clear prior object
			colorRamp = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getColorRampProtoInstance()
		{
			return colorRampProtoInstance;
		}

	/**
	 * Indicate whether an object is available for initializeOnly SFNode field <i>colorRamp</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getColorRamp()
	 * @see #getColorRampProtoInstance()
	 */
	public boolean hasColorRamp()
	{
		return (colorRamp != null) || (colorRampProtoInstance != null);
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>createParticles</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Enables/disables creation of new particles, while any existing particles remain in existence and continue to animate until the end of their lifetimes.
 * <ul>
 *  <li> <i> Hint:</i>  if no particles are left in scene, system is considered both active and enabled. </li> 
 * </ul>
	 * @return value of createParticles field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getCreateParticles()
	{
		return createParticles;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>createParticles</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Enables/disables creation of new particles, while any existing particles remain in existence and continue to animate until the end of their lifetimes.
 * <ul>
 *  <li> <i> Hint:</i>  if no particles are left in scene, system is considered both active and enabled. </li> 
 * </ul>
	 * @param newValue is new value for the createParticles field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setCreateParticles(boolean newValue)
	{
		// set-newValue-validity-checks #0
		createParticles = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool createParticles field, similar to {@link #setCreateParticles(boolean)}.
	 * @param newValue is new value for the createParticles field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setCreateParticles(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCreateParticles(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide X3DParticleEmitterNode instance (using a properly typed node) from initializeOnly SFNode field <i>emitter</i>.
	 * @see #getEmitterProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DParticleEmitterNode] The emitter field specifies the type of emitter geometry and properties that the particles are given for their initial positions.  * <br>

	 * @return value of emitter field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public X3DParticleEmitterNode getEmitter()
	{
		return emitter;
	}

	/**
	 * Accessor method to assign X3DParticleEmitterNode instance (using a properly typed node) to initializeOnly SFNode field <i>emitter</i>.
	 * @see #setEmitter(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DParticleEmitterNode] The emitter field specifies the type of emitter geometry and properties that the particles are given for their initial positions.  * <br>

	 * @param newValue is new value for the emitter field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setEmitter(X3DParticleEmitterNode newValue)
	{
		// set-newValue-validity-checks #0
		emitter = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) emitter).setParentObject(this); // parentTest15
		}
		if (emitterProtoInstance != null)
		{
			emitterProtoInstance.setParentObject(null); // housekeeping, clear prior object
			emitterProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of emitter field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearEmitter()
	{
		((X3DConcreteElement) emitter).clearParentObject(); // remove references to facilitate Java memory management
		emitter = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to initializeOnly SFNode field <i>emitter</i>.
	 * @see #setEmitter(X3DParticleEmitterNode)
	 * @param newValue is new value for the emitter field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setEmitter(ProtoInstanceObject newValue)
	{
		if (emitterProtoInstance != null)
		{
			((X3DConcreteElement) emitterProtoInstance).setParentObject(null); // parentTest15.5
	    }
		emitterProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) emitterProtoInstance).setParentObject(this); // parentTest15.6
            emitterProtoInstance.setContainerField("emitter");
	    }
		if (emitter != null)
		{
			((X3DConcreteElement) emitter).setParentObject(null); // housekeeping, clear prior object
			emitter = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getEmitterProtoInstance()
		{
			return emitterProtoInstance;
		}

	/**
	 * Indicate whether an object is available for initializeOnly SFNode field <i>emitter</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getEmitter()
	 * @see #getEmitterProtoInstance()
	 */
	public boolean hasEmitter()
	{
		return (emitter != null) || (emitterProtoInstance != null);
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled()
	{
		return enabled;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setEnabled(boolean newValue)
	{
		// set-newValue-validity-checks #0
		enabled = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool enabled field, similar to {@link #setEnabled(boolean)}.
	 * @param newValue is new value for the enabled field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setEnabled(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide X3DGeometryNode instance (using a properly typed node) from inputOutput SFNode field <i>geometry</i>.
	 * @see #getGeometryProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DGeometryNode] Single contained geometry node provides geometry used for each particle when geometryType=GEOMETRY.
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @return value of geometry field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public X3DGeometryNode getGeometry()
	{
		return geometry;
	}

	/**
	 * Accessor method to assign X3DGeometryNode instance (using a properly typed node) to inputOutput SFNode field <i>geometry</i>.
	 * @see #setGeometry(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DGeometryNode] Single contained geometry node provides geometry used for each particle when geometryType=GEOMETRY.
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @param newValue is new value for the geometry field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setGeometry(X3DGeometryNode newValue)
	{
		// set-newValue-validity-checks #0
		geometry = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) geometry).setParentObject(this); // parentTest15
		}
		if (geometryProtoInstance != null)
		{
			geometryProtoInstance.setParentObject(null); // housekeeping, clear prior object
			geometryProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of geometry field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearGeometry()
	{
		((X3DConcreteElement) geometry).clearParentObject(); // remove references to facilitate Java memory management
		geometry = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>geometry</i>.
	 * @see #setGeometry(X3DGeometryNode)
	 * @param newValue is new value for the geometry field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setGeometry(ProtoInstanceObject newValue)
	{
		if (geometryProtoInstance != null)
		{
			((X3DConcreteElement) geometryProtoInstance).setParentObject(null); // parentTest15.5
	    }
		geometryProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) geometryProtoInstance).setParentObject(this); // parentTest15.6
            geometryProtoInstance.setContainerField("geometry");
	    }
		if (geometry != null)
		{
			((X3DConcreteElement) geometry).setParentObject(null); // housekeeping, clear prior object
			geometry = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getGeometryProtoInstance()
		{
			return geometryProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>geometry</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getGeometry()
	 * @see #getGeometryProtoInstance()
	 */
	public boolean hasGeometry()
	{
		return (geometry != null) || (geometryProtoInstance != null);
	}
	/**
	 * Provide String enumeration value (baseType particleSystemGeometryTypeValues) ["LINE" | "POINT" | "QUAD" | "SPRITE" | "TRIANGLE" | "GEOMETRY" | 'etc.'] from initializeOnly SFString field named <i>geometryType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> specifies type of geometry used to represent individual particles. Typically, a particle is calculated as point in space at which the geometry is placed. Changing the value of the geometry field or the definition of the geometry node shall be applied during current computation of the next frame to be rendered.
 * <ul>
 *  <li> <i>Hint:</i> LINE means that a line is drawn along the particle's current velocity vector, for this frame, centered about the particle's position. The length of the line is specified by the particle's height from the particleSize field value. </li> 
 *  <li> <i>Hint:</i> POINT means that a point geometry is rendered at the particle's position. </li> 
 *  <li> <i>Hint:</i> QUAD means that a 2D quad is rendered aligned in the local coordinate space of the particle system with the face normal pointing along the positive Z axis. Individual quads are not aligned to the user's eye position but are affected in depth by the physics model. The particle's position is at the center of the quad. </li> 
 *  <li> <i>Hint:</i> SPRITE means that a point sprite that uses a 2D point position to locate a screen-aligned quad at the center of the particle's location is rendered. </li> 
 *  <li> <i>Hint:</i> TRIANGLE means that a 2D quad is rendered using a pair of triangles aligned in the local coordinate space of the particle system with the face normal pointing along the positive Z axis. Individual triangles are not aligned to the user's eye position, but are affected in depth by the physics model. The particle's position is at the center of the triangle. </li> 
 *  <li> <i>Hint:</i> GEOMETRY means that the geometry specified by the geometry field is rendered for each particle using the local coordinate system. </li> 
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #GEOMETRYTYPE_LINE LINE}, {@link #GEOMETRYTYPE_POINT POINT}, {@link #GEOMETRYTYPE_QUAD QUAD}, {@link #GEOMETRYTYPE_SPRITE SPRITE}, {@link #GEOMETRYTYPE_TRIANGLE TRIANGLE}, {@link #GEOMETRYTYPE_GEOMETRY GEOMETRY}.
	 * @return value of geometryType field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public String getGeometryType()
	{
		return geometryType;
	}

	/**
	 * Accessor method to assign String enumeration value ("LINE" | "POINT" | "QUAD" | "SPRITE" | "TRIANGLE" | "GEOMETRY") to initializeOnly SFString field named <i>geometryType</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #GEOMETRYTYPE_LINE LINE}, {@link #GEOMETRYTYPE_POINT POINT}, {@link #GEOMETRYTYPE_QUAD QUAD}, {@link #GEOMETRYTYPE_SPRITE SPRITE}, {@link #GEOMETRYTYPE_TRIANGLE TRIANGLE}, {@link #GEOMETRYTYPE_GEOMETRY GEOMETRY}).
	 * <br><br>
	 * <i>Tooltip:</i> specifies type of geometry used to represent individual particles. Typically, a particle is calculated as point in space at which the geometry is placed. Changing the value of the geometry field or the definition of the geometry node shall be applied during current computation of the next frame to be rendered.
 * <ul>
 *  <li> <i>Hint:</i> LINE means that a line is drawn along the particle's current velocity vector, for this frame, centered about the particle's position. The length of the line is specified by the particle's height from the particleSize field value. </li> 
 *  <li> <i>Hint:</i> POINT means that a point geometry is rendered at the particle's position. </li> 
 *  <li> <i>Hint:</i> QUAD means that a 2D quad is rendered aligned in the local coordinate space of the particle system with the face normal pointing along the positive Z axis. Individual quads are not aligned to the user's eye position but are affected in depth by the physics model. The particle's position is at the center of the quad. </li> 
 *  <li> <i>Hint:</i> SPRITE means that a point sprite that uses a 2D point position to locate a screen-aligned quad at the center of the particle's location is rendered. </li> 
 *  <li> <i>Hint:</i> TRIANGLE means that a 2D quad is rendered using a pair of triangles aligned in the local coordinate space of the particle system with the face normal pointing along the positive Z axis. Individual triangles are not aligned to the user's eye position, but are affected in depth by the physics model. The particle's position is at the center of the triangle. </li> 
 *  <li> <i>Hint:</i> GEOMETRY means that the geometry specified by the geometry field is rendered for each particle using the local coordinate system. </li> 
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @param newValue is new value for the geometryType field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setGeometryType(String newValue)
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
			newValue.equals(GEOMETRYTYPE_LINE) ||
			newValue.equals(GEOMETRYTYPE_POINT) ||
			newValue.equals(GEOMETRYTYPE_QUAD) ||
			newValue.equals(GEOMETRYTYPE_SPRITE) ||
			newValue.equals(GEOMETRYTYPE_TRIANGLE) ||
			newValue.equals(GEOMETRYTYPE_GEOMETRY)))
		{
			String warningMessage = "Warning: ParticleSystem geometryType newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";
			System.out.println(warningMessage);
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		geometryType = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString geometryType field, similar to {@link #setGeometryType(String)}.
	 * @param newValue is new value for the geometryType field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setGeometryType(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGeometryType(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setIS(ISObject newValue)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearIS()
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
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive true/false events are sent when playback starts/stops.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsActive()
	{
		return isActive;
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>lifetimeVariation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1) TODO not properly defined in X3D spedification. Multiplier for the randomness used to control the range of possible output values. The bigger the value, the more random the output and the bigger the range of initial values possible.
 * <ul>
 *  <li> <i> Hint:</i>  variation of zero does not allow any randomness. </li> 
 * </ul>
	 * @return value of lifetimeVariation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public float getLifetimeVariation()
	{
		return lifetimeVariation;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>lifetimeVariation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1) TODO not properly defined in X3D spedification. Multiplier for the randomness used to control the range of possible output values. The bigger the value, the more random the output and the bigger the range of initial values possible.
 * <ul>
 *  <li> <i> Hint:</i>  variation of zero does not allow any randomness. </li> 
 * </ul>
	 * @param newValue is new value for the lifetimeVariation field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setLifetimeVariation(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem lifetimeVariation newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem lifetimeVariation newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		lifetimeVariation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat lifetimeVariation field, similar to {@link #setLifetimeVariation(float)}.
	 * @param newValue is new value for the lifetimeVariation field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setLifetimeVariation(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLifetimeVariation(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setLifetimeVariation(float)}.
	 * @param newValue is new value for field
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setLifetimeVariation(double newValue)
	{
		return setLifetimeVariation((float) newValue);
	}
	/**
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>maxParticles</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Maximum number of particles to be generated at one time (subject to player limitations).  * <br>

	 * @return value of maxParticles field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public int getMaxParticles()
	{
		return maxParticles;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>maxParticles</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Maximum number of particles to be generated at one time (subject to player limitations).  * <br>

	 * @param newValue is new value for the maxParticles field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setMaxParticles(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem maxParticles newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		maxParticles = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 maxParticles field, similar to {@link #setMaxParticles(int)}.
	 * @param newValue is new value for the maxParticles field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setMaxParticles(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMaxParticles(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>particleLifetime</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) TODO not properly defined in X3D spedification. Particle animation lifetime in base time units (default is seconds).  * <br>

	 * @return value of particleLifetime field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public float getParticleLifetime()
	{
		return particleLifetime;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>particleLifetime</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) TODO not properly defined in X3D spedification. Particle animation lifetime in base time units (default is seconds).  * <br>

	 * @param newValue is new value for the particleLifetime field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setParticleLifetime(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem particleLifetime newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		particleLifetime = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat particleLifetime field, similar to {@link #setParticleLifetime(float)}.
	 * @param newValue is new value for the particleLifetime field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setParticleLifetime(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setParticleLifetime(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setParticleLifetime(float)}.
	 * @param newValue is new value for field
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setParticleLifetime(double newValue)
	{
		return setParticleLifetime((float) newValue);
	}
	/**
	 * Provide array of 2-tuple float results within allowed range of [0,infinity) from inputOutput SFVec2f field named <i>particleSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) particleSize describes width and height dimensions for each particle in length base units (default is meters). Changing this value dynamically will only change new particles created after the change.
 * <ul>
 *  <li> <i>Hint:</i> particles created before this timestamp will remain at the old size. </li> 
 *  <li> <i>Hint:</i>  his field only effects particles using LINE, QUAD, SPRITE, and TRIANGLE geometry types. </li> 
 * </ul>
	 * @return value of particleSize field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getParticleSize()
	{
		return particleSize;
	}

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>particleSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) particleSize describes width and height dimensions for each particle in length base units (default is meters). Changing this value dynamically will only change new particles created after the change.
 * <ul>
 *  <li> <i>Hint:</i> particles created before this timestamp will remain at the old size. </li> 
 *  <li> <i>Hint:</i>  his field only effects particles using LINE, QUAD, SPRITE, and TRIANGLE geometry types. </li> 
 * </ul>
	 * @param newValue is new value for the particleSize field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setParticleSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 2) // 2-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem particleSize newValue=" + SFVec2fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 2");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem particleSize newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		particleSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec2f particleSize field, similar to {@link #setParticleSize(float[])}.
	 * @param newValue is new value for the particleSize field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setParticleSize(SFVec2fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setParticleSize(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec2f particleSize field, similar to {@link #setParticleSize(float[])}.

	 * @param x first component
	 * @param y second component

	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setParticleSize(float x, float y)
	{
		setParticleSize(new float[] {x, y});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setParticleSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setParticleSize(double x, double y)
	{
		return setParticleSize(new SFVec2fObject(x, y));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setParticleSize(float[])}.
	 * @param newArray is new value for field                          
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setParticleSize(double[] newArray)
	{
		return setParticleSize(new SFVec2fObject(newArray));
	}
	/**
	 * Provide array of X3DParticlePhysicsModelNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from initializeOnly MFNode field <i>physics</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DParticlePhysicsModelNode] After being created, the individual particles are then manipulated according to the physics model(s) specified in the physics field.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DParticlePhysicsModelNode.
	 * @see org.web3d.x3d.sai.ParticleSystems.X3DParticlePhysicsModelNode
	 * @return value of physics field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getPhysics()
	{
		final X3DNode[] valuesArray = new X3DNode[physics.size()];
		int i = 0;
		for (X3DNode arrayElement : physics) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode physics field, similar to {@link #getPhysics()}.
	 * @return value of physics field
	 */
	public ArrayList<X3DNode> getPhysicsList()
	{
		return physics;
	}

	/**
	 * Accessor method to assign X3DParticlePhysicsModelNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to initializeOnly MFNode field <i>physics</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DParticlePhysicsModelNode] After being created, the individual particles are then manipulated according to the physics model(s) specified in the physics field.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DParticlePhysicsModelNode.
	 * @param newValue is new value for the physics field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setPhysics(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearPhysics(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearPhysics(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				physics.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode physics field, similar to {@link #setPhysics(X3DNode[])}.
	 * @param newValue is new value for the physics field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setPhysics(ArrayList<X3DParticlePhysicsModelNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearPhysics(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearPhysics(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setPhysics(newArray);
        }
		for (X3DParticlePhysicsModelNode element : newValue)
		{
			physics.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of physics nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DParticlePhysicsModelNode and ProtoInstance.
	 * @param newValue is new value to be appended the physics field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public ParticleSystemObject addPhysics(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		physics.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for physics field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public ParticleSystemObject addPhysics(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		physics.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child physics nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DParticlePhysicsModelNode.
	 * @param newValue is new value array to be appended the physics field.
	 */
	@Override // or here2?
	public void addPhysics(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				physics.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("physics");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child physics node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DParticlePhysicsModelNode.
	 * @param newValue is new node for the physics field (restricted to X3DParticlePhysicsModelNode)
	 */
	@Override
	public void setPhysics(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearPhysics(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : physics)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearPhysics(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			physics.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of physics field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ParticleSystemObject clearPhysics()
	{
		for (X3DNode element : physics)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		physics.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for initializeOnly MFNode field <i>physics</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getPhysics()
	 */
	public boolean hasPhysics()
	{
		return (!physics.isEmpty());
	}
	/**
	 * Provide array of Float results within allowed range of [0,infinity) from initializeOnly MFFloat field named <i>texCoordKey</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Array of time intervals in seconds, corresponding to particle lifetime, that are used to sequence texCoordRamp array values.
 * <ul>
 *  <li> <i>Hint:</i> no interpolation is performed, texture coordinates are simply sequenced in order. </li> 
 *  <li> <i>Hint:</i> texture-coordinate values map textures to vertices in the geometry. </li> 
 *  <li> <i>Hint:</i>  number of texCoordKey values must match length of the per-vertex texCoordRamp arrays!. </li> 
 * </ul>
	 * @return value of texCoordKey field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getTexCoordKey()
	{
		final float[] valuesArray = new float[texCoordKey.size()];
		int i = 0;
		for (Float arrayElement : texCoordKey) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat texCoordKey field, similar to {@link #getTexCoordKey()}.
	 * @return value of texCoordKey field
	 */
	public ArrayList<Float> getTexCoordKeyList()
	{
		return texCoordKey;
	}
	/**
	 * Utility method to get String value of MFFloat texCoordKey field, similar to {@link #getTexCoordKey()}.
	 * @return value of texCoordKey field
	 */
	public String getTexCoordKeyString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : texCoordKey) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to initializeOnly MFFloat field named <i>texCoordKey</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Array of time intervals in seconds, corresponding to particle lifetime, that are used to sequence texCoordRamp array values.
 * <ul>
 *  <li> <i>Hint:</i> no interpolation is performed, texture coordinates are simply sequenced in order. </li> 
 *  <li> <i>Hint:</i> texture-coordinate values map textures to vertices in the geometry. </li> 
 *  <li> <i>Hint:</i>  number of texCoordKey values must match length of the per-vertex texCoordRamp arrays!. </li> 
 * </ul>
	 * @param newValue is new value for the texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setTexCoordKey(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearTexCoordKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearTexCoordKey(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			texCoordKey.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat texCoordKey field, similar to {@link #setTexCoordKey(float[])}.
	 * @param newValue is new value for the texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setTexCoordKey(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearTexCoordKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTexCoordKey(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat texCoordKey field, similar to {@link #setTexCoordKey(float[])}.
	 * @param newValue is new value for the texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setTexCoordKey(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearTexCoordKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearTexCoordKey(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setTexCoordKey(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ParticleSystemObject clearTexCoordKey()
	{
		texCoordKey.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat texCoordKey field, similar to {@link #setTexCoordKey(float[])}.
	 * @param newValue is new value for the texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setTexCoordKey(int[] newValue)
	{
		if (newValue == null)		{
			clearTexCoordKey(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setTexCoordKey(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat texCoordKey field.
	 * @param newValue is new value to add to the texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject addTexCoordKey(float newValue)
	{
		texCoordKey.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat texCoordKey field.
	 * @param newValue is new value to add to the texCoordKey field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject addTexCoordKey(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		texCoordKey.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setTexCoordKey(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setTexCoordKey(double[] newArray)
	{
		return setTexCoordKey(new MFFloatObject(newArray));
	}
	/**
	 * Provide TextureCoordinateObject instance (using a properly typed node) from initializeOnly SFNode field <i>texCoordRamp</i>.
	 * @see #getTexCoordRampProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [TextureCoordinate] texture coordinates of the provided texture(s) in the Appearance node, over time. Particle systems frequently like to change the texture on a particle as it ages, yet there is no good way of accomplishing this through standard interpolators because interpolators have no concept of particle time. This pair of fields hold time-dependent values for the texture coordinates to be applied to the particle. When a particle reaches the next time stamp it moves to the next set of texture coordinates.
 * <ul>
 *  <li> <i>Hint:</i> texture-coordinate values map textures to vertices in the geometry. </li> 
 *  <li> <i>Hint:</i>  number of texCoordKey values must match length of the per-vertex texCoordRamp arrays!. </li> 
 * </ul>
	 * @return value of texCoordRamp field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public TextureCoordinate getTexCoordRamp()
	{
		return (TextureCoordinate)texCoordRamp;
	}

	/**
	 * Accessor method to assign TextureCoordinateObject instance (using a properly typed node) to initializeOnly SFNode field <i>texCoordRamp</i>.
	 * @see #setTexCoordRamp(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [TextureCoordinate] texture coordinates of the provided texture(s) in the Appearance node, over time. Particle systems frequently like to change the texture on a particle as it ages, yet there is no good way of accomplishing this through standard interpolators because interpolators have no concept of particle time. This pair of fields hold time-dependent values for the texture coordinates to be applied to the particle. When a particle reaches the next time stamp it moves to the next set of texture coordinates.
 * <ul>
 *  <li> <i>Hint:</i> texture-coordinate values map textures to vertices in the geometry. </li> 
 *  <li> <i>Hint:</i>  number of texCoordKey values must match length of the per-vertex texCoordRamp arrays!. </li> 
 * </ul>
	 * @param newValue is new value for the texCoordRamp field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setTexCoordRamp(TextureCoordinate newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setTexCoordRamp(TEXCOORDRAMP_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof TextureCoordinateObject)
	{
       texCoordRamp = (TextureCoordinateObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureCoordinate newValue=(texCoordRampObject.toString(newValue)) is not instanceof TextureCoordinateObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of texCoordRamp field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ParticleSystemObject clearTexCoordRamp()
	{
		((X3DConcreteElement) texCoordRamp).clearParentObject(); // remove references to facilitate Java memory management
		texCoordRamp = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to initializeOnly SFNode field <i>texCoordRamp</i>.
	 * @see #setTexCoordRamp(TextureCoordinate)
	 * @param newValue is new value for the texCoordRamp field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setTexCoordRamp(ProtoInstanceObject newValue)
	{
		if (texCoordRampProtoInstance != null)
		{
			((X3DConcreteElement) texCoordRampProtoInstance).setParentObject(null); // parentTest15.5
	    }
		texCoordRampProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) texCoordRampProtoInstance).setParentObject(this); // parentTest15.6
            texCoordRampProtoInstance.setContainerField("texCoordRamp");
	    }
		if (texCoordRamp != null)
		{
			((X3DConcreteElement) texCoordRamp).setParentObject(null); // housekeeping, clear prior object
			texCoordRamp = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTexCoordRampProtoInstance()
		{
			return texCoordRampProtoInstance;
		}

	/**
	 * Indicate whether an object is available for initializeOnly SFNode field <i>texCoordRamp</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTexCoordRamp()
	 * @see #getTexCoordRampProtoInstance()
	 */
	public boolean hasTexCoordRamp()
	{
		return (texCoordRamp != null) || (texCoordRampProtoInstance != null);
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getVisible()
	{
		return visible;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ParticleSystemObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setVisible(SFBoolObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ParticleSystemObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ParticleSystem DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem DEF newValue='" + newValue + "'" + 
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ParticleSystemObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ParticleSystem USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ParticleSystem USE newValue='" + newValue + "'" + 
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShapeNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ParticleSystemObject setCssClass(String newValue)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ParticleSystemObject setUSE(ParticleSystemObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on ParticleSystemObject" +
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
	public ParticleSystemObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public ParticleSystemObject addComments (String newComment)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ParticleSystemObject addComments (String[] newComments)
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
	 * @return {@link ParticleSystemObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ParticleSystemObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (appearance != null) || (appearanceProtoInstance != null) || (colorRamp != null) || (colorRampProtoInstance != null) || (emitter != null) || (emitterProtoInstance != null) || (geometry != null) || (geometryProtoInstance != null) || (geometry != null) || (geometryProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (!physics.isEmpty()) || (texCoordRamp != null) || (texCoordRampProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<ParticleSystem"); // start opening tag
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
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getColorKey().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" colorKey='").append(MFFloatObject.toString(getColorKey())).append("'");
			}
			if (((getCreateParticles() != CREATEPARTICLES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" createParticles='").append(SFBoolObject.toString(getCreateParticles())).append("'");
			}
			if (((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" enabled='").append(SFBoolObject.toString(getEnabled())).append("'");
			}
			if ((!getGeometryType().equals(GEOMETRYTYPE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" geometryType='").append(new SFStringObject(getGeometryType()).toStringX3D()).append("'");
			}
			if (((getLifetimeVariation() != LIFETIMEVARIATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" lifetimeVariation='").append(SFFloatObject.toString(getLifetimeVariation())).append("'");
			}
			if (((getMaxParticles() != MAXPARTICLES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" maxParticles='").append(SFInt32Object.toString(getMaxParticles())).append("'");
			}
			if (((getParticleLifetime() != PARTICLELIFETIME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" particleLifetime='").append(SFFloatObject.toString(getParticleLifetime())).append("'");
			}
			if ((!Arrays.equals(getParticleSize(), PARTICLESIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" particleSize='").append(SFVec2fObject.toString(getParticleSize())).append("'");
			}
			if (((getTexCoordKey().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" texCoordKey='").append(MFFloatObject.toString(getTexCoordKey())).append("'");
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
			if      (appearance != null)
			{
				stringX3D.append(((X3DConcreteElement)appearance).toStringX3D(indentLevel + indentIncrement));
			}
			else if (appearanceProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)appearanceProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (colorRamp != null)
			{
				stringX3D.append(((X3DConcreteElement)colorRamp).toStringX3D(indentLevel + indentIncrement));
			}
			else if (colorRampProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)colorRampProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (emitter != null)
			{
				stringX3D.append(((X3DConcreteElement)emitter).toStringX3D(indentLevel + indentIncrement));
			}
			else if (emitterProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)emitterProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (geometry != null)
			{
				stringX3D.append(((X3DConcreteElement)geometry).toStringX3D(indentLevel + indentIncrement));
			}
			else if (geometryProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)geometryProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (geometry != null)
			{
				stringX3D.append(((X3DConcreteElement)geometry).toStringX3D(indentLevel + indentIncrement));
			}
			else if (geometryProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)geometryProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : physics)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			if      (texCoordRamp != null)
			{
				stringX3D.append(((X3DConcreteElement)texCoordRamp).toStringX3D(indentLevel + indentIncrement));
			}
			else if (texCoordRampProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)texCoordRampProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</ParticleSystem>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=ParticleSystem, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (appearance != null) || (appearanceProtoInstance != null) || (colorRamp != null) || (colorRampProtoInstance != null) || (emitter != null) || (emitterProtoInstance != null) || (geometry != null) || (geometryProtoInstance != null) || (geometry != null) || (geometryProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (!physics.isEmpty()) || (texCoordRamp != null) || (texCoordRampProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("ParticleSystem").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("colorKey"))
						{
							stringClassicVRML.append(indentCharacter).append("colorKey").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getColorKey().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("colorKey ").append("[ ").append(MFFloatObject.toString(getColorKey())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("createParticles"))
						{
							stringClassicVRML.append(indentCharacter).append("createParticles").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getCreateParticles() != CREATEPARTICLES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("createParticles ").append(SFBoolObject.toString(getCreateParticles())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("enabled"))
						{
							stringClassicVRML.append(indentCharacter).append("enabled").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("enabled ").append(SFBoolObject.toString(getEnabled())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("geometryType"))
						{
							stringClassicVRML.append(indentCharacter).append("geometryType").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getGeometryType().equals(GEOMETRYTYPE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("geometryType ").append("\"").append(SFStringObject.toString(getGeometryType())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("lifetimeVariation"))
						{
							stringClassicVRML.append(indentCharacter).append("lifetimeVariation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getLifetimeVariation() != LIFETIMEVARIATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("lifetimeVariation ").append(SFFloatObject.toString(getLifetimeVariation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("maxParticles"))
						{
							stringClassicVRML.append(indentCharacter).append("maxParticles").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMaxParticles() != MAXPARTICLES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("maxParticles ").append(SFInt32Object.toString(getMaxParticles())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("particleLifetime"))
						{
							stringClassicVRML.append(indentCharacter).append("particleLifetime").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getParticleLifetime() != PARTICLELIFETIME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("particleLifetime ").append(SFFloatObject.toString(getParticleLifetime())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("particleSize"))
						{
							stringClassicVRML.append(indentCharacter).append("particleSize").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getParticleSize(), PARTICLESIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("particleSize ").append(SFVec2fObject.toString(getParticleSize())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("texCoordKey"))
						{
							stringClassicVRML.append(indentCharacter).append("texCoordKey").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTexCoordKey().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("texCoordKey ").append("[ ").append(MFFloatObject.toString(getTexCoordKey())).append(" ]").append("\n").append(indent).append(indentCharacter);
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
			if (appearance != null)
			{
				stringClassicVRML.append(indentCharacter).append("appearance").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) appearance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (appearanceProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("appearance").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) appearanceProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (colorRamp != null)
			{
				stringClassicVRML.append(indentCharacter).append("colorRamp").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) colorRamp).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (colorRampProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("colorRamp").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) colorRampProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (emitter != null)
			{
				stringClassicVRML.append(indentCharacter).append("emitter").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) emitter).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (emitterProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("emitter").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) emitterProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (geometry != null)
			{
				stringClassicVRML.append(indentCharacter).append("geometry").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) geometry).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (geometryProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("geometry").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) geometryProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (geometry != null)
			{
				stringClassicVRML.append(indentCharacter).append("geometry").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) geometry).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (geometryProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("geometry").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) geometryProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (physics.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("physics").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : physics)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
			}

			if (texCoordRamp != null)
			{
				stringClassicVRML.append(indentCharacter).append("texCoordRamp").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) texCoordRamp).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (texCoordRampProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("texCoordRamp").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) texCoordRampProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
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
		// no name field available for this element
		X3DConcreteElement referenceElement;
		if (appearance != null)
		{
			referenceElement = ((X3DConcreteElement) appearance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (appearanceProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) appearanceProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (colorRamp != null)
		{
			referenceElement = ((X3DConcreteElement) colorRamp).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (colorRampProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) colorRampProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (emitter != null)
		{
			referenceElement = ((X3DConcreteElement) emitter).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (emitterProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) emitterProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (geometry != null)
		{
			referenceElement = ((X3DConcreteElement) geometry).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (geometryProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) geometryProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (geometry != null)
		{
			referenceElement = ((X3DConcreteElement) geometry).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (geometryProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) geometryProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
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
		for (X3DNode element : physics) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
		}
		if (texCoordRamp != null)
		{
			referenceElement = ((X3DConcreteElement) texCoordRamp).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (texCoordRampProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) texCoordRampProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (appearance != null)
		{
			referenceNode = ((X3DConcreteElement) appearance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (appearanceProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) appearanceProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (colorRamp != null)
		{
			referenceNode = ((X3DConcreteElement) colorRamp).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (colorRampProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) colorRampProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (emitter != null)
		{
			referenceNode = ((X3DConcreteElement) emitter).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (emitterProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) emitterProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (geometry != null)
		{
			referenceNode = ((X3DConcreteElement) geometry).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (geometryProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) geometryProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (geometry != null)
		{
			referenceNode = ((X3DConcreteElement) geometry).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (geometryProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) geometryProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
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
		for (X3DNode element : physics) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
		}
		if (texCoordRamp != null)
		{
			referenceNode = ((X3DConcreteElement) texCoordRamp).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (texCoordRampProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) texCoordRampProtoInstance).findNodeByDEF(DEFvalue);
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
        
		setColorKey(getColorKey()); // exercise field checks, simple types
        
		setCreateParticles(getCreateParticles()); // exercise field checks, simple types
        
		setEnabled(getEnabled()); // exercise field checks, simple types
        
		setGeometryType(getGeometryType()); // exercise field checks, simple types
        
		setLifetimeVariation(getLifetimeVariation()); // exercise field checks, simple types
        
		setMaxParticles(getMaxParticles()); // exercise field checks, simple types
        
		setParticleLifetime(getParticleLifetime()); // exercise field checks, simple types
        
		setParticleSize(getParticleSize()); // exercise field checks, simple types
        
		setTexCoordKey(getTexCoordKey()); // exercise field checks, simple types
        
		setVisible(getVisible()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (appearance != null)
		{
			setAppearance(getAppearance());
			((X3DConcreteElement) appearance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) appearance).getValidationResult());
		}
		if (appearanceProtoInstance != null)
		{
			setAppearance(getAppearanceProtoInstance());
			((X3DConcreteElement) appearanceProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) appearanceProtoInstance).getValidationResult());
		}
		if ((appearance != null) && (appearanceProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both appearance and appearanceProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasAppearance()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode appearance";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (colorRamp != null)
		{
			setColorRamp(getColorRamp());
			((X3DConcreteElement) colorRamp).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) colorRamp).getValidationResult());
		}
		if (colorRampProtoInstance != null)
		{
			setColorRamp(getColorRampProtoInstance());
			((X3DConcreteElement) colorRampProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) colorRampProtoInstance).getValidationResult());
		}
		if ((colorRamp != null) && (colorRampProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both colorRamp and colorRampProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasColorRamp()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode colorRamp";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (emitter != null)
		{
			setEmitter(getEmitter());
			((X3DConcreteElement) emitter).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) emitter).getValidationResult());
		}
		if (emitterProtoInstance != null)
		{
			setEmitter(getEmitterProtoInstance());
			((X3DConcreteElement) emitterProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) emitterProtoInstance).getValidationResult());
		}
		if ((emitter != null) && (emitterProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both emitter and emitterProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasEmitter()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode emitter";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (geometry != null)
		{
			setGeometry(getGeometry());
			((X3DConcreteElement) geometry).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) geometry).getValidationResult());
		}
		if (geometryProtoInstance != null)
		{
			setGeometry(getGeometryProtoInstance());
			((X3DConcreteElement) geometryProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) geometryProtoInstance).getValidationResult());
		}
		if ((geometry != null) && (geometryProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both geometry and geometryProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasGeometry()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode geometry";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (geometry != null)
		{
			setGeometry(getGeometry());
			((X3DConcreteElement) geometry).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) geometry).getValidationResult());
		}
		if (geometryProtoInstance != null)
		{
			setGeometry(getGeometryProtoInstance());
			((X3DConcreteElement) geometryProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) geometryProtoInstance).getValidationResult());
		}
		if ((geometry != null) && (geometryProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both geometry and geometryProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasGeometry()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode geometry";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		for (X3DNode element : physics) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setPhysics(getPhysics()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasPhysics()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained MFNode physics";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}
		
		if (texCoordRamp != null)
		{
			setTexCoordRamp(getTexCoordRamp());
			((X3DConcreteElement) texCoordRamp).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) texCoordRamp).getValidationResult());
		}
		if (texCoordRampProtoInstance != null)
		{
			setTexCoordRamp(getTexCoordRampProtoInstance());
			((X3DConcreteElement) texCoordRampProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) texCoordRampProtoInstance).getValidationResult());
		}
		if ((texCoordRamp != null) && (texCoordRampProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both texCoordRamp and texCoordRampProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTexCoordRamp()) // test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained SFNode texCoordRamp";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ParticleSystem USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'ParticleSystem' node, add head statement <component name='ParticleSystems' level='2'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"ParticleSystems\").setLevel(2);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
