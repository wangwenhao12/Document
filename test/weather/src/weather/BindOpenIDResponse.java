
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
 *         &lt;element name="BindOpenIDResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfEmptyResponeData" minOccurs="0"/>
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
    "bindOpenIDResult"
})
@XmlRootElement(name = "BindOpenIDResponse")
public class BindOpenIDResponse {

    @XmlElement(name = "BindOpenIDResult")
    protected ResponseDataOfEmptyResponeData bindOpenIDResult;

    /**
     * ��ȡbindOpenIDResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfEmptyResponeData }
     *     
     */
    public ResponseDataOfEmptyResponeData getBindOpenIDResult() {
        return bindOpenIDResult;
    }

    /**
     * ����bindOpenIDResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfEmptyResponeData }
     *     
     */
    public void setBindOpenIDResult(ResponseDataOfEmptyResponeData value) {
        this.bindOpenIDResult = value;
    }

}
