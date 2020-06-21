package com.example.demo.REST;

import com.example.demo.Logica.GebruikerService;
import com.example.demo.Logica.KoffieService;
import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Gebruiker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GebruikerController {
    @Autowired
    private GebruikerService gebruikerService;

    @PostMapping(value = "registreer")
    public ResponseEntity<Gebruiker> Register(@Valid @RequestBody Gebruiker gebruikerDetails) {
        try{
            gebruikerService.Register(gebruikerDetails);
            return new ResponseEntity<Gebruiker>(HttpStatus.OK);
        } catch(Exception ex){
            return new ResponseEntity<Gebruiker>(HttpStatus.BAD_REQUEST);
        }

    }

}
