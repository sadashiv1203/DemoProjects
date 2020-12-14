//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 07:18:03 PM IST 
//


package JaxB_Classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Auth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Auth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uses" type="{http://www.demo.com/Ekyc_Auth/1.0}Uses"/>
 *         &lt;element name="Tkn" type="{http://www.demo.com/Ekyc_Auth/1.0}tkn" minOccurs="0"/>
 *         &lt;element name="Meta" type="{http://www.demo.com/Common/1.0}Meta"/>
 *         &lt;element name="Skey" type="{http://www.demo.com/Ekyc_Auth/1.0}SkeyType"/>
 *         &lt;element name="Data" type="{http://www.demo.com/Ekyc_Auth/1.0}DataType"/>
 *         &lt;element name="Hmac" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tid" use="required" type="{http://www.demo.com/Common/1.0}Tid" />
 *       &lt;attribute name="ac" use="required" type="{http://www.demo.com/Common/1.0}ac" />
 *       &lt;attribute name="sa" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ver" use="required" type="{http://www.demo.com/Common/1.0}Ver" />
 *       &lt;attribute name="txn" use="required" type="{http://www.demo.com/Common/1.0}Txn" />
 *       &lt;attribute name="lk" use="required" type="{http://www.demo.com/Common/1.0}LicenceKey" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Auth", propOrder = {
    "uses",
    "tkn",
    "meta",
    "skey",
    "data",
    "hmac"
})
public class Auth {

    @XmlElement(name = "Uses", required = true)
    protected Uses uses;
    @XmlElement(name = "Tkn")
    protected Tkn tkn;
    @XmlElement(name = "Meta", required = true)
    protected Meta meta;
    @XmlElement(name = "Skey", required = true)
    protected SkeyType skey;
    @XmlElement(name = "Data", required = true)
    protected DataType data;
    @XmlElement(name = "Hmac", required = true)
    protected byte[] hmac;
    @XmlAttribute(name = "tid", required = true)
    protected Tid tid;
    @XmlAttribute(name = "ac", required = true)
    protected String ac;
    @XmlAttribute(name = "sa", required = true)
    protected String sa;
    @XmlAttribute(name = "ver", required = true)
    protected String ver;
    @XmlAttribute(name = "txn", required = true)
    protected String txn;
    @XmlAttribute(name = "lk", required = true)
    protected String lk;

    /**
     * Gets the value of the uses property.
     * 
     * @return
     *     possible object is
     *     {@link Uses }
     *     
     */
    public Uses getUses() {
        return uses;
    }

    /**
     * Sets the value of the uses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uses }
     *     
     */
    public void setUses(Uses value) {
        this.uses = value;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Tkn }
     *     
     */
    public Tkn getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tkn }
     *     
     */
    public void setTkn(Tkn value) {
        this.tkn = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the skey property.
     * 
     * @return
     *     possible object is
     *     {@link SkeyType }
     *     
     */
    public SkeyType getSkey() {
        return skey;
    }

    /**
     * Sets the value of the skey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkeyType }
     *     
     */
    public void setSkey(SkeyType value) {
        this.skey = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setData(DataType value) {
        this.data = value;
    }

    /**
     * Gets the value of the hmac property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHmac() {
        return hmac;
    }

    /**
     * Sets the value of the hmac property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHmac(byte[] value) {
        this.hmac = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link Tid }
     *     
     */
    public Tid getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link 
 }
     *     
     */
    public void setTid(Tid value) {
        this.tid = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAc() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAc(String value) {
        this.ac = value;
    }

    /**
     * Gets the value of the sa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSa() {
        return sa;
    }

    /**
     * Sets the value of the sa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSa(String value) {
        this.sa = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Gets the value of the txn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxn() {
        return txn;
    }

    /**
     * Sets the value of the txn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxn(String value) {
        this.txn = value;
    }

    /**
     * Gets the value of the lk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLk() {
        return lk;
    }

    /**
     * Sets the value of the lk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLk(String value) {
        this.lk = value;
    }

}