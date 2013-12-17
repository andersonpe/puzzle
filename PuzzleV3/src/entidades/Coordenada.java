package entidades;

/**
 * Classe que representa uma coordenada (x,y).
 * @author Andy
 * @version 3
 */
public class Coordenada {
	
	/* atributos */
	/** Atributo correspondente ao eixo X.*/
	private int x;
	/** Atributo correspondente ao eixo Y.*/
	private int y;
	
	/* construtores */
	/**
	 * Construtor básico da classe, define valores padrões para os atributos X e Y.
	 * valor padrão: 0.
	 */
	public Coordenada() {
		this(0,0);
	}
	
	/**
	 * Construtor com parametros da classe que recebe valores e os atribui para X e Y.
	 * @param x Um inteiro, que corresponde ao valor do eixo X.
	 * @param y Um inteiro, que corresponde ao valor do eixo Y.
	 */
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* getters and setters*/
	/**
	 * @return Um inteiro, que corresponde ao valor contido em X.
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x Atribui um inteiro ao valor do atributo X.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return Um inteiro, que corresponde ao valor contido em Y.
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y Atribui um inteiro ao valor do atributo Y.
	 */
	public void setY(int y) {
		this.y = y;
	}

}
