
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
 *         &lt;element ref="{}PB020D01"/>
 *         &lt;element ref="{}PB020Q01"/>
 *         &lt;element ref="{}PB020D02"/>
 *         &lt;element ref="{}PB020I01"/>
 *         &lt;element ref="{}PB020Q02"/>
 *         &lt;element ref="{}PB020Q03"/>
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
    "pb020D01",
    "pb020Q01",
    "pb020D02",
    "pb020I01",
    "pb020Q02",
    "pb020Q03"
})
@XmlRootElement(name = "PB02")
public class PB02 {

    @XmlElement(name = "PB020D01", required = true)
    protected String pb020D01;
    @XmlElement(name = "PB020Q01", required = true)
    protected String pb020Q01;
    @XmlElement(name = "PB020D02", required = true)
    protected String pb020D02;
    @XmlElement(name = "PB020I01", required = true)
    protected String pb020I01;
    @XmlElement(name = "PB020Q02", required = true)
    protected String pb020Q02;
    @XmlElement(name = "PB020Q03", required = true)
    protected String pb020Q03;

    /**
     * 获取pb020D01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB020D01() {
        return pb020D01;
    }

    /**
     * 设置pb020D01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB020D01(String value) {
        this.pb020D01 = value;
    }

    /**
     * 获取pb020Q01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB020Q01() {
        return pb020Q01;
    }

    /**
     * 设置pb020Q01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB020Q01(String value) {
        this.pb020Q01 = value;
    }

    /**
     * 获取pb020D02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB020D02() {
        return pb020D02;
    }

    /**
     * 设置pb020D02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB020D02(String value) {
        this.pb020D02 = value;
    }

    /**
     * 获取pb020I01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB020I01() {
        return pb020I01;
    }

    /**
     * 设置pb020I01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB020I01(String value) {
        this.pb020I01 = value;
    }

    /**
     * 获取pb020Q02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB020Q02() {
        return pb020Q02;
    }

    /**
     * 设置pb020Q02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB020Q02(String value) {
        this.pb020Q02 = value;
    }

    /**
     * 获取pb020Q03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB020Q03() {
        return pb020Q03;
    }

    /**
     * 设置pb020Q03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB020Q03(String value) {
        this.pb020Q03 = value;
    }

}
