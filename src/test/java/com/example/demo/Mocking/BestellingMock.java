package com.example.demo.Mocking;

import com.example.demo.Data.BestellingRepository;
import com.example.demo.Data.GebruikerRepository;
import com.example.demo.Logica.BestellingService;
import com.example.demo.Logica.GebruikerService;
import com.example.demo.Logica.Models.Bestelling;
import com.example.demo.Logica.Models.Gebruiker;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@DataJpaTest
public class BestellingMock {
    @Mock
    private BestellingRepository bestellingRepository;

    @InjectMocks
    private BestellingService bestellingService;

    @Before
    public void Setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void MockBestelling() {
        Bestelling bestelling = new Bestelling();
        bestellingService.MaakKoffieBestelling(bestelling);
        verify(bestellingRepository, times(1)).save(bestelling);
    }
}
