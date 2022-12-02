package com.prueba_springboot.demo_springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.prueba_springboot.demo_springboot.model.CarSell;
import com.prueba_springboot.demo_springboot.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {
    
    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public void updateCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public List<CarSell> findAllCarSell(){
        return carSellRepository.findAll();
    }

    public List<CarSell> buscarMasVendidos(int cantidad){
        return carSellRepository.findMasVendidos(cantidad);
    }

    public List<CarSell> buscarMontoMasVendidos(int cantidad, int monto){
        return carSellRepository.findMontoMasVendidos(cantidad,monto);
    }

    public void eliminarCarSell(Integer id){
        carSellRepository.deleteById(id);
    }
}
