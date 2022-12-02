package com.re_ejercitar.re_ejercitar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.re_ejercitar.re_ejercitar.model.BoletaCompra;

public interface BoletaCompraRepository extends JpaRepository <BoletaCompra,Integer>{
    
    @Query(value="SELECT * FROM boletacompra bc WHERE id = ?1",nativeQuery = true)
    List<BoletaCompra> findBoleta(Integer id);

    @Query(value="SELECT * FROM boletacompra bc WHERE precioCompra<?1",nativeQuery = true)
    List<BoletaCompra> findBoletaMenorQue(int precioCompra);

    @Query(value="SELECT * FROM boletacompra bc WHERE precioCompra>?1",nativeQuery = true)
    List<BoletaCompra> findBoletaMayorQue(int precioCompra);

}
