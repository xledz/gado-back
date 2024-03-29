package com.gado.gerenciamento.dominio.repository;

import com.gado.gerenciamento.dominio.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
