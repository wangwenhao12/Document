
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
 *         &lt;element name="GetVipInfoResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfVIP" minOccurs="0"/>
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
    "getVipInfoResult"
})
@XmlRootElement(name = "GetVipInfoResponse")
public class GetVipInfoResponse {

    @XmlElement(name = "GetVipInfoResult")
    protected ResponseDataOfListOfVIP getVipInfoResult;

    /**
     * ��ȡgetVipInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public ResponseDataOfListOfVIP getGetVipInfoResult() {
        return getVipInfoResult;
    }

    /**
     * ����getVipInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public void setGetVipInfoResult(ResponseDataOfListOfVIP value) {
        this.getVipInfoResult = value;
    }

}
