
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
 *         &lt;element ref="{}PD01GR01"/>
 *         &lt;element ref="{}PD01GD01"/>
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
    "pd01GR01",
    "pd01GD01"
})
@XmlRootElement(name = "PD01GH")
public class PD01GH {

    @XmlElement(name = "PD01GR01", required = true)
    protected String pd01GR01;
    @XmlElement(name = "PD01GD01", required = true)
    protected String pd01GD01;

    /**
     * 获取pd01GR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01GR01() {
        return pd01GR01;
    }

    /**
     * 设置pd01GR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01GR01(String value) {
        this.pd01GR01 = value;
    }

    /**
     * 获取pd01GD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01GD01() {
        return pd01GD01;
    }

    /**
     * 设置pd01GD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01GD01(String value) {
        this.pd01GD01 = value;
    }

}
