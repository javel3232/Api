package com.example.demoapi.service;

import com.example.demoapi.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    Iterable<User> findAll();

    Page<User> findAll(Pageable pageable);

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
