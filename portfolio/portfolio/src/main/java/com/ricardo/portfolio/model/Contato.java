package com.ricardo.portfolio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @Column(length = 200, nullable = false)
    @NotNull
    @Length(min = 5, max = 200)
    private String nome;

    @Column(length = 11, nullable = false)
    @NotNull
    @Length(min = 10, max = 11)
    private String telefone;

    @Column(length = 100, nullable = false)
    @NotNull
    @Email
    private String email;

    @Column(length = 200, nullable = false)
    @NotNull
    @Length(min = 5, max = 200)
    private String empresa;
}
