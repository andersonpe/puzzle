package constantes;

/**
 * Enumerador que representa as opções de imagem que o usuário terá no jogo.
 * @author Anderson Pereira (Andy)
 * @version 3
 */
public enum OpcaoDeImagens {
	
	OPCAO1(1),
	OPCAO2(2),
	OPCAO3(3),
	OPCAO4(4),
	OPCAO5(5),
	OPCAO6(6),
	OPCAO7(7),
	OPCAO8(8),
	OPCAO9(9),
	OPCAO10(10);
	
	private int opcaoEscolhida;
	
	private OpcaoDeImagens(int opcaoEscolhida) {
		this.opcaoEscolhida = opcaoEscolhida;
	}
	
	public int getOpcaoEscolhida() {
		return this.opcaoEscolhida;
	}
	
}
