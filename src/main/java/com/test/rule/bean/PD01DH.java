
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
 *         &lt;element ref="{}PD01DR03"/>
 *         &lt;element ref="{}PD01DD01"/>
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
    "pd01DR03",
    "pd01DD01"
})
@XmlRootElement(name = "PD01DH")
public class PD01DH {

    @XmlElement(name = "PD01DR03", required = true)
    protected String pd01DR03;
    @XmlElement(name = "PD01DD01", required = true)
    protected String pd01DD01;

    /**
     * 获取pd01DR03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01DR03() {
        return pd01DR03;
    }

    /**
     * 设置pd01DR03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01DR03(String value) {
        this.pd01DR03 = value;
    }

    /**
     * 获取pd01DD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01DD01() {
        return pd01DD01;
    }

    /**
     * 设置pd01DD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01DD01(String value) {
        this.pd01DD01 = value;
    }

}
