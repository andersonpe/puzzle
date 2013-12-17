package entidades;

import java.util.List;

import controladores.ControladorJogo;

/**
 * Classe que representa um tabuleiro.
 * @author Anderson Pereira (Andy)
 * @version 4
 */
public class Tabuleiro {

	/* atributo */
	/** Matriz de peças que representa o tabuleiro.*/
	private Peca[][] tabuleiro;
	
	/**
	 * Construtor básico da classe que inicializa a matriz de acordo com o
	 * nível de dificuldade escolhido pelo usuário. 
	 * */
	public Tabuleiro() {
		this(null);
		int size = ControladorJogo.nivelDificuldadeEscolhido.getNivelEscolhido();
		tabuleiro = new Peca[size][size];
	}
	
	/**
	 * 
	 * @param tabuleiro
	 */
	public Tabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	/**
	 * Método que retorna o tabuleiro completo.
	 * @return
	 */
	public Peca[][] getTabuleiro() {
		return this.tabuleiro;
	}

	/**
	 * Método que modifica o tabuleiro por completo.
	 * @param tabuleiro
	 */
	public void setTabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	/**
	 * Método que obtem uma determinada peça do tabuleiro.
	 * @param coordenada Um coordenada que determinará a localização da peça a ser retornada.
	 * @return Um objeto do tipo Peca.
	 */
	public Peca obterPeca(Coordenada coordenada) {
		int x = coordenada.getX();
		int y = coordenada.getY();
		return (this.tabuleiro[x][y]);
	}
	
	/**
	 * 
	 * @param peca Um objeto do tipo Peca, para verificação.
	 * @return Um booleano, true se a peça é uma instância da classe "ImagemEspecial", caso contrário retorna false.
	 * @see Peca
	 * 
	 */
	private boolean pecaEhEspecial(Peca peca){
		return (peca.getImagem() instanceof ImagemEspecial);
	}
	
	/**
	 * Método que inicializa o tabuleiro.
	 * @param pecas Um lista de peças que serão adicionada no tabuleiro.
	 * @see Peca
	 */
	public void init(List<Peca> pecas){
		int i,x,y;
		Peca peca;
		int size = pecas.size();
		for(i = 0; i < size; i++){
			peca = pecas.get(i);
			x = peca.getCoordenada().getX();
			y = peca.getCoordenada().getY();
			tabuleiro[x][y] = peca;
			System.out.println("A peça da coordenada X: "+ x +" Y: " + y + " é especial? " +pecaEhEspecial(peca));
		}
	
	}
		
}
