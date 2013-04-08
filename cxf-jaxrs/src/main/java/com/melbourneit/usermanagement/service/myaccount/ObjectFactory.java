package com.melbourneit.usermanagement.service.myaccount;

import javax.xml.bind.annotation.XmlRegistry;

import com.melbourneit.usermanagement.util.String2StringMap;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public String2StringMap createString2StringMap() {
        return new String2StringMap();
    }

    public GetMyAccount createGetMyAccount() {
        return new GetMyAccount();
    }

    public GetMyAccountResponse createGetMyAccountResponse() {
        return new GetMyAccountResponse();
    }

    public String2StringMap.Entry createString2StringMapEntry() {
        return new String2StringMap.Entry();
    }
}
