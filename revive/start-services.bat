@echo off
echo Starting Eureka Server...
start cmd /k "cd revive\eureka-server && mvn spring-boot:run"

timeout /t 30

echo Starting API Gateway...
start cmd /k "cd revive\api-gateway && mvn spring-boot:run"

echo Starting Admin Service...
start cmd /k "cd revive\admin-service && mvn spring-boot:run"

echo Starting User Service...
start cmd /k "cd revive\user-service && mvn spring-boot:run"

echo Starting Vehicle Service...
start cmd /k "cd revive\vehicle-service && mvn spring-boot:run"

echo Starting Booking Service...
start cmd /k "cd revive\booking-service && mvn spring-boot:run"

echo All services started.
pause
