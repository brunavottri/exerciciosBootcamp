package com.example.demo.controller;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired //injeção de dependencia por atributo
    private VeiculoRepo repo;

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa) {
        Veiculo v = repo.getVeiculo(placa);
        if(v != null) {
            return ResponseEntity.ok(v);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Veiculo>> getAllVeiculo() {
        List<Veiculo> lista = repo.getAllVeiculo();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public void saveVeiculo(@RequestBody Veiculo novoVeiculo) {
        repo.saveVeiculo(novoVeiculo);
    }
}
