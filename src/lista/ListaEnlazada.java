package lista;


public class ListaEnlazada {
	private	Nodo primerNodo;
	private Nodo ultimoNodo;
	
	public boolean listaVacia () {
		return (primerNodo == ultimoNodo);
	}
	
	private void nuevoNodoAtras() {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setSiguiente(null);
		ultimoNodo.setSiguiente(nuevoNodo);
		ultimoNodo = nuevoNodo;
	}
	
	private void nuevoNodoAdelante() {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setSiguiente(primerNodo);
		primerNodo.setSiguiente(nuevoNodo);
		primerNodo = nuevoNodo;	
	}
	
	public ListaEnlazada() {
		primerNodo = null;
		ultimoNodo = primerNodo;
	}
	
	public void insertarDatoAdelante(Dato dato) {
		nuevoNodoAdelante();
		primerNodo.setDato(dato);
	}
	
	public void insertarDatoAtras(Dato dato){
		nuevoNodoAtras();
		ultimoNodo.setDato(dato);
	}
}
