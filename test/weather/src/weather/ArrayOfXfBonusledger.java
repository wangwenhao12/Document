
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfXf_bonusledger complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfXf_bonusledger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xf_bonusledger" type="{http://www.tech-trans.com.cn/}xf_bonusledger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfXf_bonusledger", propOrder = {
    "xfBonusledger"
})
public class ArrayOfXfBonusledger {

    @XmlElement(name = "xf_bonusledger", nillable = true)
    protected List<XfBonusledger> xfBonusledger;

    /**
     * Gets the value of the xfBonusledger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xfBonusledger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXfBonusledger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XfBonusledger }
     * 
     * 
     */
    public List<XfBonusledger> getXfBonusledger() {
        if (xfBonusledger == null) {
            xfBonusledger = new ArrayList<XfBonusledger>();
        }
        return this.xfBonusledger;
    }

}
