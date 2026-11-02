package com.Health_Management.Hospital_Management.API;

import java.time.LocalDateTime;

public class ApiResponse<T> {
    private int status;
    private boolean success;
    private String Message;
    private LocalDateTime timestamp;
    private T data;
}
