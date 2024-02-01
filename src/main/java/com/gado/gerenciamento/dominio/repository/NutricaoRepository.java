package com.gado.gerenciamento.dominio.repository;

import com.gado.gerenciamento.dominio.model.Nutricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutricaoRepository extends JpaRepository<Nutricao, Long> {
}
