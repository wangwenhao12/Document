
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
 *         &lt;element name="ActivitEnrollResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBonusInfo" minOccurs="0"/>
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
    "activitEnrollResult"
})
@XmlRootElement(name = "ActivitEnrollResponse")
public class ActivitEnrollResponse {

    @XmlElement(name = "ActivitEnrollResult")
    protected ResponseDataOfBonusInfo activitEnrollResult;

    /**
     * ��ȡactivitEnrollResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBonusInfo }
     *     
     */
    public ResponseDataOfBonusInfo getActivitEnrollResult() {
        return activitEnrollResult;
    }

    /**
     * ����activitEnrollResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBonusInfo }
     *     
     */
    public void setActivitEnrollResult(ResponseDataOfBonusInfo value) {
        this.activitEnrollResult = value;
    }

}
