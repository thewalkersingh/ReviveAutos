package com.thewa.revive.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/revive")
public class ReviveController {
  @Autowired
  private VehicleService vehicleService;
  
  @GetMapping("/trending")
  public List<Vehicle> getTrendingVehicles() {
	return vehicleService.getTrendingVehicles();
  }
  
  @GetMapping("/reviews")
  public List<Review> getVehicleReviews(@RequestParam Long vehicleId) {
	return vehicleService.getVehicleReviews(vehicleId);
  }
}