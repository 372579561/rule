
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
 *         &lt;element ref="{}PF04A"/>
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
    "pf04A"
})
@XmlRootElement(name = "PF04")
public class PF04 {

    @XmlElement(name = "PF04A", required = true)
    protected PF04A pf04A;

    /**
     * 获取pf04A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF04A }
     *     
     */
    public PF04A getPF04A() {
        return pf04A;
    }

    /**
     * 设置pf04A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF04A }
     *     
     */
    public void setPF04A(PF04A value) {
        this.pf04A = value;
    }

}
