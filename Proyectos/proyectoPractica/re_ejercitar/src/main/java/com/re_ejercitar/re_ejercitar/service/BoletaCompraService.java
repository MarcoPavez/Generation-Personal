package com.re_ejercitar.re_ejercitar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.re_ejercitar.re_ejercitar.model.BoletaCompra;
import com.re_ejercitar.re_ejercitar.repository.BoletaCompraRepository;

@Service
@Transactional
public class BoletaCompraService {
    
    private BoletaCompraRepository boletaCompraRepository;

    public BoletaCompraService(BoletaCompraRepository boletaCompraRepository){
        this.boletaCompraRepository = boletaCompraRepository;
    }

    public void saveBoletaCompra(BoletaCompra boletaCompra){
        boletaCompraRepository.save(boletaCompra);
    }

    public void updateBoletaCompra(BoletaCompra boletaCompra){
        boletaCompraRepository.save(boletaCompra);
    }

    public List<BoletaCompra> findAllBoletaCompra(){
        return boletaCompraRepository.findAll();
    }

    public List<BoletaCompra> findBoletaCompra(Integer id){
        return boletaCompraRepository.findBoleta(id);
    }

    public List<BoletaCompra> findBoletaRangoMenor(int precioCompra){
        return boletaCompraRepository.findBoletaMenorQue(precioCompra);
    }

    public List<BoletaCompra> findBoletaRangoMayor(int precioCompra){
        return boletaCompraRepository.findBoletaMayorQue(precioCompra);
    }

    public void eliminarBoletaCompra(Integer id){
        boletaCompraRepository.deleteById(id);
    }
}
