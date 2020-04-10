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

import org.web3d.x3d.sai.Core.X3DChildNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.DIS.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.DIS.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.DIS.*;
import java.util.Arrays;

/**
 * DISEntityManager notifies a scene when new DIS ESPDU entities arrive or current entities leave.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DChildNode] DISEntityManager notifies a scene when new DIS ESPDU entities arrive or current entities leave. DISEntityManager may contain any number of DISEntityTypeMapping nodes that provide a best-match X3D model to incoming entity type values. For each new DIS entity, DISEntityManager thus produces a new EspduTransform node that contains a corresponding X3D model.
 * <ul>
 *  <li> <i>Hint:</i> DISEntityManager contains DISEntityTypeMapping nodes. </li> 
 *  <li> <i>Hint:</i> DisEntityManager ESPDU packets use the IEEE Distributed Interactive Simulation (DIS) protocol. </li> 
 *  <li> <i>Hint:</i> Savage Developers Guide on DIS <a href="https://savage.nps.edu/Savage/developers.html#DIS" target="_blank">https://savage.nps.edu/Savage/developers.html#DIS</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='DIS' level='2'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#DISEntityManager" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#DISEntityManager" target="blank">X3D Abstract Specification: DISEntityManager</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#DISEntityManager" target="_blank">X3D Tooltips: DISEntityManager</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface DISEntityManager extends X3DChildNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String value from inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" example: 224.2.181.145.  * <br>

	 * @return value of address field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public String getAddress();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" example: 224.2.181.145.  * <br>

	 * @param newValue is new value for the address field.
	 * @return {@link DISEntityManager} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityManager setAddress(String newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of applicationID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getApplicationID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the applicationID field.
	 * @return {@link DISEntityManager} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityManager setApplicationID(int newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>mapping</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [DISEntityTypeMapping] mapping field provides a mechanism for automatically creating an X3D model when a new entity arrives over the network. If a new entity matches one of the nodes, an instance of the provided URL is created and added as a child to the EspduTransform specified in the addedEntities field.
 * <ul>
 *  <li> <i> Hint:</i>  multiple DISEntityTypeMapping nodes can be provided in mapping field, best match takes precedence. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to DISEntityTypeMapping.
	 * @see org.web3d.x3d.jsail.DIS.DISEntityTypeMappingObject
	 * @return value of mapping field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public X3DNode[] getMapping(); // acceptable node types #1: DISEntityTypeMapping

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>mapping</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [DISEntityTypeMapping] mapping field provides a mechanism for automatically creating an X3D model when a new entity arrives over the network. If a new entity matches one of the nodes, an instance of the provided URL is created and added as a child to the EspduTransform specified in the addedEntities field.
 * <ul>
 *  <li> <i> Hint:</i>  multiple DISEntityTypeMapping nodes can be provided in mapping field, best match takes precedence. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to DISEntityTypeMapping.
	 * @param newValue is new value for the mapping field.
	 * @return {@link DISEntityManager} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityManager setMapping(X3DNode[] newValue); // acceptable node types #2: DISEntityTypeMapping

	/**
	 * Add array of child mapping nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to DISEntityTypeMapping.
	 * @param newValue is new value array to be appended the mapping field.
	 */
	public void addMapping(X3DNode[] newValue); // acceptable node types #3: DISEntityTypeMapping
	/**
	 * Set single child mapping node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the mapping field
	 */
	public void setMapping(X3DNode newValue); // acceptable node types #5: DISEntityTypeMapping
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link DISEntityManager} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DISEntityManager setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network port, for example: 3000.  * <br>

	 * @return value of port field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getPort();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network port, for example: 3000.  * <br>

	 * @param newValue is new value for the port field.
	 * @return {@link DISEntityManager} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityManager setPort(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @return value of siteID field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getSiteID();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the siteID field.
	 * @return {@link DISEntityManager} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityManager setSiteID(int newValue);

}
