package com.thewa.bookingservice.controller;
import com.thewa.bookingservice.model.Garage;
import com.thewa.bookingservice.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/garage")
public class GarageController {
  @Autowired
  private GarageService garageService;
  
  @GetMapping("/nearest")
  public List<Garage> findNearestGarages(@RequestParam double latitude, @RequestParam double longitude) {
	return garageService.findNearestGarages(latitude, longitude);
  }
  
  @PostMapping("/book")
  public String bookGarage(@RequestParam Long garageId, @RequestParam Long userId) {
	// Implement logic to book a garage
	return "Garage booked successfully!";
  }
}