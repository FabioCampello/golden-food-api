package com.golden.food.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.golden.food.api.notificador.Notificador;
import com.golden.food.api.service.AtivacaoClienteService;

@Component
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
