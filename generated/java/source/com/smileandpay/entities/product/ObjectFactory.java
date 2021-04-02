
package com.smileandpay.entities.product;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smileandpay.entities.product package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smileandpay.entities.product
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProductRequestType }
     * 
     */
    public AddProductRequestType createAddProductRequestType() {
        return new AddProductRequestType();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link UpdateProductResponseType }
     * 
     */
    public UpdateProductResponseType createUpdateProductResponseType() {
        return new UpdateProductResponseType();
    }

    /**
     * Create an instance of {@link UpdateProductRequestType }
     * 
     */
    public UpdateProductRequestType createUpdateProductRequestType() {
        return new UpdateProductRequestType();
    }

    /**
     * Create an instance of {@link AddProductResponseType }
     * 
     */
    public AddProductResponseType createAddProductResponseType() {
        return new AddProductResponseType();
    }

    /**
     * Create an instance of {@link DeleteProductRequestType }
     * 
     */
    public DeleteProductRequestType createDeleteProductRequestType() {
        return new DeleteProductRequestType();
    }

    /**
     * Create an instance of {@link DeleteProductResponseType }
     * 
     */
    public DeleteProductResponseType createDeleteProductResponseType() {
        return new DeleteProductResponseType();
    }

}
