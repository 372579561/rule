
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
 *         &lt;element ref="{}PF01AQ01"/>
 *         &lt;element ref="{}PF01AJ01"/>
 *         &lt;element ref="{}PF01AR01"/>
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
    "pf01AQ01",
    "pf01AJ01",
    "pf01AR01"
})
@XmlRootElement(name = "PF01A")
public class PF01A {

    @XmlElement(name = "PF01AQ01", required = true)
    protected String pf01AQ01;
    @XmlElement(name = "PF01AJ01", required = true)
    protected String pf01AJ01;
    @XmlElement(name = "PF01AR01", required = true)
    protected String pf01AR01;

    /**
     * 获取pf01AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF01AQ01() {
        return pf01AQ01;
    }

    /**
     * 设置pf01AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF01AQ01(String value) {
        this.pf01AQ01 = value;
    }

    /**
     * 获取pf01AJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF01AJ01() {
        return pf01AJ01;
    }

    /**
     * 设置pf01AJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF01AJ01(String value) {
        this.pf01AJ01 = value;
    }

    /**
     * 获取pf01AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF01AR01() {
        return pf01AR01;
    }

    /**
     * 设置pf01AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF01AR01(String value) {
        this.pf01AR01 = value;
    }

}
