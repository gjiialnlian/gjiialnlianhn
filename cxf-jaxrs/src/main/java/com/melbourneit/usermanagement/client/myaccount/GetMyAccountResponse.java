package com.melbourneit.usermanagement.client.myaccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"out"})
@XmlRootElement(name = "getMyAccountResponse")
public class GetMyAccountResponse {

    @XmlElement(required = true, nillable = true)
    protected MyAccountVO out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link MyAccountVO }
     *     
     */
    public MyAccountVO getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyAccountVO }
     *     
     */
    public void setOut(MyAccountVO value) {
        this.out = value;
    }

}
