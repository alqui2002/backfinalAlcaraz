package com.example.demo.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Edificio;
import com.example.demo.repository.EdificioRepository;

import jakarta.transaction.Transactional;

@Service
public class EdificioServiceImpl implements EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;


    
    @Override
    public Page<Edificio> getEdificios(PageRequest pageable) {
        return edificioRepository.findAll(pageable);
    }

    
    @Transactional(rollbackOn = Throwable.class)
    @Override
    public Edificio newEdificio(String direccion) {
        Edificio newEdificio = new Edificio(direccion);
        return edificioRepository.save(newEdificio);
        }
    }

   

