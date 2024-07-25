package com.algaworks.di.notification;

import com.algaworks.di.modelo.Client;

public class NotifierSMS {

    public void notify(Client client, String message){
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
        client.getName(), client.getPhone(), message);
    }

}
