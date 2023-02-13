package com.workshop.bouali.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
public class CategoryDto {

  @NotEmpty(message = "validation.message.NotEmpty")
  private String name;

  @NotEmpty(message = "validation.message.NotEmpty")
  private String type;

}
