public class TiposAbstractosDeDatos {

	public static void main(String[] args) {
		Nodo primero = new Nodo(1, null);
		getRandomListFromPrimero(primero);
		Nodo temporal = primero;
		while (temporal != null) {
			System.out.println(temporal.getValor());
			temporal = temporal.getNext();
		}
	}

	public static void getRandomListFromPrimero(Nodo n) {
		Random r = new Random();
		int cantidad = r.nextInt(1000);
		Nodo pointer = n;
		for (int i = 0; i < cantidad; i++) {
			pointer.setNext(new Nodo(r.nextInt(1384), null));
			pointer = pointer.getNext();
		}
	}
}

class Nodo {
	private int valor;
	private Nodo next;

	public boolean hasNext() {
		return next != null;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}

	public Nodo(int valor, Nodo next) {
		super();
		this.valor = valor;
		this.next = next;
	}

}
