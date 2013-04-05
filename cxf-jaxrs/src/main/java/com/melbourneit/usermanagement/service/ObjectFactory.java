
package com.melbourneit.usermanagement.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.melbourneit.usermanagement.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.melbourneit.usermanagement.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link String2StringMap }
     * 
     */
    public String2StringMap createString2StringMap() {
        return new String2StringMap();
    }

    /**
     * Create an instance of {@link GetMyAccount }
     * 
     */
    public GetMyAccount createGetMyAccount() {
        return new GetMyAccount();
    }

    /**
     * Create an instance of {@link GetMyAccountResponse }
     * 
     */
    public GetMyAccountResponse createGetMyAccountResponse() {
        return new GetMyAccountResponse();
    }

    /**
     * Create an instance of {@link String2StringMap.Entry }
     * 
     */
    public String2StringMap.Entry createString2StringMapEntry() {
        return new String2StringMap.Entry();
    }

}
