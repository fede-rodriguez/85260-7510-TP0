package lista;

public class Nodo {

	private Nodo siguiente;
	private Dato dato;
	
	public Nodo siguiente() {return null;}
	public Dato dato(){return null;}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;		
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}

	public void setDato(Dato dato) {
		this.dato = dato;
	}
	
	public Dato getDato() {
		return this.dato;
	}
}
