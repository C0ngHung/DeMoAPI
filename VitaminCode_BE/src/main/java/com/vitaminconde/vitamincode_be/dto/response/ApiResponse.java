package com.vitaminconde.vitamincode_be.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ApiResponse {
    private Integer status;
    private Boolean success;
    private String message;
    private Object data;
}
