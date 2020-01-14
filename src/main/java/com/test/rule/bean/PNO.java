
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
 *         &lt;element ref="{}PC03"/>
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
    "pc03"
})
@XmlRootElement(name = "PNO")
public class PNO {

    @XmlElement(name = "PC03", required = true)
    protected PC03 pc03;

    /**
     * 获取pc03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC03 }
     *     
     */
    public PC03 getPC03() {
        return pc03;
    }

    /**
     * 设置pc03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC03 }
     *     
     */
    public void setPC03(PC03 value) {
        this.pc03 = value;
    }

}
