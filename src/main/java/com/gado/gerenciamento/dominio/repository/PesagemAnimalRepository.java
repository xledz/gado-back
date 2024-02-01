package com.gado.gerenciamento.dominio.repository;

import com.gado.gerenciamento.dominio.model.Animal;
import com.gado.gerenciamento.dominio.model.PesagemAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesagemAnimalRepository extends JpaRepository<PesagemAnimal, Long> {
}
