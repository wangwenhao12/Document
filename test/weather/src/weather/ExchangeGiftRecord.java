
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExchangeGiftRecord complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExchangeGiftRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIFTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIFTIMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeGiftRecord", propOrder = {
    "txdate",
    "giftname",
    "giftimg",
    "bonus",
    "qty"
})
public class ExchangeGiftRecord {

    @XmlElement(name = "TXDATE")
    protected String txdate;
    @XmlElement(name = "GIFTNAME")
    protected String giftname;
    @XmlElement(name = "GIFTIMG")
    protected String giftimg;
    @XmlElement(name = "BONUS", required = true)
    protected BigDecimal bonus;
    @XmlElement(name = "QTY", required = true)
    protected BigDecimal qty;

    /**
     * ��ȡtxdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXDATE() {
        return txdate;
    }

    /**
     * ����txdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXDATE(String value) {
        this.txdate = value;
    }

    /**
     * ��ȡgiftname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIFTNAME() {
        return giftname;
    }

    /**
     * ����giftname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIFTNAME(String value) {
        this.giftname = value;
    }

    /**
     * ��ȡgiftimg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIFTIMG() {
        return giftimg;
    }

    /**
     * ����giftimg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIFTIMG(String value) {
        this.giftimg = value;
    }

    /**
     * ��ȡbonus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBONUS() {
        return bonus;
    }

    /**
     * ����bonus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBONUS(BigDecimal value) {
        this.bonus = value;
    }

    /**
     * ��ȡqty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQTY() {
        return qty;
    }

    /**
     * ����qty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQTY(BigDecimal value) {
        this.qty = value;
    }

}
