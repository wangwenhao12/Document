
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
 *         &lt;element name="UseCRMTicketResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfCRMTickReturn" minOccurs="0"/>
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
    "useCRMTicketResult"
})
@XmlRootElement(name = "UseCRMTicketResponse")
public class UseCRMTicketResponse {

    @XmlElement(name = "UseCRMTicketResult")
    protected ResponseDataOfCRMTickReturn useCRMTicketResult;

    /**
     * ��ȡuseCRMTicketResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfCRMTickReturn }
     *     
     */
    public ResponseDataOfCRMTickReturn getUseCRMTicketResult() {
        return useCRMTicketResult;
    }

    /**
     * ����useCRMTicketResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfCRMTickReturn }
     *     
     */
    public void setUseCRMTicketResult(ResponseDataOfCRMTickReturn value) {
        this.useCRMTicketResult = value;
    }

}
