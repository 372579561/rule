
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
 *         &lt;element ref="{}PF06A"/>
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
    "pf06A"
})
@XmlRootElement(name = "PF06")
public class PF06 {

    @XmlElement(name = "PF06A", required = true)
    protected PF06A pf06A;

    /**
     * 获取pf06A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF06A }
     *     
     */
    public PF06A getPF06A() {
        return pf06A;
    }

    /**
     * 设置pf06A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF06A }
     *     
     */
    public void setPF06A(PF06A value) {
        this.pf06A = value;
    }

}
