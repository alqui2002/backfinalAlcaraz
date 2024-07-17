package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Edificio;
import com.example.demo.entities.Reserva;
import com.example.demo.entities.Residente;

@Service

public interface ReservaService {
    Page<Reserva> getReservas(PageRequest pageRequest);
    Reserva newReserva(String fecha, String turno, Residente residente, Edificio edificio);

}
