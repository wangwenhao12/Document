
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseDataOfNodeInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResponseDataOfNodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.tech-trans.com.cn/}ResponseHeader" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.tech-trans.com.cn/}NodeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataOfNodeInfo", propOrder = {
    "header",
    "data"
})
public class ResponseDataOfNodeInfo {

    @XmlElement(name = "Header")
    protected ResponseHeader header;
    @XmlElement(name = "DATA")
    protected NodeInfo data;

    /**
     * ��ȡheader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getHeader() {
        return header;
    }

    /**
     * ����header���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setHeader(ResponseHeader value) {
        this.header = value;
    }

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NodeInfo }
     *     
     */
    public NodeInfo getDATA() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NodeInfo }
     *     
     */
    public void setDATA(NodeInfo value) {
        this.data = value;
    }

}