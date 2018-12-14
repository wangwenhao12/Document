
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTxsalestender complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTxsalestender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txsalestender" type="{http://www.tech-trans.com.cn/}txsalestender" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTxsalestender", propOrder = {
    "txsalestender"
})
public class ArrayOfTxsalestender {

    @XmlElement(nillable = true)
    protected List<Txsalestender> txsalestender;

    /**
     * Gets the value of the txsalestender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txsalestender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxsalestender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Txsalestender }
     * 
     * 
     */
    public List<Txsalestender> getTxsalestender() {
        if (txsalestender == null) {
            txsalestender = new ArrayList<Txsalestender>();
        }
        return this.txsalestender;
    }

}
