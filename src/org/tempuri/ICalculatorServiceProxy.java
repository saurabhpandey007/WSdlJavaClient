package org.tempuri;

public class ICalculatorServiceProxy implements org.tempuri.ICalculatorService {
  private String _endpoint = null;
  private org.tempuri.ICalculatorService iCalculatorService = null;
  
  public ICalculatorServiceProxy() {
    _initICalculatorServiceProxy();
  }
  
  public ICalculatorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initICalculatorServiceProxy();
  }
  
  private void _initICalculatorServiceProxy() {
    try {
      iCalculatorService = (new org.tempuri.CalculatorServiceLocator()).getBasicHttpBinding_ICalculatorService();
      if (iCalculatorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCalculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCalculatorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCalculatorService != null)
      ((javax.xml.rpc.Stub)iCalculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ICalculatorService getICalculatorService() {
    if (iCalculatorService == null)
      _initICalculatorServiceProxy();
    return iCalculatorService;
  }
  
  public java.lang.Integer add(java.lang.Integer num1, java.lang.Integer num2) throws java.rmi.RemoteException{
    if (iCalculatorService == null)
      _initICalculatorServiceProxy();
    return iCalculatorService.add(num1, num2);
  }
  
  
}