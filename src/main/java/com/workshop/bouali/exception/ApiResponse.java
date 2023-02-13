package com.workshop.bouali.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.workshop.bouali.enums.ApiResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private ApiResponseStatus status;
    private List<ErrorDTO> errors;
    private T results;
}
