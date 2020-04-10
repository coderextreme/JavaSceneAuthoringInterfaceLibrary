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

package org.web3d.x3d.sai.Navigation;

import org.web3d.x3d.sai.Core.X3DBindableNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * NavigationInfo describes the user's viewing model, user navigation-interaction modalities, and also dimensional characteristics of the user's (typically invisible) avatar.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DBindableNode] NavigationInfo describes the user's viewing model, user navigation-interaction modalities, and also dimensional characteristics of the user's (typically invisible) avatar.
 * <ul>
 *  <li> <i>Hint:</i> for inspection of simple objects, usability often improves with type="EXAMINE" "ANY" </li> 
 *  <li> <i>Hint:</i> Background, Fog, GeoViewpoint, NavigationInfo, OrthoViewpoint, TextureBackground and Viewpoint are bindable nodes, meaning that no more than one of each node type can be active at a given time. </li> 
 *  <li> <i>Hint:</i> NavigationInfo types '"WALK" "FLY"' support camera-to-object collision detection. </li> 
 *  <li> <i>Warning:</i> results are undefined if a bindable node (Background, Fog, NavigationInfo, OrthoViewpoint, TextureBackground, Viewpoint) is a contained descendant node of either LOD or Switch. </li> 
 *  <li> <i>Hint:</i> Regardless of viewpoint jump value at bind time, the relative viewing transformation between user's view and defined position/orientation is stored for later use when un-jumping (returning to the viewpoint when subsequent viewpoint is unbound). </li> 
 *  <li> <i>Hint:</i> customizable design pattern for dedicated Viewpoint/NavigationInfo pair: &amp;lt;Viewpoint DEF='SpecialView'/&amp;gt; &amp;lt;NavigationInfo DEF='SpecialNav'/&amp;gt; &amp;lt;ROUTE fromNode='SpecialView' fromField='isBound' toNode='SpecialNav' toField='set_bind'/&amp;gt; </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Viewpoints <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Viewpoints" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Viewpoints</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#NavigationInfo" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/navigation.html#NavigationInfo" target="blank">X3D Abstract Specification: NavigationInfo</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NavigationInfo" target="_blank">X3D Tooltips: NavigationInfo</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Viewpoints" target="_blank">X3D Scene Authoring Hints: Viewpoints</a>
    */
public interface NavigationInfo extends X3DBindableNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of float results within allowed range of [0,infinity) from inputOutput MFFloat field named <i>avatarSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> avatarSize triplet values define three separate parameters: (a) collisionDistance between user and geometry, i.e. near clipping plane of view frustrum, default 0.25m, (b) viewer height above terrain, default 1.6m, and (c) tallest height viewer can WALK over, default 0.75m.
 * <ul>
 *  <li> <i>Hint:</i> X3D specification recommends that browsers set near clipping plane to one-half of avatarSize.CollisionDistance value. </li> 
 *  <li> <i>Warning:</i> important design thumbrule is to keep (visibilityLimit / avatarSize.CollisionDistance) &amp;lt; 10,000 to avoid aliasing artifacts (i.e. polygon "tearing"). </li> 
 *  <li> <i>Hint:</i> Aliasing <a href="https://en.wikipedia.org/wiki/Aliasing" target="_blank">https://en.wikipedia.org/wiki/Aliasing</a> and Clipping <a href="https://en.wikipedia.org/wiki/Clipping_(computer_graphics)" target="_blank">https://en.wikipedia.org/wiki/Clipping_(computer_graphics)</a> Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  transformation hierarchy of currently bound Viewpoint node scales avatarSize, but translations and rotations have no effect. </li> 
 * </ul>
	 * @return value of avatarSize field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public float[] getAvatarSize();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>avatarSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> avatarSize triplet values define three separate parameters: (a) collisionDistance between user and geometry, i.e. near clipping plane of view frustrum, default 0.25m, (b) viewer height above terrain, default 1.6m, and (c) tallest height viewer can WALK over, default 0.75m.
 * <ul>
 *  <li> <i>Hint:</i> X3D specification recommends that browsers set near clipping plane to one-half of avatarSize.CollisionDistance value. </li> 
 *  <li> <i>Warning:</i> important design thumbrule is to keep (visibilityLimit / avatarSize.CollisionDistance) &amp;lt; 10,000 to avoid aliasing artifacts (i.e. polygon "tearing"). </li> 
 *  <li> <i>Hint:</i> Aliasing <a href="https://en.wikipedia.org/wiki/Aliasing" target="_blank">https://en.wikipedia.org/wiki/Aliasing</a> and Clipping <a href="https://en.wikipedia.org/wiki/Clipping_(computer_graphics)" target="_blank">https://en.wikipedia.org/wiki/Clipping_(computer_graphics)</a> Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 *  <li> <i>Hint:</i>  transformation hierarchy of currently bound Viewpoint node scales avatarSize, but translations and rotations have no effect. </li> 
 * </ul>
	 * @param newValue is new value for the avatarSize field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setAvatarSize(float[] newValue);

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>bindTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Event sent reporting timestamp when node becomes active/inactive.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of bindTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	@Override
	public double getBindTime();
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>headlight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enable/disable directional light that always points in the direction the user is looking.  * <br>

	 * @return value of headlight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public boolean getHeadlight();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>headlight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enable/disable directional light that always points in the direction the user is looking.  * <br>

	 * @param newValue is new value for the headlight field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setHeadlight(boolean newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isBound</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event true gets sent when node becomes bound and activated, otherwise output event false gets sent when node becomes unbound and deactivated.
 * <ul>
 *  <li> <i>Hint:</i> paired node operations can be established by connecting set_bind and isBound fields of corresponding bindable nodes. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isBound field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsBound();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NavigationInfo setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>speed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Default rate at which viewer travels through scene, meters/second.
 * <ul>
 *  <li> <i> Warning:</i>  default 1 m/s usually seems slow for ordinary navigation. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of speed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public float getSpeed();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>speed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Default rate at which viewer travels through scene, meters/second.
 * <ul>
 *  <li> <i> Warning:</i>  default 1 m/s usually seems slow for ordinary navigation. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the speed field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setSpeed(float newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>transitionComplete</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Event signaling viewpoint transition complete. Interchange profile hint: this field may be ignored.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of transitionComplete field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public boolean getTransitionComplete();
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>transitionTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> transitionTime defines the expected duration of viewpoint transition in seconds.
 * <ul>
 *  <li> <i> Hint:</i>  If transitionType is "ANIMATE", transitionTime provides browser-dependent animation parameters. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of transitionTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public double getTransitionTime();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>transitionTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> transitionTime defines the expected duration of viewpoint transition in seconds.
 * <ul>
 *  <li> <i> Hint:</i>  If transitionType is "ANIMATE", transitionTime provides browser-dependent animation parameters. Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the transitionTime field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setTransitionTime(double newValue);

	/**
	 * Provide array of String enumeration results with quoted value(s) ["TELEPORT","LINEAR","ANIMATE",...] from inputOutput MFString field named <i>transitionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Camera transition between viewpoints. Enter one or more quoted SFString values: "ANIMATE" "TELEPORT" "LINEAR".
 * <ul>
 *  <li> <i> Hint:</i>  "ANIMATE" behavior is browser-specific, "TELEPORT" is immediate, and "LINEAR" may proceed directly through intervening objects. </li> 
 * </ul>
	 * @return value of transitionType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public String[] getTransitionType();

	/**
	 * Accessor method to assign String enumeration array (""TELEPORT"" | ""LINEAR"" | ""ANIMATE"") to inputOutput MFString field named <i>transitionType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Camera transition between viewpoints. Enter one or more quoted SFString values: "ANIMATE" "TELEPORT" "LINEAR".
 * <ul>
 *  <li> <i> Hint:</i>  "ANIMATE" behavior is browser-specific, "TELEPORT" is immediate, and "LINEAR" may proceed directly through intervening objects. </li> 
 * </ul>
	 * @param newValue is new value for the transitionType field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setTransitionType(String[] newValue);

	/**
	 * Provide array of String enumeration results with quoted value(s) ["ANY","WALK","EXAMINE","FLY","LOOKAT","NONE","EXPLORE",...] from inputOutput MFString field named <i>type</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Enter one or more quoted SFString values: "EXAMINE" "WALK" "FLY" "LOOKAT" "EXPLORE" "ANY" "NONE".
 * <ul>
 *  <li> <i>Hint:</i> for inspection of simple objects, usability often improves with type="EXAMINE" "ANY". </li> 
 *  <li> <i>Hint:</i> types WALK and FLY force strict camera-to-object collision detection. </li> 
 *  <li> <i>Hint:</i> see Collision node for further details on camera-to-object collision detection. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." ] Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of type field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public String[] getType();

	/**
	 * Accessor method to assign String enumeration array (""ANY"" | ""WALK"" | ""EXAMINE"" | ""FLY"" | ""LOOKAT"" | ""NONE"" | ""EXPLORE"") to inputOutput MFString field named <i>type</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Enter one or more quoted SFString values: "EXAMINE" "WALK" "FLY" "LOOKAT" "EXPLORE" "ANY" "NONE".
 * <ul>
 *  <li> <i>Hint:</i> for inspection of simple objects, usability often improves with type="EXAMINE" "ANY". </li> 
 *  <li> <i>Hint:</i> types WALK and FLY force strict camera-to-object collision detection. </li> 
 *  <li> <i>Hint:</i> see Collision node for further details on camera-to-object collision detection. </li> 
 *  <li> <i>Hint:</i>  MFString arrays can have multiple values, so separate each individual string by quote marks "<a href="https://www.web3d.org" target="_blank">https://www.web3d.org</a>" "<a href="https://www.web3d.org/about" target="_blank">https://www.web3d.org/about</a>" "etc." ] Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the type field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setType(String[] newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>visibilityLimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geometry beyond the visibilityLimit may not be rendered (far clipping plane of the view frustrum).
 * <ul>
 *  <li> <i>Hint:</i> visibilityLimit=0.0 indicates an infinite visibility limit (no far clipping plane). </li> 
 *  <li> <i>Hint:</i> set visibilityLimit to appropriate positive value in meters to define far culling plane of view frustum. </li> 
 *  <li> <i>Hint:</i> X3D specification recommends that browsers set near clipping plane to one-half of avatarSize.CollisionDistance value. </li> 
 *  <li> <i>Warning:</i> important design thumbrule is to keep (visibilityLimit / avatarSize.CollisionDistance) &amp;lt; 10,000 to avoid aliasing artifacts (i.e. polygon "tearing"). </li> 
 *  <li> <i>Hint:</i>  Aliasing <a href="https://en.wikipedia.org/wiki/Aliasing" target="_blank">https://en.wikipedia.org/wiki/Aliasing</a> and Clipping <a href="https://en.wikipedia.org/wiki/Clipping_(computer_graphics)" target="_blank">https://en.wikipedia.org/wiki/Clipping_(computer_graphics)</a> Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @return value of visibilityLimit field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=)
	public float getVisibilityLimit();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>visibilityLimit</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geometry beyond the visibilityLimit may not be rendered (far clipping plane of the view frustrum).
 * <ul>
 *  <li> <i>Hint:</i> visibilityLimit=0.0 indicates an infinite visibility limit (no far clipping plane). </li> 
 *  <li> <i>Hint:</i> set visibilityLimit to appropriate positive value in meters to define far culling plane of view frustum. </li> 
 *  <li> <i>Hint:</i> X3D specification recommends that browsers set near clipping plane to one-half of avatarSize.CollisionDistance value. </li> 
 *  <li> <i>Warning:</i> important design thumbrule is to keep (visibilityLimit / avatarSize.CollisionDistance) &amp;lt; 10,000 to avoid aliasing artifacts (i.e. polygon "tearing"). </li> 
 *  <li> <i>Hint:</i>  Aliasing <a href="https://en.wikipedia.org/wiki/Aliasing" target="_blank">https://en.wikipedia.org/wiki/Aliasing</a> and Clipping <a href="https://en.wikipedia.org/wiki/Clipping_(computer_graphics)" target="_blank">https://en.wikipedia.org/wiki/Clipping_(computer_graphics)</a> Interchange profile hint: this field may be ignored, applying the default value regardless. </li> 
 * </ul>
	 * @param newValue is new value for the visibilityLimit field.
	 * @return {@link NavigationInfo} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NavigationInfo setVisibilityLimit(float newValue);

}
