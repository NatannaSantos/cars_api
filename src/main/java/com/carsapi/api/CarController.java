package com.carsapi.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @PostMapping

    public void createCar(@RequestBody CarDTO req){
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.dataFabricacao());
        System.out.println(req.valor());
        System.out.println(req.anoModelo());       
    }
}