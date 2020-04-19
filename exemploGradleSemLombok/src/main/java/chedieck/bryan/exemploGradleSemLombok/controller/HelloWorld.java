package chedieck.bryan.exemploGradleSemLombok.controller;

import chedieck.bryan.exemploGradleSemLombok.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String index() {
        return "BORA";
    }

    @GetMapping("/client")
    public Cliente getClient() {

        Cliente cliente = new Cliente();
        cliente.setNome("Bryan");

        return cliente;
    }

    @GetMapping("/arrayclient")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Bryan");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Chedieck");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Pires");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        return clientes;
    }

    @GetMapping("/product")
    public String getProduct() {
        return "Área do produto";
    }
}
