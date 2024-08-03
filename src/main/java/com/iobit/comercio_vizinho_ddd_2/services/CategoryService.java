package com.iobit.comercio_vizinho_ddd_2.services;

import com.iobit.comercio_vizinho_ddd_2.entities.Category;
import com.iobit.comercio_vizinho_ddd_2.entities.User;
import com.iobit.comercio_vizinho_ddd_2.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
