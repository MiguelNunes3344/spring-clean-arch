package com.br.cleanarchiteture.infrastructure.controllers;

import com.br.cleanarchiteture.application.gateways.UserGateway;
import com.br.cleanarchiteture.core.domain.User;
import com.br.cleanarchiteture.infrastructure.persistence.UserEntity;
import com.br.cleanarchiteture.infrastructure.persistence.UserRepository;

public class UserGatewayImpl implements UserGateway {
	
	private final UserRepository userRepository;
	private final UserToUserEntityMapper converter;
	
	public UserGatewayImpl(UserRepository userRepository, UserToUserEntityMapper converter) {
		this.userRepository = userRepository;
		this.converter = converter;
	}

	@Override
	public void createUser(User user) {
		UserEntity userEntity = converter.toUserEntity(user);
		userRepository.save(userEntity);
		
	}

}
