package com.springreact.springreact.dao;

import com.springreact.springreact.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
