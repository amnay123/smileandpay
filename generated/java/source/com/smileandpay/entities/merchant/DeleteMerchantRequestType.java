
package com.smileandpay.entities.merchant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "merchantId"
})
@XmlRootElement(name = "DeleteMerchantRequestType")
public class DeleteMerchantRequestType {

    protected int merchantId;

    /**
     * Obtient la valeur de la propriété merchantId.
     * 
     */
    public int getMerchantId() {
        return merchantId;
    }

    /**
     * Définit la valeur de la propriété merchantId.
     * 
     */
    public void setMerchantId(int value) {
        this.merchantId = value;
    }

}
