
package com.test.rule.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}PD01A"/>
 *         &lt;element ref="{}PD01B"/>
 *         &lt;element ref="{}PD01F"/>
 *         &lt;element ref="{}PD01D"/>
 *         &lt;element ref="{}PD01E"/>
 *         &lt;element ref="{}PD01C"/>
 *         &lt;element ref="{}PD01Z"/>
 *         &lt;element ref="{}PD01G"/>
 *         &lt;element ref="{}PD01H"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pd01AOrPD01BOrPD01F"
})
@XmlRootElement(name = "PD01")
public class PD01 {

    @XmlElements({
        @XmlElement(name = "PD01A", type = PD01A.class),
        @XmlElement(name = "PD01B", type = PD01B.class),
        @XmlElement(name = "PD01F", type = PD01F.class),
        @XmlElement(name = "PD01D", type = PD01D.class),
        @XmlElement(name = "PD01E", type = PD01E.class),
        @XmlElement(name = "PD01C", type = PD01C.class),
        @XmlElement(name = "PD01Z", type = PD01Z.class),
        @XmlElement(name = "PD01G", type = PD01G.class),
        @XmlElement(name = "PD01H", type = PD01H.class)
    })
    protected List<Object> pd01AOrPD01BOrPD01F;

    /**
     * Gets the value of the pd01AOrPD01BOrPD01F property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pd01AOrPD01BOrPD01F property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPD01AOrPD01BOrPD01F().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PD01A }
     * {@link PD01B }
     * {@link PD01F }
     * {@link PD01D }
     * {@link PD01E }
     * {@link PD01C }
     * {@link PD01Z }
     * {@link PD01G }
     * {@link PD01H }
     * 
     * 
     */
    public List<Object> getPD01AOrPD01BOrPD01F() {
        if (pd01AOrPD01BOrPD01F == null) {
            pd01AOrPD01BOrPD01F = new ArrayList<Object>();
        }
        return this.pd01AOrPD01BOrPD01F;
    }

}
