package com.workshop.bouali.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

import java.util.List;


@Data
public class GreetingDto {

  @NotEmpty(message = "validation.message.NotEmpty")
  private String msg;

  @NotNull(message = "validation.message.NotEmpty")
  @Size(min=1, max=3)
  private List<@Valid CategoryDto> categoryDtoList;

}
