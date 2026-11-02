package com.Health_Management.Hospital_Management.entity;

import com.Health_Management.Hospital_Management.Enum.BloodGroup;
import com.Health_Management.Hospital_Management.Enum.gender;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String patientCode;

    @Column(nullable = false)
    private String FirstName;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable=true)
    private int age;

    @Enumerated(EnumType.STRING)
    private gender gender;

    @Column(nullable = false,unique = true)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(nullable=false,unique = true)
    private String aadhar;

    @Column(nullable=false)
    private String address;

    @Column(nullable = false)
    private  Long emergencyContact;



}
