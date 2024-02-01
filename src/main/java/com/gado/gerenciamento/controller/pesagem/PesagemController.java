package com.gado.gerenciamento.controller.pesagem;

import com.gado.gerenciamento.controller.pesagem.dto.PesagemAnimalDto;
import com.gado.gerenciamento.dominio.model.PesagemAnimal;
import com.gado.gerenciamento.dominio.service.PesagemService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pesagem")
@CrossOrigin
public class PesagemController {
    @Autowired
    private PesagemService service;

    @Transactional
    @PostMapping("/animal")
    public ResponseEntity<PesagemAnimal> savePesagemAnimal(@Valid @RequestBody PesagemAnimalDto data) {
        return ResponseEntity.ok(service.savePesagemAnimal(data));
    }
}
