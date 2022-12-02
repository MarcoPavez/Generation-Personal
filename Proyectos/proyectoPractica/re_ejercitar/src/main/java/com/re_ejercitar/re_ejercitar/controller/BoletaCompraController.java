package com.re_ejercitar.re_ejercitar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.re_ejercitar.re_ejercitar.model.BoletaCompra;
import com.re_ejercitar.re_ejercitar.service.BoletaCompraService;

@RestController
@CrossOrigin("*")
public class BoletaCompraController {
    
    private BoletaCompraService boletaCompraService;

    public BoletaCompraController(@Autowired BoletaCompraService boletaCompraService){
        this.boletaCompraService = boletaCompraService;
    }

    @PostMapping("/BoletaCompra/save")
    public void guardarBoletaCompra(@RequestBody BoletaCompra boletaCompra){
        boletaCompraService.saveBoletaCompra(boletaCompra);
    }

    @PutMapping("/BoletaCompra/update")
    public void actualizarBoletaCompra(@RequestBody BoletaCompra boletaCompra){
        boletaCompraService.updateBoletaCompra(boletaCompra);
    }

    @GetMapping("/BoletaCompra/findAll")
    public List<BoletaCompra> todasBoletasCompras(){
        return boletaCompraService.findAllBoletaCompra();
    }

    @GetMapping("/BoletaCompra/findBoleta/{id}")
    public List<BoletaCompra> unaBoletaCompras(@PathVariable Integer id){
        return boletaCompraService.findBoletaCompra(id);
    }

    @GetMapping("/BoletaCompra/findBoletaMayorQue/{precioCompra}")
    public List<BoletaCompra> boletaCompraMayorQue(@PathVariable int precioCompra){
        return boletaCompraService.findBoletaRangoMayor(precioCompra);
    }

    @GetMapping("/BoletaCompra/findBoletaMenorQue/{precioCompra}")
    public List<BoletaCompra> boletaCompraMenorQue(@PathVariable int precioCompra){
        return boletaCompraService.findBoletaRangoMenor(precioCompra);
    }

    @DeleteMapping("BoletaCompra/eliminarBoletaCompra/{id}")
    public void eliminarBoletaCompra(@PathVariable Integer id){
        boletaCompraService.eliminarBoletaCompra(id);
    }
}
