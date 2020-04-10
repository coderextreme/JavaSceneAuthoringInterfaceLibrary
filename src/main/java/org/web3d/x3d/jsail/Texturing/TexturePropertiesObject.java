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

package org.web3d.x3d.jsail.Texturing;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Texturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Texturing.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * TextureProperties allows precise fine-grained control over application of image textures to geometry.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNode] TextureProperties allows precise fine-grained control over application of image textures to geometry.
 * <ul>
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Shape' level='2'/&amp;gt; </li> 
 *  <li> <i>Hint:</i>  Texture mapping <a href="https://en.wikipedia.org/wiki/Texture_mapping" target="_blank">https://en.wikipedia.org/wiki/Texture_mapping</a> </li> 
 * </ul>
 * <br>
 * Note that {@linkplain SFColorObject#ALICEBLUE SFColorObject} provides a variety of color constants.
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#TextureProperties" target="blank">X3D Abstract Specification: TextureProperties</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TextureProperties" target="_blank">X3D Tooltips: TextureProperties</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public class TexturePropertiesObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Texturing.TextureProperties
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=anisotropicDegree, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=anisotropicDegree, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float anisotropicDegree; // SFFloat

 /* @name=borderColor, @type=SFColorRGBA, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=borderColor, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] borderColor; // SFColorRGBA

 /* @name=borderWidth, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=borderWidth, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int borderWidth; // SFInt32

 /* @name=boundaryModeR, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=boundaryModeR, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String boundaryModeR; // SFString

 /* @name=boundaryModeS, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=boundaryModeS, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String boundaryModeS; // SFString

 /* @name=boundaryModeT, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=boundaryModeT, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String boundaryModeT; // SFString

 /* @name=generateMipMaps, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=generateMipMaps, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean generateMipMaps; // SFBool

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=magnificationFilter, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=magnificationFilter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String magnificationFilter; // SFString

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=minificationFilter, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=minificationFilter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String minificationFilter; // SFString

 /* @name=textureCompression, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=textureCompression, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String textureCompression; // SFString

 /* @name=texturePriority, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=texturePriority, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float texturePriority; // SFFloat

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "CLAMP", "CLAMP_TO_EDGE", "CLAMP_TO_BOUNDARY", "MIRRORED_REPEAT", "REPEAT".
<br ><br >
	 * textureBoundaryModeChoices are strictly allowed enumeration values for TextureProperties boundaryMode* fields.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> 
	*/
	public static final ArrayList<String> textureBoundaryModeChoices = new ArrayList<>(Arrays.<String>asList("CLAMP", "CLAMP_TO_EDGE", "CLAMP_TO_BOUNDARY", "MIRRORED_REPEAT", "REPEAT"));

	/** SFString field named <i>boundaryModeR</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP"</i> (Java syntax) or <i>CLAMP</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODER_CLAMP = "CLAMP";

	/** SFString field named <i>boundaryModeR</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP_TO_EDGE"</i> (Java syntax) or <i>CLAMP_TO_EDGE</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODER_CLAMP_TO_EDGE = "CLAMP_TO_EDGE";

	/** SFString field named <i>boundaryModeR</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP_TO_BOUNDARY"</i> (Java syntax) or <i>CLAMP_TO_BOUNDARY</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODER_CLAMP_TO_BOUNDARY = "CLAMP_TO_BOUNDARY";

	/** SFString field named <i>boundaryModeR</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"MIRRORED_REPEAT"</i> (Java syntax) or <i>MIRRORED_REPEAT</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODER_MIRRORED_REPEAT = "MIRRORED_REPEAT";

	/** SFString field named <i>boundaryModeR</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"REPEAT"</i> (Java syntax) or <i>REPEAT</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODER_REPEAT = "REPEAT";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** SFString field named <i>boundaryModeS</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP"</i> (Java syntax) or <i>CLAMP</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODES_CLAMP = "CLAMP";

	/** SFString field named <i>boundaryModeS</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP_TO_EDGE"</i> (Java syntax) or <i>CLAMP_TO_EDGE</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODES_CLAMP_TO_EDGE = "CLAMP_TO_EDGE";

	/** SFString field named <i>boundaryModeS</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP_TO_BOUNDARY"</i> (Java syntax) or <i>CLAMP_TO_BOUNDARY</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODES_CLAMP_TO_BOUNDARY = "CLAMP_TO_BOUNDARY";

	/** SFString field named <i>boundaryModeS</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"MIRRORED_REPEAT"</i> (Java syntax) or <i>MIRRORED_REPEAT</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODES_MIRRORED_REPEAT = "MIRRORED_REPEAT";

	/** SFString field named <i>boundaryModeS</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"REPEAT"</i> (Java syntax) or <i>REPEAT</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODES_REPEAT = "REPEAT";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** SFString field named <i>boundaryModeT</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP"</i> (Java syntax) or <i>CLAMP</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODET_CLAMP = "CLAMP";

	/** SFString field named <i>boundaryModeT</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP_TO_EDGE"</i> (Java syntax) or <i>CLAMP_TO_EDGE</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODET_CLAMP_TO_EDGE = "CLAMP_TO_EDGE";

	/** SFString field named <i>boundaryModeT</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"CLAMP_TO_BOUNDARY"</i> (Java syntax) or <i>CLAMP_TO_BOUNDARY</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODET_CLAMP_TO_BOUNDARY = "CLAMP_TO_BOUNDARY";

	/** SFString field named <i>boundaryModeT</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"MIRRORED_REPEAT"</i> (Java syntax) or <i>MIRRORED_REPEAT</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODET_MIRRORED_REPEAT = "MIRRORED_REPEAT";

	/** SFString field named <i>boundaryModeT</i> with X3DUOM baseType <i>textureBoundaryModeChoices</i> can equal this value <i>"REPEAT"</i> (Java syntax) or <i>REPEAT</i> (XML syntax).
	 * @see #textureBoundaryModeChoices */
	public static final String BOUNDARYMODET_REPEAT = "REPEAT";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "AVG_PIXEL", "DEFAULT", "FASTEST", "NEAREST_PIXEL", "NICEST".
<br ><br >
	 * textureMagnificationModeChoices are strictly allowed enumeration values for TextureProperties field magnificationFilter.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes</a> 
	*/
	public static final ArrayList<String> textureMagnificationModeChoices = new ArrayList<>(Arrays.<String>asList("AVG_PIXEL", "DEFAULT", "FASTEST", "NEAREST_PIXEL", "NICEST"));

	/** SFString field named <i>magnificationFilter</i> with X3DUOM baseType <i>textureMagnificationModeChoices</i> can equal this value <i>"AVG_PIXEL"</i> (Java syntax) or <i>AVG_PIXEL</i> (XML syntax).
	 * @see #textureMagnificationModeChoices */
	public static final String MAGNIFICATIONFILTER_AVG_PIXEL = "AVG_PIXEL";

	/** SFString field named <i>magnificationFilter</i> with X3DUOM baseType <i>textureMagnificationModeChoices</i> can equal this value <i>"DEFAULT"</i> (Java syntax) or <i>DEFAULT</i> (XML syntax).
	 * @see #textureMagnificationModeChoices */
	public static final String MAGNIFICATIONFILTER_DEFAULT = "DEFAULT";

	/** SFString field named <i>magnificationFilter</i> with X3DUOM baseType <i>textureMagnificationModeChoices</i> can equal this value <i>"FASTEST"</i> (Java syntax) or <i>FASTEST</i> (XML syntax).
	 * @see #textureMagnificationModeChoices */
	public static final String MAGNIFICATIONFILTER_FASTEST = "FASTEST";

	/** SFString field named <i>magnificationFilter</i> with X3DUOM baseType <i>textureMagnificationModeChoices</i> can equal this value <i>"NEAREST_PIXEL"</i> (Java syntax) or <i>NEAREST_PIXEL</i> (XML syntax).
	 * @see #textureMagnificationModeChoices */
	public static final String MAGNIFICATIONFILTER_NEAREST_PIXEL = "NEAREST_PIXEL";

	/** SFString field named <i>magnificationFilter</i> with X3DUOM baseType <i>textureMagnificationModeChoices</i> can equal this value <i>"NICEST"</i> (Java syntax) or <i>NICEST</i> (XML syntax).
	 * @see #textureMagnificationModeChoices */
	public static final String MAGNIFICATIONFILTER_NICEST = "NICEST";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "AVG_PIXEL", "AVG_PIXEL_AVG_MIPMAP", "AVG_PIXEL_NEAREST_MIPMAP", "DEFAULT", "FASTEST", "NEAREST_PIXEL", "NEAREST_PIXEL_AVG_MIPMAP", "NEAREST_PIXEL_NEAREST_MIPMAP", "NICEST".
<br ><br >
	 * textureMinificationModeChoices are strictly allowed enumeration values for TextureProperties field minificationFilter.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes</a> 
	*/
	public static final ArrayList<String> textureMinificationModeChoices = new ArrayList<>(Arrays.<String>asList("AVG_PIXEL", "AVG_PIXEL_AVG_MIPMAP", "AVG_PIXEL_NEAREST_MIPMAP", "DEFAULT", "FASTEST", "NEAREST_PIXEL", "NEAREST_PIXEL_AVG_MIPMAP", "NEAREST_PIXEL_NEAREST_MIPMAP", "NICEST"));

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"AVG_PIXEL"</i> (Java syntax) or <i>AVG_PIXEL</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_AVG_PIXEL = "AVG_PIXEL";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"AVG_PIXEL_AVG_MIPMAP"</i> (Java syntax) or <i>AVG_PIXEL_AVG_MIPMAP</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_AVG_PIXEL_AVG_MIPMAP = "AVG_PIXEL_AVG_MIPMAP";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"AVG_PIXEL_NEAREST_MIPMAP"</i> (Java syntax) or <i>AVG_PIXEL_NEAREST_MIPMAP</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_AVG_PIXEL_NEAREST_MIPMAP = "AVG_PIXEL_NEAREST_MIPMAP";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"DEFAULT"</i> (Java syntax) or <i>DEFAULT</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_DEFAULT = "DEFAULT";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"FASTEST"</i> (Java syntax) or <i>FASTEST</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_FASTEST = "FASTEST";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"NEAREST_PIXEL"</i> (Java syntax) or <i>NEAREST_PIXEL</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_NEAREST_PIXEL = "NEAREST_PIXEL";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"NEAREST_PIXEL_AVG_MIPMAP"</i> (Java syntax) or <i>NEAREST_PIXEL_AVG_MIPMAP</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_NEAREST_PIXEL_AVG_MIPMAP = "NEAREST_PIXEL_AVG_MIPMAP";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"NEAREST_PIXEL_NEAREST_MIPMAP"</i> (Java syntax) or <i>NEAREST_PIXEL_NEAREST_MIPMAP</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_NEAREST_PIXEL_NEAREST_MIPMAP = "NEAREST_PIXEL_NEAREST_MIPMAP";

	/** SFString field named <i>minificationFilter</i> with X3DUOM baseType <i>textureMinificationModeChoices</i> can equal this value <i>"NICEST"</i> (Java syntax) or <i>NICEST</i> (XML syntax).
	 * @see #textureMinificationModeChoices */
	public static final String MINIFICATIONFILTER_NICEST = "NICEST";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "DEFAULT", "FASTEST", "HIGH", "LOW", "MEDIUM", "NICEST".
<br ><br >
	 * textureCompressionModeChoices are strictly allowed enumeration values for TextureProperties field textureCompression.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes</a> 
	*/
	public static final ArrayList<String> textureCompressionModeChoices = new ArrayList<>(Arrays.<String>asList("DEFAULT", "FASTEST", "HIGH", "LOW", "MEDIUM", "NICEST"));

	/** SFString field named <i>textureCompression</i> with X3DUOM baseType <i>textureCompressionModeChoices</i> can equal this value <i>"DEFAULT"</i> (Java syntax) or <i>DEFAULT</i> (XML syntax).
	 * @see #textureCompressionModeChoices */
	public static final String TEXTURECOMPRESSION_DEFAULT = "DEFAULT";

	/** SFString field named <i>textureCompression</i> with X3DUOM baseType <i>textureCompressionModeChoices</i> can equal this value <i>"FASTEST"</i> (Java syntax) or <i>FASTEST</i> (XML syntax).
	 * @see #textureCompressionModeChoices */
	public static final String TEXTURECOMPRESSION_FASTEST = "FASTEST";

	/** SFString field named <i>textureCompression</i> with X3DUOM baseType <i>textureCompressionModeChoices</i> can equal this value <i>"HIGH"</i> (Java syntax) or <i>HIGH</i> (XML syntax).
	 * @see #textureCompressionModeChoices */
	public static final String TEXTURECOMPRESSION_HIGH = "HIGH";

	/** SFString field named <i>textureCompression</i> with X3DUOM baseType <i>textureCompressionModeChoices</i> can equal this value <i>"LOW"</i> (Java syntax) or <i>LOW</i> (XML syntax).
	 * @see #textureCompressionModeChoices */
	public static final String TEXTURECOMPRESSION_LOW = "LOW";

	/** SFString field named <i>textureCompression</i> with X3DUOM baseType <i>textureCompressionModeChoices</i> can equal this value <i>"MEDIUM"</i> (Java syntax) or <i>MEDIUM</i> (XML syntax).
	 * @see #textureCompressionModeChoices */
	public static final String TEXTURECOMPRESSION_MEDIUM = "MEDIUM";

	/** SFString field named <i>textureCompression</i> with X3DUOM baseType <i>textureCompressionModeChoices</i> can equal this value <i>"NICEST"</i> (Java syntax) or <i>NICEST</i> (XML syntax).
	 * @see #textureCompressionModeChoices */
	public static final String TEXTURECOMPRESSION_NICEST = "NICEST";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>TextureProperties</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "TextureProperties";

	/** Provides name of this element: <i>TextureProperties</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>TextureProperties</i> element: <i>Texturing</i> */
	public static final String COMPONENT = "Texturing";

	/** Defines X3D component for the <i>TextureProperties</i> element: <i>Texturing</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Texturing</i> component level for this element: <i>2</i> */
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

	/** SFFloat field named <i>anisotropicDegree</i> has default value <i>1f</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final float ANISOTROPICDEGREE_DEFAULT_VALUE = 1f;

	/** SFColorRGBA field named <i>borderColor</i> has default value <i>{0f,0f,0f,0f}</i> (Java syntax) or <i>0 0 0 0</i> (XML syntax). */
	public static final float[] BORDERCOLOR_DEFAULT_VALUE = {0f,0f,0f,0f};

	/** SFInt32 field named <i>borderWidth</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int BORDERWIDTH_DEFAULT_VALUE = 0;

	/** SFString field named <i>boundaryModeR</i> has default value <i>"REPEAT"</i> (Java syntax) or <i>REPEAT</i> (XML syntax). */
	public static final String BOUNDARYMODER_DEFAULT_VALUE = "REPEAT";

	/** SFString field named <i>boundaryModeS</i> has default value <i>"REPEAT"</i> (Java syntax) or <i>REPEAT</i> (XML syntax). */
	public static final String BOUNDARYMODES_DEFAULT_VALUE = "REPEAT";

	/** SFString field named <i>boundaryModeT</i> has default value <i>"REPEAT"</i> (Java syntax) or <i>REPEAT</i> (XML syntax). */
	public static final String BOUNDARYMODET_DEFAULT_VALUE = "REPEAT";

	/** SFBool field named <i>generateMipMaps</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean GENERATEMIPMAPS_DEFAULT_VALUE = false;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFString field named <i>magnificationFilter</i> has default value <i>"FASTEST"</i> (Java syntax) or <i>FASTEST</i> (XML syntax). */
	public static final String MAGNIFICATIONFILTER_DEFAULT_VALUE = "FASTEST";

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFString field named <i>minificationFilter</i> has default value <i>"FASTEST"</i> (Java syntax) or <i>FASTEST</i> (XML syntax). */
	public static final String MINIFICATIONFILTER_DEFAULT_VALUE = "FASTEST";

	/** SFString field named <i>textureCompression</i> has default value <i>"FASTEST"</i> (Java syntax) or <i>FASTEST</i> (XML syntax). */
	public static final String TEXTURECOMPRESSION_DEFAULT_VALUE = "FASTEST";

	/** SFFloat field named <i>texturePriority</i> has default value <i>0f</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final float TEXTUREPRIORITY_DEFAULT_VALUE = 0f;

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
			case "anisotropicDegree":
				result = "SFFloat";
				break;
			case "borderColor":
				result = "SFColorRGBA";
				break;
			case "borderWidth":
				result = "SFInt32";
				break;
			case "boundaryModeR":
				result = "SFString";
				break;
			case "boundaryModeS":
				result = "SFString";
				break;
			case "boundaryModeT":
				result = "SFString";
				break;
			case "generateMipMaps":
				result = "SFBool";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "magnificationFilter":
				result = "SFString";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "minificationFilter":
				result = "SFString";
				break;
			case "textureCompression":
				result = "SFString";
				break;
			case "texturePriority":
				result = "SFFloat";
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
			case "anisotropicDegree":
				result = "inputOutput";
				break;
			case "borderColor":
				result = "inputOutput";
				break;
			case "borderWidth":
				result = "inputOutput";
				break;
			case "boundaryModeR":
				result = "inputOutput";
				break;
			case "boundaryModeS":
				result = "inputOutput";
				break;
			case "boundaryModeT":
				result = "inputOutput";
				break;
			case "generateMipMaps":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "magnificationFilter":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "minificationFilter":
				result = "inputOutput";
				break;
			case "textureCompression":
				result = "inputOutput";
				break;
			case "texturePriority":
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
	public static final String containerField_DEFAULT_VALUE = "textureProperties"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFFloat field named <i>anisotropicDegree</i>. */
	public static final String fromField_ANISOTROPICDEGREE = "anisotropicDegree";

	/** toField ROUTE name for SFFloat field named <i>anisotropicDegree</i>. */
	public static final String toField_ANISOTROPICDEGREE = "anisotropicDegree";

	/** fromField ROUTE name for SFColorRGBA field named <i>borderColor</i>. */
	public static final String fromField_BORDERCOLOR = "borderColor";

	/** toField ROUTE name for SFColorRGBA field named <i>borderColor</i>. */
	public static final String toField_BORDERCOLOR = "borderColor";

	/** fromField ROUTE name for SFInt32 field named <i>borderWidth</i>. */
	public static final String fromField_BORDERWIDTH = "borderWidth";

	/** toField ROUTE name for SFInt32 field named <i>borderWidth</i>. */
	public static final String toField_BORDERWIDTH = "borderWidth";

	/** fromField ROUTE name for SFString field named <i>boundaryModeR</i>. */
	public static final String fromField_BOUNDARYMODER = "boundaryModeR";

	/** toField ROUTE name for SFString field named <i>boundaryModeR</i>. */
	public static final String toField_BOUNDARYMODER = "boundaryModeR";

	/** fromField ROUTE name for SFString field named <i>boundaryModeS</i>. */
	public static final String fromField_BOUNDARYMODES = "boundaryModeS";

	/** toField ROUTE name for SFString field named <i>boundaryModeS</i>. */
	public static final String toField_BOUNDARYMODES = "boundaryModeS";

	/** fromField ROUTE name for SFString field named <i>boundaryModeT</i>. */
	public static final String fromField_BOUNDARYMODET = "boundaryModeT";

	/** toField ROUTE name for SFString field named <i>boundaryModeT</i>. */
	public static final String toField_BOUNDARYMODET = "boundaryModeT";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFString field named <i>magnificationFilter</i>. */
	public static final String fromField_MAGNIFICATIONFILTER = "magnificationFilter";

	/** toField ROUTE name for SFString field named <i>magnificationFilter</i>. */
	public static final String toField_MAGNIFICATIONFILTER = "magnificationFilter";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFString field named <i>minificationFilter</i>. */
	public static final String fromField_MINIFICATIONFILTER = "minificationFilter";

	/** toField ROUTE name for SFString field named <i>minificationFilter</i>. */
	public static final String toField_MINIFICATIONFILTER = "minificationFilter";

	/** fromField ROUTE name for SFString field named <i>textureCompression</i>. */
	public static final String fromField_TEXTURECOMPRESSION = "textureCompression";

	/** toField ROUTE name for SFString field named <i>textureCompression</i>. */
	public static final String toField_TEXTURECOMPRESSION = "textureCompression";

	/** fromField ROUTE name for SFFloat field named <i>texturePriority</i>. */
	public static final String fromField_TEXTUREPRIORITY = "texturePriority";

	/** toField ROUTE name for SFFloat field named <i>texturePriority</i>. */
	public static final String toField_TEXTUREPRIORITY = "texturePriority";

	/** Constructor for TexturePropertiesObject to initialize member variables with default values. */
	public TexturePropertiesObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "textureProperties" }; // type xs:NMTOKEN

		anisotropicDegree = ANISOTROPICDEGREE_DEFAULT_VALUE;
		borderColor = BORDERCOLOR_DEFAULT_VALUE;
		borderWidth = BORDERWIDTH_DEFAULT_VALUE;
		boundaryModeR = BOUNDARYMODER_DEFAULT_VALUE;
		boundaryModeS = BOUNDARYMODES_DEFAULT_VALUE;
		boundaryModeT = BOUNDARYMODET_DEFAULT_VALUE;
		generateMipMaps = GENERATEMIPMAPS_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		magnificationFilter = MAGNIFICATIONFILTER_DEFAULT_VALUE;
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		minificationFilter = MINIFICATIONFILTER_DEFAULT_VALUE;
		textureCompression = TEXTURECOMPRESSION_DEFAULT_VALUE;
		texturePriority = TEXTUREPRIORITY_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide float value within allowed range of [1,infinity) from inputOutput SFFloat field named <i>anisotropicDegree</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,+infinity) anisotropicDegree defines minimum degree of anisotropy to account for in texture filtering (1=no effect for symmetric filtering, otherwise provide higher value). At least 2-to-1 anisotropy is often supported in low-level graphics rendering software and hardware, relative to horizontal and vertical directions.
 * <ul>
 *  <li> <i>Hint:</i> Anisotropy indicates directional dependence of properties. <a href="https://en.wikipedia.org/wiki/Anisotropy" target="_blank">https://en.wikipedia.org/wiki/Anisotropy</a> </li> 
 *  <li> <i>Hint:</i>  OpenGL EXT_texture_filter_anisotropic <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_filter_anisotropic.txt" target="_blank">https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_filter_anisotropic.txt</a> </li> 
 * </ul>
	 * @return value of anisotropicDegree field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public float getAnisotropicDegree()
	{
		return anisotropicDegree;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>anisotropicDegree</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,+infinity) anisotropicDegree defines minimum degree of anisotropy to account for in texture filtering (1=no effect for symmetric filtering, otherwise provide higher value). At least 2-to-1 anisotropy is often supported in low-level graphics rendering software and hardware, relative to horizontal and vertical directions.
 * <ul>
 *  <li> <i>Hint:</i> Anisotropy indicates directional dependence of properties. <a href="https://en.wikipedia.org/wiki/Anisotropy" target="_blank">https://en.wikipedia.org/wiki/Anisotropy</a> </li> 
 *  <li> <i>Hint:</i>  OpenGL EXT_texture_filter_anisotropic <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_filter_anisotropic.txt" target="_blank">https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_filter_anisotropic.txt</a> </li> 
 * </ul>
	 * @param newValue is new value for the anisotropicDegree field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setAnisotropicDegree(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties anisotropicDegree newValue=" + newValue + " has component value less than restriction minInclusive=1");
        }
		anisotropicDegree = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat anisotropicDegree field, similar to {@link #setAnisotropicDegree(float)}.
	 * @param newValue is new value for the anisotropicDegree field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setAnisotropicDegree(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAnisotropicDegree(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setAnisotropicDegree(float)}.
	 * @param newValue is new value for field
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setAnisotropicDegree(double newValue)
	{
		return setAnisotropicDegree((float) newValue);
	}
	/**
	 * Provide array of 4-tuple float results using RGBA values [0..1] using RGBA values [0..1] from inputOutput SFColorRGBA field named <i>borderColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] borderColor defines border pixel color.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of borderColor field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBorderColor()
	{
		return borderColor;
	}

	/**
	 * Accessor method to assign 4-tuple float array using RGBA values [0..1] to inputOutput SFColorRGBA field named <i>borderColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] borderColor defines border pixel color.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the borderColor field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setBorderColor(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 4) // 4-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties borderColor newValue=" + SFColorRGBAObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 4");
		}
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if ((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0) || (newValue[3] < 0)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties borderColor newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if ((newValue[0] > 1f) || (newValue[1] > 1f) || (newValue[2] > 1f) || (newValue[3] > 1f)) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties borderColor newValue=" + SFColorRGBAObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		borderColor = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFColorRGBA borderColor field, similar to {@link #setBorderColor(float[])}.
	 * @param newValue is new value for the borderColor field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBorderColor(SFColorRGBAObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBorderColor(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFColorRGBA borderColor field, similar to {@link #setBorderColor(float[])}.

	 * @param red first component
	 * @param green second component
	 * @param blue third component
	 * @param alpha fourth component for opaqueness (1 - transparency)

	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBorderColor(float red, float green, float blue, float alpha)
	{
		setBorderColor(new float[] {red, green, blue, alpha});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBorderColor(float[])}.
	 * @param red first component [0..1]
	 * @param green second component [0..1]
	 * @param blue third component [0..1]
	 * @param alpha fourth component [0..1]
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBorderColor(double red, double green, double blue, double alpha)
	{
		return setBorderColor((float) red, (float) green, (float) blue, (float) alpha);
	}
	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBorderColor(float[])}.
	 * @param newArray is new value for field                  
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBorderColor(double[] newArray)
	{
		return setBorderColor(new SFColorRGBAObject(newArray));
	}
	/**
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>borderWidth</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) borderWidth number of pixels for texture border.  * <br>

	 * @return value of borderWidth field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public int getBorderWidth()
	{
		return borderWidth;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>borderWidth</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) borderWidth number of pixels for texture border.  * <br>

	 * @param newValue is new value for the borderWidth field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setBorderWidth(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties borderWidth newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		borderWidth = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 borderWidth field, similar to {@link #setBorderWidth(int)}.
	 * @param newValue is new value for the borderWidth field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBorderWidth(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBorderWidth(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType textureBoundaryModeChoices) ["CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT"] from inputOutput SFString field named <i>boundaryModeR</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeR describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #BOUNDARYMODER_CLAMP CLAMP}, {@link #BOUNDARYMODER_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link #BOUNDARYMODER_CLAMP_TO_BOUNDARY CLAMP_TO_BOUNDARY}, {@link #BOUNDARYMODER_MIRRORED_REPEAT MIRRORED_REPEAT}, {@link #BOUNDARYMODER_REPEAT REPEAT}.
	 * @return value of boundaryModeR field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public String getBoundaryModeR()
	{
		return boundaryModeR;
	}

	/**
	 * Accessor method to assign String enumeration value ("CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT") to inputOutput SFString field named <i>boundaryModeR</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #BOUNDARYMODER_CLAMP CLAMP}, {@link #BOUNDARYMODER_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link #BOUNDARYMODER_CLAMP_TO_BOUNDARY CLAMP_TO_BOUNDARY}, {@link #BOUNDARYMODER_MIRRORED_REPEAT MIRRORED_REPEAT}, {@link #BOUNDARYMODER_REPEAT REPEAT}).
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeR describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the boundaryModeR field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setBoundaryModeR(String newValue)
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
			newValue.equals(BOUNDARYMODER_CLAMP) ||
			newValue.equals(BOUNDARYMODER_CLAMP_TO_EDGE) ||
			newValue.equals(BOUNDARYMODER_CLAMP_TO_BOUNDARY) ||
			newValue.equals(BOUNDARYMODER_MIRRORED_REPEAT) ||
			newValue.equals(BOUNDARYMODER_REPEAT)))
		{
			String warningMessage = "Warning: TextureProperties boundaryModeR newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		boundaryModeR = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString boundaryModeR field, similar to {@link #setBoundaryModeR(String)}.
	 * @param newValue is new value for the boundaryModeR field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBoundaryModeR(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBoundaryModeR(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType textureBoundaryModeChoices) ["CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT"] from inputOutput SFString field named <i>boundaryModeS</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeS describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #BOUNDARYMODES_CLAMP CLAMP}, {@link #BOUNDARYMODES_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link #BOUNDARYMODES_CLAMP_TO_BOUNDARY CLAMP_TO_BOUNDARY}, {@link #BOUNDARYMODES_MIRRORED_REPEAT MIRRORED_REPEAT}, {@link #BOUNDARYMODES_REPEAT REPEAT}.
	 * @return value of boundaryModeS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public String getBoundaryModeS()
	{
		return boundaryModeS;
	}

	/**
	 * Accessor method to assign String enumeration value ("CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT") to inputOutput SFString field named <i>boundaryModeS</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #BOUNDARYMODES_CLAMP CLAMP}, {@link #BOUNDARYMODES_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link #BOUNDARYMODES_CLAMP_TO_BOUNDARY CLAMP_TO_BOUNDARY}, {@link #BOUNDARYMODES_MIRRORED_REPEAT MIRRORED_REPEAT}, {@link #BOUNDARYMODES_REPEAT REPEAT}).
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeS describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the boundaryModeS field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setBoundaryModeS(String newValue)
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
			newValue.equals(BOUNDARYMODES_CLAMP) ||
			newValue.equals(BOUNDARYMODES_CLAMP_TO_EDGE) ||
			newValue.equals(BOUNDARYMODES_CLAMP_TO_BOUNDARY) ||
			newValue.equals(BOUNDARYMODES_MIRRORED_REPEAT) ||
			newValue.equals(BOUNDARYMODES_REPEAT)))
		{
			String warningMessage = "Warning: TextureProperties boundaryModeS newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		boundaryModeS = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString boundaryModeS field, similar to {@link #setBoundaryModeS(String)}.
	 * @param newValue is new value for the boundaryModeS field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBoundaryModeS(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBoundaryModeS(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType textureBoundaryModeChoices) ["CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT"] from inputOutput SFString field named <i>boundaryModeT</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeT describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #BOUNDARYMODET_CLAMP CLAMP}, {@link #BOUNDARYMODET_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link #BOUNDARYMODET_CLAMP_TO_BOUNDARY CLAMP_TO_BOUNDARY}, {@link #BOUNDARYMODET_MIRRORED_REPEAT MIRRORED_REPEAT}, {@link #BOUNDARYMODET_REPEAT REPEAT}.
	 * @return value of boundaryModeT field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public String getBoundaryModeT()
	{
		return boundaryModeT;
	}

	/**
	 * Accessor method to assign String enumeration value ("CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT") to inputOutput SFString field named <i>boundaryModeT</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #BOUNDARYMODET_CLAMP CLAMP}, {@link #BOUNDARYMODET_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link #BOUNDARYMODET_CLAMP_TO_BOUNDARY CLAMP_TO_BOUNDARY}, {@link #BOUNDARYMODET_MIRRORED_REPEAT MIRRORED_REPEAT}, {@link #BOUNDARYMODET_REPEAT REPEAT}).
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeT describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the boundaryModeT field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setBoundaryModeT(String newValue)
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
			newValue.equals(BOUNDARYMODET_CLAMP) ||
			newValue.equals(BOUNDARYMODET_CLAMP_TO_EDGE) ||
			newValue.equals(BOUNDARYMODET_CLAMP_TO_BOUNDARY) ||
			newValue.equals(BOUNDARYMODET_MIRRORED_REPEAT) ||
			newValue.equals(BOUNDARYMODET_REPEAT)))
		{
			String warningMessage = "Warning: TextureProperties boundaryModeT newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		boundaryModeT = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString boundaryModeT field, similar to {@link #setBoundaryModeT(String)}.
	 * @param newValue is new value for the boundaryModeT field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setBoundaryModeT(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBoundaryModeT(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>generateMipMaps</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Determines whether MIPMAPs are generated for texture images.
 * <ul>
 *  <li> <i>Warning:</i> must declare generateMipMaps='true' for minificationFilter modes with MIPMAP in their value. </li> 
 *  <li> <i>Hint:</i> mipmap preprocessing is a low-level rendering technique that can increase rendering speed and reduce aliasing artifacts. </li> 
 *  <li> <i>Hint:</i> Mipmap pyramids are pre-calculated, optimized sequences of images, each of which is a progressively lower resolution representation of the same image. The height and width of each image level in the mipmap is a power of two smaller than the previous level. </li> 
 *  <li> <i>Hint:</i> Aliasing <a href="https://en.wikipedia.org/wiki/Aliasing" target="_blank">https://en.wikipedia.org/wiki/Aliasing</a> and Clipping <a href="https://en.wikipedia.org/wiki/Clipping_(computer_graphics)" target="_blank">https://en.wikipedia.org/wiki/Clipping_(computer_graphics)</a> </li> 
 *  <li> <i>Hint:</i>  Mipmap <a href="https://en.wikipedia.org/wiki/Mipmap" target="_blank">https://en.wikipedia.org/wiki/Mipmap</a> </li> 
 * </ul>
	 * @return value of generateMipMaps field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getGenerateMipMaps()
	{
		return generateMipMaps;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>generateMipMaps</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Determines whether MIPMAPs are generated for texture images.
 * <ul>
 *  <li> <i>Warning:</i> must declare generateMipMaps='true' for minificationFilter modes with MIPMAP in their value. </li> 
 *  <li> <i>Hint:</i> mipmap preprocessing is a low-level rendering technique that can increase rendering speed and reduce aliasing artifacts. </li> 
 *  <li> <i>Hint:</i> Mipmap pyramids are pre-calculated, optimized sequences of images, each of which is a progressively lower resolution representation of the same image. The height and width of each image level in the mipmap is a power of two smaller than the previous level. </li> 
 *  <li> <i>Hint:</i> Aliasing <a href="https://en.wikipedia.org/wiki/Aliasing" target="_blank">https://en.wikipedia.org/wiki/Aliasing</a> and Clipping <a href="https://en.wikipedia.org/wiki/Clipping_(computer_graphics)" target="_blank">https://en.wikipedia.org/wiki/Clipping_(computer_graphics)</a> </li> 
 *  <li> <i>Hint:</i>  Mipmap <a href="https://en.wikipedia.org/wiki/Mipmap" target="_blank">https://en.wikipedia.org/wiki/Mipmap</a> </li> 
 * </ul>
	 * @param newValue is new value for the generateMipMaps field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setGenerateMipMaps(boolean newValue)
	{
		// set-newValue-validity-checks #0
		generateMipMaps = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool generateMipMaps field, similar to {@link #setGenerateMipMaps(boolean)}.
	 * @param newValue is new value for the generateMipMaps field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setGenerateMipMaps(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGenerateMipMaps(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setIS(ISObject newValue)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TexturePropertiesObject clearIS()
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
	 * Provide String enumeration value (baseType textureMagnificationModeChoices) ["AVG_PIXEL" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NICEST"] from inputOutput SFString field named <i>magnificationFilter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> magnificationFilter indicates texture filter when image is smaller than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.8 Texture magnification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #MAGNIFICATIONFILTER_AVG_PIXEL AVG_PIXEL}, {@link #MAGNIFICATIONFILTER_DEFAULT DEFAULT}, {@link #MAGNIFICATIONFILTER_FASTEST FASTEST}, {@link #MAGNIFICATIONFILTER_NEAREST_PIXEL NEAREST_PIXEL}, {@link #MAGNIFICATIONFILTER_NICEST NICEST}.
	 * @return value of magnificationFilter field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public String getMagnificationFilter()
	{
		return magnificationFilter;
	}

	/**
	 * Accessor method to assign String enumeration value ("AVG_PIXEL" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NICEST") to inputOutput SFString field named <i>magnificationFilter</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #MAGNIFICATIONFILTER_AVG_PIXEL AVG_PIXEL}, {@link #MAGNIFICATIONFILTER_DEFAULT DEFAULT}, {@link #MAGNIFICATIONFILTER_FASTEST FASTEST}, {@link #MAGNIFICATIONFILTER_NEAREST_PIXEL NEAREST_PIXEL}, {@link #MAGNIFICATIONFILTER_NICEST NICEST}).
	 * <br><br>
	 * <i>Tooltip:</i> magnificationFilter indicates texture filter when image is smaller than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.8 Texture magnification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the magnificationFilter field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setMagnificationFilter(String newValue)
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
			newValue.equals(MAGNIFICATIONFILTER_AVG_PIXEL) ||
			newValue.equals(MAGNIFICATIONFILTER_DEFAULT) ||
			newValue.equals(MAGNIFICATIONFILTER_FASTEST) ||
			newValue.equals(MAGNIFICATIONFILTER_NEAREST_PIXEL) ||
			newValue.equals(MAGNIFICATIONFILTER_NICEST)))
		{
			String warningMessage = "Warning: TextureProperties magnificationFilter newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		magnificationFilter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString magnificationFilter field, similar to {@link #setMagnificationFilter(String)}.
	 * @param newValue is new value for the magnificationFilter field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setMagnificationFilter(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMagnificationFilter(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public TexturePropertiesObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide String enumeration value (baseType textureMinificationModeChoices) ["AVG_PIXEL" | "AVG_PIXEL_AVG_MIPMAP" | "AVG_PIXEL_NEAREST_MIPMAP" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NEAREST_PIXEL_AVG_MIPMAP" | "NEAREST_PIXEL_NEAREST_MIPMAP" | "NICEST"] from inputOutput SFString field named <i>minificationFilter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minificationFilter indicates texture filter when image is larger than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.9 Texture minification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes</a> for details. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #MINIFICATIONFILTER_AVG_PIXEL AVG_PIXEL}, {@link #MINIFICATIONFILTER_AVG_PIXEL_AVG_MIPMAP AVG_PIXEL_AVG_MIPMAP}, {@link #MINIFICATIONFILTER_AVG_PIXEL_NEAREST_MIPMAP AVG_PIXEL_NEAREST_MIPMAP}, {@link #MINIFICATIONFILTER_DEFAULT DEFAULT}, {@link #MINIFICATIONFILTER_FASTEST FASTEST}, {@link #MINIFICATIONFILTER_NEAREST_PIXEL NEAREST_PIXEL}, {@link #MINIFICATIONFILTER_NEAREST_PIXEL_AVG_MIPMAP NEAREST_PIXEL_AVG_MIPMAP}, {@link #MINIFICATIONFILTER_NEAREST_PIXEL_NEAREST_MIPMAP NEAREST_PIXEL_NEAREST_MIPMAP}, {@link #MINIFICATIONFILTER_NICEST NICEST}.
	 * @return value of minificationFilter field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public String getMinificationFilter()
	{
		return minificationFilter;
	}

	/**
	 * Accessor method to assign String enumeration value ("AVG_PIXEL" | "AVG_PIXEL_AVG_MIPMAP" | "AVG_PIXEL_NEAREST_MIPMAP" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NEAREST_PIXEL_AVG_MIPMAP" | "NEAREST_PIXEL_NEAREST_MIPMAP" | "NICEST") to inputOutput SFString field named <i>minificationFilter</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #MINIFICATIONFILTER_AVG_PIXEL AVG_PIXEL}, {@link #MINIFICATIONFILTER_AVG_PIXEL_AVG_MIPMAP AVG_PIXEL_AVG_MIPMAP}, {@link #MINIFICATIONFILTER_AVG_PIXEL_NEAREST_MIPMAP AVG_PIXEL_NEAREST_MIPMAP}, {@link #MINIFICATIONFILTER_DEFAULT DEFAULT}, {@link #MINIFICATIONFILTER_FASTEST FASTEST}, {@link #MINIFICATIONFILTER_NEAREST_PIXEL NEAREST_PIXEL}, {@link #MINIFICATIONFILTER_NEAREST_PIXEL_AVG_MIPMAP NEAREST_PIXEL_AVG_MIPMAP}, {@link #MINIFICATIONFILTER_NEAREST_PIXEL_NEAREST_MIPMAP NEAREST_PIXEL_NEAREST_MIPMAP}, {@link #MINIFICATIONFILTER_NICEST NICEST}).
	 * <br><br>
	 * <i>Tooltip:</i> minificationFilter indicates texture filter when image is larger than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.9 Texture minification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the minificationFilter field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setMinificationFilter(String newValue)
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
			newValue.equals(MINIFICATIONFILTER_AVG_PIXEL) ||
			newValue.equals(MINIFICATIONFILTER_AVG_PIXEL_AVG_MIPMAP) ||
			newValue.equals(MINIFICATIONFILTER_AVG_PIXEL_NEAREST_MIPMAP) ||
			newValue.equals(MINIFICATIONFILTER_DEFAULT) ||
			newValue.equals(MINIFICATIONFILTER_FASTEST) ||
			newValue.equals(MINIFICATIONFILTER_NEAREST_PIXEL) ||
			newValue.equals(MINIFICATIONFILTER_NEAREST_PIXEL_AVG_MIPMAP) ||
			newValue.equals(MINIFICATIONFILTER_NEAREST_PIXEL_NEAREST_MIPMAP) ||
			newValue.equals(MINIFICATIONFILTER_NICEST)))
		{
			String warningMessage = "Warning: TextureProperties minificationFilter newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		minificationFilter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString minificationFilter field, similar to {@link #setMinificationFilter(String)}.
	 * @param newValue is new value for the minificationFilter field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setMinificationFilter(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMinificationFilter(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType textureCompressionModeChoices) ["DEFAULT" | "FASTEST" | "HIGH" | "LOW" | "MEDIUM" | "NICEST"] from inputOutput SFString field named <i>textureCompression</i>.
	 * <br><br>
	 * <i>Tooltip:</i> textureCompression indicates compression algorithm selection mode.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> X3D Architecture Table 18.10 Texture compression modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes</a> for details. </li> 
 *  <li> <i>Hint:</i>  Texture compression <a href="https://en.wikipedia.org/wiki/Texture_compression" target="_blank">https://en.wikipedia.org/wiki/Texture_compression</a> </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #TEXTURECOMPRESSION_DEFAULT DEFAULT}, {@link #TEXTURECOMPRESSION_FASTEST FASTEST}, {@link #TEXTURECOMPRESSION_HIGH HIGH}, {@link #TEXTURECOMPRESSION_LOW LOW}, {@link #TEXTURECOMPRESSION_MEDIUM MEDIUM}, {@link #TEXTURECOMPRESSION_NICEST NICEST}.
	 * @return value of textureCompression field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public String getTextureCompression()
	{
		return textureCompression;
	}

	/**
	 * Accessor method to assign String enumeration value ("DEFAULT" | "FASTEST" | "HIGH" | "LOW" | "MEDIUM" | "NICEST") to inputOutput SFString field named <i>textureCompression</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #TEXTURECOMPRESSION_DEFAULT DEFAULT}, {@link #TEXTURECOMPRESSION_FASTEST FASTEST}, {@link #TEXTURECOMPRESSION_HIGH HIGH}, {@link #TEXTURECOMPRESSION_LOW LOW}, {@link #TEXTURECOMPRESSION_MEDIUM MEDIUM}, {@link #TEXTURECOMPRESSION_NICEST NICEST}).
	 * <br><br>
	 * <i>Tooltip:</i> textureCompression indicates compression algorithm selection mode.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> X3D Architecture Table 18.10 Texture compression modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes</a> for details. </li> 
 *  <li> <i>Hint:</i>  Texture compression <a href="https://en.wikipedia.org/wiki/Texture_compression" target="_blank">https://en.wikipedia.org/wiki/Texture_compression</a> </li> 
 * </ul>
	 * @param newValue is new value for the textureCompression field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setTextureCompression(String newValue)
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
			newValue.equals(TEXTURECOMPRESSION_DEFAULT) ||
			newValue.equals(TEXTURECOMPRESSION_FASTEST) ||
			newValue.equals(TEXTURECOMPRESSION_HIGH) ||
			newValue.equals(TEXTURECOMPRESSION_LOW) ||
			newValue.equals(TEXTURECOMPRESSION_MEDIUM) ||
			newValue.equals(TEXTURECOMPRESSION_NICEST)))
		{
			String warningMessage = "Warning: TextureProperties textureCompression newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		textureCompression = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString textureCompression field, similar to {@link #setTextureCompression(String)}.
	 * @param newValue is new value for the textureCompression field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setTextureCompression(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTextureCompression(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>texturePriority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] texturePriority defines relative priority for this texture when allocating texture memory, an important rendering resource in graphics-card hardware. Default value 0 is lowest, 1 is highest.  * <br>

	 * @return value of texturePriority field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	@Override
	public float getTexturePriority()
	{
		return texturePriority;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>texturePriority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] texturePriority defines relative priority for this texture when allocating texture memory, an important rendering resource in graphics-card hardware. Default value 0 is lowest, 1 is highest.  * <br>

	 * @param newValue is new value for the texturePriority field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TexturePropertiesObject setTexturePriority(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties texturePriority newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
        if (newValue > 1f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties texturePriority newValue=" + SFFloatObject.toString(newValue) + " has component value greater than restriction maxInclusive=1");
            }
		texturePriority = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat texturePriority field, similar to {@link #setTexturePriority(float)}.
	 * @param newValue is new value for the texturePriority field.
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setTexturePriority(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTexturePriority(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setTexturePriority(float)}.
	 * @param newValue is new value for field
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setTexturePriority(double newValue)
	{
		return setTexturePriority((float) newValue);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TexturePropertiesObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to TextureProperties DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties DEF newValue='" + newValue + "'" + 
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TexturePropertiesObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to TextureProperties USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("TextureProperties USE newValue='" + newValue + "'" + 
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final TexturePropertiesObject setCssClass(String newValue)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setCssClass(SFStringObject newValue)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TexturePropertiesObject setUSE(TexturePropertiesObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on TexturePropertiesObject" +
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
	public TexturePropertiesObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public TexturePropertiesObject addComments (String newComment)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public TexturePropertiesObject addComments (String[] newComments)
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
	 * @return {@link TexturePropertiesObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public TexturePropertiesObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<TextureProperties"); // start opening tag
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

			if (((getAnisotropicDegree() != ANISOTROPICDEGREE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" anisotropicDegree='").append(SFFloatObject.toString(getAnisotropicDegree())).append("'");
			}
			if ((!Arrays.equals(getBorderColor(), BORDERCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" borderColor='").append(SFColorRGBAObject.toString(getBorderColor())).append("'");
			}
			if (((getBorderWidth() != BORDERWIDTH_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" borderWidth='").append(SFInt32Object.toString(getBorderWidth())).append("'");
			}
			if ((!getBoundaryModeR().equals(BOUNDARYMODER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" boundaryModeR='").append(new SFStringObject(getBoundaryModeR()).toStringX3D()).append("'");
			}
			if ((!getBoundaryModeS().equals(BOUNDARYMODES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" boundaryModeS='").append(new SFStringObject(getBoundaryModeS()).toStringX3D()).append("'");
			}
			if ((!getBoundaryModeT().equals(BOUNDARYMODET_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" boundaryModeT='").append(new SFStringObject(getBoundaryModeT()).toStringX3D()).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getGenerateMipMaps() != GENERATEMIPMAPS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" generateMipMaps='").append(SFBoolObject.toString(getGenerateMipMaps())).append("'");
			}
			if ((!getMagnificationFilter().equals(MAGNIFICATIONFILTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" magnificationFilter='").append(new SFStringObject(getMagnificationFilter()).toStringX3D()).append("'");
			}
			if ((!getMinificationFilter().equals(MINIFICATIONFILTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" minificationFilter='").append(new SFStringObject(getMinificationFilter()).toStringX3D()).append("'");
			}
			if ((!getTextureCompression().equals(TEXTURECOMPRESSION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" textureCompression='").append(new SFStringObject(getTextureCompression()).toStringX3D()).append("'");
			}
			if (((getTexturePriority() != TEXTUREPRIORITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" texturePriority='").append(SFFloatObject.toString(getTexturePriority())).append("'");
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
			stringX3D.append(indent).append("</TextureProperties>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=TextureProperties, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("TextureProperties").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("anisotropicDegree"))
						{
							stringClassicVRML.append(indentCharacter).append("anisotropicDegree").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getAnisotropicDegree() != ANISOTROPICDEGREE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("anisotropicDegree ").append(SFFloatObject.toString(getAnisotropicDegree())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("borderColor"))
						{
							stringClassicVRML.append(indentCharacter).append("borderColor").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBorderColor(), BORDERCOLOR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("borderColor ").append(SFColorRGBAObject.toString(getBorderColor())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("borderWidth"))
						{
							stringClassicVRML.append(indentCharacter).append("borderWidth").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getBorderWidth() != BORDERWIDTH_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("borderWidth ").append(SFInt32Object.toString(getBorderWidth())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("boundaryModeR"))
						{
							stringClassicVRML.append(indentCharacter).append("boundaryModeR").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getBoundaryModeR().equals(BOUNDARYMODER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("boundaryModeR ").append("\"").append(SFStringObject.toString(getBoundaryModeR())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("boundaryModeS"))
						{
							stringClassicVRML.append(indentCharacter).append("boundaryModeS").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getBoundaryModeS().equals(BOUNDARYMODES_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("boundaryModeS ").append("\"").append(SFStringObject.toString(getBoundaryModeS())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("boundaryModeT"))
						{
							stringClassicVRML.append(indentCharacter).append("boundaryModeT").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getBoundaryModeT().equals(BOUNDARYMODET_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("boundaryModeT ").append("\"").append(SFStringObject.toString(getBoundaryModeT())).append("\"").append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("generateMipMaps"))
						{
							stringClassicVRML.append(indentCharacter).append("generateMipMaps").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getGenerateMipMaps() != GENERATEMIPMAPS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("generateMipMaps ").append(SFBoolObject.toString(getGenerateMipMaps())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("magnificationFilter"))
						{
							stringClassicVRML.append(indentCharacter).append("magnificationFilter").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getMagnificationFilter().equals(MAGNIFICATIONFILTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("magnificationFilter ").append("\"").append(SFStringObject.toString(getMagnificationFilter())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("minificationFilter"))
						{
							stringClassicVRML.append(indentCharacter).append("minificationFilter").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getMinificationFilter().equals(MINIFICATIONFILTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("minificationFilter ").append("\"").append(SFStringObject.toString(getMinificationFilter())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("textureCompression"))
						{
							stringClassicVRML.append(indentCharacter).append("textureCompression").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getTextureCompression().equals(TEXTURECOMPRESSION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("textureCompression ").append("\"").append(SFStringObject.toString(getTextureCompression())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("texturePriority"))
						{
							stringClassicVRML.append(indentCharacter).append("texturePriority").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTexturePriority() != TEXTUREPRIORITY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("texturePriority ").append(SFFloatObject.toString(getTexturePriority())).append("\n").append(indent).append(indentCharacter);
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

		setAnisotropicDegree(getAnisotropicDegree()); // exercise field checks, simple types
        
		setBorderColor(getBorderColor()); // exercise field checks, simple types
        
		setBorderWidth(getBorderWidth()); // exercise field checks, simple types
        
		setBoundaryModeR(getBoundaryModeR()); // exercise field checks, simple types
        
		setBoundaryModeS(getBoundaryModeS()); // exercise field checks, simple types
        
		setBoundaryModeT(getBoundaryModeT()); // exercise field checks, simple types
        
		setGenerateMipMaps(getGenerateMipMaps()); // exercise field checks, simple types
        
		setMagnificationFilter(getMagnificationFilter()); // exercise field checks, simple types
        
		setMinificationFilter(getMinificationFilter()); // exercise field checks, simple types
        
		setTextureCompression(getTextureCompression()); // exercise field checks, simple types
        
		setTexturePriority(getTexturePriority()); // exercise field checks, simple types
        
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
			String errorNotice = "TextureProperties USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureProperties USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "TextureProperties USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "TextureProperties USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'TextureProperties' node, add head statement <component name='Texturing' level='2'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Texturing\").setLevel(2);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
