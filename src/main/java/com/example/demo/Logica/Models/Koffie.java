package com.example.demo.Logica.Models;

import com.example.demo.Logica.Models.Enums.Soort;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Koffie")
public class Koffie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long Id;

    @Column(name = "Naam")
    private String naam;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable( name = "Koffie_Bestelling",
            joinColumns = @JoinColumn(name = "Koffie_Id"),
            inverseJoinColumns = @JoinColumn(name = "Bestelling_Id"))
    private List<Bestelling> Bestelling;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

//    public List<com.example.demo.Logica.Models.Bestelling> getBestelling() {
//        return Bestelling;
//    }

    public void setBestelling(List<com.example.demo.Logica.Models.Bestelling> bestelling) {
        Bestelling = bestelling;
    }
}
