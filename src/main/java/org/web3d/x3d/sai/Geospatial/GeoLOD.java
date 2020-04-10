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

package org.web3d.x3d.sai.Geospatial;

import org.web3d.x3d.sai.Core.X3DChildNode;
import org.web3d.x3d.sai.Grouping.X3DBoundedObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Geospatial.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * Note that MFNode rootNode field can contain multiple nodes and has accessType inputOutput. Meanwhile MFNode children field is outputOnly, unlike other X3DGroupingNode exemplars.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DChildNode,X3DBoundedObject] GeoLOD provides quadtree level-of-detail loading/unloading for multi-resolution terrains. GeoLOD can contain children and GeoOrigin nodes.
 * <ul>
 *  <li> <i>Hint:</i> children nodes expose the scene graph for the currently loaded set of nodes. </li> 
 *  <li> <i>Hint:</i> rootNode specifies the geometry of the root tile. </li> 
 *  <li> <i>Warning:</i> do not use rootUrl and rootNode simultaneously, since each specifies the root tile. </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  nested LOD (and/or GeoLOD) nodes with overlapping range intervals can lead to unexpected or undefined behavior. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#GeoLOD" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#GeoLOD" target="blank">X3D Abstract Specification: GeoLOD</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#GeoLOD" target="_blank">X3D Tooltips: GeoLOD</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface GeoLOD extends X3DChildNode, X3DBoundedObject
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLOD setBboxCenter(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLOD setBboxSize(float[] newValue);

	/**
	 * Provide array of 3-tuple double results from initializeOnly SFVec3d field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Viewer range from geographic-coordinates center triggers quadtree loading/unloading.  * <br>

	 * @return value of center field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public double[] getCenter();

	/**
	 * Accessor method to assign 3-tuple double array to initializeOnly SFVec3d field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Viewer range from geographic-coordinates center triggers quadtree loading/unloading.  * <br>

	 * @param newValue is new value for the center field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setCenter(double[] newValue);

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child1Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child1Url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getChild1Url();

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child1Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child1Url field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setChild1Url(String[] newValue);

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child2Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child2Url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getChild2Url();

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child2Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child2Url field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setChild2Url(String[] newValue);

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child3Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child3Url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getChild3Url();

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child3Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child3Url field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setChild3Url(String[] newValue);

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child4Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child4Url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getChild4Url();

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child4Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child4Url field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setChild4Url(String[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from outputOnly MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] The outputOnly children field exposes a portion of the scene graph for the currently loaded set of nodes. The value returned as an event is an MFNode containing the currently selected tile. This will either be the node specified by the rootNode field or the nodes specified by the child1Url, child2Url, child3Url, and child4Url fields. The GeoLOD node shall generate a new children output event each time the scene graph is changed (EXAMPLE whenever nodes are loaded or unloaded).
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of children field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public X3DNode[] getChildren(); // acceptable node types #1: X3DChildNode
	/**
	 * Provide GeoOrigin instance (using a properly typed node) (deprecated node, optional) from initializeOnly SFNode field <i>geoOrigin</i>.
	 * @return value of geoOrigin field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public GeoOrigin getGeoOrigin(); // acceptable node types #1: GeoOrigin

	/**
	 * Accessor method to assign GeoOrigin instance (using a properly typed node) to initializeOnly SFNode field <i>geoOrigin</i>.
	 * @param newValue is new value for the geoOrigin field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setGeoOrigin(GeoOrigin newValue); // acceptable node types #2: GeoOrigin

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>geoSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Identifies spatial reference frame: Geodetic (GD), Geocentric (GC), Universal Transverse Mercator (UTM). Supported values: "GD" "UTM" or "GC" followed by additional quoted string parameters as appropriate for the type.
 * <ul>
 *  <li> <i>Hint:</i> X3D Architecture 25.2.2 Spatial reference frames <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 25.2.4 Specifying geospatial coordinates <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords</a> </li> 
 *  <li> <i>Hint:</i> UTM is Universal Transverse Mercator coordinate system <a href="https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system" target="_blank">https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system</a> </li> 
 *  <li> <i>Warning:</i>  deprecated values are GDC (replaced by GD) and GCC (replaced by GC). </li> 
 * </ul>
	 * @return value of geoSystem field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getGeoSystem();

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>geoSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Identifies spatial reference frame: Geodetic (GD), Geocentric (GC), Universal Transverse Mercator (UTM). Supported values: "GD" "UTM" or "GC" followed by additional quoted string parameters as appropriate for the type.
 * <ul>
 *  <li> <i>Hint:</i> X3D Architecture 25.2.2 Spatial reference frames <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 25.2.4 Specifying geospatial coordinates <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords</a> </li> 
 *  <li> <i>Hint:</i> UTM is Universal Transverse Mercator coordinate system <a href="https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system" target="_blank">https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system</a> </li> 
 *  <li> <i>Warning:</i>  deprecated values are GDC (replaced by GD) and GCC (replaced by GC). </li> 
 * </ul>
	 * @param newValue is new value for the geoSystem field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setGeoSystem(String[] newValue);

	/**
	 * Provide int value within allowed range of [0,1] from outputOnly SFInt32 field named <i>level_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event that reports when the new children outputOnly event is generated, with value 0 or 1, where 0 indicates the rootNode field and 1 indicates the nodes specified by the child1Url, child2Url, child3Url, and child4Url fields.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of level_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getLevel();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLOD setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>range</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Viewer range from geographic-coordinates center triggers quadtree loading/unloading.
 * <ul>
 *  <li> <i> Hint:</i>  not setting range values indicates that level switching can be optimized automatically based on performance. </li> 
 * </ul>
	 * @return value of range field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getRange();

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>range</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Viewer range from geographic-coordinates center triggers quadtree loading/unloading.
 * <ul>
 *  <li> <i> Hint:</i>  not setting range values indicates that level switching can be optimized automatically based on performance. </li> 
 * </ul>
	 * @param newValue is new value for the range field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setRange(float newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from initializeOnly MFNode field <i>rootNode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of rootNode field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public X3DNode[] getRootNode(); // acceptable node types #1: X3DChildNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to initializeOnly MFNode field <i>rootNode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value for the rootNode field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setRootNode(X3DNode[] newValue); // acceptable node types #2: X3DChildNode

	/**
	 * Add array of child rootNode nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value array to be appended the rootNode field.
	 */
	public void addRootNode(X3DNode[] newValue); // acceptable node types #3: X3DChildNode
	/**
	 * Set single child rootNode node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the rootNode field
	 */
	public void setRootNode(X3DNode newValue); // acceptable node types #5: X3DChildNode
	/**
	 * Provide array of String results from initializeOnly MFString field named <i>rootUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> url for scene providing geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * @return value of rootUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getRootUrl();

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>rootUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> url for scene providing geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * @param newValue is new value for the rootUrl field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLOD setRootUrl(String[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link GeoLOD} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLOD setVisible(boolean newValue);

}
