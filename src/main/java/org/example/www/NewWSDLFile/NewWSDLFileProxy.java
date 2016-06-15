package org.example.www.NewWSDLFile;

public class NewWSDLFileProxy implements org.example.www.NewWSDLFile.NewWSDLFile_PortType {
  private String _endpoint = null;
  private org.example.www.NewWSDLFile.NewWSDLFile_PortType newWSDLFile_PortType = null;
  
  public NewWSDLFileProxy() {
    _initNewWSDLFileProxy();
  }
  
  public NewWSDLFileProxy(String endpoint) {
    _endpoint = endpoint;
    _initNewWSDLFileProxy();
  }
  
  private void _initNewWSDLFileProxy() {
    try {
      newWSDLFile_PortType = (new org.example.www.NewWSDLFile.NewWSDLFile_ServiceLocator()).getNewWSDLFileSOAP();
      if (newWSDLFile_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)newWSDLFile_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)newWSDLFile_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (newWSDLFile_PortType != null)
      ((javax.xml.rpc.Stub)newWSDLFile_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.NewWSDLFile.NewWSDLFile_PortType getNewWSDLFile_PortType() {
    if (newWSDLFile_PortType == null)
      _initNewWSDLFileProxy();
    return newWSDLFile_PortType;
  }
  
  public java.lang.String newOperation(java.lang.String in) throws java.rmi.RemoteException{
    if (newWSDLFile_PortType == null)
      _initNewWSDLFileProxy();
    return newWSDLFile_PortType.newOperation(in);
  }
  
  
}