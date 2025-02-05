package com.thewa.userservice.controller;
import com.thewa.userservice.model.User;
import com.thewa.userservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  private UserService userService;
  
  @PostMapping("/register")
  public User registerUser(@Valid @RequestBody User user) {
	return userService.registerUser(user);
  }
  
  @PostMapping("/login")
  public User loginUser(@RequestParam String username, @RequestParam String password) {
	return userService.loginUser(username, password);
  }
}