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
	/** Matriz de pe�as que representa o tabuleiro.*/
	private Peca[][] tabuleiro;
	
	/**
	 * Construtor b�sico da classe que inicializa a matriz de acordo com o
	 * n�vel de dificuldade escolhido pelo usu�rio. 
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
	 * M�todo que retorna o tabuleiro completo.
	 * @return
	 */
	public Peca[][] getTabuleiro() {
		return this.tabuleiro;
	}

	/**
	 * M�todo que modifica o tabuleiro por completo.
	 * @param tabuleiro
	 */
	public void setTabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	/**
	 * M�todo que obtem uma determinada pe�a do tabuleiro.
	 * @param coordenada Um coordenada que determinar� a localiza��o da pe�a a ser retornada.
	 * @return Um objeto do tipo Peca.
	 */
	public Peca obterPeca(Coordenada coordenada) {
		int x = coordenada.getX();
		int y = coordenada.getY();
		return (this.tabuleiro[x][y]);
	}
	
	/**
	 * 
	 * @param peca Um objeto do tipo Peca, para verifica��o.
	 * @return Um booleano, true se a pe�a � uma inst�ncia da classe "ImagemEspecial", caso contr�rio retorna false.
	 * @see Peca
	 * 
	 */
	private boolean pecaEhEspecial(Peca peca){
		return (peca.getImagem() instanceof ImagemEspecial);
	}
	
	/**
	 * M�todo que inicializa o tabuleiro.
	 * @param pecas Um lista de pe�as que ser�o adicionada no tabuleiro.
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
			System.out.println("A pe�a da coordenada X: "+ x +" Y: " + y + " � especial? " +pecaEhEspecial(peca));
		}
	
	}
		
}
