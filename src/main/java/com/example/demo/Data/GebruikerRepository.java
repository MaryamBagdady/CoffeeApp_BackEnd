package com.example.demo.Data;

import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Gebruiker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.UUID;

public interface GebruikerRepository extends JpaRepository<Gebruiker, Long> {

}
