
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>txsalesitem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="txsalesitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="dec_discountamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_exstk2sales" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_netamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_originalprice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_promotionless" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_promotionuseqty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_qty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_taxamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_totaldiscountless" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="s_cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_clientcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_colorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_couponnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographiccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographicdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_discountapprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_extendparam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_isdeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_isnewitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_ispricealternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_ispriceoverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_iswholesale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_itemlotnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_plucode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_priceapprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_promotionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_salesitemremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_salesman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_sizecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txsalesitem", propOrder = {
    "extensionData",
    "decDiscountamount",
    "decExstk2Sales",
    "decNetamount",
    "decOriginalprice",
    "decPromotionless",
    "decPromotionuseqty",
    "decQty",
    "decTaxamount",
    "decTotaldiscountless",
    "sCashier",
    "sClientcode",
    "sColorcode",
    "sCouponnumber",
    "sDemographiccode",
    "sDemographicdata",
    "sDiscountapprove",
    "sExtendparam",
    "sIsdeposit",
    "sIsnewitem",
    "sIspricealternate",
    "sIspriceoverride",
    "sIswholesale",
    "sItemlotnum",
    "sPlucode",
    "sPriceapprove",
    "sPromotionid",
    "sSalesitemremark",
    "sSalesman",
    "sSizecode"
})
public class Txsalesitem {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "dec_discountamount", required = true)
    protected BigDecimal decDiscountamount;
    @XmlElement(name = "dec_exstk2sales", required = true)
    protected BigDecimal decExstk2Sales;
    @XmlElement(name = "dec_netamount", required = true)
    protected BigDecimal decNetamount;
    @XmlElement(name = "dec_originalprice", required = true)
    protected BigDecimal decOriginalprice;
    @XmlElement(name = "dec_promotionless", required = true)
    protected BigDecimal decPromotionless;
    @XmlElement(name = "dec_promotionuseqty", required = true)
    protected BigDecimal decPromotionuseqty;
    @XmlElement(name = "dec_qty", required = true)
    protected BigDecimal decQty;
    @XmlElement(name = "dec_taxamount", required = true)
    protected BigDecimal decTaxamount;
    @XmlElement(name = "dec_totaldiscountless", required = true)
    protected BigDecimal decTotaldiscountless;
    @XmlElement(name = "s_cashier")
    protected String sCashier;
    @XmlElement(name = "s_clientcode")
    protected String sClientcode;
    @XmlElement(name = "s_colorcode")
    protected String sColorcode;
    @XmlElement(name = "s_couponnumber")
    protected String sCouponnumber;
    @XmlElement(name = "s_demographiccode")
    protected String sDemographiccode;
    @XmlElement(name = "s_demographicdata")
    protected String sDemographicdata;
    @XmlElement(name = "s_discountapprove")
    protected String sDiscountapprove;
    @XmlElement(name = "s_extendparam")
    protected String sExtendparam;
    @XmlElement(name = "s_isdeposit")
    protected String sIsdeposit;
    @XmlElement(name = "s_isnewitem")
    protected String sIsnewitem;
    @XmlElement(name = "s_ispricealternate")
    protected String sIspricealternate;
    @XmlElement(name = "s_ispriceoverride")
    protected String sIspriceoverride;
    @XmlElement(name = "s_iswholesale")
    protected String sIswholesale;
    @XmlElement(name = "s_itemlotnum")
    protected String sItemlotnum;
    @XmlElement(name = "s_plucode")
    protected String sPlucode;
    @XmlElement(name = "s_priceapprove")
    protected String sPriceapprove;
    @XmlElement(name = "s_promotionid")
    protected String sPromotionid;
    @XmlElement(name = "s_salesitemremark")
    protected String sSalesitemremark;
    @XmlElement(name = "s_salesman")
    protected String sSalesman;
    @XmlElement(name = "s_sizecode")
    protected String sSizecode;

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
     * ��ȡdecDiscountamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecDiscountamount() {
        return decDiscountamount;
    }

    /**
     * ����decDiscountamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecDiscountamount(BigDecimal value) {
        this.decDiscountamount = value;
    }

    /**
     * ��ȡdecExstk2Sales���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecExstk2Sales() {
        return decExstk2Sales;
    }

    /**
     * ����decExstk2Sales���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecExstk2Sales(BigDecimal value) {
        this.decExstk2Sales = value;
    }

    /**
     * ��ȡdecNetamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecNetamount() {
        return decNetamount;
    }

    /**
     * ����decNetamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecNetamount(BigDecimal value) {
        this.decNetamount = value;
    }

    /**
     * ��ȡdecOriginalprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecOriginalprice() {
        return decOriginalprice;
    }

    /**
     * ����decOriginalprice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecOriginalprice(BigDecimal value) {
        this.decOriginalprice = value;
    }

    /**
     * ��ȡdecPromotionless���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecPromotionless() {
        return decPromotionless;
    }

    /**
     * ����decPromotionless���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecPromotionless(BigDecimal value) {
        this.decPromotionless = value;
    }

    /**
     * ��ȡdecPromotionuseqty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecPromotionuseqty() {
        return decPromotionuseqty;
    }

    /**
     * ����decPromotionuseqty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecPromotionuseqty(BigDecimal value) {
        this.decPromotionuseqty = value;
    }

    /**
     * ��ȡdecQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecQty() {
        return decQty;
    }

    /**
     * ����decQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecQty(BigDecimal value) {
        this.decQty = value;
    }

    /**
     * ��ȡdecTaxamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecTaxamount() {
        return decTaxamount;
    }

    /**
     * ����decTaxamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecTaxamount(BigDecimal value) {
        this.decTaxamount = value;
    }

    /**
     * ��ȡdecTotaldiscountless���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecTotaldiscountless() {
        return decTotaldiscountless;
    }

    /**
     * ����decTotaldiscountless���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecTotaldiscountless(BigDecimal value) {
        this.decTotaldiscountless = value;
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
     * ��ȡsColorcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSColorcode() {
        return sColorcode;
    }

    /**
     * ����sColorcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSColorcode(String value) {
        this.sColorcode = value;
    }

    /**
     * ��ȡsCouponnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCouponnumber() {
        return sCouponnumber;
    }

    /**
     * ����sCouponnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCouponnumber(String value) {
        this.sCouponnumber = value;
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
     * ��ȡsIsdeposit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIsdeposit() {
        return sIsdeposit;
    }

    /**
     * ����sIsdeposit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIsdeposit(String value) {
        this.sIsdeposit = value;
    }

    /**
     * ��ȡsIsnewitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIsnewitem() {
        return sIsnewitem;
    }

    /**
     * ����sIsnewitem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIsnewitem(String value) {
        this.sIsnewitem = value;
    }

    /**
     * ��ȡsIspricealternate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIspricealternate() {
        return sIspricealternate;
    }

    /**
     * ����sIspricealternate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIspricealternate(String value) {
        this.sIspricealternate = value;
    }

    /**
     * ��ȡsIspriceoverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIspriceoverride() {
        return sIspriceoverride;
    }

    /**
     * ����sIspriceoverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIspriceoverride(String value) {
        this.sIspriceoverride = value;
    }

    /**
     * ��ȡsIswholesale���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIswholesale() {
        return sIswholesale;
    }

    /**
     * ����sIswholesale���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIswholesale(String value) {
        this.sIswholesale = value;
    }

    /**
     * ��ȡsItemlotnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItemlotnum() {
        return sItemlotnum;
    }

    /**
     * ����sItemlotnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItemlotnum(String value) {
        this.sItemlotnum = value;
    }

    /**
     * ��ȡsPlucode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPlucode() {
        return sPlucode;
    }

    /**
     * ����sPlucode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPlucode(String value) {
        this.sPlucode = value;
    }

    /**
     * ��ȡsPriceapprove���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPriceapprove() {
        return sPriceapprove;
    }

    /**
     * ����sPriceapprove���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPriceapprove(String value) {
        this.sPriceapprove = value;
    }

    /**
     * ��ȡsPromotionid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPromotionid() {
        return sPromotionid;
    }

    /**
     * ����sPromotionid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPromotionid(String value) {
        this.sPromotionid = value;
    }

    /**
     * ��ȡsSalesitemremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSalesitemremark() {
        return sSalesitemremark;
    }

    /**
     * ����sSalesitemremark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSalesitemremark(String value) {
        this.sSalesitemremark = value;
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
     * ��ȡsSizecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSizecode() {
        return sSizecode;
    }

    /**
     * ����sSizecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSizecode(String value) {
        this.sSizecode = value;
    }

}
