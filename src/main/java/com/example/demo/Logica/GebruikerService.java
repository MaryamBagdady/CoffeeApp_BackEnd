package com.example.demo.Logica;

import com.example.demo.Data.GebruikerRepository;
import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Gebruiker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GebruikerService {
    @Autowired
    private GebruikerRepository gebruikerRepository;

    public void Register(Gebruiker gebruiker){ gebruikerRepository.save(gebruiker); }
}
