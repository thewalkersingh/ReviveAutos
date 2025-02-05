package com.thewa.userservice.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank(message = "Username is required")
  private String username;
  @NotBlank(message = "Password is required")
  @Size(min = 9, message = "Password must be at least 9 characters long")
  private String password;
  @NotBlank(message = "Email is required")
  @Email(message = "Email must be valid")
  private String email;
}