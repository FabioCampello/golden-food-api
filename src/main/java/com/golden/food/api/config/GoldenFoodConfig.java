package com.golden.food.api.config;

import org.springframework.context.annotation.Bean;

import com.golden.food.api.notificador.NotificadorEmail;
import com.golden.food.api.service.AtivacaoClienteService;

//@Configuration
public class GoldenFoodConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail   notificador = new NotificadorEmail("smtp.goldenfood.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}

}
