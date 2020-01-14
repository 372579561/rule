
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
 *         &lt;element ref="{}PF08"/>
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
    "pf08"
})
@XmlRootElement(name = "PAH")
public class PAH {

    @XmlElement(name = "PF08", required = true)
    protected PF08 pf08;

    /**
     * 获取pf08属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PF08 }
     *     
     */
    public PF08 getPF08() {
        return pf08;
    }

    /**
     * 设置pf08属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PF08 }
     *     
     */
    public void setPF08(PF08 value) {
        this.pf08 = value;
    }

}
