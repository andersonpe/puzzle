package entidades;

/**
 * Classe que possui como responsabilidade representar uma Peca (imagem + posicao) do jogo.
 * @author Anderson Pereira (Andy)
 * @version 4
 */
public class Peca {
	
	/* atributos */
	/** Atributo que corresponde a um identificador da peca no jogo.*/
	private int idPeca;
	/** Atributo que corresponde a imagem que identificar� a peca para o usu�rio.*/
	private Imagem imagem;
	/** Atributo que corresponde a uma coordenada (posicao) da peca em cada instante do jogo. */
	private Coordenada coordenada;

	/* construtores */
	/**
	 * Construtor b�sico da classe que atribui valores padr�es aos atributos.
	 */
	public Peca() {
		this(0,null,null);
	}
	
	/**
	 * Construtor com par�metros da classe.
	 * @param idPeca Um inteiro, que identifica a pe�a durante o jogo.
	 * @param imagem Um objeto Imagem, que identifica a pe�a para o usu�rio do jogo.
	 * @param coordenada Um objeto Coordenada, que represent� a posi��o da pe�a em dado instante do jogo.
	 * @see Imagem
	 * @see ImagemEspecial
	 * @see Coordenada
	 */
	public Peca(int idPeca,Imagem imagem, Coordenada coordenada) {
		this.idPeca = idPeca;
		this.imagem = imagem;
		this.coordenada = coordenada;
	}
	
	/* getters and setters */
	/**
	 * @return Um inteiro, cujo valor corresponde ao Identificador da peca.
	 */
	public int getIdPeca() {
		return this.idPeca;
	}
	
	/**
	 * Modifica o valor do atributo Id.
	 * @param id Um inteiro que ser� o novo valor do atributo que identifica a peca.
	 */
	public void setIdPeca(int id) {
		this.idPeca = id;
	}
	
	/**
	 * @return Um objeto imagem, que corresponde ao valor contido no atributo imagem.
	 * @see Imagem
	 */
	public Imagem getImagem() {
		return this.imagem;
	}
	
	/**
	 * Atribui um objeto imagem ao valor do atributo imagem.
	 * @param imagem
	 */
	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}
	
	/**
	 * @return Um objeto coordenada, que representa a posi��o (X,Y) da pe�a em certo momento do jogo.
	 * @see Coordenada
	 */
	public Coordenada getCoordenada() {
		return this.coordenada;
	}
	
	/**
	 * Atribui valor ao atributo coordenada.
	 * @param Um nova coordenada da pe�a.
	 * @see Coordenada
	 */
	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

}
