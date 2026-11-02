package com.Health_Management.Hospital_Management.service;

import com.Health_Management.Hospital_Management.DTO.patientMapper;
import com.Health_Management.Hospital_Management.DTO.patient_request;
import com.Health_Management.Hospital_Management.DTO.patient_response;
import com.Health_Management.Hospital_Management.entity.patient;
import com.Health_Management.Hospital_Management.repository.patient_repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class patient_service {

    private final patient_repo res2;
    private final patientMapper mapper;

    public patient_response add(patient_request req) {

        // Check whether patient already exists
        if (res2.findByPatientCode(req.getPatientCode()).isPresent()) {
            throw new RuntimeException("Patient already exists");
        }

        // DTO -> Entity
        patient p = mapper.toEntity(req);

        // Save patient
        patient savedPatient = res2.save(p);

        // Entity -> Response DTO
        return mapper.toResponse(savedPatient);
    }
}