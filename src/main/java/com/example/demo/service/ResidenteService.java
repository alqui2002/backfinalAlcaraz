package com.example.demo.service;



import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Residente;

@Service

public interface ResidenteService {
    Page<Residente> getResidentes(PageRequest pageRequest);

    Residente newResidente(String nombre, String apellido, String dni, String direccionEdificio, int departamento);

}
