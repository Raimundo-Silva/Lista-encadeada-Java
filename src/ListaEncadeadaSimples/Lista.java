package ListaEncadeadaSimples;

public class Lista {
	private Nodo first;
	private Nodo last;
	private int qtd = 0;

	public Nodo getFirst() {
		return first;
	}

	public void setFirst(Nodo first) {
		this.first = first;
	}

	public Nodo getLast() {
		return last;
	}

	public void setLast(Nodo last) {
		this.last = last;
	}

	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Lista() {
		// TODO Auto-generated constructor stub
		this.first=null;
		this.last=null;
	}
	
	public void addLast(Nodo no) {
		if(this.getQtd()==0) {
			this.first=no;
			this.last=no;
		}else {
			this.last.setNext(no);
			this.last = no;
		}
		this.setQtd(this.getQtd()+1);
	}
	public void adiciona(int posicao, Nodo no) {
		if(this.getQtd()==0){
			this.addLast(no);
		}else {
			int cont = 1;
			Nodo temp = this.getFirst();
			while(true) {
				if(posicao==this.getQtd()-1){
					this.addLast(no);
					break;
				}
				else{
					while(cont<=this.getQtd()-1){
						if (cont==posicao){
							no.setNext(temp);
							temp = no;
							cont++;
							continue;
						}
						else if(cont>posicao){
							temp.setNext(temp);
							temp = temp.getNext();
							cont++;
							continue;
							//temp = temp.getNext();
							//cont++;
							//continue;
						}
						cont++;
					}
					this.last.setNext(null);
					this.last = temp;
					break;
				}
			}this.setQtd(this.getQtd()+1);
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
