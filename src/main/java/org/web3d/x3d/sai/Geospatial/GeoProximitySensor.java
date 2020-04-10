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

import org.web3d.x3d.sai.EnvironmentalSensor.X3DEnvironmentalSensorNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Geospatial.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * GeoProximitySensor generates events when the viewer enters, exits and moves within a region of space (defined by a box).
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DEnvironmentalSensorNode] GeoProximitySensor generates events when the viewer enters, exits and moves within a region of space (defined by a box).
 * <ul>
 *  <li> <i>Hint:</i> multiple USEd instances are cumulative, but avoid overlaps. </li> 
 *  <li> <i>Hint:</i> can first use GeoTransform to relocate/reorient box. </li> 
 *  <li> <i>Hint:</i> surround entire world to start behaviors once scene is loaded. </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='2'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#GeoProximitySensor" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#GeoProximitySensor" target="blank">X3D Abstract Specification: GeoProximitySensor</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#GeoProximitySensor" target="_blank">X3D Tooltips: GeoProximitySensor</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface GeoProximitySensor extends X3DEnvironmentalSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple double results from inputOutput SFVec3d field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (starting with v3.3) Position offset from origin of local coordinate system.  * <br>

	 * @return value of center field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public double[] getCenter();

	/**
	 * Accessor method to assign 3-tuple double array to inputOutput SFVec3d field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (starting with v3.3) Position offset from origin of local coordinate system.  * <br>

	 * @param newValue is new value for the center field.
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoProximitySensor setCenter(double[] newValue);

	/**
	 * Provide array of 3-tuple float results unit axis, angle (in radians) from outputOnly SFVec3f field named <i>centerOfRotation_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sends changed centerOfRotation values, likely caused by user interaction.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of centerOfRotation_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public float[] getCenterOfRotation();
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
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoProximitySensor setEnabled(boolean newValue);

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>enterTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Time event generated when user's camera enters the box.
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
	 * <i>Tooltip:</i> Time event generated when user's camera exits the box.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of exitTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public double getExitTime();
	/**
	 * Provide array of 3-tuple double results from inputOutput SFVec3d field named <i>geoCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (deprecated as of v3.3) Position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @return value of geoCenter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public double[] getGeoCenter();

	/**
	 * Accessor method to assign 3-tuple double array to inputOutput SFVec3d field named <i>geoCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (deprecated as of v3.3) Position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @param newValue is new value for the geoCenter field.
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoProximitySensor setGeoCenter(double[] newValue);

	/**
	 * Provide array of 3-tuple double results from outputOnly SFVec3d field named <i>geoCoord_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sends geospatial coordinates of viewer's position corresponding to world position returned by position_changed.
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of geoCoord_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public double[] getGeoCoord();
	/**
	 * Provide GeoOrigin instance (using a properly typed node) (deprecated node, optional) from initializeOnly SFNode field <i>geoOrigin</i>.
	 * @return value of geoOrigin field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	public GeoOrigin getGeoOrigin(); // acceptable node types #1: GeoOrigin

	/**
	 * Accessor method to assign GeoOrigin instance (using a properly typed node) to initializeOnly SFNode field <i>geoOrigin</i>.
	 * @param newValue is new value for the geoOrigin field.
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoProximitySensor setGeoOrigin(GeoOrigin newValue); // acceptable node types #2: GeoOrigin

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoProximitySensor setGeoSystem(String[] newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive true/false events are sent as viewer enters/exits Proximity box. isActive=true when viewer enters Proximity box, isActive=false when viewer exits Proximity box.
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
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoProximitySensor setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from outputOnly SFRotation field named <i>orientation_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Sends rotation event relative to center.
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
	 * <i>Tooltip:</i> Sends translation event relative to center.
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
	 * <i>Tooltip:</i> [0,+infinity) size of Proximity box.
 * <ul>
 *  <li> <i> Hint:</i>  size 0 0 0 is same as enabled false. </li> 
 * </ul>
	 * @return value of size field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DEnvironmentalSensorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSize();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) size of Proximity box.
 * <ul>
 *  <li> <i> Hint:</i>  size 0 0 0 is same as enabled false. </li> 
 * </ul>
	 * @param newValue is new value for the size field.
	 * @return {@link GeoProximitySensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoProximitySensor setSize(float[] newValue);

}
