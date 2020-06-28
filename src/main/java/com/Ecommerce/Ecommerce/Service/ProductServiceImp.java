package com.Ecommerce.Ecommerce.Service;

import com.Ecommerce.Ecommerce.Dao.ProductsRepository;
import com.Ecommerce.Ecommerce.Entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImp implements ProductService{


    private ProductsRepository productsRepository;

@Autowired
    public ProductServiceImp(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ProductServiceImp(){}
    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Products findById(int theId) {
        Optional<Products> result = productsRepository.findById(theId);

        Products products = null;

        if (result.isPresent()) {
            products = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return products;
    }

    @Override
    public void save(Products theProducts) {
        productsRepository.save(theProducts);
    }

    @Override
    public void deleteById(int theId) {
productsRepository.deleteById(theId);
  }

    @Override
    public List<Products> findByRating(int theId) {
        return productsRepository.findByRating(theId);
    }

    @Override
    public List<Products> findByPricing(int theId) {
        return productsRepository.findByPricing(theId);
    }
}
