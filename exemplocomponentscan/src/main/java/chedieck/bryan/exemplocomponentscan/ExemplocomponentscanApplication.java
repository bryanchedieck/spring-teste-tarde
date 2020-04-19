package chedieck.bryan.exemplocomponentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Bryan Chedieck Pires
 * @version 1.0
 * @since 16/04/2020
 */
@SpringBootApplication
@ComponentScan("externalclasses")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO01 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO01);
		System.out.println("Objeto JDBC: " + objectDAO01.getObjectJDBC());

	}

}
