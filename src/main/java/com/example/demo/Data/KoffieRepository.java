package com.example.demo.Data;

import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Koffie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public interface KoffieRepository extends JpaRepository<Koffie, UUID> {

}

