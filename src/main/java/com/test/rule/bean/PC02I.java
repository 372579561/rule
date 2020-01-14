
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
 *         &lt;element ref="{}PC02IS01"/>
 *         &lt;element ref="{}PC02IS02"/>
 *         &lt;element ref="{}PC02IJ01"/>
 *         &lt;element ref="{}PC02IJ02"/>
 *         &lt;element ref="{}PC02IJ03"/>
 *         &lt;element ref="{}PC02IJ04"/>
 *         &lt;element ref="{}PC02IJ05"/>
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
    "pc02IS01",
    "pc02IS02",
    "pc02IJ01",
    "pc02IJ02",
    "pc02IJ03",
    "pc02IJ04",
    "pc02IJ05"
})
@XmlRootElement(name = "PC02I")
public class PC02I {

    @XmlElement(name = "PC02IS01", required = true)
    protected String pc02IS01;
    @XmlElement(name = "PC02IS02", required = true)
    protected String pc02IS02;
    @XmlElement(name = "PC02IJ01", required = true)
    protected String pc02IJ01;
    @XmlElement(name = "PC02IJ02", required = true)
    protected String pc02IJ02;
    @XmlElement(name = "PC02IJ03", required = true)
    protected String pc02IJ03;
    @XmlElement(name = "PC02IJ04", required = true)
    protected String pc02IJ04;
    @XmlElement(name = "PC02IJ05", required = true)
    protected String pc02IJ05;

    /**
     * 获取pc02IS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IS01() {
        return pc02IS01;
    }

    /**
     * 设置pc02IS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IS01(String value) {
        this.pc02IS01 = value;
    }

    /**
     * 获取pc02IS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IS02() {
        return pc02IS02;
    }

    /**
     * 设置pc02IS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IS02(String value) {
        this.pc02IS02 = value;
    }

    /**
     * 获取pc02IJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IJ01() {
        return pc02IJ01;
    }

    /**
     * 设置pc02IJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IJ01(String value) {
        this.pc02IJ01 = value;
    }

    /**
     * 获取pc02IJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IJ02() {
        return pc02IJ02;
    }

    /**
     * 设置pc02IJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IJ02(String value) {
        this.pc02IJ02 = value;
    }

    /**
     * 获取pc02IJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IJ03() {
        return pc02IJ03;
    }

    /**
     * 设置pc02IJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IJ03(String value) {
        this.pc02IJ03 = value;
    }

    /**
     * 获取pc02IJ04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IJ04() {
        return pc02IJ04;
    }

    /**
     * 设置pc02IJ04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IJ04(String value) {
        this.pc02IJ04 = value;
    }

    /**
     * 获取pc02IJ05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02IJ05() {
        return pc02IJ05;
    }

    /**
     * 设置pc02IJ05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02IJ05(String value) {
        this.pc02IJ05 = value;
    }

}
