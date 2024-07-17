package com.example.demo.controllers;


import com.example.demo.entities.Residente;
import com.example.demo.service.ResidenteService;
import com.example.demo.service.ResidenteServiceImpl;

import com.example.demo.service.ResidenteService;
import com.example.demo.service.ResidenteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/residetes")
public class ResidenteController {

    @Autowired
    private ResidenteService residenteService;

    @Autowired
    private Residente residente;

    @GetMapping
    public ResponseEntity<Page<Residente>> getResidentes(@RequestParam(defaultValue = "0") Integer page,
    												@RequestParam(defaultValue = "10") Integer size) {
        Page<Residente> residentes = residenteService.getResidentes(PageRequest.of(page, size));
        return ResponseEntity.ok().body(residentes);
    }


    @PostMapping("add-residente")
    public ResponseEntity<residente> createResidente(@RequestParam String nombre,
												@RequestParam String apellido,
												@RequestParam String direccionEdificio,
												@RequestParam String dni,
                                                @RequestParam int departamento) {
        try {
            Residente newresidente = residenteService.newResidente(nombre, apellido, direccionEdificio, dni,departamento);
            return ResponseEntity.status(HttpStatus.CREATED).body(newresidente);
        } catch (ResidenteDuplicateException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
    
}
    