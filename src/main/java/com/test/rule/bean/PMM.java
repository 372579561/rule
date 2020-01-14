
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
 *         &lt;element ref="{}PB02"/>
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
    "pb02"
})
@XmlRootElement(name = "PMM")
public class PMM {

    @XmlElement(name = "PB02", required = true)
    protected PB02 pb02;

    /**
     * 获取pb02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PB02 }
     *     
     */
    public PB02 getPB02() {
        return pb02;
    }

    /**
     * 设置pb02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PB02 }
     *     
     */
    public void setPB02(PB02 value) {
        this.pb02 = value;
    }

}
