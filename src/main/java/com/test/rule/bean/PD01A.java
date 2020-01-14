
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
 *         &lt;element ref="{}PD01AI01"/>
 *         &lt;element ref="{}PD01AD01"/>
 *         &lt;element ref="{}PD01AD02"/>
 *         &lt;element ref="{}PD01AI02"/>
 *         &lt;element ref="{}PD01AI03" minOccurs="0"/>
 *         &lt;element ref="{}PD01AI04" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD03" minOccurs="0"/>
 *         &lt;element ref="{}PD01AR01"/>
 *         &lt;element ref="{}PD01AD04" minOccurs="0"/>
 *         &lt;element ref="{}PD01AJ01" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD10" minOccurs="0"/>
 *         &lt;element ref="{}PD01AJ02" minOccurs="0"/>
 *         &lt;element ref="{}PD01AR02" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD05" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD06" minOccurs="0"/>
 *         &lt;element ref="{}PD01AS01" minOccurs="0"/>
 *         &lt;element ref="{}PD01AJ03" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD07" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD08" minOccurs="0"/>
 *         &lt;element ref="{}PD01AD09" minOccurs="0"/>
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
    "pd01AI01",
    "pd01AD01",
    "pd01AD02",
    "pd01AI02",
    "pd01AI03",
    "pd01AI04",
    "pd01AD03",
    "pd01AR01",
    "pd01AD04",
    "pd01AJ01",
    "pd01AD10",
    "pd01AJ02",
    "pd01AR02",
    "pd01AD05",
    "pd01AD06",
    "pd01AS01",
    "pd01AJ03",
    "pd01AD07",
    "pd01AD08",
    "pd01AD09"
})
@XmlRootElement(name = "PD01A")
public class PD01A {

    @XmlElement(name = "PD01AI01", required = true)
    protected String pd01AI01;
    @XmlElement(name = "PD01AD01", required = true)
    protected String pd01AD01;
    @XmlElement(name = "PD01AD02", required = true)
    protected String pd01AD02;
    @XmlElement(name = "PD01AI02", required = true)
    protected String pd01AI02;
    @XmlElement(name = "PD01AI03")
    protected String pd01AI03;
    @XmlElement(name = "PD01AI04")
    protected String pd01AI04;
    @XmlElement(name = "PD01AD03")
    protected String pd01AD03;
    @XmlElement(name = "PD01AR01", required = true)
    protected String pd01AR01;
    @XmlElement(name = "PD01AD04")
    protected String pd01AD04;
    @XmlElement(name = "PD01AJ01")
    protected String pd01AJ01;
    @XmlElement(name = "PD01AD10")
    protected String pd01AD10;
    @XmlElement(name = "PD01AJ02")
    protected String pd01AJ02;
    @XmlElement(name = "PD01AR02")
    protected String pd01AR02;
    @XmlElement(name = "PD01AD05")
    protected String pd01AD05;
    @XmlElement(name = "PD01AD06")
    protected String pd01AD06;
    @XmlElement(name = "PD01AS01")
    protected String pd01AS01;
    @XmlElement(name = "PD01AJ03")
    protected String pd01AJ03;
    @XmlElement(name = "PD01AD07")
    protected String pd01AD07;
    @XmlElement(name = "PD01AD08")
    protected String pd01AD08;
    @XmlElement(name = "PD01AD09")
    protected String pd01AD09;

    /**
     * 获取pd01AI01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AI01() {
        return pd01AI01;
    }

    /**
     * 设置pd01AI01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AI01(String value) {
        this.pd01AI01 = value;
    }

    /**
     * 获取pd01AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD01() {
        return pd01AD01;
    }

    /**
     * 设置pd01AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD01(String value) {
        this.pd01AD01 = value;
    }

    /**
     * 获取pd01AD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD02() {
        return pd01AD02;
    }

    /**
     * 设置pd01AD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD02(String value) {
        this.pd01AD02 = value;
    }

    /**
     * 获取pd01AI02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AI02() {
        return pd01AI02;
    }

    /**
     * 设置pd01AI02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AI02(String value) {
        this.pd01AI02 = value;
    }

    /**
     * 获取pd01AI03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AI03() {
        return pd01AI03;
    }

    /**
     * 设置pd01AI03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AI03(String value) {
        this.pd01AI03 = value;
    }

    /**
     * 获取pd01AI04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AI04() {
        return pd01AI04;
    }

    /**
     * 设置pd01AI04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AI04(String value) {
        this.pd01AI04 = value;
    }

    /**
     * 获取pd01AD03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD03() {
        return pd01AD03;
    }

    /**
     * 设置pd01AD03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD03(String value) {
        this.pd01AD03 = value;
    }

    /**
     * 获取pd01AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AR01() {
        return pd01AR01;
    }

    /**
     * 设置pd01AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AR01(String value) {
        this.pd01AR01 = value;
    }

    /**
     * 获取pd01AD04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD04() {
        return pd01AD04;
    }

    /**
     * 设置pd01AD04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD04(String value) {
        this.pd01AD04 = value;
    }

    /**
     * 获取pd01AJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AJ01() {
        return pd01AJ01;
    }

    /**
     * 设置pd01AJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AJ01(String value) {
        this.pd01AJ01 = value;
    }

    /**
     * 获取pd01AD10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD10() {
        return pd01AD10;
    }

    /**
     * 设置pd01AD10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD10(String value) {
        this.pd01AD10 = value;
    }

    /**
     * 获取pd01AJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AJ02() {
        return pd01AJ02;
    }

    /**
     * 设置pd01AJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AJ02(String value) {
        this.pd01AJ02 = value;
    }

    /**
     * 获取pd01AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AR02() {
        return pd01AR02;
    }

    /**
     * 设置pd01AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AR02(String value) {
        this.pd01AR02 = value;
    }

    /**
     * 获取pd01AD05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD05() {
        return pd01AD05;
    }

    /**
     * 设置pd01AD05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD05(String value) {
        this.pd01AD05 = value;
    }

    /**
     * 获取pd01AD06属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD06() {
        return pd01AD06;
    }

    /**
     * 设置pd01AD06属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD06(String value) {
        this.pd01AD06 = value;
    }

    /**
     * 获取pd01AS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AS01() {
        return pd01AS01;
    }

    /**
     * 设置pd01AS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AS01(String value) {
        this.pd01AS01 = value;
    }

    /**
     * 获取pd01AJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AJ03() {
        return pd01AJ03;
    }

    /**
     * 设置pd01AJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AJ03(String value) {
        this.pd01AJ03 = value;
    }

    /**
     * 获取pd01AD07属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD07() {
        return pd01AD07;
    }

    /**
     * 设置pd01AD07属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD07(String value) {
        this.pd01AD07 = value;
    }

    /**
     * 获取pd01AD08属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD08() {
        return pd01AD08;
    }

    /**
     * 设置pd01AD08属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD08(String value) {
        this.pd01AD08 = value;
    }

    /**
     * 获取pd01AD09属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01AD09() {
        return pd01AD09;
    }

    /**
     * 设置pd01AD09属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01AD09(String value) {
        this.pd01AD09 = value;
    }

}
