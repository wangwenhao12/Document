
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfXf_transsalestotal complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfXf_transsalestotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xf_transsalestotal" type="{http://www.tech-trans.com.cn/}xf_transsalestotal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfXf_transsalestotal", propOrder = {
    "xfTranssalestotal"
})
public class ArrayOfXfTranssalestotal {

    @XmlElement(name = "xf_transsalestotal", nillable = true)
    protected List<XfTranssalestotal> xfTranssalestotal;

    /**
     * Gets the value of the xfTranssalestotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xfTranssalestotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXfTranssalestotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XfTranssalestotal }
     * 
     * 
     */
    public List<XfTranssalestotal> getXfTranssalestotal() {
        if (xfTranssalestotal == null) {
            xfTranssalestotal = new ArrayList<XfTranssalestotal>();
        }
        return this.xfTranssalestotal;
    }

}
