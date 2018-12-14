
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrfOutModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrfOutModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="tods" type="{http://www.tech-trans.com.cn/}ArrayOfTOItemModel" minOccurs="0"/>
 *         &lt;element name="toh" type="{http://www.tech-trans.com.cn/}TOModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrfOutModel", propOrder = {
    "extensionData",
    "tods",
    "toh"
})
public class TrfOutModel {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected ArrayOfTOItemModel tods;
    protected TOModel toh;

    /**
     * ��ȡextensionData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * ����extensionData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * ��ȡtods���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTOItemModel }
     *     
     */
    public ArrayOfTOItemModel getTods() {
        return tods;
    }

    /**
     * ����tods���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTOItemModel }
     *     
     */
    public void setTods(ArrayOfTOItemModel value) {
        this.tods = value;
    }

    /**
     * ��ȡtoh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TOModel }
     *     
     */
    public TOModel getToh() {
        return toh;
    }

    /**
     * ����toh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TOModel }
     *     
     */
    public void setToh(TOModel value) {
        this.toh = value;
    }

}
