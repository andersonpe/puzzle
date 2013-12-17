package constantes;

/**
 * Enumerador que determina as op��es de movimenta��o que uma pe�a pode ter.
 * @author Anderson Pereira (Andy)
 * @version 2
 */
public enum Direcoes {

	CIMA(1),
	BAIXO(2),
	ESQUERDA(3),
	DIREITA(4);
	
	private int direcao;
	
	private Direcoes(int direcao) {
		this.direcao = direcao;
	}
	
	public int getDirecao() {
		return this.direcao;
	}
}
