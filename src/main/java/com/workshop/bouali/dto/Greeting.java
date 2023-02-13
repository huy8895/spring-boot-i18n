package com.workshop.bouali.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
public class Greeting {

  @NotEmpty(message = "The MESSAGE should not be empty")
  private String msg;

  @NotNull(message = "The categoryDtoList should not be empty")
  @Size(min=1, max=3)
  private List<@Valid CategoryDto> categoryDtoList;

}
