
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCRMTender complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCRMTender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRMTender" type="{http://www.tech-trans.com.cn/}CRMTender" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCRMTender", propOrder = {
    "crmTender"
})
public class ArrayOfCRMTender {

    @XmlElement(name = "CRMTender", nillable = true)
    protected List<CRMTender> crmTender;

    /**
     * Gets the value of the crmTender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmTender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMTender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMTender }
     * 
     * 
     */
    public List<CRMTender> getCRMTender() {
        if (crmTender == null) {
            crmTender = new ArrayList<CRMTender>();
        }
        return this.crmTender;
    }

}
