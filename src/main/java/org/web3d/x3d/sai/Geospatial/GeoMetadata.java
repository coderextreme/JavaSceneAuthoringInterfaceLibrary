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

import org.web3d.x3d.sai.Core.X3DInfoNode;
import org.web3d.x3d.sai.Networking.X3DUrlObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * GeoMetadata includes a generic subset of metadata about the geographic data.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DInfoNode] GeoMetadata includes a generic subset of metadata about the geographic data.
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 *  <li> <i>Hint:</i>  apply containerField='watchList' when parent node is LoadSensor. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#GeoMetadata" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#GeoMetadata" target="blank">X3D Abstract Specification: GeoMetadata</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#GeoMetadata" target="_blank">X3D Tooltips: GeoMetadata</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface GeoMetadata extends X3DInfoNode, X3DUrlObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>data</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  DEF list of all nodes that implement this data. If no specific geospatial nodes are identified, then this GeoMetadata node pertains to entire scene.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode.
	 * @see org.web3d.x3d.sai.Core.X3DNode
	 * @return value of data field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public X3DNode[] getData(); // acceptable node types #1: X3DNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>data</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  DEF list of all nodes that implement this data. If no specific geospatial nodes are identified, then this GeoMetadata node pertains to entire scene.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode.
	 * @param newValue is new value for the data field.
	 * @return {@link GeoMetadata} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoMetadata setData(X3DNode[] newValue); // acceptable node types #2: X3DNode

	/**
	 * Add array of child data nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNode.
	 * @param newValue is new value array to be appended the data field.
	 */
	public void addData(X3DNode[] newValue); // acceptable node types #3: X3DNode
	/**
	 * Set single child data node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the data field
	 */
	public void setData(X3DNode newValue); // acceptable node types #5: X3DNode
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
	 * @return {@link GeoMetadata} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoMetadata setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String results from inputOutput MFString field named <i>summary</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The summary string array contains a set of keyword/value pairs, with each keyword and its subsequent value contained in separate strings.
 * <ul>
 *  <li> <i>Hint:</i> example &amp;lt;GeoMetadata summary=' "title" "San Francisco, California USA" '/&amp;gt;. </li> 
 *  <li> <i>Hint:</i>  Table 25.5, GeoMetadata keywords and values <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#t-keywordsandvaluesHint" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#t-keywordsandvaluesHint</a>: there should always be an even (or zero) number of strings to match key-value pairs. </li> 
 * </ul>
	 * @return value of summary field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInfoNode, $additionalInheritanceBaseType=X3DUrlObject)
	public String[] getSummary();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>summary</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The summary string array contains a set of keyword/value pairs, with each keyword and its subsequent value contained in separate strings.
 * <ul>
 *  <li> <i>Hint:</i> example &amp;lt;GeoMetadata summary=' "title" "San Francisco, California USA" '/&amp;gt;. </li> 
 *  <li> <i>Hint:</i>  Table 25.5, GeoMetadata keywords and values <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#t-keywordsandvaluesHint" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#t-keywordsandvaluesHint</a>: there should always be an even (or zero) number of strings to match key-value pairs. </li> 
 * </ul>
	 * @param newValue is new value for the summary field.
	 * @return {@link GeoMetadata} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoMetadata setSummary(String[] newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Hypertext link to an external, complete metadata description.
 * <ul>
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
	 * <i>Tooltip:</i> Hypertext link to an external, complete metadata description.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @param newValue is new value for the url field.
	 * @return {@link GeoMetadata} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoMetadata setUrl(String[] newValue);

}
