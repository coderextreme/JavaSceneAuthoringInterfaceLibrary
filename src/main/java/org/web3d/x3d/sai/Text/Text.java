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

package org.web3d.x3d.sai.Text;

import org.web3d.x3d.sai.Rendering.X3DGeometryNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Text.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * Text is a 2D (flat) geometry node that can contain multiple lines of string values.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGeometryNode] Text is a 2D (flat) geometry node that can contain multiple lines of string values. Layout and styling is controlled by a contained FontStyle node.
 * <ul>
 *  <li> <i>Hint:</i> String (computer science) <a href="https://en.wikipedia.org/wiki/String_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/String_(computer_science)</a> </li> 
 *  <li> <i>Hint:</i> full internationalization (i18n) and localization (l10n) features are available for any written language. </li> 
 *  <li> <i>Hint:</i> relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 *  <li> <i>Hint:</i> insert a Shape node before adding geometry or Appearance. </li> 
 *  <li> <i>Hint:</i> for advanced extensibility, authors can substitute a type-matched ProtoInstance node (with correct containerField value) for contained node content. </li> 
 *  <li> <i>Warning:</i>  Text node requires X3D profile='Immersive' or &amp;lt;component name='Text' level='1'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Text" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Text" target="blank">X3D Abstract Specification: Text</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Text" target="_blank">X3D Tooltips: Text</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Text extends X3DGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DFontStyleNode instance (using a properly typed node) from inputOutput SFNode field <i>fontStyle</i>.
	 * @return value of fontStyle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public X3DFontStyleNode getFontStyle(); // acceptable node types #1: X3DFontStyleNode

	/**
	 * Accessor method to assign X3DFontStyleNode instance (using a properly typed node) to inputOutput SFNode field <i>fontStyle</i>.
	 * @param newValue is new value for the fontStyle field.
	 * @return {@link Text} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Text setFontStyle(X3DFontStyleNode newValue); // acceptable node types #2: X3DFontStyleNode

	/**
	 * Provide array of float results within allowed range of [0,infinity) from inputOutput MFFloat field named <i>length</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of length values for each text string in the local coordinate system. Each string is stretched or compressed to fit.  * <br>

	 * @return value of length field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getLength();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>length</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Array of length values for each text string in the local coordinate system. Each string is stretched or compressed to fit.  * <br>

	 * @param newValue is new value for the length field.
	 * @return {@link Text} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Text setLength(float[] newValue);

	/**
	 * Provide array of 2-tuple float results from outputOnly MFVec2f field named <i>lineBounds</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Array of 2D bounding box values for each line of text in the local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of lineBounds field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getLineBounds();
	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>maxExtent</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Limits/compresses all text strings if max string length is longer than maxExtent, as measured in local coordinate system.  * <br>

	 * @return value of maxExtent field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float getMaxExtent();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxExtent</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Limits/compresses all text strings if max string length is longer than maxExtent, as measured in local coordinate system.  * <br>

	 * @param newValue is new value for the maxExtent field.
	 * @return {@link Text} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Text setMaxExtent(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link Text} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Text setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>origin</i>.
	 * <br><br>
	 * <i>Tooltip:</i> origin of the text local coordinate system, in units of the coordinate system in which the Text node is embedded. The value of the origin field represents the upper left corner of the textBounds.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of origin field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getOrigin();
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i> if in doubt, use solid='false' for maximum visibility. </li> 
 *  <li> <i>Warning:</i>  solid false not supported in VRML97. </li> 
 * </ul>
	 * @return value of solid field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getSolid();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i> if in doubt, use solid='false' for maximum visibility. </li> 
 *  <li> <i>Warning:</i>  solid false not supported in VRML97. </li> 
 * </ul>
	 * @param newValue is new value for the solid field.
	 * @return {@link Text} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Text setSolid(boolean newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>string</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Single or multiple string values to present as Text. Each value in the string array (including empty strings) gets displayed on a separate line.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks. </li> 
 *  <li> <i>Hint:</i> Strings can contain quote marks by first escaping them with a backslash example: "say \"hello\" please" </li> 
 *  <li> <i>Hint:</i> many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> Example: <a href="http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextIndex.html" target="_blank">http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextIndex.html</a> Example: <a href="http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextSpecialCharactersIndex.html" target="_blank">http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextSpecialCharactersIndex.html</a> </li> 
 * </ul>
	 * @return value of string field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public String[] getString();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>string</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Single or multiple string values to present as Text. Each value in the string array (including empty strings) gets displayed on a separate line.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks. </li> 
 *  <li> <i>Hint:</i> Strings can contain quote marks by first escaping them with a backslash example: "say \"hello\" please" </li> 
 *  <li> <i>Hint:</i> many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> Example: <a href="http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextIndex.html" target="_blank">http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextIndex.html</a> Example: <a href="http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextSpecialCharactersIndex.html" target="_blank">http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter02-GeometryPrimitives/TextSpecialCharactersIndex.html</a> </li> 
 * </ul>
	 * @param newValue is new value for the string field.
	 * @return {@link Text} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Text setString(String[] newValue);

	/**
	 * Provide array of 2-tuple float results from outputOnly SFVec2f field named <i>textBounds</i>.
	 * <br><br>
	 * <i>Tooltip:</i> 2D bounding box value for all lines of text in the local coordinate system.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of textBounds field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getTextBounds();
}
