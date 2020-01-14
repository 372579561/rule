
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
 *         &lt;element ref="{}PB01BS01"/>
 *         &lt;element ref="{}PB01BH" maxOccurs="unbounded" minOccurs="0"/>
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
    "pb01BS01",
    "pb01BH"
})
@XmlRootElement(name = "PB01B")
public class PB01B {

    @XmlElement(name = "PB01BS01", required = true)
    protected String pb01BS01;
    @XmlElement(name = "PB01BH")
    protected List<PB01BH> pb01BH;

    /**
     * 获取pb01BS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPB01BS01() {
        return pb01BS01;
    }

    /**
     * 设置pb01BS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPB01BS01(String value) {
        this.pb01BS01 = value;
    }

    /**
     * Gets the value of the pb01BH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pb01BH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPB01BH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PB01BH }
     * 
     * 
     */
    public List<PB01BH> getPB01BH() {
        if (pb01BH == null) {
            pb01BH = new ArrayList<PB01BH>();
        }
        return this.pb01BH;
    }

}
