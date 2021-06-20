package com.springreact.springreact.service;

import com.springreact.springreact.entities.Client;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
public interface ClientServices {

    List<Client> getClients();
    Client getClient(Long id);
    Client addClient(Client client);
    void deleteClient(Long id);
    Client updateClient(Client client);
}
