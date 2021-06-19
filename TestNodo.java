package ListaEncadeadaSimples;

public class TestNodo {
	public static void main(String[] args) {		
		Nodo no1 = new Nodo(10);		
		Nodo no2 = new Nodo(20);
		Nodo no3 = new Nodo(15);
		
		Lista lst = new Lista();
		lst.add(no1);
		lst.add(no2);
		lst.add(no3);
		lst.add(new Nodo(25));
		lst.add(new Nodo(17));
		lst.print();
		lst.remove(new Nodo(15));
		lst.remove(new Nodo(25));
		System.out.println("");
		lst.print();
		lst.search(new Nodo(7));
		
	}
}