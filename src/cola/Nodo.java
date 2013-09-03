package cola;

public class Nodo {

	protected Nodo siguiente;
	protected Object dato;

	public Nodo() {
		super();
	}
	
	public Nodo(Object dato) {
		this.dato = dato;
		siguiente = new NodoNull();
	}

	public Nodo siguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getSiguiente() {
		return this.siguiente;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Object getDato() {
		return this.dato;
	}

}