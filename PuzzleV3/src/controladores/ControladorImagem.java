package controladores;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.jdom2.Element;

import util.LeitorXml;
import constantes.Constantes;
import constantes.NivelDeDificuldade;
import constantes.OpcaoDeImagens;
import entidades.Imagem;
import entidades.ImagemEspecial;

/**
 * Classe que possui como responsabilidade controlar a manipula��o de imagens no jogo.
 * @author Anderson Pereira (Andy)
 * @version 3
 */
public class ControladorImagem {
	
	/* atributos */
	/** Objeto File que representa o arquivo da imagem.*/
	private File imagemOriginal;
	/** Objeto BufferedImage que representa a imagem em mem�ria para manipula��o. **/
	private BufferedImage imagemBuffer;
	/** Enumerador que representa a op��o de imagem escolhida para a partida. */
	private OpcaoDeImagens opcao = ControladorJogo.opcaoDeImagemEscolhida;
	/** Enumerador que representa o n�vel de dificuldade escolhida para a partida.*/
	private NivelDeDificuldade nivel = ControladorJogo.nivelDificuldadeEscolhido;
	/** Lista com as imagem j� divididas.*/
	private List<Imagem> listaDeImagens;
	
	/* construtores */
	/**
	 * Construtor b�sico do Controlador.
	 */
	public ControladorImagem() {
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* getters and setters */
	/**
	 * Retorna o arquivo que cont�m a imagem original (completa).
	 * @return Um objeto do tipo File contendo a imagem original, sem 
	 * estar dividida.
	 */
	public File getImagemOriginal() {
		return this.imagemOriginal;
	}
	
	/**
	 * Modifica o valor do atributo imagemOriginal.
	 * @param imagem Um objeto do tipo File com o novo valor para o atributo imagem.
	 */
	public void setImagemOriginal(File imagem) {
		this.imagemOriginal = imagem;
	}
	
	/**
	 * Retorna o conte�do do atributo imageBuffer.
	 * @return Um objeto do tipo imageBuffer.
	 */
	public BufferedImage getImagemBuffer() {
		return this.imagemBuffer;
	}

	/**
	 * Modifica o conte�do do atributo imagemBuffer.
	 * @param imagemBuffer Um objeto do tipo imageBuffer.
	 */
	public void setImagemBuffer(BufferedImage imagemBuffer) {
		this.imagemBuffer = imagemBuffer;
	}

	/**
	 * @return Retorna o valor contido no atributo opcao, esse atributo corresponde a op��o de imagem escolhida pelo
	 * usu�rio.
	 */
	public OpcaoDeImagens getOpcao() {
		return this.opcao;
	}

	/**
	 * 
	 * @return Retorna o valor contido no atributo nivel, esse por sua vez, corresponde ao n�vel de dificuldade
	 * escolhido pelo usu�rio.
	 */
	public NivelDeDificuldade getNivel() {
		return this.nivel;
	}
	
	/**
	 * Retorna uma Lista com as imagens divididas.
	 * @return Uma Lista (List) que cont�m apenas objetos do tipo Imagem.
	 */
	public List<Imagem> getListaImagens() {
		return this.listaDeImagens;
	}
	
	/**
	 * M�todo que modifica o valor contido na listaDeImagens.
	 * @param lista Uma Lista (List) que cont�m apenas objetos do tipo Imagem.
	 */
	public void setListaImagens(List<Imagem> lista) {
		this.listaDeImagens = lista;
	}

	/* m�todos */
	/**
	 * M�todo que l� a imagem original do disco.
	 */
	private void lerImagemOriginal(){
		String caminho = obterDadosImagem();
		File img;
		img = new File(Constantes.IMAGENS_FOLDER + caminho);
		this.imagemOriginal = img;
	}
	
	/**
	 * M�todo que cria a imagem em mem�ria (BufferedImage).
	 */
	private void imagemBuffer() {
		try {
			BufferedImage img = ImageIO.read(this.imagemOriginal);
			this.imagemBuffer = img;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * M�todo que calcula o tamanho do quadro de acordo 
	 * com o n�vel de dificuldade escolhido.
	 * @return Um (1) array onde a posicao zero (0) corresponde a largura e 
	 * a posicao um (1) corresponde a altura do quadro.
	 */
	private int[] calcularTamanhoImagem() {
		int nivel = this.nivel.getNivelEscolhido();
		int tamanho[] = new int[2];
		int largura = this.imagemBuffer.getWidth();
		int altura = this.imagemBuffer.getHeight();
		
		tamanho[0] = (largura/nivel);
		tamanho[1] = (altura/nivel);
		
		return tamanho;
	}
	
	/**
	 * M�todo que l� as informa��es da imagem no arquivo XML.
	 * @return Uma String com o nome do arquivo.
	 */
	private String obterDadosImagem() {
		LeitorXml xml;
		int imgID;
		Element elemento;
		
		
		xml = new LeitorXml(Constantes.IMAGENS_LIST,null);
		imgID = this.opcao.getOpcaoEscolhida();
		
		xml.lerArquivo();
		elemento = xml.procurarElemento(imgID);

		String arquivo = String.valueOf(elemento.getChildText("arquivo"));
		return arquivo;
	}

	/**
	 * M�todo que divide as imagens em pequenos quadros (subimagens).
	 * @return Uma lista de de imagens.
	 * @throws IOException
	 */
	private List<Imagem> dividirImagens() throws IOException {
		List<Imagem> lista = new ArrayList<Imagem>();
		Imagem img;
		int i, j;
		int opcao = this.nivel.getNivelEscolhido();
		int dimensoesSubimagem[] = this.calcularTamanhoImagem();
		int eixoX = 0, eixoY = 0;
		int larguraSubimagem = dimensoesSubimagem[0], alturaSubimagem = dimensoesSubimagem[1];
		
		for (i = 0; i < opcao; i++) {
			for (j = 0; j < opcao; j++) {
				BufferedImage subimagem = this.imagemBuffer.getSubimage(eixoX,eixoY,larguraSubimagem,alturaSubimagem);
				if ((i == 0) && (j == 0)){
					img = new ImagemEspecial(subimagem,larguraSubimagem, alturaSubimagem);
				} else {
					img = new Imagem(subimagem, larguraSubimagem, alturaSubimagem);					
				}
				lista.add(img);
				eixoX += larguraSubimagem;
			}
			eixoX = 0;
			eixoY += alturaSubimagem;
		}
		return lista;
	}
	
	/**
	 * M�todo que inicia o controlador.
	 * @throws Exception
	 */
	private void init() throws Exception {
		try {
			lerImagemOriginal();
			imagemBuffer();
			this.listaDeImagens = dividirImagens();
		} catch (Exception excecao) {
			throw excecao;
		}
	}
	
}
