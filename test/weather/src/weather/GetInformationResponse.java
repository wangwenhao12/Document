
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
 *         &lt;element name="GetInformationResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfEB_INFORMATION" minOccurs="0"/>
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
    "getInformationResult"
})
@XmlRootElement(name = "GetInformationResponse")
public class GetInformationResponse {

    @XmlElement(name = "GetInformationResult")
    protected ResponseDataOfListOfEBINFORMATION getInformationResult;

    /**
     * ��ȡgetInformationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfEBINFORMATION }
     *     
     */
    public ResponseDataOfListOfEBINFORMATION getGetInformationResult() {
        return getInformationResult;
    }

    /**
     * ����getInformationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfEBINFORMATION }
     *     
     */
    public void setGetInformationResult(ResponseDataOfListOfEBINFORMATION value) {
        this.getInformationResult = value;
    }

}
