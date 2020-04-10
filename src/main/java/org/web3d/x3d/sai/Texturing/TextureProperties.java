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

package org.web3d.x3d.sai.Texturing;

import org.web3d.x3d.sai.Core.X3DNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

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
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#TextureProperties" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#TextureProperties" target="blank">X3D Abstract Specification: TextureProperties</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TextureProperties" target="_blank">X3D Tooltips: TextureProperties</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface TextureProperties extends X3DNode
{
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getAnisotropicDegree();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>anisotropicDegree</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,+infinity) anisotropicDegree defines minimum degree of anisotropy to account for in texture filtering (1=no effect for symmetric filtering, otherwise provide higher value). At least 2-to-1 anisotropy is often supported in low-level graphics rendering software and hardware, relative to horizontal and vertical directions.
 * <ul>
 *  <li> <i>Hint:</i> Anisotropy indicates directional dependence of properties. <a href="https://en.wikipedia.org/wiki/Anisotropy" target="_blank">https://en.wikipedia.org/wiki/Anisotropy</a> </li> 
 *  <li> <i>Hint:</i>  OpenGL EXT_texture_filter_anisotropic <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_filter_anisotropic.txt" target="_blank">https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_filter_anisotropic.txt</a> </li> 
 * </ul>
	 * @param newValue is new value for the anisotropicDegree field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setAnisotropicDegree(float newValue);

	/**
	 * Provide array of 4-tuple float results using RGBA values [0..1] using RGBA values [0..1] from inputOutput SFColorRGBA field named <i>borderColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] borderColor defines border pixel color.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of borderColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getBorderColor();

	/**
	 * Accessor method to assign 4-tuple float array using RGBA values [0..1] to inputOutput SFColorRGBA field named <i>borderColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] borderColor defines border pixel color.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the borderColor field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setBorderColor(float[] newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>borderWidth</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) borderWidth number of pixels for texture border.  * <br>

	 * @return value of borderWidth field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public int getBorderWidth();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>borderWidth</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) borderWidth number of pixels for texture border.  * <br>

	 * @param newValue is new value for the borderWidth field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setBorderWidth(int newValue);

	/**
	 * Provide String enumeration value (baseType textureBoundaryModeChoices) ["CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT"] from inputOutput SFString field named <i>boundaryModeR</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeR describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @return value of boundaryModeR field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public String getBoundaryModeR();

	/**
	 * Accessor method to assign String enumeration value ("CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT") to inputOutput SFString field named <i>boundaryModeR</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeR describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the boundaryModeR field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setBoundaryModeR(String newValue);

	/**
	 * Provide String enumeration value (baseType textureBoundaryModeChoices) ["CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT"] from inputOutput SFString field named <i>boundaryModeS</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeS describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @return value of boundaryModeS field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public String getBoundaryModeS();

	/**
	 * Accessor method to assign String enumeration value ("CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT") to inputOutput SFString field named <i>boundaryModeS</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeS describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the boundaryModeS field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setBoundaryModeS(String newValue);

	/**
	 * Provide String enumeration value (baseType textureBoundaryModeChoices) ["CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT"] from inputOutput SFString field named <i>boundaryModeT</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeT describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @return value of boundaryModeT field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public String getBoundaryModeT();

	/**
	 * Accessor method to assign String enumeration value ("CLAMP" | "CLAMP_TO_EDGE" | "CLAMP_TO_BOUNDARY" | "MIRRORED_REPEAT" | "REPEAT") to inputOutput SFString field named <i>boundaryModeT</i>.
	 * <br><br>
	 * <i>Tooltip:</i> boundaryModeT describes handling of texture-coordinate boundaries.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.7 Texture boundary modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureBoundaryModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the boundaryModeT field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setBoundaryModeT(String newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getGenerateMipMaps();

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
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setGenerateMipMaps(boolean newValue);

	/**
	 * Provide String enumeration value (baseType textureMagnificationModeChoices) ["AVG_PIXEL" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NICEST"] from inputOutput SFString field named <i>magnificationFilter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> magnificationFilter indicates texture filter when image is smaller than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.8 Texture magnification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes</a> for details. </li> 
 * </ul>
	 * @return value of magnificationFilter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public String getMagnificationFilter();

	/**
	 * Accessor method to assign String enumeration value ("AVG_PIXEL" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NICEST") to inputOutput SFString field named <i>magnificationFilter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> magnificationFilter indicates texture filter when image is smaller than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.8 Texture magnification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMagnificationModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the magnificationFilter field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setMagnificationFilter(String newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureProperties setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String enumeration value (baseType textureMinificationModeChoices) ["AVG_PIXEL" | "AVG_PIXEL_AVG_MIPMAP" | "AVG_PIXEL_NEAREST_MIPMAP" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NEAREST_PIXEL_AVG_MIPMAP" | "NEAREST_PIXEL_NEAREST_MIPMAP" | "NICEST"] from inputOutput SFString field named <i>minificationFilter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minificationFilter indicates texture filter when image is larger than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.9 Texture minification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes</a> for details. </li> 
 * </ul>
	 * @return value of minificationFilter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public String getMinificationFilter();

	/**
	 * Accessor method to assign String enumeration value ("AVG_PIXEL" | "AVG_PIXEL_AVG_MIPMAP" | "AVG_PIXEL_NEAREST_MIPMAP" | "DEFAULT" | "FASTEST" | "NEAREST_PIXEL" | "NEAREST_PIXEL_AVG_MIPMAP" | "NEAREST_PIXEL_NEAREST_MIPMAP" | "NICEST") to inputOutput SFString field named <i>minificationFilter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minificationFilter indicates texture filter when image is larger than screen space representation.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.9 Texture minification modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureMinificationModes</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the minificationFilter field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setMinificationFilter(String newValue);

	/**
	 * Provide String enumeration value (baseType textureCompressionModeChoices) ["DEFAULT" | "FASTEST" | "HIGH" | "LOW" | "MEDIUM" | "NICEST"] from inputOutput SFString field named <i>textureCompression</i>.
	 * <br><br>
	 * <i>Tooltip:</i> textureCompression indicates compression algorithm selection mode.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> X3D Architecture Table 18.10 Texture compression modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes</a> for details. </li> 
 *  <li> <i>Hint:</i>  Texture compression <a href="https://en.wikipedia.org/wiki/Texture_compression" target="_blank">https://en.wikipedia.org/wiki/Texture_compression</a> </li> 
 * </ul>
	 * @return value of textureCompression field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public String getTextureCompression();

	/**
	 * Accessor method to assign String enumeration value ("DEFAULT" | "FASTEST" | "HIGH" | "LOW" | "MEDIUM" | "NICEST") to inputOutput SFString field named <i>textureCompression</i>.
	 * <br><br>
	 * <i>Tooltip:</i> textureCompression indicates compression algorithm selection mode.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> X3D Architecture Table 18.10 Texture compression modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-TextureCompressionModes</a> for details. </li> 
 *  <li> <i>Hint:</i>  Texture compression <a href="https://en.wikipedia.org/wiki/Texture_compression" target="_blank">https://en.wikipedia.org/wiki/Texture_compression</a> </li> 
 * </ul>
	 * @param newValue is new value for the textureCompression field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setTextureCompression(String newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>texturePriority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] texturePriority defines relative priority for this texture when allocating texture memory, an important rendering resource in graphics-card hardware. Default value 0 is lowest, 1 is highest.  * <br>

	 * @return value of texturePriority field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getTexturePriority();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>texturePriority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] texturePriority defines relative priority for this texture when allocating texture memory, an important rendering resource in graphics-card hardware. Default value 0 is lowest, 1 is highest.  * <br>

	 * @param newValue is new value for the texturePriority field.
	 * @return {@link TextureProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureProperties setTexturePriority(float newValue);

}
