public class ArbolMain {
	public static void main(String[] args) {
		Arbol a = new Arbol();
		a.raiz = new NodoArbol();
		a.raiz.valor = 15;
		
		a.raiz.hijoIzq = new NodoArbol();
		a.raiz.hijoIzq.valor = 5;
		
		a.raiz.hijoDer = new NodoArbol();
		a.raiz.hijoDer.valor = 20;
		
		a.raiz.hijoIzq.hijoIzq = new NodoArbol();
		a.raiz.hijoIzq.hijoIzq.valor = 2; 
		a.raiz.hijoIzq.hijoDer = new NodoArbol();
		a.raiz.hijoIzq.hijoDer.valor = 7;
		
		a.raiz.hijoDer.hijoIzq = new NodoArbol();
		a.raiz.hijoDer.hijoIzq.valor = 17; 
		a.raiz.hijoDer.hijoDer = new NodoArbol();
		a.raiz.hijoDer.hijoDer.valor = 22;
		a.mostrarPrimeroValor();
	}
}

class NodoArbol {
	int valor;
	NodoArbol hijoIzq;
	NodoArbol hijoDer;
	@Override
	public String toString() {
		return "NodoArbol [valor=" + valor + "]";
	}		
}

class Arbol {
	NodoArbol raiz;
	
	public void mostrarPrimeroValor() {
		if (raiz != null) {
			recursivoMostrarPrimeroValor(raiz);
		}
	}
	
	public void recursivoMostrarPrimeroValor(NodoArbol na) {
		if (na != null) {
			recursivoMostrarPrimeroValor(na.hijoIzq);
			recursivoMostrarPrimeroValor(na.hijoDer);
			System.out.println(na.valor);
		}
	}
}
