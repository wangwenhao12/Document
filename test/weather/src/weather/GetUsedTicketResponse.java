
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
 *         &lt;element name="GetUsedTicketResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfCRMTICKET" minOccurs="0"/>
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
    "getUsedTicketResult"
})
@XmlRootElement(name = "GetUsedTicketResponse")
public class GetUsedTicketResponse {

    @XmlElement(name = "GetUsedTicketResult")
    protected ResponseDataOfListOfCRMTICKET getUsedTicketResult;

    /**
     * ��ȡgetUsedTicketResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfCRMTICKET }
     *     
     */
    public ResponseDataOfListOfCRMTICKET getGetUsedTicketResult() {
        return getUsedTicketResult;
    }

    /**
     * ����getUsedTicketResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfCRMTICKET }
     *     
     */
    public void setGetUsedTicketResult(ResponseDataOfListOfCRMTICKET value) {
        this.getUsedTicketResult = value;
    }

}
