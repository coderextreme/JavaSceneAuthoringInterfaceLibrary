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

package org.web3d.x3d.sai.EnvironmentalSensor;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * TransformSensor generates output events when its targetObject enters, exits, and moves within a region in space (defined by a box).
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DEnvironmentalSensorNode] TransformSensor generates output events when its targetObject enters, exits, and moves within a region in space (defined by a box).
 * <ul>
 *  <li> <i>Hint:</i> Each TransformSensor node behaves independently of all other TransformSensor nodes, so that every enabled TransformSensor node affected by targetObject motion sends output events. </li> 
 *  <li> <i>Hint:</i> multiply instanced (DEF/USE) TransformSensor nodes in different locations use the union of all boxes to check for enter and exit, detecting enter and exit for all instances of the box, and sending enter/exit events appropriately. For non-overlapping bounding boxes, position_changed and orientation_changed events are calculated relative to the coordinate system associated with the bounding box in which the proximity was detected. </li> 
 *  <li> <i>Warning:</i> results are undefined if boxes overlap for multiply instanced TransformSensor nodes. </li> 
 *  <li> <i>Warning:</i> a TransformSensor node with a zero-volume box (i.e. any size dimension equal to 0.0) cannot generate events, equivalent to enabled=false. </li> 
 *  <li> <i>Warning:</i>  unlike TouchSensor nodes, there is no notion of a TransformSensor node lower in the scene graph grabbing events. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#TransformSensor" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/envsensor.html#TransformSensor" target="blank">X3D Abstract Specification: TransformSensor</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TransformSensor" target="_blank">X3D Tooltips: TransformSensor</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface TransformSensor extends X3DEnvironmentalSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Translation offset from origin of local coordinate system.  * <br>

	 * @return value of center field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public float[] getCenter();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Translation offset from origin of local coordinate system.  * <br>

	 * @param newValue is new value for the center field.
	 * @return {@link TransformSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransformSensor setCenter(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link TransformSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransformSensor setEnabled(boolean newValue);

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>enterTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Time event generated when targetObject enters the box region for sensor.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of enterTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public double getEnterTime();
	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>exitTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Time event generated when targetObject exits the box region for sensor.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of exitTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public double getExitTime();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive true/false events are sent when triggering the sensor. isActive=true when targetObject enters the box region, isActive=false when targetObject exits the box region.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsActive();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TransformSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransformSensor setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from outputOnly SFRotation field named <i>orientation_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sends rotation event relative to center whenever the target object is contained within the box region and results change.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of orientation_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public float[] getOrientation();
	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>position_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sends translation event relative to center whenever the target object is contained within the box region and results change.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of position_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public float[] getPosition();
	/**
	 * Provide array of 3-tuple float results within allowed range of [0,infinity) from initializeOnly SFVec3f field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) size of intersection box, measured from center in meters.  * <br>

	 * @return value of size field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSize();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) size of intersection box, measured from center in meters.  * <br>

	 * @param newValue is new value for the size field.
	 * @return {@link TransformSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransformSensor setSize(float[] newValue);

	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DGroupingNode|X3DShapeNode, from inputOutput SFNode field <i>targetObject</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGroupingNode|X3DShapeNode] targetObject is the movable geometry represented by any valid X3DGroupingNode or X3DShapeNode which may enter or exit the box.  * <br>

	 * @return value of targetObject field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public X3DNode getTargetObject(); // acceptable node types #1: X3DGroupingNode|X3DShapeNode

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>targetObject</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Grouping.X3DGroupingNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Shape.X3DShapeNode);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DGroupingNode|X3DShapeNode; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i>  [X3DGroupingNode|X3DShapeNode] targetObject is the movable geometry represented by any valid X3DGroupingNode or X3DShapeNode which may enter or exit the box.  * <br>

	 * @param newValue is new value for the targetObject field.
	 * @return {@link TransformSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransformSensor setTargetObject(X3DNode newValue); // acceptable node types #2: X3DGroupingNode|X3DShapeNode

}
