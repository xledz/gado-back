package com.gado.gerenciamento.controller.pesagem.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record PesagemAnimalDto(
        @NotNull Long animalId,
        @NotNull Double peso,
        @NotNull LocalDateTime dataPesagem
        ) {
}
