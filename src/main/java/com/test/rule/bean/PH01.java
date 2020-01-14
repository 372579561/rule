
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
 *         &lt;element ref="{}PH010R01"/>
 *         &lt;element ref="{}PH010D01"/>
 *         &lt;element ref="{}PH010Q02"/>
 *         &lt;element ref="{}PH010Q03"/>
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
    "ph010R01",
    "ph010D01",
    "ph010Q02",
    "ph010Q03"
})
@XmlRootElement(name = "PH01")
public class PH01 {

    @XmlElement(name = "PH010R01", required = true)
    protected String ph010R01;
    @XmlElement(name = "PH010D01", required = true)
    protected String ph010D01;
    @XmlElement(name = "PH010Q02", required = true)
    protected String ph010Q02;
    @XmlElement(name = "PH010Q03", required = true)
    protected String ph010Q03;

    /**
     * 获取ph010R01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH010R01() {
        return ph010R01;
    }

    /**
     * 设置ph010R01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH010R01(String value) {
        this.ph010R01 = value;
    }

    /**
     * 获取ph010D01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH010D01() {
        return ph010D01;
    }

    /**
     * 设置ph010D01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH010D01(String value) {
        this.ph010D01 = value;
    }

    /**
     * 获取ph010Q02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH010Q02() {
        return ph010Q02;
    }

    /**
     * 设置ph010Q02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH010Q02(String value) {
        this.ph010Q02 = value;
    }

    /**
     * 获取ph010Q03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH010Q03() {
        return ph010Q03;
    }

    /**
     * 设置ph010Q03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH010Q03(String value) {
        this.ph010Q03 = value;
    }

}
