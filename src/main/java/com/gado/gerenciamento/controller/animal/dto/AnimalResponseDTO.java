package com.gado.gerenciamento.controller.animal.dto;

import com.gado.gerenciamento.dominio.model.enums.animal.Sexo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalResponseDTO {

    private Sexo sexo;

}
