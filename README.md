# ReviveAutos - Used Bike and Car E-Commerce App

## Project Overview
This project is a used bike and car e-commerce app built using:
- **Backend**: Java 21, Spring Boot, Microservices, MySQL.
- **Frontend**: React, Material-UI (MUI).
- **Architecture**: Microservices with Eureka Server and API Gateway.

## Day 1 Progress (Project Setup)

### Backend Setup
- **Parent Project**: `revive`
  - Group: `com.thewa`
  - Artifact: `reviveapi`
  - Package: `com.thewa.reviveapi`
  - JDK: 21
  - Packaging: Jar
- **Microservices**:
  - Eureka Server
  - API Gateway
  - Admin Service
  - User Service
  - Vehicle Service
  - Booking Service
- **Database**: MySQL configured for all services.
- **Configuration**: `application.yml` used for all services.

### Frontend Setup
- **Project Name**: `reviveui`
  - Created using `create-react-app`.
  - Installed Material-UI (MUI) for styling.
  - Set up basic routing using `react-router-dom`.

### Version Control
- Initialized Git repository.
- Added `.gitignore` file to exclude unnecessary files.

### Next Steps
- **Day 2**: Develop Admin Service and User Service.
  - Implement CRUD operations for vehicles (Admin Service).
  - Implement user registration and login (User Service).