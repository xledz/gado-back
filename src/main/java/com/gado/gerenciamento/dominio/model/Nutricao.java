package com.gado.gerenciamento.dominio.model;

import com.gado.gerenciamento.controller.nutricao.dto.NutricaoDto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "nutricao")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Nutricao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter(AccessLevel.NONE)
  private Long id;

  @Column(nullable = false)
  private String produto;
  
  @Column(precision = 10, scale = 2, nullable = false)
  private BigDecimal preco;
  
  @Column(nullable = false)
  private Double peso;

  @Column(nullable = false)
  private String medida;
}
