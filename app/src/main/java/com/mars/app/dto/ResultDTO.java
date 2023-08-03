package com.mars.app.dto;

import lombok.Data;

/**
 * ResultDTO
 */
@Data
public class ResultDTO {

    private Boolean state;
    private Object result;
    private String message;
    
}