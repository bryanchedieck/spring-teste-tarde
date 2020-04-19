package chedieck.bryan.exemploGradle;

import chedieck.bryan.exemploGradle.model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploGradleApplication.class, args);
		System.out.println("OI");

		Aluno aluno = new Aluno();

		aluno.setNome("Bryan");
		aluno.setNota(10);
		aluno.setNota1(9);
		aluno.setNota2(8);

		System.out.println(aluno);

	}

}
