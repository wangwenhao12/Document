
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
 *         &lt;element name="GetBasicInfoResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBasicInfo" minOccurs="0"/>
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
    "getBasicInfoResult"
})
@XmlRootElement(name = "GetBasicInfoResponse")
public class GetBasicInfoResponse {

    @XmlElement(name = "GetBasicInfoResult")
    protected ResponseDataOfBasicInfo getBasicInfoResult;

    /**
     * ��ȡgetBasicInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBasicInfo }
     *     
     */
    public ResponseDataOfBasicInfo getGetBasicInfoResult() {
        return getBasicInfoResult;
    }

    /**
     * ����getBasicInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBasicInfo }
     *     
     */
    public void setGetBasicInfoResult(ResponseDataOfBasicInfo value) {
        this.getBasicInfoResult = value;
    }

}
