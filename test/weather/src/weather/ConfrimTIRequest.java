
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfrimTIRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ConfrimTIRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trfoutno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastmodifydate_yyyymmdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastmodifydate_hhmmss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfrimTIRequest", propOrder = {
    "trfoutno",
    "storecode",
    "createby",
    "lastmodifydateYyyymmdd",
    "lastmodifydateHhmmss"
})
public class ConfrimTIRequest {

    protected String trfoutno;
    protected String storecode;
    protected String createby;
    @XmlElement(name = "lastmodifydate_yyyymmdd")
    protected String lastmodifydateYyyymmdd;
    @XmlElement(name = "lastmodifydate_hhmmss")
    protected String lastmodifydateHhmmss;

    /**
     * ��ȡtrfoutno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfoutno() {
        return trfoutno;
    }

    /**
     * ����trfoutno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfoutno(String value) {
        this.trfoutno = value;
    }

    /**
     * ��ȡstorecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorecode() {
        return storecode;
    }

    /**
     * ����storecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorecode(String value) {
        this.storecode = value;
    }

    /**
     * ��ȡcreateby���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * ����createby���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateby(String value) {
        this.createby = value;
    }

    /**
     * ��ȡlastmodifydateYyyymmdd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmodifydateYyyymmdd() {
        return lastmodifydateYyyymmdd;
    }

    /**
     * ����lastmodifydateYyyymmdd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmodifydateYyyymmdd(String value) {
        this.lastmodifydateYyyymmdd = value;
    }

    /**
     * ��ȡlastmodifydateHhmmss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmodifydateHhmmss() {
        return lastmodifydateHhmmss;
    }

    /**
     * ����lastmodifydateHhmmss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmodifydateHhmmss(String value) {
        this.lastmodifydateHhmmss = value;
    }

}
