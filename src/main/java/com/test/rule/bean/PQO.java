
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
 *         &lt;element ref="{}PC05"/>
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
    "pc05"
})
@XmlRootElement(name = "PQO")
public class PQO {

    @XmlElement(name = "PC05", required = true)
    protected PC05 pc05;

    /**
     * 获取pc05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC05 }
     *     
     */
    public PC05 getPC05() {
        return pc05;
    }

    /**
     * 设置pc05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC05 }
     *     
     */
    public void setPC05(PC05 value) {
        this.pc05 = value;
    }

}
