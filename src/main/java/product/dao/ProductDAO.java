package product.dao;

import product.model.Product;

public interface ProductDAO {

	public String addProduct(Product product);
	public String updateProduct(Product product);
	public String deleteProduct(Integer productId);
	
}