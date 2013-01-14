
package gr.manousos.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for e2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="e2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="e2estates" type="{http://service.manousos.gr/}e2Estate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="e2otherEstates" type="{http://service.manousos.gr/}e2OtherEstate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://service.manousos.gr/}e2Id" minOccurs="0"/>
 *         &lt;element name="isComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxpayer" type="{http://service.manousos.gr/}taxpayer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "e2", propOrder = {
    "e2Estates",
    "e2OtherEstates",
    "id",
    "isComplete",
    "taxpayer"
})
public class E2 {

    @XmlElement(name = "e2estates", nillable = true)
    protected List<E2Estate> e2Estates;
    @XmlElement(name = "e2otherEstates", nillable = true)
    protected List<E2OtherEstate> e2OtherEstates;
    protected E2Id id;
    protected Integer isComplete;
    protected Taxpayer taxpayer;

    /**
     * Gets the value of the e2Estates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e2Estates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE2Estates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E2Estate }
     * 
     * 
     */
    public List<E2Estate> getE2Estates() {
        if (e2Estates == null) {
            e2Estates = new ArrayList<E2Estate>();
        }
        return this.e2Estates;
    }

    /**
     * Gets the value of the e2OtherEstates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e2OtherEstates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE2OtherEstates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E2OtherEstate }
     * 
     * 
     */
    public List<E2OtherEstate> getE2OtherEstates() {
        if (e2OtherEstates == null) {
            e2OtherEstates = new ArrayList<E2OtherEstate>();
        }
        return this.e2OtherEstates;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link E2Id }
     *     
     */
    public E2Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link E2Id }
     *     
     */
    public void setId(E2Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the isComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsComplete() {
        return isComplete;
    }

    /**
     * Sets the value of the isComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsComplete(Integer value) {
        this.isComplete = value;
    }

    /**
     * Gets the value of the taxpayer property.
     * 
     * @return
     *     possible object is
     *     {@link Taxpayer }
     *     
     */
    public Taxpayer getTaxpayer() {
        return taxpayer;
    }

    /**
     * Sets the value of the taxpayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxpayer }
     *     
     */
    public void setTaxpayer(Taxpayer value) {
        this.taxpayer = value;
    }

}
