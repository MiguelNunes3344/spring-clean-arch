package com.br.cleanarchiteture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.cleanarchiteture.infrastructure.controllers.UserGatewayImpl;
import com.br.cleanarchiteture.infrastructure.controllers.UserToUserEntityMapper;
import com.br.cleanarchiteture.infrastructure.persistence.UserRepository;

@Configuration
public class ConfigBeans {

	
	@Bean
	public UserGatewayImpl createUser(UserRepository userRepository,UserToUserEntityMapper userTo) { 
		return new UserGatewayImpl(userRepository,userTo);
		
	}
	@Bean
	public UserToUserEntityMapper userToEntity() {
		return new UserToUserEntityMapper();
	}

	
}
