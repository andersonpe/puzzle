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
	 * Construtor básico da classe, seta valores padrões para os atributos.
	 */
	public Peca() {
		this.identificador = 0;
		this.representacaoDaPeca = null;
		this.posicaoAtualDaPeca = new Coordenada();
	}
	
	/**
	 * @param representacaoDaPeca Imagem - é a representação da imagem da peça em memória.
	 * @param posicaoAtualDaPeca Coordenadas - é a posição da imagem no tabuleiro em determinado instante.
	 * @param identificador - int - identifica a peça dentro do tabuleiro.
	 */
	public Peca(Imagem representacaoDaPeca, Coordenada posicaoAtualDaPeca, int identificador) {
		this.identificador = identificador;
		this.representacaoDaPeca = representacaoDaPeca;
		this.posicaoAtualDaPeca = posicaoAtualDaPeca;
	}

	/**
	 * @return int - o valor que identifica a peça.
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
	 * @param representacaoDaPeca Imagem - modifica o atributo Representação da peça.
	 */
	public void setRepresentacaoDaPeca(Imagem representacaoDaPeca) {
		this.representacaoDaPeca = representacaoDaPeca;
	}

	/**
	 * @return Coordenada - retorna a posição atual da peça no tabuleiro (x,y).
	 */
	public Coordenada getPosicaoAtualDaPeca() {
		return posicaoAtualDaPeca;
	}

	/**
	 * @param posicaoAtualDaPeca Coordenada - modifica a posição atual da peça.
	 */
	public void setPosicaoAtualDaPeca(Coordenada posicaoAtualDaPeca) {
		this.posicaoAtualDaPeca = posicaoAtualDaPeca;
	}

}
