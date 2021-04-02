package merchant.service;


import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.smileandpay.entities.merchant.AddMerchantRequestType;
import com.smileandpay.entities.merchant.AddMerchantResponseType;
import com.smileandpay.entities.merchant.DeleteMerchantRequestType;
import com.smileandpay.entities.merchant.DeleteMerchantResponseType;
import com.smileandpay.entities.merchant.UpdateMerchantRequestType;
import com.smileandpay.entities.merchant.UpdateMerchantResponseType;
import com.smileandpay.services.merchantservice.IMerchantService;

import merchant.dao.MerchantDAO;
import merchant.model.Merchant;


@Service("merchantService")
@WebService(serviceName="MerchantService", endpointInterface="com.smileandpay.services.merchantservice.IMerchantService",
targetNamespace="http://smileandpay.com/services/MerchantService/", portName="MerchantServicePort", name="MerchantServiceImpl")
public class MerchantServiceImpl implements IMerchantService {

	private MerchantDAO merchantDAO;

	@Override
	public AddMerchantResponseType addMerchant(AddMerchantRequestType parameters) {
		AddMerchantResponseType response = new AddMerchantResponseType();
		Merchant merchant = new Merchant();
		merchant.setName(parameters.getMerchant().getName());
		merchant.setLastName(parameters.getMerchant().getLastName());
		merchant.setBirthDate(parameters.getMerchant().getBirthDate().toGregorianCalendar().getTime());
		merchant.setCreateDate(parameters.getMerchant().getCreateDate().toGregorianCalendar().getTime());
		response.setResponseMessage(this.merchantDAO.addMerchant(merchant));
		return response;
	}

	@Override
	public UpdateMerchantResponseType updateMerchant(UpdateMerchantRequestType parameters) {
		UpdateMerchantResponseType response = new UpdateMerchantResponseType();
		Merchant merchant = new Merchant();
		merchant.setName(parameters.getMerchant().getName());
		merchant.setLastName(parameters.getMerchant().getLastName());
		merchant.setBirthDate(parameters.getMerchant().getBirthDate().toGregorianCalendar().getTime());
		merchant.setCreateDate(parameters.getMerchant().getCreateDate().toGregorianCalendar().getTime());
		response.setResponseMessage(this.merchantDAO.updateMerchant(merchant));
		return response;
	}

	@Override
	public DeleteMerchantResponseType deleteMerchant(DeleteMerchantRequestType parameters) {
		DeleteMerchantResponseType response = new DeleteMerchantResponseType();
		response.setResponseMessage(this.merchantDAO.deleteMerchant(parameters.getMerchantId()));
		return response;
	}
}