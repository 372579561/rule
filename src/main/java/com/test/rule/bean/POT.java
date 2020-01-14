
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
 *         &lt;element ref="{}PF01"/>
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
    "pf01"
})
@XmlRootElement(name = "POT")
public class POT {

    @XmlElement(name = "PF01", required = true)
    protected PF01 pf01;

    /**
     * 获取pf01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF01 }
     *     
     */
    public PF01 getPF01() {
        return pf01;
    }

    /**
     * 设置pf01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF01 }
     *     
     */
    public void setPF01(PF01 value) {
        this.pf01 = value;
    }

}
