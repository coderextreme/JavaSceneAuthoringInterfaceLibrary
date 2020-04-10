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
import java.util.Arrays;

/**
 * MultiTextureCoordinate contains multiple TextureCoordinate or TextureCoordinateGenerator nodes, for use by a parent polygonal geometry node such as IndexedFaceSet or a Triangle* node.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DTextureCoordinateNode] MultiTextureCoordinate contains multiple TextureCoordinate or TextureCoordinateGenerator nodes, for use by a parent polygonal geometry node such as IndexedFaceSet or a Triangle* node. Each of the contained texture coordinate nodes correspond to the multiple texture nodes contained in a sibling Appearance/MultiTexture node.
 * <ul>
 *  <li> <i>Hint:</i> add Shape and then polgyonal/planar geometry before adding MultiTextureCoordinate. </li> 
 *  <li> <i>Hint:</i> Texture mapping <a href="https://en.wikipedia.org/wiki/Texture_mapping" target="_blank">https://en.wikipedia.org/wiki/Texture_mapping</a> </li> 
 *  <li> <i>Warning:</i> the number of textures to be blended may have a significant impact on performance, depending on available graphics hardware capabilities. </li> 
 *  <li> <i>Hint:</i> multitexturing is accomplished using MultiTexture, MultiTextureCoordinate and MultiTextureTransform nodes. </li> 
 *  <li> <i>Hint:</i> X3D Texturing component Figure 18.2 Lightmap example, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#f-Lightmapexample" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#f-Lightmapexample</a> </li> 
 *  <li> <i>Hint:</i> X3D Texturing component Table 18.2: Comparison of single texture and multitexture attributes, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-SingleAndMultitextureAttrs" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-SingleAndMultitextureAttrs</a> </li> 
 *  <li> <i>Warning:</i>  MultiTextureCoordinate may not contain another MultiTextureCoordinate node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#MultiTextureCoordinate" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#MultiTextureCoordinate" target="blank">X3D Abstract Specification: MultiTextureCoordinate</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#MultiTextureCoordinate" target="_blank">X3D Tooltips: MultiTextureCoordinate</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface MultiTextureCoordinate extends X3DTextureCoordinateNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureCoordinateNode, $additionalInheritanceBaseType=)
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
	 * @return {@link MultiTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MultiTextureCoordinate setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>texCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureCoordinateNode] Zero or more contained TextureCoordinate or TextureCoordinateGenerator nodes that specify texture coordinates for the different texture channels, used for texture mapping onto corresponding geometry.
 * <ul>
 *  <li> <i> Warning:</i>  MultiTextureCoordinate may not contain another MultiTextureCoordinate node. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTextureCoordinateNode.
	 * @see org.web3d.x3d.sai.Texturing.X3DTextureCoordinateNode
	 * @return value of texCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureCoordinateNode, $additionalInheritanceBaseType=)
	public X3DNode[] getTexCoord(); // acceptable node types #1: X3DTextureCoordinateNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>texCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureCoordinateNode] Zero or more contained TextureCoordinate or TextureCoordinateGenerator nodes that specify texture coordinates for the different texture channels, used for texture mapping onto corresponding geometry.
 * <ul>
 *  <li> <i> Warning:</i>  MultiTextureCoordinate may not contain another MultiTextureCoordinate node. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTextureCoordinateNode.
	 * @param newValue is new value for the texCoord field.
	 * @return {@link MultiTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTextureCoordinate setTexCoord(X3DNode[] newValue); // acceptable node types #2: X3DTextureCoordinateNode

	/**
	 * Add array of child texCoord nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTextureCoordinateNode.
	 * @param newValue is new value array to be appended the texCoord field.
	 */
	public void addTexCoord(X3DNode[] newValue); // acceptable node types #3: X3DTextureCoordinateNode
	/**
	 * Set single child texCoord node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the texCoord field
	 */
	public void setTexCoord(X3DNode newValue); // acceptable node types #5: X3DTextureCoordinateNode
}
