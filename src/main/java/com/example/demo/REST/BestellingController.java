package com.example.demo.REST;

import com.example.demo.Logica.BestellingService;
import com.example.demo.Logica.Models.Bestelling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BestellingController {
    @Autowired
    private BestellingService bestellingService;

    @PostMapping(value = "koffieBestelling")
    public ResponseEntity<Bestelling> KoffieBestelling(@Valid @RequestBody Bestelling bestellingDetails) {
        try{
            bestellingService.MaakKoffieBestelling(bestellingDetails);
            return new ResponseEntity<Bestelling>(HttpStatus.OK);
        } catch(Exception ex)
        {
            return new ResponseEntity<Bestelling>(HttpStatus.BAD_REQUEST);
        }
    }
}
