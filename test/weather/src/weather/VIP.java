
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VIP complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="xf_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_bankcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_birthdaydd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_birthdaymm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_birthdayyyyy" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_bonus2amt_examount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_bonus2amt_exbonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_defsalesman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_expirydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_givenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_idcardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuestore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_jointdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_remarks1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_remarks2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_telephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_weixin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIP", propOrder = {
    "extensionData",
    "xfActive",
    "xfAddress1",
    "xfAddress2",
    "xfAddress3",
    "xfAddress4",
    "xfBankcardno",
    "xfBirthdaydd",
    "xfBirthdaymm",
    "xfBirthdayyyyy",
    "xfBonus",
    "xfBonus2AmtExamount",
    "xfBonus2AmtExbonus",
    "xfDefsalesman",
    "xfDiscount",
    "xfDob",
    "xfExpirydate",
    "xfGivenname",
    "xfGrade",
    "xfGroupid0",
    "xfGroupid1",
    "xfGroupid10",
    "xfGroupid11",
    "xfGroupid12",
    "xfGroupid13",
    "xfGroupid14",
    "xfGroupid15",
    "xfGroupid16",
    "xfGroupid17",
    "xfGroupid18",
    "xfGroupid19",
    "xfGroupid2",
    "xfGroupid3",
    "xfGroupid4",
    "xfGroupid5",
    "xfGroupid6",
    "xfGroupid7",
    "xfGroupid8",
    "xfGroupid9",
    "xfIdcardtype",
    "xfIssuedate",
    "xfIssuestore",
    "xfJointdate",
    "xfPostal",
    "xfRemarks1",
    "xfRemarks2",
    "xfSex",
    "xfSurname",
    "xfTelephone",
    "xfTelephone2",
    "xfVipcode",
    "xfVipemail",
    "xfVipid",
    "xfWeixin"
})
public class VIP {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "xf_active")
    protected String xfActive;
    @XmlElement(name = "xf_address1")
    protected String xfAddress1;
    @XmlElement(name = "xf_address2")
    protected String xfAddress2;
    @XmlElement(name = "xf_address3")
    protected String xfAddress3;
    @XmlElement(name = "xf_address4")
    protected String xfAddress4;
    @XmlElement(name = "xf_bankcardno")
    protected String xfBankcardno;
    @XmlElement(name = "xf_birthdaydd", required = true)
    protected BigDecimal xfBirthdaydd;
    @XmlElement(name = "xf_birthdaymm", required = true)
    protected BigDecimal xfBirthdaymm;
    @XmlElement(name = "xf_birthdayyyyy", required = true)
    protected BigDecimal xfBirthdayyyyy;
    @XmlElement(name = "xf_bonus")
    protected String xfBonus;
    @XmlElement(name = "xf_bonus2amt_examount", required = true)
    protected BigDecimal xfBonus2AmtExamount;
    @XmlElement(name = "xf_bonus2amt_exbonus", required = true)
    protected BigDecimal xfBonus2AmtExbonus;
    @XmlElement(name = "xf_defsalesman")
    protected String xfDefsalesman;
    @XmlElement(name = "xf_discount")
    protected String xfDiscount;
    @XmlElement(name = "xf_dob")
    protected String xfDob;
    @XmlElement(name = "xf_expirydate")
    protected String xfExpirydate;
    @XmlElement(name = "xf_givenname")
    protected String xfGivenname;
    @XmlElement(name = "xf_grade")
    protected String xfGrade;
    @XmlElement(name = "xf_groupid0")
    protected String xfGroupid0;
    @XmlElement(name = "xf_groupid1")
    protected String xfGroupid1;
    @XmlElement(name = "xf_groupid10")
    protected String xfGroupid10;
    @XmlElement(name = "xf_groupid11")
    protected String xfGroupid11;
    @XmlElement(name = "xf_groupid12")
    protected String xfGroupid12;
    @XmlElement(name = "xf_groupid13")
    protected String xfGroupid13;
    @XmlElement(name = "xf_groupid14")
    protected String xfGroupid14;
    @XmlElement(name = "xf_groupid15")
    protected String xfGroupid15;
    @XmlElement(name = "xf_groupid16")
    protected String xfGroupid16;
    @XmlElement(name = "xf_groupid17")
    protected String xfGroupid17;
    @XmlElement(name = "xf_groupid18")
    protected String xfGroupid18;
    @XmlElement(name = "xf_groupid19")
    protected String xfGroupid19;
    @XmlElement(name = "xf_groupid2")
    protected String xfGroupid2;
    @XmlElement(name = "xf_groupid3")
    protected String xfGroupid3;
    @XmlElement(name = "xf_groupid4")
    protected String xfGroupid4;
    @XmlElement(name = "xf_groupid5")
    protected String xfGroupid5;
    @XmlElement(name = "xf_groupid6")
    protected String xfGroupid6;
    @XmlElement(name = "xf_groupid7")
    protected String xfGroupid7;
    @XmlElement(name = "xf_groupid8")
    protected String xfGroupid8;
    @XmlElement(name = "xf_groupid9")
    protected String xfGroupid9;
    @XmlElement(name = "xf_idcardtype")
    protected String xfIdcardtype;
    @XmlElement(name = "xf_issuedate")
    protected String xfIssuedate;
    @XmlElement(name = "xf_issuestore")
    protected String xfIssuestore;
    @XmlElement(name = "xf_jointdate")
    protected String xfJointdate;
    @XmlElement(name = "xf_postal")
    protected String xfPostal;
    @XmlElement(name = "xf_remarks1")
    protected String xfRemarks1;
    @XmlElement(name = "xf_remarks2")
    protected String xfRemarks2;
    @XmlElement(name = "xf_sex")
    protected String xfSex;
    @XmlElement(name = "xf_surname")
    protected String xfSurname;
    @XmlElement(name = "xf_telephone")
    protected String xfTelephone;
    @XmlElement(name = "xf_telephone2")
    protected String xfTelephone2;
    @XmlElement(name = "xf_vipcode")
    protected String xfVipcode;
    @XmlElement(name = "xf_vipemail")
    protected String xfVipemail;
    @XmlElement(name = "xf_vipid")
    protected String xfVipid;
    @XmlElement(name = "xf_weixin")
    protected String xfWeixin;

    /**
     * ��ȡextensionData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * ����extensionData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * ��ȡxfActive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfActive() {
        return xfActive;
    }

    /**
     * ����xfActive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfActive(String value) {
        this.xfActive = value;
    }

    /**
     * ��ȡxfAddress1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress1() {
        return xfAddress1;
    }

    /**
     * ����xfAddress1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress1(String value) {
        this.xfAddress1 = value;
    }

    /**
     * ��ȡxfAddress2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress2() {
        return xfAddress2;
    }

    /**
     * ����xfAddress2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress2(String value) {
        this.xfAddress2 = value;
    }

    /**
     * ��ȡxfAddress3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress3() {
        return xfAddress3;
    }

    /**
     * ����xfAddress3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress3(String value) {
        this.xfAddress3 = value;
    }

    /**
     * ��ȡxfAddress4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress4() {
        return xfAddress4;
    }

    /**
     * ����xfAddress4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress4(String value) {
        this.xfAddress4 = value;
    }

    /**
     * ��ȡxfBankcardno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfBankcardno() {
        return xfBankcardno;
    }

    /**
     * ����xfBankcardno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfBankcardno(String value) {
        this.xfBankcardno = value;
    }

    /**
     * ��ȡxfBirthdaydd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBirthdaydd() {
        return xfBirthdaydd;
    }

    /**
     * ����xfBirthdaydd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBirthdaydd(BigDecimal value) {
        this.xfBirthdaydd = value;
    }

    /**
     * ��ȡxfBirthdaymm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBirthdaymm() {
        return xfBirthdaymm;
    }

    /**
     * ����xfBirthdaymm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBirthdaymm(BigDecimal value) {
        this.xfBirthdaymm = value;
    }

    /**
     * ��ȡxfBirthdayyyyy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBirthdayyyyy() {
        return xfBirthdayyyyy;
    }

    /**
     * ����xfBirthdayyyyy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBirthdayyyyy(BigDecimal value) {
        this.xfBirthdayyyyy = value;
    }

    /**
     * ��ȡxfBonus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfBonus() {
        return xfBonus;
    }

    /**
     * ����xfBonus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfBonus(String value) {
        this.xfBonus = value;
    }

    /**
     * ��ȡxfBonus2AmtExamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBonus2AmtExamount() {
        return xfBonus2AmtExamount;
    }

    /**
     * ����xfBonus2AmtExamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBonus2AmtExamount(BigDecimal value) {
        this.xfBonus2AmtExamount = value;
    }

    /**
     * ��ȡxfBonus2AmtExbonus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBonus2AmtExbonus() {
        return xfBonus2AmtExbonus;
    }

    /**
     * ����xfBonus2AmtExbonus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBonus2AmtExbonus(BigDecimal value) {
        this.xfBonus2AmtExbonus = value;
    }

    /**
     * ��ȡxfDefsalesman���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDefsalesman() {
        return xfDefsalesman;
    }

    /**
     * ����xfDefsalesman���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDefsalesman(String value) {
        this.xfDefsalesman = value;
    }

    /**
     * ��ȡxfDiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDiscount() {
        return xfDiscount;
    }

    /**
     * ����xfDiscount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDiscount(String value) {
        this.xfDiscount = value;
    }

    /**
     * ��ȡxfDob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDob() {
        return xfDob;
    }

    /**
     * ����xfDob���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDob(String value) {
        this.xfDob = value;
    }

    /**
     * ��ȡxfExpirydate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfExpirydate() {
        return xfExpirydate;
    }

    /**
     * ����xfExpirydate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfExpirydate(String value) {
        this.xfExpirydate = value;
    }

    /**
     * ��ȡxfGivenname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGivenname() {
        return xfGivenname;
    }

    /**
     * ����xfGivenname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGivenname(String value) {
        this.xfGivenname = value;
    }

    /**
     * ��ȡxfGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGrade() {
        return xfGrade;
    }

    /**
     * ����xfGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGrade(String value) {
        this.xfGrade = value;
    }

    /**
     * ��ȡxfGroupid0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid0() {
        return xfGroupid0;
    }

    /**
     * ����xfGroupid0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid0(String value) {
        this.xfGroupid0 = value;
    }

    /**
     * ��ȡxfGroupid1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid1() {
        return xfGroupid1;
    }

    /**
     * ����xfGroupid1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid1(String value) {
        this.xfGroupid1 = value;
    }

    /**
     * ��ȡxfGroupid10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid10() {
        return xfGroupid10;
    }

    /**
     * ����xfGroupid10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid10(String value) {
        this.xfGroupid10 = value;
    }

    /**
     * ��ȡxfGroupid11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid11() {
        return xfGroupid11;
    }

    /**
     * ����xfGroupid11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid11(String value) {
        this.xfGroupid11 = value;
    }

    /**
     * ��ȡxfGroupid12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid12() {
        return xfGroupid12;
    }

    /**
     * ����xfGroupid12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid12(String value) {
        this.xfGroupid12 = value;
    }

    /**
     * ��ȡxfGroupid13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid13() {
        return xfGroupid13;
    }

    /**
     * ����xfGroupid13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid13(String value) {
        this.xfGroupid13 = value;
    }

    /**
     * ��ȡxfGroupid14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid14() {
        return xfGroupid14;
    }

    /**
     * ����xfGroupid14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid14(String value) {
        this.xfGroupid14 = value;
    }

    /**
     * ��ȡxfGroupid15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid15() {
        return xfGroupid15;
    }

    /**
     * ����xfGroupid15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid15(String value) {
        this.xfGroupid15 = value;
    }

    /**
     * ��ȡxfGroupid16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid16() {
        return xfGroupid16;
    }

    /**
     * ����xfGroupid16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid16(String value) {
        this.xfGroupid16 = value;
    }

    /**
     * ��ȡxfGroupid17���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid17() {
        return xfGroupid17;
    }

    /**
     * ����xfGroupid17���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid17(String value) {
        this.xfGroupid17 = value;
    }

    /**
     * ��ȡxfGroupid18���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid18() {
        return xfGroupid18;
    }

    /**
     * ����xfGroupid18���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid18(String value) {
        this.xfGroupid18 = value;
    }

    /**
     * ��ȡxfGroupid19���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid19() {
        return xfGroupid19;
    }

    /**
     * ����xfGroupid19���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid19(String value) {
        this.xfGroupid19 = value;
    }

    /**
     * ��ȡxfGroupid2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid2() {
        return xfGroupid2;
    }

    /**
     * ����xfGroupid2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid2(String value) {
        this.xfGroupid2 = value;
    }

    /**
     * ��ȡxfGroupid3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid3() {
        return xfGroupid3;
    }

    /**
     * ����xfGroupid3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid3(String value) {
        this.xfGroupid3 = value;
    }

    /**
     * ��ȡxfGroupid4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid4() {
        return xfGroupid4;
    }

    /**
     * ����xfGroupid4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid4(String value) {
        this.xfGroupid4 = value;
    }

    /**
     * ��ȡxfGroupid5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid5() {
        return xfGroupid5;
    }

    /**
     * ����xfGroupid5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid5(String value) {
        this.xfGroupid5 = value;
    }

    /**
     * ��ȡxfGroupid6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid6() {
        return xfGroupid6;
    }

    /**
     * ����xfGroupid6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid6(String value) {
        this.xfGroupid6 = value;
    }

    /**
     * ��ȡxfGroupid7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid7() {
        return xfGroupid7;
    }

    /**
     * ����xfGroupid7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid7(String value) {
        this.xfGroupid7 = value;
    }

    /**
     * ��ȡxfGroupid8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid8() {
        return xfGroupid8;
    }

    /**
     * ����xfGroupid8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid8(String value) {
        this.xfGroupid8 = value;
    }

    /**
     * ��ȡxfGroupid9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid9() {
        return xfGroupid9;
    }

    /**
     * ����xfGroupid9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid9(String value) {
        this.xfGroupid9 = value;
    }

    /**
     * ��ȡxfIdcardtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIdcardtype() {
        return xfIdcardtype;
    }

    /**
     * ����xfIdcardtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIdcardtype(String value) {
        this.xfIdcardtype = value;
    }

    /**
     * ��ȡxfIssuedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuedate() {
        return xfIssuedate;
    }

    /**
     * ����xfIssuedate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuedate(String value) {
        this.xfIssuedate = value;
    }

    /**
     * ��ȡxfIssuestore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuestore() {
        return xfIssuestore;
    }

    /**
     * ����xfIssuestore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuestore(String value) {
        this.xfIssuestore = value;
    }

    /**
     * ��ȡxfJointdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfJointdate() {
        return xfJointdate;
    }

    /**
     * ����xfJointdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfJointdate(String value) {
        this.xfJointdate = value;
    }

    /**
     * ��ȡxfPostal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfPostal() {
        return xfPostal;
    }

    /**
     * ����xfPostal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfPostal(String value) {
        this.xfPostal = value;
    }

    /**
     * ��ȡxfRemarks1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfRemarks1() {
        return xfRemarks1;
    }

    /**
     * ����xfRemarks1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfRemarks1(String value) {
        this.xfRemarks1 = value;
    }

    /**
     * ��ȡxfRemarks2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfRemarks2() {
        return xfRemarks2;
    }

    /**
     * ����xfRemarks2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfRemarks2(String value) {
        this.xfRemarks2 = value;
    }

    /**
     * ��ȡxfSex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfSex() {
        return xfSex;
    }

    /**
     * ����xfSex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfSex(String value) {
        this.xfSex = value;
    }

    /**
     * ��ȡxfSurname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfSurname() {
        return xfSurname;
    }

    /**
     * ����xfSurname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfSurname(String value) {
        this.xfSurname = value;
    }

    /**
     * ��ȡxfTelephone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfTelephone() {
        return xfTelephone;
    }

    /**
     * ����xfTelephone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfTelephone(String value) {
        this.xfTelephone = value;
    }

    /**
     * ��ȡxfTelephone2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfTelephone2() {
        return xfTelephone2;
    }

    /**
     * ����xfTelephone2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfTelephone2(String value) {
        this.xfTelephone2 = value;
    }

    /**
     * ��ȡxfVipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipcode() {
        return xfVipcode;
    }

    /**
     * ����xfVipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipcode(String value) {
        this.xfVipcode = value;
    }

    /**
     * ��ȡxfVipemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipemail() {
        return xfVipemail;
    }

    /**
     * ����xfVipemail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipemail(String value) {
        this.xfVipemail = value;
    }

    /**
     * ��ȡxfVipid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipid() {
        return xfVipid;
    }

    /**
     * ����xfVipid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipid(String value) {
        this.xfVipid = value;
    }

    /**
     * ��ȡxfWeixin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfWeixin() {
        return xfWeixin;
    }

    /**
     * ����xfWeixin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfWeixin(String value) {
        this.xfWeixin = value;
    }

}
