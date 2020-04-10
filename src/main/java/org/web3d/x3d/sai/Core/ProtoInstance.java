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
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * ProtoInstance can override field default values via fieldValue initializations. Non-recursive nested ProtoInstance and ProtoDeclare statements are allowed within a ProtoDeclare.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] ProtoInstance creates an instance node of a locally or externally declared prototype definition. ProtoDeclare/ExternProtoDeclare definitions are abstract, corresponding ProtoInstance nodes are concrete. ProtoInstance nodes typically contain fieldValue statements to override default field values defined in the original ProtoDeclare statement.
 * <ul>
 *  <li> <i>Hint:</i> the node type of a ProtoInstance exactly matches the first node in the corresponding ProtoDeclare/ProtoBody declaration. </li> 
 *  <li> <i>Warning:</i> be sure to correctly set the containerField value to match the intended field in the parent node. </li> 
 *  <li> <i>Warning:</i> do not mismatch node types when placing a ProtoInstance in a scene graph. Most validation tools will not catch this error. </li> 
 *  <li> <i>Hint:</i> scene authors can override default initializations of prototype fields by including contained &amp;lt;fieldValue&amp;gt; elements. </li> 
 *  <li> <i>Hint:</i> Nested ProtoInstance and ProtoDeclare statements are allowed within a ProtoDeclare/ProtoBody. </li> 
 *  <li> <i>Hint:</i> if contained within a ProtoDeclare, then a ProtoInstance node can also contain IS/connect statements for other defined fields. </li> 
 *  <li> <i>Warning:</i> a ProtoInstance node may not be instantiated inside its own ProtoDeclare or ExternProtoDeclare declaration (i.e. recursive prototypes are illegal). </li> 
 *  <li> <i>Warning:</i> the local context of each ProtoInstance node must match the node type of the first node in the original ProtoDeclare declaration. </li> 
 *  <li> <i>Warning:</i> ProtoInstance substitution for a Metadata* node might not validate. Workaround: put metadata-typed ProtoInstance nodes as contained values within a parent MetadataSet node. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Inlines and Prototypes <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.4.4 Prototype semantics, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics</a> Examples: X3D Example Archives, X3D for Web Authors, Chapter 14 Prototypes <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#ProtoInstance" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ProtoInstanceAndFieldValueStatement" target="blank">X3D Abstract Specification: ProtoInstance</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ProtoInstance" target="_blank">X3D Tooltips: ProtoInstance</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes" target="_blank">X3D Scene Authoring Hints: InlinesPrototypes</a>
    */
public interface ProtoInstance extends X3DPrototypeInstance, X3DChildNode
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
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
	 * @return {@link ProtoInstance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ProtoInstance setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String value from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> name of the prototype node being instanced.
 * <ul>
 *  <li> <i>Hint:</i> must match name of corresponding ProtoDeclare or ExternProtoDeclare in this scene. </li> 
 *  <li> <i>Warning:</i> name must be specified unless this ProtoInstance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of name field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=X3DPrototypeInstance, $additionalInheritanceBaseType=X3DChildNode)
	public String getName();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> name of the prototype node being instanced.
 * <ul>
 *  <li> <i>Hint:</i> must match name of corresponding ProtoDeclare or ExternProtoDeclare in this scene. </li> 
 *  <li> <i>Warning:</i> name must be specified unless this ProtoInstance is a USE node. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link ProtoInstance} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ProtoInstance setName(String newValue);

}
