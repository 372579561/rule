
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
 *         &lt;element ref="{}PF03A"/>
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
    "pf03A"
})
@XmlRootElement(name = "PF03")
public class PF03 {

    @XmlElement(name = "PF03A", required = true)
    protected PF03A pf03A;

    /**
     * 获取pf03A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF03A }
     *     
     */
    public PF03A getPF03A() {
        return pf03A;
    }

    /**
     * 设置pf03A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF03A }
     *     
     */
    public void setPF03A(PF03A value) {
        this.pf03A = value;
    }

}
