package com.example.demoexample.controller;

import com.example.demoexample.entity.Client;
import com.example.demoexample.repository.ClientRepository;
//import com.example.demo_example.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@AllArgsConstructor
public class ClientController {
    private ClientRepository clientRepository;
    @GetMapping("/indexC")
    public String showClient(Model model){
        List <Client> clients = clientRepository.findAll() ;
        model.addAttribute("ListClients", clients);
        return "clients";
    }


    @GetMapping("/delC/{id_client}")
    public String deleteClient(@PathVariable(value = "id_client") long id_client, Model model){
        clientRepository.deleteById(id_client);
        return "redirect:/indexC";
    }
}
