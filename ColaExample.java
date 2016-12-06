public class ColaExample {

	public static void main(String[] args) {
		Cola c = new Cola(new Nodo("1"));
		c.encolar(new Nodo("2"));
		c.encolar(new Nodo("3"));
		c.encolar(new Nodo("4"));
		c.encolar(new Nodo("5"));
		c.encolar(new Nodo("6"));

		Nodo temp = c.desencolar();
		do {
			System.out.println(temp.valor);
			temp = c.desencolar();
		} while (temp != null);
	}

}

class Nodo {
	String valor;
	Nodo next;

	public Nodo(String valor, Nodo sgte) {
		super();
		this.valor = valor;
		this.next = sgte;
	}

	public Nodo(String valor) {
		super();
		this.valor = valor;
	}

	public Nodo() {
	}
}

class Cola {
	Nodo primero;

	public Cola(Nodo primero) {
		super();
		this.primero = primero;
	}

	public Cola() {
		super();
	}

	public void encolar(Nodo n) {
		Nodo temp = primero;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	public Nodo desencolar() {
		if (primero == null) 
			return null;
		Nodo temp = primero;
		primero = primero.next;
		return temp;
	}
}
