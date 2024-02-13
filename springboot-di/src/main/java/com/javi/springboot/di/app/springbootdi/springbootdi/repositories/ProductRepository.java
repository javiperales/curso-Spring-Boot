package com.javi.springboot.di.app.springbootdi.springbootdi.repositories;

import java.util.List;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);

}
