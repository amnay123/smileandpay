package product.service;


import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.smileandpay.entities.merchant.AddMerchantRequestType;
import com.smileandpay.entities.merchant.AddMerchantResponseType;
import com.smileandpay.entities.merchant.DeleteMerchantRequestType;
import com.smileandpay.entities.merchant.DeleteMerchantResponseType;
import com.smileandpay.entities.merchant.UpdateMerchantRequestType;
import com.smileandpay.entities.merchant.UpdateMerchantResponseType;
import com.smileandpay.entities.product.AddProductRequestType;
import com.smileandpay.entities.product.AddProductResponseType;
import com.smileandpay.entities.product.DeleteProductRequestType;
import com.smileandpay.entities.product.DeleteProductResponseType;
import com.smileandpay.entities.product.UpdateProductRequestType;
import com.smileandpay.entities.product.UpdateProductResponseType;
import com.smileandpay.services.merchantservice.IMerchantService;
import com.smileandpay.services.productservice.IProductService;


import product.dao.ProductDAO;
import product.model.Product;


@Service("productService")
@WebService(serviceName="ProductService", endpointInterface="com.smileandpay.services.productservice.IProductService",
targetNamespace="http://smileandpay.com/services/ProductService/", portName="ProductServicePort", name="ProductServiceImpl")
public class ProductServiceImpl implements IProductService {

	private ProductDAO productDAO;

	@Override
	public AddProductResponseType addProduct(AddProductRequestType parameters) {
		AddProductResponseType response = new AddProductResponseType();
		Product product = new Product();
		product.setLabel(parameters.getProduct().getLabel());
		product.setCreateDate(parameters.getProduct().getCreateDate().toGregorianCalendar().getTime());
		product.setUnitPrice(parameters.getProduct().getUnitPrice());
		product.setCurrency(parameters.getProduct().getCurrency());
		product.setWeight(parameters.getProduct().getWeight());
		product.setHeight(parameters.getProduct().getHeight());
		response.setResponseMessage(this.productDAO.addProduct(product));
		return response;
	}

	@Override
	public UpdateProductResponseType updateProduct(UpdateProductRequestType parameters) {
		UpdateProductResponseType response = new UpdateProductResponseType();
		Product product = new Product();
		product.setLabel(parameters.getProduct().getLabel());
		product.setCreateDate(parameters.getProduct().getCreateDate().toGregorianCalendar().getTime());
		product.setUnitPrice(parameters.getProduct().getUnitPrice());
		product.setCurrency(parameters.getProduct().getCurrency());
		product.setWeight(parameters.getProduct().getWeight());
		product.setHeight(parameters.getProduct().getHeight());
		response.setResponseMessage(this.productDAO.updateProduct(product));
		return response;
	}

	@Override
	public DeleteProductResponseType deleteProduct(DeleteProductRequestType parameters) {
		DeleteProductResponseType response = new DeleteProductResponseType();
		response.setResponseMessage(this.productDAO.deleteProduct(parameters.getProductId()));
		return response;
	}
}