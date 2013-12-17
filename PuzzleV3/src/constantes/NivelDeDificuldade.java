package constantes;

/**
 * Enumerador que representa o n�vel de dificuldade do jogo.
 * @author Anderson Pereira (Andy)
 * @version 3
 */
public enum NivelDeDificuldade {
	
	/**
	 * Op��es de n�vel dispon�veis. O n�mero entre par�nteses corresponder�
	 * ao tamanho do tabuleiro do jogo.
	 */
	FACIL(3),
	INTERMEDIARIO(4),
	DIFICIL(5);
	
	/* atributos */
	/** Armazena o valor correspondente ao valor 
	 * escolhido pelo usu�rio e que determina o n�vel
	 * de dificuldade do jogo.
	 * */
	private int nivelEscolhido;
	
	/**
	 * Construtor private do enumerador.
	 * @param nivel Um inteiro, que corresponder� ao valor escolhido.
	 */
	private NivelDeDificuldade(int nivel){
		this.nivelEscolhido = nivel;
	}
	
	/**
	 * Retorna o valor inteiro corresponde ao nivel de dificuldade escolhido.
	 * @return Um inteiro contido no atributo nivelEscolhido;
	 */
	public int getNivelEscolhido() {
		return this.nivelEscolhido;
	}
}
