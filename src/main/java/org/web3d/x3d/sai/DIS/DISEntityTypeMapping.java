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

import org.web3d.x3d.sai.Core.X3DInfoNode;
import org.web3d.x3d.sai.Networking.X3DUrlObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * DISEntityTypeMapping provides a best-match mapping from DIS ESPDU entity type information to a specific X3D model, thus providing a visual and behavioral representation that best matches the entity type.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DInfoNode,X3DUrlObject] DISEntityTypeMapping provides a best-match mapping from DIS ESPDU entity type information to a specific X3D model, thus providing a visual and behavioral representation that best matches the entity type. Fields are processed in order: kind, domain, country, category, subcategory, specific, extra.
 * <ul>
 *  <li> <i>Hint:</i> values set to zero are wildcards, matching any received value. </li> 
 *  <li> <i>Hint:</i> DISEntityTypeMapping is contained by a DISEntityManager node. </li> 
 *  <li> <i>Hint:</i> DisEntityManager ESPDU packets use the IEEE Distributed Interactive Simulation (DIS) protocol. </li> 
 *  <li> <i>Hint:</i> Savage Developers Guide on DIS <a href="https://savage.nps.edu/Savage/developers.html#DIS" target="_blank">https://savage.nps.edu/Savage/developers.html#DIS</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='DIS' level='2'/&amp;gt; </li> 
 *  <li> <i>Hint:</i>  apply containerField='watchList' when parent node is LoadSensor. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#DISEntityTypeMapping" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#DISEntityTypeMapping" target="blank">X3D Abstract Specification: DISEntityTypeMapping</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#DISEntityTypeMapping" target="_blank">X3D Tooltips: DISEntityTypeMapping</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface DISEntityTypeMapping extends X3DInfoNode, X3DUrlObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide int value within allowed range of [0,255] from initializeOnly SFInt32 field named <i>category</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for main category that describes the entity, semantics of each code varies according to domain. See DIS Enumerations values.  * <br>

	 * @return value of category field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getCategory();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>category</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for main category that describes the entity, semantics of each code varies according to domain. See DIS Enumerations values.  * <br>

	 * @param newValue is new value for the category field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setCategory(int newValue);

	/**
	 * Provide int value within allowed range of [0,65535] from initializeOnly SFInt32 field named <i>country</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for country to which the design of the entity or its design specification is attributed.  * <br>

	 * @return value of country field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getCountry();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>country</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for country to which the design of the entity or its design specification is attributed.  * <br>

	 * @param newValue is new value for the country field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setCountry(int newValue);

	/**
	 * Provide int value within allowed range of [0,255] from initializeOnly SFInt32 field named <i>domain</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for domain in which the entity operates: LAND, AIR, SURFACE, SUBSURFACE, SPACE or OTHER.  * <br>

	 * @return value of domain field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getDomain();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>domain</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for domain in which the entity operates: LAND, AIR, SURFACE, SUBSURFACE, SPACE or OTHER.  * <br>

	 * @param newValue is new value for the domain field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setDomain(int newValue);

	/**
	 * Provide int value within allowed range of [0,255] from initializeOnly SFInt32 field named <i>extra</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Any extra information required to describe a particular entity. The contents of this field shall depend on the type of entity represented.  * <br>

	 * @return value of extra field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getExtra();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>extra</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Any extra information required to describe a particular entity. The contents of this field shall depend on the type of entity represented.  * <br>

	 * @param newValue is new value for the extra field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setExtra(int newValue);

	/**
	 * Provide int value within allowed range of [0,255] from initializeOnly SFInt32 field named <i>kind</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for whether entity is a PLATFORM, MUNITION, LIFE_FORM, ENVIRONMENTAL, CULTURAL_FEATURE, SUPPLY, RADIO, EXPENDABLE, SENSOR_EMITTER or OTHER.  * <br>

	 * @return value of kind field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getKind();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>kind</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Integer enumerations value for whether entity is a PLATFORM, MUNITION, LIFE_FORM, ENVIRONMENTAL, CULTURAL_FEATURE, SUPPLY, RADIO, EXPENDABLE, SENSOR_EMITTER or OTHER.  * <br>

	 * @param newValue is new value for the kind field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setKind(int newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
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
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DISEntityTypeMapping setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value within allowed range of [0,255] from initializeOnly SFInt32 field named <i>specific</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specific information about an entity based on the Subcategory field. See DIS Enumerations values.  * <br>

	 * @return value of specific field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getSpecific();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>specific</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Specific information about an entity based on the Subcategory field. See DIS Enumerations values.  * <br>

	 * @param newValue is new value for the specific field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setSpecific(int newValue);

	/**
	 * Provide int value within allowed range of [0,255] from initializeOnly SFInt32 field named <i>subcategory</i>.
	 * @return value of subcategory field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public int getSubcategory();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>subcategory</i>.
	 * @param newValue is new value for the subcategory field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DISEntityTypeMapping setSubcategory(int newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Local and/or online addresses of X3D model of interest, for example: "ExtrusionExampleShip.x3d" "<a href="https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShip.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShip.x3d</a>"
 * <ul>
 *  <li> <i>Hint:</i> see <a href="https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShipIndex.html" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShipIndex.html</a> </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @return value of url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	@Override
	public String[] getUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Local and/or online addresses of X3D model of interest, for example: "ExtrusionExampleShip.x3d" "<a href="https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShip.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShip.x3d</a>"
 * <ul>
 *  <li> <i>Hint:</i> see <a href="https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShipIndex.html" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionExampleShipIndex.html</a> </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @param newValue is new value for the url field.
	 * @return {@link DISEntityTypeMapping} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DISEntityTypeMapping setUrl(String[] newValue);

}
