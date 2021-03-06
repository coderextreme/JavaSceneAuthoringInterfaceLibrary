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
 * Functional summary: each added component statement indicates needed scene functionality support above the given X3D profile. This concrete class represents an X3D component statement.
 * 
 * <br><br>
 * <i>X3D statement tooltip</i>: [X3D statement] Each added component statement indicates needed scene functionality above the given X3D profile.
 * <ul>
 *  <li> <i>Hint:</i> component statements are optional secondary children of head statement (add a head statement first). </li> 
 *  <li> <i>Hint:</i> X3D XML Encoding <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#Header" target="_blank">https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/concepts.html#Header</a> </li> 
 *  <li> <i>Warning:</i> the COMPONENT statement is capitalized in the X3D Architecture specification and in the X3D ClassicVRML Encoding. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 7.2.5.4 COMPONENT statement <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#COMPONENTStatement" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#COMPONENTStatement</a> </li> 
 * </ul>
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Components" target="blank">X3D Abstract Specification: component</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#component" target="_blank">X3D Tooltips: component</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class componentObject extends org.web3d.x3d.jsail.X3DConcreteStatement
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=level, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=level, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int level; // SFInt32

 /* @name=name, @type=SFString, $javaType=String, $javaReferenceType=String, $javaPrimitiveType=String, $normalizedMemberObjectName=name, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private String name; // SFString

	// ==== String constants for enumeration values ensure correct syntax and avoid run-time errors ====

	/** List of specification-defined enumeration values, with additional author-defined enumeration values not allowed.
<br ><br >
	* Allowed values: "Core", "CADGeometry", "CubeMapTexturing", "DIS", "EnvironmentalEffects", "EnvironmentalSensor", "EventUtilities", "Followers", "Geometry2D", "Geometry3D", "Geospatial", "Grouping", "HAnim", "H-Anim", "Interpolation", "KeyDeviceSensor", "Layering", "Layout", "Lighting", "Navigation", "Networking", "NURBS", "ParticleSystems", "Picking", "PointingDeviceSensor", "Rendering", "RigidBodyPhysics", "Scripting", "Shaders", "Shape", "Sound", "Text", "Texturing", "Texturing3D", "Time", "VolumeRendering".
<br ><br >
	 * componentNameChoices are enumeration constants used to identify the profile for each scene-graph node, and also utilized by X3D element to identify the components required by the contained Scene.
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Components" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Components</a> 
	*/
	public static final ArrayList<String> componentNameChoices = new ArrayList<>(Arrays.<String>asList("Core", "CADGeometry", "CubeMapTexturing", "DIS", "EnvironmentalEffects", "EnvironmentalSensor", "EventUtilities", "Followers", "Geometry2D", "Geometry3D", "Geospatial", "Grouping", "HAnim", "H-Anim", "Interpolation", "KeyDeviceSensor", "Layering", "Layout", "Lighting", "Navigation", "Networking", "NURBS", "ParticleSystems", "Picking", "PointingDeviceSensor", "Rendering", "RigidBodyPhysics", "Scripting", "Shaders", "Shape", "Sound", "Text", "Texturing", "Texturing3D", "Time", "VolumeRendering"));

	/** 
	 * <i>Tooltip:</i> The Core component supplies the base functionality for the X3D run-time system, including the abstract base node type, field types, the event model, and routing.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Core"</i> (Java syntax) or <i>Core</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html</a>  */
	public static final String NAME_CORE = "Core";

	/** 
	 * <i>Tooltip:</i> The CADGeometry component is provided for Computer-Aided Design (CAD) nodes.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"CADGeometry"</i> (Java syntax) or <i>CADGeometry</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/CADGeometry.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/CADGeometry.html</a>  */
	public static final String NAME_CADGEOMETRY = "CADGeometry";

	/** 
	 * <i>Tooltip:</i> The Cube Map Environmental Texturing component describes how additional texturing effects are defined to produce environmental effects such as reflections from objects.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"CubeMapTexturing"</i> (Java syntax) or <i>CubeMapTexturing</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/env_texture.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/env_texture.html</a>  */
	public static final String NAME_CUBEMAPTEXTURING = "CubeMapTexturing";

	/** 
	 * <i>Tooltip:</i> The Distributed Interactive Simulation (DIS) component provides networked interoperability with the IEEE DIS protocol for sharing state and conducting real-time platform-level simulations across multiple host computers.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"DIS"</i> (Java syntax) or <i>DIS</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/dis.html</a>  */
	public static final String NAME_DIS = "DIS";

	/** 
	 * <i>Tooltip:</i> Nodes in the Environmental effects component support the creation of realistic environmental effects such as panoramic backgrounds and fog.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"EnvironmentalEffects"</i> (Java syntax) or <i>EnvironmentalEffects</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/enveffects.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/enveffects.html</a>  */
	public static final String NAME_ENVIRONMENTALEFFECTS = "EnvironmentalEffects";

	/** 
	 * <i>Tooltip:</i> The Environment Sensor nodes emit events indicating activity in the scene environment, usually based on interactions between the viewer and the world.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"EnvironmentalSensor"</i> (Java syntax) or <i>EnvironmentalSensor</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/envsensor.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/envsensor.html</a>  */
	public static final String NAME_ENVIRONMENTALSENSOR = "EnvironmentalSensor";

	/** 
	 * <i>Tooltip:</i> The Event Utility nodes provide the capability to filter, trigger, convert, or sequence numerous event-types for common interactive applications without the use of a Script node.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"EventUtilities"</i> (Java syntax) or <i>EventUtilities</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/utils.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/utils.html</a>  */
	public static final String NAME_EVENTUTILITIES = "EventUtilities";

	/** 
	 * <i>Tooltip:</i> The Follower nodes (Chasers and Dampers) support dynamic creation of smooth parameter transitions at run time.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Followers"</i> (Java syntax) or <i>Followers</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/followers.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/followers.html</a>  */
	public static final String NAME_FOLLOWERS = "Followers";

	/** 
	 * <i>Tooltip:</i> The Geometry2D component defines how two-dimensional geometry is specified and what shapes are available.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Geometry2D"</i> (Java syntax) or <i>Geometry2D</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry2D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry2D.html</a>  */
	public static final String NAME_GEOMETRY2D = "Geometry2D";

	/** 
	 * <i>Tooltip:</i> The Geometry3D component describes how three-dimensional geometry is specified and defines ElevationGrid, Extrusion, IndexedFaceSet, and most primitive geometry nodes (Box, Cone, Cylinder, Sphere).
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Geometry3D"</i> (Java syntax) or <i>Geometry3D</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry3D.html</a>  */
	public static final String NAME_GEOMETRY3D = "Geometry3D";

	/** 
	 * <i>Tooltip:</i> The Geospatial component defines how to associate real-world locations in an X3D scene and specifies nodes particularly tuned for geospatial applications.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Geospatial"</i> (Java syntax) or <i>Geospatial</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geodata.html</a>  */
	public static final String NAME_GEOSPATIAL = "Geospatial";

	/** 
	 * <i>Tooltip:</i> The Grouping component describes how nodes are organized into groups to establish a transformation hierarchy for the X3D scene graph.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Grouping"</i> (Java syntax) or <i>Grouping</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html</a>  */
	public static final String NAME_GROUPING = "Grouping";

	/** 
	 * <i>Tooltip:</i> The Humanoid Animation (HAnim) component for X3D defines node bindings and other details for implementing ISO/IEC 19774, the HAnim International Specification.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"HAnim"</i> (Java syntax) or <i>HAnim</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html</a>  */
	public static final String NAME_HANIM = "HAnim";

	/** 
	 * <i>Tooltip:</i> Legacy enumeration H-Anim for X3Dv3 provides backwards compatibility with Humanoid Animation (HAnim) version 1, preferred form is HAnim.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"H-Anim"</i> (Java syntax) or <i>H-Anim</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/hanim.html</a>  */
	public static final String NAME_H_ANIM = "H-Anim";

	/** 
	 * <i>Tooltip:</i> Interpolator nodes provide keyframe-based animation capability.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Interpolation"</i> (Java syntax) or <i>Interpolation</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html</a>  */
	public static final String NAME_INTERPOLATION = "Interpolation";

	/** 
	 * <i>Tooltip:</i> The Key Device Sensor defines how keyboard keystrokes are inserted into an X3D world.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"KeyDeviceSensor"</i> (Java syntax) or <i>KeyDeviceSensor</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/keyboard.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/keyboard.html</a>  */
	public static final String NAME_KEYDEVICESENSOR = "KeyDeviceSensor";

	/** 
	 * <i>Tooltip:</i> The Layering component describes how to layer a set of subscene layers into a composite scene.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Layering"</i> (Java syntax) or <i>Layering</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layering.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layering.html</a>  */
	public static final String NAME_LAYERING = "Layering";

	/** 
	 * <i>Tooltip:</i> The Layout component defines how to precisely position content in a scene in relation to the rendered results, especially for integrating 2D content with 3D content.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Layout"</i> (Java syntax) or <i>Layout</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/layout.html</a>  */
	public static final String NAME_LAYOUT = "Layout";

	/** 
	 * <i>Tooltip:</i> The Lighting component specifies how light sources are defined and positioned, as well as how lights effect the rendered image.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Lighting"</i> (Java syntax) or <i>Lighting</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html</a>  */
	public static final String NAME_LIGHTING = "Lighting";

	/** 
	 * <i>Tooltip:</i> The Navigation component specifies how a user can effectively and intuitively move through and around a 3D scene.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Navigation"</i> (Java syntax) or <i>Navigation</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/navigation.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/navigation.html</a>  */
	public static final String NAME_NAVIGATION = "Navigation";

	/** 
	 * <i>Tooltip:</i> The Networking component defines node types and other features used to access file-based and streaming resources on the World Wide Web.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Networking"</i> (Java syntax) or <i>Networking</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/networking.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/networking.html</a>  */
	public static final String NAME_NETWORKING = "Networking";

	/** 
	 * <i>Tooltip:</i> The NURBS component describes Non-uniform Rational B-Spline (NURBS) geometry and interpolation nodes.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"NURBS"</i> (Java syntax) or <i>NURBS</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html</a>  */
	public static final String NAME_NURBS = "NURBS";

	/** 
	 * <i>Tooltip:</i> The Particle Systems component specifies how to model particles and their interactions through the application of basic physics principles to affect motion.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"ParticleSystems"</i> (Java syntax) or <i>ParticleSystems</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html</a>  */
	public static final String NAME_PARTICLESYSTEMS = "ParticleSystems";

	/** 
	 * <i>Tooltip:</i> The Picking component provides the ability to test for arbitrary object collision and provide basic capabilities to detecting object intersections and interactions.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Picking"</i> (Java syntax) or <i>Picking</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/picking.html</a>  */
	public static final String NAME_PICKING = "Picking";

	/** 
	 * <i>Tooltip:</i> Pointing device sensor nodes detect pointing events from user-interface devices, defining activities such as a user selecting a piece of geometry.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"PointingDeviceSensor"</i> (Java syntax) or <i>PointingDeviceSensor</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/pointingsensor.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/pointingsensor.html</a>  */
	public static final String NAME_POINTINGDEVICESENSOR = "PointingDeviceSensor";

	/** 
	 * <i>Tooltip:</i> The Rendering component includes fundamental rendering primitives such as TriangleSet and PointSet nodes, as well as geometric properties nodes that define how coordinate indices, colors, normals and texture coordinates are specified.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Rendering"</i> (Java syntax) or <i>Rendering</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rendering.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rendering.html</a>  */
	public static final String NAME_RENDERING = "Rendering";

	/** 
	 * <i>Tooltip:</i> The Rigid Body Physics component describes how to model rigid bodies and their interactions through the application of basic physics principles to effect motion.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"RigidBodyPhysics"</i> (Java syntax) or <i>RigidBodyPhysics</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html</a>  */
	public static final String NAME_RIGIDBODYPHYSICS = "RigidBodyPhysics";

	/** 
	 * <i>Tooltip:</i> The Script component describes how Script nodes are used to effect changes in X3D worlds.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Scripting"</i> (Java syntax) or <i>Scripting</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/scripting.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/scripting.html</a>  */
	public static final String NAME_SCRIPTING = "Scripting";

	/** 
	 * <i>Tooltip:</i> The programmable shaders component describes how programmable shaders are specified and how they affect the visual appearance of geometry.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Shaders"</i> (Java syntax) or <i>Shaders</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shaders.html</a>  */
	public static final String NAME_SHADERS = "Shaders";

	/** 
	 * <i>Tooltip:</i> The Shape component defines nodes for associating geometry with their visible properties and the scene environment.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Shape"</i> (Java syntax) or <i>Shape</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html</a>  */
	public static final String NAME_SHAPE = "Shape";

	/** 
	 * <i>Tooltip:</i> The Sound component defines how sound is delivered to an X3D world as well as how sounds are accessed.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Sound"</i> (Java syntax) or <i>Sound</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html</a>  */
	public static final String NAME_SOUND = "Sound";

	/** 
	 * <i>Tooltip:</i> The Text component defines how text strings are rendered in an X3D scene.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Text"</i> (Java syntax) or <i>Text</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/text.html</a>  */
	public static final String NAME_TEXT = "Text";

	/** 
	 * <i>Tooltip:</i> The Texturing component specifies how 2D texture images are defined and then positioned on associated geometry.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Texturing"</i> (Java syntax) or <i>Texturing</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a>  */
	public static final String NAME_TEXTURING = "Texturing";

	/** 
	 * <i>Tooltip:</i> The Texturing3D component specifies how 3D volumetric textures describe surface properties as data points in a volume of space, rather than a flat surface.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Texturing3D"</i> (Java syntax) or <i>Texturing3D</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a>  */
	public static final String NAME_TEXTURING3D = "Texturing3D";

	/** 
	 * <i>Tooltip:</i> The Time component defines how time is sensed, computed and associated with events in an X3D scene.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"Time"</i> (Java syntax) or <i>Time</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/time.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/time.html</a>  */
	public static final String NAME_TIME = "Time";

	/** 
	 * <i>Tooltip:</i> The Volume Rendering component provides the ability to specify and render volumetric data sets.
	 * SFString field named <i>name</i> with X3DUOM baseType <i>componentNameChoices</i> can equal this value <i>"VolumeRendering"</i> (Java syntax) or <i>VolumeRendering</i> (XML syntax).
	 * @see #componentNameChoices
	 * @see  <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/volume.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/volume.html</a>  */
	public static final String NAME_VOLUMERENDERING = "VolumeRendering";

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>component</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "component";

	/** Provides name of this element: <i>component</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>component</i> element: <i>Core</i> */
	public static final String COMPONENT = "Core";

	/** Defines X3D component for the <i>component</i> element: <i>Core</i>
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

	/** SFInt32 field named <i>level</i> has default value <i>1</i> (Java syntax) or <i>1</i> (XML syntax). */
	public static final int LEVEL_DEFAULT_VALUE = 1;

	/** SFString field named <i>name</i> has default value equal to an empty string. */
	public static final String NAME_DEFAULT_VALUE = "";

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
			case "level":
				result = "SFInt32";
				break;
			case "name":
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
			case "level":
				result = "inputOutput";
				break;
			case "name":
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

	/** Constructor for componentObject to initialize member variables with default values. */
	public componentObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

		level = LEVEL_DEFAULT_VALUE;
		name = NAME_DEFAULT_VALUE;

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide int value within allowed range of [1,5] from inputOutput SFInt32 field named <i>level</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Necessary level of support for this scene, as defined in corresponding Support table for a given node's component.
 * <ul>
 *  <li> <i> Hint:</i>  for example specification definitions, X3D Architecture Grouping component, 10.5 Support levels <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#SupportLevels" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#SupportLevels</a> </li> 
 * </ul>
	 * @return value of level field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getLevel()
	{
		return level;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>level</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Necessary level of support for this scene, as defined in corresponding Support table for a given node's component.
 * <ul>
 *  <li> <i> Hint:</i>  for example specification definitions, X3D Architecture Grouping component, 10.5 Support levels <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#SupportLevels" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#SupportLevels</a> </li> 
 * </ul>
	 * @param newValue is new value for the level field.
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public componentObject setLevel(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 1) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("component level newValue=" + newValue + " has component value less than restriction minInclusive=1");
        }
        if (newValue > 5) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("component level newValue=" + SFInt32Object.toString(newValue) + " has component value greater than restriction maxInclusive=5");
            }
		level = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 level field, similar to {@link #setLevel(int)}.
	 * @param newValue is new value for the level field.
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public componentObject setLevel(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setLevel(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String enumeration value (baseType componentNameChoices) ["Core" | "CADGeometry" | "CubeMapTexturing" | "DIS" | "EnvironmentalEffects" | "EnvironmentalSensor" | "EventUtilities" | "Followers" | "Geometry2D" | "Geometry3D" | "Geospatial" | "Grouping" | "HAnim" | "H-Anim" | "Interpolation" | "KeyDeviceSensor" | "Layering" | "Layout" | "Lighting" | "Navigation" | "Networking" | "NURBS" | "ParticleSystems" | "Picking" | "PointingDeviceSensor" | "Rendering" | "RigidBodyPhysics" | "Scripting" | "Shaders" | "Shape" | "Sound" | "Text" | "Texturing" | "Texturing3D" | "Time" | "VolumeRendering"] from inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Provides name of this component, as defined in corresponding X3D Specification component Introduction. Example: X3D Architecture 10.1.1 Name for Grouping component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#Name" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#Name</a>
 * <ul>
 *  <li> <i>Hint:</i> all nodes, components and levels are already supported in Full profile. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>
	 * Available enumeration values for string comparison: {@link #NAME_CORE CORE}, {@link #NAME_CADGEOMETRY CADGEOMETRY}, {@link #NAME_CUBEMAPTEXTURING CUBEMAPTEXTURING}, {@link #NAME_DIS DIS}, {@link #NAME_ENVIRONMENTALEFFECTS ENVIRONMENTALEFFECTS}, {@link #NAME_ENVIRONMENTALSENSOR ENVIRONMENTALSENSOR}, {@link #NAME_EVENTUTILITIES EVENTUTILITIES}, {@link #NAME_FOLLOWERS FOLLOWERS}, {@link #NAME_GEOMETRY2D GEOMETRY2D}, {@link #NAME_GEOMETRY3D GEOMETRY3D}, {@link #NAME_GEOSPATIAL GEOSPATIAL}, {@link #NAME_GROUPING GROUPING}, {@link #NAME_HANIM HANIM}, {@link #NAME_H_ANIM H_ANIM}, {@link #NAME_INTERPOLATION INTERPOLATION}, {@link #NAME_KEYDEVICESENSOR KEYDEVICESENSOR}, {@link #NAME_LAYERING LAYERING}, {@link #NAME_LAYOUT LAYOUT}, {@link #NAME_LIGHTING LIGHTING}, {@link #NAME_NAVIGATION NAVIGATION}, {@link #NAME_NETWORKING NETWORKING}, {@link #NAME_NURBS NURBS}, {@link #NAME_PARTICLESYSTEMS PARTICLESYSTEMS}, {@link #NAME_PICKING PICKING}, {@link #NAME_POINTINGDEVICESENSOR POINTINGDEVICESENSOR}, {@link #NAME_RENDERING RENDERING}, {@link #NAME_RIGIDBODYPHYSICS RIGIDBODYPHYSICS}, {@link #NAME_SCRIPTING SCRIPTING}, {@link #NAME_SHADERS SHADERS}, {@link #NAME_SHAPE SHAPE}, {@link #NAME_SOUND SOUND}, {@link #NAME_TEXT TEXT}, {@link #NAME_TEXTURING TEXTURING}, {@link #NAME_TEXTURING3D TEXTURING3D}, {@link #NAME_TIME TIME}, {@link #NAME_VOLUMERENDERING VOLUMERENDERING}.
	 * @return value of name field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=true, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public String getName()
	{
		return name;
	}

	/**
	 * Accessor method to assign String enumeration value ("Core" | "CADGeometry" | "CubeMapTexturing" | "DIS" | "EnvironmentalEffects" | "EnvironmentalSensor" | "EventUtilities" | "Followers" | "Geometry2D" | "Geometry3D" | "Geospatial" | "Grouping" | "HAnim" | "H-Anim" | "Interpolation" | "KeyDeviceSensor" | "Layering" | "Layout" | "Lighting" | "Navigation" | "Networking" | "NURBS" | "ParticleSystems" | "Picking" | "PointingDeviceSensor" | "Rendering" | "RigidBodyPhysics" | "Scripting" | "Shaders" | "Shape" | "Sound" | "Text" | "Texturing" | "Texturing3D" | "Time" | "VolumeRendering") to inputOutput SFString field named <i>name</i>.
	 * <br><br>
	 * <i>Warning:</i> authors can only choose from a strict list of enumeration values ({@link #NAME_CORE CORE}, {@link #NAME_CADGEOMETRY CADGEOMETRY}, {@link #NAME_CUBEMAPTEXTURING CUBEMAPTEXTURING}, {@link #NAME_DIS DIS}, {@link #NAME_ENVIRONMENTALEFFECTS ENVIRONMENTALEFFECTS}, {@link #NAME_ENVIRONMENTALSENSOR ENVIRONMENTALSENSOR}, {@link #NAME_EVENTUTILITIES EVENTUTILITIES}, {@link #NAME_FOLLOWERS FOLLOWERS}, {@link #NAME_GEOMETRY2D GEOMETRY2D}, {@link #NAME_GEOMETRY3D GEOMETRY3D}, {@link #NAME_GEOSPATIAL GEOSPATIAL}, {@link #NAME_GROUPING GROUPING}, {@link #NAME_HANIM HANIM}, {@link #NAME_H_ANIM H_ANIM}, {@link #NAME_INTERPOLATION INTERPOLATION}, {@link #NAME_KEYDEVICESENSOR KEYDEVICESENSOR}, {@link #NAME_LAYERING LAYERING}, {@link #NAME_LAYOUT LAYOUT}, {@link #NAME_LIGHTING LIGHTING}, {@link #NAME_NAVIGATION NAVIGATION}, {@link #NAME_NETWORKING NETWORKING}, {@link #NAME_NURBS NURBS}, {@link #NAME_PARTICLESYSTEMS PARTICLESYSTEMS}, {@link #NAME_PICKING PICKING}, {@link #NAME_POINTINGDEVICESENSOR POINTINGDEVICESENSOR}, {@link #NAME_RENDERING RENDERING}, {@link #NAME_RIGIDBODYPHYSICS RIGIDBODYPHYSICS}, {@link #NAME_SCRIPTING SCRIPTING}, {@link #NAME_SHADERS SHADERS}, {@link #NAME_SHAPE SHAPE}, {@link #NAME_SOUND SOUND}, {@link #NAME_TEXT TEXT}, {@link #NAME_TEXTURING TEXTURING}, {@link #NAME_TEXTURING3D TEXTURING3D}, {@link #NAME_TIME TIME}, {@link #NAME_VOLUMERENDERING VOLUMERENDERING}).
	 * <br><br>
	 * <i>Tooltip:</i> Provides name of this component, as defined in corresponding X3D Specification component Introduction. Example: X3D Architecture 10.1.1 Name for Grouping component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#Name" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/group.html#Name</a>
 * <ul>
 *  <li> <i>Hint:</i> all nodes, components and levels are already supported in Full profile. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>@see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">X3D Scene Authoring Hints: Naming Conventions</a>
	 * @param newValue is new value for the name field.
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public final componentObject setName(String newValue)
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
			newValue.equals(NAME_CORE) ||
			newValue.equals(NAME_CADGEOMETRY) ||
			newValue.equals(NAME_CUBEMAPTEXTURING) ||
			newValue.equals(NAME_DIS) ||
			newValue.equals(NAME_ENVIRONMENTALEFFECTS) ||
			newValue.equals(NAME_ENVIRONMENTALSENSOR) ||
			newValue.equals(NAME_EVENTUTILITIES) ||
			newValue.equals(NAME_FOLLOWERS) ||
			newValue.equals(NAME_GEOMETRY2D) ||
			newValue.equals(NAME_GEOMETRY3D) ||
			newValue.equals(NAME_GEOSPATIAL) ||
			newValue.equals(NAME_GROUPING) ||
			newValue.equals(NAME_HANIM) ||
			newValue.equals(NAME_H_ANIM) ||
			newValue.equals(NAME_INTERPOLATION) ||
			newValue.equals(NAME_KEYDEVICESENSOR) ||
			newValue.equals(NAME_LAYERING) ||
			newValue.equals(NAME_LAYOUT) ||
			newValue.equals(NAME_LIGHTING) ||
			newValue.equals(NAME_NAVIGATION) ||
			newValue.equals(NAME_NETWORKING) ||
			newValue.equals(NAME_NURBS) ||
			newValue.equals(NAME_PARTICLESYSTEMS) ||
			newValue.equals(NAME_PICKING) ||
			newValue.equals(NAME_POINTINGDEVICESENSOR) ||
			newValue.equals(NAME_RENDERING) ||
			newValue.equals(NAME_RIGIDBODYPHYSICS) ||
			newValue.equals(NAME_SCRIPTING) ||
			newValue.equals(NAME_SHADERS) ||
			newValue.equals(NAME_SHAPE) ||
			newValue.equals(NAME_SOUND) ||
			newValue.equals(NAME_TEXT) ||
			newValue.equals(NAME_TEXTURING) ||
			newValue.equals(NAME_TEXTURING3D) ||
			newValue.equals(NAME_TIME) ||
			newValue.equals(NAME_VOLUMERENDERING)))
		{
			String warningMessage = "Warning: component name newValue=\"" + newValue + "\" has an unrecognized value not matching any of the required enumeration string tokens.";
			System.out.println(warningMessage);

            if (!newValue.isEmpty()) // @additionalEnumerationValuesAllowed='false'
            {
                throw new org.web3d.x3d.sai.InvalidFieldValueException(warningMessage);
            }
		}
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to component name
		if (!org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("component name newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}

        if (!newValue.equals(NAME_H_ANIM) && !org.web3d.x3d.jsail.fields.SFStringObject.meetsX3dInteroperabilityNamingConventions(newValue))
		{
			System.out.println("component name newValue='" + newValue + "'" + 
				" has name value that does not meet X3D naming conventions.");
		}
		name = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFString name field, similar to {@link #setName(String)}.
	 * @param newValue is new value for the name field.
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public componentObject setName(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setName(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Utility constructor that assigns name and level attributes.
	 * @param newName  name for this component
	 * @param newLevel level value for this component element
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#component">X3D Tooltips: component</a>
	 */
	public componentObject (String newName, int newLevel)
	{
		initialize();
		setName   (newName);
		setLevel(newLevel);
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public componentObject addComments (String newComment)
	{
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public componentObject addComments (String[] newComments)
	{
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link componentObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public componentObject addComments (CommentsBlock newCommentsBlock)
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

		stringX3D.append(indent).append("<component"); // start opening tag
		if (hasAttributes)
		{
			if (!getName().equals(NAME_DEFAULT_VALUE))
			{
				stringX3D.append(" name='").append(SFStringObject.toString(getName())).append("'");
			}
			
            // test attributes

			if ((true) /* required attribute */ )
			{
				stringX3D.append(" level='").append(SFInt32Object.toString(getLevel())).append("'");
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
			stringX3D.append(indent).append("</component>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=component, isX3dStatement=true, isClassX3dStatement=true, $hasChild=true, $hasAttributes=true
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

		// https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/concepts.html#ComponentStatementSyntax
		stringClassicVRML.append("COMPONENT ").append(name).append(":").append(getLevel()).append("\n");
		
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
		return toStringClassicVRML(indentLevel).replaceAll("COMPONENT ","#COMPONENT "); // hide unavailable X3D feature
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

		
		setLevel(getLevel()); // exercise field checks, simple types
        
		if (getName().isEmpty()) // required attribute
		{
			String errorNotice = ConfigurationProperties.ERROR_VALUE_NOT_FOUND + 
									", " + NAME + " name field is required but no value found. ";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		// TODO duplicate name checks in setValue() method
		setName(getName()); // exercise field checks, simple types
        
		return validationResult.toString();
	}
}
