
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
 *         &lt;element ref="{}PC02ES01"/>
 *         &lt;element ref="{}PC02ES02"/>
 *         &lt;element ref="{}PC02EJ01"/>
 *         &lt;element ref="{}PC02EJ02"/>
 *         &lt;element ref="{}PC02EJ03"/>
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
    "pc02ES01",
    "pc02ES02",
    "pc02EJ01",
    "pc02EJ02",
    "pc02EJ03"
})
@XmlRootElement(name = "PC02E")
public class PC02E {

    @XmlElement(name = "PC02ES01", required = true)
    protected String pc02ES01;
    @XmlElement(name = "PC02ES02", required = true)
    protected String pc02ES02;
    @XmlElement(name = "PC02EJ01", required = true)
    protected String pc02EJ01;
    @XmlElement(name = "PC02EJ02", required = true)
    protected String pc02EJ02;
    @XmlElement(name = "PC02EJ03", required = true)
    protected String pc02EJ03;

    /**
     * 获取pc02ES01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02ES01() {
        return pc02ES01;
    }

    /**
     * 设置pc02ES01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02ES01(String value) {
        this.pc02ES01 = value;
    }

    /**
     * 获取pc02ES02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02ES02() {
        return pc02ES02;
    }

    /**
     * 设置pc02ES02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02ES02(String value) {
        this.pc02ES02 = value;
    }

    /**
     * 获取pc02EJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02EJ01() {
        return pc02EJ01;
    }

    /**
     * 设置pc02EJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02EJ01(String value) {
        this.pc02EJ01 = value;
    }

    /**
     * 获取pc02EJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02EJ02() {
        return pc02EJ02;
    }

    /**
     * 设置pc02EJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02EJ02(String value) {
        this.pc02EJ02 = value;
    }

    /**
     * 获取pc02EJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02EJ03() {
        return pc02EJ03;
    }

    /**
     * 设置pc02EJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02EJ03(String value) {
        this.pc02EJ03 = value;
    }

}
