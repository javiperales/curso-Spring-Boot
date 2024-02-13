package com.javi.springboot.di.app.springbootdi.springbootdi.services;

import java.util.List;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);

}
