package com.algaworks.di;

import com.algaworks.di.modelo.Client;
import com.algaworks.di.notification.EmailNotification;
import com.algaworks.di.notification.Notifier;
import com.algaworks.di.service.CustomeServiceActivation;

public class Main {

    public static void main(String[] args) {
        Client lucas = new Client("Lucas", "Lucas@example.com", "81988362471");
        Client louyse = new Client("Louyse", "louyse@xyz.com", "8199941998");

        Notifier notifier = new EmailNotification();

        CustomeServiceActivation clientActivation = new CustomeServiceActivation(notifier);
        clientActivation.active(lucas);
        clientActivation.active(louyse);
    }


}