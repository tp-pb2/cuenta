package ar.edu.unlam.pb2;

public class Cuenta {

	protected Double saldo=0.0;
	
	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double cantidad){
		if(cantidad>0){
			saldo+=cantidad;
		}
	}
	
	public void extraer(Double cantidad){
		if(saldo>cantidad){
			saldo-=cantidad;
		}
	}
	
}