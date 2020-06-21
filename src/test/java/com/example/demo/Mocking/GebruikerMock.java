package com.example.demo.Mocking;

import com.example.demo.Data.GebruikerRepository;
import com.example.demo.Logica.GebruikerService;
import com.example.demo.Logica.Models.Gebruiker;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.*;

@DataJpaTest
class GebruikerMock {
    @Mock
    private GebruikerRepository gebruikerRepository;

    @InjectMocks
    private GebruikerService gebruikerService;

    @Before
    public void Setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void MockRegistreer() {
        Gebruiker gebruiker = new Gebruiker();
        gebruikerService.Register(gebruiker);
        verify(gebruikerRepository, times(1)).save(gebruiker);
    }
}
