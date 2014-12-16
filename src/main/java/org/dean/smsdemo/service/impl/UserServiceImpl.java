package org.dean.smsdemo.service.impl;

import javax.annotation.Resource;

import org.dean.smsdemo.dao.IUserDao;
import org.dean.smsdemo.pojo.User;
import org.dean.smsdemo.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
