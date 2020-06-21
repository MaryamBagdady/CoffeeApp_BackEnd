package com.example.demo.Logica;

import com.example.demo.Data.KoffieRepository;
import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Koffie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KoffieService {
    @Autowired
    private KoffieRepository koffieRepository;

    public List<Koffie> GetAllCoffee(){ return koffieRepository.findAll(); }

}
