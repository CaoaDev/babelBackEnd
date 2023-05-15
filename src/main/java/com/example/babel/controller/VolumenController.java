package com.example.babel.controller;

import com.example.babel.entity.Volumen;
import com.example.babel.service.VolumenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volumenes")
public class VolumenController {

    @Autowired
    private VolumenService volumenService;

    @PostMapping
    public ResponseEntity<Volumen> saveVolumen(@RequestBody Volumen volumen) {
        Volumen newVolumen = volumenService.saveVolumen(volumen);
        return new ResponseEntity<>(newVolumen, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Volumen>> getAllVolumenes() {
        List<Volumen> volumenes = volumenService.getAllVolumenes();
        return new ResponseEntity<>(volumenes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Volumen> getVolumenById(@PathVariable Integer id) {
        Volumen volumen = volumenService.getVolumenById(id);
        if (volumen == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(volumen, HttpStatus.OK);
        }
    }

    @PutMapping
    public ResponseEntity<Volumen> updateVolumen(@RequestBody Volumen volumen) {
        Volumen updatedVolumen = volumenService.updateVolumen(volumen);
        return new ResponseEntity<>(updatedVolumen, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVolumenById(@PathVariable Integer id) {
        volumenService.deleteVolumenById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllVolumenes() {
        volumenService.deleteAllVolumenes();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}