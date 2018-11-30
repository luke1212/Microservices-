package edu.microserviceslab.drivermicroservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverVehicleDTO {

    private Long id;

    private String make;

    private String model;

    private Integer modelYear;

    private String licensePlate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DriverVehicleDTO that = (DriverVehicleDTO) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(make, that.make)
                .append(model, that.model)
                .append(modelYear, that.modelYear)
                .append(licensePlate, that.licensePlate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(make)
                .append(model)
                .append(modelYear)
                .append(licensePlate)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("make", make)
                .append("model", model)
                .append("modelYear", modelYear)
                .append("licensePlate", licensePlate)
                .toString();
    }
}
