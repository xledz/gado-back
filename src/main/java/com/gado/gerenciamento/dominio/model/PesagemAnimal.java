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
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id")
  private Animal animal_id;
  
  @Column(nullable = false)
  private Double peso;
  
  @Column(nullable = false)
  private LocalDateTime dataPesagem = LocalDateTime.now();
}
