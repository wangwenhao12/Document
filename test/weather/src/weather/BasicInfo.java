
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BasicInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BasicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vipgrade" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *         &lt;element name="idcardtype" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *         &lt;element name="xf_vipcodeprefix" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *         &lt;element name="adjuest_cause" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicInfo", propOrder = {
    "vipgrade",
    "idcardtype",
    "xfVipcodeprefix",
    "adjuestCause"
})
public class BasicInfo {

    protected ArrayOfCombo vipgrade;
    protected ArrayOfCombo idcardtype;
    @XmlElement(name = "xf_vipcodeprefix")
    protected ArrayOfCombo xfVipcodeprefix;
    @XmlElement(name = "adjuest_cause")
    protected ArrayOfCombo adjuestCause;

    /**
     * ��ȡvipgrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getVipgrade() {
        return vipgrade;
    }

    /**
     * ����vipgrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setVipgrade(ArrayOfCombo value) {
        this.vipgrade = value;
    }

    /**
     * ��ȡidcardtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getIdcardtype() {
        return idcardtype;
    }

    /**
     * ����idcardtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setIdcardtype(ArrayOfCombo value) {
        this.idcardtype = value;
    }

    /**
     * ��ȡxfVipcodeprefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getXfVipcodeprefix() {
        return xfVipcodeprefix;
    }

    /**
     * ����xfVipcodeprefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setXfVipcodeprefix(ArrayOfCombo value) {
        this.xfVipcodeprefix = value;
    }

    /**
     * ��ȡadjuestCause���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getAdjuestCause() {
        return adjuestCause;
    }

    /**
     * ����adjuestCause���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setAdjuestCause(ArrayOfCombo value) {
        this.adjuestCause = value;
    }

}
