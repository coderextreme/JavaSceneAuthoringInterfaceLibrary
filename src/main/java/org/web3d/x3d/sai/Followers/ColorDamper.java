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

package org.web3d.x3d.sai.Followers;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * ColorDamper generates a series of RGB color values that progressively change from initial value to destination value.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DDamperNode] ColorDamper generates a series of RGB color values that progressively change from initial value to destination value.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE value_changed output events to one of a &amp;lt;Material&amp;gt; node's color fields, for example. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#ColorDamper" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/followers.html#ColorDamper" target="blank">X3D Abstract Specification: ColorDamper</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ColorDamper" target="_blank">X3D Tooltips: ColorDamper</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface ColorDamper extends X3DDamperNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from initializeOnly SFColor field named <i>initialDestination</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial destination value for this node.  * <br>

	 * @return value of initialDestination field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	public float[] getInitialDestination();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to initializeOnly SFColor field named <i>initialDestination</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial destination value for this node.  * <br>

	 * @param newValue is new value for the initialDestination field.
	 * @return {@link ColorDamper} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ColorDamper setInitialDestination(float[] newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from initializeOnly SFColor field named <i>initialValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial starting value for this node.  * <br>

	 * @return value of initialValue field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	public float[] getInitialValue();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to initializeOnly SFColor field named <i>initialValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial starting value for this node.  * <br>

	 * @param newValue is new value for the initialValue field.
	 * @return {@link ColorDamper} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ColorDamper setInitialValue(float[] newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive true/false events are sent when follower-node computation starts/stops.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getIsActive();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
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
	 * @return {@link ColorDamper} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ColorDamper setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value within allowed range of [0,5] from initializeOnly SFInt32 field named <i>order</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,5] order defines the number of internal filters (larger means smoother response, longer delay).  * <br>

	 * @return value of order field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	@Override
	public int getOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>order</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,5] order defines the number of internal filters (larger means smoother response, longer delay).  * <br>

	 * @param newValue is new value for the order field.
	 * @return {@link ColorDamper} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ColorDamper setOrder(int newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>tau</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) tau is the exponential-decay time constant for filter response in seconds.  * <br>

	 * @return value of tau field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	@Override
	public double getTau();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>tau</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) tau is the exponential-decay time constant for filter response in seconds.  * <br>

	 * @param newValue is new value for the tau field.
	 * @return {@link ColorDamper} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ColorDamper setTau(double newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>tolerance</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) or -1. Absolute value for satisfactory completion proximity (-1 lets browser choose).  * <br>

	 * @return value of tolerance field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	@Override
	public float getTolerance();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>tolerance</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) or -1. Absolute value for satisfactory completion proximity (-1 lets browser choose).  * <br>

	 * @param newValue is new value for the tolerance field.
	 * @return {@link ColorDamper} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ColorDamper setTolerance(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from outputOnly SFColor field named <i>value_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Computed output value that approaches within tolerance of destination value, as determined by elapsed time, order and tau.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of value_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DDamperNode, $additionalInheritanceBaseType=)
	public float[] getValue();
}
