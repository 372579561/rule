
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
 *         &lt;element ref="{}PC02AD01"/>
 *         &lt;element ref="{}PC02AD02"/>
 *         &lt;element ref="{}PC02AS03"/>
 *         &lt;element ref="{}PC02AR01"/>
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
    "pc02AD01",
    "pc02AD02",
    "pc02AS03",
    "pc02AR01"
})
@XmlRootElement(name = "PC02AH")
public class PC02AH {

    @XmlElement(name = "PC02AD01", required = true)
    protected String pc02AD01;
    @XmlElement(name = "PC02AD02", required = true)
    protected String pc02AD02;
    @XmlElement(name = "PC02AS03", required = true)
    protected String pc02AS03;
    @XmlElement(name = "PC02AR01", required = true)
    protected String pc02AR01;

    /**
     * 获取pc02AD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02AD01() {
        return pc02AD01;
    }

    /**
     * 设置pc02AD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02AD01(String value) {
        this.pc02AD01 = value;
    }

    /**
     * 获取pc02AD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02AD02() {
        return pc02AD02;
    }

    /**
     * 设置pc02AD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02AD02(String value) {
        this.pc02AD02 = value;
    }

    /**
     * 获取pc02AS03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02AS03() {
        return pc02AS03;
    }

    /**
     * 设置pc02AS03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02AS03(String value) {
        this.pc02AS03 = value;
    }

    /**
     * 获取pc02AR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02AR01() {
        return pc02AR01;
    }

    /**
     * 设置pc02AR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02AR01(String value) {
        this.pc02AR01 = value;
    }

}
