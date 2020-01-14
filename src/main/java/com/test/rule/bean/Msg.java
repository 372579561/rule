
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
 *         &lt;element ref="{}ResultCode"/>
 *         &lt;element ref="{}ResultDesc"/>
 *         &lt;element ref="{}ReportName"/>
 *         &lt;element ref="{}ReportMessage"/>
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
    "resultCode",
    "resultDesc",
    "reportName",
    "reportMessage"
})
@XmlRootElement(name = "Msg")
public class Msg {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "ResultDesc", required = true)
    protected String resultDesc;
    @XmlElement(name = "ReportName", required = true)
    protected String reportName;
    @XmlElement(name = "ReportMessage", required = true)
    protected ReportMessage reportMessage;

    /**
     * 获取resultCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置resultCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * 获取resultDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * 设置resultDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDesc(String value) {
        this.resultDesc = value;
    }

    /**
     * 获取reportName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * 设置reportName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * 获取reportMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReportMessage }
     *     
     */
    public ReportMessage getReportMessage() {
        return reportMessage;
    }

    /**
     * 设置reportMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReportMessage }
     *     
     */
    public void setReportMessage(ReportMessage value) {
        this.reportMessage = value;
    }

}
