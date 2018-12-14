
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_vip complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="xf_vip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isfreeze" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jointdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vip_souce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vipgrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weixin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuestaffcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuestore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcodeprefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_vip", propOrder = {
    "extensionData",
    "address",
    "birthday",
    "email",
    "idcardno",
    "idcardtype",
    "isfreeze",
    "jointdate",
    "mobile",
    "sex",
    "surname",
    "vipSouce",
    "vipgrade",
    "weixin",
    "xfGroupid0",
    "xfGroupid1",
    "xfGroupid10",
    "xfGroupid11",
    "xfGroupid12",
    "xfGroupid13",
    "xfGroupid14",
    "xfGroupid15",
    "xfGroupid16",
    "xfGroupid17",
    "xfGroupid18",
    "xfGroupid19",
    "xfGroupid2",
    "xfGroupid3",
    "xfGroupid4",
    "xfGroupid5",
    "xfGroupid6",
    "xfGroupid7",
    "xfGroupid8",
    "xfGroupid9",
    "xfIssuestaffcode",
    "xfIssuestore",
    "xfVipcode",
    "xfVipcodeprefix"
})
public class XfVip {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected String address;
    protected String birthday;
    protected String email;
    protected String idcardno;
    protected String idcardtype;
    protected String isfreeze;
    protected String jointdate;
    protected String mobile;
    protected String sex;
    protected String surname;
    @XmlElement(name = "vip_souce")
    protected String vipSouce;
    protected String vipgrade;
    protected String weixin;
    @XmlElement(name = "xf_groupid0")
    protected String xfGroupid0;
    @XmlElement(name = "xf_groupid1")
    protected String xfGroupid1;
    @XmlElement(name = "xf_groupid10")
    protected String xfGroupid10;
    @XmlElement(name = "xf_groupid11")
    protected String xfGroupid11;
    @XmlElement(name = "xf_groupid12")
    protected String xfGroupid12;
    @XmlElement(name = "xf_groupid13")
    protected String xfGroupid13;
    @XmlElement(name = "xf_groupid14")
    protected String xfGroupid14;
    @XmlElement(name = "xf_groupid15")
    protected String xfGroupid15;
    @XmlElement(name = "xf_groupid16")
    protected String xfGroupid16;
    @XmlElement(name = "xf_groupid17")
    protected String xfGroupid17;
    @XmlElement(name = "xf_groupid18")
    protected String xfGroupid18;
    @XmlElement(name = "xf_groupid19")
    protected String xfGroupid19;
    @XmlElement(name = "xf_groupid2")
    protected String xfGroupid2;
    @XmlElement(name = "xf_groupid3")
    protected String xfGroupid3;
    @XmlElement(name = "xf_groupid4")
    protected String xfGroupid4;
    @XmlElement(name = "xf_groupid5")
    protected String xfGroupid5;
    @XmlElement(name = "xf_groupid6")
    protected String xfGroupid6;
    @XmlElement(name = "xf_groupid7")
    protected String xfGroupid7;
    @XmlElement(name = "xf_groupid8")
    protected String xfGroupid8;
    @XmlElement(name = "xf_groupid9")
    protected String xfGroupid9;
    @XmlElement(name = "xf_issuestaffcode")
    protected String xfIssuestaffcode;
    @XmlElement(name = "xf_issuestore")
    protected String xfIssuestore;
    @XmlElement(name = "xf_vipcode")
    protected String xfVipcode;
    @XmlElement(name = "xf_vipcodeprefix")
    protected String xfVipcodeprefix;

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
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡbirthday���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * ����birthday���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡidcardno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * ����idcardno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * ��ȡidcardtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardtype() {
        return idcardtype;
    }

    /**
     * ����idcardtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardtype(String value) {
        this.idcardtype = value;
    }

    /**
     * ��ȡisfreeze���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsfreeze() {
        return isfreeze;
    }

    /**
     * ����isfreeze���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsfreeze(String value) {
        this.isfreeze = value;
    }

    /**
     * ��ȡjointdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointdate() {
        return jointdate;
    }

    /**
     * ����jointdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointdate(String value) {
        this.jointdate = value;
    }

    /**
     * ��ȡmobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����mobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * ��ȡsex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * ����sex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * ��ȡsurname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * ����surname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * ��ȡvipSouce���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipSouce() {
        return vipSouce;
    }

    /**
     * ����vipSouce���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipSouce(String value) {
        this.vipSouce = value;
    }

    /**
     * ��ȡvipgrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipgrade() {
        return vipgrade;
    }

    /**
     * ����vipgrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipgrade(String value) {
        this.vipgrade = value;
    }

    /**
     * ��ȡweixin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * ����weixin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeixin(String value) {
        this.weixin = value;
    }

    /**
     * ��ȡxfGroupid0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid0() {
        return xfGroupid0;
    }

    /**
     * ����xfGroupid0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid0(String value) {
        this.xfGroupid0 = value;
    }

    /**
     * ��ȡxfGroupid1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid1() {
        return xfGroupid1;
    }

    /**
     * ����xfGroupid1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid1(String value) {
        this.xfGroupid1 = value;
    }

    /**
     * ��ȡxfGroupid10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid10() {
        return xfGroupid10;
    }

    /**
     * ����xfGroupid10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid10(String value) {
        this.xfGroupid10 = value;
    }

    /**
     * ��ȡxfGroupid11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid11() {
        return xfGroupid11;
    }

    /**
     * ����xfGroupid11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid11(String value) {
        this.xfGroupid11 = value;
    }

    /**
     * ��ȡxfGroupid12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid12() {
        return xfGroupid12;
    }

    /**
     * ����xfGroupid12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid12(String value) {
        this.xfGroupid12 = value;
    }

    /**
     * ��ȡxfGroupid13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid13() {
        return xfGroupid13;
    }

    /**
     * ����xfGroupid13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid13(String value) {
        this.xfGroupid13 = value;
    }

    /**
     * ��ȡxfGroupid14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid14() {
        return xfGroupid14;
    }

    /**
     * ����xfGroupid14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid14(String value) {
        this.xfGroupid14 = value;
    }

    /**
     * ��ȡxfGroupid15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid15() {
        return xfGroupid15;
    }

    /**
     * ����xfGroupid15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid15(String value) {
        this.xfGroupid15 = value;
    }

    /**
     * ��ȡxfGroupid16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid16() {
        return xfGroupid16;
    }

    /**
     * ����xfGroupid16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid16(String value) {
        this.xfGroupid16 = value;
    }

    /**
     * ��ȡxfGroupid17���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid17() {
        return xfGroupid17;
    }

    /**
     * ����xfGroupid17���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid17(String value) {
        this.xfGroupid17 = value;
    }

    /**
     * ��ȡxfGroupid18���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid18() {
        return xfGroupid18;
    }

    /**
     * ����xfGroupid18���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid18(String value) {
        this.xfGroupid18 = value;
    }

    /**
     * ��ȡxfGroupid19���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid19() {
        return xfGroupid19;
    }

    /**
     * ����xfGroupid19���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid19(String value) {
        this.xfGroupid19 = value;
    }

    /**
     * ��ȡxfGroupid2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid2() {
        return xfGroupid2;
    }

    /**
     * ����xfGroupid2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid2(String value) {
        this.xfGroupid2 = value;
    }

    /**
     * ��ȡxfGroupid3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid3() {
        return xfGroupid3;
    }

    /**
     * ����xfGroupid3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid3(String value) {
        this.xfGroupid3 = value;
    }

    /**
     * ��ȡxfGroupid4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid4() {
        return xfGroupid4;
    }

    /**
     * ����xfGroupid4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid4(String value) {
        this.xfGroupid4 = value;
    }

    /**
     * ��ȡxfGroupid5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid5() {
        return xfGroupid5;
    }

    /**
     * ����xfGroupid5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid5(String value) {
        this.xfGroupid5 = value;
    }

    /**
     * ��ȡxfGroupid6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid6() {
        return xfGroupid6;
    }

    /**
     * ����xfGroupid6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid6(String value) {
        this.xfGroupid6 = value;
    }

    /**
     * ��ȡxfGroupid7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid7() {
        return xfGroupid7;
    }

    /**
     * ����xfGroupid7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid7(String value) {
        this.xfGroupid7 = value;
    }

    /**
     * ��ȡxfGroupid8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid8() {
        return xfGroupid8;
    }

    /**
     * ����xfGroupid8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid8(String value) {
        this.xfGroupid8 = value;
    }

    /**
     * ��ȡxfGroupid9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid9() {
        return xfGroupid9;
    }

    /**
     * ����xfGroupid9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid9(String value) {
        this.xfGroupid9 = value;
    }

    /**
     * ��ȡxfIssuestaffcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuestaffcode() {
        return xfIssuestaffcode;
    }

    /**
     * ����xfIssuestaffcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuestaffcode(String value) {
        this.xfIssuestaffcode = value;
    }

    /**
     * ��ȡxfIssuestore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuestore() {
        return xfIssuestore;
    }

    /**
     * ����xfIssuestore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuestore(String value) {
        this.xfIssuestore = value;
    }

    /**
     * ��ȡxfVipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipcode() {
        return xfVipcode;
    }

    /**
     * ����xfVipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipcode(String value) {
        this.xfVipcode = value;
    }

    /**
     * ��ȡxfVipcodeprefix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipcodeprefix() {
        return xfVipcodeprefix;
    }

    /**
     * ����xfVipcodeprefix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipcodeprefix(String value) {
        this.xfVipcodeprefix = value;
    }

}
