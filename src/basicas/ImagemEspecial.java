package entidades;

import java.awt.Color;
import java.io.IOException;

/**
 * Classe que simboliza a imagem que ter� sua cor modificada. Essa imagem representa
 * o espa�o de movimenta��o.
 * @author Andy
 * @version 2.0
 */
public class ImagemEspecial extends Imagem {
	
	/**
	 * Construtor b�sico da subclasse.
	 */
	public ImagemEspecial() {

	}
	
	/** 
	 * m�todo que modifica a cor da imagem que representa o espa�o de movimenta��o do jogo.
	 * @throws IOException
	 */
	public void modificarCorDaImagem() throws IOException {
		Color cor = Color.WHITE;
		int imagemLargura = this.getLargura(); 
		int imagemAltura = this.getAltura();
	    int[] pixels;
	    int i, j;
	    
	    pixels = this.getImagem().getRGB(0, 0, imagemLargura, imagemAltura, null, 0, imagemLargura);
	    
	    int vermelho = cor.getRed();
	    int verde = cor.getGreen();
	    int azul = cor.getBlue();

		for (i = 0; i < imagemLargura; i++) {  
			for (j = 0; j < imagemAltura; j++) {  
			     pixels[imagemLargura * j + i] = new Color(vermelho,verde,azul).getRGB();
			}  
		}
		
		this.getImagem().setRGB(0, 0, imagemLargura, imagemAltura, pixels, 0, imagemLargura);
	}

}
