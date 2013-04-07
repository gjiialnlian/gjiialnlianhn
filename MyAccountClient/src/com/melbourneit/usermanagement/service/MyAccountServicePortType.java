/**
 * MyAccountServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.melbourneit.usermanagement.service;

public interface MyAccountServicePortType extends java.rmi.Remote {
    public boolean isMyAccountOptedIn(java.lang.String in0) throws java.rmi.RemoteException;
    public com.melbourneit.usermanagement.client.MyAccountVO getMyAccount(java.lang.String in0) throws java.rmi.RemoteException;
}
