package com.ricardo.portfolio.controller;

import com.ricardo.portfolio.dto.ContatoDTO;
import com.ricardo.portfolio.service.ContatoService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/contato")
public class ContatoController {

    private ContatoService contatoService;
    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping("/inserir")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ContatoDTO create(@RequestBody @Valid @NotNull ContatoDTO contato) {
        return contatoService.create(contato);
    }

    @GetMapping
    public List<ContatoDTO> list() {
        return contatoService.list();
    }


}
