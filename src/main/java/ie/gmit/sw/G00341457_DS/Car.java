//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.11.08 at 08:22:49 PM GMT 
//


package ie.gmit.sw.G00341457_DS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Car complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Car"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yearMade" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Car", propOrder = {
    "make",
    "reg",
    "yearMade",
    "color",
    "condition"
})
public class Car {

    @XmlElement(name = "Make", required = true)
    protected String make;
    @XmlElement(name = "Reg", required = true)
    protected String reg;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yearMade;
    @XmlElement(required = true)
    protected String color;
    @XmlElement(required = true)
    protected String condition;

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the reg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReg() {
        return reg;
    }

    /**
     * Sets the value of the reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReg(String value) {
        this.reg = value;
    }

    /**
     * Gets the value of the yearMade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMade() {
        return yearMade;
    }

    /**
     * Sets the value of the yearMade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMade(XMLGregorianCalendar value) {
        this.yearMade = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}