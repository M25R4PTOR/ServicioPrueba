/**
 * Funcion_PortSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.examples.www.wsdl.WSPractica_wsdl;

public class Funcion_PortSoapBindingSkeleton implements com.examples.www.wsdl.WSPractica_wsdl.Funcion_PortType, org.apache.axis.wsdl.Skeleton {
    private com.examples.www.wsdl.WSPractica_wsdl.Funcion_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("funcion1", _params, new javax.xml.namespace.QName("", "resp1"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:examples:WSPractica", "Funcion1"));
        _oper.setSoapAction("Funcion1");
        _myOperationsList.add(_oper);
        if (_myOperations.get("funcion1") == null) {
            _myOperations.put("funcion1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("funcion1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("funcion2", _params, new javax.xml.namespace.QName("", "resp1"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:examples:WSPractica", "Funcion2"));
        _oper.setSoapAction("Funcion2");
        _myOperationsList.add(_oper);
        if (_myOperations.get("funcion2") == null) {
            _myOperations.put("funcion2", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("funcion2")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("funcion3", _params, new javax.xml.namespace.QName("", "resp1"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:examples:WSPractica", "Funcion3"));
        _oper.setSoapAction("Funcion3");
        _myOperationsList.add(_oper);
        if (_myOperations.get("funcion3") == null) {
            _myOperations.put("funcion3", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("funcion3")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "param1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("funcion4", _params, new javax.xml.namespace.QName("", "resp1"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:examples:WSPractica", "Funcion4"));
        _oper.setSoapAction("Funcion4");
        _myOperationsList.add(_oper);
        if (_myOperations.get("funcion4") == null) {
            _myOperations.put("funcion4", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("funcion4")).add(_oper);
    }

    public Funcion_PortSoapBindingSkeleton() {
        this.impl = new com.examples.www.wsdl.WSPractica_wsdl.Funcion_PortSoapBindingImpl();
    }

    public Funcion_PortSoapBindingSkeleton(com.examples.www.wsdl.WSPractica_wsdl.Funcion_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String funcion1(java.lang.String param1) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.funcion1(param1);
        return ret;
    }

    public java.lang.String funcion2(java.lang.String param1) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.funcion2(param1);
        return ret;
    }

    public java.lang.String funcion3(java.lang.String param1) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.funcion3(param1);
        return ret;
    }

    public java.lang.String funcion4(java.lang.String param1) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.funcion4(param1);
        return ret;
    }

}
