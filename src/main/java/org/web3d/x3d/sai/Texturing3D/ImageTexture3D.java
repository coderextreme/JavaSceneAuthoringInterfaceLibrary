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

package org.web3d.x3d.sai.Texturing3D;
import org.web3d.x3d.sai.Networking.X3DUrlObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Texturing.*;

/**
 * ImageTexture3D defines a 3D image-based texture map by specifying a single image file that contains complete 3D data.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.1 or later) [X3DTexture3DNode,X3DUrlObject] ImageTexture3D defines a 3D image-based texture map by specifying a single image file that contains complete 3D data.
 * <ul>
 *  <li> <i>Warning:</i> there are no required file formats, but at least one of the following formats is recommended for volume support in an X3D browser. </li> 
 *  <li> <i>Hint:</i> Microsoft DirectDraw Surface (DDS) <a href="https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dx-graphics-dds" target="_blank">https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dx-graphics-dds</a> </li> 
 *  <li> <i>Hint:</i> Digital Imaging and Communications in Medicine (DICOM) <a href="https://www.dicomstandard.org" target="_blank">https://www.dicomstandard.org</a> Nevertheless DDS, DICOM, NRRD and/or .vol formats are recommended. </li> 
 *  <li> <i>Hint:</i> Nearly Raw Raster Data (NRRD) <a href="http://teem.sourceforge.net/nrrd" target="_blank">http://teem.sourceforge.net/nrrd</a> </li> 
 *  <li> <i>Hint:</i> Volume data format (VOL) <a href="http://paulbourke.net/dataformats/volumetric" target="_blank">http://paulbourke.net/dataformats/volumetric</a> </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Volume Tools and Volumes Visualization <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Volumes" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Volumes</a> </li> 
 *  <li> <i>Hint:</i> can contain a single TextureProperties node. </li> 
 *  <li> <i>Hint:</i> insert Shape and Appearance nodes before adding texture. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 33.2.2 3D texturing concepts <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html#3DTextureconcepts" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html#3DTextureconcepts</a> </li> 
 *  <li> <i>Hint:</i>  apply containerField='watchList' when parent node is LoadSensor. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#ImageTexture3D" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html#ImageTexture3D" target="blank">X3D Abstract Specification: ImageTexture3D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ImageTexture3D" target="_blank">X3D Tooltips: ImageTexture3D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface ImageTexture3D extends X3DTexture3DNode, X3DUrlObject
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=X3DUrlObject)
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
	 * @return {@link ImageTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ImageTexture3D setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatR</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along R axis.  * <br>

	 * @return value of repeatR field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=X3DUrlObject)
	@Override
	public boolean getRepeatR();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatR</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along R axis.  * <br>

	 * @param newValue is new value for the repeatR field.
	 * @return {@link ImageTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ImageTexture3D setRepeatR(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatS</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to horizontally repeat texture along S axis.  * <br>

	 * @return value of repeatS field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=X3DUrlObject)
	@Override
	public boolean getRepeatS();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatS</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to horizontally repeat texture along S axis.  * <br>

	 * @param newValue is new value for the repeatS field.
	 * @return {@link ImageTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ImageTexture3D setRepeatS(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>repeatT</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along T axis.  * <br>

	 * @return value of repeatT field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=X3DUrlObject)
	@Override
	public boolean getRepeatT();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>repeatT</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether to vertically repeat texture along T axis.  * <br>

	 * @param newValue is new value for the repeatT field.
	 * @return {@link ImageTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ImageTexture3D setRepeatT(boolean newValue);

	/**
	 * Provide TextureProperties instance (using a properly typed node) from initializeOnly SFNode field <i>textureProperties</i>.
	 * @return value of textureProperties field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=X3DUrlObject)
	@Override
	public TextureProperties getTextureProperties(); // acceptable node types #1: TextureProperties

	/**
	 * Accessor method to assign TextureProperties instance (using a properly typed node) to initializeOnly SFNode field <i>textureProperties</i>.
	 * @param newValue is new value for the textureProperties field.
	 * @return {@link ImageTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ImageTexture3D setTextureProperties(TextureProperties newValue); // acceptable node types #2: TextureProperties

	/**
	 * Provide array of String results from inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Location and filename of image. Multiple locations are more reliable, and including a Web address lets e-mail attachments work.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @return value of url field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTexture3DNode, $additionalInheritanceBaseType=X3DUrlObject)
	@Override
	public String[] getUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>url</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Location and filename of image. Multiple locations are more reliable, and including a Web address lets e-mail attachments work.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i> can replace embedded blank(s) in url queries with %20 for each blank character. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, urls <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#urls</a> </li> 
 * </ul>
	 * @param newValue is new value for the url field.
	 * @return {@link ImageTexture3D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ImageTexture3D setUrl(String[] newValue);

}
