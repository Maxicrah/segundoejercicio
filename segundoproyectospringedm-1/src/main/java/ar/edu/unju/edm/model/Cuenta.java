package ar.edu.unju.edm.model;

public class Cuenta {
	
	private int cuenta;
	private int dni;
	private double saldo;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	 

	public Cuenta(int cuenta, int dni, double saldo) {
		super();
		this.cuenta = cuenta;
		this.dni = dni;
		this.saldo = saldo;
	}

	
	public void extraer(double monto);{
		
		
	}

	public void depositar(double monto);{
		
		saldo = saldo + monto; 
	}
	
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 

}
