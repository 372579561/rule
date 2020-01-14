
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
 *         &lt;element ref="{}PF07AQ01"/>
 *         &lt;element ref="{}PF07AQ02"/>
 *         &lt;element ref="{}PF07AD01"/>
 *         &lt;element ref="{}PF07AD02"/>
 *         &lt;element ref="{}PF07AR01"/>
 *         &lt;element ref="{}PF07AR02"/>
 *         &lt;element ref="{}PF07AR03"/>
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
    "pf07AQ01",
    "pf07AQ02",
    "pf07AD01",
    "pf07AD02",
    "pf07AR01",
    "pf07AR02",
    "pf07AR03"
})
@XmlRootElement(name = "PF07A")
public class PF07A {

    @XmlElement(name = "PF07AQ01", required = true)
    protected String pf07AQ01;
    @XmlElement(name = "PF07AQ02", required = true)
    protected String pf07AQ02;
    @XmlElement(name = "PF07AD01", required = true)
    protected String pf07AD01;
    @XmlElement(name = "PF07AD02", required = true)
    protected String pf07AD02;
    @XmlElement(name = "PF07AR01", required = true)
    protected String pf07AR01;
    @XmlElement(name = "PF07AR02", required = true)
    protected String pf07AR02;
    @XmlElement(name = "PF07AR03", required = true)
    protected String pf07AR03;

    /**
     * 获取pf07AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AQ01() {
        return pf07AQ01;
    }

    /**
     * 设置pf07AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AQ01(String value) {
        this.pf07AQ01 = value;
    }

    /**
     * 获取pf07AQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AQ02() {
        return pf07AQ02;
    }

    /**
     * 设置pf07AQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AQ02(String value) {
        this.pf07AQ02 = value;
    }

    /**
     * 获取pf07AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AD01() {
        return pf07AD01;
    }

    /**
     * 设置pf07AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AD01(String value) {
        this.pf07AD01 = value;
    }

    /**
     * 获取pf07AD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AD02() {
        return pf07AD02;
    }

    /**
     * 设置pf07AD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AD02(String value) {
        this.pf07AD02 = value;
    }

    /**
     * 获取pf07AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AR01() {
        return pf07AR01;
    }

    /**
     * 设置pf07AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AR01(String value) {
        this.pf07AR01 = value;
    }

    /**
     * 获取pf07AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AR02() {
        return pf07AR02;
    }

    /**
     * 设置pf07AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AR02(String value) {
        this.pf07AR02 = value;
    }

    /**
     * 获取pf07AR03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF07AR03() {
        return pf07AR03;
    }

    /**
     * 设置pf07AR03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF07AR03(String value) {
        this.pf07AR03 = value;
    }

}
