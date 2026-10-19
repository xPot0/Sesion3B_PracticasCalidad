package main;

import java.util.ArrayList;
import java.util.List;

import main.Movimiento.Signo;

public class Cuenta {
	String mNumero; 
    String nTitular; 
    double saldo;
    List <Movimiento> mMovimientos;
    
	public Cuenta(String mNumero, String nTitular){
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		saldo = 0;
		mMovimientos = new ArrayList<>();
	}
	
	public void ingresar(double x) {
		saldo += x;
		Signo signo = Signo.H;
		Movimiento m = new Movimiento(x,signo,"Ingreso");
		mMovimientos.add(m);
	}
	
	public void retirar(double x) {
		if(saldo - x < -500) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo -= x;
			Signo signo = Signo.D;
			Movimiento m = new Movimiento(x,signo,"Retirada");
			mMovimientos.add(m);
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return nTitular;
	}

	public String getNumero() {
		return mNumero;
	}
	
}