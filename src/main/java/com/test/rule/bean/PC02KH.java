
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
 *         &lt;element ref="{}PC02KD01"/>
 *         &lt;element ref="{}PC02KD02"/>
 *         &lt;element ref="{}PC02KS02"/>
 *         &lt;element ref="{}PC02KJ01"/>
 *         &lt;element ref="{}PC02KJ02"/>
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
    "pc02KD01",
    "pc02KD02",
    "pc02KS02",
    "pc02KJ01",
    "pc02KJ02"
})
@XmlRootElement(name = "PC02KH")
public class PC02KH {

    @XmlElement(name = "PC02KD01", required = true)
    protected String pc02KD01;
    @XmlElement(name = "PC02KD02", required = true)
    protected String pc02KD02;
    @XmlElement(name = "PC02KS02", required = true)
    protected String pc02KS02;
    @XmlElement(name = "PC02KJ01", required = true)
    protected String pc02KJ01;
    @XmlElement(name = "PC02KJ02", required = true)
    protected String pc02KJ02;

    /**
     * 获取pc02KD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02KD01() {
        return pc02KD01;
    }

    /**
     * 设置pc02KD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02KD01(String value) {
        this.pc02KD01 = value;
    }

    /**
     * 获取pc02KD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02KD02() {
        return pc02KD02;
    }

    /**
     * 设置pc02KD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02KD02(String value) {
        this.pc02KD02 = value;
    }

    /**
     * 获取pc02KS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02KS02() {
        return pc02KS02;
    }

    /**
     * 设置pc02KS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02KS02(String value) {
        this.pc02KS02 = value;
    }

    /**
     * 获取pc02KJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02KJ01() {
        return pc02KJ01;
    }

    /**
     * 设置pc02KJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02KJ01(String value) {
        this.pc02KJ01 = value;
    }

    /**
     * 获取pc02KJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02KJ02() {
        return pc02KJ02;
    }

    /**
     * 设置pc02KJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02KJ02(String value) {
        this.pc02KJ02 = value;
    }

}
