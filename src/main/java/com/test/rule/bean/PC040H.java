
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
 *         &lt;element ref="{}PC040D01"/>
 *         &lt;element ref="{}PC040S02"/>
 *         &lt;element ref="{}PC040J01"/>
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
    "pc040D01",
    "pc040S02",
    "pc040J01"
})
@XmlRootElement(name = "PC040H")
public class PC040H {

    @XmlElement(name = "PC040D01", required = true)
    protected String pc040D01;
    @XmlElement(name = "PC040S02", required = true)
    protected String pc040S02;
    @XmlElement(name = "PC040J01", required = true)
    protected String pc040J01;

    /**
     * 获取pc040D01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC040D01() {
        return pc040D01;
    }

    /**
     * 设置pc040D01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC040D01(String value) {
        this.pc040D01 = value;
    }

    /**
     * 获取pc040S02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC040S02() {
        return pc040S02;
    }

    /**
     * 设置pc040S02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC040S02(String value) {
        this.pc040S02 = value;
    }

    /**
     * 获取pc040J01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC040J01() {
        return pc040J01;
    }

    /**
     * 设置pc040J01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC040J01(String value) {
        this.pc040J01 = value;
    }

}
