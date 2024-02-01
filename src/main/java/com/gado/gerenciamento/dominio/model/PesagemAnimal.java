package com.gado.gerenciamento.dominio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "pesagem_animal")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PesagemAnimal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "animal_id")
  private Animal animalId;
  
  @Column(nullable = false)
  private Double peso;
  
  @Column(nullable = false)
  private LocalDateTime dataPesagem = LocalDateTime.now();
}
