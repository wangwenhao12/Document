
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
 *         &lt;element name="GetVipSalseResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfVipSales" minOccurs="0"/>
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
    "getVipSalseResult"
})
@XmlRootElement(name = "GetVipSalseResponse")
public class GetVipSalseResponse {

    @XmlElement(name = "GetVipSalseResult")
    protected ResponseDataOfVipSales getVipSalseResult;

    /**
     * ��ȡgetVipSalseResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfVipSales }
     *     
     */
    public ResponseDataOfVipSales getGetVipSalseResult() {
        return getVipSalseResult;
    }

    /**
     * ����getVipSalseResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfVipSales }
     *     
     */
    public void setGetVipSalseResult(ResponseDataOfVipSales value) {
        this.getVipSalseResult = value;
    }

}
