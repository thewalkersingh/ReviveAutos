package com.thewa.reviveapp.client;

import com.thewa.reviveapp.model.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "booking-service")
public interface BookingServiceClient {
  @GetMapping("/api/booking/reviews")
  List<Review> getVehicleReviews(@RequestParam Long vehicleId);
}