
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
 *         &lt;element ref="{}PF06"/>
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
    "pf06"
})
@XmlRootElement(name = "PBS")
public class PBS {

    @XmlElement(name = "PF06", required = true)
    protected PF06 pf06;

    /**
     * 获取pf06属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF06 }
     *     
     */
    public PF06 getPF06() {
        return pf06;
    }

    /**
     * 设置pf06属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF06 }
     *     
     */
    public void setPF06(PF06 value) {
        this.pf06 = value;
    }

}
