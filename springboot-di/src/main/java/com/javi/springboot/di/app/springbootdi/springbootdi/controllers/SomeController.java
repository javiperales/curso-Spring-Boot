package com.javi.springboot.di.app.springbootdi.springbootdi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;
import com.javi.springboot.di.app.springbootdi.springbootdi.services.ProductServices;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductServices service = new ProductServices();

    @GetMapping
    public List<Product> list(){
        return service.findAll();
        
    }

    @GetMapping("/manolo")
    public String manolo(){
        return "mariquita";
        
    }

    @GetMapping("{id}")
        public Product show(@PathVariable Long id){
            return service.findById(id);
        }
}


