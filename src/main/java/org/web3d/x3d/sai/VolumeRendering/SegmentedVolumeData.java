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
import org.web3d.x3d.sai.VolumeRendering.*;
import org.web3d.x3d.sai.Texturing3D.*;
import org.web3d.x3d.sai.Texturing3D.*;
import java.util.Arrays;

/**
 * SegmentedVolumeData displays a segmented voxel dataset with different RenderStyle nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.3 or later) [X3DVolumeDataNode] SegmentedVolumeData displays a segmented voxel dataset with different RenderStyle nodes.
 * <ul>
 *  <li> <i>Hint:</i> SegmentedVolumeData can contain a single ComposedTexture3D, ImageTexture3D or PixelTexture3D node with containerField='segmentIdentifiers' and another with containerField='voxels'. </li> 
 *  <li> <i>Hint:</i>  SegmentedVolumeData can contain multiple RenderStyle nodes. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#SegmentedVolumeData" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/volume.html#SegmentedVolumeData" target="blank">X3D Abstract Specification: SegmentedVolumeData</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SegmentedVolumeData" target="_blank">X3D Tooltips: SegmentedVolumeData</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Volume" target="_blank">X3D Scene Authoring Hints: Volume</a>
    */
public interface SegmentedVolumeData extends X3DVolumeDataNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box center accompanies bboxSize and provides an optional hint for bounding box position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @return value of bboxCenter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBboxCenter();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box center accompanies bboxSize and provides an optional hint for bounding box position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SegmentedVolumeData setBboxCenter(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of [0,infinity), or default value [-1 -1 -1], from initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box size is usually omitted, and can easily be calculated automatically by an X3D player at scene-loading time with minimal computational cost. Bounding box size can also be defined as an optional authoring hint that suggests an optimization or constraint.
 * <ul>
 *  <li> <i>Hint:</i> can be useful for collision computations or inverse-kinematics (IK) engines. </li> 
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @return value of bboxSize field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getBboxSize();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box size is usually omitted, and can easily be calculated automatically by an X3D player at scene-loading time with minimal computational cost. Bounding box size can also be defined as an optional authoring hint that suggests an optimization or constraint.
 * <ul>
 *  <li> <i>Hint:</i> can be useful for collision computations or inverse-kinematics (IK) engines. </li> 
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SegmentedVolumeData setBboxSize(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of (0,infinity) from inputOutput SFVec3f field named <i>dimensions</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Actual-size X-Y-Z dimensions of volume data in local coordinate system.  * <br>

	 * @return value of dimensions field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getDimensions();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>dimensions</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Actual-size X-Y-Z dimensions of volume data in local coordinate system.  * <br>

	 * @param newValue is new value for the dimensions field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SegmentedVolumeData setDimensions(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
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
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SegmentedVolumeData setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>renderStyle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DVolumeRenderStyleNode] Multiple contained X3DVolumeRenderStyleNode nodes corresponding to each isosurface that define specific rendering technique for this volumetric object.
 * <ul>
 *  <li> <i> Hint:</i>  Warning: if not defined, no default renderStryle is defined. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVolumeRenderStyleNode.
	 * @see org.web3d.x3d.sai.VolumeRendering.X3DVolumeRenderStyleNode
	 * @return value of renderStyle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	public X3DNode[] getRenderStyle(); // acceptable node types #1: X3DVolumeRenderStyleNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>renderStyle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DVolumeRenderStyleNode] Multiple contained X3DVolumeRenderStyleNode nodes corresponding to each isosurface that define specific rendering technique for this volumetric object.
 * <ul>
 *  <li> <i> Hint:</i>  Warning: if not defined, no default renderStryle is defined. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVolumeRenderStyleNode.
	 * @param newValue is new value for the renderStyle field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SegmentedVolumeData setRenderStyle(X3DNode[] newValue); // acceptable node types #2: X3DVolumeRenderStyleNode

	/**
	 * Add array of child renderStyle nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DVolumeRenderStyleNode.
	 * @param newValue is new value array to be appended the renderStyle field.
	 */
	public void addRenderStyle(X3DNode[] newValue); // acceptable node types #3: X3DVolumeRenderStyleNode
	/**
	 * Set single child renderStyle node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the renderStyle field
	 */
	public void setRenderStyle(X3DNode newValue); // acceptable node types #5: X3DVolumeRenderStyleNode
	/**
	 * Provide array of boolean results from inputOutput MFBool field named <i>segmentEnabled</i>.
	 * @return value of segmentEnabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	public boolean[] getSegmentEnabled();

	/**
	 * Accessor method to assign boolean array to inputOutput MFBool field named <i>segmentEnabled</i>.
	 * @param newValue is new value for the segmentEnabled field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SegmentedVolumeData setSegmentEnabled(boolean[] newValue);

	/**
	 * Provide X3DTexture3DNode instance (using a properly typed node) from inputOutput SFNode field <i>segmentIdentifiers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture3DNode] Single contained X3DTexture3DNode (ComposedTexture3D, ImageTexture3D, PixelTexture3D) holds component texture that provides corresponding segment identifier.
 * <ul>
 *  <li> <i>Hint:</i> if more than one color component is contained, only initial color component defines the segment identifier. </li> 
 *  <li> <i>Warning:</i>  if segmentIdentifiers texture is not identical in size to the main voxels, it shall be ignored. </li> 
 * </ul>
	 * @return value of segmentIdentifiers field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	public X3DTexture3DNode getSegmentIdentifiers(); // acceptable node types #1: X3DTexture3DNode

	/**
	 * Accessor method to assign X3DTexture3DNode instance (using a properly typed node) to inputOutput SFNode field <i>segmentIdentifiers</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTexture3DNode] Single contained X3DTexture3DNode (ComposedTexture3D, ImageTexture3D, PixelTexture3D) holds component texture that provides corresponding segment identifier.
 * <ul>
 *  <li> <i>Hint:</i> if more than one color component is contained, only initial color component defines the segment identifier. </li> 
 *  <li> <i>Warning:</i>  if segmentIdentifiers texture is not identical in size to the main voxels, it shall be ignored. </li> 
 * </ul>
	 * @param newValue is new value for the segmentIdentifiers field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SegmentedVolumeData setSegmentIdentifiers(X3DTexture3DNode newValue); // acceptable node types #2: X3DTexture3DNode

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SegmentedVolumeData setVisible(boolean newValue);

	/**
	 * Provide X3DTexture3DNode instance (using a properly typed node) from inputOutput SFNode field <i>voxels</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTexture3DNode] Single contained X3DTexture3DNode (ComposedTexture3D, ImageTexture3D, PixelTexture3D) that provides raw voxel information utilized by corresponding rendering styles. Any number of color components (1-4) may be defined.  * <br>

	 * @return value of voxels field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DVolumeDataNode, $additionalInheritanceBaseType=)
	public X3DTexture3DNode getVoxels(); // acceptable node types #1: X3DTexture3DNode

	/**
	 * Accessor method to assign X3DTexture3DNode instance (using a properly typed node) to inputOutput SFNode field <i>voxels</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTexture3DNode] Single contained X3DTexture3DNode (ComposedTexture3D, ImageTexture3D, PixelTexture3D) that provides raw voxel information utilized by corresponding rendering styles. Any number of color components (1-4) may be defined.  * <br>

	 * @param newValue is new value for the voxels field.
	 * @return {@link SegmentedVolumeData} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SegmentedVolumeData setVoxels(X3DTexture3DNode newValue); // acceptable node types #2: X3DTexture3DNode

}
