
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="record" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "wsID",
    "record"
})
@XmlRootElement(name = "GetRandomBuySellIDs")
public class GetRandomBuySellIDs {

    @XmlElement(name = "_key")
    protected String key;
    protected int wsID;
    protected int record;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the wsID property.
     * 
     */
    public int getWsID() {
        return wsID;
    }

    /**
     * Sets the value of the wsID property.
     * 
     */
    public void setWsID(int value) {
        this.wsID = value;
    }

    /**
     * Gets the value of the record property.
     * 
     */
    public int getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     */
    public void setRecord(int value) {
        this.record = value;
    }

}
