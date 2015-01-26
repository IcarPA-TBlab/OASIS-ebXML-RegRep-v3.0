//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.20 at 09:49:52 AM CET 
//


package org.oasis.ebxml.registry.bindings.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType">
 *       &lt;attribute name="domainAttribute" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comparator" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *             &lt;enumeration value="LE"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="GE"/>
 *             &lt;enumeration value="GT"/>
 *             &lt;enumeration value="EQ"/>
 *             &lt;enumeration value="NE"/>
 *             &lt;enumeration value="Like"/>
 *             &lt;enumeration value="NotLike"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFilterType")
@XmlSeeAlso({
    DateTimeFilterType.class,
    BooleanFilterType.class,
    IntegerFilterType.class,
    StringFilterType.class,
    FloatFilterType.class
})
public abstract class SimpleFilterType
    extends FilterType
    implements Serializable
{

    private final static long serialVersionUID = 30L;
    @XmlAttribute(name = "domainAttribute", required = true)
    protected String domainAttribute;
    @XmlAttribute(name = "comparator", required = true)
    protected SimpleFilterType.Comparator comparator;

    /**
     * Gets the value of the domainAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainAttribute() {
        return domainAttribute;
    }

    /**
     * Sets the value of the domainAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainAttribute(String value) {
        this.domainAttribute = value;
    }

    /**
     * Gets the value of the comparator property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleFilterType.Comparator }
     *     
     */
    public SimpleFilterType.Comparator getComparator() {
        return comparator;
    }

    /**
     * Sets the value of the comparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleFilterType.Comparator }
     *     
     */
    public void setComparator(SimpleFilterType.Comparator value) {
        this.comparator = value;
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
     *     &lt;enumeration value="LE"/>
     *     &lt;enumeration value="LT"/>
     *     &lt;enumeration value="GE"/>
     *     &lt;enumeration value="GT"/>
     *     &lt;enumeration value="EQ"/>
     *     &lt;enumeration value="NE"/>
     *     &lt;enumeration value="Like"/>
     *     &lt;enumeration value="NotLike"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Comparator {

        LE("LE"),
        LT("LT"),
        GE("GE"),
        GT("GT"),
        EQ("EQ"),
        NE("NE"),
        @XmlEnumValue("Like")
        LIKE("Like"),
        @XmlEnumValue("NotLike")
        NOT_LIKE("NotLike");
        private final String value;

        Comparator(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static SimpleFilterType.Comparator fromValue(String v) {
            for (SimpleFilterType.Comparator c: SimpleFilterType.Comparator.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
