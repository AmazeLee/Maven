package com.sh.ssh.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sh.ssh.dao.CustomerDao;
import com.sh.ssh.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findById(Long id) {
		
		return this.getHibernateTemplate().get(Customer.class,id);
	}

}
