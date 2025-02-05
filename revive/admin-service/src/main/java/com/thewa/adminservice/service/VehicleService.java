package com.thewa.adminservice.service;
import com.thewa.adminservice.model.Vehicle;
import com.thewa.adminservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
  @Autowired
  private VehicleRepository vehicleRepository;
  
  public Vehicle addVehicle(Vehicle vehicle) {
	return vehicleRepository.save(vehicle);
  }
  
  public Vehicle updateVehicle(Long id, Vehicle vehicle) {
	vehicle.setId(id);
	return vehicleRepository.save(vehicle);
  }
  
  public void deleteVehicle(Long id) {
	vehicleRepository.deleteById(id);
  }
  
  public List<Vehicle> getAllVehicles() {
	return vehicleRepository.findAll();
  }
  
  public Vehicle getVehicleById(Long id) {
	return vehicleRepository.findById(id).orElse(null);
  }
}