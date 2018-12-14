
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TOModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TOModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="XF_LASTMODIFYDATE_HHMMSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_LASTMODIFYDATE_YYYYMMDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFINSTORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFINSTOREDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUTSTORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUTSTOREDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUT_HHMMSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUT_YYYYMMDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOModel", propOrder = {
    "extensionData",
    "xflastmodifydatehhmmss",
    "xflastmodifydateyyyymmdd",
    "xfstatus",
    "xftrfinstore",
    "xftrfinstoredesci",
    "xftrfoutno",
    "xftrfoutstore",
    "xftrfoutstoredesci",
    "xftrfouthhmmss",
    "xftrfoutyyyymmdd",
    "xfuserid"
})
public class TOModel {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "XF_LASTMODIFYDATE_HHMMSS")
    protected String xflastmodifydatehhmmss;
    @XmlElement(name = "XF_LASTMODIFYDATE_YYYYMMDD")
    protected String xflastmodifydateyyyymmdd;
    @XmlElement(name = "XF_STATUS")
    protected String xfstatus;
    @XmlElement(name = "XF_TRFINSTORE")
    protected String xftrfinstore;
    @XmlElement(name = "XF_TRFINSTOREDESCI")
    protected String xftrfinstoredesci;
    @XmlElement(name = "XF_TRFOUTNO")
    protected String xftrfoutno;
    @XmlElement(name = "XF_TRFOUTSTORE")
    protected String xftrfoutstore;
    @XmlElement(name = "XF_TRFOUTSTOREDESCI")
    protected String xftrfoutstoredesci;
    @XmlElement(name = "XF_TRFOUT_HHMMSS")
    protected String xftrfouthhmmss;
    @XmlElement(name = "XF_TRFOUT_YYYYMMDD")
    protected String xftrfoutyyyymmdd;
    @XmlElement(name = "XF_USERID")
    protected String xfuserid;

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
     * ��ȡxflastmodifydatehhmmss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFLASTMODIFYDATEHHMMSS() {
        return xflastmodifydatehhmmss;
    }

    /**
     * ����xflastmodifydatehhmmss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFLASTMODIFYDATEHHMMSS(String value) {
        this.xflastmodifydatehhmmss = value;
    }

    /**
     * ��ȡxflastmodifydateyyyymmdd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFLASTMODIFYDATEYYYYMMDD() {
        return xflastmodifydateyyyymmdd;
    }

    /**
     * ����xflastmodifydateyyyymmdd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFLASTMODIFYDATEYYYYMMDD(String value) {
        this.xflastmodifydateyyyymmdd = value;
    }

    /**
     * ��ȡxfstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFSTATUS() {
        return xfstatus;
    }

    /**
     * ����xfstatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFSTATUS(String value) {
        this.xfstatus = value;
    }

    /**
     * ��ȡxftrfinstore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFINSTORE() {
        return xftrfinstore;
    }

    /**
     * ����xftrfinstore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFINSTORE(String value) {
        this.xftrfinstore = value;
    }

    /**
     * ��ȡxftrfinstoredesci���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFINSTOREDESCI() {
        return xftrfinstoredesci;
    }

    /**
     * ����xftrfinstoredesci���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFINSTOREDESCI(String value) {
        this.xftrfinstoredesci = value;
    }

    /**
     * ��ȡxftrfoutno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTNO() {
        return xftrfoutno;
    }

    /**
     * ����xftrfoutno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTNO(String value) {
        this.xftrfoutno = value;
    }

    /**
     * ��ȡxftrfoutstore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTSTORE() {
        return xftrfoutstore;
    }

    /**
     * ����xftrfoutstore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTSTORE(String value) {
        this.xftrfoutstore = value;
    }

    /**
     * ��ȡxftrfoutstoredesci���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTSTOREDESCI() {
        return xftrfoutstoredesci;
    }

    /**
     * ����xftrfoutstoredesci���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTSTOREDESCI(String value) {
        this.xftrfoutstoredesci = value;
    }

    /**
     * ��ȡxftrfouthhmmss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTHHMMSS() {
        return xftrfouthhmmss;
    }

    /**
     * ����xftrfouthhmmss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTHHMMSS(String value) {
        this.xftrfouthhmmss = value;
    }

    /**
     * ��ȡxftrfoutyyyymmdd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTYYYYMMDD() {
        return xftrfoutyyyymmdd;
    }

    /**
     * ����xftrfoutyyyymmdd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTYYYYMMDD(String value) {
        this.xftrfoutyyyymmdd = value;
    }

    /**
     * ��ȡxfuserid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFUSERID() {
        return xfuserid;
    }

    /**
     * ����xfuserid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFUSERID(String value) {
        this.xfuserid = value;
    }

}
