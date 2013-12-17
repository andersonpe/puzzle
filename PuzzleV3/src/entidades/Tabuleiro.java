package entidades;

import java.util.List;

import controladores.ControladorJogo;

public class Tabuleiro {

	private Peca[][] tabuleiro;
		
	public Tabuleiro() {
		this(null);
		int size = ControladorJogo.nivelDificuldadeEscolhido.getNivelEscolhido();
		tabuleiro = new Peca[size][size];
	}
	
	public Tabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public Peca[][] getTabuleiro() {
		return this.tabuleiro;
	}

	public void setTabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public Peca obterPeca(int i, int j) {
		return (this.tabuleiro[i][j]);
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
