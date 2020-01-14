
package com.test.rule.bean;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}PD01ER01"/>
 *         &lt;element ref="{}PD01ER02"/>
 *         &lt;element ref="{}PD01ES01"/>
 *         &lt;element ref="{}PD01EH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pd01ER01",
    "pd01ER02",
    "pd01ES01",
    "pd01EH"
})
@XmlRootElement(name = "PD01E")
public class PD01E {

    @XmlElement(name = "PD01ER01", required = true)
    protected String pd01ER01;
    @XmlElement(name = "PD01ER02", required = true)
    protected String pd01ER02;
    @XmlElement(name = "PD01ES01", required = true)
    protected String pd01ES01;
    @XmlElement(name = "PD01EH")
    protected List<PD01EH> pd01EH;

    /**
     * 获取pd01ER01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ER01() {
        return pd01ER01;
    }

    /**
     * 设置pd01ER01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ER01(String value) {
        this.pd01ER01 = value;
    }

    /**
     * 获取pd01ER02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ER02() {
        return pd01ER02;
    }

    /**
     * 设置pd01ER02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ER02(String value) {
        this.pd01ER02 = value;
    }

    /**
     * 获取pd01ES01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ES01() {
        return pd01ES01;
    }

    /**
     * 设置pd01ES01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ES01(String value) {
        this.pd01ES01 = value;
    }

    /**
     * Gets the value of the pd01EH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pd01EH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPD01EH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PD01EH }
     * 
     * 
     */
    public List<PD01EH> getPD01EH() {
        if (pd01EH == null) {
            pd01EH = new ArrayList<PD01EH>();
        }
        return this.pd01EH;
    }

}
