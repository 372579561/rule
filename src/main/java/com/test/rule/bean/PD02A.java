
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
 *         &lt;element ref="{}PD02AI01"/>
 *         &lt;element ref="{}PD02AD01"/>
 *         &lt;element ref="{}PD02AI02"/>
 *         &lt;element ref="{}PD02AI03"/>
 *         &lt;element ref="{}PD02AD02"/>
 *         &lt;element ref="{}PD02AJ01"/>
 *         &lt;element ref="{}PD02AD03"/>
 *         &lt;element ref="{}PD02AR01"/>
 *         &lt;element ref="{}PD02AR02"/>
 *         &lt;element ref="{}PD02AD04"/>
 *         &lt;element ref="{}PD02AJ04"/>
 *         &lt;element ref="{}PD02AJ03"/>
 *         &lt;element ref="{}PD02AI04"/>
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
    "pd02AI01",
    "pd02AD01",
    "pd02AI02",
    "pd02AI03",
    "pd02AD02",
    "pd02AJ01",
    "pd02AD03",
    "pd02AR01",
    "pd02AR02",
    "pd02AD04",
    "pd02AJ04",
    "pd02AJ03",
    "pd02AI04"
})
@XmlRootElement(name = "PD02A")
public class PD02A {

    @XmlElement(name = "PD02AI01", required = true)
    protected String pd02AI01;
    @XmlElement(name = "PD02AD01", required = true)
    protected String pd02AD01;
    @XmlElement(name = "PD02AI02", required = true)
    protected String pd02AI02;
    @XmlElement(name = "PD02AI03", required = true)
    protected String pd02AI03;
    @XmlElement(name = "PD02AD02", required = true)
    protected String pd02AD02;
    @XmlElement(name = "PD02AJ01", required = true)
    protected String pd02AJ01;
    @XmlElement(name = "PD02AD03", required = true)
    protected String pd02AD03;
    @XmlElement(name = "PD02AR01", required = true)
    protected String pd02AR01;
    @XmlElement(name = "PD02AR02", required = true)
    protected String pd02AR02;
    @XmlElement(name = "PD02AD04", required = true)
    protected String pd02AD04;
    @XmlElement(name = "PD02AJ04", required = true)
    protected String pd02AJ04;
    @XmlElement(name = "PD02AJ03", required = true)
    protected String pd02AJ03;
    @XmlElement(name = "PD02AI04", required = true)
    protected String pd02AI04;

    /**
     * 获取pd02AI01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AI01() {
        return pd02AI01;
    }

    /**
     * 设置pd02AI01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AI01(String value) {
        this.pd02AI01 = value;
    }

    /**
     * 获取pd02AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AD01() {
        return pd02AD01;
    }

    /**
     * 设置pd02AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AD01(String value) {
        this.pd02AD01 = value;
    }

    /**
     * 获取pd02AI02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AI02() {
        return pd02AI02;
    }

    /**
     * 设置pd02AI02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AI02(String value) {
        this.pd02AI02 = value;
    }

    /**
     * 获取pd02AI03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AI03() {
        return pd02AI03;
    }

    /**
     * 设置pd02AI03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AI03(String value) {
        this.pd02AI03 = value;
    }

    /**
     * 获取pd02AD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AD02() {
        return pd02AD02;
    }

    /**
     * 设置pd02AD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AD02(String value) {
        this.pd02AD02 = value;
    }

    /**
     * 获取pd02AJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AJ01() {
        return pd02AJ01;
    }

    /**
     * 设置pd02AJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AJ01(String value) {
        this.pd02AJ01 = value;
    }

    /**
     * 获取pd02AD03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AD03() {
        return pd02AD03;
    }

    /**
     * 设置pd02AD03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AD03(String value) {
        this.pd02AD03 = value;
    }

    /**
     * 获取pd02AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AR01() {
        return pd02AR01;
    }

    /**
     * 设置pd02AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AR01(String value) {
        this.pd02AR01 = value;
    }

    /**
     * 获取pd02AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AR02() {
        return pd02AR02;
    }

    /**
     * 设置pd02AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AR02(String value) {
        this.pd02AR02 = value;
    }

    /**
     * 获取pd02AD04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AD04() {
        return pd02AD04;
    }

    /**
     * 设置pd02AD04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AD04(String value) {
        this.pd02AD04 = value;
    }

    /**
     * 获取pd02AJ04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AJ04() {
        return pd02AJ04;
    }

    /**
     * 设置pd02AJ04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AJ04(String value) {
        this.pd02AJ04 = value;
    }

    /**
     * 获取pd02AJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AJ03() {
        return pd02AJ03;
    }

    /**
     * 设置pd02AJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AJ03(String value) {
        this.pd02AJ03 = value;
    }

    /**
     * 获取pd02AI04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD02AI04() {
        return pd02AI04;
    }

    /**
     * 设置pd02AI04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD02AI04(String value) {
        this.pd02AI04 = value;
    }

}
