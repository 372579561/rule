
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
 *         &lt;element ref="{}PD01ZD01"/>
 *         &lt;element ref="{}PD01ZQ01"/>
 *         &lt;element ref="{}PD01ZR01"/>
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
    "pd01ZD01",
    "pd01ZQ01",
    "pd01ZR01"
})
@XmlRootElement(name = "PD01ZH")
public class PD01ZH {

    @XmlElement(name = "PD01ZD01", required = true)
    protected String pd01ZD01;
    @XmlElement(name = "PD01ZQ01", required = true)
    protected String pd01ZQ01;
    @XmlElement(name = "PD01ZR01", required = true)
    protected String pd01ZR01;

    /**
     * 获取pd01ZD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ZD01() {
        return pd01ZD01;
    }

    /**
     * 设置pd01ZD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ZD01(String value) {
        this.pd01ZD01 = value;
    }

    /**
     * 获取pd01ZQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ZQ01() {
        return pd01ZQ01;
    }

    /**
     * 设置pd01ZQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ZQ01(String value) {
        this.pd01ZQ01 = value;
    }

    /**
     * 获取pd01ZR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ZR01() {
        return pd01ZR01;
    }

    /**
     * 设置pd01ZR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ZR01(String value) {
        this.pd01ZR01 = value;
    }

}
