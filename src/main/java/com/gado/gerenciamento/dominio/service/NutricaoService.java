package com.gado.gerenciamento.dominio.service;

import com.gado.gerenciamento.config.exceptions.ValidationException;
import com.gado.gerenciamento.controller.nutricao.dto.NutricaoDto;
import com.gado.gerenciamento.dominio.converters.NutricaoConverter;
import com.gado.gerenciamento.dominio.model.Nutricao;
import com.gado.gerenciamento.dominio.repository.NutricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NutricaoService {
    
    @Autowired
    private NutricaoRepository nutricaoRepository;
    
    public Nutricao cadastrarRacao(NutricaoDto nutricaoDto) {
        Nutricao nutricao = NutricaoConverter.fromDtoToEntity(nutricaoDto);
        
        return nutricaoRepository.save(nutricao);
    }
    
    public Nutricao findById(Long id) {
        Optional<Nutricao> entity = nutricaoRepository.findById(id);
        
        return entity.orElseThrow(() -> new ValidationException("Nutrição de ID: [" + id + "] não foi encontrado."));
    }

    public List<Nutricao> listAll() {
        return nutricaoRepository.findAll();
    }
    
}
