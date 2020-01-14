
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
 *         &lt;element ref="{}PD02A"/>
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
    "pd02A"
})
@XmlRootElement(name = "PD02")
public class PD02 {

    @XmlElement(name = "PD02A", required = true)
    protected PD02A pd02A;

    /**
     * 获取pd02A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PD02A }
     *     
     */
    public PD02A getPD02A() {
        return pd02A;
    }

    /**
     * 设置pd02A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PD02A }
     *     
     */
    public void setPD02A(PD02A value) {
        this.pd02A = value;
    }

}
