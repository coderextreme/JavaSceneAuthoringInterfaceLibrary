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

package org.web3d.x3d.sai.Time;
import org.web3d.x3d.sai.Core.X3DSensorNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * TimeSensor continuously generates events as time passes.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DTimeDependentNode,X3DSensorNode] TimeSensor continuously generates events as time passes. Typical use: ROUTE thisTimeSensorDEF.fraction_changed TO someInterpolatorDEF.set_fraction. Interchange profile hint: TimeSensor may be ignored if cycleInterval &amp;lt; 0.01 second.
 * <ul>
 *  <li> <i>Hint:</i> event timing details are explained in X3D Specification 4.4.8.3 Execution model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModel" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#ExecutionModel</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 8 Time component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/time.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/time.html</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#TimeSensor" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/time.html#TimeSensor" target="blank">X3D Abstract Specification: TimeSensor</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TimeSensor" target="_blank">X3D Tooltips: TimeSensor</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface TimeSensor extends X3DTimeDependentNode, X3DSensorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>cycleInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) cycleInterval is loop duration in seconds. Interchange profile hint: TimeSensor may be ignored if cycleInterval &amp;lt; 0.01 second.
 * <ul>
 *  <li> <i>Warning:</i> An active TimeSensor node ignores set_cycleInterval and set_startTime events. </li> 
 *  <li> <i>Hint:</i>  cycleInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of cycleInterval field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	public double getCycleInterval();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>cycleInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) cycleInterval is loop duration in seconds. Interchange profile hint: TimeSensor may be ignored if cycleInterval &amp;lt; 0.01 second.
 * <ul>
 *  <li> <i>Warning:</i> An active TimeSensor node ignores set_cycleInterval and set_startTime events. </li> 
 *  <li> <i>Hint:</i>  cycleInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the cycleInterval field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TimeSensor setCycleInterval(double newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>cycleTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> cycleTime sends a time outputOnly at startTime, and also at the beginning of each new cycle (useful for synchronization with other time-based objects).
 * <ul>
 *  <li> <i>Hint:</i> the first cycleTime event for a TimeSensor node can be used as an alarm (single pulse at a specified time). </li> 
 *  <li> <i>Hint:</i> cycleTime is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of cycleTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	public double getCycleTime();
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>elapsedTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Current elapsed time since TimeSensor activated/running, cumulative in seconds, and not counting any paused time.
 * <ul>
 *  <li> <i>Warning:</i> not supported in VRML97. </li> 
 *  <li> <i>Warning:</i> it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 *  <li> <i>Hint:</i>  elapsedTime is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of elapsedTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public double getElapsedTime();
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setEnabled(boolean newValue);

	/**
	 * Provide float value from outputOnly SFFloat field named <i>fraction_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> fraction_changed continuously sends value in range [0,1] showing time progress in the current cycle.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of fraction_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	public float getFraction();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isActive true/false events are sent when TimeSensor starts/stops running.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public boolean getIsActive();
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isPaused</i>.
	 * <br><br>
	 * <i>Tooltip:</i> isPaused true/false events are sent when TimeSensor is paused/resumed.
 * <ul>
 *  <li> <i>Warning:</i> not supported in VRML97. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isPaused field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public boolean getIsPaused();
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>loop</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Repeat indefinitely when loop=true, repeat only once when loop=false.  * <br>

	 * @return value of loop field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public boolean getLoop();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>loop</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Repeat indefinitely when loop=true, repeat only once when loop=false.  * <br>

	 * @param newValue is new value for the loop field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setLoop(boolean newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
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
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide double value in seconds from inputOutput SFTime field named <i>pauseTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When time now &amp;gt;= pauseTime, isPaused becomes true and TimeSensor becomes paused. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 *  <li> <i>Warning:</i>  not supported in VRML97. </li> 
 * </ul>
	 * @return value of pauseTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public double getPauseTime();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>pauseTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When time now &amp;gt;= pauseTime, isPaused becomes true and TimeSensor becomes paused. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 *  <li> <i>Warning:</i>  not supported in VRML97. </li> 
 * </ul>
	 * @param newValue is new value for the pauseTime field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setPauseTime(double newValue);

	/**
	 * Provide double value in seconds from inputOutput SFTime field named <i>resumeTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When resumeTime becomes &amp;lt;= time now, isPaused becomes false and TimeSensor becomes inactive. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 *  <li> <i>Warning:</i>  not supported in VRML97. </li> 
 * </ul>
	 * @return value of resumeTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public double getResumeTime();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>resumeTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When resumeTime becomes &amp;lt;= time now, isPaused becomes false and TimeSensor becomes inactive. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 *  <li> <i>Warning:</i>  not supported in VRML97. </li> 
 * </ul>
	 * @param newValue is new value for the resumeTime field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setResumeTime(double newValue);

	/**
	 * Provide double value in seconds from inputOutput SFTime field named <i>startTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When time now &amp;gt;= startTime, isActive becomes true and TimeSensor becomes active. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i> Hint:</i>  ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 * </ul>
	 * @return value of startTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public double getStartTime();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>startTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When time now &amp;gt;= startTime, isActive becomes true and TimeSensor becomes active. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i> Hint:</i>  ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 * </ul>
	 * @param newValue is new value for the startTime field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setStartTime(double newValue);

	/**
	 * Provide double value in seconds from inputOutput SFTime field named <i>stopTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When stopTime becomes &amp;lt;= time now, isActive becomes false and TimeSensor becomes inactive. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 *  <li> <i>Warning:</i> An active TimeSensor node ignores set_cycleInterval and set_startTime events. </li> 
 *  <li> <i>Warning:</i> An active TimeSensor node ignores set_stopTime event values less than or equal to startTime. </li> 
 * </ul>
	 * @return value of stopTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	@Override
	public double getStopTime();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>stopTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> When stopTime becomes &amp;lt;= time now, isActive becomes false and TimeSensor becomes inactive. Absolute time: number of seconds since January 1, 1970, 00:00:00 GMT.
 * <ul>
 *  <li> <i>Hint:</i> ROUTE a time value matching system clock to this field, such as output event from TouchSensor touchTime or TimeTrigger triggerTime. </li> 
 *  <li> <i>Warning:</i> An active TimeSensor node ignores set_cycleInterval and set_startTime events. </li> 
 *  <li> <i>Warning:</i> An active TimeSensor node ignores set_stopTime event values less than or equal to startTime. </li> 
 * </ul>
	 * @param newValue is new value for the stopTime field.
	 * @return {@link TimeSensor} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TimeSensor setStopTime(double newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>time</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Time continuously sends the absolute time (value 0.0 matches 1 January 1970) in seconds for a given simulation tick.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of time field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTimeDependentNode, $additionalInheritanceBaseType=X3DSensorNode)
	public double getTime();
}
