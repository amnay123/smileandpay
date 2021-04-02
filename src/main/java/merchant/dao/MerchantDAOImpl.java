package merchant.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import merchant.model.Merchant;


@Repository("merchantDAO")
public class MerchantDAOImpl implements MerchantDAO {

	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public String addMerchant(Merchant merchant) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(merchant);
        session.getTransaction().commit();
		return "Success";
	}

	@Override
	public String updateMerchant(Merchant merchant) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(merchant);
        session.getTransaction().commit();
		return "Success";
	}

	@Override
	public String deleteMerchant(Integer merchantId) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        Merchant merchant = (Merchant)session.load(Merchant.class,merchantId);
        session.delete(merchant);
        session.getTransaction().commit();
		return "Success";
	}
}