
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
 *         &lt;element ref="{}PC02DS01"/>
 *         &lt;element ref="{}PC02DH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pc02DS01",
    "pc02DH"
})
@XmlRootElement(name = "PC02D")
public class PC02D {

    @XmlElement(name = "PC02DS01", required = true)
    protected String pc02DS01;
    @XmlElement(name = "PC02DH")
    protected List<PC02DH> pc02DH;

    /**
     * 获取pc02DS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02DS01() {
        return pc02DS01;
    }

    /**
     * 设置pc02DS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02DS01(String value) {
        this.pc02DS01 = value;
    }

    /**
     * Gets the value of the pc02DH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc02DH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC02DH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PC02DH }
     * 
     * 
     */
    public List<PC02DH> getPC02DH() {
        if (pc02DH == null) {
            pc02DH = new ArrayList<PC02DH>();
        }
        return this.pc02DH;
    }

}
