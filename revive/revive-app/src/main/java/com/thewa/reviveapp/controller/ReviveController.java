package com.thewa.reviveapp.controller;
import com.thewa.reviveapp.model.Review;
import com.thewa.reviveapp.model.Vehicle;
import com.thewa.reviveapp.service.ReviewService;
import com.thewa.reviveapp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/revive")
public class ReviveController {
  @Autowired
  private VehicleService vehicleService;
  private ReviewService reviewService;
  
  @GetMapping("/trending")
  public List<Vehicle> getTrendingVehicles() {
	return vehicleService.getTrendingVehicles();
  }
  
  @GetMapping("/reviews")
  public List<Review> getVehicleReviews(@RequestParam Long vehicleId) {
	return reviewService.getVehicleReviews(vehicleId);
  }
  @GetMapping("/just-launched")
  public List<Vehicle> getJustLaunchedVehicles() {
    return vehicleService.getJustLaunchedVehicles();
  }
}