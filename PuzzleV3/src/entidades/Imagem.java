package entidades;

import java.awt.image.BufferedImage;

/**
 * Classe respons�vel por representar uma imagem. 
 * @author Andy
 * @version 3
 */
public class Imagem {

	/* atributos */
	/** Objeto que cont�m a imagem (j� dividida) em mem�ria. */
	private BufferedImage imagem;
	/** Guarda o valor correspondente a largura da imagem armazenada no atributo imagem.*/
	private int largura;
	/** Guarda o valor correspondente a altura da imagem armazenada no atributo imagem.*/
	private int altura;
	
	/* construtores */
	/**
	 * Construtor b�sico da classe, define valores padr�es para os atributos.
	 */
	public Imagem() {
		this(null,0,0);
	}
	
	/**
	 * Construtor com par�metros da classe.
	 * @param imagem Atribui valor ao objeto que cont�m a imagem em mem�ria.
	 * @param largura Atribui valor correspondente a largura da imagem.
	 * @param altura Atribui valor correspondente a altura da imagem.
	 */
	public Imagem (BufferedImage imagem, int largura, int altura) {
		this.imagem = imagem;
		this.largura = largura;
		this.altura = altura;
	}
	
	/* getters and setters */
	/**
	 * 
	 * @return Um objeto BufferedImagem, que cont�m a imagem em mem�ria.
	 */
	public BufferedImage getImagem() {
		return imagem;
	}

	/**
	 * Modifica o valor do atributo imagem.
	 * @param imagem
	 */
	public void setImagem(BufferedImage imagem) {
		this.imagem = imagem;
	}

	/**
	 * 
	 * @return Um inteiro, cujo valor corresponde a largura da imagem.
	 */
	public int getLargura() {
		return largura;
	}

	/**
	 * Modifica o valor da largura,
	 * @param largura Recebe um inteiro.
	 */
	public void setLargura(int largura) {
		this.largura = largura;
	}

	/**
	 * 
	 * @return Um inteiro, cujo valor corresponde a altura da imagem.
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Modifica o valor do atributo altura.
	 * @param altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
