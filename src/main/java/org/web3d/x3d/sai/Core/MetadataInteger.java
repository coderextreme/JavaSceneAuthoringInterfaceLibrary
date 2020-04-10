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

package org.web3d.x3d.sai.Core;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * The metadata provided by this node is contained in the integer numbers of the value field.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNode,X3DMetadataObject] MetadataInteger contains a typed list of values providing metadata information about its parent node. Further information about this specific Metadata* node may be provided by a single child Metadata* node with containerField="metadata".
 * <ul>
 *  <li> <i>Hint:</i> use containerField="value" if the parent node is MetadataSet. </li> 
 *  <li> <i>Hint:</i> if a metadata node is needed as a top-level root node for the scene, first insert a parent WorldInfo (or WorldInfo/MetadataSet) to contain it. </li> 
 *  <li> <i>Hint:</i> if present, an IS statement is the first child within any other node. </li> 
 *  <li> <i>Hint:</i> an IS statement precedes any sibling Metadata* node, which in turn precedes any other sibling nodes. </li> 
 *  <li> <i>Hint:</i> comments are not readable when a model file is loaded for viewing, but WorldInfo and Metadata* nodes are persistent and inspectable at run time. </li> 
 *  <li> <i>Hint:</i>  X3D for Web Authors, Chapter 15, Metadata Information <a href="http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter15-Metadata/Chapter15-MetadataInformation.html" target="_blank">http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter15-Metadata/Chapter15-MetadataInformation.html</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#MetadataInteger" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#MetadataInteger" target="blank">X3D Abstract Specification: MetadataInteger</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#MetadataInteger" target="_blank">X3D Tooltips: MetadataInteger</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata</a>
    */
public interface MetadataInteger extends X3DNode, X3DMetadataObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=X3DMetadataObject)
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
	 * @return {@link MetadataInteger} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MetadataInteger setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String value from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Depending on the metadata vocabulary, the attribute name is usually required for metadata nodes.
 * <ul>
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=X3DMetadataObject)
	@Override
	public String getName();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Depending on the metadata vocabulary, the attribute name is usually required for metadata nodes.
 * <ul>
 *  <li> <i>Warning:</i> name is not included if this instance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the name field.
	 * @return {@link MetadataInteger} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MetadataInteger setName(String newValue);

	/**
	 * Provide String value from inputOutput SFString field named <i>reference</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Reference to the metadata standard or definition defining this particular metadata value.  * <br>

	 * @return value of reference field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=X3DMetadataObject)
	@Override
	public String getReference();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>reference</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Reference to the metadata standard or definition defining this particular metadata value.  * <br>

	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the reference field.
	 * @return {@link MetadataInteger} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MetadataInteger setReference(String newValue);

	/**
	 * Provide array of int results from inputOutput MFInt32 field named <i>value</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The value attribute is a strictly typed data array providing relevant metadata information.
 * <ul>
 *  <li> <i> Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @return value of value field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=X3DMetadataObject)
	public int[] getValue();

	/**
	 * Accessor method to assign int array to inputOutput MFInt32 field named <i>value</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The value attribute is a strictly typed data array providing relevant metadata information.
 * <ul>
 *  <li> <i> Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the value field.
	 * @return {@link MetadataInteger} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MetadataInteger setValue(int[] newValue);

}
