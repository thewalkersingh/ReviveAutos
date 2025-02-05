package com.thewa.reviveapp.service;
import com.thewa.reviveapp.client.BookingServiceClient;
import com.thewa.reviveapp.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
  @Autowired
  private BookingServiceClient bookingServiceClient;
  
  public List<Review> getVehicleReviews(Long vehicleId) {
	return bookingServiceClient.getVehicleReviews(vehicleId);
  }
}