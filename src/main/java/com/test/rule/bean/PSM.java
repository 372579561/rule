
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
 *         &lt;element ref="{}PC01"/>
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
    "pc01"
})
@XmlRootElement(name = "PSM")
public class PSM {

    @XmlElement(name = "PC01", required = true)
    protected PC01 pc01;

    /**
     * 获取pc01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC01 }
     *     
     */
    public PC01 getPC01() {
        return pc01;
    }

    /**
     * 设置pc01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC01 }
     *     
     */
    public void setPC01(PC01 value) {
        this.pc01 = value;
    }

}
