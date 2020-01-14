
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
 *         &lt;element ref="{}PD01HS01"/>
 *         &lt;element ref="{}PD01HH"/>
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
    "pd01HS01",
    "pd01HH"
})
@XmlRootElement(name = "PD01H")
public class PD01H {

    @XmlElement(name = "PD01HS01", required = true)
    protected String pd01HS01;
    @XmlElement(name = "PD01HH", required = true)
    protected PD01HH pd01HH;

    /**
     * 获取pd01HS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01HS01() {
        return pd01HS01;
    }

    /**
     * 设置pd01HS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01HS01(String value) {
        this.pd01HS01 = value;
    }

    /**
     * 获取pd01HH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PD01HH }
     *     
     */
    public PD01HH getPD01HH() {
        return pd01HH;
    }

    /**
     * 设置pd01HH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PD01HH }
     *     
     */
    public void setPD01HH(PD01HH value) {
        this.pd01HH = value;
    }

}
