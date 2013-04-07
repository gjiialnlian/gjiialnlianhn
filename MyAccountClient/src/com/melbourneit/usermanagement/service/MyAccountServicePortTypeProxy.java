package com.melbourneit.usermanagement.service;

public class MyAccountServicePortTypeProxy implements com.melbourneit.usermanagement.service.MyAccountServicePortType {
  private String _endpoint = null;
  private com.melbourneit.usermanagement.service.MyAccountServicePortType myAccountServicePortType = null;
  
  public MyAccountServicePortTypeProxy() {
    _initMyAccountServicePortTypeProxy();
  }
  
  public MyAccountServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyAccountServicePortTypeProxy();
  }
  
  private void _initMyAccountServicePortTypeProxy() {
    try {
      myAccountServicePortType = (new com.melbourneit.usermanagement.service.MyAccountServiceLocator()).getMyAccountServiceHttpPort();
      if (myAccountServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myAccountServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myAccountServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myAccountServicePortType != null)
      ((javax.xml.rpc.Stub)myAccountServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.melbourneit.usermanagement.service.MyAccountServicePortType getMyAccountServicePortType() {
    if (myAccountServicePortType == null)
      _initMyAccountServicePortTypeProxy();
    return myAccountServicePortType;
  }
  
  public boolean isMyAccountOptedIn(java.lang.String in0) throws java.rmi.RemoteException{
    if (myAccountServicePortType == null)
      _initMyAccountServicePortTypeProxy();
    return myAccountServicePortType.isMyAccountOptedIn(in0);
  }
  
  public com.melbourneit.usermanagement.client.MyAccountVO getMyAccount(java.lang.String in0) throws java.rmi.RemoteException{
    if (myAccountServicePortType == null)
      _initMyAccountServicePortTypeProxy();
    return myAccountServicePortType.getMyAccount(in0);
  }
  
  
}