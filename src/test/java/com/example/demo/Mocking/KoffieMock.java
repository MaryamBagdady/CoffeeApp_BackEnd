package com.example.demo.Mocking;

import com.example.demo.Data.GebruikerRepository;
import com.example.demo.Data.KoffieRepository;
import com.example.demo.Logica.GebruikerService;
import com.example.demo.Logica.KoffieService;
import com.example.demo.Logica.Models.Gebruiker;
import com.example.demo.Logica.Models.Koffie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;

import static org.mockito.Mockito.*;

@DataJpaTest
public class KoffieMock {
    @Mock
    private KoffieRepository koffieRepository;

    @InjectMocks
    private KoffieService koffieService;

    @Before
    public void Setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void MockAlleKoffie(){
        Koffie koffie = new Koffie();
        Koffie koffie2 = new Koffie();

        when(koffieRepository.findAll()).thenReturn(Arrays.asList(koffie, koffie2));

        Assert.assertEquals(koffieService.GetAllCoffee().size(), 2);

        verify(koffieRepository, times(1)).findAll();
    }
}
