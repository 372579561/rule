
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
 *         &lt;element ref="{}PD01HJ01"/>
 *         &lt;element ref="{}PD01HR01"/>
 *         &lt;element ref="{}PD01HR02"/>
 *         &lt;element ref="{}PD01HJ02"/>
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
    "pd01HJ01",
    "pd01HR01",
    "pd01HR02",
    "pd01HJ02"
})
@XmlRootElement(name = "PD01HH")
public class PD01HH {

    @XmlElement(name = "PD01HJ01", required = true)
    protected String pd01HJ01;
    @XmlElement(name = "PD01HR01", required = true)
    protected String pd01HR01;
    @XmlElement(name = "PD01HR02", required = true)
    protected String pd01HR02;
    @XmlElement(name = "PD01HJ02", required = true)
    protected String pd01HJ02;

    /**
     * 获取pd01HJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01HJ01() {
        return pd01HJ01;
    }

    /**
     * 设置pd01HJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01HJ01(String value) {
        this.pd01HJ01 = value;
    }

    /**
     * 获取pd01HR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01HR01() {
        return pd01HR01;
    }

    /**
     * 设置pd01HR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01HR01(String value) {
        this.pd01HR01 = value;
    }

    /**
     * 获取pd01HR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01HR02() {
        return pd01HR02;
    }

    /**
     * 设置pd01HR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01HR02(String value) {
        this.pd01HR02 = value;
    }

    /**
     * 获取pd01HJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01HJ02() {
        return pd01HJ02;
    }

    /**
     * 设置pd01HJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01HJ02(String value) {
        this.pd01HJ02 = value;
    }

}
