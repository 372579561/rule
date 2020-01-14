
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
 *         &lt;element ref="{}PC02BD01"/>
 *         &lt;element ref="{}PC02BS03"/>
 *         &lt;element ref="{}PC02BJ02"/>
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
    "pc02BD01",
    "pc02BS03",
    "pc02BJ02"
})
@XmlRootElement(name = "PC02BH")
public class PC02BH {

    @XmlElement(name = "PC02BD01", required = true)
    protected String pc02BD01;
    @XmlElement(name = "PC02BS03", required = true)
    protected String pc02BS03;
    @XmlElement(name = "PC02BJ02", required = true)
    protected String pc02BJ02;

    /**
     * 获取pc02BD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02BD01() {
        return pc02BD01;
    }

    /**
     * 设置pc02BD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02BD01(String value) {
        this.pc02BD01 = value;
    }

    /**
     * 获取pc02BS03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02BS03() {
        return pc02BS03;
    }

    /**
     * 设置pc02BS03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02BS03(String value) {
        this.pc02BS03 = value;
    }

    /**
     * 获取pc02BJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02BJ02() {
        return pc02BJ02;
    }

    /**
     * 设置pc02BJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02BJ02(String value) {
        this.pc02BJ02 = value;
    }

}
