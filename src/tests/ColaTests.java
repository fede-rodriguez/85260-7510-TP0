package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import cola.Cola;
import java.lang.String;

public class ColaTests {
	private Cola cola;
	
	@Test
	public void isEmptyTest () {
		cola = new Cola();
		assertTrue(cola.isEmpty());
		
		cola.add("primer dato");
		assertFalse(cola.isEmpty());
	}
	
	@Test
	public void sizeTest() {
		cola = new Cola();
		
		assertTrue(cola.size() == 0);
		
		cola.add("Primer dato");
		assertTrue(cola.size() == 1);

		cola.add("Segundo dato");
		assertTrue(cola.size() == 2);
	}

	@Test
	public void addRemoveTest() {
		cola = new Cola();
		String primerDato = "Primer Dato";
		String segundoDato = "Segundo Dato";
		
		cola.add(primerDato);
		cola.add(segundoDato);

		assertTrue(cola.size() == 2);
		
		cola.remove();
		cola.remove();
		
		assertTrue(cola.size() == 0);
		assertTrue(cola.isEmpty());
	}
	
	@Test
	public void topTest() {
		cola = new Cola();
		String primerDato = "Primer Dato";
		String segundoDato = "Segundo Dato";
		String tercerDato = "Tercer Dato";
		
		cola.add(primerDato);
		cola.add(segundoDato);
		cola.add(tercerDato);
		
		assertTrue(cola.top().equals(primerDato));
		cola.remove();
		assertTrue(cola.top().equals(segundoDato));
		cola.remove();
		assertTrue(cola.top().equals(tercerDato));
	}
	
	@Test(expected=AssertionError.class)
	public void topEmptyQueueTest() {
		cola = new Cola();
		cola.top();
	}
	
	@Test(expected=AssertionError.class)
	public void removeEmptyQueueTest() {
		cola = new Cola();
		cola.remove();
	}
}
