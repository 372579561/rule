
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
 *         &lt;element ref="{}PA01"/>
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
    "pa01"
})
@XmlRootElement(name = "PRH")
public class PRH {

    @XmlElement(name = "PA01", required = true)
    protected PA01 pa01;

    /**
     * 获取pa01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PA01 }
     *     
     */
    public PA01 getPA01() {
        return pa01;
    }

    /**
     * 设置pa01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PA01 }
     *     
     */
    public void setPA01(PA01 value) {
        this.pa01 = value;
    }

}
