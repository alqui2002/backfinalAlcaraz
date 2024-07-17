package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Reserva;
import com.example.demo.repository.ReservaRepository;

import jakarta.transaction.Transactional;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public Page<Reserva> getReservas(PageRequest pageable) {
        return reservaRepository.findAll(pageable);
    }

    
    @Transactional(rollbackOn = Throwable.class)
    @Override
    public Reserva newReserva(String nombre, String apellido, String dni, String direccionEdificio, int departamento) {
        Reserva newResidente = new Reserva(nombre,apellido, dni,direccionEdificio,departamento);
        return reservaRepository.save(newReserva);
        }
    }

   

