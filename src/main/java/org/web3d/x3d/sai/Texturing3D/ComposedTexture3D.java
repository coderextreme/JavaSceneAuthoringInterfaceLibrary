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

package org.web3d.x3d.sai.Texturing3D;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Texturing.*;
import org.web3d.x3d.sai.Texturing.*;
import java.util.Arrays;

/**
 * ComposedTexture3D defines a 3D image-based texture map as a collection of 2D texture sources at various depths.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.1 or later) [X3DTexture3DNode] ComposedTexture3D defines a 3D image-based texture map as a collection of 2D texture sources at various depths.
 * <ul>
 *  <li> <i>Hint:</i> insert 2^n ImageTexture, PixelTexture or MovieTexture child nodes. The first image is at depth 0 and each following image is at an increasing depth value in the R direction. </li> 
 *  <li> <i>Hint:</i> can contain a single TextureProperties node. </li> 
 *  <li> <i>Hint:</i> insert Shape and Appearance nodes before adding texture. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33.2.2 3D texturing concepts <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html#3DTextureconcepts" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html#3DTextureconcepts</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#ComposedTexture3D" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html#ComposedTexture3D" target="blank">X3D Abstract Specification: ComposedTexture3D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ComposedTexture3D" target="_blank">X3D Tooltips: ComposedTexture3D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface ComposedTexture3D extends X3DTexture3DNode
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ComposedTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedTexture3D setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatR</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along R axis.  * <br>

	 * @return value of repeatR field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getRepeatR();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatR</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along R axis.  * <br>

	 * @param newValue is new value for the repeatR field.
	 * @return {@link ComposedTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedTexture3D setRepeatR(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatS</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to horizontally repeat texture along S axis.  * <br>

	 * @return value of repeatS field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getRepeatS();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatS</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to horizontally repeat texture along S axis.  * <br>

	 * @param newValue is new value for the repeatS field.
	 * @return {@link ComposedTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedTexture3D setRepeatS(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatT</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along T axis.  * <br>

	 * @return value of repeatT field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getRepeatT();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatT</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along T axis.  * <br>

	 * @param newValue is new value for the repeatT field.
	 * @return {@link ComposedTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedTexture3D setRepeatT(boolean newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>texture</i>.
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTexture2DNode.
	 * @see org.web3d.x3d.sai.Texturing.X3DTexture2DNode
	 * @return value of texture field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=)
	public X3DNode[] getTexture(); // acceptable node types #1: X3DTexture2DNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>texture</i>.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTexture2DNode.
	 * @param newValue is new value for the texture field.
	 * @return {@link ComposedTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ComposedTexture3D setTexture(X3DNode[] newValue); // acceptable node types #2: X3DTexture2DNode

	/**
	 * Add array of child texture nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTexture2DNode.
	 * @param newValue is new value array to be appended the texture field.
	 */
	public void addTexture(X3DNode[] newValue); // acceptable node types #3: X3DTexture2DNode
	/**
	 * Set single child texture node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the texture field
	 */
	public void setTexture(X3DNode newValue); // acceptable node types #5: X3DTexture2DNode
	/**
	 * Provide TextureProperties instance (using a properly typed node) from initializeOnly SFNode field <i>textureProperties</i>.
	 * @return value of textureProperties field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=)
	@Override
	public TextureProperties getTextureProperties(); // acceptable node types #1: TextureProperties

	/**
	 * Accessor method to assign TextureProperties instance (using a properly typed node) to initializeOnly SFNode field <i>textureProperties</i>.
	 * @param newValue is new value for the textureProperties field.
	 * @return {@link ComposedTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ComposedTexture3D setTextureProperties(TextureProperties newValue); // acceptable node types #2: TextureProperties

}
