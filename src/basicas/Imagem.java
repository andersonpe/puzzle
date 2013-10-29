package entidades;

import java.awt.image.BufferedImage;

/**
 * @author Andy
 * @version 2.0
 */
public class Imagem {
	
	private BufferedImage imagem;
	private int largura;
	private int altura;
	private boolean ehMarcada;
	
	/**
	 * Construtor básico da classe, seta valores padrões para os atributos.
	 */
	public Imagem() {
		this.imagem = null;
		this.largura = 0;
		this.altura = 0;
		this.ehMarcada = false;
	}
	
	/**
	 * @param imagem BufferedImage - Objeto que contém um pedaço da imagem original.
	 * @param largura int - Largura da imagem.
	 * @param altura int - Altura da imagem.
	 */
	public Imagem(BufferedImage imagem, int largura, int altura) {
		this.imagem = imagem;
		this.largura = largura;
		this.altura = altura;
		this.ehMarcada = false;
	}
	
	/**
	 * @param imagem BufferedImage - Objeto que contém um pedaço da imagem original.
	 * @param largura int - Largura da imagem.
	 * @param altura int - Altura da imagem.
	 * @param ehMarcada - boolean - Determina se a imagem vai ter a color modificada e representar a peça vazia.
	 */
	public Imagem(BufferedImage imagem, int largura, int altura, boolean ehMarcada) {
		this.imagem = imagem;
		this.largura = largura;
		this.altura = altura;
		this.ehMarcada = ehMarcada;
	}
	
	/**
	 * @return BufferedImagem - Objeto que contém um pedaço da imagem original. 
	 */
	public BufferedImage getImagem() {
		return imagem;
	}
	
	/**
	 * @param imagem BufferedImagem - Objeto que contém um pedaço da imagem original.
	 */
	public void setImagem(BufferedImage imagem) {
		this.imagem = imagem;
	}
	
	/**
	 * @return int - retorna o valor da largura da imagem.
	 */
	public int getLargura() {
		return largura;
	}
	
	/**
	 * @param largura int - modifica o valor da largura da imagem.
	 */
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	/**
	 * @return int - retorna o valor da altura da imagem.
	 */
	public int getAltura() {
		return altura;
	}
	
	/**
	 * @param altura int - modifica o valor da altura da imagem.
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return boolean - retorna o valor que determina se a imagem 
	 * terá sua cor modificada para representar o espaco de movimentação do jogo.
	 */
	public boolean isMarcada() {
		return this.ehMarcada;
	}

	/**
	 * @param ehMarcada boolean - modifica o valor que determina se a imagem terá sua cor
	 * modificada para representar o espaço de movimentação do jogo.
	 */
	public void setEhMarcada(boolean ehMarcada) {
		this.ehMarcada = ehMarcada;
	}

}
