package lista;


public class ListaEnlazada<TipoDato> {
	private	Nodo<TipoDato> primerNodo;
	
	public boolean listaVacia () {
		return (primerNodo == null);
	}
	
	private void nuevoNodoAtras(TipoDato dato) {
		Nodo<TipoDato> nuevo = new Nodo<TipoDato>(dato);
		getUltimoNodo().setSiguiente(nuevo);
	}
	
	private void nuevoNodoAdelante(TipoDato dato) {
		Nodo<TipoDato> nuevoNodo = new Nodo<TipoDato>(dato);
		nuevoNodo.setSiguiente(primerNodo);
		primerNodo = nuevoNodo;	
	}
	
	private Nodo<TipoDato> getUltimoNodo() {
		Nodo<TipoDato> nodo = primerNodo;
		try {
			while (nodo.getSiguiente() != null) {
				nodo = nodo.getSiguiente();
			}
		}catch (Exception e) {
			throw new AssertionError();
		}

		return nodo;
	}
	
	public ListaEnlazada() {
		primerNodo = null;
	}
	
	public void insertarDatoAdelante(TipoDato dato) {
		nuevoNodoAdelante(dato);
	}
	
	public void insertarDatoAtras(TipoDato dato){
		nuevoNodoAtras(dato);
	}
	
	public void eliminarPrimerNodo() {
		try {
			primerNodo = primerNodo.getSiguiente();
		} catch (Exception e) {
			throw new AssertionError();
		}
	}
	
	public void eliminarUltimoNodo() throws AssertionError {
		Nodo<TipoDato> ultimo = getUltimoNodo();
		Nodo<TipoDato> nodo = primerNodo;

		while (nodo.getSiguiente() != ultimo) {
			nodo = nodo.getSiguiente();
		}
		
		nodo.setSiguiente(null);
		ultimo = null;
	}
	
	public TipoDato getSiguienteDato(Nodo<TipoDato> nodo){
		try {
		return nodo.getSiguiente().getDato();
		} catch (Exception e) {
			throw new AssertionError();
		}
	}
}
