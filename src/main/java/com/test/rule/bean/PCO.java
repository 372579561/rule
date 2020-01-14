
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
 *         &lt;element ref="{}PC02"/>
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
    "pc02"
})
@XmlRootElement(name = "PCO")
public class PCO {

    @XmlElement(name = "PC02", required = true)
    protected PC02 pc02;

    /**
     * 获取pc02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC02 }
     *     
     */
    public PC02 getPC02() {
        return pc02;
    }

    /**
     * 设置pc02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC02 }
     *     
     */
    public void setPC02(PC02 value) {
        this.pc02 = value;
    }

}
