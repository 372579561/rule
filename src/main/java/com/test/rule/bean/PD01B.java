
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
 *         &lt;element ref="{}PD01BD01"/>
 *         &lt;element ref="{}PD01BR01"/>
 *         &lt;element ref="{}PD01BR04" minOccurs="0"/>
 *         &lt;element ref="{}PD01BJ01"/>
 *         &lt;element ref="{}PD01BR02"/>
 *         &lt;element ref="{}PD01BJ02" minOccurs="0"/>
 *         &lt;element ref="{}PD01BD03" minOccurs="0"/>
 *         &lt;element ref="{}PD01BD04" minOccurs="0"/>
 *         &lt;element ref="{}PD01BR03"/>
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
    "pd01BD01",
    "pd01BR01",
    "pd01BR04",
    "pd01BJ01",
    "pd01BR02",
    "pd01BJ02",
    "pd01BD03",
    "pd01BD04",
    "pd01BR03"
})
@XmlRootElement(name = "PD01B")
public class PD01B {

    @XmlElement(name = "PD01BD01", required = true)
    protected String pd01BD01;
    @XmlElement(name = "PD01BR01", required = true)
    protected String pd01BR01;
    @XmlElement(name = "PD01BR04")
    protected String pd01BR04;
    @XmlElement(name = "PD01BJ01", required = true)
    protected String pd01BJ01;
    @XmlElement(name = "PD01BR02", required = true)
    protected String pd01BR02;
    @XmlElement(name = "PD01BJ02")
    protected String pd01BJ02;
    @XmlElement(name = "PD01BD03")
    protected String pd01BD03;
    @XmlElement(name = "PD01BD04")
    protected String pd01BD04;
    @XmlElement(name = "PD01BR03", required = true)
    protected String pd01BR03;

    /**
     * 获取pd01BD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BD01() {
        return pd01BD01;
    }

    /**
     * 设置pd01BD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BD01(String value) {
        this.pd01BD01 = value;
    }

    /**
     * 获取pd01BR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BR01() {
        return pd01BR01;
    }

    /**
     * 设置pd01BR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BR01(String value) {
        this.pd01BR01 = value;
    }

    /**
     * 获取pd01BR04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BR04() {
        return pd01BR04;
    }

    /**
     * 设置pd01BR04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BR04(String value) {
        this.pd01BR04 = value;
    }

    /**
     * 获取pd01BJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BJ01() {
        return pd01BJ01;
    }

    /**
     * 设置pd01BJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BJ01(String value) {
        this.pd01BJ01 = value;
    }

    /**
     * 获取pd01BR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BR02() {
        return pd01BR02;
    }

    /**
     * 设置pd01BR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BR02(String value) {
        this.pd01BR02 = value;
    }

    /**
     * 获取pd01BJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BJ02() {
        return pd01BJ02;
    }

    /**
     * 设置pd01BJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BJ02(String value) {
        this.pd01BJ02 = value;
    }

    /**
     * 获取pd01BD03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BD03() {
        return pd01BD03;
    }

    /**
     * 设置pd01BD03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BD03(String value) {
        this.pd01BD03 = value;
    }

    /**
     * 获取pd01BD04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BD04() {
        return pd01BD04;
    }

    /**
     * 设置pd01BD04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BD04(String value) {
        this.pd01BD04 = value;
    }

    /**
     * 获取pd01BR03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01BR03() {
        return pd01BR03;
    }

    /**
     * 设置pd01BR03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01BR03(String value) {
        this.pd01BR03 = value;
    }

}
