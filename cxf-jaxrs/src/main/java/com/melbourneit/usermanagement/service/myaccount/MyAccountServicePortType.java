package com.melbourneit.usermanagement.service.myaccount;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.melbourneit.usermanagement.client.myaccount.MyAccountVO;

@WebService(targetNamespace = MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, name = "MyAccountServicePortType")
@XmlSeeAlso({ObjectFactory.class, ObjectFactory.class})
public interface MyAccountServicePortType {

    @WebResult(name = "out", targetNamespace = MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS)
    @RequestWrapper(localName = "getMyAccount", targetNamespace = MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, className = "com.melbourneit.usermanagement.service.GetMyAccount")
    @WebMethod
    @ResponseWrapper(localName = "getMyAccountResponse", targetNamespace = MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, className = "com.melbourneit.usermanagement.service.GetMyAccountResponse")
    public MyAccountVO getMyAccount(
        @WebParam(name = "in0", targetNamespace = MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS)
        java.lang.String in0
    );
}
