package cola;

public class NodoConcreto extends Nodo {

	public NodoConcreto() {
		this.dato = null;
		this.siguiente = new NodoNull();
	}
	
	public NodoConcreto(Object dato) {
		this.dato = dato;
		this.siguiente = new NodoNull();
	}

}