package com.Health_Management.Hospital_Management.DTO;

import jakarta.validation.constraints.*;

import java.util.UUID;

public class DoctorRequest {
    @NotNull(message = "User ID is required")
    private UUID userId;

    @NotBlank(message = "First name is required")
    @Size(max = 100)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 100)
    private String lastName;

    @NotBlank(message = "Phone number is required")
    @Size(max = 20)
    private String phoneNumber;

    @NotBlank(message = "Specialization is required")
    @Size(max = 100)
    private String specialization;

    @Size(max = 255)
    private String qualification;

    @Min(value = 0, message = "Experience cannot be negative")
    @Max(value = 70, message = "Experience is invalid")
    private Integer experienceYears;

    @NotBlank(message = "License number is required")
    @Size(max = 100)
    private String licenseNumber;

    @Size(max = 255)
    private String hospitalName;

    @Size(max = 100)
    private String department;


}
