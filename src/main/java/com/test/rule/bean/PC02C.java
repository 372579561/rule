
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
 *         &lt;element ref="{}PC02CS01"/>
 *         &lt;element ref="{}PC02CJ01"/>
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
    "pc02CS01",
    "pc02CJ01"
})
@XmlRootElement(name = "PC02C")
public class PC02C {

    @XmlElement(name = "PC02CS01", required = true)
    protected String pc02CS01;
    @XmlElement(name = "PC02CJ01", required = true)
    protected String pc02CJ01;

    /**
     * 获取pc02CS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02CS01() {
        return pc02CS01;
    }

    /**
     * 设置pc02CS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02CS01(String value) {
        this.pc02CS01 = value;
    }

    /**
     * 获取pc02CJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02CJ01() {
        return pc02CJ01;
    }

    /**
     * 设置pc02CJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02CJ01(String value) {
        this.pc02CJ01 = value;
    }

}
