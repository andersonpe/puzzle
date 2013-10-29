package entidades;

/**
 * @author Andy
 * @version 2.0
 */
public enum OpcoesDeImagens {
	
	OPCAO_DE_IMAGEM01(1),
	OPCAO_DE_IMAGEM02(2),
	OPCAO_DE_IMAGEM03(3),
	OPCAO_DE_IMAGEM04(4),
	OPCAO_DE_IMAGEM05(5),
	OPCAO_DE_IMAGEM06(6),
	OPCAO_DE_IMAGEM07(7),
	OPCAO_DE_IMAGEM08(8),
	OPCAO_DE_IMAGEM09(9);
	
	private int opcaoDeImagem;
	
	/**
	 * @param opcao construtor que define um valor para uma opção de imagem, o valor 
	 * é passado por parâmetro.
	 */
	private OpcoesDeImagens(int opcao){
		this.opcaoDeImagem = opcao;
	}
	
	/**
	 * @return int - retorna o valor que representa a imagem escolhida.
	 */
	public int getOpcaoDeImagem(){
		return this.opcaoDeImagem;
	}
	
}
