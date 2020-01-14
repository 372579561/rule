
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
 *         &lt;element ref="{}PC02HS01"/>
 *         &lt;element ref="{}PC02HS02"/>
 *         &lt;element ref="{}PC02HJ01"/>
 *         &lt;element ref="{}PC02HJ02"/>
 *         &lt;element ref="{}PC02HJ03"/>
 *         &lt;element ref="{}PC02HJ04"/>
 *         &lt;element ref="{}PC02HJ05"/>
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
    "pc02HS01",
    "pc02HS02",
    "pc02HJ01",
    "pc02HJ02",
    "pc02HJ03",
    "pc02HJ04",
    "pc02HJ05"
})
@XmlRootElement(name = "PC02H")
public class PC02H {

    @XmlElement(name = "PC02HS01", required = true)
    protected String pc02HS01;
    @XmlElement(name = "PC02HS02", required = true)
    protected String pc02HS02;
    @XmlElement(name = "PC02HJ01", required = true)
    protected String pc02HJ01;
    @XmlElement(name = "PC02HJ02", required = true)
    protected String pc02HJ02;
    @XmlElement(name = "PC02HJ03", required = true)
    protected String pc02HJ03;
    @XmlElement(name = "PC02HJ04", required = true)
    protected String pc02HJ04;
    @XmlElement(name = "PC02HJ05", required = true)
    protected String pc02HJ05;

    /**
     * 获取pc02HS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HS01() {
        return pc02HS01;
    }

    /**
     * 设置pc02HS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HS01(String value) {
        this.pc02HS01 = value;
    }

    /**
     * 获取pc02HS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HS02() {
        return pc02HS02;
    }

    /**
     * 设置pc02HS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HS02(String value) {
        this.pc02HS02 = value;
    }

    /**
     * 获取pc02HJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HJ01() {
        return pc02HJ01;
    }

    /**
     * 设置pc02HJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HJ01(String value) {
        this.pc02HJ01 = value;
    }

    /**
     * 获取pc02HJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HJ02() {
        return pc02HJ02;
    }

    /**
     * 设置pc02HJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HJ02(String value) {
        this.pc02HJ02 = value;
    }

    /**
     * 获取pc02HJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HJ03() {
        return pc02HJ03;
    }

    /**
     * 设置pc02HJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HJ03(String value) {
        this.pc02HJ03 = value;
    }

    /**
     * 获取pc02HJ04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HJ04() {
        return pc02HJ04;
    }

    /**
     * 设置pc02HJ04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HJ04(String value) {
        this.pc02HJ04 = value;
    }

    /**
     * 获取pc02HJ05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02HJ05() {
        return pc02HJ05;
    }

    /**
     * 设置pc02HJ05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02HJ05(String value) {
        this.pc02HJ05 = value;
    }

}
