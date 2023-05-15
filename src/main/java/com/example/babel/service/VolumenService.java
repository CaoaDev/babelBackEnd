package com.example.babel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.babel.entity.Volumen;
import com.example.babel.repository.VolumenRepository;

@Service
public class VolumenService {

    @Autowired
    private VolumenRepository volumenRepository;

    public Volumen saveVolumen(Volumen volumen) {
        return volumenRepository.save(volumen);
    }

    public List<Volumen> getAllVolumenes() {
        return volumenRepository.findAll();
    }

    public Volumen getVolumenById(Integer id) {
        return volumenRepository.findById(id).orElse(null);
    }

    public Volumen updateVolumen(Volumen volumen) {
        return volumenRepository.save(volumen);
    }

    public void deleteVolumenById(Integer id) {
        volumenRepository.deleteById(id);
    }

    public void deleteAllVolumenes() {
        volumenRepository.deleteAll();
    }

}