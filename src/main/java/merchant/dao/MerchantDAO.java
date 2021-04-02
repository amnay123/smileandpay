package merchant.dao;

import merchant.model.Merchant;

public interface MerchantDAO {

	public String addMerchant(Merchant merchant);
	public String updateMerchant(Merchant merchant);
	public String deleteMerchant(Integer merchantId);
	
}