#!/bin/bash

# Start Eureka Server
echo "Starting Eureka Server..."
(cd revive/eureka-server && mvn spring-boot:run) &

# Wait for Eureka Server to start (you may adjust the sleep duration if needed)
sleep 30

# Start API Gateway
echo "Starting API Gateway..."
(cd revive/api-gateway && mvn spring-boot:run) &

# Start Admin Service
echo "Starting Admin Service..."
(cd revive/admin-service && mvn spring-boot:run) &

# Start User Service
echo "Starting User Service..."
(cd revive/user-service && mvn spring-boot:run) &

# Start Vehicle Service
echo "Starting Vehicle Service..."
(cd revive/vehicle-service && mvn spring-boot:run) &

# Start Booking Service
echo "Starting Booking Service..."
(cd revive/booking-service && mvn spring-boot:run) &
