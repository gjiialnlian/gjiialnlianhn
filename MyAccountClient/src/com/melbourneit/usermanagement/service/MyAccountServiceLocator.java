/**
 * MyAccountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.melbourneit.usermanagement.service;

public class MyAccountServiceLocator extends org.apache.axis.client.Service implements com.melbourneit.usermanagement.service.MyAccountService {

    public MyAccountServiceLocator() {
    }


    public MyAccountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyAccountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyAccountServiceHttpPort
    private java.lang.String MyAccountServiceHttpPort_address = "http://mit-jboss-uat.mmeapi.net:8380/UserManagement/services/MyAccountService";

    public java.lang.String getMyAccountServiceHttpPortAddress() {
        return MyAccountServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MyAccountServiceHttpPortWSDDServiceName = "MyAccountServiceHttpPort";

    public java.lang.String getMyAccountServiceHttpPortWSDDServiceName() {
        return MyAccountServiceHttpPortWSDDServiceName;
    }

    public void setMyAccountServiceHttpPortWSDDServiceName(java.lang.String name) {
        MyAccountServiceHttpPortWSDDServiceName = name;
    }

    public com.melbourneit.usermanagement.service.MyAccountServicePortType getMyAccountServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyAccountServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyAccountServiceHttpPort(endpoint);
    }

    public com.melbourneit.usermanagement.service.MyAccountServicePortType getMyAccountServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.melbourneit.usermanagement.service.MyAccountServiceHttpBindingStub _stub = new com.melbourneit.usermanagement.service.MyAccountServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getMyAccountServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyAccountServiceHttpPortEndpointAddress(java.lang.String address) {
        MyAccountServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.melbourneit.usermanagement.service.MyAccountServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.melbourneit.usermanagement.service.MyAccountServiceHttpBindingStub _stub = new com.melbourneit.usermanagement.service.MyAccountServiceHttpBindingStub(new java.net.URL(MyAccountServiceHttpPort_address), this);
                _stub.setPortName(getMyAccountServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MyAccountServiceHttpPort".equals(inputPortName)) {
            return getMyAccountServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.usermanagement.melbourneit.com", "MyAccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.usermanagement.melbourneit.com", "MyAccountServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MyAccountServiceHttpPort".equals(portName)) {
            setMyAccountServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
