package com.gado.gerenciamento.dominio.converters;

import com.gado.gerenciamento.controller.nutricao.dto.NutricaoDto;
import com.gado.gerenciamento.dominio.model.Nutricao;
import org.springframework.context.annotation.Bean;


public class NutricaoConverter {
  
  public static Nutricao fromDtoToEntity(NutricaoDto data) {
    Nutricao nutricao = new Nutricao();

    nutricao.setProduto(data.produto());
    nutricao.setMedida(data.medida());
    nutricao.setPeso(data.peso());
    nutricao.setPreco(data.preco());
    
    return nutricao;
  }
}
