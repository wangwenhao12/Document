
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
 *         &lt;element name="GetVipDisResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfVIP" minOccurs="0"/>
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
    "getVipDisResult"
})
@XmlRootElement(name = "GetVipDisResponse")
public class GetVipDisResponse {

    @XmlElement(name = "GetVipDisResult")
    protected ResponseDataOfListOfVIP getVipDisResult;

    /**
     * ��ȡgetVipDisResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public ResponseDataOfListOfVIP getGetVipDisResult() {
        return getVipDisResult;
    }

    /**
     * ����getVipDisResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public void setGetVipDisResult(ResponseDataOfListOfVIP value) {
        this.getVipDisResult = value;
    }

}
