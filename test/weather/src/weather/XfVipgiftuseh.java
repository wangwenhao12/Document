
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_vipgiftuseh complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="xf_vipgiftuseh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="xf_docno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuestaffcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_mallid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_parentno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_storecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_txdate_hhmmss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_txdate_yyyymmdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_vipgiftuseh", propOrder = {
    "extensionData",
    "xfDocno",
    "xfIssuestaffcode",
    "xfMallid",
    "xfParentno",
    "xfRemarks",
    "xfStorecode",
    "xfTxdateHhmmss",
    "xfTxdateYyyymmdd",
    "xfVipcode"
})
public class XfVipgiftuseh {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "xf_docno")
    protected String xfDocno;
    @XmlElement(name = "xf_issuestaffcode")
    protected String xfIssuestaffcode;
    @XmlElement(name = "xf_mallid")
    protected String xfMallid;
    @XmlElement(name = "xf_parentno")
    protected String xfParentno;
    @XmlElement(name = "xf_remarks")
    protected String xfRemarks;
    @XmlElement(name = "xf_storecode")
    protected String xfStorecode;
    @XmlElement(name = "xf_txdate_hhmmss")
    protected String xfTxdateHhmmss;
    @XmlElement(name = "xf_txdate_yyyymmdd")
    protected String xfTxdateYyyymmdd;
    @XmlElement(name = "xf_vipcode")
    protected String xfVipcode;

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
     * ��ȡxfDocno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDocno() {
        return xfDocno;
    }

    /**
     * ����xfDocno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDocno(String value) {
        this.xfDocno = value;
    }

    /**
     * ��ȡxfIssuestaffcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuestaffcode() {
        return xfIssuestaffcode;
    }

    /**
     * ����xfIssuestaffcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuestaffcode(String value) {
        this.xfIssuestaffcode = value;
    }

    /**
     * ��ȡxfMallid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfMallid() {
        return xfMallid;
    }

    /**
     * ����xfMallid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfMallid(String value) {
        this.xfMallid = value;
    }

    /**
     * ��ȡxfParentno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfParentno() {
        return xfParentno;
    }

    /**
     * ����xfParentno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfParentno(String value) {
        this.xfParentno = value;
    }

    /**
     * ��ȡxfRemarks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfRemarks() {
        return xfRemarks;
    }

    /**
     * ����xfRemarks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfRemarks(String value) {
        this.xfRemarks = value;
    }

    /**
     * ��ȡxfStorecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfStorecode() {
        return xfStorecode;
    }

    /**
     * ����xfStorecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfStorecode(String value) {
        this.xfStorecode = value;
    }

    /**
     * ��ȡxfTxdateHhmmss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfTxdateHhmmss() {
        return xfTxdateHhmmss;
    }

    /**
     * ����xfTxdateHhmmss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfTxdateHhmmss(String value) {
        this.xfTxdateHhmmss = value;
    }

    /**
     * ��ȡxfTxdateYyyymmdd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfTxdateYyyymmdd() {
        return xfTxdateYyyymmdd;
    }

    /**
     * ����xfTxdateYyyymmdd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfTxdateYyyymmdd(String value) {
        this.xfTxdateYyyymmdd = value;
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

}
