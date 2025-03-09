package cuentas;

/**
 * Clase que implementa una cuenta bancaria
 * 
 * @author Cibrán Pintos da Cunha
 * @version 1.0.0
 */

public class CCuenta {
	/**
	 * Nombre del titular de la cuenta
	 */
	private String nombre;
	/**
	 * Número identificativo de la cuenta
	 */
	private String cuenta;
	/**
	 * Saldo actual de la cuenta
	 */
	private double saldo;
	/**
	 * Tipo de interés aplicado a la cuenta
	 */
	private double tipoInterés;

	/**
	 * Constructor sin parámetros
	 */
	public CCuenta() {
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nom Nombre del titular
	 * @param cue Número de cuenta
	 * @param sal Saldo inicial
	 * 
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Getters y setters
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el estado actual de la cuenta
	 * 
	 * @return El saldo actual de la cuenta
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Permite ingresar una cantidad en la cuenta
	 * 
	 * @param cantidad Cantidad a ingresar
	 * @throws Exception Si la cantidad es negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Permite retirar una cantidad de la cuenta
	 * 
	 * @param cantidad Cantidad a retirar
	 * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
