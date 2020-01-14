
package com.test.rule.bean;

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
 *         &lt;element ref="{}PD01CR01"/>
 *         &lt;element ref="{}PD01CD01"/>
 *         &lt;element ref="{}PD01CJ01"/>
 *         &lt;element ref="{}PD01CD02" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ02" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ03" minOccurs="0"/>
 *         &lt;element ref="{}PD01CS01" minOccurs="0"/>
 *         &lt;element ref="{}PD01CR02"/>
 *         &lt;element ref="{}PD01CJ04" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ05"/>
 *         &lt;element ref="{}PD01CR03"/>
 *         &lt;element ref="{}PD01CS02" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ06" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ07" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ08" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ09" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ10" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ12" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ14" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ11" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ13" minOccurs="0"/>
 *         &lt;element ref="{}PD01CJ15" minOccurs="0"/>
 *         &lt;element ref="{}PD01CR04"/>
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
    "pd01CR01",
    "pd01CD01",
    "pd01CJ01",
    "pd01CD02",
    "pd01CJ02",
    "pd01CJ03",
    "pd01CS01",
    "pd01CR02",
    "pd01CJ04",
    "pd01CJ05",
    "pd01CR03",
    "pd01CS02",
    "pd01CJ06",
    "pd01CJ07",
    "pd01CJ08",
    "pd01CJ09",
    "pd01CJ10",
    "pd01CJ12",
    "pd01CJ14",
    "pd01CJ11",
    "pd01CJ13",
    "pd01CJ15",
    "pd01CR04"
})
@XmlRootElement(name = "PD01C")
public class PD01C {

    @XmlElement(name = "PD01CR01", required = true)
    protected String pd01CR01;
    @XmlElement(name = "PD01CD01", required = true)
    protected String pd01CD01;
    @XmlElement(name = "PD01CJ01", required = true)
    protected String pd01CJ01;
    @XmlElement(name = "PD01CD02")
    protected String pd01CD02;
    @XmlElement(name = "PD01CJ02")
    protected String pd01CJ02;
    @XmlElement(name = "PD01CJ03")
    protected String pd01CJ03;
    @XmlElement(name = "PD01CS01")
    protected String pd01CS01;
    @XmlElement(name = "PD01CR02", required = true)
    protected String pd01CR02;
    @XmlElement(name = "PD01CJ04")
    protected String pd01CJ04;
    @XmlElement(name = "PD01CJ05", required = true)
    protected String pd01CJ05;
    @XmlElement(name = "PD01CR03", required = true)
    protected String pd01CR03;
    @XmlElement(name = "PD01CS02")
    protected String pd01CS02;
    @XmlElement(name = "PD01CJ06")
    protected String pd01CJ06;
    @XmlElement(name = "PD01CJ07")
    protected String pd01CJ07;
    @XmlElement(name = "PD01CJ08")
    protected String pd01CJ08;
    @XmlElement(name = "PD01CJ09")
    protected String pd01CJ09;
    @XmlElement(name = "PD01CJ10")
    protected String pd01CJ10;
    @XmlElement(name = "PD01CJ12")
    protected String pd01CJ12;
    @XmlElement(name = "PD01CJ14")
    protected String pd01CJ14;
    @XmlElement(name = "PD01CJ11")
    protected String pd01CJ11;
    @XmlElement(name = "PD01CJ13")
    protected String pd01CJ13;
    @XmlElement(name = "PD01CJ15")
    protected String pd01CJ15;
    @XmlElement(name = "PD01CR04", required = true)
    protected String pd01CR04;

    /**
     * 获取pd01CR01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CR01() {
        return pd01CR01;
    }

    /**
     * 设置pd01CR01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CR01(String value) {
        this.pd01CR01 = value;
    }

    /**
     * 获取pd01CD01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CD01() {
        return pd01CD01;
    }

    /**
     * 设置pd01CD01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CD01(String value) {
        this.pd01CD01 = value;
    }

    /**
     * 获取pd01CJ01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ01() {
        return pd01CJ01;
    }

    /**
     * 设置pd01CJ01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ01(String value) {
        this.pd01CJ01 = value;
    }

    /**
     * 获取pd01CD02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CD02() {
        return pd01CD02;
    }

    /**
     * 设置pd01CD02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CD02(String value) {
        this.pd01CD02 = value;
    }

    /**
     * 获取pd01CJ02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ02() {
        return pd01CJ02;
    }

    /**
     * 设置pd01CJ02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ02(String value) {
        this.pd01CJ02 = value;
    }

    /**
     * 获取pd01CJ03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ03() {
        return pd01CJ03;
    }

    /**
     * 设置pd01CJ03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ03(String value) {
        this.pd01CJ03 = value;
    }

    /**
     * 获取pd01CS01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CS01() {
        return pd01CS01;
    }

    /**
     * 设置pd01CS01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CS01(String value) {
        this.pd01CS01 = value;
    }

    /**
     * 获取pd01CR02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CR02() {
        return pd01CR02;
    }

    /**
     * 设置pd01CR02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CR02(String value) {
        this.pd01CR02 = value;
    }

    /**
     * 获取pd01CJ04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ04() {
        return pd01CJ04;
    }

    /**
     * 设置pd01CJ04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ04(String value) {
        this.pd01CJ04 = value;
    }

    /**
     * 获取pd01CJ05属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ05() {
        return pd01CJ05;
    }

    /**
     * 设置pd01CJ05属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ05(String value) {
        this.pd01CJ05 = value;
    }

    /**
     * 获取pd01CR03属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CR03() {
        return pd01CR03;
    }

    /**
     * 设置pd01CR03属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CR03(String value) {
        this.pd01CR03 = value;
    }

    /**
     * 获取pd01CS02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CS02() {
        return pd01CS02;
    }

    /**
     * 设置pd01CS02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CS02(String value) {
        this.pd01CS02 = value;
    }

    /**
     * 获取pd01CJ06属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ06() {
        return pd01CJ06;
    }

    /**
     * 设置pd01CJ06属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ06(String value) {
        this.pd01CJ06 = value;
    }

    /**
     * 获取pd01CJ07属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ07() {
        return pd01CJ07;
    }

    /**
     * 设置pd01CJ07属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ07(String value) {
        this.pd01CJ07 = value;
    }

    /**
     * 获取pd01CJ08属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ08() {
        return pd01CJ08;
    }

    /**
     * 设置pd01CJ08属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ08(String value) {
        this.pd01CJ08 = value;
    }

    /**
     * 获取pd01CJ09属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ09() {
        return pd01CJ09;
    }

    /**
     * 设置pd01CJ09属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ09(String value) {
        this.pd01CJ09 = value;
    }

    /**
     * 获取pd01CJ10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ10() {
        return pd01CJ10;
    }

    /**
     * 设置pd01CJ10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ10(String value) {
        this.pd01CJ10 = value;
    }

    /**
     * 获取pd01CJ12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ12() {
        return pd01CJ12;
    }

    /**
     * 设置pd01CJ12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ12(String value) {
        this.pd01CJ12 = value;
    }

    /**
     * 获取pd01CJ14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ14() {
        return pd01CJ14;
    }

    /**
     * 设置pd01CJ14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ14(String value) {
        this.pd01CJ14 = value;
    }

    /**
     * 获取pd01CJ11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ11() {
        return pd01CJ11;
    }

    /**
     * 设置pd01CJ11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ11(String value) {
        this.pd01CJ11 = value;
    }

    /**
     * 获取pd01CJ13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ13() {
        return pd01CJ13;
    }

    /**
     * 设置pd01CJ13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ13(String value) {
        this.pd01CJ13 = value;
    }

    /**
     * 获取pd01CJ15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CJ15() {
        return pd01CJ15;
    }

    /**
     * 设置pd01CJ15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CJ15(String value) {
        this.pd01CJ15 = value;
    }

    /**
     * 获取pd01CR04属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD01CR04() {
        return pd01CR04;
    }

    /**
     * 设置pd01CR04属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD01CR04(String value) {
        this.pd01CR04 = value;
    }

}
