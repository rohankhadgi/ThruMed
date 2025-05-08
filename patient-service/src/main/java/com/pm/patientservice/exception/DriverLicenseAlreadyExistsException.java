package com.pm.patientservice.exception;

public class DriverLicenseAlreadyExistsException extends RuntimeException {
    public DriverLicenseAlreadyExistsException(String message) {
        super(message);
    }
}
