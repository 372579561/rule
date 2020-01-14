
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
 *         &lt;element ref="{}PC04"/>
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
    "pc04"
})
@XmlRootElement(name = "PPO")
public class PPO {

    @XmlElement(name = "PC04", required = true)
    protected PC04 pc04;

    /**
     * 获取pc04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PC04 }
     *     
     */
    public PC04 getPC04() {
        return pc04;
    }

    /**
     * 设置pc04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PC04 }
     *     
     */
    public void setPC04(PC04 value) {
        this.pc04 = value;
    }

}
