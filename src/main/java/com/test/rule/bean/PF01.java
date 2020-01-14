
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
 *         &lt;element ref="{}PF01A"/>
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
    "pf01A"
})
@XmlRootElement(name = "PF01")
public class PF01 {

    @XmlElement(name = "PF01A", required = true)
    protected PF01A pf01A;

    /**
     * 获取pf01A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF01A }
     *     
     */
    public PF01A getPF01A() {
        return pf01A;
    }

    /**
     * 设置pf01A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF01A }
     *     
     */
    public void setPF01A(PF01A value) {
        this.pf01A = value;
    }

}
