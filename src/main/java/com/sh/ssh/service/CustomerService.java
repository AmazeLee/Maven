package com.sh.ssh.service;

import com.sh.ssh.entity.Customer;

public interface CustomerService {
	
	/**
	 * 根据id获取客户信息
	 * @param id
	 * @return
	 */
	public Customer findById(Long id);
}
