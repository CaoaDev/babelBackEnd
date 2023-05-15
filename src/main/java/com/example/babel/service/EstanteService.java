package com.example.babel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.babel.entity.Estante;
import com.example.babel.repository.EstanteRepository;

@Service
public class EstanteService {

    @Autowired
    private EstanteRepository estanteRepository;

    public Estante saveEstante(Estante estante) {
        return estanteRepository.save(estante);
    }

    public List<Estante> getAllEstantes() {
        return estanteRepository.findAll();
    }

    public Estante getEstanteById(Integer id) {
        return estanteRepository.findById(id).orElse(null);
    }

    public Estante updateEstante(Estante estante) {
        return estanteRepository.save(estante);
    }

    public void deleteEstanteById(Integer id) {
        estanteRepository.deleteById(id);
    }

    public void deleteAllEstantes() {
        estanteRepository.deleteAll();
    }
}