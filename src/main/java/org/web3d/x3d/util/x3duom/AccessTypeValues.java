//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.13 at 10:04:16 AM CST 
//


package org.web3d.x3d.util.x3duom;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accessTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="initializeOnly"/&gt;
 *     &lt;enumeration value="inputOnly"/&gt;
 *     &lt;enumeration value="inputOutput"/&gt;
 *     &lt;enumeration value="outputOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "accessTypeValues")
@XmlEnum
public enum AccessTypeValues {

    @XmlEnumValue("initializeOnly")
    INITIALIZE_ONLY("initializeOnly"),
    @XmlEnumValue("inputOnly")
    INPUT_ONLY("inputOnly"),
    @XmlEnumValue("inputOutput")
    INPUT_OUTPUT("inputOutput"),
    @XmlEnumValue("outputOnly")
    OUTPUT_ONLY("outputOnly");
    private final String value;

    AccessTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessTypeValues fromValue(String v) {
        for (AccessTypeValues c: AccessTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}