package assignment.service;


import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.smileandpay.entities.assignment.AddAssignmentRequestType;
import com.smileandpay.entities.assignment.AddAssignmentResponseType;
import com.smileandpay.services.assignmentservice.IAssignmentService;

import assignment.dao.AssignmentDAO;
import assignment.model.Assignment;
import merchant.model.Merchant;
import product.model.Product;

@Service("assignmentService")
@WebService(serviceName="AssignmentService", endpointInterface="com.smileandpay.services.assignmentservice.IAssignmentService",
targetNamespace="http://smileandpay.com/services/AssignmentService/", portName="AssignmentServicePort", name="AssignmentServiceImpl")
public class AssignmentServiceImpl implements IAssignmentService {

	private AssignmentDAO assignmentDAO;

	@Override
	public AddAssignmentResponseType addAssignment(AddAssignmentRequestType parameters) {
		AddAssignmentResponseType response = new AddAssignmentResponseType();
		Assignment assignment = new Assignment();
		assignment.setAssignmentDate(parameters.getAssignment().getAssignmentDate().toGregorianCalendar().getTime());
		Product product = new Product();
		product.setLabel(parameters.getAssignment().getProduct().getProduct().getLabel());
		product.setCreateDate(parameters.getAssignment().getProduct().getProduct().getCreateDate().toGregorianCalendar().getTime());
		product.setUnitPrice(parameters.getAssignment().getProduct().getProduct().getUnitPrice());
		product.setCurrency(parameters.getAssignment().getProduct().getProduct().getCurrency());
		product.setWeight(parameters.getAssignment().getProduct().getProduct().getWeight());
		product.setHeight(parameters.getAssignment().getProduct().getProduct().getHeight());
		assignment.setProduct(product);
		Merchant merchant = new Merchant();
		merchant.setName(parameters.getAssignment().getMerchant().getMerchant().getName());
		merchant.setLastName(parameters.getAssignment().getMerchant().getMerchant().getLastName());
		merchant.setBirthDate(parameters.getAssignment().getMerchant().getMerchant().getBirthDate().toGregorianCalendar().getTime());
		merchant.setCreateDate(parameters.getAssignment().getMerchant().getMerchant().getCreateDate().toGregorianCalendar().getTime());
		assignment.setMerchant(merchant);
		response.setResponseMessage(this.assignmentDAO.addAssignment(assignment));
		return response;
	}
}