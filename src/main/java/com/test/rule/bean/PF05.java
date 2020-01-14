
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
 *         &lt;element ref="{}PF05A"/>
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
    "pf05A"
})
@XmlRootElement(name = "PF05")
public class PF05 {

    @XmlElement(name = "PF05A", required = true)
    protected PF05A pf05A;

    /**
     * 获取pf05A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF05A }
     *     
     */
    public PF05A getPF05A() {
        return pf05A;
    }

    /**
     * 设置pf05A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF05A }
     *     
     */
    public void setPF05A(PF05A value) {
        this.pf05A = value;
    }

}
