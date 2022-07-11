package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Getter para todos os atributos
@Setter //Setter para todos os atributos
@NoArgsConstructor // Cria um constructor sem argumentos
@AllArgsConstructor // Cria um constructor com todos os argumentos
public class Veiculo {
    private String placa;
    private String Modelo;
    private double valor;
}
