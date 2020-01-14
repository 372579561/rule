
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
 *         &lt;element ref="{}PA01BQ01"/>
 *         &lt;element ref="{}PA01BD01"/>
 *         &lt;element ref="{}PA01BI01"/>
 *         &lt;element ref="{}PA01BI02"/>
 *         &lt;element ref="{}PA01BD02"/>
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
    "pa01BQ01",
    "pa01BD01",
    "pa01BI01",
    "pa01BI02",
    "pa01BD02"
})
@XmlRootElement(name = "PA01B")
public class PA01B {

    @XmlElement(name = "PA01BQ01", required = true)
    protected String pa01BQ01;
    @XmlElement(name = "PA01BD01", required = true)
    protected String pa01BD01;
    @XmlElement(name = "PA01BI01", required = true)
    protected String pa01BI01;
    @XmlElement(name = "PA01BI02", required = true)
    protected String pa01BI02;
    @XmlElement(name = "PA01BD02", required = true)
    protected String pa01BD02;

    /**
     * 获取pa01BQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01BQ01() {
        return pa01BQ01;
    }

    /**
     * 设置pa01BQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01BQ01(String value) {
        this.pa01BQ01 = value;
    }

    /**
     * 获取pa01BD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01BD01() {
        return pa01BD01;
    }

    /**
     * 设置pa01BD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01BD01(String value) {
        this.pa01BD01 = value;
    }

    /**
     * 获取pa01BI01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01BI01() {
        return pa01BI01;
    }

    /**
     * 设置pa01BI01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01BI01(String value) {
        this.pa01BI01 = value;
    }

    /**
     * 获取pa01BI02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01BI02() {
        return pa01BI02;
    }

    /**
     * 设置pa01BI02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01BI02(String value) {
        this.pa01BI02 = value;
    }

    /**
     * 获取pa01BD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01BD02() {
        return pa01BD02;
    }

    /**
     * 设置pa01BD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01BD02(String value) {
        this.pa01BD02 = value;
    }

}
