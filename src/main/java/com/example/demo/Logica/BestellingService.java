package com.example.demo.Logica;

import com.example.demo.Data.BestellingRepository;
import com.example.demo.Data.GebruikerRepository;
import com.example.demo.Logica.Models.Bestelling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BestellingService {
    @Autowired
    private BestellingRepository bestellingRepository;

    public void MaakKoffieBestelling(Bestelling bestelling){ bestellingRepository.save(bestelling); }
}
