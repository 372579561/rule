
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
 *         &lt;element ref="{}PF07"/>
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
    "pf07"
})
@XmlRootElement(name = "PPQ")
public class PPQ {

    @XmlElement(name = "PF07", required = true)
    protected PF07 pf07;

    /**
     * 获取pf07属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF07 }
     *     
     */
    public PF07 getPF07() {
        return pf07;
    }

    /**
     * 设置pf07属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF07 }
     *     
     */
    public void setPF07(PF07 value) {
        this.pf07 = value;
    }

}
