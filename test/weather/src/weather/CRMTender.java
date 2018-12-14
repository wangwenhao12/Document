
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CRMTender complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CRMTender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncreaseAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MinAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TenderDesci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMTender", propOrder = {
    "extensionData",
    "expiryDate",
    "increaseAmt",
    "maxAmt",
    "minAmt",
    "tenderDesci",
    "tenderID",
    "tenderType"
})
public class CRMTender {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "ExpiryDate")
    protected String expiryDate;
    @XmlElement(name = "IncreaseAmt", required = true)
    protected BigDecimal increaseAmt;
    @XmlElement(name = "MaxAmt", required = true)
    protected BigDecimal maxAmt;
    @XmlElement(name = "MinAmt", required = true)
    protected BigDecimal minAmt;
    @XmlElement(name = "TenderDesci")
    protected String tenderDesci;
    @XmlElement(name = "TenderID")
    protected String tenderID;
    @XmlElement(name = "TenderType")
    protected String tenderType;

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
     * ��ȡexpiryDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * ����expiryDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * ��ȡincreaseAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncreaseAmt() {
        return increaseAmt;
    }

    /**
     * ����increaseAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncreaseAmt(BigDecimal value) {
        this.increaseAmt = value;
    }

    /**
     * ��ȡmaxAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * ����maxAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

    /**
     * ��ȡminAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * ����minAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmt(BigDecimal value) {
        this.minAmt = value;
    }

    /**
     * ��ȡtenderDesci���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderDesci() {
        return tenderDesci;
    }

    /**
     * ����tenderDesci���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderDesci(String value) {
        this.tenderDesci = value;
    }

    /**
     * ��ȡtenderID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderID() {
        return tenderID;
    }

    /**
     * ����tenderID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderID(String value) {
        this.tenderID = value;
    }

    /**
     * ��ȡtenderType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * ����tenderType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
    }

}
