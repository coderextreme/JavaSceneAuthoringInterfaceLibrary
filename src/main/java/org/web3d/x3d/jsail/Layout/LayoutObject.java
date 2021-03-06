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

package org.web3d.x3d.jsail.Layout;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Layout.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Layout.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * Layout node is used as layout field of LayoutLayer and LayoutGroup nodes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DLayoutNode] Layout node is used as layout field of LayoutLayer and LayoutGroup nodes. Layout provides all parameters required to define the size, location and scale of a 2D rectangular region.
 * <ul>
 *  <li> <i> Hint:</i>  the align, offset, and offsetUnits fields are used to determine the location of the layout region. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout" target="blank">X3D Abstract Specification: Layout</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Layout" target="_blank">X3D Tooltips: Layout</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class LayoutObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Layout.Layout
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=align, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=align, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> align = new ArrayList<>(); // MFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=offset, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=offset, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> offset = new ArrayList<>(); // MFFloat

 /* @name=offsetUnits, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=offsetUnits, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> offsetUnits = new ArrayList<>(); // MFString

 /* @name=scaleMode, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=scaleMode, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> scaleMode = new ArrayList<>(); // MFString

 /* @name=size, @type=MFFloat, $javaType=ArrayList<Float>, $javaReferenceType=Float, $javaPrimitiveType=ArrayList<Float>, $normalizedMemberObjectName=size, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Float> size = new ArrayList<>(); // MFFloat

 /* @name=sizeUnits, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=sizeUnits, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> sizeUnits = new ArrayList<>(); // MFString

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;LEFT&#34; &#34;BOTTOM&#34;", "&#34;LEFT&#34; &#34;CENTER&#34;", "&#34;LEFT&#34; &#34;TOP&#34;", "&#34;CENTER&#34; &#34;BOTTOM&#34;", "&#34;CENTER&#34; &#34;CENTER&#34;", "&#34;CENTER&#34; &#34;TOP&#34;", "&#34;RIGHT&#34; &#34;BOTTOM&#34;", "&#34;RIGHT&#34; &#34;CENTER&#34;", "&#34;RIGHT&#34; &#34;TOP&#34;".
<br ><br >
	 * Permitted combinations of horizontal and vertical values for the align field in the Layout node. Note that intermediate commas and extraneous whitespace are disallowed by these strictly defined enumeration values.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout</a> 
	*/
	public static final ArrayList<String> layoutAlignChoices = new ArrayList<>(Arrays.<String>asList("\"LEFT\" \"BOTTOM\"", "\"LEFT\" \"CENTER\"", "\"LEFT\" \"TOP\"", "\"CENTER\" \"BOTTOM\"", "\"CENTER\" \"CENTER\"", "\"CENTER\" \"TOP\"", "\"RIGHT\" \"BOTTOM\"", "\"RIGHT\" \"CENTER\"", "\"RIGHT\" \"TOP\""));

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"LEFT\" \"BOTTOM\""</i> (Java syntax) or <i>'"LEFT" "BOTTOM"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_LEFT_BOTTOM = "\"LEFT\" \"BOTTOM\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"LEFT\" \"CENTER\""</i> (Java syntax) or <i>'"LEFT" "CENTER"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_LEFT_CENTER = "\"LEFT\" \"CENTER\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"LEFT\" \"TOP\""</i> (Java syntax) or <i>'"LEFT" "TOP"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_LEFT_TOP = "\"LEFT\" \"TOP\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"CENTER\" \"BOTTOM\""</i> (Java syntax) or <i>'"CENTER" "BOTTOM"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_CENTER_BOTTOM = "\"CENTER\" \"BOTTOM\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"CENTER\" \"CENTER\""</i> (Java syntax) or <i>'"CENTER" "CENTER"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_CENTER_CENTER = "\"CENTER\" \"CENTER\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"CENTER\" \"TOP\""</i> (Java syntax) or <i>'"CENTER" "TOP"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_CENTER_TOP = "\"CENTER\" \"TOP\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"RIGHT\" \"BOTTOM\""</i> (Java syntax) or <i>'"RIGHT" "BOTTOM"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_RIGHT_BOTTOM = "\"RIGHT\" \"BOTTOM\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"RIGHT\" \"CENTER\""</i> (Java syntax) or <i>'"RIGHT" "CENTER"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_RIGHT_CENTER = "\"RIGHT\" \"CENTER\"";

	/** MFString field named <i>align</i> with X3DUOM baseType <i>layoutAlignChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"RIGHT\" \"TOP\""</i> (Java syntax) or <i>'"RIGHT" "TOP"'</i> (XML syntax).
	 * @see #layoutAlignChoices */
	public static final String ALIGN_RIGHT_TOP = "\"RIGHT\" \"TOP\"";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;WORLD&#34; &#34;WORLD&#34;", "&#34;WORLD&#34; &#34;FRACTION&#34;", "&#34;WORLD&#34; &#34;PIXEL&#34;", "&#34;FRACTION&#34; &#34;WORLD&#34;", "&#34;FRACTION&#34; &#34;FRACTION&#34;", "&#34;FRACTION&#34; &#34;PIXEL&#34;", "&#34;PIXEL&#34; &#34;WORLD&#34;", "&#34;PIXEL&#34; &#34;FRACTION&#34;", "&#34;PIXEL&#34; &#34;PIXEL&#34;".
<br ><br >
	 * Permitted combinations of horizontal and vertical values for the offsetUnits field in the Layout node. Note that intermediate commas and extraneous whitespace are disallowed by these strictly defined enumeration values.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout</a> 
	*/
	public static final ArrayList<String> layoutUnitsChoices = new ArrayList<>(Arrays.<String>asList("\"WORLD\" \"WORLD\"", "\"WORLD\" \"FRACTION\"", "\"WORLD\" \"PIXEL\"", "\"FRACTION\" \"WORLD\"", "\"FRACTION\" \"FRACTION\"", "\"FRACTION\" \"PIXEL\"", "\"PIXEL\" \"WORLD\"", "\"PIXEL\" \"FRACTION\"", "\"PIXEL\" \"PIXEL\""));

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"WORLD\" \"WORLD\""</i> (Java syntax) or <i>'"WORLD" "WORLD"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_WORLD_WORLD = "\"WORLD\" \"WORLD\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"WORLD\" \"FRACTION\""</i> (Java syntax) or <i>'"WORLD" "FRACTION"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_WORLD_FRACTION = "\"WORLD\" \"FRACTION\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"WORLD\" \"PIXEL\""</i> (Java syntax) or <i>'"WORLD" "PIXEL"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_WORLD_PIXEL = "\"WORLD\" \"PIXEL\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"WORLD\""</i> (Java syntax) or <i>'"FRACTION" "WORLD"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_FRACTION_WORLD = "\"FRACTION\" \"WORLD\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"FRACTION\""</i> (Java syntax) or <i>'"FRACTION" "FRACTION"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_FRACTION_FRACTION = "\"FRACTION\" \"FRACTION\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"PIXEL\""</i> (Java syntax) or <i>'"FRACTION" "PIXEL"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_FRACTION_PIXEL = "\"FRACTION\" \"PIXEL\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"WORLD\""</i> (Java syntax) or <i>'"PIXEL" "WORLD"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_PIXEL_WORLD = "\"PIXEL\" \"WORLD\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"FRACTION\""</i> (Java syntax) or <i>'"PIXEL" "FRACTION"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_PIXEL_FRACTION = "\"PIXEL\" \"FRACTION\"";

	/** MFString field named <i>offsetUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"PIXEL\""</i> (Java syntax) or <i>'"PIXEL" "PIXEL"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String OFFSETUNITS_PIXEL_PIXEL = "\"PIXEL\" \"PIXEL\"";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "&#34;NONE&#34; &#34;NONE&#34;", "&#34;NONE&#34; &#34;FRACTION&#34;", "&#34;NONE&#34; &#34;STRETCH&#34;", "&#34;NONE&#34; &#34;PIXEL&#34;", "&#34;FRACTION&#34; &#34;NONE&#34;", "&#34;FRACTION&#34; &#34;FRACTION&#34;", "&#34;FRACTION&#34; &#34;STRETCH&#34;", "&#34;FRACTION&#34; &#34;PIXEL&#34;", "&#34;STRETCH&#34; &#34;NONE&#34;", "&#34;STRETCH&#34; &#34;FRACTION&#34;", "&#34;STRETCH&#34; &#34;STRETCH&#34;", "&#34;STRETCH&#34; &#34;PIXEL&#34;", "&#34;PIXEL&#34; &#34;NONE&#34;", "&#34;PIXEL&#34; &#34;FRACTION&#34;", "&#34;PIXEL&#34; &#34;STRETCH&#34;", "&#34;PIXEL&#34; &#34;PIXEL&#34;".
<br ><br >
	 * Permitted combinations of horizontal and vertical values for the scaleMode field in the Layout node. Note that intermediate commas and extraneous whitespace are disallowed by these strictly defined enumeration values.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html#Layout</a> 
	*/
	public static final ArrayList<String> layoutScaleModeChoices = new ArrayList<>(Arrays.<String>asList("\"NONE\" \"NONE\"", "\"NONE\" \"FRACTION\"", "\"NONE\" \"STRETCH\"", "\"NONE\" \"PIXEL\"", "\"FRACTION\" \"NONE\"", "\"FRACTION\" \"FRACTION\"", "\"FRACTION\" \"STRETCH\"", "\"FRACTION\" \"PIXEL\"", "\"STRETCH\" \"NONE\"", "\"STRETCH\" \"FRACTION\"", "\"STRETCH\" \"STRETCH\"", "\"STRETCH\" \"PIXEL\"", "\"PIXEL\" \"NONE\"", "\"PIXEL\" \"FRACTION\"", "\"PIXEL\" \"STRETCH\"", "\"PIXEL\" \"PIXEL\""));

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"NONE\" \"NONE\""</i> (Java syntax) or <i>'"NONE" "NONE"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_NONE_NONE = "\"NONE\" \"NONE\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"NONE\" \"FRACTION\""</i> (Java syntax) or <i>'"NONE" "FRACTION"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_NONE_FRACTION = "\"NONE\" \"FRACTION\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"NONE\" \"STRETCH\""</i> (Java syntax) or <i>'"NONE" "STRETCH"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_NONE_STRETCH = "\"NONE\" \"STRETCH\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"NONE\" \"PIXEL\""</i> (Java syntax) or <i>'"NONE" "PIXEL"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_NONE_PIXEL = "\"NONE\" \"PIXEL\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"NONE\""</i> (Java syntax) or <i>'"FRACTION" "NONE"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_FRACTION_NONE = "\"FRACTION\" \"NONE\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"FRACTION\""</i> (Java syntax) or <i>'"FRACTION" "FRACTION"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_FRACTION_FRACTION = "\"FRACTION\" \"FRACTION\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"STRETCH\""</i> (Java syntax) or <i>'"FRACTION" "STRETCH"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_FRACTION_STRETCH = "\"FRACTION\" \"STRETCH\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"PIXEL\""</i> (Java syntax) or <i>'"FRACTION" "PIXEL"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_FRACTION_PIXEL = "\"FRACTION\" \"PIXEL\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"STRETCH\" \"NONE\""</i> (Java syntax) or <i>'"STRETCH" "NONE"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_STRETCH_NONE = "\"STRETCH\" \"NONE\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"STRETCH\" \"FRACTION\""</i> (Java syntax) or <i>'"STRETCH" "FRACTION"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_STRETCH_FRACTION = "\"STRETCH\" \"FRACTION\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"STRETCH\" \"STRETCH\""</i> (Java syntax) or <i>'"STRETCH" "STRETCH"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_STRETCH_STRETCH = "\"STRETCH\" \"STRETCH\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"STRETCH\" \"PIXEL\""</i> (Java syntax) or <i>'"STRETCH" "PIXEL"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_STRETCH_PIXEL = "\"STRETCH\" \"PIXEL\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"NONE\""</i> (Java syntax) or <i>'"PIXEL" "NONE"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_PIXEL_NONE = "\"PIXEL\" \"NONE\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"FRACTION\""</i> (Java syntax) or <i>'"PIXEL" "FRACTION"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_PIXEL_FRACTION = "\"PIXEL\" \"FRACTION\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"STRETCH\""</i> (Java syntax) or <i>'"PIXEL" "STRETCH"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_PIXEL_STRETCH = "\"PIXEL\" \"STRETCH\"";

	/** MFString field named <i>scaleMode</i> with X3DUOM baseType <i>layoutScaleModeChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"PIXEL\""</i> (Java syntax) or <i>'"PIXEL" "PIXEL"'</i> (XML syntax).
	 * @see #layoutScaleModeChoices */
	public static final String SCALEMODE_PIXEL_PIXEL = "\"PIXEL\" \"PIXEL\"";

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"WORLD\" \"WORLD\""</i> (Java syntax) or <i>'"WORLD" "WORLD"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_WORLD_WORLD = "\"WORLD\" \"WORLD\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"WORLD\" \"FRACTION\""</i> (Java syntax) or <i>'"WORLD" "FRACTION"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_WORLD_FRACTION = "\"WORLD\" \"FRACTION\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"WORLD\" \"PIXEL\""</i> (Java syntax) or <i>'"WORLD" "PIXEL"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_WORLD_PIXEL = "\"WORLD\" \"PIXEL\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"WORLD\""</i> (Java syntax) or <i>'"FRACTION" "WORLD"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_FRACTION_WORLD = "\"FRACTION\" \"WORLD\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"FRACTION\""</i> (Java syntax) or <i>'"FRACTION" "FRACTION"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_FRACTION_FRACTION = "\"FRACTION\" \"FRACTION\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"FRACTION\" \"PIXEL\""</i> (Java syntax) or <i>'"FRACTION" "PIXEL"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_FRACTION_PIXEL = "\"FRACTION\" \"PIXEL\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"WORLD\""</i> (Java syntax) or <i>'"PIXEL" "WORLD"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_PIXEL_WORLD = "\"PIXEL\" \"WORLD\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"FRACTION\""</i> (Java syntax) or <i>'"PIXEL" "FRACTION"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_PIXEL_FRACTION = "\"PIXEL\" \"FRACTION\"";

	/** MFString field named <i>sizeUnits</i> with X3DUOM baseType <i>layoutUnitsChoices</i> is an array that can only include one set of the quoted enumeration values <i>"\"PIXEL\" \"PIXEL\""</i> (Java syntax) or <i>'"PIXEL" "PIXEL"'</i> (XML syntax).
	 * @see #layoutUnitsChoices */
	public static final String SIZEUNITS_PIXEL_PIXEL = "\"PIXEL\" \"PIXEL\"";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>Layout</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "Layout";

	/** Provides name of this element: <i>Layout</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>Layout</i> element: <i>Layout</i> */
	public static final String COMPONENT = "Layout";

	/** Defines X3D component for the <i>Layout</i> element: <i>Layout</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Layout</i> component level for this element: <i>1</i> */
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

	/** MFString field named <i>align</i> has default quoted value <i>new String[] {"CENTER","CENTER"}</i> (Java syntax) or quoted value <i>"CENTER" "CENTER"</i> (XML syntax). */
	public static final ArrayList<String> ALIGN_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("CENTER","CENTER"));

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** MFFloat field named <i>offset</i> has default value <i>{0f,0f}</i> (Java syntax) or <i>0 0</i> (XML syntax). */
	public static final ArrayList<Float> OFFSET_DEFAULT_VALUE = new ArrayList<>(Arrays.asList(0f,0f));

	/** MFString field named <i>offsetUnits</i> has default quoted value <i>new String[] {"WORLD","WORLD"}</i> (Java syntax) or quoted value <i>"WORLD" "WORLD"</i> (XML syntax). */
	public static final ArrayList<String> OFFSETUNITS_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("WORLD","WORLD"));

	/** MFString field named <i>scaleMode</i> has default quoted value <i>new String[] {"NONE","NONE"}</i> (Java syntax) or quoted value <i>"NONE" "NONE"</i> (XML syntax). */
	public static final ArrayList<String> SCALEMODE_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("NONE","NONE"));

	/** MFFloat field named <i>size</i> has default value <i>{1f,1f}</i> (Java syntax) or <i>1 1</i> (XML syntax). */
	public static final ArrayList<Float> SIZE_DEFAULT_VALUE = new ArrayList<>(Arrays.asList(1f,1f));

	/** MFString field named <i>sizeUnits</i> has default quoted value <i>new String[] {"WORLD","WORLD"}</i> (Java syntax) or quoted value <i>"WORLD" "WORLD"</i> (XML syntax). */
	public static final ArrayList<String> SIZEUNITS_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("WORLD","WORLD"));

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D node
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
			case "align":
				result = "MFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "offset":
				result = "MFFloat";
				break;
			case "offsetUnits":
				result = "MFString";
				break;
			case "scaleMode":
				result = "MFString";
				break;
			case "size":
				result = "MFFloat";
				break;
			case "sizeUnits":
				result = "MFString";
				break;
			case "DEF":
				result = "SFString";
				break;
			case "USE":
				result = "SFString";
				break;
			case "class":
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
	 * @param fieldName name of field in this X3D node
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
			case "align":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "offset":
				result = "inputOutput";
				break;
			case "offsetUnits":
				result = "inputOutput";
				break;
			case "scaleMode":
				result = "inputOutput";
				break;
			case "size":
				result = "initializeOnly";
				break;
			case "sizeUnits":
				result = "inputOutput";
				break;
			case "DEF":
				result = "inputOutput";
				break;
			case "USE":
				result = "inputOutput";
				break;
			case "class":
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

	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 * @see <a href="https://www.web3d.org/specifications/X3DUOM.html">X3D Unified Object Model (X3DUOM)</a>
	 */
	public static final String containerField_DEFAULT_VALUE = "layout"; // type xs:NMTOKEN
	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 * @see <a href="https://www.web3d.org/specifications/X3DUOM.html">X3D Unified Object Model (X3DUOM)</a>
     * @return default containerField value            
	 */
    @Override
    public final String getContainerFieldDefault()
    {
        return containerField_DEFAULT_VALUE;
    }

	// String constants for field names usable in ROUTE statements

	/** fromField ROUTE name for MFString field named <i>align</i>. */
	public static final String fromField_ALIGN = "align";

	/** toField ROUTE name for MFString field named <i>align</i>. */
	public static final String toField_ALIGN = "align";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for MFFloat field named <i>offset</i>. */
	public static final String fromField_OFFSET = "offset";

	/** toField ROUTE name for MFFloat field named <i>offset</i>. */
	public static final String toField_OFFSET = "offset";

	/** fromField ROUTE name for MFString field named <i>offsetUnits</i>. */
	public static final String fromField_OFFSETUNITS = "offsetUnits";

	/** toField ROUTE name for MFString field named <i>offsetUnits</i>. */
	public static final String toField_OFFSETUNITS = "offsetUnits";

	/** fromField ROUTE name for MFString field named <i>scaleMode</i>. */
	public static final String fromField_SCALEMODE = "scaleMode";

	/** toField ROUTE name for MFString field named <i>scaleMode</i>. */
	public static final String toField_SCALEMODE = "scaleMode";

	/** fromField ROUTE name for MFString field named <i>sizeUnits</i>. */
	public static final String fromField_SIZEUNITS = "sizeUnits";

	/** toField ROUTE name for MFString field named <i>sizeUnits</i>. */
	public static final String toField_SIZEUNITS = "sizeUnits";

	/** Constructor for LayoutObject to initialize member variables with default values. */
	public LayoutObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

        setContainerFieldOverride(""); // ensuring default value used
		containerField_ALTERNATE_VALUES = new String[] { "layout" }; // type xs:NMTOKEN

		align = new ArrayList<>(ALIGN_DEFAULT_VALUE);
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		offset = OFFSET_DEFAULT_VALUE;
		offsetUnits = new ArrayList<>(OFFSETUNITS_DEFAULT_VALUE);
		scaleMode = new ArrayList<>(SCALEMODE_DEFAULT_VALUE);
		size = SIZE_DEFAULT_VALUE;
		sizeUnits = new ArrayList<>(SIZEUNITS_DEFAULT_VALUE);

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String enumeration results (baseType layoutAlignChoices) ['"LEFT" "BOTTOM"' | '"LEFT" "CENTER"' | '"LEFT" "TOP"' | '"CENTER" "BOTTOM"' | '"CENTER" "CENTER"' | '"CENTER" "TOP"' | '"RIGHT" "BOTTOM"' | '"RIGHT" "CENTER"' | '"RIGHT" "TOP"'] from inputOutput MFString field named <i>align</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The align field values align the sized rectangle to an edge or center of the parent rectangle. Two quoted string values are provided. The first value is for horizontal direction (LEFT | CENTER | RIGHT) and the second value is for vertical direction (BOTTOM | CENTER | TOP). Examples: "CENTER" "CENTER" (default value), "LEFT" "TOP" or "RIGHT" "BOTTOM".
 * <ul>
 *  <li> <i>Warning:</i> two values (or possibly one value) only. </li> 
 *  <li> <i>Warning:</i> if the align field has only one value, that value shall be "CENTER" and apply both horizontally and vertically. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #ALIGN_LEFT_BOTTOM LEFT_BOTTOM}, {@link #ALIGN_LEFT_CENTER LEFT_CENTER}, {@link #ALIGN_LEFT_TOP LEFT_TOP}, {@link #ALIGN_CENTER_BOTTOM CENTER_BOTTOM}, {@link #ALIGN_CENTER_CENTER CENTER_CENTER}, {@link #ALIGN_CENTER_TOP CENTER_TOP}, {@link #ALIGN_RIGHT_BOTTOM RIGHT_BOTTOM}, {@link #ALIGN_RIGHT_CENTER RIGHT_CENTER}, {@link #ALIGN_RIGHT_TOP RIGHT_TOP}.
	 * @return value of align field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getAlign()
	{
		final String[] valuesArray = new String[align.size()];
		int i = 0;
		for (String arrayElement : align) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString align field, similar to {@link #getAlign()}.
	 * @return value of align field
	 */
	public ArrayList<String> getAlignList()
	{
		return align;
	}
	/**
	 * Utility method to get String value of MFString align field, similar to {@link #getAlign()}.
	 * @return value of align field
	 */
	public String getAlignString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : align) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""LEFT" "BOTTOM"" | ""LEFT" "CENTER"" | ""LEFT" "TOP"" | ""CENTER" "BOTTOM"" | ""CENTER" "CENTER"" | ""CENTER" "TOP"" | ""RIGHT" "BOTTOM"" | ""RIGHT" "CENTER"" | ""RIGHT" "TOP"") to inputOutput MFString field named <i>align</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #ALIGN_LEFT_BOTTOM LEFT_BOTTOM}, {@link #ALIGN_LEFT_CENTER LEFT_CENTER}, {@link #ALIGN_LEFT_TOP LEFT_TOP}, {@link #ALIGN_CENTER_BOTTOM CENTER_BOTTOM}, {@link #ALIGN_CENTER_CENTER CENTER_CENTER}, {@link #ALIGN_CENTER_TOP CENTER_TOP}, {@link #ALIGN_RIGHT_BOTTOM RIGHT_BOTTOM}, {@link #ALIGN_RIGHT_CENTER RIGHT_CENTER}, {@link #ALIGN_RIGHT_TOP RIGHT_TOP}).
	 * <br><br>
	 * <i>Tooltip:</i> The align field values align the sized rectangle to an edge or center of the parent rectangle. Two quoted string values are provided. The first value is for horizontal direction (LEFT | CENTER | RIGHT) and the second value is for vertical direction (BOTTOM | CENTER | TOP). Examples: "CENTER" "CENTER" (default value), "LEFT" "TOP" or "RIGHT" "BOTTOM".
 * <ul>
 *  <li> <i>Warning:</i> two values (or possibly one value) only. </li> 
 *  <li> <i>Warning:</i> if the align field has only one value, that value shall be "CENTER" and apply both horizontally and vertically. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the align field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setAlign(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearAlign(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(ALIGN_LEFT_BOTTOM) ||
			newValue[i].equals(ALIGN_LEFT_CENTER) ||
			newValue[i].equals(ALIGN_LEFT_TOP) ||
			newValue[i].equals(ALIGN_CENTER_BOTTOM) ||
			newValue[i].equals(ALIGN_CENTER_CENTER) ||
			newValue[i].equals(ALIGN_CENTER_TOP) ||
			newValue[i].equals(ALIGN_RIGHT_BOTTOM) ||
			newValue[i].equals(ALIGN_RIGHT_CENTER) ||
			newValue[i].equals(ALIGN_RIGHT_TOP)))
		{
			String warningMessage = "Warning: Layout align newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);

            if (!(newValue.length == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        }
		if (newValue == null)		{
			clearAlign(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearAlign(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			align.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString align field, similar to {@link #setAlign(String[])}.
	 * @param newValue is new value for the align field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setAlign(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearAlign(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAlign(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString align field, similar to {@link #setAlign(String[])}.
	 * @param newValue is new value for the align field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setAlign(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearAlign(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearAlign(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(ALIGN_LEFT_BOTTOM) ||
			newValue.equals(ALIGN_LEFT_CENTER) ||
			newValue.equals(ALIGN_LEFT_TOP) ||
			newValue.equals(ALIGN_CENTER_BOTTOM) ||
			newValue.equals(ALIGN_CENTER_CENTER) ||
			newValue.equals(ALIGN_CENTER_TOP) ||
			newValue.equals(ALIGN_RIGHT_BOTTOM) ||
			newValue.equals(ALIGN_RIGHT_CENTER) ||
			newValue.equals(ALIGN_RIGHT_TOP)))
		{
			String warningMessage = "Warning: Layout align newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.getValue().isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setAlign(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString align field, similar to {@link #setAlign(String[])}.
	 * @param newValue is new value for the align field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setAlign(String newValue)
	{
		if (newValue == null)		{
			clearAlign(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearAlign(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(ALIGN_LEFT_BOTTOM) ||
			newValue.equals(ALIGN_LEFT_CENTER) ||
			newValue.equals(ALIGN_LEFT_TOP) ||
			newValue.equals(ALIGN_CENTER_BOTTOM) ||
			newValue.equals(ALIGN_CENTER_CENTER) ||
			newValue.equals(ALIGN_CENTER_TOP) ||
			newValue.equals(ALIGN_RIGHT_BOTTOM) ||
			newValue.equals(ALIGN_RIGHT_CENTER) ||
			newValue.equals(ALIGN_RIGHT_TOP)))
		{
			String warningMessage = "Warning: Layout align newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setAlign(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString align field, similar to {@link #setAlign(String[])}.
	 * @param newValue is new value for the align field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setAlign(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearAlign(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearAlign(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(ALIGN_LEFT_BOTTOM) ||
			newValue.equals(ALIGN_LEFT_CENTER) ||
			newValue.equals(ALIGN_LEFT_TOP) ||
			newValue.equals(ALIGN_CENTER_BOTTOM) ||
			newValue.equals(ALIGN_CENTER_CENTER) ||
			newValue.equals(ALIGN_CENTER_TOP) ||
			newValue.equals(ALIGN_RIGHT_BOTTOM) ||
			newValue.equals(ALIGN_RIGHT_CENTER) ||
			newValue.equals(ALIGN_RIGHT_TOP)))
		{
			String warningMessage = "Warning: Layout align newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!(newValue.size() == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        if (newValue.isEmpty())
            clearAlign(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setAlign(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of align field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public LayoutObject clearAlign()
	{
		align.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString align field.
	 * @param newValue is new value to add to the align field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addAlign(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !align.contains(newValue))
            align.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString align field.
	 * @param newValue is new value to add to the align field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addAlign(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !align.contains(newValue.getValue()))
            align.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setIS(ISObject newValue)
	{
		// set-newValue-validity-checks #0
		IS = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) IS).setParentObject(this); // parentTest15
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of IS field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public LayoutObject clearIS()
	{
		((X3DConcreteElement) IS).clearParentObject(); // remove references to facilitate Java memory management
		IS = null; // reset SFNode field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>IS</i>.
	 * @return whether a concrete statement or CommentsBlock is available.
	 * @see #getIS()
	 */
	public boolean hasIS()
	{
		return (IS != null);
	}
	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see #getMetadataProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata()
	{
		return metadata;
	}

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setMetadata(X3DMetadataObject newValue)
	{
		// set-newValue-validity-checks #0
		metadata = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadata).setParentObject(this); // parentTest15
		}
		if (metadataProtoInstance != null)
		{
			metadataProtoInstance.setParentObject(null); // housekeeping, clear prior object
			metadataProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of metadata field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public LayoutObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setMetadata(ProtoInstanceObject newValue)
	{
		if (metadataProtoInstance != null)
		{
			((X3DConcreteElement) metadataProtoInstance).setParentObject(null); // parentTest15.5
	    }
		metadataProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadataProtoInstance).setParentObject(this); // parentTest15.6
            metadataProtoInstance.setContainerField("metadata");
	    }
		if (metadata != null)
		{
			((X3DConcreteElement) metadata).setParentObject(null); // housekeeping, clear prior object
			metadata = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getMetadataProtoInstance()
		{
			return metadataProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>metadata</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getMetadata()
	 * @see #getMetadataProtoInstance()
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 */
	public boolean hasMetadata()
	{
		return (metadata != null) || (metadataProtoInstance != null);
	}
	/**
	 * Provide array of Float results from inputOutput MFFloat field named <i>offset</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (-infinity,+infinity) The values of the offset field are used to translate the location of this rectangle after the initial alignment. The offsetUnits field specifies how to interpret the offset field.
 * <ul>
 *  <li> <i> Warning:</i>  if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 * </ul>
	 * @return value of offset field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getOffset()
	{
		final float[] valuesArray = new float[offset.size()];
		int i = 0;
		for (Float arrayElement : offset) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat offset field, similar to {@link #getOffset()}.
	 * @return value of offset field
	 */
	public ArrayList<Float> getOffsetList()
	{
		return offset;
	}
	/**
	 * Utility method to get String value of MFFloat offset field, similar to {@link #getOffset()}.
	 * @return value of offset field
	 */
	public String getOffsetString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : offset) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to inputOutput MFFloat field named <i>offset</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (-infinity,+infinity) The values of the offset field are used to translate the location of this rectangle after the initial alignment. The offsetUnits field specifies how to interpret the offset field.
 * <ul>
 *  <li> <i> Warning:</i>  if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 * </ul>
	 * @param newValue is new value for the offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setOffset(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearOffset(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearOffset(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			offset.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat offset field, similar to {@link #setOffset(float[])}.
	 * @param newValue is new value for the offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffset(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearOffset(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setOffset(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat offset field, similar to {@link #setOffset(float[])}.
	 * @param newValue is new value for the offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffset(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearOffset(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearOffset(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setOffset(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public LayoutObject clearOffset()
	{
		offset.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat offset field, similar to {@link #setOffset(float[])}.
	 * @param newValue is new value for the offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffset(int[] newValue)
	{
		if (newValue == null)		{
			clearOffset(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setOffset(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat offset field.
	 * @param newValue is new value to add to the offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addOffset(float newValue)
	{
		offset.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat offset field.
	 * @param newValue is new value to add to the offset field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addOffset(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		offset.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setOffset(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffset(double[] newArray)
	{
		return setOffset(new MFFloatObject(newArray));
	}
	/**
	 * Provide array of String enumeration results (baseType layoutUnitsChoices) ['"WORLD" "WORLD"' | '"WORLD" "FRACTION"' | '"WORLD" "PIXEL"' | '"FRACTION" "WORLD"' | '"FRACTION" "FRACTION"' | '"FRACTION" "PIXEL"' | '"PIXEL" "WORLD"' | '"PIXEL" "FRACTION"' | '"PIXEL" "PIXEL"'] from inputOutput MFString field named <i>offsetUnits</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The offsetUnits field values are used to interprete the offset values. Two quoted string values are provided. The first value is for horizontal offset, and the second value is for vertical offset. Examples: "WORLD" "WORLD" (default value), "FRACTION" "FRACTION" or "PIXEL" "PIXEL".
 * <ul>
 *  <li> <i>Hint:</i> If the value of the offsetUnits field is FRACTION, the size of the corresponding dimension is interpreted as a fraction of the corresponding parent’s dimension. </li> 
 *  <li> <i>Warning:</i> if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #OFFSETUNITS_WORLD_WORLD WORLD_WORLD}, {@link #OFFSETUNITS_WORLD_FRACTION WORLD_FRACTION}, {@link #OFFSETUNITS_WORLD_PIXEL WORLD_PIXEL}, {@link #OFFSETUNITS_FRACTION_WORLD FRACTION_WORLD}, {@link #OFFSETUNITS_FRACTION_FRACTION FRACTION_FRACTION}, {@link #OFFSETUNITS_FRACTION_PIXEL FRACTION_PIXEL}, {@link #OFFSETUNITS_PIXEL_WORLD PIXEL_WORLD}, {@link #OFFSETUNITS_PIXEL_FRACTION PIXEL_FRACTION}, {@link #OFFSETUNITS_PIXEL_PIXEL PIXEL_PIXEL}.
	 * @return value of offsetUnits field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getOffsetUnits()
	{
		final String[] valuesArray = new String[offsetUnits.size()];
		int i = 0;
		for (String arrayElement : offsetUnits) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString offsetUnits field, similar to {@link #getOffsetUnits()}.
	 * @return value of offsetUnits field
	 */
	public ArrayList<String> getOffsetUnitsList()
	{
		return offsetUnits;
	}
	/**
	 * Utility method to get String value of MFString offsetUnits field, similar to {@link #getOffsetUnits()}.
	 * @return value of offsetUnits field
	 */
	public String getOffsetUnitsString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : offsetUnits) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""WORLD" "WORLD"" | ""WORLD" "FRACTION"" | ""WORLD" "PIXEL"" | ""FRACTION" "WORLD"" | ""FRACTION" "FRACTION"" | ""FRACTION" "PIXEL"" | ""PIXEL" "WORLD"" | ""PIXEL" "FRACTION"" | ""PIXEL" "PIXEL"") to inputOutput MFString field named <i>offsetUnits</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #OFFSETUNITS_WORLD_WORLD WORLD_WORLD}, {@link #OFFSETUNITS_WORLD_FRACTION WORLD_FRACTION}, {@link #OFFSETUNITS_WORLD_PIXEL WORLD_PIXEL}, {@link #OFFSETUNITS_FRACTION_WORLD FRACTION_WORLD}, {@link #OFFSETUNITS_FRACTION_FRACTION FRACTION_FRACTION}, {@link #OFFSETUNITS_FRACTION_PIXEL FRACTION_PIXEL}, {@link #OFFSETUNITS_PIXEL_WORLD PIXEL_WORLD}, {@link #OFFSETUNITS_PIXEL_FRACTION PIXEL_FRACTION}, {@link #OFFSETUNITS_PIXEL_PIXEL PIXEL_PIXEL}).
	 * <br><br>
	 * <i>Tooltip:</i> The offsetUnits field values are used to interprete the offset values. Two quoted string values are provided. The first value is for horizontal offset, and the second value is for vertical offset. Examples: "WORLD" "WORLD" (default value), "FRACTION" "FRACTION" or "PIXEL" "PIXEL".
 * <ul>
 *  <li> <i>Hint:</i> If the value of the offsetUnits field is FRACTION, the size of the corresponding dimension is interpreted as a fraction of the corresponding parent’s dimension. </li> 
 *  <li> <i>Warning:</i> if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the offsetUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setOffsetUnits(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearOffsetUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(OFFSETUNITS_WORLD_WORLD) ||
			newValue[i].equals(OFFSETUNITS_WORLD_FRACTION) ||
			newValue[i].equals(OFFSETUNITS_WORLD_PIXEL) ||
			newValue[i].equals(OFFSETUNITS_FRACTION_WORLD) ||
			newValue[i].equals(OFFSETUNITS_FRACTION_FRACTION) ||
			newValue[i].equals(OFFSETUNITS_FRACTION_PIXEL) ||
			newValue[i].equals(OFFSETUNITS_PIXEL_WORLD) ||
			newValue[i].equals(OFFSETUNITS_PIXEL_FRACTION) ||
			newValue[i].equals(OFFSETUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout offsetUnits newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);

            if (!(newValue.length == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        }
		if (newValue == null)		{
			clearOffsetUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearOffsetUnits(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			offsetUnits.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString offsetUnits field, similar to {@link #setOffsetUnits(String[])}.
	 * @param newValue is new value for the offsetUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffsetUnits(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearOffsetUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setOffsetUnits(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString offsetUnits field, similar to {@link #setOffsetUnits(String[])}.
	 * @param newValue is new value for the offsetUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffsetUnits(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearOffsetUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearOffsetUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(OFFSETUNITS_WORLD_WORLD) ||
			newValue.equals(OFFSETUNITS_WORLD_FRACTION) ||
			newValue.equals(OFFSETUNITS_WORLD_PIXEL) ||
			newValue.equals(OFFSETUNITS_FRACTION_WORLD) ||
			newValue.equals(OFFSETUNITS_FRACTION_FRACTION) ||
			newValue.equals(OFFSETUNITS_FRACTION_PIXEL) ||
			newValue.equals(OFFSETUNITS_PIXEL_WORLD) ||
			newValue.equals(OFFSETUNITS_PIXEL_FRACTION) ||
			newValue.equals(OFFSETUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout offsetUnits newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.getValue().isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setOffsetUnits(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString offsetUnits field, similar to {@link #setOffsetUnits(String[])}.
	 * @param newValue is new value for the offsetUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffsetUnits(String newValue)
	{
		if (newValue == null)		{
			clearOffsetUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearOffsetUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(OFFSETUNITS_WORLD_WORLD) ||
			newValue.equals(OFFSETUNITS_WORLD_FRACTION) ||
			newValue.equals(OFFSETUNITS_WORLD_PIXEL) ||
			newValue.equals(OFFSETUNITS_FRACTION_WORLD) ||
			newValue.equals(OFFSETUNITS_FRACTION_FRACTION) ||
			newValue.equals(OFFSETUNITS_FRACTION_PIXEL) ||
			newValue.equals(OFFSETUNITS_PIXEL_WORLD) ||
			newValue.equals(OFFSETUNITS_PIXEL_FRACTION) ||
			newValue.equals(OFFSETUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout offsetUnits newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setOffsetUnits(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString offsetUnits field, similar to {@link #setOffsetUnits(String[])}.
	 * @param newValue is new value for the offsetUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setOffsetUnits(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearOffsetUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearOffsetUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(OFFSETUNITS_WORLD_WORLD) ||
			newValue.equals(OFFSETUNITS_WORLD_FRACTION) ||
			newValue.equals(OFFSETUNITS_WORLD_PIXEL) ||
			newValue.equals(OFFSETUNITS_FRACTION_WORLD) ||
			newValue.equals(OFFSETUNITS_FRACTION_FRACTION) ||
			newValue.equals(OFFSETUNITS_FRACTION_PIXEL) ||
			newValue.equals(OFFSETUNITS_PIXEL_WORLD) ||
			newValue.equals(OFFSETUNITS_PIXEL_FRACTION) ||
			newValue.equals(OFFSETUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout offsetUnits newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!(newValue.size() == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        if (newValue.isEmpty())
            clearOffsetUnits(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setOffsetUnits(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of offsetUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public LayoutObject clearOffsetUnits()
	{
		offsetUnits.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString offsetUnits field.
	 * @param newValue is new value to add to the offsetUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addOffsetUnits(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !offsetUnits.contains(newValue))
            offsetUnits.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString offsetUnits field.
	 * @param newValue is new value to add to the offsetUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addOffsetUnits(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !offsetUnits.contains(newValue.getValue()))
            offsetUnits.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of String enumeration results (baseType layoutScaleModeChoices) ['"NONE" "NONE"' | '"NONE" "FRACTION"' | '"NONE" "STRETCH"' | '"NONE" "PIXEL"' | '"FRACTION" "NONE"' | '"FRACTION" "FRACTION"' | '"FRACTION" "STRETCH"' | '"FRACTION" "PIXEL"' | '"STRETCH" "NONE"' | '"STRETCH" "FRACTION"' | '"STRETCH" "STRETCH"' | '"STRETCH" "PIXEL"' | '"PIXEL" "NONE"' | '"PIXEL" "FRACTION"' | '"PIXEL" "STRETCH"' | '"PIXEL" "PIXEL"'] from inputOutput MFString field named <i>scaleMode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The scaleMode field specifies how the scale of the parent is modified. Two quoted string values are provided. The first value is for horizontal scale and the second value is for vertical scale. Examples: "NONE" "NONE" (default value), "FRACTION" "FRACTION", "STRETCH" "STRETCH" or "PIXEL" "PIXEL".
 * <ul>
 *  <li> <i>Hint:</i> A scaleMode field value of NONE specifies that the corresponding scale value is not modified. Instead, the scale is inherited from its parent. Since a LayoutLayer node does not have a parent, the value of NONE reverts to FRACTION. </li> 
 *  <li> <i>Hint:</i> A scaleMode value of FRACTION specifies a scale in the corresponding direction so that one unit is equal to the dimension (width or height) of this rectangle. </li> 
 *  <li> <i>Hint:</i> a scaleMode value of STRETCH specifies a scale in the corresponding direction such that the resulting scale in the horizontal direction is equal to the scale in the vertical direction, thus producing a uniform scale. </li> 
 *  <li> <i>Hint:</i> a value of PIXEL specifies a scale in the corresponding direction such that one unit is equal to one pixel. </li> 
 *  <li> <i>Warning:</i> if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #SCALEMODE_NONE_NONE NONE_NONE}, {@link #SCALEMODE_NONE_FRACTION NONE_FRACTION}, {@link #SCALEMODE_NONE_STRETCH NONE_STRETCH}, {@link #SCALEMODE_NONE_PIXEL NONE_PIXEL}, {@link #SCALEMODE_FRACTION_NONE FRACTION_NONE}, {@link #SCALEMODE_FRACTION_FRACTION FRACTION_FRACTION}, {@link #SCALEMODE_FRACTION_STRETCH FRACTION_STRETCH}, {@link #SCALEMODE_FRACTION_PIXEL FRACTION_PIXEL}, {@link #SCALEMODE_STRETCH_NONE STRETCH_NONE}, {@link #SCALEMODE_STRETCH_FRACTION STRETCH_FRACTION}, {@link #SCALEMODE_STRETCH_STRETCH STRETCH_STRETCH}, {@link #SCALEMODE_STRETCH_PIXEL STRETCH_PIXEL}, {@link #SCALEMODE_PIXEL_NONE PIXEL_NONE}, {@link #SCALEMODE_PIXEL_FRACTION PIXEL_FRACTION}, {@link #SCALEMODE_PIXEL_STRETCH PIXEL_STRETCH}, {@link #SCALEMODE_PIXEL_PIXEL PIXEL_PIXEL}.
	 * @return value of scaleMode field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getScaleMode()
	{
		final String[] valuesArray = new String[scaleMode.size()];
		int i = 0;
		for (String arrayElement : scaleMode) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString scaleMode field, similar to {@link #getScaleMode()}.
	 * @return value of scaleMode field
	 */
	public ArrayList<String> getScaleModeList()
	{
		return scaleMode;
	}
	/**
	 * Utility method to get String value of MFString scaleMode field, similar to {@link #getScaleMode()}.
	 * @return value of scaleMode field
	 */
	public String getScaleModeString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : scaleMode) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""NONE" "NONE"" | ""NONE" "FRACTION"" | ""NONE" "STRETCH"" | ""NONE" "PIXEL"" | ""FRACTION" "NONE"" | ""FRACTION" "FRACTION"" | ""FRACTION" "STRETCH"" | ""FRACTION" "PIXEL"" | ""STRETCH" "NONE"" | ""STRETCH" "FRACTION"" | ""STRETCH" "STRETCH"" | ""STRETCH" "PIXEL"" | ""PIXEL" "NONE"" | ""PIXEL" "FRACTION"" | ""PIXEL" "STRETCH"" | ""PIXEL" "PIXEL"") to inputOutput MFString field named <i>scaleMode</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #SCALEMODE_NONE_NONE NONE_NONE}, {@link #SCALEMODE_NONE_FRACTION NONE_FRACTION}, {@link #SCALEMODE_NONE_STRETCH NONE_STRETCH}, {@link #SCALEMODE_NONE_PIXEL NONE_PIXEL}, {@link #SCALEMODE_FRACTION_NONE FRACTION_NONE}, {@link #SCALEMODE_FRACTION_FRACTION FRACTION_FRACTION}, {@link #SCALEMODE_FRACTION_STRETCH FRACTION_STRETCH}, {@link #SCALEMODE_FRACTION_PIXEL FRACTION_PIXEL}, {@link #SCALEMODE_STRETCH_NONE STRETCH_NONE}, {@link #SCALEMODE_STRETCH_FRACTION STRETCH_FRACTION}, {@link #SCALEMODE_STRETCH_STRETCH STRETCH_STRETCH}, {@link #SCALEMODE_STRETCH_PIXEL STRETCH_PIXEL}, {@link #SCALEMODE_PIXEL_NONE PIXEL_NONE}, {@link #SCALEMODE_PIXEL_FRACTION PIXEL_FRACTION}, {@link #SCALEMODE_PIXEL_STRETCH PIXEL_STRETCH}, {@link #SCALEMODE_PIXEL_PIXEL PIXEL_PIXEL}).
	 * <br><br>
	 * <i>Tooltip:</i> The scaleMode field specifies how the scale of the parent is modified. Two quoted string values are provided. The first value is for horizontal scale and the second value is for vertical scale. Examples: "NONE" "NONE" (default value), "FRACTION" "FRACTION", "STRETCH" "STRETCH" or "PIXEL" "PIXEL".
 * <ul>
 *  <li> <i>Hint:</i> A scaleMode field value of NONE specifies that the corresponding scale value is not modified. Instead, the scale is inherited from its parent. Since a LayoutLayer node does not have a parent, the value of NONE reverts to FRACTION. </li> 
 *  <li> <i>Hint:</i> A scaleMode value of FRACTION specifies a scale in the corresponding direction so that one unit is equal to the dimension (width or height) of this rectangle. </li> 
 *  <li> <i>Hint:</i> a scaleMode value of STRETCH specifies a scale in the corresponding direction such that the resulting scale in the horizontal direction is equal to the scale in the vertical direction, thus producing a uniform scale. </li> 
 *  <li> <i>Hint:</i> a value of PIXEL specifies a scale in the corresponding direction such that one unit is equal to one pixel. </li> 
 *  <li> <i>Warning:</i> if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the scaleMode field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setScaleMode(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearScaleMode(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(SCALEMODE_NONE_NONE) ||
			newValue[i].equals(SCALEMODE_NONE_FRACTION) ||
			newValue[i].equals(SCALEMODE_NONE_STRETCH) ||
			newValue[i].equals(SCALEMODE_NONE_PIXEL) ||
			newValue[i].equals(SCALEMODE_FRACTION_NONE) ||
			newValue[i].equals(SCALEMODE_FRACTION_FRACTION) ||
			newValue[i].equals(SCALEMODE_FRACTION_STRETCH) ||
			newValue[i].equals(SCALEMODE_FRACTION_PIXEL) ||
			newValue[i].equals(SCALEMODE_STRETCH_NONE) ||
			newValue[i].equals(SCALEMODE_STRETCH_FRACTION) ||
			newValue[i].equals(SCALEMODE_STRETCH_STRETCH) ||
			newValue[i].equals(SCALEMODE_STRETCH_PIXEL) ||
			newValue[i].equals(SCALEMODE_PIXEL_NONE) ||
			newValue[i].equals(SCALEMODE_PIXEL_FRACTION) ||
			newValue[i].equals(SCALEMODE_PIXEL_STRETCH) ||
			newValue[i].equals(SCALEMODE_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout scaleMode newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);

            if (!(newValue.length == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        }
		if (newValue == null)		{
			clearScaleMode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearScaleMode(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			scaleMode.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString scaleMode field, similar to {@link #setScaleMode(String[])}.
	 * @param newValue is new value for the scaleMode field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setScaleMode(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearScaleMode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setScaleMode(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString scaleMode field, similar to {@link #setScaleMode(String[])}.
	 * @param newValue is new value for the scaleMode field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setScaleMode(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearScaleMode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearScaleMode(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(SCALEMODE_NONE_NONE) ||
			newValue.equals(SCALEMODE_NONE_FRACTION) ||
			newValue.equals(SCALEMODE_NONE_STRETCH) ||
			newValue.equals(SCALEMODE_NONE_PIXEL) ||
			newValue.equals(SCALEMODE_FRACTION_NONE) ||
			newValue.equals(SCALEMODE_FRACTION_FRACTION) ||
			newValue.equals(SCALEMODE_FRACTION_STRETCH) ||
			newValue.equals(SCALEMODE_FRACTION_PIXEL) ||
			newValue.equals(SCALEMODE_STRETCH_NONE) ||
			newValue.equals(SCALEMODE_STRETCH_FRACTION) ||
			newValue.equals(SCALEMODE_STRETCH_STRETCH) ||
			newValue.equals(SCALEMODE_STRETCH_PIXEL) ||
			newValue.equals(SCALEMODE_PIXEL_NONE) ||
			newValue.equals(SCALEMODE_PIXEL_FRACTION) ||
			newValue.equals(SCALEMODE_PIXEL_STRETCH) ||
			newValue.equals(SCALEMODE_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout scaleMode newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.getValue().isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setScaleMode(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString scaleMode field, similar to {@link #setScaleMode(String[])}.
	 * @param newValue is new value for the scaleMode field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setScaleMode(String newValue)
	{
		if (newValue == null)		{
			clearScaleMode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearScaleMode(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(SCALEMODE_NONE_NONE) ||
			newValue.equals(SCALEMODE_NONE_FRACTION) ||
			newValue.equals(SCALEMODE_NONE_STRETCH) ||
			newValue.equals(SCALEMODE_NONE_PIXEL) ||
			newValue.equals(SCALEMODE_FRACTION_NONE) ||
			newValue.equals(SCALEMODE_FRACTION_FRACTION) ||
			newValue.equals(SCALEMODE_FRACTION_STRETCH) ||
			newValue.equals(SCALEMODE_FRACTION_PIXEL) ||
			newValue.equals(SCALEMODE_STRETCH_NONE) ||
			newValue.equals(SCALEMODE_STRETCH_FRACTION) ||
			newValue.equals(SCALEMODE_STRETCH_STRETCH) ||
			newValue.equals(SCALEMODE_STRETCH_PIXEL) ||
			newValue.equals(SCALEMODE_PIXEL_NONE) ||
			newValue.equals(SCALEMODE_PIXEL_FRACTION) ||
			newValue.equals(SCALEMODE_PIXEL_STRETCH) ||
			newValue.equals(SCALEMODE_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout scaleMode newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setScaleMode(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString scaleMode field, similar to {@link #setScaleMode(String[])}.
	 * @param newValue is new value for the scaleMode field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setScaleMode(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearScaleMode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearScaleMode(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(SCALEMODE_NONE_NONE) ||
			newValue.equals(SCALEMODE_NONE_FRACTION) ||
			newValue.equals(SCALEMODE_NONE_STRETCH) ||
			newValue.equals(SCALEMODE_NONE_PIXEL) ||
			newValue.equals(SCALEMODE_FRACTION_NONE) ||
			newValue.equals(SCALEMODE_FRACTION_FRACTION) ||
			newValue.equals(SCALEMODE_FRACTION_STRETCH) ||
			newValue.equals(SCALEMODE_FRACTION_PIXEL) ||
			newValue.equals(SCALEMODE_STRETCH_NONE) ||
			newValue.equals(SCALEMODE_STRETCH_FRACTION) ||
			newValue.equals(SCALEMODE_STRETCH_STRETCH) ||
			newValue.equals(SCALEMODE_STRETCH_PIXEL) ||
			newValue.equals(SCALEMODE_PIXEL_NONE) ||
			newValue.equals(SCALEMODE_PIXEL_FRACTION) ||
			newValue.equals(SCALEMODE_PIXEL_STRETCH) ||
			newValue.equals(SCALEMODE_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout scaleMode newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!(newValue.size() == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        if (newValue.isEmpty())
            clearScaleMode(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setScaleMode(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of scaleMode field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public LayoutObject clearScaleMode()
	{
		scaleMode.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString scaleMode field.
	 * @param newValue is new value to add to the scaleMode field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addScaleMode(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !scaleMode.contains(newValue))
            scaleMode.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString scaleMode field.
	 * @param newValue is new value to add to the scaleMode field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addScaleMode(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !scaleMode.contains(newValue.getValue()))
            scaleMode.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of Float results from initializeOnly MFFloat field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) The two values in the size field define the width and height of the layout rectangle. The sizeUnits field specifies how to interpret the size values.
 * <ul>
 *  <li> <i> Warning:</i>  if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 * </ul>
	 * @return value of size field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSize()
	{
		final float[] valuesArray = new float[size.size()];
		int i = 0;
		for (Float arrayElement : size) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFFloat size field, similar to {@link #getSize()}.
	 * @return value of size field
	 */
	public ArrayList<Float> getSizeList()
	{
		return size;
	}
	/**
	 * Utility method to get String value of MFFloat size field, similar to {@link #getSize()}.
	 * @return value of size field
	 */
	public String getSizeString()
    {
        StringBuilder result = new StringBuilder();
		for (Float arrayElement : size) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Float array to initializeOnly MFFloat field named <i>size</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) The two values in the size field define the width and height of the layout rectangle. The sizeUnits field specifies how to interpret the size values.
 * <ul>
 *  <li> <i> Warning:</i>  if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 * </ul>
	 * @param newValue is new value for the size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearSize(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSize(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			size.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFFloat size field, similar to {@link #setSize(float[])}.
	 * @param newValue is new value for the size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSize(MFFloatObject newValue)
	{
		if (newValue == null)		{
			clearSize(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSize(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFFloat size field, similar to {@link #setSize(float[])}.
	 * @param newValue is new value for the size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSize(ArrayList<Float> newValue)
	{
		if (newValue == null)		{
			clearSize(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearSize(); // reset
        else
        {
            float[] newArray = new float[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSize(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFFloat value of size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public LayoutObject clearSize()
	{
		size.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFFloat size field, similar to {@link #setSize(float[])}.
	 * @param newValue is new value for the size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSize(int[] newValue)
	{
		if (newValue == null)		{
			clearSize(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		float[] holdArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (float)newValue[i];
		}
		setSize(holdArray);
		return this;
	}

	/**
	 * Add singleton float value to MFFloat size field.
	 * @param newValue is new value to add to the size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addSize(float newValue)
	{
		size.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFFloatObject value to MFFloat size field.
	 * @param newValue is new value to add to the size field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addSize(SFFloatObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		size.add(newValue.getPrimitiveValue());
		return this;
	}


	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setSize(float[])}.
	 * @param newArray is new value for field                                 
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSize(double[] newArray)
	{
		return setSize(new MFFloatObject(newArray));
	}
	/**
	 * Provide array of String enumeration results (baseType layoutUnitsChoices) ['"WORLD" "WORLD"' | '"WORLD" "FRACTION"' | '"WORLD" "PIXEL"' | '"FRACTION" "WORLD"' | '"FRACTION" "FRACTION"' | '"FRACTION" "PIXEL"' | '"PIXEL" "WORLD"' | '"PIXEL" "FRACTION"' | '"PIXEL" "PIXEL"'] from inputOutput MFString field named <i>sizeUnits</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The sizeUnits field values are used to interprete the offset values. Two quoted string values are provided. The first value is for horizontal size, and the second value is for vertical size. Examples: "WORLD" "WORLD" (default value), "FRACTION" "FRACTION" or "PIXEL" "PIXEL".
 * <ul>
 *  <li> <i>Hint:</i> If the value of the sizeUnits field is FRACTION, the size of the corresponding dimension is interpreted as a fraction of the corresponding parent’s dimension. </li> 
 *  <li> <i>Warning:</i> if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #SIZEUNITS_WORLD_WORLD WORLD_WORLD}, {@link #SIZEUNITS_WORLD_FRACTION WORLD_FRACTION}, {@link #SIZEUNITS_WORLD_PIXEL WORLD_PIXEL}, {@link #SIZEUNITS_FRACTION_WORLD FRACTION_WORLD}, {@link #SIZEUNITS_FRACTION_FRACTION FRACTION_FRACTION}, {@link #SIZEUNITS_FRACTION_PIXEL FRACTION_PIXEL}, {@link #SIZEUNITS_PIXEL_WORLD PIXEL_WORLD}, {@link #SIZEUNITS_PIXEL_FRACTION PIXEL_FRACTION}, {@link #SIZEUNITS_PIXEL_PIXEL PIXEL_PIXEL}.
	 * @return value of sizeUnits field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getSizeUnits()
	{
		final String[] valuesArray = new String[sizeUnits.size()];
		int i = 0;
		for (String arrayElement : sizeUnits) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString sizeUnits field, similar to {@link #getSizeUnits()}.
	 * @return value of sizeUnits field
	 */
	public ArrayList<String> getSizeUnitsList()
	{
		return sizeUnits;
	}
	/**
	 * Utility method to get String value of MFString sizeUnits field, similar to {@link #getSizeUnits()}.
	 * @return value of sizeUnits field
	 */
	public String getSizeUnitsString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : sizeUnits) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String enumeration array (""WORLD" "WORLD"" | ""WORLD" "FRACTION"" | ""WORLD" "PIXEL"" | ""FRACTION" "WORLD"" | ""FRACTION" "FRACTION"" | ""FRACTION" "PIXEL"" | ""PIXEL" "WORLD"" | ""PIXEL" "FRACTION"" | ""PIXEL" "PIXEL"") to inputOutput MFString field named <i>sizeUnits</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #SIZEUNITS_WORLD_WORLD WORLD_WORLD}, {@link #SIZEUNITS_WORLD_FRACTION WORLD_FRACTION}, {@link #SIZEUNITS_WORLD_PIXEL WORLD_PIXEL}, {@link #SIZEUNITS_FRACTION_WORLD FRACTION_WORLD}, {@link #SIZEUNITS_FRACTION_FRACTION FRACTION_FRACTION}, {@link #SIZEUNITS_FRACTION_PIXEL FRACTION_PIXEL}, {@link #SIZEUNITS_PIXEL_WORLD PIXEL_WORLD}, {@link #SIZEUNITS_PIXEL_FRACTION PIXEL_FRACTION}, {@link #SIZEUNITS_PIXEL_PIXEL PIXEL_PIXEL}).
	 * <br><br>
	 * <i>Tooltip:</i> The sizeUnits field values are used to interprete the offset values. Two quoted string values are provided. The first value is for horizontal size, and the second value is for vertical size. Examples: "WORLD" "WORLD" (default value), "FRACTION" "FRACTION" or "PIXEL" "PIXEL".
 * <ul>
 *  <li> <i>Hint:</i> If the value of the sizeUnits field is FRACTION, the size of the corresponding dimension is interpreted as a fraction of the corresponding parent’s dimension. </li> 
 *  <li> <i>Warning:</i> if only one value is provided, it applies equally to horizontal and vertical directions (width and height). More than two values are not allowed. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so "separate each individual string" "by using quote marks". </li> 
 * </ul>
	 * @param newValue is new value for the sizeUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LayoutObject setSizeUnits(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
		{
			clearSizeUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph

        for (int i = 0; i < newValue.length; i++)
        {
		if (!(
			(newValue.length == 0) ||
			newValue[i].equals(SIZEUNITS_WORLD_WORLD) ||
			newValue[i].equals(SIZEUNITS_WORLD_FRACTION) ||
			newValue[i].equals(SIZEUNITS_WORLD_PIXEL) ||
			newValue[i].equals(SIZEUNITS_FRACTION_WORLD) ||
			newValue[i].equals(SIZEUNITS_FRACTION_FRACTION) ||
			newValue[i].equals(SIZEUNITS_FRACTION_PIXEL) ||
			newValue[i].equals(SIZEUNITS_PIXEL_WORLD) ||
			newValue[i].equals(SIZEUNITS_PIXEL_FRACTION) ||
			newValue[i].equals(SIZEUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout sizeUnits newValue=\"" + Arrays.toString(newValue) + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			if (newValue[i].contains(" "))
                    warningMessage += " Note that enumeration value \"" + newValue[i] + "\" contains embedded whitespace, need to check necessary quoting of individual MFString values.";
			System.out.println(warningMessage);

            if (!(newValue.length == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        }
		if (newValue == null)		{
			clearSizeUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearSizeUnits(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			sizeUnits.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString sizeUnits field, similar to {@link #setSizeUnits(String[])}.
	 * @param newValue is new value for the sizeUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSizeUnits(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearSizeUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSizeUnits(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString sizeUnits field, similar to {@link #setSizeUnits(String[])}.
	 * @param newValue is new value for the sizeUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSizeUnits(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearSizeUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		if (newValue == null)
		{
			clearSizeUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.getValue().isEmpty() ||
			newValue.equals(SIZEUNITS_WORLD_WORLD) ||
			newValue.equals(SIZEUNITS_WORLD_FRACTION) ||
			newValue.equals(SIZEUNITS_WORLD_PIXEL) ||
			newValue.equals(SIZEUNITS_FRACTION_WORLD) ||
			newValue.equals(SIZEUNITS_FRACTION_FRACTION) ||
			newValue.equals(SIZEUNITS_FRACTION_PIXEL) ||
			newValue.equals(SIZEUNITS_PIXEL_WORLD) ||
			newValue.equals(SIZEUNITS_PIXEL_FRACTION) ||
			newValue.equals(SIZEUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout sizeUnits newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.getValue().isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setSizeUnits(MFStringObject.cleanupEnumerationValues(newValue.toString())); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign singleton String value to MFString sizeUnits field, similar to {@link #setSizeUnits(String[])}.
	 * @param newValue is new value for the sizeUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSizeUnits(String newValue)
	{
		if (newValue == null)		{
			clearSizeUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		if (newValue == null)
		{
			clearSizeUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			newValue.isEmpty() ||
			newValue.equals(SIZEUNITS_WORLD_WORLD) ||
			newValue.equals(SIZEUNITS_WORLD_FRACTION) ||
			newValue.equals(SIZEUNITS_WORLD_PIXEL) ||
			newValue.equals(SIZEUNITS_FRACTION_WORLD) ||
			newValue.equals(SIZEUNITS_FRACTION_FRACTION) ||
			newValue.equals(SIZEUNITS_FRACTION_PIXEL) ||
			newValue.equals(SIZEUNITS_PIXEL_WORLD) ||
			newValue.equals(SIZEUNITS_PIXEL_FRACTION) ||
			newValue.equals(SIZEUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout sizeUnits newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		setSizeUnits(MFStringObject.cleanupEnumerationValues(newValue)); // handle potential enumeration values
		return this;
	}
	/**
	 * Assign ArrayList value of MFString sizeUnits field, similar to {@link #setSizeUnits(String[])}.
	 * @param newValue is new value for the sizeUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setSizeUnits(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearSizeUnits(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
		if (newValue == null)
		{
			clearSizeUnits(); // null string check
            return this;
        }

		// Check that newValue parameter has one of the allowed legal values before assigning to scene graph
		if (!(
			(newValue.size() == 0) ||
			newValue.equals(SIZEUNITS_WORLD_WORLD) ||
			newValue.equals(SIZEUNITS_WORLD_FRACTION) ||
			newValue.equals(SIZEUNITS_WORLD_PIXEL) ||
			newValue.equals(SIZEUNITS_FRACTION_WORLD) ||
			newValue.equals(SIZEUNITS_FRACTION_FRACTION) ||
			newValue.equals(SIZEUNITS_FRACTION_PIXEL) ||
			newValue.equals(SIZEUNITS_PIXEL_WORLD) ||
			newValue.equals(SIZEUNITS_PIXEL_FRACTION) ||
			newValue.equals(SIZEUNITS_PIXEL_PIXEL)))
		{
			String warningMessage = "Warning: Layout sizeUnits newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!(newValue.size() == 0)) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
        if (newValue.isEmpty())
            clearSizeUnits(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setSizeUnits(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of sizeUnits field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public LayoutObject clearSizeUnits()
	{
		sizeUnits.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString sizeUnits field.
	 * @param newValue is new value to add to the sizeUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addSizeUnits(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !sizeUnits.contains(newValue))
            sizeUnits.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString sizeUnits field.
	 * @param newValue is new value to add to the sizeUnits field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject addSizeUnits(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !sizeUnits.contains(newValue.getValue()))
            sizeUnits.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide String value from inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes.
 * <ul>
 *  <li> <i>Hint:</i> descriptive DEF names improve clarity and help document a model. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of DEF field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String getDEF()
	{
		// override abstract method in X3DConcreteNode
		return super.getDEF();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes.
 * <ul>
 *  <li> <i>Hint:</i> descriptive DEF names improve clarity and help document a model. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>
	 *  Note that setting the DEF value clears the USE value.
	 * @param newValue is new value for the DEF field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final LayoutObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to Layout DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Layout DEF newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteUSE(""); // ensure that no previous USE value remains
		setConcreteDEF(newValue); // private superclass methods
		return this;
	}

	/**
	 * Assign typed object value to SFString DEF field, similar to {@link #setDEF(String)}.
	 * @param newValue is new value for the DEF field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setDEF(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDEF(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value).
 * <ul>
 *  <li> <i>Hint:</i> USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. </li> 
 *  <li> <i>Warning:</i> do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. </li> 
 *  <li> <i>Warning:</i>  each USE value must match a corresponding DEF value that is defined earlier in the scene. </li> 
 * </ul>
	 * @return value of USE field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String getUSE()
	{
		// override abstract method in X3DConcreteNode
		return super.getUSE();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value).
 * <ul>
 *  <li> <i>Hint:</i> USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. </li> 
 *  <li> <i>Warning:</i> do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. </li> 
 *  <li> <i>Warning:</i>  each USE value must match a corresponding DEF value that is defined earlier in the scene. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> each <code>USE</code> node is still an independent object, with the <code>USE</code> value matching the <code>DEF</code> value in the preceding object. 
	 * <br><br>
	 * <i>Warning:</i> invoking the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.<br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param newValue is new value for the USE field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final LayoutObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to Layout USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("Layout USE newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteDEF(""); // ensure that no previous DEF value remains
		setConcreteUSE(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString USE field, similar to {@link #setUSE(String)}.
	 * @param newValue is new value for the USE field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setUSE(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUSE(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets.
 * <ul>
 *  <li> <i>Warning:</i> currently the class attribute is only supported in XML encoding of X3D scenes. </li> 
 *  <li> <i>Hint:</i>  W3C Cascading Style Sheets <a href="https://www.w3.org/Style/CSS" target="_blank">https://www.w3.org/Style/CSS</a> </li> 
 * </ul>
	 * @return value of class field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLayoutNode, $additionalInheritanceBaseType=)
	@Override
	public String getCssClass()
	{
		// override abstract method in X3DConcreteNode
		return super.getCssClass();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets.
 * <ul>
 *  <li> <i>Warning:</i> currently the class attribute is only supported in XML encoding of X3D scenes. </li> 
 *  <li> <i>Hint:</i>  W3C Cascading Style Sheets <a href="https://www.w3.org/Style/CSS" target="_blank">https://www.w3.org/Style/CSS</a> </li> 
 * </ul>
	 * @param newValue is new value for the class field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final LayoutObject setCssClass(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		setConcreteCssClass(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString cssClass field, similar to {@link #setCssClass(String)}.
	 * @param newValue is new value for the class field.
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LayoutObject setUSE(LayoutObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on LayoutObject" +
				" that has no DEF name defined, thus a copy cannot be referenced as a USE node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		setUSE(DEFnode.getDEF());
		return this;
	}
	/**
	 * Utility constructor that assigns DEF label after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 */
	public LayoutObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public LayoutObject addComments (String newComment)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(\"" + newComment + "\")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public LayoutObject addComments (String[] newComments)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(" + Arrays.toString(newComments) + ")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link LayoutObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public LayoutObject addComments (CommentsBlock newCommentsBlock)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(CommentsBlock) " +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<Layout"); // start opening tag
		if (hasAttributes)
		{
			if (!getDEF().equals(DEF_DEFAULT_VALUE) && !isUSE())
			{
				stringX3D.append(" DEF='").append(SFStringObject.toString(getDEF())).append("'");
			}
			
			if (!getUSE().equals(USE_DEFAULT_VALUE))
			{
				stringX3D.append(" USE='").append(SFStringObject.toString(getUSE())).append("'");
			}
			
            // containerField is critical for ProtoInstance relationship to parent node
            if (!getContainerFieldOverride().isEmpty() && !getContainerFieldOverride().equals(this.getContainerFieldDefault())) // output if not default ProtoInstance containerField
            {
                    stringX3D.append(" containerField='").append(getContainerFieldOverride()).append("'");
            }

            // test attributes

			if (((getAlign().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" align='").append(new MFStringObject(getAlign()).toStringX3D()).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getOffset().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" offset='").append(MFFloatObject.toString(getOffset())).append("'");
			}
			if (((getOffsetUnits().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" offsetUnits='").append(new MFStringObject(getOffsetUnits()).toStringX3D()).append("'");
			}
			if (((getScaleMode().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" scaleMode='").append(new MFStringObject(getScaleMode()).toStringX3D()).append("'");
			}
			if (((getSize().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" size='").append(MFFloatObject.toString(getSize())).append("'");
			}
			if (((getSizeUnits().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" sizeUnits='").append(new MFStringObject(getSizeUnits()).toStringX3D()).append("'");
			}
		}
		if ((hasChild) && !isUSE()) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
			if      (metadata != null)
			{
				stringX3D.append(((X3DConcreteElement)metadata).toStringX3D(indentLevel + indentIncrement));
			}
			else if (metadataProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)metadataProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (IS != null)
			{
				stringX3D.append(((X3DConcreteElement)IS).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</Layout>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=Layout, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || !commentsList.isEmpty();
		if (isUSE())
		{
			hasAttributes = false;
			hasChild      = false; // USE nodes include no other fields
		}
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		if (!getDEF().equals(DEF_DEFAULT_VALUE))
		{
			stringClassicVRML.append("DEF ").append(SFStringObject.toString(getDEF())).append(" ");
		}
		if (!getUSE().equals(USE_DEFAULT_VALUE))
		{
			 stringClassicVRML.append("USE ").append(SFStringObject.toString(getUSE())).append("\n");
		}
		else // only have further output if not a USE node
		{
			stringClassicVRML.append("Layout").append(" { "); // define node name, node content follows

			if (hasAttributes || hasChild)
			{
				stringClassicVRML.append("\n").append(indent).append(indentCharacter); // fields for this node follow
			}
			if (hasAttributes)
			{
				boolean hasISconnect = (getIS() != null) && !getIS().getConnectList().isEmpty();
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("align"))
						{
							stringClassicVRML.append(indentCharacter).append("align").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getAlign().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("align ").append("[ ").append(MFStringObject.toString(getAlign())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("class"))
						{
							stringClassicVRML.append(indentCharacter).append("class").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("# class ").append("\"").append(SFStringObject.toString(getCssClass())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("offset"))
						{
							stringClassicVRML.append(indentCharacter).append("offset").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getOffset().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("offset ").append("[ ").append(MFFloatObject.toString(getOffset())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("offsetUnits"))
						{
							stringClassicVRML.append(indentCharacter).append("offsetUnits").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getOffsetUnits().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("offsetUnits ").append("[ ").append(MFStringObject.toString(getOffsetUnits())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("scaleMode"))
						{
							stringClassicVRML.append(indentCharacter).append("scaleMode").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getScaleMode().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("scaleMode ").append("[ ").append(MFStringObject.toString(getScaleMode())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("size"))
						{
							stringClassicVRML.append(indentCharacter).append("size").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSize().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("size ").append("[ ").append(MFFloatObject.toString(getSize())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("sizeUnits"))
						{
							stringClassicVRML.append(indentCharacter).append("sizeUnits").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSizeUnits().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("sizeUnits ").append("[ ").append(MFStringObject.toString(getSizeUnits())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
			}
		}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child elements
			if (metadata != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadata).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (metadataProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadataProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (IS != null)
			{
				stringClassicVRML.append(((X3DConcreteElement) IS).toStringClassicVRML(indentLevel)); // end X3D statement
			}
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
				stringClassicVRML.append(indent); // end SFNode
			}
		}
		if (hasAttributes || hasChild)
		{
			stringClassicVRML.append("}").append("\n"); // finish node content
		}
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
		return toStringClassicVRML(indentLevel);
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
		// no name field available for this element
		X3DConcreteElement referenceElement;
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadata != null)
		{
			referenceElement = ((X3DConcreteElement) metadata).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadataProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) metadataProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
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
		if (getDEF().equals(DEFvalue))
			return this;
		X3DConcreteNode referenceNode;
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (metadata != null)
		{
			referenceNode = ((X3DConcreteElement) metadata).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (metadataProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) metadataProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
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

		setAlign(getAlign()); // exercise field checks, simple types
        
		setOffset(getOffset()); // exercise field checks, simple types
        
		setOffsetUnits(getOffsetUnits()); // exercise field checks, simple types
        
		setScaleMode(getScaleMode()); // exercise field checks, simple types
        
		setSize(getSize()); // exercise field checks, simple types
        
		setSizeUnits(getSizeUnits()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "Layout USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Layout USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (metadata != null)
		{
			setMetadata(getMetadata());
			((X3DConcreteElement) metadata).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadata).getValidationResult());
		}
		if (metadataProtoInstance != null)
		{
			setMetadata(getMetadataProtoInstance());
			((X3DConcreteElement) metadataProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadataProtoInstance).getValidationResult());
		}
		if ((metadata != null) && (metadataProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both metadata and metadataProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasMetadata()) // test USE restrictions
		{
			String errorNotice = "Layout USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "Layout USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (getIS() != null)
		{
			if (getIS().getConnectList().isEmpty())
			{
				String errorNotice = "IS statement present, but contains no connect statements";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidProtoException(errorNotice); // report error
			}				
			// TODO also check that this node has ancestor ProtoBody, and that a field with same name also exists, so that IS is legal
		}
		if (!getContainerFieldOverride().isEmpty() &&
			!Arrays.asList(containerField_ALTERNATE_VALUES).contains(getContainerFieldOverride()))
		{
			String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
				": illegal value encountered, containerField='" + getContainerFieldOverride() +
				"' but allowed values are containerField_ALTERNATE_VALUES='" + 
				new MFStringObject(containerField_ALTERNATE_VALUES).toStringX3D() + "'.";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldException(errorNotice); // report error
		}

		// profile validation test, if connected to full scene
		if (findAncestorX3DObject() != null)
		{
			String     modelProfile = findAncestorX3DObject().getProfile();

			// check whether model has a satisfactory profile for this node
			boolean hasSatisfactorySupport = findAncestorX3DObject().supportsX3dComponent (COMPONENT, LEVEL);
                        
			if (!hasSatisfactorySupport)
			{
				String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
					" insufficient X3D profile='" + modelProfile +
					"' for parent X3D model containing 'Layout' node, add head statement <component name='Layout' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Layout\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
