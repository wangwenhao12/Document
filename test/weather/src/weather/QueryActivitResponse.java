
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
 *         &lt;element name="QueryActivitResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfCRM_MEMBERMSG" minOccurs="0"/>
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
    "queryActivitResult"
})
@XmlRootElement(name = "QueryActivitResponse")
public class QueryActivitResponse {

    @XmlElement(name = "QueryActivitResult")
    protected ResponseDataOfListOfCRMMEMBERMSG queryActivitResult;

    /**
     * ��ȡqueryActivitResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfCRMMEMBERMSG }
     *     
     */
    public ResponseDataOfListOfCRMMEMBERMSG getQueryActivitResult() {
        return queryActivitResult;
    }

    /**
     * ����queryActivitResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfCRMMEMBERMSG }
     *     
     */
    public void setQueryActivitResult(ResponseDataOfListOfCRMMEMBERMSG value) {
        this.queryActivitResult = value;
    }

}
