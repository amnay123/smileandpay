package assignment.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import merchant.model.Merchant;
import product.model.Product;

@Entity
@Table(name = "assignment")
public class Assignment {

	@Id 
	private Date assignmentDate;
	
	@Id 
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Product product;
	
	@Id 
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Merchant merchant;

	public Date getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	
}