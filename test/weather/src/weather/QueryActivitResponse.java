
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取queryActivitResult属性的值。
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
     * 设置queryActivitResult属性的值。
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
