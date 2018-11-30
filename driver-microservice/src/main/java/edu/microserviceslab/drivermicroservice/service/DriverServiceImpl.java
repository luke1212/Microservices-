package edu.microserviceslab.drivermicroservice.service;

import edu.microserviceslab.drivermicroservice.entity.Driver;
import edu.microserviceslab.drivermicroservice.repo.DriverRepo;
import edu.microserviceslab.drivermicroservice.service.interfaces.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    private DriverRepo driverRepo;

    public DriverServiceImpl(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepo.findAll();
    }

    @Override
    public Driver getDriverById(Long driverId) {
        Optional<Driver> driver = driverRepo.findById(driverId);

        Driver toReturn = null;
        if (driver.isPresent()) {
            toReturn = driver.get();
        }

        return toReturn;
    }
}
