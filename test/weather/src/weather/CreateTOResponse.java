
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
 *         &lt;element name="CreateTOResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfTOresult" minOccurs="0"/>
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
    "createTOResult"
})
@XmlRootElement(name = "CreateTOResponse")
public class CreateTOResponse {

    @XmlElement(name = "CreateTOResult")
    protected ResponseDataOfTOresult createTOResult;

    /**
     * ��ȡcreateTOResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfTOresult }
     *     
     */
    public ResponseDataOfTOresult getCreateTOResult() {
        return createTOResult;
    }

    /**
     * ����createTOResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfTOresult }
     *     
     */
    public void setCreateTOResult(ResponseDataOfTOresult value) {
        this.createTOResult = value;
    }

}
