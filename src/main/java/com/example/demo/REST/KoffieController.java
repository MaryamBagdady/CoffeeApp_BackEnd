package com.example.demo.REST;

import com.example.demo.Logica.KoffieService;
import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Koffie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class KoffieController {
    @Autowired
    private KoffieService koffieService;

    @GetMapping(value = "alleKoffie")
    public List<Koffie> AllKoffie() {
        return koffieService.GetAllCoffee();
    }
}
