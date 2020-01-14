
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
 *         &lt;element ref="{}PD01ZS01"/>
 *         &lt;element ref="{}PD01ZH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pd01ZS01",
    "pd01ZH"
})
@XmlRootElement(name = "PD01Z")
public class PD01Z {

    @XmlElement(name = "PD01ZS01", required = true)
    protected String pd01ZS01;

    @XmlElement(name = "PD01ZH")
    protected List<PD01ZH> pd01ZH;

    /**
     * 获取pd01ZS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01ZS01() {
        return pd01ZS01;
    }

    /**
     * 设置pd01ZS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01ZS01(String value) {
        this.pd01ZS01 = value;
    }

    /**
     * Gets the value of the pd01ZH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pd01ZH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPD01ZH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PD01ZH }
     * 
     * 
     */
    public List<PD01ZH> getPD01ZH() {
        if (pd01ZH == null) {
            pd01ZH = new ArrayList<PD01ZH>();
        }
        return this.pd01ZH;
    }

}
