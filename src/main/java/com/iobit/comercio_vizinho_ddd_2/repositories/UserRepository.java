package com.iobit.comercio_vizinho_ddd_2.repositories;

import com.iobit.comercio_vizinho_ddd_2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
