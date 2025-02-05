package com.thewa.bookingservice.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long userId;
  private Long vehicleId;
  private String type; // test-drive or purchase
  private String status; // pending, completed, cancelled
}