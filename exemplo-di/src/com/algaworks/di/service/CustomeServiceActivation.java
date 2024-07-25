package com.algaworks.di.service;

import com.algaworks.di.modelo.Client;
import com.algaworks.di.notification.EmailNotification;
import com.algaworks.di.notification.Notifier;
import com.algaworks.di.notification.NotifierSMS;

public class CustomeServiceActivation {

    private Notifier notifier;

    public CustomeServiceActivation(Notifier notifier){
        this.notifier = notifier;
    }

    //Método para notificar o cliente do cadastro ativado
    public void active(Client client) {
        client.active();
        this.notifier.notify(client, "Seu cadastro está ativado!");


    }


}