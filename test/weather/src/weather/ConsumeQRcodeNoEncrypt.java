
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="request" type="{http://www.tech-trans.com.cn/}RequestDataOfConsume_QRcode_NoEncryptRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "Consume_QRcode_NoEncrypt")
public class ConsumeQRcodeNoEncrypt {

    protected RequestDataOfConsumeQRcodeNoEncryptRequest request;

    /**
     * ��ȡrequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestDataOfConsumeQRcodeNoEncryptRequest }
     *     
     */
    public RequestDataOfConsumeQRcodeNoEncryptRequest getRequest() {
        return request;
    }

    /**
     * ����request���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDataOfConsumeQRcodeNoEncryptRequest }
     *     
     */
    public void setRequest(RequestDataOfConsumeQRcodeNoEncryptRequest value) {
        this.request = value;
    }

}
