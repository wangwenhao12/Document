
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
 *         &lt;element name="VipModifyResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfEmptyResponeData" minOccurs="0"/>
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
    "vipModifyResult"
})
@XmlRootElement(name = "VipModifyResponse")
public class VipModifyResponse {

    @XmlElement(name = "VipModifyResult")
    protected ResponseDataOfEmptyResponeData vipModifyResult;

    /**
     * ��ȡvipModifyResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfEmptyResponeData }
     *     
     */
    public ResponseDataOfEmptyResponeData getVipModifyResult() {
        return vipModifyResult;
    }

    /**
     * ����vipModifyResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfEmptyResponeData }
     *     
     */
    public void setVipModifyResult(ResponseDataOfEmptyResponeData value) {
        this.vipModifyResult = value;
    }

}
