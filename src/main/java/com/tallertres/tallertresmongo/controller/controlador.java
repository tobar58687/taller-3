package com.tallertres.tallertresmongo.controller;

import antlr.collections.List;
import dto.repositoriointerface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.dto.orden;
import java.util.List;

@RestController
@RequestMapping("Prueba")
public class controlador {
    @Autowired
    repositoriointerface repositorio;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<orden> Obtener(){
        return repositorio.findAll() ;
    }
}
