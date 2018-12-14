
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>txsalestender complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="txsalestender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="dec_baseamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_payamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="i_specificedtype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="s_cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_extendparam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_tendercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txsalestender", propOrder = {
    "extensionData",
    "decBaseamount",
    "decPayamount",
    "iSpecificedtype",
    "sCashier",
    "sExtendparam",
    "sTendercode"
})
public class Txsalestender {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "dec_baseamount", required = true)
    protected BigDecimal decBaseamount;
    @XmlElement(name = "dec_payamount", required = true)
    protected BigDecimal decPayamount;
    @XmlElement(name = "i_specificedtype")
    protected int iSpecificedtype;
    @XmlElement(name = "s_cashier")
    protected String sCashier;
    @XmlElement(name = "s_extendparam")
    protected String sExtendparam;
    @XmlElement(name = "s_tendercode")
    protected String sTendercode;

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
     * ��ȡdecBaseamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecBaseamount() {
        return decBaseamount;
    }

    /**
     * ����decBaseamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecBaseamount(BigDecimal value) {
        this.decBaseamount = value;
    }

    /**
     * ��ȡdecPayamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecPayamount() {
        return decPayamount;
    }

    /**
     * ����decPayamount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecPayamount(BigDecimal value) {
        this.decPayamount = value;
    }

    /**
     * ��ȡiSpecificedtype���Ե�ֵ��
     * 
     */
    public int getISpecificedtype() {
        return iSpecificedtype;
    }

    /**
     * ����iSpecificedtype���Ե�ֵ��
     * 
     */
    public void setISpecificedtype(int value) {
        this.iSpecificedtype = value;
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
     * ��ȡsTendercode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTendercode() {
        return sTendercode;
    }

    /**
     * ����sTendercode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTendercode(String value) {
        this.sTendercode = value;
    }

}
