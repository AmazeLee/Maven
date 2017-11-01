package com.sh.ssh.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.ssh.dao.CustomerDao;
import com.sh.ssh.entity.Customer;

public class CustomerDaoImplTest {

	@Test
	public void test() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) app.getBean("customerDao");
		Customer customer = customerDao.findById(23L);
		System.out.println(customer.getCustName());
	}

}
