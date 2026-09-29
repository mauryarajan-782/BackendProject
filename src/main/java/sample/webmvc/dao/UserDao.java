package sample.webmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import sample.webmvc.entity.User;

@Repository
public class UserDao {

	@Autowired
	 HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public User saveUser(User user) {
		hibernateTemplate.save(user);
		return user;
	}

	public User getUserById(int id) {
		System.out.println("UserDao.getUserById()");
		
		return hibernateTemplate.get(User.class, id);
	}

}