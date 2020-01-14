
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
 *         &lt;element ref="{}PB01AD01"/>
 *         &lt;element ref="{}PB01AR01"/>
 *         &lt;element ref="{}PB01AD02"/>
 *         &lt;element ref="{}PB01AD03"/>
 *         &lt;element ref="{}PB01AD04"/>
 *         &lt;element ref="{}PB01AQ01"/>
 *         &lt;element ref="{}PB01AQ02"/>
 *         &lt;element ref="{}PB01AD05"/>
 *         &lt;element ref="{}PB01AQ03"/>
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
    "pb01AD01",
    "pb01AR01",
    "pb01AD02",
    "pb01AD03",
    "pb01AD04",
    "pb01AQ01",
    "pb01AQ02",
    "pb01AD05",
    "pb01AQ03"
})
@XmlRootElement(name = "PB01A")
public class PB01A {

    @XmlElement(name = "PB01AD01", required = true)
    protected String pb01AD01;
    @XmlElement(name = "PB01AR01", required = true)
    protected String pb01AR01;
    @XmlElement(name = "PB01AD02", required = true)
    protected String pb01AD02;
    @XmlElement(name = "PB01AD03", required = true)
    protected String pb01AD03;
    @XmlElement(name = "PB01AD04", required = true)
    protected String pb01AD04;
    @XmlElement(name = "PB01AQ01", required = true)
    protected String pb01AQ01;
    @XmlElement(name = "PB01AQ02", required = true)
    protected String pb01AQ02;
    @XmlElement(name = "PB01AD05", required = true)
    protected String pb01AD05;
    @XmlElement(name = "PB01AQ03", required = true)
    protected String pb01AQ03;

    /**
     * 获取pb01AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AD01() {
        return pb01AD01;
    }

    /**
     * 设置pb01AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AD01(String value) {
        this.pb01AD01 = value;
    }

    /**
     * 获取pb01AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AR01() {
        return pb01AR01;
    }

    /**
     * 设置pb01AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AR01(String value) {
        this.pb01AR01 = value;
    }

    /**
     * 获取pb01AD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AD02() {
        return pb01AD02;
    }

    /**
     * 设置pb01AD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AD02(String value) {
        this.pb01AD02 = value;
    }

    /**
     * 获取pb01AD03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AD03() {
        return pb01AD03;
    }

    /**
     * 设置pb01AD03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AD03(String value) {
        this.pb01AD03 = value;
    }

    /**
     * 获取pb01AD04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AD04() {
        return pb01AD04;
    }

    /**
     * 设置pb01AD04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AD04(String value) {
        this.pb01AD04 = value;
    }

    /**
     * 获取pb01AQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AQ01() {
        return pb01AQ01;
    }

    /**
     * 设置pb01AQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AQ01(String value) {
        this.pb01AQ01 = value;
    }

    /**
     * 获取pb01AQ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AQ02() {
        return pb01AQ02;
    }

    /**
     * 设置pb01AQ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AQ02(String value) {
        this.pb01AQ02 = value;
    }

    /**
     * 获取pb01AD05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AD05() {
        return pb01AD05;
    }

    /**
     * 设置pb01AD05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AD05(String value) {
        this.pb01AD05 = value;
    }

    /**
     * 获取pb01AQ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01AQ03() {
        return pb01AQ03;
    }

    /**
     * 设置pb01AQ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01AQ03(String value) {
        this.pb01AQ03 = value;
    }

}
