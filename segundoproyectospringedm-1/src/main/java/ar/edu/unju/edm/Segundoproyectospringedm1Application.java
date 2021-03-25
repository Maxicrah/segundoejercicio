package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controler.CalculadoraControler;

@SpringBootApplication
public class Segundoproyectospringedm1Application {

	public static void main(String[] args) {
		SpringApplication.run(Segundoproyectospringedm1Application.class, args);
		
		CalculadoraControler nuevoControlador = new CalculadoraControler();
		nuevoControlador.resolverSuma();
	}

}
