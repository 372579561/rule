
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
 *         &lt;element ref="{}PC02DD01"/>
 *         &lt;element ref="{}PC02DS02"/>
 *         &lt;element ref="{}PC02DS03"/>
 *         &lt;element ref="{}PC02DJ01"/>
 *         &lt;element ref="{}PC02DS04"/>
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
    "pc02DD01",
    "pc02DS02",
    "pc02DS03",
    "pc02DJ01",
    "pc02DS04"
})
@XmlRootElement(name = "PC02DH")
public class PC02DH {

    @XmlElement(name = "PC02DD01", required = true)
    protected String pc02DD01;
    @XmlElement(name = "PC02DS02", required = true)
    protected String pc02DS02;
    @XmlElement(name = "PC02DS03", required = true)
    protected String pc02DS03;
    @XmlElement(name = "PC02DJ01", required = true)
    protected String pc02DJ01;
    @XmlElement(name = "PC02DS04", required = true)
    protected String pc02DS04;

    /**
     * 获取pc02DD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02DD01() {
        return pc02DD01;
    }

    /**
     * 设置pc02DD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02DD01(String value) {
        this.pc02DD01 = value;
    }

    /**
     * 获取pc02DS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02DS02() {
        return pc02DS02;
    }

    /**
     * 设置pc02DS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02DS02(String value) {
        this.pc02DS02 = value;
    }

    /**
     * 获取pc02DS03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02DS03() {
        return pc02DS03;
    }

    /**
     * 设置pc02DS03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02DS03(String value) {
        this.pc02DS03 = value;
    }

    /**
     * 获取pc02DJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02DJ01() {
        return pc02DJ01;
    }

    /**
     * 设置pc02DJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02DJ01(String value) {
        this.pc02DJ01 = value;
    }

    /**
     * 获取pc02DS04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02DS04() {
        return pc02DS04;
    }

    /**
     * 设置pc02DS04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02DS04(String value) {
        this.pc02DS04 = value;
    }

}
