package com.ricardo.portfolio.dto.mapper;

import com.ricardo.portfolio.dto.ContatoDTO;
import com.ricardo.portfolio.model.Contato;
import org.springframework.stereotype.Component;

@Component
public class ContatoMapper {

    public ContatoDTO toDTO(Contato contato) {

        if(contato == null) {
            return null;
        }

        return new ContatoDTO(
                contato.getId(),
                contato.getNome(),
                contato.getTelefone(),
                contato.getEmail(),
                contato.getEmpresa()
        );
    }

    public Contato toEntity(ContatoDTO contatoDTO) {
        if(contatoDTO == null) {
            return null;
        }
        Contato contato = new Contato();
        if(contatoDTO.id() != null) {
            contato.setId(contatoDTO.id());
        }
        contato.setNome(contatoDTO.nome());
        contato.setTelefone(contatoDTO.telefone());
        contato.setEmail(contatoDTO.email());
        contato.setEmpresa(contatoDTO.empresa());

        return contato;
    }
}
