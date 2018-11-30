package edu.microserviceslab.drivermicroservice.service.interfaces;

import edu.microserviceslab.drivermicroservice.entity.Driver;

import java.util.List;

public interface DriverService {

    List<Driver> getAllDrivers();

    Driver getDriverById(Long driverId);
}
