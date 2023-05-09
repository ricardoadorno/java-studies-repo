package com.project.restmysql.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.restmysql.models.User;
import com.project.restmysql.models.UserRepository;

@RestController
public class UserController {

  private final UserRepository repository;

  UserController(UserRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/users")
  Iterable<User> all() {
    return repository.findAll();
  }

  @PostMapping("/users")
  User newEmployee(@RequestBody User newEmployee) {
    return repository.save(newEmployee);
  }

}
