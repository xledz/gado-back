package com.gado.gerenciamento.controller.animal;

import com.gado.gerenciamento.dominio.service.AnimalService;
import com.gado.gerenciamento.controller.animal.dto.AnimalDto;
import com.gado.gerenciamento.dominio.model.Animal;
import com.gado.gerenciamento.dominio.repository.AnimalRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
@CrossOrigin
public class AnimalController {
    
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private AnimalService animalService;
    
    @Transactional
    @PostMapping("/cadastrar")
    public ResponseEntity<Animal> cadastrarAnimal(@Valid @RequestBody AnimalDto data) {
        return ResponseEntity.ok(animalService.cadastrarAnimal(data));
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Animal> buscarAnimal(@PathVariable Long id) {
        return ResponseEntity.ok(animalService.findByID(id));
    }
    
    @GetMapping("/buscar")
    public ResponseEntity<List<Animal>> listarAnimais() {
        return ResponseEntity.ok(animalService.listAll());
    }
}
