package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fecha;

    @Column(nullable = false)
    private String turno;

    @ManyToOne
    @JoinColumn(name = "residente_id")
    private Residente residente;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    public Reserva() {
    }

    public Reserva(String fecha, String turno, Residente residente, Edificio edificio) {
        this.fecha = fecha;
        this.turno = turno;
        this.residente = residente;
        this.edificio = edificio;
    }

    

}
