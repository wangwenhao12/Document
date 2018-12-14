
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseVipInfoRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BaseVipInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MACAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MallId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVipInfoRequest", propOrder = {
    "mobile",
    "macAddress",
    "mallId"
})
public class BaseVipInfoRequest {

    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "MACAddress")
    protected String macAddress;
    @XmlElement(name = "MallId")
    protected String mallId;

    /**
     * ��ȡmobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����mobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * ��ȡmacAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * ����macAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

    /**
     * ��ȡmallId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * ����mallId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMallId(String value) {
        this.mallId = value;
    }

}
