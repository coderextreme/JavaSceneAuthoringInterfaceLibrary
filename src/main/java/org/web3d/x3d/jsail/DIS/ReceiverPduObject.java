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

package org.web3d.x3d.jsail.DIS;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.DIS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.DIS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * ReceiverPdu is a networked Protocol Data Unit (PDU) information node that transmits the state of radio frequency (RF) receivers modeled in a simulation.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNetworkSensorNode,X3DBoundedObject] ReceiverPdu is a networked Protocol Data Unit (PDU) information node that transmits the state of radio frequency (RF) receivers modeled in a simulation.
 * <ul>
 *  <li> <i>Hint:</i> ReceiverPdu packets use the IEEE Distributed Interactive Simulation (DIS) protocol. </li> 
 *  <li> <i>Hint:</i> Savage Developers Guide on DIS <a href="https://savage.nps.edu/Savage/developers.html#DIS" target="_blank">https://savage.nps.edu/Savage/developers.html#DIS</a> </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/DistributedInteractiveSimulation.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='DIS' level='1'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#ReceiverPdu" target="blank">X3D Abstract Specification: ReceiverPdu</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ReceiverPdu" target="_blank">X3D Tooltips: ReceiverPdu</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class ReceiverPduObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.DIS.ReceiverPdu
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=address, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=address, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String address; // SFString

 /* @name=applicationID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=applicationID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int applicationID; // SFInt32

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=enabled, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=enabled, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean enabled; // SFBool

 /* @name=entityID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=entityID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int entityID; // SFInt32

 /* @name=geoCoords, @type=SFVec3d, $javaType=double[], $javaReferenceType=double[], $javaPrimitiveType=double[], $normalizedMemberObjectName=geoCoords, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double[] geoCoords; // SFVec3d

 /* @name=geoSystem, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=geoSystem, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> geoSystem = new ArrayList<>(); // MFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=isActive, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isActive, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isActive; // SFBool

 /* @name=isNetworkReader, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isNetworkReader, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isNetworkReader; // SFBool

 /* @name=isNetworkWriter, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isNetworkWriter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isNetworkWriter; // SFBool

 /* @name=isRtpHeaderHeard, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isRtpHeaderHeard, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isRtpHeaderHeard; // SFBool

 /* @name=isStandAlone, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=isStandAlone, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean isStandAlone; // SFBool

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=multicastRelayHost, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=multicastRelayHost, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String multicastRelayHost; // SFString

 /* @name=multicastRelayPort, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=multicastRelayPort, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int multicastRelayPort; // SFInt32

 /* @name=networkMode, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=networkMode, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String networkMode; // SFString

 /* @name=port, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=port, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int port; // SFInt32

 /* @name=radioID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=radioID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int radioID; // SFInt32

 /* @name=readInterval, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=readInterval, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double readInterval; // SFTime

 /* @name=receivedPower, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=receivedPower, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float receivedPower; // SFFloat

 /* @name=receiverState, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=receiverState, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int receiverState; // SFInt32

 /* @name=rtpHeaderExpected, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=rtpHeaderExpected, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean rtpHeaderExpected; // SFBool

 /* @name=siteID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=siteID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int siteID; // SFInt32

 /* @name=timestamp, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=timestamp, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double timestamp; // SFTime

 /* @name=transmitterApplicationID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=transmitterApplicationID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int transmitterApplicationID; // SFInt32

 /* @name=transmitterEntityID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=transmitterEntityID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int transmitterEntityID; // SFInt32

 /* @name=transmitterRadioID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=transmitterRadioID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int transmitterRadioID; // SFInt32

 /* @name=transmitterSiteID, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=transmitterSiteID, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int transmitterSiteID; // SFInt32

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

 /* @name=whichGeometry, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=whichGeometry, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int whichGeometry; // SFInt32

 /* @name=writeInterval, @type=SFTime, $javaType=double, $javaReferenceType=double, $javaPrimitiveType=double, $normalizedMemberObjectName=writeInterval, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double writeInterval; // SFTime

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "standAlone", "networkReader", "networkWriter".
<br ><br >
	 * networkModeChoices are strictly allowed enumeration values for DIS field networkMode.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#CommonDISfields" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html#CommonDISfields</a> 
	*/
	public static final ArrayList<String> networkModeChoices = new ArrayList<>(Arrays.<String>asList("standAlone", "networkReader", "networkWriter"));

	/** SFString field named <i>networkMode</i> with X3DUOM baseType <i>networkModeChoices</i> can equal this value <i>"standAlone"</i> (Java syntax) or <i>standAlone</i> (XML syntax).
	 * @see #networkModeChoices */
	public static final String NETWORKMODE_STANDALONE = "standAlone";

	/** SFString field named <i>networkMode</i> with X3DUOM baseType <i>networkModeChoices</i> can equal this value <i>"networkReader"</i> (Java syntax) or <i>networkReader</i> (XML syntax).
	 * @see #networkModeChoices */
	public static final String NETWORKMODE_NETWORKREADER = "networkReader";

	/** SFString field named <i>networkMode</i> with X3DUOM baseType <i>networkModeChoices</i> can equal this value <i>"networkWriter"</i> (Java syntax) or <i>networkWriter</i> (XML syntax).
	 * @see #networkModeChoices */
	public static final String NETWORKMODE_NETWORKWRITER = "networkWriter";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>ReceiverPdu</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "ReceiverPdu";

	/** Provides name of this element: <i>ReceiverPdu</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>ReceiverPdu</i> element: <i>DIS</i> */
	public static final String COMPONENT = "DIS";

	/** Defines X3D component for the <i>ReceiverPdu</i> element: <i>DIS</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>DIS</i> component level for this element: <i>1</i> */
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

	/** SFString field named <i>address</i> has default value <i>"localhost"</i> (Java syntax) or <i>localhost</i> (XML syntax). */
	public static final String ADDRESS_DEFAULT_VALUE = "localhost";

	/** SFInt32 field named <i>applicationID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int APPLICATIONID_DEFAULT_VALUE = 0;

	/** SFVec3f field named <i>bboxCenter</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BBOXCENTER_DEFAULT_VALUE = {0f,0f,0f};

	/** SFVec3f field named <i>bboxSize</i> has default value <i>{-1f,-1f,-1f}</i> (Java syntax) or <i>-1 -1 -1</i> (XML syntax). */
	public static final float[] BBOXSIZE_DEFAULT_VALUE = {-1f,-1f,-1f};

	/** SFBool field named <i>enabled</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean ENABLED_DEFAULT_VALUE = true;

	/** SFInt32 field named <i>entityID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int ENTITYID_DEFAULT_VALUE = 0;

	/** SFVec3d field named <i>geoCoords</i> has default value <i>{0,0,0}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final double[] GEOCOORDS_DEFAULT_VALUE = {0,0,0};

	/** MFString field named <i>geoSystem</i> has default quoted value <i>new String[] {"GD","WE"}</i> (Java syntax) or quoted value <i>"GD" "WE"</i> (XML syntax). */
	public static final ArrayList<String> GEOSYSTEM_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("GD","WE"));

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFString field named <i>multicastRelayHost</i> has default value equal to an empty string. */
	public static final String MULTICASTRELAYHOST_DEFAULT_VALUE = "";

	/** SFInt32 field named <i>multicastRelayPort</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int MULTICASTRELAYPORT_DEFAULT_VALUE = 0;

	/** SFString field named <i>networkMode</i> has default value <i>"standAlone"</i> (Java syntax) or <i>standAlone</i> (XML syntax). */
	public static final String NETWORKMODE_DEFAULT_VALUE = "standAlone";

	/** SFInt32 field named <i>port</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int PORT_DEFAULT_VALUE = 0;

	/** SFInt32 field named <i>radioID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int RADIOID_DEFAULT_VALUE = 0;

	/** SFTime field named <i>readInterval</i> has default value <i>0.1</i> (Java syntax) or <i>0.1</i> (XML syntax). */
	public static final double READINTERVAL_DEFAULT_VALUE = 0.1;

	/** SFFloat field named <i>receivedPower</i> has default value <i>0.0f</i> (Java syntax) or <i>0.0</i> (XML syntax). */
	public static final float RECEIVEDPOWER_DEFAULT_VALUE = 0.0f;

	/** SFInt32 field named <i>receiverState</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int RECEIVERSTATE_DEFAULT_VALUE = 0;

	/** SFBool field named <i>rtpHeaderExpected</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean RTPHEADEREXPECTED_DEFAULT_VALUE = false;

	/** SFInt32 field named <i>siteID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int SITEID_DEFAULT_VALUE = 0;

	/** SFInt32 field named <i>transmitterApplicationID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int TRANSMITTERAPPLICATIONID_DEFAULT_VALUE = 0;

	/** SFInt32 field named <i>transmitterEntityID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int TRANSMITTERENTITYID_DEFAULT_VALUE = 0;

	/** SFInt32 field named <i>transmitterRadioID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int TRANSMITTERRADIOID_DEFAULT_VALUE = 0;

	/** SFInt32 field named <i>transmitterSiteID</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int TRANSMITTERSITEID_DEFAULT_VALUE = 0;

	/** SFBool field named <i>visible</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean VISIBLE_DEFAULT_VALUE = true;

	/** SFInt32 field named <i>whichGeometry</i> has default value <i>1</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final int WHICHGEOMETRY_DEFAULT_VALUE = 1;

	/** SFTime field named <i>writeInterval</i> has default value <i>1.0</i> (Java syntax) or <i>1.0</i> (XML syntax). */
	public static final double WRITEINTERVAL_DEFAULT_VALUE = 1.0;

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
			case "address":
				result = "SFString";
				break;
			case "applicationID":
				result = "SFInt32";
				break;
			case "bboxCenter":
				result = "SFVec3f";
				break;
			case "bboxSize":
				result = "SFVec3f";
				break;
			case "enabled":
				result = "SFBool";
				break;
			case "entityID":
				result = "SFInt32";
				break;
			case "geoCoords":
				result = "SFVec3d";
				break;
			case "geoSystem":
				result = "MFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "isActive":
				result = "SFBool";
				break;
			case "isNetworkReader":
				result = "SFBool";
				break;
			case "isNetworkWriter":
				result = "SFBool";
				break;
			case "isRtpHeaderHeard":
				result = "SFBool";
				break;
			case "isStandAlone":
				result = "SFBool";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "multicastRelayHost":
				result = "SFString";
				break;
			case "multicastRelayPort":
				result = "SFInt32";
				break;
			case "networkMode":
				result = "SFString";
				break;
			case "port":
				result = "SFInt32";
				break;
			case "radioID":
				result = "SFInt32";
				break;
			case "readInterval":
				result = "SFTime";
				break;
			case "receivedPower":
				result = "SFFloat";
				break;
			case "receiverState":
				result = "SFInt32";
				break;
			case "rtpHeaderExpected":
				result = "SFBool";
				break;
			case "siteID":
				result = "SFInt32";
				break;
			case "timestamp":
				result = "SFTime";
				break;
			case "transmitterApplicationID":
				result = "SFInt32";
				break;
			case "transmitterEntityID":
				result = "SFInt32";
				break;
			case "transmitterRadioID":
				result = "SFInt32";
				break;
			case "transmitterSiteID":
				result = "SFInt32";
				break;
			case "visible":
				result = "SFBool";
				break;
			case "whichGeometry":
				result = "SFInt32";
				break;
			case "writeInterval":
				result = "SFTime";
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
			case "address":
				result = "inputOutput";
				break;
			case "applicationID":
				result = "inputOutput";
				break;
			case "bboxCenter":
				result = "initializeOnly";
				break;
			case "bboxSize":
				result = "initializeOnly";
				break;
			case "enabled":
				result = "inputOutput";
				break;
			case "entityID":
				result = "inputOutput";
				break;
			case "geoCoords":
				result = "inputOutput";
				break;
			case "geoSystem":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "isActive":
				result = "outputOnly";
				break;
			case "isNetworkReader":
				result = "outputOnly";
				break;
			case "isNetworkWriter":
				result = "outputOnly";
				break;
			case "isRtpHeaderHeard":
				result = "outputOnly";
				break;
			case "isStandAlone":
				result = "outputOnly";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "multicastRelayHost":
				result = "inputOutput";
				break;
			case "multicastRelayPort":
				result = "inputOutput";
				break;
			case "networkMode":
				result = "inputOutput";
				break;
			case "port":
				result = "inputOutput";
				break;
			case "radioID":
				result = "inputOutput";
				break;
			case "readInterval":
				result = "inputOutput";
				break;
			case "receivedPower":
				result = "inputOutput";
				break;
			case "receiverState":
				result = "inputOutput";
				break;
			case "rtpHeaderExpected":
				result = "initializeOnly";
				break;
			case "siteID":
				result = "inputOutput";
				break;
			case "timestamp":
				result = "outputOnly";
				break;
			case "transmitterApplicationID":
				result = "inputOutput";
				break;
			case "transmitterEntityID":
				result = "inputOutput";
				break;
			case "transmitterRadioID":
				result = "inputOutput";
				break;
			case "transmitterSiteID":
				result = "inputOutput";
				break;
			case "visible":
				result = "inputOutput";
				break;
			case "whichGeometry":
				result = "inputOutput";
				break;
			case "writeInterval":
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
	public static final String containerField_DEFAULT_VALUE = "children"; // type xs:NMTOKEN
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

	/** fromField ROUTE name for SFString field named <i>address</i>. */
	public static final String fromField_ADDRESS = "address";

	/** toField ROUTE name for SFString field named <i>address</i>. */
	public static final String toField_ADDRESS = "address";

	/** fromField ROUTE name for SFInt32 field named <i>applicationID</i>. */
	public static final String fromField_APPLICATIONID = "applicationID";

	/** toField ROUTE name for SFInt32 field named <i>applicationID</i>. */
	public static final String toField_APPLICATIONID = "applicationID";

	/** fromField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String fromField_ENABLED = "enabled";

	/** toField ROUTE name for SFBool field named <i>enabled</i>. */
	public static final String toField_ENABLED = "enabled";

	/** fromField ROUTE name for SFInt32 field named <i>entityID</i>. */
	public static final String fromField_ENTITYID = "entityID";

	/** toField ROUTE name for SFInt32 field named <i>entityID</i>. */
	public static final String toField_ENTITYID = "entityID";

	/** fromField ROUTE name for SFVec3d field named <i>geoCoords</i>. */
	public static final String fromField_GEOCOORDS = "geoCoords";

	/** toField ROUTE name for SFVec3d field named <i>geoCoords</i>. */
	public static final String toField_GEOCOORDS = "geoCoords";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFBool field named <i>isActive</i>. */
	public static final String fromField_ISACTIVE = "isActive";

	/** fromField ROUTE name for SFBool field named <i>isNetworkReader</i>. */
	public static final String fromField_ISNETWORKREADER = "isNetworkReader";

	/** fromField ROUTE name for SFBool field named <i>isNetworkWriter</i>. */
	public static final String fromField_ISNETWORKWRITER = "isNetworkWriter";

	/** fromField ROUTE name for SFBool field named <i>isRtpHeaderHeard</i>. */
	public static final String fromField_ISRTPHEADERHEARD = "isRtpHeaderHeard";

	/** fromField ROUTE name for SFBool field named <i>isStandAlone</i>. */
	public static final String fromField_ISSTANDALONE = "isStandAlone";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFString field named <i>multicastRelayHost</i>. */
	public static final String fromField_MULTICASTRELAYHOST = "multicastRelayHost";

	/** toField ROUTE name for SFString field named <i>multicastRelayHost</i>. */
	public static final String toField_MULTICASTRELAYHOST = "multicastRelayHost";

	/** fromField ROUTE name for SFInt32 field named <i>multicastRelayPort</i>. */
	public static final String fromField_MULTICASTRELAYPORT = "multicastRelayPort";

	/** toField ROUTE name for SFInt32 field named <i>multicastRelayPort</i>. */
	public static final String toField_MULTICASTRELAYPORT = "multicastRelayPort";

	/** fromField ROUTE name for SFString field named <i>networkMode</i>. */
	public static final String fromField_NETWORKMODE = "networkMode";

	/** toField ROUTE name for SFString field named <i>networkMode</i>. */
	public static final String toField_NETWORKMODE = "networkMode";

	/** fromField ROUTE name for SFInt32 field named <i>port</i>. */
	public static final String fromField_PORT = "port";

	/** toField ROUTE name for SFInt32 field named <i>port</i>. */
	public static final String toField_PORT = "port";

	/** fromField ROUTE name for SFInt32 field named <i>radioID</i>. */
	public static final String fromField_RADIOID = "radioID";

	/** toField ROUTE name for SFInt32 field named <i>radioID</i>. */
	public static final String toField_RADIOID = "radioID";

	/** fromField ROUTE name for SFTime field named <i>readInterval</i>. */
	public static final String fromField_READINTERVAL = "readInterval";

	/** toField ROUTE name for SFTime field named <i>readInterval</i>. */
	public static final String toField_READINTERVAL = "readInterval";

	/** fromField ROUTE name for SFFloat field named <i>receivedPower</i>. */
	public static final String fromField_RECEIVEDPOWER = "receivedPower";

	/** toField ROUTE name for SFFloat field named <i>receivedPower</i>. */
	public static final String toField_RECEIVEDPOWER = "receivedPower";

	/** fromField ROUTE name for SFInt32 field named <i>receiverState</i>. */
	public static final String fromField_RECEIVERSTATE = "receiverState";

	/** toField ROUTE name for SFInt32 field named <i>receiverState</i>. */
	public static final String toField_RECEIVERSTATE = "receiverState";

	/** fromField ROUTE name for SFInt32 field named <i>siteID</i>. */
	public static final String fromField_SITEID = "siteID";

	/** toField ROUTE name for SFInt32 field named <i>siteID</i>. */
	public static final String toField_SITEID = "siteID";

	/** fromField ROUTE name for SFTime field named <i>timestamp</i>. */
	public static final String fromField_TIMESTAMP = "timestamp";

	/** fromField ROUTE name for SFInt32 field named <i>transmitterApplicationID</i>. */
	public static final String fromField_TRANSMITTERAPPLICATIONID = "transmitterApplicationID";

	/** toField ROUTE name for SFInt32 field named <i>transmitterApplicationID</i>. */
	public static final String toField_TRANSMITTERAPPLICATIONID = "transmitterApplicationID";

	/** fromField ROUTE name for SFInt32 field named <i>transmitterEntityID</i>. */
	public static final String fromField_TRANSMITTERENTITYID = "transmitterEntityID";

	/** toField ROUTE name for SFInt32 field named <i>transmitterEntityID</i>. */
	public static final String toField_TRANSMITTERENTITYID = "transmitterEntityID";

	/** fromField ROUTE name for SFInt32 field named <i>transmitterRadioID</i>. */
	public static final String fromField_TRANSMITTERRADIOID = "transmitterRadioID";

	/** toField ROUTE name for SFInt32 field named <i>transmitterRadioID</i>. */
	public static final String toField_TRANSMITTERRADIOID = "transmitterRadioID";

	/** fromField ROUTE name for SFInt32 field named <i>transmitterSiteID</i>. */
	public static final String fromField_TRANSMITTERSITEID = "transmitterSiteID";

	/** toField ROUTE name for SFInt32 field named <i>transmitterSiteID</i>. */
	public static final String toField_TRANSMITTERSITEID = "transmitterSiteID";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** fromField ROUTE name for SFInt32 field named <i>whichGeometry</i>. */
	public static final String fromField_WHICHGEOMETRY = "whichGeometry";

	/** toField ROUTE name for SFInt32 field named <i>whichGeometry</i>. */
	public static final String toField_WHICHGEOMETRY = "whichGeometry";

	/** fromField ROUTE name for SFTime field named <i>writeInterval</i>. */
	public static final String fromField_WRITEINTERVAL = "writeInterval";

	/** toField ROUTE name for SFTime field named <i>writeInterval</i>. */
	public static final String toField_WRITEINTERVAL = "writeInterval";

	/** Constructor for ReceiverPduObject to initialize member variables with default values. */
	public ReceiverPduObject()
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
		containerField_ALTERNATE_VALUES = new String[] { "children" }; // type xs:NMTOKEN

		address = ADDRESS_DEFAULT_VALUE;
		applicationID = APPLICATIONID_DEFAULT_VALUE;
		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		enabled = ENABLED_DEFAULT_VALUE;
		entityID = ENTITYID_DEFAULT_VALUE;
		geoCoords = GEOCOORDS_DEFAULT_VALUE;
		geoSystem = new ArrayList<>(GEOSYSTEM_DEFAULT_VALUE);
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		multicastRelayHost = MULTICASTRELAYHOST_DEFAULT_VALUE;
		multicastRelayPort = MULTICASTRELAYPORT_DEFAULT_VALUE;
		networkMode = NETWORKMODE_DEFAULT_VALUE;
		port = PORT_DEFAULT_VALUE;
		radioID = RADIOID_DEFAULT_VALUE;
		readInterval = READINTERVAL_DEFAULT_VALUE;
		receivedPower = RECEIVEDPOWER_DEFAULT_VALUE;
		receiverState = RECEIVERSTATE_DEFAULT_VALUE;
		rtpHeaderExpected = RTPHEADEREXPECTED_DEFAULT_VALUE;
		siteID = SITEID_DEFAULT_VALUE;
		transmitterApplicationID = TRANSMITTERAPPLICATIONID_DEFAULT_VALUE;
		transmitterEntityID = TRANSMITTERENTITYID_DEFAULT_VALUE;
		transmitterRadioID = TRANSMITTERRADIOID_DEFAULT_VALUE;
		transmitterSiteID = TRANSMITTERSITEID_DEFAULT_VALUE;
		visible = VISIBLE_DEFAULT_VALUE;
		whichGeometry = WHICHGEOMETRY_DEFAULT_VALUE;
		writeInterval = WRITEINTERVAL_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String value from inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" Example: 224.2.181.145.  * <br>

	 * @return value of address field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getAddress()
	{
		return address;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>address</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network address, or else "localhost" Example: 224.2.181.145.  * <br>

	 * @param newValue is new value for the address field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setAddress(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		address = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString address field, similar to {@link #setAddress(String)}.
	 * @param newValue is new value for the address field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setAddress(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setAddress(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of applicationID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getApplicationID()
	{
		return applicationID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>applicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the applicationID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setApplicationID(int newValue)
	{
		// set-newValue-validity-checks #0
		applicationID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 applicationID field, similar to {@link #setApplicationID(int)}.
	 * @param newValue is new value for the applicationID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setApplicationID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setApplicationID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of 3-tuple float results from initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box center accompanies bboxSize and provides an optional hint for bounding box position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @return value of bboxCenter field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getBboxCenter()
	{
		return bboxCenter;
	}

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box center accompanies bboxSize and provides an optional hint for bounding box position offset from origin of local coordinate system.
 * <ul>
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxCenter(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBboxCenter(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxCenter(double[] newArray)
	{
		return setBboxCenter(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple float results within allowed range of [0,infinity), or default value [-1 -1 -1], from initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box size is usually omitted, and can easily be calculated automatically by an X3D player at scene-loading time with minimal computational cost. Bounding box size can also be defined as an optional authoring hint that suggests an optimization or constraint.
 * <ul>
 *  <li> <i>Hint:</i> can be useful for collision computations or inverse-kinematics (IK) engines. </li> 
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @return value of bboxSize field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getBboxSize()
	{
		return bboxSize;
	}

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Bounding box size is usually omitted, and can easily be calculated automatically by an X3D player at scene-loading time with minimal computational cost. Bounding box size can also be defined as an optional authoring hint that suggests an optimization or constraint.
 * <ul>
 *  <li> <i>Hint:</i> can be useful for collision computations or inverse-kinematics (IK) engines. </li> 
 *  <li> <i>Hint:</i> precomputation and inclusion of bounding box information can speed up the initialization of large detailed models, with a corresponding cost of increased file size. </li> 
 *  <li> <i>Hint:</i> X3D Architecture, 10.2.2 Bounding boxes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#BoundingBoxes</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture, 10.3.1 X3DBoundedObject <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#X3DBoundedObject</a> </li> 
 * </ul>
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxSize(SFVec3fObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setBboxSize(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.

	 * @param x first component
	 * @param y second component
	 * @param z third component

	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables the sensor node.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getEnabled()
	{
		return enabled;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables the sensor node.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setEnabled(boolean newValue)
	{
		// set-newValue-validity-checks #0
		enabled = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool enabled field, similar to {@link #setEnabled(boolean)}.
	 * @param newValue is new value for the enabled field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setEnabled(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEnabled(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>entityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  EntityID unique ID for entity within that application.  * <br>

	 * @return value of entityID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getEntityID()
	{
		return entityID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>entityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  EntityID unique ID for entity within that application.  * <br>

	 * @param newValue is new value for the entityID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setEntityID(int newValue)
	{
		// set-newValue-validity-checks #0
		entityID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 entityID field, similar to {@link #setEntityID(int)}.
	 * @param newValue is new value for the entityID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setEntityID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setEntityID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of 3-tuple double results from inputOutput SFVec3d field named <i>geoCoords</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geographic location (specified in current geoSystem coordinates) for children geometry (specified in relative coordinate system, in meters).
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @return value of geoCoords field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public double[] getGeoCoords()
	{
		return geoCoords;
	}

	/**
	 * Accessor method to assign 3-tuple double array to inputOutput SFVec3d field named <i>geoCoords</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geographic location (specified in current geoSystem coordinates) for children geometry (specified in relative coordinate system, in meters).
 * <ul>
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 * </ul>
	 * @param newValue is new value for the geoCoords field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setGeoCoords(double[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new double[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu geoCoords newValue=" + SFVec3dObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		geoCoords = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3d geoCoords field, similar to {@link #setGeoCoords(double[])}.
	 * @param newValue is new value for the geoCoords field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setGeoCoords(SFVec3dObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGeoCoords(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3d geoCoords field, similar to {@link #setGeoCoords(double[])}.
	 * @param x first component
	 * @param y second component

	 * @param z third component

	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setGeoCoords(double x, double y, double z)
	{
		setGeoCoords(new double[] {x, y, z});
		return this;
	}
	/**
	 * Provide array of String results from initializeOnly MFString field named <i>geoSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Identifies spatial reference frame: Geodetic (GD), Geocentric (GC), Universal Transverse Mercator (UTM). Supported values: "GD" "UTM" or "GC" followed by additional quoted string parameters as appropriate for the type.
 * <ul>
 *  <li> <i>Hint:</i> X3D Architecture 25.2.2 Spatial reference frames <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 25.2.4 Specifying geospatial coordinates <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords</a> </li> 
 *  <li> <i>Hint:</i> UTM is Universal Transverse Mercator coordinate system <a href="https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system" target="_blank">https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system</a> </li> 
 *  <li> <i>Warning:</i>  deprecated values are GDC (replaced by GD) and GCC (replaced by GC). </li> 
 * </ul>
	 * @return value of geoSystem field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getGeoSystem()
	{
		final String[] valuesArray = new String[geoSystem.size()];
		int i = 0;
		for (String arrayElement : geoSystem) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString geoSystem field, similar to {@link #getGeoSystem()}.
	 * @return value of geoSystem field
	 */
	public ArrayList<String> getGeoSystemList()
	{
		return geoSystem;
	}
	/**
	 * Utility method to get String value of MFString geoSystem field, similar to {@link #getGeoSystem()}.
	 * @return value of geoSystem field
	 */
	public String getGeoSystemString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : geoSystem) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>geoSystem</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Identifies spatial reference frame: Geodetic (GD), Geocentric (GC), Universal Transverse Mercator (UTM). Supported values: "GD" "UTM" or "GC" followed by additional quoted string parameters as appropriate for the type.
 * <ul>
 *  <li> <i>Hint:</i> X3D Architecture 25.2.2 Spatial reference frames <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Spatialreferenceframes</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 25.2.4 Specifying geospatial coordinates <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#Specifyinggeospatialcoords</a> </li> 
 *  <li> <i>Hint:</i> UTM is Universal Transverse Mercator coordinate system <a href="https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system" target="_blank">https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system</a> </li> 
 *  <li> <i>Warning:</i>  deprecated values are GDC (replaced by GD) and GCC (replaced by GC). </li> 
 * </ul>
	 * @param newValue is new value for the geoSystem field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setGeoSystem(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearGeoSystem(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearGeoSystem(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			geoSystem.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString geoSystem field, similar to {@link #setGeoSystem(String[])}.
	 * @param newValue is new value for the geoSystem field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setGeoSystem(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearGeoSystem(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setGeoSystem(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString geoSystem field, similar to {@link #setGeoSystem(String[])}.
	 * @param newValue is new value for the geoSystem field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setGeoSystem(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearGeoSystem(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setGeoSystem(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString geoSystem field, similar to {@link #setGeoSystem(String[])}.
	 * @param newValue is new value for the geoSystem field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setGeoSystem(String newValue)
	{
		if (newValue == null)		{
			clearGeoSystem(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearGeoSystem(); // reset
		geoSystem.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString geoSystem field, similar to {@link #setGeoSystem(String[])}.
	 * @param newValue is new value for the geoSystem field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setGeoSystem(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearGeoSystem(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearGeoSystem(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setGeoSystem(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of geoSystem field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public ReceiverPduObject clearGeoSystem()
	{
		geoSystem.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString geoSystem field.
	 * @param newValue is new value to add to the geoSystem field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject addGeoSystem(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !geoSystem.contains(newValue))
            geoSystem.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString geoSystem field.
	 * @param newValue is new value to add to the geoSystem field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject addGeoSystem(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !geoSystem.contains(newValue.getValue()))
            geoSystem.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setIS(ISObject newValue)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ReceiverPduObject clearIS()
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
	 * Provide boolean value from outputOnly SFBool field named <i>isActive</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Have we had a network update recently?.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isActive field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getIsActive()
	{
		return isActive;
	}
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isNetworkReader</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="remote" (listen to network as copy of remote entity)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isNetworkReader field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getIsNetworkReader()
	{
		return isNetworkReader;
	}
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isNetworkWriter</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="master" (output to network as master entity at writeInterval)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isNetworkWriter field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getIsNetworkWriter()
	{
		return isNetworkWriter;
	}
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isRtpHeaderHeard</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether incoming DIS packets have an RTP header prepended.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isRtpHeaderHeard field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getIsRtpHeaderHeard()
	{
		return isRtpHeaderHeard;
	}
	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isStandAlone</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether networkMode="local" (ignore network but still respond to local events)
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isStandAlone field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getIsStandAlone()
	{
		return isStandAlone;
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public ReceiverPduObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide String value from inputOutput SFString field named <i>multicastRelayHost</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server address if multicast not available locally. For example: track.nps.edu.  * <br>

	 * @return value of multicastRelayHost field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getMulticastRelayHost()
	{
		return multicastRelayHost;
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>multicastRelayHost</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server address if multicast not available locally. For example: track.nps.edu.  * <br>

	 * @param newValue is new value for the multicastRelayHost field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setMulticastRelayHost(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		multicastRelayHost = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString multicastRelayHost field, similar to {@link #setMulticastRelayHost(String)}.
	 * @param newValue is new value for the multicastRelayHost field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setMulticastRelayHost(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMulticastRelayHost(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>multicastRelayPort</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server port if multicast not available locally. For example: 8010.  * <br>

	 * @return value of multicastRelayPort field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getMulticastRelayPort()
	{
		return multicastRelayPort;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>multicastRelayPort</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Fallback server port if multicast not available locally. For example: 8010.  * <br>

	 * @param newValue is new value for the multicastRelayPort field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setMulticastRelayPort(int newValue)
	{
		// set-newValue-validity-checks #0
		multicastRelayPort = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 multicastRelayPort field, similar to {@link #setMulticastRelayPort(int)}.
	 * @param newValue is new value for the multicastRelayPort field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setMulticastRelayPort(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setMulticastRelayPort(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType networkModeChoices) ["standAlone" | "networkReader" | "networkWriter"] from inputOutput SFString field named <i>networkMode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether this entity is ignoring the network, sending DIS packets to the network, or receiving DIS packets from the network. (1) standAlone: ignore network but still respond to events in local scene. (2) networkReader: listen to network and read PDU packets at readInterval, act as remotely linked copy of entity. (3) networkWriter: send PDU packets to network at writeInterval, act as master entity. Default value "standAlone" ensures that DIS network activation within a scene as networkReader or networkWriter is intentional.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Warning:</i>  network activity may have associated security issues. </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #NETWORKMODE_STANDALONE STANDALONE}, {@link #NETWORKMODE_NETWORKREADER NETWORKREADER}, {@link #NETWORKMODE_NETWORKWRITER NETWORKWRITER}.
	 * @return value of networkMode field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String getNetworkMode()
	{
		return networkMode;
	}

	/**
	 * Accessor method to assign String enumeration value ("standAlone" | "networkReader" | "networkWriter") to inputOutput SFString field named <i>networkMode</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #NETWORKMODE_STANDALONE STANDALONE}, {@link #NETWORKMODE_NETWORKREADER NETWORKREADER}, {@link #NETWORKMODE_NETWORKWRITER NETWORKWRITER}).
	 * <br><br>
	 * <i>Tooltip:</i> Whether this entity is ignoring the network, sending DIS packets to the network, or receiving DIS packets from the network. (1) standAlone: ignore network but still respond to events in local scene. (2) networkReader: listen to network and read PDU packets at readInterval, act as remotely linked copy of entity. (3) networkWriter: send PDU packets to network at writeInterval, act as master entity. Default value "standAlone" ensures that DIS network activation within a scene as networkReader or networkWriter is intentional.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Warning:</i>  network activity may have associated security issues. </li> 
 * </ul>
	 * @param newValue is new value for the networkMode field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setNetworkMode(String newValue)
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
			newValue.equals(NETWORKMODE_STANDALONE) ||
			newValue.equals(NETWORKMODE_NETWORKREADER) ||
			newValue.equals(NETWORKMODE_NETWORKWRITER)))
		{
			String warningMessage = "Warning: ReceiverPdu networkMode newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		networkMode = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString networkMode field, similar to {@link #setNetworkMode(String)}.
	 * @param newValue is new value for the networkMode field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setNetworkMode(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setNetworkMode(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network port, for example: 3000.  * <br>

	 * @return value of port field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getPort()
	{
		return port;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>port</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Multicast network port, for example: 3000.  * <br>

	 * @param newValue is new value for the port field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setPort(int newValue)
	{
		// set-newValue-validity-checks #0
		port = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 port field, similar to {@link #setPort(int)}.
	 * @param newValue is new value for the port field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setPort(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setPort(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>radioID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Identifies a particular radio within a given entity.  * <br>

	 * @return value of radioID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getRadioID()
	{
		return radioID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>radioID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Identifies a particular radio within a given entity.  * <br>

	 * @param newValue is new value for the radioID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setRadioID(int newValue)
	{
		// set-newValue-validity-checks #0
		radioID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 radioID field, similar to {@link #setRadioID(int)}.
	 * @param newValue is new value for the radioID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setRadioID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setRadioID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>readInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between read updates, 0 means no reading.
 * <ul>
 *  <li> <i> Hint:</i>  readInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of readInterval field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public double getReadInterval()
	{
		return readInterval;
	}

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>readInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between read updates, 0 means no reading.
 * <ul>
 *  <li> <i> Hint:</i>  readInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the readInterval field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setReadInterval(double newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu readInterval newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		readInterval = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFTime readInterval field, similar to {@link #setReadInterval(double)}.
	 * @param newValue is new value for the readInterval field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setReadInterval(SFTimeObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setReadInterval(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide float value from inputOutput SFFloat field named <i>receivedPower</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  receivedPower indicates radio frequency (RF) power received, in units of decibel-milliwatts (dBm), after applying any propagation loss and antenna gain.  * <br>

	 * @return value of receivedPower field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float getReceivedPower()
	{
		return receivedPower;
	}

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>receivedPower</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  receivedPower indicates radio frequency (RF) power received, in units of decibel-milliwatts (dBm), after applying any propagation loss and antenna gain.  * <br>

	 * @param newValue is new value for the receivedPower field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setReceivedPower(float newValue)
	{
		// set-newValue-validity-checks #0
		receivedPower = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat receivedPower field, similar to {@link #setReceivedPower(float)}.
	 * @param newValue is new value for the receivedPower field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setReceivedPower(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setReceivedPower(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setReceivedPower(float)}.
	 * @param newValue is new value for field
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setReceivedPower(double newValue)
	{
		return setReceivedPower((float) newValue);
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>receiverState</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  receiverState indicates if receiver is currently idle or busy via one of these enumerated values: 0 = off, 1 = on but not receiving, or 2 = on and receiving.  * <br>

	 * @return value of receiverState field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getReceiverState()
	{
		return receiverState;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>receiverState</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  receiverState indicates if receiver is currently idle or busy via one of these enumerated values: 0 = off, 1 = on but not receiving, or 2 = on and receiving.  * <br>

	 * @param newValue is new value for the receiverState field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setReceiverState(int newValue)
	{
		// set-newValue-validity-checks #0
		receiverState = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 receiverState field, similar to {@link #setReceiverState(int)}.
	 * @param newValue is new value for the receiverState field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setReceiverState(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setReceiverState(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>rtpHeaderExpected</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether RTP headers are prepended to DIS PDUs.  * <br>

	 * @return value of rtpHeaderExpected field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getRtpHeaderExpected()
	{
		return rtpHeaderExpected;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>rtpHeaderExpected</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether RTP headers are prepended to DIS PDUs.  * <br>

	 * @param newValue is new value for the rtpHeaderExpected field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setRtpHeaderExpected(boolean newValue)
	{
		// set-newValue-validity-checks #0
		rtpHeaderExpected = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool rtpHeaderExpected field, similar to {@link #setRtpHeaderExpected(boolean)}.
	 * @param newValue is new value for the rtpHeaderExpected field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setRtpHeaderExpected(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setRtpHeaderExpected(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @return value of siteID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getSiteID()
	{
		return siteID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>siteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise siteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the siteID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setSiteID(int newValue)
	{
		// set-newValue-validity-checks #0
		siteID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 siteID field, similar to {@link #setSiteID(int)}.
	 * @param newValue is new value for the siteID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setSiteID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSiteID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>timestamp</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DIS timestamp in X3D units (value 0.0 matches 1 January 1970) in seconds.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of timestamp field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public double getTimestamp()
	{
		return timestamp;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>transmitterApplicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise transmitterApplicationID is unique for transmitter application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @return value of transmitterApplicationID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getTransmitterApplicationID()
	{
		return transmitterApplicationID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>transmitterApplicationID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise transmitterApplicationID is unique for transmitter application at that site. Each simulation application that can respond to simulation management PDUs needs to have a unique applicationID.  * <br>

	 * @param newValue is new value for the transmitterApplicationID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setTransmitterApplicationID(int newValue)
	{
		// set-newValue-validity-checks #0
		transmitterApplicationID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 transmitterApplicationID field, similar to {@link #setTransmitterApplicationID(int)}.
	 * @param newValue is new value for the transmitterApplicationID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setTransmitterApplicationID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTransmitterApplicationID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>transmitterEntityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise transmitterEntityID is a unique ID for a single entity within that application.  * <br>

	 * @return value of transmitterEntityID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getTransmitterEntityID()
	{
		return transmitterEntityID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>transmitterEntityID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise transmitterEntityID is a unique ID for a single entity within that application.  * <br>

	 * @param newValue is new value for the transmitterEntityID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setTransmitterEntityID(int newValue)
	{
		// set-newValue-validity-checks #0
		transmitterEntityID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 transmitterEntityID field, similar to {@link #setTransmitterEntityID(int)}.
	 * @param newValue is new value for the transmitterEntityID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setTransmitterEntityID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTransmitterEntityID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>transmitterRadioID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Identifies a particular radio within a given entity.  * <br>

	 * @return value of transmitterRadioID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getTransmitterRadioID()
	{
		return transmitterRadioID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>transmitterRadioID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Identifies a particular radio within a given entity.  * <br>

	 * @param newValue is new value for the transmitterRadioID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setTransmitterRadioID(int newValue)
	{
		// set-newValue-validity-checks #0
		transmitterRadioID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 transmitterRadioID field, similar to {@link #setTransmitterRadioID(int)}.
	 * @param newValue is new value for the transmitterRadioID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setTransmitterRadioID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTransmitterRadioID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>transmitterSiteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise transmitterSiteID of the participating LAN or organization.  * <br>

	 * @return value of transmitterSiteID field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getTransmitterSiteID()
	{
		return transmitterSiteID;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>transmitterSiteID</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Simulation/exercise transmitterSiteID of the participating LAN or organization.  * <br>

	 * @param newValue is new value for the transmitterSiteID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setTransmitterSiteID(int newValue)
	{
		// set-newValue-validity-checks #0
		transmitterSiteID = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 transmitterSiteID field, similar to {@link #setTransmitterSiteID(int)}.
	 * @param newValue is new value for the transmitterSiteID field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setTransmitterSiteID(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setTransmitterSiteID(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible()
	{
		return visible;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setVisible(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVisible(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>whichGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Select geometry to render: -1 for no geometry, 0 for text trace, 1 for default geometry, (optional) higher values to render different states.  * <br>

	 * @return value of whichGeometry field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getWhichGeometry()
	{
		return whichGeometry;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>whichGeometry</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Select geometry to render: -1 for no geometry, 0 for text trace, 1 for default geometry, (optional) higher values to render different states.  * <br>

	 * @param newValue is new value for the whichGeometry field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setWhichGeometry(int newValue)
	{
		// set-newValue-validity-checks #0
		whichGeometry = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 whichGeometry field, similar to {@link #setWhichGeometry(int)}.
	 * @param newValue is new value for the whichGeometry field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setWhichGeometry(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setWhichGeometry(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from inputOutput SFTime field named <i>writeInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between write updates, 0 means no writing (sending).
 * <ul>
 *  <li> <i> Hint:</i>  writeInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of writeInterval field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public double getWriteInterval()
	{
		return writeInterval;
	}

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>writeInterval</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Seconds between write updates, 0 means no writing (sending).
 * <ul>
 *  <li> <i> Hint:</i>  writeInterval is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @param newValue is new value for the writeInterval field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ReceiverPduObject setWriteInterval(double newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu writeInterval newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		writeInterval = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFTime writeInterval field, similar to {@link #setWriteInterval(double)}.
	 * @param newValue is new value for the writeInterval field.
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setWriteInterval(SFTimeObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setWriteInterval(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ReceiverPduObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ReceiverPdu DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu DEF newValue='" + newValue + "'" + 
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ReceiverPduObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to ReceiverPdu USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("ReceiverPdu USE newValue='" + newValue + "'" + 
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNetworkSensorNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final ReceiverPduObject setCssClass(String newValue)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setCssClass(SFStringObject newValue)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ReceiverPduObject setUSE(ReceiverPduObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on ReceiverPduObject" +
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
	public ReceiverPduObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public ReceiverPduObject addComments (String newComment)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ReceiverPduObject addComments (String[] newComments)
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
	 * @return {@link ReceiverPduObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public ReceiverPduObject addComments (CommentsBlock newCommentsBlock)
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

		stringX3D.append(indent).append("<ReceiverPdu"); // start opening tag
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

			if ((!getAddress().equals(ADDRESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" address='").append(new SFStringObject(getAddress()).toStringX3D()).append("'");
			}
			if (((getApplicationID() != APPLICATIONID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" applicationID='").append(SFInt32Object.toString(getApplicationID())).append("'");
			}
			if ((!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxCenter='").append(SFVec3fObject.toString(getBboxCenter())).append("'");
			}
			if ((!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxSize='").append(SFVec3fObject.toString(getBboxSize())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" enabled='").append(SFBoolObject.toString(getEnabled())).append("'");
			}
			if (((getEntityID() != ENTITYID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" entityID='").append(SFInt32Object.toString(getEntityID())).append("'");
			}
			if ((!Arrays.equals(getGeoCoords(), GEOCOORDS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" geoCoords='").append(SFVec3dObject.toString(getGeoCoords())).append("'");
			}
			if (((getGeoSystem().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" geoSystem='").append(new MFStringObject(getGeoSystem()).toStringX3D()).append("'");
			}
			if ((!getMulticastRelayHost().equals(MULTICASTRELAYHOST_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" multicastRelayHost='").append(new SFStringObject(getMulticastRelayHost()).toStringX3D()).append("'");
			}
			if (((getMulticastRelayPort() != MULTICASTRELAYPORT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" multicastRelayPort='").append(SFInt32Object.toString(getMulticastRelayPort())).append("'");
			}
			if ((!getNetworkMode().equals(NETWORKMODE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" networkMode='").append(new SFStringObject(getNetworkMode()).toStringX3D()).append("'");
			}
			if (((getPort() != PORT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" port='").append(SFInt32Object.toString(getPort())).append("'");
			}
			if (((getRadioID() != RADIOID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" radioID='").append(SFInt32Object.toString(getRadioID())).append("'");
			}
			if (((getReadInterval() != READINTERVAL_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" readInterval='").append(SFTimeObject.toString(getReadInterval())).append("'");
			}
			if (((getReceivedPower() != RECEIVEDPOWER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" receivedPower='").append(SFFloatObject.toString(getReceivedPower())).append("'");
			}
			if (((getReceiverState() != RECEIVERSTATE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" receiverState='").append(SFInt32Object.toString(getReceiverState())).append("'");
			}
			if (((getRtpHeaderExpected() != RTPHEADEREXPECTED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" rtpHeaderExpected='").append(SFBoolObject.toString(getRtpHeaderExpected())).append("'");
			}
			if (((getSiteID() != SITEID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" siteID='").append(SFInt32Object.toString(getSiteID())).append("'");
			}
			if (((getTransmitterApplicationID() != TRANSMITTERAPPLICATIONID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" transmitterApplicationID='").append(SFInt32Object.toString(getTransmitterApplicationID())).append("'");
			}
			if (((getTransmitterEntityID() != TRANSMITTERENTITYID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" transmitterEntityID='").append(SFInt32Object.toString(getTransmitterEntityID())).append("'");
			}
			if (((getTransmitterRadioID() != TRANSMITTERRADIOID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" transmitterRadioID='").append(SFInt32Object.toString(getTransmitterRadioID())).append("'");
			}
			if (((getTransmitterSiteID() != TRANSMITTERSITEID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" transmitterSiteID='").append(SFInt32Object.toString(getTransmitterSiteID())).append("'");
			}
			if (((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" visible='").append(SFBoolObject.toString(getVisible())).append("'");
			}
			if (((getWhichGeometry() != WHICHGEOMETRY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" whichGeometry='").append(SFInt32Object.toString(getWhichGeometry())).append("'");
			}
			if (((getWriteInterval() != WRITEINTERVAL_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" writeInterval='").append(SFTimeObject.toString(getWriteInterval())).append("'");
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
			stringX3D.append(indent).append("</ReceiverPdu>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=ReceiverPdu, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
			stringClassicVRML.append("ReceiverPdu").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("address"))
						{
							stringClassicVRML.append(indentCharacter).append("address").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getAddress().equals(ADDRESS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("address ").append("\"").append(SFStringObject.toString(getAddress())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("applicationID"))
						{
							stringClassicVRML.append(indentCharacter).append("applicationID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getApplicationID() != APPLICATIONID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("applicationID ").append(SFInt32Object.toString(getApplicationID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("bboxCenter"))
						{
							stringClassicVRML.append(indentCharacter).append("bboxCenter").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bboxCenter ").append(SFVec3fObject.toString(getBboxCenter())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("bboxSize"))
						{
							stringClassicVRML.append(indentCharacter).append("bboxSize").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("bboxSize ").append(SFVec3fObject.toString(getBboxSize())).append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("enabled"))
						{
							stringClassicVRML.append(indentCharacter).append("enabled").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getEnabled() != ENABLED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("enabled ").append(SFBoolObject.toString(getEnabled())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("entityID"))
						{
							stringClassicVRML.append(indentCharacter).append("entityID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getEntityID() != ENTITYID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("entityID ").append(SFInt32Object.toString(getEntityID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("geoCoords"))
						{
							stringClassicVRML.append(indentCharacter).append("geoCoords").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getGeoCoords(), GEOCOORDS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("geoCoords ").append(SFVec3dObject.toString(getGeoCoords())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("geoSystem"))
						{
							stringClassicVRML.append(indentCharacter).append("geoSystem").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getGeoSystem().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("geoSystem ").append("[ ").append(MFStringObject.toString(getGeoSystem())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("multicastRelayHost"))
						{
							stringClassicVRML.append(indentCharacter).append("multicastRelayHost").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getMulticastRelayHost().equals(MULTICASTRELAYHOST_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("multicastRelayHost ").append("\"").append(SFStringObject.toString(getMulticastRelayHost())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("multicastRelayPort"))
						{
							stringClassicVRML.append(indentCharacter).append("multicastRelayPort").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getMulticastRelayPort() != MULTICASTRELAYPORT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("multicastRelayPort ").append(SFInt32Object.toString(getMulticastRelayPort())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("networkMode"))
						{
							stringClassicVRML.append(indentCharacter).append("networkMode").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getNetworkMode().equals(NETWORKMODE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("networkMode ").append("\"").append(SFStringObject.toString(getNetworkMode())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("port"))
						{
							stringClassicVRML.append(indentCharacter).append("port").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getPort() != PORT_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("port ").append(SFInt32Object.toString(getPort())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("radioID"))
						{
							stringClassicVRML.append(indentCharacter).append("radioID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getRadioID() != RADIOID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("radioID ").append(SFInt32Object.toString(getRadioID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("readInterval"))
						{
							stringClassicVRML.append(indentCharacter).append("readInterval").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getReadInterval() != READINTERVAL_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("readInterval ").append(SFTimeObject.toString(getReadInterval())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("receivedPower"))
						{
							stringClassicVRML.append(indentCharacter).append("receivedPower").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getReceivedPower() != RECEIVEDPOWER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("receivedPower ").append(SFFloatObject.toString(getReceivedPower())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("receiverState"))
						{
							stringClassicVRML.append(indentCharacter).append("receiverState").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getReceiverState() != RECEIVERSTATE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("receiverState ").append(SFInt32Object.toString(getReceiverState())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("rtpHeaderExpected"))
						{
							stringClassicVRML.append(indentCharacter).append("rtpHeaderExpected").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getRtpHeaderExpected() != RTPHEADEREXPECTED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("rtpHeaderExpected ").append(SFBoolObject.toString(getRtpHeaderExpected())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("siteID"))
						{
							stringClassicVRML.append(indentCharacter).append("siteID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSiteID() != SITEID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("siteID ").append(SFInt32Object.toString(getSiteID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("transmitterApplicationID"))
						{
							stringClassicVRML.append(indentCharacter).append("transmitterApplicationID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTransmitterApplicationID() != TRANSMITTERAPPLICATIONID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("transmitterApplicationID ").append(SFInt32Object.toString(getTransmitterApplicationID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("transmitterEntityID"))
						{
							stringClassicVRML.append(indentCharacter).append("transmitterEntityID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTransmitterEntityID() != TRANSMITTERENTITYID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("transmitterEntityID ").append(SFInt32Object.toString(getTransmitterEntityID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("transmitterRadioID"))
						{
							stringClassicVRML.append(indentCharacter).append("transmitterRadioID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTransmitterRadioID() != TRANSMITTERRADIOID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("transmitterRadioID ").append(SFInt32Object.toString(getTransmitterRadioID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("transmitterSiteID"))
						{
							stringClassicVRML.append(indentCharacter).append("transmitterSiteID").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getTransmitterSiteID() != TRANSMITTERSITEID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("transmitterSiteID ").append(SFInt32Object.toString(getTransmitterSiteID())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("visible"))
						{
							stringClassicVRML.append(indentCharacter).append("visible").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("visible ").append(SFBoolObject.toString(getVisible())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("whichGeometry"))
						{
							stringClassicVRML.append(indentCharacter).append("whichGeometry").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getWhichGeometry() != WHICHGEOMETRY_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("whichGeometry ").append(SFInt32Object.toString(getWhichGeometry())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("writeInterval"))
						{
							stringClassicVRML.append(indentCharacter).append("writeInterval").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getWriteInterval() != WRITEINTERVAL_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("writeInterval ").append(SFTimeObject.toString(getWriteInterval())).append("\n").append(indent).append(indentCharacter);
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

		setAddress(getAddress()); // exercise field checks, simple types
        
		setApplicationID(getApplicationID()); // exercise field checks, simple types
        
		setBboxCenter(getBboxCenter()); // exercise field checks, simple types
        
		setBboxSize(getBboxSize()); // exercise field checks, simple types
        
		setEnabled(getEnabled()); // exercise field checks, simple types
        
		setEntityID(getEntityID()); // exercise field checks, simple types
        
		setGeoCoords(getGeoCoords()); // exercise field checks, simple types
        
		setGeoSystem(getGeoSystem()); // exercise field checks, simple types
        
		setMulticastRelayHost(getMulticastRelayHost()); // exercise field checks, simple types
        
		setMulticastRelayPort(getMulticastRelayPort()); // exercise field checks, simple types
        
		setNetworkMode(getNetworkMode()); // exercise field checks, simple types
        
		setPort(getPort()); // exercise field checks, simple types
        
		setRadioID(getRadioID()); // exercise field checks, simple types
        
		setReadInterval(getReadInterval()); // exercise field checks, simple types
        
		setReceivedPower(getReceivedPower()); // exercise field checks, simple types
        
		setReceiverState(getReceiverState()); // exercise field checks, simple types
        
		setRtpHeaderExpected(getRtpHeaderExpected()); // exercise field checks, simple types
        
		setSiteID(getSiteID()); // exercise field checks, simple types
        
		setTransmitterApplicationID(getTransmitterApplicationID()); // exercise field checks, simple types
        
		setTransmitterEntityID(getTransmitterEntityID()); // exercise field checks, simple types
        
		setTransmitterRadioID(getTransmitterRadioID()); // exercise field checks, simple types
        
		setTransmitterSiteID(getTransmitterSiteID()); // exercise field checks, simple types
        
		setVisible(getVisible()); // exercise field checks, simple types
        
		setWhichGeometry(getWhichGeometry()); // exercise field checks, simple types
        
		setWriteInterval(getWriteInterval()); // exercise field checks, simple types
        
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
			String errorNotice = "ReceiverPdu USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ReceiverPdu USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "ReceiverPdu USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "ReceiverPdu USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'ReceiverPdu' node, add head statement <component name='DIS' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"DIS\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
