
package com.test.rule.bean;

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
 *         &lt;element ref="{}PC05AR01"/>
 *         &lt;element ref="{}PC05AD01"/>
 *         &lt;element ref="{}PC05AI01"/>
 *         &lt;element ref="{}PC05AQ01"/>
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
    "pc05AR01",
    "pc05AD01",
    "pc05AI01",
    "pc05AQ01"
})
@XmlRootElement(name = "PC05A")
public class PC05A {

    @XmlElement(name = "PC05AR01", required = true)
    protected String pc05AR01;
    @XmlElement(name = "PC05AD01", required = true)
    protected String pc05AD01;
    @XmlElement(name = "PC05AI01", required = true)
    protected String pc05AI01;
    @XmlElement(name = "PC05AQ01", required = true)
    protected String pc05AQ01;

    /**
     * 获取pc05AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05AR01() {
        return pc05AR01;
    }

    /**
     * 设置pc05AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05AR01(String value) {
        this.pc05AR01 = value;
    }

    /**
     * 获取pc05AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05AD01() {
        return pc05AD01;
    }

    /**
     * 设置pc05AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05AD01(String value) {
        this.pc05AD01 = value;
    }

    /**
     * 获取pc05AI01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05AI01() {
        return pc05AI01;
    }

    /**
     * 设置pc05AI01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05AI01(String value) {
        this.pc05AI01 = value;
    }

    /**
     * 获取pc05AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05AQ01() {
        return pc05AQ01;
    }

    /**
     * 设置pc05AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05AQ01(String value) {
        this.pc05AQ01 = value;
    }

}
