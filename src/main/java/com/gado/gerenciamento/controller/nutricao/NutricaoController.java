package com.gado.gerenciamento.controller.nutricao;

import com.gado.gerenciamento.controller.nutricao.dto.NutricaoDto;
import com.gado.gerenciamento.dominio.model.Nutricao;
import com.gado.gerenciamento.dominio.service.NutricaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nutricao")
@CrossOrigin
public class NutricaoController {
    
    @Autowired
    private NutricaoService nutricaoService;
    
    @PostMapping("/cadastrar/racao")
    public ResponseEntity<Nutricao> cadastrarRacao(@Valid @RequestBody NutricaoDto data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(nutricaoService.cadastrarRacao(data));
    }
    
    @GetMapping("/buscar/racao/{id}")
    public ResponseEntity<Nutricao> buscarRacao(@PathVariable Long id) {
        return ResponseEntity.ok(nutricaoService.findById(id));
    }

    @GetMapping("/buscar/racao")
    public ResponseEntity<List<Nutricao>> listarRacao() {
        return ResponseEntity.ok(nutricaoService.listAll());
    }
    
}
