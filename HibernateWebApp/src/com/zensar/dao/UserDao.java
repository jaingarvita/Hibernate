package com.zensar.dao;

import java.util.List;

import com.zensar.entities.User;

/**
 * @author Garvita Jain
 * @version 2.0
 * @creation_date 21/09/2019 5:29PM
 * @modification_date 28/09/2019 11:19pm
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface. It is used in Persistence
 *              Layer of Application.
 *
 */

public interface UserDao {

	void insert(User user);

	void update(User user);

	void delete(User user);

	User getByUsername(String username);

	List<User> getAll();

}
