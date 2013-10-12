package entidades;

/**
 * Classe que representa um coordenada (x,y)
 * @author Andy
 * @version 2.0
 */
public class Coordenada {
	
	private int x;
	private int y;
	
	/**
	 * Construtor básico da classe, seta valores padrões para os atributos x e y.
	 * valor padrão: 0.
	 */
	public Coordenada() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Construtor com parâmetros da classe.
	 * @param x int - atribui valor ao eixo X.
	 * @param y int - atribui valor ao eixo Y.
	 */
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return int - o valor contido no atributo X.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @param x int - modifica o valor contido no atributo X.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return int - o valor contido no atributo Y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * @param y int - modifica o valor contido no atributo Y.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	

}
