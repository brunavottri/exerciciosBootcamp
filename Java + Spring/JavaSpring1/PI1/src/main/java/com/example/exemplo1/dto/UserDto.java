package com.example.exemplo1.dto;

import com.example.exemplo1.controller.User;

public class UserDto { // Data Tranfer Object
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UserDto(User user) {
        this.nome = user.getNome();
    }
}
