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

package org.web3d.x3d.sai.EnvironmentalEffects;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * Background simulates ground and sky, using vertical arrays of wraparound color values.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DBackgroundNode] Background simulates ground and sky, using vertical arrays of wraparound color values. Background can also provide url addresses for backdrop textures on all six sides.
 * <ul>
 *  <li> <i>Hint:</i> Background, Fog, GeoViewpoint, NavigationInfo, OrthoViewpoint, TextureBackground and Viewpoint are bindable nodes, meaning that no more than one of each node type can be active at a given time. </li> 
 *  <li> <i>Warning:</i> results are undefined if a bindable node (Background, Fog, NavigationInfo, OrthoViewpoint, TextureBackground, Viewpoint) is a contained descendant node of either LOD or Switch. </li> 
 *  <li> <i>Hint:</i>  X3D Example Archives, Basic, Universal Media Panoramas <a href="https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaPanoramas" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaPanoramas</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Background" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/enveffects.html#Background" target="blank">X3D Abstract Specification: Background</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Background" target="_blank">X3D Tooltips: Background</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Background extends X3DBackgroundNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String results from inputOutput MFString field named <i>backUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of backUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public String[] getBackUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>backUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the backUrl field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Background setBackUrl(String[] newValue);

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>bindTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> event sent when node becomes active/inactive.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of bindTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public double getBindTime();
	/**
	 * Provide array of String results from inputOutput MFString field named <i>bottomUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of bottomUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public String[] getBottomUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>bottomUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the bottomUrl field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Background setBottomUrl(String[] newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>frontUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of frontUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public String[] getFrontUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>frontUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the frontUrl field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Background setFrontUrl(String[] newValue);

	/**
	 * Provide array of float results unit axis, angle (in radians) within allowed range of [0,1.5708] from inputOutput MFFloat field named <i>groundAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi/2] The angle array values increase from 0.0 nadir (straight down) to pi/2=1.570796 (horizon).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. </li> 
 *  <li> <i>Warning:</i> colors at groundAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of groundAngle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getGroundAngle();

	/**
	 * Accessor method to assign float array unit axis, angle (in radians) to inputOutput MFFloat field named <i>groundAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi/2] The angle array values increase from 0.0 nadir (straight down) to pi/2=1.570796 (horizon).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. </li> 
 *  <li> <i>Warning:</i> colors at groundAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the groundAngle field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Background setGroundAngle(float[] newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput MFColor field named <i>groundColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the ground at the various angles on the ground partial sphere. First value is color of ground at 0.0 radians representing the nadir (straight down).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of groundColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getGroundColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput MFColor field named <i>groundColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the ground at the various angles on the ground partial sphere. First value is color of ground at 0.0 radians representing the nadir (straight down).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more groundColor value than groundAngle values. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the groundColor field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Background setGroundColor(float[] newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isBound</i>.
	 * <br><br>
	 * <i>Tooltip:</i> event true sent when node becomes active, event false sent when unbound by another node.
 * <ul>
 *  <li> <i>Hint:</i> paired node operations can be established by connecting set_bind and isBound fields of corresponding bindable nodes. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isBound field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsBound();
	/**
	 * Provide array of String results from inputOutput MFString field named <i>leftUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of leftUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public String[] getLeftUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>leftUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the leftUrl field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Background setLeftUrl(String[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Background setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String results from inputOutput MFString field named <i>rightUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of rightUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public String[] getRightUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>rightUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the rightUrl field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Background setRightUrl(String[] newValue);

	/**
	 * Provide array of float results unit axis, angle (in radians) within allowed range of [0,3.1416] from inputOutput MFFloat field named <i>skyAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi] The angle array values increase from 0.0 zenith (straight up) to pi/2=1.570796 (horizon) to pi=3.14159 (nadir).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. </li> 
 *  <li> <i>Warning:</i> colors at skyAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of skyAngle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSkyAngle();

	/**
	 * Accessor method to assign float array unit axis, angle (in radians) to inputOutput MFFloat field named <i>skyAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,pi] The angle array values increase from 0.0 zenith (straight up) to pi/2=1.570796 (horizon) to pi=3.14159 (nadir).
 * <ul>
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. </li> 
 *  <li> <i>Warning:</i> colors at skyAngle=0 are ignored. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the skyAngle field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Background setSkyAngle(float[] newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput MFColor field named <i>skyColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the sky at various angles on the sky sphere. First value is color of sky at 0.0 radians representing the zenith (straight up).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. Interchange profile hint: only one color might be rendered, others can be ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of skyColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getSkyColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput MFColor field named <i>skyColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Color of the sky at various angles on the sky sphere. First value is color of sky at 0.0 radians representing the zenith (straight up).
 * <ul>
 *  <li> <i>Hint:</i> setting the same color at two consecutive angles produces a solid color band. </li> 
 *  <li> <i>Warning:</i> you must have one more skyColor value than skyAngle values. Interchange profile hint: only one color might be rendered, others can be ignored. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the skyColor field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Background setSkyColor(float[] newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>topUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of topUrl field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	public String[] getTopUrl();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>topUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Image background panorama between ground/sky backdrop and scene's geometry.
 * <ul>
 *  <li> <i>Hint:</i> MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." </li> 
 *  <li> <i>Hint:</i> alternative XML encoding for quotation mark " is &amp;quot; (which is an example of a character entity). </li> 
 *  <li> <i>Warning:</i> strictly match directory and filename capitalization for http links! This is important for portability. Some operating systems are forgiving of capitalization mismatches, but http/https url addresses and paths in Unix-based operating systems are all case sensitive and intolerant of uppercase/lowercase mismatches. </li> 
 *  <li> <i>Hint:</i>  can replace embedded blank(s) in url queries with %20 for each blank character. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the topUrl field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Background setTopUrl(String[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" the background is, allows underlying page to show through: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @return value of transparency field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBackgroundNode, $additionalInheritanceBaseType=)
	@Override
	public float getTransparency();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" the background is, allows underlying page to show through: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @param newValue is new value for the transparency field.
	 * @return {@link Background} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Background setTransparency(float newValue);

}
