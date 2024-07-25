package com.algaworks.di.notification;

import com.algaworks.di.modelo.Client;

public interface Notifier {

    void notify(Client client, String message);

}
