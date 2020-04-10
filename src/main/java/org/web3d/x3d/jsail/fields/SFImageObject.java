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

package org.web3d.x3d.jsail.fields;
import org.web3d.x3d.jsail.*;
import org.web3d.x3d.jsail.Core.*;
import java.util.Arrays;
import org.web3d.x3d.sai.InvalidFieldValueException;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRenderedImage;

/**
 * This utility class provides a concrete implementation corresponding to SFImage X3D field type.
 * 
 * <br><br>

 * <br>
 * <i>Package hint:</i>  This specification class is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * The SFImage field specifies a single uncompressed 2-dimensional pixel image. SFImage fields contain three integers representing the width, height and number of components in the image, followed by (width x height) hexadecimal or integer values representing the pixels in the image.
 * <br><br>
 * Related field object: {@link MFImageObject}
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SFImage">X3D Tooltips: type SFImage</a>
 * 
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/abstracts.html#X3DFieldTypes" target="_blank">SAI Java Specification: B.4.11 X3DFieldTypes</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-2/V3.3/Part02/dataRef.html#SAIFieldType" target="blank">SAI Abstract Specification: 5.2.15 SAIFieldType</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html#SFImageAndMFImage" target="blank">X3D Abstract Specification: SFImageAndMFImage</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html" target="_blank">X3D Tooltips</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#field"      target="_blank">X3D Tooltips: field</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#fieldValue" target="_blank">X3D Tooltips: fieldValue</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class SFImageObject extends X3DConcreteField implements org.web3d.x3d.sai.SFImage
{
	/** String constant <i>NAME</i> provides name of this element: <i>SFImage</i> */
	public static final String NAME = "SFImage";

	/** Default value for this field type contains values of <i>0 0 0</i>.
	 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html" target="_blank">Java Tutorials: Primitive Data Types</a>
     */
	public static final int[] DEFAULT_VALUE = {0, 0, 0}; // X3DUOM default value: 0 0 0

	/** Default string value for this field type is "0 0 0". */
	public static final String DEFAULT_VALUE_STRING = "0 0 0";

	/** Whether or not this field type is an array (<i>false</i>) 
      * @return true if array type */
	public static final boolean isArray()
    {
        return false;
    }

	/** Default tuple size for this field type is <i>1</i> (i.e. number of component values making up a single-field SF object). */
	public static final int TUPLE_SIZE = 1;

	/** Default regular expression (regex) pattern for this field type is <i>\s*([+]?(0|[1-9][0-9]*)([Ee][+]?[0-9]+)?\s+){2}[+]?[0-4](\s+(0x[0-9a-fA-F]{1,16}|[+]?(0|[1-9][0-9]*)([Ee][+]?[0-9]+)?))*\s*</i>
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://www.web3d.org/specifications/X3dRegularExpressions.html#SFImage" target="_blank">X3D Regular Expressions: SFImage</a>
	 */
	public static final String REGEX = "\\s*([+]?(0|[1-9][0-9]*)([Ee][+]?[0-9]+)?\\s+){2}[+]?[0-4](\\s+(0x[0-9a-fA-F]{1,16}|[+]?(0|[1-9][0-9]*)([Ee][+]?[0-9]+)?))*\\s*";

	/** Precompiled regular expression (regex) pattern for this field type using default <em>REGEX</em> value.
	 * @see REGEX
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 */
	public static final java.util.regex.Pattern PATTERN = java.util.regex.Pattern.compile(REGEX);
                    
    /** Flag to minimize excessive regex warnings for this field type, helpful if memory limitations are present. */
    private static boolean priorRegexStackOverflowFound = false;

	// Member value declaration is encapsulated and private, using preferred Java types for concretes library
	private int[] SFImage = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy

	/**
	 * Constructor for SFImageObject performs value initialization.
	 */
	public SFImageObject ()
	{
		initialize();
	}

	/**
	 * Initialization for SFImageObject applies default initial value.
	 * Static initializer also provided to verify that the regex pattern compiles and matches that default value.
	 * @see <a href="https://stackoverflow.com/questions/2704857/how-to-check-if-a-given-regex-is-valid">Stack Overflow: How to check if a given Regex is valid?</a>
	 * @see #DEFAULT_VALUE
	 */
	@Override
	public final void initialize()
	{
		SFImage = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
	}
	// static initializer
	static {
		try {
            // verify pattern is compiling OK, report exception if not
			java.util.regex.Pattern.compile(REGEX);
				
			// verify DEFAULT_VALUE matches pattern OK, report if not
			if ((new SFImageObject(DEFAULT_VALUE)).matches() == false)
			{
				System.out.println("SFImageObject.initialize() problem: failed to match DEFAULT_VALUE=" + DEFAULT_VALUE);
			}
        }
		catch (java.util.regex.PatternSyntaxException exception)
		{
			System.out.println("Exception in SFImage initialization testing, regex pattern compilation failure.");
			System.out.println("REGEX=\"" + REGEX + "\"");
			System.out.println(exception.getDescription());
        }
	}

	/**
	 * Determine whether two objects contain equal values.
	 * @param comparisonSFImageObject field type to compare
	 * @return true if equivalent, false otherwise
	 */
	public boolean equals(SFImageObject comparisonSFImageObject)
	{
        return (getPrimitiveValue() == comparisonSFImageObject.getPrimitiveValue());
	}
	/**
	 * Validate current value via get/set comparison tests
	 * @return empty string if get/set testing passes, warning otherwise
	 * @see #validate
	 * @see #validateRegex()
	 */
	public final String validate()
	{
        if (SFImage.length != (getWidth() * getHeight() + 3)) // validity check
		{
			String errorNotice = "Illegal length of SFImage integer array (" + SFImage.length + 
				") while ((width=" + getWidth() + " * height=" + getHeight() + " + 3)=" + (getWidth() * getHeight() + 3);
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
        // validation via get/set checks and comparison
        SFImageObject tempHold = new SFImageObject(getPrimitiveValue());
        if  (!this.equals(tempHold))
             return "SFImageObject validate() error: failed get/set round-trip test";
        else return "";
        
    }
	/**
	 * Validate current value via regular expression (regex) check of current object's toString() value, reporting errors only if found.
	 * @see #REGEX
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see #validate()
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return empty string if PATTERN matches, warning otherwise
	 */
	public final String validateRegex()
	{
        try
        {
            java.util.regex.Matcher m = PATTERN.matcher(toString());
            if (!m.matches())
            {
			String errorNotice = "*** Regular expression (regex) failure, new SFImageObject PATTERN mismatch (\"" + toString() + "\")";
                return errorNotice;
            }
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for SFImage";
            validationResult.append(validationMessage).append("\n");
            System.out.println ("*** " + validationMessage);
            return validationMessage;
		}
        return "";
	}
	/**
	 * Test PATTERN match via regular expression (regex) check of current object's toString() value.
	 * @see #REGEX
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return true if PATTERN matches, false otherwise
	 */
	public final boolean matches()
	{
        try
        {
            java.util.regex.Matcher m = PATTERN.matcher(toString());
            return m.matches();
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for SFImage";
            validationResult.append(validationMessage).append("\n");
            System.out.println ("*** " + validationMessage);
            return false;
		}
	}
	/**
	 * Test PATTERN match with regular expression (regex) of provided value.
	 * @param value String to check against regex pattern for successful match
	 * @see #REGEX
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return true if PATTERN matches, false otherwise
	 */
	public static final boolean matches(String value)
	{
		java.util.regex.Matcher m = PATTERN.matcher(value);
		return m.matches();
	}

	/**
	 * Utility accessor for SFImageObject using String value (which must pass parsing validation checks).
	 * <br ><br >
	 * <i>Warning:</i> this method is not 
	 * <i><a href="https://en.wikipedia.org/wiki/Type_safety" target="_blank">type safe</a></i>
	 * at compile time!  Best practice for X3DJSAIL programmers is to use strongly typed methods instead, in order to avoid potential for run-time errors.
	 * @see X3DLoaderDOM#toX3dObjectTree(org.w3c.dom.Node)
	 * @param newValue is new value to assign, if empty then assign DEFAULT_VALUE
	 * @return {@link MFMatrix4dObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public SFImageObject setValueByString (String newValue) throws InvalidFieldValueException
	{
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #1
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment

		if (!SFImageObject.matches(newValue)) // regex test
		{
			String errorNotice = "*** Regular expression (regex) failure, new SFImageObject(" + newValue + ")";
			validationResult.append(errorNotice).append("\n");
		}
		if (newValue.trim().isEmpty())
		{
			SFImage = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
		try
		{
			String[] newValues = newValue.replace(","," ").trim().split("\\s+");
			SFImage = new int[newValues.length];  // reset array size to match
			for (int i = 0; i < newValues.length;i++)
			{
				// https://stackoverflow.com/questions/11194513/convert-hex-string-to-int
				if  (newValues[i].startsWith("0x"))
				     SFImage[i] = Integer.decode  (newValues[i]); // insert hex value into array
				else SFImage[i] = Integer.parseInt(newValues[i]); // insert int value into array
			}
		}
		catch (NumberFormatException e)
		{
			String errorNotice = "new SFImageObject(" + newValue + ") " + e.getMessage();
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException (errorNotice);
		}
		return this;
	}

	/**
	 * Constructor to copy an SFImageObject value as initial value for this new field object.
	 * @param newValue The newValue to apply
	 */
	public SFImageObject(SFImageObject newValue)
	{
		if (newValue == null)
		{
			SFImage = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return;
		}
		SFImage = newValue.getPrimitiveValue();
	}

	/**
	 * Constructor for SFImageObject using a corresponding Java primitive int[] array as new initial value.
	 * @param newValue is new value to assign
	 * setContainerFieldOverride(containerFieldName); // apply checksConcreteField#getTupleSize(String)
	 */
	public SFImageObject (int[] newValue)
	{
		if (newValue == null)
			newValue = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
		
		SFImage = newValue;
	}

	/**
	 * Static utility method to provide String representation of a correctly typed input value.
	 * @param value The value to convert to a String
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#type">X3D Tooltips: type</a>
	 * @return String version of the provided value
	 */
	public static String toString (int[] value)
	{
		StringBuilder result = new StringBuilder();
		for (int i=0; i < value.length; i++)
		{
			result.append(value[i]).append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Provides current value of the field as a Java primitive type.
	 * @return current value
	 */
	public int[] getPrimitiveValue()
	{
		return SFImage;
	}
	/**
	 * Provides current value as a String.
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SFImage">X3D Tooltips: type SFImage</a>
	 * @see #toStringHexadecimal
	 * @see #toStringDecimal
	 * @see ConfigurationProperties#SFImagePixelOutputHexadecimal_DEFAULT
	 * @see ConfigurationProperties#isSFImagePixelOutputHexadecimal
	 * @see ConfigurationProperties#setSFImagePixelOutputHexadecimal(boolean)
	 * @return String version of the provided value, with pixels in hexadecimal or decimal format.
	 */
	@Override
	public String toString()
	{
		
		if  (ConfigurationProperties.isSFImagePixelOutputHexadecimal())
			 return toStringHexadecimal();
		else return toStringDecimal();

	}
	/**
	 * Provide pixel values in decimal format.
	 * @see #toStringHexadecimal
	 * @see ConfigurationProperties#SFImagePixelOutputHexadecimal_DEFAULT
	 * @see ConfigurationProperties#isSFImagePixelOutputHexadecimal
	 * @see ConfigurationProperties#setSFImagePixelOutputHexadecimal(boolean)
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SFImage">X3D Tooltips: type SFImage</a>
	 * @return String version of the provided value in decimal format
	 */
	public String toStringDecimal()
	{
		StringBuilder resultBuilder = new StringBuilder();
		for (int i = 0; i < SFImage.length; i++)
		{
			resultBuilder.append(SFImage[i]);
			if  (i < SFImage.length - 1)
				resultBuilder.append(" ");
		}
		return resultBuilder.toString();
	}

	/**
	 * Provide pixel values in hexadecimal format.

	 * @see #toStringDecimal
	 * @see ConfigurationProperties#SFImagePixelOutputHexadecimal_DEFAULT
	 * @see ConfigurationProperties#isSFImagePixelOutputHexadecimal
	 * @see ConfigurationProperties#setSFImagePixelOutputHexadecimal(boolean)

	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SFImage">X3D Tooltips: type SFImage</a>
	 * @return String version of the provided value in hexadecimal format
	 */
	public String toStringHexadecimal()
	{
		StringBuilder resultBuilder = new StringBuilder();
		// https://stackoverflow.com/questions/11194513/convert-hex-string-to-int
		for (int i = 0; i < SFImage.length; i++)
		{
			if (i < 3)
				 resultBuilder.append(SFImage[i]); // height, width, components in integer form
			else resultBuilder.append("0x").append(Integer.toHexString(SFImage[i]));
			if  (i < SFImage.length - 1)
				resultBuilder.append(" ");
		}
		return resultBuilder.toString();
	}

    /**
     * Get the width of the image.
     * @throws InvalidFieldValueException Invalid SFImage data found
     * @return The width of the image in pixels
     */
	@Override
	public int getWidth()
	{
		if  ((SFImage == null) || (SFImage.length < 3))
		{
			String errorNotice = "Null array or illegal data length for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}		
		int      width = SFImage[0];
		int     height = getHeight();
		if ((width < 0) || (height < 0))
		{
			String errorNotice = "Illegal negative value: width=" + width + ", height=" + height + 
				" for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}		
		return SFImage[0];
	}

    /**
     * Get the height of the image.
     * @throws InvalidFieldValueException Invalid SFImage data found
     * @return The height of the image in pixels
     */
	@Override
	public int getHeight()
	{
		if  ((SFImage == null) || (SFImage.length < 3))
		{
			String errorNotice = "Null array or illegal data length for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}		
		int      width = getWidth();
		int     height = SFImage[1];
		if ((width < 0) || (height < 0))
		{
			String errorNotice = "Illegal negative value: width=" + width + ", height=" + height + 
				" for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}		
		return SFImage[1];
	}

    /**
     * Get the number of color components in the image. The value will
     * always be between 0 and 4 indicating the number of components of
     * the color specification to be read from the image pixel data.
     * @throws InvalidFieldValueException Invalid SFImage data found
     * @return The number of components
     */
	@Override
	public int getNumberComponents()
	{
		if  ((SFImage == null) || (SFImage.length < 3))
		{
			String errorNotice = "Null array or illegal data length for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}		
		int components = SFImage[2];
		if ((components < 0) || (components > 4))
		{
			String errorNotice = "Illegal value, must be in range [0..4]: number of components=" + components + 
				" for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		return SFImage[2];
	}

    /**
     * Compute expected length of SFImage integer array (based on height and width values).
	 * Note that each integer pixel value must represent the full set of components for this SFImage.
	 * @see #getWidth
	 * @see #getHeight
	 * @return number of expected pixel values in SFImage integer array
	 */
	public int getExpectedLength()
	{
		return (getWidth() * getHeight());
	}
    /**
     * Compute number of pixel values in SFImage integer array (not counting height, width and components values).
	 * Note that each integer pixel value must represent the full set of components for this SFImage.
	 * @see #getWidth
	 * @see #getHeight
	 * @return number of pixel values in SFImage integer array
	 */
	public int getNumberOfPixelValues()
	{
		return Integer.max(SFImage.length - 3, 0);
	}					

    /**
     * Get the image pixel value in the given eventOut.
     * <p>
     * The number of items in the pixels array will be
     * <code>width * height</code>. If there are less items than this an
     * ArrayIndexOutOfBoundsException will be generated. The integer values
     * are represented according to the number of components.
     * <p>
     *  <b>1 Component Images </b> <br>
     * The integer has the intensity value stored in the lowest byte and can be
     * obtained:
     *  <pre>
     *    intensity = (pixel[i]     ) &amp;0xFF;
     *  </pre>
     * <p>
     *  <b>2 Component Images </b> <br>
     * The integer has the transparency value stored in the lowest byte and the
     * intensity in the next byte:
     *  <pre>
     *    intensity = (pixel[i] &gt;&gt; 8) &amp;0xFF;
     *    alpha     = (pixel[i]     ) &amp;0xFF;
     *  </pre>
     * <p>
     *  <b>3 Component Images </b> <br>
     * The three color components are stored in the integer array as follows:
     *  <pre>
     *    red   = (pixel[i] &gt;&gt; 16) &amp;0xFF;
     *    green = (pixel[i] &gt;&gt;  8) &amp;0xFF;
     *    blue  = (pixel[i]      ) &amp;0xFF;
     *  </pre>
     * <p>
     *  <b>4 Component Images </b> <br>
     * The integer has the value stored in the array as follows:
     *  <pre>
     *    red   = (pixel[i] &gt;&gt; 24) &amp;0xFF;
     *    green = (pixel[i] &gt;&gt; 16) &amp;0xFF;
     *    blue  = (pixel[i] &gt;&gt;  8) &amp;0xFF;
     *    alpha = (pixel[i]      ) &amp;0xFF;
     *  </pre>
     * <p>
     * The width and height values must be greater than or equal to zero. The
     * number of components is between 1 and 4. Any value outside of these
     * bounds will generate an IllegalArgumentException.
     * @param destinationPixels The array to copy pixel values into
     * @throws InvalidFieldValueException Invalid SFImage data found
     */
	@Override
	public void getPixels(int[] destinationPixels)
	{
		if  ((SFImage == null) || (SFImage.length < 3))
		{
			String errorNotice = "Null array or illegal data length for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}		
		int      width = getWidth();
		int     height = getHeight();
		int components = getNumberComponents(); // includes error checks
		destinationPixels = new int[SFImage.length];	
		if ((width == 0) || (height == 0) || (components == 0))
		{
			destinationPixels = new int[0];
		}
		else if (SFImage.length > 3)
		{
//  		destinationPixels = new int[width * height];                        // TODO necessary?
			destinationPixels = Arrays.copyOfRange(SFImage, 3, SFImage.length); // TODO verify
		}
		else
		{
			String errorNotice = "Illegal value for SFImage field type, getPixels() cannot get pixel array";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
	}

    /**
     * Fetch the Java representation of the underlying image from these pixels.
     * This is the same copy that the browser uses to generate texture
     * information from.
     * @return The image reference representing the current state
     */
	@Override
	public java.awt.image.WritableRenderedImage getImage()
	{
		return null; // TODO
	}

    /**
     * Set the image value in the given writable field to the new image defined
     * by a set of pixels.
     * <p>
     * @param image The new image to use as the source
     */
	@Override
	public void setImage(java.awt.image.RenderedImage image)
	{
		// TODO
	}

    /**
	 * Copy a region of the argument RenderedImage to replace a portion of the
	 * current SFimage.
	 * <p>
	 * The sub image set shall not resize the base image representation and
	 * therefore performs an intersection clip of the provided image. The user
	 * provided image shall be of the same format (pixel depth, pixel
	 * representation) as the original image obtained through the getImage()
	 * method.
	 * <p>
	 * RenderedImages are row order from top to bottom. A
	 * 4x8 RenderImage is indexed as follows:
	 *
	 *  <pre>
	 *
	 * X &gt;01234567
	 *   ----------
	 * 0 |********|
	 * 1 |********|
	 * 2 |********|
	 * 3 |********|
	 * ^ ----------
	 * Y
	 *
	 *  </pre>
	 *
	 * SFImages are row order from bottom to top. A
	 * 4x8 RenderImage is indexed as follows:
	 *
	 *  <pre>
	 *
	 * X &gt;01234567
	 *   ----------
	 * 3 |********|
	 * 2 |********|
	 * 1 |********|
	 * 0 |********|
	 * ^ ----------
	 * Y
	 *
	 *  </pre>
	 *
	 * <p>
	 * Note: The parameter srcYOffset is referenced to the RenderedImage object
	 * (indexed top to bottom).
	 * <br>
	 * The parameter destYOffset is referenced to the SFImage object
	 * (indexed bottom to top).
	 *
	 * @param image The new image to use as the source
	 * @param sourceWidth The width of the argument sub-image region to copy
	 * @param sourceHeight The height of the argument sub-image region to copy
	 * @param sourceXOffset The initial x dimension (width) offset into the
	 * argument sub-image that begins the region to copy
	 * @param sourceYOffset The initial y dimension (height) offset into the
	 * argument sub-image that begins the region to copy
	 * @param destinationXOffset The initial x dimension (width) offset in the SFimage
	 * object that begins the region to receive the copy
	 * @param destinationYOffset The initial y dimension (height) offset in the SFimage
	 * object that begins the region to receive the copy
	 */
	@Override
	public void setSubImage(java.awt.image.RenderedImage image,
                            int sourceWidth,
                            int sourceHeight,
                            int sourceXOffset,
                            int sourceYOffset,
                            int destinationXOffset,
                            int destinationYOffset)
	{
		// TODO
	}

    /**
     * Set the image value in the given writable field.
     * <p>
     * Image values are specified using a width, height and the number of
     * components. The number of items in the pixels array must be at least
     * <code>width * height</code>. If there are less items than this an
     * ArrayIndexOutOfBoundsException will be generated. The integer values
     * are represented according to the number of components. If the integer
     * contains values in bytes that are not used by the number of components
     * for that image, the values are ignored.
     * <p>
     *  <b>1 Component Images </b> <br>
     * The integer has the intensity value stored in the lowest byte and can be
     * obtained:
     *  <pre>
     *    intensity = (pixel[i]     ) &amp;0xFF;
     *  </pre>
     * <p>
     *  <b>2 Component Images </b> <br>
     * The integer has the transparency value stored in the lowest byte and the
     * intensity in the next byte:
     *  <pre>
     *    intensity = (pixel[i] &gt;&gt; 8) &amp;0xFF;
     *    alpha     = (pixel[i]     ) &amp;0xFF;
     *  </pre>
     * <p>
     *  <b>3 Component Images </b> <br>
     * The three color components are stored in the integer array as follows:
     *  <pre>
     *    red   = (pixel[i] &gt;&gt; 16) &amp;0xFF;
     *    green = (pixel[i] &gt;&gt;  8) &amp;0xFF;
     *    blue  = (pixel[i]      ) &amp;0xFF;
     *  </pre>
     * <p>
     *  <b>4 Component Images </b> <br>
     * The integer has the value stored in the array as follows:
     *  <pre>
     *    red   = (pixel[i] &gt;&gt; 24) &amp;0xFF;
     *    green = (pixel[i] &gt;&gt; 16) &amp;0xFF;
     *    blue  = (pixel[i] &gt;&gt;  8) &amp;0xFF;
     *    alpha = (pixel[i]      ) &amp;0xFF;
     *  </pre>
     * <p>
     * The width and height values must be greater than or equal to zero. The
     * number of components is between 1 and 4. Any value outside of these
     * bounds will generate an IllegalArgumentException.
     *
     * @param width The width of the image in pixels
     * @param height The height of the image in pixels
     * @param components The number of color components [1-4]
     * @param pixels The array of pixel values as specified above.
     * @exception IllegalArgumentException The number of components or width/
     *    height are illegal values.
     * @exception ArrayIndexOutOfBoundsException The number of pixels provided by the
     *    caller is not enough for the width * height.
     * @throws IllegalArgumentException Invalid parameter(s) provided, no change was made
     */
	@Override
	public void setValue(int width,
                         int height,
                         int components,
                         int[] pixels)
	{
		if ((width < 0) || (height < 0))
		{
			String errorNotice = "Illegal negative value: width=" + width + ", height=" + height + 
				" for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new IllegalArgumentException(errorNotice);
		}
		if ((components < 0) || (components > 4))
		{
			String errorNotice = "Illegal value, must be in range [0..4]: number of components=" + components + 
				" for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new IllegalArgumentException(errorNotice);
		}
		if (((width * height * components) > 0) && (pixels.length < (width * height)))
		{
			String errorNotice = "Illegal number of pixels: pixels.length=" + pixels.length +
				", (width * height * components) = " + width + " * " + components + " * " + components + ") = " + 
				(width * height * components) + " for SFImage field type";
			validationResult.append(errorNotice).append("\n");
			throw new IllegalArgumentException(errorNotice);
		}					
		SFImage = new int[3 + (width * height)];
		SFImage[0] = width;
		SFImage[1] = height;
		SFImage[2] = components;
		System.arraycopy(pixels, 0, SFImage, 3, pixels.length);
	}
								
    /**
     * Set the image value as a primitive array.
	 * @param sfImageArray full set of SFImage values
	 */
	public void setValue(int[] sfImageArray)
	{
		if (sfImageArray == null)
		{
			String errorNotice = "Illegal sfImageArray, cannot be null.";
			validationResult.append(errorNotice).append("\n");
			throw new IllegalArgumentException(errorNotice);
		}
		else if (sfImageArray.length < 3)
		{
			String errorNotice = "Illegal sfImageArray.length=" + sfImageArray.length + ", must be at least 3.";
			validationResult.append(errorNotice).append("\n");
			throw new IllegalArgumentException(errorNotice);
		}
		setValue (sfImageArray[0], sfImageArray[1], sfImageArray[2], Arrays.copyOfRange(sfImageArray,3,sfImageArray.length));
	}
                                
    /** index of width parameter in image array */
    static final int WIDTH_INDEX  = 0;
    /** index of height parameter in image array */
    static final int HEIGHT_INDEX = 1;
    /** index of numberComponents parameter in image array */
    static final int NUMBER_COMPONENTS_INDEX = 2;
    /** number of initialization parameters in image array preceding pixel values */
    static final int NUMBER_PARAMETERS = 3;
                                
	/**
	 * Utility method to get format string for proper output of hexadecimal values.
     * @param numberComponents 1..4 for transparency, BW, RGB, RGBA texture
	 * @return format string for hexadecimal values
	 */
	public static String getPixelHexFormat(int numberComponents)
    {
        // https://stackoverflow.com/questions/13851743/how-to-format-numbers-to-a-hex-strings
        switch (numberComponents) {
            case 0:  return "0x%02X"; // allowed value for SFImage default (0 0 0)
            case 1:  return "0x%02X";
            case 2:  return "0x%04X";
            case 3:  return "0x%06X";
            case 4:  return "0x%08X";
            default:
            {
                String errorNotice = "erroneous image numberComponents=" + numberComponents + " for SFImage, unable to compute getPixelHexFormat()";
                validationResult.append(errorNotice).append("\n");
                throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
            }
        }
	}
	/**
	 * Utility method to get String value of pixels in SFImage image field.
	 * @return string value of pixels
	 */
	public String getPixelsString()
    {
        StringBuilder result = new StringBuilder();
        String hexFormat = SFImageObject.getPixelHexFormat(getNumberComponents());

        int[] destinationPixels = Arrays.copyOfRange(SFImage, 3, SFImage.length);
		for (int i = 0; i < destinationPixels.length; i++)
        {
			result.append(String.format(hexFormat, destinationPixels[i]));
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Apply an SFImageObject value to this field.
	 * @param newValue The newValue to apply
	 * @return {@link SFImageObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFImageObject setValue(SFImageObject newValue)
	{
		if (newValue == null)
		{
			SFImage = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
		SFImage = newValue.getPrimitiveValue();
		return this;
	}								

	/**
	 * Determine whether current value matches DEFAULT_VALUE
	 * @see #DEFAULT_VALUE
	 * @return whether current value matches DEFAULT_VALUE
	 */
    public boolean isDefaultValue()
    {
        return java.util.Arrays.equals(SFImage, DEFAULT_VALUE);
    }
}
