
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
 *         &lt;element name="GetGradeListResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfGradeInfo" minOccurs="0"/>
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
    "getGradeListResult"
})
@XmlRootElement(name = "GetGradeListResponse")
public class GetGradeListResponse {

    @XmlElement(name = "GetGradeListResult")
    protected ResponseDataOfGradeInfo getGradeListResult;

    /**
     * ��ȡgetGradeListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfGradeInfo }
     *     
     */
    public ResponseDataOfGradeInfo getGetGradeListResult() {
        return getGradeListResult;
    }

    /**
     * ����getGradeListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfGradeInfo }
     *     
     */
    public void setGetGradeListResult(ResponseDataOfGradeInfo value) {
        this.getGradeListResult = value;
    }

}
