package entidades;

/**
 * 
 * @author Andy
 * @version 2.0
 */
public class Peca {
	
	private int identificador;
	private Imagem representacaoDaPeca;
	private Coordenada posicaoAtualDaPeca;
	
	/**
	 * Construtor b�sico da classe, seta valores padr�es para os atributos.
	 */
	public Peca() {
		this.identificador = 0;
		this.representacaoDaPeca = null;
		this.posicaoAtualDaPeca = new Coordenada();
	}
	
	/**
	 * @param representacaoDaPeca Imagem - � a representa��o da imagem da pe�a em mem�ria.
	 * @param posicaoAtualDaPeca Coordenadas - � a posi��o da imagem no tabuleiro em determinado instante.
	 * @param identificador - int - identifica a pe�a dentro do tabuleiro.
	 */
	public Peca(Imagem representacaoDaPeca, Coordenada posicaoAtualDaPeca, int identificador) {
		this.identificador = identificador;
		this.representacaoDaPeca = representacaoDaPeca;
		this.posicaoAtualDaPeca = posicaoAtualDaPeca;
	}

	/**
	 * @return int - o valor que identifica a pe�a.
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador int - modifica o valor do atributo identificador.
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return Imagem - um objeto com a imagem, altura e largura. 
	 */
	public Imagem getRepresentacaoDaPeca() {
		return representacaoDaPeca;
	}

	/**
	 * @param representacaoDaPeca Imagem - modifica o atributo Representa��o da pe�a.
	 */
	public void setRepresentacaoDaPeca(Imagem representacaoDaPeca) {
		this.representacaoDaPeca = representacaoDaPeca;
	}

	/**
	 * @return Coordenada - retorna a posi��o atual da pe�a no tabuleiro (x,y).
	 */
	public Coordenada getPosicaoAtualDaPeca() {
		return posicaoAtualDaPeca;
	}

	/**
	 * @param posicaoAtualDaPeca Coordenada - modifica a posi��o atual da pe�a.
	 */
	public void setPosicaoAtualDaPeca(Coordenada posicaoAtualDaPeca) {
		this.posicaoAtualDaPeca = posicaoAtualDaPeca;
	}

}
