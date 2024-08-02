package com.iobit.comercio_vizinho_ddd_2.repositories;

import com.iobit.comercio_vizinho_ddd_2.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
