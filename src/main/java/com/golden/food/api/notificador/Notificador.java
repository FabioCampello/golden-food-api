package com.golden.food.api.notificador;

import com.golden.food.api.modelo.Cliente;

public interface Notificador {

	String notificar(Cliente cliente, String mensagem);

}