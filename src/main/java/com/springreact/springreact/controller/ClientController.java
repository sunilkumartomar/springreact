package com.springreact.springreact.controller;

import com.springreact.springreact.entities.Client;
import com.springreact.springreact.service.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClientController {

    @Autowired
    private ClientServices clientService;

    @GetMapping("/")
    public String home() {
        return "Welcome to world";
    }

    @GetMapping("/client")
    public List<Client> getClients() {
        return this.clientService.getClients();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") long id) {
        return this.clientService.getClient(id);
    }

    @PostMapping("/client")
    public Client addClient(@RequestBody Client client) {
        return this.clientService.addClient(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(@RequestBody Client client) {
        return this.clientService.updateClient(client);
    }

    @DeleteMapping("/client/{id}")
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable String id) {
        try {
            System.out.println(id);
            this.clientService.deleteClient(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
