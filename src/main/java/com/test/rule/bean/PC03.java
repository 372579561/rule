
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
 *         &lt;element ref="{}PC030S01"/>
 *         &lt;element ref="{}PC030H" maxOccurs="unbounded" minOccurs="0"/>
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
    "pc030S01",
    "pc030H"
})
@XmlRootElement(name = "PC03")
public class PC03 {

    @XmlElement(name = "PC030S01", required = true)
    protected String pc030S01;
    @XmlElement(name = "PC030H")
    protected List<PC030H> pc030H;

    /**
     * 获取pc030S01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC030S01() {
        return pc030S01;
    }

    /**
     * 设置pc030S01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC030S01(String value) {
        this.pc030S01 = value;
    }

    /**
     * Gets the value of the pc030H property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc030H property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC030H().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PC030H }
     * 
     * 
     */
    public List<PC030H> getPC030H() {
        if (pc030H == null) {
            pc030H = new ArrayList<PC030H>();
        }
        return this.pc030H;
    }

}
