
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
 *         &lt;element ref="{}PA01DQ01"/>
 *         &lt;element ref="{}PA01DQ02"/>
 *         &lt;element ref="{}PA01DR01"/>
 *         &lt;element ref="{}PA01DR02"/>
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
    "pa01DQ01",
    "pa01DQ02",
    "pa01DR01",
    "pa01DR02"
})
@XmlRootElement(name = "PA01D")
public class PA01D {

    @XmlElement(name = "PA01DQ01", required = true)
    protected String pa01DQ01;
    @XmlElement(name = "PA01DQ02", required = true)
    protected String pa01DQ02;
    @XmlElement(name = "PA01DR01", required = true)
    protected String pa01DR01;
    @XmlElement(name = "PA01DR02", required = true)
    protected String pa01DR02;

    /**
     * 获取pa01DQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01DQ01() {
        return pa01DQ01;
    }

    /**
     * 设置pa01DQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01DQ01(String value) {
        this.pa01DQ01 = value;
    }

    /**
     * 获取pa01DQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01DQ02() {
        return pa01DQ02;
    }

    /**
     * 设置pa01DQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01DQ02(String value) {
        this.pa01DQ02 = value;
    }

    /**
     * 获取pa01DR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01DR01() {
        return pa01DR01;
    }

    /**
     * 设置pa01DR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01DR01(String value) {
        this.pa01DR01 = value;
    }

    /**
     * 获取pa01DR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01DR02() {
        return pa01DR02;
    }

    /**
     * 设置pa01DR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01DR02(String value) {
        this.pa01DR02 = value;
    }

}
