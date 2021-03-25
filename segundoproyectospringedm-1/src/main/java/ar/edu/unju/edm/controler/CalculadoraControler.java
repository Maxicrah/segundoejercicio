package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraControler {
	
	public void resolverSuma() {
	
	int a=10;
	int b=20;
	
	Calculadora nuevaCalculadora=new Calculadora();
	
	nuevaCalculadora.setA(b);
	nuevaCalculadora.setB(b);
	System.out.println("el resultado de la suma es : " + nuevaCalculadora.sumarDosNumeros() );
	}

}