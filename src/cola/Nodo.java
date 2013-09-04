package cola;

public abstract class Nodo {

	protected Nodo siguiente;
	protected Object dato;
	
	public Nodo() {
		super();
	}
	
	public Nodo siguiente() {
		return this.siguiente;
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