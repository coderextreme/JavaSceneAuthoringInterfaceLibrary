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

package org.web3d.x3d.sai.VolumeRendering;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Texturing3D.*;

/**
 * CartoonVolumeStyle generates cartoon-style non-photorealistic rendering of associated volumetric data.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.3 or later) [X3DComposableVolumeRenderStyleNode] CartoonVolumeStyle generates cartoon-style non-photorealistic rendering of associated volumetric data.
 * <ul>
 *  <li> <i> Hint:</i>  contains single Texture3D node with containerField='surfaceNormals' </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#CartoonVolumeStyle" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/volume.html#CartoonVolumeStyle" target="blank">X3D Abstract Specification: CartoonVolumeStyle</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#CartoonVolumeStyle" target="_blank">X3D Tooltips: CartoonVolumeStyle</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Volume" target="_blank">X3D Scene Authoring Hints: Volume</a>
    */
public interface CartoonVolumeStyle extends X3DComposableVolumeRenderStyleNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide int value using RGB values [0..1] from inputOutput SFInt32 field named <i>colorSteps</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,64] Number of distinct colors taken from interpolated colors and used to render the object.
 * <ul>
 *  <li> <i>Hint:</i> colorSteps=1 means no color interpolation takes place, only use orthogonalColor. </li> 
 *  <li> <i>Hint:</i>  parallelColor and orthogonalColor interpolation is in HSV color space for RGB components, linearly for alpha component. </li> 
 * </ul>
	 * @return value of colorSteps field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposableVolumeRenderStyleNode, $additionalInheritanceBaseType=)
	public int getColorSteps();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>colorSteps</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,64] Number of distinct colors taken from interpolated colors and used to render the object.
 * <ul>
 *  <li> <i>Hint:</i> colorSteps=1 means no color interpolation takes place, only use orthogonalColor. </li> 
 *  <li> <i>Hint:</i>  parallelColor and orthogonalColor interpolation is in HSV color space for RGB components, linearly for alpha component. </li> 
 * </ul>
	 * @param newValue is new value for the colorSteps field.
	 * @return {@link CartoonVolumeStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CartoonVolumeStyle setColorSteps(int newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposableVolumeRenderStyleNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link CartoonVolumeStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CartoonVolumeStyle setEnabled(boolean newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposableVolumeRenderStyleNode, $additionalInheritanceBaseType=)
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
	 * @return {@link CartoonVolumeStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CartoonVolumeStyle setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 4-tuple float results using RGBA values [0..1] using RGBA values [0..1] from inputOutput SFColorRGBA field named <i>orthogonalColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] orthogonalColor is used for surface normals that are orthogonal (perpendicular) to viewer's current location.
 * <ul>
 *  <li> <i>Hint:</i> plane of surface itself is orthogonal to user's view direction. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of orthogonalColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposableVolumeRenderStyleNode, $additionalInheritanceBaseType=)
	public float[] getOrthogonalColor();

	/**
	 * Accessor method to assign 4-tuple float array using RGBA values [0..1] to inputOutput SFColorRGBA field named <i>orthogonalColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] orthogonalColor is used for surface normals that are orthogonal (perpendicular) to viewer's current location.
 * <ul>
 *  <li> <i>Hint:</i> plane of surface itself is orthogonal to user's view direction. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the orthogonalColor field.
	 * @return {@link CartoonVolumeStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CartoonVolumeStyle setOrthogonalColor(float[] newValue);

	/**
	 * Provide array of 4-tuple float results using RGBA values [0..1] using RGBA values [0..1] from inputOutput SFColorRGBA field named <i>parallelColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] parallelColor is used for surface normals that are orthogonal to viewer's current location.
 * <ul>
 *  <li> <i>Hint:</i> plane of surface itself is parallel to user's view direction. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of parallelColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposableVolumeRenderStyleNode, $additionalInheritanceBaseType=)
	public float[] getParallelColor();

	/**
	 * Accessor method to assign 4-tuple float array using RGBA values [0..1] to inputOutput SFColorRGBA field named <i>parallelColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] parallelColor is used for surface normals that are orthogonal to viewer's current location.
 * <ul>
 *  <li> <i>Hint:</i> plane of surface itself is parallel to user's view direction. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the parallelColor field.
	 * @return {@link CartoonVolumeStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CartoonVolumeStyle setParallelColor(float[] newValue);

	/**
	 * Provide X3DTexture3DNode instance (using a properly typed node) from inputOutput SFNode field <i>surfaceNormals</i>.
	 * @return value of surfaceNormals field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposableVolumeRenderStyleNode, $additionalInheritanceBaseType=)
	public X3DTexture3DNode getSurfaceNormals(); // acceptable node types #1: X3DTexture3DNode

	/**
	 * Accessor method to assign X3DTexture3DNode instance (using a properly typed node) to inputOutput SFNode field <i>surfaceNormals</i>.
	 * @param newValue is new value for the surfaceNormals field.
	 * @return {@link CartoonVolumeStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CartoonVolumeStyle setSurfaceNormals(X3DTexture3DNode newValue); // acceptable node types #2: X3DTexture3DNode

}
