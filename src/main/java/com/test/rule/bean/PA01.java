
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
 *         &lt;element ref="{}PA01A"/>
 *         &lt;element ref="{}PA01B"/>
 *         &lt;element ref="{}PA01D"/>
 *         &lt;element ref="{}PA01E"/>
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
    "pa01A",
    "pa01B",
    "pa01D",
    "pa01E"
})
@XmlRootElement(name = "PA01")
public class PA01 {

    @XmlElement(name = "PA01A", required = true)
    protected PA01A pa01A;
    @XmlElement(name = "PA01B", required = true)
    protected PA01B pa01B;
    @XmlElement(name = "PA01D", required = true)
    protected PA01D pa01D;
    @XmlElement(name = "PA01E", required = true)
    protected PA01E pa01E;

    /**
     * 获取pa01A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PA01A }
     *     
     */
    public PA01A getPA01A() {
        return pa01A;
    }

    /**
     * 设置pa01A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PA01A }
     *     
     */
    public void setPA01A(PA01A value) {
        this.pa01A = value;
    }

    /**
     * 获取pa01B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PA01B }
     *     
     */
    public PA01B getPA01B() {
        return pa01B;
    }

    /**
     * 设置pa01B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PA01B }
     *     
     */
    public void setPA01B(PA01B value) {
        this.pa01B = value;
    }

    /**
     * 获取pa01D属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PA01D }
     *     
     */
    public PA01D getPA01D() {
        return pa01D;
    }

    /**
     * 设置pa01D属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PA01D }
     *     
     */
    public void setPA01D(PA01D value) {
        this.pa01D = value;
    }

    /**
     * 获取pa01E属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PA01E }
     *     
     */
    public PA01E getPA01E() {
        return pa01E;
    }

    /**
     * 设置pa01E属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PA01E }
     *     
     */
    public void setPA01E(PA01E value) {
        this.pa01E = value;
    }

}
