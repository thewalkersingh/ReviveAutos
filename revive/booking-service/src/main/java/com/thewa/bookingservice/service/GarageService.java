package com.thewa.bookingservice.service;
import com.thewa.bookingservice.model.Garage;
import com.thewa.bookingservice.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageService {
  @Autowired
  private GarageRepository garageRepository;
  
  public List<Garage> findNearestGarages(double latitude, double longitude) {
	// Implement logic to find the nearest garages based on latitude and longitude
	return garageRepository.findAll(); // Placeholder
  }
}