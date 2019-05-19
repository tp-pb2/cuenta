package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CajaAhorroTest {
	
	@Test
	public void DepositarEnCajaAhorro(){
		CajaDeAhorro nuevaCuenta = new CajaDeAhorro();
		nuevaCuenta.depositar(100.0);
		Double valorEsperado = 100.0;
		assertEquals(valorEsperado, nuevaCuenta.getSaldo());
	
		
	}
	
	@Test
	public void ExtraerEnCajaAhorro(){
		CajaDeAhorro nuevaCuenta = new CajaDeAhorro();
		nuevaCuenta.depositar(100.0);
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = 0.0;
		Double valorObtenido = nuevaCuenta.getSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	
		
	}
	
	@Test
	public void Extraer5EnCajaAhorro(){
		CajaDeAhorro nuevaCuenta = new CajaDeAhorro();
		nuevaCuenta.depositar(1000.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		nuevaCuenta.extraer(100.0);
		Double valorEsperado = 494.0;
		Double valorObtenido = nuevaCuenta.getSaldo();
		assertEquals(valorEsperado, valorObtenido);
		
	}
}