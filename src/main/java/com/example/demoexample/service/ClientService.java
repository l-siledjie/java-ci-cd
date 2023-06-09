package com.example.demoexample.service;

import com.example.demoexample.entity.Client;
import com.example.demoexample.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void ajouterClient(){
        clientRepository.save(new Client(null, "Djoum", "Killer", "Adobe"));
    }
}
