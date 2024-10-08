package arvore;

public class Nodo {
	private int chave;
	private Nodo dir, esq;
	
	public Nodo(int chave) {
		this.chave = chave;
		dir = esq = null;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public Nodo getDir() {
		return dir;
	}

	public void setDir(Nodo dir) {
		this.dir = dir;
	}

	public Nodo getEsq() {
		return esq;
	}

	public void setEsq(Nodo esq) {
		this.esq = esq;
	}
	
	
}
