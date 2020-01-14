
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
 *         &lt;element ref="{}PF07A"/>
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
    "pf07A"
})
@XmlRootElement(name = "PF07")
public class PF07 {

    @XmlElement(name = "PF07A", required = true)
    protected PF07A pf07A;

    /**
     * 获取pf07A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF07A }
     *     
     */
    public PF07A getPF07A() {
        return pf07A;
    }

    /**
     * 设置pf07A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF07A }
     *     
     */
    public void setPF07A(PF07A value) {
        this.pf07A = value;
    }

}
