package com.javi.springboot.di.app.springbootdi.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.javi.springboot.di.app.springbootdi.springbootdi.models.Product;
import com.javi.springboot.di.app.springbootdi.springbootdi.repositories.ProductRepositoryImpl;

public class ProductServicesImpl  implements  ProductService{

    private ProductRepositoryImpl repository = new ProductRepositoryImpl();

    public List<Product> findAll(){
        
        return repository.findAll().stream().map(p-> {
            Double priceImp = p.getPrice()*1.25d;
            // Product newProd = new Product(p.getId(),p.getName(),priceImp.longValue());
            Product newProd =(Product) p.clone();
            newProd.setPrice(priceImp.longValue());;
            return newProd ;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return repository.findById(id);
    }


}
