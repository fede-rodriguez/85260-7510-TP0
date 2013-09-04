package cola;


public class Cola implements Queue{
	private	Nodo primerNodo;
	private Nodo ultimoNodo;
	private int tamanio;
	
	public Cola() {
		primerNodo = new NodoNull();
		ultimoNodo = new NodoNull();
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
		Nodo nuevo = new NodoConcreto(item);
	
		try {
			ultimoNodo.setSiguiente(nuevo);
		} catch (AssertionError e) {
			primerNodo = nuevo;
		}
		
		ultimoNodo = nuevo;
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

}
