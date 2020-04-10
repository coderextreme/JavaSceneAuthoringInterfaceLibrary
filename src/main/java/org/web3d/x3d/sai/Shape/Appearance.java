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

package org.web3d.x3d.sai.Shape;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Shaders.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.sai.Texturing.*;
import java.util.Arrays;

/**
 * Appearance specifies the visual properties of geometry by containing the Material, ImageTexture/MovieTexture/PixelTexture, FillProperties, LineProperties, programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) and TextureTransform nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DAppearanceNode] Appearance specifies the visual properties of geometry by containing the Material, ImageTexture/MovieTexture/PixelTexture, FillProperties, LineProperties, programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) and TextureTransform nodes.
 * <ul>
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. Interchange profile hint: only Material and ImageTexture children are allowed. </li> 
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes in a scene. </li> 
 *  <li> <i>Hint:</i> Advanced uses can contain MultiTexture, MultiTextureTransform/TextureTransformMatrix3D/TextureTransform3D, ComposedShader/PackagedShader/ProgramShader, ComposedTexture3D/ImageTexture3D/PixelTexture3D, or ComposedCubeMapTexture/GeneratedCubeMapTexture/ImageCubeMapTexture. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 12.2.2 Appearance node <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Appearancenode" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Appearancenode</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 17.2.2 Lighting model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Appearance" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Appearance" target="blank">X3D Abstract Specification: Appearance</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Appearance" target="_blank">X3D Tooltips: Appearance</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Appearance extends X3DAppearanceNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide FillProperties instance (using a properly typed node) from inputOutput SFNode field <i>fillProperties</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [FillProperties] Single contained FillProperties node that specifies additional visual attributes applied to polygonal areas of corresponding geometry, on top of whatever other appearance is already defined.  * <br>

	 * @return value of fillProperties field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public FillProperties getFillProperties(); // acceptable node types #1: FillProperties

	/**
	 * Accessor method to assign FillProperties instance (using a properly typed node) to inputOutput SFNode field <i>fillProperties</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [FillProperties] Single contained FillProperties node that specifies additional visual attributes applied to polygonal areas of corresponding geometry, on top of whatever other appearance is already defined.  * <br>

	 * @param newValue is new value for the fillProperties field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setFillProperties(FillProperties newValue); // acceptable node types #2: FillProperties

	/**
	 * Provide LineProperties instance (using a properly typed node) from inputOutput SFNode field <i>lineProperties</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [LineProperties] Single contained LineProperties node that specifies additional visual attributes applied to corresponding line geometry.  * <br>

	 * @return value of lineProperties field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public LineProperties getLineProperties(); // acceptable node types #1: LineProperties

	/**
	 * Accessor method to assign LineProperties instance (using a properly typed node) to inputOutput SFNode field <i>lineProperties</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [LineProperties] Single contained LineProperties node that specifies additional visual attributes applied to corresponding line geometry.  * <br>

	 * @param newValue is new value for the lineProperties field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setLineProperties(LineProperties newValue); // acceptable node types #2: LineProperties

	/**
	 * Provide X3DMaterialNode instance (using a properly typed node) from inputOutput SFNode field <i>material</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMaterialNode] Single contained Material node that specifies visual attributes for lighting response (color types, transparency, etc.) applied to corresponding geometry.
 * <ul>
 *  <li> <i> Warning:</i>  if material is NULL or unspecified, lighting is off (all lights ignored) for this Shape and unlit object color is (1, 1, 1). </li> 
 * </ul>
	 * @return value of material field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public X3DMaterialNode getMaterial(); // acceptable node types #1: X3DMaterialNode

	/**
	 * Accessor method to assign X3DMaterialNode instance (using a properly typed node) to inputOutput SFNode field <i>material</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMaterialNode] Single contained Material node that specifies visual attributes for lighting response (color types, transparency, etc.) applied to corresponding geometry.
 * <ul>
 *  <li> <i> Warning:</i>  if material is NULL or unspecified, lighting is off (all lights ignored) for this Shape and unlit object color is (1, 1, 1). </li> 
 * </ul>
	 * @param newValue is new value for the material field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setMaterial(X3DMaterialNode newValue); // acceptable node types #2: X3DMaterialNode

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
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
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Appearance setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide PointProperties instance (using a properly typed node) from inputOutput SFNode field <i>pointProperties</i>.
	 * @return value of pointProperties field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public PointProperties getPointProperties(); // acceptable node types #1: PointProperties

	/**
	 * Accessor method to assign PointProperties instance (using a properly typed node) to inputOutput SFNode field <i>pointProperties</i>.
	 * @param newValue is new value for the pointProperties field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setPointProperties(PointProperties newValue); // acceptable node types #2: PointProperties

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>shaders</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DShaderNode] Zero or more contained programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) that specify, in order of preference, author-programmed rendering characteristics.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 31 Programmable shaders component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode.
	 * @see org.web3d.x3d.sai.Shaders.X3DShaderNode
	 * @return value of shaders field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public X3DNode[] getShaders(); // acceptable node types #1: X3DShaderNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>shaders</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DShaderNode] Zero or more contained programmable shader nodes (ComposedShader, PackagedShader, ProgramShader) that specify, in order of preference, author-programmed rendering characteristics.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 31 Programmable shaders component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode.
	 * @param newValue is new value for the shaders field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setShaders(X3DNode[] newValue); // acceptable node types #2: X3DShaderNode

	/**
	 * Add array of child shaders nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DShaderNode.
	 * @param newValue is new value array to be appended the shaders field.
	 */
	public void addShaders(X3DNode[] newValue); // acceptable node types #3: X3DShaderNode
	/**
	 * Set single child shaders node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the shaders field
	 */
	public void setShaders(X3DNode newValue); // acceptable node types #5: X3DShaderNode
	/**
	 * Provide X3DTextureNode instance (using a properly typed node) from inputOutput SFNode field <i>texture</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureNode] Single contained texture node (ImageTexture, MovieTexture, PixelTexture, MultiTexture) that maps image(s) to surface geometry.
 * <ul>
 *  <li> <i>Hint:</i> if texture node is NULL or unspecified, corresponding Shape geometry for this Appearance is not textured. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 18 Texturing component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33 Texturing3D component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a> </li> 
 * </ul>
	 * @return value of texture field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public X3DTextureNode getTexture(); // acceptable node types #1: X3DTextureNode

	/**
	 * Accessor method to assign X3DTextureNode instance (using a properly typed node) to inputOutput SFNode field <i>texture</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureNode] Single contained texture node (ImageTexture, MovieTexture, PixelTexture, MultiTexture) that maps image(s) to surface geometry.
 * <ul>
 *  <li> <i>Hint:</i> if texture node is NULL or unspecified, corresponding Shape geometry for this Appearance is not textured. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 18 Texturing component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33 Texturing3D component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a> </li> 
 * </ul>
	 * @param newValue is new value for the texture field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setTexture(X3DTextureNode newValue); // acceptable node types #2: X3DTextureNode

	/**
	 * Provide X3DTextureTransformNode instance (using a properly typed node) from inputOutput SFNode field <i>textureTransform</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureTransformNode] Single contained TextureTransform node that defines 2D transformation applied to texture coordinates.
 * <ul>
 *  <li> <i> Hint:</i>  if textureTransform array is empty, then this field has no effect. </li> 
 * </ul>
	 * @return value of textureTransform field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceNode, $additionalInheritanceBaseType=)
	public X3DTextureTransformNode getTextureTransform(); // acceptable node types #1: X3DTextureTransformNode

	/**
	 * Accessor method to assign X3DTextureTransformNode instance (using a properly typed node) to inputOutput SFNode field <i>textureTransform</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureTransformNode] Single contained TextureTransform node that defines 2D transformation applied to texture coordinates.
 * <ul>
 *  <li> <i> Hint:</i>  if textureTransform array is empty, then this field has no effect. </li> 
 * </ul>
	 * @param newValue is new value for the textureTransform field.
	 * @return {@link Appearance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Appearance setTextureTransform(X3DTextureTransformNode newValue); // acceptable node types #2: X3DTextureTransformNode

}
