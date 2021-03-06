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

package org.web3d.x3d.sai.Networking;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Networking.*;
import java.util.Arrays;

/**
 * LoadSensor generates events as watchList child nodes are either loaded or fail to load.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNetworkSensorNode] LoadSensor generates events as watchList child nodes are either loaded or fail to load. Changing watchlist child nodes restarts the LoadSensor.
 * <ul>
 *  <li> <i>Hint:</i> use multiple LoadSensor nodes to track multiple loading nodes individually. </li> 
 *  <li> <i>Hint:</i> Background is not sensed due to multiple-image ambiguity. </li> 
 *  <li> <i>Warning:</i> watchList child nodes are not rendered, so normally USE copies of other nodes to sense load status. </li> 
 *  <li> <i>Hint:</i> use Inline 'load' field to prompt or defer loading. </li> 
 *  <li> <i>Warning:</i>  new X3D node, not supported in VRML97. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#LoadSensor" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/networking.html#LoadSensor" target="blank">X3D Abstract Specification: LoadSensor</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#LoadSensor" target="_blank">X3D Tooltips: LoadSensor</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface LoadSensor extends X3DNetworkSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link LoadSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LoadSensor setEnabled(boolean newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive true/false events are sent when sensing starts/stops.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsActive();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isLoaded</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Notify when all watchList child nodes are loaded, or at least one has failed. Sends true on successfully loading all watchList child nodes. Sends false on timeOut of any watchList child nodes, failure of any watchList child nodes to load, or no local copies available and no network present.
 * <ul>
 *  <li> <i>Hint:</i> use multiple LoadSensor nodes to track multiple loading nodes individually. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isLoaded field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	public boolean getIsLoaded();
	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>loadTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Time of successful load complete, not sent on failure.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of loadTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	public double getLoadTime();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link LoadSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LoadSensor setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value from outputOnly SFFloat field named <i>progress</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] Sends 0.0 on start and 1.0 on completion. Intermediate values are browser dependent and always increasing (may indicate fraction of bytes, fraction of expected time or another metric).
 * <ul>
 *  <li> <i>Hint:</i> only 0 and 1 events are guaranteed. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of progress field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	public float getProgress();
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>timeOut</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Time in seconds of maximum load duration prior to declaring failure. Default value zero means use browser defaults.  * <br>

	 * @return value of timeOut field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	public double getTimeOut();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>timeOut</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Time in seconds of maximum load duration prior to declaring failure. Default value zero means use browser defaults.  * <br>

	 * @param newValue is new value for the timeOut field.
	 * @return {@link LoadSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LoadSensor setTimeOut(double newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>watchList</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DUrlObject] The watchList field monitors one or more USE nodes that contain a valid url field.
 * <ul>
 *  <li> <i>Hint:</i> if watchList contains multiple USE nodes, output events are only generated when all children have loaded successfully or at least one node has failed. </li> 
 *  <li> <i>Hint:</i> if individual load status information is desired for different nodes, multiple LoadSensor nodes may be used, each with a single watchList element. </li> 
 *  <li> <i>Hint:</i>  Anchor nodes can be monitored for binding a target Viewpoint, loading a new scene, or loading a new scene in a new window. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DUrlObject.
	 * @see org.web3d.x3d.sai.Networking.X3DUrlObject
	 * @return value of watchList field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=)
	public X3DNode[] getWatchList(); // acceptable node types #1: X3DUrlObject

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>watchList</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DUrlObject] The watchList field monitors one or more USE nodes that contain a valid url field.
 * <ul>
 *  <li> <i>Hint:</i> if watchList contains multiple USE nodes, output events are only generated when all children have loaded successfully or at least one node has failed. </li> 
 *  <li> <i>Hint:</i> if individual load status information is desired for different nodes, multiple LoadSensor nodes may be used, each with a single watchList element. </li> 
 *  <li> <i>Hint:</i>  Anchor nodes can be monitored for binding a target Viewpoint, loading a new scene, or loading a new scene in a new window. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DUrlObject.
	 * @param newValue is new value for the watchList field.
	 * @return {@link LoadSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LoadSensor setWatchList(X3DNode[] newValue); // acceptable node types #2: X3DUrlObject

	/**
	 * Add array of child watchList nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DUrlObject.
	 * @param newValue is new value array to be appended the watchList field.
	 */
	public void addWatchList(X3DNode[] newValue); // acceptable node types #3: X3DUrlObject
	/**
	 * Set single child watchList node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the watchList field
	 */
	public void setWatchList(X3DNode newValue); // acceptable node types #5: X3DUrlObject
}
