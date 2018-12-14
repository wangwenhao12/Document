
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>EB_INFORMATION complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EB_INFORMATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="EB_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATEBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATE_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_DELETEABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_EFFECT_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_EXPIRY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_IMAGEURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_IMAGE_BIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_ISDELETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_STORECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EB_INFORMATION", propOrder = {
    "extensionData",
    "ebcode",
    "ebcreateby",
    "ebcreatedatetime",
    "ebdeleteable",
    "ebdesc",
    "ebeffectdatetime",
    "ebexpirydatetime",
    "ebid",
    "ebimageurl",
    "ebimagebig",
    "ebisdelete",
    "eblastmodifyby",
    "eblastmodifydatetime",
    "ebtitle",
    "xfstorecode"
})
public class EBINFORMATION {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "EB_CODE")
    protected String ebcode;
    @XmlElement(name = "EB_CREATEBY")
    protected String ebcreateby;
    @XmlElement(name = "EB_CREATE_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebcreatedatetime;
    @XmlElement(name = "EB_DELETEABLE")
    protected String ebdeleteable;
    @XmlElement(name = "EB_DESC")
    protected String ebdesc;
    @XmlElement(name = "EB_EFFECT_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebeffectdatetime;
    @XmlElement(name = "EB_EXPIRY_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebexpirydatetime;
    @XmlElement(name = "EB_ID")
    protected String ebid;
    @XmlElement(name = "EB_IMAGEURL")
    protected String ebimageurl;
    @XmlElement(name = "EB_IMAGE_BIG")
    protected String ebimagebig;
    @XmlElement(name = "EB_ISDELETE")
    protected String ebisdelete;
    @XmlElement(name = "EB_LASTMODIFYBY")
    protected String eblastmodifyby;
    @XmlElement(name = "EB_LASTMODIFY_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eblastmodifydatetime;
    @XmlElement(name = "EB_TITLE")
    protected String ebtitle;
    @XmlElement(name = "XF_STORECODE")
    protected String xfstorecode;

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
     * ��ȡebcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBCODE() {
        return ebcode;
    }

    /**
     * ����ebcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBCODE(String value) {
        this.ebcode = value;
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
     * ��ȡebdeleteable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBDELETEABLE() {
        return ebdeleteable;
    }

    /**
     * ����ebdeleteable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBDELETEABLE(String value) {
        this.ebdeleteable = value;
    }

    /**
     * ��ȡebdesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBDESC() {
        return ebdesc;
    }

    /**
     * ����ebdesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBDESC(String value) {
        this.ebdesc = value;
    }

    /**
     * ��ȡebeffectdatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBEFFECTDATETIME() {
        return ebeffectdatetime;
    }

    /**
     * ����ebeffectdatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBEFFECTDATETIME(XMLGregorianCalendar value) {
        this.ebeffectdatetime = value;
    }

    /**
     * ��ȡebexpirydatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBEXPIRYDATETIME() {
        return ebexpirydatetime;
    }

    /**
     * ����ebexpirydatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBEXPIRYDATETIME(XMLGregorianCalendar value) {
        this.ebexpirydatetime = value;
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
     * ��ȡebimageurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBIMAGEURL() {
        return ebimageurl;
    }

    /**
     * ����ebimageurl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBIMAGEURL(String value) {
        this.ebimageurl = value;
    }

    /**
     * ��ȡebimagebig���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBIMAGEBIG() {
        return ebimagebig;
    }

    /**
     * ����ebimagebig���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBIMAGEBIG(String value) {
        this.ebimagebig = value;
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
     * ��ȡebtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBTITLE() {
        return ebtitle;
    }

    /**
     * ����ebtitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBTITLE(String value) {
        this.ebtitle = value;
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

}
