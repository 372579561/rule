
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
 *         &lt;element ref="{}PB01BQ01"/>
 *         &lt;element ref="{}PB01BR01"/>
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
    "pb01BQ01",
    "pb01BR01"
})
@XmlRootElement(name = "PB01BH")
public class PB01BH {

    @XmlElement(name = "PB01BQ01", required = true)
    protected String pb01BQ01;
    @XmlElement(name = "PB01BR01", required = true)
    protected String pb01BR01;

    /**
     * 获取pb01BQ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01BQ01() {
        return pb01BQ01;
    }

    /**
     * 设置pb01BQ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01BQ01(String value) {
        this.pb01BQ01 = value;
    }

    /**
     * 获取pb01BR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01BR01() {
        return pb01BR01;
    }

    /**
     * 设置pb01BR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01BR01(String value) {
        this.pb01BR01 = value;
    }

}
