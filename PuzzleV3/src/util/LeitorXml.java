package util;

import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * Classe resposável por ler os dados contidos num arquivo xml.
 * @author Anderson Pereira (Andy)
 * @version 3
 */
public class LeitorXml {

	/* atributos */
	private File arquivo;
	private List<Element> elementos;

	/* construtores */
	/**
	 * Construtor básico da classe.
	 */
	public LeitorXml() {
		this(null,null);
	}
	
	/**
	 * Construtor com parâmetros que recebe valores e os atribui para arquivo e listaDeImagens.
	 * @param arquivo Atribui um valor ao atributo arquivo.
	 * @param listaDeElementos Atribui um valor ao atributo listaDeElementos.
	 * @see Element
	 */
	public LeitorXml(String arquivo, List<Element> listaDeElementos) {
		this.arquivo = new File(arquivo);
		this.elementos = listaDeElementos;
	}
	
	/* getters and setters */
	/** 
	 * @return O arquivo XML.
	 */
	public File getArquivo() {
		return this.arquivo;
	}
	
	/**
	 * @param arquivo O arquivo XML.
	 */
	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}

	
	/* métodos */
	/**
	 * método que lê o arquivo xml para obter os elementos e os insere numa lista.
	 */
	public void lerArquivo() {
		SAXBuilder builder;
		Document documento;
		Element root;

		try {
			
			builder = new SAXBuilder();
			documento = builder.build(this.arquivo);
			root = (Element) documento.getRootElement();
			elementos = root.getChildren();
			
		} catch (JDOMException excecaoJDOM) {
			excecaoJDOM.printStackTrace();
		} catch (IOException excecaoIO) {
			excecaoIO.printStackTrace();
		}
		
	}

	/**
	 * 
	 * @param elementoId O identificador de um elemento para procurar na lista.
	 * @return O elemento com o id passado como parametro 
	 * ou null caso nenhum elemeno seja encontrado.
	 */
	public Element procurarElemento(int elementoId) {
		Element elemento = null;
		Iterator<Element> iterator;

		iterator = elementos.iterator();

		while (iterator.hasNext()) {
			Element op = (Element) iterator.next();
			int id = Integer.valueOf(op.getChildText("id"));
			if (id == elementoId) {
				elemento = op;
			}
		}
		return elemento;
	}
	
}
