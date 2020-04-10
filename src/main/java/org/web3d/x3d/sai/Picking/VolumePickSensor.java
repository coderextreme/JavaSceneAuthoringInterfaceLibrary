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

package org.web3d.x3d.sai.Picking;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Rendering.*;
import java.util.Arrays;

/**
 * VolumePickSensor tests picking intersections using the pickingGeometry against the pickTarget geometry volume.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DPickSensorNode] VolumePickSensor tests picking intersections using the pickingGeometry against the pickTarget geometry volume.
 * <ul>
 *  <li> <i>Hint:</i> sort order is based on distance between centers of the bounds of the picking geometry and the picked geometry. </li> 
 *  <li> <i>Warning:</i> pickingGeometry volume is defined by the convex hull of the enclosing planes of the provided X3DGeometryNode. If the provided volume is not manifold, pick results are undefined. </li> 
 *  <li> <i>Hint:</i> a pick is successful if any vertex of the pickTarget geometry intersects the volume defined by the pickingGeometry. </li> 
 *  <li> <i>Hint:</i> Sorting is defined based on distance between the centers of the bounds of the picking geometry and the picked geometry. </li> 
 *  <li> <i>Hint:</i> picking is performed between rendered frames of the event model. An author sets up the picking request in one frame by placing a LinePickSensor in the desired location. At the start of the next frame, any picking intersections are reported by the pick sensor. </li> 
 *  <li> <i>Hint:</i> picking notification is performed at the start of the frame for all enabled pick sensors once all other sensors are processed. </li> 
 *  <li> <i>Hint:</i> event timing details are explained in X3D Specification 4.4.8.3 Execution model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModelWarning" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModelWarning</a>: order of contained nodes is significant, single pickingGeometry node must precede pickTarget node array. </li> 
 *  <li> <i>Hint:</i>  any geometry can be used for pickingGeometry node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#VolumePickSensor" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html#VolumePickSensor" target="blank">X3D Abstract Specification: VolumePickSensor</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#VolumePickSensor" target="_blank">X3D Tooltips: VolumePickSensor</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Volume" target="_blank">X3D Scene Authoring Hints: Volume</a>
    */
public interface VolumePickSensor extends X3DPickSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setEnabled(boolean newValue);

	/**
	 * Provide String enumeration value (baseType intersectionTypeValues) ["BOUNDS" | "GEOMETRY" | 'etc.'] from initializeOnly SFString field named <i>intersectionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> intersectionType specifies precision of the collision computation.
 * <ul>
 *  <li> <i>Hint:</i> intersectionType constants may be extended by the browser to provide additional options. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @return value of intersectionType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String getIntersectionType();

	/**
	 * Accessor method to assign String enumeration value ("BOUNDS" | "GEOMETRY") to initializeOnly SFString field named <i>intersectionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> intersectionType specifies precision of the collision computation.
 * <ul>
 *  <li> <i>Hint:</i> intersectionType constants may be extended by the browser to provide additional options. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @param newValue is new value for the intersectionType field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setIntersectionType(String newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive indicates when the intersecting object is picked by the picking geometry. Output event isActive=true gets sent once a picked item is found. Output event isActive=false gets sent once no picked item is found.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsActive();
	/**
	 * Provide String enumeration value (baseType pickSensorMatchCriterionChoices) ["MATCH_ANY" | "MATCH_EVERY" | "MATCH_ONLY_ONE"] from inputOutput SFString field named <i>matchCriterion</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  defines whether the intersection test (i.e. pick) by this X3DPickSensorNode must match one or more objectType. Specifically MATCH_ANY means any match of objectType values is acceptable, MATCH_EVERY means that every objectType value in this node shall match an objectType value in the X3DPickableObject, and MATCH_ONLY_ONE means that one and only one objectType value can match.  * <br>

	 * @return value of matchCriterion field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String getMatchCriterion();

	/**
	 * Accessor method to assign String enumeration value ("MATCH_ANY" | "MATCH_EVERY" | "MATCH_ONLY_ONE") to inputOutput SFString field named <i>matchCriterion</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  defines whether the intersection test (i.e. pick) by this X3DPickSensorNode must match one or more objectType. Specifically MATCH_ANY means any match of objectType values is acceptable, MATCH_EVERY means that every objectType value in this node shall match an objectType value in the X3DPickableObject, and MATCH_ONLY_ONE means that one and only one objectType value can match.  * <br>

	 * @param newValue is new value for the matchCriterion field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setMatchCriterion(String newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String enumeration results with quoted value(s) ["ALL","NONE","TERRAIN",...] from inputOutput MFString field named <i>objectType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The objectType field specifies a set of labels used in the picking process. Each string specified is treated as an independent label that needs to be matched against the same type in one of the pick sensor instances. Example: labeling a PickableGroup with the objectType value "WATER" and then attempting to intersect a pick sensor with objectType value "GROUND" fails since the objectType values do not match. Example: the special value "ALL" means that each node is available for picking regardless of the type specified by the pick sensor. Example: the special value "NONE" effectively disables all picking for this node and is the equivalent of setting the pickable field of the corresponding PickableGroup to false.
 * <ul>
 *  <li> <i>Hint:</i> authors may define any value for objectType. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @return value of objectType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getObjectType();

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"" | ""TERRAIN"") to inputOutput MFString field named <i>objectType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The objectType field specifies a set of labels used in the picking process. Each string specified is treated as an independent label that needs to be matched against the same type in one of the pick sensor instances. Example: labeling a PickableGroup with the objectType value "WATER" and then attempting to intersect a pick sensor with objectType value "GROUND" fails since the objectType values do not match. Example: the special value "ALL" means that each node is available for picking regardless of the type specified by the pick sensor. Example: the special value "NONE" effectively disables all picking for this node and is the equivalent of setting the pickable field of the corresponding PickableGroup to false.
 * <ul>
 *  <li> <i>Hint:</i> authors may define any value for objectType. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the objectType field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setObjectType(String[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from outputOnly MFNode field <i>pickedGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event containing the node or nodes that have been found to intersect with the picking geometry from the last time this node performed a picking operation, given in the local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of pickedGeometry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getPickedGeometry(); // acceptable node types #1: X3DChildNode
	/**
	 * Provide X3DGeometryNode instance (using a properly typed node) from inputOutput SFNode field <i>pickingGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGeometryNode] pickingGeometry specifies the exact geometry coordinates that are used to perform the intersection testing of the picking operation.  * <br>

	 * @return value of pickingGeometry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public X3DGeometryNode getPickingGeometry(); // acceptable node types #1: X3DGeometryNode

	/**
	 * Accessor method to assign X3DGeometryNode instance (using a properly typed node) to inputOutput SFNode field <i>pickingGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGeometryNode] pickingGeometry specifies the exact geometry coordinates that are used to perform the intersection testing of the picking operation.  * <br>

	 * @param newValue is new value for the pickingGeometry field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setPickingGeometry(X3DGeometryNode newValue); // acceptable node types #2: X3DGeometryNode

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to X3DGroupingNode|X3DShapeNode|Inline, from inputOutput MFNode field <i>pickTarget</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGroupingNode|X3DShapeNode|Inline] pickTarget specifies the list of nodes against which picking operations are performed. All nodes declared in this field and their descendents are evaluated for intersections.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @see org.web3d.x3d.sai.Grouping.X3DGroupingNode
	 * @see org.web3d.x3d.sai.Shape.X3DShapeNode
	 * @see org.web3d.x3d.jsail.Networking.InlineObject
	 * @return value of pickTarget field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode[] getPickTarget(); // acceptable node types #1: X3DGroupingNode|X3DShapeNode|Inline

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>pickTarget</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Grouping.X3DGroupingNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Shape.X3DShapeNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Networking.InlineObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DGroupingNode|X3DShapeNode|Inline; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGroupingNode|X3DShapeNode|Inline] pickTarget specifies the list of nodes against which picking operations are performed. All nodes declared in this field and their descendents are evaluated for intersections.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new value for the pickTarget field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setPickTarget(X3DNode[] newValue); // acceptable node types #2: X3DGroupingNode|X3DShapeNode|Inline

	/**
	 * Add array of child pickTarget nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DGroupingNode|X3DShapeNode|Inline.
	 * @param newValue is new value array to be appended the pickTarget field.
	 */
	@Override // or here2?
	public void addPickTarget(X3DNode[] newValue); // acceptable node types #3: X3DGroupingNode|X3DShapeNode|Inline
	/**
	 * Set single child pickTarget node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the pickTarget field
	 */
	public void setPickTarget(X3DNode newValue); // acceptable node types #5: X3DGroupingNode|X3DShapeNode|Inline
	/**
	 * Provide String enumeration value (baseType pickSensorSortOrderValues) ["ANY" | "CLOSEST" | "ALL" | "ALL_SORTED" | 'etc.'] from initializeOnly SFString field named <i>sortOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The sortOrder field determines the order provided for picked output events. Example: ANY means that any single object can satisfy picking conditions for this pick sensor. Consistency of results is not guaranteed. Example: ALL means that every object that satisfies the picking conditions for this pick sensor shall be returned. Example: ALL_SORTED means that every object that satisfies the picking conditions for this pick sensor shall be returned with the order of the output fields provided in a distance-sorted order from closest to farthest away. The exact algorithm for sorting is defined by the individual node definitions. Example: CLOSEST means that the closest object by distance that satisfies the conditions of this pick sensor. *The exact algorithm for distance determination shall be defined by individual node definitions*.
 * <ul>
 *  <li> <i>Hint:</i> browser implementations may define additional values and algorithms beyond these four required values. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @return value of sortOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DPickSensorNode, $additionalInheritanceBaseType=)
	@Override
	public String getSortOrder();

	/**
	 * Accessor method to assign String enumeration value ("ANY" | "CLOSEST" | "ALL" | "ALL_SORTED") to initializeOnly SFString field named <i>sortOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The sortOrder field determines the order provided for picked output events. Example: ANY means that any single object can satisfy picking conditions for this pick sensor. Consistency of results is not guaranteed. Example: ALL means that every object that satisfies the picking conditions for this pick sensor shall be returned. Example: ALL_SORTED means that every object that satisfies the picking conditions for this pick sensor shall be returned with the order of the output fields provided in a distance-sorted order from closest to farthest away. The exact algorithm for sorting is defined by the individual node definitions. Example: CLOSEST means that the closest object by distance that satisfies the conditions of this pick sensor. *The exact algorithm for distance determination shall be defined by individual node definitions*.
 * <ul>
 *  <li> <i>Hint:</i> browser implementations may define additional values and algorithms beyond these four required values. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @param newValue is new value for the sortOrder field.
	 * @return {@link VolumePickSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumePickSensor setSortOrder(String newValue);

}
