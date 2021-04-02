package product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import product.model.Product;


@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public String addProduct(Product product) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
		return "Success";
	}

	@Override
	public String updateProduct(Product product) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();
		return "Success";
	}

	@Override
	public String deleteProduct(Integer productId) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        Product product = (Product)session.load(Product.class,productId);
        session.delete(product);
        session.getTransaction().commit();
		return "Success";
	}
}