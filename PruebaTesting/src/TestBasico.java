import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBasico {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void una_nueva_calculadora_debe_iniciar_ene_ecero() {
		Calculadora calc = new Calculadora();
		assertEquals(1,calc.valor());
		
	}
	

	@Test
	public void sumardosNumerosDaCinco() {
		Calculadora calc = new Calculadora();
		assertEquals(5,calc.sumar(3, 2));
		
	}
	
/*
 * 
 * si yo al valor esperado le pongo 18 pero le paso cualquier valor por parametro que no de 18,ME VA A DAR ERROR!	
	@Test
	public void multiplicardos() {
		Calculadora calc = new Calculadora();
		assertEquals(18,calc.multiplicacion(3,9));	
	}
*/	
	
	
	
	@Test
	public void multiplicardos() {
		Calculadora calc = new Calculadora();
		assertEquals(18,calc.multiplicacion(3,6));	
	}
	
	@Test
	public void matriz() {
		
			String [] matriz1={"kilo","sandia"};
			String [] matriz2={"kilo","sandia"};
		assertArrayEquals(matriz1, matriz2);  // es para comparar matriz 
		
	}

}
