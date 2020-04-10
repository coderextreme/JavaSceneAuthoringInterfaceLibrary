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

package org.web3d.x3d.sai.Geometry3D;

import org.web3d.x3d.sai.Rendering.X3DComposedGeometryNode;

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
 * IndexedFaceSet defines polygons using index lists corresponding to vertex coordinates.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DComposedGeometryNode] IndexedFaceSet defines polygons using index lists corresponding to vertex coordinates. IndexedFaceSet is a geometry node containing a Coordinate|CoordinateDouble node, and can also contain Color|ColorRGBA, Normal and TextureCoordinate nodes.
 * <ul>
 *  <li> <i>Hint:</i> Polygon <a href="https://en.wikipedia.org/wiki/Polygon" target="_blank">https://en.wikipedia.org/wiki/Polygon</a> </li> 
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. </li> 
 *  <li> <i>Hint:</i> for advanced extensibility, authors can substitute a type-matched ProtoInstance node (with correct containerField value) for contained node content. </li> 
 *  <li> <i>Warning:</i> rendering characteristics are undefined if polygons are not planar. </li> 
 *  <li> <i>Warning:</i>  avoid self-intersecting polygon line segments, otherwise defined geometry is irregular and rendering results are undefined. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#IndexedFaceSet" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry3D.html#IndexedFaceSet" target="blank">X3D Abstract Specification: IndexedFaceSet</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#IndexedFaceSet" target="_blank">X3D Tooltips: IndexedFaceSet</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Meshes" target="_blank">X3D Scene Authoring Hints: Meshes</a>
    */
public interface IndexedFaceSet extends X3DComposedGeometryNode
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
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
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setAttrib(X3DNode[] newValue); // acceptable node types #2: X3DVertexAttributeNode

	/**
	 * Add array of child attrib nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVertexAttributeNode.
	 * @param newValue is new value array to be appended the attrib field.
	 */
	@Override // or here2?
	public void addAttrib(X3DNode[] newValue); // acceptable node types #3: X3DVertexAttributeNode
	/**
	 * Set single child attrib node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the attrib field
	 */
	public void setAttrib(X3DNode newValue); // acceptable node types #5: X3DVertexAttributeNode
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>ccw</i>.
	 * <br><br>
	 * <i>Tooltip:</i> ccw = counterclockwise: ordering of vertex coordinates orientation, according to Right-Hand Rule (RHR).
 * <ul>
 *  <li> <i> Hint:</i>  ccw false can reverse solid (backface culling) and normal-vector orientation. Note that consistency of left-handed or right-handed point sequences is important throughout. </li> 
 * </ul>
	 * @return value of ccw field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getCcw();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>ccw</i>.
	 * <br><br>
	 * <i>Tooltip:</i> ccw = counterclockwise: ordering of vertex coordinates orientation, according to Right-Hand Rule (RHR).
 * <ul>
 *  <li> <i> Hint:</i>  ccw false can reverse solid (backface culling) and normal-vector orientation. Note that consistency of left-handed or right-handed point sequences is important throughout. </li> 
 * </ul>
	 * @param newValue is new value for the ccw field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setCcw(boolean newValue);

	/**
	 * Provide X3DColorNode instance (using a properly typed node) using RGB values [0..1] from inputOutput SFNode field <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DColorNode] Single contained Color or ColorRGBA node that specifies color values applied to corresponding vertices according to colorIndex and colorPerVertex fields.  * <br>

	 * @return value of color field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DColorNode getColor(); // acceptable node types #1: X3DColorNode

	/**
	 * Accessor method to assign X3DColorNode instance (using a properly typed node) to inputOutput SFNode field <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DColorNode] Single contained Color or ColorRGBA node that specifies color values applied to corresponding vertices according to colorIndex and colorPerVertex fields.  * <br>

	 * @param newValue is new value for the color field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setColor(X3DColorNode newValue); // acceptable node types #2: X3DColorNode

	/**
	 * Provide array of int results using RGB values [0..1] from initializeOnly MFInt32 field named <i>colorIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) colorIndex values define the order in which Color|ColorRGBA values are applied to polygons (or vertices).
 * <ul>
 *  <li> <i>Hint:</i> if colorIndex array is not provided, then Color|ColorRGBA values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='false' then one index is provided for each polygon defined by the coordIndex array. No sentinel -1 values are included. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='true' then a matching set of indices is provided, each separated by sentinel -1, that exactly corresponds to individual values in the coordIndex array polygon definitions. </li> 
 *  <li> <i>Warning:</i>  if child Color|ColorRGBA node is not provided, then geometry is rendered using corresponding Appearance and material/texture values. </li> 
 * </ul>
	 * @return value of colorIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	public int[] getColorIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>colorIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) colorIndex values define the order in which Color|ColorRGBA values are applied to polygons (or vertices).
 * <ul>
 *  <li> <i>Hint:</i> if colorIndex array is not provided, then Color|ColorRGBA values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='false' then one index is provided for each polygon defined by the coordIndex array. No sentinel -1 values are included. </li> 
 *  <li> <i>Hint:</i> If colorPerVertex='true' then a matching set of indices is provided, each separated by sentinel -1, that exactly corresponds to individual values in the coordIndex array polygon definitions. </li> 
 *  <li> <i>Warning:</i>  if child Color|ColorRGBA node is not provided, then geometry is rendered using corresponding Appearance and material/texture values. </li> 
 * </ul>
	 * @param newValue is new value for the colorIndex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedFaceSet setColorIndex(int[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>colorPerVertex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether Color|ColorRGBA values are applied to each point vertex (true) or to each polygon face (false).
 * <ul>
 *  <li> <i>Warning:</i> if child Color|ColorRGBA node is not provided, then geometry is rendered using corresponding Appearance and material/texture values. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of colorPerVertex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getColorPerVertex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>colorPerVertex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether Color|ColorRGBA values are applied to each point vertex (true) or to each polygon face (false).
 * <ul>
 *  <li> <i>Warning:</i> if child Color|ColorRGBA node is not provided, then geometry is rendered using corresponding Appearance and material/texture values. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the colorPerVertex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setColorPerVertex(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>convex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether all polygons in a shape are convex (true), or possibly concave (false) A convex polygon is planar, does not intersect itself, and has all interior angles &amp;lt; 180 degrees. Interchange profile hint: only convex=true IndexedFaceSets have guaranteed supported.
 * <ul>
 *  <li> <i> Warning:</i>  concave or inverted geometry may be invisible when using default value convex=true. </li> 
 * </ul>
	 * @return value of convex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	public boolean getConvex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>convex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether all polygons in a shape are convex (true), or possibly concave (false) A convex polygon is planar, does not intersect itself, and has all interior angles &amp;lt; 180 degrees. Interchange profile hint: only convex=true IndexedFaceSets have guaranteed supported.
 * <ul>
 *  <li> <i> Warning:</i>  concave or inverted geometry may be invisible when using default value convex=true. </li> 
 * </ul>
	 * @param newValue is new value for the convex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedFaceSet setConvex(boolean newValue);

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies a list of vertex values.  * <br>

	 * @return value of coord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DCoordinateNode getCoord(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies a list of vertex values.  * <br>

	 * @param newValue is new value for the coord field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setCoord(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide array of int results within allowed range of [-1,infinity) from initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) coordIndex indices provide the order in which coordinates are applied to construct each polygon face. Order starts at index 0, commas are optional between sets.
 * <ul>
 *  <li> <i>Hint:</i> sentinel value -1 is used to separate indices for each successive polygon. </li> 
 *  <li> <i>Warning:</i>  coordIndex is required in order to connect contained coordinate point values. </li> 
 * </ul>
	 * @return value of coordIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	public int[] getCoordIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) coordIndex indices provide the order in which coordinates are applied to construct each polygon face. Order starts at index 0, commas are optional between sets.
 * <ul>
 *  <li> <i>Hint:</i> sentinel value -1 is used to separate indices for each successive polygon. </li> 
 *  <li> <i>Warning:</i>  coordIndex is required in order to connect contained coordinate point values. </li> 
 * </ul>
	 * @param newValue is new value for the coordIndex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedFaceSet setCoordIndex(int[] newValue);

	/**
	 * Provide float value unit axis, angle (in radians) within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>creaseAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) creaseAngle defines angle (in radians) for determining whether adjacent polygons are drawn with sharp edges or smooth shading. If angle between normals of two adjacent polygons is less than creaseAngle, smooth shading is rendered across the shared line segment. Interchange profile hint: only 0 and pi radians supported.
 * <ul>
 *  <li> <i>Hint:</i> creaseAngle=0 means render all edges sharply, creaseAngle=3.14159 means render all edges smoothly. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of creaseAngle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	public float getCreaseAngle();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to initializeOnly SFFloat field named <i>creaseAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) creaseAngle defines angle (in radians) for determining whether adjacent polygons are drawn with sharp edges or smooth shading. If angle between normals of two adjacent polygons is less than creaseAngle, smooth shading is rendered across the shared line segment. Interchange profile hint: only 0 and pi radians supported.
 * <ul>
 *  <li> <i>Hint:</i> creaseAngle=0 means render all edges sharply, creaseAngle=3.14159 means render all edges smoothly. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the creaseAngle field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedFaceSet setCreaseAngle(float newValue);

	/**
	 * Provide FogCoordinate instance (using a properly typed node) from inputOutput SFNode field <i>fogCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [FogCoordinate] Single contained FogCoordinate node that specifies depth parameters for fog in corresponding geometry.  * <br>

	 * @return value of fogCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public FogCoordinate getFogCoord(); // acceptable node types #1: FogCoordinate

	/**
	 * Accessor method to assign FogCoordinate instance (using a properly typed node) to inputOutput SFNode field <i>fogCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [FogCoordinate] Single contained FogCoordinate node that specifies depth parameters for fog in corresponding geometry.  * <br>

	 * @param newValue is new value for the fogCoord field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setFogCoord(FogCoordinate newValue); // acceptable node types #2: FogCoordinate

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide X3DNormalNode instance (using a properly typed node) from inputOutput SFNode field <i>normal</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DNormalNode] Single contained Normal node that specifies perpendicular vectors for corresponding vertices to support rendering computations, applied according to the normalPerVertex field.
 * <ul>
 *  <li> <i>Hint:</i> useful for special effects. Normal vector computation by 3D graphics hardware is quite fast so adding normals to a scene is typically unnecessary. </li> 
 *  <li> <i>Warning:</i>  normal vectors increase file size, typically doubling geometry definitions. </li> 
 * </ul>
	 * @return value of normal field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNormalNode getNormal(); // acceptable node types #1: X3DNormalNode

	/**
	 * Accessor method to assign X3DNormalNode instance (using a properly typed node) to inputOutput SFNode field <i>normal</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DNormalNode] Single contained Normal node that specifies perpendicular vectors for corresponding vertices to support rendering computations, applied according to the normalPerVertex field.
 * <ul>
 *  <li> <i>Hint:</i> useful for special effects. Normal vector computation by 3D graphics hardware is quite fast so adding normals to a scene is typically unnecessary. </li> 
 *  <li> <i>Warning:</i>  normal vectors increase file size, typically doubling geometry definitions. </li> 
 * </ul>
	 * @param newValue is new value for the normal field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setNormal(X3DNormalNode newValue); // acceptable node types #2: X3DNormalNode

	/**
	 * Provide array of int results within allowed range of [-1,infinity) from initializeOnly MFInt32 field named <i>normalIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) normalIndex values define the order in which normal vectors are applied to polygons (or vertices).
 * <ul>
 *  <li> <i>Warning:</i> if normalIndex array is not provided, then Normal values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i> If normalPerVertex='false' then one index is provided for each polygon defined by the coordIndex array. No sentinel -1 values are included. </li> 
 *  <li> <i>Hint:</i> If normalPerVertex='true' then a matching set of indices is provided, each separated by sentinel -1, that exactly corresponds to individual values in the coordIndex array polygon definitions. </li> 
 *  <li> <i>Hint:</i>  if no child Normal node is provided, the X3D browser shall automatically generate normals, using creaseAngle to determine smoothed shading across shared vertices. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of normalIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	public int[] getNormalIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>normalIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) normalIndex values define the order in which normal vectors are applied to polygons (or vertices).
 * <ul>
 *  <li> <i>Warning:</i> if normalIndex array is not provided, then Normal values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i> If normalPerVertex='false' then one index is provided for each polygon defined by the coordIndex array. No sentinel -1 values are included. </li> 
 *  <li> <i>Hint:</i> If normalPerVertex='true' then a matching set of indices is provided, each separated by sentinel -1, that exactly corresponds to individual values in the coordIndex array polygon definitions. </li> 
 *  <li> <i>Hint:</i>  if no child Normal node is provided, the X3D browser shall automatically generate normals, using creaseAngle to determine smoothed shading across shared vertices. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the normalIndex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedFaceSet setNormalIndex(int[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>normalPerVertex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether Normal node vector values are applied to each point vertex (true) or to each polygon face (false).
 * <ul>
 *  <li> <i> Hint:</i>  if no child Normal node is provided, the X3D browser shall automatically generate normals, using creaseAngle to determine smoothed shading across shared vertices. </li> 
 * </ul>
	 * @return value of normalPerVertex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getNormalPerVertex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>normalPerVertex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether Normal node vector values are applied to each point vertex (true) or to each polygon face (false).
 * <ul>
 *  <li> <i> Hint:</i>  if no child Normal node is provided, the X3D browser shall automatically generate normals, using creaseAngle to determine smoothed shading across shared vertices. </li> 
 * </ul>
	 * @param newValue is new value for the normalPerVertex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setNormalPerVertex(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i>  if in doubt, use solid='false' for maximum visibility. </li> 
 * </ul>
	 * @return value of solid field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getSolid();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i>  if in doubt, use solid='false' for maximum visibility. </li> 
 * </ul>
	 * @param newValue is new value for the solid field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setSolid(boolean newValue);

	/**
	 * Provide X3DTextureCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>texCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTextureCoordinateNode] Single contained TextureCoordinate, TextureCoordinateGenerator or MultiTextureCoordinate node that specifies coordinates for texture mapping onto corresponding geometry.  * <br>

	 * @return value of texCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DTextureCoordinateNode getTexCoord(); // acceptable node types #1: X3DTextureCoordinateNode

	/**
	 * Accessor method to assign X3DTextureCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>texCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTextureCoordinateNode] Single contained TextureCoordinate, TextureCoordinateGenerator or MultiTextureCoordinate node that specifies coordinates for texture mapping onto corresponding geometry.  * <br>

	 * @param newValue is new value for the texCoord field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public IndexedFaceSet setTexCoord(X3DTextureCoordinateNode newValue); // acceptable node types #2: X3DTextureCoordinateNode

	/**
	 * Provide array of int results within allowed range of [-1,infinity) from initializeOnly MFInt32 field named <i>texCoordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) List of texture-coordinate indices mapping attached texture to corresponding coordinates.
 * <ul>
 *  <li> <i>Hint:</i> if texCoordIndex array is not provided, then TextureCoordinate values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i>  use a tool!. </li> 
 * </ul>
	 * @return value of texCoordIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DComposedGeometryNode, $additionalInheritanceBaseType=)
	public int[] getTexCoordIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>texCoordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) List of texture-coordinate indices mapping attached texture to corresponding coordinates.
 * <ul>
 *  <li> <i>Hint:</i> if texCoordIndex array is not provided, then TextureCoordinate values are indexed according to the coordIndex field. </li> 
 *  <li> <i>Hint:</i>  use a tool!. </li> 
 * </ul>
	 * @param newValue is new value for the texCoordIndex field.
	 * @return {@link IndexedFaceSet} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public IndexedFaceSet setTexCoordIndex(int[] newValue);

}
