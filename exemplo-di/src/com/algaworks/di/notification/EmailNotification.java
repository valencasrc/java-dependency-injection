package com.algaworks.di.notification;

import com.algaworks.di.modelo.Client;

public class EmailNotification implements Notifier{

    //Método feito para notificar o cliente
    @Override
    public void notify(Client client, String message) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                client.getName(), client.getEmail(), message);
    }



}
