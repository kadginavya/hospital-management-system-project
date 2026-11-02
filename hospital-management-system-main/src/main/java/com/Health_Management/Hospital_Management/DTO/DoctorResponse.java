package com.Health_Management.Hospital_Management.DTO;

import com.Health_Management.Hospital_Management.Enum.DoctorStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class DoctorResponse{


        private UUID id;

        private String firstName;

        private String lastName;

        private String phoneNumber;

        private String specialization;

        private String qualification;

        private Integer experienceYears;

        private String licenseNumber;

        private String hospitalName;

        private String department;

        private String profileImageUrl;

        private DoctorStatus status;

        private LocalDateTime createdAt;

}
