package com.thewa.vehicleservice.repository;
import com.thewa.vehicleservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
  @Query("SELECT v FROM Vehicle v WHERE v.price <= :maxPrice")
  List<Vehicle> findByPriceLessThanEqual(@Param("maxPrice") double maxPrice);
  
  @Query("SELECT v FROM Vehicle v WHERE v.manufacturingYear >= :minYear")
  List<Vehicle> findByManufacturingYearGreaterThanEqual(@Param("minYear") int minYear);
  
  @Query("SELECT v FROM Vehicle v WHERE v.type = :type")
  List<Vehicle> findByType(@Param("type") String type);
}