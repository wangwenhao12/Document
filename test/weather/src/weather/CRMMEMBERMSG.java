
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CRM_MEMBERMSG complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CRM_MEMBERMSG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="ACTIVE_COST" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ASSIGNMEMBERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUILDINGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONFIRMDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CONFIRMUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRM_MSG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_ACTIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EB_CREATEBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATE_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_ISDELETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MSGCONTENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MSGENDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MSGSENDTODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGSENDTOSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGTITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PEOPLELIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STARTSENDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STARTSENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNCONFIRMDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UNCONFIRMUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRM_MEMBERMSG", propOrder = {
    "extensionData",
    "activecost",
    "assignmembercode",
    "buildingid",
    "confirmdate",
    "confirmuser",
    "crmmsgcode",
    "docno",
    "ebactive",
    "ebbonus",
    "ebcreateby",
    "ebcreatedatetime",
    "ebisdelete",
    "eblastmodifyby",
    "eblastmodifydatetime",
    "msgcontent",
    "msgdate",
    "msgenddate",
    "msgsendtodesc",
    "msgsendtosql",
    "msgtitle",
    "peoplelimit",
    "sendstatus",
    "startsenddate",
    "startsendtime",
    "status",
    "unconfirmdate",
    "unconfirmuser"
})
public class CRMMEMBERMSG {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "ACTIVE_COST", required = true)
    protected BigDecimal activecost;
    @XmlElement(name = "ASSIGNMEMBERCODE")
    protected String assignmembercode;
    @XmlElement(name = "BUILDINGID")
    protected String buildingid;
    @XmlElement(name = "CONFIRMDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmdate;
    @XmlElement(name = "CONFIRMUSER")
    protected String confirmuser;
    @XmlElement(name = "CRM_MSG_CODE")
    protected String crmmsgcode;
    @XmlElement(name = "DOCNO")
    protected String docno;
    @XmlElement(name = "EB_ACTIVE")
    protected String ebactive;
    @XmlElement(name = "EB_BONUS", required = true)
    protected BigDecimal ebbonus;
    @XmlElement(name = "EB_CREATEBY")
    protected String ebcreateby;
    @XmlElement(name = "EB_CREATE_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebcreatedatetime;
    @XmlElement(name = "EB_ISDELETE")
    protected String ebisdelete;
    @XmlElement(name = "EB_LASTMODIFYBY")
    protected String eblastmodifyby;
    @XmlElement(name = "EB_LASTMODIFY_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eblastmodifydatetime;
    @XmlElement(name = "MSGCONTENT")
    protected String msgcontent;
    @XmlElement(name = "MSGDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgdate;
    @XmlElement(name = "MSGENDDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgenddate;
    @XmlElement(name = "MSGSENDTODESC")
    protected String msgsendtodesc;
    @XmlElement(name = "MSGSENDTOSQL")
    protected String msgsendtosql;
    @XmlElement(name = "MSGTITLE")
    protected String msgtitle;
    @XmlElement(name = "PEOPLELIMIT")
    protected String peoplelimit;
    @XmlElement(name = "SENDSTATUS")
    protected String sendstatus;
    @XmlElement(name = "STARTSENDDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startsenddate;
    @XmlElement(name = "STARTSENDTIME")
    protected String startsendtime;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "UNCONFIRMDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unconfirmdate;
    @XmlElement(name = "UNCONFIRMUSER")
    protected String unconfirmuser;

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
     * ��ȡactivecost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACTIVECOST() {
        return activecost;
    }

    /**
     * ����activecost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACTIVECOST(BigDecimal value) {
        this.activecost = value;
    }

    /**
     * ��ȡassignmembercode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSIGNMEMBERCODE() {
        return assignmembercode;
    }

    /**
     * ����assignmembercode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSIGNMEMBERCODE(String value) {
        this.assignmembercode = value;
    }

    /**
     * ��ȡbuildingid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDINGID() {
        return buildingid;
    }

    /**
     * ����buildingid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDINGID(String value) {
        this.buildingid = value;
    }

    /**
     * ��ȡconfirmdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCONFIRMDATE() {
        return confirmdate;
    }

    /**
     * ����confirmdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCONFIRMDATE(XMLGregorianCalendar value) {
        this.confirmdate = value;
    }

    /**
     * ��ȡconfirmuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMUSER() {
        return confirmuser;
    }

    /**
     * ����confirmuser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMUSER(String value) {
        this.confirmuser = value;
    }

    /**
     * ��ȡcrmmsgcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMMSGCODE() {
        return crmmsgcode;
    }

    /**
     * ����crmmsgcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMMSGCODE(String value) {
        this.crmmsgcode = value;
    }

    /**
     * ��ȡdocno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNO() {
        return docno;
    }

    /**
     * ����docno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNO(String value) {
        this.docno = value;
    }

    /**
     * ��ȡebactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBACTIVE() {
        return ebactive;
    }

    /**
     * ����ebactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBACTIVE(String value) {
        this.ebactive = value;
    }

    /**
     * ��ȡebbonus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEBBONUS() {
        return ebbonus;
    }

    /**
     * ����ebbonus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEBBONUS(BigDecimal value) {
        this.ebbonus = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBCREATEDATETIME() {
        return ebcreatedatetime;
    }

    /**
     * ����ebcreatedatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBCREATEDATETIME(XMLGregorianCalendar value) {
        this.ebcreatedatetime = value;
    }

    /**
     * ��ȡebisdelete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBISDELETE() {
        return ebisdelete;
    }

    /**
     * ����ebisdelete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBISDELETE(String value) {
        this.ebisdelete = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBLASTMODIFYDATETIME() {
        return eblastmodifydatetime;
    }

    /**
     * ����eblastmodifydatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBLASTMODIFYDATETIME(XMLGregorianCalendar value) {
        this.eblastmodifydatetime = value;
    }

    /**
     * ��ȡmsgcontent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGCONTENT() {
        return msgcontent;
    }

    /**
     * ����msgcontent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGCONTENT(String value) {
        this.msgcontent = value;
    }

    /**
     * ��ȡmsgdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGDATE() {
        return msgdate;
    }

    /**
     * ����msgdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGDATE(XMLGregorianCalendar value) {
        this.msgdate = value;
    }

    /**
     * ��ȡmsgenddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGENDDATE() {
        return msgenddate;
    }

    /**
     * ����msgenddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGENDDATE(XMLGregorianCalendar value) {
        this.msgenddate = value;
    }

    /**
     * ��ȡmsgsendtodesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGSENDTODESC() {
        return msgsendtodesc;
    }

    /**
     * ����msgsendtodesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGSENDTODESC(String value) {
        this.msgsendtodesc = value;
    }

    /**
     * ��ȡmsgsendtosql���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGSENDTOSQL() {
        return msgsendtosql;
    }

    /**
     * ����msgsendtosql���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGSENDTOSQL(String value) {
        this.msgsendtosql = value;
    }

    /**
     * ��ȡmsgtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTITLE() {
        return msgtitle;
    }

    /**
     * ����msgtitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTITLE(String value) {
        this.msgtitle = value;
    }

    /**
     * ��ȡpeoplelimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEOPLELIMIT() {
        return peoplelimit;
    }

    /**
     * ����peoplelimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEOPLELIMIT(String value) {
        this.peoplelimit = value;
    }

    /**
     * ��ȡsendstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDSTATUS() {
        return sendstatus;
    }

    /**
     * ����sendstatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDSTATUS(String value) {
        this.sendstatus = value;
    }

    /**
     * ��ȡstartsenddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTSENDDATE() {
        return startsenddate;
    }

    /**
     * ����startsenddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTSENDDATE(XMLGregorianCalendar value) {
        this.startsenddate = value;
    }

    /**
     * ��ȡstartsendtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTSENDTIME() {
        return startsendtime;
    }

    /**
     * ����startsendtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTSENDTIME(String value) {
        this.startsendtime = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * ��ȡunconfirmdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUNCONFIRMDATE() {
        return unconfirmdate;
    }

    /**
     * ����unconfirmdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUNCONFIRMDATE(XMLGregorianCalendar value) {
        this.unconfirmdate = value;
    }

    /**
     * ��ȡunconfirmuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNCONFIRMUSER() {
        return unconfirmuser;
    }

    /**
     * ����unconfirmuser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNCONFIRMUSER(String value) {
        this.unconfirmuser = value;
    }

}
