package com.thewa.vehicleservice.controller;
import com.thewa.vehicleservice.model.Vehicle;
import com.thewa.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
  @Autowired
  private VehicleService vehicleService;
  
  @GetMapping
  public List<Vehicle> getAllVehicles() {
	return vehicleService.getAllVehicles();
  }
  
  @GetMapping("/filter/price")
  public List<Vehicle> getVehiclesByPrice(@RequestParam double maxPrice) {
	return vehicleService.getVehiclesByPrice(maxPrice);
  }
  
  @GetMapping("/filter/year")
  public List<Vehicle> getVehiclesByManufacturingYear(@RequestParam int minYear) {
	return vehicleService.getVehiclesByManufacturingYear(minYear);
  }
  
  @GetMapping("/filter/type")
  public List<Vehicle> getVehiclesByType(@RequestParam String type) {
	return vehicleService.getVehiclesByType(type);
  }
}