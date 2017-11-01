package com.sh.ssh.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sh.ssh.dao.CustomerDao;
import com.sh.ssh.entity.Customer;
import com.sh.ssh.service.CustomerService;

//@ContextConfiguration(locations= {"classpath*:applicationContext-*.xml"})
@ContextConfiguration(locations= {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {

	/*@Test
	public void test() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
		CustomerDao customerDao = (CustomerDao) app.getBean("customerDao");
		Customer customer = customerDao.findById(23L);
		System.out.println(customer.getCustName());
	}*/
	@Autowired
	private CustomerService customerService;
	@Test
	public void test() {
		/*Customer customer = customerService.findById(23L);
		System.out.println(customer.getCustName());*/
	}


}
