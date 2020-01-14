
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
 *         &lt;element ref="{}PC02FS01"/>
 *         &lt;element ref="{}PC02FS02"/>
 *         &lt;element ref="{}PC02FJ01"/>
 *         &lt;element ref="{}PC02FJ02"/>
 *         &lt;element ref="{}PC02FJ03"/>
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
    "pc02FS01",
    "pc02FS02",
    "pc02FJ01",
    "pc02FJ02",
    "pc02FJ03"
})
@XmlRootElement(name = "PC02F")
public class PC02F {

    @XmlElement(name = "PC02FS01", required = true)
    protected String pc02FS01;
    @XmlElement(name = "PC02FS02", required = true)
    protected String pc02FS02;
    @XmlElement(name = "PC02FJ01", required = true)
    protected String pc02FJ01;
    @XmlElement(name = "PC02FJ02", required = true)
    protected String pc02FJ02;
    @XmlElement(name = "PC02FJ03", required = true)
    protected String pc02FJ03;

    /**
     * 获取pc02FS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02FS01() {
        return pc02FS01;
    }

    /**
     * 设置pc02FS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02FS01(String value) {
        this.pc02FS01 = value;
    }

    /**
     * 获取pc02FS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02FS02() {
        return pc02FS02;
    }

    /**
     * 设置pc02FS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02FS02(String value) {
        this.pc02FS02 = value;
    }

    /**
     * 获取pc02FJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02FJ01() {
        return pc02FJ01;
    }

    /**
     * 设置pc02FJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02FJ01(String value) {
        this.pc02FJ01 = value;
    }

    /**
     * 获取pc02FJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02FJ02() {
        return pc02FJ02;
    }

    /**
     * 设置pc02FJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02FJ02(String value) {
        this.pc02FJ02 = value;
    }

    /**
     * 获取pc02FJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02FJ03() {
        return pc02FJ03;
    }

    /**
     * 设置pc02FJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02FJ03(String value) {
        this.pc02FJ03 = value;
    }

}
