package com.ricardo.portfolio.repository;

import com.ricardo.portfolio.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
