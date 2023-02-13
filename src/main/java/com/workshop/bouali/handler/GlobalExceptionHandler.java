package com.workshop.bouali.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Ali Bouali
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  @ExceptionHandler(IllegalStateException.class)
  public ResponseEntity<?> handleException(IllegalStateException exception) {
    log.error(exception.getMessage());
    return ResponseEntity
        .badRequest()
        .body(exception.getMessage());
  }
}
