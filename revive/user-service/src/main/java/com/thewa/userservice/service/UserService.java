package com.thewa.userservice.service;
import com.thewa.userservice.model.User;
import com.thewa.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;
  
  public User registerUser(User user) {
	return userRepository.save(user);
  }
  
  public User loginUser(String username, String password) {
	User user = userRepository.findByUsername(username);
	if (user != null && user.getPassword().equals(password)) {
	  System.out.println("User found: " + user);
	  return user;
	}
	System.out.println("User not found");
	return null;
  }
}