package com.thewa.reviveapp.service;
import com.thewa.reviveapp.client.VehicleServiceClientLaunched;
import com.thewa.reviveapp.client.VehicleServiceClientTrending;
import com.thewa.reviveapp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
  @Autowired
  private VehicleServiceClientLaunched vehicleServiceClientLaunched;
  private VehicleServiceClientTrending vehicleServiceClientTrending;
  
  public List<Vehicle> getTrendingVehicles() {
	return vehicleServiceClientLaunched.getTrendingVehicles();
  }
  
  public List<Vehicle> getJustLaunchedVehicles() {
	return vehicleServiceClientTrending.getJustLaunchedVehicles();
  }
}