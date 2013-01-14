
package gr.manousos.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for e2CoOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="e2CoOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="e2estate" type="{http://service.manousos.gr/}e2Estate" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="rent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "e2CoOwner", propOrder = {
    "address",
    "afm",
    "e2Estate",
    "fullName",
    "id",
    "percent",
    "rent"
})
public class E2CoOwner {

    protected String address;
    protected String afm;
    @XmlElement(name = "e2estate")
    protected E2Estate e2Estate;
    protected String fullName;
    protected int id;
    protected float percent;
    protected Float rent;

    /**
     * Gets the value of the address property.
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
     * Sets the value of the address property.
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
     * Gets the value of the afm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfm() {
        return afm;
    }

    /**
     * Sets the value of the afm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfm(String value) {
        this.afm = value;
    }

    /**
     * Gets the value of the e2Estate property.
     * 
     * @return
     *     possible object is
     *     {@link E2Estate }
     *     
     */
    public E2Estate getE2Estate() {
        return e2Estate;
    }

    /**
     * Sets the value of the e2Estate property.
     * 
     * @param value
     *     allowed object is
     *     {@link E2Estate }
     *     
     */
    public void setE2Estate(E2Estate value) {
        this.e2Estate = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     */
    public float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     */
    public void setPercent(float value) {
        this.percent = value;
    }

    /**
     * Gets the value of the rent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRent() {
        return rent;
    }

    /**
     * Sets the value of the rent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRent(Float value) {
        this.rent = value;
    }

}
