package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity

public class Residente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String dni;

    @Column(nullable = false)
    private String direccionEdificio;

    @Column(nullable = false)
    private int departamento;

    public Residente() {
    }

    public Residente(String nombre, String apellido, String dni, String direccionEdificio, int departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccionEdificio = direccionEdificio;
        this.departamento = departamento;
    }

    

}
