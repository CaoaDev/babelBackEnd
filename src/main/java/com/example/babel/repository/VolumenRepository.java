package com.example.babel.repository;

import com.example.babel.entity.Volumen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolumenRepository extends JpaRepository<Volumen, Integer> {
}