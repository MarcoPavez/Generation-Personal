package com.re_ejercitar.re_ejercitar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.re_ejercitar.re_ejercitar.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos,Integer>{
    
    @Query(value="SELECT * FROM productos p WHERE id = ?1", nativeQuery = true)
    List<Productos> findProducto(Integer id);

    @Query(value="SELECT * FROM productos p WHERE nombreProducto = ?1",nativeQuery = true)
    List<Productos> findProductoPorNombre(String nombreProducto);

    @Query(value="SELECT * FROM productos p WHERE precioProducto = ?1",nativeQuery = true)
    List<Productos> findProductosPorPrecio(int precioProducto);

    @Query(value="SELECT * FROM productos p WHERE precioProducto < ?1",nativeQuery = true)
    List<Productos> findProductosPorPrecioMenor(int precioProducto);

    @Query(value="SELECT * FROM productos p WHERE precioProducto > ?1",nativeQuery = true)
    List<Productos> findProductosPorPrecioMayor(int precioProducto);

    @Query(value="SELECT * FROM productos p WHERE stock = ?1",nativeQuery = true)
    List<Productos> findProductosPorStock(int stock);

    @Query(value="SELECT * FROM productos p WHERE stock < ?1",nativeQuery = true)
    List<Productos> findProductosPorStockMenor(int stock);

    @Query(value="SELECT * FROM productos p WHERE stock > ?1",nativeQuery = true)
    List<Productos> findProductosPorStockMayor(int stock);
}
