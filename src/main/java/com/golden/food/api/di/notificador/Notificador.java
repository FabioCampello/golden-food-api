package com.golden.food.api.di.notificador;

import com.golden.food.api.di.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
