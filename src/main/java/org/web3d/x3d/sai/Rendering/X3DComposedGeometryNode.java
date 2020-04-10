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

package org.web3d.x3d.sai.Rendering;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Shaders.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.EnvironmentalEffects.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.Texturing.*;
import java.util.Arrays;

/**
 * Composed geometry nodes produce renderable geometry, can contain Color Coordinate Normal TextureCoordinate, and are contained by a Shape node.
 * 
 * <br><br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/abstracts.html#X3DComposedGeometryNode" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rendering.html#X3DComposedGeometryNode" target="blank">X3D Abstract Specification: TODO</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html" target="_blank">X3D Tooltips</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface X3DComposedGeometryNode extends X3DGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>attrib</i>.
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVertexAttributeNode.
	 * @see org.web3d.x3d.sai.Shaders.X3DVertexAttributeNode
	 * @return value of attrib field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DNode[] getAttrib(); // acceptable node types #1: X3DVertexAttributeNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>attrib</i>.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVertexAttributeNode.
	 * @param newValue is new value for the attrib field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setAttrib(X3DNode[] newValue); // acceptable node types #2: X3DVertexAttributeNode

	/**
	 * Add array of child attrib nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVertexAttributeNode.
	 * @param newValue is new value array to be appended the attrib field.
	 */
	public void addAttrib(X3DNode[] newValue); // acceptable node types #3: X3DVertexAttributeNode
	/**
	 * Set single child attrib node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the attrib field
	 */
	public void setAttrib(X3DNode newValue); // acceptable node types #5: X3DVertexAttributeNode
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>ccw</i>.
	 * @return value of ccw field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getCcw();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>ccw</i>.
	 * @param newValue is new value for the ccw field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setCcw(boolean newValue);

	/**
	 * Provide X3DColorNode instance (using a properly typed node) using RGB values [0..1] from inputOutput SFNode field <i>color</i>.
	 * @return value of color field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DColorNode getColor(); // acceptable node types #1: X3DColorNode

	/**
	 * Accessor method to assign X3DColorNode instance (using a properly typed node) to inputOutput SFNode field <i>color</i>.
	 * @param newValue is new value for the color field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setColor(X3DColorNode newValue); // acceptable node types #2: X3DColorNode

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>colorPerVertex</i>.
	 * @return value of colorPerVertex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getColorPerVertex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>colorPerVertex</i>.
	 * @param newValue is new value for the colorPerVertex field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setColorPerVertex(boolean newValue);

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>coord</i>.
	 * @return value of coord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DCoordinateNode getCoord(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * @param newValue is new value for the coord field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setCoord(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide FogCoordinate instance (using a properly typed node) from inputOutput SFNode field <i>fogCoord</i>.
	 * @return value of fogCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public FogCoordinate getFogCoord(); // acceptable node types #1: FogCoordinate

	/**
	 * Accessor method to assign FogCoordinate instance (using a properly typed node) to inputOutput SFNode field <i>fogCoord</i>.
	 * @param newValue is new value for the fogCoord field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setFogCoord(FogCoordinate newValue); // acceptable node types #2: FogCoordinate

	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata(); // acceptable node types #1: X3DMetadataObject

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public X3DComposedGeometryNode setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide X3DNormalNode instance (using a properly typed node) from inputOutput SFNode field <i>normal</i>.
	 * @return value of normal field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DNormalNode getNormal(); // acceptable node types #1: X3DNormalNode

	/**
	 * Accessor method to assign X3DNormalNode instance (using a properly typed node) to inputOutput SFNode field <i>normal</i>.
	 * @param newValue is new value for the normal field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setNormal(X3DNormalNode newValue); // acceptable node types #2: X3DNormalNode

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>normalPerVertex</i>.
	 * @return value of normalPerVertex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getNormalPerVertex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>normalPerVertex</i>.
	 * @param newValue is new value for the normalPerVertex field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setNormalPerVertex(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>solid</i>.
	 * @return value of solid field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getSolid();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>solid</i>.
	 * @param newValue is new value for the solid field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setSolid(boolean newValue);

	/**
	 * Provide X3DTextureCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>texCoord</i>.
	 * @return value of texCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DTextureCoordinateNode getTexCoord(); // acceptable node types #1: X3DTextureCoordinateNode

	/**
	 * Accessor method to assign X3DTextureCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>texCoord</i>.
	 * @param newValue is new value for the texCoord field.
	 * @return {@link X3DComposedGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DComposedGeometryNode setTexCoord(X3DTextureCoordinateNode newValue); // acceptable node types #2: X3DTextureCoordinateNode

}
