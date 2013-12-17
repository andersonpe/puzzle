package controladores;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import util.NumeroRandomico;
import constantes.Constantes;
import constantes.NivelDeDificuldade;
import constantes.OpcaoDeImagens;
import entidades.Coordenada;
import entidades.Peca;
import entidades.Tabuleiro;
import constantes.Direcoes;

/**
 * 
 * @author Anderson Pereira (Andy)
 *
 */
public class ControladorJogo {
	
	public static NivelDeDificuldade nivelDificuldadeEscolhido = NivelDeDificuldade.DIFICIL;
	public static OpcaoDeImagens opcaoDeImagemEscolhida = OpcaoDeImagens.OPCAO3;
	public static List<Peca> listaDePecas;
	public List<Direcoes> direcoesPossiveis;
	public List<Tabuleiro> listaDeTabuleiros;
	public Tabuleiro tabuleiro;
	protected Coordenada posicaoEmBranco;
	
	/* construtores */
	public ControladorJogo() {
		this(null,null,null);
	}
	
	public ControladorJogo(List<Direcoes> direcoes, List<Tabuleiro> tabuleiros, 
			Tabuleiro tabuleiro) {
		this.direcoesPossiveis = direcoes;
		this.listaDeTabuleiros = tabuleiros;
		this.tabuleiro = tabuleiro; 
	}
	
	public static int gerarQuantidadeDeJogadas() {
		int numeroMinimo = Constantes.NUMERO_MINIMO_DE_RODADAS;
		int numeroMaximo = Constantes.NUMERO_MAXIMO_DE_RODADAS;
		int numeroGerado = NumeroRandomico.gerarNumeroRandomico(numeroMaximo);
		return (numeroMinimo + numeroGerado);
	}
	
	private void determinarDirecoes() {
		
		int nivel = nivelDificuldadeEscolhido.getNivelEscolhido();
		int x = posicaoEmBranco.getX();
		int y = posicaoEmBranco.getY();
		
		direcoesPossiveis = new ArrayList<Direcoes>();

		/* canto superior esquerdo */
		if ((x == 0) && (y == 0)) {
			direcoesPossiveis.add(Direcoes.BAIXO);
			direcoesPossiveis.add(Direcoes.DIREITA);
		}
		/* canto inferior esquerdo*/
		else if (((x == (nivel - 1))) && (y == 0)) {
			direcoesPossiveis.add(Direcoes.CIMA);
			direcoesPossiveis.add(Direcoes.DIREITA);
		}
		/* borda esquerda */
		else if (((x != 0 ) && (x != (nivel - 1)) 
				&& (y == 0))) {
			direcoesPossiveis.add(Direcoes.BAIXO);
			direcoesPossiveis.add(Direcoes.CIMA);
			direcoesPossiveis.add(Direcoes.DIREITA);
		}
		/* canto superior direito */
		else if ((x == 0) && (y == (nivel - 1))) {
			direcoesPossiveis.add(Direcoes.BAIXO);
			direcoesPossiveis.add(Direcoes.ESQUERDA);
		} 
		/* canto inferior direito */
		else if ((x == (nivel - 1)) && ((y == (nivel -1)))) {
			direcoesPossiveis.add(Direcoes.DIREITA);
			direcoesPossiveis.add(Direcoes.CIMA);
		}
		/* borda direita */
		else if (((x != 0) && (x != (nivel - 1))) &&
				(y == (nivel - 1))) {
			direcoesPossiveis.add(Direcoes.DIREITA);
			direcoesPossiveis.add(Direcoes.CIMA);
			direcoesPossiveis.add(Direcoes.BAIXO);
		}
		/* outros casos */
		else {
			direcoesPossiveis.add(Direcoes.ESQUERDA);
			direcoesPossiveis.add(Direcoes.DIREITA);
			direcoesPossiveis.add(Direcoes.BAIXO);
			direcoesPossiveis.add(Direcoes.CIMA);
		}
	}
	
	private void imprimirTabuleiro(Tabuleiro tabuleiro) {
		int i, j;
		int qtdInteracoes = nivelDificuldadeEscolhido.getNivelEscolhido();
		DecimalFormat formatacaoNumero = new DecimalFormat("00");
		Coordenada coordenada;
		
		for(i = 0; i < qtdInteracoes; i++) {
			for(j = 0; j < qtdInteracoes; j++){
				coordenada = new Coordenada(i,j);
				int id = tabuleiro.obterPeca(coordenada).getIdPeca();
				System.out.print(formatacaoNumero.format(id) + " ");
			}
			System.out.println("");
		}
	}
	
	public void adicionarTabuleiroNaLista(Tabuleiro tabuleiro) {
		this.listaDeTabuleiros.add(tabuleiro);
	}
	
	public void init() {
		ControladorPeca controle = new ControladorPeca();
		listaDePecas = controle.getListaDePecas();
		posicaoEmBranco = new Coordenada(0,0);
	}
	
	public void embaralhar() {
		int quantidadeDeInteracoes = gerarQuantidadeDeJogadas();
		int i;
		
		for(i = 0; i < quantidadeDeInteracoes; i++) {
			Peca peca = tabuleiro.obterPeca(posicaoEmBranco);
					

			
		}
	}
	
	public void playPuzzle(){
		Tabuleiro tabuleiro;
		
		tabuleiro = new Tabuleiro();
		tabuleiro.init(listaDePecas);

		determinarDirecoes();
		imprimirTabuleiro(tabuleiro);
		
	}
	
	
}
