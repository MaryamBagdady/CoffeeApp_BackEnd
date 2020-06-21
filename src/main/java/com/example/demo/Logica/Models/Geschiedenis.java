package com.example.demo.Logica.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Geschiedenis")
public class Geschiedenis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long Id;

    @Column(name = "Tijd_Voltooiing")
    private Date TijdVoltooiing;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Bestelling_Id")
    private Bestelling Bestelling;
}
