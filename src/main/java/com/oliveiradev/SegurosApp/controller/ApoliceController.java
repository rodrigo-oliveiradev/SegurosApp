package com.oliveiradev.SegurosApp.controller;

import com.oliveiradev.SegurosApp.model.Apolice;
import com.oliveiradev.SegurosApp.service.ApoliceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/apolices")
public class ApoliceController {

    private final ApoliceService service;

    public ApoliceController(ApoliceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Apolice> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Apolice> salvar(@RequestBody Apolice apolice) {
        return ResponseEntity.ok(service.salvar(apolice));
    }
}