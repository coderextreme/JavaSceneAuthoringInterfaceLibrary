//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.13 at 10:04:16 AM CST 
//


package org.web3d.x3d.util.x3duom;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}enumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}componentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="acceptableNodeTypes" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="accessType" type="{}accessTypeValues" default="inputOutput" /&gt;
 *       &lt;attribute name="additionalEnumerationValuesAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="baseType" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="componentLevel" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="inheritedFrom" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="initialX3dVersion" type="{}versionValues" /&gt;
 *       &lt;attribute name="maxExclusive" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="maxInclusive" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="minExclusive" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="minInclusive" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" default="" /&gt;
 *       &lt;attribute name="type" type="{}fieldTypeValues" default="SFBool" /&gt;
 *       &lt;attribute name="use" default="optional"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="optional"/&gt;
 *             &lt;enumeration value="required"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enumeration",
    "componentInfo"
})
@XmlRootElement(name = "field")
public class Field {

    protected List<Enumeration> enumeration;
    protected List<ComponentInfo> componentInfo;
    @XmlAttribute(name = "acceptableNodeTypes")
    protected String acceptableNodeTypes;
    @XmlAttribute(name = "accessType")
    protected AccessTypeValues accessType;
    @XmlAttribute(name = "additionalEnumerationValuesAllowed")
    protected Boolean additionalEnumerationValuesAllowed;
    @XmlAttribute(name = "baseType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseType;
    @XmlAttribute(name = "componentLevel")
    protected BigInteger componentLevel;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "inheritedFrom")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inheritedFrom;
    @XmlAttribute(name = "initialX3dVersion")
    protected String initialX3DVersion;
    @XmlAttribute(name = "maxExclusive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maxExclusive;
    @XmlAttribute(name = "maxInclusive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maxInclusive;
    @XmlAttribute(name = "minExclusive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String minExclusive;
    @XmlAttribute(name = "minInclusive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String minInclusive;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlAttribute(name = "type")
    protected FieldTypeValues type;
    @XmlAttribute(name = "use")
    protected String use;

    /**
     * Gets the value of the enumeration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enumeration }
     * 
     * 
     */
    public List<Enumeration> getEnumeration() {
        if (enumeration == null) {
            enumeration = new ArrayList<Enumeration>();
        }
        return this.enumeration;
    }

    /**
     * Gets the value of the componentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentInfo }
     * 
     * 
     */
    public List<ComponentInfo> getComponentInfo() {
        if (componentInfo == null) {
            componentInfo = new ArrayList<ComponentInfo>();
        }
        return this.componentInfo;
    }

    /**
     * Gets the value of the acceptableNodeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptableNodeTypes() {
        if (acceptableNodeTypes == null) {
            return "";
        } else {
            return acceptableNodeTypes;
        }
    }

    /**
     * Sets the value of the acceptableNodeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptableNodeTypes(String value) {
        this.acceptableNodeTypes = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessTypeValues }
     *     
     */
    public AccessTypeValues getAccessType() {
        if (accessType == null) {
            return AccessTypeValues.INPUT_OUTPUT;
        } else {
            return accessType;
        }
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessTypeValues }
     *     
     */
    public void setAccessType(AccessTypeValues value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the additionalEnumerationValuesAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdditionalEnumerationValuesAllowed() {
        if (additionalEnumerationValuesAllowed == null) {
            return false;
        } else {
            return additionalEnumerationValuesAllowed;
        }
    }

    /**
     * Sets the value of the additionalEnumerationValuesAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalEnumerationValuesAllowed(Boolean value) {
        this.additionalEnumerationValuesAllowed = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        if (baseType == null) {
            return "";
        } else {
            return baseType;
        }
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the componentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentLevel() {
        if (componentLevel == null) {
            return new BigInteger("1");
        } else {
            return componentLevel;
        }
    }

    /**
     * Sets the value of the componentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentLevel(BigInteger value) {
        this.componentLevel = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        if (_default == null) {
            return "";
        } else {
            return _default;
        }
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the inheritedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedFrom() {
        if (inheritedFrom == null) {
            return "";
        } else {
            return inheritedFrom;
        }
    }

    /**
     * Sets the value of the inheritedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedFrom(String value) {
        this.inheritedFrom = value;
    }

    /**
     * Gets the value of the initialX3DVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialX3DVersion() {
        return initialX3DVersion;
    }

    /**
     * Sets the value of the initialX3DVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialX3DVersion(String value) {
        this.initialX3DVersion = value;
    }

    /**
     * Gets the value of the maxExclusive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxExclusive() {
        if (maxExclusive == null) {
            return "";
        } else {
            return maxExclusive;
        }
    }

    /**
     * Sets the value of the maxExclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxExclusive(String value) {
        this.maxExclusive = value;
    }

    /**
     * Gets the value of the maxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInclusive() {
        if (maxInclusive == null) {
            return "";
        } else {
            return maxInclusive;
        }
    }

    /**
     * Sets the value of the maxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInclusive(String value) {
        this.maxInclusive = value;
    }

    /**
     * Gets the value of the minExclusive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinExclusive() {
        if (minExclusive == null) {
            return "";
        } else {
            return minExclusive;
        }
    }

    /**
     * Sets the value of the minExclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinExclusive(String value) {
        this.minExclusive = value;
    }

    /**
     * Gets the value of the minInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinInclusive() {
        if (minInclusive == null) {
            return "";
        } else {
            return minInclusive;
        }
    }

    /**
     * Sets the value of the minInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinInclusive(String value) {
        this.minInclusive = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FieldTypeValues }
     *     
     */
    public FieldTypeValues getType() {
        if (type == null) {
            return FieldTypeValues.SF_BOOL;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldTypeValues }
     *     
     */
    public void setType(FieldTypeValues value) {
        this.type = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse() {
        if (use == null) {
            return "optional";
        } else {
            return use;
        }
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse(String value) {
        this.use = value;
    }

}