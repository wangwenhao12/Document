
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>txsalestotal complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="txsalestotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="dec_changeamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_discountamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_netamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_netqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_originalamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_paidamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_sellingamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_taxamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dt_reftxdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dt_txdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_numofitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_numoftender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_purchasedependent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_clientcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_defaulttender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographiccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographicdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_discountapprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_docno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_extendparam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_purchasestaffcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_refdocno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_refstorecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_reftillid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_salesman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_storecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_tillid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txsalestotal", propOrder = {
    "extensionData",
    "decChangeamount",
    "decDiscountamount",
    "decNetamount",
    "decNetqty",
    "decOriginalamount",
    "decPaidamount",
    "decSellingamount",
    "decTaxamount",
    "dtReftxdate",
    "dtTxdate",
    "iNumofitem",
    "iNumoftender",
    "iPurchasedependent",
    "sCashier",
    "sClientcode",
    "sDefaulttender",
    "sDemographiccode",
    "sDemographicdata",
    "sDiscountapprove",
    "sDocno",
    "sExtendparam",
    "sPurchasestaffcode",
    "sRefdocno",
    "sRefstorecode",
    "sReftillid",
    "sSalesman",
    "sStorecode",
    "sTillid",
    "sVipcode"
})
public class Txsalestotal {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "dec_changeamount")
    protected String decChangeamount;
    @XmlElement(name = "dec_discountamount")
    protected String decDiscountamount;
    @XmlElement(name = "dec_netamount")
    protected String decNetamount;
    @XmlElement(name = "dec_netqty")
    protected String decNetqty;
    @XmlElement(name = "dec_originalamount")
    protected String decOriginalamount;
    @XmlElement(name = "dec_paidamount")
    protected String decPaidamount;
    @XmlElement(name = "dec_sellingamount")
    protected String decSellingamount;
    @XmlElement(name = "dec_taxamount")
    protected String decTaxamount;
    @XmlElement(name = "dt_reftxdate")
    protected String dtReftxdate;
    @XmlElement(name = "dt_txdate")
    protected String dtTxdate;
    @XmlElement(name = "i_numofitem")
    protected String iNumofitem;
    @XmlElement(name = "i_numoftender")
    protected String iNumoftender;
    @XmlElement(name = "i_purchasedependent")
    protected String iPurchasedependent;
    @XmlElement(name = "s_cashier")
    protected String sCashier;
    @XmlElement(name = "s_clientcode")
    protected String sClientcode;
    @XmlElement(name = "s_defaulttender")
    protected String sDefaulttender;
    @XmlElement(name = "s_demographiccode")
    protected String sDemographiccode;
    @XmlElement(name = "s_demographicdata")
    protected String sDemographicdata;
    @XmlElement(name = "s_discountapprove")
    protected String sDiscountapprove;
    @XmlElement(name = "s_docno")
    protected String sDocno;
    @XmlElement(name = "s_extendparam")
    protected String sExtendparam;
    @XmlElement(name = "s_purchasestaffcode")
    protected String sPurchasestaffcode;
    @XmlElement(name = "s_refdocno")
    protected String sRefdocno;
    @XmlElement(name = "s_refstorecode")
    protected String sRefstorecode;
    @XmlElement(name = "s_reftillid")
    protected String sReftillid;
    @XmlElement(name = "s_salesman")
    protected String sSalesman;
    @XmlElement(name = "s_storecode")
    protected String sStorecode;
    @XmlElement(name = "s_tillid")
    protected String sTillid;
    @XmlElement(name = "s_vipcode")
    protected String sVipcode;

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
     * ��ȡdecChangeamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecChangeamount() {
        return decChangeamount;
    }

    /**
     * ����decChangeamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecChangeamount(String value) {
        this.decChangeamount = value;
    }

    /**
     * ��ȡdecDiscountamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecDiscountamount() {
        return decDiscountamount;
    }

    /**
     * ����decDiscountamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecDiscountamount(String value) {
        this.decDiscountamount = value;
    }

    /**
     * ��ȡdecNetamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecNetamount() {
        return decNetamount;
    }

    /**
     * ����decNetamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecNetamount(String value) {
        this.decNetamount = value;
    }

    /**
     * ��ȡdecNetqty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecNetqty() {
        return decNetqty;
    }

    /**
     * ����decNetqty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecNetqty(String value) {
        this.decNetqty = value;
    }

    /**
     * ��ȡdecOriginalamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecOriginalamount() {
        return decOriginalamount;
    }

    /**
     * ����decOriginalamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecOriginalamount(String value) {
        this.decOriginalamount = value;
    }

    /**
     * ��ȡdecPaidamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecPaidamount() {
        return decPaidamount;
    }

    /**
     * ����decPaidamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecPaidamount(String value) {
        this.decPaidamount = value;
    }

    /**
     * ��ȡdecSellingamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecSellingamount() {
        return decSellingamount;
    }

    /**
     * ����decSellingamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecSellingamount(String value) {
        this.decSellingamount = value;
    }

    /**
     * ��ȡdecTaxamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecTaxamount() {
        return decTaxamount;
    }

    /**
     * ����decTaxamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecTaxamount(String value) {
        this.decTaxamount = value;
    }

    /**
     * ��ȡdtReftxdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtReftxdate() {
        return dtReftxdate;
    }

    /**
     * ����dtReftxdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtReftxdate(String value) {
        this.dtReftxdate = value;
    }

    /**
     * ��ȡdtTxdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtTxdate() {
        return dtTxdate;
    }

    /**
     * ����dtTxdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtTxdate(String value) {
        this.dtTxdate = value;
    }

    /**
     * ��ȡiNumofitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINumofitem() {
        return iNumofitem;
    }

    /**
     * ����iNumofitem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINumofitem(String value) {
        this.iNumofitem = value;
    }

    /**
     * ��ȡiNumoftender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINumoftender() {
        return iNumoftender;
    }

    /**
     * ����iNumoftender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINumoftender(String value) {
        this.iNumoftender = value;
    }

    /**
     * ��ȡiPurchasedependent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPurchasedependent() {
        return iPurchasedependent;
    }

    /**
     * ����iPurchasedependent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPurchasedependent(String value) {
        this.iPurchasedependent = value;
    }

    /**
     * ��ȡsCashier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCashier() {
        return sCashier;
    }

    /**
     * ����sCashier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCashier(String value) {
        this.sCashier = value;
    }

    /**
     * ��ȡsClientcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSClientcode() {
        return sClientcode;
    }

    /**
     * ����sClientcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSClientcode(String value) {
        this.sClientcode = value;
    }

    /**
     * ��ȡsDefaulttender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDefaulttender() {
        return sDefaulttender;
    }

    /**
     * ����sDefaulttender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDefaulttender(String value) {
        this.sDefaulttender = value;
    }

    /**
     * ��ȡsDemographiccode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDemographiccode() {
        return sDemographiccode;
    }

    /**
     * ����sDemographiccode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDemographiccode(String value) {
        this.sDemographiccode = value;
    }

    /**
     * ��ȡsDemographicdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDemographicdata() {
        return sDemographicdata;
    }

    /**
     * ����sDemographicdata���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDemographicdata(String value) {
        this.sDemographicdata = value;
    }

    /**
     * ��ȡsDiscountapprove���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDiscountapprove() {
        return sDiscountapprove;
    }

    /**
     * ����sDiscountapprove���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDiscountapprove(String value) {
        this.sDiscountapprove = value;
    }

    /**
     * ��ȡsDocno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDocno() {
        return sDocno;
    }

    /**
     * ����sDocno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDocno(String value) {
        this.sDocno = value;
    }

    /**
     * ��ȡsExtendparam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSExtendparam() {
        return sExtendparam;
    }

    /**
     * ����sExtendparam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSExtendparam(String value) {
        this.sExtendparam = value;
    }

    /**
     * ��ȡsPurchasestaffcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPurchasestaffcode() {
        return sPurchasestaffcode;
    }

    /**
     * ����sPurchasestaffcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPurchasestaffcode(String value) {
        this.sPurchasestaffcode = value;
    }

    /**
     * ��ȡsRefdocno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRefdocno() {
        return sRefdocno;
    }

    /**
     * ����sRefdocno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRefdocno(String value) {
        this.sRefdocno = value;
    }

    /**
     * ��ȡsRefstorecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRefstorecode() {
        return sRefstorecode;
    }

    /**
     * ����sRefstorecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRefstorecode(String value) {
        this.sRefstorecode = value;
    }

    /**
     * ��ȡsReftillid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReftillid() {
        return sReftillid;
    }

    /**
     * ����sReftillid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReftillid(String value) {
        this.sReftillid = value;
    }

    /**
     * ��ȡsSalesman���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSalesman() {
        return sSalesman;
    }

    /**
     * ����sSalesman���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSalesman(String value) {
        this.sSalesman = value;
    }

    /**
     * ��ȡsStorecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStorecode() {
        return sStorecode;
    }

    /**
     * ����sStorecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStorecode(String value) {
        this.sStorecode = value;
    }

    /**
     * ��ȡsTillid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTillid() {
        return sTillid;
    }

    /**
     * ����sTillid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTillid(String value) {
        this.sTillid = value;
    }

    /**
     * ��ȡsVipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVipcode() {
        return sVipcode;
    }

    /**
     * ����sVipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVipcode(String value) {
        this.sVipcode = value;
    }

}
