package com.workshop.bouali.controllers;

import com.workshop.bouali.dto.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Ali Bouali
 */
@RestController
@RequestMapping("/api/v1/greetings")
@RequiredArgsConstructor
public class GreetingController {


  @PostMapping
  public ResponseEntity<String> postGreeting(
      @Valid @RequestBody Greeting greeting
  ) {
    return ResponseEntity.ok("ok");
  }

}
