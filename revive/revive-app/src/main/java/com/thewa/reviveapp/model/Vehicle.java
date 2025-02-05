package com.thewa.reviveapp.model;
import lombok.Data;

@Data
public class Vehicle {
  private Long id;
  private String type; // bike or car
  private String model;
  private String manufacturer;
  private int manufacturingYear;
  private double price;
}