
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TOresult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TOresult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.tech-trans.com.cn/}TrfOutModel" minOccurs="0"/>
 *         &lt;element name="docno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.tech-trans.com.cn/}State" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOresult", propOrder = {
    "extensionData",
    "data",
    "docno",
    "header"
})
public class TOresult {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected TrfOutModel data;
    protected String docno;
    protected State header;

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
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrfOutModel }
     *     
     */
    public TrfOutModel getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrfOutModel }
     *     
     */
    public void setData(TrfOutModel value) {
        this.data = value;
    }

    /**
     * ��ȡdocno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocno() {
        return docno;
    }

    /**
     * ����docno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocno(String value) {
        this.docno = value;
    }

    /**
     * ��ȡheader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getHeader() {
        return header;
    }

    /**
     * ����header���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setHeader(State value) {
        this.header = value;
    }

}
