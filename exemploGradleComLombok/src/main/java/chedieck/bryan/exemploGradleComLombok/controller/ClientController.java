package chedieck.bryan.exemploGradleComLombok.controller;

import chedieck.bryan.exemploGradleComLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/clientes")
    public Client getClient() {

        Client client = new Client();
        client.setName("Bryan");
        client.setLastName("Chedieck");
        client.setEmail("bryanchedieck@gmail.com.br");

        return client;
    }

    @GetMapping("/listclientes")
    public ArrayList<Client> getListClient() {

        Client client1 = new Client();
        client1.setName("Romario");
        client1.setLastName("Souza");
        client1.setEmail("romariosouza@gmail.com.br");

        Client client2 = new Client();
        client2.setName("Carlos");
        client2.setLastName("Gomes");
        client2.setEmail("carlosgomes@gmail.com.br");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
