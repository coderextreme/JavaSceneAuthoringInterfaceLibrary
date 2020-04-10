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
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Texturing.*;

/**
 * PixelTexture creates a 2D-image texture map using a numeric array of pixel values.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DTexture2DNode] PixelTexture creates a 2D-image texture map using a numeric array of pixel values. Texture maps have a 2D coordinate system (s, t) horizontal and vertical, with (s, t) texture-coordinate values in range [0.0, 1.0] for opposite corners of the image.
 * <ul>
 *  <li> <i>Hint:</i> this is a good way to bundle image(s) into a single scene file, avoiding multiple downloads. </li> 
 *  <li> <i>Hint:</i> X3D-Edit includes PixelTexture image-conversion import capabilities. <a href="https://savage.nps.edu/X3D-Edit/images/PixelTextureImportImage.png" target="_blank">https://savage.nps.edu/X3D-Edit/images/PixelTextureImportImage.png</a> </li> 
 *  <li> <i>Warning:</i> aggregate file size can grow dramatically. </li> 
 *  <li> <i>Hint:</i> can contain a single TextureProperties node. </li> 
 *  <li> <i>Hint:</i> insert Shape and Appearance nodes before adding texture. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images and Videos <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Warning:</i> see ComposedCubeMapTexture and TextureBackground for special containerField values. </li> 
 *  <li> <i>Hint:</i> if a texture is opaque, omitting values in the alpha channel can help avoid rendering artifacts related to transparency. </li> 
 *  <li> <i>Hint:</i> Texture mapping <a href="https://en.wikipedia.org/wiki/Texture_mapping" target="_blank">https://en.wikipedia.org/wiki/Texture_mapping</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 17.2.2 Lighting model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#PixelTexture" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#PixelTexture" target="blank">X3D Abstract Specification: PixelTexture</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PixelTexture" target="_blank">X3D Tooltips: PixelTexture</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface PixelTexture extends X3DTexture2DNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of int results from inputOutput SFImage field named <i>image</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Defines image: width, height, number_of_components per each pixel value, and list of pixel_values. Note that width and height are pixel count, and allowed values for RGBA number_of_components in each pixel value are 1 (intensity), 2 (intensity alpha), 3 (red green blue), 4 (red green blue alpha-opacity).
 * <ul>
 *  <li> <i>Warning:</i> the order of initial values in PixelTexture and PixelTexture3D image arrays are different. Example: intensity [1 2 1 0xFF 0x00] Example: intensity-alpha [2 2 1 0 255 255 0] Example: red-green-blue [2 4 3 0xFF0000 0xFF00 0 0 0 0 0xFFFFFF 0xFFFF00] Example: red-green-blue-alpha [2 2 4 0xFFFFFFAA 0xFFFF00AA 0x11111111AA 0x787800AA] </li> 
 *  <li> <i>Hint:</i> it is easier to understand hexadecimal values for each pixel, but integer values are also allowed. </li> 
 *  <li> <i>Hint:</i> the array of pixel values has length = (width*height). </li> 
 *  <li> <i>Hint:</i>  the full list of integers in this field has length = (width*height + 3). </li> 
 * </ul>
	 * @return value of image field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture2DNode, $additionalInheritanceBaseType=)
	public int[] getImage();

	/**
	 * Accessor method to assign int array to inputOutput SFImage field named <i>image</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Defines image: width, height, number_of_components per each pixel value, and list of pixel_values. Note that width and height are pixel count, and allowed values for RGBA number_of_components in each pixel value are 1 (intensity), 2 (intensity alpha), 3 (red green blue), 4 (red green blue alpha-opacity).
 * <ul>
 *  <li> <i>Warning:</i> the order of initial values in PixelTexture and PixelTexture3D image arrays are different. Example: intensity [1 2 1 0xFF 0x00] Example: intensity-alpha [2 2 1 0 255 255 0] Example: red-green-blue [2 4 3 0xFF0000 0xFF00 0 0 0 0 0xFFFFFF 0xFFFF00] Example: red-green-blue-alpha [2 2 4 0xFFFFFFAA 0xFFFF00AA 0x11111111AA 0x787800AA] </li> 
 *  <li> <i>Hint:</i> it is easier to understand hexadecimal values for each pixel, but integer values are also allowed. </li> 
 *  <li> <i>Hint:</i> the array of pixel values has length = (width*height). </li> 
 *  <li> <i>Hint:</i>  the full list of integers in this field has length = (width*height + 3). </li> 
 * </ul>
	 * @param newValue is new value for the image field.
	 * @return {@link PixelTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PixelTexture setImage(int[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture2DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PixelTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PixelTexture setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatS</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to horizontally repeat texture along S axis.  * <br>

	 * @return value of repeatS field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture2DNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getRepeatS();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatS</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to horizontally repeat texture along S axis.  * <br>

	 * @param newValue is new value for the repeatS field.
	 * @return {@link PixelTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PixelTexture setRepeatS(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatT</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along T axis.  * <br>

	 * @return value of repeatT field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture2DNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getRepeatT();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatT</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along T axis.  * <br>

	 * @param newValue is new value for the repeatT field.
	 * @return {@link PixelTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PixelTexture setRepeatT(boolean newValue);

	/**
	 * Provide TextureProperties instance (using a properly typed node) from initializeOnly SFNode field <i>textureProperties</i>.
	 * @return value of textureProperties field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture2DNode, $additionalInheritanceBaseType=)
	@Override
	public TextureProperties getTextureProperties(); // acceptable node types #1: TextureProperties

	/**
	 * Accessor method to assign TextureProperties instance (using a properly typed node) to initializeOnly SFNode field <i>textureProperties</i>.
	 * @param newValue is new value for the textureProperties field.
	 * @return {@link PixelTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PixelTexture setTextureProperties(TextureProperties newValue); // acceptable node types #2: TextureProperties

}
