
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TOItemModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TOItemModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="XF_AUCOSTk__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_DESCIk__BackingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_PLUk__BackingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_QTYk__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_TRFOUTSTOREk__BackingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TTCOSTk__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOItemModel", propOrder = {
    "extensionData",
    "xfaucosTkBackingField",
    "xfdescIkBackingField",
    "xfplUkBackingField",
    "xfqtYkBackingField",
    "xftrfoutstorEkBackingField",
    "xfttcosTkBackingField"
})
public class TOItemModel {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "XF_AUCOSTk__BackingField", required = true)
    protected BigDecimal xfaucosTkBackingField;
    @XmlElement(name = "XF_DESCIk__BackingField")
    protected String xfdescIkBackingField;
    @XmlElement(name = "XF_PLUk__BackingField")
    protected String xfplUkBackingField;
    @XmlElement(name = "XF_QTYk__BackingField", required = true)
    protected BigDecimal xfqtYkBackingField;
    @XmlElement(name = "XF_TRFOUTSTOREk__BackingField")
    protected String xftrfoutstorEkBackingField;
    @XmlElement(name = "XF_TTCOSTk__BackingField", required = true)
    protected BigDecimal xfttcosTkBackingField;

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
     * ��ȡxfaucosTkBackingField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFAUCOSTkBackingField() {
        return xfaucosTkBackingField;
    }

    /**
     * ����xfaucosTkBackingField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFAUCOSTkBackingField(BigDecimal value) {
        this.xfaucosTkBackingField = value;
    }

    /**
     * ��ȡxfdescIkBackingField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFDESCIkBackingField() {
        return xfdescIkBackingField;
    }

    /**
     * ����xfdescIkBackingField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFDESCIkBackingField(String value) {
        this.xfdescIkBackingField = value;
    }

    /**
     * ��ȡxfplUkBackingField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFPLUkBackingField() {
        return xfplUkBackingField;
    }

    /**
     * ����xfplUkBackingField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFPLUkBackingField(String value) {
        this.xfplUkBackingField = value;
    }

    /**
     * ��ȡxfqtYkBackingField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFQTYkBackingField() {
        return xfqtYkBackingField;
    }

    /**
     * ����xfqtYkBackingField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFQTYkBackingField(BigDecimal value) {
        this.xfqtYkBackingField = value;
    }

    /**
     * ��ȡxftrfoutstorEkBackingField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTSTOREkBackingField() {
        return xftrfoutstorEkBackingField;
    }

    /**
     * ����xftrfoutstorEkBackingField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTSTOREkBackingField(String value) {
        this.xftrfoutstorEkBackingField = value;
    }

    /**
     * ��ȡxfttcosTkBackingField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFTTCOSTkBackingField() {
        return xfttcosTkBackingField;
    }

    /**
     * ����xfttcosTkBackingField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFTTCOSTkBackingField(BigDecimal value) {
        this.xfttcosTkBackingField = value;
    }

}
