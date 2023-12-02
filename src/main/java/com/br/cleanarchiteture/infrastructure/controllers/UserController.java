package com.br.cleanarchiteture.infrastructure.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cleanarchiteture.core.domain.User;

@RestController
@RequestMapping("users")
public class UserController {
  private final UserGatewayImpl userGateway;
  

  public UserController(UserGatewayImpl userGateway) {
	  this.userGateway = userGateway;
     
  }

  @PostMapping
  public ResponseEntity<?> createUser(@RequestBody User user) {
	  userGateway.createUser(user);
    return ResponseEntity.ok(null);
  }
}