
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_bonusledger complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="xf_bonusledger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="ACTIONDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATEBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATE_DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REASONDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOREDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_ACTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_BONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_MALLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_PARENTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_REASONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_STORECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TILLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_VIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_bonusledger", propOrder = {
    "extensionData",
    "actiondesc",
    "ebcreateby",
    "ebcreatedatetime",
    "ebid",
    "eblastmodifyby",
    "eblastmodifydatetime",
    "reasondesc",
    "storedesc",
    "xfaction",
    "xfamount",
    "xfbonus",
    "xfdocno",
    "xfmallid",
    "xfparentno",
    "xfreasoncode",
    "xfremark",
    "xfstorecode",
    "xftillid",
    "xftxdate",
    "xfvipcode"
})
public class XfBonusledger {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "ACTIONDESC")
    protected String actiondesc;
    @XmlElement(name = "EB_CREATEBY")
    protected String ebcreateby;
    @XmlElement(name = "EB_CREATE_DATETIME")
    protected String ebcreatedatetime;
    @XmlElement(name = "EB_ID")
    protected String ebid;
    @XmlElement(name = "EB_LASTMODIFYBY")
    protected String eblastmodifyby;
    @XmlElement(name = "EB_LASTMODIFY_DATETIME")
    protected String eblastmodifydatetime;
    @XmlElement(name = "REASONDESC")
    protected String reasondesc;
    @XmlElement(name = "STOREDESC")
    protected String storedesc;
    @XmlElement(name = "XF_ACTION")
    protected String xfaction;
    @XmlElement(name = "XF_AMOUNT")
    protected String xfamount;
    @XmlElement(name = "XF_BONUS")
    protected String xfbonus;
    @XmlElement(name = "XF_DOCNO")
    protected String xfdocno;
    @XmlElement(name = "XF_MALLID")
    protected String xfmallid;
    @XmlElement(name = "XF_PARENTNO")
    protected String xfparentno;
    @XmlElement(name = "XF_REASONCODE")
    protected String xfreasoncode;
    @XmlElement(name = "XF_REMARK")
    protected String xfremark;
    @XmlElement(name = "XF_STORECODE")
    protected String xfstorecode;
    @XmlElement(name = "XF_TILLID")
    protected String xftillid;
    @XmlElement(name = "XF_TXDATE")
    protected String xftxdate;
    @XmlElement(name = "XF_VIPCODE")
    protected String xfvipcode;

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
     * ��ȡactiondesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONDESC() {
        return actiondesc;
    }

    /**
     * ����actiondesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONDESC(String value) {
        this.actiondesc = value;
    }

    /**
     * ��ȡebcreateby���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBCREATEBY() {
        return ebcreateby;
    }

    /**
     * ����ebcreateby���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBCREATEBY(String value) {
        this.ebcreateby = value;
    }

    /**
     * ��ȡebcreatedatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBCREATEDATETIME() {
        return ebcreatedatetime;
    }

    /**
     * ����ebcreatedatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBCREATEDATETIME(String value) {
        this.ebcreatedatetime = value;
    }

    /**
     * ��ȡebid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBID() {
        return ebid;
    }

    /**
     * ����ebid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBID(String value) {
        this.ebid = value;
    }

    /**
     * ��ȡeblastmodifyby���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBLASTMODIFYBY() {
        return eblastmodifyby;
    }

    /**
     * ����eblastmodifyby���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBLASTMODIFYBY(String value) {
        this.eblastmodifyby = value;
    }

    /**
     * ��ȡeblastmodifydatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBLASTMODIFYDATETIME() {
        return eblastmodifydatetime;
    }

    /**
     * ����eblastmodifydatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBLASTMODIFYDATETIME(String value) {
        this.eblastmodifydatetime = value;
    }

    /**
     * ��ȡreasondesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONDESC() {
        return reasondesc;
    }

    /**
     * ����reasondesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONDESC(String value) {
        this.reasondesc = value;
    }

    /**
     * ��ȡstoredesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOREDESC() {
        return storedesc;
    }

    /**
     * ����storedesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOREDESC(String value) {
        this.storedesc = value;
    }

    /**
     * ��ȡxfaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFACTION() {
        return xfaction;
    }

    /**
     * ����xfaction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFACTION(String value) {
        this.xfaction = value;
    }

    /**
     * ��ȡxfamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFAMOUNT() {
        return xfamount;
    }

    /**
     * ����xfamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFAMOUNT(String value) {
        this.xfamount = value;
    }

    /**
     * ��ȡxfbonus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFBONUS() {
        return xfbonus;
    }

    /**
     * ����xfbonus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFBONUS(String value) {
        this.xfbonus = value;
    }

    /**
     * ��ȡxfdocno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFDOCNO() {
        return xfdocno;
    }

    /**
     * ����xfdocno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFDOCNO(String value) {
        this.xfdocno = value;
    }

    /**
     * ��ȡxfmallid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFMALLID() {
        return xfmallid;
    }

    /**
     * ����xfmallid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFMALLID(String value) {
        this.xfmallid = value;
    }

    /**
     * ��ȡxfparentno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFPARENTNO() {
        return xfparentno;
    }

    /**
     * ����xfparentno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFPARENTNO(String value) {
        this.xfparentno = value;
    }

    /**
     * ��ȡxfreasoncode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFREASONCODE() {
        return xfreasoncode;
    }

    /**
     * ����xfreasoncode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFREASONCODE(String value) {
        this.xfreasoncode = value;
    }

    /**
     * ��ȡxfremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFREMARK() {
        return xfremark;
    }

    /**
     * ����xfremark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFREMARK(String value) {
        this.xfremark = value;
    }

    /**
     * ��ȡxfstorecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFSTORECODE() {
        return xfstorecode;
    }

    /**
     * ����xfstorecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFSTORECODE(String value) {
        this.xfstorecode = value;
    }

    /**
     * ��ȡxftillid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTILLID() {
        return xftillid;
    }

    /**
     * ����xftillid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTILLID(String value) {
        this.xftillid = value;
    }

    /**
     * ��ȡxftxdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTXDATE() {
        return xftxdate;
    }

    /**
     * ����xftxdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTXDATE(String value) {
        this.xftxdate = value;
    }

    /**
     * ��ȡxfvipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFVIPCODE() {
        return xfvipcode;
    }

    /**
     * ����xfvipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFVIPCODE(String value) {
        this.xfvipcode = value;
    }

}
