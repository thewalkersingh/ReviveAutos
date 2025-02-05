# ReviveAutos - Used Bike and Car E-Commerce App

## Project Overview

This project is a used bike and car e-commerce app built using:

- **Backend**: Java 21, Spring Boot, Microservices, MySQL.
- **Frontend**: React, Material-UI (MUI).
- **Architecture**: Microservices with Eureka Server and API Gateway.

## Day 1: Project Setup

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

## Day 2: Implementing Basic Features

### Admin Service
- Implemented CRUD operations for vehicles.
- Added error handling and input validation.

### User Service
- Implemented user registration and login.
- Added error handling and input validation.

### Vehicle Service
- Implemented APIs for listing and filtering vehicles.
- Added error handling and input validation.

### Booking Service
- Implemented APIs for booking test drives and purchasing vehicles.
- Integrated **Stripe** for payment processing.
- Added error handling and input validation.

### API Gateway
- Configured routes for all services.
- Verified that requests are routed correctly.

### Load Balancing
- Tested load balancing by deploying multiple instances of a service.

### Additional Features
- Integrated **Stripe** for payments (completed).
- Started work on **garage booking** (to be implemented later).

### Revive-App Module
- Defined as the core application for the frontend and high-level features.
- Will handle the home page, trending vehicles, reviews, and just-launched vehicles.
