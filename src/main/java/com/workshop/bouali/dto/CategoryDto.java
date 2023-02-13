package com.workshop.bouali.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
public class CategoryDto {

  @NotEmpty(message = "The name should not be empty")
  private String name;

  @NotEmpty(message = "type should not be empty")
  private String type;

}
