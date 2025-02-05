package com.thewa.adminservice.controller;
import com.thewa.adminservice.model.Vehicle;
import com.thewa.adminservice.service.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/vehicles")
@Tag(name = "Admin Service", description = "APIs for managing vehicles")
public class VehicleController {
  @Autowired
  private VehicleService vehicleService;
  
  @Operation(summary = "Add a new vehicle")
  @ApiResponse(responseCode = "200", description = "Vehicle added successfully")
  @PostMapping
  public Vehicle addVehicle(@Valid @RequestBody Vehicle vehicle) {
	return vehicleService.addVehicle(vehicle);
  }
  
  @PutMapping("/{id}")
  public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle) {
	return vehicleService.updateVehicle(id, vehicle);
  }
  
  @DeleteMapping("/{id}")
  public void deleteVehicle(@PathVariable Long id) {
	vehicleService.deleteVehicle(id);
  }
  
  @Operation(summary = "Get all vehicles")
  @ApiResponse(responseCode = "200", description = "List of vehicles retrieved successfully")
  @GetMapping
  public List<Vehicle> getAllVehicles() {
	return vehicleService.getAllVehicles();
  }
  
  @GetMapping("/{id}")
  public Vehicle getVehicleById(@PathVariable Long id) {
	return vehicleService.getVehicleById(id);
  }
}