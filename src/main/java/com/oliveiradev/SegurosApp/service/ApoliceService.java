package com.oliveiradev.SegurosApp.service;

import com.oliveiradev.SegurosApp.model.Apolice;
import org.springframework.stereotype.Service;
import repository.ApoliceRepository;

import java.util.List;

@Service
public class ApoliceService {

    private final ApoliceRepository repository;

    public ApoliceService(ApoliceRepository repository) {
        this.repository = repository;
    }

    public List<Apolice> listar() {
        return repository.findAll();
    }

    public Apolice salvar(Apolice apolice) {
        return repository.save(apolice);
    }
}