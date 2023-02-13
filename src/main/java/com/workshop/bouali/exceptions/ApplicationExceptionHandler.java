package com.workshop.bouali.exceptions;

import com.workshop.bouali.enums.ApiResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        ApiResponse<?> serviceResponse = new ApiResponse<>();
        List<ErrorDTO> errors = new ArrayList<>();
        exception.getBindingResult()
                 .getFieldErrors()
                 .forEach(error -> {
                     ErrorDTO errorDT0 = new ErrorDTO(error.getField(), error.getDefaultMessage());
                     errors.add(errorDT0);
                 });

        serviceResponse.setStatus(ApiResponseStatus.FAILED);
        serviceResponse.setErrors(errors);
        return serviceResponse;
    }
}
