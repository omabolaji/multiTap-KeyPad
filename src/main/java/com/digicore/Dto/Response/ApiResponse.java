package com.digicore.Dto.Response;

import lombok.Data;

@Data
public class ApiResponse {
    private String message;
    private boolean success;
    private Object data;
}
