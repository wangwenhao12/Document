
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
 *         &lt;element name="GetVipBaseInfoByMobileResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBaseVipInfo" minOccurs="0"/>
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
    "getVipBaseInfoByMobileResult"
})
@XmlRootElement(name = "GetVipBaseInfoByMobileResponse")
public class GetVipBaseInfoByMobileResponse {

    @XmlElement(name = "GetVipBaseInfoByMobileResult")
    protected ResponseDataOfBaseVipInfo getVipBaseInfoByMobileResult;

    /**
     * ��ȡgetVipBaseInfoByMobileResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBaseVipInfo }
     *     
     */
    public ResponseDataOfBaseVipInfo getGetVipBaseInfoByMobileResult() {
        return getVipBaseInfoByMobileResult;
    }

    /**
     * ����getVipBaseInfoByMobileResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBaseVipInfo }
     *     
     */
    public void setGetVipBaseInfoByMobileResult(ResponseDataOfBaseVipInfo value) {
        this.getVipBaseInfoByMobileResult = value;
    }

}
