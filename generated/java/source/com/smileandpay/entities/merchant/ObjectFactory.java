
package com.smileandpay.entities.merchant;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smileandpay.entities.merchant package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smileandpay.entities.merchant
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteMerchantRequestType }
     * 
     */
    public DeleteMerchantRequestType createDeleteMerchantRequestType() {
        return new DeleteMerchantRequestType();
    }

    /**
     * Create an instance of {@link AddMerchantResponseType }
     * 
     */
    public AddMerchantResponseType createAddMerchantResponseType() {
        return new AddMerchantResponseType();
    }

    /**
     * Create an instance of {@link AddMerchantRequestType }
     * 
     */
    public AddMerchantRequestType createAddMerchantRequestType() {
        return new AddMerchantRequestType();
    }

    /**
     * Create an instance of {@link Merchant }
     * 
     */
    public Merchant createMerchant() {
        return new Merchant();
    }

    /**
     * Create an instance of {@link DeleteMerchantResponseType }
     * 
     */
    public DeleteMerchantResponseType createDeleteMerchantResponseType() {
        return new DeleteMerchantResponseType();
    }

    /**
     * Create an instance of {@link UpdateMerchantResponseType }
     * 
     */
    public UpdateMerchantResponseType createUpdateMerchantResponseType() {
        return new UpdateMerchantResponseType();
    }

    /**
     * Create an instance of {@link UpdateMerchantRequestType }
     * 
     */
    public UpdateMerchantRequestType createUpdateMerchantRequestType() {
        return new UpdateMerchantRequestType();
    }

}
