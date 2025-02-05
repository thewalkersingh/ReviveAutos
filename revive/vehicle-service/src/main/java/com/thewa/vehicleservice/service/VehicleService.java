package com.thewa.vehicleservice.service;
import com.thewa.vehicleservice.model.Vehicle;
import com.thewa.vehicleservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
  @Autowired
  private VehicleRepository vehicleRepository;
  
  public List<Vehicle> getAllVehicles() {
	return vehicleRepository.findAll();
  }
  
  public List<Vehicle> getVehiclesByPrice(double maxPrice) {
	return vehicleRepository.findByPriceLessThanEqual(maxPrice);
  }
  
  public List<Vehicle> getVehiclesByManufacturingYear(int minYear) {
	return vehicleRepository.findByManufacturingYearGreaterThanEqual(minYear);
  }
  
  public List<Vehicle> getVehiclesByType(String type) {
	return vehicleRepository.findByType(type);
  }
}