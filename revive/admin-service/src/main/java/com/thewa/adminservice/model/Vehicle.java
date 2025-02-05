package com.thewa.adminservice.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank(message = "Type is required")
  private String type; // bike or car
  @NotBlank(message = "Model is required")
  private String model;
  @NotBlank(message = "Manufacturer is required")
  private String manufacturer;
  @Min(value = 2010, message = "Manufacturing year must be after 2010")
  @Max(value = 2025, message = "Manufacturing year must be before 2025")
  private int manufacturingYear;
  @Positive(message = "Price must be a positive value")
  private double price;
}