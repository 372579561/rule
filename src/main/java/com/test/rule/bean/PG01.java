
package com.test.rule.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PG010D01"/>
 *         &lt;element ref="{}PG010D02"/>
 *         &lt;element ref="{}PG010S01"/>
 *         &lt;element ref="{}PG010H" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pg010D01",
    "pg010D02",
    "pg010S01",
    "pg010H"
})
@XmlRootElement(name = "PG01")
public class PG01 {

    @XmlElement(name = "PG010D01", required = true)
    protected String pg010D01;
    @XmlElement(name = "PG010D02", required = true)
    protected String pg010D02;
    @XmlElement(name = "PG010S01", required = true)
    protected String pg010S01;
    @XmlElement(name = "PG010H")
    protected List<PG010H> pg010H;

    /**
     * 获取pg010D01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPG010D01() {
        return pg010D01;
    }

    /**
     * 设置pg010D01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPG010D01(String value) {
        this.pg010D01 = value;
    }

    /**
     * 获取pg010D02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPG010D02() {
        return pg010D02;
    }

    /**
     * 设置pg010D02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPG010D02(String value) {
        this.pg010D02 = value;
    }

    /**
     * 获取pg010S01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPG010S01() {
        return pg010S01;
    }

    /**
     * 设置pg010S01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPG010S01(String value) {
        this.pg010S01 = value;
    }

    /**
     * Gets the value of the pg010H property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pg010H property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPG010H().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PG010H }
     * 
     * 
     */
    public List<PG010H> getPG010H() {
        if (pg010H == null) {
            pg010H = new ArrayList<PG010H>();
        }
        return this.pg010H;
    }

}
