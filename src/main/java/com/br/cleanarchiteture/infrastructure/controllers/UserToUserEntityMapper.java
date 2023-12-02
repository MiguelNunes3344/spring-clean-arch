package com.br.cleanarchiteture.infrastructure.controllers;

import com.br.cleanarchiteture.core.domain.User;
import com.br.cleanarchiteture.infrastructure.persistence.UserEntity;

public class UserToUserEntityMapper {

	
	public UserEntity toUserEntity(User user) {
		return new UserEntity(user.getUsername(),user.getPassword(),user.getEmail());
	}
}
