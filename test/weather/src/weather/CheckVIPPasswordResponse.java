
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
 *         &lt;element name="CheckVIP_PasswordResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBoolean" minOccurs="0"/>
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
    "checkVIPPasswordResult"
})
@XmlRootElement(name = "CheckVIP_PasswordResponse")
public class CheckVIPPasswordResponse {

    @XmlElement(name = "CheckVIP_PasswordResult")
    protected ResponseDataOfBoolean checkVIPPasswordResult;

    /**
     * ��ȡcheckVIPPasswordResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBoolean }
     *     
     */
    public ResponseDataOfBoolean getCheckVIPPasswordResult() {
        return checkVIPPasswordResult;
    }

    /**
     * ����checkVIPPasswordResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBoolean }
     *     
     */
    public void setCheckVIPPasswordResult(ResponseDataOfBoolean value) {
        this.checkVIPPasswordResult = value;
    }

}
