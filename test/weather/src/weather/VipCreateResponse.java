
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
 *         &lt;element name="VipCreateResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfCreateVip" minOccurs="0"/>
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
    "vipCreateResult"
})
@XmlRootElement(name = "VipCreateResponse")
public class VipCreateResponse {

    @XmlElement(name = "VipCreateResult")
    protected ResponseDataOfCreateVip vipCreateResult;

    /**
     * ��ȡvipCreateResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfCreateVip }
     *     
     */
    public ResponseDataOfCreateVip getVipCreateResult() {
        return vipCreateResult;
    }

    /**
     * ����vipCreateResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfCreateVip }
     *     
     */
    public void setVipCreateResult(ResponseDataOfCreateVip value) {
        this.vipCreateResult = value;
    }

}
