
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
 *         &lt;element name="GiftUsehResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfGiftExchangeInfo" minOccurs="0"/>
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
    "giftUsehResult"
})
@XmlRootElement(name = "GiftUsehResponse")
public class GiftUsehResponse {

    @XmlElement(name = "GiftUsehResult")
    protected ResponseDataOfGiftExchangeInfo giftUsehResult;

    /**
     * ��ȡgiftUsehResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfGiftExchangeInfo }
     *     
     */
    public ResponseDataOfGiftExchangeInfo getGiftUsehResult() {
        return giftUsehResult;
    }

    /**
     * ����giftUsehResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfGiftExchangeInfo }
     *     
     */
    public void setGiftUsehResult(ResponseDataOfGiftExchangeInfo value) {
        this.giftUsehResult = value;
    }

}
