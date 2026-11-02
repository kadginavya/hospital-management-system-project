# 🏥 Hospital Management System

A Hospital Management System developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL. This project aims to simplify hospital operations by managing patient information and providing a foundation for doctor, appointment, and billing management.

## 🚀 Technologies Used

- Java 21
- Spring Boot 4.1.1
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- MapStruct
- Jakarta Validation

## 📌 Features

### Patient Management
- Add new patient details.
- Store patient personal information.
- Maintain unique patient codes.
- Store contact information.
- Manage blood group and gender details.
- Prevent duplicate patient registration using patient codes.

### Doctor Management
- Doctor entity and DTO structure.
- Doctor specialization and qualification details.
- Doctor status management.

### Appointment Management
- Appointment entity.
- Doctor and patient identification.
- Appointment date and time.
- Appointment status tracking.

### Billing Management
- Billing entity structure.

## 📂 Project Structure

```text
Hospital-Management-System/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/Health_Management/
│   │   │       └── Hospital_Management/
│   │   │           ├── API/
│   │   │           ├── DTO/
│   │   │           ├── Enum/
│   │   │           ├── Exception/
│   │   │           ├── controller/
│   │   │           ├── entity/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           └── HospitalManagementApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
