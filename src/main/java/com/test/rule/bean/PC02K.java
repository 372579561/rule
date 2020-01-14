
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
 *         &lt;element ref="{}PC02KS01"/>
 *         &lt;element ref="{}PC02KH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pc02KS01",
    "pc02KH"
})
@XmlRootElement(name = "PC02K")
public class PC02K {

    @XmlElement(name = "PC02KS01", required = true)
    protected String pc02KS01;
    @XmlElement(name = "PC02KH")
    protected List<PC02KH> pc02KH;

    /**
     * 获取pc02KS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02KS01() {
        return pc02KS01;
    }

    /**
     * 设置pc02KS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02KS01(String value) {
        this.pc02KS01 = value;
    }

    /**
     * Gets the value of the pc02KH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc02KH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC02KH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PC02KH }
     * 
     * 
     */
    public List<PC02KH> getPC02KH() {
        if (pc02KH == null) {
            pc02KH = new ArrayList<PC02KH>();
        }
        return this.pc02KH;
    }

}
