
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
 *         &lt;element ref="{}PD01GS01"/>
 *         &lt;element ref="{}PD01GH"/>
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
    "pd01GS01",
    "pd01GH"
})
@XmlRootElement(name = "PD01G")
public class PD01G {

    @XmlElement(name = "PD01GS01", required = true)
    protected String pd01GS01;
    @XmlElement(name = "PD01GH", required = true)
    protected PD01GH pd01GH;

    /**
     * 获取pd01GS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01GS01() {
        return pd01GS01;
    }

    /**
     * 设置pd01GS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01GS01(String value) {
        this.pd01GS01 = value;
    }

    /**
     * 获取pd01GH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PD01GH }
     *     
     */
    public PD01GH getPD01GH() {
        return pd01GH;
    }

    /**
     * 设置pd01GH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PD01GH }
     *     
     */
    public void setPD01GH(PD01GH value) {
        this.pd01GH = value;
    }

}
