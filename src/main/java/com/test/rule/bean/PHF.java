
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
 *         &lt;element ref="{}PF05"/>
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
    "pf05"
})
@XmlRootElement(name = "PHF")
public class PHF {

    @XmlElement(name = "PF05", required = true)
    protected PF05 pf05;

    /**
     * 获取pf05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF05 }
     *     
     */
    public PF05 getPF05() {
        return pf05;
    }

    /**
     * 设置pf05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF05 }
     *     
     */
    public void setPF05(PF05 value) {
        this.pf05 = value;
    }

}
