package com.mahedi.smartqueuemanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response {

    private Long timeStamp;

    private int statusCode;

    private String status;

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int numberOfElement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ErrorResponseDto> errors;
}