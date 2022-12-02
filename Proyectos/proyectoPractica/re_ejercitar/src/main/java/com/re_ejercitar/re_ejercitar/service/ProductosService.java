package com.re_ejercitar.re_ejercitar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.re_ejercitar.re_ejercitar.model.Productos;
import com.re_ejercitar.re_ejercitar.repository.ProductosRepository;

@Service
@Transactional
public class ProductosService {
    
    private ProductosRepository productosRepository;

    public ProductosService(ProductosRepository productosRepository){
        this.productosRepository = productosRepository;
    }

    public void saveProducto(Productos productos){
        productosRepository.save(productos);
    }

    public void updateProductos(Productos productos){
        productosRepository.save(productos);
    }

    public List<Productos> findAllProductos(){
        return productosRepository.findAll();
    }

    public List<Productos> findProductos(Integer id){
        return productosRepository.findProducto(id);
    }

    public List<Productos> findNombreProducto(String nombreProducto){
        return productosRepository.findProductoPorNombre(nombreProducto);
    }

    public List<Productos> findPrecio(int precioProducto){
        return productosRepository.findProductosPorPrecio(precioProducto);
    }

    public List<Productos> findPrecioMayor(int precioProducto){
        return productosRepository.findProductosPorPrecioMayor(precioProducto);
    }

    public List<Productos> findPrecioMenor(int precioProducto){
        return productosRepository.findProductosPorPrecioMenor(precioProducto);
    }

    public List<Productos> findStock(int stock){
        return productosRepository.findProductosPorStock(stock);
    }

    public List<Productos> findStockMayor(int stock){
        return productosRepository.findProductosPorStockMayor(stock);
    }

    public List<Productos> findStockMenor(int stock){
        return productosRepository.findProductosPorStockMenor(stock);
    }

}
