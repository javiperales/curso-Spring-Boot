package com.javi.springboot.di.app.springbootdi.springbootdi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;
import com.javi.springboot.di.app.springbootdi.springbootdi.services.ProductServicesImpl;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductServicesImpl service = new ProductServicesImpl();

    @GetMapping
    public List<Product> list(){
      
        return service.findAll();
        
    }


    @GetMapping("{id}")
        public Product show(@PathVariable Long id){
           
            return service.findById(id);
        }
}


