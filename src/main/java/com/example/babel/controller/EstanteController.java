package com.example.babel.controller;

import com.example.babel.entity.Estante;
import com.example.babel.service.EstanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estantes")
public class EstanteController {

    @Autowired
    private EstanteService estanteService;

    @PostMapping
    public ResponseEntity<Estante> saveEstante(@RequestBody Estante estante) {
        Estante newEstante = estanteService.saveEstante(estante);
        return new ResponseEntity<>(newEstante, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Estante>> getAllEstantes() {
        List<Estante> estantes = estanteService.getAllEstantes();
        return new ResponseEntity<>(estantes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estante> getEstanteById(@PathVariable Integer id) {
        Estante estante = estanteService.getEstanteById(id);
        if (estante == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(estante, HttpStatus.OK);
        }
    }

    @PutMapping
    public ResponseEntity<Estante> updateEstante(@RequestBody Estante estante) {
        Estante updatedEstante = estanteService.updateEstante(estante);
        return new ResponseEntity<>(updatedEstante, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstanteById(@PathVariable Integer id) {
        estanteService.deleteEstanteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllEstantes() {
        estanteService.deleteAllEstantes();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}