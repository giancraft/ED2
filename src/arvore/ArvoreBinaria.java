package arvore;

public class ArvoreBinaria {
	private Nodo raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	public void inserir(int chave) {
		setRaiz(inserirDado(getRaiz(), chave));
	}
	
	private Nodo inserirDado(Nodo raiz, int chave) {
		if (raiz == null) {
			raiz = new Nodo(chave);
			return raiz;
		}
		if (chave < raiz.getChave())
			raiz.setEsq(inserirDado(raiz.getEsq(), chave));
		else if (chave > raiz.getChave())
			raiz.setDir(inserirDado(raiz.getDir(), chave));
		
		return raiz;
	}
	
	public void mostrarEmOrdemCrescente() {
		mostrarCrescente(getRaiz());
	}
	
	private void mostrarCrescente(Nodo raiz) {
		if (raiz != null) {
			mostrarCrescente(raiz.getEsq());
			System.out.println(raiz.getChave());
			mostrarCrescente(raiz.getDir());
		}
	}
	
	public void mostrarEmOrdemDecrescente() {
		mostrarDescrescente(getRaiz());
	}
	
	private void mostrarDescrescente(Nodo raiz) {
		if (raiz != null) {
			mostrarDescrescente(raiz.getDir());
			System.out.println(raiz.getChave());
			mostrarDescrescente(raiz.getEsq());
		}
	}
	
	public void remover(int chave) {
		setRaiz(removerNodo(getRaiz(), chave));
	}
	
	private Nodo removerNodo(Nodo raiz, int chave) {
		if (raiz == null) {
			return null;
		}
		
		if (chave < raiz.getChave()) {
			raiz.setEsq(removerNodo(raiz.getEsq(), chave));
		} else if (chave > raiz.getChave()) {
			raiz.setDir(removerNodo(raiz.getDir(), chave));
		} else {
			if (raiz.getEsq() == null) {
				return raiz.getDir();
			} else if (raiz.getDir() == null) {
				return raiz.getEsq();
			} else {
				Nodo sucessor = encontrarSucessor(raiz.getDir());
				
				raiz.setChave(sucessor.getChave());
				
				raiz.setDir(removerNodo(raiz.getDir(), sucessor.getChave()));
			}
		}
		return raiz;
	}
	
	private Nodo encontrarSucessor(Nodo nodo) {
		while (nodo.getEsq() != null) {
			nodo = nodo.getEsq();
		}
		
		return nodo;
	}
	
	public int maiorChave(Nodo nodo) {
		while (nodo.getDir() != null) {
			nodo = nodo.getDir();
		}
		
		return nodo.getChave();
	}
	
	public void mostrarFolhas () {
		mostraFolhas(getRaiz());
	}
	
	private void mostraFolhas(Nodo nodo) {
		if (nodo != null) {
			mostraFolhas(nodo.getEsq());
			if (nodo.getEsq() == null && nodo.getDir() == null ) {
				System.out.println(nodo.getChave());
			}
			mostraFolhas(nodo.getDir());
		}
	}
	
	public void mostrarNumerosPares() {
		mostrarPares(getRaiz());
	}
	
	private void mostrarPares(Nodo raiz) {
		if (raiz != null) {
			mostrarPares(raiz.getEsq());
			if (raiz.getChave() % 2 == 0) {
				System.out.println(raiz.getChave());
			}
			mostrarPares(raiz.getDir());
		}
	}
	
	public int mostrarTamanho() {
		return mostraTamanho(getRaiz(), 0);
	}
	
	private int mostraTamanho(Nodo raiz, int tamanho) {
		if (raiz != null) {
			tamanho = mostraTamanho(raiz.getDir(), tamanho+1);
			tamanho = mostraTamanho(raiz.getEsq(), tamanho);
		}
		return tamanho;
	}
	
	public int mostrarAltura() {
		return altura(getRaiz(), 1);
	}
	
	private int altura(Nodo raiz, int alt) {
		if (raiz != null) {
			int alturaEsq = altura(raiz.getEsq(), alt+1);
			int alturaDir = altura(raiz.getDir(), alt);
			if (alturaEsq > alturaDir) {
				alt = alturaEsq;
			} else if (alturaDir > alturaEsq){
				alt = alturaDir;
			}
		}
		return alt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
