
package ma.amarghad.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toMAD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="toMAD">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="euroAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toMAD", propOrder = {
    "euroAmount"
})
public class ToMAD {

    protected double euroAmount;

    /**
     * Gets the value of the euroAmount property.
     * 
     */
    public double getEuroAmount() {
        return euroAmount;
    }

    /**
     * Sets the value of the euroAmount property.
     * 
     */
    public void setEuroAmount(double value) {
        this.euroAmount = value;
    }

}
