package comunicacao;

import java.util.Scanner;

import constantes.NivelDeDificuldade;
import controladores.ControladorJogo;
import entidades.Jogador;
/**
 * Classe respons�vel pela comunica��o com o usu�rio.
 * @author Anderson Pereira (Andy)
 *
 */
public class Puzzle {
	
	/* atributos */
	/** Armazena o n�vel de dificuldade do jogo definido pelo usu�rio */
	private static NivelDeDificuldade nivel;
	private Scanner entrada;
	private Jogador jogador;
	
	/* construtores */
	/**
	 * Construtor b�sico da classe.
	 */
	public Puzzle() {
		
	}

	/* getters e setters */
	public Jogador getJogador() {
		return this.jogador;
	}
	
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	/* m�todos */
	private NivelDeDificuldade determinarNivelDeDificuldade (int valor) {
		NivelDeDificuldade nivel = null;
		switch (valor) {
		case 3:
			nivel = NivelDeDificuldade.FACIL;
			break;
		case 4:
			nivel = NivelDeDificuldade.INTERMEDIARIO;
			break;
		case 5:
			nivel = NivelDeDificuldade.DIFICIL;
			break;
		default:
			nivel = NivelDeDificuldade.FACIL;
			break;
		}
		return nivel;
	}
	
	private void init(){
		int nivelEscolhido = solicitarNivel();
		nivel = determinarNivelDeDificuldade(nivelEscolhido);
	}
	
	private int solicitarNivel() {
		int nivelEscolhido;
		entrada = new Scanner(System.in);
		System.out.println("Escolha o n�vel do jogo\n3 - F�cil\n4 - Intermedi�rio\n5 - Dif�cil");
		nivelEscolhido = entrada.nextInt();
		return nivelEscolhido;
	}
	
	public static void main(String[] args) {
		Puzzle jogo;
		ControladorJogo controladorJogo;
				
		jogo = new Puzzle();
		jogo.init();
		
		controladorJogo = new ControladorJogo();
		ControladorJogo.nivelDificuldadeEscolhido = Puzzle.nivel;
		controladorJogo.init();
		controladorJogo.playPuzzle();

	}

}
