package arvore;

public class Main {
	public static void main(String[] args) {
		/*int a = 2;
		int b = 5;
		
		for (int i = a+1; i < b; i++) {
			System.out.println(i);
		}*/
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserir(8);
		arvore.inserir(3);
		arvore.inserir(1);
		arvore.inserir(6);
		arvore.inserir(4);
		arvore.inserir(10);
		arvore.inserir(9);
		arvore.inserir(11);
		arvore.inserir(5);
		
		arvore.mostrarEmOrdemCrescente();
		
		//arvore.remover(4);
		
		System.out.println();
		
		arvore.mostrarEmOrdemCrescente();
		
		System.out.println();
		System.out.println(arvore.maiorChave(arvore.getRaiz()));
		
		System.out.println();
		//arvore.mostrarFolhas();
		//arvore.mostrarNumerosPares();
		//System.out.println(arvore.mostrarTamanho());
		System.out.println(arvore.mostrarAltura());
	}
}
