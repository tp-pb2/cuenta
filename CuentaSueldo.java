package ar.edu.unlam.pb2;

public class CuentaSueldo extends Cuenta{
	
	@Override
	public void extraer(Double cantidad){
		if(saldo>=cantidad){
			saldo-=cantidad;
		}
		else {
			saldo=0.0;
		}
		
	}
}
