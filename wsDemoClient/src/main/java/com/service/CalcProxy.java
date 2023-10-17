package com.service;

public class CalcProxy implements com.service.Calc {
  private String _endpoint = null;
  private com.service.Calc calc = null;
  
  public CalcProxy() {
    _initCalcProxy();
  }
  
  public CalcProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcProxy();
  }
  
  private void _initCalcProxy() {
    try {
      calc = (new com.service.CalcServiceLocator()).getCalc();
      if (calc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calc != null)
      ((javax.xml.rpc.Stub)calc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.Calc getCalc() {
    if (calc == null)
      _initCalcProxy();
    return calc;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.add(a, b);
  }
  
  public int mul(int a, int b) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.mul(a, b);
  }
  
  
}