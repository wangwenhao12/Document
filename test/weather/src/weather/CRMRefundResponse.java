
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
 *         &lt;element name="CRMRefundResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfString" minOccurs="0"/>
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
    "crmRefundResult"
})
@XmlRootElement(name = "CRMRefundResponse")
public class CRMRefundResponse {

    @XmlElement(name = "CRMRefundResult")
    protected ResponseDataOfString crmRefundResult;

    /**
     * ��ȡcrmRefundResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfString }
     *     
     */
    public ResponseDataOfString getCRMRefundResult() {
        return crmRefundResult;
    }

    /**
     * ����crmRefundResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfString }
     *     
     */
    public void setCRMRefundResult(ResponseDataOfString value) {
        this.crmRefundResult = value;
    }

}
