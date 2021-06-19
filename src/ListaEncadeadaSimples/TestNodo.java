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
		System.out.println("A quantidade de elementos da lista é: "+lst.getQtd());
		lst.print();
		System.out.print("\n");
		System.out.println("");
		lst.remove(new Nodo(15));
		lst.remove(new Nodo(25));
		lst.print();
		System.out.print("\n");
		//lst.adiciona(1, new Nodo(30));
		lst.print();
		System.out.print("\n");
		lst.print();
		System.out.print("\n");
		lst.search(new Nodo(7));
		lst.print();
		System.out.print("\n");
		System.out.println("A quantidade de elementos da lista é: "+lst.getQtd());
	}
}