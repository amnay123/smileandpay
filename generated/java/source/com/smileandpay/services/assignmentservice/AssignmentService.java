
package com.smileandpay.services.assignmentservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AssignmentService", targetNamespace = "http://smileandpay.com/services/AssignmentService/", wsdlLocation = "file:/C:/Users/mohammed.amnay/workspace/Merchant/src/main/resources/merchant/services/AssignmentService.wsdl")
public class AssignmentService
    extends Service
{

    private final static URL ASSIGNMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ASSIGNMENTSERVICE_EXCEPTION;
    private final static QName ASSIGNMENTSERVICE_QNAME = new QName("http://smileandpay.com/services/AssignmentService/", "AssignmentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/mohammed.amnay/workspace/Merchant/src/main/resources/merchant/services/AssignmentService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASSIGNMENTSERVICE_WSDL_LOCATION = url;
        ASSIGNMENTSERVICE_EXCEPTION = e;
    }

    public AssignmentService() {
        super(__getWsdlLocation(), ASSIGNMENTSERVICE_QNAME);
    }

    public AssignmentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns IAssignmentService
     */
    @WebEndpoint(name = "AssignmentServicePort")
    public IAssignmentService getAssignmentServicePort() {
        return super.getPort(new QName("http://smileandpay.com/services/AssignmentService/", "AssignmentServicePort"), IAssignmentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAssignmentService
     */
    @WebEndpoint(name = "AssignmentServicePort")
    public IAssignmentService getAssignmentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://smileandpay.com/services/AssignmentService/", "AssignmentServicePort"), IAssignmentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASSIGNMENTSERVICE_EXCEPTION!= null) {
            throw ASSIGNMENTSERVICE_EXCEPTION;
        }
        return ASSIGNMENTSERVICE_WSDL_LOCATION;
    }

}