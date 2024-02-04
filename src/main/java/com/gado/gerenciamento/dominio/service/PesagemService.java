package com.gado.gerenciamento.dominio.service;

import com.gado.gerenciamento.controller.pesagem.dto.PesagemAnimalDto;
import com.gado.gerenciamento.dominio.converters.PesagemAnimalConverter;
import com.gado.gerenciamento.dominio.model.Animal;
import com.gado.gerenciamento.dominio.model.PesagemAnimal;
import com.gado.gerenciamento.dominio.repository.AnimalRepository;
import com.gado.gerenciamento.dominio.repository.PesagemAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PesagemService {
    @Autowired
    private PesagemAnimalRepository pesagemAnimalRepository;
    @Autowired
    private AnimalRepository animalRepository;

    public List<PesagemAnimal> listAllPesagemAnimais() {
        return pesagemAnimalRepository.findAll();
    }

    public PesagemAnimal savePesagemAnimal(PesagemAnimalDto data) {
        Optional<Animal> animal = animalRepository.findById(data.animalId());

        //TODO implement error handling in case of animal being not found

        PesagemAnimal novaPesagem = PesagemAnimalConverter.fromDtoToEntity(data, animal.get());
        return pesagemAnimalRepository.save(novaPesagem);
    }

}
