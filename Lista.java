package ListaEncadeadaSimples;

public class Lista {
	private Nodo first;
	private Nodo last;
	
	public Lista() {
		// TODO Auto-generated constructor stub
		this.first=null;
		this.last=null;
	}
	
	public void add(Nodo no) {
		if(this.first==null) {
			this.first=no;
			this.last=no;
		}else {
			this.last.setNext(no);
			this.last = no;
		}
	}
	
	public void remove(Nodo no) {
		if(this.first.equals(no)) {
			this.first = this.first.getNext();
		}else {
			Nodo element = this.first; 
			while(element!=null) {
				if(element.getNext().equals(no)) {
					Nodo elementoVaiSerRemovido = element.getNext();
					element.setNext(elementoVaiSerRemovido.getNext());
					break;
				}
				element = element.getNext();
			}
		}
	}
	public boolean search(Nodo no) {
		Nodo element = this.first;
		while(element!=null) {
			if(element.equals(no)) {
				System.out.println("\nEncontrou!");
				return true;
			}
			element = element.getNext();
		}
		System.out.println("\nNão encontrou!");
		return false;
	}
	
	
	public void print() {
		Nodo element = this.first;
		
		while(element!=null) {
			System.out.print(element.getInfo()+" ");
			element = element.getNext();
		}		
	}
}
