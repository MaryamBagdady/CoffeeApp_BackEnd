package com.example.demo.Logica.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Gebruiker")
public class Gebruiker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Naam")
    private String naam;

    @Column(name = "Gebruik_Naam")
    private String gebruikNaam;

    @Column(name = "Kantoor_Nummer")
    private String kantoorNummer;

    @Column(name = "Wachtwoord")
    private String wachtwoord;

    @Column(name = "Telefoon_Nummer")
    private int telefoonNummer;

    @OneToMany(mappedBy = "gebruiker", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bestelling> bestelling;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGebruikNaam() {
        return gebruikNaam;
    }

    public void setGebruikNaam(String gebruikNaam) {
        this.gebruikNaam = gebruikNaam;
    }

    public String getKantoorNummer() {
        return kantoorNummer;
    }

    public void setKantoorNummer(String kantoorNummer) {
        this.kantoorNummer = kantoorNummer;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public int getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(int telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public List<Bestelling> getBestelling() {
        return bestelling;
    }

    public void setBestelling(List<Bestelling> bestelling) {
        this.bestelling = bestelling;
    }
    ////Laatste Testen
}
