package controladores;

import java.util.ArrayList;
import java.util.List;

import constantes.NivelDeDificuldade;
import entidades.Coordenada;
import entidades.Imagem;
import entidades.ImagemEspecial;
import entidades.Peca;

/**
 * Classe respons�vel pelo Controle da Cria��o das Pe�as (coordenada + imagem) do jogo.
 * @author Anderson Pereira (Andy)
 * @version 4
 */
public class ControladorPeca {
	
	/* atributos */
	/** Lista de pe�as do jogo.*/
	private List<Peca> listaDePecas;
	/** N�vel de dificuldade do jogo, definido pelo usu�rio.*/
	private NivelDeDificuldade nivel;
	/** Lista de Imagens a serem colocadas nas pe�as. */
	protected List<Imagem> listaDeImagens;
	
	/**
	 * Construtor b�sico da classe.
	 */
	public ControladorPeca() {
		try {
			init();
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
	}
	
	/* getters and setters */
	/**
	 * Retorna o valor do atributo listaDePecas que por sua vez cont�m a lista de Pe�as que ser�o utilizadas no jogo. 
	 * @return Uma lista com as pe�as utilizadas no jogo.
	 * @see Peca
	 */
	public List<Peca> getListaDePecas() {
		return this.listaDePecas;
	}
	
	/**
	 * Modifica o valor contido no atributo lista de Pecas.
	 * @param listaDePecas Um Lista de objetos do tipo Pe�as.
	 */
	public void setListaDePecas(List<Peca> listaDePecas) {
		this.listaDePecas = listaDePecas;
	}
	
	/**
	 * Retorna o valor do atributo nivel.
	 * @return Um enumerador com o n�vel de dificuldade definido pelo usu�rio.
	 * @see NivelDeDificuldade
	 */
	public NivelDeDificuldade getNivel() {
		return this.nivel;
	}
	
	/**
	 * Modifica o valor do atributo nivel.
	 * @param nivel Um enumerador com o n�vel de dificuldade definido pelo usu�rio.
	 * @see NivelDeDificuldade
	 */
	public void setNivel(NivelDeDificuldade nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * M�todo que adiciona a coordenada inicial (antes do primeiro embaralhamento) das pe�as.
	 * @see Coordenada
	 */
	private void adicionarCoordenadaInicial() {
		int i, j;
		Coordenada coordenada;
		int interacoes = nivel.getNivelEscolhido();
		int index = 0;
		
		for(i = 0; i < interacoes ; i++) {
			for(j = 0; j < interacoes; j++) {
				coordenada = new Coordenada(i,j);
				listaDePecas.get(index).setCoordenada(coordenada);
				index++;
			}
		}
	
	}
	
	/**
	 * 
	 * @return Uma lista com as pe�as criadas.
	 * @see Peca
	 * @see ImagemEspecial
	 * @see Imagem
	 */
	private List<Peca> criarPecas() {
		int identificadorDaPeca = 0;
		int i, j;
		int interacoes = nivel.getNivelEscolhido();
		List<Peca> lista = new ArrayList<Peca>();
		Peca peca;
		Imagem imagem;
		
		for (i = 0; i < interacoes; i++) {
			for (j = 0; j < interacoes; j++) {
				peca = new Peca();
				imagem = this.listaDeImagens.get(identificadorDaPeca);
				peca.setIdPeca(identificadorDaPeca);
				peca.setImagem(imagem);
				lista.add(peca);
				identificadorDaPeca++;
			}
		}
		return lista;
	}
	
	/**
	 * M�todo que inicia o controlador.
	 * @throws Exception
	 * @see List
	 * @see Peca
	 * @see ControladorImagem
	 * 
	 */
	private void init() throws Exception {
		ControladorImagem controleImagens = new ControladorImagem();
		this.nivel = ControladorJogo.nivelDificuldadeEscolhido;
		this.listaDeImagens = controleImagens.getListaImagens();

		this.listaDePecas = criarPecas();
		
		adicionarCoordenadaInicial();
	}

}
