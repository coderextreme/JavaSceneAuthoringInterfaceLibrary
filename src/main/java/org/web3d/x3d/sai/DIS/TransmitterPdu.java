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

import org.web3d.x3d.sai.Networking.X3DNetworkSensorNode;
import org.web3d.x3d.sai.Grouping.X3DBoundedObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * TransmitterPdu is a networked Protocol Data Unit (PDU) information node that provides detailed information about a radio transmitter modeled in a simulation.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNetworkSensorNode,X3DBoundedObject] TransmitterPdu is a networked Protocol Data Unit (PDU) information node that provides detailed information about a radio transmitter modeled in a simulation.
 * <ul>
 *  <li> <i>Hint:</i> TransmitterPdu packets use the IEEE Distributed Interactive Simulation (DIS) protocol. </li> 
 *  <li> <i>Hint:</i> Savage Developers Guide on DIS <a href="https://savage.nps.edu/Savage/developers.html#DIS" target="_blank">https://savage.nps.edu/Savage/developers.html#DIS</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='DIS' level='1'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#TransmitterPdu" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#TransmitterPdu" target="blank">X3D Abstract Specification: TransmitterPdu</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TransmitterPdu" target="_blank">X3D Tooltips: TransmitterPdu</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface TransmitterPdu extends X3DNetworkSensorNode, X3DBoundedObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String value from inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" example: 224.2.181.145.  * <br>

	 * @return value of address field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String getAddress();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" example: 224.2.181.145.  * <br>

	 * @param newValue is new value for the address field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setAddress(String newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>antennaLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  World coordinates for antenna location.  * <br>

	 * @return value of antennaLocation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getAntennaLocation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>antennaLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  World coordinates for antenna location.  * <br>

	 * @param newValue is new value for the antennaLocation field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setAntennaLocation(float[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>antennaPatternLength</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  .  * <br>

	 * @return value of antennaPatternLength field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getAntennaPatternLength();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>antennaPatternLength</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  .  * <br>

	 * @param newValue is new value for the antennaPatternLength field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setAntennaPatternLength(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>antennaPatternType</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Antenna shape pattern: 0 for omnidirectional, 1 for beam, 2 for spherical harmonic (deprecated), or optional higher value.  * <br>

	 * @return value of antennaPatternType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getAntennaPatternType();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>antennaPatternType</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Antenna shape pattern: 0 for omnidirectional, 1 for beam, 2 for spherical harmonic (deprecated), or optional higher value.  * <br>

	 * @param newValue is new value for the antennaPatternType field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setAntennaPatternType(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of applicationID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getApplicationID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the applicationID field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setApplicationID(int newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransmitterPdu setBboxCenter(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransmitterPdu setBboxSize(float[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>cryptoKeyID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Nonzero value corresponding to the simulated cryptographic key. Enumerations value 0 indicates plain (unencrypted) communications.  * <br>

	 * @return value of cryptoKeyID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getCryptoKeyID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>cryptoKeyID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Nonzero value corresponding to the simulated cryptographic key. Enumerations value 0 indicates plain (unencrypted) communications.  * <br>

	 * @param newValue is new value for the cryptoKeyID field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setCryptoKeyID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>cryptoSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Indicates type of crypto system being used, even if the encryption equipment is not keyed. Value 0 for No Encryption Device, higher enumerations values correspond to other specific equipment..  * <br>

	 * @return value of cryptoSystem field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getCryptoSystem();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>cryptoSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Indicates type of crypto system being used, even if the encryption equipment is not keyed. Value 0 for No Encryption Device, higher enumerations values correspond to other specific equipment..  * <br>

	 * @param newValue is new value for the cryptoSystem field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setCryptoSystem(int newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables the sensor node.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables the sensor node.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransmitterPdu setEnabled(boolean newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  EntityID unique ID for entity within that application.  * <br>

	 * @return value of entityID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getEntityID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  EntityID unique ID for entity within that application.  * <br>

	 * @param newValue is new value for the entityID field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setEntityID(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>frequency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Transmission frequency in Hz. If the radio is in frequency hopping mode, this field may be set to the center of the frequency hopping band currently in use, or to some other appropriate value.  * <br>

	 * @return value of frequency field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getFrequency();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>frequency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Transmission frequency in Hz. If the radio is in frequency hopping mode, this field may be set to the center of the frequency hopping band currently in use, or to some other appropriate value.  * <br>

	 * @param newValue is new value for the frequency field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setFrequency(int newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setGeoCoords(double[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setGeoSystem(String[] newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>inputSource</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Source of transmission input. Enumerations value 0 for Other, 1 for Pilot, 2 for Copilot, 3 for First Officer, 4 for Driver, 5 for Loader, 6 for Gunner, 7 for Commander, 8 for Digital Data Device, 9 for Intercom, 10 for Audio Jammer, 11 for Data Jammer, 12 for GPS Jammer, 13 for GPS Meaconer (masking beacon).  * <br>

	 * @return value of inputSource field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getInputSource();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>inputSource</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Source of transmission input. Enumerations value 0 for Other, 1 for Pilot, 2 for Copilot, 3 for First Officer, 4 for Driver, 5 for Loader, 6 for Gunner, 7 for Commander, 8 for Digital Data Device, 9 for Intercom, 10 for Audio Jammer, 11 for Data Jammer, 12 for GPS Jammer, 13 for GPS Meaconer (masking beacon).  * <br>

	 * @param newValue is new value for the inputSource field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setInputSource(int newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Have we had a network update recently?.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getIsActive();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isNetworkReader</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="remote" (listen to network as copy of remote entity)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isNetworkReader field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public boolean getIsStandAlone();
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>lengthOfModulationParameters</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  .  * <br>

	 * @return value of lengthOfModulationParameters field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getLengthOfModulationParameters();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>lengthOfModulationParameters</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  .  * <br>

	 * @param newValue is new value for the lengthOfModulationParameters field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setLengthOfModulationParameters(int newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransmitterPdu setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>modulationTypeDetail</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration containing detailed information depending on the major modulation type.  * <br>

	 * @return value of modulationTypeDetail field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getModulationTypeDetail();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>modulationTypeDetail</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration containing detailed information depending on the major modulation type.  * <br>

	 * @param newValue is new value for the modulationTypeDetail field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setModulationTypeDetail(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>modulationTypeMajor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration containing major classification of the modulation type. Enumerations value 0 for No Statement, 1 for Amplitude, 2 for Amplitude and Angle, 3 for Angle, 4 for Combination, 5 for Pulse, 6 for Unmodulated, 7 for Carrier Phase Shift Modulation (CPSM).  * <br>

	 * @return value of modulationTypeMajor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getModulationTypeMajor();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>modulationTypeMajor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration containing major classification of the modulation type. Enumerations value 0 for No Statement, 1 for Amplitude, 2 for Amplitude and Angle, 3 for Angle, 4 for Combination, 5 for Pulse, 6 for Unmodulated, 7 for Carrier Phase Shift Modulation (CPSM).  * <br>

	 * @param newValue is new value for the modulationTypeMajor field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setModulationTypeMajor(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>modulationTypeSpreadSpectrum</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Indicates the spread spectrum technique or combination of spread spectrum techniques in use.  * <br>

	 * @return value of modulationTypeSpreadSpectrum field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getModulationTypeSpreadSpectrum();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>modulationTypeSpreadSpectrum</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Indicates the spread spectrum technique or combination of spread spectrum techniques in use.  * <br>

	 * @param newValue is new value for the modulationTypeSpreadSpectrum field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setModulationTypeSpreadSpectrum(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>modulationTypeSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specifies radio system associated with this Transmitter PDU and used to interpret other fields whose values depend on a specific radio system.  * <br>

	 * @return value of modulationTypeSystem field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getModulationTypeSystem();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>modulationTypeSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specifies radio system associated with this Transmitter PDU and used to interpret other fields whose values depend on a specific radio system.  * <br>

	 * @param newValue is new value for the modulationTypeSystem field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setModulationTypeSystem(int newValue);

	/**
	 * Provide String value from inputOutput SFString field named <i>multicastRelayHost</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server address if multicast not available locally. For example: track.nps.edu.  * <br>

	 * @return value of multicastRelayHost field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String getMulticastRelayHost();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>multicastRelayHost</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server address if multicast not available locally. For example: track.nps.edu.  * <br>

	 * @param newValue is new value for the multicastRelayHost field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setMulticastRelayHost(String newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>multicastRelayPort</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server port if multicast not available locally. For example: 8010.  * <br>

	 * @return value of multicastRelayPort field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getMulticastRelayPort();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>multicastRelayPort</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server port if multicast not available locally. For example: 8010.  * <br>

	 * @param newValue is new value for the multicastRelayPort field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setMulticastRelayPort(int newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setNetworkMode(String newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network port, for example: 3000.  * <br>

	 * @return value of port field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getPort();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network port, for example: 3000.  * <br>

	 * @param newValue is new value for the port field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setPort(int newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>power</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Power that radio would be capable of outputting if on and transmitting, independent of actual transmit state of the radio.  * <br>

	 * @return value of power field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getPower();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>power</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Power that radio would be capable of outputting if on and transmitting, independent of actual transmit state of the radio.  * <br>

	 * @param newValue is new value for the power field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setPower(float newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioEntityTypeCategory</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration containing EntityType of transmitter radio. Enumerations value: 0 for Other, 1 for Generic Radio or Simple Intercom, 2 for HAVE QUICK, 3 for HAVE QUICK II, 4 for HAVE QUICK IIA, 5 for SINCGARS, 6 for CCTT SINCGARS, 7 for EPLRS (Enhanced Position Location Reporting System), 8 for JTIDS/MIDS, 9 for Link 11, 10 for Link 11B, 11 for L-Band SATCOM, 12 for Enhanced SINCGARS 7.3, 13 for Navigation Aid.  * <br>

	 * @return value of radioEntityTypeCategory field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioEntityTypeCategory();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioEntityTypeCategory</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumeration containing EntityType of transmitter radio. Enumerations value: 0 for Other, 1 for Generic Radio or Simple Intercom, 2 for HAVE QUICK, 3 for HAVE QUICK II, 4 for HAVE QUICK IIA, 5 for SINCGARS, 6 for CCTT SINCGARS, 7 for EPLRS (Enhanced Position Location Reporting System), 8 for JTIDS/MIDS, 9 for Link 11, 10 for Link 11B, 11 for L-Band SATCOM, 12 for Enhanced SINCGARS 7.3, 13 for Navigation Aid.  * <br>

	 * @param newValue is new value for the radioEntityTypeCategory field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioEntityTypeCategory(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioEntityTypeCountry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for country to which the design of the entity or its design specification is attributed.  * <br>

	 * @return value of radioEntityTypeCountry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioEntityTypeCountry();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioEntityTypeCountry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for country to which the design of the entity or its design specification is attributed.  * <br>

	 * @param newValue is new value for the radioEntityTypeCountry field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioEntityTypeCountry(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioEntityTypeDomain</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for domain in which the entity operates: LAND, AIR, SURFACE, SUBSURFACE, SPACE or OTHER.  * <br>

	 * @return value of radioEntityTypeDomain field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioEntityTypeDomain();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioEntityTypeDomain</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for domain in which the entity operates: LAND, AIR, SURFACE, SUBSURFACE, SPACE or OTHER.  * <br>

	 * @param newValue is new value for the radioEntityTypeDomain field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioEntityTypeDomain(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioEntityTypeKind</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for whether entity is a PLATFORM, MUNITION, LIFE_FORM, ENVIRONMENTAL, CULTURAL_FEATURE, SUPPLY, RADIO, EXPENDABLE, SENSOR_EMITTER or OTHER.  * <br>

	 * @return value of radioEntityTypeKind field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioEntityTypeKind();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioEntityTypeKind</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for whether entity is a PLATFORM, MUNITION, LIFE_FORM, ENVIRONMENTAL, CULTURAL_FEATURE, SUPPLY, RADIO, EXPENDABLE, SENSOR_EMITTER or OTHER.  * <br>

	 * @param newValue is new value for the radioEntityTypeKind field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioEntityTypeKind(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioEntityTypeNomenclature</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value indicating nomenclature (name) for a particular emitter. See DIS enumerations reference for value/name pairs.  * <br>

	 * @return value of radioEntityTypeNomenclature field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioEntityTypeNomenclature();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioEntityTypeNomenclature</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value indicating nomenclature (name) for a particular emitter. See DIS enumerations reference for value/name pairs.  * <br>

	 * @param newValue is new value for the radioEntityTypeNomenclature field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioEntityTypeNomenclature(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioEntityTypeNomenclatureVersion</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Named equipment version number.  * <br>

	 * @return value of radioEntityTypeNomenclatureVersion field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioEntityTypeNomenclatureVersion();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioEntityTypeNomenclatureVersion</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Named equipment version number.  * <br>

	 * @param newValue is new value for the radioEntityTypeNomenclatureVersion field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioEntityTypeNomenclatureVersion(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Identifies a particular radio within a given entity.  * <br>

	 * @return value of radioID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getRadioID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Identifies a particular radio within a given entity.  * <br>

	 * @param newValue is new value for the radioID field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRadioID(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>readInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between read updates, 0 means no reading.
 * <ul>
 *  <li> <i> Hint:</i>  readInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of readInterval field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public double getReadInterval();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>readInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between read updates, 0 means no reading.
 * <ul>
 *  <li> <i> Hint:</i>  readInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the readInterval field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setReadInterval(double newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>relativeAntennaLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Relative coordinates for antenna location.  * <br>

	 * @return value of relativeAntennaLocation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getRelativeAntennaLocation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>relativeAntennaLocation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Relative coordinates for antenna location.  * <br>

	 * @param newValue is new value for the relativeAntennaLocation field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRelativeAntennaLocation(float[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>rtpHeaderExpected</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether RTP headers are prepended to DIS PDUs.  * <br>

	 * @return value of rtpHeaderExpected field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public boolean getRtpHeaderExpected();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>rtpHeaderExpected</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether RTP headers are prepended to DIS PDUs.  * <br>

	 * @param newValue is new value for the rtpHeaderExpected field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setRtpHeaderExpected(boolean newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @return value of siteID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getSiteID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the siteID field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setSiteID(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>timestamp</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DIS timestamp in X3D units (value 0.0 matches 1 January 1970) in seconds.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of timestamp field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public double getTimestamp();
	/**
	 * Provide float value from inputOutput SFFloat field named <i>transmitFrequencyBandwidth</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Bandwidth of the particular transmitter measured between the half-power (-3 dB) points (this value represents total bandwidth, not the deviation from the center frequency).  * <br>

	 * @return value of transmitFrequencyBandwidth field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getTransmitFrequencyBandwidth();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>transmitFrequencyBandwidth</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Bandwidth of the particular transmitter measured between the half-power (-3 dB) points (this value represents total bandwidth, not the deviation from the center frequency).  * <br>

	 * @param newValue is new value for the transmitFrequencyBandwidth field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setTransmitFrequencyBandwidth(float newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>transmitState</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specify radio transmission state where enumerations value 0 is for off, value 1 for powered but not transmitting, or value 1 is for powered and transmitting,.  * <br>

	 * @return value of transmitState field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getTransmitState();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>transmitState</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specify radio transmission state where enumerations value 0 is for off, value 1 for powered but not transmitting, or value 1 is for powered and transmitting,.  * <br>

	 * @param newValue is new value for the transmitState field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setTransmitState(int newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TransmitterPdu setVisible(boolean newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>whichGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Select geometry to render: -1 for no geometry, 0 for text trace, 1 for default geometry, (optional) higher values to render different states.  * <br>

	 * @return value of whichGeometry field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public int getWhichGeometry();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>whichGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Select geometry to render: -1 for no geometry, 0 for text trace, 1 for default geometry, (optional) higher values to render different states.  * <br>

	 * @param newValue is new value for the whichGeometry field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setWhichGeometry(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>writeInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between write updates, 0 means no writing (sending).
 * <ul>
 *  <li> <i> Hint:</i>  writeInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of writeInterval field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public double getWriteInterval();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>writeInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between write updates, 0 means no writing (sending).
 * <ul>
 *  <li> <i> Hint:</i>  writeInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the writeInterval field.
	 * @return {@link TransmitterPdu} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TransmitterPdu setWriteInterval(double newValue);

}
