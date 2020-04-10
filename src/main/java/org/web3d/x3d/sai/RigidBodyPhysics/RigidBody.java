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

import org.web3d.x3d.sai.Core.X3DNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * RigidBody describes a collection of shapes with a mass distribution that is affected by the physics model.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  (X3D version 3.2 or later) [X3DNode] RigidBody describes a collection of shapes with a mass distribution that is affected by the physics model.
Contains a Sphere, Box, or Cone (containerField='massDensityModel') and multiple CollidableOffset or CollidableShape nodes (containerField='geometry') for animating collidable geometry.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#RigidBody" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#RigidBody" target="blank">X3D Abstract Specification: RigidBody</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#RigidBody" target="_blank">X3D Tooltips: RigidBody</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface RigidBody extends X3DNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide float value from inputOutput SFFloat field named <i>angularDampingFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] angularDampingFactor automatically damps a portion of body motion over time.  * <br>

	 * @return value of angularDampingFactor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getAngularDampingFactor();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>angularDampingFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] angularDampingFactor automatically damps a portion of body motion over time.  * <br>

	 * @param newValue is new value for the angularDampingFactor field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setAngularDampingFactor(float newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>angularVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> angularVelocity sets constant velocity value to object every frame, and reports updates by physics model.
 * <ul>
 *  <li> <i>Hint:</i> initial value only applied during first frame if forces applied. </li> 
 *  <li> <i>Warning:</i>  instantaneous velocity changes may lead to numerical instability. </li> 
 * </ul>
	 * @return value of angularVelocity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getAngularVelocity();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>angularVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> angularVelocity sets constant velocity value to object every frame, and reports updates by physics model.
 * <ul>
 *  <li> <i>Hint:</i> initial value only applied during first frame if forces applied. </li> 
 *  <li> <i>Warning:</i>  instantaneous velocity changes may lead to numerical instability. </li> 
 * </ul>
	 * @param newValue is new value for the angularVelocity field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setAngularVelocity(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>autoDamp</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoDamp enables/disables angularDampingFactor and linearDampingFactor.  * <br>

	 * @return value of autoDamp field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getAutoDamp();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>autoDamp</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoDamp enables/disables angularDampingFactor and linearDampingFactor.  * <br>

	 * @param newValue is new value for the autoDamp field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setAutoDamp(boolean newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>autoDisable</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoDisable toggles operation of disableAngularSpeed, disableLinearSpeed, disableTime.  * <br>

	 * @return value of autoDisable field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getAutoDisable();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>autoDisable</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  autoDisable toggles operation of disableAngularSpeed, disableLinearSpeed, disableTime.  * <br>

	 * @param newValue is new value for the autoDisable field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setAutoDisable(boolean newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>centerOfMass</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  centerOfMass defines local center of mass for physics calculations.  * <br>

	 * @return value of centerOfMass field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getCenterOfMass();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>centerOfMass</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  centerOfMass defines local center of mass for physics calculations.  * <br>

	 * @param newValue is new value for the centerOfMass field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setCenterOfMass(float[] newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>disableAngularSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableAngularSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @return value of disableAngularSpeed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getDisableAngularSpeed();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>disableAngularSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableAngularSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @param newValue is new value for the disableAngularSpeed field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setDisableAngularSpeed(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>disableLinearSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableLinearSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculation, reducing numeric instabilitiess.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @return value of disableLinearSpeed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getDisableLinearSpeed();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>disableLinearSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableLinearSpeed defines lower-limit tolerance value when body is considered at rest and not part of rigid body calculation, reducing numeric instabilitiess.
 * <ul>
 *  <li> <i> Hint:</i>  only activated if autoDisable='true'. </li> 
 * </ul>
	 * @param newValue is new value for the disableLinearSpeed field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setDisableLinearSpeed(float newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>disableTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableTime defines interval when body becomes at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i>Hint:</i> only activated if autoDisable='true' </li> 
 *  <li> <i>Hint:</i>  disableTime is an SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of disableTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public double getDisableTime();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>disableTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) disableTime defines interval when body becomes at rest and not part of rigid body calculations, reducing numeric instabilities.
 * <ul>
 *  <li> <i>Hint:</i> only activated if autoDisable='true' </li> 
 *  <li> <i>Hint:</i>  disableTime is an SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the disableTime field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setDisableTime(double newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setEnabled(boolean newValue);

	/**
	 * Provide array of 3-tuple float results unit axis, angle (in radians) from inputOutput SFVec3f field named <i>finiteRotationAxis</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  finiteRotationAxis specifies vector around which the object rotates.  * <br>

	 * @return value of finiteRotationAxis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getFiniteRotationAxis();

	/**
	 * Accessor method to assign 3-tuple float array unit axis, angle (in radians) to inputOutput SFVec3f field named <i>finiteRotationAxis</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  finiteRotationAxis specifies vector around which the object rotates.  * <br>

	 * @param newValue is new value for the finiteRotationAxis field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setFiniteRotationAxis(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>fixed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> fixed indicates whether body is able to move.
 * <ul>
 *  <li> <i> Hint:</i>  fixed is useful for indicating objects that do not move: walls, ground, etc. </li> 
 * </ul>
	 * @return value of fixed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getFixed();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>fixed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> fixed indicates whether body is able to move.
 * <ul>
 *  <li> <i> Hint:</i>  fixed is useful for indicating objects that do not move: walls, ground, etc. </li> 
 * </ul>
	 * @param newValue is new value for the fixed field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setFixed(boolean newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>forces</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forces defines linear force values applied to the object every frame.  * <br>

	 * @return value of forces field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getForces();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>forces</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forces defines linear force values applied to the object every frame.  * <br>

	 * @param newValue is new value for the forces field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setForces(float[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>geometry</i>.
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollidableNode.
	 * @see org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode
	 * @return value of geometry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public X3DNode[] getGeometry(); // acceptable node types #1: X3DNBodyCollidableNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>geometry</i>.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollidableNode.
	 * @param newValue is new value for the geometry field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setGeometry(X3DNode[] newValue); // acceptable node types #2: X3DNBodyCollidableNode

	/**
	 * Add array of child geometry nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollidableNode.
	 * @param newValue is new value array to be appended the geometry field.
	 */
	public void addGeometry(X3DNode[] newValue); // acceptable node types #3: X3DNBodyCollidableNode
	/**
	 * Set single child geometry node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the geometry field
	 */
	public void setGeometry(X3DNode newValue); // acceptable node types #5: X3DNBodyCollidableNode
	/**
	 * Provide array of float results from inputOutput SFMatrix3f field named <i>inertia</i>.
	 * <br><br>
	 * <i>Tooltip:</i> inertia matrix defines a 3x2 inertia tensor matrix.
 * <ul>
 *  <li> <i> Warning:</i>  only the first 6 values are used. </li> 
 * </ul>
	 * @return value of inertia field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getInertia();

	/**
	 * Accessor method to assign float array to inputOutput SFMatrix3f field named <i>inertia</i>.
	 * <br><br>
	 * <i>Tooltip:</i> inertia matrix defines a 3x2 inertia tensor matrix.
 * <ul>
 *  <li> <i> Warning:</i>  only the first 6 values are used. </li> 
 * </ul>
	 * @param newValue is new value for the inertia field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setInertia(float[] newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>linearDampingFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] linearDampingFactor automatically damps a portion of body motion over time.  * <br>

	 * @return value of linearDampingFactor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getLinearDampingFactor();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>linearDampingFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] linearDampingFactor automatically damps a portion of body motion over time.  * <br>

	 * @param newValue is new value for the linearDampingFactor field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setLinearDampingFactor(float newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>linearVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> linearVelocity sets constant velocity value to object every frame, and reports updates by physics model.
 * <ul>
 *  <li> <i>Hint:</i> initial value only applied during first frame if forces applied. </li> 
 *  <li> <i>Warning:</i>  instantaneous velocity changes may lead to numerical instability. </li> 
 * </ul>
	 * @return value of linearVelocity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getLinearVelocity();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>linearVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> linearVelocity sets constant velocity value to object every frame, and reports updates by physics model.
 * <ul>
 *  <li> <i>Hint:</i> initial value only applied during first frame if forces applied. </li> 
 *  <li> <i>Warning:</i>  instantaneous velocity changes may lead to numerical instability. </li> 
 * </ul>
	 * @param newValue is new value for the linearVelocity field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setLinearVelocity(float[] newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,1] mass of the body in kilograms.
 * <ul>
 *  <li> <i>Warning:</i> mass must be greater than 0. </li> 
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @return value of mass field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float getMass();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,1] mass of the body in kilograms.
 * <ul>
 *  <li> <i>Warning:</i> mass must be greater than 0. </li> 
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @param newValue is new value for the mass field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setMass(float newValue);

	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to Sphere|Box|Cone, from inputOutput SFNode field <i>massDensityModel</i>.
	 * @return value of massDensityModel field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public X3DNode getMassDensityModel(); // acceptable node types #1: Sphere|Box|Cone

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>massDensityModel</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Geometry3D.SphereObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Geometry3D.BoxObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.Geometry3D.ConeObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes Sphere|Box|Cone; newValue=" + newValue);
		}

	 * @param newValue is new value for the massDensityModel field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setMassDensityModel(X3DNode newValue); // acceptable node types #2: Sphere|Box|Cone

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public RigidBody setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>orientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  orientation sets body direction in world space, then reports physics updates.  * <br>

	 * @return value of orientation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getOrientation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>orientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  orientation sets body direction in world space, then reports physics updates.  * <br>

	 * @param newValue is new value for the orientation field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setOrientation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>position</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  position sets body location in world space, then reports physics updates.  * <br>

	 * @return value of position field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getPosition();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>position</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  position sets body location in world space, then reports physics updates.  * <br>

	 * @param newValue is new value for the position field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setPosition(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>torques</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  torques defines rotational force values applied to the object every frame.  * <br>

	 * @return value of torques field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getTorques();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>torques</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  torques defines rotational force values applied to the object every frame.  * <br>

	 * @param newValue is new value for the torques field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setTorques(float[] newValue);

	/**
	 * Provide boolean value unit axis, angle (in radians) from inputOutput SFBool field named <i>useFiniteRotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  useFiniteRotation enables/disables higher-resolution, higher-cost computational method for calculating rotations.  * <br>

	 * @return value of useFiniteRotation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getUseFiniteRotation();

	/**
	 * Accessor method to assign boolean value unit axis, angle (in radians) to inputOutput SFBool field named <i>useFiniteRotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  useFiniteRotation enables/disables higher-resolution, higher-cost computational method for calculating rotations.  * <br>

	 * @param newValue is new value for the useFiniteRotation field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setUseFiniteRotation(boolean newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>useGlobalGravity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> useGlobalGravity indicates whether this particular body is influenced by parent RigidBodyCollection's gravity setting.
 * <ul>
 *  <li> <i> Hint:</i>  contained sub-bodies are not affected by this setting. </li> 
 * </ul>
	 * @return value of useGlobalGravity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public boolean getUseGlobalGravity();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>useGlobalGravity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> useGlobalGravity indicates whether this particular body is influenced by parent RigidBodyCollection's gravity setting.
 * <ul>
 *  <li> <i> Hint:</i>  contained sub-bodies are not affected by this setting. </li> 
 * </ul>
	 * @param newValue is new value for the useGlobalGravity field.
	 * @return {@link RigidBody} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public RigidBody setUseGlobalGravity(boolean newValue);

}
