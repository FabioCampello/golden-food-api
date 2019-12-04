package com.golden.food.api.di.service;

import com.golden.food.api.di.Cliente;

public class NotificadorEmail {
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
