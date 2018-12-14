
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsumeRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ConsumeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salestotal" type="{http://www.tech-trans.com.cn/}txsalestotal" minOccurs="0"/>
 *         &lt;element name="tender" type="{http://www.tech-trans.com.cn/}ArrayOfTxsalestender" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.tech-trans.com.cn/}ArrayOfTxsalesitem" minOccurs="0"/>
 *         &lt;element name="isvip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumeRequest", propOrder = {
    "salestotal",
    "tender",
    "items",
    "isvip"
})
public class ConsumeRequest {

    protected Txsalestotal salestotal;
    protected ArrayOfTxsalestender tender;
    protected ArrayOfTxsalesitem items;
    protected String isvip;

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

    /**
     * ��ȡtender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTxsalestender }
     *     
     */
    public ArrayOfTxsalestender getTender() {
        return tender;
    }

    /**
     * ����tender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTxsalestender }
     *     
     */
    public void setTender(ArrayOfTxsalestender value) {
        this.tender = value;
    }

    /**
     * ��ȡitems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTxsalesitem }
     *     
     */
    public ArrayOfTxsalesitem getItems() {
        return items;
    }

    /**
     * ����items���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTxsalesitem }
     *     
     */
    public void setItems(ArrayOfTxsalesitem value) {
        this.items = value;
    }

    /**
     * ��ȡisvip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvip() {
        return isvip;
    }

    /**
     * ����isvip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvip(String value) {
        this.isvip = value;
    }

}
