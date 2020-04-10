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

package org.web3d.x3d.jsail.Geospatial;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.Geospatial.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Geospatial.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Geospatial.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Geospatial.*;
import org.web3d.x3d.sai.Geospatial.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Geospatial.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.Geospatial.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import java.util.Arrays;

/**
 * Note that MFNode rootNode field can contain multiple nodes and has accessType inputOutput. Meanwhile MFNode children field is outputOnly, unlike other X3DGroupingNode exemplars.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DChildNode,X3DBoundedObject] GeoLOD provides quadtree level-of-detail loading/unloading for multi-resolution terrains. GeoLOD can contain children and GeoOrigin nodes.
 * <ul>
 *  <li> <i>Hint:</i> children nodes expose the scene graph for the currently loaded set of nodes. </li> 
 *  <li> <i>Hint:</i> rootNode specifies the geometry of the root tile. </li> 
 *  <li> <i>Warning:</i> do not use rootUrl and rootNode simultaneously, since each specifies the root tile. </li> 
 *  <li> <i>Hint:</i> X3D for Advanced Modeling (X3D4AM) slideset <a href="http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf" target="_blank">http://x3dgraphics.com/slidesets/X3dForAdvancedModeling/GeospatialComponentX3dEarth.pdf</a> </li> 
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Geospatial' level='1'/&amp;gt; </li> 
 *  <li> <i>Warning:</i>  nested LOD (and/or GeoLOD) nodes with overlapping range intervals can lead to unexpected or undefined behavior. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html#GeoLOD" target="blank">X3D Abstract Specification: GeoLOD</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#GeoLOD" target="_blank">X3D Tooltips: GeoLOD</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class GeoLODObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.Geospatial.GeoLOD
{
	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=bboxCenter, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxCenter, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxCenter; // SFVec3f

 /* @name=bboxSize, @type=SFVec3f, $javaType=float[], $javaReferenceType=float[], $javaPrimitiveType=float[], $normalizedMemberObjectName=bboxSize, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float[] bboxSize; // SFVec3f

 /* @name=center, @type=SFVec3d, $javaType=double[], $javaReferenceType=double[], $javaPrimitiveType=double[], $normalizedMemberObjectName=center, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private double[] center; // SFVec3d

 /* @name=child1Url, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=child1Url, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> child1Url = new ArrayList<>(); // MFString

 /* @name=child2Url, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=child2Url, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> child2Url = new ArrayList<>(); // MFString

 /* @name=child3Url, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=child3Url, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> child3Url = new ArrayList<>(); // MFString

 /* @name=child4Url, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=child4Url, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> child4Url = new ArrayList<>(); // MFString

 /* @name=children, @type=MFNode, $javaType=ArrayList<X3DChildNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DChildNode>, $normalizedMemberObjectName=children, $isX3dStatement=false, @acceptableNodeTypes=X3DChildNode */ 
	private ArrayList<X3DNode> children = new ArrayList<>(); // MFNode acceptable node types: X3DChildNode or ProtoInstanceObject

 /* @name=geoOrigin, @type=SFNode, $javaType=GeoOriginObject, $javaReferenceType=GeoOriginObject, $javaPrimitiveType=GeoOriginObject, $normalizedMemberObjectName=geoOrigin, $isX3dStatement=false, @acceptableNodeTypes=GeoOrigin */ 
	private GeoOriginObject geoOrigin; // SFNode acceptable node types: GeoOrigin or ProtoInstanceObject
	private ProtoInstanceObject geoOriginProtoInstance; // allowed alternative for geoOrigin field

 /* @name=geoSystem, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=geoSystem, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> geoSystem = new ArrayList<>(); // MFString

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=level_changed, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=level, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int level; // SFInt32

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=range, @type=SFFloat, $javaType=float, $javaReferenceType=float, $javaPrimitiveType=float, $normalizedMemberObjectName=range, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private float range; // SFFloat

 /* @name=rootNode, @type=MFNode, $javaType=ArrayList<X3DChildNode>, $javaReferenceType=X3DNode, $javaPrimitiveType=ArrayList<X3DChildNode>, $normalizedMemberObjectName=rootNode, $isX3dStatement=false, @acceptableNodeTypes=X3DChildNode */ 
	private ArrayList<X3DNode> rootNode = new ArrayList<>(); // MFNode acceptable node types: X3DChildNode or ProtoInstanceObject

 /* @name=rootUrl, @type=MFString, $javaType=ArrayList<String>, $javaReferenceType=String, $javaPrimitiveType=ArrayList<String>, $normalizedMemberObjectName=rootUrl, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<String> rootUrl = new ArrayList<>(); // MFString

 /* @name=visible, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=visible, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean visible; // SFBool

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>GeoLOD</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "GeoLOD";

	/** Provides name of this element: <i>GeoLOD</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>GeoLOD</i> element: <i>Geospatial</i> */
	public static final String COMPONENT = "Geospatial";

	/** Defines X3D component for the <i>GeoLOD</i> element: <i>Geospatial</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>Geospatial</i> component level for this element: <i>1</i> */
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

	/** SFVec3f field named <i>bboxCenter</i> has default value <i>{0f,0f,0f}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final float[] BBOXCENTER_DEFAULT_VALUE = {0f,0f,0f};

	/** SFVec3f field named <i>bboxSize</i> has default value <i>{-1f,-1f,-1f}</i> (Java syntax) or <i>-1 -1 -1</i> (XML syntax). */
	public static final float[] BBOXSIZE_DEFAULT_VALUE = {-1f,-1f,-1f};

	/** SFVec3d field named <i>center</i> has default value <i>{0,0,0}</i> (Java syntax) or <i>0 0 0</i> (XML syntax). */
	public static final double[] CENTER_DEFAULT_VALUE = {0,0,0};

	/** MFString field named <i>child1Url</i> has default value equal to an empty list. */
	public static final ArrayList<String> CHILD1URL_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** MFString field named <i>child2Url</i> has default value equal to an empty list. */
	public static final ArrayList<String> CHILD2URL_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** MFString field named <i>child3Url</i> has default value equal to an empty list. */
	public static final ArrayList<String> CHILD3URL_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** MFString field named <i>child4Url</i> has default value equal to an empty list. */
	public static final ArrayList<String> CHILD4URL_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** SFNode field named <i>geoOrigin</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final GeoOriginObject GEOORIGIN_DEFAULT_VALUE = null;

	/** MFString field named <i>geoSystem</i> has default quoted value <i>new String[] {"GD","WE"}</i> (Java syntax) or quoted value <i>"GD" "WE"</i> (XML syntax). */
	public static final ArrayList<String> GEOSYSTEM_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList("GD","WE"));

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFFloat field named <i>range</i> has default value <i>10f</i> (Java syntax) or <i>10</i> (XML syntax). */
	public static final float RANGE_DEFAULT_VALUE = 10f;

	/** MFString field named <i>rootUrl</i> has default value equal to an empty list. */
	public static final ArrayList<String> ROOTURL_DEFAULT_VALUE = new ArrayList<String>(Arrays.<String>asList());

	/** SFBool field named <i>visible</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean VISIBLE_DEFAULT_VALUE = true;

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
			case "bboxCenter":
				result = "SFVec3f";
				break;
			case "bboxSize":
				result = "SFVec3f";
				break;
			case "center":
				result = "SFVec3d";
				break;
			case "child1Url":
				result = "MFString";
				break;
			case "child2Url":
				result = "MFString";
				break;
			case "child3Url":
				result = "MFString";
				break;
			case "child4Url":
				result = "MFString";
				break;
			case "children":
				result = "MFNode";
				break;
			case "geoOrigin":
				result = "SFNode";
				break;
			case "geoSystem":
				result = "MFString";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "level":
				result = "SFInt32";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "range":
				result = "SFFloat";
				break;
			case "rootNode":
				result = "MFNode";
				break;
			case "rootUrl":
				result = "MFString";
				break;
			case "visible":
				result = "SFBool";
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
			case "bboxCenter":
				result = "initializeOnly";
				break;
			case "bboxSize":
				result = "initializeOnly";
				break;
			case "center":
				result = "initializeOnly";
				break;
			case "child1Url":
				result = "initializeOnly";
				break;
			case "child2Url":
				result = "initializeOnly";
				break;
			case "child3Url":
				result = "initializeOnly";
				break;
			case "child4Url":
				result = "initializeOnly";
				break;
			case "children":
				result = "outputOnly";
				break;
			case "geoOrigin":
				result = "initializeOnly";
				break;
			case "geoSystem":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "level_changed":
				result = "outputOnly";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "range":
				result = "initializeOnly";
				break;
			case "rootNode":
				result = "initializeOnly";
				break;
			case "rootUrl":
				result = "initializeOnly";
				break;
			case "visible":
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

	/** fromField ROUTE name for MFNode field named <i>children</i>. */
	public static final String fromField_CHILDREN = "children";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFInt32 field named <i>level_changed</i>. */
	public static final String fromField_LEVEL_CHANGED = "level_changed";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String fromField_VISIBLE = "visible";

	/** toField ROUTE name for SFBool field named <i>visible</i>. */
	public static final String toField_VISIBLE = "visible";

	/** Constructor for GeoLODObject to initialize member variables with default values. */
	public GeoLODObject()
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

		bboxCenter = BBOXCENTER_DEFAULT_VALUE;
		bboxSize = BBOXSIZE_DEFAULT_VALUE;
		center = CENTER_DEFAULT_VALUE;
		child1Url = new ArrayList<>(CHILD1URL_DEFAULT_VALUE);
		child2Url = new ArrayList<>(CHILD2URL_DEFAULT_VALUE);
		child3Url = new ArrayList<>(CHILD3URL_DEFAULT_VALUE);
		child4Url = new ArrayList<>(CHILD4URL_DEFAULT_VALUE);
		geoOrigin = null;              // clear out any prior node
		geoOriginProtoInstance = null; // clear out any prior node
		geoSystem = new ArrayList<>(GEOSYSTEM_DEFAULT_VALUE);
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		range = RANGE_DEFAULT_VALUE;
		rootNode = new ArrayList<>();
		rootUrl = new ArrayList<>(ROOTURL_DEFAULT_VALUE);
		visible = VISIBLE_DEFAULT_VALUE;
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setBboxCenter(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD bboxCenter newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		bboxCenter = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxCenter field, similar to {@link #setBboxCenter(float[])}.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxCenter(SFVec3fObject newValue)
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

	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxCenter(float x, float y, float z)
	{
		setBboxCenter(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxCenter(double x, double y, double z)
	{
		return setBboxCenter(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxCenter(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxCenter(double[] newArray)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setBboxSize(float[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new float[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		// Check legal value for bounding box bboxSize
		if (((newValue[0] < 0) || (newValue[1] < 0) || (newValue[2] < 0)) && !((newValue[0] == -1) && (newValue[1] == -1) && (newValue[2] == -1))) {
			throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD bboxSize newValue=" + SFVec3fObject.toString(newValue) + " has negative value but is not equal to sentinel {-1,-1,-1} value.");
		}
		bboxSize = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3f bboxSize field, similar to {@link #setBboxSize(float[])}.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxSize(SFVec3fObject newValue)
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

	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxSize(float x, float y, float z)
	{
		setBboxSize(new float[] {x, y, z});
		return this;
	}

	/**
	 * Utility method: double-precision set-parameters accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxSize(double x, double y, double z)
	{
		return setBboxSize(new SFVec3fObject(x, y, z));
	}
	/**
	 * Utility method: double-precision set-array accessor for X3D floating-point type, similar to {@link #setBboxSize(float[])}.
	 * @param newArray is new value for field                         
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setBboxSize(double[] newArray)
	{
		return setBboxSize(new SFVec3fObject(newArray));
	}
	/**
	 * Provide array of 3-tuple double results from initializeOnly SFVec3d field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Viewer range from geographic-coordinates center triggers quadtree loading/unloading.  * <br>

	 * @return value of center field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public double[] getCenter()
	{
		return center;
	}

	/**
	 * Accessor method to assign 3-tuple double array to initializeOnly SFVec3d field named <i>center</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Viewer range from geographic-coordinates center triggers quadtree loading/unloading.  * <br>

	 * @param newValue is new value for the center field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setCenter(double[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new double[0];
		// Check that newValue parameter has legal size before assigning to scene graph
		if (newValue.length != 3) // 3-tuple check
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD center newValue=" + SFVec3dObject.toString(newValue) + " has length=" + newValue.length + " instead of required length 3");
		}
		center = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFVec3d center field, similar to {@link #setCenter(double[])}.
	 * @param newValue is new value for the center field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setCenter(SFVec3dObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCenter(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Assign values to SFVec3d center field, similar to {@link #setCenter(double[])}.
	 * @param x first component
	 * @param y second component

	 * @param z third component

	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setCenter(double x, double y, double z)
	{
		setCenter(new double[] {x, y, z});
		return this;
	}
	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child1Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child1Url field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getChild1Url()
	{
		final String[] valuesArray = new String[child1Url.size()];
		int i = 0;
		for (String arrayElement : child1Url) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString child1Url field, similar to {@link #getChild1Url()}.
	 * @return value of child1Url field
	 */
	public ArrayList<String> getChild1UrlList()
	{
		return child1Url;
	}
	/**
	 * Utility method to get String value of MFString child1Url field, similar to {@link #getChild1Url()}.
	 * @return value of child1Url field
	 */
	public String getChild1UrlString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : child1Url) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child1Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child1Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setChild1Url(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearChild1Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChild1Url(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			child1Url.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString child1Url field, similar to {@link #setChild1Url(String[])}.
	 * @param newValue is new value for the child1Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild1Url(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild1Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setChild1Url(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString child1Url field, similar to {@link #setChild1Url(String[])}.
	 * @param newValue is new value for the child1Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild1Url(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild1Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setChild1Url(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString child1Url field, similar to {@link #setChild1Url(String[])}.
	 * @param newValue is new value for the child1Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild1Url(String newValue)
	{
		if (newValue == null)		{
			clearChild1Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearChild1Url(); // reset
		child1Url.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString child1Url field, similar to {@link #setChild1Url(String[])}.
	 * @param newValue is new value for the child1Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild1Url(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearChild1Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChild1Url(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChild1Url(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of child1Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearChild1Url()
	{
		child1Url.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString child1Url field.
	 * @param newValue is new value to add to the child1Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild1Url(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !child1Url.contains(newValue))
            child1Url.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString child1Url field.
	 * @param newValue is new value to add to the child1Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild1Url(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !child1Url.contains(newValue.getValue()))
            child1Url.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child2Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child2Url field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getChild2Url()
	{
		final String[] valuesArray = new String[child2Url.size()];
		int i = 0;
		for (String arrayElement : child2Url) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString child2Url field, similar to {@link #getChild2Url()}.
	 * @return value of child2Url field
	 */
	public ArrayList<String> getChild2UrlList()
	{
		return child2Url;
	}
	/**
	 * Utility method to get String value of MFString child2Url field, similar to {@link #getChild2Url()}.
	 * @return value of child2Url field
	 */
	public String getChild2UrlString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : child2Url) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child2Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child2Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setChild2Url(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearChild2Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChild2Url(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			child2Url.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString child2Url field, similar to {@link #setChild2Url(String[])}.
	 * @param newValue is new value for the child2Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild2Url(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild2Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setChild2Url(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString child2Url field, similar to {@link #setChild2Url(String[])}.
	 * @param newValue is new value for the child2Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild2Url(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild2Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setChild2Url(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString child2Url field, similar to {@link #setChild2Url(String[])}.
	 * @param newValue is new value for the child2Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild2Url(String newValue)
	{
		if (newValue == null)		{
			clearChild2Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearChild2Url(); // reset
		child2Url.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString child2Url field, similar to {@link #setChild2Url(String[])}.
	 * @param newValue is new value for the child2Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild2Url(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearChild2Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChild2Url(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChild2Url(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of child2Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearChild2Url()
	{
		child2Url.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString child2Url field.
	 * @param newValue is new value to add to the child2Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild2Url(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !child2Url.contains(newValue))
            child2Url.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString child2Url field.
	 * @param newValue is new value to add to the child2Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild2Url(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !child2Url.contains(newValue.getValue()))
            child2Url.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child3Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child3Url field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getChild3Url()
	{
		final String[] valuesArray = new String[child3Url.size()];
		int i = 0;
		for (String arrayElement : child3Url) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString child3Url field, similar to {@link #getChild3Url()}.
	 * @return value of child3Url field
	 */
	public ArrayList<String> getChild3UrlList()
	{
		return child3Url;
	}
	/**
	 * Utility method to get String value of MFString child3Url field, similar to {@link #getChild3Url()}.
	 * @return value of child3Url field
	 */
	public String getChild3UrlString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : child3Url) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child3Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child3Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setChild3Url(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearChild3Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChild3Url(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			child3Url.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString child3Url field, similar to {@link #setChild3Url(String[])}.
	 * @param newValue is new value for the child3Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild3Url(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild3Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setChild3Url(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString child3Url field, similar to {@link #setChild3Url(String[])}.
	 * @param newValue is new value for the child3Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild3Url(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild3Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setChild3Url(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString child3Url field, similar to {@link #setChild3Url(String[])}.
	 * @param newValue is new value for the child3Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild3Url(String newValue)
	{
		if (newValue == null)		{
			clearChild3Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearChild3Url(); // reset
		child3Url.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString child3Url field, similar to {@link #setChild3Url(String[])}.
	 * @param newValue is new value for the child3Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild3Url(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearChild3Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChild3Url(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChild3Url(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of child3Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearChild3Url()
	{
		child3Url.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString child3Url field.
	 * @param newValue is new value to add to the child3Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild3Url(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !child3Url.contains(newValue))
            child3Url.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString child3Url field.
	 * @param newValue is new value to add to the child3Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild3Url(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !child3Url.contains(newValue.getValue()))
            child3Url.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of String results from initializeOnly MFString field named <i>child4Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @return value of child4Url field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getChild4Url()
	{
		final String[] valuesArray = new String[child4Url.size()];
		int i = 0;
		for (String arrayElement : child4Url) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString child4Url field, similar to {@link #getChild4Url()}.
	 * @return value of child4Url field
	 */
	public ArrayList<String> getChild4UrlList()
	{
		return child4Url;
	}
	/**
	 * Utility method to get String value of MFString child4Url field, similar to {@link #getChild4Url()}.
	 * @return value of child4Url field
	 */
	public String getChild4UrlString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : child4Url) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>child4Url</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  quadtree geometry loaded when viewer is within range.  * <br>

	 * @param newValue is new value for the child4Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setChild4Url(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearChild4Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearChild4Url(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			child4Url.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString child4Url field, similar to {@link #setChild4Url(String[])}.
	 * @param newValue is new value for the child4Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild4Url(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild4Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setChild4Url(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString child4Url field, similar to {@link #setChild4Url(String[])}.
	 * @param newValue is new value for the child4Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild4Url(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearChild4Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setChild4Url(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString child4Url field, similar to {@link #setChild4Url(String[])}.
	 * @param newValue is new value for the child4Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild4Url(String newValue)
	{
		if (newValue == null)		{
			clearChild4Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearChild4Url(); // reset
		child4Url.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString child4Url field, similar to {@link #setChild4Url(String[])}.
	 * @param newValue is new value for the child4Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setChild4Url(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearChild4Url(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearChild4Url(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setChild4Url(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of child4Url field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearChild4Url()
	{
		child4Url.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString child4Url field.
	 * @param newValue is new value to add to the child4Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild4Url(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !child4Url.contains(newValue))
            child4Url.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString child4Url field.
	 * @param newValue is new value to add to the child4Url field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addChild4Url(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !child4Url.contains(newValue.getValue()))
            child4Url.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide array of X3DChildNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from outputOnly MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DChildNode] The outputOnly children field exposes a portion of the scene graph for the currently loaded set of nodes. The value returned as an event is an MFNode containing the currently selected tile. This will either be the node specified by the rootNode field or the nodes specified by the child1Url, child2Url, child3Url, and child4Url fields. The GeoLOD node shall generate a new children output event each time the scene graph is changed (EXAMPLE whenever nodes are loaded or unloaded).
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of children field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getChildren()
	{
		final X3DNode[] valuesArray = new X3DNode[children.size()];
		int i = 0;
		for (X3DNode arrayElement : children) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode children field, similar to {@link #getChildren()}.
	 * @return value of children field
	 */
	public ArrayList<X3DNode> getChildrenList()
	{
		return children;
	}

	/**
	 * Add comment as CommentsBlock to children field
	 * @param newComment initial value
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public GeoLODObject addComments (String newComment)
	{
		if (newComment == null) return this;
		children.add(new CommentsBlock (newComment));
		return this;
	}
	/**
	 * Add comments as String[] array to children field
	 * @param newComments array of comments
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public GeoLODObject addComments (String[] newComments)
	{
		if (newComments == null) return this;
		children.add(new CommentsBlock (newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to children field
	 * @param newCommentsBlock block of comments to add
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject addComments (CommentsBlock newCommentsBlock)
	{
		if (newCommentsBlock == null) return this;
		children.add(newCommentsBlock);
		return this;
	}
											/**
	 * Provide GeoOriginObject instance (using a properly typed node) (deprecated node, optional) from initializeOnly SFNode field <i>geoOrigin</i>.
	 * @see #getGeoOriginProtoInstance()
	 * @return value of geoOrigin field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public GeoOrigin getGeoOrigin()
	{
		return (GeoOrigin)geoOrigin;
	}

	/**
	 * Accessor method to assign GeoOriginObject instance (using a properly typed node) to initializeOnly SFNode field <i>geoOrigin</i>.
	 * @see #setGeoOrigin(ProtoInstanceObject)
	 * @param newValue is new value for the geoOrigin field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setGeoOrigin(GeoOrigin newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to null
			return setGeoOrigin(GEOORIGIN_DEFAULT_VALUE); // newValueNullSetDEFAULT_VALUE
	if (newValue instanceof GeoOriginObject)
	{
       geoOrigin = (GeoOriginObject)newValue;
       ((X3DConcreteElement) newValue).setParentObject(this); // parentTest10
	}
	else throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoOrigin newValue=(geoOriginObject.toString(newValue)) is not instanceof GeoOriginObject; newValue=" + newValue);
		return this;
	}

	/**
	 * Utility method to clear SFNode value of geoOrigin field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public GeoLODObject clearGeoOrigin()
	{
		((X3DConcreteElement) geoOrigin).clearParentObject(); // remove references to facilitate Java memory management
		geoOrigin = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to initializeOnly SFNode field <i>geoOrigin</i>.
	 * @see #setGeoOrigin(GeoOrigin)
	 * @param newValue is new value for the geoOrigin field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setGeoOrigin(ProtoInstanceObject newValue)
	{
		if (geoOriginProtoInstance != null)
		{
			((X3DConcreteElement) geoOriginProtoInstance).setParentObject(null); // parentTest15.5
	    }
		geoOriginProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) geoOriginProtoInstance).setParentObject(this); // parentTest15.6
            geoOriginProtoInstance.setContainerField("geoOrigin");
	    }
		if (geoOrigin != null)
		{
			((X3DConcreteElement) geoOrigin).setParentObject(null); // housekeeping, clear prior object
			geoOrigin = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getGeoOriginProtoInstance()
		{
			return geoOriginProtoInstance;
		}

	/**
	 * Indicate whether an object is available for initializeOnly SFNode field <i>geoOrigin</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getGeoOrigin()
	 * @see #getGeoOriginProtoInstance()
	 */
	public boolean hasGeoOrigin()
	{
		return (geoOrigin != null) || (geoOriginProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setGeoSystem(String[] newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setGeoSystem(MFStringObject newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setGeoSystem(SFStringObject newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setGeoSystem(String newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setGeoSystem(ArrayList<String> newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearGeoSystem()
	{
		geoSystem.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString geoSystem field.
	 * @param newValue is new value to add to the geoSystem field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addGeoSystem(String newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addGeoSystem(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setIS(ISObject newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public GeoLODObject clearIS()
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
	 * Provide int value within allowed range of [0,1] from outputOnly SFInt32 field named <i>level_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event that reports when the new children outputOnly event is generated, with value 0 or 1, where 0 indicates the rootNode field and 1 indicates the nodes specified by the child1Url, child2Url, child3Url, and child4Url fields.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of level_changed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public int getLevel()
	{
		return level;
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public GeoLODObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide float value within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>range</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Viewer range from geographic-coordinates center triggers quadtree loading/unloading.
 * <ul>
 *  <li> <i> Hint:</i>  not setting range values indicates that level switching can be optimized automatically based on performance. </li> 
 * </ul>
	 * @return value of range field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float getRange()
	{
		return range;
	}

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>range</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Viewer range from geographic-coordinates center triggers quadtree loading/unloading.
 * <ul>
 *  <li> <i> Hint:</i>  not setting range values indicates that level switching can be optimized automatically based on performance. </li> 
 * </ul>
	 * @param newValue is new value for the range field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setRange(float newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0f) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD range newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		range = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFFloat range field, similar to {@link #setRange(float)}.
	 * @param newValue is new value for the range field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRange(SFFloatObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setRange(newValue.getPrimitiveValue());
			return this;
	}

	/**
	 * Utility method: double-precision set-parameter accessor for X3D floating-point type, similar to {@link #setRange(float)}.
	 * @param newValue is new value for field
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRange(double newValue)
	{
		return setRange((float) newValue);
	}
	/**
	 * Provide array of X3DChildNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from initializeOnly MFNode field <i>rootNode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @see org.web3d.x3d.sai.Core.X3DChildNode
	 * @return value of rootNode field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public X3DNode[] getRootNode()
	{
		final X3DNode[] valuesArray = new X3DNode[rootNode.size()];
		int i = 0;
		for (X3DNode arrayElement : rootNode) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFNode rootNode field, similar to {@link #getRootNode()}.
	 * @return value of rootNode field
	 */
	public ArrayList<X3DNode> getRootNodeList()
	{
		return rootNode;
	}

	/**
	 * Accessor method to assign X3DChildNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to initializeOnly MFNode field <i>rootNode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value for the rootNode field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setRootNode(X3DNode[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)			// reset value field to empty array
		{
			clearRootNode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearRootNode(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				rootNode.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest12
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject; array newValue=" + Arrays.toString(newValue));
		}
		return this;
	}

	/**
	 * Assign ArrayList value of MFNode rootNode field, similar to {@link #setRootNode(X3DNode[])}.
	 * @param newValue is new value for the rootNode field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRootNode(ArrayList<X3DChildNode> newValue)
	{
		if (newValue == null)			// reset value field to empty array
		{
			clearRootNode(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearRootNode(); // reset
        else
        {
            X3DNode[] newArray = new X3DNode[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setRootNode(newArray);
        }
		for (X3DChildNode element : newValue)
		{
			rootNode.add((X3DNode) element);
			((X3DConcreteElement) element).setParentObject(this); // parentTest13
		}
		return this;
	}
	/**
	 * Add single child node to existing array of rootNode nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode and ProtoInstance.
	 * @param newValue is new value to be appended the rootNode field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public GeoLODObject addRootNode(X3DNode newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		rootNode.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest2
		return this;
	}
	/**
	 * Add single ProtoInstanceObject (with appropriate node type and containerField value) to MFNode array for rootNode field.
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to ShaderPart and ProtoInstance.
	 * @param newValue is new value to be appended the parts field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).	 */
	public GeoLODObject addRootNode(ProtoInstanceObject newValue)
	{
		if (newValue == null) return this; // newValueNullReturnThis
		rootNode.add(newValue);
		((X3DConcreteElement) newValue).setParentObject(this); // parentTest16
		return this;
	}
	/**
	 * Add array of child rootNode nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DChildNode.
	 * @param newValue is new value array to be appended the rootNode field.
	 */
	@Override // or here2?
	public void addRootNode(X3DNode[] /* bleah 3 TODO add node typing */  newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf
		for (int i = 0; i < newValue.length; i++)
		{
			if  ((newValue[i] instanceof X3DNode) || (newValue[i] instanceof ProtoInstanceObject))
			{
				rootNode.add(newValue[i]);
				((X3DConcreteElement) newValue[i]).setParentObject(this); // parentTest6
				if (newValue[i] instanceof ProtoInstanceObject)
					((ProtoInstanceObject) newValue[i]).setContainerField("rootNode");
			}
			else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode[] newValue["+i+"] is not instanceof X3DNode or ProtoInstanceObject, array newValue=" + Arrays.toString(newValue));
		}
	}

	/**
	 * Set single child rootNode node, replacing prior array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are restricted to X3DChildNode.
	 * @param newValue is new node for the rootNode field (restricted to X3DChildNode)
	 */
	@Override
	public void setRootNode(X3DNode /* bleah 1 add node typing */  newValue)
	{
		if (newValue == null)
		{
			clearRootNode(); // reset newValueNullClearsFieldReturnVoid
			return;
		}
		if  (newValue instanceof X3DNode)
		{
			for (X3DNode element : rootNode)
				((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
			clearRootNode(); // reset
			((X3DConcreteElement) newValue).setParentObject(this); // parentTest8
			rootNode.add(newValue);
		}
		else throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof X3DNode; newValue=" + newValue);
}
	/**
	 * Utility method to clear MFNode value of rootNode field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearRootNode()
	{
		for (X3DNode element : rootNode)
			((X3DConcreteElement) element).clearParentObject(); // remove references to facilitate Java memory management
		rootNode.clear(); // reset MF field
		return this;
	}

	/**
	 * Indicate whether an object is available for initializeOnly MFNode field <i>rootNode</i>.
	 * @return whether a properly typed node or ProtoInstance array or CommentsBlock is available.
	 * @see #getRootNode()
	 */
	public boolean hasRootNode()
	{
		return (!rootNode.isEmpty());
	}
	/**
	 * Provide array of String results from initializeOnly MFString field named <i>rootUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> url for scene providing geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * @return value of rootUrl field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public String[] getRootUrl()
	{
		final String[] valuesArray = new String[rootUrl.size()];
		int i = 0;
		for (String arrayElement : rootUrl) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFString rootUrl field, similar to {@link #getRootUrl()}.
	 * @return value of rootUrl field
	 */
	public ArrayList<String> getRootUrlList()
	{
		return rootUrl;
	}
	/**
	 * Utility method to get String value of MFString rootUrl field, similar to {@link #getRootUrl()}.
	 * @return value of rootUrl field
	 */
	public String getRootUrlString()
    {
        StringBuilder result = new StringBuilder();
		for (String arrayElement : rootUrl) {
			result.append("\"");
			result.append(arrayElement);
			result.append("\"");
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign String array to initializeOnly MFString field named <i>rootUrl</i>.
	 * <br><br>
	 * <i>Tooltip:</i> url for scene providing geometry for the root tile.
 * <ul>
 *  <li> <i> Warning:</i>  either rootNode or rootUrl can specify root tile, but specifying both is an error. </li> 
 * </ul>
	 * @param newValue is new value for the rootUrl field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setRootUrl(String[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearRootUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearRootUrl(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			rootUrl.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFString rootUrl field, similar to {@link #setRootUrl(String[])}.
	 * @param newValue is new value for the rootUrl field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRootUrl(MFStringObject newValue)
	{
		if (newValue == null)		{
			clearRootUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setRootUrl(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign single SFString object value to MFString rootUrl field, similar to {@link #setRootUrl(String[])}.
	 * @param newValue is new value for the rootUrl field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRootUrl(SFStringObject newValue)
	{
		if (newValue == null)		{
			clearRootUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #2
		setRootUrl(newValue.getValue());
		return this;
	}
	/**
	 * Assign singleton String value to MFString rootUrl field, similar to {@link #setRootUrl(String[])}.
	 * @param newValue is new value for the rootUrl field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRootUrl(String newValue)
	{
		if (newValue == null)		{
			clearRootUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #3
		clearRootUrl(); // reset
		rootUrl.add(newValue);
		return this;
	}
	/**
	 * Assign ArrayList value of MFString rootUrl field, similar to {@link #setRootUrl(String[])}.
	 * @param newValue is new value for the rootUrl field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setRootUrl(ArrayList<String> newValue)
	{
		if (newValue == null)		{
			clearRootUrl(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearRootUrl(); // reset
        else
        {
            String[] newArray = new String[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setRootUrl(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFString value of rootUrl field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public GeoLODObject clearRootUrl()
	{
		rootUrl.clear(); // reset MF field
		return this;
	}

	/**
	 * Add singleton String value to MFString rootUrl field.
	 * @param newValue is new value to add to the rootUrl field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addRootUrl(String newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
        newValue = MFStringObject.cleanupEnumerationValue(newValue); // handle potential enumeration value
		if (!newValue.isEmpty() && !rootUrl.contains(newValue))
            rootUrl.add(newValue); // only add if not already present

		return this;
	}
	/**
	 * Add singleton SFStringObject value to MFString rootUrl field.
	 * @param newValue is new value to add to the rootUrl field.
	 * @see MFStringObject#cleanupEnumerationValues(String)
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject addRootUrl(SFStringObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		
        newValue.setValue(MFStringObject.cleanupEnumerationValue(newValue.getValue())); // handle potential enumeration value
		if (!newValue.getValue().isEmpty() && !rootUrl.contains(newValue.getValue()))
            rootUrl.add(newValue.getValue()); // only add if not already present

		return this;
	}

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible()
	{
		return visible;
	}

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public GeoLODObject setVisible(boolean newValue)
	{
		// set-newValue-validity-checks #0
		visible = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool visible field, similar to {@link #setVisible(boolean)}.
	 * @param newValue is new value for the visible field.
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setVisible(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVisible(newValue.getPrimitiveValue());
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final GeoLODObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to GeoLOD DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD DEF newValue='" + newValue + "'" + 
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final GeoLODObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to GeoLOD USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("GeoLOD USE newValue='" + newValue + "'" + 
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final GeoLODObject setCssClass(String newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setCssClass(SFStringObject newValue)
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
	 * @return {@link GeoLODObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public GeoLODObject setUSE(GeoLODObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on GeoLODObject" +
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
	public GeoLODObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
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
		boolean      hasChild = (IS != null) || (geoOrigin != null) || (geoOriginProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (!rootNode.isEmpty());

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<GeoLOD"); // start opening tag
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

			if ((!Arrays.equals(getBboxCenter(), BBOXCENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxCenter='").append(SFVec3fObject.toString(getBboxCenter())).append("'");
			}
			if ((!Arrays.equals(getBboxSize(), BBOXSIZE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" bboxSize='").append(SFVec3fObject.toString(getBboxSize())).append("'");
			}
			if ((!Arrays.equals(getCenter(), CENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* (string-length(@default) > 0) */ && !isUSE())
			{
				stringX3D.append(" center='").append(SFVec3dObject.toString(getCenter())).append("'");
			}
			if (((getChild1Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" child1Url='").append(new MFStringObject(getChild1Url()).toStringX3D()).append("'");
			}
			if (((getChild2Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" child2Url='").append(new MFStringObject(getChild2Url()).toStringX3D()).append("'");
			}
			if (((getChild3Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" child3Url='").append(new MFStringObject(getChild3Url()).toStringX3D()).append("'");
			}
			if (((getChild4Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" child4Url='").append(new MFStringObject(getChild4Url()).toStringX3D()).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getGeoSystem().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" geoSystem='").append(new MFStringObject(getGeoSystem()).toStringX3D()).append("'");
			}
			if (((getRange() != RANGE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" range='").append(SFFloatObject.toString(getRange())).append("'");
			}
			if (((getRootUrl().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" rootUrl='").append(new MFStringObject(getRootUrl()).toStringX3D()).append("'");
			}
			if (((getVisible() != VISIBLE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" visible='").append(SFBoolObject.toString(getVisible())).append("'");
			}
		}
		if ((hasChild) && !isUSE()) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
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
			if      (geoOrigin != null)
			{
				stringX3D.append(((X3DConcreteElement)geoOrigin).toStringX3D(indentLevel + indentIncrement));
			}
			else if (geoOriginProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)geoOriginProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			for (X3DNode element : rootNode)
			{
				stringX3D.append(((X3DConcreteElement)element).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</GeoLOD>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=GeoLOD, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (geoOrigin != null) || (geoOriginProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (!rootNode.isEmpty());
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
			stringClassicVRML.append("GeoLOD").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("center"))
						{
							stringClassicVRML.append(indentCharacter).append("center").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!Arrays.equals(getCenter(), CENTER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("center ").append(SFVec3dObject.toString(getCenter())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("child1Url"))
						{
							stringClassicVRML.append(indentCharacter).append("child1Url").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getChild1Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("child1Url ").append("[ ").append(MFStringObject.toString(getChild1Url())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("child2Url"))
						{
							stringClassicVRML.append(indentCharacter).append("child2Url").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getChild2Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("child2Url ").append("[ ").append(MFStringObject.toString(getChild2Url())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("child3Url"))
						{
							stringClassicVRML.append(indentCharacter).append("child3Url").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getChild3Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("child3Url ").append("[ ").append(MFStringObject.toString(getChild3Url())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("child4Url"))
						{
							stringClassicVRML.append(indentCharacter).append("child4Url").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getChild4Url().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("child4Url ").append("[ ").append(MFStringObject.toString(getChild4Url())).append(" ]").append("\n").append(indent).append(indentCharacter);
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
						if (element.getNodeField().equals("range"))
						{
							stringClassicVRML.append(indentCharacter).append("range").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getRange() != RANGE_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("range ").append(SFFloatObject.toString(getRange())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("rootUrl"))
						{
							stringClassicVRML.append(indentCharacter).append("rootUrl").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getRootUrl().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("rootUrl ").append("[ ").append(MFStringObject.toString(getRootUrl())).append(" ]").append("\n").append(indent).append(indentCharacter);
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
			if (geoOrigin != null)
			{
				stringClassicVRML.append(indentCharacter).append("geoOrigin").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) geoOrigin).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (geoOriginProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("geoOrigin").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) geoOriginProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (rootNode.size() > 0)
			{
				stringClassicVRML.append(indentCharacter).append(indentCharacter).append("rootNode").append(" [").append("\n")
					.append(indent).append(indentCharacter).append(indentCharacter); // containerField for MFNode array
			for (X3DNode element : rootNode)
			{
				stringClassicVRML.append(((X3DConcreteElement)element).toStringClassicVRML(indentLevel + indentIncrement + indentIncrement));
			}
				stringClassicVRML.append(indent).append(indentCharacter).append(indentCharacter).append("]").append("\n")
					.append(indent); // end MFNode array
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
		if (geoOrigin != null)
		{
			referenceElement = ((X3DConcreteElement) geoOrigin).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (geoOriginProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) geoOriginProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
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
		for (X3DNode element : rootNode) // MFNode
		{
			if (element instanceof X3DConcreteElement)
			{
				referenceElement = ((X3DConcreteElement) element).findElementByNameValue(nameValue, elementName);
				if (referenceElement != null)
					return referenceElement;
			}
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
		if (geoOrigin != null)
		{
			referenceNode = ((X3DConcreteElement) geoOrigin).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (geoOriginProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) geoOriginProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
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
		for (X3DNode element : rootNode) // MFNode
		{
			if (element instanceof org.web3d.x3d.jsail.X3DConcreteNode)
			{
				referenceNode = ((X3DConcreteElement) element).findNodeByDEF(DEFvalue);
				if (referenceNode != null)
					return referenceNode;
			}
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

		setBboxCenter(getBboxCenter()); // exercise field checks, simple types
        
		setBboxSize(getBboxSize()); // exercise field checks, simple types
        
		setCenter(getCenter()); // exercise field checks, simple types
        
		setChild1Url(getChild1Url()); // exercise field checks, simple types
        
		setChild2Url(getChild2Url()); // exercise field checks, simple types
        
		setChild3Url(getChild3Url()); // exercise field checks, simple types
        
		setChild4Url(getChild4Url()); // exercise field checks, simple types
        
		setGeoSystem(getGeoSystem()); // exercise field checks, simple types
        
		setRange(getRange()); // exercise field checks, simple types
        
		setRootUrl(getRootUrl()); // exercise field checks, simple types
        
		setVisible(getVisible()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (geoOrigin != null)
		{
			setGeoOrigin(getGeoOrigin());
			((X3DConcreteElement) geoOrigin).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) geoOrigin).getValidationResult());
		}
		if (geoOriginProtoInstance != null)
		{
			setGeoOrigin(getGeoOriginProtoInstance());
			((X3DConcreteElement) geoOriginProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) geoOriginProtoInstance).getValidationResult());
		}
		if ((geoOrigin != null) && (geoOriginProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both geoOrigin and geoOriginProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasGeoOrigin()) // test USE restrictions
		{
			String errorNotice = "GeoLOD USE='" + getUSE() + "' is not allowed to have contained SFNode geoOrigin";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "GeoLOD USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
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
			String errorNotice = "GeoLOD USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		for (X3DNode element : rootNode) // MFNode
		{
			((X3DConcreteElement) element).validate(); // exercise field checks, MFNode element
			validationResult.append(((X3DConcreteElement) element).getValidationResult());
		}
		setRootNode(getRootNode()); // also test getter/setter validation, which also includes checks for acceptableNodeTypes (if applicable)

		if (isUSE() && hasRootNode()) // test USE restrictions
		{
			String errorNotice = "GeoLOD USE='" + getUSE() + "' is not allowed to have contained MFNode rootNode";
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
					"' for parent X3D model containing 'GeoLOD' node, add head statement <component name='Geospatial' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"Geospatial\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
