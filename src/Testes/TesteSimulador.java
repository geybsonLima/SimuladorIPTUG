package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculo.Simulador;

public class TesteSimulador extends Simulador {
	
		private  Simulador simulador;
		
		@Before
		
	public void setUp() throws Exception{
			this.simulador=new Simulador();
		}

		@Test

	public void TesteSimulador(){
	
	double teste1=this.simulador.calcularIPTU("1", 95450, 0);
	double valorEsperado1=572.70;
	assertEquals(valorEsperado1,teste1,1);
	
	double teste2=this.simulador.calcularIPTU("1", 417596, 0);
	double valorEsperado2=2917.20;
	assertEquals(valorEsperado2,teste2,1);
	
	double teste3=this.simulador.calcularIPTU("2", 501488, 0);
	double valorEsperado3=6865.72;
	assertEquals(valorEsperado3,teste3,1);
	
	double teste4=this.simulador.calcularIPTU("3", 445114, 0);
	double valorEsperado4=7184.18;
	assertEquals(valorEsperado4,teste4,1);
	
	double teste5=this.simulador.calcularIPTU("3", 21845344, 0);
	double valorEsperado5=644097.17;
	assertEquals(valorEsperado5,teste5,1.5);
	}
}
