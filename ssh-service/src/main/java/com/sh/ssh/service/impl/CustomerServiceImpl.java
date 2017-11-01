package com.sh.ssh.service.impl;

import com.sh.ssh.dao.CustomerDao;
import com.sh.ssh.entity.Customer;
import com.sh.ssh.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public Customer findById(Long id) {
		return customerDao.findById(id);
	}

}
