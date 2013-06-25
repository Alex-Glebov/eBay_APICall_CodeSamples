//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A set of parameters that control the retrieval of categories (not items)
 * 				that match a search query. In GetSearchResults, at least one child element
 * 				must be specified in order to retrieve matching categories. If empty or
 * 				not present, no matching category information is returned.
 * 			
 * 
 * <p>Java class for RequestCategoriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestCategoriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoriesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxCategories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxSubcategories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Levels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DemandData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestCategoriesType", propOrder = {
    "categoriesOnly",
    "maxCategories",
    "maxSubcategories",
    "levels",
    "demandData"
})
public class RequestCategoriesType {

    @XmlElement(name = "CategoriesOnly")
    protected Boolean categoriesOnly;
    @XmlElement(name = "MaxCategories")
    protected Integer maxCategories;
    @XmlElement(name = "MaxSubcategories")
    protected Integer maxSubcategories;
    @XmlElement(name = "Levels")
    protected Integer levels;
    @XmlElement(name = "DemandData")
    protected Boolean demandData;

    /**
     * Gets the value of the categoriesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategoriesOnly() {
        return categoriesOnly;
    }

    /**
     * Sets the value of the categoriesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoriesOnly(Boolean value) {
        this.categoriesOnly = value;
    }

    /**
     * Gets the value of the maxCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCategories() {
        return maxCategories;
    }

    /**
     * Sets the value of the maxCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCategories(Integer value) {
        this.maxCategories = value;
    }

    /**
     * Gets the value of the maxSubcategories property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSubcategories() {
        return maxSubcategories;
    }

    /**
     * Sets the value of the maxSubcategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSubcategories(Integer value) {
        this.maxSubcategories = value;
    }

    /**
     * Gets the value of the levels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevels(Integer value) {
        this.levels = value;
    }

    /**
     * Gets the value of the demandData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDemandData() {
        return demandData;
    }

    /**
     * Sets the value of the demandData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDemandData(Boolean value) {
        this.demandData = value;
    }

}