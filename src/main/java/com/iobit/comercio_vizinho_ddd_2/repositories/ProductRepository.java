package com.iobit.comercio_vizinho_ddd_2.repositories;

import com.iobit.comercio_vizinho_ddd_2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
