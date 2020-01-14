
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
 *         &lt;element ref="{}PA01AI01"/>
 *         &lt;element ref="{}PA01AR01"/>
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
    "pa01AI01",
    "pa01AR01"
})
@XmlRootElement(name = "PA01A")
public class PA01A {

    @XmlElement(name = "PA01AI01", required = true)
    protected String pa01AI01;
    @XmlElement(name = "PA01AR01", required = true)
    protected String pa01AR01;

    /**
     * 获取pa01AI01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01AI01() {
        return pa01AI01;
    }

    /**
     * 设置pa01AI01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01AI01(String value) {
        this.pa01AI01 = value;
    }

    /**
     * 获取pa01AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA01AR01() {
        return pa01AR01;
    }

    /**
     * 设置pa01AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA01AR01(String value) {
        this.pa01AR01 = value;
    }

}
