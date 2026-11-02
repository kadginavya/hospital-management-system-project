package com.Health_Management.Hospital_Management.DTO;

import com.Health_Management.Hospital_Management.Enum.BloodGroup;
import com.Health_Management.Hospital_Management.Enum.gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class patient_request {
    @NotBlank(message = "required")
    private String patientCode;
    @NotBlank(message = "name is required")
    private String FirstName;
    @NotBlank(message = "required")
    private String LastName;
    @NotBlank(message="age is required")
    private int age;
    @NotBlank(message = "gender is required")
    private gender gender;
    @Pattern(regexp = "^[6_9]\\d{9}",message = "invalid phone")
    private String phoneNumber;
    @Email(message = "invalid message")
    private String email;
    @NotBlank(message = "required")
    private BloodGroup bloodGroup;
    @NotBlank(message = "reuired")
    private String aadhar;
    @NotBlank(message = "required")
    private String address;

}
