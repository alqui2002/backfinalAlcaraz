package com.example.demo.service;


import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Edificio;

@Service

public interface EdificioService {
    Page<Edificio> getEdificios(PageRequest pageRequest);

    Edificio newEdificio(String direccion);

}
