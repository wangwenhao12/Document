
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
 *         &lt;element name="QueryTicketTypeResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfTicketType" minOccurs="0"/>
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
    "queryTicketTypeResult"
})
@XmlRootElement(name = "QueryTicketTypeResponse")
public class QueryTicketTypeResponse {

    @XmlElement(name = "QueryTicketTypeResult")
    protected ResponseDataOfListOfTicketType queryTicketTypeResult;

    /**
     * ��ȡqueryTicketTypeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfTicketType }
     *     
     */
    public ResponseDataOfListOfTicketType getQueryTicketTypeResult() {
        return queryTicketTypeResult;
    }

    /**
     * ����queryTicketTypeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfTicketType }
     *     
     */
    public void setQueryTicketTypeResult(ResponseDataOfListOfTicketType value) {
        this.queryTicketTypeResult = value;
    }

}
