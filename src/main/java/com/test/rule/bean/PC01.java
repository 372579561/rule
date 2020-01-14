
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
 *         &lt;element ref="{}PC010Q01"/>
 *         &lt;element ref="{}PC010Q02"/>
 *         &lt;element ref="{}PC010S01"/>
 *         &lt;element ref="{}PC010D01" maxOccurs="unbounded" minOccurs="0"/>
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
    "pc010Q01",
    "pc010Q02",
    "pc010S01",
    "pc010D01"
})
@XmlRootElement(name = "PC01")
public class PC01 {

    @XmlElement(name = "PC010Q01", required = true)
    protected String pc010Q01;
    @XmlElement(name = "PC010Q02", required = true)
    protected String pc010Q02;
    @XmlElement(name = "PC010S01", required = true)
    protected String pc010S01;
    @XmlElement(name = "PC010D01")
    protected List<String> pc010D01;

    /**
     * 获取pc010Q01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC010Q01() {
        return pc010Q01;
    }

    /**
     * 设置pc010Q01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC010Q01(String value) {
        this.pc010Q01 = value;
    }

    /**
     * 获取pc010Q02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC010Q02() {
        return pc010Q02;
    }

    /**
     * 设置pc010Q02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC010Q02(String value) {
        this.pc010Q02 = value;
    }

    /**
     * 获取pc010S01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC010S01() {
        return pc010S01;
    }

    /**
     * 设置pc010S01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC010S01(String value) {
        this.pc010S01 = value;
    }

    /**
     * Gets the value of the pc010D01 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc010D01 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC010D01().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPC010D01() {
        if (pc010D01 == null) {
            pc010D01 = new ArrayList<String>();
        }
        return this.pc010D01;
    }

}
