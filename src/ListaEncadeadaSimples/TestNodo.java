package ListaEncadeadaSimples;

public class TestNodo {
	public static void main(String[] args) {		
		Nodo no1 = new Nodo(10);		
		Nodo no2 = new Nodo(20);
		Nodo no3 = new Nodo(15);
		
		Lista lst = new Lista();
		lst.addLast(no1);
		lst.addLast(no2);
		lst.addLast(no3);
		lst.addLast(new Nodo(25));
		lst.addLast(new Nodo(17));
		lst.print();
		lst.remove(new Nodo(15));
		lst.remove(new Nodo(25));
		lst.print();
		lst.adiciona(1, new Nodo(30));
		lst.print();
		System.out.println("");
		lst.print();
		lst.search(new Nodo(7));
		
	}
}