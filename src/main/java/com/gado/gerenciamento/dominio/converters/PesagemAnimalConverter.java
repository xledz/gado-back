package com.gado.gerenciamento.dominio.converters;

import com.gado.gerenciamento.controller.pesagem.dto.PesagemAnimalDto;
import com.gado.gerenciamento.dominio.model.PesagemAnimal;

public class PesagemAnimalConverter {

    public static PesagemAnimal fromDtoToEntity(PesagemAnimalDto dto) {
        PesagemAnimal pesagem = new PesagemAnimal();

        pesagem.setPeso(dto.peso());
        pesagem.setDataPesagem(dto.dataPesagem());

        return pesagem;
    }

}
