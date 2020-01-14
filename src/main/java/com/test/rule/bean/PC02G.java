
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
 *         &lt;element ref="{}PC02GS01"/>
 *         &lt;element ref="{}PC02GS02"/>
 *         &lt;element ref="{}PC02GJ01"/>
 *         &lt;element ref="{}PC02GJ02"/>
 *         &lt;element ref="{}PC02GJ03"/>
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
    "pc02GS01",
    "pc02GS02",
    "pc02GJ01",
    "pc02GJ02",
    "pc02GJ03"
})
@XmlRootElement(name = "PC02G")
public class PC02G {

    @XmlElement(name = "PC02GS01", required = true)
    protected String pc02GS01;
    @XmlElement(name = "PC02GS02", required = true)
    protected String pc02GS02;
    @XmlElement(name = "PC02GJ01", required = true)
    protected String pc02GJ01;
    @XmlElement(name = "PC02GJ02", required = true)
    protected String pc02GJ02;
    @XmlElement(name = "PC02GJ03", required = true)
    protected String pc02GJ03;

    /**
     * 获取pc02GS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02GS01() {
        return pc02GS01;
    }

    /**
     * 设置pc02GS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02GS01(String value) {
        this.pc02GS01 = value;
    }

    /**
     * 获取pc02GS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02GS02() {
        return pc02GS02;
    }

    /**
     * 设置pc02GS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02GS02(String value) {
        this.pc02GS02 = value;
    }

    /**
     * 获取pc02GJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02GJ01() {
        return pc02GJ01;
    }

    /**
     * 设置pc02GJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02GJ01(String value) {
        this.pc02GJ01 = value;
    }

    /**
     * 获取pc02GJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02GJ02() {
        return pc02GJ02;
    }

    /**
     * 设置pc02GJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02GJ02(String value) {
        this.pc02GJ02 = value;
    }

    /**
     * 获取pc02GJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02GJ03() {
        return pc02GJ03;
    }

    /**
     * 设置pc02GJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02GJ03(String value) {
        this.pc02GJ03 = value;
    }

}
