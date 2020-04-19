package chedieck.bryan.exemploescopo;

import chedieck.bryan.exemploescopo.dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassDAO objectDAO01 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO02 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO01);
		System.out.println("Objeto JDBC: " + objectDAO01.getObjectJDBC());

		System.out.println("Objeto DAO: " + objectDAO02);
		System.out.println("Objeto JDBC: " + objectDAO02.getObjectJDBC());

	}
}


