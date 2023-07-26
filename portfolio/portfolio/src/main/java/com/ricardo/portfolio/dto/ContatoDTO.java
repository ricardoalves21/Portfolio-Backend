package com.ricardo.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record ContatoDTO(
        @JsonProperty("id")
        Long id,

        @NotBlank
        @NotNull
        @Length(min = 5, max = 200)
        String nome,

        @NotBlank
        @NotNull
        @Length(min = 10, max = 11)
        String telefone,

        @NotBlank
        @NotNull
        @Email
        String email,

        @NotBlank
        @NotNull
        @Length(min = 5, max = 200)
        String empresa
) {

}
