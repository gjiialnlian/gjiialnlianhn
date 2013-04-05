
package com.melbourneit.usermanagement.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.melbourneit.usermanagement.client package. 
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

    private final static QName _MyAccountVOLogin_QNAME = new QName("http://client.usermanagement.melbourneit.com", "login");
    private final static QName _MyAccountVOChannel_QNAME = new QName("http://client.usermanagement.melbourneit.com", "channel");
    private final static QName _MyAccountVOMobile_QNAME = new QName("http://client.usermanagement.melbourneit.com", "mobile");
    private final static QName _MyAccountVOMessage_QNAME = new QName("http://client.usermanagement.melbourneit.com", "message");
    private final static QName _MyAccountVOSuburb_QNAME = new QName("http://client.usermanagement.melbourneit.com", "suburb");
    private final static QName _MyAccountVOEmail_QNAME = new QName("http://client.usermanagement.melbourneit.com", "email");
    private final static QName _MyAccountVOState_QNAME = new QName("http://client.usermanagement.melbourneit.com", "state");
    private final static QName _MyAccountVOCountryCode_QNAME = new QName("http://client.usermanagement.melbourneit.com", "countryCode");
    private final static QName _MyAccountVOAddress1_QNAME = new QName("http://client.usermanagement.melbourneit.com", "address1");
    private final static QName _MyAccountVOLastname_QNAME = new QName("http://client.usermanagement.melbourneit.com", "lastname");
    private final static QName _MyAccountVOAddress2_QNAME = new QName("http://client.usermanagement.melbourneit.com", "address2");
    private final static QName _MyAccountVOAddress3_QNAME = new QName("http://client.usermanagement.melbourneit.com", "address3");
    private final static QName _MyAccountVOFirstname_QNAME = new QName("http://client.usermanagement.melbourneit.com", "firstname");
    private final static QName _MyAccountVOType_QNAME = new QName("http://client.usermanagement.melbourneit.com", "type");
    private final static QName _MyAccountVOPostcode_QNAME = new QName("http://client.usermanagement.melbourneit.com", "postcode");
    private final static QName _MyAccountVOPassword_QNAME = new QName("http://client.usermanagement.melbourneit.com", "password");
    private final static QName _MyAccountVOParentMyAccount_QNAME = new QName("http://client.usermanagement.melbourneit.com", "parentMyAccount");
    private final static QName _MyAccountVOResult_QNAME = new QName("http://client.usermanagement.melbourneit.com", "result");
    private final static QName _MyAccountVOPhone_QNAME = new QName("http://client.usermanagement.melbourneit.com", "phone");
    private final static QName _MyAccountVOPartyType_QNAME = new QName("http://client.usermanagement.melbourneit.com", "partyType");
    private final static QName _MyAccountVOFax_QNAME = new QName("http://client.usermanagement.melbourneit.com", "fax");
    private final static QName _MyAccountVOStatus_QNAME = new QName("http://client.usermanagement.melbourneit.com", "status");
    private final static QName _MyAccountVOOrganisation_QNAME = new QName("http://client.usermanagement.melbourneit.com", "organisation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.melbourneit.usermanagement.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyAccountVO }
     * 
     */
    public MyAccountVO createMyAccountVO() {
        return new MyAccountVO();
    }

    /**
     * Create an instance of {@link GetMyAccountResponse }
     * 
     */
    public GetMyAccountResponse createGetMyAccountResponse() {
        return new GetMyAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "login", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOLogin(String value) {
        return new JAXBElement<String>(_MyAccountVOLogin_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "channel", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOChannel(String value) {
        return new JAXBElement<String>(_MyAccountVOChannel_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "mobile", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOMobile(String value) {
        return new JAXBElement<String>(_MyAccountVOMobile_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "message", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOMessage(String value) {
        return new JAXBElement<String>(_MyAccountVOMessage_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "suburb", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOSuburb(String value) {
        return new JAXBElement<String>(_MyAccountVOSuburb_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "email", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOEmail(String value) {
        return new JAXBElement<String>(_MyAccountVOEmail_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "state", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOState(String value) {
        return new JAXBElement<String>(_MyAccountVOState_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "countryCode", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOCountryCode(String value) {
        return new JAXBElement<String>(_MyAccountVOCountryCode_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "address1", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOAddress1(String value) {
        return new JAXBElement<String>(_MyAccountVOAddress1_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "lastname", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOLastname(String value) {
        return new JAXBElement<String>(_MyAccountVOLastname_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "address2", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOAddress2(String value) {
        return new JAXBElement<String>(_MyAccountVOAddress2_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "address3", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOAddress3(String value) {
        return new JAXBElement<String>(_MyAccountVOAddress3_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "firstname", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOFirstname(String value) {
        return new JAXBElement<String>(_MyAccountVOFirstname_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "type", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOType(String value) {
        return new JAXBElement<String>(_MyAccountVOType_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "postcode", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOPostcode(String value) {
        return new JAXBElement<String>(_MyAccountVOPostcode_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "password", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOPassword(String value) {
        return new JAXBElement<String>(_MyAccountVOPassword_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyAccountVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "parentMyAccount", scope = MyAccountVO.class)
    public JAXBElement<MyAccountVO> createMyAccountVOParentMyAccount(MyAccountVO value) {
        return new JAXBElement<MyAccountVO>(_MyAccountVOParentMyAccount_QNAME, MyAccountVO.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "result", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOResult(String value) {
        return new JAXBElement<String>(_MyAccountVOResult_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "phone", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOPhone(String value) {
        return new JAXBElement<String>(_MyAccountVOPhone_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "partyType", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOPartyType(String value) {
        return new JAXBElement<String>(_MyAccountVOPartyType_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "fax", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOFax(String value) {
        return new JAXBElement<String>(_MyAccountVOFax_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "status", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOStatus(String value) {
        return new JAXBElement<String>(_MyAccountVOStatus_QNAME, String.class, MyAccountVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.usermanagement.melbourneit.com", name = "organisation", scope = MyAccountVO.class)
    public JAXBElement<String> createMyAccountVOOrganisation(String value) {
        return new JAXBElement<String>(_MyAccountVOOrganisation_QNAME, String.class, MyAccountVO.class, value);
    }

}
