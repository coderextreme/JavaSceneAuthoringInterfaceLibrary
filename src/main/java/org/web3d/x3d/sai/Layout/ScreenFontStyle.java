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

package org.web3d.x3d.sai.Layout;

import org.web3d.x3d.sai.Text.X3DFontStyleNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * ScreenFontStyle is an X3DFontStyleNode defines the size, family, justification, and other styles used within a screen layout.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DFontStyleNode] ScreenFontStyle is an X3DFontStyleNode defines the size, family, justification, and other styles used within a screen layout. ScreenFontStyle renders text so that it appears identical to typical 2D applications by specifying pointSize in points (as in 2D document layout) rather than size in meters. Each glyph of text is rendered as a quadrilateral with a texture applied.
 * <ul>
 *  <li> <i> Hint:</i>  first add a Text node as a parent. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#ScreenFontStyle" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#ScreenFontStyle" target="blank">X3D Abstract Specification: ScreenFontStyle</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ScreenFontStyle" target="_blank">X3D Tooltips: ScreenFontStyle</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface ScreenFontStyle extends X3DFontStyleNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String enumeration results (baseType fontFamilyValues) ['"SANS"' | '"SERIF"' | '"TYPEWRITER"' | '"etc."'] from initializeOnly MFString field named <i>family</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Array of quoted font family names in preference order, browsers use the first supported family.
 * <ul>
 *  <li> <i>Hint:</i> example family array might be "Times" "SERIF" </li> 
 *  <li> <i>Warning:</i> font family support often varies. </li> 
 *  <li> <i>Hint:</i> values with guaranteed support include "SERIF" "SANS" "TYPEWRITER". </li> 
 *  <li> <i>Hint:</i> SERIF and SANS are variable-width fonts (for example, Times Roman and Arial). </li> 
 *  <li> <i>Hint:</i> TYPEWRITER is a fixed-width font (for example, Courier). </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i> see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of family field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public String[] getFamily();

	/**
	 * Accessor method to assign String enumeration array (""SANS"" | ""SERIF"" | ""TYPEWRITER"") to initializeOnly MFString field named <i>family</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Array of quoted font family names in preference order, browsers use the first supported family.
 * <ul>
 *  <li> <i>Hint:</i> example family array might be "Times" "SERIF" </li> 
 *  <li> <i>Warning:</i> font family support often varies. </li> 
 *  <li> <i>Hint:</i> values with guaranteed support include "SERIF" "SANS" "TYPEWRITER". </li> 
 *  <li> <i>Hint:</i> SERIF and SANS are variable-width fonts (for example, Times Roman and Arial). </li> 
 *  <li> <i>Hint:</i> TYPEWRITER is a fixed-width font (for example, Courier). </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i> see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the family field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setFamily(String[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>horizontal</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is horizontal (true) or vertical (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of horizontal field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public boolean getHorizontal();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>horizontal</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is horizontal (true) or vertical (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the horizontal field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setHorizontal(boolean newValue);

	/**
	 * Provide array of String enumeration results (baseType justifyChoices) ['"MIDDLE"' | '"MIDDLE" "BEGIN"' | '"MIDDLE" "END"' | '"MIDDLE" "FIRST"' | '"MIDDLE" "MIDDLE"' | '"BEGIN"' | '"BEGIN" "BEGIN"' | '"BEGIN" "END"' | '"BEGIN" "FIRST"' | '"BEGIN" "MIDDLE"' | '"END"' | '"END" "BEGIN"' | '"END" "END"' | '"END" "FIRST"' | '"END" "MIDDLE"' | '"FIRST"' | '"FIRST" "BEGIN"' | '"FIRST" "END"' | '"FIRST" "FIRST"' | '"FIRST" "MIDDLE"'] from initializeOnly MFString field named <i>justify</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The justify field determines alignment of the above text layout relative to the origin of the object coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> preferred value is usually justify=' "MIDDLE" "MIDDLE" ' for centered justification horizontally and vertically. </li> 
 *  <li> <i>Warning:</i> exactly two string values are provided for major and minor axis alignment. </li> 
 *  <li> <i>Warning:</i> do not use illegal values such as LEFT RIGHT TOP BOTTOM or CENTER. </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 * </ul>
	 * @return value of justify field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public String[] getJustify();

	/**
	 * Accessor method to assign String enumeration array (""MIDDLE"" | ""MIDDLE" "BEGIN"" | ""MIDDLE" "END"" | ""MIDDLE" "FIRST"" | ""MIDDLE" "MIDDLE"" | ""BEGIN"" | ""BEGIN" "BEGIN"" | ""BEGIN" "END"" | ""BEGIN" "FIRST"" | ""BEGIN" "MIDDLE"" | ""END"" | ""END" "BEGIN"" | ""END" "END"" | ""END" "FIRST"" | ""END" "MIDDLE"" | ""FIRST"" | ""FIRST" "BEGIN"" | ""FIRST" "END"" | ""FIRST" "FIRST"" | ""FIRST" "MIDDLE"") to initializeOnly MFString field named <i>justify</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The justify field determines alignment of the above text layout relative to the origin of the object coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> preferred value is usually justify=' "MIDDLE" "MIDDLE" ' for centered justification horizontally and vertically. </li> 
 *  <li> <i>Warning:</i> exactly two string values are provided for major and minor axis alignment. </li> 
 *  <li> <i>Warning:</i> do not use illegal values such as LEFT RIGHT TOP BOTTOM or CENTER. </li> 
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the justify field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setJustify(String[] newValue);

	/**
	 * Provide String value from initializeOnly SFString field named <i>language</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Language codes consist of a primary code and a (possibly empty) series of subcodes. [ language-code = primary-code ( "-" subcode )* ] Two-letter primary codes are reserved for language abbreviations. Two-letter primary codes include en (English), fr (French), de (German), it (Italian), nl (Dutch), el (Greek), es (Spanish), pt (Portuguese), ar (Arabic), he (Hebrew), ru (Russian), zh (Chinese), ja (Japanese), hi (Hindi), ur (Urdu), and sa (Sanskrit). Any two-letter subcode is understood to be a country code.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> see ISO639.2 Codes for the Representation of Names of Languages <a href="http://www.loc.gov/standards/iso639-2/php/code_list.php" target="_blank">http://www.loc.gov/standards/iso639-2/php/code_list.php</a> </li> 
 *  <li> <i>Hint:</i> see RFC3066 Tags for the Identification of Languages <a href="http://tools.ietf.org/html/rfc3066" target="_blank">http://tools.ietf.org/html/rfc3066</a> </li> 
 *  <li> <i>Hint:</i> see ISO3166 or <a href="http://xml.coverpages.org/languageIdentifiers.html" target="_blank">http://xml.coverpages.org/languageIdentifiers.html</a> </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of language field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public String getLanguage();

	/**
	 * Accessor method to assign String value to initializeOnly SFString field named <i>language</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Language codes consist of a primary code and a (possibly empty) series of subcodes. [ language-code = primary-code ( "-" subcode )* ] Two-letter primary codes are reserved for language abbreviations. Two-letter primary codes include en (English), fr (French), de (German), it (Italian), nl (Dutch), el (Greek), es (Spanish), pt (Portuguese), ar (Arabic), he (Hebrew), ru (Russian), zh (Chinese), ja (Japanese), hi (Hindi), ur (Urdu), and sa (Sanskrit). Any two-letter subcode is understood to be a country code.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i> see ISO639.2 Codes for the Representation of Names of Languages <a href="http://www.loc.gov/standards/iso639-2/php/code_list.php" target="_blank">http://www.loc.gov/standards/iso639-2/php/code_list.php</a> </li> 
 *  <li> <i>Hint:</i> see RFC3066 Tags for the Identification of Languages <a href="http://tools.ietf.org/html/rfc3066" target="_blank">http://tools.ietf.org/html/rfc3066</a> </li> 
 *  <li> <i>Hint:</i> see ISO3166 or <a href="http://xml.coverpages.org/languageIdentifiers.html" target="_blank">http://xml.coverpages.org/languageIdentifiers.html</a> </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the language field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setLanguage(String newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>leftToRight</i>.
	 * @return value of leftToRight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public boolean getLeftToRight();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>leftToRight</i>.
	 * @param newValue is new value for the leftToRight field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setLeftToRight(boolean newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ScreenFontStyle setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of (0,infinity) from initializeOnly SFFloat field named <i>pointSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) pointSize field specifies the size of text in points. Nominal height (in local coordinate system) of text glyphs Also sets default spacing between adjacent lines of text.
 * <ul>
 *  <li> <i> Hint:</i>  pointSize replaces the size field of the FontStyle node. </li> 
 * </ul>
	 * @return value of pointSize field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public float getPointSize();

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>pointSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) pointSize field specifies the size of text in points. Nominal height (in local coordinate system) of text glyphs Also sets default spacing between adjacent lines of text.
 * <ul>
 *  <li> <i> Hint:</i>  pointSize replaces the size field of the FontStyle node. </li> 
 * </ul>
	 * @param newValue is new value for the pointSize field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setPointSize(float newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>spacing</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Adjustment factor for line spacing between adjacent lines of text.  * <br>

	 * @return value of spacing field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public float getSpacing();

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>spacing</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Adjustment factor for line spacing between adjacent lines of text.  * <br>

	 * @param newValue is new value for the spacing field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setSpacing(float newValue);

	/**
	 * Provide String enumeration value (baseType fontStyleChoices) ["PLAIN" | "BOLD" | "ITALIC" | "BOLDITALIC"] from initializeOnly SFString field named <i>style</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Pick one of four values for text style.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 * </ul>
	 * @return value of style field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public String getStyle();

	/**
	 * Accessor method to assign String enumeration value ("PLAIN" | "BOLD" | "ITALIC" | "BOLDITALIC") to initializeOnly SFString field named <i>style</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Pick one of four values for text style.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  see 15.2.2.2 Font family and style <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Fontfamilyandstyle</a> for details. </li> 
 * </ul>
	 * @param newValue is new value for the style field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setStyle(String newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>topToBottom</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is top-to-bottom (true) or bottom-to-top (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @return value of topToBottom field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DFontStyleNode, $additionalInheritanceBaseType=)
	public boolean getTopToBottom();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>topToBottom</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether text direction is top-to-bottom (true) or bottom-to-top (false).
 * <ul>
 *  <li> <i>Hint:</i> see 15.2.2.3 Direction and justification <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html#Directionandjustification</a> for details. </li> 
 *  <li> <i>Hint:</i>  relates to Internationalization (i18n) <a href="http://www.w3.org/standards/webdesign/i18n" target="_blank">http://www.w3.org/standards/webdesign/i18n</a> </li> 
 * </ul>
	 * @param newValue is new value for the topToBottom field.
	 * @return {@link ScreenFontStyle} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ScreenFontStyle setTopToBottom(boolean newValue);

}
