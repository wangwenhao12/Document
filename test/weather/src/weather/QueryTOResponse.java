
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
 *         &lt;element name="QueryTOResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfTOresult" minOccurs="0"/>
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
    "queryTOResult"
})
@XmlRootElement(name = "QueryTOResponse")
public class QueryTOResponse {

    @XmlElement(name = "QueryTOResult")
    protected ResponseDataOfTOresult queryTOResult;

    /**
     * ��ȡqueryTOResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfTOresult }
     *     
     */
    public ResponseDataOfTOresult getQueryTOResult() {
        return queryTOResult;
    }

    /**
     * ����queryTOResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfTOresult }
     *     
     */
    public void setQueryTOResult(ResponseDataOfTOresult value) {
        this.queryTOResult = value;
    }

}