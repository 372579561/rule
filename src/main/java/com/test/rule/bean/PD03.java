
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
 *         &lt;element ref="{}PD03A"/>
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
    "pd03A"
})
@XmlRootElement(name = "PD03")
public class PD03 {

    @XmlElement(name = "PD03A", required = true)
    protected PD03A pd03A;

    /**
     * 获取pd03A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PD03A }
     *     
     */
    public PD03A getPD03A() {
        return pd03A;
    }

    /**
     * 设置pd03A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PD03A }
     *     
     */
    public void setPD03A(PD03A value) {
        this.pd03A = value;
    }

}
