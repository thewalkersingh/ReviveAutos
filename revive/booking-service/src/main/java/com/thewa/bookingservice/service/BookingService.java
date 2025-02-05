package com.thewa.bookingservice.service;
import com.thewa.bookingservice.model.Booking;
import com.thewa.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
  @Autowired
  private BookingRepository bookingRepository;
  
  public Booking bookTestDrive(Booking booking) {
	booking.setType("test-drive");
	booking.setStatus("pending");
	return bookingRepository.save(booking);
  }
  
  public Booking purchaseVehicle(Booking booking) {
	booking.setType("purchase");
	booking.setStatus("pending");
	return bookingRepository.save(booking);
  }
  
  public void cancelBooking(Long id) {
	bookingRepository.deleteById(id);
  }
}