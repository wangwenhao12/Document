
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestDataOfCRMPayLedgerQueryRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RequestDataOfCRMPayLedgerQueryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.tech-trans.com.cn/}RequestHeader" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.tech-trans.com.cn/}CRMPayLedgerQueryRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDataOfCRMPayLedgerQueryRequest", propOrder = {
    "header",
    "data"
})
public class RequestDataOfCRMPayLedgerQueryRequest {

    @XmlElement(name = "Header")
    protected RequestHeader header;
    @XmlElement(name = "Data")
    protected CRMPayLedgerQueryRequest data;

    /**
     * ��ȡheader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getHeader() {
        return header;
    }

    /**
     * ����header���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setHeader(RequestHeader value) {
        this.header = value;
    }

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CRMPayLedgerQueryRequest }
     *     
     */
    public CRMPayLedgerQueryRequest getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CRMPayLedgerQueryRequest }
     *     
     */
    public void setData(CRMPayLedgerQueryRequest value) {
        this.data = value;
    }

}
