package com.gado.gerenciamento.dominio.model.enums.animal;

public enum Sexo {
  FEMEA('F'),
  MACHO('M');
  
  private final char value;
  
  Sexo(char value) {
    this.value = value;
  }
  
  public char getValue() {
    return value;
  }
  
  public static Sexo fromValue(char value) {
    for (Sexo sexo : values()) {
      if (sexo.getValue() == value) {
        return sexo;
      }
    }
    throw new IllegalArgumentException("O sexo inserido é inválido.");
  }
}
