
package gr.manousos.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for e2Estate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="e2Estate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="e2" type="{http://service.manousos.gr/}e2" minOccurs="0"/>
 *         &lt;element name="e2coOwners" type="{http://service.manousos.gr/}e2CoOwner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyRental" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rersentCoOwner" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="revenueFreeHome" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="revenueFreeOffice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="revenuePrivateHotel" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="revenuePrivateOffice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tenantAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenantFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "e2Estate", propOrder = {
    "area",
    "e2",
    "e2CoOwners",
    "estateId",
    "from",
    "location",
    "monthlyRental",
    "position",
    "rersentCoOwner",
    "revenueFreeHome",
    "revenueFreeOffice",
    "revenuePrivateHotel",
    "revenuePrivateOffice",
    "tenantAfm",
    "tenantFullName",
    "to",
    "usage"
})
public class E2Estate {

    protected float area;
    protected E2 e2;
    @XmlElement(name = "e2coOwners", nillable = true)
    protected List<E2CoOwner> e2CoOwners;
    protected Integer estateId;
    protected int from;
    protected String location;
    protected float monthlyRental;
    protected String position;
    protected float rersentCoOwner;
    protected float revenueFreeHome;
    protected float revenueFreeOffice;
    protected float revenuePrivateHotel;
    protected float revenuePrivateOffice;
    protected String tenantAfm;
    protected String tenantFullName;
    protected int to;
    protected String usage;

    /**
     * Gets the value of the area property.
     * 
     */
    public float getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(float value) {
        this.area = value;
    }

    /**
     * Gets the value of the e2 property.
     * 
     * @return
     *     possible object is
     *     {@link E2 }
     *     
     */
    public E2 getE2() {
        return e2;
    }

    /**
     * Sets the value of the e2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link E2 }
     *     
     */
    public void setE2(E2 value) {
        this.e2 = value;
    }

    /**
     * Gets the value of the e2CoOwners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e2CoOwners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE2CoOwners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E2CoOwner }
     * 
     * 
     */
    public List<E2CoOwner> getE2CoOwners() {
        if (e2CoOwners == null) {
            e2CoOwners = new ArrayList<E2CoOwner>();
        }
        return this.e2CoOwners;
    }

    /**
     * Gets the value of the estateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstateId() {
        return estateId;
    }

    /**
     * Sets the value of the estateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstateId(Integer value) {
        this.estateId = value;
    }

    /**
     * Gets the value of the from property.
     * 
     */
    public int getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     */
    public void setFrom(int value) {
        this.from = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the monthlyRental property.
     * 
     */
    public float getMonthlyRental() {
        return monthlyRental;
    }

    /**
     * Sets the value of the monthlyRental property.
     * 
     */
    public void setMonthlyRental(float value) {
        this.monthlyRental = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the rersentCoOwner property.
     * 
     */
    public float getRersentCoOwner() {
        return rersentCoOwner;
    }

    /**
     * Sets the value of the rersentCoOwner property.
     * 
     */
    public void setRersentCoOwner(float value) {
        this.rersentCoOwner = value;
    }

    /**
     * Gets the value of the revenueFreeHome property.
     * 
     */
    public float getRevenueFreeHome() {
        return revenueFreeHome;
    }

    /**
     * Sets the value of the revenueFreeHome property.
     * 
     */
    public void setRevenueFreeHome(float value) {
        this.revenueFreeHome = value;
    }

    /**
     * Gets the value of the revenueFreeOffice property.
     * 
     */
    public float getRevenueFreeOffice() {
        return revenueFreeOffice;
    }

    /**
     * Sets the value of the revenueFreeOffice property.
     * 
     */
    public void setRevenueFreeOffice(float value) {
        this.revenueFreeOffice = value;
    }

    /**
     * Gets the value of the revenuePrivateHotel property.
     * 
     */
    public float getRevenuePrivateHotel() {
        return revenuePrivateHotel;
    }

    /**
     * Sets the value of the revenuePrivateHotel property.
     * 
     */
    public void setRevenuePrivateHotel(float value) {
        this.revenuePrivateHotel = value;
    }

    /**
     * Gets the value of the revenuePrivateOffice property.
     * 
     */
    public float getRevenuePrivateOffice() {
        return revenuePrivateOffice;
    }

    /**
     * Sets the value of the revenuePrivateOffice property.
     * 
     */
    public void setRevenuePrivateOffice(float value) {
        this.revenuePrivateOffice = value;
    }

    /**
     * Gets the value of the tenantAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantAfm() {
        return tenantAfm;
    }

    /**
     * Sets the value of the tenantAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantAfm(String value) {
        this.tenantAfm = value;
    }

    /**
     * Gets the value of the tenantFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantFullName() {
        return tenantFullName;
    }

    /**
     * Sets the value of the tenantFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantFullName(String value) {
        this.tenantFullName = value;
    }

    /**
     * Gets the value of the to property.
     * 
     */
    public int getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     */
    public void setTo(int value) {
        this.to = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

}
