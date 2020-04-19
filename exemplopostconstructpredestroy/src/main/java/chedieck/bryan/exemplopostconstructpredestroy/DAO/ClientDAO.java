package chedieck.bryan.exemplopostconstructpredestroy.DAO;

import chedieck.bryan.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstructor() { System.out.printf("objeto criado"); }

    @PreDestroy
    public void preDestroy() { System.out.println("objeto finalizado"); }

    }

