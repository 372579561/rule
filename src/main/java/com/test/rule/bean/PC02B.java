
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
 *         &lt;element ref="{}PC02BS01"/>
 *         &lt;element ref="{}PC02BJ01"/>
 *         &lt;element ref="{}PC02BS02"/>
 *         &lt;element ref="{}PC02BH"/>
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
    "pc02BS01",
    "pc02BJ01",
    "pc02BS02",
    "pc02BH"
})
@XmlRootElement(name = "PC02B")
public class PC02B {

    @XmlElement(name = "PC02BS01", required = true)
    protected String pc02BS01;
    @XmlElement(name = "PC02BJ01", required = true)
    protected String pc02BJ01;
    @XmlElement(name = "PC02BS02", required = true)
    protected String pc02BS02;
    @XmlElement(name = "PC02BH", required = true)
    protected PC02BH pc02BH;

    /**
     * 获取pc02BS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02BS01() {
        return pc02BS01;
    }

    /**
     * 设置pc02BS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02BS01(String value) {
        this.pc02BS01 = value;
    }

    /**
     * 获取pc02BJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02BJ01() {
        return pc02BJ01;
    }

    /**
     * 设置pc02BJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02BJ01(String value) {
        this.pc02BJ01 = value;
    }

    /**
     * 获取pc02BS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02BS02() {
        return pc02BS02;
    }

    /**
     * 设置pc02BS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02BS02(String value) {
        this.pc02BS02 = value;
    }

    /**
     * 获取pc02BH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC02BH }
     *     
     */
    public PC02BH getPC02BH() {
        return pc02BH;
    }

    /**
     * 设置pc02BH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC02BH }
     *     
     */
    public void setPC02BH(PC02BH value) {
        this.pc02BH = value;
    }

}
