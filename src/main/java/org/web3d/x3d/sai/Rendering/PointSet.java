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
import java.util.Arrays;

/**
 * PointSet is a node that contains a set of colored 3D points, represented by contained Color|ColorRGBA and Coordinate|CoordinateDouble nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGeometryNode] PointSet is a node that contains a set of colored 3D points, represented by contained Color|ColorRGBA and Coordinate|CoordinateDouble nodes.
 * <ul>
 *  <li> <i>Hint:</i> Point (geometry) <a href="https://en.wikipedia.org/wiki/Point_(geometry)" target="_blank">https://en.wikipedia.org/wiki/Point_(geometry)</a> </li> 
 *  <li> <i>Hint:</i> either values in a contained Color node, or else Material emissiveColor in corresponding Appearance node, are used for rendering lines and points. </li> 
 *  <li> <i>Warning:</i> use a different color (or Material emissiveColor) than the Background color, otherwise geometry is invisible. </li> 
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. </li> 
 *  <li> <i>Hint:</i>  each point is displayed independently, no other PointSet attributes for rendering are provided. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#PointSet" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rendering.html#PointSet" target="blank">X3D Abstract Specification: PointSet</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PointSet" target="_blank">X3D Tooltips: PointSet</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface PointSet extends X3DGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>attrib</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DVertexAttributeNode] Single contained FloatVertexAttribute node that specifies list of per-vertex attribute information for programmable shaders.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 32.2.2.4 Per-vertex attributes, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html#Pervertexattributes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html#Pervertexattributes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVertexAttributeNode.
	 * @see org.web3d.x3d.sai.Shaders.X3DVertexAttributeNode
	 * @return value of attrib field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public X3DNode[] getAttrib(); // acceptable node types #1: X3DVertexAttributeNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>attrib</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DVertexAttributeNode] Single contained FloatVertexAttribute node that specifies list of per-vertex attribute information for programmable shaders.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 32.2.2.4 Per-vertex attributes, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html#Pervertexattributes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html#Pervertexattributes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVertexAttributeNode.
	 * @param newValue is new value for the attrib field.
	 * @return {@link PointSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointSet setAttrib(X3DNode[] newValue); // acceptable node types #2: X3DVertexAttributeNode

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
	 * Provide X3DColorNode instance (using a properly typed node) using RGB values [0..1] from inputOutput SFNode field <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DColorNode] Single contained Color or ColorRGBA node that specifies color values applied to corresponding vertices according to colorIndex and colorPerVertex fields.  * <br>

	 * @return value of color field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public X3DColorNode getColor(); // acceptable node types #1: X3DColorNode

	/**
	 * Accessor method to assign X3DColorNode instance (using a properly typed node) to inputOutput SFNode field <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DColorNode] Single contained Color or ColorRGBA node that specifies color values applied to corresponding vertices according to colorIndex and colorPerVertex fields.  * <br>

	 * @param newValue is new value for the color field.
	 * @return {@link PointSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointSet setColor(X3DColorNode newValue); // acceptable node types #2: X3DColorNode

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies a list of vertex values.  * <br>

	 * @return value of coord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public X3DCoordinateNode getCoord(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies a list of vertex values.  * <br>

	 * @param newValue is new value for the coord field.
	 * @return {@link PointSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointSet setCoord(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide FogCoordinate instance (using a properly typed node) from inputOutput SFNode field <i>fogCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [FogCoordinate] Single contained FogCoordinate node that specifies depth parameters for fog in corresponding geometry.  * <br>

	 * @return value of fogCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public FogCoordinate getFogCoord(); // acceptable node types #1: FogCoordinate

	/**
	 * Accessor method to assign FogCoordinate instance (using a properly typed node) to inputOutput SFNode field <i>fogCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [FogCoordinate] Single contained FogCoordinate node that specifies depth parameters for fog in corresponding geometry.  * <br>

	 * @param newValue is new value for the fogCoord field.
	 * @return {@link PointSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointSet setFogCoord(FogCoordinate newValue); // acceptable node types #2: FogCoordinate

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PointSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointSet setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

}
