package com.becoder.dao;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveUser(User user) {
		int i = (Integer)hibernateTemplate.save(user);
		return i;
	}

	
	public User loginUser(String email, String password) {
		
		//select * from user where email = ? and password = ?
		String sql = "from user where email=:em and password=:pwd";
		
		User us  =(User) hibernateTemplate.execute(s->{
			
			Query q = s.createQuery(sql);
			q.setString("em", email);
			q.setString("pwd", password);
			
			return q.uniqueResult();
			
		});
		return us;
	}
	
}
