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

package org.web3d.x3d.sai.DIS;

import org.web3d.x3d.sai.Grouping.X3DGroupingNode;
import org.web3d.x3d.sai.Networking.X3DNetworkSensorNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * EspduTransform is a networked Transform node that can contain most nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGroupingNode,X3DSensorNode] EspduTransform is a networked Transform node that can contain most nodes. If activated, EspduTransform can send or receive Entity State Protocol Data Unit (PDU) packets, also integrating functionality for the following DIS PDUs: EntityStatePdu, CollisionPdu, DetonatePdu, FirePdu, CreateEntity and RemoveEntity PDUs.
 * <ul>
 *  <li> <i>Hint:</i> these PDU packets use the IEEE Distributed Interactive Simulation (DIS) protocol. </li> 
 *  <li> <i>Hint:</i> Savage Developers Guide on DIS <a href="https://savage.nps.edu/Savage/developers.html#DIS" target="_blank">https://savage.nps.edu/Savage/developers.html#DIS</a> </li> 
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='DIS' level='1'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#EspduTransform" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#EspduTransform" target="blank">X3D Abstract Specification: EspduTransform</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#EspduTransform" target="_blank">X3D Tooltips: EspduTransform</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface EspduTransform extends X3DGroupingNode, X3DNetworkSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String value from inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" Example: 224.2.181.145.  * <br>

	 * @return value of address field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public String getAddress();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" Example: 224.2.181.145.  * <br>

	 * @param newValue is new value for the address field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setAddress(String newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise applicationID is unique for application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of applicationID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getApplicationID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise applicationID is unique for application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the applicationID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setApplicationID(int newValue);

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>articulationParameterArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Information required for representation of the entity's visual appearance and position of its articulated parts.
 * <ul>
 *  <li> <i> Hint:</i>  renamed as Variable Parameter in IEEE DIS 2012 revised standard. </li> 
 * </ul>
	 * @return value of articulationParameterArray field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getArticulationParameterArray();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>articulationParameterArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Information required for representation of the entity's visual appearance and position of its articulated parts.
 * <ul>
 *  <li> <i> Hint:</i>  renamed as Variable Parameter in IEEE DIS 2012 revised standard. </li> 
 * </ul>
	 * @param newValue is new value for the articulationParameterArray field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setArticulationParameterArray(float[] newValue);

	/**
	 * Provide array of int results from inputOutput MFInt32 field named <i>articulationParameterChangeIndicatorArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of change counters, each incremented when an articulated parameter is updated.#IMPLIED] .  * <br>

	 * @return value of articulationParameterChangeIndicatorArray field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int[] getArticulationParameterChangeIndicatorArray();

	/**
	 * Accessor method to assign int array to inputOutput MFInt32 field named <i>articulationParameterChangeIndicatorArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of change counters, each incremented when an articulated parameter is updated.#IMPLIED] .  * <br>

	 * @param newValue is new value for the articulationParameterChangeIndicatorArray field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setArticulationParameterChangeIndicatorArray(int[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>articulationParameterCount</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of articulated parameters attached to this entity state PDU.  * <br>

	 * @return value of articulationParameterCount field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getArticulationParameterCount();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>articulationParameterCount</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of articulated parameters attached to this entity state PDU.  * <br>

	 * @param newValue is new value for the articulationParameterCount field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setArticulationParameterCount(int newValue);

	/**
	 * Provide array of int results from inputOutput MFInt32 field named <i>articulationParameterDesignatorArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of designators for each articulated parameter.  * <br>

	 * @return value of articulationParameterDesignatorArray field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int[] getArticulationParameterDesignatorArray();

	/**
	 * Accessor method to assign int array to inputOutput MFInt32 field named <i>articulationParameterDesignatorArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of designators for each articulated parameter.  * <br>

	 * @param newValue is new value for the articulationParameterDesignatorArray field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setArticulationParameterDesignatorArray(int[] newValue);

	/**
	 * Provide array of int results from inputOutput MFInt32 field named <i>articulationParameterIdPartAttachedToArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of ID parts that each articulated parameter is attached to.  * <br>

	 * @return value of articulationParameterIdPartAttachedToArray field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int[] getArticulationParameterIdPartAttachedToArray();

	/**
	 * Accessor method to assign int array to inputOutput MFInt32 field named <i>articulationParameterIdPartAttachedToArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of ID parts that each articulated parameter is attached to.  * <br>

	 * @param newValue is new value for the articulationParameterIdPartAttachedToArray field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setArticulationParameterIdPartAttachedToArray(int[] newValue);

	/**
	 * Provide array of int results from inputOutput MFInt32 field named <i>articulationParameterTypeArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of type enumerations for each articulated parameter element.  * <br>

	 * @return value of articulationParameterTypeArray field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int[] getArticulationParameterTypeArray();

	/**
	 * Accessor method to assign int array to inputOutput MFInt32 field named <i>articulationParameterTypeArray</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of type enumerations for each articulated parameter element.  * <br>

	 * @param newValue is new value for the articulationParameterTypeArray field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setArticulationParameterTypeArray(int[] newValue);

	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue0_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue0_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue0();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue1_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue1_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue1();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue2_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Get element of user-defined payload array.  * <br>

	 * @return value of articulationParameterValue2_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue2();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue3_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue3_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue3();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue4_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue4_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue4();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue5_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue5_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue5();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue6_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue6_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue6();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>articulationParameterValue7_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Get element of user-defined payload array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of articulationParameterValue7_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getArticulationParameterValue7();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
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
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public EspduTransform setBboxCenter(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
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
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public EspduTransform setBboxSize(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Translation offset from origin of local coordinate system.  * <br>

	 * @return value of center field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getCenter();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Translation offset from origin of local coordinate system.  * <br>

	 * @param newValue is new value for the center field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setCenter(float[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of children field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	@Override
	public X3DNode[] getChildren(); // acceptable node types #1: X3DChildNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] Grouping nodes contain an ordered list of children nodes.
 * <ul>
 *  <li> <i>Hint:</i> Each grouping node defines a coordinate space for its children, relative to the coordinate space of its parent node. Thus transformations accumulate down the scene graph hierarchy. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode addChildren field can append new X3DChildNode nodes via a ROUTE connection, duplicate input nodes (i.e. matching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i> inputOnly MFNode removeChildren field can remove nodes from the children list, unrecognized input nodes (i.e. nonmatching DEF, USE values) are ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 10.2.1 Grouping and children node types, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#GroupingAndChildrenNodes</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value for the children field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public EspduTransform setChildren(X3DNode[] newValue); // acceptable node types #2: X3DChildNode

	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value array to be appended the children field.
	 */
	@Override // or here2?
	public void addChildren(X3DNode[] newValue); // acceptable node types #3: X3DChildNode
	/**
	 * Set single children node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the children field
	 */
	public void setChildren(X3DNode newValue); // acceptable node types #5: X3DChildNode
	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>collideTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When were we collided with?
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of collideTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double getCollideTime();
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>collisionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration for type of collision: ELASTIC or INELASTIC.  * <br>

	 * @return value of collisionType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getCollisionType();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>collisionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration for type of collision: ELASTIC or INELASTIC.  * <br>

	 * @param newValue is new value for the collisionType field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setCollisionType(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>deadReckoning</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Dead reckoning algorithm being used to project position/orientation with velocities/accelerations.  * <br>

	 * @return value of deadReckoning field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getDeadReckoning();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>deadReckoning</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Dead reckoning algorithm being used to project position/orientation with velocities/accelerations.  * <br>

	 * @param newValue is new value for the deadReckoning field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setDeadReckoning(int newValue);

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>detonateTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  When were we detonated?.  * <br>

	 * @return value of detonateTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double getDetonateTime();
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>detonationLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  World coordinates for detonationLocation.  * <br>

	 * @return value of detonationLocation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getDetonationLocation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>detonationLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  World coordinates for detonationLocation.  * <br>

	 * @param newValue is new value for the detonationLocation field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setDetonationLocation(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>detonationRelativeLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Relative coordinates for detonation location.  * <br>

	 * @return value of detonationRelativeLocation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getDetonationRelativeLocation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>detonationRelativeLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Relative coordinates for detonation location.  * <br>

	 * @param newValue is new value for the detonationRelativeLocation field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setDetonationRelativeLocation(float[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>detonationResult</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration for type of detonation and result that occurred., if any.  * <br>

	 * @return value of detonationResult field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getDetonationResult();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>detonationResult</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration for type of detonation and result that occurred., if any.  * <br>

	 * @param newValue is new value for the detonationResult field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setDetonationResult(int newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables the sensor node.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables the sensor node.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public EspduTransform setEnabled(boolean newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityCategory</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for main category that describes the entity, semantics of each code varies according to domain. See DIS Enumerations values.  * <br>

	 * @return value of entityCategory field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntityCategory();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityCategory</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for main category that describes the entity, semantics of each code varies according to domain. See DIS Enumerations values.  * <br>

	 * @param newValue is new value for the entityCategory field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntityCategory(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityCountry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for country to which the design of the entity or its design specification is attributed.  * <br>

	 * @return value of entityCountry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntityCountry();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityCountry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for country to which the design of the entity or its design specification is attributed.  * <br>

	 * @param newValue is new value for the entityCountry field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntityCountry(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityDomain</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for domain in which the entity operates: LAND, AIR, SURFACE, SUBSURFACE, SPACE or OTHER.  * <br>

	 * @return value of entityDomain field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntityDomain();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityDomain</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for domain in which the entity operates: LAND, AIR, SURFACE, SUBSURFACE, SPACE or OTHER.  * <br>

	 * @param newValue is new value for the entityDomain field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntityDomain(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityExtra</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Any extra information required to describe a particular entity. The contents of this field shall depend on the type of entity represented.  * <br>

	 * @return value of entityExtra field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntityExtra();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityExtra</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Any extra information required to describe a particular entity. The contents of this field shall depend on the type of entity represented.  * <br>

	 * @param newValue is new value for the entityExtra field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntityExtra(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise entityID is a unique ID for a single entity within that application.  * <br>

	 * @return value of entityID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntityID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise entityID is a unique ID for a single entity within that application.  * <br>

	 * @param newValue is new value for the entityID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntityID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityKind</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for whether entity is a PLATFORM, MUNITION, LIFE_FORM, ENVIRONMENTAL, CULTURAL_FEATURE, SUPPLY, RADIO, EXPENDABLE, SENSOR_EMITTER or OTHER.  * <br>

	 * @return value of entityKind field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntityKind();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityKind</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for whether entity is a PLATFORM, MUNITION, LIFE_FORM, ENVIRONMENTAL, CULTURAL_FEATURE, SUPPLY, RADIO, EXPENDABLE, SENSOR_EMITTER or OTHER.  * <br>

	 * @param newValue is new value for the entityKind field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntityKind(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entitySpecific</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specific information about an entity based on the Subcategory field. See DIS Enumerations values.  * <br>

	 * @return value of entitySpecific field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntitySpecific();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entitySpecific</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specific information about an entity based on the Subcategory field. See DIS Enumerations values.  * <br>

	 * @param newValue is new value for the entitySpecific field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntitySpecific(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entitySubcategory</i>.
	 * @return value of entitySubcategory field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEntitySubcategory();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entitySubcategory</i>.
	 * @param newValue is new value for the entitySubcategory field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEntitySubcategory(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>eventApplicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise eventApplicationID is unique for events generated from application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of eventApplicationID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEventApplicationID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>eventApplicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise eventApplicationID is unique for events generated from application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the eventApplicationID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEventApplicationID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>eventEntityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  For a given event, simulation/exercise entityID is a unique ID for a single entity within that application.  * <br>

	 * @return value of eventEntityID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEventEntityID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>eventEntityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  For a given event, simulation/exercise entityID is a unique ID for a single entity within that application.  * <br>

	 * @param newValue is new value for the eventEntityID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEventEntityID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>eventNumber</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sequential number of each event issued by an application.
 * <ul>
 *  <li> <i> Warning:</i>  reuse of numbers may be necessary during long simulation exercises. </li> 
 * </ul>
	 * @return value of eventNumber field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEventNumber();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>eventNumber</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sequential number of each event issued by an application.
 * <ul>
 *  <li> <i> Warning:</i>  reuse of numbers may be necessary during long simulation exercises. </li> 
 * </ul>
	 * @param newValue is new value for the eventNumber field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEventNumber(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>eventSiteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @return value of eventSiteID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getEventSiteID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>eventSiteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the eventSiteID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setEventSiteID(int newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>fired1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Has the primary weapon (Fire PDU) been fired?.  * <br>

	 * @return value of fired1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getFired1();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>fired1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Has the primary weapon (Fire PDU) been fired?.  * <br>

	 * @param newValue is new value for the fired1 field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setFired1(boolean newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>fired2</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Has the secondary weapon (Fire PDU) been fired?.  * <br>

	 * @return value of fired2 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getFired2();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>fired2</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Has the secondary weapon (Fire PDU) been fired?.  * <br>

	 * @param newValue is new value for the fired2 field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setFired2(boolean newValue);

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>firedTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When did we shoot a weapon (Fire PDU)?
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of firedTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double getFiredTime();
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>fireMissionIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  .  * <br>

	 * @return value of fireMissionIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getFireMissionIndex();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>fireMissionIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  .  * <br>

	 * @param newValue is new value for the fireMissionIndex field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setFireMissionIndex(int newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>firingRange</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Range (three dimension, straight-line distance) that the firing entity's fire control system has assumed for computing the fire control solution if a weapon and if the value is known.  * <br>

	 * @return value of firingRange field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float getFiringRange();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>firingRange</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Range (three dimension, straight-line distance) that the firing entity's fire control system has assumed for computing the fire control solution if a weapon and if the value is known.  * <br>

	 * @param newValue is new value for the firingRange field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setFiringRange(float newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>firingRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Rate at which munitions are fired.  * <br>

	 * @return value of firingRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getFiringRate();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>firingRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Rate at which munitions are fired.  * <br>

	 * @param newValue is new value for the firingRate field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setFiringRate(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>forceID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceID determines the team membership of the issuing entity, and whether FRIENDLY OPPOSING or NEUTRAL or OTHER.  * <br>

	 * @return value of forceID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getForceID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>forceID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceID determines the team membership of the issuing entity, and whether FRIENDLY OPPOSING or NEUTRAL or OTHER.  * <br>

	 * @param newValue is new value for the forceID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setForceID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>fuse</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for type of fuse on the munition.  * <br>

	 * @return value of fuse field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getFuse();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>fuse</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for type of fuse on the munition.  * <br>

	 * @param newValue is new value for the fuse field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setFuse(int newValue);

	/**
	 * Provide array of 3-tuple double results from inputOutput SFVec3d field named <i>geoCoords</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geographic location (specified in current geoSystem coordinates) for children geometry (specified in relative coordinate system, in meters).
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @return value of geoCoords field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double[] getGeoCoords();

	/**
	 * Accessor method to assign 3-tuple double array to inputOutput SFVec3d field named <i>geoCoords</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geographic location (specified in current geoSystem coordinates) for children geometry (specified in relative coordinate system, in meters).
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @param newValue is new value for the geoCoords field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setGeoCoords(double[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
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
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setGeoSystem(String[] newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Have we received a network update recently?
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	@Override
	public boolean getIsActive();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isCollided</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Has a matching CollisionPDU reported a collision?
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isCollided field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getIsCollided();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isDetonated</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Has a matching DetonationPDU reported a detonation?
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isDetonated field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getIsDetonated();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isNetworkReader</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="remote" (listen to network as copy of remote entity)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isNetworkReader field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getIsNetworkReader();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isNetworkWriter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="master" (output to network as master entity at writeInterval)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isNetworkWriter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getIsNetworkWriter();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isRtpHeaderHeard</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether incoming DIS packets have an RTP header prepended.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isRtpHeaderHeard field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getIsRtpHeaderHeard();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isStandAlone</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="local" (ignore network but still respond to local events)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isStandAlone field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getIsStandAlone();
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>linearAcceleration</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Acceleration of the entity relative to the rotating Earth in either world or entity coordinates, depending on the dead reckoning algorithm used.  * <br>

	 * @return value of linearAcceleration field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getLinearAcceleration();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>linearAcceleration</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Acceleration of the entity relative to the rotating Earth in either world or entity coordinates, depending on the dead reckoning algorithm used.  * <br>

	 * @param newValue is new value for the linearAcceleration field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setLinearAcceleration(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>linearVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Velocity of the entity relative to the rotating Earth in either world or entity coordinates, depending on the dead reckoning algorithm used.  * <br>

	 * @return value of linearVelocity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getLinearVelocity();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>linearVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Velocity of the entity relative to the rotating Earth in either world or entity coordinates, depending on the dead reckoning algorithm used.  * <br>

	 * @param newValue is new value for the linearVelocity field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setLinearVelocity(float[] newValue);

	/**
	 * Provide String value from inputOutput SFString field named <i>marking</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Maximum of 11 characters for simple entity label.  * <br>

	 * @return value of marking field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public String getMarking();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>marking</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Maximum of 11 characters for simple entity label.  * <br>

	 * @param newValue is new value for the marking field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMarking(String newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
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
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public EspduTransform setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String value from inputOutput SFString field named <i>multicastRelayHost</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server address if multicast not available locally. Example: track.nps.edu.  * <br>

	 * @return value of multicastRelayHost field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public String getMulticastRelayHost();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>multicastRelayHost</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server address if multicast not available locally. Example: track.nps.edu.  * <br>

	 * @param newValue is new value for the multicastRelayHost field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMulticastRelayHost(String newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>multicastRelayPort</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server port if multicast not available locally. Example: 8010.  * <br>

	 * @return value of multicastRelayPort field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getMulticastRelayPort();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>multicastRelayPort</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server port if multicast not available locally. Example: 8010.  * <br>

	 * @param newValue is new value for the multicastRelayPort field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMulticastRelayPort(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>munitionApplicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  munitionApplicationID, unique for application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of munitionApplicationID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getMunitionApplicationID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>munitionApplicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  munitionApplicationID, unique for application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the munitionApplicationID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMunitionApplicationID(int newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>munitionEndPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Final point of the munition path from firing weapon to detonation or impact, in exercise coordinates.  * <br>

	 * @return value of munitionEndPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getMunitionEndPoint();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>munitionEndPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Final point of the munition path from firing weapon to detonation or impact, in exercise coordinates.  * <br>

	 * @param newValue is new value for the munitionEndPoint field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMunitionEndPoint(float[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>munitionEntityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  munitionEntityID is unique ID for entity firing munition within that application.  * <br>

	 * @return value of munitionEntityID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getMunitionEntityID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>munitionEntityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  munitionEntityID is unique ID for entity firing munition within that application.  * <br>

	 * @param newValue is new value for the munitionEntityID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMunitionEntityID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>munitionQuantity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Quantity of munitions fired.  * <br>

	 * @return value of munitionQuantity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getMunitionQuantity();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>munitionQuantity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Quantity of munitions fired.  * <br>

	 * @param newValue is new value for the munitionQuantity field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMunitionQuantity(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>munitionSiteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Munition siteID of the participating LAN or organization.  * <br>

	 * @return value of munitionSiteID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getMunitionSiteID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>munitionSiteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Munition siteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the munitionSiteID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMunitionSiteID(int newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>munitionStartPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial point of the munition path from firing weapon to detonation or impact, in exercise coordinates.  * <br>

	 * @return value of munitionStartPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getMunitionStartPoint();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>munitionStartPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial point of the munition path from firing weapon to detonation or impact, in exercise coordinates.  * <br>

	 * @param newValue is new value for the munitionStartPoint field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setMunitionStartPoint(float[] newValue);

	/**
	 * Provide String enumeration value (baseType networkModeChoices) ["standAlone" | "networkReader" | "networkWriter"] from inputOutput SFString field named <i>networkMode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether this entity is ignoring the network, sending DIS packets to the network, or receiving DIS packets from the network. (1) standAlone: ignore network but still respond to events in local scene. (2) networkReader: listen to network and read PDU packets at readInterval, act as remotely linked copy of entity. (3) networkWriter: send PDU packets to network at writeInterval, act as master entity. Default value "standAlone" ensures that DIS network activation within a scene as networkReader or networkWriter is intentional.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Warning:</i>  network activity may have associated security issues. </li> 
 * </ul>
	 * @return value of networkMode field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public String getNetworkMode();

	/**
	 * Accessor method to assign String enumeration value ("standAlone" | "networkReader" | "networkWriter") to inputOutput SFString field named <i>networkMode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether this entity is ignoring the network, sending DIS packets to the network, or receiving DIS packets from the network. (1) standAlone: ignore network but still respond to events in local scene. (2) networkReader: listen to network and read PDU packets at readInterval, act as remotely linked copy of entity. (3) networkWriter: send PDU packets to network at writeInterval, act as master entity. Default value "standAlone" ensures that DIS network activation within a scene as networkReader or networkWriter is intentional.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Warning:</i>  network activity may have associated security issues. </li> 
 * </ul>
	 * @param newValue is new value for the networkMode field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setNetworkMode(String newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Network connection port number (EXAMPLE 3000) for sending or receiving DIS messages. Example: 3000.  * <br>

	 * @return value of port field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getPort();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Network connection port number (EXAMPLE 3000) for sending or receiving DIS messages. Example: 3000.  * <br>

	 * @param newValue is new value for the port field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setPort(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>readInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between read updates, 0 means no reading.
 * <ul>
 *  <li> <i> Hint:</i>  readInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of readInterval field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double getReadInterval();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>readInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between read updates, 0 means no reading.
 * <ul>
 *  <li> <i> Hint:</i>  readInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the readInterval field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setReadInterval(double newValue);

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of children relative to local coordinate system, usually read from (or written to) remote, networked EspduTransform nodes.  * <br>

	 * @return value of rotation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getRotation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>rotation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Orientation of children relative to local coordinate system, usually read from (or written to) remote, networked EspduTransform nodes.  * <br>

	 * @param newValue is new value for the rotation field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setRotation(float[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>rtpHeaderExpected</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether RTP headers are prepended to DIS PDUs.  * <br>

	 * @return value of rtpHeaderExpected field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public boolean getRtpHeaderExpected();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>rtpHeaderExpected</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether RTP headers are prepended to DIS PDUs.  * <br>

	 * @param newValue is new value for the rtpHeaderExpected field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setRtpHeaderExpected(boolean newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @return value of scale field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getScale();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Non-uniform x-y-z scale of child coordinate system, adjusted by center and scaleOrientation.  * <br>

	 * @param newValue is new value for the scale field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setScale(float[] newValue);

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @return value of scaleOrientation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getScaleOrientation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput SFRotation field named <i>scaleOrientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Preliminary rotation of coordinate system before scaling (to allow scaling around arbitrary orientations).  * <br>

	 * @param newValue is new value for the scaleOrientation field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setScaleOrientation(float[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @return value of siteID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getSiteID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the siteID field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setSiteID(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>timestamp</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DIS timestamp received from latest PDU update, converted to X3D SFTime units.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of timestamp field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double getTimestamp();
	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Position of children relative to local coordinate system, usually read from (or written to) remote, networked EspduTransform nodes.  * <br>

	 * @return value of translation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public float[] getTranslation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>translation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Position of children relative to local coordinate system, usually read from (or written to) remote, networked EspduTransform nodes.  * <br>

	 * @param newValue is new value for the translation field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setTranslation(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public EspduTransform setVisible(boolean newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>warhead</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for type of warhead on the munition.  * <br>

	 * @return value of warhead field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public int getWarhead();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>warhead</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for type of warhead on the munition.  * <br>

	 * @param newValue is new value for the warhead field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setWarhead(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>writeInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between write updates, 0 means no writing (sending).
 * <ul>
 *  <li> <i> Hint:</i>  writeInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of writeInterval field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGroupingNode, $additionalInheritanceBaseType=X3DNetworkSensorNode)
	public double getWriteInterval();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>writeInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between write updates, 0 means no writing (sending).
 * <ul>
 *  <li> <i> Hint:</i>  writeInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the writeInterval field.
	 * @return {@link EspduTransform} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public EspduTransform setWriteInterval(double newValue);

}
