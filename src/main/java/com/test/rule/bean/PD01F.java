
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
 *         &lt;element ref="{}PD01FS01"/>
 *         &lt;element ref="{}PD01FH"/>
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
    "pd01FS01",
    "pd01FH"
})
@XmlRootElement(name = "PD01F")
public class PD01F {

    @XmlElement(name = "PD01FS01", required = true)
    protected String pd01FS01;
    @XmlElement(name = "PD01FH", required = true)
    protected PD01FH pd01FH;

    /**
     * 获取pd01FS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01FS01() {
        return pd01FS01;
    }

    /**
     * 设置pd01FS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01FS01(String value) {
        this.pd01FS01 = value;
    }

    /**
     * 获取pd01FH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PD01FH }
     *     
     */
    public PD01FH getPD01FH() {
        return pd01FH;
    }

    /**
     * 设置pd01FH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PD01FH }
     *     
     */
    public void setPD01FH(PD01FH value) {
        this.pd01FH = value;
    }

}
