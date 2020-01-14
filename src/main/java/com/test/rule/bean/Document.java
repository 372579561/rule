
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
 *         &lt;element ref="{}PRH" minOccurs="0"/>
 *         &lt;element ref="{}PIM" minOccurs="0"/>
 *         &lt;element ref="{}PMM" minOccurs="0"/>
 *         &lt;element ref="{}PRM" minOccurs="0"/>
 *         &lt;element ref="{}POM" minOccurs="0"/>
 *         &lt;element ref="{}PSM" minOccurs="0"/>
 *         &lt;element ref="{}PCO" minOccurs="0"/>
 *         &lt;element ref="{}PNO" minOccurs="0"/>
 *         &lt;element ref="{}PPO" minOccurs="0"/>
 *         &lt;element ref="{}PQO" minOccurs="0"/>
 *         &lt;element ref="{}PCA" minOccurs="0"/>
 *         &lt;element ref="{}PDA" minOccurs="0"/>
 *         &lt;element ref="{}PCR" minOccurs="0"/>
 *         &lt;element ref="{}PND" minOccurs="0"/>
 *         &lt;element ref="{}POT" minOccurs="0"/>
 *         &lt;element ref="{}PCJ" minOccurs="0"/>
 *         &lt;element ref="{}PCE" minOccurs="0"/>
 *         &lt;element ref="{}PAP" minOccurs="0"/>
 *         &lt;element ref="{}PHF" minOccurs="0"/>
 *         &lt;element ref="{}PBS" minOccurs="0"/>
 *         &lt;element ref="{}PPQ" minOccurs="0"/>
 *         &lt;element ref="{}PAH" minOccurs="0"/>
 *         &lt;element ref="{}POS" minOccurs="0"/>
 *         &lt;element ref="{}POQ" minOccurs="0"/>
 *         &lt;element ref="{}Msg" minOccurs="0"/>
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
    "prh",
    "pim",
    "pmm",
    "prm",
    "pom",
    "psm",
    "pco",
    "pno",
    "ppo",
    "pqo",
    "pca",
    "pda",
    "pcr",
    "pnd",
    "pot",
    "pcj",
    "pce",
    "pap",
    "phf",
    "pbs",
    "ppq",
    "pah",
    "pos",
    "poq",
    "msg"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "PRH")
    protected PRH prh;
    @XmlElement(name = "PIM")
    protected PIM pim;
    @XmlElement(name = "PMM")
    protected PMM pmm;
    @XmlElement(name = "PRM")
    protected PRM prm;
    @XmlElement(name = "POM")
    protected POM pom;
    @XmlElement(name = "PSM")
    protected PSM psm;
    @XmlElement(name = "PCO")
    protected PCO pco;
    @XmlElement(name = "PNO")
    protected PNO pno;
    @XmlElement(name = "PPO")
    protected PPO ppo;
    @XmlElement(name = "PQO")
    protected PQO pqo;
    @XmlElement(name = "PCA")
    protected PCA pca;
    @XmlElement(name = "PDA")
    protected PDA pda;
    @XmlElement(name = "PCR")
    protected PCR pcr;
    @XmlElement(name = "PND")
    protected PND pnd;
    @XmlElement(name = "POT")
    protected POT pot;
    @XmlElement(name = "PCJ")
    protected String pcj;
    @XmlElement(name = "PCE")
    protected PCE pce;
    @XmlElement(name = "PAP")
    protected PAP pap;
    @XmlElement(name = "PHF")
    protected PHF phf;
    @XmlElement(name = "PBS")
    protected PBS pbs;
    @XmlElement(name = "PPQ")
    protected PPQ ppq;
    @XmlElement(name = "PAH")
    protected PAH pah;
    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "POQ")
    protected POQ poq;
    @XmlElement(name = "Msg")
    protected Msg msg;

    /**
     * 获取prh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PRH }
     *     
     */
    public PRH getPRH() {
        return prh;
    }

    /**
     * 设置prh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PRH }
     *     
     */
    public void setPRH(PRH value) {
        this.prh = value;
    }

    /**
     * 获取pim属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PIM }
     *     
     */
    public PIM getPIM() {
        return pim;
    }

    /**
     * 设置pim属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PIM }
     *     
     */
    public void setPIM(PIM value) {
        this.pim = value;
    }

    /**
     * 获取pmm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PMM }
     *     
     */
    public PMM getPMM() {
        return pmm;
    }

    /**
     * 设置pmm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PMM }
     *     
     */
    public void setPMM(PMM value) {
        this.pmm = value;
    }

    /**
     * 获取prm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PRM }
     *     
     */
    public PRM getPRM() {
        return prm;
    }

    /**
     * 设置prm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PRM }
     *     
     */
    public void setPRM(PRM value) {
        this.prm = value;
    }

    /**
     * 获取pom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link POM }
     *     
     */
    public POM getPOM() {
        return pom;
    }

    /**
     * 设置pom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link POM }
     *     
     */
    public void setPOM(POM value) {
        this.pom = value;
    }

    /**
     * 获取psm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PSM }
     *     
     */
    public PSM getPSM() {
        return psm;
    }

    /**
     * 设置psm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PSM }
     *     
     */
    public void setPSM(PSM value) {
        this.psm = value;
    }

    /**
     * 获取pco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PCO }
     *     
     */
    public PCO getPCO() {
        return pco;
    }

    /**
     * 设置pco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PCO }
     *     
     */
    public void setPCO(PCO value) {
        this.pco = value;
    }

    /**
     * 获取pno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PNO }
     *     
     */
    public PNO getPNO() {
        return pno;
    }

    /**
     * 设置pno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PNO }
     *     
     */
    public void setPNO(PNO value) {
        this.pno = value;
    }

    /**
     * 获取ppo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PPO }
     *     
     */
    public PPO getPPO() {
        return ppo;
    }

    /**
     * 设置ppo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PPO }
     *     
     */
    public void setPPO(PPO value) {
        this.ppo = value;
    }

    /**
     * 获取pqo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PQO }
     *     
     */
    public PQO getPQO() {
        return pqo;
    }

    /**
     * 设置pqo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PQO }
     *     
     */
    public void setPQO(PQO value) {
        this.pqo = value;
    }

    /**
     * 获取pca属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PCA }
     *     
     */
    public PCA getPCA() {
        return pca;
    }

    /**
     * 设置pca属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PCA }
     *     
     */
    public void setPCA(PCA value) {
        this.pca = value;
    }

    /**
     * 获取pda属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PDA }
     *     
     */
    public PDA getPDA() {
        return pda;
    }

    /**
     * 设置pda属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PDA }
     *     
     */
    public void setPDA(PDA value) {
        this.pda = value;
    }

    /**
     * 获取pcr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PCR }
     *     
     */
    public PCR getPCR() {
        return pcr;
    }

    /**
     * 设置pcr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PCR }
     *     
     */
    public void setPCR(PCR value) {
        this.pcr = value;
    }

    /**
     * 获取pnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PND }
     *     
     */
    public PND getPND() {
        return pnd;
    }

    /**
     * 设置pnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PND }
     *     
     */
    public void setPND(PND value) {
        this.pnd = value;
    }

    /**
     * 获取pot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link POT }
     *     
     */
    public POT getPOT() {
        return pot;
    }

    /**
     * 设置pot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link POT }
     *     
     */
    public void setPOT(POT value) {
        this.pot = value;
    }

    /**
     * 获取pcj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCJ() {
        return pcj;
    }

    /**
     * 设置pcj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCJ(String value) {
        this.pcj = value;
    }

    /**
     * 获取pce属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PCE }
     *     
     */
    public PCE getPCE() {
        return pce;
    }

    /**
     * 设置pce属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PCE }
     *     
     */
    public void setPCE(PCE value) {
        this.pce = value;
    }

    /**
     * 获取pap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PAP }
     *     
     */
    public PAP getPAP() {
        return pap;
    }

    /**
     * 设置pap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PAP }
     *     
     */
    public void setPAP(PAP value) {
        this.pap = value;
    }

    /**
     * 获取phf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PHF }
     *     
     */
    public PHF getPHF() {
        return phf;
    }

    /**
     * 设置phf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PHF }
     *     
     */
    public void setPHF(PHF value) {
        this.phf = value;
    }

    /**
     * 获取pbs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PBS }
     *     
     */
    public PBS getPBS() {
        return pbs;
    }

    /**
     * 设置pbs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PBS }
     *     
     */
    public void setPBS(PBS value) {
        this.pbs = value;
    }

    /**
     * 获取ppq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PPQ }
     *     
     */
    public PPQ getPPQ() {
        return ppq;
    }

    /**
     * 设置ppq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PPQ }
     *     
     */
    public void setPPQ(PPQ value) {
        this.ppq = value;
    }

    /**
     * 获取pah属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PAH }
     *     
     */
    public PAH getPAH() {
        return pah;
    }

    /**
     * 设置pah属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PAH }
     *     
     */
    public void setPAH(PAH value) {
        this.pah = value;
    }

    /**
     * 获取pos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link POS }
     *     
     */
    public POS getPOS() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link POS }
     *     
     */
    public void setPOS(POS value) {
        this.pos = value;
    }

    /**
     * 获取poq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link POQ }
     *     
     */
    public POQ getPOQ() {
        return poq;
    }

    /**
     * 设置poq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link POQ }
     *     
     */
    public void setPOQ(POQ value) {
        this.poq = value;
    }

    /**
     * 获取msg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Msg }
     *     
     */
    public Msg getMsg() {
        return msg;
    }

    /**
     * 设置msg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Msg }
     *     
     */
    public void setMsg(Msg value) {
        this.msg = value;
    }

}
