
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
 *         &lt;element name="Consume_QRcode_NoEncryptResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBonusInfo" minOccurs="0"/>
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
    "consumeQRcodeNoEncryptResult"
})
@XmlRootElement(name = "Consume_QRcode_NoEncryptResponse")
public class ConsumeQRcodeNoEncryptResponse {

    @XmlElement(name = "Consume_QRcode_NoEncryptResult")
    protected ResponseDataOfBonusInfo consumeQRcodeNoEncryptResult;

    /**
     * ��ȡconsumeQRcodeNoEncryptResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBonusInfo }
     *     
     */
    public ResponseDataOfBonusInfo getConsumeQRcodeNoEncryptResult() {
        return consumeQRcodeNoEncryptResult;
    }

    /**
     * ����consumeQRcodeNoEncryptResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBonusInfo }
     *     
     */
    public void setConsumeQRcodeNoEncryptResult(ResponseDataOfBonusInfo value) {
        this.consumeQRcodeNoEncryptResult = value;
    }

}
