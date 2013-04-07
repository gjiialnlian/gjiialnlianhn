/**
 * MyAccountVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.melbourneit.usermanagement.client;

public class MyAccountVO  implements java.io.Serializable {

	private static final long serialVersionUID = 121212L;

	private java.lang.String address1;

    private String partyId;
    
    private java.lang.String address2;

    private java.lang.String address3;

    private java.lang.String channel;

    private java.lang.String countryCode;

    private java.lang.String email;

    public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	private java.lang.String fax;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String login;

    private java.lang.String message;

    private java.lang.String mobile;

    private java.lang.String organisation;

    private com.melbourneit.usermanagement.client.MyAccountVO parentMyAccount;

    private java.lang.String partyType;

    private java.lang.String password;

    private java.lang.String phone;

    private java.lang.String postcode;

    private java.lang.String result;

    private java.lang.String state;

    private java.lang.String status;

    private java.lang.String suburb;

    private java.lang.String type;

    public MyAccountVO() {
    }

    public MyAccountVO(
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String address3,
           java.lang.String channel,
           java.lang.String countryCode,
           java.lang.String email,
           java.lang.String fax,
           java.lang.String firstname,
           java.lang.String lastname,
           java.lang.String login,
           java.lang.String message,
           java.lang.String mobile,
           java.lang.String organisation,
           com.melbourneit.usermanagement.client.MyAccountVO parentMyAccount,
           java.lang.String partyType,
           java.lang.String password,
           java.lang.String phone,
           java.lang.String postcode,
           java.lang.String result,
           java.lang.String state,
           java.lang.String status,
           java.lang.String suburb,
           java.lang.String type) {
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.channel = channel;
           this.countryCode = countryCode;
           this.email = email;
           this.fax = fax;
           this.firstname = firstname;
           this.lastname = lastname;
           this.login = login;
           this.message = message;
           this.mobile = mobile;
           this.organisation = organisation;
           this.parentMyAccount = parentMyAccount;
           this.partyType = partyType;
           this.password = password;
           this.phone = phone;
           this.postcode = postcode;
           this.result = result;
           this.state = state;
           this.status = status;
           this.suburb = suburb;
           this.type = type;
    }


    /**
     * Gets the address1 value for this MyAccountVO.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this MyAccountVO.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this MyAccountVO.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this MyAccountVO.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this MyAccountVO.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this MyAccountVO.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the channel value for this MyAccountVO.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this MyAccountVO.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the countryCode value for this MyAccountVO.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this MyAccountVO.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the email value for this MyAccountVO.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MyAccountVO.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this MyAccountVO.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this MyAccountVO.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the firstname value for this MyAccountVO.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this MyAccountVO.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the lastname value for this MyAccountVO.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this MyAccountVO.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the login value for this MyAccountVO.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this MyAccountVO.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the message value for this MyAccountVO.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this MyAccountVO.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the mobile value for this MyAccountVO.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this MyAccountVO.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the organisation value for this MyAccountVO.
     * 
     * @return organisation
     */
    public java.lang.String getOrganisation() {
        return organisation;
    }


    /**
     * Sets the organisation value for this MyAccountVO.
     * 
     * @param organisation
     */
    public void setOrganisation(java.lang.String organisation) {
        this.organisation = organisation;
    }


    /**
     * Gets the parentMyAccount value for this MyAccountVO.
     * 
     * @return parentMyAccount
     */
    public com.melbourneit.usermanagement.client.MyAccountVO getParentMyAccount() {
        return parentMyAccount;
    }


    /**
     * Sets the parentMyAccount value for this MyAccountVO.
     * 
     * @param parentMyAccount
     */
    public void setParentMyAccount(com.melbourneit.usermanagement.client.MyAccountVO parentMyAccount) {
        this.parentMyAccount = parentMyAccount;
    }


    /**
     * Gets the partyType value for this MyAccountVO.
     * 
     * @return partyType
     */
    public java.lang.String getPartyType() {
        return partyType;
    }


    /**
     * Sets the partyType value for this MyAccountVO.
     * 
     * @param partyType
     */
    public void setPartyType(java.lang.String partyType) {
        this.partyType = partyType;
    }


    /**
     * Gets the password value for this MyAccountVO.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this MyAccountVO.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the phone value for this MyAccountVO.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this MyAccountVO.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postcode value for this MyAccountVO.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this MyAccountVO.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the result value for this MyAccountVO.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this MyAccountVO.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the state value for this MyAccountVO.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this MyAccountVO.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this MyAccountVO.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MyAccountVO.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the suburb value for this MyAccountVO.
     * 
     * @return suburb
     */
    public java.lang.String getSuburb() {
        return suburb;
    }


    /**
     * Sets the suburb value for this MyAccountVO.
     * 
     * @param suburb
     */
    public void setSuburb(java.lang.String suburb) {
        this.suburb = suburb;
    }


    /**
     * Gets the type value for this MyAccountVO.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MyAccountVO.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyAccountVO)) return false;
        MyAccountVO other = (MyAccountVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.organisation==null && other.getOrganisation()==null) || 
             (this.organisation!=null &&
              this.organisation.equals(other.getOrganisation()))) &&
            ((this.parentMyAccount==null && other.getParentMyAccount()==null) || 
             (this.parentMyAccount!=null &&
              this.parentMyAccount.equals(other.getParentMyAccount()))) &&
            ((this.partyType==null && other.getPartyType()==null) || 
             (this.partyType!=null &&
              this.partyType.equals(other.getPartyType()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.suburb==null && other.getSuburb()==null) || 
             (this.suburb!=null &&
              this.suburb.equals(other.getSuburb()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getOrganisation() != null) {
            _hashCode += getOrganisation().hashCode();
        }
        if (getParentMyAccount() != null) {
            _hashCode += getParentMyAccount().hashCode();
        }
        if (getPartyType() != null) {
            _hashCode += getPartyType().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSuburb() != null) {
            _hashCode += getSuburb().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyAccountVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "MyAccountVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "organisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMyAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "parentMyAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "MyAccountVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "partyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suburb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "suburb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://client.usermanagement.melbourneit.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
