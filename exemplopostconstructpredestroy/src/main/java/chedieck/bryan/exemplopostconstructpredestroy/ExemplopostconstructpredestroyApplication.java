package chedieck.bryan.exemplopostconstructpredestroy;

import chedieck.bryan.exemplopostconstructpredestroy.DAO.ClientDAO;
import chedieck.bryan.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Bryan Chedieck"));

		System.out.println("objeto ClientDAO: " + clientDAO);
		System.out.println("objeto cliente: " + clientDAO.getClient());
	}
}


