package com.thewa.bookingservice.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Garage {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String address;
  private double latitude;
  private double longitude;
}