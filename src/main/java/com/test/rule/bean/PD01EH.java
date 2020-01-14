
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
 *         &lt;element ref="{}PD01ER03"/>
 *         &lt;element ref="{}PD01ED01"/>
 *         &lt;element ref="{}PD01EJ01"/>
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
    "pd01ER03",
    "pd01ED01",
    "pd01EJ01"
})
@XmlRootElement(name = "PD01EH")
public class PD01EH {

    @XmlElement(name = "PD01ER03", required = true)
    protected String pd01ER03;
    @XmlElement(name = "PD01ED01", required = true)
    protected String pd01ED01;
    @XmlElement(name = "PD01EJ01", required = true)
    protected String pd01EJ01;

    /**
     * 获取pd01ER03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ER03() {
        return pd01ER03;
    }

    /**
     * 设置pd01ER03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ER03(String value) {
        this.pd01ER03 = value;
    }

    /**
     * 获取pd01ED01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ED01() {
        return pd01ED01;
    }

    /**
     * 设置pd01ED01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ED01(String value) {
        this.pd01ED01 = value;
    }

    /**
     * 获取pd01EJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01EJ01() {
        return pd01EJ01;
    }

    /**
     * 设置pd01EJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01EJ01(String value) {
        this.pd01EJ01 = value;
    }

}
