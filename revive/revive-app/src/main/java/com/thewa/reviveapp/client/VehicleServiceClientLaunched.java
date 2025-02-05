package com.thewa.reviveapp.client;
import com.thewa.reviveapp.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "vehicle-service")
public interface VehicleServiceClientLaunched {
  @GetMapping("/api/vehicle/just-launched")
  List<Vehicle> getJustLaunchedVehicles();
}