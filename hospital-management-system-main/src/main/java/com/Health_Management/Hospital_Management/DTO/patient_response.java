package com.Health_Management.Hospital_Management.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class patient_response {
    private Long id;
    private String patientCode;
    private String FirstName;
    private String LastName;
    private String age;
    private String gender;
    private String phoneNumber;
    private String email;
    private String bloodgroup;
    private String aadhar;
    private String emergencyContact;
    private String AdmitDate;
    private String status;

}
