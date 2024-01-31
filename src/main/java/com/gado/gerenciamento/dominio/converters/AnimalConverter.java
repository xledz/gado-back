package com.gado.gerenciamento.dominio.converters;

import com.gado.gerenciamento.dominio.model.Animal;
import com.gado.gerenciamento.dominio.model.enums.animal.Sexo;
import com.gado.gerenciamento.controller.animal.dto.AnimalDto;

public class AnimalConverter {

    public static Animal fromDtoToEntity(AnimalDto dto) {
        Animal animal = new Animal();
        animal.setCodigoBrinco(dto.codigoBrinco());
        animal.setSexo( Sexo.fromValue(dto.sexo()) );
        animal.setPesoAtual( dto.pesoAtual() );
        animal.setDataEntrada( dto.dataEntrada() );
        animal.setDataSaida( dto.dataSaida() );
        return animal;
    }
}
