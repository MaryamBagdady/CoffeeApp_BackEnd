package com.example.demo.Logica.Models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Bestelling")
public class Bestelling {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Gebruiker_Id")
    private Gebruiker gebruiker;

    @Column(name = "Tijd_Bestelling")
    private Date tijdBestelling;

    @Column(name = "Tijd_Verloop")
    private Date tijdVerloop;

    @NotNull
    @Column(name = "Suiker_Hoeveelheid")
    private int suikerHoeveelheid;

    @NotNull
    @Column(name = "Melk_Hoeveelheid")
    private int melkHoeveelheid;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "Koffie_Bestelling",
            joinColumns = @JoinColumn(name = "Bestelling_Id"),
            inverseJoinColumns = @JoinColumn(name = "Koffie_Id"))
    private List<Koffie> koffie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public Date getTijdBestelling() {
        return tijdBestelling;
    }

    public void setTijdBestelling(Date tijdBestelling) {
        this.tijdBestelling = tijdBestelling;
    }

    public Date getTijdVerloop() {
        return tijdVerloop;
    }

    public void setTijdVerloop(Date tijdVerloop) {
        this.tijdVerloop = tijdVerloop;
    }

    public int getSuikerHoeveelheid() {
        return suikerHoeveelheid;
    }

    public void setSuikerHoeveelheid(int suikerHoeveelheid) {
        this.suikerHoeveelheid = suikerHoeveelheid;
    }

    public int getMelkHoeveelheid() {
        return melkHoeveelheid;
    }

    public void setMelkHoeveelheid(int melkHoeveelheid) {
        this.melkHoeveelheid = melkHoeveelheid;
    }

    public List<Koffie> getKoffie() {
        return koffie;
    }

    public void setKoffie(List<Koffie> koffie) {
        this.koffie = koffie;
    }
}
