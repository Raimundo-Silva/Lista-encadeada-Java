package ListaEncadeadaSimples;

public class Nodo {
	private int info;
	private Nodo next;
	
	public Nodo(int info) {
		this.info = info;
	}
	
	public int getInfo() {
		return info;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	
	public void setNext(Nodo next) {
		this.next = next;
	}
	public Nodo getNext() {
		return next;
	}
	
	@Override
	public boolean equals(Object obj) {
		Nodo element = (Nodo) obj;
		return this.getInfo()==element.getInfo();
	}
}