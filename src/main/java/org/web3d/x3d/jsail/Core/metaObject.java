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

package org.web3d.x3d.jsail.Core;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.*; // again making sure #2

import java.util.Arrays;
import org.web3d.x3d.sai.Core.*;  // making sure #3
import org.web3d.x3d.jsail.*;
import org.web3d.x3d.jsail.Core.*;

import org.web3d.x3d.jsail.fields.*; // making sure #4

/**
 * Functional summary: the meta statement provides metadata information about a scene, where name and content attributes provide attribute=value metadata pairs. This concrete class represents an X3D meta statement.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] The meta statement provides metadata information about the X3D model, following the same naming conventions as HTML's meta tag. The name and content attributes together define key=value metadata pairs.
 * <ul>
 *  <li> <i>Hint:</i> X3D XML Encoding <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#Header" target="_blank">https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#Header</a> </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, meta Statements <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements</a> </li> 
 *  <li> <i>Hint:</i> W3C HTML5 Recommendation, 4.2.5 The meta element <a href="https://www.w3.org/TR/html5/document-metadata.html#the-meta-element" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#the-meta-element</a> </li> 
 *  <li> <i>Warning:</i> the META statement is capitalized in the X3D Architecture specification and in the X3D ClassicVRML Encoding. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 7.2.5.6 META statement <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#METAStatement" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#METAStatement</a> </li> 
 * </ul>
 *  Metadata terms for consistent referencing:
 * <ul>
 * <li> Dublin Core Metadata Initiative (DCMI): <a href="http://www.dublincore.org/documents/dcmi-terms" target="_blank">Terms</a> and  <a href="http://www.dublincore.org/documents/dces" target="_blank">Element Set</a> </li>
 * <li> HTML5 section 4.2.5: <a href="https://www.w3.org/TR/html5/document-metadata.html#the-meta-element" target="_blank">The meta element</a> </li>
 * <li> HTML4 section 7.4.4: <a href="http://www.w3.org/TR/html4/struct/global.html#h-7.4.4" target="_blank">Meta data</a> </li>
 * <li> <a href="http://vancouver-webpages.com/META" target="_blank">Dictionary of HTML META Tags</a>    (<a href="http://vancouver-webpages.com/META/about-mk-metas2.html" target="_blank">About</a>) </li>
 * </ul>
 *  Metadata terms for language codes:
 * <ul>
 * <li> IETF Best Current Practice (BCP) 47: <a href="https://tools.ietf.org/html/bcp47" target="_blank">Tags for Identifying Languages</a> </li>
 * <li> ISO 639-2: <a href="http://www.loc.gov/standards/iso639-2/langhome.html" target="_blank">Codes for the Representation of Names of Languages</a> </li>
 * <li> Internet Assigned Numbers Authority (IANA) Protocol Registries: <a href="http://www.iana.org/protocols#index_L" target="_blank">Language Tags</a> </li>
 * </ul>

 * <br>

 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Header" target="blank">X3D Abstract Specification: meta</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#meta" target="_blank">X3D Tooltips: meta</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: metaStatements</a>
    */
public class metaObject extends org.web3d.x3d.jsail.X3DConcreteStatement
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=content, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=content, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String content; // SFString

 /* @name=dir, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=dir, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String dir; // SFString

 /* @name=http-equiv, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=http_equiv, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String http_equiv; // SFString

 /* @name=lang, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=lang, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String lang; // SFString

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

 /* @name=scheme, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=scheme, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String scheme; // SFString

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "rtl", "ltr".
<br ><br >
	 * metaDirectionChoices are strictly allowed enumeration values for meta element direction field.
	 * @see  <a href="http://www.w3.org/TR/html4/struct/dirlang.html#adef-dir" target="_blank">http://www.w3.org/TR/html4/struct/dirlang.html#adef-dir</a> 
	*/
	public static final ArrayList<String> metaDirectionChoices = new ArrayList<>(Arrays.<String>asList("rtl", "ltr"));

	/** 
	 * <i>Tooltip:</i> right-to-left.
	 * SFString field named <i>dir</i> with X3DUOM baseType <i>metaDirectionChoices</i> can equal this value <i>"rtl"</i> (Java syntax) or <i>rtl</i> (XML syntax).
	 * @see #metaDirectionChoices */
	public static final String DIR_RTL = "rtl";

	/** 
	 * <i>Tooltip:</i> left-to-right.
	 * SFString field named <i>dir</i> with X3DUOM baseType <i>metaDirectionChoices</i> can equal this value <i>"ltr"</i> (Java syntax) or <i>ltr</i> (XML syntax).
	 * @see #metaDirectionChoices */
	public static final String DIR_LTR = "ltr";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "accessRights", "author", "contributor", "created", "creator", "description", "disclaimer", "drawing", "error", "generator", "hint", "identifier", "Image", "info", "information", "isVersionOf", "keywords", "license", "mediator", "modified", "movie", "MovingImage", "original", "photo", "photograph", "publisher", "reference", "requires", "rights", "robots", "Sound", "source", "specificationSection", "specificationUrl", "subject", "Text", "title", "TODO", "translator", "translated", "version", "warning".
<br ><br >
	 * metaNameValues are suggested optional values for meta element name field. Additional names are also defined and allowed.
	 * @see  <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaTags" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaTags</a> 
	*/
	public static final ArrayList<String> metaNameValues = new ArrayList<>(Arrays.<String>asList("accessRights", "author", "contributor", "created", "creator", "description", "disclaimer", "drawing", "error", "generator", "hint", "identifier", "Image", "info", "information", "isVersionOf", "keywords", "license", "mediator", "modified", "movie", "MovingImage", "original", "photo", "photograph", "publisher", "reference", "requires", "rights", "robots", "Sound", "source", "specificationSection", "specificationUrl", "subject", "Text", "title", "TODO", "translator", "translated", "version", "warning"));

	/** 
	 * <i>Tooltip:</i> permission required to access resource or security status.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"accessRights"</i> (Java syntax) or <i>accessRights</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-accessRights" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-accessRights</a>  */
	public static final String NAME_ACCESSRIGHTS = "accessRights";

	/** 
	 * <i>Tooltip:</i> name of individual author.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"author"</i> (Java syntax) or <i>author</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="https://www.w3.org/TR/html5/document-metadata.html#author" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#author</a>  */
	public static final String NAME_AUTHOR = "author";

	/** 
	 * <i>Tooltip:</i> name of individual contributing to this resource.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"contributor"</i> (Java syntax) or <i>contributor</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-contributor" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-contributor</a>  */
	public static final String NAME_CONTRIBUTOR = "contributor";

	/** 
	 * <i>Tooltip:</i> date of initial version.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"created"</i> (Java syntax) or <i>created</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-created" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-created</a>  */
	public static final String NAME_CREATED = "created";

	/** 
	 * <i>Tooltip:</i> name of original author.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"creator"</i> (Java syntax) or <i>creator</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-creator" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-creator</a>  */
	public static final String NAME_CREATOR = "creator";

	/** 
	 * <i>Tooltip:</i> summary overview describing this resource.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"description"</i> (Java syntax) or <i>description</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-description" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-description</a>  */
	public static final String NAME_DESCRIPTION = "description";

	/** 
	 * <i>Tooltip:</i> statement of denial or disavowal regarding potential claims or responsiblity.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"disclaimer"</i> (Java syntax) or <i>disclaimer</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_DISCLAIMER = "disclaimer";

	/** 
	 * <i>Tooltip:</i> name or reference link to a supporting drawing or sketch file.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"drawing"</i> (Java syntax) or <i>drawing</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_DRAWING = "drawing";

	/** 
	 * <i>Tooltip:</i> information about an error (or known problem) that can prevent proper operation.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"error"</i> (Java syntax) or <i>error</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_ERROR = "error";

	/** 
	 * <i>Tooltip:</i> authoring tool or translation tool.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"generator"</i> (Java syntax) or <i>generator</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="https://www.w3.org/TR/html5/document-metadata.html#generator" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#generator</a>  */
	public static final String NAME_GENERATOR = "generator";

	/** 
	 * <i>Tooltip:</i> user hint about resource features or operation.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"hint"</i> (Java syntax) or <i>hint</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_HINT = "hint";

	/** 
	 * <i>Tooltip:</i> url address or unique Uniform Resource Identifier (URI) for resource.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"identifier"</i> (Java syntax) or <i>identifier</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-identifier" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-identifier</a>  */
	public static final String NAME_IDENTIFIER = "identifier";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting image file.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"Image"</i> (Java syntax) or <i>Image</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#dcmitype-Image" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#dcmitype-Image</a>  */
	public static final String NAME_IMAGE = "Image";

	/** 
	 * <i>Tooltip:</i> additional info of interest.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"info"</i> (Java syntax) or <i>info</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_INFO = "info";

	/** 
	 * <i>Tooltip:</i> additional information of interest.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"information"</i> (Java syntax) or <i>information</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_INFORMATION = "information";

	/** 
	 * <i>Tooltip:</i> Related resource of which the described resource is a version, edition, or adaptation.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"isVersionOf"</i> (Java syntax) or <i>isVersionOf</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-isVersionOf" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-isVersionOf</a>  */
	public static final String NAME_ISVERSIONOF = "isVersionOf";

	/** 
	 * <i>Tooltip:</i> comma-separated tokens, each of which is a keyword of interest.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"keywords"</i> (Java syntax) or <i>keywords</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="https://www.w3.org/TR/html5/document-metadata.html#keywords" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#keywords</a>  */
	public static final String NAME_KEYWORDS = "keywords";

	/** 
	 * <i>Tooltip:</i> content or software license.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"license"</i> (Java syntax) or <i>license</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-license" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-license</a>  */
	public static final String NAME_LICENSE = "license";

	/** 
	 * <i>Tooltip:</i> entity that mediates access to resource and for whom resource is intended or useful.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"mediator"</i> (Java syntax) or <i>mediator</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-mediator" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-mediator</a>  */
	public static final String NAME_MEDIATOR = "mediator";

	/** 
	 * <i>Tooltip:</i> date of modified version.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"modified"</i> (Java syntax) or <i>modified</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-modified" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-modified</a>  */
	public static final String NAME_MODIFIED = "modified";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting movie file (note that Dublin Core term is MovingImage).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"movie"</i> (Java syntax) or <i>movie</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_MOVIE = "movie";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting movie.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"MovingImage"</i> (Java syntax) or <i>MovingImage</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#dcmitype-MovingImage" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#dcmitype-MovingImage</a>  */
	public static final String NAME_MOVINGIMAGE = "MovingImage";

	/** 
	 * <i>Tooltip:</i> name or reference link to original file or resource.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"original"</i> (Java syntax) or <i>original</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_ORIGINAL = "original";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting photo file (note that Dublin Core term is Image).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"photo"</i> (Java syntax) or <i>photo</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_PHOTO = "photo";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting photograph file (note that Dublin Core term is Image).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"photograph"</i> (Java syntax) or <i>photograph</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_PHOTOGRAPH = "photograph";

	/** 
	 * <i>Tooltip:</i> entity responsible for making the resource available.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"publisher"</i> (Java syntax) or <i>publisher</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-publisher" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-publisher</a>  */
	public static final String NAME_PUBLISHER = "publisher";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting reference.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"reference"</i> (Java syntax) or <i>reference</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-references" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-references</a>  */
	public static final String NAME_REFERENCE = "reference";

	/** 
	 * <i>Tooltip:</i> prerequisites for operation or viewing.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"requires"</i> (Java syntax) or <i>requires</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-requires" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-requires</a>  */
	public static final String NAME_REQUIRES = "requires";

	/** 
	 * <i>Tooltip:</i> intellectual property rights (IPR).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"rights"</i> (Java syntax) or <i>rights</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-rights" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-rights</a>  */
	public static final String NAME_RIGHTS = "rights";

	/** 
	 * <i>Tooltip:</i> search engine and web-spider guidance value: noindex to block page indexing, nofollow to block following links.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"robots"</i> (Java syntax) or <i>robots</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="https://developers.google.com/search/reference/robots_meta_tag" target="_blank">https://developers.google.com/search/reference/robots_meta_tag</a>  */
	public static final String NAME_ROBOTS = "robots";

	/** 
	 * <i>Tooltip:</i> name or reference link to supporting sound file.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"Sound"</i> (Java syntax) or <i>Sound</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#dcmitype-Sound" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#dcmitype-Sound</a>  */
	public static final String NAME_SOUND = "Sound";

	/** 
	 * <i>Tooltip:</i> related resource from which the described resource is derived.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"source"</i> (Java syntax) or <i>source</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-source" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-source</a>  */
	public static final String NAME_SOURCE = "source";

	/** 
	 * <i>Tooltip:</i> title of relevant specification section.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"specificationSection"</i> (Java syntax) or <i>specificationSection</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_SPECIFICATIONSECTION = "specificationSection";

	/** 
	 * <i>Tooltip:</i> url for relevant specification section.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"specificationUrl"</i> (Java syntax) or <i>specificationUrl</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="https://www.web3d.org/standards" target="_blank">https://www.web3d.org/standards</a>  */
	public static final String NAME_SPECIFICATIONURL = "specificationUrl";

	/** 
	 * <i>Tooltip:</i> search-index subject keywords, key phrases, or classification codes.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"subject"</i> (Java syntax) or <i>subject</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-subject" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-subject</a>  */
	public static final String NAME_SUBJECT = "subject";

	/** 
	 * <i>Tooltip:</i> resource consisting primarily of words for reading.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"Text"</i> (Java syntax) or <i>Text</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#dcmitype-Text" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#dcmitype-Text</a>  */
	public static final String NAME_TEXT = "Text";

	/** 
	 * <i>Tooltip:</i> file name for this resource.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"title"</i> (Java syntax) or <i>title</i> (XML syntax).
	 * @see #metaNameValues
	 * @see  <a href="http://www.dublincore.org/documents/dcmi-terms/#terms-title" target="_blank">http://www.dublincore.org/documents/dcmi-terms/#terms-title</a>  */
	public static final String NAME_TITLE = "title";

	/** 
	 * <i>Tooltip:</i> action item "to do" that still needs to be performed.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"TODO"</i> (Java syntax) or <i>TODO</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_TODO = "TODO";

	/** 
	 * <i>Tooltip:</i> name of person performing translation from another format or language.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"translator"</i> (Java syntax) or <i>translator</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_TRANSLATOR = "translator";

	/** 
	 * <i>Tooltip:</i> date of translation from another format or language.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"translated"</i> (Java syntax) or <i>translated</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_TRANSLATED = "translated";

	/** 
	 * <i>Tooltip:</i> current version number or ID of this resource.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"version"</i> (Java syntax) or <i>version</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_VERSION = "version";

	/** 
	 * <i>Tooltip:</i> warning information about a known problem that impedes proper operation.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>metaNameValues</i> can equal this value <i>"warning"</i> (Java syntax) or <i>warning</i> (XML syntax).
	 * @see #metaNameValues */
	public static final String NAME_WARNING = "warning";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>meta</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "meta";

	/** Provides name of this element: <i>meta</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>meta</i> element: <i>Core</i> */
	public static final String COMPONENT = "Core";

	/** Defines X3D component for the <i>meta</i> element: <i>Core</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Core</i> component level for this element: <i>1</i> */
	public static final int LEVEL = 1;

	/** Provides default X3D component level for this element: <i>1</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFString field named <i>content</i> has default value equal to an empty string. */
	public static final String CONTENT_DEFAULT_VALUE = "";

	/** SFString field named <i>dir</i> has default value equal to an empty string. */
	public static final String DIR_DEFAULT_VALUE = "";

	/** SFString field named <i>http_equiv</i> has default value equal to an empty string. */
	public static final String HTTP_EQUIV_DEFAULT_VALUE = "";

	/** SFString field named <i>lang</i> has default value equal to an empty string. */
	public static final String LANG_DEFAULT_VALUE = "";

	/** SFString field named <i>name</i> has default value equal to an empty string. */
	public static final String NAME_DEFAULT_VALUE = "";

	/** SFString field named <i>scheme</i> has default value equal to an empty string. */
	public static final String SCHEME_DEFAULT_VALUE = "";

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D statement
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_TYPE
	 * @return X3D type (SFvec3f etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE if not recognized
	 */
	@Override		
	public String getFieldType(String fieldName)
	{
		String result;

		switch (fieldName)
		{
			// String constants for exact field type values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing type-matching checks
											
			case "containerField":
				result = "SFString";
				break;
			case "content":
				result = "SFString";
				break;
			case "dir":
				result = "SFString";
				break;
			case "http_equiv":
				result = "SFString";
				break;
			case "lang":
				result = "SFString";
				break;
			case "name":
				result = "SFString";
				break;
			case "scheme":
				result = "SFString";
				break;
			default:
			{
				// if fieldName has a prefix "set_" prepended (or a suffix "_changed" appended) then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getFieldType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getFieldType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE; // unique return value avoids mistaken matches
			}
		}
		return result;
	}

	/** Indicate accessType corresponding to given fieldName.
	 * @param fieldName name of field in this X3D statement
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_ACCESSTYPE
	 * @return X3D accessType (inputOnly etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE if not recognized
	 */
	@Override
	public String getAccessType(String fieldName)
	{
		String result; // set by following checks
		switch (fieldName)
		{
			// String constants for field accessType values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing accessType-matching checks
			case "content":
				result = "inputOutput";
				break;
			case "dir":
				result = "inputOutput";
				break;
			case "http_equiv":
				result = "inputOutput";
				break;
			case "lang":
				result = "inputOutput";
				break;
			case "name":
				result = "inputOutput";
				break;
			case "scheme":
				result = "inputOutput";
				break;
			default:
			{
				// if user has added a prefix "set_" or suffix "_changed" then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getAccessType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getAccessType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE; // unique return value avoids mistaken matches
			}
		}
		return result;
	}

	/** Constructor for metaObject to initialize member variables with default values. */
	public metaObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		content = CONTENT_DEFAULT_VALUE;
		dir = DIR_DEFAULT_VALUE;
		http_equiv = HTTP_EQUIV_DEFAULT_VALUE;
		lang = LANG_DEFAULT_VALUE;
		name = NAME_DEFAULT_VALUE;
		scheme = SCHEME_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String value from inputOutput SFString field named <i>content</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The content attribute provides metadata information relevant to the name attribute provided. The name and content attributes together define key=value metadata pairs.
 * <ul>
 *  <li> <i>Hint:</i> for broadest searchability, use Dublin Core Metadata Initiative (DCMI) terms for name values. <a href="http://www.dublincore.org/documents/dcmi-terms" target="_blank">http://www.dublincore.org/documents/dcmi-terms</a> </li> 
 *  <li> <i>Warning:</i> Dublin Core Metadata Initiative (DCMI) requires name to be a token appendable to a URI, so normal expectation for a typical name is type NMTOKEN with no whitespace. </li> 
 *  <li> <i>Hint:</i> alternatively the content attribute can support the http-equiv attribute. </li> 
 *  <li> <i>Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @return value of content field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getContent()
	{
		return content;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>content</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The content attribute provides metadata information relevant to the name attribute provided. The name and content attributes together define key=value metadata pairs.
 * <ul>
 *  <li> <i>Hint:</i> for broadest searchability, use Dublin Core Metadata Initiative (DCMI) terms for name values. <a href="http://www.dublincore.org/documents/dcmi-terms" target="_blank">http://www.dublincore.org/documents/dcmi-terms</a> </li> 
 *  <li> <i>Warning:</i> Dublin Core Metadata Initiative (DCMI) requires name to be a token appendable to a URI, so normal expectation for a typical name is type NMTOKEN with no whitespace. </li> 
 *  <li> <i>Hint:</i> alternatively the content attribute can support the http-equiv attribute. </li> 
 *  <li> <i>Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @param newValue is new value for the content field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public final metaObject setContent(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		content = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString content field, similar to {@link #setContent(String)}.
	 * @param newValue is new value for the content field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setContent(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setContent(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType metaDirectionChoices) ["rtl" | "ltr"] from inputOutput SFString field named <i>dir</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Direction for weak/neutral text (ltr=left-to-right, rtl=right-to-left). See &lt;a href="http://www.w3.org/TR/html4/struct/dirlang.html#adef-dir" target="_blank"&gt;http://www.w3.org/TR/html4/struct/dirlang.html#adef-dir&lt;/a&gt;  * <br>

	 * <br><br>
	 * Available enumeration values for string comparison: {@link #DIR_RTL RTL}, {@link #DIR_LTR LTR}.
	 * @return value of dir field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getDir()
	{
		return dir;
	}

	/**
	 * Accessor method to assign String enumeration value ("rtl" | "ltr") to inputOutput SFString field named <i>dir</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #DIR_RTL RTL}, {@link #DIR_LTR LTR}).
	 * <br><br>
	 * <i>Tooltip:</i>  Direction for weak/neutral text (ltr=left-to-right, rtl=right-to-left). See &lt;a href="http://www.w3.org/TR/html4/struct/dirlang.html#adef-dir" target="_blank"&gt;http://www.w3.org/TR/html4/struct/dirlang.html#adef-dir&lt;/a&gt;  * <br>

	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @param newValue is new value for the dir field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setDir(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			newValue = new String(); // null string check
        }
		newValue = MFStringObject.cleanupUnescapedEnclosingQuotes(newValue); // handle potential enumeration value
		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(DIR_RTL) ||
			newValue.equals(DIR_LTR)))
		{
			String warningMessage = "Warning: meta dir newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		dir = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString dir field, similar to {@link #setDir(String)}.
	 * @param newValue is new value for the dir field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setDir(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDir(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>http-equiv</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The http-equiv attribute provides an HTTP header for the value of the content attribute. Example: &amp;lt;meta http-equiv='Expires' content='Tue, 20 Aug 1996 14:25:27 GMT'&amp;gt;.
 * <ul>
 *  <li> <i>Hint:</i> the http-equiv attribute can be used to simulate an HTTP response header. </li> 
 *  <li> <i>Warning:</i> if the name attribute is set, the http-equiv attribute should not be set. </li> 
 *  <li> <i>Hint:</i>  see <a href="http://www.w3.org/TR/html4/struct/global.html#adef-http-equiv" target="_blank">http://www.w3.org/TR/html4/struct/global.html#adef-http-equiv</a> </li> 
 * </ul>
	 * @return value of http-equiv field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getHttp_equiv()
	{
		return http_equiv;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>http-equiv</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The http-equiv attribute provides an HTTP header for the value of the content attribute. Example: &amp;lt;meta http-equiv='Expires' content='Tue, 20 Aug 1996 14:25:27 GMT'&amp;gt;.
 * <ul>
 *  <li> <i>Hint:</i> the http-equiv attribute can be used to simulate an HTTP response header. </li> 
 *  <li> <i>Warning:</i> if the name attribute is set, the http-equiv attribute should not be set. </li> 
 *  <li> <i>Hint:</i>  see <a href="http://www.w3.org/TR/html4/struct/global.html#adef-http-equiv" target="_blank">http://www.w3.org/TR/html4/struct/global.html#adef-http-equiv</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @param newValue is new value for the http-equiv field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setHttp_equiv(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		http_equiv = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString http_equiv field, similar to {@link #setHttp_equiv(String)}.
	 * @param newValue is new value for the http-equiv field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setHttp_equiv(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setHttp_equiv(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>lang</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Language code, as per [IETF BCP47/RFC5646] <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt" target="_blank">http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a> and described in <a href="http://www.w3.org/International/articles/language-elements" target="_blank">http://www.w3.org/International/articles/language-elements</a>
 * <ul>
 *  <li> <i> Hint:</i>  Language Subtag Lookup at <a href="http://people.w3.org/rishida/utils/subelements" target="_blank">http://people.w3.org/rishida/utils/subelements</a> </li> 
 * </ul>
	 * @return value of lang field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getLang()
	{
		return lang;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>lang</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Language code, as per [IETF BCP47/RFC5646] <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt" target="_blank">http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a> and described in <a href="http://www.w3.org/International/articles/language-elements" target="_blank">http://www.w3.org/International/articles/language-elements</a>
 * <ul>
 *  <li> <i> Hint:</i>  Language Subtag Lookup at <a href="http://people.w3.org/rishida/utils/subelements" target="_blank">http://people.w3.org/rishida/utils/subelements</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @param newValue is new value for the lang field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setLang(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		lang = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString lang field, similar to {@link #setLang(String)}.
	 * @param newValue is new value for the lang field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setLang(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLang(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType metaNameValues) ["accessRights" | "author" | "contributor" | "created" | "creator" | "description" | "disclaimer" | "drawing" | "error" | "generator" | "hint" | "identifier" | "Image" | "info" | "information" | "isVersionOf" | "keywords" | "license" | "mediator" | "modified" | "movie" | "MovingImage" | "original" | "photo" | "photograph" | "publisher" | "reference" | "requires" | "rights" | "robots" | "Sound" | "source" | "specificationSection" | "specificationUrl" | "subject" | "Text" | "title" | "TODO" | "translator" | "translated" | "version" | "warning" | 'etc.'] from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Keyword name of the meta attribute, following the same naming conventions as HTML's meta tag.
 * <ul>
 *  <li> <i>Hint:</i> for broadest searchability, use Dublin Core Metadata Initiative (DCMI) terms for name values. <a href="http://www.dublincore.org/documents/dcmi-terms" target="_blank">http://www.dublincore.org/documents/dcmi-terms</a> </li> 
 *  <li> <i>Warning:</i> Dublin Core Metadata Initiative (DCMI) requires name to be a token appendable to a URI, so normal expectation for a typical name is type NMTOKEN with no whitespace. </li> 
 *  <li> <i>Warning:</i> if the name attribute is set, the http-equiv attribute should not be set. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 *  <li> <i>Hint:</i> HTML5 section 4.2.5.1. Standard metadata names <a href="https://www.w3.org/TR/html5/document-metadata.html#standard-metadata-names" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#standard-metadata-names</a> </li> 
 *  <li> <i>Hint:</i> HTML5 section 4.2.5.2. Other metadata names <a href="https://www.w3.org/TR/html5/document-metadata.html#other-metadata-names" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#other-metadata-names</a> </li> 
 *  <li> <i>Hint:</i> WHATWG Wiki MetaExtensions <a href="https://wiki.whatwg.org/wiki/MetaExtensions" target="_blank">https://wiki.whatwg.org/wiki/MetaExtensions</a> </li> 
 *  <li> <i>Warning:</i>  NMTOKEN validation is strict, no whitespace allowed. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #NAME_ACCESSRIGHTS ACCESSRIGHTS}, {@link #NAME_AUTHOR AUTHOR}, {@link #NAME_CONTRIBUTOR CONTRIBUTOR}, {@link #NAME_CREATED CREATED}, {@link #NAME_CREATOR CREATOR}, {@link #NAME_DESCRIPTION DESCRIPTION}, {@link #NAME_DISCLAIMER DISCLAIMER}, {@link #NAME_DRAWING DRAWING}, {@link #NAME_ERROR ERROR}, {@link #NAME_GENERATOR GENERATOR}, {@link #NAME_HINT HINT}, {@link #NAME_IDENTIFIER IDENTIFIER}, {@link #NAME_IMAGE IMAGE}, {@link #NAME_INFO INFO}, {@link #NAME_INFORMATION INFORMATION}, {@link #NAME_ISVERSIONOF ISVERSIONOF}, {@link #NAME_KEYWORDS KEYWORDS}, {@link #NAME_LICENSE LICENSE}, {@link #NAME_MEDIATOR MEDIATOR}, {@link #NAME_MODIFIED MODIFIED}, {@link #NAME_MOVIE MOVIE}, {@link #NAME_MOVINGIMAGE MOVINGIMAGE}, {@link #NAME_ORIGINAL ORIGINAL}, {@link #NAME_PHOTO PHOTO}, {@link #NAME_PHOTOGRAPH PHOTOGRAPH}, {@link #NAME_PUBLISHER PUBLISHER}, {@link #NAME_REFERENCE REFERENCE}, {@link #NAME_REQUIRES REQUIRES}, {@link #NAME_RIGHTS RIGHTS}, {@link #NAME_ROBOTS ROBOTS}, {@link #NAME_SOUND SOUND}, {@link #NAME_SOURCE SOURCE}, {@link #NAME_SPECIFICATIONSECTION SPECIFICATIONSECTION}, {@link #NAME_SPECIFICATIONURL SPECIFICATIONURL}, {@link #NAME_SUBJECT SUBJECT}, {@link #NAME_TEXT TEXT}, {@link #NAME_TITLE TITLE}, {@link #NAME_TODO TODO}, {@link #NAME_TRANSLATOR TRANSLATOR}, {@link #NAME_TRANSLATED TRANSLATED}, {@link #NAME_VERSION VERSION}, {@link #NAME_WARNING WARNING}.
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String enumeration value ("accessRights" | "author" | "contributor" | "created" | "creator" | "description" | "disclaimer" | "drawing" | "error" | "generator" | "hint" | "identifier" | "Image" | "info" | "information" | "isVersionOf" | "keywords" | "license" | "mediator" | "modified" | "movie" | "MovingImage" | "original" | "photo" | "photograph" | "publisher" | "reference" | "requires" | "rights" | "robots" | "Sound" | "source" | "specificationSection" | "specificationUrl" | "subject" | "Text" | "title" | "TODO" | "translator" | "translated" | "version" | "warning") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Hint:</i> authors have option to choose from an extendible list of predefined enumeration values ({@link #NAME_ACCESSRIGHTS ACCESSRIGHTS}, {@link #NAME_AUTHOR AUTHOR}, {@link #NAME_CONTRIBUTOR CONTRIBUTOR}, {@link #NAME_CREATED CREATED}, {@link #NAME_CREATOR CREATOR}, {@link #NAME_DESCRIPTION DESCRIPTION}, {@link #NAME_DISCLAIMER DISCLAIMER}, {@link #NAME_DRAWING DRAWING}, {@link #NAME_ERROR ERROR}, {@link #NAME_GENERATOR GENERATOR}, {@link #NAME_HINT HINT}, {@link #NAME_IDENTIFIER IDENTIFIER}, {@link #NAME_IMAGE IMAGE}, {@link #NAME_INFO INFO}, {@link #NAME_INFORMATION INFORMATION}, {@link #NAME_ISVERSIONOF ISVERSIONOF}, {@link #NAME_KEYWORDS KEYWORDS}, {@link #NAME_LICENSE LICENSE}, {@link #NAME_MEDIATOR MEDIATOR}, {@link #NAME_MODIFIED MODIFIED}, {@link #NAME_MOVIE MOVIE}, {@link #NAME_MOVINGIMAGE MOVINGIMAGE}, {@link #NAME_ORIGINAL ORIGINAL}, {@link #NAME_PHOTO PHOTO}, {@link #NAME_PHOTOGRAPH PHOTOGRAPH}, {@link #NAME_PUBLISHER PUBLISHER}, {@link #NAME_REFERENCE REFERENCE}, {@link #NAME_REQUIRES REQUIRES}, {@link #NAME_RIGHTS RIGHTS}, {@link #NAME_ROBOTS ROBOTS}, {@link #NAME_SOUND SOUND}, {@link #NAME_SOURCE SOURCE}, {@link #NAME_SPECIFICATIONSECTION SPECIFICATIONSECTION}, {@link #NAME_SPECIFICATIONURL SPECIFICATIONURL}, {@link #NAME_SUBJECT SUBJECT}, {@link #NAME_TEXT TEXT}, {@link #NAME_TITLE TITLE}, {@link #NAME_TODO TODO}, {@link #NAME_TRANSLATOR TRANSLATOR}, {@link #NAME_TRANSLATED TRANSLATED}, {@link #NAME_VERSION VERSION}, {@link #NAME_WARNING WARNING}).
	 * <br><br>
	 * <i>Tooltip:</i> Keyword name of the meta attribute, following the same naming conventions as HTML's meta tag.
 * <ul>
 *  <li> <i>Hint:</i> for broadest searchability, use Dublin Core Metadata Initiative (DCMI) terms for name values. <a href="http://www.dublincore.org/documents/dcmi-terms" target="_blank">http://www.dublincore.org/documents/dcmi-terms</a> </li> 
 *  <li> <i>Warning:</i> Dublin Core Metadata Initiative (DCMI) requires name to be a token appendable to a URI, so normal expectation for a typical name is type NMTOKEN with no whitespace. </li> 
 *  <li> <i>Warning:</i> if the name attribute is set, the http-equiv attribute should not be set. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 *  <li> <i>Hint:</i> HTML5 section 4.2.5.1. Standard metadata names <a href="https://www.w3.org/TR/html5/document-metadata.html#standard-metadata-names" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#standard-metadata-names</a> </li> 
 *  <li> <i>Hint:</i> HTML5 section 4.2.5.2. Other metadata names <a href="https://www.w3.org/TR/html5/document-metadata.html#other-metadata-names" target="_blank">https://www.w3.org/TR/html5/document-metadata.html#other-metadata-names</a> </li> 
 *  <li> <i>Hint:</i> WHATWG Wiki MetaExtensions <a href="https://wiki.whatwg.org/wiki/MetaExtensions" target="_blank">https://wiki.whatwg.org/wiki/MetaExtensions</a> </li> 
 *  <li> <i>Warning:</i>  NMTOKEN validation is strict, no whitespace allowed. </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @param newValue is new value for the name field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public final metaObject setName(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			newValue = new String(); // null string check
        }
		newValue = MFStringObject.cleanupUnescapedEnclosingQuotes(newValue); // handle potential enumeration value
		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(NAME_ACCESSRIGHTS) ||
			newValue.equals(NAME_AUTHOR) ||
			newValue.equals(NAME_CONTRIBUTOR) ||
			newValue.equals(NAME_CREATED) ||
			newValue.equals(NAME_CREATOR) ||
			newValue.equals(NAME_DESCRIPTION) ||
			newValue.equals(NAME_DISCLAIMER) ||
			newValue.equals(NAME_DRAWING) ||
			newValue.equals(NAME_ERROR) ||
			newValue.equals(NAME_GENERATOR) ||
			newValue.equals(NAME_HINT) ||
			newValue.equals(NAME_IDENTIFIER) ||
			newValue.equals(NAME_IMAGE) ||
			newValue.equals(NAME_INFO) ||
			newValue.equals(NAME_INFORMATION) ||
			newValue.equals(NAME_ISVERSIONOF) ||
			newValue.equals(NAME_KEYWORDS) ||
			newValue.equals(NAME_LICENSE) ||
			newValue.equals(NAME_MEDIATOR) ||
			newValue.equals(NAME_MODIFIED) ||
			newValue.equals(NAME_MOVIE) ||
			newValue.equals(NAME_MOVINGIMAGE) ||
			newValue.equals(NAME_ORIGINAL) ||
			newValue.equals(NAME_PHOTO) ||
			newValue.equals(NAME_PHOTOGRAPH) ||
			newValue.equals(NAME_PUBLISHER) ||
			newValue.equals(NAME_REFERENCE) ||
			newValue.equals(NAME_REQUIRES) ||
			newValue.equals(NAME_RIGHTS) ||
			newValue.equals(NAME_ROBOTS) ||
			newValue.equals(NAME_SOUND) ||
			newValue.equals(NAME_SOURCE) ||
			newValue.equals(NAME_SPECIFICATIONSECTION) ||
			newValue.equals(NAME_SPECIFICATIONURL) ||
			newValue.equals(NAME_SUBJECT) ||
			newValue.equals(NAME_TEXT) ||
			newValue.equals(NAME_TITLE) ||
			newValue.equals(NAME_TODO) ||
			newValue.equals(NAME_TRANSLATOR) ||
			newValue.equals(NAME_TRANSLATED) ||
			newValue.equals(NAME_VERSION) ||
			newValue.equals(NAME_WARNING)))
		{
			String warningMessage = "Warning: meta name newValue=\"" + newValue + "\" has an unrecognized value not matching any of the optional string tokens.";

			if (newValue.equalsIgnoreCase("permissions"))
				warningMessage += " Suggested meta term: name='accessRights'";
			else if (newValue.equalsIgnoreCase("audio") || newValue.equalsIgnoreCase("midi") || newValue.equalsIgnoreCase("sounds"))
				warningMessage += " Suggested meta term: name='Sound'";
			else if (newValue.equalsIgnoreCase("generated") || newValue.equalsIgnoreCase("imported"))
				warningMessage += " Suggested meta term: name='created'";
			else if (newValue.equalsIgnoreCase("organization"))
				warningMessage += " Suggested meta term: name='contributor'";
			else if (newValue.equalsIgnoreCase("comment"))
				warningMessage += " Suggested meta term: name='hint' or name='info'";
			else if (newValue.toLowerCase().startsWith("revised") || newValue.equalsIgnoreCase("revision"))
				warningMessage += " Suggested meta term: name='modified' or name='contributor'";
			else if (newValue.toLowerCase().startsWith("film") || newValue.toLowerCase().startsWith("movie") || newValue.equalsIgnoreCase("video"))
				warningMessage += " Suggested meta term: name='MovingImage'";
			else if (newValue.toLowerCase().equalsIgnoreCase("diagram") || newValue.equalsIgnoreCase("painting") || 
					 newValue.equalsIgnoreCase("picture") || newValue.toLowerCase().contains("texture"))
				warningMessage += " Suggested meta term: name='Image'";
			else if (newValue.equalsIgnoreCase("documentation") || newValue.equalsIgnoreCase("example") || newValue.equalsIgnoreCase("resource"))
				warningMessage += " Suggested meta term: name='reference'";
			else if (newValue.equalsIgnoreCase("name") || newValue.equalsIgnoreCase("filename"))
				warningMessage += " Suggested meta term: name='title'";
			else if (newValue.trim().toUpperCase().startsWith("TODO "))
				warningMessage += " Suggested meta term: name='TODO' with additional information '" + 
					 newValue.trim().substring(5) + "' moved into content attribute";
			else if (!newValue.equals("TODO") && newValue.toUpperCase().equals("TODO"))
				warningMessage += " Suggested meta term: name='TODO'";
			if (newValue.contains("[") || newValue.contains("]"))
				warningMessage += " Avoid [square brackets] in name value.";
			if (newValue.contains("(") || newValue.contains(")"))
				warningMessage += " Avoid (parentheses) in name value.";
			if (newValue.contains("'"))
				warningMessage += " Avoid 'apostrophes' in name value.";
			if (newValue.contains("\""))
				warningMessage += " Avoid \"quotation marks\" in name value.";
			System.out.println(warningMessage);
		}
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to meta name
		if (!org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("meta name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("meta name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>scheme</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  The scheme attribute allows authors to provide user agents more context for the correct interpretation of meta information. For example, &amp;lt;meta scheme="ISBN" name="identifier" content="0-8230-2355-9"&amp;gt; See &lt;a href="http://www.w3.org/TR/html4/struct/global.html#idx-scheme" target="_blank"&gt;http://www.w3.org/TR/html4/struct/global.html#idx-scheme&lt;/a&gt;  * <br>

	 * @return value of scheme field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getScheme()
	{
		return scheme;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>scheme</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  The scheme attribute allows authors to provide user agents more context for the correct interpretation of meta information. For example, &amp;lt;meta scheme="ISBN" name="identifier" content="0-8230-2355-9"&amp;gt; See &lt;a href="http://www.w3.org/TR/html4/struct/global.html#idx-scheme" target="_blank"&gt;http://www.w3.org/TR/html4/struct/global.html#idx-scheme&lt;/a&gt;  * <br>

	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @param newValue is new value for the scheme field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setScheme(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		scheme = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString scheme field, similar to {@link #setScheme(String)}.
	 * @param newValue is new value for the scheme field.
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public metaObject setScheme(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setScheme(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Utility constructor that assigns name-value pair for name and content attributes.
	 * @param newName  name for this meta element
	 * @param newContent content value for this meta element
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#meta">X3D Tooltips: meta statement</a>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#metaStatements" target="_blank">X3D Scene Authoring Hints: meta Statements</a>
	 * @see <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#NMTOKEN">X3D Tooltips: type NMTOKEN</a>
	 */
	public metaObject (String newName, String newContent)
	{
		initialize();
		setName   (newName);
		setContent(newContent);
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public metaObject addComments (String newComment)
	{
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public metaObject addComments (String[] newComments)
	{
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link metaObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public metaObject addComments (CommentsBlock newCommentsBlock)
	{
		commentsList.addAll(newCommentsBlock.toStringList());
		return this;
	}
		
	/**
	 * Recursive method to provide X3D string serialization of this model subgraph, utilizing XML encoding and conforming to X3D Canonical Form.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_X3D
	 * @see X3DObject#FILE_EXTENSION_XML
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see X3DObject#toFileX3D(String)
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/X3D_XML.html">X3D XML Encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-3/V3.3/Part03/concepts.html#X3DCanonicalForm" target="blank">X3D Compressed Binary Encoding: X3D Canonical Form</a>
	 * @see <a href="https://www.web3d.org/x3d/tools/canonical/doc/x3dTools.htm">X3D Canonicalization (C14N) Tool</a>
	 * @return X3D string
	 */
	@Override
	public String toStringX3D(int indentLevel)
	{
		boolean hasAttributes = true; // TODO check for non-default attribute values
		boolean      hasChild = !commentsList.isEmpty();

		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<meta"); // start opening tag
		if (hasAttributes)
		{
            // test attributes

			if ((!getContent().equals(CONTENT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" content='").append(new SFStringObject(getContent()).toStringX3D()).append("'");
			}
			if ((!getDir().equals(DIR_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" dir='").append(new SFStringObject(getDir()).toStringX3D()).append("'");
			}
			if ((!getHttp_equiv().equals(HTTP_EQUIV_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" http_equiv='").append(new SFStringObject(getHttp_equiv()).toStringX3D()).append("'");
			}
			if ((!getLang().equals(LANG_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" lang='").append(new SFStringObject(getLang()).toStringX3D()).append("'");
			}
			if ((!getName().equals(NAME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" name='").append(new SFStringObject(getName()).toStringX3D()).append("'");
			}
			if ((!getScheme().equals(SCHEME_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */)
			{
				stringX3D.append(" scheme='").append(new SFStringObject(getScheme()).toStringX3D()).append("'");
			}
		}
		if ((hasChild)) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child element
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</meta>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=meta, isX3dStatement=true, isClassX3dStatement=true, $hasChild=true, $hasAttributes=true
	/**
	 * Recursive method to provide ClassicVRML string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_CLASSICVRML
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/X3D_ClassicVRML.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/grammar.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding, Annex A: Grammar</a>
	 * @return ClassicVRML string
	 */
	@Override
	public String toStringClassicVRML(int indentLevel)
	{
		StringBuilder stringClassicVRML = new StringBuilder();
		boolean hasAttributes = true; // TODO further refinement
		boolean      hasChild = !commentsList.isEmpty();
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		// https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/concepts.html#METAStatementSyntax
		stringClassicVRML.append("META \"").append(name).append("\" \"").append(content).append("\"").append("\n");
		
		return stringClassicVRML.toString();
	}

	/**
	 * Recursive method to provide VRML97 string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_VRML97
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772/V2.0/index.html">Virtual Reality Modeling Language (VRML) 97 specification</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772-1/V2.1/index.html">VRML 97 v2.1 Amendment</a>
	 * @return VRML97 string
	 */
	@Override
	public String toStringVRML97(int indentLevel)
	{
		return toStringClassicVRML(indentLevel).replaceAll("META ","#META "); // hide unavailable X3D feature
	}

	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, CAD and HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @see #findNodeByDEF(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found element, null otherwise
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue)
	{
		return findElementByNameValue(nameValue, ""); // empty string is wildcard, any element match is allowed
	}
								
	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, CAD and HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @see #findNodeByDEF(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @return object reference to found element, null otherwise
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue, String elementName)
	{
		if ((nameValue == null) || nameValue.isEmpty())
		{
			String errorNotice = "findElementByNameValue(\"\", " + elementName + ") cannot use empty string to find a name attribute";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		if (elementName == null)
			elementName = "";
		if (getName().equals(nameValue) &&
			(elementName.isEmpty() || elementName.equals(getElementName())))
			return this;
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node or statement with given name attribute is found, meaning both objects are attached to same scene graph.
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @see #findElementByNameValue(String, String)
	 * @return whether node is found
	 */
	public boolean hasElementByNameValue(String nameValue, String elementName)
	{
		return (findElementByNameValue(nameValue, elementName) != null);
	}

	/**
	 * Recursive method to provide object reference to node by DEF, if found as this node or in a contained node.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same DEF, this method does not handle that case.
	 * @see #findElementByNameValue(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found node, null otherwise
	 */
	@Override
	public X3DConcreteNode findNodeByDEF(String DEFvalue)
	{
		if ((DEFvalue == null) || DEFvalue.isEmpty())
		{
			String errorNotice = "findNodeByDEF(\"\") cannot use empty string to find a name";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node with DEFvalue is found, meaning both objects are attached to same scene graph.
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @see #findNodeByDEF(String)
	 * @return whether node is found
	 */
	public boolean hasNodeByDEF(String DEFvalue)
	{
		return (findNodeByDEF(DEFvalue) != null);
	}

		
	/**
	 * Recursive method to validate this element plus all contained nodes and statements, 
	 * using both datatype-specification value checks and regular expression (regex) checking of corresponding string values.
	 * @return validation results (if any)
	 */
	@Override
	public String validate()
	{
		validationResult = new StringBuilder(); // prepare for updated results

		if (getContent().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " content field is required but no value found. ";
            errorNotice += "(meta name='" + getName() + "')";

			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setContent(getContent()); // exercise field checks, simple types
        
		setDir(getDir()); // exercise field checks, simple types
        
		setHttp_equiv(getHttp_equiv()); // exercise field checks, simple types
        
		setLang(getLang()); // exercise field checks, simple types
        
		if (getName().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " name field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setName(getName()); // exercise field checks, simple types
        
		setScheme(getScheme()); // exercise field checks, simple types
        
        String warningMessage = new String();
        if (getName().contains("\""))
			warningMessage += "WARNING, avoid quotes in name: <meta name='" + getName() + "' content='" + getContent() + "'/>";
        if (getContent().startsWith("\"") && getContent().endsWith("\""))
			warningMessage += "WARNING, avoid quoting content value: <meta name='" + getName() + "' content='" + getContent() + "'/>";

		// TODO consider if ConfigurationProperties for verbose output is appropriate
		if (getName().equals(NAME_ERROR) ||
			getName().equals(NAME_HINT) ||
			getName().equals(NAME_INFO) ||
			getName().equals(NAME_INFORMATION) ||
			getName().equals(NAME_WARNING))
		{
            // diagnostice handled elsewhere
			// warningMessage += "Model diagnostic: <meta name='" + getName() + "' content='" + getContent() + "'/>";
			// System.out.println(warningMessage);
		}

		return validationResult.toString();
	}
}
