package com.iobit.comercio_vizinho_ddd_2.resources;

import com.iobit.comercio_vizinho_ddd_2.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Jaca", "jaca@abreu.com", "999999123", "123456");
        return ResponseEntity.ok()
                             .body(u);
    }
}
