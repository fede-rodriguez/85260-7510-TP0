package cola;


/*
 * Tipo de objeto Nodo que sobreescribe la funcionalidad para lanzar excepciones
 * Se utiliza para simbolizar el fin de la cola.
 */
public class NodoNull extends Nodo {

	public NodoNull() {
		siguiente = null;
		dato = null;
	}
	
	@Override
	public void setSiguiente(Nodo siguiente) {
		throw new AssertionError();
	}
	
	@Override
	public Nodo getSiguiente() {
		throw new AssertionError();
	}
	
	@Override
	public void setDato(Object dato) {
		throw new AssertionError();
	}

	@Override
	public Object getDato() {
		throw new AssertionError();
	}
	
}
