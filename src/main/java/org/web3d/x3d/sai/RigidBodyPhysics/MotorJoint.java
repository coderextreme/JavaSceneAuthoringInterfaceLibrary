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

package org.web3d.x3d.sai.RigidBodyPhysics;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * MotorJoint drives relative angular velocities between body1 and body2 within a common reference frame.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DRigidJointNode] MotorJoint drives relative angular velocities between body1 and body2 within a common reference frame. Contains two RigidBody nodes (containerField values body1, body2).
 * <ul>
 *  <li> <i>Hint:</i> useful in combination with BallJoint. </li> 
 *  <li> <i>Hint:</i>  RigidBodyPhysics component, level 2. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#MotorJoint" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#MotorJoint" target="blank">X3D Abstract Specification: MotorJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#MotorJoint" target="_blank">X3D Tooltips: MotorJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface MotorJoint extends X3DRigidJointNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>autoCalc</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoCalc controls whether user manually provides individual angle rotations each frame (false) or if angle values are automatically calculated by motor implementations (true).  * <br>

	 * @return value of autoCalc field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public boolean getAutoCalc();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>autoCalc</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoCalc controls whether user manually provides individual angle rotations each frame (false) or if angle values are automatically calculated by motor implementations (true).  * <br>

	 * @param newValue is new value for the autoCalc field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAutoCalc(boolean newValue);

	/**
	 * Provide float value unit axis, angle (in radians) from inputOutput SFFloat field named <i>axis1Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis1Angle (radians) is rotation angle for corresponding motor axis when in user-calculated mode.
 * <ul>
 *  <li> <i> Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of axis1Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getAxis1Angle();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to inputOutput SFFloat field named <i>axis1Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis1Angle (radians) is rotation angle for corresponding motor axis when in user-calculated mode.
 * <ul>
 *  <li> <i> Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the axis1Angle field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAxis1Angle(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>axis1Torque</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  axis1Torque is rotational torque applied by corresponding motor axis when in user-calculated mode.  * <br>

	 * @return value of axis1Torque field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getAxis1Torque();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>axis1Torque</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  axis1Torque is rotational torque applied by corresponding motor axis when in user-calculated mode.  * <br>

	 * @param newValue is new value for the axis1Torque field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAxis1Torque(float newValue);

	/**
	 * Provide float value unit axis, angle (in radians) from inputOutput SFFloat field named <i>axis2Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis2Angle (radians) is rotation angle for corresponding motor axis when in user-calculated mode.
 * <ul>
 *  <li> <i> Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of axis2Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getAxis2Angle();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to inputOutput SFFloat field named <i>axis2Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis2Angle (radians) is rotation angle for corresponding motor axis when in user-calculated mode.
 * <ul>
 *  <li> <i> Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the axis2Angle field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAxis2Angle(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>axis2Torque</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  axis2Torque is rotational torque applied by corresponding motor axis when in user-calculated mode.  * <br>

	 * @return value of axis2Torque field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getAxis2Torque();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>axis2Torque</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  axis2Torque is rotational torque applied by corresponding motor axis when in user-calculated mode.  * <br>

	 * @param newValue is new value for the axis2Torque field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAxis2Torque(float newValue);

	/**
	 * Provide float value unit axis, angle (in radians) from inputOutput SFFloat field named <i>axis3Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis3Angle (radians) is rotation angle for corresponding motor axis when in user-calculated mode.
 * <ul>
 *  <li> <i> Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of axis3Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getAxis3Angle();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to inputOutput SFFloat field named <i>axis3Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis3Angle (radians) is rotation angle for corresponding motor axis when in user-calculated mode.
 * <ul>
 *  <li> <i> Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the axis3Angle field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAxis3Angle(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>axis3Torque</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  axis3Torque is rotational torque applied by corresponding motor axis when in user-calculated mode.  * <br>

	 * @return value of axis3Torque field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getAxis3Torque();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>axis3Torque</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  axis3Torque is rotational torque applied by corresponding motor axis when in user-calculated mode.  * <br>

	 * @param newValue is new value for the axis3Torque field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setAxis3Torque(float newValue);

	/**
	 * Provide RigidBody instance (using a properly typed node) from inputOutput SFNode field <i>body1</i>.
	 * @return value of body1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public RigidBody getBody1(); // acceptable node types #1: RigidBody

	/**
	 * Accessor method to assign RigidBody instance (using a properly typed node) to inputOutput SFNode field <i>body1</i>.
	 * @param newValue is new value for the body1 field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MotorJoint setBody1(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide RigidBody instance (using a properly typed node) from inputOutput SFNode field <i>body2</i>.
	 * @return value of body2 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public RigidBody getBody2(); // acceptable node types #1: RigidBody

	/**
	 * Accessor method to assign RigidBody instance (using a properly typed node) to inputOutput SFNode field <i>body2</i>.
	 * @param newValue is new value for the body2 field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MotorJoint setBody2(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide int value within allowed range of [0,3] from inputOutput SFInt32 field named <i>enabledAxes</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,3] enabledAxes indicates which motor axes are active. (0) none, (1) axis 1, (2) axes 1 and 2, (3) all three axes.  * <br>

	 * @return value of enabledAxes field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public int getEnabledAxes();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>enabledAxes</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,3] enabledAxes indicates which motor axes are active. (0) none, (1) axis 1, (2) axes 1 and 2, (3) all three axes.  * <br>

	 * @param newValue is new value for the enabledAxes field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setEnabledAxes(int newValue);

	/**
	 * Provide array of String enumeration results (baseType forceOutputValues) ['"ALL"' | '"NONE"' | '"etc."'] from inputOutput MFString field named <i>forceOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceOutput controls which output fields are generated for the next frame. Values are ALL, NONE, or exact names of output fields updated at start of next frame.  * <br>

	 * @return value of forceOutput field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getForceOutput();

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"") to inputOutput MFString field named <i>forceOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceOutput controls which output fields are generated for the next frame. Values are ALL, NONE, or exact names of output fields updated at start of next frame.  * <br>

	 * @param newValue is new value for the forceOutput field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MotorJoint setForceOutput(String[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
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
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MotorJoint setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>motor1Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor1Angle provides calculated angle of rotation (radians) for this motor joint from last frame.
 * <ul>
 *  <li> <i>Warning:</i> it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of motor1Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMotor1Angle();
	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>motor1AngleRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor1AngleRate provides calculated anglular rotation rate (radians/second) for this motor joint from last frame.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of motor1AngleRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMotor1AngleRate();
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>motor1Axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor1Axis defines axis vector of corresponding motor axis.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @return value of motor1Axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getMotor1Axis();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>motor1Axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor1Axis defines axis vector of corresponding motor axis.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @param newValue is new value for the motor1Axis field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setMotor1Axis(float[] newValue);

	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>motor2Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor2Angle provides calculated angle of rotation (radians) for this motor joint from last frame.
 * <ul>
 *  <li> <i>Warning:</i> it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of motor2Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMotor2Angle();
	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>motor2AngleRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor2AngleRate provides calculated anglular rotation rate (radians/second) for this motor joint from last frame.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of motor2AngleRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMotor2AngleRate();
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>motor2Axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor2Axis defines axis vector of corresponding motor axis.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @return value of motor2Axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getMotor2Axis();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>motor2Axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor2Axis defines axis vector of corresponding motor axis.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @param newValue is new value for the motor2Axis field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setMotor2Axis(float[] newValue);

	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>motor3Angle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor3Angle provides calculated angle of rotation (radians) for this motor joint from last frame.
 * <ul>
 *  <li> <i>Warning:</i> it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of motor3Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMotor3Angle();
	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>motor3AngleRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor3AngleRate provides calculated anglular rotation rate (radians/second) for this motor joint from last frame.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of motor3AngleRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMotor3AngleRate();
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>motor3Axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor3Axis defines axis vector of corresponding motor axis.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @return value of motor3Axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getMotor3Axis();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>motor3Axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i> motor3Axis defines axis vector of corresponding motor axis.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @param newValue is new value for the motor3Axis field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setMotor3Axis(float[] newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop1Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stop1Bounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop1Bounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop1Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stop1Bounce field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setStop1Bounce(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop1ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stop1ErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop1ErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop1ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stop1ErrorCorrection field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setStop1ErrorCorrection(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop2Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stop2Bounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop2Bounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop2Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stop2Bounce field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setStop2Bounce(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop2ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stop2ErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop2ErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop2ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stop2ErrorCorrection field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setStop2ErrorCorrection(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop3Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop3Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stop3Bounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop3Bounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop3Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop3Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stop3Bounce field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setStop3Bounce(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop3ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop3ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stop3ErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop3ErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop3ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop3ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stop3ErrorCorrection field.
	 * @return {@link MotorJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MotorJoint setStop3ErrorCorrection(float newValue);

}
