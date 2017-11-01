package com.sh.ssh.dao;

import com.sh.ssh.entity.Customer;

public interface CustomerDao {
	/**
	 * 根据id获取客户信息
	 * @param id
	 * @return
	 */
	public Customer findById(Long id);
}
