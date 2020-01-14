
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
 *         &lt;element ref="{}PE01A"/>
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
    "pe01A"
})
@XmlRootElement(name = "PE01")
public class PE01 {

    @XmlElement(name = "PE01A", required = true)
    protected PE01A pe01A;

    /**
     * 获取pe01A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PE01A }
     *     
     */
    public PE01A getPE01A() {
        return pe01A;
    }

    /**
     * 设置pe01A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PE01A }
     *     
     */
    public void setPE01A(PE01A value) {
        this.pe01A = value;
    }

}
