
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
 *         &lt;element ref="{}PC05BS01"/>
 *         &lt;element ref="{}PC05BS02"/>
 *         &lt;element ref="{}PC05BS03"/>
 *         &lt;element ref="{}PC05BS04"/>
 *         &lt;element ref="{}PC05BS05"/>
 *         &lt;element ref="{}PC05BS06"/>
 *         &lt;element ref="{}PC05BS07"/>
 *         &lt;element ref="{}PC05BS08"/>
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
    "pc05BS01",
    "pc05BS02",
    "pc05BS03",
    "pc05BS04",
    "pc05BS05",
    "pc05BS06",
    "pc05BS07",
    "pc05BS08"
})
@XmlRootElement(name = "PC05B")
public class PC05B {

    @XmlElement(name = "PC05BS01", required = true)
    protected String pc05BS01;
    @XmlElement(name = "PC05BS02", required = true)
    protected String pc05BS02;
    @XmlElement(name = "PC05BS03", required = true)
    protected String pc05BS03;
    @XmlElement(name = "PC05BS04", required = true)
    protected String pc05BS04;
    @XmlElement(name = "PC05BS05", required = true)
    protected String pc05BS05;
    @XmlElement(name = "PC05BS06", required = true)
    protected String pc05BS06;
    @XmlElement(name = "PC05BS07", required = true)
    protected String pc05BS07;
    @XmlElement(name = "PC05BS08", required = true)
    protected String pc05BS08;

    /**
     * 获取pc05BS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS01() {
        return pc05BS01;
    }

    /**
     * 设置pc05BS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS01(String value) {
        this.pc05BS01 = value;
    }

    /**
     * 获取pc05BS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS02() {
        return pc05BS02;
    }

    /**
     * 设置pc05BS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS02(String value) {
        this.pc05BS02 = value;
    }

    /**
     * 获取pc05BS03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS03() {
        return pc05BS03;
    }

    /**
     * 设置pc05BS03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS03(String value) {
        this.pc05BS03 = value;
    }

    /**
     * 获取pc05BS04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS04() {
        return pc05BS04;
    }

    /**
     * 设置pc05BS04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS04(String value) {
        this.pc05BS04 = value;
    }

    /**
     * 获取pc05BS05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS05() {
        return pc05BS05;
    }

    /**
     * 设置pc05BS05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS05(String value) {
        this.pc05BS05 = value;
    }

    /**
     * 获取pc05BS06属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS06() {
        return pc05BS06;
    }

    /**
     * 设置pc05BS06属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS06(String value) {
        this.pc05BS06 = value;
    }

    /**
     * 获取pc05BS07属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS07() {
        return pc05BS07;
    }

    /**
     * 设置pc05BS07属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS07(String value) {
        this.pc05BS07 = value;
    }

    /**
     * 获取pc05BS08属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC05BS08() {
        return pc05BS08;
    }

    /**
     * 设置pc05BS08属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC05BS08(String value) {
        this.pc05BS08 = value;
    }

}
