
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRMPayResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crmPayResult"
})
@XmlRootElement(name = "CRMPayResponse")
public class CRMPayResponse {

    @XmlElement(name = "CRMPayResult")
    protected ResponseDataOfString crmPayResult;

    /**
     * ��ȡcrmPayResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfString }
     *     
     */
    public ResponseDataOfString getCRMPayResult() {
        return crmPayResult;
    }

    /**
     * ����crmPayResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfString }
     *     
     */
    public void setCRMPayResult(ResponseDataOfString value) {
        this.crmPayResult = value;
    }

}
