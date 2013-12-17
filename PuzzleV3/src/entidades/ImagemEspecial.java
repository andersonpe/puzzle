package entidades;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Classe responsável por representar uma Imagem que possui a capacidade de mudar de cor. 
 * @author Andy
 * @version 4
 */
public class ImagemEspecial extends Imagem {
	/* atributos */
	/** Um objeto do tipo Color que representará a nova cor da imagem. */
	private Color cor;
	/* construtores */
	/**
	 * Construtor básico da classe, que utiliza o construtor básica da superclasse "Imagem". 
	 */
	public ImagemEspecial() {
		super();
		this.cor = Color.WHITE;
	}
	
	public ImagemEspecial(BufferedImage image, int largura, int altura) {
		super(image, largura, altura);
	}

	/* métodos */
	/**
	 * Método que modifica a cor da imagem  
	 **/
	public void modificarCorDaImagem() {
		int imagemLargura, imagemAltura;
	    int[] pixels;
	    int i, j;
    	imagemLargura = this.getLargura();
    	imagemAltura = this.getAltura();
	    
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
