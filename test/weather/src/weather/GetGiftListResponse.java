
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
 *         &lt;element name="GetGiftListResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfGiftListInfo" minOccurs="0"/>
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
    "getGiftListResult"
})
@XmlRootElement(name = "GetGiftListResponse")
public class GetGiftListResponse {

    @XmlElement(name = "GetGiftListResult")
    protected ResponseDataOfGiftListInfo getGiftListResult;

    /**
     * ��ȡgetGiftListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfGiftListInfo }
     *     
     */
    public ResponseDataOfGiftListInfo getGetGiftListResult() {
        return getGiftListResult;
    }

    /**
     * ����getGiftListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfGiftListInfo }
     *     
     */
    public void setGetGiftListResult(ResponseDataOfGiftListInfo value) {
        this.getGiftListResult = value;
    }

}
