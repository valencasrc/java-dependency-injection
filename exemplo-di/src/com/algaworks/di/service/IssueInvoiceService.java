package com.algaworks.di.service;

import com.algaworks.di.modelo.Client;
import com.algaworks.di.modelo.Product;
import com.algaworks.di.notification.EmailNotification;
import com.algaworks.di.notification.Notifier;
import com.algaworks.di.notification.NotifierSMS;

public class IssueInvoiceService {

    private Notifier notifier;

    public IssueInvoiceService(Notifier notifier){
        this.notifier = notifier;
    }

    public void issue(Client client, Product product) {

        // TODO emite a nota fiscal aqui...

        NotifierSMS notification = new NotifierSMS();
        notification.notify(client, "Nota fiscal do produto" + product.getName() + "foi emitida!");



    }


}