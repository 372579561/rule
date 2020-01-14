
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
 *         &lt;element ref="{}PD01DR01"/>
 *         &lt;element ref="{}PD01DR02"/>
 *         &lt;element ref="{}PD01DH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pd01DR01",
    "pd01DR02",
    "pd01DH"
})
@XmlRootElement(name = "PD01D")
public class PD01D {

    @XmlElement(name = "PD01DR01", required = true)
    protected String pd01DR01;
    @XmlElement(name = "PD01DR02", required = true)
    protected String pd01DR02;
    @XmlElement(name = "PD01DH")
    protected List<PD01DH> pd01DH;

    /**
     * 获取pd01DR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01DR01() {
        return pd01DR01;
    }

    /**
     * 设置pd01DR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01DR01(String value) {
        this.pd01DR01 = value;
    }

    /**
     * 获取pd01DR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01DR02() {
        return pd01DR02;
    }

    /**
     * 设置pd01DR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01DR02(String value) {
        this.pd01DR02 = value;
    }

    /**
     * Gets the value of the pd01DH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pd01DH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPD01DH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PD01DH }
     * 
     * 
     */
    public List<PD01DH> getPD01DH() {
        if (pd01DH == null) {
            pd01DH = new ArrayList<PD01DH>();
        }
        return this.pd01DH;
    }

}
