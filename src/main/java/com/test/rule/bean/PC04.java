
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
 *         &lt;element ref="{}PC040S01"/>
 *         &lt;element ref="{}PC040H" maxOccurs="unbounded" minOccurs="0"/>
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
    "pc040S01",
    "pc040H"
})
@XmlRootElement(name = "PC04")
public class PC04 {

    @XmlElement(name = "PC040S01", required = true)
    protected String pc040S01;
    @XmlElement(name = "PC040H")
    protected List<PC040H> pc040H;

    /**
     * 获取pc040S01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC040S01() {
        return pc040S01;
    }

    /**
     * 设置pc040S01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC040S01(String value) {
        this.pc040S01 = value;
    }

    /**
     * Gets the value of the pc040H property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc040H property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC040H().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PC040H }
     * 
     * 
     */
    public List<PC040H> getPC040H() {
        if (pc040H == null) {
            pc040H = new ArrayList<PC040H>();
        }
        return this.pc040H;
    }

}
