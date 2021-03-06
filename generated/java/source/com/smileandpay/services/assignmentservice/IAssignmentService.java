
package com.smileandpay.services.assignmentservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.smileandpay.entities.assignment.AddAssignmentRequestType;
import com.smileandpay.entities.assignment.AddAssignmentResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IAssignmentService", targetNamespace = "http://smileandpay.com/services/AssignmentService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.smileandpay.entities.assignment.ObjectFactory.class,
    com.smileandpay.entities.merchant.ObjectFactory.class,
    com.smileandpay.entities.product.ObjectFactory.class
})
public interface IAssignmentService {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.smileandpay.entities.assignment.AddAssignmentResponseType
     */
    @WebMethod
    @WebResult(name = "AddAssignmentResponseType", targetNamespace = "http://smileandpay.com/entities/assignment", partName = "parameters")
    public AddAssignmentResponseType addAssignment(
        @WebParam(name = "AddAssignmentRequestType", targetNamespace = "http://smileandpay.com/entities/assignment", partName = "parameters")
        AddAssignmentRequestType parameters);

}
