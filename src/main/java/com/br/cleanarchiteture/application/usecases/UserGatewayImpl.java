package com.br.cleanarchiteture.application.usecases;

import com.br.cleanarchiteture.application.gateways.UserGateway;
import com.br.cleanarchiteture.core.domain.User;

public class UserGatewayImpl{

	private final UserGateway userGateway;
	
	public UserGatewayImpl(UserGateway userGateway) {
		this.userGateway = userGateway;
	}
	
	public void createUser(User user) {
		userGateway.createUser(user);
	}

}
