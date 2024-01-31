package com.gado.gerenciamento.controller.nutricao.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record NutricaoDto(
    @NotNull
    String produto,
    @NotNull
    BigDecimal preco,
    @NotNull
    Double peso,
    @NotNull
    String medida
) {
}
