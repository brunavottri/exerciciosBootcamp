package com.example.demo.repository;

import com.example.demo.model.Veiculo;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepo {
    private final String linkFile = "src/main/resources/dados.json";

    public Veiculo getVeiculo(String placa) {
        List<Veiculo> lista = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            lista = Arrays.asList
                    (mapper.readValue(new File(linkFile), Veiculo[].class));
            for(Veiculo v: lista){
                if(v.getPlaca().equals(placa)){
                    return v;
                }
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public List<Veiculo> getAllVeiculo() {
        List<Veiculo> lista = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
             lista = Arrays.asList
                    (mapper.readValue(new File(linkFile), Veiculo[].class));
        } catch (Exception ex) {

        }
        return lista;
    }

    public void saveVeiculo(Veiculo novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Veiculo> listaAtual = null;

        try {
            listaAtual = Arrays.asList
                    (mapper.readValue(new File(linkFile), Veiculo[].class));
            List<Veiculo> listaCopia = new ArrayList<>(listaAtual);
            listaCopia.add(novoVeiculo);
            writer.writeValue(new File(linkFile), listaCopia);
        } catch (Exception ex) {

        }
    }
}
