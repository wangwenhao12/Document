
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RepairConsumeRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RepairConsumeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salestotal" type="{http://www.tech-trans.com.cn/}txsalestotal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairConsumeRequest", propOrder = {
    "salestotal"
})
public class RepairConsumeRequest {

    protected Txsalestotal salestotal;

    /**
     * ��ȡsalestotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Txsalestotal }
     *     
     */
    public Txsalestotal getSalestotal() {
        return salestotal;
    }

    /**
     * ����salestotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Txsalestotal }
     *     
     */
    public void setSalestotal(Txsalestotal value) {
        this.salestotal = value;
    }

}
