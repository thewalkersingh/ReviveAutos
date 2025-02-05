package com.thewa.reviveapp.model;
import lombok.Data;

@Data
public class Review {
  private Long id;
  private Long vehicleId;
  private String username;
  private int rating;
  private String comment;
}