package com.Health_Management.Hospital_Management.repository;

import com.Health_Management.Hospital_Management.Enum.DoctorStatus;
import com.Health_Management.Hospital_Management.entity.Doctor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DoctorRepository extends JpaRepository<Doctor, UUID> {


        Optional<Doctor> findByUserId(UUID userId);

        Optional<Doctor> findByLicenseNumber(String licenseNumber);

        boolean existsByUserId(UUID userId);

        boolean existsByLicenseNumber(String licenseNumber);

        Page<Doctor> findBySpecializationIgnoreCase(
                String specialization,
                Pageable pageable
        );

        Page<Doctor> findByStatus(
                DoctorStatus status,
                Pageable pageable
        );

        Page<Doctor> findBySpecializationIgnoreCaseAndStatus(
                String specialization,
                DoctorStatus status,
                Pageable pageable
        );
    }

