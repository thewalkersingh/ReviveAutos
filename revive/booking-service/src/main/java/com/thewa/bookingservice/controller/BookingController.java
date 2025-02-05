package com.thewa.bookingservice.controller;
import com.thewa.bookingservice.model.Booking;
import com.thewa.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
  @Autowired
  private BookingService bookingService;
  
  @PostMapping("/test-drive")
  public Booking bookTestDrive(@RequestBody Booking booking) {
	return bookingService.bookTestDrive(booking);
  }
  
  @PostMapping("/purchase")
  public Booking purchaseVehicle(@RequestBody Booking booking) {
	return bookingService.purchaseVehicle(booking);
  }
  
  @DeleteMapping("/{id}")
  public void cancelBooking(@PathVariable Long id) {
	bookingService.cancelBooking(id);
  }
}