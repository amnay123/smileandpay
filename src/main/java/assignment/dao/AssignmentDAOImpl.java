package assignment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import assignment.model.Assignment;


@Repository("assignmentDAO")
public class AssignmentDAOImpl implements AssignmentDAO {

	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public String addAssignment(Assignment assignment) {
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(assignment);
        session.getTransaction().commit();
		return "Success";
	}

}