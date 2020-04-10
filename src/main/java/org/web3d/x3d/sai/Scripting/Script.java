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

package org.web3d.x3d.sai.Scripting;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * Script contains author-programmed event behaviors for a scene.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DScriptNode] Script contains author-programmed event behaviors for a scene. Define the script input-output event interface by including &amp;lt;field/&amp;gt; elements. Scripting code is embedded in a child CDATA node or (deprecated) in the url field. Optionally supported programming languages are ECMAScript (JavaScript) and Java (via url to a myNode.class file).
 * <ul>
 *  <li> <i>Hint:</i> insert a CDATA block to contain source code embedded within an X3D scene. </li> 
 *  <li> <i>Hint:</i> a contained CDATA block for source code protects whitespace, line breaks, and literal characters (such as &amp; for ampersand character, &amp;lt; for less-than-sign character, and &amp;gt; for greater-than-sign character) from unintended escape-character modifications by XML parsers. </li> 
 *  <li> <i>Warning:</i> strict order is required for contained constructs: first field declarations (if any), then IS/connect statements (if any when defining inside a ProtoBody), and finally CDATA source-code block. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Scripts <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts</a> </li> 
 *  <li> <i>Hint:</i>  apply containerField='watchList' when parent node is LoadSensor. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Script" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/scripting.html#Script" target="blank">X3D Abstract Specification: Script</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Script" target="_blank">X3D Tooltips: Script</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts" target="_blank">X3D Scene Authoring Hints: Scripts</a>
    */
public interface Script extends X3DScriptNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>directOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Set directOutput true if Script has field reference(s) of type SFNode/MFNode, and also uses direct access to modify attributes of a referenced node in the Scene.
 * <ul>
 *  <li> <i>Hint:</i> set directOutput true if Script dynamically establishes or breaks ROUTEs. </li> 
 *  <li> <i>Hint:</i> directOutput is a browser hint to avoid overoptimizing referenced nodes, since a Script might directly change attribute values in referenced SFNode/MFNode fields, without a ROUTE connecting output events. </li> 
 *  <li> <i>Hint:</i>  directOutput false means Script cannot modify referenced nodes or change ROUTEs. </li> 
 * </ul>
	 * @return value of directOutput field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DScriptNode, $additionalInheritanceBaseType=)
	public boolean getDirectOutput();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>directOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Set directOutput true if Script has field reference(s) of type SFNode/MFNode, and also uses direct access to modify attributes of a referenced node in the Scene.
 * <ul>
 *  <li> <i>Hint:</i> set directOutput true if Script dynamically establishes or breaks ROUTEs. </li> 
 *  <li> <i>Hint:</i> directOutput is a browser hint to avoid overoptimizing referenced nodes, since a Script might directly change attribute values in referenced SFNode/MFNode fields, without a ROUTE connecting output events. </li> 
 *  <li> <i>Hint:</i>  directOutput false means Script cannot modify referenced nodes or change ROUTEs. </li> 
 * </ul>
	 * @param newValue is new value for the directOutput field.
	 * @return {@link Script} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Script setDirectOutput(boolean newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DScriptNode, $additionalInheritanceBaseType=)
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
	 * @return {@link Script} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Script setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>mustEvaluate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> If mustEvaluate false, then the X3D player may delay sending input events to Script until output events are needed. If mustEvaluate true, then Script must receive input events immediately without any event-aggregation delays.
 * <ul>
 *  <li> <i> Hint:</i>  set mustEvaluate true when sending/receiving values via the network. </li> 
 * </ul>
	 * @return value of mustEvaluate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DScriptNode, $additionalInheritanceBaseType=)
	public boolean getMustEvaluate();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>mustEvaluate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> If mustEvaluate false, then the X3D player may delay sending input events to Script until output events are needed. If mustEvaluate true, then Script must receive input events immediately without any event-aggregation delays.
 * <ul>
 *  <li> <i> Hint:</i>  set mustEvaluate true when sending/receiving values via the network. </li> 
 * </ul>
	 * @param newValue is new value for the mustEvaluate field.
	 * @return {@link Script} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Script setMustEvaluate(boolean newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> List of address links for runnable script files.
 * <ul>
 *  <li> <i>Hint:</i> browsers are not required to support any particular scripting language, but ECMAScript (JavaScript) is widely supported. </li> 
 *  <li> <i>Hint:</i> equivalent script code written in multiple programming languages can be provided for portability, the first runnable version is chosen at run time. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Scripts <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts</a> </li> 
 *  <li> <i>Warning:</i> source code can be placed in url attribute but may be unparsable due to escaping of special characters and elimination of line breaks (causing comments to nullify follow-on code). Use contained CDATA section instead for embedding source code. </li> 
 *  <li> <i>Hint:</i> if both url field and CDATA section are provided simultaneously, the url field is processed first. This approach allows utilization of update modifications or live queries in external scripts, while still providing reliable script source as a fallback alternative within the model itself. </li> 
 *  <li> <i>Hint:</i> X3D XML Encoding, 4.3.13 Encapsulating Script node code <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#EncapsulatingScriptNodeCode" target="_blank">https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#EncapsulatingScriptNodeCode</a> </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @return value of url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DScriptNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> List of address links for runnable script files.
 * <ul>
 *  <li> <i>Hint:</i> browsers are not required to support any particular scripting language, but ECMAScript (JavaScript) is widely supported. </li> 
 *  <li> <i>Hint:</i> equivalent script code written in multiple programming languages can be provided for portability, the first runnable version is chosen at run time. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Scripts <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts</a> </li> 
 *  <li> <i>Warning:</i> source code can be placed in url attribute but may be unparsable due to escaping of special characters and elimination of line breaks (causing comments to nullify follow-on code). Use contained CDATA section instead for embedding source code. </li> 
 *  <li> <i>Hint:</i> if both url field and CDATA section are provided simultaneously, the url field is processed first. This approach allows utilization of update modifications or live queries in external scripts, while still providing reliable script source as a fallback alternative within the model itself. </li> 
 *  <li> <i>Hint:</i> X3D XML Encoding, 4.3.13 Encapsulating Script node code <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#EncapsulatingScriptNodeCode" target="_blank">https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#EncapsulatingScriptNodeCode</a> </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @param newValue is new value for the url field.
	 * @return {@link Script} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Script setUrl(String[] newValue);

}
