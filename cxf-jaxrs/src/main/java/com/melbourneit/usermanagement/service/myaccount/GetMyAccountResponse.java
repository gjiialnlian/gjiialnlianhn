package com.melbourneit.usermanagement.service.myaccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.melbourneit.usermanagement.client.myaccount.MyAccountVO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"out"})

@XmlRootElement(name = "getMyAccountResponse")
public class GetMyAccountResponse {

    @XmlElement(required = true, nillable = true)
    protected MyAccountVO out;

    public MyAccountVO getOut() {
        return out;
    }

    public void setOut(MyAccountVO value) {
        this.out = value;
    }
}
