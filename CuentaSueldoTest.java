package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {
	@Test
	public void DepositarEnCuentaSueldo(){
		CuentaSueldo nuevaCuenta = new CuentaSueldo();
		nuevaCuenta.depositar(500.0);
		Double valorEsperado = 500.0;
		Double valorObtenido = nuevaCuenta.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	
		
	}
	
	@Test
	public void ExtraerEnCuenta(){
		CuentaSueldo nuevaCuenta = new CuentaSueldo();
		nuevaCuenta.depositar(10.0);
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = 0.0;
		Double valorObtenido = nuevaCuenta.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	
		
	}
}
