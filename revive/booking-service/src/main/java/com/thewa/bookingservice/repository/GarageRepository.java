package com.thewa.bookingservice.repository;
import com.thewa.bookingservice.model.Garage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<Garage, Long> {
}