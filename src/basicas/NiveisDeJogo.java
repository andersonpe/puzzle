package entidades;

/**
 * Enum que representa as opções de nível de jogo.
 * @author Andy
 * @version 2.0
 */
public enum NiveisDeJogo {
	
	NIVEL_FACIL(3),
	NIVEL_INTERMEDIARIO(4),	
	NIVEL_DIFICIL(5);
	
	private int nivel; 
	
	/**
	 * Construtor privado.
	 * @param nivel int - atribui o valor correspondente ao nível de jogo escolhido.
	 */
	private NiveisDeJogo(int nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * @return int - retorna o valor correspondente ao nível de jogo escolhido.
	 */
	public int getNivel() {
		return this.nivel;
	}
}
