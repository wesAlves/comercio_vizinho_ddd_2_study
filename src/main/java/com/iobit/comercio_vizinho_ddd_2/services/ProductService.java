package com.iobit.comercio_vizinho_ddd_2.services;

import com.iobit.comercio_vizinho_ddd_2.entities.Product;
import com.iobit.comercio_vizinho_ddd_2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
