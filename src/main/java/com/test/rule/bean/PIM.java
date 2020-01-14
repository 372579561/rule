
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
 *         &lt;element ref="{}PB01"/>
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
    "pb01"
})
@XmlRootElement(name = "PIM")
public class PIM {

    @XmlElement(name = "PB01", required = true)
    protected PB01 pb01;

    /**
     * 获取pb01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PB01 }
     *     
     */
    public PB01 getPB01() {
        return pb01;
    }

    /**
     * 设置pb01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PB01 }
     *     
     */
    public void setPB01(PB01 value) {
        this.pb01 = value;
    }

}
