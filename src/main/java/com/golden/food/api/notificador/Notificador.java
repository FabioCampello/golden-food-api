package com.golden.food.api.notificador;

import com.golden.food.api.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}