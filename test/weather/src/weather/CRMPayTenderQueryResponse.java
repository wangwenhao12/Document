
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
 *         &lt;element name="CRMPayTenderQueryResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfCRMTender" minOccurs="0"/>
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
    "crmPayTenderQueryResult"
})
@XmlRootElement(name = "CRMPayTenderQueryResponse")
public class CRMPayTenderQueryResponse {

    @XmlElement(name = "CRMPayTenderQueryResult")
    protected ResponseDataOfListOfCRMTender crmPayTenderQueryResult;

    /**
     * ��ȡcrmPayTenderQueryResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfCRMTender }
     *     
     */
    public ResponseDataOfListOfCRMTender getCRMPayTenderQueryResult() {
        return crmPayTenderQueryResult;
    }

    /**
     * ����crmPayTenderQueryResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfCRMTender }
     *     
     */
    public void setCRMPayTenderQueryResult(ResponseDataOfListOfCRMTender value) {
        this.crmPayTenderQueryResult = value;
    }

}
