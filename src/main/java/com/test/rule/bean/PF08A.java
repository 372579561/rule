
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
 *         &lt;element ref="{}PF08AQ01"/>
 *         &lt;element ref="{}PF08AQ02"/>
 *         &lt;element ref="{}PF08AR01"/>
 *         &lt;element ref="{}PF08AR02"/>
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
    "pf08AQ01",
    "pf08AQ02",
    "pf08AR01",
    "pf08AR02"
})
@XmlRootElement(name = "PF08A")
public class PF08A {

    @XmlElement(name = "PF08AQ01", required = true)
    protected String pf08AQ01;
    @XmlElement(name = "PF08AQ02", required = true)
    protected String pf08AQ02;
    @XmlElement(name = "PF08AR01", required = true)
    protected String pf08AR01;
    @XmlElement(name = "PF08AR02", required = true)
    protected String pf08AR02;

    /**
     * 获取pf08AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF08AQ01() {
        return pf08AQ01;
    }

    /**
     * 设置pf08AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF08AQ01(String value) {
        this.pf08AQ01 = value;
    }

    /**
     * 获取pf08AQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF08AQ02() {
        return pf08AQ02;
    }

    /**
     * 设置pf08AQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF08AQ02(String value) {
        this.pf08AQ02 = value;
    }

    /**
     * 获取pf08AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF08AR01() {
        return pf08AR01;
    }

    /**
     * 设置pf08AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF08AR01(String value) {
        this.pf08AR01 = value;
    }

    /**
     * 获取pf08AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF08AR02() {
        return pf08AR02;
    }

    /**
     * 设置pf08AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF08AR02(String value) {
        this.pf08AR02 = value;
    }

}
