package com.Health_Management.Hospital_Management.DTO;

import com.Health_Management.Hospital_Management.entity.patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface patientMapper {

    patient toEntity(patient_request req);

    patient_response toResponse(patient p);
}