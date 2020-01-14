
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
 *         &lt;element ref="{}PC030D01"/>
 *         &lt;element ref="{}PC030S02"/>
 *         &lt;element ref="{}PC030J01"/>
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
    "pc030D01",
    "pc030S02",
    "pc030J01"
})
@XmlRootElement(name = "PC030H")
public class PC030H {

    @XmlElement(name = "PC030D01", required = true)
    protected String pc030D01;
    @XmlElement(name = "PC030S02", required = true)
    protected String pc030S02;
    @XmlElement(name = "PC030J01", required = true)
    protected String pc030J01;

    /**
     * 获取pc030D01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC030D01() {
        return pc030D01;
    }

    /**
     * 设置pc030D01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC030D01(String value) {
        this.pc030D01 = value;
    }

    /**
     * 获取pc030S02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC030S02() {
        return pc030S02;
    }

    /**
     * 设置pc030S02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC030S02(String value) {
        this.pc030S02 = value;
    }

    /**
     * 获取pc030J01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC030J01() {
        return pc030J01;
    }

    /**
     * 设置pc030J01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC030J01(String value) {
        this.pc030J01 = value;
    }

}
