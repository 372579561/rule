
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
 *         &lt;element ref="{}PE01AD01"/>
 *         &lt;element ref="{}PE01AQ01"/>
 *         &lt;element ref="{}PE01AD02"/>
 *         &lt;element ref="{}PE01AR01"/>
 *         &lt;element ref="{}PE01AD03"/>
 *         &lt;element ref="{}PE01AJ01"/>
 *         &lt;element ref="{}PE01AR02"/>
 *         &lt;element ref="{}PE01AQ02"/>
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
    "pe01AD01",
    "pe01AQ01",
    "pe01AD02",
    "pe01AR01",
    "pe01AD03",
    "pe01AJ01",
    "pe01AR02",
    "pe01AQ02"
})
@XmlRootElement(name = "PE01A")
public class PE01A {

    @XmlElement(name = "PE01AD01", required = true)
    protected String pe01AD01;
    @XmlElement(name = "PE01AQ01", required = true)
    protected String pe01AQ01;
    @XmlElement(name = "PE01AD02", required = true)
    protected String pe01AD02;
    @XmlElement(name = "PE01AR01", required = true)
    protected String pe01AR01;
    @XmlElement(name = "PE01AD03", required = true)
    protected String pe01AD03;
    @XmlElement(name = "PE01AJ01", required = true)
    protected String pe01AJ01;
    @XmlElement(name = "PE01AR02", required = true)
    protected String pe01AR02;
    @XmlElement(name = "PE01AQ02", required = true)
    protected String pe01AQ02;

    /**
     * 获取pe01AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AD01() {
        return pe01AD01;
    }

    /**
     * 设置pe01AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AD01(String value) {
        this.pe01AD01 = value;
    }

    /**
     * 获取pe01AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AQ01() {
        return pe01AQ01;
    }

    /**
     * 设置pe01AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AQ01(String value) {
        this.pe01AQ01 = value;
    }

    /**
     * 获取pe01AD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AD02() {
        return pe01AD02;
    }

    /**
     * 设置pe01AD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AD02(String value) {
        this.pe01AD02 = value;
    }

    /**
     * 获取pe01AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AR01() {
        return pe01AR01;
    }

    /**
     * 设置pe01AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AR01(String value) {
        this.pe01AR01 = value;
    }

    /**
     * 获取pe01AD03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AD03() {
        return pe01AD03;
    }

    /**
     * 设置pe01AD03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AD03(String value) {
        this.pe01AD03 = value;
    }

    /**
     * 获取pe01AJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AJ01() {
        return pe01AJ01;
    }

    /**
     * 设置pe01AJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AJ01(String value) {
        this.pe01AJ01 = value;
    }

    /**
     * 获取pe01AR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AR02() {
        return pe01AR02;
    }

    /**
     * 设置pe01AR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AR02(String value) {
        this.pe01AR02 = value;
    }

    /**
     * 获取pe01AQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE01AQ02() {
        return pe01AQ02;
    }

    /**
     * 设置pe01AQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE01AQ02(String value) {
        this.pe01AQ02 = value;
    }

}
