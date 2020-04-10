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
 * IndexedLineSet defines polyline segments using index lists corresponding to vertex coordinates.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGeometryNode] IndexedLineSet defines polyline segments using index lists corresponding to vertex coordinates. IndexedLineSet is a geometry node that can contain a Coordinate|CoordinateDouble node and optionally a Color|ColorRGBA node.
 * <ul>
 *  <li> <i>Hint:</i> Polygonal chain <a href="https://en.wikipedia.org/wiki/Polygonal_chain" target="_blank">https://en.wikipedia.org/wiki/Polygonal_chain</a> </li> 
 *  <li> <i>Hint:</i> either values in a contained Color node, or else Material emissiveColor in corresponding Appearance node, are used for rendering lines and points. </li> 
 *  <li> <i>Warning:</i> lines are not lit, are not texture-mapped, and do not participate in collision detection. </li> 
 *  <li> <i>Warning:</i> use a different color (or Material emissiveColor) than the Background color, otherwise geometry is invisible. </li> 
 *  <li> <i>Hint:</i> adding LineProperties to the corresponding Appearance node can modify the rendering style of these lines. </li> 
 *  <li> <i>Hint:</i> if rendering Coordinate points originally defined for an IndexedFaceSet, index values may need to repeat each initial vertex to close each polygon outline. </li> 
 *  <li> <i>Hint:</i> step-wise variation or linear interpolation of color values can be used as a good scientific visualization technique to map arbitrary function values to a color map. </li> 
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. </li> 
 *  <li> <i>Hint:</i> for advanced extensibility, authors can substitute a type-matched ProtoInstance node (with correct containerField value) for contained node content. </li> 
 *  <li> <i>Hint:</i>  consider including Fog (with Fog color matching Background color) to provide further depth cueing for IndexedLineSet (ILS). </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#IndexedLineSet" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rendering.html#IndexedLineSet" target="blank">X3D Abstract Specification: IndexedLineSet</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#IndexedLineSet" target="_blank">X3D Tooltips: IndexedLineSet</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface IndexedLineSet extends X3DGeometryNode
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
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setAttrib(X3DNode[] newValue); // acceptable node types #2: X3DVertexAttributeNode

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
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setColor(X3DColorNode newValue); // acceptable node types #2: X3DColorNode

	/**
	 * Provide array of int results using RGB values [0..1] from initializeOnly MFInt32 field named <i>colorIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) colorIndex values define the order in which Color|ColorRGBA values are applied to polygons (or vertices).
 * <ul>
 *  <li> <i>Hint:</i> if colorIndex array is not provided, then Color|ColorRGBA values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='false' then one index is provided for each polygon defined by the coordIndex array. No sentinel -1 values are included. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='true' then a matching set of indices is provided, each separated by sentinel -1, that exactly corresponds to individual values in the coordIndex array polygon definitions. </li> 
 *  <li> <i>Hint:</i> if rendering Coordinate points originally defined for an IndexedFaceSet, index values may need to repeat initial each initial vertex to close the polygons. </li> 
 *  <li> <i>Warning:</i>  if child Color|ColorRGBA node is not provided, then geometry is rendered using corresponding Appearance and material/texture values. </li> 
 * </ul>
	 * @return value of colorIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public int[] getColorIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>colorIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) colorIndex values define the order in which Color|ColorRGBA values are applied to polygons (or vertices).
 * <ul>
 *  <li> <i>Hint:</i> if colorIndex array is not provided, then Color|ColorRGBA values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='false' then one index is provided for each polygon defined by the coordIndex array. No sentinel -1 values are included. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='true' then a matching set of indices is provided, each separated by sentinel -1, that exactly corresponds to individual values in the coordIndex array polygon definitions. </li> 
 *  <li> <i>Hint:</i> if rendering Coordinate points originally defined for an IndexedFaceSet, index values may need to repeat initial each initial vertex to close the polygons. </li> 
 *  <li> <i>Warning:</i>  if child Color|ColorRGBA node is not provided, then geometry is rendered using corresponding Appearance and material/texture values. </li> 
 * </ul>
	 * @param newValue is new value for the colorIndex field.
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setColorIndex(int[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>colorPerVertex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether Color node color values are applied to each point vertex (true) or per polyline (false).
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of colorPerVertex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getColorPerVertex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>colorPerVertex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether Color node color values are applied to each point vertex (true) or per polyline (false).
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the colorPerVertex field.
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setColorPerVertex(boolean newValue);

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
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setCoord(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide array of int results within allowed range of [-1,infinity) from initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) coordIndex indices provide the order in which coordinates are applied to construct each polygon face. Order starts at index 0, commas are optional between sets, use -1 to separate indices for each polyline.
 * <ul>
 *  <li> <i>Hint:</i> if rendering Coordinate points originally defined for an IndexedFaceSet, index values may need to repeat initial each initial vertex to close the polygons. </li> 
 *  <li> <i>Hint:</i> sentinel value -1 is used to separate indices for each successive polyline. </li> 
 *  <li> <i>Warning:</i>  coordIndex is required in order to connect contained coordinate point values. </li> 
 * </ul>
	 * @return value of coordIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public int[] getCoordIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) coordIndex indices provide the order in which coordinates are applied to construct each polygon face. Order starts at index 0, commas are optional between sets, use -1 to separate indices for each polyline.
 * <ul>
 *  <li> <i>Hint:</i> if rendering Coordinate points originally defined for an IndexedFaceSet, index values may need to repeat initial each initial vertex to close the polygons. </li> 
 *  <li> <i>Hint:</i> sentinel value -1 is used to separate indices for each successive polyline. </li> 
 *  <li> <i>Warning:</i>  coordIndex is required in order to connect contained coordinate point values. </li> 
 * </ul>
	 * @param newValue is new value for the coordIndex field.
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setCoordIndex(int[] newValue);

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
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedLineSet setFogCoord(FogCoordinate newValue); // acceptable node types #2: FogCoordinate

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
	 * @return {@link IndexedLineSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedLineSet setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

}
