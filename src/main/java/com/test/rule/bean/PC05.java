
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
 *         &lt;element ref="{}PC05A"/>
 *         &lt;element ref="{}PC05B"/>
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
    "pc05A",
    "pc05B"
})
@XmlRootElement(name = "PC05")
public class PC05 {

    @XmlElement(name = "PC05A", required = true)
    protected PC05A pc05A;
    @XmlElement(name = "PC05B", required = true)
    protected PC05B pc05B;

    /**
     * 获取pc05A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC05A }
     *     
     */
    public PC05A getPC05A() {
        return pc05A;
    }

    /**
     * 设置pc05A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC05A }
     *     
     */
    public void setPC05A(PC05A value) {
        this.pc05A = value;
    }

    /**
     * 获取pc05B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC05B }
     *     
     */
    public PC05B getPC05B() {
        return pc05B;
    }

    /**
     * 设置pc05B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC05B }
     *     
     */
    public void setPC05B(PC05B value) {
        this.pc05B = value;
    }

}
