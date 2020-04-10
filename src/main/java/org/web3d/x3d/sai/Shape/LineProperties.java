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

package org.web3d.x3d.sai.Shape;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * LineProperties allows precise fine-grained control over the rendering style of lines and edges for associated geometry nodes inside the same Shape.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DAppearanceChildNode] LineProperties allows precise fine-grained control over the rendering style of lines and edges for associated geometry nodes inside the same Shape.
 * <ul>
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes in a scene. </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Shape' level='2'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#LineProperties" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#LineProperties" target="blank">X3D Abstract Specification: LineProperties</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#LineProperties" target="_blank">X3D Tooltips: LineProperties</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface LineProperties extends X3DAppearanceChildNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>applied</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether or not LineProperties are applied to associated geometry.  * <br>

	 * @return value of applied field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public boolean getApplied();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>applied</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether or not LineProperties are applied to associated geometry.  * <br>

	 * @param newValue is new value for the applied field.
	 * @return {@link LineProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LineProperties setApplied(boolean newValue);

	/**
	 * Provide int value within allowed range of [1,infinity) from inputOutput SFInt32 field named <i>linetype</i>.
	 * <br><br>
	 * <i>Tooltip:</i> linetype selects a line pattern, with solid default if defined value isn't supported. Values with guaranteed support are 1 Solid, 2 Dashed, 3 Dotted, 4 Dashed-dotted, 5 Dash-dot-dot. Optionally supported values are 6 single-headed arrow (arrow tip occurs at last point of each individual list of points), 7 single dot, 8 double-headed arrow, 10 chain line, 11 center line, 12 hidden line, 13 phantom line, 14 break line 1, 15 break line 2, 16 User-specified dash pattern.
 * <ul>
 *  <li> <i> Hint:</i>  detailed descriptions of lineType values are found at the ISO/IEC International Register of Graphical Items <a href="http://www.iso.org/jtc1/sc24/register" target="_blank">http://www.iso.org/jtc1/sc24/register</a> (may require login) </li> 
 * </ul>
	 * @return value of linetype field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public int getLinetype();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>linetype</i>.
	 * <br><br>
	 * <i>Tooltip:</i> linetype selects a line pattern, with solid default if defined value isn't supported. Values with guaranteed support are 1 Solid, 2 Dashed, 3 Dotted, 4 Dashed-dotted, 5 Dash-dot-dot. Optionally supported values are 6 single-headed arrow (arrow tip occurs at last point of each individual list of points), 7 single dot, 8 double-headed arrow, 10 chain line, 11 center line, 12 hidden line, 13 phantom line, 14 break line 1, 15 break line 2, 16 User-specified dash pattern.
 * <ul>
 *  <li> <i> Hint:</i>  detailed descriptions of lineType values are found at the ISO/IEC International Register of Graphical Items <a href="http://www.iso.org/jtc1/sc24/register" target="_blank">http://www.iso.org/jtc1/sc24/register</a> (may require login) </li> 
 * </ul>
	 * @param newValue is new value for the linetype field.
	 * @return {@link LineProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LineProperties setLinetype(int newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>linewidthScaleFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  linewidthScaleFactor is a scale factor multiplied by browser-dependent nominal linewidth, mapped to nearest available line width. Values zero or less provide minimum available line width.  * <br>

	 * @return value of linewidthScaleFactor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public float getLinewidthScaleFactor();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>linewidthScaleFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  linewidthScaleFactor is a scale factor multiplied by browser-dependent nominal linewidth, mapped to nearest available line width. Values zero or less provide minimum available line width.  * <br>

	 * @param newValue is new value for the linewidthScaleFactor field.
	 * @return {@link LineProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public LineProperties setLinewidthScaleFactor(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link LineProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public LineProperties setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

}
