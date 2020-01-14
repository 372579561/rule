
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
 *         &lt;element ref="{}PF04AQ01"/>
 *         &lt;element ref="{}PF04AQ02"/>
 *         &lt;element ref="{}PF04AJ01"/>
 *         &lt;element ref="{}PF04AR01"/>
 *         &lt;element ref="{}PF04AR02"/>
 *         &lt;element ref="{}PF04AQ03"/>
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
    "pf04AQ01",
    "pf04AQ02",
    "pf04AJ01",
    "pf04AR01",
    "pf04AR02",
    "pf04AQ03"
})
@XmlRootElement(name = "PF04A")
public class PF04A {

    @XmlElement(name = "PF04AQ01", required = true)
    protected String pf04AQ01;
    @XmlElement(name = "PF04AQ02", required = true)
    protected String pf04AQ02;
    @XmlElement(name = "PF04AJ01", required = true)
    protected String pf04AJ01;
    @XmlElement(name = "PF04AR01", required = true)
    protected String pf04AR01;
    @XmlElement(name = "PF04AR02", required = true)
    protected String pf04AR02;
    @XmlElement(name = "PF04AQ03", required = true)
    protected String pf04AQ03;

    /**
     * 获取pf04AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF04AQ01() {
        return pf04AQ01;
    }

    /**
     * 设置pf04AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF04AQ01(String value) {
        this.pf04AQ01 = value;
    }

    /**
     * 获取pf04AQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF04AQ02() {
        return pf04AQ02;
    }

    /**
     * 设置pf04AQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF04AQ02(String value) {
        this.pf04AQ02 = value;
    }

    /**
     * 获取pf04AJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF04AJ01() {
        return pf04AJ01;
    }

    /**
     * 设置pf04AJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF04AJ01(String value) {
        this.pf04AJ01 = value;
    }

    /**
     * 获取pf04AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF04AR01() {
        return pf04AR01;
    }

    /**
     * 设置pf04AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF04AR01(String value) {
        this.pf04AR01 = value;
    }

    /**
     * 获取pf04AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF04AR02() {
        return pf04AR02;
    }

    /**
     * 设置pf04AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF04AR02(String value) {
        this.pf04AR02 = value;
    }

    /**
     * 获取pf04AQ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPF04AQ03() {
        return pf04AQ03;
    }

    /**
     * 设置pf04AQ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPF04AQ03(String value) {
        this.pf04AQ03 = value;
    }

}
