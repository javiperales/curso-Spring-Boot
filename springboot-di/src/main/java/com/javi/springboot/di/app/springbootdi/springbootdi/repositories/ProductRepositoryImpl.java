package com.javi.springboot.di.app.springbootdi.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;

public class ProductRepositoryImpl implements ProductRepository{

   private List <Product> data;

public ProductRepositoryImpl() {
    this.data = Arrays.asList(
        new Product(1L,"Murph", 100L),
        new Product(2L,"Angie", 50L),
        new Product(3L,"Gimnasticos", 70L)
    );
}

public List<Product> findAll(){
    return data;
}
   
public Product findById(Long id){

    return data.stream().filter(p-> p.getId().equals(id)).findFirst().orElse(null);
}

}
