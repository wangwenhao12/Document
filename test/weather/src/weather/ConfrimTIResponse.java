
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
 *         &lt;element name="ConfrimTIResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfFirmTIresult" minOccurs="0"/>
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
    "confrimTIResult"
})
@XmlRootElement(name = "ConfrimTIResponse")
public class ConfrimTIResponse {

    @XmlElement(name = "ConfrimTIResult")
    protected ResponseDataOfFirmTIresult confrimTIResult;

    /**
     * ��ȡconfrimTIResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfFirmTIresult }
     *     
     */
    public ResponseDataOfFirmTIresult getConfrimTIResult() {
        return confrimTIResult;
    }

    /**
     * ����confrimTIResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfFirmTIresult }
     *     
     */
    public void setConfrimTIResult(ResponseDataOfFirmTIresult value) {
        this.confrimTIResult = value;
    }

}
