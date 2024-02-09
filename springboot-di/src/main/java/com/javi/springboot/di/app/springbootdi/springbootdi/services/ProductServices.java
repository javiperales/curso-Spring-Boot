package com.javi.springboot.di.app.springbootdi.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;
import com.javi.springboot.di.app.springbootdi.springbootdi.repositories.ProductRepository;

public class ProductServices {

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll(){
        
        return repository.findAll().stream().map(p-> {
            Double priceImp = p.getPrice()*1.25d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return repository.findById(id);
    }


}
