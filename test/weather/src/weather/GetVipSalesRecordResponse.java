
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
 *         &lt;element name="GetVipSalesRecordResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfxf_transsalestotal" minOccurs="0"/>
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
    "getVipSalesRecordResult"
})
@XmlRootElement(name = "GetVipSalesRecordResponse")
public class GetVipSalesRecordResponse {

    @XmlElement(name = "GetVipSalesRecordResult")
    protected ResponseDataOfListOfxfTranssalestotal getVipSalesRecordResult;

    /**
     * ��ȡgetVipSalesRecordResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfxfTranssalestotal }
     *     
     */
    public ResponseDataOfListOfxfTranssalestotal getGetVipSalesRecordResult() {
        return getVipSalesRecordResult;
    }

    /**
     * ����getVipSalesRecordResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfxfTranssalestotal }
     *     
     */
    public void setGetVipSalesRecordResult(ResponseDataOfListOfxfTranssalestotal value) {
        this.getVipSalesRecordResult = value;
    }

}
