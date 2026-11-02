package com.Health_Management.Hospital_Management.controller;

import com.Health_Management.Hospital_Management.DTO.patient_request;
import com.Health_Management.Hospital_Management.DTO.patient_response;
import com.Health_Management.Hospital_Management.service.patient_service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hosp_home")
public class patient_controller {

    private final patient_service ps;

    @PostMapping("/add")
    public patient_response add(@RequestBody patient_request p) {
        return ps.add(p);
    }
}