package a13_p02_lista_dupla_ligada_interface;

public class TesteTudo {

	public static void main(String[] args) {
		testeTudo(new ListaLigada());
		testeTudo(new ListaDuplamenteLigada());
	}
		
	public static void testeTudo(Lista lista) {		
		TesteAdiciona.teste(lista);
		TesteAdicionaNaPosicao.teste(lista);
		TesteAdicionaNoComeco.teste(lista);
		TesteBusca.teste(lista);
		TesteRemove.teste(lista);
		TesteTamanho.teste(lista);
	}
	
	

}
