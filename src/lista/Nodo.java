package lista;

public class Nodo<TipoDato> {

	private Nodo<TipoDato> siguiente;
	private TipoDato dato;
	
	public Nodo(TipoDato dato){
		this.dato = dato;
	}
	
	public Nodo<TipoDato> siguiente() {
		return siguiente;
	}
	
	public Dato dato(){return null;}

	public void setSiguiente(Nodo<TipoDato> siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo<TipoDato> getSiguiente(){
		return this.siguiente;
	}

	public void setDato(TipoDato dato) {
		this.dato = dato;
	}
	
	public TipoDato getDato() {
		return this.dato;
	}
}
