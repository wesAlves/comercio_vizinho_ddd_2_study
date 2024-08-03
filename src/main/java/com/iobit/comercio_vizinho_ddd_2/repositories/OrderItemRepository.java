package com.iobit.comercio_vizinho_ddd_2.repositories;


import com.iobit.comercio_vizinho_ddd_2.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
