
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_vipgiftuseitem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="xf_vipgiftuseitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="EB_BARCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_ITEMDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_ITEMNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_PHOTOPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_QOH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_QTY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_vipgiftuseitem", propOrder = {
    "extensionData",
    "ebbarcode",
    "xfamount",
    "xfbonus",
    "xfitemdesci",
    "xfitemno",
    "xfphotopath",
    "xfqoh",
    "xfqty",
    "xftype"
})
public class XfVipgiftuseitem {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "EB_BARCODE")
    protected String ebbarcode;
    @XmlElement(name = "XF_AMOUNT", required = true)
    protected BigDecimal xfamount;
    @XmlElement(name = "XF_BONUS", required = true)
    protected BigDecimal xfbonus;
    @XmlElement(name = "XF_ITEMDESCI")
    protected String xfitemdesci;
    @XmlElement(name = "XF_ITEMNO")
    protected String xfitemno;
    @XmlElement(name = "XF_PHOTOPATH")
    protected String xfphotopath;
    @XmlElement(name = "XF_QOH", required = true)
    protected BigDecimal xfqoh;
    @XmlElement(name = "XF_QTY", required = true)
    protected BigDecimal xfqty;
    @XmlElement(name = "XF_TYPE")
    protected String xftype;

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
     * ��ȡebbarcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBBARCODE() {
        return ebbarcode;
    }

    /**
     * ����ebbarcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBBARCODE(String value) {
        this.ebbarcode = value;
    }

    /**
     * ��ȡxfamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFAMOUNT() {
        return xfamount;
    }

    /**
     * ����xfamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFAMOUNT(BigDecimal value) {
        this.xfamount = value;
    }

    /**
     * ��ȡxfbonus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFBONUS() {
        return xfbonus;
    }

    /**
     * ����xfbonus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFBONUS(BigDecimal value) {
        this.xfbonus = value;
    }

    /**
     * ��ȡxfitemdesci���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFITEMDESCI() {
        return xfitemdesci;
    }

    /**
     * ����xfitemdesci���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFITEMDESCI(String value) {
        this.xfitemdesci = value;
    }

    /**
     * ��ȡxfitemno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFITEMNO() {
        return xfitemno;
    }

    /**
     * ����xfitemno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFITEMNO(String value) {
        this.xfitemno = value;
    }

    /**
     * ��ȡxfphotopath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFPHOTOPATH() {
        return xfphotopath;
    }

    /**
     * ����xfphotopath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFPHOTOPATH(String value) {
        this.xfphotopath = value;
    }

    /**
     * ��ȡxfqoh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFQOH() {
        return xfqoh;
    }

    /**
     * ����xfqoh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFQOH(BigDecimal value) {
        this.xfqoh = value;
    }

    /**
     * ��ȡxfqty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFQTY() {
        return xfqty;
    }

    /**
     * ����xfqty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFQTY(BigDecimal value) {
        this.xfqty = value;
    }

    /**
     * ��ȡxftype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTYPE() {
        return xftype;
    }

    /**
     * ����xftype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTYPE(String value) {
        this.xftype = value;
    }

}
