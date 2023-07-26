package com.ricardo.portfolio.service;

import com.ricardo.portfolio.dto.ContatoDTO;

import com.ricardo.portfolio.dto.mapper.ContatoMapper;
import com.ricardo.portfolio.repository.ContatoRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;
    private final ContatoMapper contatoMapper;

    public ContatoService(ContatoRepository contatoRepository, ContatoMapper contatoMapper) {
        this.contatoRepository = contatoRepository;
        this.contatoMapper = contatoMapper;
    }


    public ContatoDTO create(@Valid @NotNull ContatoDTO contato) {
        return contatoMapper.toDTO(contatoRepository.save(contatoMapper.toEntity(contato)));
    }

}
