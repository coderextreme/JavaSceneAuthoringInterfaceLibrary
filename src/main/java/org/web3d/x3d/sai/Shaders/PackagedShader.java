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

package org.web3d.x3d.sai.Shaders;
import org.web3d.x3d.sai.Networking.X3DUrlObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * PackagedShader can contain field declarations, but no CDATA section of plain-text source code.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.1 or later) [X3DShaderNode,X3DUrlObject,X3DProgrammableShaderObject] PackagedShader contains a url for a single file that may contain a number of shaders and combined effects.
 * <ul>
 *  <li> <i>Hint:</i> PackagedShader contains field declarations and then corresponding IS/connect statements (if any when defining inside a ProtoBody). </li> 
 *  <li> <i>Warning:</i> PackagedShader does not contain CDATA section of plain-text source code. </li> 
 *  <li> <i>Hint:</i> apply default containerField='shaders' when parent node is Appearance. </li> 
 *  <li> <i>Hint:</i>  apply containerField='watchList' when parent node is LoadSensor. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#PackagedShader" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html#PackagedShader" target="blank">X3D Abstract Specification: PackagedShader</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PackagedShader" target="_blank">X3D Tooltips: PackagedShader</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface PackagedShader extends X3DShaderNode, X3DUrlObject, X3DProgrammableShaderObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness


	/**
	 * Accessor method to assign boolean value to inputOnly SFBool field named <i>activate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> activate forces the shader to activate the contained objects.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient inputOnly field in an X3D file, instead only use it a destination for ROUTE events. </li> 
 * </ul>
	 * @param newValue is new value for the activate field.
	 * @return {@link PackagedShader} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PackagedShader setActivate(boolean newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isSelected</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isSelected indicates this shader instance is selected for use by browser
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isSelected field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShaderNode, $additionalInheritanceBaseType=X3DUrlObject X3DProgrammableShaderObject)
	@Override
	public boolean getIsSelected();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isValid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isValid indicates whether current shader objects can be run as a shader program.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isValid field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShaderNode, $additionalInheritanceBaseType=X3DUrlObject X3DProgrammableShaderObject)
	@Override
	public boolean getIsValid();
	/**
	 * Provide String enumeration value (baseType shaderLanguageValues) ["Cg" | "GLSL" | "HLSL" | 'etc.'] from initializeOnly SFString field named <i>language</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The language field indicates to the X3D player which shading language is used. The language field may be used to optionally determine the language type if no MIME-type information is available.
 * <ul>
 *  <li> <i> Hint:</i>  recognized values include "Cg" "GLSL" "HLSL". </li> 
 * </ul>
	 * @return value of language field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShaderNode, $additionalInheritanceBaseType=X3DUrlObject X3DProgrammableShaderObject)
	@Override
	public String getLanguage();

	/**
	 * Accessor method to assign String enumeration value ("Cg" | "GLSL" | "HLSL") to initializeOnly SFString field named <i>language</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The language field indicates to the X3D player which shading language is used. The language field may be used to optionally determine the language type if no MIME-type information is available.
 * <ul>
 *  <li> <i> Hint:</i>  recognized values include "Cg" "GLSL" "HLSL". </li> 
 * </ul>
	 * @param newValue is new value for the language field.
	 * @return {@link PackagedShader} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PackagedShader setLanguage(String newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShaderNode, $additionalInheritanceBaseType=X3DUrlObject X3DProgrammableShaderObject)
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
	 * @return {@link PackagedShader} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PackagedShader setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String results from inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> url points to a shader source-code file that may contain a number of shaders and combined effects.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @return value of url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DShaderNode, $additionalInheritanceBaseType=X3DUrlObject X3DProgrammableShaderObject)
	@Override
	public String[] getUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> url points to a shader source-code file that may contain a number of shaders and combined effects.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @param newValue is new value for the url field.
	 * @return {@link PackagedShader} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PackagedShader setUrl(String[] newValue);

}
