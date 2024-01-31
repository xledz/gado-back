package com.gado.gerenciamento.dominio.model;

import com.gado.gerenciamento.dominio.model.enums.animal.Sexo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "animal")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(nullable = false)
  private Integer codigoBrinco;
  
  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Sexo sexo;
  
  @Column(nullable = false)
  private Double pesoAtual;
  
  @Column(nullable = false)
  private LocalDate dataEntrada;
  
  private LocalDate dataSaida;

}
