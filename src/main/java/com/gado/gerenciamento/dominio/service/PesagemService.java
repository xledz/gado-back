package com.gado.gerenciamento.dominio.service;

import com.gado.gerenciamento.controller.pesagem.dto.PesagemAnimalDto;
import com.gado.gerenciamento.dominio.converters.PesagemAnimalConverter;
import com.gado.gerenciamento.dominio.model.PesagemAnimal;
import com.gado.gerenciamento.dominio.repository.PesagemAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesagemService {
    @Autowired
    private PesagemAnimalRepository pesagemAnimalRepository;

    public List<PesagemAnimal> listAllPesagemAnimais() {
        return pesagemAnimalRepository.findAll();
    }

    public PesagemAnimal savePesagemAnimal(PesagemAnimalDto data) {
        PesagemAnimal NovaPesagem = PesagemAnimalConverter.fromDtoToEntity(data);
        return pesagemAnimalRepository.save(NovaPesagem);
    }

}
