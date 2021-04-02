
package com.smileandpay.entities.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Assignment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Assignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="merchant">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="merchant" type="{http://smileandpay.com/entities/merchant}Merchant"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="product">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="product" type="{http://smileandpay.com/entities/product}Product"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assignment", propOrder = {
    "assignmentDate",
    "merchant",
    "product"
})
public class Assignment {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignmentDate;
    @XmlElement(required = true)
    protected Assignment.Merchant merchant;
    @XmlElement(required = true)
    protected Assignment.Product product;

    /**
     * Obtient la valeur de la propriété assignmentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignmentDate() {
        return assignmentDate;
    }

    /**
     * Définit la valeur de la propriété assignmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignmentDate(XMLGregorianCalendar value) {
        this.assignmentDate = value;
    }

    /**
     * Obtient la valeur de la propriété merchant.
     * 
     * @return
     *     possible object is
     *     {@link Assignment.Merchant }
     *     
     */
    public Assignment.Merchant getMerchant() {
        return merchant;
    }

    /**
     * Définit la valeur de la propriété merchant.
     * 
     * @param value
     *     allowed object is
     *     {@link Assignment.Merchant }
     *     
     */
    public void setMerchant(Assignment.Merchant value) {
        this.merchant = value;
    }

    /**
     * Obtient la valeur de la propriété product.
     * 
     * @return
     *     possible object is
     *     {@link Assignment.Product }
     *     
     */
    public Assignment.Product getProduct() {
        return product;
    }

    /**
     * Définit la valeur de la propriété product.
     * 
     * @param value
     *     allowed object is
     *     {@link Assignment.Product }
     *     
     */
    public void setProduct(Assignment.Product value) {
        this.product = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="merchant" type="{http://smileandpay.com/entities/merchant}Merchant"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "merchant"
    })
    public static class Merchant {

        @XmlElement(required = true)
        protected com.smileandpay.entities.merchant.Merchant merchant;

        /**
         * Obtient la valeur de la propriété merchant.
         * 
         * @return
         *     possible object is
         *     {@link com.smileandpay.entities.merchant.Merchant }
         *     
         */
        public com.smileandpay.entities.merchant.Merchant getMerchant() {
            return merchant;
        }

        /**
         * Définit la valeur de la propriété merchant.
         * 
         * @param value
         *     allowed object is
         *     {@link com.smileandpay.entities.merchant.Merchant }
         *     
         */
        public void setMerchant(com.smileandpay.entities.merchant.Merchant value) {
            this.merchant = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="product" type="{http://smileandpay.com/entities/product}Product"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "product"
    })
    public static class Product {

        @XmlElement(required = true)
        protected com.smileandpay.entities.product.Product product;

        /**
         * Obtient la valeur de la propriété product.
         * 
         * @return
         *     possible object is
         *     {@link com.smileandpay.entities.product.Product }
         *     
         */
        public com.smileandpay.entities.product.Product getProduct() {
            return product;
        }

        /**
         * Définit la valeur de la propriété product.
         * 
         * @param value
         *     allowed object is
         *     {@link com.smileandpay.entities.product.Product }
         *     
         */
        public void setProduct(com.smileandpay.entities.product.Product value) {
            this.product = value;
        }

    }

}
