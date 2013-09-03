package cola;


public class Cola implements Queue{
	private	Nodo primerNodo;
	private int tamanio;
	
	public Cola() {
		primerNodo = new NodoNull();
		tamanio  = 0;
	}

	@Override
	public boolean isEmpty() {
		return (tamanio == 0);
	}

	@Override
	public int size() {
		return tamanio;
	}

	@Override
	public void add(Object item) {
		getUltimoNodo().setSiguiente(new Nodo(item));
		tamanio++;
	}

	@Override
	public Object top() {
		return primerNodo.getDato();
	}

	@Override
	public void remove() {
		primerNodo = primerNodo.getSiguiente();
		tamanio--;
	}
	
	private Nodo getUltimoNodo() {
		Nodo nodo = primerNodo;
		Nodo ultimoNodo = new NodoNull();
		/* Recorro la lista hasta que lance una excepcion.*/
		try {
			ultimoNodo = nodo;
			while (true) {
				nodo = nodo.getSiguiente();
			}
		} catch (AssertionError e) { /*Hacer nada*/ }
		/* Devuelvo el anterior al que lanzo la excepcion*/
		return ultimoNodo;
	}
	
}
