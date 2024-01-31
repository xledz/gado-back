package com.gado.gerenciamento.dominio.service;

import com.gado.gerenciamento.config.exceptions.ValidationException;
import com.gado.gerenciamento.dominio.converters.AnimalConverter;
import com.gado.gerenciamento.dominio.model.Animal;
import com.gado.gerenciamento.dominio.repository.AnimalRepository;
import com.gado.gerenciamento.controller.animal.dto.AnimalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;
    
    public Animal cadastrarAnimal(AnimalDto animalDto) {
        Animal novoAnimal = AnimalConverter.fromDtoToEntity(animalDto);
        return animalRepository.save(novoAnimal);
    }
    
    public Animal findByID(Long id) {
        Optional<Animal> entity = animalRepository.findById(id);
        return entity.orElseThrow(() -> new ValidationException("Animal não encontrado para o ID informado"));
    }
    
    public List<Animal> listAll() {
        return animalRepository.findAll();
    }
    
}
