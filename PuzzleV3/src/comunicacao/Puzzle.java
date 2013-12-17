package comunicacao;

import java.util.Scanner;

import constantes.NivelDeDificuldade;
import controladores.ControladorJogo;
import entidades.Jogador;
/**
 * Classe responsável pela comunicação com o usuário.
 * @author Anderson Pereira (Andy)
 *
 */
public class Puzzle {
	
	/* atributos */
	/** Armazena o nível de dificuldade do jogo definido pelo usuário */
	private static NivelDeDificuldade nivel;
	private Scanner entrada;
	private Jogador jogador;
	
	/* construtores */
	/**
	 * Construtor básico da classe.
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
	
	/* métodos */
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
		System.out.println("Escolha o nível do jogo\n3 - Fácil\n4 - Intermediário\n5 - Difícil");
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
