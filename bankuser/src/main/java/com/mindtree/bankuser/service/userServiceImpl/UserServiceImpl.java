package com.mindtree.bankuser.service.userServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankuser.entity.User;
import com.mindtree.bankuser.exception.ControllerServiceException;
import com.mindtree.bankuser.exception.UserNotPresentException;
import com.mindtree.bankuser.repository.UserRepository;
import com.mindtree.bankuser.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Object getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(String userId) throws ControllerServiceException {
		List<User> users=userRepository.findAll();
		User user = users.stream().filter(i -> i.getUserName().compareToIgnoreCase(userId)==0).findAny().orElseThrow(() -> new UserNotPresentException("No User Found"));
		userRepository.delete(user);
	}
}
