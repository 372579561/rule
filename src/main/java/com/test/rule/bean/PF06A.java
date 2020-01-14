
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
 *         &lt;element ref="{}PF06AD01"/>
 *         &lt;element ref="{}PF06AQ01"/>
 *         &lt;element ref="{}PF06AQ02"/>
 *         &lt;element ref="{}PF06AQ03"/>
 *         &lt;element ref="{}PF06AR01"/>
 *         &lt;element ref="{}PF06AR02"/>
 *         &lt;element ref="{}PF06AR03"/>
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
    "pf06AD01",
    "pf06AQ01",
    "pf06AQ02",
    "pf06AQ03",
    "pf06AR01",
    "pf06AR02",
    "pf06AR03"
})
@XmlRootElement(name = "PF06A")
public class PF06A {

    @XmlElement(name = "PF06AD01", required = true)
    protected String pf06AD01;
    @XmlElement(name = "PF06AQ01", required = true)
    protected String pf06AQ01;
    @XmlElement(name = "PF06AQ02", required = true)
    protected String pf06AQ02;
    @XmlElement(name = "PF06AQ03", required = true)
    protected String pf06AQ03;
    @XmlElement(name = "PF06AR01", required = true)
    protected String pf06AR01;
    @XmlElement(name = "PF06AR02", required = true)
    protected String pf06AR02;
    @XmlElement(name = "PF06AR03", required = true)
    protected String pf06AR03;

    /**
     * 获取pf06AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AD01() {
        return pf06AD01;
    }

    /**
     * 设置pf06AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AD01(String value) {
        this.pf06AD01 = value;
    }

    /**
     * 获取pf06AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AQ01() {
        return pf06AQ01;
    }

    /**
     * 设置pf06AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AQ01(String value) {
        this.pf06AQ01 = value;
    }

    /**
     * 获取pf06AQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AQ02() {
        return pf06AQ02;
    }

    /**
     * 设置pf06AQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AQ02(String value) {
        this.pf06AQ02 = value;
    }

    /**
     * 获取pf06AQ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AQ03() {
        return pf06AQ03;
    }

    /**
     * 设置pf06AQ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AQ03(String value) {
        this.pf06AQ03 = value;
    }

    /**
     * 获取pf06AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AR01() {
        return pf06AR01;
    }

    /**
     * 设置pf06AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AR01(String value) {
        this.pf06AR01 = value;
    }

    /**
     * 获取pf06AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AR02() {
        return pf06AR02;
    }

    /**
     * 设置pf06AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AR02(String value) {
        this.pf06AR02 = value;
    }

    /**
     * 获取pf06AR03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF06AR03() {
        return pf06AR03;
    }

    /**
     * 设置pf06AR03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF06AR03(String value) {
        this.pf06AR03 = value;
    }

}
