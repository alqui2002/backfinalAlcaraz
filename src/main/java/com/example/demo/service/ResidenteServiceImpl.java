package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Residente;
import com.example.demo.repository.ResidenteRepository;

import jakarta.transaction.Transactional;

@Service
public class ResidenteServiceImpl implements ResidenteService {

    @Autowired
    private ResidenteRepository residenteRepository;

    @Override
    public Page<Residente> getResidentes(PageRequest pageable) {
        return residenteRepository.findAll(pageable);
    }

    
    @Transactional(rollbackOn = Throwable.class)
    @Override
    public Residente newResidente(String nombre, String apellido, String dni, String direccionEdificio, int departamento) {
        Residente newResidente = new Residente(nombre, apellido, dni, direccionEdificio, departamento);
        return residenteRepository.save(newResidente);
        }
    }

   

