package com.gado.gerenciamento.controller.animal.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AnimalDto(
    @NotNull
    Integer codigoBrinco,
    @NotNull
    Character sexo,
    @NotNull
    Double pesoAtual,
    LocalDate dataEntrada,
    LocalDate dataSaida
) {
}
