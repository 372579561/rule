
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
 *         &lt;element ref="{}PF03"/>
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
    "pf03"
})
@XmlRootElement(name = "PCE")
public class PCE {

    @XmlElement(name = "PF03", required = true)
    protected PF03 pf03;

    /**
     * 获取pf03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF03 }
     *     
     */
    public PF03 getPF03() {
        return pf03;
    }

    /**
     * 设置pf03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF03 }
     *     
     */
    public void setPF03(PF03 value) {
        this.pf03 = value;
    }

}
