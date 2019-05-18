package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {
	@Test
	public void DepositarEnCuenta(){
		CuentaCorriente nuevaCuenta = new CuentaCorriente();
		nuevaCuenta.depositar(500.0);
		Double valorEsperado = 500.0;
		Double valorObtenido = nuevaCuenta.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		
	}
	
	@Test
	public void ExtraerEnCuenta(){
		CuentaCorriente nuevaCuenta = new CuentaCorriente();
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = -105.0;
		Double valorObtenido = nuevaCuenta.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
}
