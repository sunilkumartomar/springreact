package com.springreact.springreact.service;

import com.springreact.springreact.dao.ClientRepository;
import com.springreact.springreact.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientServices {

    List<Client> list = new ArrayList<Client>();
    @Autowired
    private ClientRepository clientRepository;

    public ClientServiceImpl() {
        list.add(new Client(10L, "sunil", "suniltomar142"));
        list.add(new Client(11L, "vishnu", "suniltomar142"));
        list.add(new Client(12L, "yogendra", "suniltomar142"));
        list.add(new Client(15L, "kaushal", "suniltomar142"));
    }

    @Override
    public List<Client> getClients() {

        return clientRepository.findAll();
    }

    @Override
    public Client getClient(Long id) {
   /*
        Client c = null;
        for (Client client : list) {
            if (client.getId() == id)
                c = client;
        }
        Client client=clientRepository.getById(id);
    */
       // Optional<Client> client = clientRepository.findById(id);
      //  Client client2 = clientRepository.getById(id);
        Client currentClient = clientRepository.findById(id).orElseThrow(RuntimeException::new);
        return currentClient;
    }

    @Override
    public Client addClient(Client client) {
        //list.add(client);
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        //list = this.list.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
        System.out.println("going to delete");
//        Optional<Client> deleteClient=clientRepository.findById(id);
        Client client = clientRepository.getById(id);
        clientRepository.delete(client);
    }

    @Override
    public Client updateClient(Client client) {
      /*  list.forEach(element -> {
            if (element.getId() == client.getId()) {
                element.setName(client.getName());
                element.setEmail(client.getEmail());
            }
        });*/
        return clientRepository.save(client);
    }
}
