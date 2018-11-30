package edu.microserviceslab.drivermicroservice.controller;

import edu.microserviceslab.drivermicroservice.common.proxies.VehicleRestProxy;
import edu.microserviceslab.drivermicroservice.entity.Driver;
import edu.microserviceslab.drivermicroservice.service.interfaces.DriverService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {

    private DriverService driverService;

    private VehicleRestProxy vehicleRestProxy;

    public DriverController(DriverService driverService, VehicleRestProxy vehicleRestProxy) {
        this.driverService = driverService;
        this.vehicleRestProxy = vehicleRestProxy;
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<Driver> listAllDrivers() {
        return driverService.getAllDrivers();
    }

    @ResponseBody
    @RequestMapping("/{driverId}/licensePlate")
    public String getDriverLicensePlate(@PathVariable("driverId") Long driverId) {
        Driver driver = driverService.getDriverById(driverId);

        String licensePlate = null;
        if (driver != null && driver.getVehicleId() != null) {
            licensePlate = vehicleRestProxy.getVehicleLicensePlate(driver.getVehicleId());
        }

        return licensePlate;
    }
}
