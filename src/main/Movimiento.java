package main;

public class Movimiento {
	public enum Signo { D, H }
	public double importe;
	public Signo signo;
	public String detalle;
	
	public Movimiento(double importe, Signo signo,String detalle) {
		this.importe = importe;
		this.signo = signo;
		this.detalle = detalle;
	}
}