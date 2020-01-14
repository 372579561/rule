
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
 *         &lt;element ref="{}PC02AS01"/>
 *         &lt;element ref="{}PC02AS02"/>
 *         &lt;element ref="{}PC02AH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pc02AS01",
    "pc02AS02",
    "pc02AH"
})
@XmlRootElement(name = "PC02A")
public class PC02A {

    @XmlElement(name = "PC02AS01", required = true)
    protected String pc02AS01;
    @XmlElement(name = "PC02AS02", required = true)
    protected String pc02AS02;
    @XmlElement(name = "PC02AH")
    protected List<PC02AH> pc02AH;

    /**
     * 获取pc02AS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02AS01() {
        return pc02AS01;
    }

    /**
     * 设置pc02AS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02AS01(String value) {
        this.pc02AS01 = value;
    }

    /**
     * 获取pc02AS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC02AS02() {
        return pc02AS02;
    }

    /**
     * 设置pc02AS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC02AS02(String value) {
        this.pc02AS02 = value;
    }

    /**
     * Gets the value of the pc02AH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc02AH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC02AH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PC02AH }
     * 
     * 
     */
    public List<PC02AH> getPC02AH() {
        if (pc02AH == null) {
            pc02AH = new ArrayList<PC02AH>();
        }
        return this.pc02AH;
    }

}
