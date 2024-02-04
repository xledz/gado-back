package com.gado.gerenciamento.dominio.converters;

import com.gado.gerenciamento.controller.pesagem.dto.PesagemAnimalDto;
import com.gado.gerenciamento.dominio.model.Animal;
import com.gado.gerenciamento.dominio.model.PesagemAnimal;

public class PesagemAnimalConverter {

    public static PesagemAnimal fromDtoToEntity(PesagemAnimalDto dto, Animal animal) {
        PesagemAnimal pesagem = new PesagemAnimal();

        pesagem.setPeso(dto.peso());
        pesagem.setDataPesagem(dto.dataPesagem());
        pesagem.setAnimalId(animal);

        return pesagem;
    }

}
