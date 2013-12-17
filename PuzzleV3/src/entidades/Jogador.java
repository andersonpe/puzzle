package entidades;

import java.util.Date;

/**
 * Classe que possui como responsabilidade representar o jogador no jogo.
 * @author Andy
 * @version 4
 */
public class Jogador {
	
	/* atributos */
	/**	Um inteiro que identifica o jogador. **/
	private int id;
	/** Um String que idenficará o jogador no Ranking.*/
	private String nome;
	/** Um objeto Date que conterá a data da partida.*/
	private Date data;
	/** Um long que conterá a duração da partida de um determinado jogador.*/
	private long tempo;
	
	/* construtores */
	/**
	 * Construtor básico da classe.
	 */
	public Jogador() {
		this(0,null,null,0);
	}
	
	/**
	 * Construtor com parâmetros da classe.
	 * @param id - Um inteiro, que identifica o jogador.
	 * @param nome - Um String, que identifica o jogador no Ranking.
	 * @param data - Um objeto Date, que representa a data da partida. 
	 * @param tempo - Um long, que representa o tempo da partida.
	 */
	public Jogador(int id, String nome, Date data, long tempo) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.tempo = tempo;
	}

	/* getters and setters */
	/**
	 * @return Um inteiro, cujo valor corresponde ao identificador do usuário no jogo.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Modifica o valor contido no atributo nome.
	 * @param id Um inteiro com o novo valor para o atributo nome.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
     * @return Uma String com o valor contido no atributo nome.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Modifica o valor contido no atrituto nome.
	 * @param nome Uma String com o novo conteudo do atributo nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Retorna um objeto Date, com os valores contidos no atributo data.
	 */
	public Date getData() {
		return data;
	}

	/**
	 * Modifica o valor do atributo Data.
	 * @param data Um objeto do tipo Data, com o novo conteúdo do atributo data.
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	/**
	 * @return Retorna um long, com o valor contido no atributo tempo.
	 */
	public long getTempo() {
		return this.tempo;
	}
	
	/**
	 * Modifica o valor do atributo tempo.
	 * @param tempo Uma variável do tipo long, com o novo valor para o atributo tempo.
	 */
	public void setTempo(long tempo) {
		this.tempo = tempo;
	}

}
