package com.golden.food.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.golden.food.api.notificador.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.goldenfood.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}

}
