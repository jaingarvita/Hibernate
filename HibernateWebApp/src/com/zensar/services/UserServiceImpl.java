package com.zensar.services;

import java.util.List;

import com.zensar.dao.UserDao;
import com.zensar.entities.User;
import com.zensar.exception.ServiceException;

/**
 * @author Garvita Jain
 * @version 2.0
 * @creation_date 21/09/2019 5:40PM
 * @modification_date 28/09/2019 11:46AM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface. It is used in Persistence
 *              Layer of Application.
 *
 */

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) throws ServiceException {
		userDao.insert(user);

	}

	@Override
	public void updateUser(User user) throws ServiceException {
		userDao.update(user);

	}

	@Override
	public void removeUser(User user) throws ServiceException {
		userDao.delete(user);

	}

	@Override
	public User findUserByUsername(String username) throws ServiceException {
		User user = userDao.getByUsername(username);
		return user;

	}

	@Override
	public List<User> findAllUsers() throws ServiceException {
		return userDao.getAll();

	}

	public boolean validateUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		User dbUser = findUserByUsername(user.getUsername());
		System.out.println(user);
		System.out.println(dbUser);
		if (dbUser != null && dbUser.getPassword().equals(user.getPassword()))
			return true;
		else
			return false;

	}

}
