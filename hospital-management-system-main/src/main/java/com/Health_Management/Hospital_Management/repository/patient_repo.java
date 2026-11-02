package com.Health_Management.Hospital_Management.repository;

import com.Health_Management.Hospital_Management.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository


public interface patient_repo extends JpaRepository<patient, Long> {

    Optional<patient> findByPatientCode(String patientCode);
}