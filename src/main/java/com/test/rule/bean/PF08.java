
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
 *         &lt;element ref="{}PF08A"/>
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
    "pf08A"
})
@XmlRootElement(name = "PF08")
public class PF08 {

    @XmlElement(name = "PF08A", required = true)
    protected PF08A pf08A;

    /**
     * 获取pf08A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF08A }
     *     
     */
    public PF08A getPF08A() {
        return pf08A;
    }

    /**
     * 设置pf08A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF08A }
     *     
     */
    public void setPF08A(PF08A value) {
        this.pf08A = value;
    }

}
