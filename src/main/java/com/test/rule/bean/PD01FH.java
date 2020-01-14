
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
 *         &lt;element ref="{}PD01FD01"/>
 *         &lt;element ref="{}PD01FR01"/>
 *         &lt;element ref="{}PD01FS02"/>
 *         &lt;element ref="{}PD01FJ01"/>
 *         &lt;element ref="{}PD01FQ01"/>
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
    "pd01FD01",
    "pd01FR01",
    "pd01FS02",
    "pd01FJ01",
    "pd01FQ01"
})
@XmlRootElement(name = "PD01FH")
public class PD01FH {

    @XmlElement(name = "PD01FD01", required = true)
    protected String pd01FD01;
    @XmlElement(name = "PD01FR01", required = true)
    protected String pd01FR01;
    @XmlElement(name = "PD01FS02", required = true)
    protected String pd01FS02;
    @XmlElement(name = "PD01FJ01", required = true)
    protected String pd01FJ01;
    @XmlElement(name = "PD01FQ01", required = true)
    protected String pd01FQ01;

    /**
     * 获取pd01FD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01FD01() {
        return pd01FD01;
    }

    /**
     * 设置pd01FD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01FD01(String value) {
        this.pd01FD01 = value;
    }

    /**
     * 获取pd01FR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01FR01() {
        return pd01FR01;
    }

    /**
     * 设置pd01FR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01FR01(String value) {
        this.pd01FR01 = value;
    }

    /**
     * 获取pd01FS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01FS02() {
        return pd01FS02;
    }

    /**
     * 设置pd01FS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01FS02(String value) {
        this.pd01FS02 = value;
    }

    /**
     * 获取pd01FJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01FJ01() {
        return pd01FJ01;
    }

    /**
     * 设置pd01FJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01FJ01(String value) {
        this.pd01FJ01 = value;
    }

    /**
     * 获取pd01FQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01FQ01() {
        return pd01FQ01;
    }

    /**
     * 设置pd01FQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01FQ01(String value) {
        this.pd01FQ01 = value;
    }

}
