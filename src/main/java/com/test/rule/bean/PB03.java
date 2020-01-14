
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
 *         &lt;element ref="{}PB030D01"/>
 *         &lt;element ref="{}PB030Q01"/>
 *         &lt;element ref="{}PB030Q02"/>
 *         &lt;element ref="{}PB030R01"/>
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
    "pb030D01",
    "pb030Q01",
    "pb030Q02",
    "pb030R01"
})
@XmlRootElement(name = "PB03")
public class PB03 {

    @XmlElement(name = "PB030D01", required = true)
    protected String pb030D01;
    @XmlElement(name = "PB030Q01", required = true)
    protected String pb030Q01;
    @XmlElement(name = "PB030Q02", required = true)
    protected String pb030Q02;
    @XmlElement(name = "PB030R01", required = true)
    protected String pb030R01;

    /**
     * 获取pb030D01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB030D01() {
        return pb030D01;
    }

    /**
     * 设置pb030D01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB030D01(String value) {
        this.pb030D01 = value;
    }

    /**
     * 获取pb030Q01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB030Q01() {
        return pb030Q01;
    }

    /**
     * 设置pb030Q01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB030Q01(String value) {
        this.pb030Q01 = value;
    }

    /**
     * 获取pb030Q02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB030Q02() {
        return pb030Q02;
    }

    /**
     * 设置pb030Q02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB030Q02(String value) {
        this.pb030Q02 = value;
    }

    /**
     * 获取pb030R01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB030R01() {
        return pb030R01;
    }

    /**
     * 设置pb030R01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB030R01(String value) {
        this.pb030R01 = value;
    }

}
