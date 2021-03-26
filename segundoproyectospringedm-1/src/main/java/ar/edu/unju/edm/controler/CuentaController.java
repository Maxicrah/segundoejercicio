package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaController {
	
	public void operarConCuenta() {
		Cuenta nuevoCuenta = new  Cuenta();
		
		int numCuenta = 1;
		int dni = 23142;
		int saldo = 0;
		
		Cuenta otraCuenta = new Cuenta (numCuenta, dni, saldo);
		
		System.out.println("Dni nuevaCuenta " + nuevoCuenta.getCuenta());
		
		System.out.println("valor de saldo de la cuenta " + otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(5000);
		
		System.out.println("valor del saldo " + otraCuenta.getSaldo());
		
		otraCuenta.extraer(9000);
		
		
		
		if (otraCuenta.getSaldo()<0) {
			
			System.out.println("saldo insuficiente");
			otraCuenta.depositar(9000);
		}
		
		System.out.println("Valor del saldo " + otraCuenta.getSaldo();
	}

}
