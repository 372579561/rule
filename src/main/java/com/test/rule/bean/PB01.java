
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
 *         &lt;element ref="{}PB01A"/>
 *         &lt;element ref="{}PB01B"/>
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
    "pb01A",
    "pb01B"
})
@XmlRootElement(name = "PB01")
public class PB01 {

    @XmlElement(name = "PB01A", required = true)
    protected PB01A pb01A;
    @XmlElement(name = "PB01B", required = true)
    protected PB01B pb01B;

    /**
     * 获取pb01A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PB01A }
     *     
     */
    public PB01A getPB01A() {
        return pb01A;
    }

    /**
     * 设置pb01A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PB01A }
     *     
     */
    public void setPB01A(PB01A value) {
        this.pb01A = value;
    }

    /**
     * 获取pb01B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PB01B }
     *     
     */
    public PB01B getPB01B() {
        return pb01B;
    }

    /**
     * 设置pb01B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PB01B }
     *     
     */
    public void setPB01B(PB01B value) {
        this.pb01B = value;
    }

}
