
package com.smileandpay.services.productservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.smileandpay.entities.product.AddProductRequestType;
import com.smileandpay.entities.product.AddProductResponseType;
import com.smileandpay.entities.product.DeleteProductRequestType;
import com.smileandpay.entities.product.DeleteProductResponseType;
import com.smileandpay.entities.product.ObjectFactory;
import com.smileandpay.entities.product.UpdateProductRequestType;
import com.smileandpay.entities.product.UpdateProductResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IProductService", targetNamespace = "http://smileandpay.com/services/ProductService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IProductService {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.smileandpay.entities.product.AddProductResponseType
     */
    @WebMethod
    @WebResult(name = "AddProductResponseType", targetNamespace = "http://smileandpay.com/entities/product", partName = "parameters")
    public AddProductResponseType addProduct(
        @WebParam(name = "AddProductRequestType", targetNamespace = "http://smileandpay.com/entities/product", partName = "parameters")
        AddProductRequestType parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.smileandpay.entities.product.UpdateProductResponseType
     */
    @WebMethod
    @WebResult(name = "UpdateProductResponseType", targetNamespace = "http://smileandpay.com/entities/product", partName = "parameters")
    public UpdateProductResponseType updateProduct(
        @WebParam(name = "UpdateProductRequestType", targetNamespace = "http://smileandpay.com/entities/product", partName = "parameters")
        UpdateProductRequestType parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.smileandpay.entities.product.DeleteProductResponseType
     */
    @WebMethod
    @WebResult(name = "DeleteProductResponseType", targetNamespace = "http://smileandpay.com/entities/product", partName = "parameters")
    public DeleteProductResponseType deleteProduct(
        @WebParam(name = "DeleteProductRequestType", targetNamespace = "http://smileandpay.com/entities/product", partName = "parameters")
        DeleteProductRequestType parameters);

}
