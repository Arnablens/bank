package com.mindtree.bankuser.service;

import org.springframework.stereotype.Service;

import com.mindtree.bankuser.entity.User;
import com.mindtree.bankuser.exception.ControllerServiceException;

@Service
public interface UserService {

	public void addUser(User user);

	public Object getUsers();

	public void deleteUser(String userName) throws ControllerServiceException;

}
